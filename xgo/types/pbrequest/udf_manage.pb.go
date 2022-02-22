// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/udf_manage.proto

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

// ListUDF used as a request parameters for RPC and HTTP(based on URL-Query)
type ListUDFs struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// SpaceID; required.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// Limit the maximum number of entries returned this time.
	Limit int32 `protobuf:"varint,2,opt,name=limit,proto3" json:"limit" form:"limit"`
	// The offset position. Not required, default 0.
	Offset int32 `protobuf:"varint,3,opt,name=offset,proto3" json:"offset" form:"offset"`
	// The field list used to sorted query results.
	// Optional values: {udf_id, name, created, updated}.
	// Multiple fields are separated by commas(","), eg: sort_by="updated".
	// Not required, default: updated.
	SortBy string `protobuf:"bytes,4,opt,name=sort_by,json=sortBy,proto3" json:"sort_by" form:"sort_by"`
	// Reverse order results. Not required, default: false.
	Reverse bool `protobuf:"varint,5,opt,name=reverse,proto3" json:"reverse" form:"reverse"`
	// Search with name; Not required.
	Search string `protobuf:"bytes,6,opt,name=search,proto3" json:"search" form:"search"`
	// UDF Type; Optional Values: 1=>UDF, 2=>UDTF 3=> UDTTF. Not required.
	Type pbmodel.UDF_Type `protobuf:"varint,7,opt,name=type,proto3,enum=model.UDF_Type" json:"type" form:"type"`
}

func (x *ListUDFs) Reset() {
	*x = ListUDFs{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_udf_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListUDFs) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListUDFs) ProtoMessage() {}

func (x *ListUDFs) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_udf_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListUDFs.ProtoReflect.Descriptor instead.
func (*ListUDFs) Descriptor() ([]byte, []int) {
	return file_proto_types_request_udf_manage_proto_rawDescGZIP(), []int{0}
}

func (x *ListUDFs) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *ListUDFs) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *ListUDFs) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

func (x *ListUDFs) GetSortBy() string {
	if x != nil {
		return x.SortBy
	}
	return ""
}

func (x *ListUDFs) GetReverse() bool {
	if x != nil {
		return x.Reverse
	}
	return false
}

func (x *ListUDFs) GetSearch() string {
	if x != nil {
		return x.Search
	}
	return ""
}

func (x *ListUDFs) GetType() pbmodel.UDF_Type {
	if x != nil {
		return x.Type
	}
	return pbmodel.UDF_Type(0)
}

// DeleteUDF used as request parameters for RPC and HTTP(based on Body)
type DeleteUDFs struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id in HTTP Request-URI
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" uri:"space_id" swaggerignore:"true"`
	// The list of udf that will be deleted.
	UdfIds []string `protobuf:"bytes,2,rep,name=udf_ids,json=udfIds,proto3" json:"udf_ids"`
}

func (x *DeleteUDFs) Reset() {
	*x = DeleteUDFs{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_udf_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DeleteUDFs) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DeleteUDFs) ProtoMessage() {}

func (x *DeleteUDFs) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_udf_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DeleteUDFs.ProtoReflect.Descriptor instead.
func (*DeleteUDFs) Descriptor() ([]byte, []int) {
	return file_proto_types_request_udf_manage_proto_rawDescGZIP(), []int{1}
}

func (x *DeleteUDFs) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *DeleteUDFs) GetUdfIds() []string {
	if x != nil {
		return x.UdfIds
	}
	return nil
}

