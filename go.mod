module github.com/DataWorkbench/gproto

go 1.15

require (
	github.com/yu31/protoc-plugin v0.0.0-20220417185426-73bdbff89e31
	google.golang.org/grpc v1.46.2
	google.golang.org/protobuf v1.27.1
)

replace github.com/DataWorkbench/common => ../../../dataomnis/common/common
