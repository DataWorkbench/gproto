// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/flink_developer.proto

package pbresponse

import (
	_ "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbflink"
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

type SubmitFlinkJob_Code int32

const (
	SubmitFlinkJob_CodeUnset SubmitFlinkJob_Code = 0
	SubmitFlinkJob_Success   SubmitFlinkJob_Code = 1 // next to get flink job status.
	SubmitFlinkJob_Failed    SubmitFlinkJob_Code = 2
)

// Enum value maps for SubmitFlinkJob_Code.
var (
	SubmitFlinkJob_Code_name = map[int32]string{
		0: "CodeUnset",
		1: "Success",
		2: "Failed",
	}
	SubmitFlinkJob_Code_value = map[string]int32{
		"CodeUnset": 0,
		"Success":   1,
		"Failed":    2,
	}
)

func (x SubmitFlinkJob_Code) Enum() *SubmitFlinkJob_Code {
	p := new(SubmitFlinkJob_Code)
	*p = x
	return p
}

func (x SubmitFlinkJob_Code) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (SubmitFlinkJob_Code) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_response_flink_developer_proto_enumTypes[0].Descriptor()
}

func (SubmitFlinkJob_Code) Type() protoreflect.EnumType {
	return &file_proto_types_response_flink_developer_proto_enumTypes[0]
}

func (x SubmitFlinkJob_Code) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use SubmitFlinkJob_Code.Descriptor instead.
func (SubmitFlinkJob_Code) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_response_flink_developer_proto_rawDescGZIP(), []int{0, 0}
}

type ValidateFlinkJob_Result int32

const (
	ValidateFlinkJob_ResultUnset ValidateFlinkJob_Result = 0
	ValidateFlinkJob_Correct     ValidateFlinkJob_Result = 1
	ValidateFlinkJob_Incorrect   ValidateFlinkJob_Result = 2
)

// Enum value maps for ValidateFlinkJob_Result.
var (
	ValidateFlinkJob_Result_name = map[int32]string{
		0: "ResultUnset",
		1: "Correct",
		2: "Incorrect",
	}
	ValidateFlinkJob_Result_value = map[string]int32{
		"ResultUnset": 0,
		"Correct":     1,
		"Incorrect":   2,
	}
)

func (x ValidateFlinkJob_Result) Enum() *ValidateFlinkJob_Result {
	p := new(ValidateFlinkJob_Result)
	*p = x
	return p
}

func (x ValidateFlinkJob_Result) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (ValidateFlinkJob_Result) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_response_flink_developer_proto_enumTypes[1].Descriptor()
}

func (ValidateFlinkJob_Result) Type() protoreflect.EnumType {
	return &file_proto_types_response_flink_developer_proto_enumTypes[1]
}

func (x ValidateFlinkJob_Result) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use ValidateFlinkJob_Result.Descriptor instead.
func (ValidateFlinkJob_Result) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_response_flink_developer_proto_rawDescGZIP(), []int{2, 0}
}

type SubmitFlinkJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Code SubmitFlinkJob_Code `protobuf:"varint,1,opt,name=code,proto3,enum=response.SubmitFlinkJob_Code" json:"code"`
	// message
	Message string `protobuf:"bytes,2,opt,name=message,proto3" json:"message"`
}

func (x *SubmitFlinkJob) Reset() {
	*x = SubmitFlinkJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_flink_developer_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitFlinkJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitFlinkJob) ProtoMessage() {}

func (x *SubmitFlinkJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_flink_developer_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubmitFlinkJob.ProtoReflect.Descriptor instead.
func (*SubmitFlinkJob) Descriptor() ([]byte, []int) {
	return file_proto_types_response_flink_developer_proto_rawDescGZIP(), []int{0}
}

func (x *SubmitFlinkJob) GetCode() SubmitFlinkJob_Code {
	if x != nil {
		return x.Code
	}
	return SubmitFlinkJob_CodeUnset
}

func (x *SubmitFlinkJob) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

type SubmitFlinkJobInteractive struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Message string `protobuf:"bytes,1,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *SubmitFlinkJobInteractive) Reset() {
	*x = SubmitFlinkJobInteractive{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_flink_developer_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitFlinkJobInteractive) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitFlinkJobInteractive) ProtoMessage() {}

func (x *SubmitFlinkJobInteractive) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_flink_developer_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubmitFlinkJobInteractive.ProtoReflect.Descriptor instead.
func (*SubmitFlinkJobInteractive) Descriptor() ([]byte, []int) {
	return file_proto_types_response_flink_developer_proto_rawDescGZIP(), []int{1}
}

func (x *SubmitFlinkJobInteractive) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

// GetStreamJobCode used as reply parameters in RPC.
type ValidateFlinkJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Result for check syntax of code. 1 => "Correct" 2 => "Incorrect".
	Result ValidateFlinkJob_Result `protobuf:"varint,1,opt,name=result,proto3,enum=response.ValidateFlinkJob_Result" json:"result,omitempty"`
	// Message represents the error message when found syntax Incorrect.
	Message string `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *ValidateFlinkJob) Reset() {
	*x = ValidateFlinkJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_flink_developer_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateFlinkJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateFlinkJob) ProtoMessage() {}

