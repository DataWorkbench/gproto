// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/dataservice_manage.proto

package pbresponse

import (
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
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

type ListDataServiceClusters struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.DataServiceCluster `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	HasMore bool                          `protobuf:"varint,2,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
	Total   int64                         `protobuf:"varint,3,opt,name=total,proto3" json:"total"`
}

func (x *ListDataServiceClusters) Reset() {
	*x = ListDataServiceClusters{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListDataServiceClusters) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListDataServiceClusters) ProtoMessage() {}

func (x *ListDataServiceClusters) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListDataServiceClusters.ProtoReflect.Descriptor instead.
func (*ListDataServiceClusters) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{0}
}

func (x *ListDataServiceClusters) GetInfos() []*pbmodel.DataServiceCluster {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListDataServiceClusters) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

func (x *ListDataServiceClusters) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

type DescribeDataServiceCluster struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ServiceCluster *pbmodel.DataServiceCluster `protobuf:"bytes,1,opt,name=service_cluster,json=serviceCluster,proto3" json:"service_cluster"`
}

func (x *DescribeDataServiceCluster) Reset() {
	*x = DescribeDataServiceCluster{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeDataServiceCluster) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeDataServiceCluster) ProtoMessage() {}

func (x *DescribeDataServiceCluster) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeDataServiceCluster.ProtoReflect.Descriptor instead.
func (*DescribeDataServiceCluster) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{1}
}

func (x *DescribeDataServiceCluster) GetServiceCluster() *pbmodel.DataServiceCluster {
	if x != nil {
		return x.ServiceCluster
	}
	return nil
}

type CreateDataServiceCluster struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateDataServiceCluster) Reset() {
	*x = CreateDataServiceCluster{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateDataServiceCluster) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateDataServiceCluster) ProtoMessage() {}

func (x *CreateDataServiceCluster) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateDataServiceCluster.ProtoReflect.Descriptor instead.
func (*CreateDataServiceCluster) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{2}
}

func (x *CreateDataServiceCluster) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type ListApiGroups struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.ApiGroup `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	HasMore bool                `protobuf:"varint,2,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
	Total   int64               `protobuf:"varint,3,opt,name=total,proto3" json:"total"`
}

func (x *ListApiGroups) Reset() {
	*x = ListApiGroups{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListApiGroups) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListApiGroups) ProtoMessage() {}

func (x *ListApiGroups) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListApiGroups.ProtoReflect.Descriptor instead.
func (*ListApiGroups) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{3}
}

func (x *ListApiGroups) GetInfos() []*pbmodel.ApiGroup {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListApiGroups) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

func (x *ListApiGroups) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

type CreateApiGroup struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateApiGroup) Reset() {
	*x = CreateApiGroup{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateApiGroup) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateApiGroup) ProtoMessage() {}

func (x *CreateApiGroup) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateApiGroup.ProtoReflect.Descriptor instead.
func (*CreateApiGroup) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{4}
}

