// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/syncjob/kafka.proto

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

type KafkaSource struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	Column []*Column `protobuf:"bytes,1,rep,name=column,proto3" json:"column"`
	// topic
	Topic string `protobuf:"bytes,2,opt,name=topic,proto3" json:"topic"`
	// mode
	Mode string `protobuf:"bytes,3,opt,name=mode,proto3" json:"mode"`
	// timestamp
	Timestamp int64 `protobuf:"varint,4,opt,name=timestamp,proto3" json:"timestamp"`
	// offset
	Offset string `protobuf:"bytes,5,opt,name=offset,proto3" json:"offset"`
	// consumer group_id
	GroupId string `protobuf:"bytes,6,opt,name=group_id,json=groupId,proto3" json:"group_id"`
	// encoding
	Encoding string `protobuf:"bytes,7,opt,name=encoding,proto3" json:"encoding"`
	// codec
	Codec string `protobuf:"bytes,8,opt,name=codec,proto3" json:"codec"`
	// kafka consumer settings
	ConsumerSettings *ConsumerSettings `protobuf:"bytes,9,opt,name=consumer_settings,json=consumerSettings,proto3" json:"consumer_settings"`
}

func (x *KafkaSource) Reset() {
	*x = KafkaSource{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_kafka_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *KafkaSource) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*KafkaSource) ProtoMessage() {}

func (x *KafkaSource) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_kafka_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use KafkaSource.ProtoReflect.Descriptor instead.
func (*KafkaSource) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_kafka_proto_rawDescGZIP(), []int{0}
}

func (x *KafkaSource) GetColumn() []*Column {
	if x != nil {
		return x.Column
	}
	return nil
}

func (x *KafkaSource) GetTopic() string {
	if x != nil {
		return x.Topic
	}
	return ""
}

func (x *KafkaSource) GetMode() string {
	if x != nil {
		return x.Mode
	}
	return ""
}

func (x *KafkaSource) GetTimestamp() int64 {
	if x != nil {
		return x.Timestamp
	}
	return 0
}

func (x *KafkaSource) GetOffset() string {
	if x != nil {
		return x.Offset
	}
	return ""
}

func (x *KafkaSource) GetGroupId() string {
	if x != nil {
		return x.GroupId
	}
	return ""
}

func (x *KafkaSource) GetEncoding() string {
	if x != nil {
		return x.Encoding
	}
	return ""
}

func (x *KafkaSource) GetCodec() string {
	if x != nil {
		return x.Codec
	}
	return ""
}

func (x *KafkaSource) GetConsumerSettings() *ConsumerSettings {
	if x != nil {
		return x.ConsumerSettings
	}
	return nil
}

type ConsumerSettings struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// auto commit position enable
	AutoCommitEnable string `protobuf:"bytes,1,opt,name=auto_commit_enable,json=autoCommitEnable,proto3" json:"auto_commit_enable"`
}

func (x *ConsumerSettings) Reset() {
	*x = ConsumerSettings{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_kafka_proto_msgTypes[1]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *ConsumerSettings) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*ConsumerSettings) ProtoMessage() {}

func (x *ConsumerSettings) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_kafka_proto_msgTypes[1]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use ConsumerSettings.ProtoReflect.Descriptor instead.
func (*ConsumerSettings) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_kafka_proto_rawDescGZIP(), []int{1}
}

func (x *ConsumerSettings) GetAutoCommitEnable() string {
	if x != nil {
		return x.AutoCommitEnable
	}
	return ""
}

type KafkaTarget struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// kafka tableFields
	TableFields []*Column `protobuf:"bytes,1,rep,name=tableFields,proto3" json:"tableFields"`
	// kafka topic
	Topic string `protobuf:"bytes,2,opt,name=topic,proto3" json:"topic"`
	// kafka consumer settings
	ConsumerSettings *ConsumerSettings `protobuf:"bytes,3,opt,name=consumer_settings,json=consumerSettings,proto3" json:"consumer_settings"`
}

func (x *KafkaTarget) Reset() {
	*x = KafkaTarget{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_syncjob_kafka_proto_msgTypes[2]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *KafkaTarget) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*KafkaTarget) ProtoMessage() {}

func (x *KafkaTarget) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_syncjob_kafka_proto_msgTypes[2]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use KafkaTarget.ProtoReflect.Descriptor instead.
func (*KafkaTarget) Descriptor() ([]byte, []int) {
	return file_proto_types_model_syncjob_kafka_proto_rawDescGZIP(), []int{2}
}

