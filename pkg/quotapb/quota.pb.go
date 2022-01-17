// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/quota.proto

package quotapb

import (
	proto "github.com/golang/protobuf/proto"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/gosqlpb"
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

type Workspace struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of workspace for every user. default 10.
	Limit int64 `protobuf:"varint,3,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *Workspace) Reset() {
	*x = Workspace{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Workspace) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Workspace) ProtoMessage() {}

func (x *Workspace) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Workspace.ProtoReflect.Descriptor instead.
func (*Workspace) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{0}
}

func (x *Workspace) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type StreamJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of stream job for every user. default 500.
	Limit int64 `protobuf:"varint,3,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *StreamJob) Reset() {
	*x = StreamJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *StreamJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*StreamJob) ProtoMessage() {}

func (x *StreamJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use StreamJob.ProtoReflect.Descriptor instead.
func (*StreamJob) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{1}
}

func (x *StreamJob) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type DataSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of datasource for every user. default 500.
	Limit int64 `protobuf:"varint,3,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *DataSource) Reset() {
	*x = DataSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DataSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DataSource) ProtoMessage() {}

func (x *DataSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DataSource.ProtoReflect.Descriptor instead.
func (*DataSource) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{2}
}

func (x *DataSource) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type UDF struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of datasource for every user. default 500.
	Limit int64 `protobuf:"varint,3,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *UDF) Reset() {
	*x = UDF{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UDF) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UDF) ProtoMessage() {}

func (x *UDF) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UDF.ProtoReflect.Descriptor instead.
func (*UDF) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{3}
}

func (x *UDF) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type Resource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of resource for every user. default 500.
	Limit int64 `protobuf:"varint,3,opt,name=limit,proto3" json:"limit,omitempty"`
	// Size is the maximum size of every file. default is 100MB.
	Size int64 `protobuf:"varint,4,opt,name=size,proto3" json:"size,omitempty"`
	// SizeTotal is the maximum size of every user. default 5GB.
	SizeTotal int64 `protobuf:"varint,5,opt,name=size_total,json=sizeTotal,proto3" json:"size_total,omitempty"`
}

func (x *Resource) Reset() {
	*x = Resource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Resource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Resource) ProtoMessage() {}

func (x *Resource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Resource.ProtoReflect.Descriptor instead.
func (*Resource) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{4}
}

func (x *Resource) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *Resource) GetSize() int64 {
	if x != nil {
		return x.Size
	}
	return 0
}

func (x *Resource) GetSizeTotal() int64 {
	if x != nil {
		return x.SizeTotal
	}
	return 0
}

type FlinkCluster struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of clusters for every user. default 5.
	Limit int64 `protobuf:"varint,3,opt,name=limit,proto3" json:"limit,omitempty"`
	// Cu is the maximum number of cu for every cluster. default 8.
	Cu int64 `protobuf:"varint,4,opt,name=cu,proto3" json:"cu,omitempty"`
	// CuTotal is the maximum number of cu for every user. default 12.
	CuTotal int64 `protobuf:"varint,5,opt,name=cu_total,json=cuTotal,proto3" json:"cu_total,omitempty"`
}

func (x *FlinkCluster) Reset() {
	*x = FlinkCluster{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FlinkCluster) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FlinkCluster) ProtoMessage() {}

func (x *FlinkCluster) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FlinkCluster.ProtoReflect.Descriptor instead.
func (*FlinkCluster) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{5}
}

func (x *FlinkCluster) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *FlinkCluster) GetCu() int64 {
	if x != nil {
		return x.Cu
	}
	return 0
}

func (x *FlinkCluster) GetCuTotal() int64 {
	if x != nil {
		return x.CuTotal
	}
	return 0
}

