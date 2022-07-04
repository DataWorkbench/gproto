// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/syncjob/binlog.proto

package pbsyncjob

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
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

type BinlogSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// table
	Table []string `protobuf:"bytes,1,rep,name=table,proto3" json:"table"`
	// filter
	Filter string `protobuf:"bytes,2,opt,name=filter,proto3" json:"filter"`
	// cat
	Cat string `protobuf:"bytes,3,opt,name=cat,proto3" json:"cat"`
	// start
	Start *Start `protobuf:"bytes,4,opt,name=start,proto3" json:"start"`
	// connection_charset
	ConnectionCharset BaseEnum_Encoding `protobuf:"varint,5,opt,name=connection_charset,json=connectionCharset,proto3,enum=model.BaseEnum_Encoding" json:"connection_charset"`
	// buffer_size
	BufferSize int32 `protobuf:"varint,6,opt,name=buffer_size,json=bufferSize,proto3" json:"buffer_size"`
	// parallel_thread_size
	ParallelThreadSize int32 `protobuf:"varint,7,opt,name=parallel_thread_size,json=parallelThreadSize,proto3" json:"parallel_thread_size"`
	// is gtid mode
	IsGtidMode bool `protobuf:"varint,8,opt,name=is_gtid_mode,json=isGtidMode,proto3" json:"is_gtid_mode"`
	// paving_data
	PavingData bool `protobuf:"varint,9,opt,name=paving_data,json=pavingData,proto3" json:"paving_data"`
	// split
	Split bool `protobuf:"varint,10,opt,name=split,proto3" json:"split"`
	// column
	Column []*Column `protobuf:"bytes,11,rep,name=column,proto3" json:"column"`
}

func (x *BinlogSource) Reset() {
	*x = BinlogSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_binlog_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BinlogSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BinlogSource) ProtoMessage() {}

func (x *BinlogSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_binlog_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BinlogSource.ProtoReflect.Descriptor instead.
func (*BinlogSource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_binlog_proto_rawDescGZIP(), []int{0}
}

func (x *BinlogSource) GetTable() []string {
	if x != nil {
		return x.Table
	}
	return nil
}

func (x *BinlogSource) GetFilter() string {
	if x != nil {
		return x.Filter
	}
	return ""
}

func (x *BinlogSource) GetCat() string {
	if x != nil {
		return x.Cat
	}
	return ""
}

func (x *BinlogSource) GetStart() *Start {
	if x != nil {
		return x.Start
	}
	return nil
}

func (x *BinlogSource) GetConnectionCharset() BaseEnum_Encoding {
	if x != nil {
		return x.ConnectionCharset
	}
	return BaseEnum_EncodingUnset
}

func (x *BinlogSource) GetBufferSize() int32 {
	if x != nil {
		return x.BufferSize
	}
	return 0
}

func (x *BinlogSource) GetParallelThreadSize() int32 {
	if x != nil {
		return x.ParallelThreadSize
	}
	return 0
}

func (x *BinlogSource) GetIsGtidMode() bool {
	if x != nil {
		return x.IsGtidMode
	}
	return false
}

func (x *BinlogSource) GetPavingData() bool {
	if x != nil {
		return x.PavingData
	}
	return false
}

func (x *BinlogSource) GetSplit() bool {
	if x != nil {
		return x.Split
	}
	return false
}

func (x *BinlogSource) GetColumn() []*Column {
	if x != nil {
		return x.Column
	}
	return nil
}

type Start struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// timestamp
	Timestamp int64 `protobuf:"varint,1,opt,name=timestamp,proto3" json:"timestamp"`
	// journal name
	JournalName string `protobuf:"bytes,2,opt,name=journal_name,json=journalName,proto3" json:"journal_name"`
	// position
	Position int64 `protobuf:"varint,3,opt,name=position,proto3" json:"position"`
}

func (x *Start) Reset() {
	*x = Start{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_binlog_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Start) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Start) ProtoMessage() {}

