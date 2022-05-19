// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/request/iaas_proxy.proto

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

type ListIaaSRouters struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The used_id fixed to request user id.
	UserId string `protobuf:"bytes,1,opt,name=user_id,json=userId,proto3" json:"user_id" form:"-" swaggerignore:"true"`
	// Limit the maximum number of entries returned this time.
	// Not required, Max 100, default 100.
	Limit int32 `protobuf:"varint,2,opt,name=limit,proto3" json:"limit" form:"limit"`
	// The offset position. Not required, default 0.
	Offset int32 `protobuf:"varint,3,opt,name=offset,proto3" json:"offset" form:"offset"`
}

func (x *ListIaaSRouters) Reset() {
	*x = ListIaaSRouters{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_iaas_proxy_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListIaaSRouters) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListIaaSRouters) ProtoMessage() {}

func (x *ListIaaSRouters) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_iaas_proxy_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListIaaSRouters.ProtoReflect.Descriptor instead.
func (*ListIaaSRouters) Descriptor() ([]byte, []int) {
	return file_proto_types_request_iaas_proxy_proto_rawDescGZIP(), []int{0}
}

func (x *ListIaaSRouters) GetUserId() string {
	if x != nil {
		return x.UserId
	}
	return ""
}

func (x *ListIaaSRouters) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *ListIaaSRouters) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

type ListIaaSRouterVXNets struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The used_id fixed to request user id.
	RouterId string `protobuf:"bytes,1,opt,name=router_id,json=routerId,proto3" json:"router_id" form:"-" swaggerignore:"true"`
	// Limit the maximum number of entries returned this time.
	// Not required, Max 100, default 100.
	Limit int32 `protobuf:"varint,2,opt,name=limit,proto3" json:"limit" form:"limit"`
	// The offset position. Not required, default 0.
	Offset int32 `protobuf:"varint,3,opt,name=offset,proto3" json:"offset" form:"offset"`
}

func (x *ListIaaSRouterVXNets) Reset() {
	*x = ListIaaSRouterVXNets{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_request_iaas_proxy_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListIaaSRouterVXNets) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListIaaSRouterVXNets) ProtoMessage() {}

func (x *ListIaaSRouterVXNets) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_request_iaas_proxy_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListIaaSRouterVXNets.ProtoReflect.Descriptor instead.
func (*ListIaaSRouterVXNets) Descriptor() ([]byte, []int) {
	return file_proto_types_request_iaas_proxy_proto_rawDescGZIP(), []int{1}
}

func (x *ListIaaSRouterVXNets) GetRouterId() string {
	if x != nil {
		return x.RouterId
	}
	return ""
}

func (x *ListIaaSRouterVXNets) GetLimit() int32 {
	if x != nil {
		return x.Limit
	}
	return 0
}

func (x *ListIaaSRouterVXNets) GetOffset() int32 {
	if x != nil {
		return x.Offset
	}
	return 0
}

var File_proto_types_request_iaas_proxy_proto protoreflect.FileDescriptor

