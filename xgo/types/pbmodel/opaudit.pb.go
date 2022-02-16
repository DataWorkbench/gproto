// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/opaudit.proto

package pbmodel

import (
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

// Type declares the API operation type.
type Operation_Type int32

const (
	Operation_TypeUnset Operation_Type = 0 // Is useless.
	Operation_Write     Operation_Type = 1 // Include Operation: create/update/delete.
	Operation_Read      Operation_Type = 2 // Include Operation: read.
)

// Enum value maps for Operation_Type.
var (
	Operation_Type_name = map[int32]string{
		0: "TypeUnset",
		1: "Write",
		2: "Read",
	}
	Operation_Type_value = map[string]int32{
		"TypeUnset": 0,
		"Write":     1,
		"Read":      2,
	}
)

func (x Operation_Type) Enum() *Operation_Type {
	p := new(Operation_Type)
	*p = x
	return p
}

func (x Operation_Type) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Operation_Type) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_opaudit_proto_enumTypes[0].Descriptor()
}

func (Operation_Type) Type() protoreflect.EnumType {
	return &file_proto_types_model_opaudit_proto_enumTypes[0]
}

func (x Operation_Type) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Operation_Type.Descriptor instead.
func (Operation_Type) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_opaudit_proto_rawDescGZIP(), []int{0, 0}
}

// State declares the API operation result.
type Operation_State int32

const (
	Operation_StateUnset Operation_State = 0
	Operation_Success    Operation_State = 1
	Operation_Failed     Operation_State = 2
)

// Enum value maps for Operation_State.
var (
	Operation_State_name = map[int32]string{
		0: "StateUnset",
		1: "Success",
		2: "Failed",
	}
	Operation_State_value = map[string]int32{
		"StateUnset": 0,
		"Success":    1,
		"Failed":     2,
	}
)

func (x Operation_State) Enum() *Operation_State {
	p := new(Operation_State)
	*p = x
	return p
}

func (x Operation_State) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Operation_State) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_opaudit_proto_enumTypes[1].Descriptor()
}

func (Operation_State) Type() protoreflect.EnumType {
	return &file_proto_types_model_opaudit_proto_enumTypes[1]
}

func (x Operation_State) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Operation_State.Descriptor instead.
func (Operation_State) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_opaudit_proto_rawDescGZIP(), []int{0, 1}
}

// The workspace operation audit log record.
type Operation struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The user id of who execute this operation.
	UserId  string `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id" gorm:"column:user_id;primaryKey;"`
	SpaceId string `protobuf:"bytes,2,opt,name=space_id,json=spaceId,proto3" json:"space_id" gorm:"column:space_id;primaryKey;"` //  string space_id = 2 [ (validator.field).tags.string = { byte_len_eq: 20, prefix: "wks-"} ];
	//	-- The operation of user behavior.
	OpName string `protobuf:"bytes,3,opt,name=op_name,json=opName,proto3" json:"op_name" gorm:"column:op_name;"`
	// -- The type of operation, 2 => "Write",  3 => "Read".
	OpType Operation_Type `protobuf:"varint,4,opt,name=op_type,json=opType,proto3,enum=model.Operation_Type" json:"op_type" gorm:"column:op_type;"`
	// -- The result of operation, 1 => "Success", 2 => "Failed".
	State Operation_State `protobuf:"varint,5,opt,name=state,proto3,enum=model.Operation_State" json:"state" gorm:"column:state;"`
	// Timestamp of time of when accessed.
	Created int64 `protobuf:"varint,6,opt,name=created,proto3" json:"created" gorm:"column:created;autoCreateTime;"`
}

func (x *Operation) Reset() {
	*x = Operation{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_opaudit_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Operation) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Operation) ProtoMessage() {}

func (x *Operation) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_opaudit_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Operation.ProtoReflect.Descriptor instead.
func (*Operation) Descriptor() ([]byte, []int) {
	return file_proto_types_model_opaudit_proto_rawDescGZIP(), []int{0}
}

func (x *Operation) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *Operation) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *Operation) GetOpName() string {
	if x != nil {
		return x.OpName
	}
	return ""
}

func (x *Operation) GetOpType() Operation_Type {
	if x != nil {
		return x.OpType
	}
	return Operation_TypeUnset
}

func (x *Operation) GetState() Operation_State {
	if x != nil {
		return x.State
	}
	return Operation_StateUnset
}

func (x *Operation) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

var File_proto_types_model_opaudit_proto protoreflect.FileDescriptor