func (x *CreateApiGroup) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type ListCustomerApis struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.ApiConfig `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	Total   int64                `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore bool                 `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListCustomerApis) Reset() {
	*x = ListCustomerApis{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListCustomerApis) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListCustomerApis) ProtoMessage() {}

func (x *ListCustomerApis) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListCustomerApis.ProtoReflect.Descriptor instead.
func (*ListCustomerApis) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{5}
}

func (x *ListCustomerApis) GetInfos() []*pbmodel.ApiConfig {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListCustomerApis) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListCustomerApis) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type DescribeCustomerApi struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ApiConfig      *pbmodel.ApiConfig           `protobuf:"bytes,1,opt,name=api_config,json=apiConfig,proto3" json:"api_config"`
	RequestParams  []*pbmodel.ApiRequestParams  `protobuf:"bytes,2,rep,name=request_params,json=requestParams,proto3" json:"request_params"`
	ResponseParams []*pbmodel.ApiResponseParams `protobuf:"bytes,3,rep,name=response_params,json=responseParams,proto3" json:"response_params"`
}

func (x *DescribeCustomerApi) Reset() {
	*x = DescribeCustomerApi{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeCustomerApi) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeCustomerApi) ProtoMessage() {}

func (x *DescribeCustomerApi) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeCustomerApi.ProtoReflect.Descriptor instead.
func (*DescribeCustomerApi) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{6}
}

func (x *DescribeCustomerApi) GetApiConfig() *pbmodel.ApiConfig {
	if x != nil {
		return x.ApiConfig
	}
	return nil
}

func (x *DescribeCustomerApi) GetRequestParams() []*pbmodel.ApiRequestParams {
	if x != nil {
		return x.RequestParams
	}
	return nil
}

func (x *DescribeCustomerApi) GetResponseParams() []*pbmodel.ApiResponseParams {
	if x != nil {
		return x.ResponseParams
	}
	return nil
}

type CreateCustomerApi struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateCustomerApi) Reset() {
	*x = CreateCustomerApi{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateCustomerApi) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateCustomerApi) ProtoMessage() {}

func (x *CreateCustomerApi) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateCustomerApi.ProtoReflect.Descriptor instead.
func (*CreateCustomerApi) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{7}
}

func (x *CreateCustomerApi) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type DescribeApiVersion struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	ApiVersion     *pbmodel.ApiVersion          `protobuf:"bytes,1,opt,name=api_version,json=apiVersion,proto3" json:"api_version"`
	RequestParams  []*pbmodel.ApiRequestParams  `protobuf:"bytes,2,rep,name=request_params,json=requestParams,proto3" json:"request_params"`
	ResponseParams []*pbmodel.ApiResponseParams `protobuf:"bytes,3,rep,name=response_params,json=responseParams,proto3" json:"response_params"`
}

func (x *DescribeApiVersion) Reset() {
	*x = DescribeApiVersion{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeApiVersion) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeApiVersion) ProtoMessage() {}

func (x *DescribeApiVersion) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeApiVersion.ProtoReflect.Descriptor instead.
func (*DescribeApiVersion) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{8}
}

func (x *DescribeApiVersion) GetApiVersion() *pbmodel.ApiVersion {
	if x != nil {
		return x.ApiVersion
	}
	return nil
}

func (x *DescribeApiVersion) GetRequestParams() []*pbmodel.ApiRequestParams {
	if x != nil {
		return x.RequestParams
	}
	return nil
}

func (x *DescribeApiVersion) GetResponseParams() []*pbmodel.ApiResponseParams {
	if x != nil {
		return x.ResponseParams
	}
	return nil
}

type ListApiVersions struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.ApiVersion `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	Total   int64                 `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore bool                  `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListApiVersions) Reset() {
	*x = ListApiVersions{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListApiVersions) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListApiVersions) ProtoMessage() {}

func (x *ListApiVersions) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListApiVersions.ProtoReflect.Descriptor instead.
func (*ListApiVersions) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{9}
}

func (x *ListApiVersions) GetInfos() []*pbmodel.ApiVersion {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListApiVersions) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListApiVersions) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type TestCustomerApi struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Logs            string `protobuf:"bytes,1,opt,name=logs,proto3" json:"logs"`
	ResponseContent string `protobuf:"bytes,2,opt,name=response_content,json=responseContent,proto3" json:"response_content"`
}

func (x *TestCustomerApi) Reset() {
	*x = TestCustomerApi{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *TestCustomerApi) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*TestCustomerApi) ProtoMessage() {}

func (x *TestCustomerApi) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_dataservice_manage_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use TestCustomerApi.ProtoReflect.Descriptor instead.
func (*TestCustomerApi) Descriptor() ([]byte, []int) {
	return file_proto_types_response_dataservice_manage_proto_rawDescGZIP(), []int{10}
}

func (x *TestCustomerApi) GetLogs() string {
	if x != nil {
		return x.Logs
	}
	return ""
}

func (x *TestCustomerApi) GetResponseContent() string {
	if x != nil {
		return x.ResponseContent
	}
	return ""
}

var File_proto_types_response_dataservice_manage_proto protoreflect.FileDescriptor

