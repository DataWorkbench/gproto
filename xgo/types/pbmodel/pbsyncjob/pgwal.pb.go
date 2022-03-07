// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/syncjob/pgwal.proto

package pbsyncjob

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbvalidator"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

type PgWalSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// database name
	DatabaseName string `protobuf:"bytes,1,opt,name=database_name,json=databaseName,proto3" json:"database_name"`
	// table list
	TableList []string `protobuf:"bytes,2,rep,name=table_list,json=tableList,proto3" json:"table_list"`
	// slot name
	SlotName string `protobuf:"bytes,3,opt,name=slot_name,json=slotName,proto3" json:"slot_name"`
	// status interval
	StatusInterval int32 `protobuf:"varint,4,opt,name=status_interval,json=statusInterval,proto3" json:"status_interval"`
	// allow created
	AllowCreated bool `protobuf:"varint,5,opt,name=allow_created,json=allowCreated,proto3" json:"allow_created"`
	// temporary
	Temporary bool `protobuf:"varint,6,opt,name=temporary,proto3" json:"temporary"`
	// paving data
	PavingData bool `protobuf:"varint,7,opt,name=paving_data,json=pavingData,proto3" json:"paving_data"`
	// lsn
	Lsn int64 `protobuf:"varint,8,opt,name=lsn,proto3" json:"lsn"`
	// slot available
	SlotAvailable bool `protobuf:"varint,9,opt,name=slot_available,json=slotAvailable,proto3" json:"slot_available"`
}

func (x *PgWalSource) Reset() {
	*x = PgWalSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_pgwal_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PgWalSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PgWalSource) ProtoMessage() {}

