// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/enginemanager/engine_manage.proto

package pbsvcengine

import (
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	pbrequest "github.com/DataWorkbench/gproto/xgo/types/pbrequest"
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

var File_proto_service_enginemanager_engine_manage_proto protoreflect.FileDescriptor

var file_proto_service_enginemanager_engine_manage_proto_rawDesc = []byte{
	0x0a, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x65, 0x6e, 0x67, 0x69, 0x6e, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2f, 0x65, 0x6e,
	0x67, 0x69, 0x6e, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x0c, 0x65, 0x6e, 0x67, 0x69, 0x6e, 0x65, 0x63, 0x65, 0x6e, 0x74, 0x65, 0x72, 0x1a,
	0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x27,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x2f, 0x65, 0x6e, 0x67, 0x69, 0x6e, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0x8d, 0x09, 0x0a, 0x0c, 0x45, 0x6e, 0x67, 0x69,
	0x6e, 0x65, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x12, 0x51, 0x0a, 0x17, 0x43, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e,
	0x4b, 0x38, 0x73, 0x12, 0x20, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72,
	0x49, 0x6e, 0x4b, 0x38, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x51, 0x0a, 0x17, 0x44,
	0x65, 0x6c, 0x65, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65,
	0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x12, 0x20, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73,
	0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x53,
	0x0a, 0x18, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x42,
	0x72, 0x6f, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x12, 0x21, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x53, 0x0a, 0x18, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x12,
	0x21, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65,
	0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x4b,
	0x38, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79,
	0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4d, 0x0a, 0x15, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x49, 0x6e, 0x4b, 0x38,
	0x73, 0x12, 0x1e, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x49, 0x6e, 0x4b, 0x38,
	0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53,
	0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x55, 0x0a, 0x19, 0x43, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b,
	0x38, 0x73, 0x56, 0x32, 0x12, 0x22, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65,
	0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x55,
	0x0a, 0x19, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75,
	0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x12, 0x22, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e,
	0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x1a,
	0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x53, 0x0a, 0x18, 0x52, 0x65, 0x73, 0x74, 0x61, 0x72, 0x74,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38,
	0x73, 0x12, 0x21, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x52, 0x65, 0x73, 0x74,
	0x61, 0x72, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49,
	0x6e, 0x4b, 0x38, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x57, 0x0a, 0x1a, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x42, 0x72, 0x6f, 0x6b, 0x65,
	0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x12, 0x23, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x57, 0x0a, 0x1a, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x4e, 0x65, 0x74,
	0x77, 0x6f, 0x72, 0x6b, 0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56,
	0x32, 0x12, 0x23, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x49,
	0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45,
	0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x61, 0x0a, 0x1f,
	0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x53, 0x56, 0x32, 0x12,
	0x28, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74,
	0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12,
	0x61, 0x0a, 0x1f, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x53,
	0x56, 0x32, 0x12, 0x28, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c,
	0x65, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c,
	0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56, 0x32, 0x1a, 0x12, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74,
	0x22, 0x00, 0x12, 0x63, 0x0a, 0x20, 0x52, 0x65, 0x73, 0x74, 0x61, 0x72, 0x74, 0x44, 0x61, 0x74,
	0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49,
	0x6e, 0x4b, 0x38, 0x53, 0x56, 0x32, 0x12, 0x29, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x52, 0x65, 0x73, 0x74, 0x61, 0x72, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x49, 0x6e, 0x4b, 0x38, 0x73, 0x56,
	0x32, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53,
	0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x42, 0x78, 0x0a, 0x28, 0x63, 0x6f, 0x6d, 0x2e, 0x64,
	0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x62, 0x73, 0x76, 0x63, 0x65, 0x6e, 0x67,
	0x69, 0x6e, 0x65, 0x42, 0x11, 0x50, 0x42, 0x53, 0x76, 0x63, 0x45, 0x6e, 0x67, 0x69, 0x6e, 0x65,
	0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x37, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e,
	0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x70, 0x62, 0x73, 0x76, 0x63, 0x65, 0x6e, 0x67, 0x69, 0x6e,
	0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_service_enginemanager_engine_manage_proto_goTypes = []interface{}{
	(*pbrequest.CreateFlinkClusterInK8S)(nil),          // 0: request.CreateFlinkClusterInK8s
	(*pbrequest.DeleteFlinkClusterInK8S)(nil),          // 1: request.DeleteFlinkClusterInK8s
	(*pbrequest.CreateNetworkBrokerInK8S)(nil),         // 2: request.CreateNetworkBrokerInK8s
	(*pbrequest.DeleteNetworkBrokerInK8S)(nil),         // 3: request.DeleteNetworkBrokerInK8s
	(*pbrequest.DeleteNamespacesInK8S)(nil),            // 4: request.DeleteNamespacesInK8s
	(*pbrequest.CreateFlinkClusterInK8SV2)(nil),        // 5: request.CreateFlinkClusterInK8sV2
	(*pbrequest.DeleteFlinkClusterInK8SV2)(nil),        // 6: request.DeleteFlinkClusterInK8sV2
	(*pbrequest.RestartFlinkClusterInK8S)(nil),         // 7: request.RestartFlinkClusterInK8s
	(*pbrequest.CreateNetworkBrokerInK8SV2)(nil),       // 8: request.CreateNetworkBrokerInK8sV2
	(*pbrequest.DeleteNetworkBrokerInK8SV2)(nil),       // 9: request.DeleteNetworkBrokerInK8sV2
	(*pbrequest.CreateDataServiceClusterInK8SV2)(nil),  // 10: request.CreateDataServiceClusterInK8sV2
	(*pbrequest.DeleteDataServiceClusterInK8SV2)(nil),  // 11: request.DeleteDataServiceClusterInK8sV2
	(*pbrequest.RestartDataServiceClusterInK8SV2)(nil), // 12: request.RestartDataServiceClusterInK8sV2
	(*pbmodel.EmptyStruct)(nil),                        // 13: model.EmptyStruct
}
var file_proto_service_enginemanager_engine_manage_proto_depIdxs = []int32{
	0,  // 0: enginecenter.EngineManage.CreateFlinkClusterInK8s:input_type -> request.CreateFlinkClusterInK8s
	1,  // 1: enginecenter.EngineManage.DeleteFlinkClusterInK8s:input_type -> request.DeleteFlinkClusterInK8s
	2,  // 2: enginecenter.EngineManage.CreateNetworkBrokerInK8s:input_type -> request.CreateNetworkBrokerInK8s
	3,  // 3: enginecenter.EngineManage.DeleteNetworkBrokerInK8s:input_type -> request.DeleteNetworkBrokerInK8s
	4,  // 4: enginecenter.EngineManage.DeleteNamespacesInK8s:input_type -> request.DeleteNamespacesInK8s
	5,  // 5: enginecenter.EngineManage.CreateFlinkClusterInK8sV2:input_type -> request.CreateFlinkClusterInK8sV2
	6,  // 6: enginecenter.EngineManage.DeleteFlinkClusterInK8sV2:input_type -> request.DeleteFlinkClusterInK8sV2
	7,  // 7: enginecenter.EngineManage.RestartFlinkClusterInK8s:input_type -> request.RestartFlinkClusterInK8s
	8,  // 8: enginecenter.EngineManage.CreateNetworkBrokerInK8sV2:input_type -> request.CreateNetworkBrokerInK8sV2
	9,  // 9: enginecenter.EngineManage.DeleteNetworkBrokerInK8sV2:input_type -> request.DeleteNetworkBrokerInK8sV2
	10, // 10: enginecenter.EngineManage.CreateDataServiceClusterInK8SV2:input_type -> request.CreateDataServiceClusterInK8sV2
	11, // 11: enginecenter.EngineManage.DeleteDataServiceClusterInK8SV2:input_type -> request.DeleteDataServiceClusterInK8sV2
	12, // 12: enginecenter.EngineManage.RestartDataServiceClusterInK8SV2:input_type -> request.RestartDataServiceClusterInK8sV2
	13, // 13: enginecenter.EngineManage.CreateFlinkClusterInK8s:output_type -> model.EmptyStruct
	13, // 14: enginecenter.EngineManage.DeleteFlinkClusterInK8s:output_type -> model.EmptyStruct
	13, // 15: enginecenter.EngineManage.CreateNetworkBrokerInK8s:output_type -> model.EmptyStruct
	13, // 16: enginecenter.EngineManage.DeleteNetworkBrokerInK8s:output_type -> model.EmptyStruct
	13, // 17: enginecenter.EngineManage.DeleteNamespacesInK8s:output_type -> model.EmptyStruct
	13, // 18: enginecenter.EngineManage.CreateFlinkClusterInK8sV2:output_type -> model.EmptyStruct
	13, // 19: enginecenter.EngineManage.DeleteFlinkClusterInK8sV2:output_type -> model.EmptyStruct
	13, // 20: enginecenter.EngineManage.RestartFlinkClusterInK8s:output_type -> model.EmptyStruct
	13, // 21: enginecenter.EngineManage.CreateNetworkBrokerInK8sV2:output_type -> model.EmptyStruct
	13, // 22: enginecenter.EngineManage.DeleteNetworkBrokerInK8sV2:output_type -> model.EmptyStruct
	13, // 23: enginecenter.EngineManage.CreateDataServiceClusterInK8SV2:output_type -> model.EmptyStruct
	13, // 24: enginecenter.EngineManage.DeleteDataServiceClusterInK8SV2:output_type -> model.EmptyStruct
	13, // 25: enginecenter.EngineManage.RestartDataServiceClusterInK8SV2:output_type -> model.EmptyStruct
	13, // [13:26] is the sub-list for method output_type
	0,  // [0:13] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_enginemanager_engine_manage_proto_init() }
func file_proto_service_enginemanager_engine_manage_proto_init() {
	if File_proto_service_enginemanager_engine_manage_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_enginemanager_engine_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_enginemanager_engine_manage_proto_goTypes,
		DependencyIndexes: file_proto_service_enginemanager_engine_manage_proto_depIdxs,
	}.Build()
	File_proto_service_enginemanager_engine_manage_proto = out.File
	file_proto_service_enginemanager_engine_manage_proto_rawDesc = nil
	file_proto_service_enginemanager_engine_manage_proto_goTypes = nil
	file_proto_service_enginemanager_engine_manage_proto_depIdxs = nil
}
