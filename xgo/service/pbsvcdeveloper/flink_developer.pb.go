// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/developer/flink_developer.proto

package pbsvcdeveloper

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

var File_proto_service_developer_flink_developer_proto protoreflect.FileDescriptor

var file_proto_service_developer_flink_developer_proto_rawDesc = []byte{
	0x0a, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2f, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f,
	0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x09, 0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x1a, 0x1d, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x65, 0x6d,
	0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x66,
	0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2a, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65,
	0x73, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x66, 0x6c, 0x69, 0x6e, 0x6b,
	0x5f, 0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x32, 0x83, 0x03, 0x0a, 0x0e, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x44, 0x65, 0x76, 0x65, 0x6c, 0x6f,
	0x70, 0x65, 0x72, 0x12, 0x45, 0x0a, 0x0e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x1a, 0x18,
	0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x22, 0x00, 0x12, 0x4e, 0x0a, 0x11, 0x47, 0x65,
	0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12,
	0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47, 0x65, 0x74, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x1a, 0x1b, 0x2e, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a,
	0x6f, 0x62, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x22, 0x00, 0x12, 0x3f, 0x0a, 0x0e, 0x43, 0x61,
	0x6e, 0x63, 0x65, 0x6c, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x17, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4b, 0x0a, 0x10, 0x56,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12,
	0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61,
	0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x1a, 0x1a, 0x2e, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x46, 0x6c,
	0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x22, 0x00, 0x12, 0x4c, 0x0a, 0x0f, 0x45, 0x78, 0x65, 0x63,
	0x75, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x53, 0x71, 0x6c, 0x12, 0x18, 0x2e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x45, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x53, 0x71, 0x6c, 0x1a, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x2e, 0x45, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x53, 0x71, 0x6c,
	0x22, 0x00, 0x28, 0x01, 0x30, 0x01, 0x42, 0x80, 0x01, 0x0a, 0x2b, 0x63, 0x6f, 0x6d, 0x2e, 0x64,
	0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x62, 0x73, 0x76, 0x63, 0x64, 0x65, 0x76,
	0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x42, 0x13, 0x50, 0x42, 0x53, 0x76, 0x63, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x44, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x50, 0x00, 0x5a, 0x3a, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78,
	0x67, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x70, 0x62, 0x73, 0x76, 0x63,
	0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var file_proto_service_developer_flink_developer_proto_goTypes = []interface{}{
	(*pbrequest.SubmitFlinkJob)(nil),     // 0: request.SubmitFlinkJob
	(*pbrequest.GetFlinkJobStatus)(nil),  // 1: request.GetFlinkJobStatus
	(*pbrequest.CancelFlinkJob)(nil),     // 2: request.CancelFlinkJob
	(*pbrequest.ValidateFlinkJob)(nil),   // 3: request.ValidateFlinkJob
	(*pbrequest.ExecuteFlinkSql)(nil),    // 4: request.ExecuteFlinkSql
	(*pbresponse.SubmitFlinkJob)(nil),    // 5: response.SubmitFlinkJob
	(*pbresponse.GetFlinkJobStatus)(nil), // 6: response.GetFlinkJobStatus
	(*pbmodel.EmptyStruct)(nil),          // 7: model.EmptyStruct
	(*pbresponse.ValidateFlinkJob)(nil),  // 8: response.ValidateFlinkJob
	(*pbresponse.ExecuteFlinkSql)(nil),   // 9: response.ExecuteFlinkSql
}
var file_proto_service_developer_flink_developer_proto_depIdxs = []int32{
	0, // 0: developer.FlinkDeveloper.SubmitFlinkJob:input_type -> request.SubmitFlinkJob
	1, // 1: developer.FlinkDeveloper.GetFlinkJobStatus:input_type -> request.GetFlinkJobStatus
	2, // 2: developer.FlinkDeveloper.CancelFlinkJob:input_type -> request.CancelFlinkJob
	3, // 3: developer.FlinkDeveloper.ValidateFlinkJob:input_type -> request.ValidateFlinkJob
	4, // 4: developer.FlinkDeveloper.ExecuteFlinkSql:input_type -> request.ExecuteFlinkSql
	5, // 5: developer.FlinkDeveloper.SubmitFlinkJob:output_type -> response.SubmitFlinkJob
	6, // 6: developer.FlinkDeveloper.GetFlinkJobStatus:output_type -> response.GetFlinkJobStatus
	7, // 7: developer.FlinkDeveloper.CancelFlinkJob:output_type -> model.EmptyStruct
	8, // 8: developer.FlinkDeveloper.ValidateFlinkJob:output_type -> response.ValidateFlinkJob
	9, // 9: developer.FlinkDeveloper.ExecuteFlinkSql:output_type -> response.ExecuteFlinkSql
	5, // [5:10] is the sub-list for method output_type
	0, // [0:5] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_developer_flink_developer_proto_init() }
func file_proto_service_developer_flink_developer_proto_init() {
	if File_proto_service_developer_flink_developer_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_developer_flink_developer_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_developer_flink_developer_proto_goTypes,
		DependencyIndexes: file_proto_service_developer_flink_developer_proto_depIdxs,
	}.Build()
	File_proto_service_developer_flink_developer_proto = out.File
	file_proto_service_developer_flink_developer_proto_rawDesc = nil
	file_proto_service_developer_flink_developer_proto_goTypes = nil
	file_proto_service_developer_flink_developer_proto_depIdxs = nil
}
