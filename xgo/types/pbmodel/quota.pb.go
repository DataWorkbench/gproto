// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/quota.proto

package pbmodel

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
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

type QuotaWorkspace struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of workspace for every user. default 10.
	Limit int64 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *QuotaWorkspace) Reset() {
	*x = QuotaWorkspace{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaWorkspace) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaWorkspace) ProtoMessage() {}

func (x *QuotaWorkspace) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaWorkspace.ProtoReflect.Descriptor instead.
func (*QuotaWorkspace) Descriptor() ([]byte, []int) {
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{0}
}

func (x *QuotaWorkspace) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type QuotaStreamJob struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of stream job for every user. default 500.
	Limit int64 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *QuotaStreamJob) Reset() {
	*x = QuotaStreamJob{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaStreamJob) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaStreamJob) ProtoMessage() {}

func (x *QuotaStreamJob) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaStreamJob.ProtoReflect.Descriptor instead.
func (*QuotaStreamJob) Descriptor() ([]byte, []int) {
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{1}
}

func (x *QuotaStreamJob) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type QuotaDataSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of datasource for every user. default 500.
	Limit int64 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *QuotaDataSource) Reset() {
	*x = QuotaDataSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaDataSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaDataSource) ProtoMessage() {}

func (x *QuotaDataSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaDataSource.ProtoReflect.Descriptor instead.
func (*QuotaDataSource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{2}
}

func (x *QuotaDataSource) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type QuotaUDF struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of datasource for every user. default 500.
	Limit int64 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *QuotaUDF) Reset() {
	*x = QuotaUDF{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaUDF) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaUDF) ProtoMessage() {}

func (x *QuotaUDF) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaUDF.ProtoReflect.Descriptor instead.
func (*QuotaUDF) Descriptor() ([]byte, []int) {
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{3}
}

func (x *QuotaUDF) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

type QuotaResource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of resource for every user. default 500.
	Limit int64 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
	// Size is the maximum size of every file. default is 100MB.
	Size int64 `protobuf:"varint,2,opt,name=size,proto3" json:"size,omitempty"`
	// SizeTotal is the maximum size of every user. default 5GB.
	SizeTotal int64 `protobuf:"varint,3,opt,name=size_total,json=sizeTotal,proto3" json:"size_total,omitempty"`
}

func (x *QuotaResource) Reset() {
	*x = QuotaResource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaResource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaResource) ProtoMessage() {}

func (x *QuotaResource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaResource.ProtoReflect.Descriptor instead.
func (*QuotaResource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{4}
}

func (x *QuotaResource) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *QuotaResource) GetSize() int64 {
	if x != nil {
		return x.Size
	}
	return 0
}

func (x *QuotaResource) GetSizeTotal() int64 {
	if x != nil {
		return x.SizeTotal
	}
	return 0
}

type QuotaFlinkCluster struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of clusters for every user. default 5.
	Limit int64 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
	// Cu is the maximum number of cu for every cluster. default 8.
	Cu float32 `protobuf:"fixed32,2,opt,name=cu,proto3" json:"cu,omitempty"`
	// CuTotal is the maximum number of cu for every user. default 12.
	CuTotal float32 `protobuf:"fixed32,3,opt,name=cu_total,json=cuTotal,proto3" json:"cu_total,omitempty"`
}

func (x *QuotaFlinkCluster) Reset() {
	*x = QuotaFlinkCluster{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaFlinkCluster) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaFlinkCluster) ProtoMessage() {}

func (x *QuotaFlinkCluster) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaFlinkCluster.ProtoReflect.Descriptor instead.
func (*QuotaFlinkCluster) Descriptor() ([]byte, []int) {
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{5}
}

func (x *QuotaFlinkCluster) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *QuotaFlinkCluster) GetCu() float32 {
	if x != nil {
		return x.Cu
	}
	return 0
}

func (x *QuotaFlinkCluster) GetCuTotal() float32 {
	if x != nil {
		return x.CuTotal
	}
	return 0
}

type QuotaNetwork struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Limit is the maximum number of datasource for every user. default 500.
	Limit int64 `protobuf:"varint,1,opt,name=limit,proto3" json:"limit,omitempty"`
}

func (x *QuotaNetwork) Reset() {
	*x = QuotaNetwork{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *QuotaNetwork) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*QuotaNetwork) ProtoMessage() {}

func (x *QuotaNetwork) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use QuotaNetwork.ProtoReflect.Descriptor instead.
func (*QuotaNetwork) Descriptor() ([]byte, []int) {
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{6}
}

func (x *QuotaNetwork) GetLimit() int64 {
	if x != nil {
		return x.Limit
	}
	return 0
}

