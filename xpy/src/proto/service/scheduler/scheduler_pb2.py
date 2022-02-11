# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/scheduler/scheduler.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import empty_pb2 as proto_dot_types_dot_model_dot_empty__pb2
from proto.types.request import scheduler_pb2 as proto_dot_types_dot_request_dot_scheduler__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/scheduler/scheduler.proto',
  package='scheduler',
  syntax='proto3',
  serialized_options=b'\n+com.dataomnis.gproto.service.pbsvcschedulerB\016PBSvcSchedulerP\000Z:github.com/DataWorkbench/gproto/xgo/service/pbsvcscheduler',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'proto/service/scheduler/scheduler.proto\x12\tscheduler\x1a\x1dproto/types/model/empty.proto\x1a#proto/types/request/scheduler.proto2\xbb\x02\n\tScheduler\x12\x41\n\x0fSubmitStreamJob\x12\x18.request.SubmitStreamJob\x1a\x12.model.EmptyStruct\"\x00\x12=\n\rStopStreamJob\x12\x16.request.StopStreamJob\x1a\x12.model.EmptyStruct\"\x00\x12W\n\x1a\x44\x65leteStreamJobsBySpaceIds\x12#.request.DeleteStreamJobsBySpaceIds\x1a\x12.model.EmptyStruct\"\x00\x12S\n\x18\x44\x65leteStreamJobsByJobIds\x12!.request.DeleteStreamJobsByJobIds\x1a\x12.model.EmptyStruct\"\x00\x42{\n+com.dataomnis.gproto.service.pbsvcschedulerB\x0ePBSvcSchedulerP\x00Z:github.com/DataWorkbench/gproto/xgo/service/pbsvcschedulerb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_empty__pb2.DESCRIPTOR,proto_dot_types_dot_request_dot_scheduler__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_SCHEDULER = _descriptor.ServiceDescriptor(
  name='Scheduler',
  full_name='scheduler.Scheduler',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=123,
  serialized_end=438,
  methods=[
  _descriptor.MethodDescriptor(
    name='SubmitStreamJob',
    full_name='scheduler.Scheduler.SubmitStreamJob',
    index=0,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_scheduler__pb2._SUBMITSTREAMJOB,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='StopStreamJob',
    full_name='scheduler.Scheduler.StopStreamJob',
    index=1,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_scheduler__pb2._STOPSTREAMJOB,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteStreamJobsBySpaceIds',
    full_name='scheduler.Scheduler.DeleteStreamJobsBySpaceIds',
    index=2,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_scheduler__pb2._DELETESTREAMJOBSBYSPACEIDS,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DeleteStreamJobsByJobIds',
    full_name='scheduler.Scheduler.DeleteStreamJobsByJobIds',
    index=3,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_scheduler__pb2._DELETESTREAMJOBSBYJOBIDS,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_SCHEDULER)

DESCRIPTOR.services_by_name['Scheduler'] = _SCHEDULER

# @@protoc_insertion_point(module_scope)