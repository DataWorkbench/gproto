// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/datasource.proto

package pbmodel

import (
	pbdatasource "github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbdatasource"
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

type DataSource_Status int32

const (
	DataSource_StatusUnset DataSource_Status = 0
	DataSource_Deleted     DataSource_Status = 1
	DataSource_Enabled     DataSource_Status = 2
	DataSource_Disabled    DataSource_Status = 3
)

// Enum value maps for DataSource_Status.
var (
	DataSource_Status_name = map[int32]string{
		0: "StatusUnset",
		1: "Deleted",
		2: "Enabled",
		3: "Disabled",
	}
	DataSource_Status_value = map[string]int32{
		"StatusUnset": 0,
		"Deleted":     1,
		"Enabled":     2,
		"Disabled":    3,
	}
)

func (x DataSource_Status) Enum() *DataSource_Status {
	p := new(DataSource_Status)
	*p = x
	return p
}

func (x DataSource_Status) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DataSource_Status) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_datasource_proto_enumTypes[0].Descriptor()
}

func (DataSource_Status) Type() protoreflect.EnumType {
	return &file_proto_types_model_datasource_proto_enumTypes[0]
}

func (x DataSource_Status) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DataSource_Status.Descriptor instead.
func (DataSource_Status) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{0, 0}
}

type DataSource_Type int32

const (
	DataSource_TypeUnset  DataSource_Type = 0
	DataSource_MySQL      DataSource_Type = 1
	DataSource_PostgreSQL DataSource_Type = 2
	DataSource_Kafka      DataSource_Type = 3
	DataSource_S3         DataSource_Type = 4
	DataSource_ClickHouse DataSource_Type = 5
	DataSource_HBase      DataSource_Type = 6
	DataSource_Ftp        DataSource_Type = 7
	DataSource_HDFS       DataSource_Type = 8
)

// Enum value maps for DataSource_Type.
var (
	DataSource_Type_name = map[int32]string{
		0: "TypeUnset",
		1: "MySQL",
		2: "PostgreSQL",
		3: "Kafka",
		4: "S3",
		5: "ClickHouse",
		6: "HBase",
		7: "Ftp",
		8: "HDFS",
	}
	DataSource_Type_value = map[string]int32{
		"TypeUnset":  0,
		"MySQL":      1,
		"PostgreSQL": 2,
		"Kafka":      3,
		"S3":         4,
		"ClickHouse": 5,
		"HBase":      6,
		"Ftp":        7,
		"HDFS":       8,
	}
)

func (x DataSource_Type) Enum() *DataSource_Type {
	p := new(DataSource_Type)
	*p = x
	return p
}

func (x DataSource_Type) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DataSource_Type) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_datasource_proto_enumTypes[1].Descriptor()
}

func (DataSource_Type) Type() protoreflect.EnumType {
	return &file_proto_types_model_datasource_proto_enumTypes[1]
}

func (x DataSource_Type) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DataSource_Type.Descriptor instead.
func (DataSource_Type) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{0, 1}
}

type DataSourceConnection_Status int32

const (
	DataSourceConnection_StatusUnset DataSourceConnection_Status = 0
	DataSourceConnection_Deleted     DataSourceConnection_Status = 1
	DataSourceConnection_Enabled     DataSourceConnection_Status = 2
)

// Enum value maps for DataSourceConnection_Status.
var (
	DataSourceConnection_Status_name = map[int32]string{
		0: "StatusUnset",
		1: "Deleted",
		2: "Enabled",
	}
	DataSourceConnection_Status_value = map[string]int32{
		"StatusUnset": 0,
		"Deleted":     1,
		"Enabled":     2,
	}
)

func (x DataSourceConnection_Status) Enum() *DataSourceConnection_Status {
	p := new(DataSourceConnection_Status)
	*p = x
	return p
}

func (x DataSourceConnection_Status) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DataSourceConnection_Status) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_datasource_proto_enumTypes[2].Descriptor()
}

func (DataSourceConnection_Status) Type() protoreflect.EnumType {
	return &file_proto_types_model_datasource_proto_enumTypes[2]
}

func (x DataSourceConnection_Status) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DataSourceConnection_Status.Descriptor instead.
func (DataSourceConnection_Status) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{1, 0}
}

// Result connectivity test results
type DataSourceConnection_Result int32

