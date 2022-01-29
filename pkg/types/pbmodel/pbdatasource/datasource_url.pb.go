// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/datasource/datasource_url.proto

package pbdatasource

import (
	_ "github.com/yu31/proto-go-plugin/pkg/pb/gosqlpb"
	_ "github.com/yu31/proto-go-plugin/pkg/pb/validatorpb"
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

type MySQLURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Host specifies the hostname of db. Is Required. Length Min: 1, Length Max: 64.
	Host string `protobuf:"bytes,1,opt,name=host,proto3" json:"host"`
	// Port specifies the port of db. Is Required. Min: 0, Length Max: 65536.
	Port int32 `protobuf:"varint,2,opt,name=port,proto3" json:"port"`
	// User specifies the username of db. Is Required. Length Min: 1, Length Max: 64.
	User string `protobuf:"bytes,3,opt,name=user,proto3" json:"user"`
	// Password specifies the password of db. Is Required. Length Min: 1, Length Max: 64.
	Password string `protobuf:"bytes,4,opt,name=password,proto3" json:"password"`
	// Database specifies the database name of db. Is Required. Length Min: 1, Length Max: 64.
	Database string `protobuf:"bytes,5,opt,name=database,proto3" json:"database"`
}

func (x *MySQLURL) Reset() {
	*x = MySQLURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MySQLURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MySQLURL) ProtoMessage() {}

func (x *MySQLURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MySQLURL.ProtoReflect.Descriptor instead.
func (*MySQLURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{0}
}

func (x *MySQLURL) GetHost() string {
	if x != nil {
		return x.Host
	}
	return ""
}

func (x *MySQLURL) GetPort() int32 {
	if x != nil {
		return x.Port
	}
	return 0
}

func (x *MySQLURL) GetUser() string {
	if x != nil {
		return x.User
	}
	return ""
}

func (x *MySQLURL) GetPassword() string {
	if x != nil {
		return x.Password
	}
	return ""
}

func (x *MySQLURL) GetDatabase() string {
	if x != nil {
		return x.Database
	}
	return ""
}

// PostgreSQLURL used as request parameters for RPC and HTTP(based on Body)
type PostgreSQLURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Host specifies the hostname of db. Is Required. Length Min: 1, Length Max: 64.
	Host string `protobuf:"bytes,1,opt,name=host,proto3" json:"host"`
	// Port specifies the port of db. Is Required. Min: 0, Length Max: 65536.
	Port int32 `protobuf:"varint,2,opt,name=port,proto3" json:"port"`
	// User specifies the username of db. Is Required. Length Min: 1, Length Max: 64.
	User string `protobuf:"bytes,3,opt,name=user,proto3" json:"user"`
	// Password specifies the password of db. Is Required. Length Min: 1, Length Max: 64.
	Password string `protobuf:"bytes,4,opt,name=password,proto3" json:"password"`
	// Database specifies the database name of db. Is Required. Length Min: 1, Length Max: 64.
	Database string `protobuf:"bytes,5,opt,name=database,proto3" json:"database"`
}

func (x *PostgreSQLURL) Reset() {
	*x = PostgreSQLURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PostgreSQLURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PostgreSQLURL) ProtoMessage() {}

func (x *PostgreSQLURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use PostgreSQLURL.ProtoReflect.Descriptor instead.
func (*PostgreSQLURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{1}
}

func (x *PostgreSQLURL) GetHost() string {
	if x != nil {
		return x.Host
	}
	return ""
}

func (x *PostgreSQLURL) GetPort() int32 {
	if x != nil {
		return x.Port
	}
	return 0
}

func (x *PostgreSQLURL) GetUser() string {
	if x != nil {
		return x.User
	}
	return ""
}

func (x *PostgreSQLURL) GetPassword() string {
	if x != nil {
		return x.Password
	}
	return ""
}

func (x *PostgreSQLURL) GetDatabase() string {
	if x != nil {
		return x.Database
	}
	return ""
}

// ClickHouseURL used as request parameters for RPC and HTTP(based on Body)
type ClickHouseURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Host specifies the hostname of db. Is Required. Length Min: 1, Length Max: 64.
	Host string `protobuf:"bytes,1,opt,name=host,proto3" json:"host"`
	// Port specifies the port of db. Is Required. Min: 0, Length Max: 65536.
	Port int32 `protobuf:"varint,2,opt,name=port,proto3" json:"port"`
	// User specifies the username of db. Is Required. Length Min: 1, Length Max: 64.
	User string `protobuf:"bytes,3,opt,name=user,proto3" json:"user"`
	// Password specifies the password of db. Is Required. Length Min: 1, Length Max: 64.
	Password string `protobuf:"bytes,4,opt,name=password,proto3" json:"password"`
	// Database specifies the database name of db. Is Required. Length Min: 1, Length Max: 64.
	Database string `protobuf:"bytes,5,opt,name=database,proto3" json:"database"`
}

