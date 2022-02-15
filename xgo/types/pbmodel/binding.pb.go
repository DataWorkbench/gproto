// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/binding.proto

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

// ModuleSource declares the source module info.
// used to query from db.
type ModuleSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// SourceId is the ID of the bound module.
	SourceId string `protobuf:"bytes,1,opt,name=source_id,json=sourceId,proto3" json:"source_id" gorm:"column:source_id;"`
	// SourceVersion is the version of the bound module.
	// Notice: Reserved field, unused on present.
	SourceVersion string `protobuf:"bytes,2,opt,name=source_version,json=sourceVersion,proto3" json:"source_version" gorm:"column:source_version;"`
}

func (x *ModuleSource) Reset() {
	*x = ModuleSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_binding_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ModuleSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ModuleSource) ProtoMessage() {}

func (x *ModuleSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_binding_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ModuleSource.ProtoReflect.Descriptor instead.
func (*ModuleSource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_binding_proto_rawDescGZIP(), []int{0}
}

func (x *ModuleSource) GetSourceId() string {
	if x != nil {
		return x.SourceId
	}
	return ""
}

func (x *ModuleSource) GetSourceVersion() string {
	if x != nil {
		return x.SourceVersion
	}
	return ""
}

// ModuleTarget declares the target module info.
// used to query from db.
type ModuleTarget struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// TargetId is the ID of which module binding it.
	TargetId string `protobuf:"bytes,1,opt,name=target_id,json=targetId,proto3" json:"target_id" gorm:"column:target_id;"`
	// TargetVersion represents the Target's version if there is a version number.
	// This filed maybe empty.
	TargetVersion string `protobuf:"bytes,2,opt,name=target_version,json=targetVersion,proto3" json:"target_version" gorm:"column:target_version;"`
}

func (x *ModuleTarget) Reset() {
	*x = ModuleTarget{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_binding_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ModuleTarget) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ModuleTarget) ProtoMessage() {}

func (x *ModuleTarget) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_binding_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ModuleTarget.ProtoReflect.Descriptor instead.
func (*ModuleTarget) Descriptor() ([]byte, []int) {
	return file_proto_types_model_binding_proto_rawDescGZIP(), []int{1}
}

func (x *ModuleTarget) GetTargetId() string {
	if x != nil {
		return x.TargetId
	}
	return ""
}

func (x *ModuleTarget) GetTargetVersion() string {
	if x != nil {
		return x.TargetVersion
	}
	return ""
}

// BindingModule for describes dependencies between modules.
type BindingModule struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Workspace ID it belongs to. Only used when delete workspace.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" gorm:"column:space_id;primaryKey;"`
	// SourceId is the ID of the bound module.
	SourceId string `protobuf:"bytes,2,opt,name=source_id,json=sourceId,proto3" json:"source_id" gorm:"column:source_id;primaryKey;"`
	// SourceVersion is the version of the bound module.
	// Notice: Reserved field, unused on present.
	SourceVersion string `protobuf:"bytes,3,opt,name=source_version,json=sourceVersion,proto3" json:"source_version" gorm:"column:source_version;primaryKey;"`
	// TargetId is the ID of which module binding it.
	TargetId string `protobuf:"bytes,4,opt,name=target_id,json=targetId,proto3" json:"target_id" gorm:"column:target_id;primaryKey;"`
	// TargetVersion represents the Target's version if there is a version number.
	// This filed maybe empty.
	TargetVersion string `protobuf:"bytes,5,opt,name=target_version,json=targetVersion,proto3" json:"target_version" gorm:"column:target_version;primaryKey;"`
	// Timestamp of create time.
	Created int64 `protobuf:"varint,6,opt,name=created,proto3" json:"created" gorm:"column:created;autoCreateTime;"`
}

func (x *BindingModule) Reset() {
	*x = BindingModule{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_binding_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *BindingModule) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*BindingModule) ProtoMessage() {}

func (x *BindingModule) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_binding_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use BindingModule.ProtoReflect.Descriptor instead.
func (*BindingModule) Descriptor() ([]byte, []int) {
	return file_proto_types_model_binding_proto_rawDescGZIP(), []int{2}
}

func (x *BindingModule) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *BindingModule) GetSourceId() string {
	if x != nil {
		return x.SourceId
	}
	return ""
}

func (x *BindingModule) GetSourceVersion() string {
	if x != nil {
		return x.SourceVersion
	}
	return ""
}

func (x *BindingModule) GetTargetId() string {
	if x != nil {
		return x.TargetId
	}
	return ""
}

func (x *BindingModule) GetTargetVersion() string {
	if x != nil {
		return x.TargetVersion
	}
	return ""
}

func (x *BindingModule) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

var File_proto_types_model_binding_proto protoreflect.FileDescriptor

