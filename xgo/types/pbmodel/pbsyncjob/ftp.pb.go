// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/syncjob/ftp.proto

package pbsyncjob

import (
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbdefaults"
	_ "github.com/yu31/protoc-plugin/xgo/pb/pbgosql"
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

type FtpSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// column
	Column []*Column `protobuf:"bytes,1,rep,name=column,proto3" json:"column"`
	// path
	Path string `protobuf:"bytes,2,opt,name=path,proto3" json:"path"`
	// private key path
	PrivateKeyPath string `protobuf:"bytes,3,opt,name=private_key_path,json=privateKeyPath,proto3" json:"private_key_path"`
	// connect pattern
	ConnectPattern string `protobuf:"bytes,4,opt,name=connect_pattern,json=connectPattern,proto3" json:"connect_pattern"`
	// field delimiter
	FieldDelimiter string `protobuf:"bytes,5,opt,name=field_delimiter,json=fieldDelimiter,proto3" json:"field_delimiter"`
	// encoding
	Encoding string `protobuf:"bytes,6,opt,name=encoding,proto3" json:"encoding"`
	// control encoding
	ControlEncoding string `protobuf:"bytes,7,opt,name=control_encoding,json=controlEncoding,proto3" json:"control_encoding"`
	// is first line header
	IsFirstLineHeader bool `protobuf:"varint,8,opt,name=is_first_line_header,json=isFirstLineHeader,proto3" json:"is_first_line_header"`
	// timeout
	Timeout string `protobuf:"bytes,9,opt,name=timeout,proto3" json:"timeout"`
	// file type
	FileType string `protobuf:"bytes,10,opt,name=file_type,json=fileType,proto3" json:"file_type"`
	// compress type
	CompressType string `protobuf:"bytes,11,opt,name=compress_type,json=compressType,proto3" json:"compress_type"`
	// file_config
	FileConfig string `protobuf:"bytes,12,opt,name=file_config,json=fileConfig,proto3" json:"file_config"`
}

func (x *FtpSource) Reset() {
	*x = FtpSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_ftp_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FtpSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FtpSource) ProtoMessage() {}

func (x *FtpSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_ftp_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FtpSource.ProtoReflect.Descriptor instead.
func (*FtpSource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_ftp_proto_rawDescGZIP(), []int{0}
}

func (x *FtpSource) GetColumn() []*Column {
	if x != nil {
		return x.Column
	}
	return nil
}

func (x *FtpSource) GetPath() string {
	if x != nil {
		return x.Path
	}
	return ""
}

func (x *FtpSource) GetPrivateKeyPath() string {
	if x != nil {
		return x.PrivateKeyPath
	}
	return ""
}

func (x *FtpSource) GetConnectPattern() string {
	if x != nil {
		return x.ConnectPattern
	}
	return ""
}

func (x *FtpSource) GetFieldDelimiter() string {
	if x != nil {
		return x.FieldDelimiter
	}
	return ""
}

func (x *FtpSource) GetEncoding() string {
	if x != nil {
		return x.Encoding
	}
	return ""
}

func (x *FtpSource) GetControlEncoding() string {
	if x != nil {
		return x.ControlEncoding
	}
	return ""
}

func (x *FtpSource) GetIsFirstLineHeader() bool {
	if x != nil {
		return x.IsFirstLineHeader
	}
	return false
}

func (x *FtpSource) GetTimeout() string {
	if x != nil {
		return x.Timeout
	}
	return ""
}

func (x *FtpSource) GetFileType() string {
	if x != nil {
		return x.FileType
	}
	return ""
}

func (x *FtpSource) GetCompressType() string {
	if x != nil {
		return x.CompressType
	}
	return ""
}

func (x *FtpSource) GetFileConfig() string {
	if x != nil {
		return x.FileConfig
	}
	return ""
}

type FtpTarget struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// path
	Column []*Column `protobuf:"bytes,1,rep,name=column,proto3" json:"column"`
	// path
	Path string `protobuf:"bytes,2,opt,name=path,proto3" json:"path"`
	// private key path
	PrivateKeyPath string `protobuf:"bytes,3,opt,name=private_key_path,json=privateKeyPath,proto3" json:"private_key_path"`
	// connect pattern
	ConnectPattern string `protobuf:"bytes,4,opt,name=connect_pattern,json=connectPattern,proto3" json:"connect_pattern"`
	// field delimiter
	FieldDelimiter string `protobuf:"bytes,5,opt,name=field_delimiter,json=fieldDelimiter,proto3" json:"field_delimiter"`
	// encoding
	Encoding string `protobuf:"bytes,6,opt,name=encoding,proto3" json:"encoding"`
	// control encoding
	ControlEncoding string `protobuf:"bytes,7,opt,name=control_encoding,json=controlEncoding,proto3" json:"control_encoding"`
	// is first line header
	IsFirstLineHeader bool `protobuf:"varint,8,opt,name=is_first_line_header,json=isFirstLineHeader,proto3" json:"is_first_line_header"`
	// ftp_file_name
	FtpFileName string `protobuf:"bytes,9,opt,name=ftp_file_name,json=ftpFileName,proto3" json:"ftp_file_name"`
	// timeout
	Timeout int32 `protobuf:"varint,10,opt,name=timeout,proto3" json:"timeout"`
}