func (x *ClickHouseURL) Reset() {
	*x = ClickHouseURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClickHouseURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClickHouseURL) ProtoMessage() {}

func (x *ClickHouseURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ClickHouseURL.ProtoReflect.Descriptor instead.
func (*ClickHouseURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{2}
}

func (x *ClickHouseURL) GetHost() string {
	if x != nil {
		return x.Host
	}
	return ""
}

func (x *ClickHouseURL) GetPort() int32 {
	if x != nil {
		return x.Port
	}
	return 0
}

func (x *ClickHouseURL) GetUser() string {
	if x != nil {
		return x.User
	}
	return ""
}

func (x *ClickHouseURL) GetPassword() string {
	if x != nil {
		return x.Password
	}
	return ""
}

func (x *ClickHouseURL) GetDatabase() string {
	if x != nil {
		return x.Database
	}
	return ""
}

// KafkaURL used as request parameters for RPC and HTTP(based on Body)
type KafkaURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The kafka brokers. Multiple nodes are separated by commas. eg: "192.168.1.1:9292,192.168.1.2:9292, 192.168.1.3:9292"
	// Is required. Length min: 1, Length MAX: 1024.
	KafkaBrokers string `protobuf:"bytes,1,opt,name=kafka_brokers,json=kafkaBrokers,proto3" json:"kafka_brokers"`
}

func (x *KafkaURL) Reset() {
	*x = KafkaURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *KafkaURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*KafkaURL) ProtoMessage() {}

func (x *KafkaURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use KafkaURL.ProtoReflect.Descriptor instead.
func (*KafkaURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{3}
}

func (x *KafkaURL) GetKafkaBrokers() string {
	if x != nil {
		return x.KafkaBrokers
	}
	return ""
}

// S3Url used as request parameters for RPC and HTTP(based on Body)
type S3URL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields
}

func (x *S3URL) Reset() {
	*x = S3URL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *S3URL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*S3URL) ProtoMessage() {}

func (x *S3URL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[4]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use S3URL.ProtoReflect.Descriptor instead.
func (*S3URL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{4}
}

// HBaseURL used as request parameters for RPC and HTTP(based on Body)
type HBaseURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The zookeeper hosts that used by hbase. Multiple nodes are separated by commas. eg: "zk_host1:2181,zk_host2:2181,zk_host3:2181"
	// Is required. Length min: 1, Length MAX: 1024.
	ZkHosts string `protobuf:"bytes,1,opt,name=zk_hosts,json=zkHosts,proto3" json:"zk_hosts"`
	// The hbase path in zookeeper. Is required. Length min: 1, Length MAX: 1024.
	ZkPath string `protobuf:"bytes,2,opt,name=zk_path,json=zkPath,proto3" json:"zk_path"`
}

func (x *HBaseURL) Reset() {
	*x = HBaseURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HBaseURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HBaseURL) ProtoMessage() {}

func (x *HBaseURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[5]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HBaseURL.ProtoReflect.Descriptor instead.
func (*HBaseURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{5}
}

func (x *HBaseURL) GetZkHosts() string {
	if x != nil {
		return x.ZkHosts
	}
	return ""
}

func (x *HBaseURL) GetZkPath() string {
	if x != nil {
		return x.ZkPath
	}
	return ""
}

// FtpURL used as request parameters for RPC and HTTP(based on Body)
type FtpURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Host specifies the hostname of db. Is Required. Length Min: 1, Length Max: 64.
	Host string `protobuf:"bytes,1,opt,name=host,proto3" json:"host"`
	// Port specifies the port of db. Is Required. Min: 0, Length Max: 65536.
	Port int32 `protobuf:"varint,2,opt,name=port,proto3" json:"port"`
	// User specifies the username of db. Is Required. Length Min: 1, Length Max: 64.
	User string `protobuf:"bytes,3,opt,name=user,proto3" json:"user"`
	// Password specifies the password of db. Is Required. Length Min: 1, Length Max: 64.
	Password string `protobuf:"bytes,4,opt,name=password,proto3" json:"password"`
}

