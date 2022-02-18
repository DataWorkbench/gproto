// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.27.1
// 	protoc        v3.19.3
// source: proto/types/model/sync_instance.proto

package pbmodel

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

type SyncInstance_Status int32

const (
	SyncInstance_StatusUnset SyncInstance_Status = 0
	SyncInstance_Deleted     SyncInstance_Status = 1
	SyncInstance_Enabled     SyncInstance_Status = 2
)

// Enum value maps for SyncInstance_Status.
var (
	SyncInstance_Status_name = map[int32]string{
		0: "StatusUnset",
		1: "Deleted",
		2: "Enabled",
	}
	SyncInstance_Status_value = map[string]int32{
		"StatusUnset": 0,
		"Deleted":     1,
		"Enabled":     2,
	}
)

func (x SyncInstance_Status) Enum() *SyncInstance_Status {
	p := new(SyncInstance_Status)
	*p = x
	return p
}

func (x SyncInstance_Status) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (SyncInstance_Status) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_sync_instance_proto_enumTypes[0].Descriptor()
}

func (SyncInstance_Status) Type() protoreflect.EnumType {
	return &file_proto_types_model_sync_instance_proto_enumTypes[0]
}

func (x SyncInstance_Status) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use SyncInstance_Status.Descriptor instead.
func (SyncInstance_Status) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_sync_instance_proto_rawDescGZIP(), []int{0, 0}
}

type SyncInstance_State int32

const (
	SyncInstance_StateUnset SyncInstance_State = 0
	SyncInstance_Pending    SyncInstance_State = 1
	SyncInstance_Running    SyncInstance_State = 2
	SyncInstance_Retrying   SyncInstance_State = 3
	SyncInstance_Suspended  SyncInstance_State = 4
	SyncInstance_Terminated SyncInstance_State = 5
	SyncInstance_Succeed    SyncInstance_State = 6
	SyncInstance_Timeout    SyncInstance_State = 7
	SyncInstance_Failed     SyncInstance_State = 8
)

// Enum value maps for SyncInstance_State.
var (
	SyncInstance_State_name = map[int32]string{
		0: "StateUnset",
		1: "Pending",
		2: "Running",
		3: "Retrying",
		4: "Suspended",
		5: "Terminated",
		6: "Succeed",
		7: "Timeout",
		8: "Failed",
	}
	SyncInstance_State_value = map[string]int32{
		"StateUnset": 0,
		"Pending":    1,
		"Running":    2,
		"Retrying":   3,
		"Suspended":  4,
		"Terminated": 5,
		"Succeed":    6,
		"Timeout":    7,
		"Failed":     8,
	}
)

func (x SyncInstance_State) Enum() *SyncInstance_State {
	p := new(SyncInstance_State)
	*p = x
	return p
}

func (x SyncInstance_State) String() string {
	return protoimpl.X.EnumStringOf(x.Descriptor(), protoreflect.EnumNumber(x))
}

func (SyncInstance_State) Descriptor() protoreflect.EnumDescriptor {
	return file_proto_types_model_sync_instance_proto_enumTypes[1].Descriptor()
}

func (SyncInstance_State) Type() protoreflect.EnumType {
	return &file_proto_types_model_sync_instance_proto_enumTypes[1]
}

func (x SyncInstance_State) Number() protoreflect.EnumNumber {
	return protoreflect.EnumNumber(x)
}

// Deprecated: Use SyncInstance_State.Descriptor instead.
func (SyncInstance_State) EnumDescriptor() ([]byte, []int) {
	return file_proto_types_model_sync_instance_proto_rawDescGZIP(), []int{0, 1}
}

