// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/account_manage.proto

package pbresponse

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

type ListUsers struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.User `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	Total   int64           `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore bool            `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListUsers) Reset() {
	*x = ListUsers{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListUsers) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListUsers) ProtoMessage() {}

func (x *ListUsers) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListUsers.ProtoReflect.Descriptor instead.
func (*ListUsers) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{0}
}

func (x *ListUsers) GetInfos() []*pbmodel.User {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListUsers) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListUsers) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type DescribeUser struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserSet *pbmodel.User `protobuf:"bytes,1,opt,name=user_set,json=userSet,proto3" json:"user_set"`
}

func (x *DescribeUser) Reset() {
	*x = DescribeUser{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeUser) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeUser) ProtoMessage() {}

func (x *DescribeUser) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeUser.ProtoReflect.Descriptor instead.
func (*DescribeUser) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{1}
}

func (x *DescribeUser) GetUserSet() *pbmodel.User {
	if x != nil {
		return x.UserSet
	}
	return nil
}

type CreateUser struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The user id.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateUser) Reset() {
	*x = CreateUser{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateUser) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateUser) ProtoMessage() {}

func (x *CreateUser) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateUser.ProtoReflect.Descriptor instead.
func (*CreateUser) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{2}
}

func (x *CreateUser) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type ListAccessKeys struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.AccessKey `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	Total   int64                `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore bool                 `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListAccessKeys) Reset() {
	*x = ListAccessKeys{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListAccessKeys) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListAccessKeys) ProtoMessage() {}

func (x *ListAccessKeys) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListAccessKeys.ProtoReflect.Descriptor instead.
func (*ListAccessKeys) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{3}
}

func (x *ListAccessKeys) GetInfos() []*pbmodel.AccessKey {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListAccessKeys) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListAccessKeys) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type DescribeAccessKey struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	KeySet *pbmodel.AccessKey `protobuf:"bytes,1,opt,name=key_set,json=keySet,proto3" json:"key_set"`
}

func (x *DescribeAccessKey) Reset() {
	*x = DescribeAccessKey{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeAccessKey) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeAccessKey) ProtoMessage() {}

func (x *DescribeAccessKey) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeAccessKey.ProtoReflect.Descriptor instead.
func (*DescribeAccessKey) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{4}
}

func (x *DescribeAccessKey) GetKeySet() *pbmodel.AccessKey {
	if x != nil {
		return x.KeySet
	}
	return nil
}

type CreateAccessKey struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	AccessKeyId     string `protobuf:"bytes,1,opt,name=access_key_id,json=accessKeyId,proto3" json:"access_key_id"`
	SecretAccessKey string `protobuf:"bytes,2,opt,name=secret_access_key,json=secretAccessKey,proto3" json:"secret_access_key"`
}

func (x *CreateAccessKey) Reset() {
	*x = CreateAccessKey{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateAccessKey) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateAccessKey) ProtoMessage() {}

func (x *CreateAccessKey) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateAccessKey.ProtoReflect.Descriptor instead.
func (*CreateAccessKey) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{5}
}

func (x *CreateAccessKey) GetAccessKeyId() string {
	if x != nil {
		return x.AccessKeyId
	}
	return ""
}

func (x *CreateAccessKey) GetSecretAccessKey() string {
	if x != nil {
		return x.SecretAccessKey
	}
	return ""
}

// FIXME: confirm the reply parameters.
type CheckSession struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserSet *pbmodel.User      `protobuf:"bytes,1,opt,name=user_set,json=userSet,proto3" json:"user_set"`
	KeySet  *pbmodel.AccessKey `protobuf:"bytes,2,opt,name=key_set,json=keySet,proto3" json:"key_set"`
}

func (x *CheckSession) Reset() {
	*x = CheckSession{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CheckSession) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CheckSession) ProtoMessage() {}

