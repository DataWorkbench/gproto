// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/dataservice/dataservice.proto

package pbsvcdataservice

import (
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	pbrequest "github.com/DataWorkbench/gproto/xgo/types/pbrequest"
	pbresponse "github.com/DataWorkbench/gproto/xgo/types/pbresponse"
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

var File_proto_service_dataservice_dataservice_proto protoreflect.FileDescriptor

var file_proto_service_dataservice_dataservice_proto_rawDesc = []byte{
	0x0a, 0x2b, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x64, 0x61, 0x74, 0x61,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0b, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x1a, 0x2c, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2f,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61,
	0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x23, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0xe4, 0x0d, 0x0a, 0x0b,
	0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x12, 0x63, 0x0a, 0x18, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x12, 0x21, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x1a, 0x22, 0x2e, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x22, 0x00,
	0x12, 0x60, 0x0a, 0x17, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x12, 0x20, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x1a, 0x21, 0x2e,
	0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x61, 0x74,
	0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73,
	0x22, 0x00, 0x12, 0x53, 0x0a, 0x18, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x12, 0x21,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x44,
	0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65,
	0x72, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53,
	0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x5e, 0x0a, 0x1a, 0x44, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x62, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c,
	0x75, 0x73, 0x74, 0x65, 0x72, 0x12, 0x23, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x1a, 0x19, 0x2e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c,
	0x75, 0x73, 0x74, 0x65, 0x72, 0x22, 0x00, 0x12, 0x55, 0x0a, 0x19, 0x44, 0x65, 0x6c, 0x65, 0x74,
	0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73,
	0x74, 0x65, 0x72, 0x73, 0x12, 0x22, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x53,
	0x0a, 0x18, 0x53, 0x74, 0x61, 0x72, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x12, 0x21, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x53, 0x74, 0x61, 0x72, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x51, 0x0a, 0x17, 0x53, 0x74, 0x6f, 0x70, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x12, 0x20,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x53, 0x74, 0x6f, 0x70, 0x44, 0x61, 0x74,
	0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73,
	0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74,
	0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x45, 0x0a, 0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75,
	0x70, 0x1a, 0x18, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x22, 0x00, 0x12, 0x42, 0x0a,
	0x0d, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x12, 0x16,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x70, 0x69,
	0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x1a, 0x17, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x22,
	0x00, 0x12, 0x41, 0x0a, 0x0f, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x41, 0x70, 0x69, 0x47, 0x72,
	0x6f, 0x75, 0x70, 0x73, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x1a, 0x12,
	0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75,
	0x63, 0x74, 0x22, 0x00, 0x12, 0x45, 0x0a, 0x0e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x70, 0x69, 0x43,
	0x6f, 0x6e, 0x66, 0x69, 0x67, 0x73, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x73, 0x1a,
	0x18, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x41,
	0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x73, 0x22, 0x00, 0x12, 0x4e, 0x0a, 0x11, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67,
	0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x62, 0x65, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x1a, 0x1b, 0x2e, 0x72,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65,
	0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x22, 0x00, 0x12, 0x48, 0x0a, 0x0f, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x18,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x41,
	0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x1a, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e,
	0x66, 0x69, 0x67, 0x22, 0x00, 0x12, 0x41, 0x0a, 0x0f, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41,
	0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66,
	0x69, 0x67, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79,
	0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x43, 0x0a, 0x10, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x73, 0x12, 0x19, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x41, 0x70, 0x69,
	0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x51, 0x0a,
	0x12, 0x54, 0x65, 0x73, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x41, 0x70, 0x69, 0x12, 0x1b, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x54, 0x65,
	0x73, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69,
	0x1a, 0x1c, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x54, 0x65, 0x73, 0x74,
	0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x22, 0x00,
	0x12, 0x4d, 0x0a, 0x15, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x12, 0x1e, 0x2e, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x50, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12,
	0x4f, 0x0a, 0x16, 0x41, 0x62, 0x6f, 0x6c, 0x69, 0x73, 0x68, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x73, 0x12, 0x1f, 0x2e, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x41, 0x62, 0x6f, 0x6c, 0x69, 0x73, 0x68, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00,
	0x12, 0x69, 0x0a, 0x1a, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x23,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x61, 0x74,
	0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x73, 0x1a, 0x24, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c,
	0x69, 0x73, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70,
	0x69, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0x00, 0x12, 0x72, 0x0a, 0x1d, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x41, 0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x26, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x44,
	0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x56, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x1a, 0x27, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e,
	0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0x00, 0x12,
	0x51, 0x0a, 0x17, 0x52, 0x65, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x44, 0x61, 0x74, 0x61,
	0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x12, 0x20, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x52, 0x65, 0x70, 0x75, 0x62, 0x6c, 0x69, 0x73, 0x68, 0x44, 0x61,
	0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x41, 0x70, 0x69, 0x1a, 0x12, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74,
	0x22, 0x00, 0x42, 0x81, 0x01, 0x0a, 0x2d, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f,
	0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x73, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x2e, 0x70, 0x62, 0x73, 0x76, 0x63, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x42, 0x10, 0x50, 0x42, 0x53, 0x76, 0x63, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x50, 0x00, 0x5a, 0x3c, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e,
	0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x70, 0x62, 0x73, 0x76, 0x63, 0x64, 0x61, 0x74, 0x61, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_service_dataservice_dataservice_proto_goTypes = []interface{}{
	(*pbrequest.CreateDataServiceCluster)(nil),       // 0: request.CreateDataServiceCluster
	(*pbrequest.ListDataServiceClusters)(nil),        // 1: request.ListDataServiceClusters
	(*pbrequest.UpdateDataServiceCluster)(nil),       // 2: request.UpdateDataServiceCluster
	(*pbrequest.DescribeDataServiceCluster)(nil),     // 3: request.DescribeDataServiceCluster
	(*pbrequest.DeleteDataServiceClusters)(nil),      // 4: request.DeleteDataServiceClusters
	(*pbrequest.StartDataServiceClusters)(nil),       // 5: request.StartDataServiceClusters
	(*pbrequest.StopDataServiceClusters)(nil),        // 6: request.StopDataServiceClusters
	(*pbrequest.CreateApiGroup)(nil),                 // 7: request.CreateApiGroup
	(*pbrequest.ListApiGroups)(nil),                  // 8: request.ListApiGroups
	(*pbrequest.DeleteApiGroups)(nil),                // 9: request.DeleteApiGroups
	(*pbrequest.ListApiConfigs)(nil),                 // 10: request.ListApiConfigs
	(*pbrequest.DescribeApiConfig)(nil),              // 11: request.DescribeApiConfig
	(*pbrequest.CreateApiConfig)(nil),                // 12: request.CreateApiConfig
	(*pbrequest.UpdateApiConfig)(nil),                // 13: request.UpdateApiConfig
	(*pbrequest.DeleteApiConfigs)(nil),               // 14: request.DeleteApiConfigs
	(*pbrequest.TestDataServiceApi)(nil),             // 15: request.TestDataServiceApi
	(*pbrequest.PublishDataServiceApi)(nil),          // 16: request.PublishDataServiceApi
	(*pbrequest.AbolishDataServiceApis)(nil),         // 17: request.AbolishDataServiceApis
	(*pbrequest.ListDataServiceApiVersions)(nil),     // 18: request.ListDataServiceApiVersions
	(*pbrequest.DescribeDataServiceApiVersion)(nil),  // 19: request.DescribeDataServiceApiVersion
	(*pbrequest.RepublishDataServiceApi)(nil),        // 20: request.RepublishDataServiceApi
	(*pbresponse.CreateDataServiceCluster)(nil),      // 21: response.CreateDataServiceCluster
	(*pbresponse.ListDataServiceClusters)(nil),       // 22: response.ListDataServiceClusters
	(*pbmodel.EmptyStruct)(nil),                      // 23: model.EmptyStruct
	(*pbmodel.DataServiceCluster)(nil),               // 24: model.DataServiceCluster
	(*pbresponse.CreateApiGroup)(nil),                // 25: response.CreateApiGroup
	(*pbresponse.ListApiGroups)(nil),                 // 26: response.ListApiGroups
	(*pbresponse.ListApiConfigs)(nil),                // 27: response.ListApiConfigs
	(*pbresponse.DescribeApiConfig)(nil),             // 28: response.DescribeApiConfig
	(*pbresponse.CreateApiConfig)(nil),               // 29: response.CreateApiConfig
	(*pbresponse.TestDataServiceApi)(nil),            // 30: response.TestDataServiceApi
	(*pbresponse.ListDataServiceApiVersions)(nil),    // 31: response.ListDataServiceApiVersions
	(*pbresponse.DescribeDataServiceApiVersion)(nil), // 32: response.DescribeDataServiceApiVersion
}
var file_proto_service_dataservice_dataservice_proto_depIdxs = []int32{
	0,  // 0: dataservice.DataService.CreateDataServiceCluster:input_type -> request.CreateDataServiceCluster
	1,  // 1: dataservice.DataService.ListDataServiceClusters:input_type -> request.ListDataServiceClusters
	2,  // 2: dataservice.DataService.UpdateDataServiceCluster:input_type -> request.UpdateDataServiceCluster
	3,  // 3: dataservice.DataService.DescribeDataServiceCluster:input_type -> request.DescribeDataServiceCluster
	4,  // 4: dataservice.DataService.DeleteDataServiceClusters:input_type -> request.DeleteDataServiceClusters
	5,  // 5: dataservice.DataService.StartDataServiceClusters:input_type -> request.StartDataServiceClusters
	6,  // 6: dataservice.DataService.StopDataServiceClusters:input_type -> request.StopDataServiceClusters
	7,  // 7: dataservice.DataService.CreateApiGroup:input_type -> request.CreateApiGroup
	8,  // 8: dataservice.DataService.ListApiGroups:input_type -> request.ListApiGroups
	9,  // 9: dataservice.DataService.DeleteApiGroups:input_type -> request.DeleteApiGroups
	10, // 10: dataservice.DataService.ListApiConfigs:input_type -> request.ListApiConfigs
	11, // 11: dataservice.DataService.DescribeApiConfig:input_type -> request.DescribeApiConfig
	12, // 12: dataservice.DataService.CreateApiConfig:input_type -> request.CreateApiConfig
	13, // 13: dataservice.DataService.UpdateApiConfig:input_type -> request.UpdateApiConfig
	14, // 14: dataservice.DataService.DeleteApiConfigs:input_type -> request.DeleteApiConfigs
	15, // 15: dataservice.DataService.TestDataServiceApi:input_type -> request.TestDataServiceApi
	16, // 16: dataservice.DataService.PublishDataServiceApi:input_type -> request.PublishDataServiceApi
	17, // 17: dataservice.DataService.AbolishDataServiceApis:input_type -> request.AbolishDataServiceApis
	18, // 18: dataservice.DataService.ListDataServiceApiVersions:input_type -> request.ListDataServiceApiVersions
	19, // 19: dataservice.DataService.DescribeDataServiceApiVersion:input_type -> request.DescribeDataServiceApiVersion
	20, // 20: dataservice.DataService.RepublishDataServiceApi:input_type -> request.RepublishDataServiceApi
	21, // 21: dataservice.DataService.CreateDataServiceCluster:output_type -> response.CreateDataServiceCluster
	22, // 22: dataservice.DataService.ListDataServiceClusters:output_type -> response.ListDataServiceClusters
	23, // 23: dataservice.DataService.UpdateDataServiceCluster:output_type -> model.EmptyStruct
	24, // 24: dataservice.DataService.DescribeDataServiceCluster:output_type -> model.DataServiceCluster
	23, // 25: dataservice.DataService.DeleteDataServiceClusters:output_type -> model.EmptyStruct
	23, // 26: dataservice.DataService.StartDataServiceClusters:output_type -> model.EmptyStruct
	23, // 27: dataservice.DataService.StopDataServiceClusters:output_type -> model.EmptyStruct
	25, // 28: dataservice.DataService.CreateApiGroup:output_type -> response.CreateApiGroup
	26, // 29: dataservice.DataService.ListApiGroups:output_type -> response.ListApiGroups
	23, // 30: dataservice.DataService.DeleteApiGroups:output_type -> model.EmptyStruct
	27, // 31: dataservice.DataService.ListApiConfigs:output_type -> response.ListApiConfigs
	28, // 32: dataservice.DataService.DescribeApiConfig:output_type -> response.DescribeApiConfig
	29, // 33: dataservice.DataService.CreateApiConfig:output_type -> response.CreateApiConfig
	23, // 34: dataservice.DataService.UpdateApiConfig:output_type -> model.EmptyStruct
	23, // 35: dataservice.DataService.DeleteApiConfigs:output_type -> model.EmptyStruct
	30, // 36: dataservice.DataService.TestDataServiceApi:output_type -> response.TestDataServiceApi
	23, // 37: dataservice.DataService.PublishDataServiceApi:output_type -> model.EmptyStruct
	23, // 38: dataservice.DataService.AbolishDataServiceApis:output_type -> model.EmptyStruct
	31, // 39: dataservice.DataService.ListDataServiceApiVersions:output_type -> response.ListDataServiceApiVersions
	32, // 40: dataservice.DataService.DescribeDataServiceApiVersion:output_type -> response.DescribeDataServiceApiVersion
	23, // 41: dataservice.DataService.RepublishDataServiceApi:output_type -> model.EmptyStruct
	21, // [21:42] is the sub-list for method output_type
	0,  // [0:21] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_dataservice_dataservice_proto_init() }
func file_proto_service_dataservice_dataservice_proto_init() {
	if File_proto_service_dataservice_dataservice_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_dataservice_dataservice_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_dataservice_dataservice_proto_goTypes,
		DependencyIndexes: file_proto_service_dataservice_dataservice_proto_depIdxs,
	}.Build()
	File_proto_service_dataservice_dataservice_proto = out.File
	file_proto_service_dataservice_dataservice_proto_rawDesc = nil
	file_proto_service_dataservice_dataservice_proto_goTypes = nil
	file_proto_service_dataservice_dataservice_proto_depIdxs = nil
}
