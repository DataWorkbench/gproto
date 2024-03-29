// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/file_meta_manage.proto

package pbrequest

import (
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

type CreateFilePrepare struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The user-id of created this file. It fixed to request user id.
	CreatedBy string `protobuf:"bytes,2,opt,name=created_by,json=createdBy,proto3" json:"created_by" swaggerignore:"true"`
	// The owner of workspace, only used to check quota. Set by APIServer.
	SpaceOwner string `protobuf:"bytes,3,opt,name=space_owner,json=spaceOwner,proto3" json:"space_owner" swaggerignore:"true"`
	// PID is the parent id(directory). pid is "" means root(`/`)
	Pid string `protobuf:"bytes,4,opt,name=pid,proto3" json:"pid"`
	// The file name. required.
	Name string `protobuf:"bytes,5,opt,name=name,proto3" json:"name"`
	// The file Size. used to check quota. Max Size: 100M by default.
	Size int64 `protobuf:"varint,6,opt,name=size,proto3" json:"size"`
}

func (x *CreateFilePrepare) Reset() {
	*x = CreateFilePrepare{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateFilePrepare) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateFilePrepare) ProtoMessage() {}

func (x *CreateFilePrepare) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateFilePrepare.ProtoReflect.Descriptor instead.
func (*CreateFilePrepare) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{0}
}

func (x *CreateFilePrepare) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *CreateFilePrepare) GetCreatedBy() string {
	if x != nil {
		return x.CreatedBy
	}
	return ""
}

func (x *CreateFilePrepare) GetSpaceOwner() string {
	if x != nil {
		return x.SpaceOwner
	}
	return ""
}

func (x *CreateFilePrepare) GetPid() string {
	if x != nil {
		return x.Pid
	}
	return ""
}

func (x *CreateFilePrepare) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *CreateFilePrepare) GetSize() int64 {
	if x != nil {
		return x.Size
	}
	return 0
}

type CreateFileMeta struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The request user-id.
	CreatedBy string `protobuf:"bytes,2,opt,name=created_by,json=createdBy,proto3" json:"created_by" swaggerignore:"true"`
	FileId    string `protobuf:"bytes,3,opt,name=file_id,json=fileId,proto3" json:"file_id"`
	// PID is the parent id(directory). pid is "" means root(`/`)
	Pid string `protobuf:"bytes,4,opt,name=pid,proto3" json:"pid"`
	// The file name. required.
	Name string `protobuf:"bytes,5,opt,name=name,proto3" json:"name"`
	// The file description. not required.
	Desc string `protobuf:"bytes,6,opt,name=desc,proto3" json:"desc"`
	// The file size.
	Size int64 `protobuf:"varint,7,opt,name=size,proto3" json:"size"`
	// ETag is MD5 value of file data encoded in hexadecimal.
	Etag string `protobuf:"bytes,8,opt,name=etag,proto3" json:"etag"`
	// The file version id, Each upload generates a new ID.
	Version string `protobuf:"bytes,10,opt,name=version,proto3" json:"version"`
}

func (x *CreateFileMeta) Reset() {
	*x = CreateFileMeta{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateFileMeta) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateFileMeta) ProtoMessage() {}

func (x *CreateFileMeta) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateFileMeta.ProtoReflect.Descriptor instead.
func (*CreateFileMeta) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{1}
}

func (x *CreateFileMeta) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *CreateFileMeta) GetCreatedBy() string {
	if x != nil {
		return x.CreatedBy
	}
	return ""
}

func (x *CreateFileMeta) GetFileId() string {
	if x != nil {
		return x.FileId
	}
	return ""
}

func (x *CreateFileMeta) GetPid() string {
	if x != nil {
		return x.Pid
	}
	return ""
}

func (x *CreateFileMeta) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *CreateFileMeta) GetDesc() string {
	if x != nil {
		return x.Desc
	}
	return ""
}

func (x *CreateFileMeta) GetSize() int64 {
	if x != nil {
		return x.Size
	}
	return 0
}

func (x *CreateFileMeta) GetEtag() string {
	if x != nil {
		return x.Etag
	}
	return ""
}

func (x *CreateFileMeta) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