func (x *CheckSession) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CheckSession.ProtoReflect.Descriptor instead.
func (*CheckSession) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{6}
}

func (x *CheckSession) GetUserSet() *pbmodel.User {
	if x != nil {
		return x.UserSet
	}
	return nil
}

func (x *CheckSession) GetKeySet() *pbmodel.AccessKey {
	if x != nil {
		return x.KeySet
	}
	return nil
}

type CreateSession struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The session key.
	SessionId string        `protobuf:"bytes,1,opt,name=session_id,json=sessionId,proto3" json:"session_id"`
	UserSet   *pbmodel.User `protobuf:"bytes,2,opt,name=user_set,json=userSet,proto3" json:"user_set"`
}

func (x *CreateSession) Reset() {
	*x = CreateSession{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateSession) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateSession) ProtoMessage() {}

func (x *CreateSession) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateSession.ProtoReflect.Descriptor instead.
func (*CreateSession) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{7}
}

func (x *CreateSession) GetSessionId() string {
	if x != nil {
		return x.SessionId
	}
	return ""
}

func (x *CreateSession) GetUserSet() *pbmodel.User {
	if x != nil {
		return x.UserSet
	}
	return nil
}

type CreateNotification struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The notification id.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateNotification) Reset() {
	*x = CreateNotification{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateNotification) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateNotification) ProtoMessage() {}

func (x *CreateNotification) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateNotification.ProtoReflect.Descriptor instead.
func (*CreateNotification) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{8}
}

func (x *CreateNotification) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

type ListNotifications struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.Notification `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	Total   int64                   `protobuf:"varint,2,opt,name=total,proto3" json:"total"`
	HasMore bool                    `protobuf:"varint,3,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
}

func (x *ListNotifications) Reset() {
	*x = ListNotifications{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListNotifications) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListNotifications) ProtoMessage() {}

func (x *ListNotifications) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListNotifications.ProtoReflect.Descriptor instead.
func (*ListNotifications) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{9}
}

func (x *ListNotifications) GetInfos() []*pbmodel.Notification {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListNotifications) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

func (x *ListNotifications) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

type DescribeNotification struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NfSet *pbmodel.Notification `protobuf:"bytes,1,opt,name=nf_set,json=nfSet,proto3" json:"nf_set"`
}

func (x *DescribeNotification) Reset() {
	*x = DescribeNotification{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_account_manage_proto_msgTypes[10]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeNotification) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeNotification) ProtoMessage() {}

func (x *DescribeNotification) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_account_manage_proto_msgTypes[10]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeNotification.ProtoReflect.Descriptor instead.
func (*DescribeNotification) Descriptor() ([]byte, []int) {
	return file_proto_types_response_account_manage_proto_rawDescGZIP(), []int{10}
}

func (x *DescribeNotification) GetNfSet() *pbmodel.Notification {
	if x != nil {
		return x.NfSet
	}
	return nil
}

var File_proto_types_response_account_manage_proto protoreflect.FileDescriptor

