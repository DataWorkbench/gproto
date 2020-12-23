#!/usr/bin/env bash
# Generate grpc code

# Required:
# protobuf
# go-proto-validators
#

current_path=$(cd "$(dirname "${0}")" || exit 1; pwd)
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

  protoc -I=. -I="${GOPATH}"/src  -I=./proto --go_opt=module="${MODULE}" --go-grpc_opt=module="${MODULE}" --govalidators_opt=paths=source_relative --govalidators_out=. --go_out=. --go-grpc_out=. "$f"

  mv -f proto/"${name}".validator.pb.go ".${dir}/"
done

exit $?