var file_proto_types_model_opaudit_proto_rawDesc = []byte{
	0x0a, 0x1f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x6f, 0x70, 0x61, 0x75, 0x64, 0x69, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63,
	0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xf6, 0x02,
	0x0a, 0x09, 0x4f, 0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x27, 0x0a, 0x07, 0x75,
	0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0e, 0xe2, 0xdf,
	0x1f, 0x0a, 0x12, 0x08, 0xc2, 0x01, 0x05, 0x22, 0x00, 0x98, 0x02, 0x40, 0x52, 0x06, 0x75, 0x73,
	0x65, 0x72, 0x49, 0x64, 0x12, 0x19, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12,
	0x24, 0x0a, 0x07, 0x6f, 0x70, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x06, 0x6f,
	0x70, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x3d, 0x0a, 0x07, 0x6f, 0x70, 0x5f, 0x74, 0x79, 0x70, 0x65,
	0x18, 0x04, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x4f,
	0x70, 0x65, 0x72, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x54, 0x79, 0x70, 0x65, 0x42, 0x0d, 0xe2,
	0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x06, 0x6f, 0x70,
	0x54, 0x79, 0x70, 0x65, 0x12, 0x3b, 0x0a, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x16, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x4f, 0x70, 0x65, 0x72,
	0x61, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x42, 0x0d, 0xe2, 0xdf, 0x1f,
	0x09, 0x12, 0x07, 0xda, 0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x05, 0x73, 0x74, 0x61, 0x74,
	0x65, 0x12, 0x25, 0x0a, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x06, 0x20, 0x01,
	0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52,
	0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x22, 0x2a, 0x0a, 0x04, 0x54, 0x79, 0x70, 0x65,
	0x12, 0x0d, 0x0a, 0x09, 0x54, 0x79, 0x70, 0x65, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12,
	0x09, 0x0a, 0x05, 0x57, 0x72, 0x69, 0x74, 0x65, 0x10, 0x01, 0x12, 0x08, 0x0a, 0x04, 0x52, 0x65,
	0x61, 0x64, 0x10, 0x02, 0x22, 0x30, 0x0a, 0x05, 0x53, 0x74, 0x61, 0x74, 0x65, 0x12, 0x0e, 0x0a,
	0x0a, 0x53, 0x74, 0x61, 0x74, 0x65, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x0b, 0x0a,
	0x07, 0x53, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x10, 0x01, 0x12, 0x0a, 0x0a, 0x06, 0x46, 0x61,
	0x69, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x42, 0x69, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61,
	0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x42, 0x0e, 0x50, 0x42,
	0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x4f, 0x70, 0x41, 0x75, 0x64, 0x69, 0x74, 0x50, 0x00, 0x5a, 0x31,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57,
	0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_opaudit_proto_rawDescOnce sync.Once
	file_proto_types_model_opaudit_proto_rawDescData = file_proto_types_model_opaudit_proto_rawDesc
)

func file_proto_types_model_opaudit_proto_rawDescGZIP() []byte {
	file_proto_types_model_opaudit_proto_rawDescOnce.Do(func() {
		file_proto_types_model_opaudit_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_opaudit_proto_rawDescData)
	})
	return file_proto_types_model_opaudit_proto_rawDescData
}

var file_proto_types_model_opaudit_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_proto_types_model_opaudit_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_types_model_opaudit_proto_goTypes = []interface{}{
	(Operation_Type)(0),  // 0: model.Operation.Type
	(Operation_State)(0), // 1: model.Operation.State
	(*Operation)(nil),    // 2: model.Operation
}
var file_proto_types_model_opaudit_proto_depIdxs = []int32{
	0, // 0: model.Operation.op_type:type_name -> model.Operation.Type
	1, // 1: model.Operation.state:type_name -> model.Operation.State
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_proto_types_model_opaudit_proto_init() }
func file_proto_types_model_opaudit_proto_init() {
	if File_proto_types_model_opaudit_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_opaudit_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Operation); i {
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
			RawDescriptor: file_proto_types_model_opaudit_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_opaudit_proto_goTypes,
		DependencyIndexes: file_proto_types_model_opaudit_proto_depIdxs,
		EnumInfos:         file_proto_types_model_opaudit_proto_enumTypes,
		MessageInfos:      file_proto_types_model_opaudit_proto_msgTypes,
	}.Build()
	File_proto_types_model_opaudit_proto = out.File
	file_proto_types_model_opaudit_proto_rawDesc = nil
	file_proto_types_model_opaudit_proto_goTypes = nil
	file_proto_types_model_opaudit_proto_depIdxs = nil
}
