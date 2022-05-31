# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/developer.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from proto.types.model import stream_instance_pb2 as proto_dot_types_dot_model_dot_stream__instance__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/developer.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n\"com.dataomnis.gproto.types.pbmodelB\020PBModelJobManageP\000Z1github.com/DataWorkbench/gproto/xgo/types/pbmodel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!proto/types/model/developer.proto\x12\x05model\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\'proto/types/model/stream_instance.proto\"\x85\x02\n\x07JobInfo\x12!\n\x0binstance_id\x18\x01 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\xf0\x01\x14\x12\x15\n\x07note_id\x18\x02 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x1a\n\x0cparagraph_id\x18\x03 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x16\n\x08\x66link_id\x18\x04 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x15\n\x07message\x18\x05 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x39\n\x05state\x18\x06 \x01(\x0e\x32\x1b.model.StreamInstance.StateB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12\x1c\n\x07\x63reated\x18\x07 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02\x30\x00\x12\x1c\n\x07updated\x18\x08 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02\x30\x00\"\x85\x01\n\x12InteractiveMessage\x12=\n\x08operator\x18\x01 \x01(\x0e\x32\x1c.model.InteractiveMessage.OpB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\"0\n\x02Op\x12\t\n\x05Unset\x10\x00\x12\x08\n\x04Init\x10\x01\x12\t\n\x05\x46\x65tch\x10\x02\x12\n\n\x06\x43\x61ncel\x10\x03\x42k\n\"com.dataomnis.gproto.types.pbmodelB\x10PBModelJobManageP\x00Z1github.com/DataWorkbench/gproto/xgo/types/pbmodelb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_stream__instance__pb2.DESCRIPTOR,])



_INTERACTIVEMESSAGE_OP = _descriptor.EnumDescriptor(
  name='Op',
  full_name='model.InteractiveMessage.Op',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='Unset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Init', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Fetch', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Cancel', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=488,
  serialized_end=536,
)
_sym_db.RegisterEnumDescriptor(_INTERACTIVEMESSAGE_OP)


_JOBINFO = _descriptor.Descriptor(
  name='JobInfo',
  full_name='model.JobInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='instance_id', full_name='model.JobInfo.instance_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\360\001\024', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='note_id', full_name='model.JobInfo.note_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='paragraph_id', full_name='model.JobInfo.paragraph_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='flink_id', full_name='model.JobInfo.flink_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message', full_name='model.JobInfo.message', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='model.JobInfo.state', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='created', full_name='model.JobInfo.created', index=6,
      number=7, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='updated', full_name='model.JobInfo.updated', index=7,
      number=8, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=139,
  serialized_end=400,
)


_INTERACTIVEMESSAGE = _descriptor.Descriptor(
  name='InteractiveMessage',
  full_name='model.InteractiveMessage',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='operator', full_name='model.InteractiveMessage.operator', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _INTERACTIVEMESSAGE_OP,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=403,
  serialized_end=536,
)

_JOBINFO.fields_by_name['state'].enum_type = proto_dot_types_dot_model_dot_stream__instance__pb2._STREAMINSTANCE_STATE
_INTERACTIVEMESSAGE.fields_by_name['operator'].enum_type = _INTERACTIVEMESSAGE_OP
_INTERACTIVEMESSAGE_OP.containing_type = _INTERACTIVEMESSAGE
DESCRIPTOR.message_types_by_name['JobInfo'] = _JOBINFO
DESCRIPTOR.message_types_by_name['InteractiveMessage'] = _INTERACTIVEMESSAGE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

JobInfo = _reflection.GeneratedProtocolMessageType('JobInfo', (_message.Message,), {
  'DESCRIPTOR' : _JOBINFO,
  '__module__' : 'proto.types.model.developer_pb2'
  # @@protoc_insertion_point(class_scope:model.JobInfo)
  })
_sym_db.RegisterMessage(JobInfo)

InteractiveMessage = _reflection.GeneratedProtocolMessageType('InteractiveMessage', (_message.Message,), {
  'DESCRIPTOR' : _INTERACTIVEMESSAGE,
  '__module__' : 'proto.types.model.developer_pb2'
  # @@protoc_insertion_point(class_scope:model.InteractiveMessage)
  })
_sym_db.RegisterMessage(InteractiveMessage)


DESCRIPTOR._options = None
_JOBINFO.fields_by_name['instance_id']._options = None
_JOBINFO.fields_by_name['note_id']._options = None
_JOBINFO.fields_by_name['paragraph_id']._options = None
_JOBINFO.fields_by_name['flink_id']._options = None
_JOBINFO.fields_by_name['message']._options = None
_JOBINFO.fields_by_name['state']._options = None
_JOBINFO.fields_by_name['created']._options = None
_JOBINFO.fields_by_name['updated']._options = None
_INTERACTIVEMESSAGE.fields_by_name['operator']._options = None
# @@protoc_insertion_point(module_scope)