const (
	DataSourceConnection_StateUnset DataSourceConnection_Result = 0
	DataSourceConnection_Success    DataSourceConnection_Result = 1
	DataSourceConnection_Failed     DataSourceConnection_Result = 2
)

// Enum value maps for DataSourceConnection_Result.
var (
	DataSourceConnection_Result_name = map[int32]string{
		0: "StateUnset",
		1: "Success",
		2: "Failed",
	}
	DataSourceConnection_Result_value = map[string]int32{
		"StateUnset": 0,
		"Success":    1,
		"Failed":     2,
	}
)

func (x DataSourceConnection_Result) Enum() *DataSourceConnection_Result {
	p := new(DataSourceConnection_Result)
	*p = x
	return p
}

func (x DataSourceConnection_Result) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (DataSourceConnection_Result) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_datasource_proto_enumTypes[3].Descriptor()
}

func (DataSourceConnection_Result) Type() protoreflect.EnumType {
	return &file_proto_types_model_datasource_proto_enumTypes[3]
}

func (x DataSourceConnection_Result) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use DataSourceConnection_Result.Descriptor instead.
func (DataSourceConnection_Result) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{1, 1}
}

// Data Source Schema
type DataSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Space ID, workspace ID.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" gorm:"column:space_id;"`
	// Source ID, unique within a region.
	Id string `protobuf:"bytes,2,opt,name=id,proto3" json:"id" gorm:"column:id;primaryKey;"`
	// Data Source Name, unique within a space. Min characters 2. Max characters 64.
	Name string `protobuf:"bytes,3,opt,name=name,proto3" json:"name" gorm:"column:name;"`
	// Comment, describe this source.
	Desc string `protobuf:"bytes,4,opt,name=desc,proto3" json:"desc" gorm:"column:desc;" binding:"gte=0,lte=256"`
	// Source Type, 1->MySQL 2->PostgreSQL 3->Kafka 4->S3 5->ClickHouse 6->Hbase 7->Ftp 8->HDFS
	Type DataSource_Type `protobuf:"varint,5,opt,name=type,proto3,enum=model.DataSource_Type" json:"type" gorm:"column:type;"`
	// Url, this source connection info.
	Url *DataSource_URL `protobuf:"bytes,6,opt,name=url,proto3" json:"url" gorm:"column:url;"`
	// Status, 1 => "Delete", 2 => "enabled", 3 => "disabled"
	Status DataSource_Status `protobuf:"varint,7,opt,name=status,proto3,enum=model.DataSource_Status" json:"status" gorm:"column:status;"`
	// DataSource owner.
	CreatedBy string `protobuf:"bytes,8,opt,name=created_by,json=createdBy,proto3" json:"created_by" gorm:"column:created_by"`
	// Create Time, this Source create time.
	Created int64 `protobuf:"varint,9,opt,name=created,proto3" json:"created" gorm:"column:created;"`
	// Update Time, this Source last update time.
	Updated int64 `protobuf:"varint,10,opt,name=updated,proto3" json:"updated" gorm:"column:updated;"`
	// The last connection record. The value is nil if never tested for usability.
	// Notice: No in db.
	LastConnection *DataSourceConnection `protobuf:"bytes,11,opt,name=last_connection,json=lastConnection,proto3" json:"last_connection" gorm:"-"`
}

func (x *DataSource) Reset() {
	*x = DataSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DataSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DataSource) ProtoMessage() {}

func (x *DataSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DataSource.ProtoReflect.Descriptor instead.
func (*DataSource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{0}
}

func (x *DataSource) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *DataSource) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *DataSource) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

func (x *DataSource) GetDesc() string {
	if x != nil {
		return x.Desc
	}
	return ""
}

func (x *DataSource) GetType() DataSource_Type {
	if x != nil {
		return x.Type
	}
	return DataSource_TypeUnset
}

func (x *DataSource) GetUrl() *DataSource_URL {
	if x != nil {
		return x.Url
	}
	return nil
}

func (x *DataSource) GetStatus() DataSource_Status {
	if x != nil {
		return x.Status
	}
	return DataSource_StatusUnset
}

func (x *DataSource) GetCreatedBy() string {
	if x != nil {
		return x.CreatedBy
	}
	return ""
}

func (x *DataSource) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

func (x *DataSource) GetUpdated() int64 {
	if x != nil {
		return x.Updated
	}
	return 0
}

func (x *DataSource) GetLastConnection() *DataSourceConnection {
	if x != nil {
		return x.LastConnection
	}
	return nil
}

