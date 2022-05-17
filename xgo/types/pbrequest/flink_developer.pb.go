// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/flink_developer.proto

package pbrequest

import (
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
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

type ExecuteFlinkSql struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The sql or init sql executor message
	Content string `protobuf:"bytes,1,opt,name=content,proto3" json:"content"`
}

func (x *ExecuteFlinkSql) Reset() {
	*x = ExecuteFlinkSql{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ExecuteFlinkSql) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ExecuteFlinkSql) ProtoMessage() {}

func (x *ExecuteFlinkSql) ProtoReflect() protoreflect.Message {
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

// Deprecated: Use ExecuteFlinkSql.ProtoReflect.Descriptor instead.
func (*ExecuteFlinkSql) Descriptor() ([]byte, []int) {
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{1}
}

func (x *ExecuteFlinkSql) GetContent() string {
	if x != nil {
		return x.Content
	}
	return ""
}

type GetFlinkJobStatus struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// flink job id
	FlinkId string `protobuf:"bytes,1,opt,name=flink_id,json=flinkId,proto3" json:"flink_id"`
	// The internal access address of flink cluster.
	FlinkUrl string `protobuf:"bytes,2,opt,name=flink_url,json=flinkUrl,proto3" json:"flink_url"`
	// The version of flink cluster.
	FlinkVersion string `protobuf:"bytes,3,opt,name=flink_version,json=flinkVersion,proto3" json:"flink_version"`
}

func (x *GetFlinkJobStatus) Reset() {
	*x = GetFlinkJobStatus{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetFlinkJobStatus) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetFlinkJobStatus) ProtoMessage() {}

func (x *GetFlinkJobStatus) ProtoReflect() protoreflect.Message {
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

// Deprecated: Use GetFlinkJobStatus.ProtoReflect.Descriptor instead.
func (*GetFlinkJobStatus) Descriptor() ([]byte, []int) {
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{2}
}

func (x *GetFlinkJobStatus) GetFlinkId() string {
	if x != nil {
		return x.FlinkId
	}
	return ""
}

func (x *GetFlinkJobStatus) GetFlinkUrl() string {
	if x != nil {
		return x.FlinkUrl
	}
	return ""
}

func (x *GetFlinkJobStatus) GetFlinkVersion() string {
	if x != nil {
		return x.FlinkVersion
	}
	return ""
}

type CancelFlinkJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// flink job id
	FlinkId string `protobuf:"bytes,1,opt,name=flink_id,json=flinkId,proto3" json:"flink_id"`
	// The internal access address of flink cluster.
	FlinkUrl string `protobuf:"bytes,2,opt,name=flink_url,json=flinkUrl,proto3" json:"flink_url"`
	// The version of flink cluster.
	FlinkVersion string `protobuf:"bytes,3,opt,name=flink_version,json=flinkVersion,proto3" json:"flink_version"`
}

func (x *CancelFlinkJob) Reset() {
	*x = CancelFlinkJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CancelFlinkJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CancelFlinkJob) ProtoMessage() {}

func (x *CancelFlinkJob) ProtoReflect() protoreflect.Message {
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

// Deprecated: Use CancelFlinkJob.ProtoReflect.Descriptor instead.
func (*CancelFlinkJob) Descriptor() ([]byte, []int) {
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{3}
}

func (x *CancelFlinkJob) GetFlinkId() string {
	if x != nil {
		return x.FlinkId
	}
	return ""
}

func (x *CancelFlinkJob) GetFlinkUrl() string {
	if x != nil {
		return x.FlinkUrl
	}
	return ""
}

func (x *CancelFlinkJob) GetFlinkVersion() string {
	if x != nil {
		return x.FlinkVersion
	}
	return ""
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
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ValidateFlinkJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ValidateFlinkJob) ProtoMessage() {}

func (x *ValidateFlinkJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_flink_developer_proto_msgTypes[4]
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
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{4}
}

func (x *ValidateFlinkJob) GetCode() *pbmodel.StreamJobCode {
	if x != nil {
		return x.Code
	}
	return nil
}

type GetFlinkJobsByUrl struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The internal access address of flink cluster.
	FlinkUrl string `protobuf:"bytes,1,opt,name=flink_url,json=flinkUrl,proto3" json:"flink_url"`
}

func (x *GetFlinkJobsByUrl) Reset() {
	*x = GetFlinkJobsByUrl{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_flink_developer_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetFlinkJobsByUrl) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetFlinkJobsByUrl) ProtoMessage() {}

func (x *GetFlinkJobsByUrl) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_flink_developer_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetFlinkJobsByUrl.ProtoReflect.Descriptor instead.
func (*GetFlinkJobsByUrl) Descriptor() ([]byte, []int) {
	return file_proto_types_request_flink_developer_proto_rawDescGZIP(), []int{5}
}

func (x *GetFlinkJobsByUrl) GetFlinkUrl() string {
	if x != nil {
		return x.FlinkUrl
	}
	return ""
}

var File_proto_types_request_flink_developer_proto protoreflect.FileDescriptor

