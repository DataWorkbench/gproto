// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/jobdeveloper.proto

package jobdevpb

import (
	proto "github.com/golang/protobuf/proto"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
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

var File_proto_jobdeveloper_proto protoreflect.FileDescriptor

var file_proto_jobdeveloper_proto_rawDesc = []byte{
	0x0a, 0x18, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x6a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x65, 0x6c,
	0x6f, 0x70, 0x65, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x08, 0x6a, 0x6f, 0x62, 0x64,
	0x65, 0x76, 0x70, 0x62, 0x42, 0x58, 0x0a, 0x1c, 0x63, 0x6f, 0x6d, 0x2e, 0x77, 0x6f, 0x72, 0x6b,
	0x62, 0x65, 0x6e, 0x63, 0x68, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x6a, 0x6f, 0x62, 0x64,
	0x65, 0x76, 0x70, 0x62, 0x42, 0x08, 0x4a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x70, 0x62, 0x50, 0x01,
	0x5a, 0x2c, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74,
	0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x6a, 0x6f, 0x62, 0x64, 0x65, 0x76, 0x70, 0x62, 0x62, 0x06,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var file_proto_jobdeveloper_proto_goTypes = []interface{}{}
var file_proto_jobdeveloper_proto_depIdxs = []int32{
	0, // [0:0] is the sub-list for method output_type
	0, // [0:0] is the sub-list for method input_type
	0, // [0:0] is the sub-list for extension type_name
	0, // [0:0] is the sub-list for extension extendee
	0, // [0:0] is the sub-list for field type_name
}

func init() { file_proto_jobdeveloper_proto_init() }
func file_proto_jobdeveloper_proto_init() {
	if File_proto_jobdeveloper_proto != nil {
		return
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_proto_jobdeveloper_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   0,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_jobdeveloper_proto_goTypes,
		DependencyIndexes: file_proto_jobdeveloper_proto_depIdxs,
	}.Build()
	File_proto_jobdeveloper_proto = out.File
	file_proto_jobdeveloper_proto_rawDesc = nil
	file_proto_jobdeveloper_proto_goTypes = nil
	file_proto_jobdeveloper_proto_depIdxs = nil
}