// Data Source Connection state log.
type DataSourceConnection struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Space ID, workspace ID.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" gorm:"column:space_id;"`
	// DataSource ID.
	SourceId string `protobuf:"bytes,2,opt,name=source_id,json=sourceId,proto3" json:"source_id" gorm:"column:source_id;primaryKey;"`
	// Source ID, unique within a region.
	NetworkId string `protobuf:"bytes,3,opt,name=network_id,json=networkId,proto3" json:"network_id" gorm:"column:network_id;"`
	// Status, 1 => "Deleted", 2 => "Enabled".
	Status DataSourceConnection_Status `protobuf:"varint,4,opt,name=status,proto3,enum=model.DataSourceConnection_Status" json:"status" gorm:"column:status;"`
	// Connection state  1 => success 2 => failed
	Result DataSourceConnection_Result `protobuf:"varint,5,opt,name=result,proto3,enum=model.DataSourceConnection_Result" json:"result" gorm:"column:result;"`
	// Message is the reason when connection failure.
	Message string `protobuf:"bytes,6,opt,name=message,proto3" json:"message" gorm:"column:message;"`
	// Create Time, When start tested for usability..
	Created int64 `protobuf:"varint,7,opt,name=created,proto3" json:"created" gorm:"column:created;"`
	// Elapse is Used time of tested for usability. unit in ms.
	Elapse      int64    `protobuf:"varint,8,opt,name=elapse,proto3" json:"elapse" gorm:"column:elapse;"`
	NetworkInfo *Network `protobuf:"bytes,9,opt,name=network_info,json=networkInfo,proto3" json:"network_info" gorm:"-"`
}

func (x *DataSourceConnection) Reset() {
	*x = DataSourceConnection{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DataSourceConnection) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DataSourceConnection) ProtoMessage() {}

func (x *DataSourceConnection) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DataSourceConnection.ProtoReflect.Descriptor instead.
func (*DataSourceConnection) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{1}
}

func (x *DataSourceConnection) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *DataSourceConnection) GetSourceId() string {
	if x != nil {
		return x.SourceId
	}
	return ""
}

func (x *DataSourceConnection) GetNetworkId() string {
	if x != nil {
		return x.NetworkId
	}
	return ""
}

func (x *DataSourceConnection) GetStatus() DataSourceConnection_Status {
	if x != nil {
		return x.Status
	}
	return DataSourceConnection_StatusUnset
}

func (x *DataSourceConnection) GetResult() DataSourceConnection_Result {
	if x != nil {
		return x.Result
	}
	return DataSourceConnection_StateUnset
}

func (x *DataSourceConnection) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

func (x *DataSourceConnection) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

func (x *DataSourceConnection) GetElapse() int64 {
	if x != nil {
		return x.Elapse
	}
	return 0
}

func (x *DataSourceConnection) GetNetworkInfo() *Network {
	if x != nil {
		return x.NetworkInfo
	}
	return nil
}

// DataSourceKind represents the kind of datasource. eg. { "name": "MySQL"}, { "name": "Kafka" }
type DataSourceKind struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// this kind name
	Name string `protobuf:"bytes,1,opt,name=Name,proto3" json:"name"`
}

func (x *DataSourceKind) Reset() {
	*x = DataSourceKind{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DataSourceKind) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DataSourceKind) ProtoMessage() {}

func (x *DataSourceKind) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DataSourceKind.ProtoReflect.Descriptor instead.
func (*DataSourceKind) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{2}
}

func (x *DataSourceKind) GetName() string {
	if x != nil {
		return x.Name
	}
	return ""
}