// UDF is one of ScalaUDF/ScalaUDTF/ScalaUDTTF/JarUDF/JarUDTF/JarUDTTF/PythonUDF/PythonUDTF
// CreateUDF used as request parameters for RPC and HTTP(based on Body)
type CreateUDF struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The space id in request-uri.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" swaggerignore:"true"`
	// UDF name unique within a space.
	Name string `protobuf:"bytes,2,opt,name=name,proto3" json:"name"`
	// description this udf.
	Desc string `protobuf:"bytes,3,opt,name=desc,proto3" json:"desc"`
	// UDF Type; Optional Values: 1=>UDF, 2=>UDTF 3=> UDTTF.
	Type pbmodel.UDF_Type `protobuf:"varint,4,opt,name=type,proto3,enum=model.UDF_Type" json:"type"`
	// language of UDF; Optional Values: 1 => Scala 2=> Java 3=> Python
	Language pbmodel.UDF_Language `protobuf:"varint,5,opt,name=language,proto3,enum=model.UDF_Language" json:"language"`
	// The id of resource. Used with language of JAVA.
	// Is required if language == 2
	FileId string `protobuf:"bytes,6,opt,name=file_id,json=fileId,proto3" json:"file_id" gorm:"column:file_id;"`
	// The code. Used with language of Python and Scala.
	// Is required if language == (1 or 3). Min Charset Length: 1, Max Charset Length: 20000.
	Code string `protobuf:"bytes,7,opt,name=code,proto3" json:"code" gorm:"column:code;"`
	// usage sample for this udf
	UsageSample string `protobuf:"bytes,8,opt,name=usage_sample,json=usageSample,proto3" json:"usage_sample"`
	// Udf owner.
	CreatedBy string `protobuf:"bytes,9,opt,name=created_by,json=createdBy,proto3" json:"created_by"`
	// The owner of workspace, only used to check quota. Set by APIServer.
	SpaceOwner string `protobuf:"bytes,10,opt,name=space_owner,json=spaceOwner,proto3" json:"space_owner" swaggerignore:"true"`
}

func (x *CreateUDF) Reset() {
	*x = CreateUDF{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_udf_manage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateUDF) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateUDF) ProtoMessage() {}

func (x *CreateUDF) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_udf_manage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateUDF.ProtoReflect.Descriptor instead.
func (*CreateUDF) Descriptor() ([]byte, []int) {
	return file_proto_types_request_udf_manage_proto_rawDescGZIP(), []int{2}
}

func (x *CreateUDF) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *CreateUDF) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *CreateUDF) GetDesc() string {
	if x != nil {
		return x.Desc
	}
	return ""
}

func (x *CreateUDF) GetType() pbmodel.UDF_Type {
	if x != nil {
		return x.Type
	}
	return pbmodel.UDF_Type(0)
}

func (x *CreateUDF) GetLanguage() pbmodel.UDF_Language {
	if x != nil {
		return x.Language
	}
	return pbmodel.UDF_Language(0)
}

func (x *CreateUDF) GetFileId() string {
	if x != nil {
		return x.FileId
	}
	return ""
}

func (x *CreateUDF) GetCode() string {
	if x != nil {
		return x.Code
	}
	return ""
}

func (x *CreateUDF) GetUsageSample() string {
	if x != nil {
		return x.UsageSample
	}
	return ""
}

func (x *CreateUDF) GetCreatedBy() string {
	if x != nil {
		return x.CreatedBy
	}
	return ""
}

func (x *CreateUDF) GetSpaceOwner() string {
	if x != nil {
		return x.SpaceOwner
	}
	return ""
}

// UpdateUDF used as request parameters for RPC and HTTP(based on Body)
type UpdateUDF struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The space id in request-uri.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" swaggerignore:"true"`
	// The udf id.
	UdfId string `protobuf:"bytes,2,opt,name=udf_id,json=udfId,proto3" json:"udf_id" swaggerignore:"true"`
	// UDF name unique within a space.
	Name string `protobuf:"bytes,3,opt,name=name,proto3" json:"name"`
	// description this udf.
	Desc string `protobuf:"bytes,4,opt,name=desc,proto3" json:"desc"`
	// The id of resource. Used with language of JAVA.
	// Is required if language == 2
	FileId string `protobuf:"bytes,5,opt,name=file_id,json=fileId,proto3" json:"file_id" gorm:"column:file_id;"`
	// The code. Used with language of Python and Scala.
	// Is required if language == (1 or 3). Min Charset Length: 1, Max Charset Length: 20000.
	Code string `protobuf:"bytes,6,opt,name=code,proto3" json:"code" gorm:"column:code;"`
	// usage for this udf
	UsageSample string `protobuf:"bytes,7,opt,name=usage_sample,json=usageSample,proto3" json:"usage_sample"`
}

func (x *UpdateUDF) Reset() {
	*x = UpdateUDF{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_udf_manage_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *UpdateUDF) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*UpdateUDF) ProtoMessage() {}

