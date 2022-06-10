// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/flink_developer.proto

package pbrequest

import (
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
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

type SubmitFlinkJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// JobID
	FlinkId string `protobuf:"bytes,1,opt,name=flink_id,json=flinkId,proto3" json:"flink_id"`
	// The internal access address of flink cluster.
	FlinkUrl string `protobuf:"bytes,2,opt,name=flink_url,json=flinkUrl,proto3" json:"flink_url"`
	// The version of flink cluster.
	FlinkVersion string `protobuf:"bytes,3,opt,name=flink_version,json=flinkVersion,proto3" json:"flink_version"`
	// Savepoint Path
	SavepointPath string `protobuf:"bytes,4,opt,name=savepoint_path,json=savepointPath,proto3" json:"savepoint_path"`
	// ENV
	Args *pbmodel.StreamJobArgs `protobuf:"bytes,5,opt,name=args,proto3" json:"args"`
	// code
	Code *pbmodel.StreamJobCode `protobuf:"bytes,6,opt,name=code,proto3" json:"code"`
}

func (x *SubmitFlinkJob) Reset() {
	*x = SubmitFlinkJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitFlinkJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitFlinkJob) ProtoMessage() {}

func (x *SubmitFlinkJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_flink_developer_proto_msgTypes[0]
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
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{0}
}

func (x *SubmitFlinkJob) GetFlinkId() string {
	if x != nil {
		return x.FlinkId
	}
	return ""
}

func (x *SubmitFlinkJob) GetFlinkUrl() string {
	if x != nil {
		return x.FlinkUrl
	}
	return ""
}

func (x *SubmitFlinkJob) GetFlinkVersion() string {
	if x != nil {
		return x.FlinkVersion
	}
	return ""
}

func (x *SubmitFlinkJob) GetSavepointPath() string {
	if x != nil {
		return x.SavepointPath
	}
	return ""
}

func (x *SubmitFlinkJob) GetArgs() *pbmodel.StreamJobArgs {
	if x != nil {
		return x.Args
	}
	return nil
}

func (x *SubmitFlinkJob) GetCode() *pbmodel.StreamJobCode {
	if x != nil {
		return x.Code
	}
	return nil
}

type SubmitFlinkJobInteractive struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// SubmitFlinkJob
	Job *SubmitFlinkJob `protobuf:"bytes,1,opt,name=job,proto3" json:"submit_flink_job"`
	// max count for per batch
	MaxCount int32 `protobuf:"varint,2,opt,name=max_count,json=maxCount,proto3" json:"max_count"`
	// refresh interval for fetching data
	RefreshInterval int32 `protobuf:"varint,3,opt,name=refresh_interval,json=refreshInterval,proto3" json:"refresh_interval"`
}

func (x *SubmitFlinkJobInteractive) Reset() {
	*x = SubmitFlinkJobInteractive{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitFlinkJobInteractive) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitFlinkJobInteractive) ProtoMessage() {}

func (x *SubmitFlinkJobInteractive) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_flink_developer_proto_msgTypes[1]
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
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{1}
}

func (x *SubmitFlinkJobInteractive) GetJob() *SubmitFlinkJob {
	if x != nil {
		return x.Job
	}
	return nil
}

func (x *SubmitFlinkJobInteractive) GetMaxCount() int32 {
	if x != nil {
		return x.MaxCount
	}
	return 0
}

func (x *SubmitFlinkJobInteractive) GetRefreshInterval() int32 {
	if x != nil {
		return x.RefreshInterval
	}
	return 0
}

type ValidateFlinkJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// code
	Code *pbmodel.StreamJobCode `protobuf:"bytes,1,opt,name=code,proto3" json:"code"`
}

func (x *ValidateFlinkJob) Reset() {
	*x = ValidateFlinkJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateFlinkJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateFlinkJob) ProtoMessage() {}

func (x *ValidateFlinkJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_flink_developer_proto_msgTypes[2]
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
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{2}
}

func (x *ValidateFlinkJob) GetCode() *pbmodel.StreamJobCode {
	if x != nil {
		return x.Code
	}
	return nil
}

type ValidateFlinkJobV2 struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The internal access address of flink cluster.
	FlinkUrl string `protobuf:"bytes,1,opt,name=flink_url,json=flinkUrl,proto3" json:"flink_url"`
	// The version of flink cluster.
	FlinkVersion string `protobuf:"bytes,2,opt,name=flink_version,json=flinkVersion,proto3" json:"flink_version"`
	// args
	Args *pbmodel.StreamJobArgs `protobuf:"bytes,3,opt,name=args,proto3" json:"args"`
	// code
	Code *pbmodel.StreamJobCode `protobuf:"bytes,4,opt,name=code,proto3" json:"code"`
}

