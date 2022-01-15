#!/usr/bin/env bash
#

export GO111MODULE=off
go get github.com/favadi/protoc-go-inject-tag
go get -u github.com/yu31/proto-go-plugin

export GO111MODULE=on
go install github.com/yu31/proto-go-plugin/cmd/protoc-gen-gosql
go install github.com/yu31/proto-go-plugin/cmd/protoc-gen-govalidator
go install github.com/yu31/proto-go-plugin/cmd/protoc-gen-godefaults
