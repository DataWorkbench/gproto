// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/observable.proto

package pbmodel

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

// WorkspaceOverview declares the struct for workspace statistics overview.
type WorkspaceOverview struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id"`
	// The statistic overview for release stream job.
	StreamJobRelease *WorkspaceOverview_StreamJobRelease `protobuf:"bytes,2,opt,name=stream_job_release,json=streamJobRelease,proto3" json:"stream_job_release"`
	// The statistic overview for release sync job.
	SyncJobRelease *WorkspaceOverview_SyncJobRelease `protobuf:"bytes,3,opt,name=sync_job_release,json=syncJobRelease,proto3" json:"sync_job_release"`
	// The statistic overview for stream job instance.
	StreamJobInstance *WorkspaceOverview_StreamInstance `protobuf:"bytes,4,opt,name=stream_job_instance,json=streamJobInstance,proto3" json:"stream_job_instance"`
	// The statistic overview for sync job instance.
	SyncJobInstance *WorkspaceOverview_SyncInstance `protobuf:"bytes,5,opt,name=sync_job_instance,json=syncJobInstance,proto3" json:"sync_job_instance"`
	// The statistic overview for flink cluster.
	FlinkCluster *WorkspaceOverview_FlinkCluster `protobuf:"bytes,6,opt,name=flink_cluster,json=flinkCluster,proto3" json:"flink_cluster"`
}

func (x *WorkspaceOverview) Reset() {
	*x = WorkspaceOverview{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_observable_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WorkspaceOverview) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WorkspaceOverview) ProtoMessage() {}

func (x *WorkspaceOverview) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_observable_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WorkspaceOverview.ProtoReflect.Descriptor instead.
func (*WorkspaceOverview) Descriptor() ([]byte, []int) {
	return file_proto_types_model_observable_proto_rawDescGZIP(), []int{0}
}

func (x *WorkspaceOverview) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *WorkspaceOverview) GetStreamJobRelease() *WorkspaceOverview_StreamJobRelease {
	if x != nil {
		return x.StreamJobRelease
	}
	return nil
}

func (x *WorkspaceOverview) GetSyncJobRelease() *WorkspaceOverview_SyncJobRelease {
	if x != nil {
		return x.SyncJobRelease
	}
	return nil
}

func (x *WorkspaceOverview) GetStreamJobInstance() *WorkspaceOverview_StreamInstance {
	if x != nil {
		return x.StreamJobInstance
	}
	return nil
}

func (x *WorkspaceOverview) GetSyncJobInstance() *WorkspaceOverview_SyncInstance {
	if x != nil {
		return x.SyncJobInstance
	}
	return nil
}

func (x *WorkspaceOverview) GetFlinkCluster() *WorkspaceOverview_FlinkCluster {
	if x != nil {
		return x.FlinkCluster
	}
	return nil
}

type WorkspaceOverview_StreamJobRelease struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The total number of release stream job in the workspace.
	Total int64 `protobuf:"varint,1,opt,name=total,proto3" json:"total" gorm:"total;<-:false"`
	// The number of release stream job in the workspace that are in the inline status.
	Inline int64 `protobuf:"varint,2,opt,name=inline,proto3" json:"inline" gorm:"inline;<-:false"`
	// The number of release stream job in the workspace that are in the offline status.
	Offline int64 `protobuf:"varint,3,opt,name=offline,proto3" json:"offline" gorm:"offline;<-:false"`
	// The number of release stream job in the workspace that are in the finished status.
	Finished int64 `protobuf:"varint,4,opt,name=finished,proto3" json:"finished" gorm:"finished;<-:false"`
}

func (x *WorkspaceOverview_StreamJobRelease) Reset() {
	*x = WorkspaceOverview_StreamJobRelease{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_observable_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WorkspaceOverview_StreamJobRelease) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WorkspaceOverview_StreamJobRelease) ProtoMessage() {}

