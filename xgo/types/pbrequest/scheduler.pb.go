// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/scheduler.proto

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

// SubmitStreamJobs used as a request parameters for RPC.
type SubmitStreamJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Property    *pbmodel.StreamJobProperty `protobuf:"bytes,1,opt,name=property,proto3" json:"property,omitempty"`
	StopRunning bool                       `protobuf:"varint,2,opt,name=stop_running,json=stopRunning,proto3" json:"stop_running,omitempty"`
	// The internal access address of flink cluster.
	FlinkUrl string `protobuf:"bytes,3,opt,name=flink_url,json=flinkUrl,proto3" json:"flink_url,omitempty"`
	// The version of flink cluster.
	FlinkVersion string `protobuf:"bytes,4,opt,name=flink_version,json=flinkVersion,proto3" json:"flink_version,omitempty"`
}

func (x *SubmitStreamJob) Reset() {
	*x = SubmitStreamJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitStreamJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitStreamJob) ProtoMessage() {}

func (x *SubmitStreamJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubmitStreamJob.ProtoReflect.Descriptor instead.
func (*SubmitStreamJob) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{0}
}

func (x *SubmitStreamJob) GetProperty() *pbmodel.StreamJobProperty {
	if x != nil {
		return x.Property
	}
	return nil
}

func (x *SubmitStreamJob) GetStopRunning() bool {
	if x != nil {
		return x.StopRunning
	}
	return false
}

func (x *SubmitStreamJob) GetFlinkUrl() string {
	if x != nil {
		return x.FlinkUrl
	}
	return ""
}

func (x *SubmitStreamJob) GetFlinkVersion() string {
	if x != nil {
		return x.FlinkVersion
	}
	return ""
}

// SubmitStreamJobs used as a request parameters for RPC.
type StopStreamJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId     string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty"`
	JobId       string `protobuf:"bytes,2,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	StopRunning bool   `protobuf:"varint,3,opt,name=stop_running,json=stopRunning,proto3" json:"stop_running,omitempty"`
}

func (x *StopStreamJob) Reset() {
	*x = StopStreamJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StopStreamJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StopStreamJob) ProtoMessage() {}

func (x *StopStreamJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StopStreamJob.ProtoReflect.Descriptor instead.
func (*StopStreamJob) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{1}
}

func (x *StopStreamJob) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *StopStreamJob) GetJobId() string {
	if x != nil {
		return x.JobId
	}
	return ""
}

func (x *StopStreamJob) GetStopRunning() bool {
	if x != nil {
		return x.StopRunning
	}
	return false
}

type DeleteStreamJobsBySpaceIds struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The list of workspace id.
	SpaceIds []string `protobuf:"bytes,1,rep,name=space_ids,json=spaceIds,proto3" json:"space_ids,omitempty"`
}

func (x *DeleteStreamJobsBySpaceIds) Reset() {
	*x = DeleteStreamJobsBySpaceIds{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteStreamJobsBySpaceIds) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteStreamJobsBySpaceIds) ProtoMessage() {}

func (x *DeleteStreamJobsBySpaceIds) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteStreamJobsBySpaceIds.ProtoReflect.Descriptor instead.
func (*DeleteStreamJobsBySpaceIds) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{2}
}

func (x *DeleteStreamJobsBySpaceIds) GetSpaceIds() []string {
	if x != nil {
		return x.SpaceIds
	}
	return nil
}

type DeleteStreamJobsByJobIds struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty"`
	// The list of stream job id.
	JobIds []string `protobuf:"bytes,2,rep,name=job_ids,json=jobIds,proto3" json:"job_ids,omitempty"`
}

func (x *DeleteStreamJobsByJobIds) Reset() {
	*x = DeleteStreamJobsByJobIds{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteStreamJobsByJobIds) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteStreamJobsByJobIds) ProtoMessage() {}

func (x *DeleteStreamJobsByJobIds) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteStreamJobsByJobIds.ProtoReflect.Descriptor instead.
func (*DeleteStreamJobsByJobIds) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{3}
}

func (x *DeleteStreamJobsByJobIds) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *DeleteStreamJobsByJobIds) GetJobIds() []string {
	if x != nil {
		return x.JobIds
	}
	return nil
}