func (x *Start) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_binlog_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Start.ProtoReflect.Descriptor instead.
func (*Start) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_binlog_proto_rawDescGZIP(), []int{1}
}

func (x *Start) GetTimestamp() int64 {
	if x != nil {
		return x.Timestamp
	}
	return 0
}

func (x *Start) GetJournalName() string {
	if x != nil {
		return x.JournalName
	}
	return ""
}

func (x *Start) GetPosition() int64 {
	if x != nil {
		return x.Position
	}
	return 0
}

var File_proto_types_model_syncjob_binlog_proto protoreflect.FileDescriptor

var file_proto_types_model_syncjob_binlog_proto_rawDesc = []byte{
	0x0a, 0x26, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x2f, 0x62, 0x69, 0x6e, 0x6c,
	0x6f, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a,
	0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x26, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x2f, 0x63, 0x6f, 0x6c, 0x75,
	0x6d, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x28, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63,
	0x6a, 0x6f, 0x62, 0x2f, 0x62, 0x61, 0x73, 0x65, 0x65, 0x6e, 0x75, 0x6d, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0x96, 0x03, 0x0a, 0x0c, 0x42, 0x69, 0x6e, 0x6c, 0x6f, 0x67, 0x53, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x18, 0x01, 0x20, 0x03,
	0x28, 0x09, 0x52, 0x05, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x66, 0x69, 0x6c,
	0x74, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x66, 0x69, 0x6c, 0x74, 0x65,
	0x72, 0x12, 0x10, 0x0a, 0x03, 0x63, 0x61, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03,
	0x63, 0x61, 0x74, 0x12, 0x22, 0x0a, 0x05, 0x73, 0x74, 0x61, 0x72, 0x74, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x0c, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x74, 0x61, 0x72, 0x74,
	0x52, 0x05, 0x73, 0x74, 0x61, 0x72, 0x74, 0x12, 0x47, 0x0a, 0x12, 0x63, 0x6f, 0x6e, 0x6e, 0x65,
	0x63, 0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x63, 0x68, 0x61, 0x72, 0x73, 0x65, 0x74, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x18, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x42, 0x61, 0x73, 0x65,
	0x45, 0x6e, 0x75, 0x6d, 0x2e, 0x45, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x52, 0x11, 0x63,
	0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x43, 0x68, 0x61, 0x72, 0x73, 0x65, 0x74,
	0x12, 0x1f, 0x0a, 0x0b, 0x62, 0x75, 0x66, 0x66, 0x65, 0x72, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18,
	0x06, 0x20, 0x01, 0x28, 0x05, 0x52, 0x0a, 0x62, 0x75, 0x66, 0x66, 0x65, 0x72, 0x53, 0x69, 0x7a,
	0x65, 0x12, 0x30, 0x0a, 0x14, 0x70, 0x61, 0x72, 0x61, 0x6c, 0x6c, 0x65, 0x6c, 0x5f, 0x74, 0x68,
	0x72, 0x65, 0x61, 0x64, 0x5f, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x05, 0x52,
	0x12, 0x70, 0x61, 0x72, 0x61, 0x6c, 0x6c, 0x65, 0x6c, 0x54, 0x68, 0x72, 0x65, 0x61, 0x64, 0x53,
	0x69, 0x7a, 0x65, 0x12, 0x20, 0x0a, 0x0c, 0x69, 0x73, 0x5f, 0x67, 0x74, 0x69, 0x64, 0x5f, 0x6d,
	0x6f, 0x64, 0x65, 0x18, 0x08, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0a, 0x69, 0x73, 0x47, 0x74, 0x69,
	0x64, 0x4d, 0x6f, 0x64, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x70, 0x61, 0x76, 0x69, 0x6e, 0x67, 0x5f,
	0x64, 0x61, 0x74, 0x61, 0x18, 0x09, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0a, 0x70, 0x61, 0x76, 0x69,
	0x6e, 0x67, 0x44, 0x61, 0x74, 0x61, 0x12, 0x14, 0x0a, 0x05, 0x73, 0x70, 0x6c, 0x69, 0x74, 0x18,
	0x0a, 0x20, 0x01, 0x28, 0x08, 0x52, 0x05, 0x73, 0x70, 0x6c, 0x69, 0x74, 0x12, 0x25, 0x0a, 0x06,
	0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x18, 0x0b, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x52, 0x06, 0x63, 0x6f, 0x6c,
	0x75, 0x6d, 0x6e, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x64, 0x0a, 0x05, 0x53,
	0x74, 0x61, 0x72, 0x74, 0x12, 0x1c, 0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d,
	0x70, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61,
	0x6d, 0x70, 0x12, 0x21, 0x0a, 0x0c, 0x6a, 0x6f, 0x75, 0x72, 0x6e, 0x61, 0x6c, 0x5f, 0x6e, 0x61,
	0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x6a, 0x6f, 0x75, 0x72, 0x6e, 0x61,
	0x6c, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x1a, 0x0a, 0x08, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08, 0x70, 0x6f, 0x73, 0x69, 0x74, 0x69, 0x6f,
	0x6e, 0x42, 0x77, 0x0a, 0x2c, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e,
	0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e,
	0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x62, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f,
	0x62, 0x42, 0x08, 0x50, 0x42, 0x42, 0x69, 0x6e, 0x6c, 0x6f, 0x67, 0x50, 0x00, 0x5a, 0x3b, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78,
	0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2f, 0x70, 0x62, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_proto_types_model_syncjob_binlog_proto_rawDescOnce sync.Once
	file_proto_types_model_syncjob_binlog_proto_rawDescData = file_proto_types_model_syncjob_binlog_proto_rawDesc
)

