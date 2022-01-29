// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/monitor_manage.proto

package pbresponse

import (
	pbmodel "github.com/DataWorkbench/gproto/pkg/types/pbmodel"
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

// ListMonitorRules used as reply parameters in RPC or response body in HTTP.
type ListMonitorRules struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Infos   []*pbmodel.MonitorRule `protobuf:"bytes,1,rep,name=infos,proto3" json:"infos"`
	HasMore bool                   `protobuf:"varint,2,opt,name=has_more,json=hasMore,proto3" json:"has_more"`
	Total   int64                  `protobuf:"varint,3,opt,name=total,proto3" json:"total"`
}

func (x *ListMonitorRules) Reset() {
	*x = ListMonitorRules{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_monitor_manage_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ListMonitorRules) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ListMonitorRules) ProtoMessage() {}

func (x *ListMonitorRules) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_monitor_manage_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ListMonitorRules.ProtoReflect.Descriptor instead.
func (*ListMonitorRules) Descriptor() ([]byte, []int) {
	return file_proto_types_response_monitor_manage_proto_rawDescGZIP(), []int{0}
}

func (x *ListMonitorRules) GetInfos() []*pbmodel.MonitorRule {
	if x != nil {
		return x.Infos
	}
	return nil
}

func (x *ListMonitorRules) GetHasMore() bool {
	if x != nil {
		return x.HasMore
	}
	return false
}

func (x *ListMonitorRules) GetTotal() int64 {
	if x != nil {
		return x.Total
	}
	return 0
}

// DescribeMonitorRule used as reply parameters in RPC.
type DescribeMonitorRule struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Info *pbmodel.MonitorRule `protobuf:"bytes,1,opt,name=info,proto3" json:"info"`
}

func (x *DescribeMonitorRule) Reset() {
	*x = DescribeMonitorRule{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_monitor_manage_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DescribeMonitorRule) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DescribeMonitorRule) ProtoMessage() {}

func (x *DescribeMonitorRule) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_monitor_manage_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DescribeMonitorRule.ProtoReflect.Descriptor instead.
func (*DescribeMonitorRule) Descriptor() ([]byte, []int) {
	return file_proto_types_response_monitor_manage_proto_rawDescGZIP(), []int{1}
}

func (x *DescribeMonitorRule) GetInfo() *pbmodel.MonitorRule {
	if x != nil {
		return x.Info
	}
	return nil
}

var File_proto_types_response_monitor_manage_proto protoreflect.FileDescriptor

var file_proto_types_response_monitor_manage_proto_rawDesc = []byte{
	0x0a, 0x29, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x6d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x5f, 0x6d,
	0x61, 0x6e, 0x61, 0x67, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65, 0x73,
	0x70, 0x6f, 0x6e, 0x73, 0x65, 0x1a, 0x1f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70,
	0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x6d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x6d, 0x0a, 0x10, 0x4c, 0x69, 0x73, 0x74, 0x4d, 0x6f,
	0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x73, 0x12, 0x28, 0x0a, 0x05, 0x69, 0x6e,
	0x66, 0x6f, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x52, 0x05, 0x69,
	0x6e, 0x66, 0x6f, 0x73, 0x12, 0x19, 0x0a, 0x08, 0x68, 0x61, 0x73, 0x5f, 0x6d, 0x6f, 0x72, 0x65,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x08, 0x52, 0x07, 0x68, 0x61, 0x73, 0x4d, 0x6f, 0x72, 0x65, 0x12,
	0x14, 0x0a, 0x05, 0x74, 0x6f, 0x74, 0x61, 0x6c, 0x18, 0x03, 0x20, 0x01, 0x28, 0x03, 0x52, 0x05,
	0x74, 0x6f, 0x74, 0x61, 0x6c, 0x22, 0x3d, 0x0a, 0x13, 0x44, 0x65, 0x73, 0x63, 0x72, 0x69, 0x62,
	0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x12, 0x26, 0x0a, 0x04,
	0x69, 0x6e, 0x66, 0x6f, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x6d, 0x6f, 0x64,
	0x65, 0x6c, 0x2e, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72, 0x52, 0x75, 0x6c, 0x65, 0x52, 0x04,
	0x69, 0x6e, 0x66, 0x6f, 0x42, 0x78, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61,
	0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70,
	0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x42, 0x17, 0x50,
	0x42, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x4d, 0x6f, 0x6e, 0x69, 0x74, 0x6f, 0x72,
	0x4d, 0x61, 0x6e, 0x61, 0x67, 0x65, 0x50, 0x00, 0x5a, 0x34, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e,
	0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_response_monitor_manage_proto_rawDescOnce sync.Once
	file_proto_types_response_monitor_manage_proto_rawDescData = file_proto_types_response_monitor_manage_proto_rawDesc
)

func file_proto_types_response_monitor_manage_proto_rawDescGZIP() []byte {
	file_proto_types_response_monitor_manage_proto_rawDescOnce.Do(func() {
		file_proto_types_response_monitor_manage_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_monitor_manage_proto_rawDescData)
	})
	return file_proto_types_response_monitor_manage_proto_rawDescData
}

var file_proto_types_response_monitor_manage_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_proto_types_response_monitor_manage_proto_goTypes = []interface{}{
	(*ListMonitorRules)(nil),    // 0: response.ListMonitorRules
	(*DescribeMonitorRule)(nil), // 1: response.DescribeMonitorRule
	(*pbmodel.MonitorRule)(nil), // 2: model.MonitorRule
}
var file_proto_types_response_monitor_manage_proto_depIdxs = []int32{
	2, // 0: response.ListMonitorRules.infos:type_name -> model.MonitorRule
	2, // 1: response.DescribeMonitorRule.info:type_name -> model.MonitorRule
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_proto_types_response_monitor_manage_proto_init() }
func file_proto_types_response_monitor_manage_proto_init() {
	if File_proto_types_response_monitor_manage_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_monitor_manage_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ListMonitorRules); i {
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
		file_proto_types_response_monitor_manage_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DescribeMonitorRule); i {
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
			RawDescriptor: file_proto_types_response_monitor_manage_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_monitor_manage_proto_goTypes,
		DependencyIndexes: file_proto_types_response_monitor_manage_proto_depIdxs,
		MessageInfos:      file_proto_types_response_monitor_manage_proto_msgTypes,
	}.Build()
	File_proto_types_response_monitor_manage_proto = out.File
	file_proto_types_response_monitor_manage_proto_rawDesc = nil
	file_proto_types_response_monitor_manage_proto_goTypes = nil
	file_proto_types_response_monitor_manage_proto_depIdxs = nil
}
