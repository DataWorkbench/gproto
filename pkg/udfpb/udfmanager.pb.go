// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/udfmanager.proto

package udfpb

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

var File_proto_udfmanager_proto protoreflect.FileDescriptor

var file_proto_udfmanager_proto_rawDesc = []byte{
	0x0a, 0x16, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x75, 0x64, 0x66, 0x6d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x75, 0x64, 0x66, 0x70, 0x62, 0x1a,
	0x0b, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0d, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0e, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0x8c, 0x03, 0x0a, 0x0a,
	0x55, 0x64, 0x66, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x12, 0x32, 0x0a, 0x06, 0x43, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x12, 0x12, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43,
	0x72, 0x65, 0x61, 0x74, 0x65, 0x55, 0x44, 0x46, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x32,
	0x0a, 0x06, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x12, 0x12, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x55, 0x44, 0x46, 0x1a, 0x12, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74,
	0x22, 0x00, 0x12, 0x39, 0x0a, 0x08, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x12, 0x14,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62,
	0x65, 0x55, 0x44, 0x46, 0x1a, 0x15, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e,
	0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x55, 0x44, 0x46, 0x22, 0x00, 0x12, 0x32, 0x0a,
	0x06, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x12, 0x12, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x55, 0x44, 0x46, 0x1a, 0x12, 0x2e, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22,
	0x00, 0x12, 0x3c, 0x0a, 0x09, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x41, 0x6c, 0x6c, 0x12, 0x19,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x57,
	0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12,
	0x2d, 0x0a, 0x04, 0x4c, 0x69, 0x73, 0x74, 0x12, 0x10, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x55, 0x44, 0x46, 0x1a, 0x11, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x55, 0x44, 0x46, 0x22, 0x00, 0x12, 0x3a,
	0x0a, 0x0a, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e, 0x46, 0x75, 0x6e, 0x63, 0x12, 0x16, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x44, 0x46, 0x43, 0x6f, 0x6d, 0x6d, 0x6f, 0x6e,
	0x46, 0x75, 0x6e, 0x63, 0x1a, 0x12, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e,
	0x4a, 0x73, 0x6f, 0x6e, 0x4c, 0x69, 0x73, 0x74, 0x22, 0x00, 0x42, 0x4f, 0x0a, 0x19, 0x63, 0x6f,
	0x6d, 0x2e, 0x77, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2e, 0x75, 0x64, 0x66, 0x70, 0x62, 0x42, 0x05, 0x55, 0x64, 0x66, 0x70, 0x62, 0x50, 0x01,
	0x5a, 0x29, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74,
	0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x75, 0x64, 0x66, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var file_proto_udfmanager_proto_goTypes = []interface{}{
	(*request.CreateUDF)(nil),        // 0: request.CreateUDF
	(*request.UpdateUDF)(nil),        // 1: request.UpdateUDF
	(*request.DescribeUDF)(nil),      // 2: request.DescribeUDF
	(*request.DeleteUDF)(nil),        // 3: request.DeleteUDF
	(*request.DeleteWorkspaces)(nil), // 4: request.DeleteWorkspaces
	(*request.ListUDF)(nil),          // 5: request.ListUDF
	(*request.UDFCommonFunc)(nil),    // 6: request.UDFCommonFunc
	(*model.EmptyStruct)(nil),        // 7: model.EmptyStruct
	(*response.DescribeUDF)(nil),     // 8: response.DescribeUDF
	(*response.ListUDF)(nil),         // 9: response.ListUDF
	(*response.JsonList)(nil),        // 10: response.JsonList
}
var file_proto_udfmanager_proto_depIdxs = []int32{
	0,  // 0: udfpb.Udfmanager.Create:input_type -> request.CreateUDF
	1,  // 1: udfpb.Udfmanager.Update:input_type -> request.UpdateUDF
	2,  // 2: udfpb.Udfmanager.Describe:input_type -> request.DescribeUDF
	3,  // 3: udfpb.Udfmanager.Delete:input_type -> request.DeleteUDF
	4,  // 4: udfpb.Udfmanager.DeleteAll:input_type -> request.DeleteWorkspaces
	5,  // 5: udfpb.Udfmanager.List:input_type -> request.ListUDF
	6,  // 6: udfpb.Udfmanager.CommonFunc:input_type -> request.UDFCommonFunc
	7,  // 7: udfpb.Udfmanager.Create:output_type -> model.EmptyStruct
	7,  // 8: udfpb.Udfmanager.Update:output_type -> model.EmptyStruct
	8,  // 9: udfpb.Udfmanager.Describe:output_type -> response.DescribeUDF
	7,  // 10: udfpb.Udfmanager.Delete:output_type -> model.EmptyStruct
	7,  // 11: udfpb.Udfmanager.DeleteAll:output_type -> model.EmptyStruct
	9,  // 12: udfpb.Udfmanager.List:output_type -> response.ListUDF
	10, // 13: udfpb.Udfmanager.CommonFunc:output_type -> response.JsonList
	7,  // [7:14] is the sub-list for method output_type
	0,  // [0:7] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_proto_udfmanager_proto_init() }
func file_proto_udfmanager_proto_init() {
	if File_proto_udfmanager_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_udfmanager_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_udfmanager_proto_goTypes,
		DependencyIndexes: file_proto_udfmanager_proto_depIdxs,
	}.Build()
	File_proto_udfmanager_proto = out.File
	file_proto_udfmanager_proto_rawDesc = nil
	file_proto_udfmanager_proto_goTypes = nil
	file_proto_udfmanager_proto_depIdxs = nil
}
