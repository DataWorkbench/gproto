// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/jobdeveloper.proto

package jobdevpb

import (
	model "github.com/DataWorkbench/gproto/pkg/model"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/mwitkow/go-proto-validators"
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

// This is a compile-time assertion that a sufficiently up-to-date version
// of the legacy proto package is being used.
const _ = proto.ProtoPackageIsVersion4

type JobParserRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ID          string `protobuf:"bytes,1,opt,name=ID,proto3" json:"ID,omitempty"`
	WorkspaceID string `protobuf:"bytes,2,opt,name=WorkspaceID,proto3" json:"WorkspaceID,omitempty"`
	EngineID    string `protobuf:"bytes,3,opt,name=EngineID,proto3" json:"EngineID,omitempty"` //if EngineID equal "", engine is serverless.
	EngineType  string `protobuf:"bytes,4,opt,name=EngineType,proto3" json:"EngineType,omitempty"`
	JobInfo     string `protobuf:"bytes,5,opt,name=JobInfo,proto3" json:"JobInfo,omitempty"`
}

func (x *JobParserRequest) Reset() {
	*x = JobParserRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_jobdeveloper_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobParserRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobParserRequest) ProtoMessage() {}

func (x *JobParserRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_jobdeveloper_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobParserRequest.ProtoReflect.Descriptor instead.
func (*JobParserRequest) Descriptor() ([]byte, []int) {
	return file_proto_jobdeveloper_proto_rawDescGZIP(), []int{0}
}

func (x *JobParserRequest) GetID() string {
	if x != nil {
		return x.ID
	}
	return ""
}

func (x *JobParserRequest) GetWorkspaceID() string {
	if x != nil {
		return x.WorkspaceID
	}
	return ""
}

func (x *JobParserRequest) GetEngineID() string {
	if x != nil {
		return x.EngineID
	}
	return ""
}

func (x *JobParserRequest) GetEngineType() string {
	if x != nil {
		return x.EngineType
	}
	return ""
}

func (x *JobParserRequest) GetJobInfo() string {
	if x != nil {
		return x.JobInfo
	}
	return ""
}

type JobFreeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	EngineType   string `protobuf:"bytes,1,opt,name=EngineType,proto3" json:"EngineType,omitempty"`
	JobResources string `protobuf:"bytes,2,opt,name=JobResources,proto3" json:"JobResources,omitempty"`
}

func (x *JobFreeRequest) Reset() {
	*x = JobFreeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_jobdeveloper_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobFreeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobFreeRequest) ProtoMessage() {}

func (x *JobFreeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_jobdeveloper_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobFreeRequest.ProtoReflect.Descriptor instead.
func (*JobFreeRequest) Descriptor() ([]byte, []int) {
	return file_proto_jobdeveloper_proto_rawDescGZIP(), []int{1}
}

func (x *JobFreeRequest) GetEngineType() string {
	if x != nil {
		return x.EngineType
	}
	return ""
}

func (x *JobFreeRequest) GetJobResources() string {
	if x != nil {
		return x.JobResources
	}
	return ""
}

type JobFreeAction struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	JobResources string `protobuf:"bytes,1,opt,name=JobResources,proto3" json:"JobResources,omitempty"`
}

func (x *JobFreeAction) Reset() {
	*x = JobFreeAction{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_jobdeveloper_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobFreeAction) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobFreeAction) ProtoMessage() {}

func (x *JobFreeAction) ProtoReflect() protoreflect.Message {
	mi := &file_proto_jobdeveloper_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobFreeAction.ProtoReflect.Descriptor instead.
func (*JobFreeAction) Descriptor() ([]byte, []int) {
	return file_proto_jobdeveloper_proto_rawDescGZIP(), []int{2}
}

func (x *JobFreeAction) GetJobResources() string {
	if x != nil {
		return x.JobResources
	}
	return ""
}

type Relations struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Relations string `protobuf:"bytes,1,opt,name=Relations,proto3" json:"Relations,omitempty"`
}

func (x *Relations) Reset() {
	*x = Relations{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_jobdeveloper_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Relations) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Relations) ProtoMessage() {}

func (x *Relations) ProtoReflect() protoreflect.Message {
	mi := &file_proto_jobdeveloper_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Relations.ProtoReflect.Descriptor instead.
func (*Relations) Descriptor() ([]byte, []int) {
	return file_proto_jobdeveloper_proto_rawDescGZIP(), []int{3}
}

func (x *Relations) GetRelations() string {
	if x != nil {
		return x.Relations
	}
	return ""
}

type JobElement struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	JobElement string `protobuf:"bytes,1,opt,name=JobElement,proto3" json:"JobElement,omitempty"`
}

func (x *JobElement) Reset() {
	*x = JobElement{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_jobdeveloper_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *JobElement) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*JobElement) ProtoMessage() {}

