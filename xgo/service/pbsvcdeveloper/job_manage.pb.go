// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/developer/job_manage.proto

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

var File_proto_service_developer_job_manage_proto protoreflect.FileDescriptor

var file_proto_service_developer_job_manage_proto_rawDesc = []byte{
	0x0a, 0x28, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2f, 0x6a, 0x6f, 0x62, 0x5f, 0x6d, 0x61,
	0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x09, 0x64, 0x65, 0x76, 0x65,
	0x6c, 0x6f, 0x70, 0x65, 0x72, 0x1a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x24, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65,
	0x73, 0x2f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x6a, 0x6f, 0x62, 0x5f, 0x6d, 0x61,
	0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x25, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x2f, 0x6a, 0x6f, 0x62, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x32, 0x9c, 0x03, 0x0a, 0x09, 0x4a, 0x6f, 0x62, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x12,
	0x3b, 0x0a, 0x0c, 0x46, 0x72, 0x65, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12,
	0x15, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x46, 0x72, 0x65, 0x65, 0x46, 0x6c,
	0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45,
	0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x3f, 0x0a, 0x0c,
	0x49, 0x6e, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x15, 0x2e, 0x72,
	0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x49, 0x6e, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b,
	0x4a, 0x6f, 0x62, 0x1a, 0x16, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x49,
	0x6e, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x22, 0x00, 0x12, 0x45, 0x0a,
	0x0e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12,
	0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x1a, 0x18, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x2e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a,
	0x6f, 0x62, 0x22, 0x00, 0x12, 0x3c, 0x0a, 0x0b, 0x47, 0x65, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b,
	0x4a, 0x6f, 0x62, 0x12, 0x14, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x47, 0x65,
	0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x1a, 0x15, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x47, 0x65, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62,
	0x22, 0x00, 0x12, 0x3f, 0x0a, 0x0e, 0x43, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x46, 0x6c, 0x69, 0x6e,
	0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x43,
	0x61, 0x6e, 0x63, 0x65, 0x6c, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x4b, 0x0a, 0x10, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x46,
	0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2e, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a,
	0x6f, 0x62, 0x1a, 0x1a, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x56, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x22, 0x00,
	0x42, 0x7b, 0x0a, 0x2b, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69,
	0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65,
	0x2e, 0x70, 0x62, 0x73, 0x76, 0x63, 0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x42,
	0x0e, 0x50, 0x42, 0x53, 0x76, 0x63, 0x4a, 0x6f, 0x62, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x50,
	0x00, 0x5a, 0x3a, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61,
	0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x70,
	0x62, 0x73, 0x76, 0x63, 0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_service_developer_job_manage_proto_goTypes = []interface{}{
	(*pbrequest.FreeFlinkJob)(nil),      // 0: request.FreeFlinkJob
	(*pbrequest.InitFlinkJob)(nil),      // 1: request.InitFlinkJob
	(*pbrequest.SubmitFlinkJob)(nil),    // 2: request.SubmitFlinkJob
	(*pbrequest.GetFlinkJob)(nil),       // 3: request.GetFlinkJob
	(*pbrequest.CancelFlinkJob)(nil),    // 4: request.CancelFlinkJob
	(*pbrequest.ValidateFlinkJob)(nil),  // 5: request.ValidateFlinkJob
	(*pbmodel.EmptyStruct)(nil),         // 6: model.EmptyStruct
	(*pbresponse.InitFlinkJob)(nil),     // 7: response.InitFlinkJob
	(*pbresponse.SubmitFlinkJob)(nil),   // 8: response.SubmitFlinkJob
	(*pbresponse.GetFlinkJob)(nil),      // 9: response.GetFlinkJob
	(*pbresponse.ValidateFlinkJob)(nil), // 10: response.ValidateFlinkJob
}
var file_proto_service_developer_job_manage_proto_depIdxs = []int32{
	0,  // 0: developer.JobManage.FreeFlinkJob:input_type -> request.FreeFlinkJob
	1,  // 1: developer.JobManage.InitFlinkJob:input_type -> request.InitFlinkJob
	2,  // 2: developer.JobManage.SubmitFlinkJob:input_type -> request.SubmitFlinkJob
	3,  // 3: developer.JobManage.GetFlinkJob:input_type -> request.GetFlinkJob
	4,  // 4: developer.JobManage.CancelFlinkJob:input_type -> request.CancelFlinkJob
	5,  // 5: developer.JobManage.ValidateFlinkJob:input_type -> request.ValidateFlinkJob
	6,  // 6: developer.JobManage.FreeFlinkJob:output_type -> model.EmptyStruct
	7,  // 7: developer.JobManage.InitFlinkJob:output_type -> response.InitFlinkJob
	8,  // 8: developer.JobManage.SubmitFlinkJob:output_type -> response.SubmitFlinkJob
	9,  // 9: developer.JobManage.GetFlinkJob:output_type -> response.GetFlinkJob
	6,  // 10: developer.JobManage.CancelFlinkJob:output_type -> model.EmptyStruct
	10, // 11: developer.JobManage.ValidateFlinkJob:output_type -> response.ValidateFlinkJob
	6,  // [6:12] is the sub-list for method output_type
	0,  // [0:6] is the sub-list for method input_type
	0,  // [0:0] is the sub-list for extension type_name
	0,  // [0:0] is the sub-list for extension extendee
	0,  // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_developer_job_manage_proto_init() }
func file_proto_service_developer_job_manage_proto_init() {
	if File_proto_service_developer_job_manage_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_developer_job_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_developer_job_manage_proto_goTypes,
		DependencyIndexes: file_proto_service_developer_job_manage_proto_depIdxs,
	}.Build()
	File_proto_service_developer_job_manage_proto = out.File
	file_proto_service_developer_job_manage_proto_rawDesc = nil
	file_proto_service_developer_job_manage_proto_goTypes = nil
	file_proto_service_developer_job_manage_proto_depIdxs = nil
}
