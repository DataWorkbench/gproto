// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/spacemanager/sync_job_manage.proto

package pbsvcspace

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

var File_proto_service_spacemanager_sync_job_manage_proto protoreflect.FileDescriptor

var file_proto_service_spacemanager_sync_job_manage_proto_rawDesc = []byte{
	0x0a, 0x30, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2f, 0x73, 0x79, 0x6e,
	0x63, 0x5f, 0x6a, 0x6f, 0x62, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x12, 0x0c, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72,
	0x1a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x6a, 0x6f, 0x62, 0x5f, 0x6d, 0x61,
	0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x6a, 0x6f, 0x62, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0xab, 0x0d, 0x0a, 0x0d, 0x53, 0x79, 0x6e, 0x63, 0x4a,
	0x6f, 0x62, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x12, 0x3f, 0x0a, 0x0c, 0x4c, 0x69, 0x73, 0x74,
	0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x12, 0x15, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x1a,
	0x16, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53,
	0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x22, 0x00, 0x12, 0x3f, 0x0a, 0x0e, 0x44, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x12, 0x17, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x3b, 0x0a, 0x0c, 0x4d, 0x6f,
	0x76, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x12, 0x15, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x4d, 0x6f, 0x76, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62,
	0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53,
	0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x42, 0x0a, 0x0d, 0x43, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x12, 0x16, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62,
	0x1a, 0x17, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x43, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x22, 0x00, 0x12, 0x3d, 0x0a, 0x0d, 0x55,
	0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x12, 0x16, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e,
	0x63, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x48, 0x0a, 0x0f, 0x44, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x12, 0x18, 0x2e,
	0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65,
	0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x1a, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e,
	0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a,
	0x6f, 0x62, 0x22, 0x00, 0x12, 0x3f, 0x0a, 0x0e, 0x53, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a,
	0x6f, 0x62, 0x43, 0x6f, 0x6e, 0x66, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x53, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x6e, 0x66, 0x1a,
	0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x45, 0x0a, 0x0e, 0x47, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x6e, 0x66, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x6e, 0x66,
	0x1a, 0x18, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x53,
	0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x6e, 0x66, 0x22, 0x00, 0x12, 0x47, 0x0a, 0x12,
	0x53, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75,
	0x6c, 0x65, 0x12, 0x1b, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x53, 0x65, 0x74,
	0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x1a,
	0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x51, 0x0a, 0x12, 0x47, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x12, 0x1b, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62,
	0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x1a, 0x1c, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53, 0x63,
	0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x22, 0x00, 0x12, 0x3f, 0x0a, 0x0e, 0x52, 0x65, 0x6c, 0x65,
	0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74,
	0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4d, 0x0a, 0x15, 0x4f, 0x66, 0x66,
	0x6c, 0x69, 0x6e, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a,
	0x6f, 0x62, 0x12, 0x1e, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4f, 0x66, 0x66,
	0x6c, 0x69, 0x6e, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a,
	0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79,
	0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4b, 0x0a, 0x14, 0x52, 0x65, 0x6f, 0x70,
	0x65, 0x6e, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62,
	0x12, 0x1d, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x52, 0x65, 0x6f, 0x70, 0x65,
	0x6e, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x1a,
	0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x54, 0x0a, 0x13, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x6c,
	0x65, 0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x12, 0x1c, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x6c, 0x65, 0x61,
	0x73, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x1a, 0x1d, 0x2e, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73,
	0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x73, 0x22, 0x00, 0x12, 0x57, 0x0a, 0x1a, 0x55,
	0x70, 0x64, 0x61, 0x74, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x23, 0x2e, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73,
	0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x1a, 0x12,
	0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75,
	0x63, 0x74, 0x22, 0x00, 0x12, 0x54, 0x0a, 0x13, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x1c, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f,
	0x62, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x1a, 0x1d, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62,
	0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0x00, 0x12, 0x4f, 0x0a, 0x16, 0x44, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x1a, 0x19,
	0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69,
	0x62, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x22, 0x00, 0x12, 0x4c, 0x0a, 0x15, 0x47,
	0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x43, 0x6f, 0x6e, 0x66, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47,
	0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x6e, 0x66, 0x1a, 0x18, 0x2e,
	0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x6e, 0x66, 0x22, 0x00, 0x12, 0x58, 0x0a, 0x19, 0x47, 0x65, 0x74,
	0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x53, 0x63,
	0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x12, 0x1b, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x47, 0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64,
	0x75, 0x6c, 0x65, 0x1a, 0x1c, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47,
	0x65, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c,
	0x65, 0x22, 0x00, 0x12, 0x48, 0x0a, 0x0f, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4a,
	0x6f, 0x62, 0x4a, 0x73, 0x6f, 0x6e, 0x12, 0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x47, 0x65, 0x6e, 0x65, 0x72, 0x61, 0x74, 0x65, 0x4a, 0x6f, 0x62, 0x4a, 0x73, 0x6f, 0x6e,
	0x1a, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x6e, 0x65,
	0x72, 0x61, 0x74, 0x65, 0x4a, 0x6f, 0x62, 0x4a, 0x73, 0x6f, 0x6e, 0x22, 0x00, 0x12, 0x51, 0x0a,
	0x12, 0x43, 0x6f, 0x6e, 0x76, 0x65, 0x72, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x4d,
	0x6f, 0x64, 0x65, 0x12, 0x1b, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x6f,
	0x6e, 0x76, 0x65, 0x72, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x4d, 0x6f, 0x64, 0x65,
	0x1a, 0x1c, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x43, 0x6f, 0x6e, 0x76,
	0x65, 0x72, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x4d, 0x6f, 0x64, 0x65, 0x22, 0x00,
	0x12, 0x72, 0x0a, 0x1d, 0x4c, 0x6f, 0x61, 0x64, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53,
	0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72,
	0x73, 0x12, 0x26, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x6f, 0x61, 0x64,
	0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x50,
	0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65, 0x72, 0x73, 0x1a, 0x27, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x6f, 0x61, 0x64, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62,
	0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x65, 0x74, 0x65,
	0x72, 0x73, 0x22, 0x00, 0x42, 0x77, 0x0a, 0x27, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61,
	0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x62, 0x73, 0x76, 0x63, 0x73, 0x70, 0x61, 0x63, 0x65, 0x42,
	0x12, 0x50, 0x42, 0x53, 0x76, 0x63, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x4d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f,
	0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x2f, 0x70, 0x62, 0x73, 0x76, 0x63, 0x73, 0x70, 0x61, 0x63, 0x65, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_service_spacemanager_sync_job_manage_proto_goTypes = []interface{}{
	(*pbrequest.ListSyncJobs)(nil),                   // 0: request.ListSyncJobs
	(*pbrequest.DeleteSyncJobs)(nil),                 // 1: request.DeleteSyncJobs
	(*pbrequest.MoveSyncJobs)(nil),                   // 2: request.MoveSyncJobs
	(*pbrequest.CreateSyncJob)(nil),                  // 3: request.CreateSyncJob
	(*pbrequest.UpdateSyncJob)(nil),                  // 4: request.UpdateSyncJob
	(*pbrequest.DescribeSyncJob)(nil),                // 5: request.DescribeSyncJob
	(*pbrequest.SetSyncJobConf)(nil),                 // 6: request.SetSyncJobConf
	(*pbrequest.GetSyncJobConf)(nil),                 // 7: request.GetSyncJobConf
	(*pbrequest.SetSyncJobSchedule)(nil),             // 8: request.SetSyncJobSchedule
	(*pbrequest.GetSyncJobSchedule)(nil),             // 9: request.GetSyncJobSchedule
	(*pbrequest.ReleaseSyncJob)(nil),                 // 10: request.ReleaseSyncJob
	(*pbrequest.OfflineReleaseSyncJob)(nil),          // 11: request.OfflineReleaseSyncJob
	(*pbrequest.ReopenReleaseSyncJob)(nil),           // 12: request.ReopenReleaseSyncJob
	(*pbrequest.ListReleaseSyncJobs)(nil),            // 13: request.ListReleaseSyncJobs
	(*pbrequest.UpdateReleaseSyncJobStatus)(nil),     // 14: request.UpdateReleaseSyncJobStatus
	(*pbrequest.ListSyncJobVersions)(nil),            // 15: request.ListSyncJobVersions
	(*pbrequest.GenerateJobJson)(nil),                // 16: request.GenerateJobJson
	(*pbrequest.ConvertSyncJobMode)(nil),             // 17: request.ConvertSyncJobMode
	(*pbrequest.LoadSyncJobScheduleParameters)(nil),  // 18: request.LoadSyncJobScheduleParameters
	(*pbresponse.ListSyncJobs)(nil),                  // 19: response.ListSyncJobs
	(*pbmodel.EmptyStruct)(nil),                      // 20: model.EmptyStruct
	(*pbresponse.CreateSyncJob)(nil),                 // 21: response.CreateSyncJob
	(*pbresponse.DescribeSyncJob)(nil),               // 22: response.DescribeSyncJob
	(*pbresponse.GetSyncJobConf)(nil),                // 23: response.GetSyncJobConf
	(*pbresponse.GetSyncJobSchedule)(nil),            // 24: response.GetSyncJobSchedule
	(*pbresponse.ListReleaseSyncJobs)(nil),           // 25: response.ListReleaseSyncJobs
	(*pbresponse.ListSyncJobVersions)(nil),           // 26: response.ListSyncJobVersions
	(*pbresponse.GenerateJobJson)(nil),               // 27: response.GenerateJobJson
	(*pbresponse.ConvertSyncJobMode)(nil),            // 28: response.ConvertSyncJobMode
	(*pbresponse.LoadSyncJobScheduleParameters)(nil), // 29: response.LoadSyncJobScheduleParameters
}
var file_proto_service_spacemanager_sync_job_manage_proto_depIdxs = []int32{
	0,  // 0: spacemanager.SyncJobManage.ListSyncJobs:input_type -> request.ListSyncJobs
	1,  // 1: spacemanager.SyncJobManage.DeleteSyncJobs:input_type -> request.DeleteSyncJobs
	2,  // 2: spacemanager.SyncJobManage.MoveSyncJobs:input_type -> request.MoveSyncJobs
	3,  // 3: spacemanager.SyncJobManage.CreateSyncJob:input_type -> request.CreateSyncJob
	4,  // 4: spacemanager.SyncJobManage.UpdateSyncJob:input_type -> request.UpdateSyncJob
	5,  // 5: spacemanager.SyncJobManage.DescribeSyncJob:input_type -> request.DescribeSyncJob
	6,  // 6: spacemanager.SyncJobManage.SetSyncJobConf:input_type -> request.SetSyncJobConf
	7,  // 7: spacemanager.SyncJobManage.GetSyncJobConf:input_type -> request.GetSyncJobConf
	8,  // 8: spacemanager.SyncJobManage.SetSyncJobSchedule:input_type -> request.SetSyncJobSchedule
	9,  // 9: spacemanager.SyncJobManage.GetSyncJobSchedule:input_type -> request.GetSyncJobSchedule
	10, // 10: spacemanager.SyncJobManage.ReleaseSyncJob:input_type -> request.ReleaseSyncJob
	11, // 11: spacemanager.SyncJobManage.OfflineReleaseSyncJob:input_type -> request.OfflineReleaseSyncJob
	12, // 12: spacemanager.SyncJobManage.ReopenReleaseSyncJob:input_type -> request.ReopenReleaseSyncJob
	13, // 13: spacemanager.SyncJobManage.ListReleaseSyncJobs:input_type -> request.ListReleaseSyncJobs
	14, // 14: spacemanager.SyncJobManage.UpdateReleaseSyncJobStatus:input_type -> request.UpdateReleaseSyncJobStatus
	15, // 15: spacemanager.SyncJobManage.ListSyncJobVersions:input_type -> request.ListSyncJobVersions
	5,  // 16: spacemanager.SyncJobManage.DescribeSyncJobVersion:input_type -> request.DescribeSyncJob
	7,  // 17: spacemanager.SyncJobManage.GetSyncJobVersionConf:input_type -> request.GetSyncJobConf
	9,  // 18: spacemanager.SyncJobManage.GetSyncJobVersionSchedule:input_type -> request.GetSyncJobSchedule
	16, // 19: spacemanager.SyncJobManage.GenerateJobJson:input_type -> request.GenerateJobJson
	17, // 20: spacemanager.SyncJobManage.ConvertSyncJobMode:input_type -> request.ConvertSyncJobMode
	18, // 21: spacemanager.SyncJobManage.LoadSyncJobScheduleParameters:input_type -> request.LoadSyncJobScheduleParameters
	19, // 22: spacemanager.SyncJobManage.ListSyncJobs:output_type -> response.ListSyncJobs
	20, // 23: spacemanager.SyncJobManage.DeleteSyncJobs:output_type -> model.EmptyStruct
	20, // 24: spacemanager.SyncJobManage.MoveSyncJobs:output_type -> model.EmptyStruct
	21, // 25: spacemanager.SyncJobManage.CreateSyncJob:output_type -> response.CreateSyncJob
	20, // 26: spacemanager.SyncJobManage.UpdateSyncJob:output_type -> model.EmptyStruct
	22, // 27: spacemanager.SyncJobManage.DescribeSyncJob:output_type -> response.DescribeSyncJob
	20, // 28: spacemanager.SyncJobManage.SetSyncJobConf:output_type -> model.EmptyStruct
	23, // 29: spacemanager.SyncJobManage.GetSyncJobConf:output_type -> response.GetSyncJobConf
	20, // 30: spacemanager.SyncJobManage.SetSyncJobSchedule:output_type -> model.EmptyStruct
	24, // 31: spacemanager.SyncJobManage.GetSyncJobSchedule:output_type -> response.GetSyncJobSchedule
	20, // 32: spacemanager.SyncJobManage.ReleaseSyncJob:output_type -> model.EmptyStruct
	20, // 33: spacemanager.SyncJobManage.OfflineReleaseSyncJob:output_type -> model.EmptyStruct
	20, // 34: spacemanager.SyncJobManage.ReopenReleaseSyncJob:output_type -> model.EmptyStruct
	25, // 35: spacemanager.SyncJobManage.ListReleaseSyncJobs:output_type -> response.ListReleaseSyncJobs
	20, // 36: spacemanager.SyncJobManage.UpdateReleaseSyncJobStatus:output_type -> model.EmptyStruct
	26, // 37: spacemanager.SyncJobManage.ListSyncJobVersions:output_type -> response.ListSyncJobVersions
	22, // 38: spacemanager.SyncJobManage.DescribeSyncJobVersion:output_type -> response.DescribeSyncJob
	23, // 39: spacemanager.SyncJobManage.GetSyncJobVersionConf:output_type -> response.GetSyncJobConf
	24, // 40: spacemanager.SyncJobManage.GetSyncJobVersionSchedule:output_type -> response.GetSyncJobSchedule
	27, // 41: spacemanager.SyncJobManage.GenerateJobJson:output_type -> response.GenerateJobJson
	28, // 42: spacemanager.SyncJobManage.ConvertSyncJobMode:output_type -> response.ConvertSyncJobMode
	29, // 43: spacemanager.SyncJobManage.LoadSyncJobScheduleParameters:output_type -> response.LoadSyncJobScheduleParameters
	22, // [22:44] is the sub-list for method output_type
	0,  // [0:22] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_spacemanager_sync_job_manage_proto_init() }
func file_proto_service_spacemanager_sync_job_manage_proto_init() {
	if File_proto_service_spacemanager_sync_job_manage_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_spacemanager_sync_job_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_spacemanager_sync_job_manage_proto_goTypes,
		DependencyIndexes: file_proto_service_spacemanager_sync_job_manage_proto_depIdxs,
	}.Build()
	File_proto_service_spacemanager_sync_job_manage_proto = out.File
	file_proto_service_spacemanager_sync_job_manage_proto_rawDesc = nil
	file_proto_service_spacemanager_sync_job_manage_proto_goTypes = nil
	file_proto_service_spacemanager_sync_job_manage_proto_depIdxs = nil
}