func (x *PgWalSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_pgwal_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PgWalSource.ProtoReflect.Descriptor instead.
func (*PgWalSource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_pgwal_proto_rawDescGZIP(), []int{0}
}

func (x *PgWalSource) GetDatabaseName() string {
	if x != nil {
		return x.DatabaseName
	}
	return ""
}

func (x *PgWalSource) GetTableList() []string {
	if x != nil {
		return x.TableList
	}
	return nil
}

func (x *PgWalSource) GetSlotName() string {
	if x != nil {
		return x.SlotName
	}
	return ""
}

func (x *PgWalSource) GetStatusInterval() int32 {
	if x != nil {
		return x.StatusInterval
	}
	return 0
}

func (x *PgWalSource) GetAllowCreated() bool {
	if x != nil {
		return x.AllowCreated
	}
	return false
}

func (x *PgWalSource) GetTemporary() bool {
	if x != nil {
		return x.Temporary
	}
	return false
}

func (x *PgWalSource) GetPavingData() bool {
	if x != nil {
		return x.PavingData
	}
	return false
}

func (x *PgWalSource) GetLsn() int64 {
	if x != nil {
		return x.Lsn
	}
	return 0
}

func (x *PgWalSource) GetSlotAvailable() bool {
	if x != nil {
		return x.SlotAvailable
	}
	return false
}

var File_proto_types_model_syncjob_pgwal_proto protoreflect.FileDescriptor

var file_proto_types_model_syncjob_pgwal_proto_rawDesc = []byte{
	0x0a, 0x25, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x2f, 0x70, 0x67, 0x77, 0x61,
	0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67,
	0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71, 0x6c, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75,
	0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c,
	0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x26, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63,
	0x6a, 0x6f, 0x62, 0x2f, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xb4, 0x02, 0x0a, 0x0b, 0x50, 0x67, 0x57, 0x61, 0x6c, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x12, 0x23, 0x0a, 0x0d, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73, 0x65, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73,
	0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6c,
	0x69, 0x73, 0x74, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x52, 0x09, 0x74, 0x61, 0x62, 0x6c, 0x65,
	0x4c, 0x69, 0x73, 0x74, 0x12, 0x1b, 0x0a, 0x09, 0x73, 0x6c, 0x6f, 0x74, 0x5f, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x73, 0x6c, 0x6f, 0x74, 0x4e, 0x61, 0x6d,
	0x65, 0x12, 0x27, 0x0a, 0x0f, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x5f, 0x69, 0x6e, 0x74, 0x65,
	0x72, 0x76, 0x61, 0x6c, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0e, 0x73, 0x74, 0x61, 0x74,
	0x75, 0x73, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x76, 0x61, 0x6c, 0x12, 0x23, 0x0a, 0x0d, 0x61, 0x6c,
	0x6c, 0x6f, 0x77, 0x5f, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x0c, 0x61, 0x6c, 0x6c, 0x6f, 0x77, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x12,
	0x1c, 0x0a, 0x09, 0x74, 0x65, 0x6d, 0x70, 0x6f, 0x72, 0x61, 0x72, 0x79, 0x18, 0x06, 0x20, 0x01,
	0x28, 0x08, 0x52, 0x09, 0x74, 0x65, 0x6d, 0x70, 0x6f, 0x72, 0x61, 0x72, 0x79, 0x12, 0x1f, 0x0a,
	0x0b, 0x70, 0x61, 0x76, 0x69, 0x6e, 0x67, 0x5f, 0x64, 0x61, 0x74, 0x61, 0x18, 0x07, 0x20, 0x01,
	0x28, 0x08, 0x52, 0x0a, 0x70, 0x61, 0x76, 0x69, 0x6e, 0x67, 0x44, 0x61, 0x74, 0x61, 0x12, 0x10,
	0x0a, 0x03, 0x6c, 0x73, 0x6e, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x52, 0x03, 0x6c, 0x73, 0x6e,
	0x12, 0x25, 0x0a, 0x0e, 0x73, 0x6c, 0x6f, 0x74, 0x5f, 0x61, 0x76, 0x61, 0x69, 0x6c, 0x61, 0x62,
	0x6c, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0d, 0x73, 0x6c, 0x6f, 0x74, 0x41, 0x76,
	0x61, 0x69, 0x6c, 0x61, 0x62, 0x6c, 0x65, 0x42, 0x76, 0x0a, 0x2c, 0x63, 0x6f, 0x6d, 0x2e, 0x64,
	0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x62,
	0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x42, 0x07, 0x50, 0x42, 0x50, 0x67, 0x77, 0x61, 0x6c,
	0x50, 0x00, 0x5a, 0x3b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44,
	0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x70, 0x62, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x62,
	0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_syncjob_pgwal_proto_rawDescOnce sync.Once
	file_proto_types_model_syncjob_pgwal_proto_rawDescData = file_proto_types_model_syncjob_pgwal_proto_rawDesc
)

func file_proto_types_model_syncjob_pgwal_proto_rawDescGZIP() []byte {
	file_proto_types_model_syncjob_pgwal_proto_rawDescOnce.Do(func() {
		file_proto_types_model_syncjob_pgwal_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_syncjob_pgwal_proto_rawDescData)
	})
	return file_proto_types_model_syncjob_pgwal_proto_rawDescData
}

var file_proto_types_model_syncjob_pgwal_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_types_model_syncjob_pgwal_proto_goTypes = []interface{}{
	(*PgWalSource)(nil), // 0: model.PgWalSource
}
var file_proto_types_model_syncjob_pgwal_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_types_model_syncjob_pgwal_proto_init() }
func file_proto_types_model_syncjob_pgwal_proto_init() {
	if File_proto_types_model_syncjob_pgwal_proto != nil {
		return
	}
	file_proto_types_model_syncjob_column_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_syncjob_pgwal_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PgWalSource); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_types_model_syncjob_pgwal_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_syncjob_pgwal_proto_goTypes,
		DependencyIndexes: file_proto_types_model_syncjob_pgwal_proto_depIdxs,
		MessageInfos:      file_proto_types_model_syncjob_pgwal_proto_msgTypes,
	}.Build()
	File_proto_types_model_syncjob_pgwal_proto = out.File
	file_proto_types_model_syncjob_pgwal_proto_rawDesc = nil
	file_proto_types_model_syncjob_pgwal_proto_goTypes = nil
	file_proto_types_model_syncjob_pgwal_proto_depIdxs = nil
}