module github.com/DataWorkbench/gproto

go 1.15

require (
	github.com/yu31/protoc-plugin v0.0.0-20220707071855-da9e4006826d
	google.golang.org/grpc v1.48.0
	google.golang.org/protobuf v1.27.1
)

replace github.com/DataWorkbench/common => ../../../dataomnis/common/common