func (x *FtpURL) Reset() {
	*x = FtpURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FtpURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FtpURL) ProtoMessage() {}

func (x *FtpURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[6]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use FtpURL.ProtoReflect.Descriptor instead.
func (*FtpURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{6}
}

func (x *FtpURL) GetHost() string {
	if x != nil {
		return x.Host
	}
	return ""
}

func (x *FtpURL) GetPort() int32 {
	if x != nil {
		return x.Port
	}
	return 0
}

func (x *FtpURL) GetUser() string {
	if x != nil {
		return x.User
	}
	return ""
}

func (x *FtpURL) GetPassword() string {
	if x != nil {
		return x.Password
	}
	return ""
}

// HDFSURL used as request parameters for RPC and HTTP(based on Body)
type HDFSURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Nodes *HDFSURL_NodeURL `protobuf:"bytes,1,opt,name=nodes,proto3" json:"nodes"`
}

func (x *HDFSURL) Reset() {
	*x = HDFSURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HDFSURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HDFSURL) ProtoMessage() {}

func (x *HDFSURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[7]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HDFSURL.ProtoReflect.Descriptor instead.
func (*HDFSURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{7}
}

func (x *HDFSURL) GetNodes() *HDFSURL_NodeURL {
	if x != nil {
		return x.Nodes
	}
	return nil
}

type HDFSURL_NodeURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The host
	NameNode string `protobuf:"bytes,1,opt,name=name_node,json=nameNode,proto3" json:"name_node"`
	// The port
	Port int32 `protobuf:"varint,2,opt,name=port,proto3" json:"port"`
}

func (x *HDFSURL_NodeURL) Reset() {
	*x = HDFSURL_NodeURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HDFSURL_NodeURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HDFSURL_NodeURL) ProtoMessage() {}