func (x *UpdateUDF) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_udf_manage_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use UpdateUDF.ProtoReflect.Descriptor instead.
func (*UpdateUDF) Descriptor() ([]byte, []int) {
	return file_proto_types_request_udf_manage_proto_rawDescGZIP(), []int{3}
}

func (x *UpdateUDF) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *UpdateUDF) GetUdfId() string {
	if x != nil {
		return x.UdfId
	}
	return ""
}

func (x *UpdateUDF) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *UpdateUDF) GetDesc() string {
	if x != nil {
		return x.Desc
	}
	return ""
}

func (x *UpdateUDF) GetFileId() string {
	if x != nil {
		return x.FileId
	}
	return ""
}

func (x *UpdateUDF) GetCode() string {
	if x != nil {
		return x.Code
	}
	return ""
}

func (x *UpdateUDF) GetUsageSample() string {
	if x != nil {
		return x.UsageSample
	}
	return ""
}

// DescribeUDF used as request parameters for RPC and HTTP(based on Body)
type DescribeUDF struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	UdfId string `protobuf:"bytes,1,opt,name=udf_id,json=udfId,proto3" json:"udf_id"`
}

func (x *DescribeUDF) Reset() {
	*x = DescribeUDF{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_udf_manage_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeUDF) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeUDF) ProtoMessage() {}

func (x *DescribeUDF) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_udf_manage_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeUDF.ProtoReflect.Descriptor instead.
func (*DescribeUDF) Descriptor() ([]byte, []int) {
	return file_proto_types_request_udf_manage_proto_rawDescGZIP(), []int{4}
}

func (x *DescribeUDF) GetUdfId() string {
	if x != nil {
		return x.UdfId
	}
	return ""
}

var File_proto_types_request_udf_manage_proto protoreflect.FileDescriptor