var file_proto_types_request_flink_developer_proto_rawDesc = []byte{
	0x0a, 0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x64, 0x65, 0x76, 0x65,
	0x6c, 0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x07, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75,
	0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61,
	0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x22, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x5f, 0x6a, 0x6f, 0x62, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa2, 0x02,
	0x0a, 0x0e, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62,
	0x12, 0x27, 0x0a, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x20,
	0x52, 0x07, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x49, 0x64, 0x12, 0x28, 0x0a, 0x09, 0x66, 0x6c, 0x69,
	0x6e, 0x6b, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf,
	0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b,
	0x55, 0x72, 0x6c, 0x12, 0x30, 0x0a, 0x0d, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x76, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07,
	0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0c, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x56, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x2b, 0x0a, 0x0e, 0x73, 0x61, 0x76, 0x65, 0x70, 0x6f, 0x69,
	0x6e, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x04, 0xe2,
	0xdf, 0x1f, 0x00, 0x52, 0x0d, 0x73, 0x61, 0x76, 0x65, 0x70, 0x6f, 0x69, 0x6e, 0x74, 0x50, 0x61,
	0x74, 0x68, 0x12, 0x2e, 0x0a, 0x04, 0x61, 0x72, 0x67, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x41, 0x72, 0x67, 0x73, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x04, 0x61, 0x72,
	0x67, 0x73, 0x12, 0x2e, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x04, 0x63, 0x6f,
	0x64, 0x65, 0x22, 0x31, 0x0a, 0x0f, 0x45, 0x78, 0x65, 0x63, 0x75, 0x74, 0x65, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x53, 0x71, 0x6c, 0x12, 0x1e, 0x0a, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x07, 0x63, 0x6f,
	0x6e, 0x74, 0x65, 0x6e, 0x74, 0x22, 0x98, 0x01, 0x0a, 0x11, 0x47, 0x65, 0x74, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x27, 0x0a, 0x08, 0x66,
	0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2,
	0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x20, 0x52, 0x07, 0x66, 0x6c, 0x69,
	0x6e, 0x6b, 0x49, 0x64, 0x12, 0x28, 0x0a, 0x09, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x75, 0x72,
	0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2,
	0x01, 0x02, 0x22, 0x00, 0x52, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x55, 0x72, 0x6c, 0x12, 0x30,
	0x0a, 0x0d, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02,
	0x22, 0x00, 0x52, 0x0c, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x22, 0x95, 0x01, 0x0a, 0x0e, 0x43, 0x61, 0x6e, 0x63, 0x65, 0x6c, 0x46, 0x6c, 0x69, 0x6e, 0x6b,
	0x4a, 0x6f, 0x62, 0x12, 0x27, 0x0a, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03,
	0xf0, 0x01, 0x20, 0x52, 0x07, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x49, 0x64, 0x12, 0x28, 0x0a, 0x09,
	0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x08, 0x66, 0x6c,
	0x69, 0x6e, 0x6b, 0x55, 0x72, 0x6c, 0x12, 0x30, 0x0a, 0x0d, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f,
	0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2,
	0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0c, 0x66, 0x6c, 0x69, 0x6e,
	0x6b, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0x3c, 0x0a, 0x10, 0x56, 0x61, 0x6c, 0x69,
	0x64, 0x61, 0x74, 0x65, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x12, 0x28, 0x0a, 0x04,
	0x63, 0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x43, 0x6f, 0x64, 0x65,
	0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x22, 0x3d, 0x0a, 0x11, 0x47, 0x65, 0x74, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x4a, 0x6f, 0x62, 0x73, 0x42, 0x79, 0x55, 0x72, 0x6c, 0x12, 0x28, 0x0a, 0x09, 0x66,
	0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b,
	0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x08, 0x66, 0x6c, 0x69,
	0x6e, 0x6b, 0x55, 0x72, 0x6c, 0x42, 0x76, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74,
	0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x17, 0x50,
	0x42, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x44, 0x65, 0x76,
	0x65, 0x6c, 0x6f, 0x70, 0x65, 0x72, 0x50, 0x00, 0x5a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e,
	0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
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

var file_proto_types_request_flink_developer_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_proto_types_request_flink_developer_proto_goTypes = []interface{}{
	(*SubmitFlinkJob)(nil),        // 0: request.SubmitFlinkJob
	(*ExecuteFlinkSql)(nil),       // 1: request.ExecuteFlinkSql
	(*GetFlinkJobStatus)(nil),     // 2: request.GetFlinkJobStatus
	(*CancelFlinkJob)(nil),        // 3: request.CancelFlinkJob
	(*ValidateFlinkJob)(nil),      // 4: request.ValidateFlinkJob
	(*GetFlinkJobsByUrl)(nil),     // 5: request.GetFlinkJobsByUrl
	(*pbmodel.StreamJobArgs)(nil), // 6: model.StreamJobArgs
	(*pbmodel.StreamJobCode)(nil), // 7: model.StreamJobCode
}
var file_proto_types_request_flink_developer_proto_depIdxs = []int32{
	6, // 0: request.SubmitFlinkJob.args:type_name -> model.StreamJobArgs
	7, // 1: request.SubmitFlinkJob.code:type_name -> model.StreamJobCode
	7, // 2: request.ValidateFlinkJob.code:type_name -> model.StreamJobCode
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
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
			switch v := v.(*ExecuteFlinkSql); i {
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
			switch v := v.(*GetFlinkJobStatus); i {
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
			switch v := v.(*CancelFlinkJob); i {
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
		file_proto_types_request_flink_developer_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_types_request_flink_developer_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetFlinkJobsByUrl); i {
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
			NumMessages:   6,
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