var file_proto_types_response_dataservice_manage_proto_rawDesc = []byte{
	0x0a, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12,
	0x08, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x1a, 0x23, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x64, 0x61, 0x74,
	0x61, 0x73, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x7b,
	0x0a, 0x17, 0x4c, 0x69, 0x73, 0x74, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63,
	0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x73, 0x12, 0x2f, 0x0a, 0x05, 0x69, 0x6e, 0x66,
	0x6f, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73,
	0x74, 0x65, 0x72, 0x52, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61,
	0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61,
	0x73, 0x4d, 0x6f, 0x72, 0x65, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x22, 0x60, 0x0a, 0x1a, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x12, 0x42, 0x0a, 0x0f, 0x73, 0x65, 0x72,
	0x76, 0x69, 0x63, 0x65, 0x5f, 0x63, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x0b, 0x32, 0x19, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x52, 0x0e, 0x73,
	0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x22, 0x2a, 0x0a,
	0x18, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69,
	0x63, 0x65, 0x43, 0x6c, 0x75, 0x73, 0x74, 0x65, 0x72, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x22, 0x67, 0x0a, 0x0d, 0x4c, 0x69, 0x73,
	0x74, 0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x73, 0x12, 0x25, 0x0a, 0x05, 0x69, 0x6e,
	0x66, 0x6f, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0f, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x41, 0x70, 0x69, 0x47, 0x72, 0x6f, 0x75, 0x70, 0x52, 0x05, 0x69, 0x6e, 0x66, 0x6f,
	0x73, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x12, 0x14, 0x0a, 0x05,
	0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74,
	0x61, 0x6c, 0x22, 0x20, 0x0a, 0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x41, 0x70, 0x69, 0x47,
	0x72, 0x6f, 0x75, 0x70, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x02, 0x69, 0x64, 0x22, 0x6b, 0x0a, 0x10, 0x4c, 0x69, 0x73, 0x74, 0x43, 0x75, 0x73, 0x74,
	0x6f, 0x6d, 0x65, 0x72, 0x41, 0x70, 0x69, 0x73, 0x12, 0x26, 0x0a, 0x05, 0x69, 0x6e, 0x66, 0x6f,
	0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x52, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73,
	0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52,
	0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f,
	0x72, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72,
	0x65, 0x22, 0xc9, 0x01, 0x0a, 0x13, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x43, 0x75,
	0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x41, 0x70, 0x69, 0x12, 0x2f, 0x0a, 0x0a, 0x61, 0x70, 0x69,
	0x5f, 0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x52,
	0x09, 0x61, 0x70, 0x69, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x3e, 0x0a, 0x0e, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x18, 0x02, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x70, 0x69, 0x52, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x52, 0x0d, 0x72, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x12, 0x41, 0x0a, 0x0f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x5f, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x18, 0x03, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x70, 0x69, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x52, 0x0e, 0x72,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x22, 0x23, 0x0a,
	0x11, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x41,
	0x70, 0x69, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02,
	0x69, 0x64, 0x22, 0xcb, 0x01, 0x0a, 0x12, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x41,
	0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x32, 0x0a, 0x0b, 0x61, 0x70, 0x69,
	0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11,
	0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f,
	0x6e, 0x52, 0x0a, 0x61, 0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x3e, 0x0a,
	0x0e, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x5f, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x18,
	0x02, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x70,
	0x69, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x52, 0x0d,
	0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73, 0x12, 0x41, 0x0a,
	0x0f, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x5f, 0x70, 0x61, 0x72, 0x61, 0x6d, 0x73,
	0x18, 0x03, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x18, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41,
	0x70, 0x69, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73,
	0x52, 0x0e, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x50, 0x61, 0x72, 0x61, 0x6d, 0x73,
	0x22, 0x6b, 0x0a, 0x0f, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x70, 0x69, 0x56, 0x65, 0x72, 0x73, 0x69,
	0x6f, 0x6e, 0x73, 0x12, 0x27, 0x0a, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x18, 0x01, 0x20, 0x03,
	0x28, 0x0b, 0x32, 0x11, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x70, 0x69, 0x56, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x52, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x12, 0x14, 0x0a, 0x05,
	0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74,
	0x61, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x22, 0x50, 0x0a,
	0x0f, 0x54, 0x65, 0x73, 0x74, 0x43, 0x75, 0x73, 0x74, 0x6f, 0x6d, 0x65, 0x72, 0x41, 0x70, 0x69,
	0x12, 0x12, 0x0a, 0x04, 0x6c, 0x6f, 0x67, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04,
	0x6c, 0x6f, 0x67, 0x73, 0x12, 0x29, 0x0a, 0x10, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x5f, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f,
	0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x43, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x42,
	0x7c, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73,
	0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62,
	0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x1b, 0x50, 0x42, 0x52, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x44, 0x61, 0x74, 0x61, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x4d,
	0x61, 0x6e, 0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63,
	0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_response_dataservice_manage_proto_rawDescOnce sync.Once
	file_proto_types_response_dataservice_manage_proto_rawDescData = file_proto_types_response_dataservice_manage_proto_rawDesc
)