func file_proto_types_model_syncjob_binlog_proto_rawDescGZIP() []byte {
	file_proto_types_model_syncjob_binlog_proto_rawDescOnce.Do(func() {
		file_proto_types_model_syncjob_binlog_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_syncjob_binlog_proto_rawDescData)
	})
	return file_proto_types_model_syncjob_binlog_proto_rawDescData
}

var file_proto_types_model_syncjob_binlog_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_proto_types_model_syncjob_binlog_proto_goTypes = []interface{}{
	(*BinlogSource)(nil),   // 0: model.BinlogSource
	(*Start)(nil),          // 1: model.Start
	(BaseEnum_Encoding)(0), // 2: model.BaseEnum.Encoding
	(*Column)(nil),         // 3: model.Column
}
var file_proto_types_model_syncjob_binlog_proto_depIdxs = []int32{
	1, // 0: model.BinlogSource.start:type_name -> model.Start
	2, // 1: model.BinlogSource.connection_charset:type_name -> model.BaseEnum.Encoding
	3, // 2: model.BinlogSource.column:type_name -> model.Column
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_proto_types_model_syncjob_binlog_proto_init() }
func file_proto_types_model_syncjob_binlog_proto_init() {
	if File_proto_types_model_syncjob_binlog_proto != nil {
		return
	}
	file_proto_types_model_syncjob_column_proto_init()
	file_proto_types_model_syncjob_baseenum_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_syncjob_binlog_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BinlogSource); i {
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
		file_proto_types_model_syncjob_binlog_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Start); i {
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
			RawDescriptor: file_proto_types_model_syncjob_binlog_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_syncjob_binlog_proto_goTypes,
		DependencyIndexes: file_proto_types_model_syncjob_binlog_proto_depIdxs,
		MessageInfos:      file_proto_types_model_syncjob_binlog_proto_msgTypes,
	}.Build()
	File_proto_types_model_syncjob_binlog_proto = out.File
	file_proto_types_model_syncjob_binlog_proto_rawDesc = nil
	file_proto_types_model_syncjob_binlog_proto_goTypes = nil
	file_proto_types_model_syncjob_binlog_proto_depIdxs = nil
}
