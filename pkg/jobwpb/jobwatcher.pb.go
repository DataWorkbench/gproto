// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/jobwatcher.proto

package jobwpb

import (
	model "github.com/DataWorkbench/gproto/pkg/model"
	proto "github.com/golang/protobuf/proto"
	_ "github.com/mwitkow/go-proto-validators"
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

type WatchJobRequest struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	JobInfo string `protobuf:"bytes,1,opt,name=JobInfo,proto3" json:"JobInfo,omitempty"`
}

func (x *WatchJobRequest) Reset() {
	*x = WatchJobRequest{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_jobwatcher_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WatchJobRequest) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WatchJobRequest) ProtoMessage() {}

func (x *WatchJobRequest) ProtoReflect() protoreflect.Message {
	mi := &file_proto_jobwatcher_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WatchJobRequest.ProtoReflect.Descriptor instead.
func (*WatchJobRequest) Descriptor() ([]byte, []int) {
	return file_proto_jobwatcher_proto_rawDescGZIP(), []int{0}
}

func (x *WatchJobRequest) GetJobInfo() string {
	if x != nil {
		return x.JobInfo
	}
	return ""
}

var File_proto_jobwatcher_proto protoreflect.FileDescriptor

var file_proto_jobwatcher_proto_rawDesc = []byte{
	0x0a, 0x16, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x6a, 0x6f, 0x62, 0x77, 0x61, 0x74, 0x63, 0x68,
	0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x06, 0x6a, 0x6f, 0x62, 0x77, 0x70, 0x62,
	0x1a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x77, 0x69,
	0x74, 0x6b, 0x6f, 0x77, 0x2f, 0x67, 0x6f, 0x2d, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x76, 0x61,
	0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x73, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74,
	0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x0b, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x33, 0x0a, 0x0f, 0x57, 0x61, 0x74, 0x63, 0x68, 0x4a, 0x6f,
	0x62, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x12, 0x20, 0x0a, 0x07, 0x4a, 0x6f, 0x62, 0x49,
	0x6e, 0x66, 0x6f, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x06, 0xe2, 0xdf, 0x1f, 0x02, 0x70,
	0x14, 0x52, 0x07, 0x4a, 0x6f, 0x62, 0x49, 0x6e, 0x66, 0x6f, 0x32, 0x47, 0x0a, 0x0a, 0x4a, 0x6f,
	0x62, 0x77, 0x61, 0x74, 0x63, 0x68, 0x65, 0x72, 0x12, 0x39, 0x0a, 0x08, 0x57, 0x61, 0x74, 0x63,
	0x68, 0x4a, 0x6f, 0x62, 0x12, 0x17, 0x2e, 0x6a, 0x6f, 0x62, 0x77, 0x70, 0x62, 0x2e, 0x57, 0x61,
	0x74, 0x63, 0x68, 0x4a, 0x6f, 0x62, 0x52, 0x65, 0x71, 0x75, 0x65, 0x73, 0x74, 0x1a, 0x12, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x45, 0x6d, 0x70, 0x74, 0x79, 0x53, 0x74, 0x72, 0x75, 0x63,
	0x74, 0x22, 0x00, 0x42, 0x2c, 0x5a, 0x2a, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f,
	0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f,
	0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6a, 0x6f, 0x62, 0x77, 0x70,
	0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_jobwatcher_proto_rawDescOnce sync.Once
	file_proto_jobwatcher_proto_rawDescData = file_proto_jobwatcher_proto_rawDesc
)

func file_proto_jobwatcher_proto_rawDescGZIP() []byte {
	file_proto_jobwatcher_proto_rawDescOnce.Do(func() {
		file_proto_jobwatcher_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_jobwatcher_proto_rawDescData)
	})
	return file_proto_jobwatcher_proto_rawDescData
}

var file_proto_jobwatcher_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_jobwatcher_proto_goTypes = []interface{}{
	(*WatchJobRequest)(nil),   // 0: jobwpb.WatchJobRequest
	(*model.EmptyStruct)(nil), // 1: model.EmptyStruct
}
var file_proto_jobwatcher_proto_depIdxs = []int32{
	0, // 0: jobwpb.Jobwatcher.WatchJob:input_type -> jobwpb.WatchJobRequest
	1, // 1: jobwpb.Jobwatcher.WatchJob:output_type -> model.EmptyStruct
	1, // [1:2] is the sub-list for method output_type
	0, // [0:1] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_jobwatcher_proto_init() }
func file_proto_jobwatcher_proto_init() {
	if File_proto_jobwatcher_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_jobwatcher_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WatchJobRequest); i {
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
			RawDescriptor: file_proto_jobwatcher_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   1,
		},
		GoTypes:           file_proto_jobwatcher_proto_goTypes,
		DependencyIndexes: file_proto_jobwatcher_proto_depIdxs,
		MessageInfos:      file_proto_jobwatcher_proto_msgTypes,
	}.Build()
	File_proto_jobwatcher_proto = out.File
	file_proto_jobwatcher_proto_rawDesc = nil
	file_proto_jobwatcher_proto_goTypes = nil
	file_proto_jobwatcher_proto_depIdxs = nil
}
