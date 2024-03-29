// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/workspace.proto

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

type Workspace_Status int32

const (
	Workspace_StatusUnset Workspace_Status = 0
	Workspace_Enabled     Workspace_Status = 1
	Workspace_Disabled    Workspace_Status = 2
	Workspace_Deleted     Workspace_Status = 3
)

// Enum value maps for Workspace_Status.
var (
	Workspace_Status_name = map[int32]string{
		0: "StatusUnset",
		1: "Enabled",
		2: "Disabled",
		3: "Deleted",
	}
	Workspace_Status_value = map[string]int32{
		"StatusUnset": 0,
		"Enabled":     1,
		"Disabled":    2,
		"Deleted":     3,
	}
)

func (x Workspace_Status) Enum() *Workspace_Status {
	p := new(Workspace_Status)
	*p = x
	return p
}

func (x Workspace_Status) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (Workspace_Status) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_workspace_proto_enumTypes[0].Descriptor()
}

func (Workspace_Status) Type() protoreflect.EnumType {
	return &file_proto_types_model_workspace_proto_enumTypes[0]
}

func (x Workspace_Status) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use Workspace_Status.Descriptor instead.
func (Workspace_Status) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_workspace_proto_rawDescGZIP(), []int{0, 0}
}

type NetworkConfig_Status int32

const (
	NetworkConfig_StatusUnset NetworkConfig_Status = 0
	NetworkConfig_Deleted     NetworkConfig_Status = 1
	NetworkConfig_Enabled     NetworkConfig_Status = 2
)

// Enum value maps for NetworkConfig_Status.
var (
	NetworkConfig_Status_name = map[int32]string{
		0: "StatusUnset",
		1: "Deleted",
		2: "Enabled",
	}
	NetworkConfig_Status_value = map[string]int32{
		"StatusUnset": 0,
		"Deleted":     1,
		"Enabled":     2,
	}
)

func (x NetworkConfig_Status) Enum() *NetworkConfig_Status {
	p := new(NetworkConfig_Status)
	*p = x
	return p
}

func (x NetworkConfig_Status) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (NetworkConfig_Status) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_workspace_proto_enumTypes[1].Descriptor()
}

func (NetworkConfig_Status) Type() protoreflect.EnumType {
	return &file_proto_types_model_workspace_proto_enumTypes[1]
}

func (x NetworkConfig_Status) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use NetworkConfig_Status.Descriptor instead.
func (NetworkConfig_Status) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_workspace_proto_rawDescGZIP(), []int{1, 0}
}

// The workspace info.
type Workspace struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Workspace ID, unique within a region.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id" gorm:"column:id;primaryKey;"`
	// User id of workspace owner.
	Owner string `protobuf:"bytes,2,opt,name=owner,proto3" json:"owner" gorm:"column:owner;"`
	// Workspace Name, unique within a region.
	Name string `protobuf:"bytes,3,opt,name=name,proto3" json:"name" gorm:"column:name;"`
	// Workspace Description.
	Desc string `protobuf:"bytes,4,opt,name=desc,proto3" json:"desc" gorm:"column:desc;"`
	// Workspace status, 1 => "enabled", 2 => "disabled", 3 => "deleted",
	Status Workspace_Status `protobuf:"varint,5,opt,name=status,proto3,enum=model.Workspace_Status" json:"status" gorm:"column:status;"`
	// Timestamp of create time.
	Created int64 `protobuf:"varint,7,opt,name=created,proto3" json:"created" gorm:"column:created;autoCreateTime;"`
	// Timestamp of update time.
	Updated int64 `protobuf:"varint,8,opt,name=updated,proto3" json:"updated" gorm:"column:updated;autoUpdateTime;"`
	// Indicates the workspace whether binds vpc when the network module is enabled.
	NetworkIsInit bool `protobuf:"varint,9,opt,name=network_is_init,json=networkIsInit,proto3" json:"network_is_init" gorm:"column:network_is_init;<-:false"`
}

func (x *Workspace) Reset() {
	*x = Workspace{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_workspace_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *Workspace) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*Workspace) ProtoMessage() {}

func (x *Workspace) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_workspace_proto_msgTypes[0]
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
	return file_proto_types_model_workspace_proto_rawDescGZIP(), []int{0}
}

func (x *Workspace) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *Workspace) GetOwner() string {
	if x != nil {
		return x.Owner
	}
	return ""
}

func (x *Workspace) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *Workspace) GetDesc() string {
	if x != nil {
		return x.Desc
	}
	return ""
}

