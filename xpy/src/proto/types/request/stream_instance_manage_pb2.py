# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/stream_instance_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from github.com.yu31.protoc_plugin.proto import defaults_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2
from proto.types.model import stream_instance_pb2 as proto_dot_types_dot_model_dot_stream__instance__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/stream_instance_manage.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\035PBRequestStreamInstanceManageP\000Z3github.com/DataWorkbench/gproto/pkg/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n0proto/types/request/stream_instance_manage.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\x32github.com/yu31/protoc-plugin/proto/defaults.proto\x1a\'proto/types/model/stream_instance.proto\"\xba\x02\n\x13ListStreamInstances\x12&\n\x05limit\x18\x01 \x01(\x05\x42\x17\xa2\xa1\x1f\x06\xaa\x06\x03\x31\x30\x30\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x30\x00\x38\x64\x12\x1b\n\x06offset\x18\x02 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12%\n\x08space_id\x18\x03 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x14\n\x06job_id\x18\x04 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x15\n\x07version\x18\x05 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x37\n\x05state\x18\x06 \x01(\x0e\x32\x1b.model.StreamInstance.StateB\x0b\xe2\xdf\x1f\x07\x12\x05\xda\x01\x02X\x01\x12:\n\x07sort_by\x18\x07 \x01(\tB)\xe2\xdf\x1f%\x12#\xc2\x01 J\x00J\x02idJ\x06job_idJ\x07\x63reatedJ\x07updated\x12\x15\n\x07reverse\x18\x08 \x01(\x08\x42\x04\xe2\xdf\x1f\x00\"W\n\x18TerminateStreamInstances\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x14\n\x0cinstance_ids\x18\x02 \x03(\t\"U\n\x16SuspendStreamInstances\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x14\n\x0cinstance_ids\x18\x02 \x03(\t\"T\n\x15ResumeStreamInstances\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x14\n\x0cinstance_ids\x18\x02 \x03(\t\"<\n\x1b\x44\x65scribeFlinkUIByInstanceId\x12\x1d\n\x07inst_id\x18\x01 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\xf0\x01\x14\x42|\n$com.dataomnis.gproto.types.pbrequestB\x1dPBRequestStreamInstanceManageP\x00Z3github.com/DataWorkbench/gproto/pkg/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_stream__instance__pb2.DESCRIPTOR,])




_LISTSTREAMINSTANCES = _descriptor.Descriptor(
  name='ListStreamInstances',
  full_name='request.ListStreamInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.ListStreamInstances.limit', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\242\241\037\006\252\006\003100\342\337\037\t\022\007\262\001\0040\0008d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.ListStreamInstances.offset', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ListStreamInstances.space_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='job_id', full_name='request.ListStreamInstances.job_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='request.ListStreamInstances.version', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='request.ListStreamInstances.state', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\332\001\002X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sort_by', full_name='request.ListStreamInstances.sort_by', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037%\022#\302\001 J\000J\002idJ\006job_idJ\007createdJ\007updated', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reverse', full_name='request.ListStreamInstances.reverse', index=7,
      number=8, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=208,
  serialized_end=522,
)


_TERMINATESTREAMINSTANCES = _descriptor.Descriptor(
  name='TerminateStreamInstances',
  full_name='request.TerminateStreamInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.TerminateStreamInstances.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_ids', full_name='request.TerminateStreamInstances.instance_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=524,
  serialized_end=611,
)


_SUSPENDSTREAMINSTANCES = _descriptor.Descriptor(
  name='SuspendStreamInstances',
  full_name='request.SuspendStreamInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.SuspendStreamInstances.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_ids', full_name='request.SuspendStreamInstances.instance_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=613,
  serialized_end=698,
)


_RESUMESTREAMINSTANCES = _descriptor.Descriptor(
  name='ResumeStreamInstances',
  full_name='request.ResumeStreamInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ResumeStreamInstances.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_ids', full_name='request.ResumeStreamInstances.instance_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
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
  serialized_start=700,
  serialized_end=784,
)


