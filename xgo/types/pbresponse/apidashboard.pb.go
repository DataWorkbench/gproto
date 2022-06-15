// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/apidashboard.proto

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

type CreateRoute struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateRoute) Reset() {
	*x = CreateRoute{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateRoute) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateRoute) ProtoMessage() {}

func (x *CreateRoute) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateRoute.ProtoReflect.Descriptor instead.
func (*CreateRoute) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{0}
}

func (x *CreateRoute) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type ListRoutes struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Entities []*pbmodel.Route `protobuf:"bytes,1,rep,name=entities,proto3" json:"entities"`
	Total    int64            `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore  bool             `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListRoutes) Reset() {
	*x = ListRoutes{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListRoutes) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListRoutes) ProtoMessage() {}

func (x *ListRoutes) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListRoutes.ProtoReflect.Descriptor instead.
func (*ListRoutes) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{1}
}

func (x *ListRoutes) GetEntities() []*pbmodel.Route {
	if x != nil {
		return x.Entities
	}
	return nil
}

func (x *ListRoutes) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListRoutes) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type ListUpstreams struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Entities []*pbmodel.UpstreamEntity `protobuf:"bytes,1,rep,name=entities,proto3" json:"entities"`
	Total    int64                     `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore  bool                      `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListUpstreams) Reset() {
	*x = ListUpstreams{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListUpstreams) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListUpstreams) ProtoMessage() {}

func (x *ListUpstreams) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListUpstreams.ProtoReflect.Descriptor instead.
func (*ListUpstreams) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{2}
}

func (x *ListUpstreams) GetEntities() []*pbmodel.UpstreamEntity {
	if x != nil {
		return x.Entities
	}
	return nil
}

func (x *ListUpstreams) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListUpstreams) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type CreateUpstream struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateUpstream) Reset() {
	*x = CreateUpstream{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateUpstream) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateUpstream) ProtoMessage() {}

func (x *CreateUpstream) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateUpstream.ProtoReflect.Descriptor instead.
func (*CreateUpstream) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{3}
}

func (x *CreateUpstream) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type CreateSSL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateSSL) Reset() {
	*x = CreateSSL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateSSL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateSSL) ProtoMessage() {}

func (x *CreateSSL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateSSL.ProtoReflect.Descriptor instead.
func (*CreateSSL) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{4}
}

