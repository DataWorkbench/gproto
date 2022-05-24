# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/flink_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from github.com.yu31.protoc_plugin.proto import defaults_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2
from proto.types.model import cluster_pb2 as proto_dot_types_dot_model_dot_cluster__pb2
from proto.types.model.flink import flink_config_pb2 as proto_dot_types_dot_model_dot_flink_dot_flink__config__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/flink_manage.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\024PBRequestFlinkManageP\000Z3github.com/DataWorkbench/gproto/xgo/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&proto/types/request/flink_manage.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\x32github.com/yu31/protoc-plugin/proto/defaults.proto\x1a\x1fproto/types/model/cluster.proto\x1a*proto/types/model/flink/flink_config.proto\"b\n\x17\x44\x65scribeFlinkClusterAPI\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12 \n\ncluster_id\x18\x02 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\xf0\x01\x14\"\xc4\x02\n\x11ListFlinkClusters\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12&\n\x05limit\x18\x02 \x01(\x05\x42\x17\xa2\xa1\x1f\x06\xaa\x06\x03\x31\x30\x30\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x30\x00\x38\x64\x12\x1b\n\x06offset\x18\x03 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12\x38\n\x07sort_by\x18\x04 \x01(\tB\'\xe2\xdf\x1f#\x12!\xc2\x01\x1eJ\x00J\x02idJ\x07\x63reatedJ\x07updatedJ\x04name\x12\x15\n\x07reverse\x18\x05 \x01(\x08\x42\x04\xe2\xdf\x1f\x00\x12\x14\n\x06search\x18\x06 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x37\n\x06status\x18\x07 \x01(\x0e\x32\x1a.model.FlinkCluster.StatusB\x0b\xe2\xdf\x1f\x07\x12\x05\xda\x01\x02X\x01\x12\x12\n\x04name\x18\x08 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x0f\n\x07verbose\x18\t \x01(\x05\"l\n\x13\x44\x65leteFlinkClusters\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12.\n\x0b\x63luster_ids\x18\x02 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04\x63\x66i-\"k\n\x12StartFlinkClusters\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12.\n\x0b\x63luster_ids\x18\x02 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04\x63\x66i-\"j\n\x11StopFlinkClusters\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12.\n\x0b\x63luster_ids\x18\x02 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04\x63\x66i-\"\xd3\x03\n\x12\x43reateFlinkCluster\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12#\n\ncreated_by\x18\x02 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x00\x88\x02\x41\x12 \n\x0bspace_owner\x18\x03 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\x12\x1e\n\x04name\x18\x04 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\x80\x02\x01\x98\x02\x80\x01\x12Q\n\x07version\x18\x05 \x01(\tB@\xe2\xdf\x1f<\x12:\xc2\x01\x37J\x17\x66link-1.12.3-scala_2.11J\x1c\x66link-1.12.3-scala_2.11-q0.9\x12\x1f\n\x08task_num\x18\x06 \x01(\x05\x42\r\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x38\x18@\x01\x12+\n\x06job_cu\x18\x07 \x01(\x02\x42\x1b\xe2\xdf\x1f\x17\x12\x15\xaa\x01\x12\x39\x00\x00\x00\x00\x00\x00 @A\x00\x00\x00\x00\x00\x00\xe0?\x12,\n\x07task_cu\x18\x08 \x01(\x02\x42\x1b\xe2\xdf\x1f\x17\x12\x15\xaa\x01\x12\x39\x00\x00\x00\x00\x00\x00 @A\x00\x00\x00\x00\x00\x00\xe0?\x12\x12\n\nnetwork_id\x18\t \x01(\t\x12(\n\x0chost_aliases\x18\n \x01(\x0b\x32\x12.model.HostAliases\x12\"\n\x06\x63onfig\x18\x0b \x01(\x0b\x32\x12.flink.FlinkConfig\"\x84\x03\n\x12UpdateFlinkCluster\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12 \n\x0bspace_owner\x18\x02 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\x12\'\n\ncluster_id\x18\x03 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04\x63\x66i-\x12\x1e\n\x04name\x18\x04 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\x80\x02\x01\x98\x02\x80\x01\x12\x1f\n\x08task_num\x18\x06 \x01(\x05\x42\r\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x38\x18@\x01\x12+\n\x06job_cu\x18\x07 \x01(\x02\x42\x1b\xe2\xdf\x1f\x17\x12\x15\xaa\x01\x12\x39\x00\x00\x00\x00\x00\x00 @A\x00\x00\x00\x00\x00\x00\xe0?\x12,\n\x07task_cu\x18\x08 \x01(\x02\x42\x1b\xe2\xdf\x1f\x17\x12\x15\xaa\x01\x12\x39\x00\x00\x00\x00\x00\x00 @A\x00\x00\x00\x00\x00\x00\xe0?\x12\x12\n\nnetwork_id\x18\t \x01(\t\x12(\n\x0chost_aliases\x18\n \x01(\x0b\x32\x12.model.HostAliases\x12\"\n\x06\x63onfig\x18\x0b \x01(\x0b\x32\x12.flink.FlinkConfig\"?\n\x14\x44\x65scribeFlinkCluster\x12\'\n\ncluster_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04\x63\x66i-\"\xaa\x01\n#UpdateFlinkClusterStatusByScheduler\x12\'\n\ncluster_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04\x63\x66i-\x12*\n\x06status\x18\x02 \x01(\x0e\x32\x1a.model.FlinkCluster.Status\x12.\n\npre_status\x18\x03 \x01(\x0e\x32\x1a.model.FlinkCluster.Status\"m\n\x1bStopFlinkClusterByScheduler\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\'\n\ncluster_id\x18\x02 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04\x63\x66i-Bs\n$com.dataomnis.gproto.types.pbrequestB\x14PBRequestFlinkManageP\x00Z3github.com/DataWorkbench/gproto/xgo/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_cluster__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_flink_dot_flink__config__pb2.DESCRIPTOR,])