type ReCreateFilePrepare struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The owner of workspace, only used to check quota. Set by APIServer.
	SpaceOwner string `protobuf:"bytes,2,opt,name=space_owner,json=spaceOwner,proto3" json:"space_owner" swaggerignore:"true"`
	FileId     string `protobuf:"bytes,3,opt,name=file_id,json=fileId,proto3" json:"file_id"`
	// The file size. used to check quota. Max Size: 100M by default.
	Size int64 `protobuf:"varint,4,opt,name=size,proto3" json:"size"`
}

func (x *ReCreateFilePrepare) Reset() {
	*x = ReCreateFilePrepare{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReCreateFilePrepare) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReCreateFilePrepare) ProtoMessage() {}

func (x *ReCreateFilePrepare) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReCreateFilePrepare.ProtoReflect.Descriptor instead.
func (*ReCreateFilePrepare) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{2}
}

func (x *ReCreateFilePrepare) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *ReCreateFilePrepare) GetSpaceOwner() string {
	if x != nil {
		return x.SpaceOwner
	}
	return ""
}

func (x *ReCreateFilePrepare) GetFileId() string {
	if x != nil {
		return x.FileId
	}
	return ""
}

func (x *ReCreateFilePrepare) GetSize() int64 {
	if x != nil {
		return x.Size
	}
	return 0
}

type ReCreateFileMeta struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	FileId  string `protobuf:"bytes,2,opt,name=file_id,json=fileId,proto3" json:"file_id"`
	// The file size. prevent data missing.
	Size int64 `protobuf:"varint,3,opt,name=size,proto3" json:"size"`
	// ETag is MD5 value of file data encoded in hexadecimal.
	Etag string `protobuf:"bytes,4,opt,name=etag,proto3" json:"etag"`
	// The file version id, Each upload generates a new ID.
	Version string `protobuf:"bytes,5,opt,name=version,proto3" json:"version"`
}

func (x *ReCreateFileMeta) Reset() {
	*x = ReCreateFileMeta{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReCreateFileMeta) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReCreateFileMeta) ProtoMessage() {}

func (x *ReCreateFileMeta) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReCreateFileMeta.ProtoReflect.Descriptor instead.
func (*ReCreateFileMeta) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{3}
}

func (x *ReCreateFileMeta) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *ReCreateFileMeta) GetFileId() string {
	if x != nil {
		return x.FileId
	}
	return ""
}

func (x *ReCreateFileMeta) GetSize() int64 {
	if x != nil {
		return x.Size
	}
	return 0
}

func (x *ReCreateFileMeta) GetEtag() string {
	if x != nil {
		return x.Etag
	}
	return ""
}

func (x *ReCreateFileMeta) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

type DescribeFileMeta struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	FileId string `protobuf:"bytes,1,opt,name=file_id,json=fileId,proto3" json:"file_id"`
}

func (x *DescribeFileMeta) Reset() {
	*x = DescribeFileMeta{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeFileMeta) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeFileMeta) ProtoMessage() {}

func (x *DescribeFileMeta) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeFileMeta.ProtoReflect.Descriptor instead.
func (*DescribeFileMeta) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{4}
}

func (x *DescribeFileMeta) GetFileId() string {
	if x != nil {
		return x.FileId
	}
	return ""
}

type UpdateFileMeta struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The file id in HTTP Request_URI.
	FileId string `protobuf:"bytes,2,opt,name=file_id,json=fileId,proto3" json:"file_id" uri:"file_id" swaggerignore:"true"`
	// The file name. required.
	Name string `protobuf:"bytes,3,opt,name=name,proto3" json:"name"`
	// The file description. Not required.
	Desc string `protobuf:"bytes,4,opt,name=desc,proto3" json:"desc"`
}

func (x *UpdateFileMeta) Reset() {
	*x = UpdateFileMeta{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateFileMeta) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateFileMeta) ProtoMessage() {}

func (x *UpdateFileMeta) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateFileMeta.ProtoReflect.Descriptor instead.
func (*UpdateFileMeta) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{5}
}

