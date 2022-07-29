# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/syncjob/hbase.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model.syncjob import baseenum_pb2 as proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2
from proto.types.model.syncjob import column_pb2 as proto_dot_types_dot_model_dot_syncjob_dot_column__pb2
from github.com.yu31.protoc_plugin.proto import gosql_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/syncjob/hbase.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\007PBHbaseP\000Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%proto/types/model/syncjob/hbase.proto\x12\x05model\x1a(proto/types/model/syncjob/baseenum.proto\x1a&proto/types/model/syncjob/column.proto\x1a/github.com/yu31/protoc-plugin/proto/gosql.proto\"\xe1\x01\n\x0bHbaseSource\x12\x1d\n\x06\x63olumn\x18\x01 \x03(\x0b\x32\r.model.Column\x12\r\n\x05table\x18\x02 \x01(\t\x12\x12\n\nchange_log\x18\x03 \x01(\t\x12\x10\n\x08\x65ncoding\x18\x04 \x01(\t\x12\x17\n\x0fscan_cache_size\x18\x05 \x01(\x05\x12\x17\n\x0fscan_batch_size\x18\x06 \x01(\x05\x12\x15\n\rstart_row_key\x18\x07 \x01(\t\x12\x13\n\x0b\x65nd_row_key\x18\x08 \x01(\t\x12\x18\n\x10is_binary_rowkey\x18\t \x01(\x08:\x06\xca\xb2\x04\x02\n\x00\"\xe3\x02\n\x0bHbaseTarget\x12\x1d\n\x06\x63olumn\x18\x01 \x03(\x0b\x32\r.model.Column\x12\r\n\x05table\x18\x02 \x01(\t\x12+\n\tnull_mode\x18\x03 \x01(\x0e\x32\x18.model.BaseEnum.NullMode\x12\x10\n\x08wal_flag\x18\x04 \x01(\x08\x12\x19\n\x11write_buffer_size\x18\x05 \x01(\x05\x12\x12\n\nchange_log\x18\x06 \x01(\t\x12\x16\n\x0erowkey_express\x18\x07 \x01(\t\x12\x1c\n\x14version_column_index\x18\x08 \x01(\x05\x12\x1c\n\x14version_column_value\x18\t \x01(\t\x12\x17\n\x0fscan_cache_size\x18\n \x01(\x05\x12\x17\n\x0fscan_batch_size\x18\x0b \x01(\x05\x12*\n\x08\x65ncoding\x18\x0c \x01(\x0e\x32\x18.model.BaseEnum.Encoding:\x06\xca\xb2\x04\x02\n\x00\x42v\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\x07PBHbaseP\x00Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjobb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_syncjob_dot_column__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2.DESCRIPTOR,])




_HBASESOURCE = _descriptor.Descriptor(
  name='HbaseSource',
  full_name='model.HbaseSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='column', full_name='model.HbaseSource.column', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='table', full_name='model.HbaseSource.table', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='change_log', full_name='model.HbaseSource.change_log', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='encoding', full_name='model.HbaseSource.encoding', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scan_cache_size', full_name='model.HbaseSource.scan_cache_size', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scan_batch_size', full_name='model.HbaseSource.scan_batch_size', index=5,
      number=6, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='start_row_key', full_name='model.HbaseSource.start_row_key', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='end_row_key', full_name='model.HbaseSource.end_row_key', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_binary_rowkey', full_name='model.HbaseSource.is_binary_rowkey', index=8,
      number=9, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
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
  serialized_start=180,
  serialized_end=405,
)


_HBASETARGET = _descriptor.Descriptor(
  name='HbaseTarget',
  full_name='model.HbaseTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='column', full_name='model.HbaseTarget.column', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='table', full_name='model.HbaseTarget.table', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='null_mode', full_name='model.HbaseTarget.null_mode', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='wal_flag', full_name='model.HbaseTarget.wal_flag', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='write_buffer_size', full_name='model.HbaseTarget.write_buffer_size', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='change_log', full_name='model.HbaseTarget.change_log', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='rowkey_express', full_name='model.HbaseTarget.rowkey_express', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version_column_index', full_name='model.HbaseTarget.version_column_index', index=7,
      number=8, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version_column_value', full_name='model.HbaseTarget.version_column_value', index=8,
      number=9, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scan_cache_size', full_name='model.HbaseTarget.scan_cache_size', index=9,
      number=10, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='scan_batch_size', full_name='model.HbaseTarget.scan_batch_size', index=10,
      number=11, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='encoding', full_name='model.HbaseTarget.encoding', index=11,
      number=12, type=14, cpp_type=8, label=1,
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
  serialized_options=b'\312\262\004\002\n\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=408,
  serialized_end=763,
)

_HBASESOURCE.fields_by_name['column'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
_HBASETARGET.fields_by_name['column'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
_HBASETARGET.fields_by_name['null_mode'].enum_type = proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2._BASEENUM_NULLMODE
_HBASETARGET.fields_by_name['encoding'].enum_type = proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2._BASEENUM_ENCODING
DESCRIPTOR.message_types_by_name['HbaseSource'] = _HBASESOURCE
DESCRIPTOR.message_types_by_name['HbaseTarget'] = _HBASETARGET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

HbaseSource = _reflection.GeneratedProtocolMessageType('HbaseSource', (_message.Message,), {
  'DESCRIPTOR' : _HBASESOURCE,
  '__module__' : 'proto.types.model.syncjob.hbase_pb2'
  # @@protoc_insertion_point(class_scope:model.HbaseSource)
  })
_sym_db.RegisterMessage(HbaseSource)

HbaseTarget = _reflection.GeneratedProtocolMessageType('HbaseTarget', (_message.Message,), {
  'DESCRIPTOR' : _HBASETARGET,
  '__module__' : 'proto.types.model.syncjob.hbase_pb2'
  # @@protoc_insertion_point(class_scope:model.HbaseTarget)
  })
_sym_db.RegisterMessage(HbaseTarget)


DESCRIPTOR._options = None
_HBASESOURCE._options = None
_HBASETARGET._options = None
# @@protoc_insertion_point(module_scope)