_DESCRIBEFLINKCLUSTERAPI = _descriptor.Descriptor(
  name='DescribeFlinkClusterAPI',
  full_name='request.DescribeFlinkClusterAPI',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DescribeFlinkClusterAPI.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_id', full_name='request.DescribeFlinkClusterAPI.cluster_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\360\001\024', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=233,
  serialized_end=331,
)


_LISTFLINKCLUSTERS = _descriptor.Descriptor(
  name='ListFlinkClusters',
  full_name='request.ListFlinkClusters',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ListFlinkClusters.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.ListFlinkClusters.limit', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\242\241\037\006\252\006\003100\342\337\037\t\022\007\262\001\0040\0008d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.ListFlinkClusters.offset', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sort_by', full_name='request.ListFlinkClusters.sort_by', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037#\022!\302\001\036J\000J\002idJ\007createdJ\007updatedJ\004name', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reverse', full_name='request.ListFlinkClusters.reverse', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search', full_name='request.ListFlinkClusters.search', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='request.ListFlinkClusters.status', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\332\001\002X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='request.ListFlinkClusters.name', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='verbose', full_name='request.ListFlinkClusters.verbose', index=8,
      number=9, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=334,
  serialized_end=658,
)


_DELETEFLINKCLUSTERS = _descriptor.Descriptor(
  name='DeleteFlinkClusters',
  full_name='request.DeleteFlinkClusters',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DeleteFlinkClusters.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_ids', full_name='request.DeleteFlinkClusters.cluster_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004cfi-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=660,
  serialized_end=768,
)


_STARTFLINKCLUSTERS = _descriptor.Descriptor(
  name='StartFlinkClusters',
  full_name='request.StartFlinkClusters',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.StartFlinkClusters.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_ids', full_name='request.StartFlinkClusters.cluster_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004cfi-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=770,
  serialized_end=877,
)


_STOPFLINKCLUSTERS = _descriptor.Descriptor(
  name='StopFlinkClusters',
  full_name='request.StopFlinkClusters',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.StopFlinkClusters.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_ids', full_name='request.StopFlinkClusters.cluster_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004cfi-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=879,
  serialized_end=985,
)