// URL of datasource settings.
type DataSource_URL struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Source Type, one of 12345678 1->MySQL/2->PostgreSQL/3->Kafka/4->S3/5->ClickHouse/6->Hbase/7->Ftp/8->HDFS
	Type DataSource_Type `protobuf:"varint,10,opt,name=type,proto3,enum=model.DataSource_Type" json:"-"`
	// MySQL Source Connection Info.
	Mysql *pbdatasource.MySQLURL `protobuf:"bytes,1,opt,name=mysql,proto3" json:"mysql"`
	// PostgreSQL Source Connection Info.
	Postgresql *pbdatasource.PostgreSQLURL `protobuf:"bytes,2,opt,name=postgresql,proto3" json:"postgresql"`
	// Kafka Source Connection Info.
	Kafka *pbdatasource.KafkaURL `protobuf:"bytes,3,opt,name=kafka,proto3" json:"kafka"`
	// S3 Source Connection Info.
	S3 *pbdatasource.S3URL `protobuf:"bytes,4,opt,name=s3,proto3" json:"s3"`
	// ClickHouse Source Connection Info.
	Clickhouse *pbdatasource.ClickHouseURL `protobuf:"bytes,5,opt,name=clickhouse,proto3" json:"clickhouse"`
	// Hbase Source Connection Info.
	Hbase *pbdatasource.HBaseURL `protobuf:"bytes,6,opt,name=hbase,proto3" json:"hbase"`
	// Ftp Source Connection Info.
	Ftp *pbdatasource.FtpURL `protobuf:"bytes,7,opt,name=ftp,proto3" json:"ftp"`
	// HDFS Source Connection Info.
	Hdfs *pbdatasource.HDFSURL `protobuf:"bytes,8,opt,name=hdfs,proto3" json:"hdfs"`
}

func (x *DataSource_URL) Reset() {
	*x = DataSource_URL{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_datasource_proto_msgTypes[3]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *DataSource_URL) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*DataSource_URL) ProtoMessage() {}

func (x *DataSource_URL) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_datasource_proto_msgTypes[3]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use DataSource_URL.ProtoReflect.Descriptor instead.
func (*DataSource_URL) Descriptor() ([]byte, []int) {
	return file_proto_types_model_datasource_proto_rawDescGZIP(), []int{0, 0}
}

func (x *DataSource_URL) GetType() DataSource_Type {
	if x != nil {
		return x.Type
	}
	return DataSource_TypeUnset
}

func (x *DataSource_URL) GetMysql() *pbdatasource.MySQLURL {
	if x != nil {
		return x.Mysql
	}
	return nil
}

func (x *DataSource_URL) GetPostgresql() *pbdatasource.PostgreSQLURL {
	if x != nil {
		return x.Postgresql
	}
	return nil
}

func (x *DataSource_URL) GetKafka() *pbdatasource.KafkaURL {
	if x != nil {
		return x.Kafka
	}
	return nil
}

func (x *DataSource_URL) GetS3() *pbdatasource.S3URL {
	if x != nil {
		return x.S3
	}
	return nil
}

func (x *DataSource_URL) GetClickhouse() *pbdatasource.ClickHouseURL {
	if x != nil {
		return x.Clickhouse
	}
	return nil
}

func (x *DataSource_URL) GetHbase() *pbdatasource.HBaseURL {
	if x != nil {
		return x.Hbase
	}
	return nil
}

func (x *DataSource_URL) GetFtp() *pbdatasource.FtpURL {
	if x != nil {
		return x.Ftp
	}
	return nil
}

func (x *DataSource_URL) GetHdfs() *pbdatasource.HDFSURL {
	if x != nil {
		return x.Hdfs
	}
	return nil
}

var File_proto_types_model_datasource_proto protoreflect.FileDescriptor

