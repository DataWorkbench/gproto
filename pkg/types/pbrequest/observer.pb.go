// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/observer.proto

package pbrequest

import (
	_ "github.com/yu31/proto-go-plugin/pkg/pb/defaultspb"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/validatorpb"
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

type PTasksStatusStat struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId   string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty" josn:"space_id" uri:"space_id" swaggerignore:"true"`
	StartTime int64  `protobuf:"varint,2,opt,name=start_time,json=startTime,proto3" json:"start_time,omitempty" josn:"start_time" form:"start_time"`
	EndTime   int64  `protobuf:"varint,3,opt,name=end_time,json=endTime,proto3" json:"end_time,omitempty" josn:"end_time" form:"end_time"`
}

func (x *PTasksStatusStat) Reset() {
	*x = PTasksStatusStat{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_observer_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PTasksStatusStat) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PTasksStatusStat) ProtoMessage() {}

func (x *PTasksStatusStat) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_observer_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PTasksStatusStat.ProtoReflect.Descriptor instead.
func (*PTasksStatusStat) Descriptor() ([]byte, []int) {
	return file_proto_types_request_observer_proto_rawDescGZIP(), []int{0}
}

func (x *PTasksStatusStat) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *PTasksStatusStat) GetStartTime() int64 {
	if x != nil {
		return x.StartTime
	}
	return 0
}

func (x *PTasksStatusStat) GetEndTime() int64 {
	if x != nil {
		return x.EndTime
	}
	return 0
}

type PTasksExecStat struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty" josn:"space_id" uri:"space_id" swaggerignore:"true"`
	State   int32  `protobuf:"varint,2,opt,name=state,proto3" json:"state,omitempty" josn:"state" form:"state"`
}

func (x *PTasksExecStat) Reset() {
	*x = PTasksExecStat{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_observer_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PTasksExecStat) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PTasksExecStat) ProtoMessage() {}

func (x *PTasksExecStat) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_observer_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PTasksExecStat.ProtoReflect.Descriptor instead.
func (*PTasksExecStat) Descriptor() ([]byte, []int) {
	return file_proto_types_request_observer_proto_rawDescGZIP(), []int{1}
}

func (x *PTasksExecStat) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *PTasksExecStat) GetState() int32 {
	if x != nil {
		return x.State
	}
	return 0
}

type PTaskRuntimeRanking struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty" josn:"space_id" uri:"space_id" swaggerignore:"true"`
	Limit   int32  `protobuf:"varint,2,opt,name=limit,proto3" json:"limit,omitempty" josn:"limit" form:"limit"`
	Offset  int32  `protobuf:"varint,3,opt,name=offset,proto3" json:"offset,omitempty" josn:"offset" form:"offset"`
}

func (x *PTaskRuntimeRanking) Reset() {
	*x = PTaskRuntimeRanking{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_observer_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PTaskRuntimeRanking) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PTaskRuntimeRanking) ProtoMessage() {}

func (x *PTaskRuntimeRanking) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_observer_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PTaskRuntimeRanking.ProtoReflect.Descriptor instead.
func (*PTaskRuntimeRanking) Descriptor() ([]byte, []int) {
	return file_proto_types_request_observer_proto_rawDescGZIP(), []int{2}
}

func (x *PTaskRuntimeRanking) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *PTaskRuntimeRanking) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *PTaskRuntimeRanking) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

type PTaskErrorRanking struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty" josn:"space_id" uri:"space_id" swaggerignore:"true"`
	Limit   int32  `protobuf:"varint,2,opt,name=limit,proto3" json:"limit,omitempty" josn:"limit" form:"limit"`
	Offset  int32  `protobuf:"varint,3,opt,name=offset,proto3" json:"offset,omitempty" josn:"offset" form:"offset"`
}

func (x *PTaskErrorRanking) Reset() {
	*x = PTaskErrorRanking{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_observer_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PTaskErrorRanking) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PTaskErrorRanking) ProtoMessage() {}