var file_proto_types_request_iaas_proxy_proto_rawDesc = []byte{
	0x0a, 0x24, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x71, 0x75, 0x65, 0x73, 0x74, 0x2f, 0x69, 0x61, 0x61, 0x73, 0x5f, 0x70, 0x72, 0x6f, 0x78, 0x79,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x07, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a,
	0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75,
	0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c,
	0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8f, 0x01, 0x0a, 0x0f, 0x4c, 0x69, 0x73,
	0x74, 0x49, 0x61, 0x61, 0x53, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x72, 0x73, 0x12, 0x28, 0x0a, 0x07,
	0x75, 0x73, 0x65, 0x72, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2,
	0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x80, 0x02, 0x01, 0x88, 0x02, 0x41, 0x52, 0x06,
	0x75, 0x73, 0x65, 0x72, 0x49, 0x64, 0x12, 0x2d, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18,
	0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x17, 0xa2, 0xa1, 0x1f, 0x06, 0xaa, 0x06, 0x03, 0x31, 0x30,
	0x30, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xb2, 0x01, 0x04, 0x30, 0x00, 0x38, 0x64, 0x52, 0x05,
	0x6c, 0x69, 0x6d, 0x69, 0x74, 0x12, 0x23, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18,
	0x03, 0x20, 0x01, 0x28, 0x05, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02,
	0x40, 0x00, 0x52, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x22, 0x99, 0x01, 0x0a, 0x14, 0x4c,
	0x69, 0x73, 0x74, 0x49, 0x61, 0x61, 0x53, 0x52, 0x6f, 0x75, 0x74, 0x65, 0x72, 0x56, 0x58, 0x4e,
	0x65, 0x74, 0x73, 0x12, 0x2d, 0x0a, 0x09, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x72, 0x5f, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x10, 0xe2, 0xdf, 0x1f, 0x0c, 0x12, 0x0a, 0xc2, 0x01,
	0x07, 0xca, 0x02, 0x04, 0x72, 0x74, 0x72, 0x2d, 0x52, 0x08, 0x72, 0x6f, 0x75, 0x74, 0x65, 0x72,
	0x49, 0x64, 0x12, 0x2d, 0x0a, 0x05, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x05, 0x42, 0x17, 0xa2, 0xa1, 0x1f, 0x06, 0xaa, 0x06, 0x03, 0x31, 0x30, 0x30, 0xe2, 0xdf, 0x1f,
	0x09, 0x12, 0x07, 0xb2, 0x01, 0x04, 0x30, 0x00, 0x38, 0x64, 0x52, 0x05, 0x6c, 0x69, 0x6d, 0x69,
	0x74, 0x12, 0x23, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x05, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x40, 0x00, 0x52, 0x06,
	0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x42, 0x71, 0x0a, 0x24, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61,
	0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74,
	0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x42, 0x12,
	0x50, 0x42, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x49, 0x61, 0x61, 0x53, 0x50, 0x72, 0x6f,
	0x78, 0x79, 0x50, 0x00, 0x5a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x70, 0x62, 0x72, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_proto_types_request_iaas_proxy_proto_rawDescOnce sync.Once
	file_proto_types_request_iaas_proxy_proto_rawDescData = file_proto_types_request_iaas_proxy_proto_rawDesc
)

func file_proto_types_request_iaas_proxy_proto_rawDescGZIP() []byte {
	file_proto_types_request_iaas_proxy_proto_rawDescOnce.Do(func() {
		file_proto_types_request_iaas_proxy_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_request_iaas_proxy_proto_rawDescData)
	})
	return file_proto_types_request_iaas_proxy_proto_rawDescData
}

var file_proto_types_request_iaas_proxy_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_proto_types_request_iaas_proxy_proto_goTypes = []interface{}{
	(*ListIaaSRouters)(nil),      // 0: request.ListIaaSRouters
	(*ListIaaSRouterVXNets)(nil), // 1: request.ListIaaSRouterVXNets
}
var file_proto_types_request_iaas_proxy_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_types_request_iaas_proxy_proto_init() }
func file_proto_types_request_iaas_proxy_proto_init() {
	if File_proto_types_request_iaas_proxy_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_request_iaas_proxy_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListIaaSRouters); i {
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
		file_proto_types_request_iaas_proxy_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListIaaSRouterVXNets); i {
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
			RawDescriptor: file_proto_types_request_iaas_proxy_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_request_iaas_proxy_proto_goTypes,
		DependencyIndexes: file_proto_types_request_iaas_proxy_proto_depIdxs,
		MessageInfos:      file_proto_types_request_iaas_proxy_proto_msgTypes,
	}.Build()
	File_proto_types_request_iaas_proxy_proto = out.File
	file_proto_types_request_iaas_proxy_proto_rawDesc = nil
	file_proto_types_request_iaas_proxy_proto_goTypes = nil
	file_proto_types_request_iaas_proxy_proto_depIdxs = nil
}