func (x *UpdateFileMeta) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *UpdateFileMeta) GetFileId() string {
	if x != nil {
		return x.FileId
	}
	return ""
}

func (x *UpdateFileMeta) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UpdateFileMeta) GetDesc() string {
	if x != nil {
		return x.Desc
	}
	return ""
}

type ListFileMetas struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// Limit the maximum number of entries returned this time.
	// Not required, Max 100, default 100.
	Limit int32 `protobuf:"varint,2,opt,name=limit,proto3" json:"limit" form:"limit"`
	// The offset position. Not required, default 0.
	Offset int32 `protobuf:"varint,3,opt,name=offset,proto3" json:"offset" form:"offset"`
	// The file name. not required.
	Name string `protobuf:"bytes,5,opt,name=name,proto3" json:"name" form:"name" binding:"-"`
	// Search with resource name; not required.
	Search string `protobuf:"bytes,6,opt,name=search,proto3" json:"search" form:"search"`
	// The field list used to sorted query results.
	// Optional values: {id, created, updated, name, size}.
	// Not required, default: id.
	SortBy string `protobuf:"bytes,7,opt,name=sort_by,json=sortBy,proto3" json:"sort_by" form:"sort_by"`
	// Reverse order results. Not required, default: false.
	Reverse bool `protobuf:"varint,8,opt,name=reverse,proto3" json:"reverse" form:"reverse"`
	// The parent id. Not required.
	Pid string `protobuf:"bytes,9,opt,name=pid,proto3" json:"pid" form:"pid"`
	// The types.Not required.
	Types []int32 `protobuf:"varint,10,rep,packed,name=types,proto3" json:"types" form:"types"`
}

func (x *ListFileMetas) Reset() {
	*x = ListFileMetas{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListFileMetas) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListFileMetas) ProtoMessage() {}

func (x *ListFileMetas) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListFileMetas.ProtoReflect.Descriptor instead.
func (*ListFileMetas) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{6}
}

func (x *ListFileMetas) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *ListFileMetas) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *ListFileMetas) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

func (x *ListFileMetas) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *ListFileMetas) GetSearch() string {
	if x != nil {
		return x.Search
	}
	return ""
}

func (x *ListFileMetas) GetSortBy() string {
	if x != nil {
		return x.SortBy
	}
	return ""
}

func (x *ListFileMetas) GetReverse() bool {
	if x != nil {
		return x.Reverse
	}
	return false
}

func (x *ListFileMetas) GetPid() string {
	if x != nil {
		return x.Pid
	}
	return ""
}

func (x *ListFileMetas) GetTypes() []int32 {
	if x != nil {
		return x.Types
	}
	return nil
}

type DeleteFileMetas struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The list of file id. Is required, Min 1 Max 100.
	FileIds []string `protobuf:"bytes,2,rep,name=file_ids,json=fileIds,proto3" json:"file_ids"`
}

func (x *DeleteFileMetas) Reset() {
	*x = DeleteFileMetas{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteFileMetas) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteFileMetas) ProtoMessage() {}

func (x *DeleteFileMetas) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_file_meta_manage_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteFileMetas.ProtoReflect.Descriptor instead.
func (*DeleteFileMetas) Descriptor() ([]byte, []int) {
	return file_proto_types_request_file_meta_manage_proto_rawDescGZIP(), []int{7}
}

func (x *DeleteFileMetas) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *DeleteFileMetas) GetFileIds() []string {
	if x != nil {
		return x.FileIds
	}
	return nil
}

var File_proto_types_request_file_meta_manage_proto protoreflect.FileDescriptor

