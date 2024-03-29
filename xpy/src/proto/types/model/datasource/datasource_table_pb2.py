# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/datasource/datasource_table.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/datasource/datasource_table.proto',
  package='datasource',
  syntax='proto3',
  serialized_options=b'\n/com.dataomnis.gproto.types.pbmodel.pbdatasourceB\021PBDataSourceTableP\000Z>github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbdatasource',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n3proto/types/model/datasource/datasource_table.proto\x12\ndatasource\"7\n\x0bTableSchema\x12(\n\x07\x63olumns\x18\x01 \x03(\x0b\x32\x17.datasource.TableColumn\"A\n\x0bTableColumn\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x0c\n\x04type\x18\x02 \x01(\t\x12\x16\n\x0eis_primary_key\x18\x03 \x01(\x08\"j\n\x19TableColumnForDataService\x12\x0c\n\x04name\x18\x01 \x01(\t\x12\x13\n\x0b\x63olumn_type\x18\x02 \x01(\t\x12\x16\n\x0eis_primary_key\x18\x03 \x01(\x08\x12\x12\n\nparam_type\x18\x04 \x01(\tB\x86\x01\n/com.dataomnis.gproto.types.pbmodel.pbdatasourceB\x11PBDataSourceTableP\x00Z>github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbdatasourceb\x06proto3'
)




_TABLESCHEMA = _descriptor.Descriptor(
  name='TableSchema',
  full_name='datasource.TableSchema',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='columns', full_name='datasource.TableSchema.columns', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_start=67,
  serialized_end=122,
)


_TABLECOLUMN = _descriptor.Descriptor(
  name='TableColumn',
  full_name='datasource.TableColumn',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='datasource.TableColumn.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='datasource.TableColumn.type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_primary_key', full_name='datasource.TableColumn.is_primary_key', index=2,
      number=3, type=8, cpp_type=7, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=124,
  serialized_end=189,
)


_TABLECOLUMNFORDATASERVICE = _descriptor.Descriptor(
  name='TableColumnForDataService',
  full_name='datasource.TableColumnForDataService',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='name', full_name='datasource.TableColumnForDataService.name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='column_type', full_name='datasource.TableColumnForDataService.column_type', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_primary_key', full_name='datasource.TableColumnForDataService.is_primary_key', index=2,
      number=3, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='param_type', full_name='datasource.TableColumnForDataService.param_type', index=3,
      number=4, type=9, cpp_type=9, label=1,
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
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=191,
  serialized_end=297,
)

_TABLESCHEMA.fields_by_name['columns'].message_type = _TABLECOLUMN
DESCRIPTOR.message_types_by_name['TableSchema'] = _TABLESCHEMA
DESCRIPTOR.message_types_by_name['TableColumn'] = _TABLECOLUMN
DESCRIPTOR.message_types_by_name['TableColumnForDataService'] = _TABLECOLUMNFORDATASERVICE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TableSchema = _reflection.GeneratedProtocolMessageType('TableSchema', (_message.Message,), {
  'DESCRIPTOR' : _TABLESCHEMA,
  '__module__' : 'proto.types.model.datasource.datasource_table_pb2'
  # @@protoc_insertion_point(class_scope:datasource.TableSchema)
  })
_sym_db.RegisterMessage(TableSchema)

TableColumn = _reflection.GeneratedProtocolMessageType('TableColumn', (_message.Message,), {
  'DESCRIPTOR' : _TABLECOLUMN,
  '__module__' : 'proto.types.model.datasource.datasource_table_pb2'
  # @@protoc_insertion_point(class_scope:datasource.TableColumn)
  })
_sym_db.RegisterMessage(TableColumn)

TableColumnForDataService = _reflection.GeneratedProtocolMessageType('TableColumnForDataService', (_message.Message,), {
  'DESCRIPTOR' : _TABLECOLUMNFORDATASERVICE,
  '__module__' : 'proto.types.model.datasource.datasource_table_pb2'
  # @@protoc_insertion_point(class_scope:datasource.TableColumnForDataService)
  })
_sym_db.RegisterMessage(TableColumnForDataService)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