func (x *KafkaTarget) GetTableFields() []*Column {
	if x != nil {
		return x.TableFields
	}
	return nil
}

func (x *KafkaTarget) GetTopic() string {
	if x != nil {
		return x.Topic
	}
	return ""
}

func (x *KafkaTarget) GetConsumerSettings() *ConsumerSettings {
	if x != nil {
		return x.ConsumerSettings
	}
	return nil
}

var File_proto_types_model_syncjob_kafka_proto protoreflect.FileDescriptor

var file_proto_types_model_syncjob_kafka_proto_rawDesc = []byte{
	0x0a, 0x25, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x2f, 0x6b, 0x61, 0x66, 0x6b,
	0x61, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x1a, 0x2f, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f,
	0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67,
	0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x67, 0x6f, 0x73, 0x71, 0x6c, 0x2e, 0x70,
	0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x32, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75,
	0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x64, 0x65, 0x66, 0x61, 0x75, 0x6c,
	0x74, 0x73, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a, 0x26, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f,
	0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63,
	0x6a, 0x6f, 0x62, 0x2f, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x22, 0xa7, 0x02, 0x0a, 0x0b, 0x4b, 0x61, 0x66, 0x6b, 0x61, 0x53, 0x6f, 0x75, 0x72, 0x63, 0x65,
	0x12, 0x25, 0x0a, 0x06, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x18, 0x01, 0x20, 0x03, 0x28, 0x0b,
	0x32, 0x0d, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x52,
	0x06, 0x63, 0x6f, 0x6c, 0x75, 0x6d, 0x6e, 0x12, 0x14, 0x0a, 0x05, 0x74, 0x6f, 0x70, 0x69, 0x63,
	0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74, 0x6f, 0x70, 0x69, 0x63, 0x12, 0x12, 0x0a,
	0x04, 0x6d, 0x6f, 0x64, 0x65, 0x18, 0x03, 0x20, 0x01, 0x28, 0x09, 0x52, 0x04, 0x6d, 0x6f, 0x64,
	0x65, 0x12, 0x1c, 0x0a, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x03, 0x52, 0x09, 0x74, 0x69, 0x6d, 0x65, 0x73, 0x74, 0x61, 0x6d, 0x70, 0x12,
	0x16, 0x0a, 0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x18, 0x05, 0x20, 0x01, 0x28, 0x09, 0x52,
	0x06, 0x6f, 0x66, 0x66, 0x73, 0x65, 0x74, 0x12, 0x19, 0x0a, 0x08, 0x67, 0x72, 0x6f, 0x75, 0x70,
	0x5f, 0x69, 0x64, 0x18, 0x06, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x67, 0x72, 0x6f, 0x75, 0x70,
	0x49, 0x64, 0x12, 0x1a, 0x0a, 0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x18, 0x07,
	0x20, 0x01, 0x28, 0x09, 0x52, 0x08, 0x65, 0x6e, 0x63, 0x6f, 0x64, 0x69, 0x6e, 0x67, 0x12, 0x14,
	0x0a, 0x05, 0x63, 0x6f, 0x64, 0x65, 0x63, 0x18, 0x08, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x63,
	0x6f, 0x64, 0x65, 0x63, 0x12, 0x44, 0x0a, 0x11, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72,
	0x5f, 0x73, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x18, 0x09, 0x20, 0x01, 0x28, 0x0b, 0x32,
	0x17, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x43, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72,
	0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x52, 0x10, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d,
	0x65, 0x72, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x22, 0x40, 0x0a, 0x10, 0x43, 0x6f,
	0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x12, 0x2c,
	0x0a, 0x12, 0x61, 0x75, 0x74, 0x6f, 0x5f, 0x63, 0x6f, 0x6d, 0x6d, 0x69, 0x74, 0x5f, 0x65, 0x6e,
	0x61, 0x62, 0x6c, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x52, 0x10, 0x61, 0x75, 0x74, 0x6f,
	0x43, 0x6f, 0x6d, 0x6d, 0x69, 0x74, 0x45, 0x6e, 0x61, 0x62, 0x6c, 0x65, 0x22, 0x9a, 0x01, 0x0a,
	0x0b, 0x4b, 0x61, 0x66, 0x6b, 0x61, 0x54, 0x61, 0x72, 0x67, 0x65, 0x74, 0x12, 0x2f, 0x0a, 0x0b,
	0x74, 0x61, 0x62, 0x6c, 0x65, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x18, 0x01, 0x20, 0x03, 0x28,
	0x0b, 0x32, 0x0d, 0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x43, 0x6f, 0x6c, 0x75, 0x6d, 0x6e,
	0x52, 0x0b, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x46, 0x69, 0x65, 0x6c, 0x64, 0x73, 0x12, 0x14, 0x0a,
	0x05, 0x74, 0x6f, 0x70, 0x69, 0x63, 0x18, 0x02, 0x20, 0x01, 0x28, 0x09, 0x52, 0x05, 0x74, 0x6f,
	0x70, 0x69, 0x63, 0x12, 0x44, 0x0a, 0x11, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72, 0x5f,
	0x73, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x18, 0x03, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x17,
	0x2e, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x43, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65, 0x72, 0x53,
	0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x52, 0x10, 0x63, 0x6f, 0x6e, 0x73, 0x75, 0x6d, 0x65,
	0x72, 0x53, 0x65, 0x74, 0x74, 0x69, 0x6e, 0x67, 0x73, 0x42, 0x76, 0x0a, 0x2c, 0x63, 0x6f, 0x6d,
	0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72, 0x6f, 0x74,
	0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e,
	0x70, 0x62, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f, 0x62, 0x42, 0x07, 0x50, 0x42, 0x4b, 0x61, 0x66,
	0x6b, 0x61, 0x50, 0x00, 0x5a, 0x3b, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d,
	0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e, 0x63, 0x68, 0x2f, 0x67,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f,
	0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2f, 0x70, 0x62, 0x73, 0x79, 0x6e, 0x63, 0x6a, 0x6f,
	0x62, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_syncjob_kafka_proto_rawDescOnce sync.Once
	file_proto_types_model_syncjob_kafka_proto_rawDescData = file_proto_types_model_syncjob_kafka_proto_rawDesc
)