var file_proto_types_request_file_meta_manage_proto_rawDesc = []byte{
	0x0a, 0x2a, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x66, 0x69, 0x6c, 0x65, 0x5f, 0x6d, 0x65, 0x74, 0x61, 0x5f,
	0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x07, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c,
	0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64,
	0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xa1,
	0x02, 0x0a, 0x11, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x69, 0x6c, 0x65, 0x50, 0x72, 0x65,
	0x70, 0x61, 0x72, 0x65, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01,
	0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x49, 0x64, 0x12, 0x2e, 0x0a, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x5f,
	0x62, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09,
	0xc2, 0x01, 0x06, 0x80, 0x02, 0x00, 0x88, 0x02, 0x41, 0x52, 0x09, 0x63, 0x72, 0x65, 0x61, 0x74,
	0x65, 0x64, 0x42, 0x79, 0x12, 0x2c, 0x0a, 0x0b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x6f, 0x77,
	0x6e, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12,
	0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0a, 0x73, 0x70, 0x61, 0x63, 0x65, 0x4f, 0x77, 0x6e,
	0x65, 0x72, 0x12, 0x37, 0x0a, 0x03, 0x70, 0x69, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x25, 0xe2, 0xdf, 0x1f, 0x0e, 0x0a, 0x0c, 0x0a, 0x03, 0x70, 0x69, 0x64, 0x12, 0x05, 0xc2, 0x01,
	0x02, 0x22, 0x00, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca,
	0x02, 0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x03, 0x70, 0x69, 0x64, 0x12, 0x24, 0x0a, 0x04, 0x6e,
	0x61, 0x6d, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x10, 0xe2, 0xdf, 0x1f, 0x0c, 0x12,
	0x0a, 0xc2, 0x01, 0x07, 0xc0, 0x01, 0x02, 0xc8, 0x01, 0x80, 0x01, 0x52, 0x04, 0x6e, 0x61, 0x6d,
	0x65, 0x12, 0x1f, 0x0a, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x03, 0x42,
	0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52, 0x04, 0x73, 0x69,
	0x7a, 0x65, 0x22, 0x8b, 0x03, 0x0a, 0x0e, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x69, 0x6c,
	0x65, 0x4d, 0x65, 0x74, 0x61, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69,
	0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2,
	0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2e, 0x0a, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64,
	0x5f, 0x62, 0x79, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12,
	0x09, 0xc2, 0x01, 0x06, 0x80, 0x02, 0x00, 0x88, 0x02, 0x41, 0x52, 0x09, 0x63, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x64, 0x42, 0x79, 0x12, 0x2c, 0x0a, 0x07, 0x66, 0x69, 0x6c, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01,
	0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x06, 0x66, 0x69, 0x6c,
	0x65, 0x49, 0x64, 0x12, 0x37, 0x0a, 0x03, 0x70, 0x69, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x25, 0xe2, 0xdf, 0x1f, 0x0e, 0x0a, 0x0c, 0x0a, 0x03, 0x70, 0x69, 0x64, 0x12, 0x05, 0xc2,
	0x01, 0x02, 0x22, 0x00, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14,
	0xca, 0x02, 0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x03, 0x70, 0x69, 0x64, 0x12, 0x24, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x10, 0xe2, 0xdf, 0x1f, 0x0c,
	0x12, 0x0a, 0xc2, 0x01, 0x07, 0xc0, 0x01, 0x02, 0xc8, 0x01, 0x80, 0x01, 0x52, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x12, 0x21, 0x0a, 0x04, 0x64, 0x65, 0x73, 0x63, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01, 0x04, 0xc8, 0x01, 0x80, 0x08, 0x52,
	0x04, 0x64, 0x65, 0x73, 0x63, 0x12, 0x1f, 0x0a, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00,
	0x52, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x12, 0x20, 0x0a, 0x04, 0x65, 0x74, 0x61, 0x67, 0x18, 0x08,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0,
	0x01, 0x20, 0x52, 0x04, 0x65, 0x74, 0x61, 0x67, 0x12, 0x26, 0x0a, 0x07, 0x76, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12,
	0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x10, 0x52, 0x07, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e,
	0x22, 0xc2, 0x01, 0x0a, 0x13, 0x52, 0x65, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x46, 0x69, 0x6c,
	0x65, 0x50, 0x72, 0x65, 0x70, 0x61, 0x72, 0x65, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f,
	0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52,
	0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2c, 0x0a, 0x0b, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x5f, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2,
	0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0a, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x4f, 0x77, 0x6e, 0x65, 0x72, 0x12, 0x2c, 0x0a, 0x07, 0x66, 0x69, 0x6c, 0x65, 0x5f, 0x69,
	0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2,
	0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x06, 0x66, 0x69,
	0x6c, 0x65, 0x49, 0x64, 0x12, 0x1f, 0x0a, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52,
	0x04, 0x73, 0x69, 0x7a, 0x65, 0x22, 0xdb, 0x01, 0x0a, 0x10, 0x52, 0x65, 0x43, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x46, 0x69, 0x6c, 0x65, 0x4d, 0x65, 0x74, 0x61, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf,
	0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73,
	0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2c, 0x0a, 0x07, 0x66, 0x69,
	0x6c, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f,
	0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x72, 0x65, 0x73, 0x2d,
	0x52, 0x06, 0x66, 0x69, 0x6c, 0x65, 0x49, 0x64, 0x12, 0x1f, 0x0a, 0x04, 0x73, 0x69, 0x7a, 0x65,
	0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01,
	0x02, 0x30, 0x00, 0x52, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x12, 0x20, 0x0a, 0x04, 0x65, 0x74, 0x61,
	0x67, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2,
	0x01, 0x03, 0xf0, 0x01, 0x20, 0x52, 0x04, 0x65, 0x74, 0x61, 0x67, 0x12, 0x26, 0x0a, 0x07, 0x76,
	0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf,
	0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x10, 0x52, 0x07, 0x76, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x22, 0x40, 0x0a, 0x10, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x46,
	0x69, 0x6c, 0x65, 0x4d, 0x65, 0x74, 0x61, 0x12, 0x2c, 0x0a, 0x07, 0x66, 0x69, 0x6c, 0x65, 0x5f,
	0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d,
	0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x06, 0x66,
	0x69, 0x6c, 0x65, 0x49, 0x64, 0x22, 0xa4, 0x01, 0x0a, 0x0e, 0x55, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x46, 0x69, 0x6c, 0x65, 0x4d, 0x65, 0x74, 0x61, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63,
	0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f,
	0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52,
	0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x25, 0x0a, 0x07, 0x66, 0x69, 0x6c, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12,
	0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x14, 0x52, 0x06, 0x66, 0x69, 0x6c, 0x65, 0x49, 0x64, 0x12,
	0x21, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0d, 0xe2,
	0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01, 0x04, 0x98, 0x02, 0xf4, 0x03, 0x52, 0x04, 0x6e, 0x61,
	0x6d, 0x65, 0x12, 0x18, 0x0a, 0x04, 0x64, 0x65, 0x73, 0x63, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x04, 0xe2, 0xdf, 0x1f, 0x00, 0x52, 0x04, 0x64, 0x65, 0x73, 0x63, 0x22, 0xd8, 0x02, 0x0a,
	0x0d, 0x4c, 0x69, 0x73, 0x74, 0x46, 0x69, 0x6c, 0x65, 0x4d, 0x65, 0x74, 0x61, 0x73, 0x12, 0x2e,
	0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02,
	0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2d,
	0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x17, 0xa2,
	0xa1, 0x1f, 0x06, 0xaa, 0x06, 0x03, 0x31, 0x30, 0x30, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xb2,
	0x01, 0x04, 0x30, 0x00, 0x38, 0x64, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x23, 0x0a,
	0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x05, 0x42, 0x0b, 0xe2,
	0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x06, 0x6f, 0x66, 0x66, 0x73,
	0x65, 0x74, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09,
	0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x25, 0x0a, 0x06, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68,
	0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01,
	0x04, 0x98, 0x02, 0xf4, 0x03, 0x52, 0x06, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x12, 0x46, 0x0a,
	0x07, 0x73, 0x6f, 0x72, 0x74, 0x5f, 0x62, 0x79, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x42, 0x2d,
	0xe2, 0xdf, 0x1f, 0x29, 0x12, 0x27, 0xc2, 0x01, 0x24, 0x4a, 0x00, 0x4a, 0x02, 0x69, 0x64, 0x4a,
	0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x4a, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65,
	0x64, 0x4a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x4a, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x52, 0x06, 0x73,
	0x6f, 0x72, 0x74, 0x42, 0x79, 0x12, 0x18, 0x0a, 0x07, 0x72, 0x65, 0x76, 0x65, 0x72, 0x73, 0x65,
	0x18, 0x08, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x72, 0x65, 0x76, 0x65, 0x72, 0x73, 0x65, 0x12,
	0x10, 0x0a, 0x03, 0x70, 0x69, 0x64, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x03, 0x70, 0x69,
	0x64, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x79, 0x70, 0x65, 0x73, 0x18, 0x0a, 0x20, 0x03, 0x28, 0x05,
	0x52, 0x05, 0x74, 0x79, 0x70, 0x65, 0x73, 0x22, 0x77, 0x0a, 0x0f, 0x44, 0x65, 0x6c, 0x65, 0x74,
	0x65, 0x46, 0x69, 0x6c, 0x65, 0x4d, 0x65, 0x74, 0x61, 0x73, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf,
	0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73,
	0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x34, 0x0a, 0x08, 0x66, 0x69,
	0x6c, 0x65, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x42, 0x19, 0xe2, 0xdf,
	0x1f, 0x15, 0x12, 0x13, 0xea, 0x01, 0x10, 0x30, 0x00, 0x38, 0x64, 0x5a, 0x0a, 0xc2, 0x01, 0x07,
	0xca, 0x02, 0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x07, 0x66, 0x69, 0x6c, 0x65, 0x49, 0x64, 0x73,
	0x42, 0x76, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69,
	0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70,
	0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x17, 0x50, 0x42, 0x52, 0x65, 0x71, 0x75,
	0x65, 0x73, 0x74, 0x46, 0x69, 0x6c, 0x65, 0x4d, 0x65, 0x74, 0x61, 0x4d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x50, 0x00, 0x5a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70,
	0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_request_file_meta_manage_proto_rawDescOnce sync.Once
	file_proto_types_request_file_meta_manage_proto_rawDescData = file_proto_types_request_file_meta_manage_proto_rawDesc
)