func (x *CreateSSL) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type ListSSLs struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Entities []*pbmodel.SSL `protobuf:"bytes,1,rep,name=entities,proto3" json:"entities"`
	Total    int64          `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
}

func (x *ListSSLs) Reset() {
	*x = ListSSLs{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListSSLs) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListSSLs) ProtoMessage() {}

func (x *ListSSLs) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListSSLs.ProtoReflect.Descriptor instead.
func (*ListSSLs) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{5}
}

func (x *ListSSLs) GetEntities() []*pbmodel.SSL {
	if x != nil {
		return x.Entities
	}
	return nil
}

func (x *ListSSLs) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

type CreateApiService struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateApiService) Reset() {
	*x = CreateApiService{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateApiService) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateApiService) ProtoMessage() {}

func (x *CreateApiService) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateApiService.ProtoReflect.Descriptor instead.
func (*CreateApiService) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{6}
}

func (x *CreateApiService) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type ListApiServices struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Entities []*pbmodel.ApiServiceEntity `protobuf:"bytes,1,rep,name=entities,proto3" json:"entities"`
	Total    int64                       `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore  bool                        `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListApiServices) Reset() {
	*x = ListApiServices{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListApiServices) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListApiServices) ProtoMessage() {}

func (x *ListApiServices) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListApiServices.ProtoReflect.Descriptor instead.
func (*ListApiServices) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{7}
}

func (x *ListApiServices) GetEntities() []*pbmodel.ApiServiceEntity {
	if x != nil {
		return x.Entities
	}
	return nil
}

func (x *ListApiServices) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListApiServices) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type ListAuthKeys struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Entities []*pbmodel.AuthKeyEntity `protobuf:"bytes,1,rep,name=entities,proto3" json:"entities"`
	Total    int64                    `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore  bool                     `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListAuthKeys) Reset() {
	*x = ListAuthKeys{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListAuthKeys) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListAuthKeys) ProtoMessage() {}

func (x *ListAuthKeys) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListAuthKeys.ProtoReflect.Descriptor instead.
func (*ListAuthKeys) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{8}
}

func (x *ListAuthKeys) GetEntities() []*pbmodel.AuthKeyEntity {
	if x != nil {
		return x.Entities
	}
	return nil
}

func (x *ListAuthKeys) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListAuthKeys) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type CreateAuthKey struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id        string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
	SecretKey string `protobuf:"bytes,2,opt,name=secret_key,json=secretKey,proto3" json:"secret_key"`
}

func (x *CreateAuthKey) Reset() {
	*x = CreateAuthKey{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateAuthKey) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateAuthKey) ProtoMessage() {}

func (x *CreateAuthKey) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateAuthKey.ProtoReflect.Descriptor instead.
func (*CreateAuthKey) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{9}
}

func (x *CreateAuthKey) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *CreateAuthKey) GetSecretKey() string {
	if x != nil {
		return x.SecretKey
	}
	return ""
}

type GetSvcReqCount struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Id    string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
	Count int32  `protobuf:"varint,2,opt,name=count,proto3" json:"count"`
}

func (x *GetSvcReqCount) Reset() {
	*x = GetSvcReqCount{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_apidashboard_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *GetSvcReqCount) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*GetSvcReqCount) ProtoMessage() {}

func (x *GetSvcReqCount) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_apidashboard_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use GetSvcReqCount.ProtoReflect.Descriptor instead.
func (*GetSvcReqCount) Descriptor() ([]byte, []int) {
	return file_proto_types_response_apidashboard_proto_rawDescGZIP(), []int{10}
}

func (x *GetSvcReqCount) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *GetSvcReqCount) GetCount() int32 {
	if x != nil {
		return x.Count
	}
	return 0
}

var File_proto_types_response_apidashboard_proto protoreflect.FileDescriptor

var file_proto_types_response_apidashboard_proto_rawDesc = []byte{
	0x0a, 0x27, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x61, 0x70, 0x69, 0x64, 0x61, 0x73, 0x68, 0x62, 0x6f,
	0x61, 0x72, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x1a, 0x24, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73,
	0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x61, 0x70, 0x69, 0x64, 0x61, 0x73, 0x68, 0x62, 0x6f,
	0x61, 0x72, 0x64, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x1d, 0x0a, 0x0b, 0x43, 0x72, 0x65,
	0x61, 0x74, 0x65, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x22, 0x67, 0x0a, 0x0a, 0x4c, 0x69, 0x73, 0x74,
	0x52, 0x6f, 0x75, 0x74, 0x65, 0x73, 0x12, 0x28, 0x0a, 0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69,
	0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0c, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x52, 0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69, 0x65, 0x73,
	0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52,
	0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f,
	0x72, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72,
	0x65, 0x22, 0x73, 0x0a, 0x0d, 0x4c, 0x69, 0x73, 0x74, 0x55, 0x70, 0x73, 0x74, 0x72, 0x65, 0x61,
	0x6d, 0x73, 0x12, 0x31, 0x0a, 0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69, 0x65, 0x73, 0x18, 0x01,
	0x20, 0x03, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x55, 0x70, 0x73,
	0x74, 0x72, 0x65, 0x61, 0x6d, 0x45, 0x6e, 0x74, 0x69, 0x74, 0x79, 0x52, 0x08, 0x65, 0x6e, 0x74,
	0x69, 0x74, 0x69, 0x65, 0x73, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68,
	0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68,
	0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x22, 0x20, 0x0a, 0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x55, 0x70, 0x73, 0x74, 0x72, 0x65, 0x61, 0x6d, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x22, 0x1b, 0x0a, 0x09, 0x43, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x53, 0x53, 0x4c, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x02, 0x69, 0x64, 0x22, 0x48, 0x0a, 0x08, 0x4c, 0x69, 0x73, 0x74, 0x53, 0x53, 0x4c,
	0x73, 0x12, 0x26, 0x0a, 0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69, 0x65, 0x73, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x0a, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x53, 0x4c, 0x52,
	0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69, 0x65, 0x73, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74,
	0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x22,
	0x22, 0x0a, 0x10, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x41, 0x70, 0x69, 0x53, 0x65, 0x72, 0x76,
	0x69, 0x63, 0x65, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x02, 0x69, 0x64, 0x22, 0x77, 0x0a, 0x0f, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x70, 0x69, 0x53, 0x65,
	0x72, 0x76, 0x69, 0x63, 0x65, 0x73, 0x12, 0x33, 0x0a, 0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69,
	0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x41, 0x70, 0x69, 0x53, 0x65, 0x72, 0x76, 0x69, 0x63, 0x65, 0x45, 0x6e, 0x74, 0x69, 0x74,
	0x79, 0x52, 0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69, 0x65, 0x73, 0x12, 0x14, 0x0a, 0x05, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x22, 0x71, 0x0a, 0x0c,
	0x4c, 0x69, 0x73, 0x74, 0x41, 0x75, 0x74, 0x68, 0x4b, 0x65, 0x79, 0x73, 0x12, 0x30, 0x0a, 0x08,
	0x65, 0x6e, 0x74, 0x69, 0x74, 0x69, 0x65, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x14,
	0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x75, 0x74, 0x68, 0x4b, 0x65, 0x79, 0x45, 0x6e,
	0x74, 0x69, 0x74, 0x79, 0x52, 0x08, 0x65, 0x6e, 0x74, 0x69, 0x74, 0x69, 0x65, 0x73, 0x12, 0x14,
	0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x22,
	0x3e, 0x0a, 0x0d, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x41, 0x75, 0x74, 0x68, 0x4b, 0x65, 0x79,
	0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64,
	0x12, 0x1d, 0x0a, 0x0a, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x5f, 0x6b, 0x65, 0x79, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x09, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x4b, 0x65, 0x79, 0x22,
	0x36, 0x0a, 0x0e, 0x47, 0x65, 0x74, 0x53, 0x76, 0x63, 0x52, 0x65, 0x71, 0x43, 0x6f, 0x75, 0x6e,
	0x74, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69,
	0x64, 0x12, 0x14, 0x0a, 0x05, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x05, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x42, 0x77, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x64,
	0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x42, 0x16, 0x50, 0x42, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x41, 0x70, 0x69, 0x44,
	0x61, 0x73, 0x68, 0x62, 0x6f, 0x61, 0x72, 0x64, 0x50, 0x00, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62,
	0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_response_apidashboard_proto_rawDescOnce sync.Once
	file_proto_types_response_apidashboard_proto_rawDescData = file_proto_types_response_apidashboard_proto_rawDesc
)

func file_proto_types_response_apidashboard_proto_rawDescGZIP() []byte {
	file_proto_types_response_apidashboard_proto_rawDescOnce.Do(func() {
		file_proto_types_response_apidashboard_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_apidashboard_proto_rawDescData)
	})
	return file_proto_types_response_apidashboard_proto_rawDescData
}

var file_proto_types_response_apidashboard_proto_msgTypes = make([]protoimpl.MessageInfo, 11)
var file_proto_types_response_apidashboard_proto_goTypes = []interface{}{
	(*CreateRoute)(nil),              // 0: response.CreateRoute
	(*ListRoutes)(nil),               // 1: response.ListRoutes
	(*ListUpstreams)(nil),            // 2: response.ListUpstreams
	(*CreateUpstream)(nil),           // 3: response.CreateUpstream
	(*CreateSSL)(nil),                // 4: response.CreateSSL
	(*ListSSLs)(nil),                 // 5: response.ListSSLs
	(*CreateApiService)(nil),         // 6: response.CreateApiService
	(*ListApiServices)(nil),          // 7: response.ListApiServices
	(*ListAuthKeys)(nil),             // 8: response.ListAuthKeys
	(*CreateAuthKey)(nil),            // 9: response.CreateAuthKey
	(*GetSvcReqCount)(nil),           // 10: response.GetSvcReqCount
	(*pbmodel.Route)(nil),            // 11: model.Route
	(*pbmodel.UpstreamEntity)(nil),   // 12: model.UpstreamEntity
	(*pbmodel.SSL)(nil),              // 13: model.SSL
	(*pbmodel.ApiServiceEntity)(nil), // 14: model.ApiServiceEntity
	(*pbmodel.AuthKeyEntity)(nil),    // 15: model.AuthKeyEntity
}
var file_proto_types_response_apidashboard_proto_depIdxs = []int32{
	11, // 0: response.ListRoutes.entities:type_name -> model.Route
	12, // 1: response.ListUpstreams.entities:type_name -> model.UpstreamEntity
	13, // 2: response.ListSSLs.entities:type_name -> model.SSL
	14, // 3: response.ListApiServices.entities:type_name -> model.ApiServiceEntity
	15, // 4: response.ListAuthKeys.entities:type_name -> model.AuthKeyEntity
	5,  // [5:5] is the sub-list for method output_type
	5,  // [5:5] is the sub-list for method input_type
	5,  // [5:5] is the sub-list for extension type_name
	5,  // [5:5] is the sub-list for extension extendee
	0,  // [0:5] is the sub-list for field type_name
}

func init() { file_proto_types_response_apidashboard_proto_init() }
func file_proto_types_response_apidashboard_proto_init() {
	if File_proto_types_response_apidashboard_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_apidashboard_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateRoute); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListRoutes); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListUpstreams); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateUpstream); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateSSL); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListSSLs); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateApiService); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListApiServices); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListAuthKeys); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateAuthKey); i {
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
		file_proto_types_response_apidashboard_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*GetSvcReqCount); i {
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
			RawDescriptor: file_proto_types_response_apidashboard_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   11,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_apidashboard_proto_goTypes,
		DependencyIndexes: file_proto_types_response_apidashboard_proto_depIdxs,
		MessageInfos:      file_proto_types_response_apidashboard_proto_msgTypes,
	}.Build()
	File_proto_types_response_apidashboard_proto = out.File
	file_proto_types_response_apidashboard_proto_rawDesc = nil
	file_proto_types_response_apidashboard_proto_goTypes = nil
	file_proto_types_response_apidashboard_proto_depIdxs = nil
}