// Quota for user level.
type UserQuota struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The user id of owner.
	UserId       string             `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id" gorm:"column:user_id;primarykey"`
	Workspace    *QuotaWorkspace    `protobuf:"bytes,2,opt,name=workspace,proto3" json:"workspace" gorm:"column:workspace;"`
	StreamJob    *QuotaStreamJob    `protobuf:"bytes,3,opt,name=stream_job,json=streamJob,proto3" json:"stream_job" gorm:"column:stream_job;"`
	DataSource   *QuotaDataSource   `protobuf:"bytes,4,opt,name=data_source,json=dataSource,proto3" json:"data_source" gorm:"column:data_source;"`
	Udf          *QuotaUDF          `protobuf:"bytes,5,opt,name=udf,proto3" json:"udf" gorm:"column:udf;"`
	Resource     *QuotaResource     `protobuf:"bytes,6,opt,name=resource,proto3" json:"resource" gorm:"column:resource;"`
	FlinkCluster *QuotaFlinkCluster `protobuf:"bytes,7,opt,name=flink_cluster,json=flinkCluster,proto3" json:"flink_cluster" gorm:"column:flink_cluster;"`
	Network      *QuotaNetwork      `protobuf:"bytes,8,opt,name=network,proto3" json:"network" gorm:"column:network;"`
}

func (x *UserQuota) Reset() {
	*x = UserQuota{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_quota_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UserQuota) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UserQuota) ProtoMessage() {}

func (x *UserQuota) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_quota_proto_msgTypes[7]
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
	return file_proto_types_model_quota_proto_rawDescGZIP(), []int{7}
}

func (x *UserQuota) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *UserQuota) GetWorkspace() *QuotaWorkspace {
	if x != nil {
		return x.Workspace
	}
	return nil
}

func (x *UserQuota) GetStreamJob() *QuotaStreamJob {
	if x != nil {
		return x.StreamJob
	}
	return nil
}

func (x *UserQuota) GetDataSource() *QuotaDataSource {
	if x != nil {
		return x.DataSource
	}
	return nil
}

func (x *UserQuota) GetUdf() *QuotaUDF {
	if x != nil {
		return x.Udf
	}
	return nil
}

func (x *UserQuota) GetResource() *QuotaResource {
	if x != nil {
		return x.Resource
	}
	return nil
}

func (x *UserQuota) GetFlinkCluster() *QuotaFlinkCluster {
	if x != nil {
		return x.FlinkCluster
	}
	return nil
}

func (x *UserQuota) GetNetwork() *QuotaNetwork {
	if x != nil {
		return x.Network
	}
	return nil
}

var File_proto_types_model_quota_proto protoreflect.FileDescriptor

var file_proto_types_model_quota_proto_rawDesc = []byte{
	0x0a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70,
	0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71,
	0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x2e, 0x0a, 0x0e, 0x51, 0x75, 0x6f, 0x74, 0x61,
	0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d,
	0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a,
	0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x2e, 0x0a, 0x0e, 0x51, 0x75, 0x6f, 0x74, 0x61,
	0x53, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d,
	0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a,
	0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x2f, 0x0a, 0x0f, 0x51, 0x75, 0x6f, 0x74, 0x61,
	0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69,
	0x6d, 0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74,
	0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x28, 0x0a, 0x08, 0x51, 0x75, 0x6f, 0x74,
	0x61, 0x55, 0x44, 0x46, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02,
	0x0a, 0x00, 0x22, 0x60, 0x0a, 0x0d, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x65, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x73, 0x69, 0x7a,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x12, 0x1d, 0x0a,
	0x0a, 0x73, 0x69, 0x7a, 0x65, 0x5f, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x03, 0x52, 0x09, 0x73, 0x69, 0x7a, 0x65, 0x54, 0x6f, 0x74, 0x61, 0x6c, 0x3a, 0x06, 0xca, 0xb2,
	0x04, 0x02, 0x0a, 0x00, 0x22, 0x5c, 0x0a, 0x11, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x46, 0x6c, 0x69,
	0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d,
	0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12,
	0x0e, 0x0a, 0x02, 0x63, 0x75, 0x18, 0x02, 0x20, 0x01, 0x28, 0x02, 0x52, 0x02, 0x63, 0x75, 0x12,
	0x19, 0x0a, 0x08, 0x63, 0x75, 0x5f, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x02, 0x52, 0x07, 0x63, 0x75, 0x54, 0x6f, 0x74, 0x61, 0x6c, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02,
	0x0a, 0x00, 0x22, 0x2c, 0x0a, 0x0c, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x4e, 0x65, 0x74, 0x77, 0x6f,
	0x72, 0x6b, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x03, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00,
	0x22, 0x8b, 0x03, 0x0a, 0x09, 0x55, 0x73, 0x65, 0x72, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x12, 0x17,
	0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x33, 0x0a, 0x09, 0x77, 0x6f, 0x72, 0x6b, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x52, 0x09, 0x77, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x34, 0x0a, 0x0a,
	0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x5f, 0x6a, 0x6f, 0x62, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x52, 0x09, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a,
	0x6f, 0x62, 0x12, 0x37, 0x0a, 0x0b, 0x64, 0x61, 0x74, 0x61, 0x5f, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x51, 0x75, 0x6f, 0x74, 0x61, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x52,
	0x0a, 0x64, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x21, 0x0a, 0x03, 0x75,
	0x64, 0x66, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x55, 0x44, 0x46, 0x52, 0x03, 0x75, 0x64, 0x66, 0x12, 0x30,
	0x0a, 0x08, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x14, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x65,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x52, 0x08, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x12, 0x3d, 0x0a, 0x0d, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65,
	0x72, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x51, 0x75, 0x6f, 0x74, 0x61, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65,
	0x72, 0x52, 0x0c, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x12,
	0x2d, 0x0a, 0x07, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x4e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x07, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x42, 0x67,
	0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e,
	0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x42, 0x0c, 0x50, 0x42, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x51, 0x75, 0x6f,
	0x74, 0x61, 0x50, 0x00, 0x5a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_quota_proto_rawDescOnce sync.Once
	file_proto_types_model_quota_proto_rawDescData = file_proto_types_model_quota_proto_rawDesc
)