var file_proto_types_model_datasource_proto_rawDesc = []byte{
	0x0a, 0x22, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33, 0x67, 0x69, 0x74,
	0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x1a, 0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33,
	0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71, 0x6c, 0x2e, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x1a, 0x1f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x2e, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x1a, 0x31, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x2f, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x75, 0x72, 0x6c, 0x2e,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x8b, 0x0b, 0x0a, 0x0a, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f,
	0x75, 0x72, 0x63, 0x65, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01,
	0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x49, 0x64, 0x12, 0x23, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09,
	0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02,
	0x04, 0x73, 0x6f, 0x6d, 0x2d, 0x52, 0x02, 0x69, 0x64, 0x12, 0x23, 0x0a, 0x04, 0x6e, 0x61, 0x6d,
	0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0f, 0xe2, 0xdf, 0x1f, 0x0b, 0x12, 0x09, 0xc2,
	0x01, 0x06, 0x90, 0x02, 0x02, 0x98, 0x02, 0x40, 0x52, 0x04, 0x6e, 0x61, 0x6d, 0x65, 0x12, 0x21,
	0x0a, 0x04, 0x64, 0x65, 0x73, 0x63, 0x18, 0x04, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0d, 0xe2, 0xdf,
	0x1f, 0x09, 0x12, 0x07, 0xc2, 0x01, 0x04, 0xc8, 0x01, 0x80, 0x02, 0x52, 0x04, 0x64, 0x65, 0x73,
	0x63, 0x12, 0x39, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0e, 0x32,
	0x16, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x2e, 0x54, 0x79, 0x70, 0x65, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda,
	0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x36, 0x0a, 0x03,
	0x75, 0x72, 0x6c, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x15, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x55, 0x52, 0x4c,
	0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xe2, 0x01, 0x04, 0x10, 0x01, 0x18, 0x01, 0x52,
	0x03, 0x75, 0x72, 0x6c, 0x12, 0x3f, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x07,
	0x20, 0x01, 0x28, 0x0e, 0x32, 0x18, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x44, 0x61, 0x74,
	0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x0d,
	0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01, 0x04, 0x30, 0x01, 0x58, 0x01, 0x52, 0x06, 0x73,
	0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x2b, 0x0a, 0x0a, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64,
	0x5f, 0x62, 0x79, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12,
	0x06, 0xc2, 0x01, 0x03, 0x98, 0x02, 0x40, 0x52, 0x09, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64,
	0x42, 0x79, 0x12, 0x25, 0x0a, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x09, 0x20,
	0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00,
	0x52, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x12, 0x25, 0x0a, 0x07, 0x75, 0x70, 0x64,
	0x61, 0x74, 0x65, 0x64, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07,
	0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64,
	0x12, 0x44, 0x0a, 0x0f, 0x6c, 0x61, 0x73, 0x74, 0x5f, 0x63, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74,
	0x69, 0x6f, 0x6e, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x1b, 0x2e, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x43, 0x6f, 0x6e, 0x6e,
	0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x52, 0x0e, 0x6c, 0x61, 0x73, 0x74, 0x43, 0x6f, 0x6e, 0x6e,
	0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x1a, 0xb4, 0x05, 0x0a, 0x03, 0x55, 0x52, 0x4c, 0x12, 0x39,
	0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x16, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e,
	0x54, 0x79, 0x70, 0x65, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01, 0x04, 0x30,
	0x00, 0x58, 0x01, 0x52, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x4a, 0x0a, 0x05, 0x6d, 0x79, 0x73,
	0x71, 0x6c, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x4d, 0x79, 0x53, 0x51, 0x4c, 0x55, 0x52, 0x4c, 0x42, 0x1e,
	0xe2, 0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x05, 0xda, 0x01,
	0x02, 0x18, 0x01, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x05,
	0x6d, 0x79, 0x73, 0x71, 0x6c, 0x12, 0x59, 0x0a, 0x0a, 0x70, 0x6f, 0x73, 0x74, 0x67, 0x72, 0x65,
	0x73, 0x71, 0x6c, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x64, 0x61, 0x74, 0x61,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x50, 0x6f, 0x73, 0x74, 0x67, 0x72, 0x65, 0x53, 0x51,
	0x4c, 0x55, 0x52, 0x4c, 0x42, 0x1e, 0xe2, 0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x74, 0x79,
	0x70, 0x65, 0x12, 0x05, 0xda, 0x01, 0x02, 0x18, 0x02, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xe2,
	0x01, 0x02, 0x10, 0x01, 0x52, 0x0a, 0x70, 0x6f, 0x73, 0x74, 0x67, 0x72, 0x65, 0x73, 0x71, 0x6c,
	0x12, 0x4a, 0x0a, 0x05, 0x6b, 0x61, 0x66, 0x6b, 0x61, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x14, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x4b, 0x61, 0x66,
	0x6b, 0x61, 0x55, 0x52, 0x4c, 0x42, 0x1e, 0xe2, 0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x74,
	0x79, 0x70, 0x65, 0x12, 0x05, 0xda, 0x01, 0x02, 0x18, 0x03, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05,
	0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x05, 0x6b, 0x61, 0x66, 0x6b, 0x61, 0x12, 0x41, 0x0a, 0x02,
	0x73, 0x33, 0x18, 0x04, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x11, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x53, 0x33, 0x55, 0x52, 0x4c, 0x42, 0x1e, 0xe2, 0xdf, 0x1f,
	0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x05, 0xda, 0x01, 0x02, 0x18, 0x04,
	0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x02, 0x73, 0x33, 0x12,
	0x59, 0x0a, 0x0a, 0x63, 0x6c, 0x69, 0x63, 0x6b, 0x68, 0x6f, 0x75, 0x73, 0x65, 0x18, 0x05, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x19, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x2e, 0x43, 0x6c, 0x69, 0x63, 0x6b, 0x48, 0x6f, 0x75, 0x73, 0x65, 0x55, 0x52, 0x4c, 0x42, 0x1e,
	0xe2, 0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x05, 0xda, 0x01,
	0x02, 0x18, 0x05, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x0a,
	0x63, 0x6c, 0x69, 0x63, 0x6b, 0x68, 0x6f, 0x75, 0x73, 0x65, 0x12, 0x4a, 0x0a, 0x05, 0x68, 0x62,
	0x61, 0x73, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x14, 0x2e, 0x64, 0x61, 0x74, 0x61,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x48, 0x42, 0x61, 0x73, 0x65, 0x55, 0x52, 0x4c, 0x42,
	0x1e, 0xe2, 0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x05, 0xda,
	0x01, 0x02, 0x18, 0x06, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52,
	0x05, 0x68, 0x62, 0x61, 0x73, 0x65, 0x12, 0x44, 0x0a, 0x03, 0x66, 0x74, 0x70, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x0b, 0x32, 0x12, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x2e, 0x46, 0x74, 0x70, 0x55, 0x52, 0x4c, 0x42, 0x1e, 0xe2, 0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a,
	0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x05, 0xda, 0x01, 0x02, 0x18, 0x07, 0xe2, 0xdf, 0x1f, 0x07,
	0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52, 0x03, 0x66, 0x74, 0x70, 0x12, 0x47, 0x0a, 0x04,
	0x68, 0x64, 0x66, 0x73, 0x18, 0x08, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x13, 0x2e, 0x64, 0x61, 0x74,
	0x61, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x2e, 0x48, 0x44, 0x46, 0x53, 0x55, 0x52, 0x4c, 0x42,
	0x1e, 0xe2, 0xdf, 0x1f, 0x0f, 0x0a, 0x0d, 0x0a, 0x04, 0x74, 0x79, 0x70, 0x65, 0x12, 0x05, 0xda,
	0x01, 0x02, 0x18, 0x08, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xe2, 0x01, 0x02, 0x10, 0x01, 0x52,
	0x04, 0x68, 0x64, 0x66, 0x73, 0x3a, 0x06, 0xca, 0xb2, 0x04, 0x02, 0x0a, 0x00, 0x22, 0x41, 0x0a,
	0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x0f, 0x0a, 0x0b, 0x53, 0x74, 0x61, 0x74, 0x75,
	0x73, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x44, 0x65, 0x6c, 0x65,
	0x74, 0x65, 0x64, 0x10, 0x01, 0x12, 0x0b, 0x0a, 0x07, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64,
	0x10, 0x02, 0x12, 0x0c, 0x0a, 0x08, 0x44, 0x69, 0x73, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x10, 0x03,
	0x22, 0x71, 0x0a, 0x04, 0x54, 0x79, 0x70, 0x65, 0x12, 0x0d, 0x0a, 0x09, 0x54, 0x79, 0x70, 0x65,
	0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x09, 0x0a, 0x05, 0x4d, 0x79, 0x53, 0x51, 0x4c,
	0x10, 0x01, 0x12, 0x0e, 0x0a, 0x0a, 0x50, 0x6f, 0x73, 0x74, 0x67, 0x72, 0x65, 0x53, 0x51, 0x4c,
	0x10, 0x02, 0x12, 0x09, 0x0a, 0x05, 0x4b, 0x61, 0x66, 0x6b, 0x61, 0x10, 0x03, 0x12, 0x06, 0x0a,
	0x02, 0x53, 0x33, 0x10, 0x04, 0x12, 0x0e, 0x0a, 0x0a, 0x43, 0x6c, 0x69, 0x63, 0x6b, 0x48, 0x6f,
	0x75, 0x73, 0x65, 0x10, 0x05, 0x12, 0x09, 0x0a, 0x05, 0x48, 0x42, 0x61, 0x73, 0x65, 0x10, 0x06,
	0x12, 0x07, 0x0a, 0x03, 0x46, 0x74, 0x70, 0x10, 0x07, 0x12, 0x08, 0x0a, 0x04, 0x48, 0x44, 0x46,
	0x53, 0x10, 0x08, 0x22, 0xb6, 0x04, 0x0a, 0x14, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72,
	0x63, 0x65, 0x43, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x12, 0x2e, 0x0a, 0x08,
	0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13,
	0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77,
	0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61, 0x63, 0x65, 0x49, 0x64, 0x12, 0x30, 0x0a, 0x09,
	0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x42,
	0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04,
	0x73, 0x6f, 0x6d, 0x2d, 0x52, 0x08, 0x73, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x49, 0x64, 0x12, 0x32,
	0x0a, 0x0a, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5f, 0x69, 0x64, 0x18, 0x03, 0x20, 0x01,
	0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0, 0x01, 0x14,
	0xca, 0x02, 0x04, 0x6e, 0x65, 0x74, 0x2d, 0x52, 0x09, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x49, 0x64, 0x12, 0x49, 0x0a, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x04, 0x20, 0x01,
	0x28, 0x0e, 0x32, 0x22, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53,
	0x6f, 0x75, 0x72, 0x63, 0x65, 0x43, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e,
	0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01,
	0x04, 0x30, 0x01, 0x58, 0x01, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x49, 0x0a,
	0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x22, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x43, 0x6f, 0x6e, 0x6e, 0x65, 0x63, 0x74, 0x69, 0x6f, 0x6e, 0x2e, 0x52, 0x65, 0x73, 0x75, 0x6c,
	0x74, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda, 0x01, 0x04, 0x30, 0x00, 0x58, 0x01,
	0x52, 0x06, 0x72, 0x65, 0x73, 0x75, 0x6c, 0x74, 0x12, 0x18, 0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73,
	0x61, 0x67, 0x65, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61,
	0x67, 0x65, 0x12, 0x25, 0x0a, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x07, 0x20,
	0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00,
	0x52, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x12, 0x16, 0x0a, 0x06, 0x65, 0x6c, 0x61,
	0x70, 0x73, 0x65, 0x18, 0x08, 0x20, 0x01, 0x28, 0x03, 0x52, 0x06, 0x65, 0x6c, 0x61, 0x70, 0x73,
	0x65, 0x12, 0x31, 0x0a, 0x0c, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x5f, 0x69, 0x6e, 0x66,
	0x6f, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x0e, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x4e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b, 0x52, 0x0b, 0x6e, 0x65, 0x74, 0x77, 0x6f, 0x72, 0x6b,
	0x49, 0x6e, 0x66, 0x6f, 0x22, 0x33, 0x0a, 0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x0f,
	0x0a, 0x0b, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12,
	0x0b, 0x0a, 0x07, 0x44, 0x65, 0x6c, 0x65, 0x74, 0x65, 0x64, 0x10, 0x01, 0x12, 0x0b, 0x0a, 0x07,
	0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x22, 0x31, 0x0a, 0x06, 0x52, 0x65, 0x73,
	0x75, 0x6c, 0x74, 0x12, 0x0e, 0x0a, 0x0a, 0x53, 0x74, 0x61, 0x74, 0x65, 0x55, 0x6e, 0x73, 0x65,
	0x74, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x75, 0x63, 0x63, 0x65, 0x73, 0x73, 0x10, 0x01,
	0x12, 0x0a, 0x0a, 0x06, 0x46, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x10, 0x02, 0x22, 0x24, 0x0a, 0x0e,
	0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x4b, 0x69, 0x6e, 0x64, 0x12, 0x12,
	0x0a, 0x04, 0x4e, 0x61, 0x6d, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x4e, 0x61,
	0x6d, 0x65, 0x42, 0x6c, 0x0a, 0x22, 0x63, 0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d,
	0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73,
	0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x42, 0x11, 0x50, 0x42, 0x4d, 0x6f, 0x64, 0x65,
	0x6c, 0x44, 0x61, 0x74, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65, 0x50, 0x00, 0x5a, 0x31, 0x67,
	0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f,
	0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78,
	0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c,
	0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_datasource_proto_rawDescOnce sync.Once
	file_proto_types_model_datasource_proto_rawDescData = file_proto_types_model_datasource_proto_rawDesc
)

