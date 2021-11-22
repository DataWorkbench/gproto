// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0
// 	protoc        v3.14.0
// source: proto/datasource.proto

package datasourcepb

import (
	proto "github.com/golang/protobuf/proto"
	_ "github.com/mwitkow/go-proto-validators"
	_ "github.com/yu31/proto-go-plugin/pb/gosqlpb"
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

// MySQLURL used as request parameters for RPC and HTTP(based on Body)
type MySQLURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The username
	User string `protobuf:"bytes,1,opt,name=user,proto3" json:"user" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The password
	Password string `protobuf:"bytes,2,opt,name=password,proto3" json:"password" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The host
	Host string `protobuf:"bytes,3,opt,name=host,proto3" json:"host" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The port
	Port int32 `protobuf:"varint,4,opt,name=port,proto3" json:"port" binding:"gt=0" required:"true" mininum:"1" maximum:"65536"`
	// The database
	Database string `protobuf:"bytes,5,opt,name=database,proto3" json:"database" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
}

func (x *MySQLURL) Reset() {
	*x = MySQLURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MySQLURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MySQLURL) ProtoMessage() {}

func (x *MySQLURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[0]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{0}
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

	// The username
	User string `protobuf:"bytes,1,opt,name=user,proto3" json:"user" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The password
	Password string `protobuf:"bytes,2,opt,name=password,proto3" json:"password" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The host
	Host string `protobuf:"bytes,3,opt,name=host,proto3" json:"host" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The port
	Port int32 `protobuf:"varint,4,opt,name=port,proto3" json:"port" binding:"gt=0" required:"true" mininum:"1" maximum:"65536"`
	// The database
	Database string `protobuf:"bytes,5,opt,name=database,proto3" json:"database" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
}

func (x *PostgreSQLURL) Reset() {
	*x = PostgreSQLURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *PostgreSQLURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*PostgreSQLURL) ProtoMessage() {}

