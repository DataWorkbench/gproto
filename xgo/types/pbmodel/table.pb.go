// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/table.proto

package pbmodel

import (
	pbflink "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbflink"
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

type FlinkTable_Kind int32

const (
	FlinkTable_KindUnset   FlinkTable_Kind = 0
	FlinkTable_Source      FlinkTable_Kind = 1
	FlinkTable_Destination FlinkTable_Kind = 2
	FlinkTable_Dimension   FlinkTable_Kind = 3
)

// Enum value maps for FlinkTable_Kind.
var (
	FlinkTable_Kind_name = map[int32]string{
		0: "KindUnset",
		1: "Source",
		2: "Destination",
		3: "Dimension",
	}
	FlinkTable_Kind_value = map[string]int32{
		"KindUnset":   0,
		"Source":      1,
		"Destination": 2,
		"Dimension":   3,
	}
)

func (x FlinkTable_Kind) Enum() *FlinkTable_Kind {
	p := new(FlinkTable_Kind)
	*p = x
	return p
}

func (x FlinkTable_Kind) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (FlinkTable_Kind) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_table_proto_enumTypes[0].Descriptor()
}

func (FlinkTable_Kind) Type() protoreflect.EnumType {
	return &file_proto_types_model_table_proto_enumTypes[0]
}

func (x FlinkTable_Kind) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use FlinkTable_Kind.Descriptor instead.
func (FlinkTable_Kind) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_table_proto_rawDescGZIP(), []int{0, 0}
}

type FlinkTable_Status int32

const (
	FlinkTable_StatusUnset FlinkTable_Status = 0
	FlinkTable_Deleted     FlinkTable_Status = 1
	FlinkTable_Enabled     FlinkTable_Status = 2
	FlinkTable_Disabled    FlinkTable_Status = 3
)

// Enum value maps for FlinkTable_Status.
var (
	FlinkTable_Status_name = map[int32]string{
		0: "StatusUnset",
		1: "Deleted",
		2: "Enabled",
		3: "Disabled",
	}
	FlinkTable_Status_value = map[string]int32{
		"StatusUnset": 0,
		"Deleted":     1,
		"Enabled":     2,
		"Disabled":    3,
	}
)

func (x FlinkTable_Status) Enum() *FlinkTable_Status {
	p := new(FlinkTable_Status)
	*p = x
	return p
}

func (x FlinkTable_Status) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (FlinkTable_Status) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_table_proto_enumTypes[1].Descriptor()
}

func (FlinkTable_Status) Type() protoreflect.EnumType {
	return &file_proto_types_model_table_proto_enumTypes[1]
}

func (x FlinkTable_Status) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use FlinkTable_Status.Descriptor instead.
func (FlinkTable_Status) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_table_proto_rawDescGZIP(), []int{0, 1}
}

// Table Info
// TODO: Reserved structure. unused on present.
type FlinkTable struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// SpaceID, workspace ID.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" gorm:"column:space_id;"`
	// Table ID, unique within a region.
	Id string `protobuf:"bytes,2,opt,name=id,proto3" json:"id" gorm:"column:id;primaryKey;"`
	// DataSource ID
	SourceId string `protobuf:"bytes,3,opt,name=source_id,json=sourceId,proto3" json:"source_id" gorm:"column:source_id;"`
	// Source Name, unique within a space.
	Name string `protobuf:"bytes,4,opt,name=name,proto3" json:"name" gorm:"column:name;"`
	// Comment, describe this source.
	Desc string `protobuf:"bytes,5,opt,name=desc,proto3" json:"desc" gorm:"column:desc;"`
	// Define this table info.
	TableSchema *pbflink.TableSchema `protobuf:"bytes,6,opt,name=table_schema,json=tableSchema,proto3" json:"table_schema" gorm:"column:table_schema;"`
	// Table status, 1 => "enabled", 2 => "disabled", 3 => "deleted",
	Status FlinkTable_Status `protobuf:"varint,9,opt,name=status,proto3,enum=model.FlinkTable_Status" json:"status" gorm:"column:status;"`
	// TableKind, one of 1/2/3 1->source/2->destination/3->dimension
	TableKind FlinkTable_Kind `protobuf:"varint,10,opt,name=table_kind,json=tableKind,proto3,enum=model.FlinkTable_Kind" json:"table_kind" gorm:"column:table_kind;"`
	// Table owner.
	CreatedBy string `protobuf:"bytes,13,opt,name=created_by,json=createdBy,proto3" json:"created_by" gorm:"column:created_by"`
	// Timestamp of create time.
	Created int64 `protobuf:"varint,7,opt,name=created,proto3" json:"created" gorm:"column:created;autoCreateTime;"`
	// Timestamp of update time.
	Updated int64 `protobuf:"varint,8,opt,name=updated,proto3" json:"updated" gorm:"column:updated;autoUpdateTime;"`
}