func (x *JobElement) ProtoReflect() protoreflect.Message {
	mi := &file_proto_jobdeveloper_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use JobElement.ProtoReflect.Descriptor instead.
func (*JobElement) Descriptor() ([]byte, []int) {
	return file_proto_jobdeveloper_proto_rawDescGZIP(), []int{4}
}

func (x *JobElement) GetJobElement() string {
	if x != nil {
		return x.JobElement
	}
	return ""
}

var File_proto_jobdeveloper_proto protoreflect.FileDescriptor

var file_proto_jobdeveloper_proto_rawDesc = []byte{
	0x0a, 0x18, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x6a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x65, 0x6c,
	0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x6a, 0x6f, 0x62, 0x64,
	0x65, 0x76, 0x70, 0x62, 0x1a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x6d, 0x77, 0x69, 0x74, 0x6b, 0x6f, 0x77, 0x2f, 0x67, 0x6f, 0x2d, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2d, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x73, 0x2f, 0x76, 0x61, 0x6c,
	0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0b, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xc5, 0x01, 0x0a, 0x10, 0x4a, 0x6f,
	0x62, 0x50, 0x61, 0x72, 0x73, 0x65, 0x72, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x17,
	0x0a, 0x02, 0x49, 0x44, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x07, 0xe2, 0xdf, 0x1f, 0x03,
	0x80, 0x01, 0x14, 0x52, 0x02, 0x49, 0x44, 0x12, 0x29, 0x0a, 0x0b, 0x57, 0x6f, 0x72, 0x6b, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x49, 0x44, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x07, 0xe2, 0xdf,
	0x1f, 0x03, 0x80, 0x01, 0x14, 0x52, 0x0b, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65,
	0x49, 0x44, 0x12, 0x23, 0x0a, 0x08, 0x45, 0x6e, 0x67, 0x69, 0x6e, 0x65, 0x49, 0x44, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x07, 0xe2, 0xdf, 0x1f, 0x03, 0x80, 0x01, 0x14, 0x52, 0x08, 0x45,
	0x6e, 0x67, 0x69, 0x6e, 0x65, 0x49, 0x44, 0x12, 0x26, 0x0a, 0x0a, 0x45, 0x6e, 0x67, 0x69, 0x6e,
	0x65, 0x54, 0x79, 0x70, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x06, 0xe2, 0xdf, 0x1f,
	0x02, 0x70, 0x01, 0x52, 0x0a, 0x45, 0x6e, 0x67, 0x69, 0x6e, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12,
	0x20, 0x0a, 0x07, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x66, 0x6f, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x06, 0xe2, 0xdf, 0x1f, 0x02, 0x70, 0x01, 0x52, 0x07, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x66,
	0x6f, 0x22, 0x5c, 0x0a, 0x0e, 0x4a, 0x6f, 0x62, 0x46, 0x72, 0x65, 0x65, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x12, 0x26, 0x0a, 0x0a, 0x45, 0x6e, 0x67, 0x69, 0x6e, 0x65, 0x54, 0x79, 0x70,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x06, 0xe2, 0xdf, 0x1f, 0x02, 0x70, 0x01, 0x52,
	0x0a, 0x45, 0x6e, 0x67, 0x69, 0x6e, 0x65, 0x54, 0x79, 0x70, 0x65, 0x12, 0x22, 0x0a, 0x0c, 0x4a,
	0x6f, 0x62, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0c, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73, 0x22,
	0x33, 0x0a, 0x0d, 0x4a, 0x6f, 0x62, 0x46, 0x72, 0x65, 0x65, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e,
	0x12, 0x22, 0x0a, 0x0c, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x73,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x73, 0x22, 0x31, 0x0a, 0x09, 0x52, 0x65, 0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x73, 0x12, 0x24, 0x0a, 0x09, 0x52, 0x65, 0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x06, 0xe2, 0xdf, 0x1f, 0x02, 0x70, 0x01, 0x52, 0x09, 0x52, 0x65,
	0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0x34, 0x0a, 0x0a, 0x4a, 0x6f, 0x62, 0x45, 0x6c,
	0x65, 0x6d, 0x65, 0x6e, 0x74, 0x12, 0x26, 0x0a, 0x0a, 0x4a, 0x6f, 0x62, 0x45, 0x6c, 0x65, 0x6d,
	0x65, 0x6e, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x06, 0xe2, 0xdf, 0x1f, 0x02, 0x70,
	0x01, 0x52, 0x0a, 0x4a, 0x6f, 0x62, 0x45, 0x6c, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x32, 0xcb, 0x01,
	0x0a, 0x0c, 0x4a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x12, 0x3f,
	0x0a, 0x09, 0x4a, 0x6f, 0x62, 0x50, 0x61, 0x72, 0x73, 0x65, 0x72, 0x12, 0x1a, 0x2e, 0x6a, 0x6f,
	0x62, 0x64, 0x65, 0x76, 0x70, 0x62, 0x2e, 0x4a, 0x6f, 0x62, 0x50, 0x61, 0x72, 0x73, 0x65, 0x72,
	0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x14, 0x2e, 0x6a, 0x6f, 0x62, 0x64, 0x65, 0x76,
	0x70, 0x62, 0x2e, 0x4a, 0x6f, 0x62, 0x45, 0x6c, 0x65, 0x6d, 0x65, 0x6e, 0x74, 0x22, 0x00, 0x12,
	0x3e, 0x0a, 0x07, 0x4a, 0x6f, 0x62, 0x46, 0x72, 0x65, 0x65, 0x12, 0x18, 0x2e, 0x6a, 0x6f, 0x62,
	0x64, 0x65, 0x76, 0x70, 0x62, 0x2e, 0x4a, 0x6f, 0x62, 0x46, 0x72, 0x65, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x17, 0x2e, 0x6a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x70, 0x62, 0x2e,
	0x4a, 0x6f, 0x62, 0x46, 0x72, 0x65, 0x65, 0x41, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x22, 0x00, 0x12,
	0x3a, 0x0a, 0x0d, 0x4e, 0x6f, 0x64, 0x65, 0x52, 0x65, 0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x12, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74,
	0x72, 0x75, 0x63, 0x74, 0x1a, 0x13, 0x2e, 0x6a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x70, 0x62, 0x2e,
	0x52, 0x65, 0x6c, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x22, 0x00, 0x42, 0x2e, 0x5a, 0x2c, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70,
	0x6b, 0x67, 0x2f, 0x6a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_proto_jobdeveloper_proto_rawDescOnce sync.Once
	file_proto_jobdeveloper_proto_rawDescData = file_proto_jobdeveloper_proto_rawDesc
)

func file_proto_jobdeveloper_proto_rawDescGZIP() []byte {
	file_proto_jobdeveloper_proto_rawDescOnce.Do(func() {
		file_proto_jobdeveloper_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_jobdeveloper_proto_rawDescData)
	})
	return file_proto_jobdeveloper_proto_rawDescData
}

