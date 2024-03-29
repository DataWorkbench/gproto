// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/sync_developer.proto

package pbresponse

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

type SubmitSyncJobToFlink_Code int32

const (
	SubmitSyncJobToFlink_CodeUnset SubmitSyncJobToFlink_Code = 0
	SubmitSyncJobToFlink_Success   SubmitSyncJobToFlink_Code = 1 // next to get flink job status.
	SubmitSyncJobToFlink_Failed    SubmitSyncJobToFlink_Code = 2
)

// Enum value maps for SubmitSyncJobToFlink_Code.
var (
	SubmitSyncJobToFlink_Code_name = map[int32]string{
		0: "CodeUnset",
		1: "Success",
		2: "Failed",
	}
	SubmitSyncJobToFlink_Code_value = map[string]int32{
		"CodeUnset": 0,
		"Success":   1,
		"Failed":    2,
	}
)

func (x SubmitSyncJobToFlink_Code) Enum() *SubmitSyncJobToFlink_Code {
	p := new(SubmitSyncJobToFlink_Code)
	*p = x
	return p
}

func (x SubmitSyncJobToFlink_Code) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (SubmitSyncJobToFlink_Code) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_response_sync_developer_proto_enumTypes[0].Descriptor()
}

func (SubmitSyncJobToFlink_Code) Type() protoreflect.EnumType {
	return &file_proto_types_response_sync_developer_proto_enumTypes[0]
}

func (x SubmitSyncJobToFlink_Code) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use SubmitSyncJobToFlink_Code.Descriptor instead.
func (SubmitSyncJobToFlink_Code) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_response_sync_developer_proto_rawDescGZIP(), []int{0, 0}
}

// SubmitSyncJob used as a request parameters for RPC.
type SubmitSyncJobToFlink struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Code SubmitSyncJobToFlink_Code `protobuf:"varint,1,opt,name=code,proto3,enum=response.SubmitSyncJobToFlink_Code" json:"code"`
	// message
	Message string `protobuf:"bytes,2,opt,name=message,proto3" json:"message"`
}

func (x *SubmitSyncJobToFlink) Reset() {
	*x = SubmitSyncJobToFlink{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_sync_developer_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitSyncJobToFlink) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitSyncJobToFlink) ProtoMessage() {}

func (x *SubmitSyncJobToFlink) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_sync_developer_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubmitSyncJobToFlink.ProtoReflect.Descriptor instead.
func (*SubmitSyncJobToFlink) Descriptor() ([]byte, []int) {
	return file_proto_types_response_sync_developer_proto_rawDescGZIP(), []int{0}
}

func (x *SubmitSyncJobToFlink) GetCode() SubmitSyncJobToFlink_Code {
	if x != nil {
		return x.Code
	}
	return SubmitSyncJobToFlink_CodeUnset
}

func (x *SubmitSyncJobToFlink) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

var File_proto_types_response_sync_developer_proto protoreflect.FileDescriptor

var file_proto_types_response_sync_developer_proto_rawDesc = []byte{
	0x0a, 0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x64, 0x65, 0x76, 0x65,
	0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c,
	0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x9f, 0x01, 0x0a, 0x14, 0x53,
	0x75, 0x62, 0x6d, 0x69, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x54, 0x6f, 0x46, 0x6c,
	0x69, 0x6e, 0x6b, 0x12, 0x37, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0e, 0x32, 0x23, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x53, 0x75, 0x62,
	0x6d, 0x69, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x54, 0x6f, 0x46, 0x6c, 0x69, 0x6e,
	0x6b, 0x2e, 0x43, 0x6f, 0x64, 0x65, 0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x12, 0x1e, 0x0a, 0x07,
	0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x04, 0xe2,
	0xdf, 0x1f, 0x00, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x22, 0x2e, 0x0a, 0x04,
	0x43, 0x6f, 0x64, 0x65, 0x12, 0x0d, 0x0a, 0x09, 0x43, 0x6f, 0x64, 0x65, 0x55, 0x6e, 0x73, 0x65,
	0x74, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x10, 0x01,
	0x12, 0x0a, 0x0a, 0x06, 0x46, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x42, 0x78, 0x0a, 0x25,
	0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x17, 0x50, 0x42, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x53, 0x79, 0x6e, 0x63, 0x44, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x50, 0x00,
	0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74,
	0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_response_sync_developer_proto_rawDescOnce sync.Once
	file_proto_types_response_sync_developer_proto_rawDescData = file_proto_types_response_sync_developer_proto_rawDesc
)

func file_proto_types_response_sync_developer_proto_rawDescGZIP() []byte {
	file_proto_types_response_sync_developer_proto_rawDescOnce.Do(func() {
		file_proto_types_response_sync_developer_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_sync_developer_proto_rawDescData)
	})
	return file_proto_types_response_sync_developer_proto_rawDescData
}

var file_proto_types_response_sync_developer_proto_enumTypes = make([]protoimpl.EnumInfo, 1)
var file_proto_types_response_sync_developer_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_types_response_sync_developer_proto_goTypes = []interface{}{
	(SubmitSyncJobToFlink_Code)(0), // 0: response.SubmitSyncJobToFlink.Code
	(*SubmitSyncJobToFlink)(nil),   // 1: response.SubmitSyncJobToFlink
}
var file_proto_types_response_sync_developer_proto_depIdxs = []int32{
	0, // 0: response.SubmitSyncJobToFlink.code:type_name -> response.SubmitSyncJobToFlink.Code
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_proto_types_response_sync_developer_proto_init() }
func file_proto_types_response_sync_developer_proto_init() {
	if File_proto_types_response_sync_developer_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_sync_developer_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubmitSyncJobToFlink); i {
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
			RawDescriptor: file_proto_types_response_sync_developer_proto_rawDesc,
			NumEnums:      1,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_sync_developer_proto_goTypes,
		DependencyIndexes: file_proto_types_response_sync_developer_proto_depIdxs,
		EnumInfos:         file_proto_types_response_sync_developer_proto_enumTypes,
		MessageInfos:      file_proto_types_response_sync_developer_proto_msgTypes,
	}.Build()
	File_proto_types_response_sync_developer_proto = out.File
	file_proto_types_response_sync_developer_proto_rawDesc = nil
	file_proto_types_response_sync_developer_proto_goTypes = nil
	file_proto_types_response_sync_developer_proto_depIdxs = nil
}
