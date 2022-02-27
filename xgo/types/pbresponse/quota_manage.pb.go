// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/quota_manage.proto

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

type DescribeUserQuota struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *pbmodel.UserQuota `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
}

func (x *DescribeUserQuota) Reset() {
	*x = DescribeUserQuota{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_quota_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeUserQuota) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeUserQuota) ProtoMessage() {}

func (x *DescribeUserQuota) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_quota_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeUserQuota.ProtoReflect.Descriptor instead.
func (*DescribeUserQuota) Descriptor() ([]byte, []int) {
	return file_proto_types_response_quota_manage_proto_rawDescGZIP(), []int{0}
}

func (x *DescribeUserQuota) GetInfo() *pbmodel.UserQuota {
	if x != nil {
		return x.Info
	}
	return nil
}

type DescribeWorkspaceQuota struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *pbmodel.WorkspaceQuota `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
}

func (x *DescribeWorkspaceQuota) Reset() {
	*x = DescribeWorkspaceQuota{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_quota_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeWorkspaceQuota) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeWorkspaceQuota) ProtoMessage() {}

func (x *DescribeWorkspaceQuota) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_quota_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeWorkspaceQuota.ProtoReflect.Descriptor instead.
func (*DescribeWorkspaceQuota) Descriptor() ([]byte, []int) {
	return file_proto_types_response_quota_manage_proto_rawDescGZIP(), []int{1}
}

func (x *DescribeWorkspaceQuota) GetInfo() *pbmodel.WorkspaceQuota {
	if x != nil {
		return x.Info
	}
	return nil
}

type DescribeMemberQuota struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *pbmodel.MemberQuota `protobuf:"bytes,1,opt,name=info,proto3" json:"info,omitempty"`
}

func (x *DescribeMemberQuota) Reset() {
	*x = DescribeMemberQuota{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_quota_manage_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeMemberQuota) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeMemberQuota) ProtoMessage() {}

func (x *DescribeMemberQuota) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_quota_manage_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeMemberQuota.ProtoReflect.Descriptor instead.
func (*DescribeMemberQuota) Descriptor() ([]byte, []int) {
	return file_proto_types_response_quota_manage_proto_rawDescGZIP(), []int{2}
}

func (x *DescribeMemberQuota) GetInfo() *pbmodel.MemberQuota {
	if x != nil {
		return x.Info
	}
	return nil
}

var File_proto_types_response_quota_manage_proto protoreflect.FileDescriptor

var file_proto_types_response_quota_manage_proto_rawDesc = []byte{
	0x0a, 0x27, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x5f, 0x6d, 0x61, 0x6e,
	0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65, 0x73, 0x70, 0x6f,
	0x6e, 0x73, 0x65, 0x1a, 0x1d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73,
	0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x71, 0x75, 0x6f, 0x74, 0x61, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x22, 0x39, 0x0a, 0x11, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x55, 0x73,
	0x65, 0x72, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x12, 0x24, 0x0a, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x10, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x55, 0x73,
	0x65, 0x72, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x22, 0x43, 0x0a,
	0x16, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x57, 0x6f, 0x72, 0x6b, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x12, 0x29, 0x0a, 0x04, 0x69, 0x6e, 0x66, 0x6f, 0x18,
	0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x57, 0x6f,
	0x72, 0x6b, 0x73, 0x70, 0x61, 0x63, 0x65, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x04, 0x69, 0x6e,
	0x66, 0x6f, 0x22, 0x3d, 0x0a, 0x13, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62, 0x65, 0x4d, 0x65,
	0x6d, 0x62, 0x65, 0x72, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x12, 0x26, 0x0a, 0x04, 0x69, 0x6e, 0x66,
	0x6f, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x4d, 0x65, 0x6d, 0x62, 0x65, 0x72, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x52, 0x04, 0x69, 0x6e, 0x66,
	0x6f, 0x42, 0x76, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e,
	0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e,
	0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x15, 0x50, 0x42, 0x52, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x51, 0x75, 0x6f, 0x74, 0x61, 0x4d, 0x61, 0x6e, 0x61, 0x67,
	0x65, 0x50, 0x00, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70,
	0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_proto_types_response_quota_manage_proto_rawDescOnce sync.Once
	file_proto_types_response_quota_manage_proto_rawDescData = file_proto_types_response_quota_manage_proto_rawDesc
)

func file_proto_types_response_quota_manage_proto_rawDescGZIP() []byte {
	file_proto_types_response_quota_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_response_quota_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_quota_manage_proto_rawDescData)
	})
	return file_proto_types_response_quota_manage_proto_rawDescData
}

var file_proto_types_response_quota_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_proto_types_response_quota_manage_proto_goTypes = []interface{}{
	(*DescribeUserQuota)(nil),      // 0: response.DescribeUserQuota
	(*DescribeWorkspaceQuota)(nil), // 1: response.DescribeWorkspaceQuota
	(*DescribeMemberQuota)(nil),    // 2: response.DescribeMemberQuota
	(*pbmodel.UserQuota)(nil),      // 3: model.UserQuota
	(*pbmodel.WorkspaceQuota)(nil), // 4: model.WorkspaceQuota
	(*pbmodel.MemberQuota)(nil),    // 5: model.MemberQuota
}
var file_proto_types_response_quota_manage_proto_depIdxs = []int32{
	3, // 0: response.DescribeUserQuota.info:type_name -> model.UserQuota
	4, // 1: response.DescribeWorkspaceQuota.info:type_name -> model.WorkspaceQuota
	5, // 2: response.DescribeMemberQuota.info:type_name -> model.MemberQuota
	3, // [3:3] is the sub-list for method output_type
	3, // [3:3] is the sub-list for method input_type
	3, // [3:3] is the sub-list for extension type_name
	3, // [3:3] is the sub-list for extension extendee
	0, // [0:3] is the sub-list for field type_name
}

func init() { file_proto_types_response_quota_manage_proto_init() }
func file_proto_types_response_quota_manage_proto_init() {
	if File_proto_types_response_quota_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_quota_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeUserQuota); i {
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
		file_proto_types_response_quota_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeWorkspaceQuota); i {
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
		file_proto_types_response_quota_manage_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeMemberQuota); i {
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
			RawDescriptor: file_proto_types_response_quota_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_quota_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_response_quota_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_response_quota_manage_proto_msgTypes,
	}.Build()
	File_proto_types_response_quota_manage_proto = out.File
	file_proto_types_response_quota_manage_proto_rawDesc = nil
	file_proto_types_response_quota_manage_proto_goTypes = nil
	file_proto_types_response_quota_manage_proto_depIdxs = nil
}