var file_proto_types_response_account_manage_proto_rawDesc = []byte{
	0x0a, 0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x61, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x5f, 0x6d,
	0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c,
	0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x61, 0x63,
	0x63, 0x6f, 0x75, 0x6e, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x5f, 0x0a, 0x09, 0x4c,
	0x69, 0x73, 0x74, 0x55, 0x73, 0x65, 0x72, 0x73, 0x12, 0x21, 0x0a, 0x05, 0x69, 0x6e, 0x66, 0x6f,
	0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0b, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x55, 0x73, 0x65, 0x72, 0x52, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x12, 0x14, 0x0a, 0x05, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x22, 0x36, 0x0a, 0x0c,
	0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x55, 0x73, 0x65, 0x72, 0x12, 0x26, 0x0a, 0x08,
	0x75, 0x73, 0x65, 0x72, 0x5f, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0b,
	0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x07, 0x75, 0x73, 0x65,
	0x72, 0x53, 0x65, 0x74, 0x22, 0x1c, 0x0a, 0x0a, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x55, 0x73,
	0x65, 0x72, 0x12, 0x0e, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02,
	0x69, 0x64, 0x22, 0x69, 0x0a, 0x0e, 0x4c, 0x69, 0x73, 0x74, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73,
	0x4b, 0x65, 0x79, 0x73, 0x12, 0x26, 0x0a, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x18, 0x01, 0x20,
	0x03, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x63, 0x63, 0x65,
	0x73, 0x73, 0x4b, 0x65, 0x79, 0x52, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x12, 0x14, 0x0a, 0x05,
	0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74,
	0x61, 0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x22, 0x3e, 0x0a,
	0x11, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x4b,
	0x65, 0x79, 0x12, 0x29, 0x0a, 0x07, 0x6b, 0x65, 0x79, 0x5f, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x63, 0x63, 0x65,
	0x73, 0x73, 0x4b, 0x65, 0x79, 0x52, 0x06, 0x6b, 0x65, 0x79, 0x53, 0x65, 0x74, 0x22, 0x7b, 0x0a,
	0x0f, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x4b, 0x65, 0x79,
	0x12, 0x2f, 0x0a, 0x0d, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x5f, 0x6b, 0x65, 0x79, 0x5f, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2,
	0x01, 0x02, 0x22, 0x00, 0x52, 0x0b, 0x61, 0x63, 0x63, 0x65, 0x73, 0x73, 0x4b, 0x65, 0x79, 0x49,
	0x64, 0x12, 0x37, 0x0a, 0x11, 0x73, 0x65, 0x63, 0x72, 0x65, 0x74, 0x5f, 0x61, 0x63, 0x63, 0x65,
	0x73, 0x73, 0x5f, 0x6b, 0x65, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf,
	0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0f, 0x73, 0x65, 0x63, 0x72, 0x65,
	0x74, 0x41, 0x63, 0x63, 0x65, 0x73, 0x73, 0x4b, 0x65, 0x79, 0x22, 0x61, 0x0a, 0x0c, 0x43, 0x68,
	0x65, 0x63, 0x6b, 0x53, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x26, 0x0a, 0x08, 0x75, 0x73,
	0x65, 0x72, 0x5f, 0x73, 0x65, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0b, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x07, 0x75, 0x73, 0x65, 0x72, 0x53,
	0x65, 0x74, 0x12, 0x29, 0x0a, 0x07, 0x6b, 0x65, 0x79, 0x5f, 0x73, 0x65, 0x74, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x41, 0x63, 0x63, 0x65,
	0x73, 0x73, 0x4b, 0x65, 0x79, 0x52, 0x06, 0x6b, 0x65, 0x79, 0x53, 0x65, 0x74, 0x22, 0x56, 0x0a,
	0x0d, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x53, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x1d,
	0x0a, 0x0a, 0x73, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x09, 0x73, 0x65, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x49, 0x64, 0x12, 0x26, 0x0a,
	0x08, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x73, 0x65, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x0b, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x55, 0x73, 0x65, 0x72, 0x52, 0x07, 0x75, 0x73,
	0x65, 0x72, 0x53, 0x65, 0x74, 0x22, 0x24, 0x0a, 0x12, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x4e,
	0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x0e, 0x0a, 0x02, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x02, 0x69, 0x64, 0x22, 0x6f, 0x0a, 0x11, 0x4c,
	0x69, 0x73, 0x74, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73,
	0x12, 0x29, 0x0a, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32,
	0x13, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x52, 0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x12, 0x14, 0x0a, 0x05, 0x74,
	0x6f, 0x74, 0x61, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65, 0x18, 0x03, 0x20,
	0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x22, 0x42, 0x0a, 0x14,
	0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x4e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2a, 0x0a, 0x06, 0x6e, 0x66, 0x5f, 0x73, 0x65, 0x74, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x4e, 0x6f, 0x74,
	0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x05, 0x6e, 0x66, 0x53, 0x65, 0x74,
	0x42, 0x72, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69,
	0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70,
	0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x11, 0x50, 0x42, 0x52, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x41, 0x63, 0x63, 0x6f, 0x75, 0x6e, 0x74, 0x50, 0x00, 0x5a, 0x34,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57,
	0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_response_account_manage_proto_rawDescOnce sync.Once
	file_proto_types_response_account_manage_proto_rawDescData = file_proto_types_response_account_manage_proto_rawDesc
)

