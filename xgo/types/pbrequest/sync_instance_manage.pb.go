// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/sync_instance_manage.proto

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

// ListSyncInsts used as a request parameters for RPC and HTTP(based on URL-Query).
// This struct can used for ListSyncInsts and ListSyncInsts
type ListSyncInstances struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit the maximum number of entries returned this time.
	// Not required, Max 100, default 100.
	Limit int32 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit" form:"limit"`
	// The offset position. Not required, default 0.
	Offset int32 `protobuf:"varint,2,opt,name=offset,proto3" json:"offset" form:"offset"`
	// The workspace id in HTTP Request-URI. Is Required.
	SpaceId string `protobuf:"bytes,3,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The stream job id. Not required.
	JobId string `protobuf:"bytes,4,opt,name=job_id,json=jobId,proto3" json:"job_id" form:"job_id"`
	// The stream job version id. Not required.
	Version string `protobuf:"bytes,5,opt,name=version,proto3" json:"version" form:"version"`
	// The stream instance state. Not required.
	State pbmodel.SyncInstance_State `protobuf:"varint,6,opt,name=state,proto3,enum=model.SyncInstance_State" json:"state" form:"state"`
	// The field list used to sorted query results.
	// Optional values: {job_id, id, created, updated}.
	// Not required, default: id.
	SortBy string `protobuf:"bytes,7,opt,name=sort_by,json=sortBy,proto3" json:"sort_by" form:"sort_by"`
	// Reverse order results. Not required, default: false.
	Reverse bool `protobuf:"varint,8,opt,name=reverse,proto3" json:"reverse" form:"reverse"`
	// Filter by `instance_id`. Not required.
	InstanceId string `protobuf:"bytes,9,opt,name=instance_id,json=instanceId,proto3" json:"instance_id" form:"instance_id"`
}

func (x *ListSyncInstances) Reset() {
	*x = ListSyncInstances{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListSyncInstances) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListSyncInstances) ProtoMessage() {}

func (x *ListSyncInstances) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListSyncInstances.ProtoReflect.Descriptor instead.
func (*ListSyncInstances) Descriptor() ([]byte, []int) {
	return file_proto_types_request_sync_instance_manage_proto_rawDescGZIP(), []int{0}
}

func (x *ListSyncInstances) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *ListSyncInstances) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

func (x *ListSyncInstances) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *ListSyncInstances) GetJobId() string {
	if x != nil {
		return x.JobId
	}
	return ""
}

func (x *ListSyncInstances) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

func (x *ListSyncInstances) GetState() pbmodel.SyncInstance_State {
	if x != nil {
		return x.State
	}
	return pbmodel.SyncInstance_State(0)
}

func (x *ListSyncInstances) GetSortBy() string {
	if x != nil {
		return x.SortBy
	}
	return ""
}

func (x *ListSyncInstances) GetReverse() bool {
	if x != nil {
		return x.Reverse
	}
	return false
}

func (x *ListSyncInstances) GetInstanceId() string {
	if x != nil {
		return x.InstanceId
	}
	return ""
}

// TerminateSyncInstances used as a request parameters for RPC.
// This struct can used for TerminateSyncCycleInst and TerminateSyncTestInst.
type TerminateSyncInstances struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI. Is Required.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The list of instance id and its stream job id. Is Required. Min: 1, Max: 100
	InstanceIds []string `protobuf:"bytes,2,rep,name=instance_ids,json=instanceIds,proto3" json:"instance_ids"`
}

func (x *TerminateSyncInstances) Reset() {
	*x = TerminateSyncInstances{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TerminateSyncInstances) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TerminateSyncInstances) ProtoMessage() {}

func (x *TerminateSyncInstances) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TerminateSyncInstances.ProtoReflect.Descriptor instead.
func (*TerminateSyncInstances) Descriptor() ([]byte, []int) {
	return file_proto_types_request_sync_instance_manage_proto_rawDescGZIP(), []int{1}
}

func (x *TerminateSyncInstances) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *TerminateSyncInstances) GetInstanceIds() []string {
	if x != nil {
		return x.InstanceIds
	}
	return nil
}

// SuspendSyncInstances used as a request parameters for RPC.
// This struct can used for SuspendSyncCycleInst and SuspendSyncTestInst.
type SuspendSyncInstances struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI. Is Required.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The list of instance id and its stream job id. Is Required. Min: 1, Max: 100
	InstanceIds []string `protobuf:"bytes,2,rep,name=instance_ids,json=instanceIds,proto3" json:"instance_ids"`
}

func (x *SuspendSyncInstances) Reset() {
	*x = SuspendSyncInstances{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SuspendSyncInstances) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SuspendSyncInstances) ProtoMessage() {}

func (x *SuspendSyncInstances) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SuspendSyncInstances.ProtoReflect.Descriptor instead.
func (*SuspendSyncInstances) Descriptor() ([]byte, []int) {
	return file_proto_types_request_sync_instance_manage_proto_rawDescGZIP(), []int{2}
}

func (x *SuspendSyncInstances) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *SuspendSyncInstances) GetInstanceIds() []string {
	if x != nil {
		return x.InstanceIds
	}
	return nil
}

// ResumeSyncInstances used as a request parameters for RPC.
// This struct can used for ResumeSyncCycleInst and SuspendSyncTestInst.
type ResumeSyncInstances struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI. Is Required.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The list of instance id and its stream job id. Is Required. Min: 1, Max: 100
	InstanceIds []string `protobuf:"bytes,2,rep,name=instance_ids,json=instanceIds,proto3" json:"instance_ids"`
}

func (x *ResumeSyncInstances) Reset() {
	*x = ResumeSyncInstances{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ResumeSyncInstances) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ResumeSyncInstances) ProtoMessage() {}

func (x *ResumeSyncInstances) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ResumeSyncInstances.ProtoReflect.Descriptor instead.
func (*ResumeSyncInstances) Descriptor() ([]byte, []int) {
	return file_proto_types_request_sync_instance_manage_proto_rawDescGZIP(), []int{3}
}

func (x *ResumeSyncInstances) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *ResumeSyncInstances) GetInstanceIds() []string {
	if x != nil {
		return x.InstanceIds
	}
	return nil
}

type DescribeSyncInstance struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	InstanceId string `protobuf:"bytes,1,opt,name=instance_id,json=instanceId,proto3" json:"instance_id,omitempty"`
}

func (x *DescribeSyncInstance) Reset() {
	*x = DescribeSyncInstance{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeSyncInstance) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeSyncInstance) ProtoMessage() {}

func (x *DescribeSyncInstance) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_sync_instance_manage_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeSyncInstance.ProtoReflect.Descriptor instead.
func (*DescribeSyncInstance) Descriptor() ([]byte, []int) {
	return file_proto_types_request_sync_instance_manage_proto_rawDescGZIP(), []int{4}
}

func (x *DescribeSyncInstance) GetInstanceId() string {
	if x != nil {
		return x.InstanceId
	}
	return ""
}

var File_proto_types_request_sync_instance_manage_proto protoreflect.FileDescriptor

var file_proto_types_request_sync_instance_manage_proto_rawDesc = []byte{
	0x0a, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x69, 0x6e, 0x73, 0x74, 0x61,
	0x6e, 0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x07, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76,
	0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x25, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x69, 0x6e, 0x73, 0x74, 0x61,
	0x6e, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x85, 0x03, 0x0a, 0x11, 0x4c, 0x69,
	0x73, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x12,
	0x2d, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x05, 0x42, 0x17,
	0xa2, 0xa1, 0x1f, 0x06, 0xaa, 0x06, 0x03, 0x31, 0x30, 0x30, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07,
	0xb2, 0x01, 0x04, 0x30, 0x00, 0x38, 0x64, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x23,
	0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x0b,
	0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x06, 0x6f, 0x66, 0x66,
	0x73, 0x65, 0x74, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a,
	0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x49, 0x64, 0x12, 0x15, 0x0a, 0x06, 0x6a, 0x6f, 0x62, 0x5f, 0x69, 0x64, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x05, 0x6a, 0x6f, 0x62, 0x49, 0x64, 0x12, 0x18, 0x0a, 0x07, 0x76, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x76, 0x65, 0x72,
	0x73, 0x69, 0x6f, 0x6e, 0x12, 0x3c, 0x0a, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x18, 0x06, 0x20,
	0x01, 0x28, 0x0e, 0x32, 0x19, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x79, 0x6e, 0x63,
	0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x42, 0x0b,
	0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xda, 0x01, 0x02, 0x58, 0x01, 0x52, 0x05, 0x73, 0x74, 0x61,
	0x74, 0x65, 0x12, 0x42, 0x0a, 0x07, 0x73, 0x6f, 0x72, 0x74, 0x5f, 0x62, 0x79, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x29, 0xe2, 0xdf, 0x1f, 0x25, 0x12, 0x23, 0xc2, 0x01, 0x20, 0x4a, 0x00,
	0x4a, 0x02, 0x69, 0x64, 0x4a, 0x06, 0x6a, 0x6f, 0x62, 0x5f, 0x69, 0x64, 0x4a, 0x07, 0x63, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x64, 0x4a, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x52, 0x06,
	0x73, 0x6f, 0x72, 0x74, 0x42, 0x79, 0x12, 0x18, 0x0a, 0x07, 0x72, 0x65, 0x76, 0x65, 0x72, 0x73,
	0x65, 0x18, 0x08, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x72, 0x65, 0x76, 0x65, 0x72, 0x73, 0x65,
	0x12, 0x1f, 0x0a, 0x0b, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18,
	0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x49,
	0x64, 0x22, 0x86, 0x01, 0x0a, 0x16, 0x54, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x53,
	0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x2e, 0x0a, 0x08,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13,
	0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77,
	0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x3c, 0x0a, 0x0c,
	0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x02, 0x20, 0x03,
	0x28, 0x09, 0x42, 0x19, 0xe2, 0xdf, 0x1f, 0x15, 0x12, 0x13, 0xea, 0x01, 0x10, 0x30, 0x00, 0x38,
	0x64, 0x5a, 0x0a, 0xc2, 0x01, 0x07, 0xca, 0x02, 0x04, 0x73, 0x74, 0x69, 0x2d, 0x52, 0x0b, 0x69,
	0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x49, 0x64, 0x73, 0x22, 0x84, 0x01, 0x0a, 0x14, 0x53,
	0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e,
	0x63, 0x65, 0x73, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a,
	0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x49, 0x64, 0x12, 0x3c, 0x0a, 0x0c, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f,
	0x69, 0x64, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x42, 0x19, 0xe2, 0xdf, 0x1f, 0x15, 0x12,
	0x13, 0xea, 0x01, 0x10, 0x30, 0x00, 0x38, 0x64, 0x5a, 0x0a, 0xc2, 0x01, 0x07, 0xca, 0x02, 0x04,
	0x73, 0x74, 0x69, 0x2d, 0x52, 0x0b, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x49, 0x64,
	0x73, 0x22, 0x83, 0x01, 0x0a, 0x13, 0x52, 0x65, 0x73, 0x75, 0x6d, 0x65, 0x53, 0x79, 0x6e, 0x63,
	0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x73, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f,
	0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d,
	0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x3c, 0x0a, 0x0c, 0x69, 0x6e, 0x73,
	0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x42,
	0x19, 0xe2, 0xdf, 0x1f, 0x15, 0x12, 0x13, 0xea, 0x01, 0x10, 0x30, 0x00, 0x38, 0x64, 0x5a, 0x0a,
	0xc2, 0x01, 0x07, 0xca, 0x02, 0x04, 0x73, 0x74, 0x69, 0x2d, 0x52, 0x0b, 0x69, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x49, 0x64, 0x73, 0x22, 0x4c, 0x0a, 0x14, 0x44, 0x65, 0x73, 0x63, 0x72,
	0x69, 0x62, 0x65, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x12,
	0x34, 0x0a, 0x0b, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0,
	0x01, 0x14, 0xca, 0x02, 0x04, 0x73, 0x74, 0x69, 0x2d, 0x52, 0x0a, 0x69, 0x6e, 0x73, 0x74, 0x61,
	0x6e, 0x63, 0x65, 0x49, 0x64, 0x42, 0x7a, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74,
	0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x1b, 0x50,
	0x42, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x33, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72,
	0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67,
	0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_request_sync_instance_manage_proto_rawDescOnce sync.Once
	file_proto_types_request_sync_instance_manage_proto_rawDescData = file_proto_types_request_sync_instance_manage_proto_rawDesc
)

func file_proto_types_request_sync_instance_manage_proto_rawDescGZIP() []byte {
	file_proto_types_request_sync_instance_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_request_sync_instance_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_request_sync_instance_manage_proto_rawDescData)
	})
	return file_proto_types_request_sync_instance_manage_proto_rawDescData
}

var file_proto_types_request_sync_instance_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_proto_types_request_sync_instance_manage_proto_goTypes = []interface{}{
	(*ListSyncInstances)(nil),       // 0: request.ListSyncInstances
	(*TerminateSyncInstances)(nil),  // 1: request.TerminateSyncInstances
	(*SuspendSyncInstances)(nil),    // 2: request.SuspendSyncInstances
	(*ResumeSyncInstances)(nil),     // 3: request.ResumeSyncInstances
	(*DescribeSyncInstance)(nil),    // 4: request.DescribeSyncInstance
	(pbmodel.SyncInstance_State)(0), // 5: model.SyncInstance.State
}
var file_proto_types_request_sync_instance_manage_proto_depIdxs = []int32{
	5, // 0: request.ListSyncInstances.state:type_name -> model.SyncInstance.State
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_proto_types_request_sync_instance_manage_proto_init() }
func file_proto_types_request_sync_instance_manage_proto_init() {
	if File_proto_types_request_sync_instance_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_request_sync_instance_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListSyncInstances); i {
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
		file_proto_types_request_sync_instance_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TerminateSyncInstances); i {
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
		file_proto_types_request_sync_instance_manage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SuspendSyncInstances); i {
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
		file_proto_types_request_sync_instance_manage_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ResumeSyncInstances); i {
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
		file_proto_types_request_sync_instance_manage_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeSyncInstance); i {
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
			RawDescriptor: file_proto_types_request_sync_instance_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_request_sync_instance_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_request_sync_instance_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_request_sync_instance_manage_proto_msgTypes,
	}.Build()
	File_proto_types_request_sync_instance_manage_proto = out.File
	file_proto_types_request_sync_instance_manage_proto_rawDesc = nil
	file_proto_types_request_sync_instance_manage_proto_goTypes = nil
	file_proto_types_request_sync_instance_manage_proto_depIdxs = nil
}