func file_proto_types_model_datasource_proto_rawDescGZIP() []byte {
	file_proto_types_model_datasource_proto_rawDescOnce.Do(func() {
		file_proto_types_model_datasource_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_datasource_proto_rawDescData)
	})
	return file_proto_types_model_datasource_proto_rawDescData
}

var file_proto_types_model_datasource_proto_enumTypes = make([]protoimpl.EnumInfo, 4)
var file_proto_types_model_datasource_proto_msgTypes = make([]protoimpl.MessageInfo, 4)
var file_proto_types_model_datasource_proto_goTypes = []interface{}{
	(DataSource_Status)(0),             // 0: model.DataSource.Status
	(DataSource_Type)(0),               // 1: model.DataSource.Type
	(DataSourceConnection_Status)(0),   // 2: model.DataSourceConnection.Status
	(DataSourceConnection_Result)(0),   // 3: model.DataSourceConnection.Result
	(*DataSource)(nil),                 // 4: model.DataSource
	(*DataSourceConnection)(nil),       // 5: model.DataSourceConnection
	(*DataSourceKind)(nil),             // 6: model.DataSourceKind
	(*DataSource_URL)(nil),             // 7: model.DataSource.URL
	(*Network)(nil),                    // 8: model.Network
	(*pbdatasource.MySQLURL)(nil),      // 9: datasource.MySQLURL
	(*pbdatasource.PostgreSQLURL)(nil), // 10: datasource.PostgreSQLURL
	(*pbdatasource.KafkaURL)(nil),      // 11: datasource.KafkaURL
	(*pbdatasource.S3URL)(nil),         // 12: datasource.S3URL
	(*pbdatasource.ClickHouseURL)(nil), // 13: datasource.ClickHouseURL
	(*pbdatasource.HBaseURL)(nil),      // 14: datasource.HBaseURL
	(*pbdatasource.FtpURL)(nil),        // 15: datasource.FtpURL
	(*pbdatasource.HDFSURL)(nil),       // 16: datasource.HDFSURL
}
var file_proto_types_model_datasource_proto_depIdxs = []int32{
	1,  // 0: model.DataSource.type:type_name -> model.DataSource.Type
	7,  // 1: model.DataSource.url:type_name -> model.DataSource.URL
	0,  // 2: model.DataSource.status:type_name -> model.DataSource.Status
	5,  // 3: model.DataSource.last_connection:type_name -> model.DataSourceConnection
	2,  // 4: model.DataSourceConnection.status:type_name -> model.DataSourceConnection.Status
	3,  // 5: model.DataSourceConnection.result:type_name -> model.DataSourceConnection.Result
	8,  // 6: model.DataSourceConnection.network_info:type_name -> model.Network
	1,  // 7: model.DataSource.URL.type:type_name -> model.DataSource.Type
	9,  // 8: model.DataSource.URL.mysql:type_name -> datasource.MySQLURL
	10, // 9: model.DataSource.URL.postgresql:type_name -> datasource.PostgreSQLURL
	11, // 10: model.DataSource.URL.kafka:type_name -> datasource.KafkaURL
	12, // 11: model.DataSource.URL.s3:type_name -> datasource.S3URL
	13, // 12: model.DataSource.URL.clickhouse:type_name -> datasource.ClickHouseURL
	14, // 13: model.DataSource.URL.hbase:type_name -> datasource.HBaseURL
	15, // 14: model.DataSource.URL.ftp:type_name -> datasource.FtpURL
	16, // 15: model.DataSource.URL.hdfs:type_name -> datasource.HDFSURL
	16, // [16:16] is the sub-list for method output_type
	16, // [16:16] is the sub-list for method input_type
	16, // [16:16] is the sub-list for extension type_name
	16, // [16:16] is the sub-list for extension extendee
	0,  // [0:16] is the sub-list for field type_name
}

func init() { file_proto_types_model_datasource_proto_init() }
func file_proto_types_model_datasource_proto_init() {
	if File_proto_types_model_datasource_proto != nil {
		return
	}
	file_proto_types_model_network_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_datasource_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DataSource); i {
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
		file_proto_types_model_datasource_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DataSourceConnection); i {
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
		file_proto_types_model_datasource_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DataSourceKind); i {
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
		file_proto_types_model_datasource_proto_msgTypes[3].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*DataSource_URL); i {
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
			RawDescriptor: file_proto_types_model_datasource_proto_rawDesc,
			NumEnums:      4,
			NumMessages:   4,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_datasource_proto_goTypes,
		DependencyIndexes: file_proto_types_model_datasource_proto_depIdxs,
		EnumInfos:         file_proto_types_model_datasource_proto_enumTypes,
		MessageInfos:      file_proto_types_model_datasource_proto_msgTypes,
	}.Build()
	File_proto_types_model_datasource_proto = out.File
	file_proto_types_model_datasource_proto_rawDesc = nil
	file_proto_types_model_datasource_proto_goTypes = nil
	file_proto_types_model_datasource_proto_depIdxs = nil
}