func (x *Workspace) GetStatus() Workspace_Status {
	if x != nil {
		return x.Status
	}
	return Workspace_StatusUnset
}

func (x *Workspace) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

func (x *Workspace) GetUpdated() int64 {
	if x != nil {
		return x.Updated
	}
	return 0
}

func (x *Workspace) GetNetworkIsInit() bool {
	if x != nil {
		return x.NetworkIsInit
	}
	return false
}

// NetworkConfig declares the network config of a workspace.
type NetworkConfig struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Workspace ID it belongs to.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" gorm:"column:space_id;"`
	// VPC's route id, Is required.
	RouterId string `protobuf:"bytes,2,opt,name=router_id,json=routerId,proto3" json:"router_id" gorm:"column:router_id;"`
	// vxnet id. Is required.
	VxnetId string `protobuf:"bytes,3,opt,name=vxnet_id,json=vxnetId,proto3" json:"vxnet_id" gorm:"column:vxnet_id;"`
	// Network Status. 1 => "Deleted" 2 => "Enabled"
	Status NetworkConfig_Status `protobuf:"varint,4,opt,name=status,proto3,enum=model.NetworkConfig_Status" json:"status" gorm:"column:status;"`
	// IsDefault indicates the whether the vxnet is the defaults.
	IsDefault bool `protobuf:"varint,5,opt,name=is_default,json=isDefault,proto3" json:"is_default" gorm:"column:is_default;"`
	// Timestamp of create time.
	Created int64 `protobuf:"varint,6,opt,name=created,proto3" json:"created" gorm:"column:created;autoCreateTime;"`
	// Timestamp of update time.
	Updated int64 `protobuf:"varint,7,opt,name=updated,proto3" json:"updated" gorm:"column:updated;autoUpdateTime;"`
}

func (x *NetworkConfig) Reset() {
	*x = NetworkConfig{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_workspace_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *NetworkConfig) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*NetworkConfig) ProtoMessage() {}

func (x *NetworkConfig) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_workspace_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use NetworkConfig.ProtoReflect.Descriptor instead.
func (*NetworkConfig) Descriptor() ([]byte, []int) {
	return file_proto_types_model_workspace_proto_rawDescGZIP(), []int{1}
}

func (x *NetworkConfig) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *NetworkConfig) GetRouterId() string {
	if x != nil {
		return x.RouterId
	}
	return ""
}

func (x *NetworkConfig) GetVxnetId() string {
	if x != nil {
		return x.VxnetId
	}
	return ""
}

func (x *NetworkConfig) GetStatus() NetworkConfig_Status {
	if x != nil {
		return x.Status
	}
	return NetworkConfig_StatusUnset
}

func (x *NetworkConfig) GetIsDefault() bool {
	if x != nil {
		return x.IsDefault
	}
	return false
}

func (x *NetworkConfig) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

func (x *NetworkConfig) GetUpdated() int64 {
	if x != nil {
		return x.Updated
	}
	return 0
}

var File_proto_types_model_workspace_proto protoreflect.FileDescriptor