_CREATEFLINKCLUSTER = _descriptor.Descriptor(
  name='CreateFlinkCluster',
  full_name='request.CreateFlinkCluster',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.CreateFlinkCluster.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='created_by', full_name='request.CreateFlinkCluster.created_by', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\000\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_owner', full_name='request.CreateFlinkCluster.space_owner', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\302\001\002\"\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='request.CreateFlinkCluster.name', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\014\022\n\302\001\007\200\002\001\230\002\200\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='request.CreateFlinkCluster.version', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037<\022:\302\0017J\027flink-1.12.3-scala_2.11J\034flink-1.12.3-scala_2.11-q0.9', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='task_num', full_name='request.CreateFlinkCluster.task_num', index=5,
      number=6, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\262\001\0048\030@\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='job_cu', full_name='request.CreateFlinkCluster.job_cu', index=6,
      number=7, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\027\022\025\252\001\0229\000\000\000\000\000\000 @A\000\000\000\000\000\000\340?', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='task_cu', full_name='request.CreateFlinkCluster.task_cu', index=7,
      number=8, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\027\022\025\252\001\0229\000\000\000\000\000\000 @A\000\000\000\000\000\000\340?', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='network_id', full_name='request.CreateFlinkCluster.network_id', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='host_aliases', full_name='request.CreateFlinkCluster.host_aliases', index=9,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='config', full_name='request.CreateFlinkCluster.config', index=10,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=988,
  serialized_end=1455,
)


_UPDATEFLINKCLUSTER = _descriptor.Descriptor(
  name='UpdateFlinkCluster',
  full_name='request.UpdateFlinkCluster',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.UpdateFlinkCluster.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_owner', full_name='request.UpdateFlinkCluster.space_owner', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\302\001\002\"\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_id', full_name='request.UpdateFlinkCluster.cluster_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004cfi-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='request.UpdateFlinkCluster.name', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\014\022\n\302\001\007\200\002\001\230\002\200\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='task_num', full_name='request.UpdateFlinkCluster.task_num', index=4,
      number=6, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\262\001\0048\030@\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='job_cu', full_name='request.UpdateFlinkCluster.job_cu', index=5,
      number=7, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\027\022\025\252\001\0229\000\000\000\000\000\000 @A\000\000\000\000\000\000\340?', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='task_cu', full_name='request.UpdateFlinkCluster.task_cu', index=6,
      number=8, type=2, cpp_type=6, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\027\022\025\252\001\0229\000\000\000\000\000\000 @A\000\000\000\000\000\000\340?', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='network_id', full_name='request.UpdateFlinkCluster.network_id', index=7,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='host_aliases', full_name='request.UpdateFlinkCluster.host_aliases', index=8,
      number=10, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='config', full_name='request.UpdateFlinkCluster.config', index=9,
      number=11, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1458,
  serialized_end=1846,
)


_DESCRIBEFLINKCLUSTER = _descriptor.Descriptor(
  name='DescribeFlinkCluster',
  full_name='request.DescribeFlinkCluster',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster_id', full_name='request.DescribeFlinkCluster.cluster_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004cfi-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1848,
  serialized_end=1911,
)


_UPDATEFLINKCLUSTERSTATUSBYSCHEDULER = _descriptor.Descriptor(
  name='UpdateFlinkClusterStatusByScheduler',
  full_name='request.UpdateFlinkClusterStatusByScheduler',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='cluster_id', full_name='request.UpdateFlinkClusterStatusByScheduler.cluster_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004cfi-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='request.UpdateFlinkClusterStatusByScheduler.status', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='pre_status', full_name='request.UpdateFlinkClusterStatusByScheduler.pre_status', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1914,
  serialized_end=2084,
)


_STOPFLINKCLUSTERBYSCHEDULER = _descriptor.Descriptor(
  name='StopFlinkClusterByScheduler',
  full_name='request.StopFlinkClusterByScheduler',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.StopFlinkClusterByScheduler.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cluster_id', full_name='request.StopFlinkClusterByScheduler.cluster_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004cfi-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=2086,
  serialized_end=2195,
)

