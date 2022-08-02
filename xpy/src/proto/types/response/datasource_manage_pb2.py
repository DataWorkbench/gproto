# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/response/datasource_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from proto.types.model import datasource_pb2 as proto_dot_types_dot_model_dot_datasource__pb2
from proto.types.model.datasource import datasource_table_pb2 as proto_dot_types_dot_model_dot_datasource_dot_datasource__table__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/response/datasource_manage.proto',
  package='response',
  syntax='proto3',
  serialized_options=b'\n%com.dataomnis.gproto.types.pbresponseB\032PBResponseDataSourceManageP\000Z4github.com/DataWorkbench/gproto/xgo/types/pbresponse',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n,proto/types/response/datasource_manage.proto\x12\x08response\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\"proto/types/model/datasource.proto\x1a\x33proto/types/model/datasource/datasource_table.proto\"\x1e\n\x10\x43reateDataSource\x12\n\n\x02id\x18\x01 \x01(\t\"5\n\x12\x44\x65scribeDataSource\x12\x1f\n\x04info\x18\x01 \x01(\x0b\x32\x11.model.DataSource\"T\n\x0fListDataSources\x12 \n\x05infos\x18\x01 \x03(\x0b\x32\x11.model.DataSource\x12\r\n\x05total\x18\x02 \x01(\x03\x12\x10\n\x08has_more\x18\x03 \x01(\x08\"?\n\x17\x44\x65scribeDataSourceKinds\x12$\n\x05Kinds\x18\x01 \x03(\x0b\x32\x15.model.DataSourceKind\"h\n\x19ListDataSourceConnections\x12*\n\x05infos\x18\x01 \x03(\x0b\x32\x1b.model.DataSourceConnection\x12\r\n\x05total\x18\x02 \x01(\x03\x12\x10\n\x08has_more\x18\x03 \x01(\x08\"M\n\x18PingDataSourceConnection\x12\x31\n\x04info\x18\x01 \x01(\x0b\x32\x1b.model.DataSourceConnectionB\x06\xe2\xdf\x1f\x02\x12\x00\")\n\x18\x44\x65scribeDataSourceTables\x12\r\n\x05items\x18\x01 \x03(\t\"H\n\x1d\x44\x65scribeDataSourceTableSchema\x12\'\n\x06schema\x18\x01 \x01(\x0b\x32\x17.datasource.TableSchema\"Z\n!DescribeTableSchemaDataServiceApi\x12\x35\n\x06schema\x18\x01 \x03(\x0b\x32%.datasource.TableColumnForDataServiceB{\n%com.dataomnis.gproto.types.pbresponseB\x1aPBResponseDataSourceManageP\x00Z4github.com/DataWorkbench/gproto/xgo/types/pbresponseb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_datasource__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_datasource_dot_datasource__table__pb2.DESCRIPTOR,])




_CREATEDATASOURCE = _descriptor.Descriptor(
  name='CreateDataSource',
  full_name='response.CreateDataSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.CreateDataSource.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=200,
  serialized_end=230,
)


_DESCRIBEDATASOURCE = _descriptor.Descriptor(
  name='DescribeDataSource',
  full_name='response.DescribeDataSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='info', full_name='response.DescribeDataSource.info', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=232,
  serialized_end=285,
)


_LISTDATASOURCES = _descriptor.Descriptor(
  name='ListDataSources',
  full_name='response.ListDataSources',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.ListDataSources.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListDataSources.total', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_more', full_name='response.ListDataSources.has_more', index=2,
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
  serialized_start=287,
  serialized_end=371,
)


_DESCRIBEDATASOURCEKINDS = _descriptor.Descriptor(
  name='DescribeDataSourceKinds',
  full_name='response.DescribeDataSourceKinds',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='Kinds', full_name='response.DescribeDataSourceKinds.Kinds', index=0,
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
  serialized_start=373,
  serialized_end=436,
)


_LISTDATASOURCECONNECTIONS = _descriptor.Descriptor(
  name='ListDataSourceConnections',
  full_name='response.ListDataSourceConnections',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.ListDataSourceConnections.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListDataSourceConnections.total', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_more', full_name='response.ListDataSourceConnections.has_more', index=2,
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
  serialized_start=438,
  serialized_end=542,
)


_PINGDATASOURCECONNECTION = _descriptor.Descriptor(
  name='PingDataSourceConnection',
  full_name='response.PingDataSourceConnection',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='info', full_name='response.PingDataSourceConnection.info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\002\022\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=544,
  serialized_end=621,
)


_DESCRIBEDATASOURCETABLES = _descriptor.Descriptor(
  name='DescribeDataSourceTables',
  full_name='response.DescribeDataSourceTables',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='items', full_name='response.DescribeDataSourceTables.items', index=0,
      number=1, type=9, cpp_type=9, label=3,
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
  serialized_start=623,
  serialized_end=664,
)


_DESCRIBEDATASOURCETABLESCHEMA = _descriptor.Descriptor(
  name='DescribeDataSourceTableSchema',
  full_name='response.DescribeDataSourceTableSchema',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='schema', full_name='response.DescribeDataSourceTableSchema.schema', index=0,
      number=1, type=11, cpp_type=10, label=1,
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
  serialized_start=666,
  serialized_end=738,
)


