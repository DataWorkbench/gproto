// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/spacemanager/table_manage.proto

package pbsvcspace

import (
	pbmodel "github.com/DataWorkbench/gproto/pkg/types/pbmodel"
	pbrequest "github.com/DataWorkbench/gproto/pkg/types/pbrequest"
	pbresponse "github.com/DataWorkbench/gproto/pkg/types/pbresponse"
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

var File_proto_service_spacemanager_table_manage_proto protoreflect.FileDescriptor

var file_proto_service_spacemanager_table_manage_proto_rawDesc = []byte{
	0x0a, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2f, 0x74, 0x61, 0x62,
	0x6c, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x0c, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x1a, 0x1d, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x26, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x2f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x27, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65,
	0x73, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x74, 0x61, 0x62, 0x6c, 0x65,
	0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0xfa, 0x02,
	0x0a, 0x0a, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x4d, 0x61, 0x6e, 0x67, 0x65, 0x12, 0x48, 0x0a, 0x0f,
	0x4c, 0x69, 0x73, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x73, 0x12,
	0x18, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x46, 0x6c,
	0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x73, 0x1a, 0x19, 0x2e, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61,
	0x62, 0x6c, 0x65, 0x73, 0x22, 0x00, 0x12, 0x43, 0x0a, 0x10, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b,
	0x54, 0x61, 0x62, 0x6c, 0x65, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d,
	0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x51, 0x0a, 0x12, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c,
	0x65, 0x12, 0x1b, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63,
	0x72, 0x69, 0x62, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x1a, 0x1c,
	0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69,
	0x62, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x22, 0x00, 0x12, 0x43,
	0x0a, 0x10, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62,
	0x6c, 0x65, 0x12, 0x19, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x45, 0x0a, 0x11, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x73, 0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65,
	0x73, 0x74, 0x2e, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61,
	0x62, 0x6c, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x42, 0x75, 0x0a, 0x27, 0x63, 0x6f,
	0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2e, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x62, 0x73, 0x76, 0x63,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x42, 0x10, 0x50, 0x42, 0x53, 0x76, 0x63, 0x54, 0x61, 0x62, 0x6c,
	0x65, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65,
	0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x70, 0x62, 0x73, 0x76, 0x63, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_service_spacemanager_table_manage_proto_goTypes = []interface{}{
	(*pbrequest.ListFlinkTables)(nil),     // 0: request.ListFlinkTables
	(*pbrequest.CreateFlinkTable)(nil),    // 1: request.CreateFlinkTable
	(*pbrequest.DescribeFlinkTable)(nil),  // 2: request.DescribeFlinkTable
	(*pbrequest.UpdateFlinkTable)(nil),    // 3: request.UpdateFlinkTable
	(*pbrequest.DeleteFlinkTables)(nil),   // 4: request.DeleteFlinkTables
	(*pbresponse.ListFlinkTables)(nil),    // 5: response.ListFlinkTables
	(*pbmodel.EmptyStruct)(nil),           // 6: model.EmptyStruct
	(*pbresponse.DescribeFlinkTable)(nil), // 7: response.DescribeFlinkTable
}
var file_proto_service_spacemanager_table_manage_proto_depIdxs = []int32{
	0, // 0: spacemanager.TableMange.ListFlinkTables:input_type -> request.ListFlinkTables
	1, // 1: spacemanager.TableMange.CreateFlinkTable:input_type -> request.CreateFlinkTable
	2, // 2: spacemanager.TableMange.DescribeFlinkTable:input_type -> request.DescribeFlinkTable
	3, // 3: spacemanager.TableMange.UpdateFlinkTable:input_type -> request.UpdateFlinkTable
	4, // 4: spacemanager.TableMange.DeleteFlinkTables:input_type -> request.DeleteFlinkTables
	5, // 5: spacemanager.TableMange.ListFlinkTables:output_type -> response.ListFlinkTables
	6, // 6: spacemanager.TableMange.CreateFlinkTable:output_type -> model.EmptyStruct
	7, // 7: spacemanager.TableMange.DescribeFlinkTable:output_type -> response.DescribeFlinkTable
	6, // 8: spacemanager.TableMange.UpdateFlinkTable:output_type -> model.EmptyStruct
	6, // 9: spacemanager.TableMange.DeleteFlinkTables:output_type -> model.EmptyStruct
	5, // [5:10] is the sub-list for method output_type
	0, // [0:5] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_spacemanager_table_manage_proto_init() }
func file_proto_service_spacemanager_table_manage_proto_init() {
	if File_proto_service_spacemanager_table_manage_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_spacemanager_table_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_spacemanager_table_manage_proto_goTypes,
		DependencyIndexes: file_proto_service_spacemanager_table_manage_proto_depIdxs,
	}.Build()
	File_proto_service_spacemanager_table_manage_proto = out.File
	file_proto_service_spacemanager_table_manage_proto_rawDesc = nil
	file_proto_service_spacemanager_table_manage_proto_goTypes = nil
	file_proto_service_spacemanager_table_manage_proto_depIdxs = nil
}