func file_proto_types_request_file_meta_manage_proto_rawDescGZIP() []byte {
	file_proto_types_request_file_meta_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_request_file_meta_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_request_file_meta_manage_proto_rawDescData)
	})
	return file_proto_types_request_file_meta_manage_proto_rawDescData
}

var file_proto_types_request_file_meta_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 8)
var file_proto_types_request_file_meta_manage_proto_goTypes = []interface{}{
	(*CreateFilePrepare)(nil),   // 0: request.CreateFilePrepare
	(*CreateFileMeta)(nil),      // 1: request.CreateFileMeta
	(*ReCreateFilePrepare)(nil), // 2: request.ReCreateFilePrepare
	(*ReCreateFileMeta)(nil),    // 3: request.ReCreateFileMeta
	(*DescribeFileMeta)(nil),    // 4: request.DescribeFileMeta
	(*UpdateFileMeta)(nil),      // 5: request.UpdateFileMeta
	(*ListFileMetas)(nil),       // 6: request.ListFileMetas
	(*DeleteFileMetas)(nil),     // 7: request.DeleteFileMetas
}
var file_proto_types_request_file_meta_manage_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_types_request_file_meta_manage_proto_init() }
func file_proto_types_request_file_meta_manage_proto_init() {
	if File_proto_types_request_file_meta_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_request_file_meta_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateFilePrepare); i {
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
		file_proto_types_request_file_meta_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateFileMeta); i {
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
		file_proto_types_request_file_meta_manage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReCreateFilePrepare); i {
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
		file_proto_types_request_file_meta_manage_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReCreateFileMeta); i {
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
		file_proto_types_request_file_meta_manage_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeFileMeta); i {
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
		file_proto_types_request_file_meta_manage_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateFileMeta); i {
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
		file_proto_types_request_file_meta_manage_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListFileMetas); i {
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
		file_proto_types_request_file_meta_manage_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteFileMetas); i {
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
			RawDescriptor: file_proto_types_request_file_meta_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   8,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_request_file_meta_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_request_file_meta_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_request_file_meta_manage_proto_msgTypes,
	}.Build()
	File_proto_types_request_file_meta_manage_proto = out.File
	file_proto_types_request_file_meta_manage_proto_rawDesc = nil
	file_proto_types_request_file_meta_manage_proto_goTypes = nil
	file_proto_types_request_file_meta_manage_proto_depIdxs = nil
}