func (x *ValidateFlinkJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_flink_developer_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ValidateFlinkJob.ProtoReflect.Descriptor instead.
func (*ValidateFlinkJob) Descriptor() ([]byte, []int) {
	return file_proto_types_response_flink_developer_proto_rawDescGZIP(), []int{2}
}

func (x *ValidateFlinkJob) GetResult() ValidateFlinkJob_Result {
	if x != nil {
		return x.Result
	}
	return ValidateFlinkJob_ResultUnset
}

func (x *ValidateFlinkJob) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

var File_proto_types_response_flink_developer_proto protoreflect.FileDescriptor

var file_proto_types_response_flink_developer_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x64, 0x65, 0x76,
	0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70,
	0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69,
	0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x27, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x66,
	0x6c, 0x69, 0x6e, 0x6b, 0x2f, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x6a, 0x6f, 0x62, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0x93, 0x01, 0x0a, 0x0e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46,
	0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x31, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1d, 0x2e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x2e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x2e,
	0x43, 0x6f, 0x64, 0x65, 0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x12, 0x1e, 0x0a, 0x07, 0x6d, 0x65,
	0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x04, 0xe2, 0xdf, 0x1f,
	0x00, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x22, 0x2e, 0x0a, 0x04, 0x43, 0x6f,
	0x64, 0x65, 0x12, 0x0d, 0x0a, 0x09, 0x43, 0x6f, 0x64, 0x65, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10,
	0x00, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x10, 0x01, 0x12, 0x0a,
	0x0a, 0x06, 0x46, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x22, 0x3b, 0x0a, 0x19, 0x53, 0x75,
	0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x74, 0x65,
	0x72, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x12, 0x1e, 0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x07,
	0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x22, 0x9e, 0x01, 0x0a, 0x10, 0x56, 0x61, 0x6c, 0x69,
	0x64, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x39, 0x0a, 0x06,
	0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x21, 0x2e, 0x72,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2e, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x52,
	0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x18, 0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67,
	0x65, 0x22, 0x35, 0x0a, 0x06, 0x52, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x0f, 0x0a, 0x0b, 0x52,
	0x65, 0x73, 0x75, 0x6c, 0x74, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07,
	0x43, 0x6f, 0x72, 0x72, 0x65, 0x63, 0x74, 0x10, 0x01, 0x12, 0x0d, 0x0a, 0x09, 0x49, 0x6e, 0x63,
	0x6f, 0x72, 0x72, 0x65, 0x63, 0x74, 0x10, 0x02, 0x42, 0x79, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e,
	0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x42, 0x18, 0x50, 0x42, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x44, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x50, 0x00, 0x5a, 0x34, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78,
	0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_response_flink_developer_proto_rawDescOnce sync.Once
	file_proto_types_response_flink_developer_proto_rawDescData = file_proto_types_response_flink_developer_proto_rawDesc
)

func file_proto_types_response_flink_developer_proto_rawDescGZIP() []byte {
	file_proto_types_response_flink_developer_proto_rawDescOnce.Do(func() {
		file_proto_types_response_flink_developer_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_flink_developer_proto_rawDescData)
	})
	return file_proto_types_response_flink_developer_proto_rawDescData
}

var file_proto_types_response_flink_developer_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_proto_types_response_flink_developer_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_proto_types_response_flink_developer_proto_goTypes = []interface{}{
	(SubmitFlinkJob_Code)(0),          // 0: response.SubmitFlinkJob.Code
	(ValidateFlinkJob_Result)(0),      // 1: response.ValidateFlinkJob.Result
	(*SubmitFlinkJob)(nil),            // 2: response.SubmitFlinkJob
	(*SubmitFlinkJobInteractive)(nil), // 3: response.SubmitFlinkJobInteractive
	(*ValidateFlinkJob)(nil),          // 4: response.ValidateFlinkJob
}
var file_proto_types_response_flink_developer_proto_depIdxs = []int32{
	0, // 0: response.SubmitFlinkJob.code:type_name -> response.SubmitFlinkJob.Code
	1, // 1: response.ValidateFlinkJob.result:type_name -> response.ValidateFlinkJob.Result
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_proto_types_response_flink_developer_proto_init() }
func file_proto_types_response_flink_developer_proto_init() {
	if File_proto_types_response_flink_developer_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_flink_developer_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubmitFlinkJob); i {
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
		file_proto_types_response_flink_developer_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubmitFlinkJobInteractive); i {
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
		file_proto_types_response_flink_developer_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ValidateFlinkJob); i {
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
			RawDescriptor: file_proto_types_response_flink_developer_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_flink_developer_proto_goTypes,
		DependencyIndexes: file_proto_types_response_flink_developer_proto_depIdxs,
		EnumInfos:         file_proto_types_response_flink_developer_proto_enumTypes,
		MessageInfos:      file_proto_types_response_flink_developer_proto_msgTypes,
	}.Build()
	File_proto_types_response_flink_developer_proto = out.File
	file_proto_types_response_flink_developer_proto_rawDesc = nil
	file_proto_types_response_flink_developer_proto_goTypes = nil
	file_proto_types_response_flink_developer_proto_depIdxs = nil
}