var file_proto_types_model_workspace_proto_rawDesc = []byte{
	0x0a, 0x21, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x77, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68,
	0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0x87, 0x03, 0x0a, 0x09, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x23, 0x0a,
	0x02, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12,
	0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x02,
	0x69, 0x64, 0x12, 0x22, 0x0a, 0x05, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0x98, 0x02, 0x40, 0x52,
	0x05, 0x6f, 0x77, 0x6e, 0x65, 0x72, 0x12, 0x24, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x10, 0xe2, 0xdf, 0x1f, 0x0c, 0x12, 0x0a, 0xc2, 0x01, 0x07, 0x80,
	0x02, 0x01, 0x98, 0x02, 0x80, 0x01, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x12, 0x0a, 0x04,
	0x64, 0x65, 0x73, 0x63, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x64, 0x65, 0x73, 0x63,
	0x12, 0x3e, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0e,
	0x32, 0x17, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12,
	0x07, 0xda, 0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x12, 0x25, 0x0a, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x07, 0x20, 0x01, 0x28,
	0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52, 0x07,
	0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x12, 0x25, 0x0a, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74,
	0x65, 0x64, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05,
	0xb2, 0x01, 0x02, 0x30, 0x00, 0x52, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x12, 0x26,
	0x0a, 0x0f, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5f, 0x69, 0x73, 0x5f, 0x69, 0x6e, 0x69,
	0x74, 0x18, 0x09, 0x20, 0x01, 0x28, 0x08, 0x52, 0x0d, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x49, 0x73, 0x49, 0x6e, 0x69, 0x74, 0x22, 0x41, 0x0a, 0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x12, 0x0f, 0x0a, 0x0b, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10,
	0x00, 0x12, 0x0b, 0x0a, 0x07, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x10, 0x01, 0x12, 0x0c,
	0x0a, 0x08, 0x44, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x12, 0x0b, 0x0a, 0x07,
	0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x64, 0x10, 0x03, 0x22, 0x83, 0x03, 0x0a, 0x0d, 0x4e, 0x65,
	0x74, 0x77, 0x6f, 0x72, 0x6b, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x12, 0x2e, 0x0a, 0x08, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2,
	0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b,
	0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x2d, 0x0a, 0x09, 0x72,
	0x6f, 0x75, 0x74, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x10,
	0xe2, 0xdf, 0x1f, 0x0c, 0x12, 0x0a, 0xc2, 0x01, 0x07, 0xca, 0x02, 0x04, 0x72, 0x74, 0x72, 0x2d,
	0x52, 0x08, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x72, 0x49, 0x64, 0x12, 0x2d, 0x0a, 0x08, 0x76, 0x78,
	0x6e, 0x65, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x12, 0xe2, 0xdf,
	0x1f, 0x0e, 0x12, 0x0c, 0xc2, 0x01, 0x09, 0xca, 0x02, 0x06, 0x76, 0x78, 0x6e, 0x65, 0x74, 0x2d,
	0x52, 0x07, 0x76, 0x78, 0x6e, 0x65, 0x74, 0x49, 0x64, 0x12, 0x42, 0x0a, 0x06, 0x73, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1b, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x2e,
	0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01,
	0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x1d, 0x0a,
	0x0a, 0x69, 0x73, 0x5f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28,
	0x08, 0x52, 0x09, 0x69, 0x73, 0x44, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x12, 0x25, 0x0a, 0x07,
	0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2,
	0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52, 0x07, 0x63, 0x72, 0x65, 0x61,
	0x74, 0x65, 0x64, 0x12, 0x25, 0x0a, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x18, 0x07,
	0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30,
	0x00, 0x52, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x22, 0x33, 0x0a, 0x06, 0x53, 0x74,
	0x61, 0x74, 0x75, 0x73, 0x12, 0x0f, 0x0a, 0x0b, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x55, 0x6e,
	0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x64,
	0x10, 0x01, 0x12, 0x0b, 0x0a, 0x07, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x42,
	0x6b, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73,
	0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x42, 0x10, 0x50, 0x42, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x57, 0x6f,
	0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x50, 0x00, 0x5a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75,
	0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65,
	0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x62, 0x06, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_workspace_proto_rawDescOnce sync.Once
	file_proto_types_model_workspace_proto_rawDescData = file_proto_types_model_workspace_proto_rawDesc
)

func file_proto_types_model_workspace_proto_rawDescGZIP() []byte {
	file_proto_types_model_workspace_proto_rawDescOnce.Do(func() {
		file_proto_types_model_workspace_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_workspace_proto_rawDescData)
	})
	return file_proto_types_model_workspace_proto_rawDescData
}

var file_proto_types_model_workspace_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_proto_types_model_workspace_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_proto_types_model_workspace_proto_goTypes = []interface{}{
	(Workspace_Status)(0),     // 0: model.Workspace.Status
	(NetworkConfig_Status)(0), // 1: model.NetworkConfig.Status
	(*Workspace)(nil),         // 2: model.Workspace
	(*NetworkConfig)(nil),     // 3: model.NetworkConfig
}
var file_proto_types_model_workspace_proto_depIdxs = []int32{
	0, // 0: model.Workspace.status:type_name -> model.Workspace.Status
	1, // 1: model.NetworkConfig.status:type_name -> model.NetworkConfig.Status
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_proto_types_model_workspace_proto_init() }
func file_proto_types_model_workspace_proto_init() {
	if File_proto_types_model_workspace_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_workspace_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_types_model_workspace_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*NetworkConfig); i {
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
			RawDescriptor: file_proto_types_model_workspace_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_workspace_proto_goTypes,
		DependencyIndexes: file_proto_types_model_workspace_proto_depIdxs,
		EnumInfos:         file_proto_types_model_workspace_proto_enumTypes,
		MessageInfos:      file_proto_types_model_workspace_proto_msgTypes,
	}.Build()
	File_proto_types_model_workspace_proto = out.File
	file_proto_types_model_workspace_proto_rawDesc = nil
	file_proto_types_model_workspace_proto_goTypes = nil
	file_proto_types_model_workspace_proto_depIdxs = nil
}