_LISTFLINKCLUSTERS.fields_by_name['status'].enum_type = proto_dot_types_dot_model_dot_cluster__pb2._FLINKCLUSTER_STATUS
_CREATEFLINKCLUSTER.fields_by_name['host_aliases'].message_type = proto_dot_types_dot_model_dot_cluster__pb2._HOSTALIASES
_CREATEFLINKCLUSTER.fields_by_name['config'].message_type = proto_dot_types_dot_model_dot_flink_dot_flink__config__pb2._FLINKCONFIG
_UPDATEFLINKCLUSTER.fields_by_name['host_aliases'].message_type = proto_dot_types_dot_model_dot_cluster__pb2._HOSTALIASES
_UPDATEFLINKCLUSTER.fields_by_name['config'].message_type = proto_dot_types_dot_model_dot_flink_dot_flink__config__pb2._FLINKCONFIG
_UPDATEFLINKCLUSTERSTATUSBYSCHEDULER.fields_by_name['status'].enum_type = proto_dot_types_dot_model_dot_cluster__pb2._FLINKCLUSTER_STATUS
_UPDATEFLINKCLUSTERSTATUSBYSCHEDULER.fields_by_name['pre_status'].enum_type = proto_dot_types_dot_model_dot_cluster__pb2._FLINKCLUSTER_STATUS
DESCRIPTOR.message_types_by_name['DescribeFlinkClusterAPI'] = _DESCRIBEFLINKCLUSTERAPI
DESCRIPTOR.message_types_by_name['ListFlinkClusters'] = _LISTFLINKCLUSTERS
DESCRIPTOR.message_types_by_name['DeleteFlinkClusters'] = _DELETEFLINKCLUSTERS
DESCRIPTOR.message_types_by_name['StartFlinkClusters'] = _STARTFLINKCLUSTERS
DESCRIPTOR.message_types_by_name['StopFlinkClusters'] = _STOPFLINKCLUSTERS
DESCRIPTOR.message_types_by_name['CreateFlinkCluster'] = _CREATEFLINKCLUSTER
DESCRIPTOR.message_types_by_name['UpdateFlinkCluster'] = _UPDATEFLINKCLUSTER
DESCRIPTOR.message_types_by_name['DescribeFlinkCluster'] = _DESCRIBEFLINKCLUSTER
DESCRIPTOR.message_types_by_name['UpdateFlinkClusterStatusByScheduler'] = _UPDATEFLINKCLUSTERSTATUSBYSCHEDULER
DESCRIPTOR.message_types_by_name['StopFlinkClusterByScheduler'] = _STOPFLINKCLUSTERBYSCHEDULER
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DescribeFlinkClusterAPI = _reflection.GeneratedProtocolMessageType('DescribeFlinkClusterAPI', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEFLINKCLUSTERAPI,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeFlinkClusterAPI)
  })
_sym_db.RegisterMessage(DescribeFlinkClusterAPI)

ListFlinkClusters = _reflection.GeneratedProtocolMessageType('ListFlinkClusters', (_message.Message,), {
  'DESCRIPTOR' : _LISTFLINKCLUSTERS,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ListFlinkClusters)
  })
_sym_db.RegisterMessage(ListFlinkClusters)

DeleteFlinkClusters = _reflection.GeneratedProtocolMessageType('DeleteFlinkClusters', (_message.Message,), {
  'DESCRIPTOR' : _DELETEFLINKCLUSTERS,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DeleteFlinkClusters)
  })
_sym_db.RegisterMessage(DeleteFlinkClusters)

StartFlinkClusters = _reflection.GeneratedProtocolMessageType('StartFlinkClusters', (_message.Message,), {
  'DESCRIPTOR' : _STARTFLINKCLUSTERS,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.StartFlinkClusters)
  })
_sym_db.RegisterMessage(StartFlinkClusters)

StopFlinkClusters = _reflection.GeneratedProtocolMessageType('StopFlinkClusters', (_message.Message,), {
  'DESCRIPTOR' : _STOPFLINKCLUSTERS,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.StopFlinkClusters)
  })
_sym_db.RegisterMessage(StopFlinkClusters)

CreateFlinkCluster = _reflection.GeneratedProtocolMessageType('CreateFlinkCluster', (_message.Message,), {
  'DESCRIPTOR' : _CREATEFLINKCLUSTER,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.CreateFlinkCluster)
  })
_sym_db.RegisterMessage(CreateFlinkCluster)

UpdateFlinkCluster = _reflection.GeneratedProtocolMessageType('UpdateFlinkCluster', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEFLINKCLUSTER,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.UpdateFlinkCluster)
  })