func (x *FtpTarget) Reset() {
	*x = FtpTarget{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_ftp_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FtpTarget) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FtpTarget) ProtoMessage() {}

func (x *FtpTarget) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_ftp_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FtpTarget.ProtoReflect.Descriptor instead.
func (*FtpTarget) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_ftp_proto_rawDescGZIP(), []int{1}
}

func (x *FtpTarget) GetColumn() []*Column {
	if x != nil {
		return x.Column
	}
	return nil
}

func (x *FtpTarget) GetPath() string {
	if x != nil {
		return x.Path
	}
	return ""
}

func (x *FtpTarget) GetPrivateKeyPath() string {
	if x != nil {
		return x.PrivateKeyPath
	}
	return ""
}

func (x *FtpTarget) GetConnectPattern() string {
	if x != nil {
		return x.ConnectPattern
	}
	return ""
}

func (x *FtpTarget) GetFieldDelimiter() string {
	if x != nil {
		return x.FieldDelimiter
	}
	return ""
}

func (x *FtpTarget) GetEncoding() string {
	if x != nil {
		return x.Encoding
	}
	return ""
}

func (x *FtpTarget) GetControlEncoding() string {
	if x != nil {
		return x.ControlEncoding
	}
	return ""
}

func (x *FtpTarget) GetIsFirstLineHeader() bool {
	if x != nil {
		return x.IsFirstLineHeader
	}
	return false
}

func (x *FtpTarget) GetFtpFileName() string {
	if x != nil {
		return x.FtpFileName
	}
	return ""
}

func (x *FtpTarget) GetTimeout() int32 {
	if x != nil {
		return x.Timeout
	}
	return 0
}

var File_proto_types_model_syncjob_ftp_proto protoreflect.FileDescriptor