var file_proto_jobdeveloper_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_proto_jobdeveloper_proto_goTypes = []interface{}{
	(*JobParserRequest)(nil),  // 0: jobdevpb.JobParserRequest
	(*JobFreeRequest)(nil),    // 1: jobdevpb.JobFreeRequest
	(*JobFreeAction)(nil),     // 2: jobdevpb.JobFreeAction
	(*Relations)(nil),         // 3: jobdevpb.Relations
	(*JobElement)(nil),        // 4: jobdevpb.JobElement
	(*model.EmptyStruct)(nil), // 5: model.EmptyStruct
}
var file_proto_jobdeveloper_proto_depIdxs = []int32{
	0, // 0: jobdevpb.Jobdeveloper.JobParser:input_type -> jobdevpb.JobParserRequest
	1, // 1: jobdevpb.Jobdeveloper.JobFree:input_type -> jobdevpb.JobFreeRequest
	5, // 2: jobdevpb.Jobdeveloper.NodeRelations:input_type -> model.EmptyStruct
	4, // 3: jobdevpb.Jobdeveloper.JobParser:output_type -> jobdevpb.JobElement
	2, // 4: jobdevpb.Jobdeveloper.JobFree:output_type -> jobdevpb.JobFreeAction
	3, // 5: jobdevpb.Jobdeveloper.NodeRelations:output_type -> jobdevpb.Relations
	3, // [3:6] is the sub-list for method output_type
	0, // [0:3] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_jobdeveloper_proto_init() }
func file_proto_jobdeveloper_proto_init() {
	if File_proto_jobdeveloper_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_jobdeveloper_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobParserRequest); i {
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
		file_proto_jobdeveloper_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobFreeRequest); i {
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
		file_proto_jobdeveloper_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobFreeAction); i {
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
		file_proto_jobdeveloper_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Relations); i {
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
		file_proto_jobdeveloper_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*JobElement); i {
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
			RawDescriptor: file_proto_jobdeveloper_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_jobdeveloper_proto_goTypes,
		DependencyIndexes: file_proto_jobdeveloper_proto_depIdxs,
		MessageInfos:      file_proto_jobdeveloper_proto_msgTypes,
	}.Build()
	File_proto_jobdeveloper_proto = out.File
	file_proto_jobdeveloper_proto_rawDesc = nil
	file_proto_jobdeveloper_proto_goTypes = nil
	file_proto_jobdeveloper_proto_depIdxs = nil
}