// SubmitSyncJobs used as a request parameters for RPC.
type SubmitSyncJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Property    *pbmodel.SyncJobProperty `protobuf:"bytes,1,opt,name=property,proto3" json:"property,omitempty"`
	StopRunning bool                     `protobuf:"varint,2,opt,name=stop_running,json=stopRunning,proto3" json:"stop_running,omitempty"`
}

func (x *SubmitSyncJob) Reset() {
	*x = SubmitSyncJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SubmitSyncJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SubmitSyncJob) ProtoMessage() {}

func (x *SubmitSyncJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SubmitSyncJob.ProtoReflect.Descriptor instead.
func (*SubmitSyncJob) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{4}
}

func (x *SubmitSyncJob) GetProperty() *pbmodel.SyncJobProperty {
	if x != nil {
		return x.Property
	}
	return nil
}

func (x *SubmitSyncJob) GetStopRunning() bool {
	if x != nil {
		return x.StopRunning
	}
	return false
}

// SubmitSyncJobs used as a request parameters for RPC.
type StopSyncJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId     string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty"`
	JobId       string `protobuf:"bytes,2,opt,name=job_id,json=jobId,proto3" json:"job_id,omitempty"`
	StopRunning bool   `protobuf:"varint,3,opt,name=stop_running,json=stopRunning,proto3" json:"stop_running,omitempty"`
}

func (x *StopSyncJob) Reset() {
	*x = StopSyncJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StopSyncJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StopSyncJob) ProtoMessage() {}

func (x *StopSyncJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StopSyncJob.ProtoReflect.Descriptor instead.
func (*StopSyncJob) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{5}
}

func (x *StopSyncJob) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *StopSyncJob) GetJobId() string {
	if x != nil {
		return x.JobId
	}
	return ""
}

func (x *StopSyncJob) GetStopRunning() bool {
	if x != nil {
		return x.StopRunning
	}
	return false
}

type DeleteSyncJobsBySpaceIds struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The list of workspace id.
	SpaceIds []string `protobuf:"bytes,1,rep,name=space_ids,json=spaceIds,proto3" json:"space_ids,omitempty"`
}

func (x *DeleteSyncJobsBySpaceIds) Reset() {
	*x = DeleteSyncJobsBySpaceIds{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteSyncJobsBySpaceIds) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteSyncJobsBySpaceIds) ProtoMessage() {}

func (x *DeleteSyncJobsBySpaceIds) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteSyncJobsBySpaceIds.ProtoReflect.Descriptor instead.
func (*DeleteSyncJobsBySpaceIds) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{6}
}

func (x *DeleteSyncJobsBySpaceIds) GetSpaceIds() []string {
	if x != nil {
		return x.SpaceIds
	}
	return nil
}

type DeleteSyncJobsByJobIds struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty"`
	// The list of sync job id.
	JobIds []string `protobuf:"bytes,2,rep,name=job_ids,json=jobIds,proto3" json:"job_ids,omitempty"`
}

func (x *DeleteSyncJobsByJobIds) Reset() {
	*x = DeleteSyncJobsByJobIds{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_scheduler_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteSyncJobsByJobIds) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteSyncJobsByJobIds) ProtoMessage() {}

func (x *DeleteSyncJobsByJobIds) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_scheduler_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteSyncJobsByJobIds.ProtoReflect.Descriptor instead.
func (*DeleteSyncJobsByJobIds) Descriptor() ([]byte, []int) {
	return file_proto_types_request_scheduler_proto_rawDescGZIP(), []int{7}
}

func (x *DeleteSyncJobsByJobIds) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *DeleteSyncJobsByJobIds) GetJobIds() []string {
	if x != nil {
		return x.JobIds
	}
	return nil
}

var File_proto_types_request_scheduler_proto protoreflect.FileDescriptor