func (x *ValidateFlinkJobV2) Reset() {
	*x = ValidateFlinkJobV2{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateFlinkJobV2) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateFlinkJobV2) ProtoMessage() {}

func (x *ValidateFlinkJobV2) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_flink_developer_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ValidateFlinkJobV2.ProtoReflect.Descriptor instead.
func (*ValidateFlinkJobV2) Descriptor() ([]byte, []int) {
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{3}
}

func (x *ValidateFlinkJobV2) GetFlinkUrl() string {
	if x != nil {
		return x.FlinkUrl
	}
	return ""
}

func (x *ValidateFlinkJobV2) GetFlinkVersion() string {
	if x != nil {
		return x.FlinkVersion
	}
	return ""
}

func (x *ValidateFlinkJobV2) GetArgs() *pbmodel.StreamJobArgs {
	if x != nil {
		return x.Args
	}
	return nil
}

func (x *ValidateFlinkJobV2) GetCode() *pbmodel.StreamJobCode {
	if x != nil {
		return x.Code
	}
	return nil
}

var File_proto_types_request_flink_developer_proto protoreflect.FileDescriptor

var file_proto_types_request_flink_developer_proto_rawDesc = []byte{
	0x0a, 0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x64, 0x65, 0x76, 0x65,
	0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x07, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75,
	0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61,
	0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64,
	0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x22, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2f, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x5f, 0x6a, 0x6f, 0x62, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x21, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x64, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa2, 0x02, 0x0a, 0x0e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46,
	0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x27, 0x0a, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12,
	0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x20, 0x52, 0x07, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x49, 0x64,
	0x12, 0x28, 0x0a, 0x09, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00,
	0x52, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x55, 0x72, 0x6c, 0x12, 0x30, 0x0a, 0x0d, 0x66, 0x6c,
	0x69, 0x6e, 0x6b, 0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0c,
	0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x2b, 0x0a, 0x0e,
	0x73, 0x61, 0x76, 0x65, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x0d, 0x73, 0x61, 0x76, 0x65,
	0x70, 0x6f, 0x69, 0x6e, 0x74, 0x50, 0x61, 0x74, 0x68, 0x12, 0x2e, 0x0a, 0x04, 0x61, 0x72, 0x67,
	0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x42, 0x04, 0xe2,
	0xdf, 0x1f, 0x00, 0x52, 0x04, 0x61, 0x72, 0x67, 0x73, 0x12, 0x2e, 0x0a, 0x04, 0x63, 0x6f, 0x64,
	0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x42, 0x04, 0xe2,
	0xdf, 0x1f, 0x00, 0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x22, 0xc9, 0x01, 0x0a, 0x19, 0x53, 0x75,
	0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x74, 0x65,
	0x72, 0x61, 0x63, 0x74, 0x69, 0x76, 0x65, 0x12, 0x2f, 0x0a, 0x03, 0x6a, 0x6f, 0x62, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x2e, 0x53,
	0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x42, 0x04, 0xe2,
	0xdf, 0x1f, 0x00, 0x52, 0x03, 0x6a, 0x6f, 0x62, 0x12, 0x34, 0x0a, 0x09, 0x6d, 0x61, 0x78, 0x5f,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x17, 0xa2, 0xa1, 0x1f,
	0x06, 0xaa, 0x06, 0x03, 0x31, 0x30, 0x30, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xb2, 0x01, 0x04,
	0x30, 0x00, 0x38, 0x64, 0x52, 0x08, 0x6d, 0x61, 0x78, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x45,
	0x0a, 0x10, 0x72, 0x65, 0x66, 0x72, 0x65, 0x73, 0x68, 0x5f, 0x69, 0x6e, 0x74, 0x65, 0x72, 0x76,
	0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x42, 0x1a, 0xa2, 0xa1, 0x1f, 0x07, 0xaa, 0x06,
	0x04, 0x32, 0x30, 0x30, 0x30, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xb2, 0x01, 0x06, 0x38, 0x90,
	0x4e, 0x40, 0xe8, 0x07, 0x52, 0x0f, 0x72, 0x65, 0x66, 0x72, 0x65, 0x73, 0x68, 0x49, 0x6e, 0x74,
	0x65, 0x72, 0x76, 0x61, 0x6c, 0x22, 0x3c, 0x0a, 0x10, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74,
	0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x28, 0x0a, 0x04, 0x63, 0x6f, 0x64,
	0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x52, 0x04, 0x63,
	0x6f, 0x64, 0x65, 0x22, 0xcb, 0x01, 0x0a, 0x13, 0x56, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x65,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x5f, 0x76, 0x32, 0x12, 0x28, 0x0a, 0x09, 0x66,
	0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b,
	0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x08, 0x66, 0x6c, 0x69,
	0x6e, 0x6b, 0x55, 0x72, 0x6c, 0x12, 0x30, 0x0a, 0x0d, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x76,
	0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf,
	0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0c, 0x66, 0x6c, 0x69, 0x6e, 0x6b,
	0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x2e, 0x0a, 0x04, 0x61, 0x72, 0x67, 0x73, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x42, 0x04, 0xe2, 0xdf, 0x1f,
	0x00, 0x52, 0x04, 0x61, 0x72, 0x67, 0x73, 0x12, 0x28, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x52, 0x04, 0x63, 0x6f, 0x64,
	0x65, 0x42, 0x76, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e,
	0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e,
	0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x17, 0x50, 0x42, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x44, 0x65, 0x76, 0x65, 0x6c, 0x6f, 0x70,
	0x65, 0x72, 0x50, 0x00, 0x5a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_proto_types_request_flink_developer_proto_rawDescOnce sync.Once
	file_proto_types_request_flink_developer_proto_rawDescData = file_proto_types_request_flink_developer_proto_rawDesc
)

