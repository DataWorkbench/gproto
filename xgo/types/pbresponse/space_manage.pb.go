// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/space_manage.proto

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

// ListWorkspaces used as reply parameters in RPC or response body in HTTP.
type ListWorkspaces struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.Workspace `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	HasMore bool                 `protobuf:"varint,2,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
	Total   int64                `protobuf:"varint,3,opt,name=total,proto3" json:"total"`
}

func (x *ListWorkspaces) Reset() {
	*x = ListWorkspaces{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_space_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListWorkspaces) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListWorkspaces) ProtoMessage() {}

func (x *ListWorkspaces) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_space_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListWorkspaces.ProtoReflect.Descriptor instead.
func (*ListWorkspaces) Descriptor() ([]byte, []int) {
	return file_proto_types_response_space_manage_proto_rawDescGZIP(), []int{0}
}

func (x *ListWorkspaces) GetInfos() []*pbmodel.Workspace {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListWorkspaces) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

func (x *ListWorkspaces) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

// CreateWorkspace used as reply parameters in RPC or response body in HTTP.
type CreateWorkspace struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The workspace id that generated by system.
	Id string `protobuf:"bytes,1,opt,name=id,proto3" json:"id"`
}

func (x *CreateWorkspace) Reset() {
	*x = CreateWorkspace{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_space_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CreateWorkspace) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CreateWorkspace) ProtoMessage() {}

func (x *CreateWorkspace) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_space_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CreateWorkspace.ProtoReflect.Descriptor instead.
func (*CreateWorkspace) Descriptor() ([]byte, []int) {
	return file_proto_types_response_space_manage_proto_rawDescGZIP(), []int{1}
}

func (x *CreateWorkspace) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

// DescribeWorkspace used as reply parameters in RPC, And model.Workspace used as response body in HTTP.
type DescribeWorkspace struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *pbmodel.Workspace `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
}

func (x *DescribeWorkspace) Reset() {
	*x = DescribeWorkspace{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_space_manage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeWorkspace) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeWorkspace) ProtoMessage() {}

func (x *DescribeWorkspace) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_space_manage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeWorkspace.ProtoReflect.Descriptor instead.
func (*DescribeWorkspace) Descriptor() ([]byte, []int) {
	return file_proto_types_response_space_manage_proto_rawDescGZIP(), []int{2}
}

func (x *DescribeWorkspace) GetInfo() *pbmodel.Workspace {
	if x != nil {
		return x.Info
	}
	return nil
}

type CheckPermission struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *pbmodel.Workspace `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
}

func (x *CheckPermission) Reset() {
	*x = CheckPermission{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_space_manage_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *CheckPermission) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*CheckPermission) ProtoMessage() {}

func (x *CheckPermission) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_space_manage_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use CheckPermission.ProtoReflect.Descriptor instead.
func (*CheckPermission) Descriptor() ([]byte, []int) {
	return file_proto_types_response_space_manage_proto_rawDescGZIP(), []int{3}
}

func (x *CheckPermission) GetInfo() *pbmodel.Workspace {
	if x != nil {
		return x.Info
	}
	return nil
}

var File_proto_types_response_space_manage_proto protoreflect.FileDescriptor

var file_proto_types_response_space_manage_proto_rawDesc = []byte{
	0x0a, 0x27, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67,
	0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74,
	0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x21, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x77, 0x6f, 0x72, 0x6b,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x69, 0x0a, 0x0e, 0x4c,
	0x69, 0x73, 0x74, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x73, 0x12, 0x26, 0x0a,
	0x05, 0x69, 0x6e, 0x66, 0x6f, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x52, 0x05,
	0x69, 0x6e, 0x66, 0x6f, 0x73, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72,
	0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65,
	0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52,
	0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x22, 0x36, 0x0a, 0x0f, 0x43, 0x72, 0x65, 0x61, 0x74, 0x65,
	0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x12, 0x23, 0x0a, 0x02, 0x69, 0x64, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a,
	0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x02, 0x69, 0x64, 0x22, 0x39,
	0x0a, 0x11, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x12, 0x24, 0x0a, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x18, 0x01, 0x20, 0x01, 0x28,
	0x0b, 0x32, 0x10, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70,
	0x61, 0x63, 0x65, 0x52, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x22, 0x37, 0x0a, 0x0f, 0x43, 0x68, 0x65,
	0x63, 0x6b, 0x50, 0x65, 0x72, 0x6d, 0x69, 0x73, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x24, 0x0a, 0x04,
	0x69, 0x6e, 0x66, 0x6f, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x52, 0x04, 0x69, 0x6e,
	0x66, 0x6f, 0x42, 0x76, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d,
	0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73,
	0x2e, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x15, 0x50, 0x42, 0x52,
	0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x53, 0x70, 0x61, 0x63, 0x65, 0x4d, 0x61, 0x6e, 0x61,
	0x67, 0x65, 0x50, 0x00, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x33,
}

var (
	file_proto_types_response_space_manage_proto_rawDescOnce sync.Once
	file_proto_types_response_space_manage_proto_rawDescData = file_proto_types_response_space_manage_proto_rawDesc
)

func file_proto_types_response_space_manage_proto_rawDescGZIP() []byte {
	file_proto_types_response_space_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_response_space_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_space_manage_proto_rawDescData)
	})
	return file_proto_types_response_space_manage_proto_rawDescData
}

var file_proto_types_response_space_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_proto_types_response_space_manage_proto_goTypes = []interface{}{
	(*ListWorkspaces)(nil),    // 0: response.ListWorkspaces
	(*CreateWorkspace)(nil),   // 1: response.CreateWorkspace
	(*DescribeWorkspace)(nil), // 2: response.DescribeWorkspace
	(*CheckPermission)(nil),   // 3: response.CheckPermission
	(*pbmodel.Workspace)(nil), // 4: model.Workspace
}
var file_proto_types_response_space_manage_proto_depIdxs = []int32{
	4, // 0: response.ListWorkspaces.infos:type_name -> model.Workspace
	4, // 1: response.DescribeWorkspace.info:type_name -> model.Workspace
	4, // 2: response.CheckPermission.info:type_name -> model.Workspace
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_proto_types_response_space_manage_proto_init() }
func file_proto_types_response_space_manage_proto_init() {
	if File_proto_types_response_space_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_space_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListWorkspaces); i {
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
		file_proto_types_response_space_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CreateWorkspace); i {
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
		file_proto_types_response_space_manage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeWorkspace); i {
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
		file_proto_types_response_space_manage_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*CheckPermission); i {
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
			RawDescriptor: file_proto_types_response_space_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_space_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_response_space_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_response_space_manage_proto_msgTypes,
	}.Build()
	File_proto_types_response_space_manage_proto = out.File
	file_proto_types_response_space_manage_proto_rawDesc = nil
	file_proto_types_response_space_manage_proto_goTypes = nil
	file_proto_types_response_space_manage_proto_depIdxs = nil
}
