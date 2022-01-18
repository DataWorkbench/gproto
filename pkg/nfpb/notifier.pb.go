// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/notifier.proto

package nfpb

import (
	proto "github.com/golang/protobuf/proto"
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

type SendInternalNoticeRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UserId       string   `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id,omitempty"`
	Title        string   `protobuf:"bytes,2,opt,name=title,proto3" json:"title,omitempty"`
	Content      string   `protobuf:"bytes,3,opt,name=content,proto3" json:"content,omitempty"`
	ShortContent string   `protobuf:"bytes,4,opt,name=short_content,json=shortContent,proto3" json:"short_content,omitempty"`
	EmailAddress []string `protobuf:"bytes,5,rep,name=email_address,json=emailAddress,proto3" json:"email_address,omitempty"`
}

func (x *SendInternalNoticeRequest) Reset() {
	*x = SendInternalNoticeRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_notifier_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendInternalNoticeRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendInternalNoticeRequest) ProtoMessage() {}

func (x *SendInternalNoticeRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_notifier_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SendInternalNoticeRequest.ProtoReflect.Descriptor instead.
func (*SendInternalNoticeRequest) Descriptor() ([]byte, []int) {
	return file_proto_notifier_proto_rawDescGZIP(), []int{0}
}

func (x *SendInternalNoticeRequest) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *SendInternalNoticeRequest) GetTitle() string {
	if x != nil {
		return x.Title
	}
	return ""
}

func (x *SendInternalNoticeRequest) GetContent() string {
	if x != nil {
		return x.Content
	}
	return ""
}

func (x *SendInternalNoticeRequest) GetShortContent() string {
	if x != nil {
		return x.ShortContent
	}
	return ""
}

func (x *SendInternalNoticeRequest) GetEmailAddress() []string {
	if x != nil {
		return x.EmailAddress
	}
	return nil
}

type SendInternalNoticeReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Status  int32  `protobuf:"varint,1,opt,name=status,proto3" json:"status,omitempty"`
	Message string `protobuf:"bytes,2,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *SendInternalNoticeReply) Reset() {
	*x = SendInternalNoticeReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_notifier_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SendInternalNoticeReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SendInternalNoticeReply) ProtoMessage() {}

func (x *SendInternalNoticeReply) ProtoReflect() protoreflect.Message {
	mi := &file_proto_notifier_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SendInternalNoticeReply.ProtoReflect.Descriptor instead.
func (*SendInternalNoticeReply) Descriptor() ([]byte, []int) {
	return file_proto_notifier_proto_rawDescGZIP(), []int{1}
}

func (x *SendInternalNoticeReply) GetStatus() int32 {
	if x != nil {
		return x.Status
	}
	return 0
}

func (x *SendInternalNoticeReply) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

type RecordEntry struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NotificationPostId string `protobuf:"bytes,1,opt,name=notification_post_id,json=notificationPostId,proto3" json:"notification_post_id,omitempty"`
	Owner              string `protobuf:"bytes,2,opt,name=owner,proto3" json:"owner,omitempty"`
	NotifyType         string `protobuf:"bytes,3,opt,name=notify_type,json=notifyType,proto3" json:"notify_type,omitempty"`
	Title              string `protobuf:"bytes,4,opt,name=title,proto3" json:"title,omitempty"`
	Content            string `protobuf:"bytes,5,opt,name=content,proto3" json:"content,omitempty"`
	ShortContent       string `protobuf:"bytes,6,opt,name=short_content,json=shortContent,proto3" json:"short_content,omitempty"`
	Status             string `protobuf:"bytes,7,opt,name=status,proto3" json:"status,omitempty"`
	CreateTime         int64  `protobuf:"varint,8,opt,name=create_time,json=createTime,proto3" json:"create_time,omitempty"`
	StatusTime         int64  `protobuf:"varint,9,opt,name=status_time,json=statusTime,proto3" json:"status_time,omitempty"`
	EmailAddress       string `protobuf:"bytes,10,opt,name=email_address,json=emailAddress,proto3" json:"email_address,omitempty"`
}

func (x *RecordEntry) Reset() {
	*x = RecordEntry{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_notifier_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *RecordEntry) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*RecordEntry) ProtoMessage() {}

func (x *RecordEntry) ProtoReflect() protoreflect.Message {
	mi := &file_proto_notifier_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use RecordEntry.ProtoReflect.Descriptor instead.
func (*RecordEntry) Descriptor() ([]byte, []int) {
	return file_proto_notifier_proto_rawDescGZIP(), []int{2}
}

func (x *RecordEntry) GetNotificationPostId() string {
	if x != nil {
		return x.NotificationPostId
	}
	return ""
}

func (x *RecordEntry) GetOwner() string {
	if x != nil {
		return x.Owner
	}
	return ""
}

func (x *RecordEntry) GetNotifyType() string {
	if x != nil {
		return x.NotifyType
	}
	return ""
}

func (x *RecordEntry) GetTitle() string {
	if x != nil {
		return x.Title
	}
	return ""
}

func (x *RecordEntry) GetContent() string {
	if x != nil {
		return x.Content
	}
	return ""
}

func (x *RecordEntry) GetShortContent() string {
	if x != nil {
		return x.ShortContent
	}
	return ""
}

func (x *RecordEntry) GetStatus() string {
	if x != nil {
		return x.Status
	}
	return ""
}

func (x *RecordEntry) GetCreateTime() int64 {
	if x != nil {
		return x.CreateTime
	}
	return 0
}

func (x *RecordEntry) GetStatusTime() int64 {
	if x != nil {
		return x.StatusTime
	}
	return 0
}

func (x *RecordEntry) GetEmailAddress() string {
	if x != nil {
		return x.EmailAddress
	}
	return ""
}

type ListRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	NotificationPostId string   `protobuf:"bytes,1,opt,name=notification_post_id,json=notificationPostId,proto3" json:"notification_post_id,omitempty"`
	Owner              string   `protobuf:"bytes,2,opt,name=owner,proto3" json:"owner,omitempty"`
	Status             []string `protobuf:"bytes,3,rep,name=status,proto3" json:"status,omitempty"`
	Limit              int32    `protobuf:"varint,4,opt,name=limit,proto3" json:"limit,omitempty"`
	Offset             int32    `protobuf:"varint,5,opt,name=offset,proto3" json:"offset,omitempty"`
}

func (x *ListRequest) Reset() {
	*x = ListRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_notifier_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListRequest) ProtoMessage() {}

func (x *ListRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_notifier_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListRequest.ProtoReflect.Descriptor instead.
func (*ListRequest) Descriptor() ([]byte, []int) {
	return file_proto_notifier_proto_rawDescGZIP(), []int{3}
}

func (x *ListRequest) GetNotificationPostId() string {
	if x != nil {
		return x.NotificationPostId
	}
	return ""
}

func (x *ListRequest) GetOwner() string {
	if x != nil {
		return x.Owner
	}
	return ""
}

func (x *ListRequest) GetStatus() []string {
	if x != nil {
		return x.Status
	}
	return nil
}

func (x *ListRequest) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *ListRequest) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

type ListReply struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Records    []*RecordEntry `protobuf:"bytes,1,rep,name=records,proto3" json:"records,omitempty"`
	TotalCount int64          `protobuf:"varint,2,opt,name=total_count,json=totalCount,proto3" json:"total_count,omitempty"`
	Status     int32          `protobuf:"varint,3,opt,name=status,proto3" json:"status,omitempty"`
	Message    string         `protobuf:"bytes,4,opt,name=message,proto3" json:"message,omitempty"`
}

func (x *ListReply) Reset() {
	*x = ListReply{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_notifier_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListReply) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListReply) ProtoMessage() {}

func (x *ListReply) ProtoReflect() protoreflect.Message {
	mi := &file_proto_notifier_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListReply.ProtoReflect.Descriptor instead.
func (*ListReply) Descriptor() ([]byte, []int) {
	return file_proto_notifier_proto_rawDescGZIP(), []int{4}
}

func (x *ListReply) GetRecords() []*RecordEntry {
	if x != nil {
		return x.Records
	}
	return nil
}

func (x *ListReply) GetTotalCount() int64 {
	if x != nil {
		return x.TotalCount
	}
	return 0
}

func (x *ListReply) GetStatus() int32 {
	if x != nil {
		return x.Status
	}
	return 0
}

func (x *ListReply) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

var File_proto_notifier_proto protoreflect.FileDescriptor

var file_proto_notifier_proto_rawDesc = []byte{
	0x0a, 0x14, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x65, 0x72,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xae, 0x01, 0x0a, 0x19, 0x53, 0x65, 0x6e, 0x64, 0x49,
	0x6e, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x69, 0x63, 0x65, 0x52, 0x65, 0x71,
	0x75, 0x65, 0x73, 0x74, 0x12, 0x17, 0x0a, 0x07, 0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x14, 0x0a,
	0x05, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74, 0x69,
	0x74, 0x6c, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x12, 0x23, 0x0a,
	0x0d, 0x73, 0x68, 0x6f, 0x72, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x73, 0x68, 0x6f, 0x72, 0x74, 0x43, 0x6f, 0x6e, 0x74, 0x65,
	0x6e, 0x74, 0x12, 0x23, 0x0a, 0x0d, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x5f, 0x61, 0x64, 0x64, 0x72,
	0x65, 0x73, 0x73, 0x18, 0x05, 0x20, 0x03, 0x28, 0x09, 0x52, 0x0c, 0x65, 0x6d, 0x61, 0x69, 0x6c,
	0x41, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x22, 0x4b, 0x0a, 0x17, 0x53, 0x65, 0x6e, 0x64, 0x49,
	0x6e, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x69, 0x63, 0x65, 0x52, 0x65, 0x70,
	0x6c, 0x79, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x05, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x18, 0x0a, 0x07, 0x6d, 0x65,
	0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6d, 0x65, 0x73,
	0x73, 0x61, 0x67, 0x65, 0x22, 0xca, 0x02, 0x0a, 0x0b, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x45,
	0x6e, 0x74, 0x72, 0x79, 0x12, 0x30, 0x0a, 0x14, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61,
	0x74, 0x69, 0x6f, 0x6e, 0x5f, 0x70, 0x6f, 0x73, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x12, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e,
	0x50, 0x6f, 0x73, 0x74, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x12, 0x1f, 0x0a, 0x0b,
	0x6e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x5f, 0x74, 0x79, 0x70, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0a, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x79, 0x54, 0x79, 0x70, 0x65, 0x12, 0x14, 0x0a,
	0x05, 0x74, 0x69, 0x74, 0x6c, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74, 0x69,
	0x74, 0x6c, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x12, 0x23, 0x0a,
	0x0d, 0x73, 0x68, 0x6f, 0x72, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x74, 0x65, 0x6e, 0x74, 0x18, 0x06,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x73, 0x68, 0x6f, 0x72, 0x74, 0x43, 0x6f, 0x6e, 0x74, 0x65,
	0x6e, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x07, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x1f, 0x0a, 0x0b, 0x63, 0x72,
	0x65, 0x61, 0x74, 0x65, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x52,
	0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x73,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x5f, 0x74, 0x69, 0x6d, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x03,
	0x52, 0x0a, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x54, 0x69, 0x6d, 0x65, 0x12, 0x23, 0x0a, 0x0d,
	0x65, 0x6d, 0x61, 0x69, 0x6c, 0x5f, 0x61, 0x64, 0x64, 0x72, 0x65, 0x73, 0x73, 0x18, 0x0a, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0c, 0x65, 0x6d, 0x61, 0x69, 0x6c, 0x41, 0x64, 0x64, 0x72, 0x65, 0x73,
	0x73, 0x22, 0x9b, 0x01, 0x0a, 0x0b, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73,
	0x74, 0x12, 0x30, 0x0a, 0x14, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f,
	0x6e, 0x5f, 0x70, 0x6f, 0x73, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x12, 0x6e, 0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x50, 0x6f, 0x73,
	0x74, 0x49, 0x64, 0x12, 0x14, 0x0a, 0x05, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x05, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x18, 0x03, 0x20, 0x03, 0x28, 0x09, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x12, 0x14, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05,
	0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65,
	0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x22,
	0x86, 0x01, 0x0a, 0x09, 0x4c, 0x69, 0x73, 0x74, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x12, 0x26, 0x0a,
	0x07, 0x72, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0c,
	0x2e, 0x52, 0x65, 0x63, 0x6f, 0x72, 0x64, 0x45, 0x6e, 0x74, 0x72, 0x79, 0x52, 0x07, 0x72, 0x65,
	0x63, 0x6f, 0x72, 0x64, 0x73, 0x12, 0x1f, 0x0a, 0x0b, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x5f, 0x63,
	0x6f, 0x75, 0x6e, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x0a, 0x74, 0x6f, 0x74, 0x61,
	0x6c, 0x43, 0x6f, 0x75, 0x6e, 0x74, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x18,
	0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x32, 0x8d, 0x01, 0x0a, 0x0c, 0x4e, 0x6f, 0x74,
	0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x4c, 0x0a, 0x12, 0x53, 0x65, 0x6e,
	0x64, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x69, 0x63, 0x65, 0x12,
	0x1a, 0x2e, 0x53, 0x65, 0x6e, 0x64, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x4e, 0x6f,
	0x74, 0x69, 0x63, 0x65, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x18, 0x2e, 0x53, 0x65,
	0x6e, 0x64, 0x49, 0x6e, 0x74, 0x65, 0x72, 0x6e, 0x61, 0x6c, 0x4e, 0x6f, 0x74, 0x69, 0x63, 0x65,
	0x52, 0x65, 0x70, 0x6c, 0x79, 0x22, 0x00, 0x12, 0x2f, 0x0a, 0x11, 0x4c, 0x69, 0x73, 0x74, 0x4e,
	0x6f, 0x74, 0x69, 0x66, 0x69, 0x63, 0x61, 0x74, 0x69, 0x6f, 0x6e, 0x73, 0x12, 0x0c, 0x2e, 0x4c,
	0x69, 0x73, 0x74, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x0a, 0x2e, 0x4c, 0x69, 0x73,
	0x74, 0x52, 0x65, 0x70, 0x6c, 0x79, 0x22, 0x00, 0x42, 0x4d, 0x0a, 0x19, 0x63, 0x6f, 0x6d, 0x2e,
	0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x6e, 0x66, 0x70, 0x62, 0x42, 0x04, 0x4e, 0x66, 0x50, 0x42, 0x50, 0x00, 0x5a, 0x28, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70,
	0x6b, 0x67, 0x2f, 0x6e, 0x66, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_notifier_proto_rawDescOnce sync.Once
	file_proto_notifier_proto_rawDescData = file_proto_notifier_proto_rawDesc
)

func file_proto_notifier_proto_rawDescGZIP() []byte {
	file_proto_notifier_proto_rawDescOnce.Do(func() {
		file_proto_notifier_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_notifier_proto_rawDescData)
	})
	return file_proto_notifier_proto_rawDescData
}

var file_proto_notifier_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_proto_notifier_proto_goTypes = []interface{}{
	(*SendInternalNoticeRequest)(nil), // 0: SendInternalNoticeRequest
	(*SendInternalNoticeReply)(nil),   // 1: SendInternalNoticeReply
	(*RecordEntry)(nil),               // 2: RecordEntry
	(*ListRequest)(nil),               // 3: ListRequest
	(*ListReply)(nil),                 // 4: ListReply
}
var file_proto_notifier_proto_depIdxs = []int32{
	2, // 0: ListReply.records:type_name -> RecordEntry
	0, // 1: Notification.SendInternalNotice:input_type -> SendInternalNoticeRequest
	3, // 2: Notification.ListNotifications:input_type -> ListRequest
	1, // 3: Notification.SendInternalNotice:output_type -> SendInternalNoticeReply
	4, // 4: Notification.ListNotifications:output_type -> ListReply
	3, // [3:5] is the sub-list for method output_type
	1, // [1:3] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_proto_notifier_proto_init() }
func file_proto_notifier_proto_init() {
	if File_proto_notifier_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_notifier_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SendInternalNoticeRequest); i {
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
		file_proto_notifier_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SendInternalNoticeReply); i {
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
		file_proto_notifier_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*RecordEntry); i {
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
		file_proto_notifier_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListRequest); i {
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
		file_proto_notifier_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListReply); i {
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
			RawDescriptor: file_proto_notifier_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_notifier_proto_goTypes,
		DependencyIndexes: file_proto_notifier_proto_depIdxs,
		MessageInfos:      file_proto_notifier_proto_msgTypes,
	}.Build()
	File_proto_notifier_proto = out.File
	file_proto_notifier_proto_rawDesc = nil
	file_proto_notifier_proto_goTypes = nil
	file_proto_notifier_proto_depIdxs = nil
}