func (x *PTaskErrorRanking) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_observer_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PTaskErrorRanking.ProtoReflect.Descriptor instead.
func (*PTaskErrorRanking) Descriptor() ([]byte, []int) {
	return file_proto_types_request_observer_proto_rawDescGZIP(), []int{3}
}

func (x *PTaskErrorRanking) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *PTaskErrorRanking) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *PTaskErrorRanking) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

type PTaskDispatchCount struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	SpaceId   string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id,omitempty" josn:"space_id" uri:"space_id" swaggerignore:"true"`
	StartTime int64  `protobuf:"varint,2,opt,name=start_time,json=startTime,proto3" json:"start_time,omitempty" josn:"start_time" form:"start_time"`
	EndTime   int64  `protobuf:"varint,3,opt,name=end_time,json=endTime,proto3" json:"end_time,omitempty" josn:"end_time" form:"end_time"`
}

func (x *PTaskDispatchCount) Reset() {
	*x = PTaskDispatchCount{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_observer_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PTaskDispatchCount) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PTaskDispatchCount) ProtoMessage() {}

func (x *PTaskDispatchCount) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_observer_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PTaskDispatchCount.ProtoReflect.Descriptor instead.
func (*PTaskDispatchCount) Descriptor() ([]byte, []int) {
	return file_proto_types_request_observer_proto_rawDescGZIP(), []int{4}
}

func (x *PTaskDispatchCount) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *PTaskDispatchCount) GetStartTime() int64 {
	if x != nil {
		return x.StartTime
	}
	return 0
}

func (x *PTaskDispatchCount) GetEndTime() int64 {
	if x != nil {
		return x.EndTime
	}
	return 0
}

var File_proto_types_request_observer_proto protoreflect.FileDescriptor

var file_proto_types_request_observer_proto_rawDesc = []byte{
	0x0a, 0x22, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x6f, 0x62, 0x73, 0x65, 0x72, 0x76, 0x65, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x07, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x35, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x67, 0x6f, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x67, 0x6f, 0x2d, 0x70,
	0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x66, 0x61,
	0x75, 0x6c, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x96, 0x01, 0x0a, 0x10, 0x50,
	0x54, 0x61, 0x73, 0x6b, 0x73, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x53, 0x74, 0x61, 0x74, 0x12,
	0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca,
	0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12,
	0x2a, 0x0a, 0x0a, 0x73, 0x74, 0x61, 0x72, 0x74, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00,
	0x52, 0x09, 0x73, 0x74, 0x61, 0x72, 0x74, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x26, 0x0a, 0x08, 0x65,
	0x6e, 0x64, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2,
	0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x07, 0x65, 0x6e, 0x64, 0x54,
	0x69, 0x6d, 0x65, 0x22, 0x63, 0x0a, 0x0e, 0x50, 0x54, 0x61, 0x73, 0x6b, 0x73, 0x45, 0x78, 0x65,
	0x63, 0x53, 0x74, 0x61, 0x74, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2,
	0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x21, 0x0a, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x05, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40,
	0x00, 0x52, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x22, 0x99, 0x01, 0x0a, 0x13, 0x50, 0x54, 0x61,
	0x73, 0x6b, 0x52, 0x75, 0x6e, 0x74, 0x69, 0x6d, 0x65, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67,
	0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14,
	0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64,
	0x12, 0x2d, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42,
	0x17, 0xa2, 0xa1, 0x1f, 0x06, 0xaa, 0x06, 0x03, 0x31, 0x30, 0x30, 0xe2, 0xdf, 0x1f, 0x09, 0x12,
	0x07, 0xb2, 0x01, 0x04, 0x30, 0x00, 0x38, 0x64, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12,
	0x23, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x42,
	0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x06, 0x6f, 0x66,
	0x66, 0x73, 0x65, 0x74, 0x22, 0x97, 0x01, 0x0a, 0x11, 0x50, 0x54, 0x61, 0x73, 0x6b, 0x45, 0x72,
	0x72, 0x6f, 0x72, 0x52, 0x61, 0x6e, 0x6b, 0x69, 0x6e, 0x67, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf,
	0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73,
	0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2d, 0x0a, 0x05, 0x6c, 0x69,
	0x6d, 0x69, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x17, 0xa2, 0xa1, 0x1f, 0x06, 0xaa,
	0x06, 0x03, 0x31, 0x30, 0x30, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xb2, 0x01, 0x04, 0x30, 0x00,
	0x38, 0x64, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x23, 0x0a, 0x06, 0x6f, 0x66, 0x66,
	0x73, 0x65, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12,
	0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x22, 0x98,
	0x01, 0x0a, 0x12, 0x50, 0x54, 0x61, 0x73, 0x6b, 0x44, 0x69, 0x73, 0x70, 0x61, 0x74, 0x63, 0x68,
	0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2,
	0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2a, 0x0a, 0x0a, 0x73, 0x74, 0x61, 0x72, 0x74, 0x5f, 0x74,
	0x69, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12,
	0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x09, 0x73, 0x74, 0x61, 0x72, 0x74, 0x54, 0x69, 0x6d,
	0x65, 0x12, 0x26, 0x0a, 0x08, 0x65, 0x6e, 0x64, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00,
	0x52, 0x07, 0x65, 0x6e, 0x64, 0x54, 0x69, 0x6d, 0x65, 0x42, 0x70, 0x0a, 0x24, 0x63, 0x6f, 0x6d,
	0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x42, 0x11, 0x50, 0x42, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x4f, 0x62, 0x73, 0x65,
	0x72, 0x76, 0x65, 0x72, 0x50, 0x00, 0x5a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68,
	0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x74, 0x79, 0x70, 0x65,
	0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_proto_types_request_observer_proto_rawDescOnce sync.Once
	file_proto_types_request_observer_proto_rawDescData = file_proto_types_request_observer_proto_rawDesc
)