type Network struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of datasource for every user. default 500.
	Limit int64 `protobuf:"varint,3,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *Network) Reset() {
	*x = Network{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Network) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Network) ProtoMessage() {}

func (x *Network) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use Network.ProtoReflect.Descriptor instead.
func (*Network) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{6}
}

func (x *Network) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

// Quota for user.
type UserQuota struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The user id of owner.
	UserId       string        `protobuf:"bytes,3,opt,name=user_id,json=userId,proto3" json:"user_id" gorm:"column:user_id;primarykey"`
	Workspace    *Workspace    `protobuf:"bytes,4,opt,name=workspace,proto3" json:"workspace" gorm:"column:workspace;"`
	StreamJob    *StreamJob    `protobuf:"bytes,5,opt,name=stream_job,json=streamJob,proto3" json:"stream_job" gorm:"column:stream_job;"`
	DataSource   *DataSource   `protobuf:"bytes,6,opt,name=data_source,json=dataSource,proto3" json:"data_source" gorm:"column:data_source;"`
	Udf          *UDF          `protobuf:"bytes,7,opt,name=udf,proto3" json:"udf" gorm:"column:udf;"`
	Resource     *Resource     `protobuf:"bytes,8,opt,name=resource,proto3" json:"resource" gorm:"column:resource;"`
	FlinkCluster *FlinkCluster `protobuf:"bytes,9,opt,name=flink_cluster,json=flinkCluster,proto3" json:"flink_cluster" gorm:"column:flink_cluster;"`
	Network      *Network      `protobuf:"bytes,10,opt,name=network,proto3" json:"network" gorm:"column:network;"`
}

func (x *UserQuota) Reset() {
	*x = UserQuota{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_quota_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserQuota) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserQuota) ProtoMessage() {}

func (x *UserQuota) ProtoReflect() protoreflect.Message {
	mi := &file_proto_quota_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UserQuota.ProtoReflect.Descriptor instead.
func (*UserQuota) Descriptor() ([]byte, []int) {
	return file_proto_quota_proto_rawDescGZIP(), []int{7}
}

func (x *UserQuota) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *UserQuota) GetWorkspace() *Workspace {
	if x != nil {
		return x.Workspace
	}
	return nil
}

func (x *UserQuota) GetStreamJob() *StreamJob {
	if x != nil {
		return x.StreamJob
	}
	return nil
}

func (x *UserQuota) GetDataSource() *DataSource {
	if x != nil {
		return x.DataSource
	}
	return nil
}

func (x *UserQuota) GetUdf() *UDF {
	if x != nil {
		return x.Udf
	}
	return nil
}

func (x *UserQuota) GetResource() *Resource {
	if x != nil {
		return x.Resource
	}
	return nil
}

func (x *UserQuota) GetFlinkCluster() *FlinkCluster {
	if x != nil {
		return x.FlinkCluster
	}
	return nil
}

func (x *UserQuota) GetNetwork() *Network {
	if x != nil {
		return x.Network
	}
	return nil
}

var File_proto_quota_proto protoreflect.FileDescriptor

var file_proto_quota_proto_rawDesc = []byte{
	0x0a, 0x11, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x05, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x1a, 0x31, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2d, 0x67, 0x6f, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x29, 0x0a,
	0x09, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69,
	0x6d, 0x69, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74,
	0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x29, 0x0a, 0x09, 0x53, 0x74, 0x72, 0x65,
	0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a, 0x06, 0xca, 0xb2, 0x04,
	0x02, 0x0a, 0x00, 0x22, 0x2a, 0x0a, 0x0a, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22,
	0x23, 0x0a, 0x03, 0x55, 0x44, 0x46, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a, 0x06, 0xca, 0xb2,
	0x04, 0x02, 0x0a, 0x00, 0x22, 0x5b, 0x0a, 0x08, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52,
	0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x12, 0x1d, 0x0a, 0x0a, 0x73, 0x69,
	0x7a, 0x65, 0x5f, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09,
	0x73, 0x69, 0x7a, 0x65, 0x54, 0x6f, 0x74, 0x61, 0x6c, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a,
	0x00, 0x22, 0x57, 0x0a, 0x0c, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65,
	0x72, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x0e, 0x0a, 0x02, 0x63, 0x75, 0x18, 0x04, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x02, 0x63, 0x75, 0x12, 0x19, 0x0a, 0x08, 0x63, 0x75, 0x5f, 0x74, 0x6f,
	0x74, 0x61, 0x6c, 0x18, 0x05, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x63, 0x75, 0x54, 0x6f, 0x74,
	0x61, 0x6c, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x27, 0x0a, 0x07, 0x4e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a, 0x06, 0xca, 0xb2, 0x04,
	0x02, 0x0a, 0x00, 0x22, 0xe8, 0x02, 0x0a, 0x09, 0x55, 0x73, 0x65, 0x72, 0x51, 0x75, 0x6f, 0x74,
	0x61, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x2e, 0x0a, 0x09, 0x77, 0x6f,
	0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e,
	0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x52,
	0x09, 0x77, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x2f, 0x0a, 0x0a, 0x73, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x5f, 0x6a, 0x6f, 0x62, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10,
	0x2e, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62,
	0x52, 0x09, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x32, 0x0a, 0x0b, 0x64,
	0x61, 0x74, 0x61, 0x5f, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x11, 0x2e, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x52, 0x0a, 0x64, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12,
	0x1c, 0x0a, 0x03, 0x75, 0x64, 0x66, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x71,
	0x75, 0x6f, 0x74, 0x61, 0x2e, 0x55, 0x44, 0x46, 0x52, 0x03, 0x75, 0x64, 0x66, 0x12, 0x2b, 0x0a,
	0x08, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x0f, 0x2e, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x52, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x52, 0x08, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x38, 0x0a, 0x0d, 0x66, 0x6c,
	0x69, 0x6e, 0x6b, 0x5f, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x18, 0x09, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x13, 0x2e, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43,
	0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x52, 0x0c, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75,
	0x73, 0x74, 0x65, 0x72, 0x12, 0x28, 0x0a, 0x07, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x18,
	0x0a, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x4e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x07, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x42, 0x56,
	0x0a, 0x1c, 0x63, 0x6f, 0x6d, 0x2e, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x64, 0x61, 0x74,
	0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x70, 0x62, 0x42, 0x07,
	0x51, 0x75, 0x6f, 0x74, 0x61, 0x50, 0x42, 0x50, 0x00, 0x5a, 0x2b, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65,
	0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x71,
	0x75, 0x6f, 0x74, 0x61, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_quota_proto_rawDescOnce sync.Once
	file_proto_quota_proto_rawDescData = file_proto_quota_proto_rawDesc
)

func file_proto_quota_proto_rawDescGZIP() []byte {
	file_proto_quota_proto_rawDescOnce.Do(func() {
		file_proto_quota_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_quota_proto_rawDescData)
	})
	return file_proto_quota_proto_rawDescData
}

var file_proto_quota_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_proto_quota_proto_goTypes = []interface{}{
	(*Workspace)(nil),    // 0: quota.Workspace
	(*StreamJob)(nil),    // 1: quota.StreamJob
	(*DataSource)(nil),   // 2: quota.DataSource
	(*UDF)(nil),          // 3: quota.UDF
	(*Resource)(nil),     // 4: quota.Resource
	(*FlinkCluster)(nil), // 5: quota.FlinkCluster
	(*Network)(nil),      // 6: quota.Network
	(*UserQuota)(nil),    // 7: quota.UserQuota
}
var file_proto_quota_proto_depIdxs = []int32{
	0, // 0: quota.UserQuota.workspace:type_name -> quota.Workspace
	1, // 1: quota.UserQuota.stream_job:type_name -> quota.StreamJob
	2, // 2: quota.UserQuota.data_source:type_name -> quota.DataSource
	3, // 3: quota.UserQuota.udf:type_name -> quota.UDF
	4, // 4: quota.UserQuota.resource:type_name -> quota.Resource
	5, // 5: quota.UserQuota.flink_cluster:type_name -> quota.FlinkCluster
	6, // 6: quota.UserQuota.network:type_name -> quota.Network
	7, // [7:7] is the sub-list for method output_type
	7, // [7:7] is the sub-list for method input_type
	7, // [7:7] is the sub-list for extension type_name
	7, // [7:7] is the sub-list for extension extendee
	0, // [0:7] is the sub-list for field type_name
}

func init() { file_proto_quota_proto_init() }
func file_proto_quota_proto_init() {
	if File_proto_quota_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_quota_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Workspace); i {
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
		file_proto_quota_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*StreamJob); i {
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
		file_proto_quota_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DataSource); i {
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
		file_proto_quota_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UDF); i {
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
		file_proto_quota_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Resource); i {
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
		file_proto_quota_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FlinkCluster); i {
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
		file_proto_quota_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*Network); i {
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
		file_proto_quota_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UserQuota); i {
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
			RawDescriptor: file_proto_quota_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_quota_proto_goTypes,
		DependencyIndexes: file_proto_quota_proto_depIdxs,
		MessageInfos:      file_proto_quota_proto_msgTypes,
	}.Build()
	File_proto_quota_proto = out.File
	file_proto_quota_proto_rawDesc = nil
	file_proto_quota_proto_goTypes = nil
	file_proto_quota_proto_depIdxs = nil
}
