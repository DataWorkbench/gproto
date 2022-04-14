# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/developer/flink_developer.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import empty_pb2 as proto_dot_types_dot_model_dot_empty__pb2
from proto.types.request import flink_developer_pb2 as proto_dot_types_dot_request_dot_flink__developer__pb2
from proto.types.response import flink_developer_pb2 as proto_dot_types_dot_response_dot_flink__developer__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/developer/flink_developer.proto',
  package='developer',
  syntax='proto3',
  serialized_options=b'\n+com.dataomnis.gproto.service.pbsvcdeveloperB\023PBSvcFlinkDeveloperP\000Z:github.com/DataWorkbench/gproto/xgo/service/pbsvcdeveloper',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-proto/service/developer/flink_developer.proto\x12\tdeveloper\x1a\x1dproto/types/model/empty.proto\x1a)proto/types/request/flink_developer.proto\x1a*proto/types/response/flink_developer.proto2\xa6\x04\n\x0e\x46linkDeveloper\x12\x45\n\x0eSubmitFlinkJob\x12\x17.request.SubmitFlinkJob\x1a\x18.response.SubmitFlinkJob\"\x00\x12N\n\x11GetFlinkJobStatus\x12\x1a.request.GetFlinkJobStatus\x1a\x1b.response.GetFlinkJobStatus\"\x00\x12?\n\x0e\x43\x61ncelFlinkJob\x12\x17.request.CancelFlinkJob\x1a\x12.model.EmptyStruct\"\x00\x12K\n\x10ValidateFlinkJob\x12\x19.request.ValidateFlinkJob\x1a\x1a.response.ValidateFlinkJob\"\x00\x12P\n\x17ValidateFlinkJobContext\x12\x17.request.SubmitFlinkJob\x1a\x1a.response.ValidateFlinkJob\"\x00\x12M\n\x14ParseFlinkJobToGraph\x12\x17.request.SubmitFlinkJob\x1a\x1a.response.ValidateFlinkJob\"\x00\x12N\n\x11GetFlinkJobsByUrl\x12\x1a.request.GetFlinkJobsByUrl\x1a\x1b.response.GetFlinkJobsByUrl\"\x00\x42\x80\x01\n+com.dataomnis.gproto.service.pbsvcdeveloperB\x13PBSvcFlinkDeveloperP\x00Z:github.com/DataWorkbench/gproto/xgo/service/pbsvcdeveloperb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_empty__pb2.DESCRIPTOR,proto_dot_types_dot_request_dot_flink__developer__pb2.DESCRIPTOR,proto_dot_types_dot_response_dot_flink__developer__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_FLINKDEVELOPER = _descriptor.ServiceDescriptor(
  name='FlinkDeveloper',
  full_name='developer.FlinkDeveloper',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=179,
  serialized_end=729,
  methods=[
  _descriptor.MethodDescriptor(
    name='SubmitFlinkJob',
    full_name='developer.FlinkDeveloper.SubmitFlinkJob',
    index=0,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_flink__developer__pb2._SUBMITFLINKJOB,
    output_type=proto_dot_types_dot_response_dot_flink__developer__pb2._SUBMITFLINKJOB,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFlinkJobStatus',
    full_name='developer.FlinkDeveloper.GetFlinkJobStatus',
    index=1,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_flink__developer__pb2._GETFLINKJOBSTATUS,
    output_type=proto_dot_types_dot_response_dot_flink__developer__pb2._GETFLINKJOBSTATUS,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CancelFlinkJob',
    full_name='developer.FlinkDeveloper.CancelFlinkJob',
    index=2,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_flink__developer__pb2._CANCELFLINKJOB,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ValidateFlinkJob',
    full_name='developer.FlinkDeveloper.ValidateFlinkJob',
    index=3,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_flink__developer__pb2._VALIDATEFLINKJOB,
    output_type=proto_dot_types_dot_response_dot_flink__developer__pb2._VALIDATEFLINKJOB,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ValidateFlinkJobContext',
    full_name='developer.FlinkDeveloper.ValidateFlinkJobContext',
    index=4,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_flink__developer__pb2._SUBMITFLINKJOB,
    output_type=proto_dot_types_dot_response_dot_flink__developer__pb2._VALIDATEFLINKJOB,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ParseFlinkJobToGraph',
    full_name='developer.FlinkDeveloper.ParseFlinkJobToGraph',
    index=5,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_flink__developer__pb2._SUBMITFLINKJOB,
    output_type=proto_dot_types_dot_response_dot_flink__developer__pb2._VALIDATEFLINKJOB,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='GetFlinkJobsByUrl',
    full_name='developer.FlinkDeveloper.GetFlinkJobsByUrl',
    index=6,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_flink__developer__pb2._GETFLINKJOBSBYURL,
    output_type=proto_dot_types_dot_response_dot_flink__developer__pb2._GETFLINKJOBSBYURL,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_FLINKDEVELOPER)

DESCRIPTOR.services_by_name['FlinkDeveloper'] = _FLINKDEVELOPER

# @@protoc_insertion_point(module_scope)
