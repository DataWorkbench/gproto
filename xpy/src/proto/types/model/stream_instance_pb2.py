# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/stream_instance.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/stream_instance.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n\"com.dataomnis.gproto.types.pbmodelB\025PBModelStreamInstanceP\000Z1github.com/DataWorkbench/gproto/xgo/types/pbmodel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'proto/types/model/stream_instance.proto\x12\x05model\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\"\xd6\x04\n\x0eStreamInstance\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12#\n\x06job_id\x18\x02 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04stj-\x12\x1d\n\x07version\x18\x03 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\xf0\x01\x10\x12\x1f\n\x02id\x18\x04 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04sti-\x12\x39\n\x05state\x18\x05 \x01(\x0e\x32\x1b.model.StreamInstance.StateB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12;\n\x06status\x18\x06 \x01(\x0e\x32\x1c.model.StreamInstance.StatusB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12\x0f\n\x07message\x18\x07 \x01(\t\x12\x0f\n\x07note_id\x18\n \x01(\t\x12\x14\n\x0cparagraph_id\x18\x0b \x01(\t\x12\x10\n\x08\x66link_id\x18\x0c \x01(\t\x12\x1c\n\x07\x63reated\x18\x08 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02\x30\x00\x12\x1c\n\x07updated\x18\t \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02\x30\x00\"3\n\x06Status\x12\x0f\n\x0bStatusUnset\x10\x00\x12\x0b\n\x07\x44\x65leted\x10\x01\x12\x0b\n\x07\x45nabled\x10\x02\"\x84\x01\n\x05State\x12\x0e\n\nStateUnset\x10\x00\x12\x0b\n\x07Pending\x10\x01\x12\x0b\n\x07Running\x10\x02\x12\x0c\n\x08Retrying\x10\x03\x12\r\n\tSuspended\x10\x04\x12\x0e\n\nTerminated\x10\x05\x12\x0b\n\x07Succeed\x10\x06\x12\x0b\n\x07Timeout\x10\x07\x12\n\n\x06\x46\x61iled\x10\x08\x42p\n\"com.dataomnis.gproto.types.pbmodelB\x15PBModelStreamInstanceP\x00Z1github.com/DataWorkbench/gproto/xgo/types/pbmodelb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,])



_STREAMINSTANCE_STATUS = _descriptor.EnumDescriptor(
  name='Status',
  full_name='model.StreamInstance.Status',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='StatusUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Deleted', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Enabled', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=516,
  serialized_end=567,
)
_sym_db.RegisterEnumDescriptor(_STREAMINSTANCE_STATUS)

_STREAMINSTANCE_STATE = _descriptor.EnumDescriptor(
  name='State',
  full_name='model.StreamInstance.State',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='StateUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Pending', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Running', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Retrying', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Suspended', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Terminated', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Succeed', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Timeout', index=7, number=7,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Failed', index=8, number=8,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=570,
  serialized_end=702,
)
_sym_db.RegisterEnumDescriptor(_STREAMINSTANCE_STATE)


_STREAMINSTANCE = _descriptor.Descriptor(
  name='StreamInstance',
  full_name='model.StreamInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='model.StreamInstance.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='job_id', full_name='model.StreamInstance.job_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004stj-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='model.StreamInstance.version', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\360\001\020', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='model.StreamInstance.id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004sti-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='model.StreamInstance.state', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='model.StreamInstance.status', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message', full_name='model.StreamInstance.message', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='note_id', full_name='model.StreamInstance.note_id', index=7,
      number=10, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='paragraph_id', full_name='model.StreamInstance.paragraph_id', index=8,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='flink_id', full_name='model.StreamInstance.flink_id', index=9,
      number=12, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='created', full_name='model.StreamInstance.created', index=10,
      number=8, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='updated', full_name='model.StreamInstance.updated', index=11,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _STREAMINSTANCE_STATUS,
    _STREAMINSTANCE_STATE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=104,
  serialized_end=702,
)

_STREAMINSTANCE.fields_by_name['state'].enum_type = _STREAMINSTANCE_STATE
_STREAMINSTANCE.fields_by_name['status'].enum_type = _STREAMINSTANCE_STATUS
_STREAMINSTANCE_STATUS.containing_type = _STREAMINSTANCE
_STREAMINSTANCE_STATE.containing_type = _STREAMINSTANCE
DESCRIPTOR.message_types_by_name['StreamInstance'] = _STREAMINSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

StreamInstance = _reflection.GeneratedProtocolMessageType('StreamInstance', (_message.Message,), {
  'DESCRIPTOR' : _STREAMINSTANCE,
  '__module__' : 'proto.types.model.stream_instance_pb2'
  # @@protoc_insertion_point(class_scope:model.StreamInstance)
  })
_sym_db.RegisterMessage(StreamInstance)


DESCRIPTOR._options = None
_STREAMINSTANCE.fields_by_name['space_id']._options = None
_STREAMINSTANCE.fields_by_name['job_id']._options = None
_STREAMINSTANCE.fields_by_name['version']._options = None
_STREAMINSTANCE.fields_by_name['id']._options = None
_STREAMINSTANCE.fields_by_name['state']._options = None
_STREAMINSTANCE.fields_by_name['status']._options = None
_STREAMINSTANCE.fields_by_name['created']._options = None
_STREAMINSTANCE.fields_by_name['updated']._options = None
# @@protoc_insertion_point(module_scope)