func (x *PostgreSQLURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[1]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{1}
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

	// The username
	User string `protobuf:"bytes,1,opt,name=user,proto3" json:"user" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The password
	Password string `protobuf:"bytes,2,opt,name=password,proto3" json:"password" binding:"gte=0,lte=64" required:"true" minLength:"0" maxLength:"64"`
	// The host
	Host string `protobuf:"bytes,3,opt,name=host,proto3" json:"host" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The port
	Port int32 `protobuf:"varint,4,opt,name=port,proto3" json:"port" binding:"gt=0" required:"true" mininum:"1" maximum:"65536"`
	// The database
	Database string `protobuf:"bytes,5,opt,name=database,proto3" json:"database" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
}

func (x *ClickHouseURL) Reset() {
	*x = ClickHouseURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ClickHouseURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ClickHouseURL) ProtoMessage() {}

func (x *ClickHouseURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[2]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{2}
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

	// The kafak brokers.
	KafkaBrokers string `protobuf:"bytes,1,opt,name=kafka_brokers,json=kafkaBrokers,proto3" json:"kafka_brokers" binding:"gte=1,lte=1024" required:"true" minLength:"1" maxLength:"1024"`
}

func (x *KafkaURL) Reset() {
	*x = KafkaURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *KafkaURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*KafkaURL) ProtoMessage() {}

func (x *KafkaURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[3]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{3}
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
		mi := &file_proto_datasource_proto_msgTypes[4]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *S3URL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*S3URL) ProtoMessage() {}

func (x *S3URL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[4]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{4}
}

// HBaseURL used as request parameters for RPC and HTTP(based on Body)
type HBaseURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The hbase Zookeeper
	Zookeeper string `protobuf:"bytes,1,opt,name=zookeeper,proto3" json:"zookeeper" binding:"gte=1,lte=1024" required:"true" minLength:"1" maxLength:"1024"`
	// The hbase Zookeeper Node
	ZNode string `protobuf:"bytes,2,opt,name=z_node,json=zNode,proto3" json:"z_node" binding:"gte=1,lte=1024" required:"true" minLength:"1" maxLength:"1024"`
}

func (x *HBaseURL) Reset() {
	*x = HBaseURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[5]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HBaseURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HBaseURL) ProtoMessage() {}

func (x *HBaseURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[5]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{5}
}

func (x *HBaseURL) GetZookeeper() string {
	if x != nil {
		return x.Zookeeper
	}
	return ""
}

func (x *HBaseURL) GetZNode() string {
	if x != nil {
		return x.ZNode
	}
	return ""
}

// FtpURL used as request parameters for RPC and HTTP(based on Body)
type FtpURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The host
	Host string `protobuf:"bytes,1,opt,name=host,proto3" json:"host" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The port
	Port int32 `protobuf:"varint,2,opt,name=port,proto3" json:"port" binding:"gt=0" required:"true" mininum:"1" maximum:"65536"`
	// The username
	Username string `protobuf:"bytes,3,opt,name=username,proto3" json:"username" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
	// The password
	Password string `protobuf:"bytes,4,opt,name=password,proto3" json:"password" binding:"gte=1,lte=64" required:"true" minLength:"1" maxLength:"64"`
}

func (x *FtpURL) Reset() {
	*x = FtpURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[6]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *FtpURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*FtpURL) ProtoMessage() {}

func (x *FtpURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[6]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{6}
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

func (x *FtpURL) GetUsername() string {
	if x != nil {
		return x.Username
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

	Nodes *HDFSURL_HDFSNodeURL `protobuf:"bytes,1,opt,name=nodes,proto3" json:"nodes" binding:"gte=1,lte=1024" required:"true" minLength:"1" maxLength:"1024"`
}

func (x *HDFSURL) Reset() {
	*x = HDFSURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[7]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HDFSURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HDFSURL) ProtoMessage() {}

func (x *HDFSURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[7]
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
	return file_proto_datasource_proto_rawDescGZIP(), []int{7}
}

func (x *HDFSURL) GetNodes() *HDFSURL_HDFSNodeURL {
	if x != nil {
		return x.Nodes
	}
	return nil
}

// SourceUrl used as request parameters for RPC and HTTP(based on Body)
type DataSourceURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// MySQL Source Connection Info.
	Mysql *MySQLURL `protobuf:"bytes,1,opt,name=mysql,proto3" json:"mysql"`
	// PostgreSQL Source Connection Info.
	Postgresql *PostgreSQLURL `protobuf:"bytes,2,opt,name=postgresql,proto3" json:"postgresql"`
	// ClickHouse Source Connection Info.
	Clickhouse *ClickHouseURL `protobuf:"bytes,3,opt,name=clickhouse,proto3" json:"clickhouse"`
	// Kafka Source Connection Info.
	Kafka *KafkaURL `protobuf:"bytes,4,opt,name=kafka,proto3" json:"kafka"`
	// S3 Source Connection Info.
	S3 *S3URL `protobuf:"bytes,5,opt,name=s3,proto3" json:"s3"`
	// Hbase Source Connection Info.
	Hbase *HBaseURL `protobuf:"bytes,6,opt,name=hbase,proto3" json:"hbase"`
	// Ftp Source Connection Info.
	Ftp *FtpURL `protobuf:"bytes,7,opt,name=ftp,proto3" json:"ftp"`
	// HDFS Source Connection Info.
	Hdfs *HDFSURL `protobuf:"bytes,8,opt,name=hdfs,proto3" json:"hdfs"`
}

func (x *DataSourceURL) Reset() {
	*x = DataSourceURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[8]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DataSourceURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DataSourceURL) ProtoMessage() {}

func (x *DataSourceURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[8]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DataSourceURL.ProtoReflect.Descriptor instead.
func (*DataSourceURL) Descriptor() ([]byte, []int) {
	return file_proto_datasource_proto_rawDescGZIP(), []int{8}
}

func (x *DataSourceURL) GetMysql() *MySQLURL {
	if x != nil {
		return x.Mysql
	}
	return nil
}

func (x *DataSourceURL) GetPostgresql() *PostgreSQLURL {
	if x != nil {
		return x.Postgresql
	}
	return nil
}

func (x *DataSourceURL) GetClickhouse() *ClickHouseURL {
	if x != nil {
		return x.Clickhouse
	}
	return nil
}

func (x *DataSourceURL) GetKafka() *KafkaURL {
	if x != nil {
		return x.Kafka
	}
	return nil
}

func (x *DataSourceURL) GetS3() *S3URL {
	if x != nil {
		return x.S3
	}
	return nil
}

func (x *DataSourceURL) GetHbase() *HBaseURL {
	if x != nil {
		return x.Hbase
	}
	return nil
}

func (x *DataSourceURL) GetFtp() *FtpURL {
	if x != nil {
		return x.Ftp
	}
	return nil
}

func (x *DataSourceURL) GetHdfs() *HDFSURL {
	if x != nil {
		return x.Hdfs
	}
	return nil
}

type HDFSURL_HDFSNodeURL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// The host
	NameNode string `protobuf:"bytes,1,opt,name=name_node,json=nameNode,proto3" json:"name_node" binding:"gte=1,lte=64" required:"true"`
	// The port
	Port int32 `protobuf:"varint,2,opt,name=port,proto3" json:"port" binding:"gte=1" required:"true" mininum:"1" maximum:"65536"`
}

func (x *HDFSURL_HDFSNodeURL) Reset() {
	*x = HDFSURL_HDFSNodeURL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_datasource_proto_msgTypes[9]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *HDFSURL_HDFSNodeURL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*HDFSURL_HDFSNodeURL) ProtoMessage() {}

func (x *HDFSURL_HDFSNodeURL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_datasource_proto_msgTypes[9]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use HDFSURL_HDFSNodeURL.ProtoReflect.Descriptor instead.
func (*HDFSURL_HDFSNodeURL) Descriptor() ([]byte, []int) {
	return file_proto_datasource_proto_rawDescGZIP(), []int{7, 0}
}

func (x *HDFSURL_HDFSNodeURL) GetNameNode() string {
	if x != nil {
		return x.NameNode
	}
	return ""
}

func (x *HDFSURL_HDFSNodeURL) GetPort() int32 {
	if x != nil {
		return x.Port
	}
	return 0
}

var File_proto_datasource_proto protoreflect.FileDescriptor

var file_proto_datasource_proto_rawDesc = []byte{
	0x0a, 0x16, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x0a, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x1a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x67, 0x6f, 0x2d, 0x70,
	0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71,
	0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x36, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e,
	0x63, 0x6f, 0x6d, 0x2f, 0x6d, 0x77, 0x69, 0x74, 0x6b, 0x6f, 0x77, 0x2f, 0x67, 0x6f, 0x2d, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x2d, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x73, 0x2f,
	0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22,
	0xb8, 0x01, 0x0a, 0x08, 0x4d, 0x79, 0x53, 0x51, 0x4c, 0x55, 0x52, 0x4c, 0x12, 0x1c, 0x0a, 0x04,
	0x75, 0x73, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04,
	0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x24, 0x0a, 0x08, 0x70, 0x61,
	0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf,
	0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64,
	0x12, 0x1c, 0x0a, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08,
	0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x12, 0x1c,
	0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x42, 0x08, 0xe2, 0xdf,
	0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x24, 0x0a, 0x08,
	0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08,
	0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61,
	0x73, 0x65, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0xbd, 0x01, 0x0a, 0x0d, 0x50,
	0x6f, 0x73, 0x74, 0x67, 0x72, 0x65, 0x53, 0x51, 0x4c, 0x55, 0x52, 0x4c, 0x12, 0x1c, 0x0a, 0x04,
	0x75, 0x73, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04,
	0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x24, 0x0a, 0x08, 0x70, 0x61,
	0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf,
	0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64,
	0x12, 0x1c, 0x0a, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08,
	0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x12, 0x1c,
	0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x04, 0x20, 0x01, 0x28, 0x05, 0x42, 0x08, 0xe2, 0xdf,
	0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x24, 0x0a, 0x08,
	0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08,
	0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61,
	0x73, 0x65, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0xc6, 0x01, 0x0a, 0x0d, 0x43,
	0x6c, 0x69, 0x63, 0x6b, 0x48, 0x6f, 0x75, 0x73, 0x65, 0x55, 0x52, 0x4c, 0x12, 0x1c, 0x0a, 0x04,
	0x75, 0x73, 0x65, 0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04,
	0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x75, 0x73, 0x65, 0x72, 0x12, 0x2d, 0x0a, 0x08, 0x70, 0x61,
	0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x11, 0xe2, 0xdf,
	0x1f, 0x0d, 0x70, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0xff, 0x01, 0x78, 0x41, 0x52,
	0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x12, 0x1c, 0x0a, 0x04, 0x68, 0x6f, 0x73,
	0x74, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78,
	0x41, 0x52, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x12, 0x1c, 0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18,
	0x04, 0x20, 0x01, 0x28, 0x05, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52,
	0x04, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x24, 0x0a, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73,
	0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78,
	0x41, 0x52, 0x08, 0x64, 0x61, 0x74, 0x61, 0x62, 0x61, 0x73, 0x65, 0x3a, 0x06, 0xca, 0xb2, 0x04,
	0x02, 0x0a, 0x00, 0x22, 0x42, 0x0a, 0x08, 0x4b, 0x61, 0x66, 0x6b, 0x61, 0x55, 0x52, 0x4c, 0x12,
	0x2e, 0x0a, 0x0d, 0x6b, 0x61, 0x66, 0x6b, 0x61, 0x5f, 0x62, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x73,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x09, 0xe2, 0xdf, 0x1f, 0x05, 0x70, 0x00, 0x78, 0x81,
	0x08, 0x52, 0x0c, 0x6b, 0x61, 0x66, 0x6b, 0x61, 0x42, 0x72, 0x6f, 0x6b, 0x65, 0x72, 0x73, 0x3a,
	0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x0f, 0x0a, 0x05, 0x53, 0x33, 0x55, 0x52, 0x4c,
	0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x5d, 0x0a, 0x08, 0x48, 0x42, 0x61, 0x73,
	0x65, 0x55, 0x52, 0x4c, 0x12, 0x27, 0x0a, 0x09, 0x7a, 0x6f, 0x6f, 0x6b, 0x65, 0x65, 0x70, 0x65,
	0x72, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x09, 0xe2, 0xdf, 0x1f, 0x05, 0x70, 0x00, 0x78,
	0x81, 0x08, 0x52, 0x09, 0x7a, 0x6f, 0x6f, 0x6b, 0x65, 0x65, 0x70, 0x65, 0x72, 0x12, 0x20, 0x0a,
	0x06, 0x7a, 0x5f, 0x6e, 0x6f, 0x64, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42, 0x09, 0xe2,
	0xdf, 0x1f, 0x05, 0x70, 0x00, 0x78, 0x81, 0x08, 0x52, 0x05, 0x7a, 0x4e, 0x6f, 0x64, 0x65, 0x3a,
	0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x98, 0x01, 0x0a, 0x06, 0x46, 0x74, 0x70, 0x55,
	0x52, 0x4c, 0x12, 0x1c, 0x0a, 0x04, 0x68, 0x6f, 0x73, 0x74, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x68, 0x6f, 0x73, 0x74,
	0x12, 0x1c, 0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x02, 0x20, 0x01, 0x28, 0x05, 0x42, 0x08,
	0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x12, 0x24,
	0x0a, 0x08, 0x75, 0x73, 0x65, 0x72, 0x6e, 0x61, 0x6d, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x08, 0x75, 0x73, 0x65, 0x72,
	0x6e, 0x61, 0x6d, 0x65, 0x12, 0x24, 0x0a, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64,
	0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41,
	0x52, 0x08, 0x70, 0x61, 0x73, 0x73, 0x77, 0x6f, 0x72, 0x64, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02,
	0x0a, 0x00, 0x22, 0xa7, 0x01, 0x0a, 0x07, 0x48, 0x44, 0x46, 0x53, 0x55, 0x52, 0x4c, 0x12, 0x40,
	0x0a, 0x05, 0x6e, 0x6f, 0x64, 0x65, 0x73, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1f, 0x2e,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x48, 0x44, 0x46, 0x53, 0x55,
	0x52, 0x4c, 0x2e, 0x48, 0x44, 0x46, 0x53, 0x4e, 0x6f, 0x64, 0x65, 0x55, 0x52, 0x4c, 0x42, 0x09,
	0xe2, 0xdf, 0x1f, 0x05, 0x70, 0x00, 0x78, 0x81, 0x08, 0x52, 0x05, 0x6e, 0x6f, 0x64, 0x65, 0x73,
	0x1a, 0x52, 0x0a, 0x0b, 0x48, 0x44, 0x46, 0x53, 0x4e, 0x6f, 0x64, 0x65, 0x55, 0x52, 0x4c, 0x12,
	0x25, 0x0a, 0x09, 0x6e, 0x61, 0x6d, 0x65, 0x5f, 0x6e, 0x6f, 0x64, 0x65, 0x18, 0x01, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x08, 0x6e, 0x61,
	0x6d, 0x65, 0x4e, 0x6f, 0x64, 0x65, 0x12, 0x1c, 0x0a, 0x04, 0x70, 0x6f, 0x72, 0x74, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x05, 0x42, 0x08, 0xe2, 0xdf, 0x1f, 0x04, 0x70, 0x00, 0x78, 0x41, 0x52, 0x04,
	0x70, 0x6f, 0x72, 0x74, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x83, 0x03, 0x0a,
	0x0d, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x55, 0x52, 0x4c, 0x12, 0x2a,
	0x0a, 0x05, 0x6d, 0x79, 0x73, 0x71, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e,
	0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x4d, 0x79, 0x53, 0x51, 0x4c,
	0x55, 0x52, 0x4c, 0x52, 0x05, 0x6d, 0x79, 0x73, 0x71, 0x6c, 0x12, 0x39, 0x0a, 0x0a, 0x70, 0x6f,
	0x73, 0x74, 0x67, 0x72, 0x65, 0x73, 0x71, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19,
	0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x50, 0x6f, 0x73, 0x74,
	0x67, 0x72, 0x65, 0x53, 0x51, 0x4c, 0x55, 0x52, 0x4c, 0x52, 0x0a, 0x70, 0x6f, 0x73, 0x74, 0x67,
	0x72, 0x65, 0x73, 0x71, 0x6c, 0x12, 0x39, 0x0a, 0x0a, 0x63, 0x6c, 0x69, 0x63, 0x6b, 0x68, 0x6f,
	0x75, 0x73, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x64, 0x61, 0x74, 0x61,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x43, 0x6c, 0x69, 0x63, 0x6b, 0x48, 0x6f, 0x75, 0x73,
	0x65, 0x55, 0x52, 0x4c, 0x52, 0x0a, 0x63, 0x6c, 0x69, 0x63, 0x6b, 0x68, 0x6f, 0x75, 0x73, 0x65,
	0x12, 0x2a, 0x0a, 0x05, 0x6b, 0x61, 0x66, 0x6b, 0x61, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x14, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x4b, 0x61, 0x66,
	0x6b, 0x61, 0x55, 0x52, 0x4c, 0x52, 0x05, 0x6b, 0x61, 0x66, 0x6b, 0x61, 0x12, 0x21, 0x0a, 0x02,
	0x73, 0x33, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x53, 0x33, 0x55, 0x52, 0x4c, 0x52, 0x02, 0x73, 0x33, 0x12,
	0x2a, 0x0a, 0x05, 0x68, 0x62, 0x61, 0x73, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14,
	0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x48, 0x42, 0x61, 0x73,
	0x65, 0x55, 0x52, 0x4c, 0x52, 0x05, 0x68, 0x62, 0x61, 0x73, 0x65, 0x12, 0x24, 0x0a, 0x03, 0x66,
	0x74, 0x70, 0x18, 0x07, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x46, 0x74, 0x70, 0x55, 0x52, 0x4c, 0x52, 0x03, 0x66, 0x74,
	0x70, 0x12, 0x27, 0x0a, 0x04, 0x68, 0x64, 0x66, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x13, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x48, 0x44, 0x46,
	0x53, 0x55, 0x52, 0x4c, 0x52, 0x04, 0x68, 0x64, 0x66, 0x73, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02,
	0x0a, 0x00, 0x42, 0x32, 0x5a, 0x30, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x70, 0x6b, 0x67, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x70, 0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_datasource_proto_rawDescOnce sync.Once
	file_proto_datasource_proto_rawDescData = file_proto_datasource_proto_rawDesc
)

func file_proto_datasource_proto_rawDescGZIP() []byte {
	file_proto_datasource_proto_rawDescOnce.Do(func() {
		file_proto_datasource_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_datasource_proto_rawDescData)
	})
	return file_proto_datasource_proto_rawDescData
}

var file_proto_datasource_proto_msgTypes = make([]protoimpl.MessageInfo, 10)
var file_proto_datasource_proto_goTypes = []interface{}{
	(*MySQLURL)(nil),            // 0: datasource.MySQLURL
	(*PostgreSQLURL)(nil),       // 1: datasource.PostgreSQLURL
	(*ClickHouseURL)(nil),       // 2: datasource.ClickHouseURL
	(*KafkaURL)(nil),            // 3: datasource.KafkaURL
	(*S3URL)(nil),               // 4: datasource.S3URL
	(*HBaseURL)(nil),            // 5: datasource.HBaseURL
	(*FtpURL)(nil),              // 6: datasource.FtpURL
	(*HDFSURL)(nil),             // 7: datasource.HDFSURL
	(*DataSourceURL)(nil),       // 8: datasource.DataSourceURL
	(*HDFSURL_HDFSNodeURL)(nil), // 9: datasource.HDFSURL.HDFSNodeURL
}
var file_proto_datasource_proto_depIdxs = []int32{
	9, // 0: datasource.HDFSURL.nodes:type_name -> datasource.HDFSURL.HDFSNodeURL
	0, // 1: datasource.DataSourceURL.mysql:type_name -> datasource.MySQLURL
	1, // 2: datasource.DataSourceURL.postgresql:type_name -> datasource.PostgreSQLURL
	2, // 3: datasource.DataSourceURL.clickhouse:type_name -> datasource.ClickHouseURL
	3, // 4: datasource.DataSourceURL.kafka:type_name -> datasource.KafkaURL
	4, // 5: datasource.DataSourceURL.s3:type_name -> datasource.S3URL
	5, // 6: datasource.DataSourceURL.hbase:type_name -> datasource.HBaseURL
	6, // 7: datasource.DataSourceURL.ftp:type_name -> datasource.FtpURL
	7, // 8: datasource.DataSourceURL.hdfs:type_name -> datasource.HDFSURL
	9, // [9:9] is the sub-list for method output_type
	9, // [9:9] is the sub-list for method input_type
	9, // [9:9] is the sub-list for extension type_name
	9, // [9:9] is the sub-list for extension extendee
	0, // [0:9] is the sub-list for field type_name
}

func init() { file_proto_datasource_proto_init() }
func file_proto_datasource_proto_init() {
	if File_proto_datasource_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_datasource_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[4].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[5].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[6].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[7].Exporter = func(v interface{}, i int) interface{} {
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
		file_proto_datasource_proto_msgTypes[8].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DataSourceURL); i {
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
		file_proto_datasource_proto_msgTypes[9].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*HDFSURL_HDFSNodeURL); i {
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
			RawDescriptor: file_proto_datasource_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   10,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_datasource_proto_goTypes,
		DependencyIndexes: file_proto_datasource_proto_depIdxs,
		MessageInfos:      file_proto_datasource_proto_msgTypes,
	}.Build()
	File_proto_datasource_proto = out.File
	file_proto_datasource_proto_rawDesc = nil
	file_proto_datasource_proto_goTypes = nil
	file_proto_datasource_proto_depIdxs = nil
}