var file_proto_types_request_udf_manage_proto_rawDesc = []byte{
	0x0a, 0x24, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x75, 0x64, 0x66, 0x5f, 0x6d, 0x61, 0x6e, 0x61, 0x67, 0x65,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x07, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75,
	0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c,
	0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x1b, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x75, 0x64, 0x66, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xb4, 0x02, 0x0a, 0x08, 0x4c, 0x69, 0x73, 0x74, 0x55, 0x44,
	0x46, 0x73, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0,
	0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65,
	0x49, 0x64, 0x12, 0x2d, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x05, 0x42, 0x17, 0xa2, 0xa1, 0x1f, 0x06, 0xaa, 0x06, 0x03, 0x31, 0x30, 0x30, 0xe2, 0xdf, 0x1f,
	0x09, 0x12, 0x07, 0xb2, 0x01, 0x04, 0x30, 0x00, 0x38, 0x64, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69,
	0x74, 0x12, 0x23, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x05, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x06,
	0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x12, 0x40, 0x0a, 0x07, 0x73, 0x6f, 0x72, 0x74, 0x5f, 0x62,
	0x79, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x27, 0xe2, 0xdf, 0x1f, 0x23, 0x12, 0x21, 0xc2,
	0x01, 0x1e, 0x4a, 0x00, 0x4a, 0x02, 0x69, 0x64, 0x4a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x4a, 0x07,
	0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x4a, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64,
	0x52, 0x06, 0x73, 0x6f, 0x72, 0x74, 0x42, 0x79, 0x12, 0x18, 0x0a, 0x07, 0x72, 0x65, 0x76, 0x65,
	0x72, 0x73, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x72, 0x65, 0x76, 0x65, 0x72,
	0x73, 0x65, 0x12, 0x16, 0x0a, 0x06, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x18, 0x06, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x06, 0x73, 0x65, 0x61, 0x72, 0x63, 0x68, 0x12, 0x30, 0x0a, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x0f, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2e, 0x55, 0x44, 0x46, 0x2e, 0x54, 0x79, 0x70, 0x65, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12,
	0x05, 0xda, 0x01, 0x02, 0x58, 0x01, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x22, 0x70, 0x0a, 0x0a,
	0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x55, 0x44, 0x46, 0x73, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf,
	0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73,
	0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x32, 0x0a, 0x07, 0x75, 0x64,
	0x66, 0x5f, 0x69, 0x64, 0x73, 0x18, 0x02, 0x20, 0x03, 0x28, 0x09, 0x42, 0x19, 0xe2, 0xdf, 0x1f,
	0x15, 0x12, 0x13, 0xea, 0x01, 0x10, 0x28, 0x64, 0x30, 0x00, 0x5a, 0x0a, 0xc2, 0x01, 0x07, 0xca,
	0x02, 0x04, 0x75, 0x64, 0x66, 0x2d, 0x52, 0x06, 0x75, 0x64, 0x66, 0x49, 0x64, 0x73, 0x22, 0x88,
	0x04, 0x0a, 0x09, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65, 0x55, 0x44, 0x46, 0x12, 0x2e, 0x0a, 0x08,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13,
	0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77,
	0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x23, 0x0a, 0x04,
	0x6e, 0x61, 0x6d, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b,
	0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x41, 0x52, 0x04, 0x6e, 0x61, 0x6d,
	0x65, 0x12, 0x21, 0x0a, 0x04, 0x64, 0x65, 0x73, 0x63, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01, 0x04, 0x98, 0x02, 0x80, 0x02, 0x52, 0x04,
	0x64, 0x65, 0x73, 0x63, 0x12, 0x32, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x0f, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x55, 0x44, 0x46, 0x2e, 0x54,
	0x79, 0x70, 0x65, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01, 0x04, 0x30, 0x00,
	0x58, 0x01, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x3e, 0x0a, 0x08, 0x6c, 0x61, 0x6e, 0x67,
	0x75, 0x61, 0x67, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x13, 0x2e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x55, 0x44, 0x46, 0x2e, 0x4c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x42,
	0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x08,
	0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x12, 0x43, 0x0a, 0x07, 0x66, 0x69, 0x6c, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x42, 0x2a, 0xe2, 0xdf, 0x1f, 0x13, 0x0a,
	0x11, 0x0a, 0x08, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x12, 0x05, 0xda, 0x01, 0x02,
	0x18, 0x02, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02,
	0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x06, 0x66, 0x69, 0x6c, 0x65, 0x49, 0x64, 0x12, 0x3e, 0x0a,
	0x04, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x42, 0x2a, 0xe2, 0xdf, 0x1f,
	0x15, 0x0a, 0x13, 0x0a, 0x08, 0x6c, 0x61, 0x6e, 0x67, 0x75, 0x61, 0x67, 0x65, 0x12, 0x07, 0xda,
	0x01, 0x04, 0x4a, 0x02, 0x01, 0x03, 0xe2, 0xdf, 0x1f, 0x0d, 0x12, 0x0b, 0xc2, 0x01, 0x08, 0xb0,
	0x01, 0x00, 0xc8, 0x01, 0xa0, 0x9c, 0x01, 0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x12, 0x30, 0x0a,
	0x0c, 0x75, 0x73, 0x61, 0x67, 0x65, 0x5f, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x18, 0x08, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01, 0x04, 0xc8, 0x01,
	0xd0, 0x0f, 0x52, 0x0b, 0x75, 0x73, 0x61, 0x67, 0x65, 0x53, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x12,
	0x2a, 0x0a, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x5f, 0x62, 0x79, 0x18, 0x09, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00,
	0x52, 0x09, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x42, 0x79, 0x12, 0x2c, 0x0a, 0x0b, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x5f, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0x52, 0x0a, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x4f, 0x77, 0x6e, 0x65, 0x72, 0x22, 0xdf, 0x02, 0x0a, 0x09, 0x55, 0x70,
	0x64, 0x61, 0x74, 0x65, 0x55, 0x44, 0x46, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65,
	0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12,
	0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2a, 0x0a, 0x06, 0x75, 0x64, 0x66, 0x5f, 0x69,
	0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2,
	0x01, 0x0a, 0x88, 0x02, 0x15, 0xca, 0x02, 0x04, 0x75, 0x64, 0x66, 0x2d, 0x52, 0x05, 0x75, 0x64,
	0x66, 0x49, 0x64, 0x12, 0x23, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x80, 0x02, 0x00, 0x98,
	0x02, 0x41, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x21, 0x0a, 0x04, 0x64, 0x65, 0x73, 0x63,
	0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01,
	0x04, 0x98, 0x02, 0x80, 0x02, 0x52, 0x04, 0x64, 0x65, 0x73, 0x63, 0x12, 0x42, 0x0a, 0x07, 0x66,
	0x69, 0x6c, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x29, 0xe2, 0xdf,
	0x1f, 0x12, 0x0a, 0x10, 0x0a, 0x07, 0x66, 0x69, 0x6c, 0x65, 0x5f, 0x69, 0x64, 0x12, 0x05, 0xc2,
	0x01, 0x02, 0x22, 0x00, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14,
	0xca, 0x02, 0x04, 0x72, 0x65, 0x73, 0x2d, 0x52, 0x06, 0x66, 0x69, 0x6c, 0x65, 0x49, 0x64, 0x12,
	0x38, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x42, 0x24, 0xe2,
	0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x12, 0x05, 0xc2, 0x01, 0x02,
	0x22, 0x00, 0xe2, 0xdf, 0x1f, 0x0d, 0x12, 0x0b, 0xc2, 0x01, 0x08, 0xb0, 0x01, 0x00, 0xc8, 0x01,
	0xa0, 0x9c, 0x01, 0x52, 0x04, 0x63, 0x6f, 0x64, 0x65, 0x12, 0x30, 0x0a, 0x0c, 0x75, 0x73, 0x61,
	0x67, 0x65, 0x5f, 0x73, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01, 0x04, 0xc8, 0x01, 0xd0, 0x0f, 0x52, 0x0b,
	0x75, 0x73, 0x61, 0x67, 0x65, 0x53, 0x61, 0x6d, 0x70, 0x6c, 0x65, 0x22, 0x39, 0x0a, 0x0b, 0x44,
	0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x55, 0x44, 0x46, 0x12, 0x2a, 0x0a, 0x06, 0x75, 0x64,
	0x66, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f,
	0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x75, 0x64, 0x66, 0x2d, 0x52,
	0x05, 0x75, 0x64, 0x66, 0x49, 0x64, 0x42, 0x71, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61,
	0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x12,
	0x50, 0x42, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x55, 0x44, 0x46, 0x4d, 0x61, 0x6e, 0x61,
	0x67, 0x65, 0x50, 0x00, 0x5a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_proto_types_request_udf_manage_proto_rawDescOnce sync.Once
	file_proto_types_request_udf_manage_proto_rawDescData = file_proto_types_request_udf_manage_proto_rawDesc
)