func (x *FlinkTable) Reset() {
	*x = FlinkTable{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_table_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FlinkTable) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FlinkTable) ProtoMessage() {}

func (x *FlinkTable) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_table_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FlinkTable.ProtoReflect.Descriptor instead.
func (*FlinkTable) Descriptor() ([]byte, []int) {
	return file_proto_types_model_table_proto_rawDescGZIP(), []int{0}
}

func (x *FlinkTable) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *FlinkTable) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *FlinkTable) GetSourceId() string {
	if x != nil {
		return x.SourceId
	}
	return ""
}

func (x *FlinkTable) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *FlinkTable) GetDesc() string {
	if x != nil {
		return x.Desc
	}
	return ""
}

func (x *FlinkTable) GetTableSchema() *pbflink.TableSchema {
	if x != nil {
		return x.TableSchema
	}
	return nil
}

func (x *FlinkTable) GetStatus() FlinkTable_Status {
	if x != nil {
		return x.Status
	}
	return FlinkTable_StatusUnset
}

func (x *FlinkTable) GetTableKind() FlinkTable_Kind {
	if x != nil {
		return x.TableKind
	}
	return FlinkTable_KindUnset
}

func (x *FlinkTable) GetCreatedBy() string {
	if x != nil {
		return x.CreatedBy
	}
	return ""
}

func (x *FlinkTable) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

func (x *FlinkTable) GetUpdated() int64 {
	if x != nil {
		return x.Updated
	}
	return 0
}

var File_proto_types_model_table_proto protoreflect.FileDescriptor