func (x *WorkspaceOverview_StreamJobRelease) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_observable_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WorkspaceOverview_StreamJobRelease.ProtoReflect.Descriptor instead.
func (*WorkspaceOverview_StreamJobRelease) Descriptor() ([]byte, []int) {
	return file_proto_types_model_observable_proto_rawDescGZIP(), []int{0, 0}
}

func (x *WorkspaceOverview_StreamJobRelease) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *WorkspaceOverview_StreamJobRelease) GetInline() int64 {
	if x != nil {
		return x.Inline
	}
	return 0
}

func (x *WorkspaceOverview_StreamJobRelease) GetOffline() int64 {
	if x != nil {
		return x.Offline
	}
	return 0
}

func (x *WorkspaceOverview_StreamJobRelease) GetFinished() int64 {
	if x != nil {
		return x.Finished
	}
	return 0
}

type WorkspaceOverview_SyncJobRelease struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The total number of release sync job in the workspace.
	Total int64 `protobuf:"varint,1,opt,name=total,proto3" json:"total" gorm:"total;<-:false"`
	// The number of release sync job in the workspace that are in the inline status.
	Inline int64 `protobuf:"varint,2,opt,name=inline,proto3" json:"inline" gorm:"inline;<-:false"`
	// The number of release sync job in the workspace that are in the offline status.
	Offline int64 `protobuf:"varint,3,opt,name=offline,proto3" json:"offline" gorm:"offline;<-:false"`
	// The number of release sync job in the workspace that are in the finished status.
	Finished int64 `protobuf:"varint,4,opt,name=finished,proto3" json:"finished" gorm:"finished;<-:false"`
}

func (x *WorkspaceOverview_SyncJobRelease) Reset() {
	*x = WorkspaceOverview_SyncJobRelease{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_observable_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WorkspaceOverview_SyncJobRelease) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WorkspaceOverview_SyncJobRelease) ProtoMessage() {}

func (x *WorkspaceOverview_SyncJobRelease) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_observable_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WorkspaceOverview_SyncJobRelease.ProtoReflect.Descriptor instead.
func (*WorkspaceOverview_SyncJobRelease) Descriptor() ([]byte, []int) {
	return file_proto_types_model_observable_proto_rawDescGZIP(), []int{0, 1}
}

func (x *WorkspaceOverview_SyncJobRelease) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *WorkspaceOverview_SyncJobRelease) GetInline() int64 {
	if x != nil {
		return x.Inline
	}
	return 0
}

func (x *WorkspaceOverview_SyncJobRelease) GetOffline() int64 {
	if x != nil {
		return x.Offline
	}
	return 0
}

func (x *WorkspaceOverview_SyncJobRelease) GetFinished() int64 {
	if x != nil {
		return x.Finished
	}
	return 0
}

type WorkspaceOverview_StreamInstance struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The total number of stream instance in the workspace.
	Total int64 `protobuf:"varint,1,opt,name=total,proto3" json:"total" gorm:"total;<-:false"`
	// The number of stream instance in the workspace that are in the pending state.
	Pending int64 `protobuf:"varint,2,opt,name=pending,proto3" json:"pending" gorm:"pending;<-:false"`
	// The number of stream instance in the workspace that are in the running state.
	Running int64 `protobuf:"varint,3,opt,name=running,proto3" json:"running" gorm:"running;<-:false"`
	// The number of stream instance in the workspace that are in the retrying state.
	Retrying int64 `protobuf:"varint,4,opt,name=retrying,proto3" json:"retrying" gorm:"retrying;<-:false"`
	// The number of stream instance in the workspace that are in the suspended state.
	Suspended int64 `protobuf:"varint,5,opt,name=suspended,proto3" json:"suspended" gorm:"suspended;<-:false"`
	// The number of stream instance in the workspace that are in the terminated state.
	Terminated int64 `protobuf:"varint,6,opt,name=terminated,proto3" json:"terminated" gorm:"terminated;<-:false"`
	// The number of stream instance in the workspace that are in the succeed state.
	Succeed int64 `protobuf:"varint,7,opt,name=succeed,proto3" json:"succeed" gorm:"succeed;<-:false"`
	// The number of stream instance in the workspace that are in the timeout state.
	Timeout int64 `protobuf:"varint,8,opt,name=timeout,proto3" json:"timeout" gorm:"timeout;<-:false"`
	// The number of stream instance in the workspace that are in the failed state.
	Failed int64 `protobuf:"varint,9,opt,name=failed,proto3" json:"failed" gorm:"failed;<-:false"`
}

