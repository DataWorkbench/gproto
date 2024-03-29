# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/syncjob/sqlservercdc.proto
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
  name='proto/types/model/syncjob/sqlservercdc.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\016PBSqlservercdcP\000Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,proto/types/model/syncjob/sqlservercdc.proto\x12\x05model\x1a/github.com/yu31/protoc-plugin/proto/gosql.proto\x1a&proto/types/model/syncjob/column.proto\"\xa4\x01\n\x12SqlServerCdcSource\x12\x12\n\ntable_list\x18\x01 \x03(\t\x12\x0b\n\x03\x63\x61t\x18\x02 \x01(\t\x12\x0b\n\x03lsn\x18\x03 \x01(\t\x12\x15\n\rpoll_interval\x18\x04 \x01(\x03\x12\x13\n\x0bpaving_data\x18\x05 \x01(\x08\x12\r\n\x05split\x18\x06 \x01(\x08\x12\x1d\n\x06\x63olumn\x18\x07 \x03(\x0b\x32\r.model.Column:\x06\xca\xb2\x04\x02\n\x00\x42}\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\x0ePBSqlservercdcP\x00Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjobb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_syncjob_dot_column__pb2.DESCRIPTOR,])




_SQLSERVERCDCSOURCE = _descriptor.Descriptor(
  name='SqlServerCdcSource',
  full_name='model.SqlServerCdcSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='table_list', full_name='model.SqlServerCdcSource.table_list', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cat', full_name='model.SqlServerCdcSource.cat', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='lsn', full_name='model.SqlServerCdcSource.lsn', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='poll_interval', full_name='model.SqlServerCdcSource.poll_interval', index=3,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='paving_data', full_name='model.SqlServerCdcSource.paving_data', index=4,
      number=5, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='split', full_name='model.SqlServerCdcSource.split', index=5,
      number=6, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='column', full_name='model.SqlServerCdcSource.column', index=6,
      number=7, type=11, cpp_type=10, label=3,
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
  serialized_options=b'\312\262\004\002\n\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=145,
  serialized_end=309,
)

_SQLSERVERCDCSOURCE.fields_by_name['column'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
DESCRIPTOR.message_types_by_name['SqlServerCdcSource'] = _SQLSERVERCDCSOURCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SqlServerCdcSource = _reflection.GeneratedProtocolMessageType('SqlServerCdcSource', (_message.Message,), {
  'DESCRIPTOR' : _SQLSERVERCDCSOURCE,
  '__module__' : 'proto.types.model.syncjob.sqlservercdc_pb2'
  # @@protoc_insertion_point(class_scope:model.SqlServerCdcSource)
  })
_sym_db.RegisterMessage(SqlServerCdcSource)


DESCRIPTOR._options = None
_SQLSERVERCDCSOURCE._options = None
# @@protoc_insertion_point(module_scope)