_sym_db.RegisterMessage(UpdateFlinkCluster)

DescribeFlinkCluster = _reflection.GeneratedProtocolMessageType('DescribeFlinkCluster', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEFLINKCLUSTER,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeFlinkCluster)
  })
_sym_db.RegisterMessage(DescribeFlinkCluster)

UpdateFlinkClusterStatusByScheduler = _reflection.GeneratedProtocolMessageType('UpdateFlinkClusterStatusByScheduler', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEFLINKCLUSTERSTATUSBYSCHEDULER,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.UpdateFlinkClusterStatusByScheduler)
  })
_sym_db.RegisterMessage(UpdateFlinkClusterStatusByScheduler)

StopFlinkClusterByScheduler = _reflection.GeneratedProtocolMessageType('StopFlinkClusterByScheduler', (_message.Message,), {
  'DESCRIPTOR' : _STOPFLINKCLUSTERBYSCHEDULER,
  '__module__' : 'proto.types.request.flink_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.StopFlinkClusterByScheduler)
  })
_sym_db.RegisterMessage(StopFlinkClusterByScheduler)


DESCRIPTOR._options = None
_DESCRIBEFLINKCLUSTERAPI.fields_by_name['space_id']._options = None
_DESCRIBEFLINKCLUSTERAPI.fields_by_name['cluster_id']._options = None
_LISTFLINKCLUSTERS.fields_by_name['space_id']._options = None
_LISTFLINKCLUSTERS.fields_by_name['limit']._options = None
_LISTFLINKCLUSTERS.fields_by_name['offset']._options = None
_LISTFLINKCLUSTERS.fields_by_name['sort_by']._options = None
_LISTFLINKCLUSTERS.fields_by_name['reverse']._options = None
_LISTFLINKCLUSTERS.fields_by_name['search']._options = None
_LISTFLINKCLUSTERS.fields_by_name['status']._options = None
_LISTFLINKCLUSTERS.fields_by_name['name']._options = None
_DELETEFLINKCLUSTERS.fields_by_name['space_id']._options = None
_DELETEFLINKCLUSTERS.fields_by_name['cluster_ids']._options = None
_STARTFLINKCLUSTERS.fields_by_name['space_id']._options = None
_STARTFLINKCLUSTERS.fields_by_name['cluster_ids']._options = None
_STOPFLINKCLUSTERS.fields_by_name['space_id']._options = None
_STOPFLINKCLUSTERS.fields_by_name['cluster_ids']._options = None
_CREATEFLINKCLUSTER.fields_by_name['space_id']._options = None
_CREATEFLINKCLUSTER.fields_by_name['created_by']._options = None
_CREATEFLINKCLUSTER.fields_by_name['space_owner']._options = None
_CREATEFLINKCLUSTER.fields_by_name['name']._options = None
_CREATEFLINKCLUSTER.fields_by_name['version']._options = None
_CREATEFLINKCLUSTER.fields_by_name['task_num']._options = None
_CREATEFLINKCLUSTER.fields_by_name['job_cu']._options = None
_CREATEFLINKCLUSTER.fields_by_name['task_cu']._options = None
_UPDATEFLINKCLUSTER.fields_by_name['space_id']._options = None
_UPDATEFLINKCLUSTER.fields_by_name['space_owner']._options = None
_UPDATEFLINKCLUSTER.fields_by_name['cluster_id']._options = None
_UPDATEFLINKCLUSTER.fields_by_name['name']._options = None
_UPDATEFLINKCLUSTER.fields_by_name['task_num']._options = None
_UPDATEFLINKCLUSTER.fields_by_name['job_cu']._options = None
_UPDATEFLINKCLUSTER.fields_by_name['task_cu']._options = None
_DESCRIBEFLINKCLUSTER.fields_by_name['cluster_id']._options = None
_UPDATEFLINKCLUSTERSTATUSBYSCHEDULER.fields_by_name['cluster_id']._options = None
_STOPFLINKCLUSTERBYSCHEDULER.fields_by_name['space_id']._options = None
_STOPFLINKCLUSTERBYSCHEDULER.fields_by_name['cluster_id']._options = None
# @@protoc_insertion_point(module_scope)
