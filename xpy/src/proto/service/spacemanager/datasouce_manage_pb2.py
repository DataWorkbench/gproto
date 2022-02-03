# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/spacemanager/datasouce_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import empty_pb2 as proto_dot_types_dot_model_dot_empty__pb2
from proto.types.request import datasource_manage_pb2 as proto_dot_types_dot_request_dot_datasource__manage__pb2
from proto.types.response import datasource_manage_pb2 as proto_dot_types_dot_response_dot_datasource__manage__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/spacemanager/datasouce_manage.proto',
  package='spacemanager',
  syntax='proto3',
  serialized_options=b'\n\'com.dataomnis.gproto.service.pbsvcspaceB\025PBSvcDataSourceManageP\000Z6github.com/DataWorkbench/gproto/pkg/service/pbsvcspace',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1proto/service/spacemanager/datasouce_manage.proto\x12\x0cspacemanager\x1a\x1dproto/types/model/empty.proto\x1a+proto/types/request/datasource_manage.proto\x1a,proto/types/response/datasource_manage.proto2\x92\x08\n\x10\x44\x61taSourceManage\x12H\n\x0fListDataSources\x12\x18.request.ListDataSources\x1a\x19.response.ListDataSources\"\x00\x12K\n\x10\x43reateDataSource\x12\x19.request.CreateDataSource\x1a\x1a.response.CreateDataSource\"\x00\x12\x43\n\x10UpdateDataSource\x12\x19.request.UpdateDataSource\x1a\x12.model.EmptyStruct\"\x00\x12Q\n\x12\x44\x65scribeDataSource\x12\x1b.request.DescribeDataSource\x1a\x1c.response.DescribeDataSource\"\x00\x12G\n\x12\x44isableDataSources\x12\x1b.request.DisableDataSources\x1a\x12.model.EmptyStruct\"\x00\x12\x45\n\x11\x45nableDataSources\x12\x1a.request.EnableDataSources\x1a\x12.model.EmptyStruct\"\x00\x12\x45\n\x11\x44\x65leteDataSources\x12\x1a.request.DeleteDataSources\x1a\x12.model.EmptyStruct\"\x00\x12R\n\x17\x44\x65scribeDataSourceKinds\x12\x12.model.EmptyStruct\x1a!.response.DescribeDataSourceKinds\"\x00\x12\x66\n\x19ListDataSourceConnections\x12\".request.ListDataSourceConnections\x1a#.response.ListDataSourceConnections\"\x00\x12\x63\n\x18PingDataSourceConnection\x12!.request.PingDataSourceConnection\x1a\".response.PingDataSourceConnection\"\x00\x12\x63\n\x18\x44\x65scribeDataSourceTables\x12!.request.DescribeDataSourceTables\x1a\".response.DescribeDataSourceTables\"\x00\x12r\n\x1d\x44\x65scribeDataSourceTableSchema\x12&.request.DescribeDataSourceTableSchema\x1a\'.response.DescribeDataSourceTableSchema\"\x00\x42z\n\'com.dataomnis.gproto.service.pbsvcspaceB\x15PBSvcDataSourceManageP\x00Z6github.com/DataWorkbench/gproto/pkg/service/pbsvcspaceb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_empty__pb2.DESCRIPTOR,proto_dot_types_dot_request_dot_datasource__manage__pb2.DESCRIPTOR,proto_dot_types_dot_response_dot_datasource__manage__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_DATASOURCEMANAGE = _descriptor.ServiceDescriptor(
  name='DataSourceManage',
  full_name='spacemanager.DataSourceManage',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=190,
  serialized_end=1232,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListDataSources',
    full_name='spacemanager.DataSourceManage.ListDataSources',
    index=0,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._LISTDATASOURCES,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._LISTDATASOURCES,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateDataSource',
    full_name='spacemanager.DataSourceManage.CreateDataSource',
    index=1,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._CREATEDATASOURCE,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._CREATEDATASOURCE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateDataSource',
    full_name='spacemanager.DataSourceManage.UpdateDataSource',
    index=2,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._UPDATEDATASOURCE,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeDataSource',
    full_name='spacemanager.DataSourceManage.DescribeDataSource',
    index=3,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._DESCRIBEDATASOURCE,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._DESCRIBEDATASOURCE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DisableDataSources',
    full_name='spacemanager.DataSourceManage.DisableDataSources',
    index=4,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._DISABLEDATASOURCES,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='EnableDataSources',
    full_name='spacemanager.DataSourceManage.EnableDataSources',
    index=5,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._ENABLEDATASOURCES,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteDataSources',
    full_name='spacemanager.DataSourceManage.DeleteDataSources',
    index=6,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._DELETEDATASOURCES,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeDataSourceKinds',
    full_name='spacemanager.DataSourceManage.DescribeDataSourceKinds',
    index=7,
    containing_service=None,
    input_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._DESCRIBEDATASOURCEKINDS,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListDataSourceConnections',
    full_name='spacemanager.DataSourceManage.ListDataSourceConnections',
    index=8,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._LISTDATASOURCECONNECTIONS,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._LISTDATASOURCECONNECTIONS,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='PingDataSourceConnection',
    full_name='spacemanager.DataSourceManage.PingDataSourceConnection',
    index=9,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._PINGDATASOURCECONNECTION,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._PINGDATASOURCECONNECTION,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeDataSourceTables',
    full_name='spacemanager.DataSourceManage.DescribeDataSourceTables',
    index=10,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._DESCRIBEDATASOURCETABLES,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._DESCRIBEDATASOURCETABLES,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeDataSourceTableSchema',
    full_name='spacemanager.DataSourceManage.DescribeDataSourceTableSchema',
    index=11,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_datasource__manage__pb2._DESCRIBEDATASOURCETABLESCHEMA,
    output_type=proto_dot_types_dot_response_dot_datasource__manage__pb2._DESCRIBEDATASOURCETABLESCHEMA,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_DATASOURCEMANAGE)

DESCRIPTOR.services_by_name['DataSourceManage'] = _DATASOURCEMANAGE

# @@protoc_insertion_point(module_scope)