// The instance info of stream job.
type SyncInstance struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Workspace ID it belongs to.
	SpaceId string `protobuf:"bytes,1,opt,name=space_id,json=spaceId,proto3" json:"space_id" gorm:"column:space_id;"`
	// Job ID it belongs to.
	JobId string `protobuf:"bytes,2,opt,name=job_id,json=jobId,proto3" json:"job_id" gorm:"column:job_id;"`
	// The release version.
	Version string `protobuf:"bytes,3,opt,name=version,proto3" json:"version"`
	// Job instance ID, unique.
	Id string `protobuf:"bytes,4,opt,name=id,proto3" json:"id" gorm:"column:id;primarykey;"`
	// The instance state.
	State SyncInstance_State `protobuf:"varint,5,opt,name=state,proto3,enum=model.SyncInstance_State" json:"state" gorm:"column:state;"`
	// Release status, 1 => "Deleted", 2 => "Enabled "
	Status SyncInstance_Status `protobuf:"varint,6,opt,name=status,proto3,enum=model.SyncInstance_Status" json:"status" gorm:"column:status;"`
	// Message is the error message when task execute failed.
	Message string `protobuf:"bytes,7,opt,name=message,proto3" json:"message" gorm:"column:message;"`
	// NoteId is the zeppelin notebook id
	NoteId string `protobuf:"bytes,10,opt,name=note_id,json=noteId,proto3" json:"note_id" gorm:"column:note_id;"`
	// ParagraphId is the zeppelin paragraph id where in notebook.
	ParagraphId string `protobuf:"bytes,11,opt,name=paragraph_id,json=paragraphId,proto3" json:"paragraph_id" gorm:"column:paragraph_id;"`
	// FlinkId is the job id in flink.
	FlinkId string `protobuf:"bytes,12,opt,name=flink_id,json=flinkId,proto3" json:"flink_id" gorm:"column:flink_id;"`
	Created int64  `protobuf:"varint,8,opt,name=created,proto3" json:"created" gorm:"column:created;autoCreateTime;"`
	// Timestamp of update time
	Updated int64 `protobuf:"varint,9,opt,name=updated,proto3" json:"updated" gorm:"column:updated;autoUpdateTime;"`
}

func (x *SyncInstance) Reset() {
	*x = SyncInstance{}
	if protoimpl.UnsafeEnabled {
		mi := &file_proto_types_model_sync_instance_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *SyncInstance) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*SyncInstance) ProtoMessage() {}