_DESCRIBEFLINKUIBYINSTANCEID = _descriptor.Descriptor(
  name='DescribeFlinkUIByInstanceId',
  full_name='request.DescribeFlinkUIByInstanceId',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='inst_id', full_name='request.DescribeFlinkUIByInstanceId.inst_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=786,
  serialized_end=846,
)

_LISTSTREAMINSTANCES.fields_by_name['state'].enum_type = proto_dot_types_dot_model_dot_stream__instance__pb2._STREAMINSTANCE_STATE
DESCRIPTOR.message_types_by_name['ListStreamInstances'] = _LISTSTREAMINSTANCES
DESCRIPTOR.message_types_by_name['TerminateStreamInstances'] = _TERMINATESTREAMINSTANCES
DESCRIPTOR.message_types_by_name['SuspendStreamInstances'] = _SUSPENDSTREAMINSTANCES
DESCRIPTOR.message_types_by_name['ResumeStreamInstances'] = _RESUMESTREAMINSTANCES
DESCRIPTOR.message_types_by_name['DescribeFlinkUIByInstanceId'] = _DESCRIBEFLINKUIBYINSTANCEID
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListStreamInstances = _reflection.GeneratedProtocolMessageType('ListStreamInstances', (_message.Message,), {
  'DESCRIPTOR' : _LISTSTREAMINSTANCES,
  '__module__' : 'proto.types.request.stream_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ListStreamInstances)
  })
_sym_db.RegisterMessage(ListStreamInstances)

TerminateStreamInstances = _reflection.GeneratedProtocolMessageType('TerminateStreamInstances', (_message.Message,), {
  'DESCRIPTOR' : _TERMINATESTREAMINSTANCES,
  '__module__' : 'proto.types.request.stream_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.TerminateStreamInstances)
  })
_sym_db.RegisterMessage(TerminateStreamInstances)

SuspendStreamInstances = _reflection.GeneratedProtocolMessageType('SuspendStreamInstances', (_message.Message,), {
  'DESCRIPTOR' : _SUSPENDSTREAMINSTANCES,
  '__module__' : 'proto.types.request.stream_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.SuspendStreamInstances)
  })
_sym_db.RegisterMessage(SuspendStreamInstances)

ResumeStreamInstances = _reflection.GeneratedProtocolMessageType('ResumeStreamInstances', (_message.Message,), {
  'DESCRIPTOR' : _RESUMESTREAMINSTANCES,
  '__module__' : 'proto.types.request.stream_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ResumeStreamInstances)
  })
_sym_db.RegisterMessage(ResumeStreamInstances)

DescribeFlinkUIByInstanceId = _reflection.GeneratedProtocolMessageType('DescribeFlinkUIByInstanceId', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEFLINKUIBYINSTANCEID,
  '__module__' : 'proto.types.request.stream_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeFlinkUIByInstanceId)
  })
_sym_db.RegisterMessage(DescribeFlinkUIByInstanceId)


DESCRIPTOR._options = None
_LISTSTREAMINSTANCES.fields_by_name['limit']._options = None
_LISTSTREAMINSTANCES.fields_by_name['offset']._options = None
_LISTSTREAMINSTANCES.fields_by_name['space_id']._options = None
_LISTSTREAMINSTANCES.fields_by_name['job_id']._options = None
_LISTSTREAMINSTANCES.fields_by_name['version']._options = None
_LISTSTREAMINSTANCES.fields_by_name['state']._options = None
_LISTSTREAMINSTANCES.fields_by_name['sort_by']._options = None
_LISTSTREAMINSTANCES.fields_by_name['reverse']._options = None
_TERMINATESTREAMINSTANCES.fields_by_name['space_id']._options = None
_SUSPENDSTREAMINSTANCES.fields_by_name['space_id']._options = None
_RESUMESTREAMINSTANCES.fields_by_name['space_id']._options = None
_DESCRIBEFLINKUIBYINSTANCEID.fields_by_name['inst_id']._options = None
# @@protoc_insertion_point(module_scope)