func (x *WorkspaceOverview_StreamInstance) Reset() {
	*x = WorkspaceOverview_StreamInstance{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_observable_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WorkspaceOverview_StreamInstance) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WorkspaceOverview_StreamInstance) ProtoMessage() {}

func (x *WorkspaceOverview_StreamInstance) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_observable_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WorkspaceOverview_StreamInstance.ProtoReflect.Descriptor instead.
func (*WorkspaceOverview_StreamInstance) Descriptor() ([]byte, []int) {
	return file_proto_types_model_observable_proto_rawDescGZIP(), []int{0, 2}
}

func (x *WorkspaceOverview_StreamInstance) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetPending() int64 {
	if x != nil {
		return x.Pending
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetRunning() int64 {
	if x != nil {
		return x.Running
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetRetrying() int64 {
	if x != nil {
		return x.Retrying
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetSuspended() int64 {
	if x != nil {
		return x.Suspended
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetTerminated() int64 {
	if x != nil {
		return x.Terminated
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetSucceed() int64 {
	if x != nil {
		return x.Succeed
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetTimeout() int64 {
	if x != nil {
		return x.Timeout
	}
	return 0
}

func (x *WorkspaceOverview_StreamInstance) GetFailed() int64 {
	if x != nil {
		return x.Failed
	}
	return 0
}

type WorkspaceOverview_SyncInstance struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The total number of stream instance in the workspace.
	Total int64 `protobuf:"varint,1,opt,name=total,proto3" json:"total" gorm:"total;<-:false"`
	// The number of stream instance in the workspace that are in the pending state.
	Pending int64 `protobuf:"varint,2,opt,name=pending,proto3" json:"pending" gorm:"pending;<-:false"`
	// The number of stream instance in the workspace that are in the running state.
	Running int64 `protobuf:"varint,3,opt,name=running,proto3" json:"running" gorm:"running;<-:false"`
	// The number of stream instance in the workspace that are in the retrying state.
	Retrying int64 `protobuf:"varint,4,opt,name=retrying,proto3" json:"retrying" gorm:"retrying;<-:false"`
	// The number of stream instance in the workspace that are in the suspended state.
	Suspended int64 `protobuf:"varint,5,opt,name=suspended,proto3" json:"suspended" gorm:"suspended;<-:false"`
	// The number of stream instance in the workspace that are in the terminated state.
	Terminated int64 `protobuf:"varint,6,opt,name=terminated,proto3" json:"terminated" gorm:"terminated;<-:false"`
	// The number of stream instance in the workspace that are in the succeed state.
	Succeed int64 `protobuf:"varint,7,opt,name=succeed,proto3" json:"succeed" gorm:"succeed;<-:false"`
	// The number of stream instance in the workspace that are in the timeout state.
	Timeout int64 `protobuf:"varint,8,opt,name=timeout,proto3" json:"timeout" gorm:"timeout;<-:false"`
	// The number of stream instance in the workspace that are in the failed state.
	Failed int64 `protobuf:"varint,9,opt,name=failed,proto3" json:"failed" gorm:"failed;<-:false"`
}

func (x *WorkspaceOverview_SyncInstance) Reset() {
	*x = WorkspaceOverview_SyncInstance{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_observable_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WorkspaceOverview_SyncInstance) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WorkspaceOverview_SyncInstance) ProtoMessage() {}

func (x *WorkspaceOverview_SyncInstance) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_observable_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WorkspaceOverview_SyncInstance.ProtoReflect.Descriptor instead.
func (*WorkspaceOverview_SyncInstance) Descriptor() ([]byte, []int) {
	return file_proto_types_model_observable_proto_rawDescGZIP(), []int{0, 3}
}

func (x *WorkspaceOverview_SyncInstance) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetPending() int64 {
	if x != nil {
		return x.Pending
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetRunning() int64 {
	if x != nil {
		return x.Running
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetRetrying() int64 {
	if x != nil {
		return x.Retrying
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetSuspended() int64 {
	if x != nil {
		return x.Suspended
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetTerminated() int64 {
	if x != nil {
		return x.Terminated
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetSucceed() int64 {
	if x != nil {
		return x.Succeed
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetTimeout() int64 {
	if x != nil {
		return x.Timeout
	}
	return 0
}

func (x *WorkspaceOverview_SyncInstance) GetFailed() int64 {
	if x != nil {
		return x.Failed
	}
	return 0
}

type WorkspaceOverview_FlinkCluster struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The total number of flink cluster in the workspace.
	ClusterTotal int64 `protobuf:"varint,1,opt,name=cluster_total,json=clusterTotal,proto3" json:"cluster_total" gorm:"cluster_total;<-:false"`
	// The number of flink cluster in the workspace that are in the running status.
	ClusterRunning int64 `protobuf:"varint,2,opt,name=cluster_running,json=clusterRunning,proto3" json:"cluster_running" gorm:"cluster_running;<-:false"`
	// The number of flink cluster in the workspace that are in the stopped status.
	ClusterStopped int64 `protobuf:"varint,3,opt,name=cluster_stopped,json=clusterStopped,proto3" json:"cluster_stopped" gorm:"cluster_stopped;<-:false"`
	// The number of flink cluster in the workspace that are in the starting status.
	ClusterStarting int64 `protobuf:"varint,4,opt,name=cluster_starting,json=clusterStarting,proto3" json:"cluster_starting" gorm:"cluster_starting;<-:false"`
	// The number of flink cluster in the workspace that are in the exception status.
	ClusterException int64 `protobuf:"varint,5,opt,name=cluster_exception,json=clusterException,proto3" json:"cluster_exception" gorm:"cluster_exception;<-:false"`
	// The number of flink cluster in the workspace that are in the arrears status.
	ClusterArrears int64 `protobuf:"varint,6,opt,name=cluster_arrears,json=clusterArrears,proto3" json:"cluster_arrears" gorm:"cluster_arrears;<-:false"`
	// The total CU of flink cluster in the workspace.
	CuTotal float64 `protobuf:"fixed64,7,opt,name=cu_total,json=cuTotal,proto3" json:"cu_total" gorm:"cu_total;<-:false"`
	// The number CU of flink cluster in the workspace that are in the running status.
	CuRunning float64 `protobuf:"fixed64,8,opt,name=cu_running,json=cuRunning,proto3" json:"cu_running" gorm:"cu_running;<-:false"`
	// The number CU of flink cluster in the workspace that are in the stopped status.
	CuStopped float64 `protobuf:"fixed64,9,opt,name=cu_stopped,json=cuStopped,proto3" json:"cu_stopped" gorm:"cu_stopped;<-:false"`
	// The number CU of flink cluster in the workspace that are in the starting status.
	CuStarting float64 `protobuf:"fixed64,10,opt,name=cu_starting,json=cuStarting,proto3" json:"cu_starting" gorm:"cu_starting;<-:false"`
	// The number CU of flink cluster in the workspace that are in the exception status.
	CuException float64 `protobuf:"fixed64,11,opt,name=cu_exception,json=cuException,proto3" json:"cu_exception" gorm:"cu_exception;<-:false"`
	// The number CU of flink cluster in the workspace that are in the arrears status.
	CuArrears float64 `protobuf:"fixed64,12,opt,name=cu_arrears,json=cuArrears,proto3" json:"cu_arrears" gorm:"cu_arrears;<-:false"`
}

func (x *WorkspaceOverview_FlinkCluster) Reset() {
	*x = WorkspaceOverview_FlinkCluster{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_observable_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WorkspaceOverview_FlinkCluster) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WorkspaceOverview_FlinkCluster) ProtoMessage() {}

func (x *WorkspaceOverview_FlinkCluster) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_observable_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WorkspaceOverview_FlinkCluster.ProtoReflect.Descriptor instead.
func (*WorkspaceOverview_FlinkCluster) Descriptor() ([]byte, []int) {
	return file_proto_types_model_observable_proto_rawDescGZIP(), []int{0, 4}
}

func (x *WorkspaceOverview_FlinkCluster) GetClusterTotal() int64 {
	if x != nil {
		return x.ClusterTotal
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetClusterRunning() int64 {
	if x != nil {
		return x.ClusterRunning
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetClusterStopped() int64 {
	if x != nil {
		return x.ClusterStopped
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetClusterStarting() int64 {
	if x != nil {
		return x.ClusterStarting
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetClusterException() int64 {
	if x != nil {
		return x.ClusterException
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetClusterArrears() int64 {
	if x != nil {
		return x.ClusterArrears
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetCuTotal() float64 {
	if x != nil {
		return x.CuTotal
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetCuRunning() float64 {
	if x != nil {
		return x.CuRunning
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetCuStopped() float64 {
	if x != nil {
		return x.CuStopped
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetCuStarting() float64 {
	if x != nil {
		return x.CuStarting
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetCuException() float64 {
	if x != nil {
		return x.CuException
	}
	return 0
}

func (x *WorkspaceOverview_FlinkCluster) GetCuArrears() float64 {
	if x != nil {
		return x.CuArrears
	}
	return 0
}

var File_proto_types_model_observable_proto protoreflect.FileDescriptor

var file_proto_types_model_observable_proto_rawDesc = []byte{
	0x0a, 0x22, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x6f, 0x62, 0x73, 0x65, 0x72, 0x76, 0x61, 0x62, 0x6c, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0x9e, 0x0d, 0x0a, 0x11, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x4f, 0x76,
	0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d,
	0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x57, 0x0a, 0x12, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x5f, 0x6a, 0x6f, 0x62, 0x5f, 0x72, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x29, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x4f, 0x76, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x2e, 0x53, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x52, 0x10, 0x73,
	0x74, 0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x12,
	0x51, 0x0a, 0x10, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x6a, 0x6f, 0x62, 0x5f, 0x72, 0x65, 0x6c, 0x65,
	0x61, 0x73, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x27, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x4f, 0x76, 0x65, 0x72, 0x76,
	0x69, 0x65, 0x77, 0x2e, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x6c, 0x65, 0x61,
	0x73, 0x65, 0x52, 0x0e, 0x73, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x6c, 0x65, 0x61,
	0x73, 0x65, 0x12, 0x57, 0x0a, 0x13, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x5f, 0x6a, 0x6f, 0x62,
	0x5f, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x27, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x4f, 0x76, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x2e, 0x53, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x52, 0x11, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d,
	0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x12, 0x51, 0x0a, 0x11, 0x73,
	0x79, 0x6e, 0x63, 0x5f, 0x6a, 0x6f, 0x62, 0x5f, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65,
	0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57,
	0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x4f, 0x76, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77,
	0x2e, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x52, 0x0f, 0x73,
	0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x12, 0x4a,
	0x0a, 0x0d, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x18,
	0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x25, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57, 0x6f,
	0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x4f, 0x76, 0x65, 0x72, 0x76, 0x69, 0x65, 0x77, 0x2e,
	0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x52, 0x0c, 0x66, 0x6c,
	0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x1a, 0x76, 0x0a, 0x10, 0x53, 0x74,
	0x72, 0x65, 0x61, 0x6d, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x6c, 0x65, 0x61, 0x73, 0x65, 0x12, 0x14,
	0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x12, 0x16, 0x0a, 0x06, 0x69, 0x6e, 0x6c, 0x69, 0x6e, 0x65, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x06, 0x69, 0x6e, 0x6c, 0x69, 0x6e, 0x65, 0x12, 0x18, 0x0a, 0x07,
	0x6f, 0x66, 0x66, 0x6c, 0x69, 0x6e, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x6f,
	0x66, 0x66, 0x6c, 0x69, 0x6e, 0x65, 0x12, 0x1a, 0x0a, 0x08, 0x66, 0x69, 0x6e, 0x69, 0x73, 0x68,
	0x65, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08, 0x66, 0x69, 0x6e, 0x69, 0x73, 0x68,
	0x65, 0x64, 0x1a, 0x74, 0x0a, 0x0e, 0x53, 0x79, 0x6e, 0x63, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x6c,
	0x65, 0x61, 0x73, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x12, 0x16, 0x0a, 0x06, 0x69, 0x6e,
	0x6c, 0x69, 0x6e, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x06, 0x69, 0x6e, 0x6c, 0x69,
	0x6e, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x6f, 0x66, 0x66, 0x6c, 0x69, 0x6e, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x07, 0x6f, 0x66, 0x66, 0x6c, 0x69, 0x6e, 0x65, 0x12, 0x1a, 0x0a, 0x08,
	0x66, 0x69, 0x6e, 0x69, 0x73, 0x68, 0x65, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08,
	0x66, 0x69, 0x6e, 0x69, 0x73, 0x68, 0x65, 0x64, 0x1a, 0x80, 0x02, 0x0a, 0x0e, 0x53, 0x74, 0x72,
	0x65, 0x61, 0x6d, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x12, 0x18, 0x0a, 0x07, 0x70, 0x65, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x03, 0x52, 0x07, 0x70, 0x65, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x18, 0x0a, 0x07, 0x72,
	0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x72, 0x75,
	0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x12, 0x1a, 0x0a, 0x08, 0x72, 0x65, 0x74, 0x72, 0x79, 0x69, 0x6e,
	0x67, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08, 0x72, 0x65, 0x74, 0x72, 0x79, 0x69, 0x6e,
	0x67, 0x12, 0x1c, 0x0a, 0x09, 0x73, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x65, 0x64, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x73, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x65, 0x64, 0x12,
	0x1e, 0x0a, 0x0a, 0x74, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x64, 0x18, 0x06, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x0a, 0x74, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x64, 0x12,
	0x18, 0x0a, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x65, 0x64, 0x18, 0x07, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x65, 0x64, 0x12, 0x18, 0x0a, 0x07, 0x74, 0x69, 0x6d,
	0x65, 0x6f, 0x75, 0x74, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x74, 0x69, 0x6d, 0x65,
	0x6f, 0x75, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x66, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x18, 0x09, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x06, 0x66, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x1a, 0xfe, 0x01, 0x0a, 0x0c,
	0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x12, 0x14, 0x0a, 0x05,
	0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74,
	0x61, 0x6c, 0x12, 0x18, 0x0a, 0x07, 0x70, 0x65, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x03, 0x52, 0x07, 0x70, 0x65, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x18, 0x0a, 0x07,
	0x72, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x72,
	0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x12, 0x1a, 0x0a, 0x08, 0x72, 0x65, 0x74, 0x72, 0x79, 0x69,
	0x6e, 0x67, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x08, 0x72, 0x65, 0x74, 0x72, 0x79, 0x69,
	0x6e, 0x67, 0x12, 0x1c, 0x0a, 0x09, 0x73, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x65, 0x64, 0x18,
	0x05, 0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x73, 0x75, 0x73, 0x70, 0x65, 0x6e, 0x64, 0x65, 0x64,
	0x12, 0x1e, 0x0a, 0x0a, 0x74, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x64, 0x18, 0x06,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x0a, 0x74, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61, 0x74, 0x65, 0x64,
	0x12, 0x18, 0x0a, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x65, 0x64, 0x18, 0x07, 0x20, 0x01, 0x28,
	0x03, 0x52, 0x07, 0x73, 0x75, 0x63, 0x63, 0x65, 0x65, 0x64, 0x12, 0x18, 0x0a, 0x07, 0x74, 0x69,
	0x6d, 0x65, 0x6f, 0x75, 0x74, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x52, 0x07, 0x74, 0x69, 0x6d,
	0x65, 0x6f, 0x75, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x66, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x18, 0x09,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x06, 0x66, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x1a, 0xc2, 0x03, 0x0a,
	0x0c, 0x46, 0x6c, 0x69, 0x6e, 0x6b, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x12, 0x23, 0x0a,
	0x0d, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x5f, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x0c, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x54, 0x6f, 0x74,
	0x61, 0x6c, 0x12, 0x27, 0x0a, 0x0f, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x5f, 0x72, 0x75,
	0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0e, 0x63, 0x6c, 0x75,
	0x73, 0x74, 0x65, 0x72, 0x52, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x12, 0x27, 0x0a, 0x0f, 0x63,
	0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x5f, 0x73, 0x74, 0x6f, 0x70, 0x70, 0x65, 0x64, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x0e, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x53, 0x74, 0x6f,
	0x70, 0x70, 0x65, 0x64, 0x12, 0x29, 0x0a, 0x10, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x5f,
	0x73, 0x74, 0x61, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x18, 0x04, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0f,
	0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x53, 0x74, 0x61, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x12,
	0x2b, 0x0a, 0x11, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x5f, 0x65, 0x78, 0x63, 0x65, 0x70,
	0x74, 0x69, 0x6f, 0x6e, 0x18, 0x05, 0x20, 0x01, 0x28, 0x03, 0x52, 0x10, 0x63, 0x6c, 0x75, 0x73,
	0x74, 0x65, 0x72, 0x45, 0x78, 0x63, 0x65, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x27, 0x0a, 0x0f,
	0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x5f, 0x61, 0x72, 0x72, 0x65, 0x61, 0x72, 0x73, 0x18,
	0x06, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0e, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x41, 0x72,
	0x72, 0x65, 0x61, 0x72, 0x73, 0x12, 0x19, 0x0a, 0x08, 0x63, 0x75, 0x5f, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x18, 0x07, 0x20, 0x01, 0x28, 0x01, 0x52, 0x07, 0x63, 0x75, 0x54, 0x6f, 0x74, 0x61, 0x6c,
	0x12, 0x1d, 0x0a, 0x0a, 0x63, 0x75, 0x5f, 0x72, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x18, 0x08,
	0x20, 0x01, 0x28, 0x01, 0x52, 0x09, 0x63, 0x75, 0x52, 0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x12,
	0x1d, 0x0a, 0x0a, 0x63, 0x75, 0x5f, 0x73, 0x74, 0x6f, 0x70, 0x70, 0x65, 0x64, 0x18, 0x09, 0x20,
	0x01, 0x28, 0x01, 0x52, 0x09, 0x63, 0x75, 0x53, 0x74, 0x6f, 0x70, 0x70, 0x65, 0x64, 0x12, 0x1f,
	0x0a, 0x0b, 0x63, 0x75, 0x5f, 0x73, 0x74, 0x61, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x18, 0x0a, 0x20,
	0x01, 0x28, 0x01, 0x52, 0x0a, 0x63, 0x75, 0x53, 0x74, 0x61, 0x72, 0x74, 0x69, 0x6e, 0x67, 0x12,
	0x21, 0x0a, 0x0c, 0x63, 0x75, 0x5f, 0x65, 0x78, 0x63, 0x65, 0x70, 0x74, 0x69, 0x6f, 0x6e, 0x18,
	0x0b, 0x20, 0x01, 0x28, 0x01, 0x52, 0x0b, 0x63, 0x75, 0x45, 0x78, 0x63, 0x65, 0x70, 0x74, 0x69,
	0x6f, 0x6e, 0x12, 0x1d, 0x0a, 0x0a, 0x63, 0x75, 0x5f, 0x61, 0x72, 0x72, 0x65, 0x61, 0x72, 0x73,
	0x18, 0x0c, 0x20, 0x01, 0x28, 0x01, 0x52, 0x09, 0x63, 0x75, 0x41, 0x72, 0x72, 0x65, 0x61, 0x72,
	0x73, 0x42, 0x6a, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e,
	0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e,
	0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x42, 0x0f, 0x50, 0x42, 0x4d, 0x6f, 0x64, 0x65, 0x6c,
	0x4f, 0x62, 0x73, 0x65, 0x72, 0x76, 0x65, 0x72, 0x50, 0x00, 0x5a, 0x31, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62,
	0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_observable_proto_rawDescOnce sync.Once
	file_proto_types_model_observable_proto_rawDescData = file_proto_types_model_observable_proto_rawDesc
)

func file_proto_types_model_observable_proto_rawDescGZIP() []byte {
	file_proto_types_model_observable_proto_rawDescOnce.Do(func() {
		file_proto_types_model_observable_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_observable_proto_rawDescData)
	})
	return file_proto_types_model_observable_proto_rawDescData
}

var file_proto_types_model_observable_proto_msgTypes = make([]protoimpl.MessageInfo, 6)
var file_proto_types_model_observable_proto_goTypes = []interface{}{
	(*WorkspaceOverview)(nil),                  // 0: model.WorkspaceOverview
	(*WorkspaceOverview_StreamJobRelease)(nil), // 1: model.WorkspaceOverview.StreamJobRelease
	(*WorkspaceOverview_SyncJobRelease)(nil),   // 2: model.WorkspaceOverview.SyncJobRelease
	(*WorkspaceOverview_StreamInstance)(nil),   // 3: model.WorkspaceOverview.StreamInstance
	(*WorkspaceOverview_SyncInstance)(nil),     // 4: model.WorkspaceOverview.SyncInstance
	(*WorkspaceOverview_FlinkCluster)(nil),     // 5: model.WorkspaceOverview.FlinkCluster
}
var file_proto_types_model_observable_proto_depIdxs = []int32{
	1, // 0: model.WorkspaceOverview.stream_job_release:type_name -> model.WorkspaceOverview.StreamJobRelease
	2, // 1: model.WorkspaceOverview.sync_job_release:type_name -> model.WorkspaceOverview.SyncJobRelease
	3, // 2: model.WorkspaceOverview.stream_job_instance:type_name -> model.WorkspaceOverview.StreamInstance
	4, // 3: model.WorkspaceOverview.sync_job_instance:type_name -> model.WorkspaceOverview.SyncInstance
	5, // 4: model.WorkspaceOverview.flink_cluster:type_name -> model.WorkspaceOverview.FlinkCluster
	5, // [5:5] is the sub-list for method output_type
	5, // [5:5] is the sub-list for method input_type
	5, // [5:5] is the sub-list for extension type_name
	5, // [5:5] is the sub-list for extension extendee
	0, // [0:5] is the sub-list for field type_name
}

func init() { file_proto_types_model_observable_proto_init() }
func file_proto_types_model_observable_proto_init() {
	if File_proto_types_model_observable_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_observable_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WorkspaceOverview); i {
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
		file_proto_types_model_observable_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WorkspaceOverview_StreamJobRelease); i {
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
		file_proto_types_model_observable_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WorkspaceOverview_SyncJobRelease); i {
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
		file_proto_types_model_observable_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WorkspaceOverview_StreamInstance); i {
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
		file_proto_types_model_observable_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WorkspaceOverview_SyncInstance); i {
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
		file_proto_types_model_observable_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WorkspaceOverview_FlinkCluster); i {
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
			RawDescriptor: file_proto_types_model_observable_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   6,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_observable_proto_goTypes,
		DependencyIndexes: file_proto_types_model_observable_proto_depIdxs,
		MessageInfos:      file_proto_types_model_observable_proto_msgTypes,
	}.Build()
	File_proto_types_model_observable_proto = out.File
	file_proto_types_model_observable_proto_rawDesc = nil
	file_proto_types_model_observable_proto_goTypes = nil
	file_proto_types_model_observable_proto_depIdxs = nil
}
