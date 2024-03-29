# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/syncjob/pgwal.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import gosql_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2
from proto.types.model.syncjob import column_pb2 as proto_dot_types_dot_model_dot_syncjob_dot_column__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/syncjob/pgwal.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\007PBPgwalP\000Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%proto/types/model/syncjob/pgwal.proto\x12\x05model\x1a/github.com/yu31/protoc-plugin/proto/gosql.proto\x1a&proto/types/model/syncjob/column.proto\"\xf4\x01\n\x0bPgWalSource\x12\x12\n\ntable_list\x18\x01 \x03(\t\x12\x11\n\tslot_name\x18\x02 \x01(\t\x12\x15\n\rallow_created\x18\x03 \x01(\x08\x12\x17\n\x0fstatus_interval\x18\x04 \x01(\x05\x12\x11\n\ttemporary\x18\x05 \x01(\x08\x12\x0b\n\x03lsn\x18\x06 \x01(\x03\x12\x16\n\x0eslot_available\x18\x07 \x01(\x08\x12\x13\n\x0bpaving_data\x18\x08 \x01(\x08\x12\r\n\x05split\x18\t \x01(\x08\x12\x1d\n\x06\x63olumn\x18\n \x03(\x0b\x32\r.model.Column\x12\x0b\n\x03\x63\x61t\x18\x0b \x01(\t:\x06\xca\xb2\x04\x02\n\x00\x42v\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\x07PBPgwalP\x00Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjobb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_syncjob_dot_column__pb2.DESCRIPTOR,])




_PGWALSOURCE = _descriptor.Descriptor(
  name='PgWalSource',
  full_name='model.PgWalSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='table_list', full_name='model.PgWalSource.table_list', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='slot_name', full_name='model.PgWalSource.slot_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allow_created', full_name='model.PgWalSource.allow_created', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status_interval', full_name='model.PgWalSource.status_interval', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='temporary', full_name='model.PgWalSource.temporary', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='lsn', full_name='model.PgWalSource.lsn', index=5,
      number=6, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='slot_available', full_name='model.PgWalSource.slot_available', index=6,
      number=7, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='paving_data', full_name='model.PgWalSource.paving_data', index=7,
      number=8, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='split', full_name='model.PgWalSource.split', index=8,
      number=9, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='column', full_name='model.PgWalSource.column', index=9,
      number=10, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cat', full_name='model.PgWalSource.cat', index=10,
      number=11, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'\312\262\004\002\n\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=138,
  serialized_end=382,
)

_PGWALSOURCE.fields_by_name['column'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
DESCRIPTOR.message_types_by_name['PgWalSource'] = _PGWALSOURCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PgWalSource = _reflection.GeneratedProtocolMessageType('PgWalSource', (_message.Message,), {
  'DESCRIPTOR' : _PGWALSOURCE,
  '__module__' : 'proto.types.model.syncjob.pgwal_pb2'
  # @@protoc_insertion_point(class_scope:model.PgWalSource)
  })
_sym_db.RegisterMessage(PgWalSource)


DESCRIPTOR._options = None
_PGWALSOURCE._options = None
# @@protoc_insertion_point(module_scope)