var file_proto_types_model_table_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70,
	0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69,
	0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x29, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x66,
	0x6c, 0x69, 0x6e, 0x6b, 0x2f, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x74, 0x61, 0x62, 0x6c, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8f, 0x05, 0x0a, 0x0a, 0x46, 0x6c, 0x69, 0x6e, 0x6b,
	0x54, 0x61, 0x62, 0x6c, 0x65, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2,
	0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x1c, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x14, 0x52,
	0x02, 0x69, 0x64, 0x12, 0x29, 0x0a, 0x09, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01,
	0x03, 0xf0, 0x01, 0x14, 0x52, 0x08, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x49, 0x64, 0x12, 0x23,
	0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf,
	0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x02, 0x98, 0x02, 0x40, 0x52, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x12, 0x21, 0x0a, 0x04, 0x64, 0x65, 0x73, 0x63, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01, 0x04, 0xc8, 0x01, 0x80, 0x02,
	0x52, 0x04, 0x64, 0x65, 0x73, 0x63, 0x12, 0x35, 0x0a, 0x0c, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f,
	0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x66,
	0x6c, 0x69, 0x6e, 0x6b, 0x2e, 0x54, 0x61, 0x62, 0x6c, 0x65, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61,
	0x52, 0x0b, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x53, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x12, 0x3f, 0x0a,
	0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x18, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c, 0x65,
	0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda,
	0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x44,
	0x0a, 0x0a, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x5f, 0x6b, 0x69, 0x6e, 0x64, 0x18, 0x0a, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x16, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x46, 0x6c, 0x69, 0x6e, 0x6b,
	0x54, 0x61, 0x62, 0x6c, 0x65, 0x2e, 0x4b, 0x69, 0x6e, 0x64, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09,
	0x12, 0x07, 0xda, 0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x09, 0x74, 0x61, 0x62, 0x6c, 0x65,
	0x4b, 0x69, 0x6e, 0x64, 0x12, 0x2e, 0x0a, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x5f,
	0x62, 0x79, 0x18, 0x0d, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09,
	0xc2, 0x01, 0x06, 0x80, 0x02, 0x00, 0x88, 0x02, 0x41, 0x52, 0x09, 0x63, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x64, 0x42, 0x79, 0x12, 0x25, 0x0a, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18,
	0x07, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02,
	0x30, 0x00, 0x52, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x12, 0x25, 0x0a, 0x07, 0x75,
	0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf,
	0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x64, 0x22, 0x41, 0x0a, 0x04, 0x4b, 0x69, 0x6e, 0x64, 0x12, 0x0d, 0x0a, 0x09, 0x4b, 0x69,
	0x6e, 0x64, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x0a, 0x0a, 0x06, 0x53, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x10, 0x01, 0x12, 0x0f, 0x0a, 0x0b, 0x44, 0x65, 0x73, 0x74, 0x69, 0x6e, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x10, 0x02, 0x12, 0x0d, 0x0a, 0x09, 0x44, 0x69, 0x6d, 0x65, 0x6e, 0x73,
	0x69, 0x6f, 0x6e, 0x10, 0x03, 0x22, 0x41, 0x0a, 0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12,
	0x0f, 0x0a, 0x0b, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00,
	0x12, 0x0b, 0x0a, 0x07, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x64, 0x10, 0x01, 0x12, 0x0b, 0x0a,
	0x07, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x12, 0x0c, 0x0a, 0x08, 0x44, 0x69,
	0x73, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x10, 0x03, 0x42, 0x6c, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e,
	0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x42, 0x11,
	0x50, 0x42, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x54, 0x61, 0x62, 0x6c,
	0x65, 0x50, 0x00, 0x5a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70,
	0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_table_proto_rawDescOnce sync.Once
	file_proto_types_model_table_proto_rawDescData = file_proto_types_model_table_proto_rawDesc
)

func file_proto_types_model_table_proto_rawDescGZIP() []byte {
	file_proto_types_model_table_proto_rawDescOnce.Do(func() {
		file_proto_types_model_table_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_table_proto_rawDescData)
	})
	return file_proto_types_model_table_proto_rawDescData
}

var file_proto_types_model_table_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_proto_types_model_table_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_types_model_table_proto_goTypes = []interface{}{
	(FlinkTable_Kind)(0),        // 0: model.FlinkTable.Kind
	(FlinkTable_Status)(0),      // 1: model.FlinkTable.Status
	(*FlinkTable)(nil),          // 2: model.FlinkTable
	(*pbflink.TableSchema)(nil), // 3: flink.TableSchema
}
var file_proto_types_model_table_proto_depIdxs = []int32{
	3, // 0: model.FlinkTable.table_schema:type_name -> flink.TableSchema
	1, // 1: model.FlinkTable.status:type_name -> model.FlinkTable.Status
	0, // 2: model.FlinkTable.table_kind:type_name -> model.FlinkTable.Kind
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_proto_types_model_table_proto_init() }
func file_proto_types_model_table_proto_init() {
	if File_proto_types_model_table_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_table_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FlinkTable); i {
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
			RawDescriptor: file_proto_types_model_table_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_table_proto_goTypes,
		DependencyIndexes: file_proto_types_model_table_proto_depIdxs,
		EnumInfos:         file_proto_types_model_table_proto_enumTypes,
		MessageInfos:      file_proto_types_model_table_proto_msgTypes,
	}.Build()
	File_proto_types_model_table_proto = out.File
	file_proto_types_model_table_proto_rawDesc = nil
	file_proto_types_model_table_proto_goTypes = nil
	file_proto_types_model_table_proto_depIdxs = nil
}