var file_proto_types_request_scheduler_proto_rawDesc = []byte{
	0x0a, 0x23, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x73, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x07, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x33,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x22, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73,
	0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x5f, 0x6a, 0x6f,
	0x62, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x20, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f,
	0x6a, 0x6f, 0x62, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xd9, 0x01, 0x0a, 0x0f, 0x53, 0x75,
	0x62, 0x6d, 0x69, 0x74, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x41, 0x0a,
	0x08, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x18, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f,
	0x62, 0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12,
	0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x08, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79,
	0x12, 0x27, 0x0a, 0x0c, 0x73, 0x74, 0x6f, 0x70, 0x5f, 0x72, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x08, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x0b, 0x73, 0x74,
	0x6f, 0x70, 0x52, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x12, 0x28, 0x0a, 0x09, 0x66, 0x6c, 0x69,
	0x6e, 0x6b, 0x5f, 0x75, 0x72, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf,
	0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b,
	0x55, 0x72, 0x6c, 0x12, 0x30, 0x0a, 0x0d, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x76, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07,
	0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0c, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x56, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0x94, 0x01, 0x0a, 0x0d, 0x53, 0x74, 0x6f, 0x70, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12,
	0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2a, 0x0a, 0x06, 0x6a, 0x6f, 0x62, 0x5f, 0x69,
	0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2,
	0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x73, 0x74, 0x6a, 0x2d, 0x52, 0x05, 0x6a, 0x6f,
	0x62, 0x49, 0x64, 0x12, 0x27, 0x0a, 0x0c, 0x73, 0x74, 0x6f, 0x70, 0x5f, 0x72, 0x75, 0x6e, 0x6e,
	0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52,
	0x0b, 0x73, 0x74, 0x6f, 0x70, 0x52, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x22, 0x53, 0x0a, 0x1a,
	0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x73,
	0x42, 0x79, 0x53, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x73, 0x12, 0x35, 0x0a, 0x09, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x42, 0x18, 0xe2,
	0xdf, 0x1f, 0x14, 0x12, 0x12, 0xea, 0x01, 0x0f, 0x5a, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14,
	0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64,
	0x73, 0x22, 0x7d, 0x0a, 0x18, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x74, 0x72, 0x65, 0x61,
	0x6d, 0x4a, 0x6f, 0x62, 0x73, 0x42, 0x79, 0x4a, 0x6f, 0x62, 0x49, 0x64, 0x73, 0x12, 0x2e, 0x0a,
	0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04,
	0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x31, 0x0a,
	0x07, 0x6a, 0x6f, 0x62, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x42, 0x18,
	0xe2, 0xdf, 0x1f, 0x14, 0x12, 0x12, 0xea, 0x01, 0x0f, 0x5a, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01,
	0x14, 0xca, 0x02, 0x04, 0x73, 0x74, 0x6a, 0x2d, 0x52, 0x06, 0x6a, 0x6f, 0x62, 0x49, 0x64, 0x73,
	0x22, 0x79, 0x0a, 0x0d, 0x53, 0x75, 0x62, 0x6d, 0x69, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f,
	0x62, 0x12, 0x3f, 0x0a, 0x08, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x79, 0x6e, 0x63,
	0x4a, 0x6f, 0x62, 0x50, 0x72, 0x6f, 0x70, 0x65, 0x72, 0x74, 0x79, 0x42, 0x0b, 0xe2, 0xdf, 0x1f,
	0x07, 0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x08, 0x70, 0x72, 0x6f, 0x70, 0x65, 0x72,
	0x74, 0x79, 0x12, 0x27, 0x0a, 0x0c, 0x73, 0x74, 0x6f, 0x70, 0x5f, 0x72, 0x75, 0x6e, 0x6e, 0x69,
	0x6e, 0x67, 0x18, 0x02, 0x20, 0x01, 0x28, 0x08, 0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x0b,
	0x73, 0x74, 0x6f, 0x70, 0x52, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x22, 0x92, 0x01, 0x0a, 0x0b,
	0x53, 0x74, 0x6f, 0x70, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x12, 0x2e, 0x0a, 0x08, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2,
	0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b,
	0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2a, 0x0a, 0x06, 0x6a,
	0x6f, 0x62, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f,
	0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x73, 0x79, 0x6a, 0x2d,
	0x52, 0x05, 0x6a, 0x6f, 0x62, 0x49, 0x64, 0x12, 0x27, 0x0a, 0x0c, 0x73, 0x74, 0x6f, 0x70, 0x5f,
	0x72, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x42, 0x04, 0xe2,
	0xdf, 0x1f, 0x00, 0x52, 0x0b, 0x73, 0x74, 0x6f, 0x70, 0x52, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67,
	0x22, 0x51, 0x0a, 0x18, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f,
	0x62, 0x73, 0x42, 0x79, 0x53, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x73, 0x12, 0x35, 0x0a, 0x09,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x09, 0x42,
	0x18, 0xe2, 0xdf, 0x1f, 0x14, 0x12, 0x12, 0xea, 0x01, 0x0f, 0x5a, 0x0d, 0xc2, 0x01, 0x0a, 0xf0,
	0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65,
	0x49, 0x64, 0x73, 0x22, 0x7b, 0x0a, 0x16, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x53, 0x79, 0x6e,
	0x63, 0x4a, 0x6f, 0x62, 0x73, 0x42, 0x79, 0x4a, 0x6f, 0x62, 0x49, 0x64, 0x73, 0x12, 0x2e, 0x0a,
	0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04,
	0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x31, 0x0a,
	0x07, 0x6a, 0x6f, 0x62, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x42, 0x18,
	0xe2, 0xdf, 0x1f, 0x14, 0x12, 0x12, 0xea, 0x01, 0x0f, 0x5a, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01,
	0x14, 0xca, 0x02, 0x04, 0x73, 0x79, 0x6a, 0x2d, 0x52, 0x06, 0x6a, 0x6f, 0x62, 0x49, 0x64, 0x73,
	0x42, 0x71, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69,
	0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70,
	0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x12, 0x50, 0x42, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x53, 0x63, 0x68, 0x65, 0x64, 0x75, 0x6c, 0x65, 0x72, 0x50, 0x00, 0x5a, 0x33,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57,
	0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_request_scheduler_proto_rawDescOnce sync.Once
	file_proto_types_request_scheduler_proto_rawDescData = file_proto_types_request_scheduler_proto_rawDesc
)

