#!/usr/bin/env bash

set -e;

# Generate protobuf code for go

if ! [[ "$0" =~ scripts/generate_go.sh ]]; then
	echo "must be run from repository root"
	exit 255
fi

current_path=$(cd "$(dirname "${0}")" || exit 1; pwd)

# load project env.
if [ -f "./project_env.sh" ]; then
  . ./project_env.sh
fi

# install dep package.
sh "${current_path}/ensure_dep.sh"

cd "${current_path}"/.. || exit 1

MODULE="github.com/DataWorkbench/gproto"
GOPATH=$(go env GOPATH)


if [ -z "${GOPATH}" ]; then
    echo "Error: the environment variable GOPATH is not set, please set it before running"
    exit 1
fi

# check the grpc plugin is installed.
if ! type protoc > /dev/null 2>&1; then
  echo "Error: the plugin <protoc> not install, please install it before running"
  exit 1
fi

if ! type protoc-gen-go > /dev/null 2>&1; then
  echo "Error: the plugin <protoc-gen-go> not install, please install it before running"
  exit 1
fi

if ! type protoc-gen-go-grpc > /dev/null 2>&1; then
  echo "Error: the plugin <protoc-gen-go-grpc> not install, please install it before running"
  exit 1
fi

# check the plugin version.
if [[ $(protoc --version | cut -f2 -d' ') != "3.19.3" ]]; then
  echo "Error: could not find protoc 3.19.3, is it installed in you PATH?"
  exit 1
fi

if [[ $(protoc-gen-go --version 2>&1 | cut -f2 -d' ') != "v1.27.1" ]]; then
  echo "Error: could not find protoc-gen-go v1.27.1, is it installed in you PATH?"
  exit 1
fi

if [[ $(protoc-gen-go-grpc --version 2>&1 | cut -f2 -d' ') != "1.2.0" ]]; then
  echo "Error: could not find protoc-gen-go-grpc 1.2.0, is it installed in you PATH?"
  exit 1
fi

# generate code
process_file() {
  file="$1"
  echo "generate Golang code with proto file ${file}"

  # Generate go code.
  protoc -I=. -I=./proto -I="${GOPATH}"/src --go_opt=module="${MODULE}" --go_out=. "${file}"
   # Generate go grpc code.
  protoc -I=. -I=./proto -I="${GOPATH}"/src --go-grpc_opt=module="${MODULE}" --go-grpc_out=. "${file}"
  # Generate go validator code.
  protoc -I=. -I=./proto -I="${GOPATH}"/src --govalidator_opt=module="${MODULE}" --govalidator_out=. "${file}"
  # Generate go defaults code.
  protoc -I=. -I=./proto -I="${GOPATH}"/src --godefaults_opt=module="${MODULE}" --godefaults_out=. "${file}"
  # Generate go gosql code.
  protoc -I=. -I=./proto -I="${GOPATH}"/src --gosql_opt=module="${MODULE}" --gosql_out=. "${file}"
#  protoc -I=. -I=./proto -I="${GOPATH}"/src --gosql_opt=paths=source_relative --gosql_out=. "${file}"

  # Inject tag to struct and remove comments.
  package="$(grep 'go_package' "${file}"| grep "$MODULE"|awk '{print $NF}')"
  package=${package#\"}
  package=${package%\"*}
  package=${package%;*}

  # the name of directory the output file
  out_dir=${package//"$MODULE"/}
  # the name of proto file without suffix
  name=${file##*/}
  name=${name%.*}
  # The  output file.
  pbgo=".${out_dir}/${name}.pb.go"

  if grep "\@inject_tag" "${pbgo}" >/dev/null 2>&1; then
    protoc-go-inject-tag -input="${pbgo}" || exit $?
    if [ "$(uname -s)" == "Darwin" ] && ! sed --version >/dev/null 2>&1; then
      sed -i "" '/\@inject_tag/d' "${pbgo}"
    else
      sed -i '/\@inject_tag/d' "${pbgo}"
    fi
  fi
}

process_loop() {
  # shellcheck disable=SC2045
  for file in $(ls "$1")
  do
    path="$1"/"$file"
    if [ -d "$path" ]
    then
      process_loop "$path"
    else
      process_file "$path"
    fi
  done
}

# To avoids invalid code residue.
/bin/rm -fr ./xgo/*
# read proto files.
process_loop ./proto

go fmt ./... >/dev/null 2>&1;

make tidy || exit $?
make vet || exit $?
make lint || exit $?

exit $?