func file_proto_types_model_quota_proto_rawDescGZIP() []byte {
	file_proto_types_model_quota_proto_rawDescOnce.Do(func() {
		file_proto_types_model_quota_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_quota_proto_rawDescData)
	})
	return file_proto_types_model_quota_proto_rawDescData
}

var file_proto_types_model_quota_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_proto_types_model_quota_proto_goTypes = []interface{}{
	(*QuotaWorkspace)(nil),    // 0: model.QuotaWorkspace
	(*QuotaStreamJob)(nil),    // 1: model.QuotaStreamJob
	(*QuotaDataSource)(nil),   // 2: model.QuotaDataSource
	(*QuotaUDF)(nil),          // 3: model.QuotaUDF
	(*QuotaResource)(nil),     // 4: model.QuotaResource
	(*QuotaFlinkCluster)(nil), // 5: model.QuotaFlinkCluster
	(*QuotaNetwork)(nil),      // 6: model.QuotaNetwork
	(*UserQuota)(nil),         // 7: model.UserQuota
}
var file_proto_types_model_quota_proto_depIdxs = []int32{
	0, // 0: model.UserQuota.workspace:type_name -> model.QuotaWorkspace
	1, // 1: model.UserQuota.stream_job:type_name -> model.QuotaStreamJob
	2, // 2: model.UserQuota.data_source:type_name -> model.QuotaDataSource
	3, // 3: model.UserQuota.udf:type_name -> model.QuotaUDF
	4, // 4: model.UserQuota.resource:type_name -> model.QuotaResource
	5, // 5: model.UserQuota.flink_cluster:type_name -> model.QuotaFlinkCluster
	6, // 6: model.UserQuota.network:type_name -> model.QuotaNetwork
	7, // [7:7] is the sub-list for method output_type
	7, // [7:7] is the sub-list for method input_type
	7, // [7:7] is the sub-list for extension type_name
	7, // [7:7] is the sub-list for extension extendee
	0, // [0:7] is the sub-list for field type_name
}

func init() { file_proto_types_model_quota_proto_init() }
func file_proto_types_model_quota_proto_init() {
	if File_proto_types_model_quota_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_quota_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaWorkspace); i {
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
		file_proto_types_model_quota_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaStreamJob); i {
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
		file_proto_types_model_quota_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaDataSource); i {
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
		file_proto_types_model_quota_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaUDF); i {
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
		file_proto_types_model_quota_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaResource); i {
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
		file_proto_types_model_quota_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaFlinkCluster); i {
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
		file_proto_types_model_quota_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*QuotaNetwork); i {
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
		file_proto_types_model_quota_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
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
			RawDescriptor: file_proto_types_model_quota_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_quota_proto_goTypes,
		DependencyIndexes: file_proto_types_model_quota_proto_depIdxs,
		MessageInfos:      file_proto_types_model_quota_proto_msgTypes,
	}.Build()
	File_proto_types_model_quota_proto = out.File
	file_proto_types_model_quota_proto_rawDesc = nil
	file_proto_types_model_quota_proto_goTypes = nil
	file_proto_types_model_quota_proto_depIdxs = nil
}