func file_proto_types_response_account_manage_proto_rawDescGZIP() []byte {
	file_proto_types_response_account_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_response_account_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_account_manage_proto_rawDescData)
	})
	return file_proto_types_response_account_manage_proto_rawDescData
}

var file_proto_types_response_account_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 11)
var file_proto_types_response_account_manage_proto_goTypes = []interface{}{
	(*ListUsers)(nil),            // 0: response.ListUsers
	(*DescribeUser)(nil),         // 1: response.DescribeUser
	(*CreateUser)(nil),           // 2: response.CreateUser
	(*ListAccessKeys)(nil),       // 3: response.ListAccessKeys
	(*DescribeAccessKey)(nil),    // 4: response.DescribeAccessKey
	(*CreateAccessKey)(nil),      // 5: response.CreateAccessKey
	(*CheckSession)(nil),         // 6: response.CheckSession
	(*CreateSession)(nil),        // 7: response.CreateSession
	(*CreateNotification)(nil),   // 8: response.CreateNotification
	(*ListNotifications)(nil),    // 9: response.ListNotifications
	(*DescribeNotification)(nil), // 10: response.DescribeNotification
	(*pbmodel.User)(nil),         // 11: model.User
	(*pbmodel.AccessKey)(nil),    // 12: model.AccessKey
	(*pbmodel.Notification)(nil), // 13: model.Notification
}
var file_proto_types_response_account_manage_proto_depIdxs = []int32{
	11, // 0: response.ListUsers.infos:type_name -> model.User
	11, // 1: response.DescribeUser.user_set:type_name -> model.User
	12, // 2: response.ListAccessKeys.infos:type_name -> model.AccessKey
	12, // 3: response.DescribeAccessKey.key_set:type_name -> model.AccessKey
	11, // 4: response.CheckSession.user_set:type_name -> model.User
	12, // 5: response.CheckSession.key_set:type_name -> model.AccessKey
	11, // 6: response.CreateSession.user_set:type_name -> model.User
	13, // 7: response.ListNotifications.infos:type_name -> model.Notification
	13, // 8: response.DescribeNotification.nf_set:type_name -> model.Notification
	9,  // [9:9] is the sub-list for method output_type
	9,  // [9:9] is the sub-list for method input_type
	9,  // [9:9] is the sub-list for extension type_name
	9,  // [9:9] is the sub-list for extension extendee
	0,  // [0:9] is the sub-list for field type_name
}

func init() { file_proto_types_response_account_manage_proto_init() }
func file_proto_types_response_account_manage_proto_init() {
	if File_proto_types_response_account_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_account_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListUsers); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeUser); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateUser); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListAccessKeys); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeAccessKey); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateAccessKey); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CheckSession); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateSession); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateNotification); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListNotifications); i {
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
		file_proto_types_response_account_manage_proto_msgTypes[10].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeNotification); i {
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
			RawDescriptor: file_proto_types_response_account_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   11,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_account_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_response_account_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_response_account_manage_proto_msgTypes,
	}.Build()
	File_proto_types_response_account_manage_proto = out.File
	file_proto_types_response_account_manage_proto_rawDesc = nil
	file_proto_types_response_account_manage_proto_goTypes = nil
	file_proto_types_response_account_manage_proto_depIdxs = nil
}