func file_proto_types_request_observer_proto_rawDescGZIP() []byte {
	file_proto_types_request_observer_proto_rawDescOnce.Do(func() {
		file_proto_types_request_observer_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_request_observer_proto_rawDescData)
	})
	return file_proto_types_request_observer_proto_rawDescData
}

var file_proto_types_request_observer_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_proto_types_request_observer_proto_goTypes = []interface{}{
	(*PTasksStatusStat)(nil),    // 0: request.PTasksStatusStat
	(*PTasksExecStat)(nil),      // 1: request.PTasksExecStat
	(*PTaskRuntimeRanking)(nil), // 2: request.PTaskRuntimeRanking
	(*PTaskErrorRanking)(nil),   // 3: request.PTaskErrorRanking
	(*PTaskDispatchCount)(nil),  // 4: request.PTaskDispatchCount
}
var file_proto_types_request_observer_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_types_request_observer_proto_init() }
func file_proto_types_request_observer_proto_init() {
	if File_proto_types_request_observer_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_request_observer_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PTasksStatusStat); i {
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
		file_proto_types_request_observer_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PTasksExecStat); i {
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
		file_proto_types_request_observer_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PTaskRuntimeRanking); i {
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
		file_proto_types_request_observer_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PTaskErrorRanking); i {
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
		file_proto_types_request_observer_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PTaskDispatchCount); i {
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
			RawDescriptor: file_proto_types_request_observer_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_request_observer_proto_goTypes,
		DependencyIndexes: file_proto_types_request_observer_proto_depIdxs,
		MessageInfos:      file_proto_types_request_observer_proto_msgTypes,
	}.Build()
	File_proto_types_request_observer_proto = out.File
	file_proto_types_request_observer_proto_rawDesc = nil
	file_proto_types_request_observer_proto_goTypes = nil
	file_proto_types_request_observer_proto_depIdxs = nil
}