func file_proto_types_request_udf_manage_proto_rawDescGZIP() []byte {
	file_proto_types_request_udf_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_request_udf_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_request_udf_manage_proto_rawDescData)
	})
	return file_proto_types_request_udf_manage_proto_rawDescData
}

var file_proto_types_request_udf_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 5)
var file_proto_types_request_udf_manage_proto_goTypes = []interface{}{
	(*ListUDFs)(nil),          // 0: request.ListUDFs
	(*DeleteUDFs)(nil),        // 1: request.DeleteUDFs
	(*CreateUDF)(nil),         // 2: request.CreateUDF
	(*UpdateUDF)(nil),         // 3: request.UpdateUDF
	(*DescribeUDF)(nil),       // 4: request.DescribeUDF
	(pbmodel.UDF_Type)(0),     // 5: model.UDF.Type
	(pbmodel.UDF_Language)(0), // 6: model.UDF.Language
}
var file_proto_types_request_udf_manage_proto_depIdxs = []int32{
	5, // 0: request.ListUDFs.type:type_name -> model.UDF.Type
	5, // 1: request.CreateUDF.type:type_name -> model.UDF.Type
	6, // 2: request.CreateUDF.language:type_name -> model.UDF.Language
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_proto_types_request_udf_manage_proto_init() }
func file_proto_types_request_udf_manage_proto_init() {
	if File_proto_types_request_udf_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_request_udf_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListUDFs); i {
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
		file_proto_types_request_udf_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DeleteUDFs); i {
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
		file_proto_types_request_udf_manage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateUDF); i {
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
		file_proto_types_request_udf_manage_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*UpdateUDF); i {
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
		file_proto_types_request_udf_manage_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeUDF); i {
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
			RawDescriptor: file_proto_types_request_udf_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   5,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_request_udf_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_request_udf_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_request_udf_manage_proto_msgTypes,
	}.Build()
	File_proto_types_request_udf_manage_proto = out.File
	file_proto_types_request_udf_manage_proto_rawDesc = nil
	file_proto_types_request_udf_manage_proto_goTypes = nil
	file_proto_types_request_udf_manage_proto_depIdxs = nil
}