_DESCRIBETABLESCHEMADATASERVICEAPI = _descriptor.Descriptor(
  name='DescribeTableSchemaDataServiceApi',
  full_name='response.DescribeTableSchemaDataServiceApi',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='schema', full_name='response.DescribeTableSchemaDataServiceApi.schema', index=0,
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
  serialized_start=740,
  serialized_end=830,
)

_DESCRIBEDATASOURCE.fields_by_name['info'].message_type = proto_dot_types_dot_model_dot_datasource__pb2._DATASOURCE
_LISTDATASOURCES.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_datasource__pb2._DATASOURCE
_DESCRIBEDATASOURCEKINDS.fields_by_name['Kinds'].message_type = proto_dot_types_dot_model_dot_datasource__pb2._DATASOURCEKIND
_LISTDATASOURCECONNECTIONS.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_datasource__pb2._DATASOURCECONNECTION
_PINGDATASOURCECONNECTION.fields_by_name['info'].message_type = proto_dot_types_dot_model_dot_datasource__pb2._DATASOURCECONNECTION
_DESCRIBEDATASOURCETABLESCHEMA.fields_by_name['schema'].message_type = proto_dot_types_dot_model_dot_datasource_dot_datasource__table__pb2._TABLESCHEMA
_DESCRIBETABLESCHEMADATASERVICEAPI.fields_by_name['schema'].message_type = proto_dot_types_dot_model_dot_datasource_dot_datasource__table__pb2._TABLECOLUMNFORDATASERVICE
DESCRIPTOR.message_types_by_name['CreateDataSource'] = _CREATEDATASOURCE
DESCRIPTOR.message_types_by_name['DescribeDataSource'] = _DESCRIBEDATASOURCE
DESCRIPTOR.message_types_by_name['ListDataSources'] = _LISTDATASOURCES
DESCRIPTOR.message_types_by_name['DescribeDataSourceKinds'] = _DESCRIBEDATASOURCEKINDS
DESCRIPTOR.message_types_by_name['ListDataSourceConnections'] = _LISTDATASOURCECONNECTIONS
DESCRIPTOR.message_types_by_name['PingDataSourceConnection'] = _PINGDATASOURCECONNECTION
DESCRIPTOR.message_types_by_name['DescribeDataSourceTables'] = _DESCRIBEDATASOURCETABLES
DESCRIPTOR.message_types_by_name['DescribeDataSourceTableSchema'] = _DESCRIBEDATASOURCETABLESCHEMA
DESCRIPTOR.message_types_by_name['DescribeTableSchemaDataServiceApi'] = _DESCRIBETABLESCHEMADATASERVICEAPI
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CreateDataSource = _reflection.GeneratedProtocolMessageType('CreateDataSource', (_message.Message,), {
  'DESCRIPTOR' : _CREATEDATASOURCE,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.CreateDataSource)
  })
_sym_db.RegisterMessage(CreateDataSource)

DescribeDataSource = _reflection.GeneratedProtocolMessageType('DescribeDataSource', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEDATASOURCE,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.DescribeDataSource)
  })
_sym_db.RegisterMessage(DescribeDataSource)

ListDataSources = _reflection.GeneratedProtocolMessageType('ListDataSources', (_message.Message,), {
  'DESCRIPTOR' : _LISTDATASOURCES,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.ListDataSources)
  })
_sym_db.RegisterMessage(ListDataSources)

DescribeDataSourceKinds = _reflection.GeneratedProtocolMessageType('DescribeDataSourceKinds', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEDATASOURCEKINDS,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.DescribeDataSourceKinds)
  })
_sym_db.RegisterMessage(DescribeDataSourceKinds)

ListDataSourceConnections = _reflection.GeneratedProtocolMessageType('ListDataSourceConnections', (_message.Message,), {
  'DESCRIPTOR' : _LISTDATASOURCECONNECTIONS,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.ListDataSourceConnections)
  })
_sym_db.RegisterMessage(ListDataSourceConnections)

PingDataSourceConnection = _reflection.GeneratedProtocolMessageType('PingDataSourceConnection', (_message.Message,), {
  'DESCRIPTOR' : _PINGDATASOURCECONNECTION,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.PingDataSourceConnection)
  })
_sym_db.RegisterMessage(PingDataSourceConnection)

DescribeDataSourceTables = _reflection.GeneratedProtocolMessageType('DescribeDataSourceTables', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEDATASOURCETABLES,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.DescribeDataSourceTables)
  })
_sym_db.RegisterMessage(DescribeDataSourceTables)

DescribeDataSourceTableSchema = _reflection.GeneratedProtocolMessageType('DescribeDataSourceTableSchema', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEDATASOURCETABLESCHEMA,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.DescribeDataSourceTableSchema)
  })
_sym_db.RegisterMessage(DescribeDataSourceTableSchema)

DescribeTableSchemaDataServiceApi = _reflection.GeneratedProtocolMessageType('DescribeTableSchemaDataServiceApi', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBETABLESCHEMADATASERVICEAPI,
  '__module__' : 'proto.types.response.datasource_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.DescribeTableSchemaDataServiceApi)
  })
_sym_db.RegisterMessage(DescribeTableSchemaDataServiceApi)


DESCRIPTOR._options = None
_PINGDATASOURCECONNECTION.fields_by_name['info']._options = None
# @@protoc_insertion_point(module_scope)
