// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/workspace.proto

package wspb

import (
	model "github.com/DataWorkbench/gproto/pkg/model"
	request "github.com/DataWorkbench/gproto/pkg/request"
	response "github.com/DataWorkbench/gproto/pkg/response"
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

var File_proto_workspace_proto protoreflect.FileDescriptor

var file_proto_workspace_proto_rawDesc = []byte{
	0x0a, 0x15, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x77, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x04, 0x77, 0x73, 0x70, 0x62, 0x1a, 0x0b, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0d, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0e, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0xc0, 0x07, 0x0a, 0x09, 0x57, 0x6f,
	0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x45, 0x0a, 0x0e, 0x4c, 0x69, 0x73, 0x74, 0x57,
	0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x73, 0x1a, 0x18, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69,
	0x73, 0x74, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x22, 0x00, 0x12, 0x43,
	0x0a, 0x10, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x73, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x45, 0x0a, 0x11, 0x44, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x57, 0x6f,
	0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x44, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x43, 0x0a, 0x10, 0x45, 0x6e,
	0x61, 0x62, 0x6c, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x12, 0x19,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x57,
	0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12,
	0x48, 0x0a, 0x0f, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x1a, 0x19, 0x2e, 0x72,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x57, 0x6f,
	0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x22, 0x00, 0x12, 0x41, 0x0a, 0x0f, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x18, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x57, 0x6f, 0x72,
	0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45,
	0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4e, 0x0a, 0x11,
	0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63,
	0x72, 0x69, 0x62, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x1a, 0x1b, 0x2e,
	0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62,
	0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x22, 0x00, 0x12, 0x33, 0x0a, 0x08,
	0x41, 0x64, 0x64, 0x41, 0x75, 0x64, 0x69, 0x74, 0x12, 0x11, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x41, 0x64, 0x64, 0x41, 0x75, 0x64, 0x69, 0x74, 0x1a, 0x12, 0x2e, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22,
	0x00, 0x12, 0x39, 0x0a, 0x0a, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x75, 0x64, 0x69, 0x74, 0x73, 0x12,
	0x13, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x75,
	0x64, 0x69, 0x74, 0x73, 0x1a, 0x14, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e,
	0x4c, 0x69, 0x73, 0x74, 0x41, 0x75, 0x64, 0x69, 0x74, 0x73, 0x22, 0x00, 0x12, 0x48, 0x0a, 0x0f,
	0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x52, 0x6f, 0x6c, 0x65, 0x73, 0x12,
	0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x79,
	0x73, 0x74, 0x65, 0x6d, 0x52, 0x6f, 0x6c, 0x65, 0x73, 0x1a, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x73, 0x74, 0x65, 0x6d, 0x52,
	0x6f, 0x6c, 0x65, 0x73, 0x22, 0x00, 0x12, 0x3c, 0x0a, 0x0b, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x65,
	0x6d, 0x62, 0x65, 0x72, 0x73, 0x12, 0x14, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x4c, 0x69, 0x73, 0x74, 0x4d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x1a, 0x15, 0x2e, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x65, 0x6d, 0x62, 0x65,
	0x72, 0x73, 0x22, 0x00, 0x12, 0x3d, 0x0a, 0x0d, 0x55, 0x70, 0x73, 0x65, 0x72, 0x74, 0x4d, 0x65,
	0x6d, 0x62, 0x65, 0x72, 0x73, 0x12, 0x16, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x55, 0x70, 0x73, 0x65, 0x72, 0x74, 0x4d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x3d, 0x0a, 0x0d, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4d, 0x65, 0x6d,
	0x62, 0x65, 0x72, 0x73, 0x12, 0x16, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x4d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x73, 0x1a, 0x12, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74,
	0x22, 0x00, 0x12, 0x48, 0x0a, 0x0f, 0x43, 0x68, 0x65, 0x63, 0x6b, 0x50, 0x65, 0x72, 0x6d, 0x69,
	0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x43, 0x68, 0x65, 0x63, 0x6b, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x1a,
	0x19, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x43, 0x68, 0x65, 0x63, 0x6b,
	0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0x00, 0x32, 0xb6, 0x0e, 0x0a,
	0x08, 0x57, 0x6f, 0x72, 0x6b, 0x66, 0x6c, 0x6f, 0x77, 0x12, 0x45, 0x0a, 0x0e, 0x4c, 0x69, 0x73,
	0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x73, 0x12, 0x17, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x4a, 0x6f, 0x62, 0x73, 0x1a, 0x18, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e,
	0x4c, 0x69, 0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x73, 0x22, 0x00,
	0x12, 0x43, 0x0a, 0x10, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x4a, 0x6f, 0x62, 0x73, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x73, 0x1a,
	0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x48, 0x0a, 0x0f, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x53,
	0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x1a, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x22, 0x00, 0x12,
	0x41, 0x0a, 0x0f, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74,
	0x22, 0x00, 0x12, 0x4e, 0x0a, 0x11, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x4a, 0x6f, 0x62, 0x1a, 0x1b, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62,
	0x22, 0x00, 0x12, 0x43, 0x0a, 0x10, 0x53, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x53, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x64,
	0x65, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53,
	0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4b, 0x0a, 0x10, 0x47, 0x65, 0x74, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x12, 0x19, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x1a, 0x1a, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f,
	0x64, 0x65, 0x22, 0x00, 0x12, 0x54, 0x0a, 0x13, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f,
	0x62, 0x43, 0x6f, 0x64, 0x65, 0x53, 0x79, 0x6e, 0x74, 0x61, 0x78, 0x12, 0x1c, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43,
	0x6f, 0x64, 0x65, 0x53, 0x79, 0x6e, 0x74, 0x61, 0x78, 0x1a, 0x1d, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f,
	0x64, 0x65, 0x53, 0x79, 0x6e, 0x74, 0x61, 0x78, 0x22, 0x00, 0x12, 0x43, 0x0a, 0x10, 0x53, 0x65,
	0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x12, 0x19,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x53, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65,
	0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12,
	0x4b, 0x0a, 0x10, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41,
	0x72, 0x67, 0x73, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47, 0x65,
	0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x1a, 0x1a,
	0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x22, 0x00, 0x12, 0x4e, 0x0a, 0x15,
	0x4c, 0x69, 0x73, 0x74, 0x42, 0x75, 0x69, 0x6c, 0x74, 0x49, 0x6e, 0x43, 0x6f, 0x6e, 0x6e, 0x65,
	0x63, 0x74, 0x6f, 0x72, 0x73, 0x12, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x1a, 0x1f, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x42, 0x75, 0x69, 0x6c, 0x74, 0x49, 0x6e,
	0x43, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x6f, 0x72, 0x73, 0x22, 0x00, 0x12, 0x4b, 0x0a, 0x14,
	0x53, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65,
	0x64, 0x75, 0x6c, 0x65, 0x12, 0x1d, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x53,
	0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64,
	0x75, 0x6c, 0x65, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74,
	0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x57, 0x0a, 0x14, 0x47, 0x65, 0x74,
	0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c,
	0x65, 0x12, 0x1d, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47, 0x65, 0x74, 0x53,
	0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65,
	0x1a, 0x1e, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x53,
	0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65,
	0x22, 0x00, 0x12, 0x43, 0x0a, 0x10, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f,
	0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53,
	0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x51, 0x0a, 0x17, 0x4f, 0x66, 0x66, 0x6c, 0x69,
	0x6e, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x12, 0x20, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4f, 0x66, 0x66,
	0x6c, 0x69, 0x6e, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61,
	0x6d, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x51, 0x0a, 0x17, 0x53, 0x75,
	0x73, 0x70, 0x65, 0x6e, 0x64, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74, 0x72, 0x65,
	0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x20, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x53, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4f, 0x0a,
	0x16, 0x52, 0x65, 0x73, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x1f, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6d, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53,
	0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x5a,
	0x0a, 0x15, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x73, 0x12, 0x1e, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x73, 0x1a, 0x1f, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x73, 0x22, 0x00, 0x12, 0x5a, 0x0a, 0x15, 0x4c, 0x69,
	0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x73, 0x12, 0x1e, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69,
	0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x73, 0x1a, 0x1f, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c,
	0x69, 0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x73, 0x22, 0x00, 0x12, 0x55, 0x0a, 0x18, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69,
	0x62, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73,
	0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x1a, 0x1b,
	0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69,
	0x62, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x22, 0x00, 0x12, 0x52, 0x0a,
	0x17, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x4e, 0x6f, 0x64, 0x65, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43,
	0x6f, 0x64, 0x65, 0x1a, 0x1a, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47,
	0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x22,
	0x00, 0x12, 0x52, 0x0a, 0x17, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f,
	0x62, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x41, 0x72, 0x67, 0x73, 0x12, 0x19, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x4a, 0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x1a, 0x1a, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41,
	0x72, 0x67, 0x73, 0x22, 0x00, 0x12, 0x5e, 0x0a, 0x1b, 0x47, 0x65, 0x74, 0x53, 0x74, 0x72, 0x65,
	0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x53, 0x63, 0x68, 0x65,
	0x64, 0x75, 0x6c, 0x65, 0x12, 0x1d, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47,
	0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64,
	0x75, 0x6c, 0x65, 0x1a, 0x1e, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47,
	0x65, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64,
	0x75, 0x6c, 0x65, 0x22, 0x00, 0x32, 0xd2, 0x07, 0x0a, 0x09, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75,
	0x6c, 0x65, 0x72, 0x12, 0x54, 0x0a, 0x13, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61,
	0x6d, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x1c, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x49,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x1a, 0x1d, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x49, 0x6e,
	0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x22, 0x00, 0x12, 0x53, 0x0a, 0x18, 0x54, 0x65, 0x72,
	0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x49, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x21, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x54, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x49,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4f,
	0x0a, 0x16, 0x53, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x49,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x1f, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x53, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12,
	0x4d, 0x0a, 0x15, 0x52, 0x65, 0x73, 0x75, 0x6d, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x49,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x1e, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6d, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x49,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x6c,
	0x0a, 0x1b, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x55,
	0x49, 0x42, 0x79, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x49, 0x64, 0x12, 0x24, 0x2e,
	0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x55, 0x49, 0x42, 0x79, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63,
	0x65, 0x49, 0x64, 0x1a, 0x25, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x55, 0x49, 0x42, 0x79,
	0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x49, 0x64, 0x22, 0x00, 0x12, 0x4b, 0x0a, 0x10,
	0x4c, 0x69, 0x73, 0x74, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73,
	0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x4d,
	0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73, 0x1a, 0x1a, 0x2e, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x6f, 0x6e, 0x69, 0x74,
	0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73, 0x22, 0x00, 0x12, 0x47, 0x0a, 0x12, 0x44, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73, 0x12,
	0x1b, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65,
	0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74,
	0x22, 0x00, 0x12, 0x47, 0x0a, 0x12, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x4d, 0x6f, 0x6e, 0x69,
	0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73, 0x12, 0x1b, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72,
	0x52, 0x75, 0x6c, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x49, 0x0a, 0x13, 0x44,
	0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c,
	0x65, 0x73, 0x12, 0x1c, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x69, 0x73,
	0x61, 0x62, 0x6c, 0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73,
	0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74,
	0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x45, 0x0a, 0x11, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x12, 0x1a, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4d, 0x6f, 0x6e, 0x69,
	0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x45, 0x0a,
	0x11, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75,
	0x6c, 0x65, 0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x1a, 0x12,
	0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75,
	0x63, 0x74, 0x22, 0x00, 0x12, 0x54, 0x0a, 0x13, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65,
	0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x12, 0x1c, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x4d, 0x6f,
	0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x1a, 0x1d, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x4d, 0x6f, 0x6e,
	0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x22, 0x00, 0x42, 0x5b, 0x0a, 0x20, 0x63, 0x6f,
	0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2e, 0x77, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x70, 0x62, 0x42, 0x0b,
	0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x50, 0x42, 0x50, 0x00, 0x5a, 0x28, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70,
	0x6b, 0x67, 0x2f, 0x77, 0x73, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_workspace_proto_goTypes = []interface{}{
	(*request.ListWorkspaces)(nil),               // 0: request.ListWorkspaces
	(*request.DeleteWorkspaces)(nil),             // 1: request.DeleteWorkspaces
	(*request.DisableWorkspaces)(nil),            // 2: request.DisableWorkspaces
	(*request.EnableWorkspaces)(nil),             // 3: request.EnableWorkspaces
	(*request.CreateWorkspace)(nil),              // 4: request.CreateWorkspace
	(*request.UpdateWorkspace)(nil),              // 5: request.UpdateWorkspace
	(*request.DescribeWorkspace)(nil),            // 6: request.DescribeWorkspace
	(*request.AddAudit)(nil),                     // 7: request.AddAudit
	(*request.ListAudits)(nil),                   // 8: request.ListAudits
	(*request.ListSystemRoles)(nil),              // 9: request.ListSystemRoles
	(*request.ListMembers)(nil),                  // 10: request.ListMembers
	(*request.UpsertMembers)(nil),                // 11: request.UpsertMembers
	(*request.DeleteMembers)(nil),                // 12: request.DeleteMembers
	(*request.CheckPermission)(nil),              // 13: request.CheckPermission
	(*request.ListStreamJobs)(nil),               // 14: request.ListStreamJobs
	(*request.DeleteStreamJobs)(nil),             // 15: request.DeleteStreamJobs
	(*request.CreateStreamJob)(nil),              // 16: request.CreateStreamJob
	(*request.UpdateStreamJob)(nil),              // 17: request.UpdateStreamJob
	(*request.DescribeStreamJob)(nil),            // 18: request.DescribeStreamJob
	(*request.SetStreamJobCode)(nil),             // 19: request.SetStreamJobCode
	(*request.GetStreamJobCode)(nil),             // 20: request.GetStreamJobCode
	(*request.StreamJobCodeSyntax)(nil),          // 21: request.StreamJobCodeSyntax
	(*request.SetStreamJobArgs)(nil),             // 22: request.SetStreamJobArgs
	(*request.GetStreamJobArgs)(nil),             // 23: request.GetStreamJobArgs
	(*model.EmptyStruct)(nil),                    // 24: model.EmptyStruct
	(*request.SetStreamJobSchedule)(nil),         // 25: request.SetStreamJobSchedule
	(*request.GetStreamJobSchedule)(nil),         // 26: request.GetStreamJobSchedule
	(*request.ReleaseStreamJob)(nil),             // 27: request.ReleaseStreamJob
	(*request.OfflineReleaseStreamJob)(nil),      // 28: request.OfflineReleaseStreamJob
	(*request.SuspendReleaseStreamJob)(nil),      // 29: request.SuspendReleaseStreamJob
	(*request.ResumeReleaseStreamJob)(nil),       // 30: request.ResumeReleaseStreamJob
	(*request.ListReleaseStreamJobs)(nil),        // 31: request.ListReleaseStreamJobs
	(*request.ListStreamJobVersions)(nil),        // 32: request.ListStreamJobVersions
	(*request.ListStreamInstances)(nil),          // 33: request.ListStreamInstances
	(*request.TerminateStreamInstances)(nil),     // 34: request.TerminateStreamInstances
	(*request.SuspendStreamInstances)(nil),       // 35: request.SuspendStreamInstances
	(*request.ResumeStreamInstances)(nil),        // 36: request.ResumeStreamInstances
	(*request.DescribeFlinkUIByInstanceId)(nil),  // 37: request.DescribeFlinkUIByInstanceId
	(*request.ListMonitorRules)(nil),             // 38: request.ListMonitorRules
	(*request.DeleteMonitorRules)(nil),           // 39: request.DeleteMonitorRules
	(*request.EnableMonitorRules)(nil),           // 40: request.EnableMonitorRules
	(*request.DisableMonitorRules)(nil),          // 41: request.DisableMonitorRules
	(*request.CreateMonitorRule)(nil),            // 42: request.CreateMonitorRule
	(*request.UpdateMonitorRule)(nil),            // 43: request.UpdateMonitorRule
	(*request.DescribeMonitorRule)(nil),          // 44: request.DescribeMonitorRule
	(*response.ListWorkspaces)(nil),              // 45: response.ListWorkspaces
	(*response.CreateWorkspace)(nil),             // 46: response.CreateWorkspace
	(*response.DescribeWorkspace)(nil),           // 47: response.DescribeWorkspace
	(*response.ListAudits)(nil),                  // 48: response.ListAudits
	(*response.ListSystemRoles)(nil),             // 49: response.ListSystemRoles
	(*response.ListMembers)(nil),                 // 50: response.ListMembers
	(*response.CheckPermission)(nil),             // 51: response.CheckPermission
	(*response.ListStreamJobs)(nil),              // 52: response.ListStreamJobs
	(*response.CreateStreamJob)(nil),             // 53: response.CreateStreamJob
	(*response.DescribeStreamJob)(nil),           // 54: response.DescribeStreamJob
	(*response.GetStreamJobCode)(nil),            // 55: response.GetStreamJobCode
	(*response.StreamJobCodeSyntax)(nil),         // 56: response.StreamJobCodeSyntax
	(*response.GetStreamJobArgs)(nil),            // 57: response.GetStreamJobArgs
	(*response.ListBuiltInConnectors)(nil),       // 58: response.ListBuiltInConnectors
	(*response.GetStreamJobSchedule)(nil),        // 59: response.GetStreamJobSchedule
	(*response.ListReleaseStreamJobs)(nil),       // 60: response.ListReleaseStreamJobs
	(*response.ListStreamJobVersions)(nil),       // 61: response.ListStreamJobVersions
	(*response.ListStreamInstances)(nil),         // 62: response.ListStreamInstances
	(*response.DescribeFlinkUIByInstanceId)(nil), // 63: response.DescribeFlinkUIByInstanceId
	(*response.ListMonitorRules)(nil),            // 64: response.ListMonitorRules
	(*response.DescribeMonitorRule)(nil),         // 65: response.DescribeMonitorRule
}
var file_proto_workspace_proto_depIdxs = []int32{
	0,  // 0: wspb.Workspace.ListWorkspaces:input_type -> request.ListWorkspaces
	1,  // 1: wspb.Workspace.DeleteWorkspaces:input_type -> request.DeleteWorkspaces
	2,  // 2: wspb.Workspace.DisableWorkspaces:input_type -> request.DisableWorkspaces
	3,  // 3: wspb.Workspace.EnableWorkspaces:input_type -> request.EnableWorkspaces
	4,  // 4: wspb.Workspace.CreateWorkspace:input_type -> request.CreateWorkspace
	5,  // 5: wspb.Workspace.UpdateWorkspace:input_type -> request.UpdateWorkspace
	6,  // 6: wspb.Workspace.DescribeWorkspace:input_type -> request.DescribeWorkspace
	7,  // 7: wspb.Workspace.AddAudit:input_type -> request.AddAudit
	8,  // 8: wspb.Workspace.ListAudits:input_type -> request.ListAudits
	9,  // 9: wspb.Workspace.ListSystemRoles:input_type -> request.ListSystemRoles
	10, // 10: wspb.Workspace.ListMembers:input_type -> request.ListMembers
	11, // 11: wspb.Workspace.UpsertMembers:input_type -> request.UpsertMembers
	12, // 12: wspb.Workspace.DeleteMembers:input_type -> request.DeleteMembers
	13, // 13: wspb.Workspace.CheckPermission:input_type -> request.CheckPermission
	14, // 14: wspb.Workflow.ListStreamJobs:input_type -> request.ListStreamJobs
	15, // 15: wspb.Workflow.DeleteStreamJobs:input_type -> request.DeleteStreamJobs
	16, // 16: wspb.Workflow.CreateStreamJob:input_type -> request.CreateStreamJob
	17, // 17: wspb.Workflow.UpdateStreamJob:input_type -> request.UpdateStreamJob
	18, // 18: wspb.Workflow.DescribeStreamJob:input_type -> request.DescribeStreamJob
	19, // 19: wspb.Workflow.SetStreamJobCode:input_type -> request.SetStreamJobCode
	20, // 20: wspb.Workflow.GetStreamJobCode:input_type -> request.GetStreamJobCode
	21, // 21: wspb.Workflow.StreamJobCodeSyntax:input_type -> request.StreamJobCodeSyntax
	22, // 22: wspb.Workflow.SetStreamJobArgs:input_type -> request.SetStreamJobArgs
	23, // 23: wspb.Workflow.GetStreamJobArgs:input_type -> request.GetStreamJobArgs
	24, // 24: wspb.Workflow.ListBuiltInConnectors:input_type -> model.EmptyStruct
	25, // 25: wspb.Workflow.SetStreamJobSchedule:input_type -> request.SetStreamJobSchedule
	26, // 26: wspb.Workflow.GetStreamJobSchedule:input_type -> request.GetStreamJobSchedule
	27, // 27: wspb.Workflow.ReleaseStreamJob:input_type -> request.ReleaseStreamJob
	28, // 28: wspb.Workflow.OfflineReleaseStreamJob:input_type -> request.OfflineReleaseStreamJob
	29, // 29: wspb.Workflow.SuspendReleaseStreamJob:input_type -> request.SuspendReleaseStreamJob
	30, // 30: wspb.Workflow.ResumeReleaseStreamJob:input_type -> request.ResumeReleaseStreamJob
	31, // 31: wspb.Workflow.ListReleaseStreamJobs:input_type -> request.ListReleaseStreamJobs
	32, // 32: wspb.Workflow.ListStreamJobVersions:input_type -> request.ListStreamJobVersions
	18, // 33: wspb.Workflow.DescribeStreamJobVersion:input_type -> request.DescribeStreamJob
	20, // 34: wspb.Workflow.GetStreamJobVersionNode:input_type -> request.GetStreamJobCode
	23, // 35: wspb.Workflow.GetStreamJobVersionArgs:input_type -> request.GetStreamJobArgs
	26, // 36: wspb.Workflow.GetStreamJobVersionSchedule:input_type -> request.GetStreamJobSchedule
	33, // 37: wspb.Scheduler.ListStreamInstances:input_type -> request.ListStreamInstances
	34, // 38: wspb.Scheduler.TerminateStreamInstances:input_type -> request.TerminateStreamInstances
	35, // 39: wspb.Scheduler.SuspendStreamInstances:input_type -> request.SuspendStreamInstances
	36, // 40: wspb.Scheduler.ResumeStreamInstances:input_type -> request.ResumeStreamInstances
	37, // 41: wspb.Scheduler.DescribeFlinkUIByInstanceId:input_type -> request.DescribeFlinkUIByInstanceId
	38, // 42: wspb.Scheduler.ListMonitorRules:input_type -> request.ListMonitorRules
	39, // 43: wspb.Scheduler.DeleteMonitorRules:input_type -> request.DeleteMonitorRules
	40, // 44: wspb.Scheduler.EnableMonitorRules:input_type -> request.EnableMonitorRules
	41, // 45: wspb.Scheduler.DisableMonitorRules:input_type -> request.DisableMonitorRules
	42, // 46: wspb.Scheduler.CreateMonitorRule:input_type -> request.CreateMonitorRule
	43, // 47: wspb.Scheduler.UpdateMonitorRule:input_type -> request.UpdateMonitorRule
	44, // 48: wspb.Scheduler.DescribeMonitorRule:input_type -> request.DescribeMonitorRule
	45, // 49: wspb.Workspace.ListWorkspaces:output_type -> response.ListWorkspaces
	24, // 50: wspb.Workspace.DeleteWorkspaces:output_type -> model.EmptyStruct
	24, // 51: wspb.Workspace.DisableWorkspaces:output_type -> model.EmptyStruct
	24, // 52: wspb.Workspace.EnableWorkspaces:output_type -> model.EmptyStruct
	46, // 53: wspb.Workspace.CreateWorkspace:output_type -> response.CreateWorkspace
	24, // 54: wspb.Workspace.UpdateWorkspace:output_type -> model.EmptyStruct
	47, // 55: wspb.Workspace.DescribeWorkspace:output_type -> response.DescribeWorkspace
	24, // 56: wspb.Workspace.AddAudit:output_type -> model.EmptyStruct
	48, // 57: wspb.Workspace.ListAudits:output_type -> response.ListAudits
	49, // 58: wspb.Workspace.ListSystemRoles:output_type -> response.ListSystemRoles
	50, // 59: wspb.Workspace.ListMembers:output_type -> response.ListMembers
	24, // 60: wspb.Workspace.UpsertMembers:output_type -> model.EmptyStruct
	24, // 61: wspb.Workspace.DeleteMembers:output_type -> model.EmptyStruct
	51, // 62: wspb.Workspace.CheckPermission:output_type -> response.CheckPermission
	52, // 63: wspb.Workflow.ListStreamJobs:output_type -> response.ListStreamJobs
	24, // 64: wspb.Workflow.DeleteStreamJobs:output_type -> model.EmptyStruct
	53, // 65: wspb.Workflow.CreateStreamJob:output_type -> response.CreateStreamJob
	24, // 66: wspb.Workflow.UpdateStreamJob:output_type -> model.EmptyStruct
	54, // 67: wspb.Workflow.DescribeStreamJob:output_type -> response.DescribeStreamJob
	24, // 68: wspb.Workflow.SetStreamJobCode:output_type -> model.EmptyStruct
	55, // 69: wspb.Workflow.GetStreamJobCode:output_type -> response.GetStreamJobCode
	56, // 70: wspb.Workflow.StreamJobCodeSyntax:output_type -> response.StreamJobCodeSyntax
	24, // 71: wspb.Workflow.SetStreamJobArgs:output_type -> model.EmptyStruct
	57, // 72: wspb.Workflow.GetStreamJobArgs:output_type -> response.GetStreamJobArgs
	58, // 73: wspb.Workflow.ListBuiltInConnectors:output_type -> response.ListBuiltInConnectors
	24, // 74: wspb.Workflow.SetStreamJobSchedule:output_type -> model.EmptyStruct
	59, // 75: wspb.Workflow.GetStreamJobSchedule:output_type -> response.GetStreamJobSchedule
	24, // 76: wspb.Workflow.ReleaseStreamJob:output_type -> model.EmptyStruct
	24, // 77: wspb.Workflow.OfflineReleaseStreamJob:output_type -> model.EmptyStruct
	24, // 78: wspb.Workflow.SuspendReleaseStreamJob:output_type -> model.EmptyStruct
	24, // 79: wspb.Workflow.ResumeReleaseStreamJob:output_type -> model.EmptyStruct
	60, // 80: wspb.Workflow.ListReleaseStreamJobs:output_type -> response.ListReleaseStreamJobs
	61, // 81: wspb.Workflow.ListStreamJobVersions:output_type -> response.ListStreamJobVersions
	54, // 82: wspb.Workflow.DescribeStreamJobVersion:output_type -> response.DescribeStreamJob
	55, // 83: wspb.Workflow.GetStreamJobVersionNode:output_type -> response.GetStreamJobCode
	57, // 84: wspb.Workflow.GetStreamJobVersionArgs:output_type -> response.GetStreamJobArgs
	59, // 85: wspb.Workflow.GetStreamJobVersionSchedule:output_type -> response.GetStreamJobSchedule
	62, // 86: wspb.Scheduler.ListStreamInstances:output_type -> response.ListStreamInstances
	24, // 87: wspb.Scheduler.TerminateStreamInstances:output_type -> model.EmptyStruct
	24, // 88: wspb.Scheduler.SuspendStreamInstances:output_type -> model.EmptyStruct
	24, // 89: wspb.Scheduler.ResumeStreamInstances:output_type -> model.EmptyStruct
	63, // 90: wspb.Scheduler.DescribeFlinkUIByInstanceId:output_type -> response.DescribeFlinkUIByInstanceId
	64, // 91: wspb.Scheduler.ListMonitorRules:output_type -> response.ListMonitorRules
	24, // 92: wspb.Scheduler.DeleteMonitorRules:output_type -> model.EmptyStruct
	24, // 93: wspb.Scheduler.EnableMonitorRules:output_type -> model.EmptyStruct
	24, // 94: wspb.Scheduler.DisableMonitorRules:output_type -> model.EmptyStruct
	24, // 95: wspb.Scheduler.CreateMonitorRule:output_type -> model.EmptyStruct
	24, // 96: wspb.Scheduler.UpdateMonitorRule:output_type -> model.EmptyStruct
	65, // 97: wspb.Scheduler.DescribeMonitorRule:output_type -> response.DescribeMonitorRule
	49, // [49:98] is the sub-list for method output_type
	0,  // [0:49] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_proto_workspace_proto_init() }
func file_proto_workspace_proto_init() {
	if File_proto_workspace_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_workspace_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   3,
		},
		GoTypes:           file_proto_workspace_proto_goTypes,
		DependencyIndexes: file_proto_workspace_proto_depIdxs,
	}.Build()
	File_proto_workspace_proto = out.File
	file_proto_workspace_proto_rawDesc = nil
	file_proto_workspace_proto_goTypes = nil
	file_proto_workspace_proto_depIdxs = nil
}