var file_proto_types_model_syncjob_ftp_proto_rawDesc = []byte{
	0x0a, 0x23, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x2f, 0x66, 0x74, 0x70, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75,
	0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x32, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79,
	0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69,
	0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c, 0x74, 0x73,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x26, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f,
	0x62, 0x2f, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xb7,
	0x03, 0x0a, 0x09, 0x46, 0x74, 0x70, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x12, 0x25, 0x0a, 0x06,
	0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x52, 0x06, 0x63, 0x6f, 0x6c,
	0x75, 0x6d, 0x6e, 0x12, 0x12, 0x0a, 0x04, 0x70, 0x61, 0x74, 0x68, 0x18, 0x02, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x04, 0x70, 0x61, 0x74, 0x68, 0x12, 0x28, 0x0a, 0x10, 0x70, 0x72, 0x69, 0x76, 0x61,
	0x74, 0x65, 0x5f, 0x6b, 0x65, 0x79, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x0e, 0x70, 0x72, 0x69, 0x76, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x50, 0x61, 0x74,
	0x68, 0x12, 0x27, 0x0a, 0x0f, 0x63, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x5f, 0x70, 0x61, 0x74,
	0x74, 0x65, 0x72, 0x6e, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x63, 0x6f, 0x6e, 0x6e,
	0x65, 0x63, 0x74, 0x50, 0x61, 0x74, 0x74, 0x65, 0x72, 0x6e, 0x12, 0x27, 0x0a, 0x0f, 0x66, 0x69,
	0x65, 0x6c, 0x64, 0x5f, 0x64, 0x65, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x65, 0x72, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0e, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x44, 0x65, 0x6c, 0x69, 0x6d, 0x69,
	0x74, 0x65, 0x72, 0x12, 0x1a, 0x0a, 0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x18,
	0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x12,
	0x29, 0x0a, 0x10, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x5f, 0x65, 0x6e, 0x63, 0x6f, 0x64,
	0x69, 0x6e, 0x67, 0x18, 0x07, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0f, 0x63, 0x6f, 0x6e, 0x74, 0x72,
	0x6f, 0x6c, 0x45, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x2f, 0x0a, 0x14, 0x69, 0x73,
	0x5f, 0x66, 0x69, 0x72, 0x73, 0x74, 0x5f, 0x6c, 0x69, 0x6e, 0x65, 0x5f, 0x68, 0x65, 0x61, 0x64,
	0x65, 0x72, 0x18, 0x08, 0x20, 0x01, 0x28, 0x08, 0x52, 0x11, 0x69, 0x73, 0x46, 0x69, 0x72, 0x73,
	0x74, 0x4c, 0x69, 0x6e, 0x65, 0x48, 0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x18, 0x0a, 0x07, 0x74,
	0x69, 0x6d, 0x65, 0x6f, 0x75, 0x74, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x74, 0x69,
	0x6d, 0x65, 0x6f, 0x75, 0x74, 0x12, 0x1b, 0x0a, 0x09, 0x66, 0x69, 0x6c, 0x65, 0x5f, 0x74, 0x79,
	0x70, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x66, 0x69, 0x6c, 0x65, 0x54, 0x79,
	0x70, 0x65, 0x12, 0x23, 0x0a, 0x0d, 0x63, 0x6f, 0x6d, 0x70, 0x72, 0x65, 0x73, 0x73, 0x5f, 0x74,
	0x79, 0x70, 0x65, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0c, 0x63, 0x6f, 0x6d, 0x70, 0x72,
	0x65, 0x73, 0x73, 0x54, 0x79, 0x70, 0x65, 0x12, 0x1f, 0x0a, 0x0b, 0x66, 0x69, 0x6c, 0x65, 0x5f,
	0x63, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0a, 0x66, 0x69,
	0x6c, 0x65, 0x43, 0x6f, 0x6e, 0x66, 0x69, 0x67, 0x22, 0xf8, 0x02, 0x0a, 0x09, 0x46, 0x74, 0x70,
	0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x25, 0x0a, 0x06, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e,
	0x18, 0x01, 0x20, 0x03, 0x28, 0x0b, 0x32, 0x0d, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x43,
	0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x52, 0x06, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x12, 0x12, 0x0a,
	0x04, 0x70, 0x61, 0x74, 0x68, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x70, 0x61, 0x74,
	0x68, 0x12, 0x28, 0x0a, 0x10, 0x70, 0x72, 0x69, 0x76, 0x61, 0x74, 0x65, 0x5f, 0x6b, 0x65, 0x79,
	0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x70, 0x72, 0x69,
	0x76, 0x61, 0x74, 0x65, 0x4b, 0x65, 0x79, 0x50, 0x61, 0x74, 0x68, 0x12, 0x27, 0x0a, 0x0f, 0x63,
	0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x5f, 0x70, 0x61, 0x74, 0x74, 0x65, 0x72, 0x6e, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x63, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x50, 0x61, 0x74,
	0x74, 0x65, 0x72, 0x6e, 0x12, 0x27, 0x0a, 0x0f, 0x66, 0x69, 0x65, 0x6c, 0x64, 0x5f, 0x64, 0x65,
	0x6c, 0x69, 0x6d, 0x69, 0x74, 0x65, 0x72, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0e, 0x66,
	0x69, 0x65, 0x6c, 0x64, 0x44, 0x65, 0x6c, 0x69, 0x6d, 0x69, 0x74, 0x65, 0x72, 0x12, 0x1a, 0x0a,
	0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x29, 0x0a, 0x10, 0x63, 0x6f, 0x6e,
	0x74, 0x72, 0x6f, 0x6c, 0x5f, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x09, 0x52, 0x0f, 0x63, 0x6f, 0x6e, 0x74, 0x72, 0x6f, 0x6c, 0x45, 0x6e, 0x63, 0x6f,
	0x64, 0x69, 0x6e, 0x67, 0x12, 0x2f, 0x0a, 0x14, 0x69, 0x73, 0x5f, 0x66, 0x69, 0x72, 0x73, 0x74,
	0x5f, 0x6c, 0x69, 0x6e, 0x65, 0x5f, 0x68, 0x65, 0x61, 0x64, 0x65, 0x72, 0x18, 0x08, 0x20, 0x01,
	0x28, 0x08, 0x52, 0x11, 0x69, 0x73, 0x46, 0x69, 0x72, 0x73, 0x74, 0x4c, 0x69, 0x6e, 0x65, 0x48,
	0x65, 0x61, 0x64, 0x65, 0x72, 0x12, 0x22, 0x0a, 0x0d, 0x66, 0x74, 0x70, 0x5f, 0x66, 0x69, 0x6c,
	0x65, 0x5f, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x09, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x66, 0x74,
	0x70, 0x46, 0x69, 0x6c, 0x65, 0x4e, 0x61, 0x6d, 0x65, 0x12, 0x18, 0x0a, 0x07, 0x74, 0x69, 0x6d,
	0x65, 0x6f, 0x75, 0x74, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x05, 0x52, 0x07, 0x74, 0x69, 0x6d, 0x65,
	0x6f, 0x75, 0x74, 0x42, 0x74, 0x0a, 0x2c, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f,
	0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65,
	0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x62, 0x73, 0x79, 0x6e, 0x63,
	0x6a, 0x6f, 0x62, 0x42, 0x05, 0x50, 0x42, 0x46, 0x74, 0x70, 0x50, 0x00, 0x5a, 0x3b, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72,
	0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67,
	0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f,
	0x70, 0x62, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x33,
}