func (x *HDFSURL_NodeURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_datasource_url_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HDFSURL_NodeURL.ProtoReflect.Descriptor instead.
func (*HDFSURL_NodeURL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP(), []int{7, 0}
}

func (x *HDFSURL_NodeURL) GetNameNode() string {
	if x != nil {
		return x.NameNode
	}
	return ""
}

func (x *HDFSURL_NodeURL) GetPort() int32 {
	if x != nil {
		return x.Port
	}
	return 0
}

var File_proto_types_model_datasource_datasource_url_proto protoreflect.FileDescriptor

var file_proto_types_model_datasource_datasource_url_proto_rawDesc = []byte{
	0x0a, 0x31, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2f, 0x64,
	0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x75, 0x72, 0x6c, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x1a,
	0x35, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x67, 0x6f, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e,
	0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72,
	0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63,
	0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x67, 0x6f,
	0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f,
	0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0xdb, 0x01, 0x0a, 0x08, 0x4d, 0x79,
	0x53, 0x51, 0x4c, 0x55, 0x52, 0x4c, 0x12, 0x23, 0x0a, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x18, 0x01,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90,
	0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x12, 0x23, 0x0a, 0x04, 0x70,
	0x6f, 0x72, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12,
	0x09, 0xb2, 0x01, 0x06, 0x38, 0x80, 0x80, 0x04, 0x40, 0x00, 0x52, 0x04, 0x70, 0x6f, 0x72, 0x74,
	0x12, 0x23, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f,
	0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52,
	0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x2b, 0x0a, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72,
	0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2,
	0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f,
	0x72, 0x64, 0x12, 0x2b, 0x0a, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73, 0x65, 0x18, 0x05,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90,
	0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73, 0x65, 0x3a,
	0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0xe0, 0x01, 0x0a, 0x0d, 0x50, 0x6f, 0x73, 0x74,
	0x67, 0x72, 0x65, 0x53, 0x51, 0x4c, 0x55, 0x52, 0x4c, 0x12, 0x23, 0x0a, 0x04, 0x68, 0x6f, 0x73,
	0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2,
	0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x12, 0x23,
	0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x0f, 0xe2, 0xdf,
	0x1f, 0x0b, 0x12, 0x09, 0xb2, 0x01, 0x06, 0x38, 0x80, 0x80, 0x04, 0x40, 0x00, 0x52, 0x04, 0x70,
	0x6f, 0x72, 0x74, 0x12, 0x23, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98,
	0x02, 0x40, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x2b, 0x0a, 0x08, 0x70, 0x61, 0x73, 0x73,
	0x77, 0x6f, 0x72, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b,
	0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x08, 0x70, 0x61, 0x73,
	0x73, 0x77, 0x6f, 0x72, 0x64, 0x12, 0x2b, 0x0a, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73,
	0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2,
	0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61,
	0x73, 0x65, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0xe0, 0x01, 0x0a, 0x0d, 0x43,
	0x6c, 0x69, 0x63, 0x6b, 0x48, 0x6f, 0x75, 0x73, 0x65, 0x55, 0x52, 0x4c, 0x12, 0x23, 0x0a, 0x04,
	0x68, 0x6f, 0x73, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b,
	0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x04, 0x68, 0x6f, 0x73,
	0x74, 0x12, 0x23, 0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42,
	0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xb2, 0x01, 0x06, 0x38, 0x80, 0x80, 0x04, 0x40, 0x00,
	0x52, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x23, 0x0a, 0x04, 0x75, 0x73, 0x65, 0x72, 0x18, 0x03,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90,
	0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x2b, 0x0a, 0x08, 0x70,
	0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2,
	0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x08,
	0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x12, 0x2b, 0x0a, 0x08, 0x64, 0x61, 0x74, 0x61,
	0x62, 0x61, 0x73, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b,
	0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x08, 0x64, 0x61, 0x74,
	0x61, 0x62, 0x61, 0x73, 0x65, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x49, 0x0a,
	0x08, 0x4b, 0x61, 0x66, 0x6b, 0x61, 0x55, 0x52, 0x4c, 0x12, 0x35, 0x0a, 0x0d, 0x6b, 0x61, 0x66,
	0x6b, 0x61, 0x5f, 0x62, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x10, 0xe2, 0xdf, 0x1f, 0x0c, 0x12, 0x0a, 0xc2, 0x01, 0x07, 0x90, 0x02, 0x01, 0x98, 0x02,
	0x80, 0x08, 0x52, 0x0c, 0x6b, 0x61, 0x66, 0x6b, 0x61, 0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x73,
	0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x0f, 0x0a, 0x05, 0x53, 0x33, 0x55, 0x52,
	0x4c, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x6a, 0x0a, 0x08, 0x48, 0x42, 0x61,
	0x73, 0x65, 0x55, 0x52, 0x4c, 0x12, 0x2b, 0x0a, 0x08, 0x7a, 0x6b, 0x5f, 0x68, 0x6f, 0x73, 0x74,
	0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x10, 0xe2, 0xdf, 0x1f, 0x0c, 0x12, 0x0a, 0xc2,
	0x01, 0x07, 0x90, 0x02, 0x01, 0x98, 0x02, 0x80, 0x08, 0x52, 0x07, 0x7a, 0x6b, 0x48, 0x6f, 0x73,
	0x74, 0x73, 0x12, 0x29, 0x0a, 0x07, 0x7a, 0x6b, 0x5f, 0x70, 0x61, 0x74, 0x68, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x09, 0x42, 0x10, 0xe2, 0xdf, 0x1f, 0x0c, 0x12, 0x0a, 0xc2, 0x01, 0x07, 0x90, 0x02,
	0x01, 0x98, 0x02, 0x80, 0x08, 0x52, 0x06, 0x7a, 0x6b, 0x50, 0x61, 0x74, 0x68, 0x3a, 0x06, 0xca,
	0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0xac, 0x01, 0x0a, 0x06, 0x46, 0x74, 0x70, 0x55, 0x52, 0x4c,
	0x12, 0x23, 0x0a, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f,
	0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52,
	0x04, 0x68, 0x6f, 0x73, 0x74, 0x12, 0x23, 0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x02, 0x20,
	0x01, 0x28, 0x05, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xb2, 0x01, 0x06, 0x38, 0x80,
	0x80, 0x04, 0x40, 0x00, 0x52, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x23, 0x0a, 0x04, 0x75, 0x73,
	0x65, 0x72, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09,
	0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12,
	0x2b, 0x0a, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x04, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98,
	0x02, 0x40, 0x52, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x3a, 0x06, 0xca, 0xb2,
	0x04, 0x02, 0x0a, 0x00, 0x22, 0xaf, 0x01, 0x0a, 0x07, 0x48, 0x44, 0x46, 0x53, 0x55, 0x52, 0x4c,
	0x12, 0x3e, 0x0a, 0x05, 0x6e, 0x6f, 0x64, 0x65, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x1b, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x48, 0x44, 0x46,
	0x53, 0x55, 0x52, 0x4c, 0x2e, 0x4e, 0x6f, 0x64, 0x65, 0x55, 0x52, 0x4c, 0x42, 0x0b, 0xe2, 0xdf,
	0x1f, 0x07, 0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x05, 0x6e, 0x6f, 0x64, 0x65, 0x73,
	0x1a, 0x5c, 0x0a, 0x07, 0x4e, 0x6f, 0x64, 0x65, 0x55, 0x52, 0x4c, 0x12, 0x2c, 0x0a, 0x09, 0x6e,
	0x61, 0x6d, 0x65, 0x5f, 0x6e, 0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f,
	0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2, 0x01, 0x06, 0x90, 0x02, 0x01, 0x98, 0x02, 0x40, 0x52,
	0x08, 0x6e, 0x61, 0x6d, 0x65, 0x4e, 0x6f, 0x64, 0x65, 0x12, 0x23, 0x0a, 0x04, 0x70, 0x6f, 0x72,
	0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xb2,
	0x01, 0x06, 0x38, 0x80, 0x80, 0x04, 0x40, 0x00, 0x52, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x3a, 0x06,
	0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x42, 0x84, 0x01, 0x0a, 0x2f, 0x63, 0x6f, 0x6d, 0x2e, 0x64,
	0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x70, 0x62,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x42, 0x0f, 0x50, 0x42, 0x44, 0x61,
	0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x55, 0x52, 0x4c, 0x50, 0x00, 0x5a, 0x3e, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70,
	0x6b, 0x67, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x2f, 0x70, 0x62, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x62, 0x06, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_datasource_datasource_url_proto_rawDescOnce sync.Once
	file_proto_types_model_datasource_datasource_url_proto_rawDescData = file_proto_types_model_datasource_datasource_url_proto_rawDesc
)

func file_proto_types_model_datasource_datasource_url_proto_rawDescGZIP() []byte {
	file_proto_types_model_datasource_datasource_url_proto_rawDescOnce.Do(func() {
		file_proto_types_model_datasource_datasource_url_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_datasource_datasource_url_proto_rawDescData)
	})
	return file_proto_types_model_datasource_datasource_url_proto_rawDescData
}