func (x *SyncInstance) ProtoReflect() protoreflect.Message {
	mi := &file_proto_types_model_sync_instance_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use SyncInstance.ProtoReflect.Descriptor instead.
func (*SyncInstance) Descriptor() ([]byte, []int) {
	return file_proto_types_model_sync_instance_proto_rawDescGZIP(), []int{0}
}

func (x *SyncInstance) GetSpaceId() string {
	if x != nil {
		return x.SpaceId
	}
	return ""
}

func (x *SyncInstance) GetJobId() string {
	if x != nil {
		return x.JobId
	}
	return ""
}

func (x *SyncInstance) GetVersion() string {
	if x != nil {
		return x.Version
	}
	return ""
}

func (x *SyncInstance) GetId() string {
	if x != nil {
		return x.Id
	}
	return ""
}

func (x *SyncInstance) GetState() SyncInstance_State {
	if x != nil {
		return x.State
	}
	return SyncInstance_StateUnset
}

func (x *SyncInstance) GetStatus() SyncInstance_Status {
	if x != nil {
		return x.Status
	}
	return SyncInstance_StatusUnset
}

func (x *SyncInstance) GetMessage() string {
	if x != nil {
		return x.Message
	}
	return ""
}

func (x *SyncInstance) GetNoteId() string {
	if x != nil {
		return x.NoteId
	}
	return ""
}

func (x *SyncInstance) GetParagraphId() string {
	if x != nil {
		return x.ParagraphId
	}
	return ""
}

func (x *SyncInstance) GetFlinkId() string {
	if x != nil {
		return x.FlinkId
	}
	return ""
}

func (x *SyncInstance) GetCreated() int64 {
	if x != nil {
		return x.Created
	}
	return 0
}

func (x *SyncInstance) GetUpdated() int64 {
	if x != nil {
		return x.Updated
	}
	return 0
}

var File_proto_types_model_sync_instance_proto protoreflect.FileDescriptor

var file_proto_types_model_sync_instance_proto_rawDesc = []byte{
	0x0a, 0x25, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2f, 0x6d, 0x6f,
	0x64, 0x65, 0x6c, 0x2f, 0x73, 0x79, 0x6e, 0x63, 0x5f, 0x69, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63,
	0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x12, 0x05, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x1a, 0x33,
	0x67, 0x69, 0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x79, 0x75, 0x33, 0x31, 0x2f,
	0x70, 0x72, 0x6f, 0x74, 0x6f, 0x63, 0x2d, 0x70, 0x6c, 0x75, 0x67, 0x69, 0x6e, 0x2f, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2f, 0x76, 0x61, 0x6c, 0x69, 0x64, 0x61, 0x74, 0x6f, 0x72, 0x2e, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x22, 0xb5, 0x05, 0x0a, 0x0c, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74,
	0x61, 0x6e, 0x63, 0x65, 0x12, 0x2e, 0x0a, 0x08, 0x73, 0x70, 0x61, 0x63, 0x65, 0x5f, 0x69, 0x64,
	0x18, 0x01, 0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01,
	0x0a, 0xf0, 0x01, 0x14, 0xca, 0x02, 0x04, 0x77, 0x6b, 0x73, 0x2d, 0x52, 0x07, 0x73, 0x70, 0x61,
	0x63, 0x65, 0x49, 0x64, 0x12, 0x2a, 0x0a, 0x06, 0x6a, 0x6f, 0x62, 0x5f, 0x69, 0x64, 0x18, 0x02,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0,
	0x01, 0x14, 0xca, 0x02, 0x04, 0x73, 0x74, 0x6a, 0x2d, 0x52, 0x05, 0x6a, 0x6f, 0x62, 0x49, 0x64,
	0x12, 0x26, 0x0a, 0x07, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x18, 0x03, 0x20, 0x01, 0x28,
	0x09, 0x42, 0x0c, 0xe2, 0xdf, 0x1f, 0x08, 0x12, 0x06, 0xc2, 0x01, 0x03, 0xf0, 0x01, 0x10, 0x52,
	0x07, 0x76, 0x65, 0x72, 0x73, 0x69, 0x6f, 0x6e, 0x12, 0x23, 0x0a, 0x02, 0x69, 0x64, 0x18, 0x04,
	0x20, 0x01, 0x28, 0x09, 0x42, 0x13, 0xe2, 0xdf, 0x1f, 0x0f, 0x12, 0x0d, 0xc2, 0x01, 0x0a, 0xf0,
	0x01, 0x14, 0xca, 0x02, 0x04, 0x73, 0x74, 0x69, 0x2d, 0x52, 0x02, 0x69, 0x64, 0x12, 0x3e, 0x0a,
	0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x18, 0x05, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x19, 0x2e, 0x6d,
	0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e, 0x63,
	0x65, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x65, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12, 0x07, 0xda,
	0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x05, 0x73, 0x74, 0x61, 0x74, 0x65, 0x12, 0x41, 0x0a,
	0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73, 0x18, 0x06, 0x20, 0x01, 0x28, 0x0e, 0x32, 0x1a, 0x2e,
	0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x2e, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e, 0x73, 0x74, 0x61, 0x6e,
	0x63, 0x65, 0x2e, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x42, 0x0d, 0xe2, 0xdf, 0x1f, 0x09, 0x12,
	0x07, 0xda, 0x01, 0x04, 0x30, 0x00, 0x58, 0x01, 0x52, 0x06, 0x73, 0x74, 0x61, 0x74, 0x75, 0x73,
	0x12, 0x18, 0x0a, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x18, 0x07, 0x20, 0x01, 0x28,
	0x09, 0x52, 0x07, 0x6d, 0x65, 0x73, 0x73, 0x61, 0x67, 0x65, 0x12, 0x17, 0x0a, 0x07, 0x6e, 0x6f,
	0x74, 0x65, 0x5f, 0x69, 0x64, 0x18, 0x0a, 0x20, 0x01, 0x28, 0x09, 0x52, 0x06, 0x6e, 0x6f, 0x74,
	0x65, 0x49, 0x64, 0x12, 0x21, 0x0a, 0x0c, 0x70, 0x61, 0x72, 0x61, 0x67, 0x72, 0x61, 0x70, 0x68,
	0x5f, 0x69, 0x64, 0x18, 0x0b, 0x20, 0x01, 0x28, 0x09, 0x52, 0x0b, 0x70, 0x61, 0x72, 0x61, 0x67,
	0x72, 0x61, 0x70, 0x68, 0x49, 0x64, 0x12, 0x19, 0x0a, 0x08, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x5f,
	0x69, 0x64, 0x18, 0x0c, 0x20, 0x01, 0x28, 0x09, 0x52, 0x07, 0x66, 0x6c, 0x69, 0x6e, 0x6b, 0x49,
	0x64, 0x12, 0x25, 0x0a, 0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x18, 0x08, 0x20, 0x01,
	0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12, 0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52,
	0x07, 0x63, 0x72, 0x65, 0x61, 0x74, 0x65, 0x64, 0x12, 0x25, 0x0a, 0x07, 0x75, 0x70, 0x64, 0x61,
	0x74, 0x65, 0x64, 0x18, 0x09, 0x20, 0x01, 0x28, 0x03, 0x42, 0x0b, 0xe2, 0xdf, 0x1f, 0x07, 0x12,
	0x05, 0xb2, 0x01, 0x02, 0x30, 0x00, 0x52, 0x07, 0x75, 0x70, 0x64, 0x61, 0x74, 0x65, 0x64, 0x22,
	0x33, 0x0a, 0x06, 0x53, 0x74, 0x61, 0x74, 0x75, 0x73, 0x12, 0x0f, 0x0a, 0x0b, 0x53, 0x74, 0x61,
	0x74, 0x75, 0x73, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x0b, 0x0a, 0x07, 0x44, 0x65,
	0x6c, 0x65, 0x74, 0x65, 0x64, 0x10, 0x01, 0x12, 0x0b, 0x0a, 0x07, 0x45, 0x6e, 0x61, 0x62, 0x6c,
	0x65, 0x64, 0x10, 0x02, 0x22, 0x84, 0x01, 0x0a, 0x05, 0x53, 0x74, 0x61, 0x74, 0x65, 0x12, 0x0e,
	0x0a, 0x0a, 0x53, 0x74, 0x61, 0x74, 0x65, 0x55, 0x6e, 0x73, 0x65, 0x74, 0x10, 0x00, 0x12, 0x0b,
	0x0a, 0x07, 0x50, 0x65, 0x6e, 0x64, 0x69, 0x6e, 0x67, 0x10, 0x01, 0x12, 0x0b, 0x0a, 0x07, 0x52,
	0x75, 0x6e, 0x6e, 0x69, 0x6e, 0x67, 0x10, 0x02, 0x12, 0x0c, 0x0a, 0x08, 0x52, 0x65, 0x74, 0x72,
	0x79, 0x69, 0x6e, 0x67, 0x10, 0x03, 0x12, 0x0d, 0x0a, 0x09, 0x53, 0x75, 0x73, 0x70, 0x65, 0x6e,
	0x64, 0x65, 0x64, 0x10, 0x04, 0x12, 0x0e, 0x0a, 0x0a, 0x54, 0x65, 0x72, 0x6d, 0x69, 0x6e, 0x61,
	0x74, 0x65, 0x64, 0x10, 0x05, 0x12, 0x0b, 0x0a, 0x07, 0x53, 0x75, 0x63, 0x63, 0x65, 0x65, 0x64,
	0x10, 0x06, 0x12, 0x0b, 0x0a, 0x07, 0x54, 0x69, 0x6d, 0x65, 0x6f, 0x75, 0x74, 0x10, 0x07, 0x12,
	0x0a, 0x0a, 0x06, 0x46, 0x61, 0x69, 0x6c, 0x65, 0x64, 0x10, 0x08, 0x42, 0x6e, 0x0a, 0x22, 0x63,
	0x6f, 0x6d, 0x2e, 0x64, 0x61, 0x74, 0x61, 0x6f, 0x6d, 0x6e, 0x69, 0x73, 0x2e, 0x67, 0x70, 0x72,
	0x6f, 0x74, 0x6f, 0x2e, 0x74, 0x79, 0x70, 0x65, 0x73, 0x2e, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65,
	0x6c, 0x42, 0x13, 0x50, 0x42, 0x4d, 0x6f, 0x64, 0x65, 0x6c, 0x53, 0x79, 0x6e, 0x63, 0x49, 0x6e,
	0x73, 0x74, 0x61, 0x6e, 0x63, 0x65, 0x50, 0x00, 0x5a, 0x31, 0x67, 0x69, 0x74, 0x68, 0x75, 0x62,
	0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x44, 0x61, 0x74, 0x61, 0x57, 0x6f, 0x72, 0x6b, 0x62, 0x65, 0x6e,
	0x63, 0x68, 0x2f, 0x67, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x2f, 0x78, 0x67, 0x6f, 0x2f, 0x74, 0x79,
	0x70, 0x65, 0x73, 0x2f, 0x70, 0x62, 0x6d, 0x6f, 0x64, 0x65, 0x6c, 0x62, 0x06, 0x70, 0x72, 0x6f,
	0x74, 0x6f, 0x33,
}

var (
	file_proto_types_model_sync_instance_proto_rawDescOnce sync.Once
	file_proto_types_model_sync_instance_proto_rawDescData = file_proto_types_model_sync_instance_proto_rawDesc
)

func file_proto_types_model_sync_instance_proto_rawDescGZIP() []byte {
	file_proto_types_model_sync_instance_proto_rawDescOnce.Do(func() {
		file_proto_types_model_sync_instance_proto_rawDescData = protoimpl.X.CompressGZIP(file_proto_types_model_sync_instance_proto_rawDescData)
	})
	return file_proto_types_model_sync_instance_proto_rawDescData
}

var file_proto_types_model_sync_instance_proto_enumTypes = make([]protoimpl.EnumInfo, 2)
var file_proto_types_model_sync_instance_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_proto_types_model_sync_instance_proto_goTypes = []interface{}{
	(SyncInstance_Status)(0), // 0: model.SyncInstance.Status
	(SyncInstance_State)(0),  // 1: model.SyncInstance.State
	(*SyncInstance)(nil),     // 2: model.SyncInstance
}
var file_proto_types_model_sync_instance_proto_depIdxs = []int32{
	1, // 0: model.SyncInstance.state:type_name -> model.SyncInstance.State
	0, // 1: model.SyncInstance.status:type_name -> model.SyncInstance.Status
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_proto_types_model_sync_instance_proto_init() }
func file_proto_types_model_sync_instance_proto_init() {
	if File_proto_types_model_sync_instance_proto != nil {
		return
	}
	if !protoimpl.UnsafeEnabled {
		file_proto_types_model_sync_instance_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*SyncInstance); i {
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
			RawDescriptor: file_proto_types_model_sync_instance_proto_rawDesc,
			NumEnums:      2,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_proto_types_model_sync_instance_proto_goTypes,
		DependencyIndexes: file_proto_types_model_sync_instance_proto_depIdxs,
		EnumInfos:         file_proto_types_model_sync_instance_proto_enumTypes,
		MessageInfos:      file_proto_types_model_sync_instance_proto_msgTypes,
	}.Build()
	File_proto_types_model_sync_instance_proto = out.File
	file_proto_types_model_sync_instance_proto_rawDesc = nil
	file_proto_types_model_sync_instance_proto_goTypes = nil
	file_proto_types_model_sync_instance_proto_depIdxs = nil
}