func file_proto_types_request_flink_developer_proto_rawDescGZIP() []byte {
	file_proto_types_request_flink_developer_proto_rawDescOnce.Do(func() {
		file_proto_types_request_flink_developer_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_request_flink_developer_proto_rawDescData)
	})
	return file_proto_types_request_flink_developer_proto_rawDescData
}

var file_proto_types_request_flink_developer_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_proto_types_request_flink_developer_proto_goTypes = []interface{}{
	(*SubmitFlinkJob)(nil),            // 0: request.SubmitFlinkJob
	(*SubmitFlinkJobInteractive)(nil), // 1: request.SubmitFlinkJobInteractive
	(*ValidateFlinkJob)(nil),          // 2: request.ValidateFlinkJob
	(*ValidateFlinkJobV2)(nil),        // 3: request.ValidateFlinkJob_v2
	(*pbmodel.StreamJobArgs)(nil),     // 4: model.StreamJobArgs
	(*pbmodel.StreamJobCode)(nil),     // 5: model.StreamJobCode
}
var file_proto_types_request_flink_developer_proto_depIdxs = []int32{
	4, // 0: request.SubmitFlinkJob.args:type_name -> model.StreamJobArgs
	5, // 1: request.SubmitFlinkJob.code:type_name -> model.StreamJobCode
	0, // 2: request.SubmitFlinkJobInteractive.job:type_name -> request.SubmitFlinkJob
	5, // 3: request.ValidateFlinkJob.code:type_name -> model.StreamJobCode
	4, // 4: request.ValidateFlinkJob_v2.args:type_name -> model.StreamJobArgs
	5, // 5: request.ValidateFlinkJob_v2.code:type_name -> model.StreamJobCode
	6, // [6:6] is the sub-list for method output_type
	6, // [6:6] is the sub-list for method input_type
	6, // [6:6] is the sub-list for extension type_name
	6, // [6:6] is the sub-list for extension extendee
	0, // [0:6] is the sub-list for field type_name
}

func init() { file_proto_types_request_flink_developer_proto_init() }
func file_proto_types_request_flink_developer_proto_init() {
	if File_proto_types_request_flink_developer_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_request_flink_developer_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_types_request_flink_developer_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_types_request_flink_developer_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_types_request_flink_developer_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ValidateFlinkJobV2); i {
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
			RawDescriptor: file_proto_types_request_flink_developer_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_request_flink_developer_proto_goTypes,
		DependencyIndexes: file_proto_types_request_flink_developer_proto_depIdxs,
		MessageInfos:      file_proto_types_request_flink_developer_proto_msgTypes,
	}.Build()
	File_proto_types_request_flink_developer_proto = out.File
	file_proto_types_request_flink_developer_proto_rawDesc = nil
	file_proto_types_request_flink_developer_proto_goTypes = nil
	file_proto_types_request_flink_developer_proto_depIdxs = nil
}