var (
	file_proto_types_model_syncjob_ftp_proto_rawDescOnce sync.Once
	file_proto_types_model_syncjob_ftp_proto_rawDescData = file_proto_types_model_syncjob_ftp_proto_rawDesc
)

func file_proto_types_model_syncjob_ftp_proto_rawDescGZIP() []byte {
	file_proto_types_model_syncjob_ftp_proto_rawDescOnce.Do(func() {
		file_proto_types_model_syncjob_ftp_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_syncjob_ftp_proto_rawDescData)
	})
	return file_proto_types_model_syncjob_ftp_proto_rawDescData
}

var file_proto_types_model_syncjob_ftp_proto_msgTypes = make([]protoimpl.MessageInfo, 2)
var file_proto_types_model_syncjob_ftp_proto_goTypes = []interface{}{
	(*FtpSource)(nil), // 0: model.FtpSource
	(*FtpTarget)(nil), // 1: model.FtpTarget
	(*Column)(nil),    // 2: model.Column
}
var file_proto_types_model_syncjob_ftp_proto_depIdxs = []int32{
	2, // 0: model.FtpSource.column:type_name -> model.Column
	2, // 1: model.FtpTarget.column:type_name -> model.Column
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_proto_types_model_syncjob_ftp_proto_init() }
func file_proto_types_model_syncjob_ftp_proto_init() {
	if File_proto_types_model_syncjob_ftp_proto != nil {
		return
	}
	file_proto_types_model_syncjob_column_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_syncjob_ftp_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FtpSource); i {
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
		file_proto_types_model_syncjob_ftp_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FtpTarget); i {
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
			RawDescriptor: file_proto_types_model_syncjob_ftp_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   2,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_syncjob_ftp_proto_goTypes,
		DependencyIndexes: file_proto_types_model_syncjob_ftp_proto_depIdxs,
		MessageInfos:      file_proto_types_model_syncjob_ftp_proto_msgTypes,
	}.Build()
	File_proto_types_model_syncjob_ftp_proto = out.File
	file_proto_types_model_syncjob_ftp_proto_rawDesc = nil
	file_proto_types_model_syncjob_ftp_proto_goTypes = nil
	file_proto_types_model_syncjob_ftp_proto_depIdxs = nil
}
