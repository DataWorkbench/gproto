#!/usr/bin/env bash
# Generate grpc code

# Required:
# protobuf
# go-proto-validators
#

if ! [[ "$0" =~ scripts/generate_go.sh ]]; then
	echo "must be run from repository root"
	exit 255
fi

current_path=$(cd "$(dirname "${0}")" || exit 1; pwd)

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
if [[ $(protoc --version | cut -f2 -d' ') != "3.14.0" ]]; then
  echo "Error: could not find protoc 3.14.0, is it installed in you PATH?"
  exit 1
fi

if [[ $(protoc-gen-go --version 2>&1 | cut -f2 -d' ') != "v1.25.0" ]]; then
  echo "Error: could not find protoc-gen-go v1.25.0, is it installed in you PATH?"
  exit 1
fi

if [[ $(protoc-gen-go-grpc --version 2>&1 | cut -f2 -d' ') != "1.0.1" ]]; then
  echo "Error: could not find protoc-gen-go-grpc 1.0.1, is it installed in you PATH?"
  exit 1
fi

# generate code
for f in proto/*.proto;do
  name=$(echo "${f}" | sed 's@proto/@@; s@.proto@@')
  package="$(grep 'go_package' ${f}| grep "$MODULE"|awk '{print $NF}')"
  package=$(echo "${package}"|sed 's/"//g; s/;//g')
  dir=${package//"$MODULE"/}

  # Generate java class and grpc
#  protoc -I=. -I="${GOPATH}"/pkg/mod -I="${GOPATH}"/src -I=./proto --java_out=./src/main/java  "$f"

  # Generate go struct and grpc.
  protoc -I=. -I="${GOPATH}"/pkg/mod -I="${GOPATH}"/src  -I=./proto --go_opt=module="${MODULE}" --go-grpc_opt=module="${MODULE}" --go_out=. --go-grpc_out=. "$f"

  # Generate validator code.
  if grep "validator.proto" "$f" >/dev/null 2>&1; then
    protoc -I=. -I="${GOPATH}"/pkg/mod -I="${GOPATH}"/src  -I=./proto --govalidators_opt=paths=source_relative --govalidators_out=. "$f"
    mv -f proto/"${name}".validator.pb.go ".${dir}/"
    if [ "$(uname -s)" == "Darwin" ] && ! sed --version >/dev/null 2>&1; then
      sed -i "" 's@github.com/golang/protobuf/proto@google.golang.org/protobuf/proto@g' ".${dir}/${name}.validator.pb.go"
    else
      sed -i 's@github.com/golang/protobuf/proto@google.golang.org/protobuf/proto@g' ".${dir}/${name}.validator.pb.go"
    fi
  else
    /bin/rm -f ".${dir}/${name}.validator.pb.go"
  fi

    # Generate gosql code.
  if grep 'gosql.proto' "$f"  >/dev/null 2>&1; then
     protoc -I=. -I="${GOPATH}"/pkg/mod -I="${GOPATH}"/src  -I=./proto --gosql_opt=paths=source_relative --gosql_out=. "$f"
     mv -f proto/"${name}".sql.pb.go ".${dir}/"
  else
    /bin/rm -f ".${dir}/${name}.sql.pb.go"
  fi

  # Inject tag to struct and remove comments.
  pbgo=".${dir}/${name}.pb.go"
  if grep "\@inject_tag" "${pbgo}" >/dev/null 2>&1; then
    protoc-go-inject-tag -input="${pbgo}"
    if [ "$(uname -s)" == "Darwin" ] && ! sed --version >/dev/null 2>&1; then
      sed -i "" '/\@inject_tag/d' "${pbgo}"
    else
      sed -i '/\@inject_tag/d' "${pbgo}"
    fi
  fi
done

go fmt ./... >/dev/null 2>&1;

make tidy || exit $?
make vet || exit $?
make lint || exit $?

exit $?
