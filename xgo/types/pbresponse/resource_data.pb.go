// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/response/resource_data.proto

package pbresponse

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

type WriteFileData struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// ETag is MD5 value of file data encoded in hexadecimal.
	Etag string `protobuf:"bytes,1,opt,name=etag,proto3" json:"etag"`
}

func (x *WriteFileData) Reset() {
	*x = WriteFileData{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_resource_data_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *WriteFileData) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*WriteFileData) ProtoMessage() {}

func (x *WriteFileData) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_resource_data_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use WriteFileData.ProtoReflect.Descriptor instead.
func (*WriteFileData) Descriptor() ([]byte, []int) {
	return file_proto_types_response_resource_data_proto_rawDescGZIP(), []int{0}
}

func (x *WriteFileData) GetEtag() string {
	if x != nil {
		return x.Etag
	}
	return ""
}

type ReadFileData struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The File data.
	Data []byte `protobuf:"bytes,1,opt,name=data,proto3" json:"-"`
	Size int64  `protobuf:"varint,2,opt,name=size,proto3" json:"size"`
	Name string `protobuf:"bytes,3,opt,name=name,proto3" json:"name"`
}

func (x *ReadFileData) Reset() {
	*x = ReadFileData{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_response_resource_data_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ReadFileData) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ReadFileData) ProtoMessage() {}

func (x *ReadFileData) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_response_resource_data_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ReadFileData.ProtoReflect.Descriptor instead.
func (*ReadFileData) Descriptor() ([]byte, []int) {
	return file_proto_types_response_resource_data_proto_rawDescGZIP(), []int{1}
}

func (x *ReadFileData) GetData() []byte {
	if x != nil {
		return x.Data
	}
	return nil
}

func (x *ReadFileData) GetSize() int64 {
	if x != nil {
		return x.Size
	}
	return 0
}

func (x *ReadFileData) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

var File_proto_types_response_resource_data_proto protoreflect.FileDescriptor

var file_proto_types_response_resource_data_proto_rawDesc = []byte{
	0x0a, 0x28, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x72, 0x65,
	0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x2f, 0x72, 0x65, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f,
	0x64, 0x61, 0x74, 0x61, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x72, 0x65, 0x73, 0x70,
	0x6f, 0x6e, 0x73, 0x65, 0x1a, 0x33, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75,
	0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61,
	0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x31, 0x0a, 0x0d, 0x57, 0x72, 0x69,
	0x74, 0x65, 0x46, 0x69, 0x6c, 0x65, 0x44, 0x61, 0x74, 0x61, 0x12, 0x20, 0x0a, 0x04, 0x65, 0x74,
	0x61, 0x67, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06,
	0xc2, 0x01, 0x03, 0xf0, 0x01, 0x20, 0x52, 0x04, 0x65, 0x74, 0x61, 0x67, 0x22, 0x4a, 0x0a, 0x0c,
	0x52, 0x65, 0x61, 0x64, 0x46, 0x69, 0x6c, 0x65, 0x44, 0x61, 0x74, 0x61, 0x12, 0x12, 0x0a, 0x04,
	0x64, 0x61, 0x74, 0x61, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0c, 0x52, 0x04, 0x64, 0x61, 0x74, 0x61,
	0x12, 0x12, 0x0a, 0x04, 0x73, 0x69, 0x7a, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x03, 0x52, 0x04,
	0x73, 0x69, 0x7a, 0x65, 0x12, 0x12, 0x0a, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x09, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x42, 0x77, 0x0a, 0x25, 0x63, 0x6f, 0x6d, 0x2e,
	0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x42, 0x16, 0x50, 0x42, 0x52, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73, 0x65, 0x52, 0x65, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x44, 0x61, 0x74, 0x61, 0x50, 0x00, 0x5a, 0x34, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b,
	0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f,
	0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x72, 0x65, 0x73, 0x70, 0x6f, 0x6e, 0x73,
	0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_response_resource_data_proto_rawDescOnce sync.Once
	file_proto_types_response_resource_data_proto_rawDescData = file_proto_types_response_resource_data_proto_rawDesc
)

func file_proto_types_response_resource_data_proto_rawDescGZIP() []byte {
	file_proto_types_response_resource_data_proto_rawDescOnce.Do(func() {
		file_proto_types_response_resource_data_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_response_resource_data_proto_rawDescData)
	})
	return file_proto_types_response_resource_data_proto_rawDescData
}

var file_proto_types_response_resource_data_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_proto_types_response_resource_data_proto_goTypes = []interface{}{
	(*WriteFileData)(nil), // 0: response.WriteFileData
	(*ReadFileData)(nil),  // 1: response.ReadFileData
}
var file_proto_types_response_resource_data_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_types_response_resource_data_proto_init() }
func file_proto_types_response_resource_data_proto_init() {
	if File_proto_types_response_resource_data_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_response_resource_data_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*WriteFileData); i {
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
		file_proto_types_response_resource_data_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ReadFileData); i {
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
			RawDescriptor: file_proto_types_response_resource_data_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_response_resource_data_proto_goTypes,
		DependencyIndexes: file_proto_types_response_resource_data_proto_depIdxs,
		MessageInfos:      file_proto_types_response_resource_data_proto_msgTypes,
	}.Build()
	File_proto_types_response_resource_data_proto = out.File
	file_proto_types_response_resource_data_proto_rawDesc = nil
	file_proto_types_response_resource_data_proto_goTypes = nil
	file_proto_types_response_resource_data_proto_depIdxs = nil
}
