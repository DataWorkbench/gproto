// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/datasource/datasource_table.proto

package pbdatasource

import (
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

type TableSchema struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Columns represents the columns of table.
	Columns []*TableColumn `protobuf:"bytes,1,rep,name=columns,proto3" json:"columns"`
}

func (x *TableSchema) Reset() {
	*x = TableSchema{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_table_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TableSchema) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TableSchema) ProtoMessage() {}

func (x *TableSchema) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_table_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TableSchema.ProtoReflect.Descriptor instead.
func (*TableSchema) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_table_proto_rawDescGZIP(), []int{0}
}

func (x *TableSchema) GetColumns() []*TableColumn {
	if x != nil {
		return x.Columns
	}
	return nil
}

// TableColumn represents the schema column in structured database.
type TableColumn struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// column name
	Name string `protobuf:"bytes,1,opt,name=name,proto3" json:"name" gorm:"column:name;"`
	// column type
	Type string `protobuf:"bytes,2,opt,name=type,proto3" json:"type" gorm:"column:type;"`
	// type CHARACTER_MAXIMUM_LENGTH or NUMERIC_PRECISION
	Length string `protobuf:"bytes,3,opt,name=length,proto3" json:"length" gorm:"column:length;"`
	// primary key, one of true/false
	IsPrimaryKey string `protobuf:"bytes,4,opt,name=is_primary_key,json=isPrimaryKey,proto3" json:"is_primary_key" gorm:"column:is_primary_key;"`
}

func (x *TableColumn) Reset() {
	*x = TableColumn{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_table_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TableColumn) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TableColumn) ProtoMessage() {}

func (x *TableColumn) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_table_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TableColumn.ProtoReflect.Descriptor instead.
func (*TableColumn) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_table_proto_rawDescGZIP(), []int{1}
}

func (x *TableColumn) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *TableColumn) GetType() string {
	if x != nil {
		return x.Type
	}
	return ""
}

func (x *TableColumn) GetLength() string {
	if x != nil {
		return x.Length
	}
	return ""
}

func (x *TableColumn) GetIsPrimaryKey() string {
	if x != nil {
		return x.IsPrimaryKey
	}
	return ""
}

var File_proto_types_model_datasource_datasource_table_proto protoreflect.FileDescriptor

var file_proto_types_model_datasource_datasource_table_proto_rawDesc = []byte{
	0x0a, 0x33, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x22, 0x40, 0x0a, 0x0b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61,
	0x12, 0x31, 0x0a, 0x07, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28,
	0x0b, 0x32, 0x17, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x54,
	0x61, 0x62, 0x6c, 0x65, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x52, 0x07, 0x63, 0x6f, 0x6c, 0x75,
	0x6d, 0x6e, 0x73, 0x22, 0x73, 0x0a, 0x0b, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x43, 0x6f, 0x6c, 0x75,
	0x6d, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x6c, 0x65,
	0x6e, 0x67, 0x74, 0x68, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x6c, 0x65, 0x6e, 0x67,
	0x74, 0x68, 0x12, 0x24, 0x0a, 0x0e, 0x69, 0x73, 0x5f, 0x70, 0x72, 0x69, 0x6d, 0x61, 0x72, 0x79,
	0x5f, 0x6b, 0x65, 0x79, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x69, 0x73, 0x50, 0x72,
	0x69, 0x6d, 0x61, 0x72, 0x79, 0x4b, 0x65, 0x79, 0x42, 0x86, 0x01, 0x0a, 0x2f, 0x63, 0x6f, 0x6d,
	0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x70, 0x62, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x42, 0x11, 0x50, 0x42,
	0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x50,
	0x00, 0x5a, 0x3e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61,
	0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x70, 0x62, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_datasource_datasource_table_proto_rawDescOnce sync.Once
	file_proto_types_model_datasource_datasource_table_proto_rawDescData = file_proto_types_model_datasource_datasource_table_proto_rawDesc
)

func file_proto_types_model_datasource_datasource_table_proto_rawDescGZIP() []byte {
	file_proto_types_model_datasource_datasource_table_proto_rawDescOnce.Do(func() {
		file_proto_types_model_datasource_datasource_table_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_datasource_datasource_table_proto_rawDescData)
	})
	return file_proto_types_model_datasource_datasource_table_proto_rawDescData
}

var file_proto_types_model_datasource_datasource_table_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_proto_types_model_datasource_datasource_table_proto_goTypes = []interface{}{
	(*TableSchema)(nil), // 0: datasource.TableSchema
	(*TableColumn)(nil), // 1: datasource.TableColumn
}
var file_proto_types_model_datasource_datasource_table_proto_depIdxs = []int32{
	1, // 0: datasource.TableSchema.columns:type_name -> datasource.TableColumn
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_proto_types_model_datasource_datasource_table_proto_init() }
func file_proto_types_model_datasource_datasource_table_proto_init() {
	if File_proto_types_model_datasource_datasource_table_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_datasource_datasource_table_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TableSchema); i {
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
		file_proto_types_model_datasource_datasource_table_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TableColumn); i {
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
			RawDescriptor: file_proto_types_model_datasource_datasource_table_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_datasource_datasource_table_proto_goTypes,
		DependencyIndexes: file_proto_types_model_datasource_datasource_table_proto_depIdxs,
		MessageInfos:      file_proto_types_model_datasource_datasource_table_proto_msgTypes,
	}.Build()
	File_proto_types_model_datasource_datasource_table_proto = out.File
	file_proto_types_model_datasource_datasource_table_proto_rawDesc = nil
	file_proto_types_model_datasource_datasource_table_proto_goTypes = nil
	file_proto_types_model_datasource_datasource_table_proto_depIdxs = nil
}