var file_proto_types_model_datasource_datasource_url_proto_msgTypes = make([]protoimpl.MessageInfo, 9)
var file_proto_types_model_datasource_datasource_url_proto_goTypes = []interface{}{
	(*MySQLURL)(nil),        // 0: datasource.MySQLURL
	(*PostgreSQLURL)(nil),   // 1: datasource.PostgreSQLURL
	(*ClickHouseURL)(nil),   // 2: datasource.ClickHouseURL
	(*KafkaURL)(nil),        // 3: datasource.KafkaURL
	(*S3URL)(nil),           // 4: datasource.S3URL
	(*HBaseURL)(nil),        // 5: datasource.HBaseURL
	(*FtpURL)(nil),          // 6: datasource.FtpURL
	(*HDFSURL)(nil),         // 7: datasource.HDFSURL
	(*HDFSURL_NodeURL)(nil), // 8: datasource.HDFSURL.NodeURL
}
var file_proto_types_model_datasource_datasource_url_proto_depIdxs = []int32{
	8, // 0: datasource.HDFSURL.nodes:type_name -> datasource.HDFSURL.NodeURL
	1, // [1:1] is the sub-list for method output_type
	1, // [1:1] is the sub-list for method input_type
	1, // [1:1] is the sub-list for extension type_name
	1, // [1:1] is the sub-list for extension extendee
	0, // [0:1] is the sub-list for field type_name
}

func init() { file_proto_types_model_datasource_datasource_url_proto_init() }
func file_proto_types_model_datasource_datasource_url_proto_init() {
	if File_proto_types_model_datasource_datasource_url_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MySQLURL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*PostgreSQLURL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ClickHouseURL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*KafkaURL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*S3URL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HBaseURL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*FtpURL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HDFSURL); i {
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
		file_proto_types_model_datasource_datasource_url_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HDFSURL_NodeURL); i {
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
			RawDescriptor: file_proto_types_model_datasource_datasource_url_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   9,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_datasource_datasource_url_proto_goTypes,
		DependencyIndexes: file_proto_types_model_datasource_datasource_url_proto_depIdxs,
		MessageInfos:      file_proto_types_model_datasource_datasource_url_proto_msgTypes,
	}.Build()
	File_proto_types_model_datasource_datasource_url_proto = out.File
	file_proto_types_model_datasource_datasource_url_proto_rawDesc = nil
	file_proto_types_model_datasource_datasource_url_proto_goTypes = nil
	file_proto_types_model_datasource_datasource_url_proto_depIdxs = nil
}