func file_proto_types_response_dataservice_manage_proto_rawDescGZIP() []byte {
	file_proto_types_response_dataservice_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_response_dataservice_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_dataservice_manage_proto_rawDescData)
	})
	return file_proto_types_response_dataservice_manage_proto_rawDescData
}

var file_proto_types_response_dataservice_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 11)
var file_proto_types_response_dataservice_manage_proto_goTypes = []interface{}{
	(*ListDataServiceClusters)(nil),    // 0: response.ListDataServiceClusters
	(*DescribeDataServiceCluster)(nil), // 1: response.DescribeDataServiceCluster
	(*CreateDataServiceCluster)(nil),   // 2: response.CreateDataServiceCluster
	(*ListApiGroups)(nil),              // 3: response.ListApiGroups
	(*CreateApiGroup)(nil),             // 4: response.CreateApiGroup
	(*ListCustomerApis)(nil),           // 5: response.ListCustomerApis
	(*DescribeCustomerApi)(nil),        // 6: response.DescribeCustomerApi
	(*CreateCustomerApi)(nil),          // 7: response.CreateCustomerApi
	(*DescribeApiVersion)(nil),         // 8: response.DescribeApiVersion
	(*ListApiVersions)(nil),            // 9: response.ListApiVersions
	(*TestCustomerApi)(nil),            // 10: response.TestCustomerApi
	(*pbmodel.DataServiceCluster)(nil), // 11: model.DataServiceCluster
	(*pbmodel.ApiGroup)(nil),           // 12: model.ApiGroup
	(*pbmodel.ApiConfig)(nil),          // 13: model.ApiConfig
	(*pbmodel.ApiRequestParams)(nil),   // 14: model.ApiRequestParams
	(*pbmodel.ApiResponseParams)(nil),  // 15: model.ApiResponseParams
	(*pbmodel.ApiVersion)(nil),         // 16: model.ApiVersion
}
var file_proto_types_response_dataservice_manage_proto_depIdxs = []int32{
	11, // 0: response.ListDataServiceClusters.infos:type_name -> model.DataServiceCluster
	11, // 1: response.DescribeDataServiceCluster.service_cluster:type_name -> model.DataServiceCluster
	12, // 2: response.ListApiGroups.infos:type_name -> model.ApiGroup
	13, // 3: response.ListCustomerApis.infos:type_name -> model.ApiConfig
	13, // 4: response.DescribeCustomerApi.api_config:type_name -> model.ApiConfig
	14, // 5: response.DescribeCustomerApi.request_params:type_name -> model.ApiRequestParams
	15, // 6: response.DescribeCustomerApi.response_params:type_name -> model.ApiResponseParams
	16, // 7: response.DescribeApiVersion.api_version:type_name -> model.ApiVersion
	14, // 8: response.DescribeApiVersion.request_params:type_name -> model.ApiRequestParams
	15, // 9: response.DescribeApiVersion.response_params:type_name -> model.ApiResponseParams
	16, // 10: response.ListApiVersions.infos:type_name -> model.ApiVersion
	11, // [11:11] is the sub-list for method output_type
	11, // [11:11] is the sub-list for method input_type
	11, // [11:11] is the sub-list for extension type_name
	11, // [11:11] is the sub-list for extension extendee
	0,  // [0:11] is the sub-list for field type_name
}

func init() { file_proto_types_response_dataservice_manage_proto_init() }
func file_proto_types_response_dataservice_manage_proto_init() {
	if File_proto_types_response_dataservice_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_dataservice_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListDataServiceClusters); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeDataServiceCluster); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateDataServiceCluster); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListApiGroups); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateApiGroup); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListCustomerApis); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeCustomerApi); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateCustomerApi); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeApiVersion); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListApiVersions); i {
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
		file_proto_types_response_dataservice_manage_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*TestCustomerApi); i {
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
			RawDescriptor: file_proto_types_response_dataservice_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   11,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_dataservice_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_response_dataservice_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_response_dataservice_manage_proto_msgTypes,
	}.Build()
	File_proto_types_response_dataservice_manage_proto = out.File
	file_proto_types_response_dataservice_manage_proto_rawDesc = nil
	file_proto_types_response_dataservice_manage_proto_goTypes = nil
	file_proto_types_response_dataservice_manage_proto_depIdxs = nil
}
