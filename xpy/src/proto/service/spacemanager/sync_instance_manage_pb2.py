# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/spacemanager/sync_instance_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import empty_pb2 as proto_dot_types_dot_model_dot_empty__pb2
from proto.types.request import sync_instance_manage_pb2 as proto_dot_types_dot_request_dot_sync__instance__manage__pb2
from proto.types.response import sync_instance_manage_pb2 as proto_dot_types_dot_response_dot_sync__instance__manage__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/spacemanager/sync_instance_manage.proto',
  package='spacemanager',
  syntax='proto3',
  serialized_options=b'\n\'com.dataomnis.gproto.service.pbsvcspaceB\027PBSvcSyncInstanceManageP\000Z6github.com/DataWorkbench/gproto/xgo/service/pbsvcspace',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n5proto/service/spacemanager/sync_instance_manage.proto\x12\x0cspacemanager\x1a\x1dproto/types/model/empty.proto\x1a.proto/types/request/sync_instance_manage.proto\x1a/proto/types/response/sync_instance_manage.proto2\xce\x04\n\x12SyncInstanceManage\x12N\n\x11ListSyncInstances\x12\x1a.request.ListSyncInstances\x1a\x1b.response.ListSyncInstances\"\x00\x12O\n\x16TerminateSyncInstances\x12\x1f.request.TerminateSyncInstances\x1a\x12.model.EmptyStruct\"\x00\x12K\n\x14SuspendSyncInstances\x12\x1d.request.SuspendSyncInstances\x1a\x12.model.EmptyStruct\"\x00\x12I\n\x13ResumeSyncInstances\x12\x1c.request.ResumeSyncInstances\x1a\x12.model.EmptyStruct\"\x00\x12W\n\x14\x44\x65scribeSyncInstance\x12\x1d.request.DescribeSyncInstance\x1a\x1e.response.DescribeSyncInstance\"\x00\x12S\n\x18\x43reateSyncInstanceWithId\x12!.request.CreateSyncInstanceWithId\x1a\x12.model.EmptyStruct\"\x00\x12Q\n\x17UpdateSyncInstanceState\x12 .request.UpdateSyncInstanceState\x1a\x12.model.EmptyStruct\"\x00\x42|\n\'com.dataomnis.gproto.service.pbsvcspaceB\x17PBSvcSyncInstanceManageP\x00Z6github.com/DataWorkbench/gproto/xgo/service/pbsvcspaceb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_empty__pb2.DESCRIPTOR,proto_dot_types_dot_request_dot_sync__instance__manage__pb2.DESCRIPTOR,proto_dot_types_dot_response_dot_sync__instance__manage__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_SYNCINSTANCEMANAGE = _descriptor.ServiceDescriptor(
  name='SyncInstanceManage',
  full_name='spacemanager.SyncInstanceManage',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=200,
  serialized_end=790,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListSyncInstances',
    full_name='spacemanager.SyncInstanceManage.ListSyncInstances',
    index=0,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_sync__instance__manage__pb2._LISTSYNCINSTANCES,
    output_type=proto_dot_types_dot_response_dot_sync__instance__manage__pb2._LISTSYNCINSTANCES,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='TerminateSyncInstances',
    full_name='spacemanager.SyncInstanceManage.TerminateSyncInstances',
    index=1,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_sync__instance__manage__pb2._TERMINATESYNCINSTANCES,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='SuspendSyncInstances',
    full_name='spacemanager.SyncInstanceManage.SuspendSyncInstances',
    index=2,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_sync__instance__manage__pb2._SUSPENDSYNCINSTANCES,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ResumeSyncInstances',
    full_name='spacemanager.SyncInstanceManage.ResumeSyncInstances',
    index=3,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_sync__instance__manage__pb2._RESUMESYNCINSTANCES,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeSyncInstance',
    full_name='spacemanager.SyncInstanceManage.DescribeSyncInstance',
    index=4,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_sync__instance__manage__pb2._DESCRIBESYNCINSTANCE,
    output_type=proto_dot_types_dot_response_dot_sync__instance__manage__pb2._DESCRIBESYNCINSTANCE,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='CreateSyncInstanceWithId',
    full_name='spacemanager.SyncInstanceManage.CreateSyncInstanceWithId',
    index=5,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_sync__instance__manage__pb2._CREATESYNCINSTANCEWITHID,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpdateSyncInstanceState',
    full_name='spacemanager.SyncInstanceManage.UpdateSyncInstanceState',
    index=6,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_sync__instance__manage__pb2._UPDATESYNCINSTANCESTATE,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_SYNCINSTANCEMANAGE)

DESCRIPTOR.services_by_name['SyncInstanceManage'] = _SYNCINSTANCEMANAGE

# @@protoc_insertion_point(module_scope)
