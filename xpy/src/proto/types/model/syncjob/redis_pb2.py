# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/syncjob/redis.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import gosql_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/syncjob/redis.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\007PBRedisP\000Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%proto/types/model/syncjob/redis.proto\x12\x05model\x1a/github.com/yu31/protoc-plugin/proto/gosql.proto\"\xb1\x02\n\x0bRedisTarget\x12\x10\n\x08\x64\x61tabase\x18\x01 \x01(\x05\x12\x12\n\nkeyIndexes\x18\x02 \x03(\x05\x12\x13\n\x0b\x64\x61te_format\x18\x03 \x01(\t\x12\x13\n\x0b\x65xpire_time\x18\x04 \x01(\x03\x12%\n\x04type\x18\x05 \x01(\x0e\x32\x17.model.RedisTarget.Type\x12\x0c\n\x04mode\x18\x06 \x01(\t\x12\x1b\n\x13key_field_delimiter\x18\x07 \x01(\t\x12\x1d\n\x15value_field_delimiter\x18\x08 \x01(\t\x12\x0f\n\x07timeout\x18\t \x01(\x05\"H\n\x04Type\x12\r\n\tTypeUnset\x10\x00\x12\n\n\x06string\x10\x01\x12\x08\n\x04list\x10\x02\x12\x07\n\x03set\x10\x03\x12\x08\n\x04zset\x10\x04\x12\x08\n\x04hash\x10\x05:\x06\xca\xb2\x04\x02\n\x00\x42v\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\x07PBRedisP\x00Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjobb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2.DESCRIPTOR,])



_REDISTARGET_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='model.RedisTarget.Type',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TypeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='string', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='list', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='set', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='zset', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='hash', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=323,
  serialized_end=395,
)
_sym_db.RegisterEnumDescriptor(_REDISTARGET_TYPE)


_REDISTARGET = _descriptor.Descriptor(
  name='RedisTarget',
  full_name='model.RedisTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='database', full_name='model.RedisTarget.database', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='keyIndexes', full_name='model.RedisTarget.keyIndexes', index=1,
      number=2, type=5, cpp_type=1, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='date_format', full_name='model.RedisTarget.date_format', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='expire_time', full_name='model.RedisTarget.expire_time', index=3,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='model.RedisTarget.type', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mode', full_name='model.RedisTarget.mode', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='key_field_delimiter', full_name='model.RedisTarget.key_field_delimiter', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value_field_delimiter', full_name='model.RedisTarget.value_field_delimiter', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timeout', full_name='model.RedisTarget.timeout', index=8,
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
    _REDISTARGET_TYPE,
  ],
  serialized_options=b'\312\262\004\002\n\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=98,
  serialized_end=403,
)

_REDISTARGET.fields_by_name['type'].enum_type = _REDISTARGET_TYPE
_REDISTARGET_TYPE.containing_type = _REDISTARGET
DESCRIPTOR.message_types_by_name['RedisTarget'] = _REDISTARGET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

RedisTarget = _reflection.GeneratedProtocolMessageType('RedisTarget', (_message.Message,), {
  'DESCRIPTOR' : _REDISTARGET,
  '__module__' : 'proto.types.model.syncjob.redis_pb2'
  # @@protoc_insertion_point(class_scope:model.RedisTarget)
  })
_sym_db.RegisterMessage(RedisTarget)


DESCRIPTOR._options = None
_REDISTARGET._options = None
# @@protoc_insertion_point(module_scope)