func file_proto_types_request_scheduler_proto_rawDescGZIP() []byte {
	file_proto_types_request_scheduler_proto_rawDescOnce.Do(func() {
		file_proto_types_request_scheduler_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_request_scheduler_proto_rawDescData)
	})
	return file_proto_types_request_scheduler_proto_rawDescData
}

var file_proto_types_request_scheduler_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_proto_types_request_scheduler_proto_goTypes = []interface{}{
	(*SubmitStreamJob)(nil),            // 0: request.SubmitStreamJob
	(*StopStreamJob)(nil),              // 1: request.StopStreamJob
	(*DeleteStreamJobsBySpaceIds)(nil), // 2: request.DeleteStreamJobsBySpaceIds
	(*DeleteStreamJobsByJobIds)(nil),   // 3: request.DeleteStreamJobsByJobIds
	(*SubmitSyncJob)(nil),              // 4: request.SubmitSyncJob
	(*StopSyncJob)(nil),                // 5: request.StopSyncJob
	(*DeleteSyncJobsBySpaceIds)(nil),   // 6: request.DeleteSyncJobsBySpaceIds
	(*DeleteSyncJobsByJobIds)(nil),     // 7: request.DeleteSyncJobsByJobIds
	(*pbmodel.StreamJobProperty)(nil),  // 8: model.StreamJobProperty
	(*pbmodel.SyncJobProperty)(nil),    // 9: model.SyncJobProperty
}
var file_proto_types_request_scheduler_proto_depIdxs = []int32{
	8, // 0: request.SubmitStreamJob.property:type_name -> model.StreamJobProperty
	9, // 1: request.SubmitSyncJob.property:type_name -> model.SyncJobProperty
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_proto_types_request_scheduler_proto_init() }
func file_proto_types_request_scheduler_proto_init() {
	if File_proto_types_request_scheduler_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_request_scheduler_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubmitStreamJob); i {
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
		file_proto_types_request_scheduler_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StopStreamJob); i {
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
		file_proto_types_request_scheduler_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteStreamJobsBySpaceIds); i {
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
		file_proto_types_request_scheduler_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteStreamJobsByJobIds); i {
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
		file_proto_types_request_scheduler_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SubmitSyncJob); i {
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
		file_proto_types_request_scheduler_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StopSyncJob); i {
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
		file_proto_types_request_scheduler_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteSyncJobsBySpaceIds); i {
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
		file_proto_types_request_scheduler_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteSyncJobsByJobIds); i {
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
			RawDescriptor: file_proto_types_request_scheduler_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_request_scheduler_proto_goTypes,
		DependencyIndexes: file_proto_types_request_scheduler_proto_depIdxs,
		MessageInfos:      file_proto_types_request_scheduler_proto_msgTypes,
	}.Build()
	File_proto_types_request_scheduler_proto = out.File
	file_proto_types_request_scheduler_proto_rawDesc = nil
	file_proto_types_request_scheduler_proto_goTypes = nil
	file_proto_types_request_scheduler_proto_depIdxs = nil
}