var file_proto_types_model_binding_proto_rawDesc = []byte{
	0x0a, 0x1f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x62, 0x69, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63,
	0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8b, 0x01,
	0x0a, 0x0c, 0x4d, 0x6f, 0x64, 0x75, 0x6c, 0x65, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x29,
	0x0a, 0x09, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x14, 0x52,
	0x08, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x49, 0x64, 0x12, 0x50, 0x0a, 0x0e, 0x73, 0x6f, 0x75,
	0x72, 0x63, 0x65, 0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x29, 0xe2, 0xdf, 0x1f, 0x19, 0x0a, 0x17, 0x0a, 0x0e, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00,
	0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x10, 0x52, 0x0d, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0x8b, 0x01, 0x0a, 0x0c,
	0x4d, 0x6f, 0x64, 0x75, 0x6c, 0x65, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x29, 0x0a, 0x09,
	0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x14, 0x52, 0x08, 0x74,
	0x61, 0x72, 0x67, 0x65, 0x74, 0x49, 0x64, 0x12, 0x50, 0x0a, 0x0e, 0x74, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x29, 0xe2, 0xdf, 0x1f, 0x19, 0x0a, 0x17, 0x0a, 0x0e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f,
	0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0xe2, 0xdf,
	0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x10, 0x52, 0x0d, 0x74, 0x61, 0x72, 0x67,
	0x65, 0x74, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x22, 0xe0, 0x02, 0x0a, 0x0d, 0x42, 0x69,
	0x6e, 0x64, 0x69, 0x6e, 0x67, 0x4d, 0x6f, 0x64, 0x75, 0x6c, 0x65, 0x12, 0x2e, 0x0a, 0x08, 0x73,
	0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2,
	0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b,
	0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x29, 0x0a, 0x09, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c,
	0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x14, 0x52, 0x08, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x49, 0x64, 0x12, 0x50, 0x0a, 0x0e, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x5f, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x29,
	0xe2, 0xdf, 0x1f, 0x19, 0x0a, 0x17, 0x0a, 0x0e, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x76,
	0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0xe2, 0xdf, 0x1f,
	0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x10, 0x52, 0x0d, 0x73, 0x6f, 0x75, 0x72, 0x63,
	0x65, 0x56, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x29, 0x0a, 0x09, 0x74, 0x61, 0x72, 0x67,
	0x65, 0x74, 0x5f, 0x69, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f,
	0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x14, 0x52, 0x08, 0x74, 0x61, 0x72, 0x67, 0x65,
	0x74, 0x49, 0x64, 0x12, 0x50, 0x0a, 0x0e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x76, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x29, 0xe2, 0xdf, 0x1f,
	0x19, 0x0a, 0x17, 0x0a, 0x0e, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x5f, 0x76, 0x65, 0x72, 0x73,
	0x69, 0x6f, 0x6e, 0x12, 0x05, 0xc2, 0x01, 0x02, 0x22, 0x00, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06,
	0xc2, 0x01, 0x03, 0xf0, 0x01, 0x10, 0x52, 0x0d, 0x74, 0x61, 0x72, 0x67, 0x65, 0x74, 0x56, 0x65,
	0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x25, 0x0a, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64,
	0x18, 0x06, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01,
	0x02, 0x30, 0x00, 0x52, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x42, 0x69, 0x0a, 0x22,
	0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x42, 0x0e, 0x50, 0x42, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x42, 0x69, 0x6e, 0x64, 0x69,
	0x6e, 0x67, 0x50, 0x00, 0x5a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_binding_proto_rawDescOnce sync.Once
	file_proto_types_model_binding_proto_rawDescData = file_proto_types_model_binding_proto_rawDesc
)

func file_proto_types_model_binding_proto_rawDescGZIP() []byte {
	file_proto_types_model_binding_proto_rawDescOnce.Do(func() {
		file_proto_types_model_binding_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_binding_proto_rawDescData)
	})
	return file_proto_types_model_binding_proto_rawDescData
}

var file_proto_types_model_binding_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_proto_types_model_binding_proto_goTypes = []interface{}{
	(*ModuleSource)(nil),  // 0: model.ModuleSource
	(*ModuleTarget)(nil),  // 1: model.ModuleTarget
	(*BindingModule)(nil), // 2: model.BindingModule
}
var file_proto_types_model_binding_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_types_model_binding_proto_init() }
func file_proto_types_model_binding_proto_init() {
	if File_proto_types_model_binding_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_binding_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ModuleSource); i {
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
		file_proto_types_model_binding_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ModuleTarget); i {
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
		file_proto_types_model_binding_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*BindingModule); i {
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
			RawDescriptor: file_proto_types_model_binding_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_binding_proto_goTypes,
		DependencyIndexes: file_proto_types_model_binding_proto_depIdxs,
		MessageInfos:      file_proto_types_model_binding_proto_msgTypes,
	}.Build()
	File_proto_types_model_binding_proto = out.File
	file_proto_types_model_binding_proto_rawDesc = nil
	file_proto_types_model_binding_proto_goTypes = nil
	file_proto_types_model_binding_proto_depIdxs = nil
}