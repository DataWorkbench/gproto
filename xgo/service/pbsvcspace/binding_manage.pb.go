// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/spacemanager/binding_manage.proto

package pbsvcspace

import (
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

var File_proto_service_spacemanager_binding_manage_proto protoreflect.FileDescriptor

var file_proto_service_spacemanager_binding_manage_proto_rawDesc = []byte{
	0x0a, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2f, 0x62, 0x69, 0x6e,
	0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x0c, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x1a,
	0x28, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2f, 0x62, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f,
	0x62, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x32, 0x71, 0x0a, 0x0d, 0x42, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4d,
	0x61, 0x6e, 0x61, 0x67, 0x65, 0x12, 0x60, 0x0a, 0x17, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62,
	0x65, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x42, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67,
	0x12, 0x20, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x62, 0x65, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x42, 0x69, 0x6e, 0x64, 0x69,
	0x6e, 0x67, 0x1a, 0x21, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65,
	0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x42, 0x69,
	0x6e, 0x64, 0x69, 0x6e, 0x67, 0x22, 0x00, 0x42, 0x77, 0x0a, 0x27, 0x63, 0x6f, 0x6d, 0x2e, 0x64,
	0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x62, 0x73, 0x76, 0x63, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x42, 0x12, 0x50, 0x42, 0x53, 0x76, 0x63, 0x42, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67,
	0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e,
	0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x73, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x70, 0x62, 0x73, 0x76, 0x63, 0x73, 0x70, 0x61, 0x63, 0x65,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_service_spacemanager_binding_manage_proto_goTypes = []interface{}{
	(*pbrequest.DescribeResourceBinding)(nil),  // 0: request.DescribeResourceBinding
	(*pbresponse.DescribeResourceBinding)(nil), // 1: response.DescribeResourceBinding
}
var file_proto_service_spacemanager_binding_manage_proto_depIdxs = []int32{
	0, // 0: spacemanager.BindingManage.DescribeResourceBinding:input_type -> request.DescribeResourceBinding
	1, // 1: spacemanager.BindingManage.DescribeResourceBinding:output_type -> response.DescribeResourceBinding
	1, // [1:2] is the sub-list for method output_type
	0, // [0:1] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_spacemanager_binding_manage_proto_init() }
func file_proto_service_spacemanager_binding_manage_proto_init() {
	if File_proto_service_spacemanager_binding_manage_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_spacemanager_binding_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_spacemanager_binding_manage_proto_goTypes,
		DependencyIndexes: file_proto_service_spacemanager_binding_manage_proto_depIdxs,
	}.Build()
	File_proto_service_spacemanager_binding_manage_proto = out.File
	file_proto_service_spacemanager_binding_manage_proto_rawDesc = nil
	file_proto_service_spacemanager_binding_manage_proto_goTypes = nil
	file_proto_service_spacemanager_binding_manage_proto_depIdxs = nil
}
