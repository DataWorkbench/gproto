// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/service/spacemanager/sync_instance_manage.proto

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

var File_proto_service_spacemanager_sync_instance_manage_proto protoreflect.FileDescriptor

var file_proto_service_spacemanager_sync_instance_manage_proto_rawDesc = []byte{
	0x0a, 0x35, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x72, 0x2f, 0x73, 0x79, 0x6e,
	0x63, 0x5f, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0c, 0x73, 0x70, 0x61, 0x63, 0x65, 0x6d, 0x61,
	0x6e, 0x61, 0x67, 0x65, 0x72, 0x1a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x65, 0x6d, 0x70, 0x74, 0x79, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65,
	0x73, 0x2f, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x69,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65,
	0x73, 0x2f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f,
	0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x32, 0xce, 0x04, 0x0a, 0x12, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e,
	0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x12, 0x4e, 0x0a, 0x11,
	0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65,
	0x73, 0x12, 0x1a, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x4c, 0x69, 0x73, 0x74,
	0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x1a, 0x1b, 0x2e,
	0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x79, 0x6e,
	0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x22, 0x00, 0x12, 0x4f, 0x0a, 0x16,
	0x54, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73,
	0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x1f, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74,
	0x2e, 0x54, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e,
	0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x4b, 0x0a,
	0x14, 0x53, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x1d, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e,
	0x53, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61,
	0x6e, 0x63, 0x65, 0x73, 0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70,
	0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x49, 0x0a, 0x13, 0x52, 0x65,
	0x73, 0x75, 0x6d, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65,
	0x73, 0x12, 0x1c, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x52, 0x65, 0x73, 0x75,
	0x6d, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x1a,
	0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72,
	0x75, 0x63, 0x74, 0x22, 0x00, 0x12, 0x57, 0x0a, 0x14, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62,
	0x65, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x12, 0x1d, 0x2e,
	0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65,
	0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x1a, 0x1e, 0x2e, 0x72,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65,
	0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x22, 0x00, 0x12, 0x53,
	0x0a, 0x18, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x57, 0x69, 0x74, 0x68, 0x49, 0x64, 0x12, 0x21, 0x2e, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x2e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x49,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x57, 0x69, 0x74, 0x68, 0x49, 0x64, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x12, 0x51, 0x0a, 0x17, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x53, 0x79, 0x6e,
	0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x53, 0x74, 0x61, 0x74, 0x65, 0x12, 0x20,
	0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65, 0x53,
	0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x53, 0x74, 0x61, 0x74, 0x65,
	0x1a, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74,
	0x72, 0x75, 0x63, 0x74, 0x22, 0x00, 0x42, 0x7c, 0x0a, 0x27, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61,
	0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x62, 0x73, 0x76, 0x63, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x42, 0x17, 0x50, 0x42, 0x53, 0x76, 0x63, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x36, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72,
	0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67,
	0x6f, 0x2f, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2f, 0x70, 0x62, 0x73, 0x76, 0x63, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_service_spacemanager_sync_instance_manage_proto_goTypes = []interface{}{
	(*pbrequest.ListSyncInstances)(nil),        // 0: request.ListSyncInstances
	(*pbrequest.TerminateSyncInstances)(nil),   // 1: request.TerminateSyncInstances
	(*pbrequest.SuspendSyncInstances)(nil),     // 2: request.SuspendSyncInstances
	(*pbrequest.ResumeSyncInstances)(nil),      // 3: request.ResumeSyncInstances
	(*pbrequest.DescribeSyncInstance)(nil),     // 4: request.DescribeSyncInstance
	(*pbrequest.CreateSyncInstanceWithId)(nil), // 5: request.CreateSyncInstanceWithId
	(*pbrequest.UpdateSyncInstanceState)(nil),  // 6: request.UpdateSyncInstanceState
	(*pbresponse.ListSyncInstances)(nil),       // 7: response.ListSyncInstances
	(*pbmodel.EmptyStruct)(nil),                // 8: model.EmptyStruct
	(*pbresponse.DescribeSyncInstance)(nil),    // 9: response.DescribeSyncInstance
}
var file_proto_service_spacemanager_sync_instance_manage_proto_depIdxs = []int32{
	0, // 0: spacemanager.SyncInstanceManage.ListSyncInstances:input_type -> request.ListSyncInstances
	1, // 1: spacemanager.SyncInstanceManage.TerminateSyncInstances:input_type -> request.TerminateSyncInstances
	2, // 2: spacemanager.SyncInstanceManage.SuspendSyncInstances:input_type -> request.SuspendSyncInstances
	3, // 3: spacemanager.SyncInstanceManage.ResumeSyncInstances:input_type -> request.ResumeSyncInstances
	4, // 4: spacemanager.SyncInstanceManage.DescribeSyncInstance:input_type -> request.DescribeSyncInstance
	5, // 5: spacemanager.SyncInstanceManage.CreateSyncInstanceWithId:input_type -> request.CreateSyncInstanceWithId
	6, // 6: spacemanager.SyncInstanceManage.UpdateSyncInstanceState:input_type -> request.UpdateSyncInstanceState
	7, // 7: spacemanager.SyncInstanceManage.ListSyncInstances:output_type -> response.ListSyncInstances
	8, // 8: spacemanager.SyncInstanceManage.TerminateSyncInstances:output_type -> model.EmptyStruct
	8, // 9: spacemanager.SyncInstanceManage.SuspendSyncInstances:output_type -> model.EmptyStruct
	8, // 10: spacemanager.SyncInstanceManage.ResumeSyncInstances:output_type -> model.EmptyStruct
	9, // 11: spacemanager.SyncInstanceManage.DescribeSyncInstance:output_type -> response.DescribeSyncInstance
	8, // 12: spacemanager.SyncInstanceManage.CreateSyncInstanceWithId:output_type -> model.EmptyStruct
	8, // 13: spacemanager.SyncInstanceManage.UpdateSyncInstanceState:output_type -> model.EmptyStruct
	7, // [7:14] is the sub-list for method output_type
	0, // [0:7] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_service_spacemanager_sync_instance_manage_proto_init() }
func file_proto_service_spacemanager_sync_instance_manage_proto_init() {
	if File_proto_service_spacemanager_sync_instance_manage_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_service_spacemanager_sync_instance_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_service_spacemanager_sync_instance_manage_proto_goTypes,
		DependencyIndexes: file_proto_service_spacemanager_sync_instance_manage_proto_depIdxs,
	}.Build()
	File_proto_service_spacemanager_sync_instance_manage_proto = out.File
	file_proto_service_spacemanager_sync_instance_manage_proto_rawDesc = nil
	file_proto_service_spacemanager_sync_instance_manage_proto_goTypes = nil
	file_proto_service_spacemanager_sync_instance_manage_proto_depIdxs = nil
}