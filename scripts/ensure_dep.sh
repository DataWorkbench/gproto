#!/usr/bin/env bash
#

export GO111MODULE=off
go get github.com/favadi/protoc-go-inject-tag
go get -u github.com/yu31/protoc-plugin

export GO111MODULE=on

# check plugin gosql is installed.
if ! type protoc-gen-gosql > /dev/null 2>&1; then
  go install github.com/yu31/protoc-plugin/cmd/protoc-gen-gosql
fi
# check plugin gosql version.
if [[ $(protoc-gen-gosql version | cut -f2 -d' ') != "0.0.1" ]]; then
  go install github.com/yu31/protoc-plugin/cmd/protoc-gen-gosql
fi

# check plugin godefaults is installed.
if ! type protoc-gen-godefaults > /dev/null 2>&1; then
  go install github.com/yu31/protoc-plugin/cmd/protoc-gen-godefaults
fi
# check plugin godefaults version.
if [[ $(protoc-gen-godefaults version | cut -f2 -d' ') != "0.0.1" ]]; then
  go install github.com/yu31/protoc-plugin/cmd/protoc-gen-godefaults
fi

# check plugin govalidator is installed.
if ! type protoc-gen-govalidator > /dev/null 2>&1; then
  go install github.com/yu31/protoc-plugin/cmd/protoc-gen-govalidator
fi
# check plugin govalidator version.
if [[ $(protoc-gen-govalidator version | cut -f2 -d' ') != "0.0.1" ]]; then
  go install github.com/yu31/protoc-plugin/cmd/protoc-gen-govalidator
fi

#go get -u github.com/yu31/proto-go-plugin
#
#export GO111MODULE=on
#go install github.com/yu31/proto-go-plugin/cmd/protoc-gen-gosql
#go install github.com/yu31/proto-go-plugin/cmd/protoc-gen-govalidator
#go install github.com/yu31/proto-go-plugin/cmd/protoc-gen-godefaults