func file_proto_types_model_syncjob_kafka_proto_rawDescGZIP() []byte {
	file_proto_types_model_syncjob_kafka_proto_rawDescOnce.Do(func() {
		file_proto_types_model_syncjob_kafka_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_syncjob_kafka_proto_rawDescData)
	})
	return file_proto_types_model_syncjob_kafka_proto_rawDescData
}

var file_proto_types_model_syncjob_kafka_proto_msgTypes = make([]protoimpl.MessageInfo, 3)
var file_proto_types_model_syncjob_kafka_proto_goTypes = []interface{}{
	(*KafkaSource)(nil),      // 0: model.KafkaSource
	(*ConsumerSettings)(nil), // 1: model.ConsumerSettings
	(*KafkaTarget)(nil),      // 2: model.KafkaTarget
	(*Column)(nil),           // 3: model.Column
}
var file_proto_types_model_syncjob_kafka_proto_depIdxs = []int32{
	3, // 0: model.KafkaSource.column:type_name -> model.Column
	1, // 1: model.KafkaSource.consumer_settings:type_name -> model.ConsumerSettings
	3, // 2: model.KafkaTarget.tableFields:type_name -> model.Column
	1, // 3: model.KafkaTarget.consumer_settings:type_name -> model.ConsumerSettings
	4, // [4:4] is the sub-list for method output_type
	4, // [4:4] is the sub-list for method input_type
	4, // [4:4] is the sub-list for extension type_name
	4, // [4:4] is the sub-list for extension extendee
	0, // [0:4] is the sub-list for field type_name
}

func init() { file_proto_types_model_syncjob_kafka_proto_init() }
func file_proto_types_model_syncjob_kafka_proto_init() {
	if File_proto_types_model_syncjob_kafka_proto != nil {
		return
	}
	file_proto_types_model_syncjob_column_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_syncjob_kafka_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*KafkaSource); i {
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
		file_proto_types_model_syncjob_kafka_proto_msgTypes[1].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*ConsumerSettings); i {
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
		file_proto_types_model_syncjob_kafka_proto_msgTypes[2].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*KafkaTarget); i {
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
			RawDescriptor: file_proto_types_model_syncjob_kafka_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   3,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_syncjob_kafka_proto_goTypes,
		DependencyIndexes: file_proto_types_model_syncjob_kafka_proto_depIdxs,
		MessageInfos:      file_proto_types_model_syncjob_kafka_proto_msgTypes,
	}.Build()
	File_proto_types_model_syncjob_kafka_proto = out.File
	file_proto_types_model_syncjob_kafka_proto_rawDesc = nil
	file_proto_types_model_syncjob_kafka_proto_goTypes = nil
	file_proto_types_model_syncjob_kafka_proto_depIdxs = nil
}
