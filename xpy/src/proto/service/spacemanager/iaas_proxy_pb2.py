# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/spacemanager/iaas_proxy.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.request import iaas_proxy_pb2 as proto_dot_types_dot_request_dot_iaas__proxy__pb2
from proto.types.response import iaas_proxy_pb2 as proto_dot_types_dot_response_dot_iaas__proxy__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/spacemanager/iaas_proxy.proto',
  package='spacemanager',
  syntax='proto3',
  serialized_options=b'\n\'com.dataomnis.gproto.service.pbsvcspaceB\016PBSvcIaaSProxyP\000Z6github.com/DataWorkbench/gproto/xgo/service/pbsvcspace',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n+proto/service/spacemanager/iaas_proxy.proto\x12\x0cspacemanager\x1a$proto/types/request/iaas_proxy.proto\x1a%proto/types/response/iaas_proxy.proto2\xae\x01\n\tIaaSProxy\x12H\n\x0fListIaaSRouters\x12\x18.request.ListIaaSRouters\x1a\x19.response.ListIaaSRouters\"\x00\x12W\n\x14ListIaaSRouterVXNets\x12\x1d.request.ListIaaSRouterVXNets\x1a\x1e.response.ListIaaSRouterVXNets\"\x00\x42s\n\'com.dataomnis.gproto.service.pbsvcspaceB\x0ePBSvcIaaSProxyP\x00Z6github.com/DataWorkbench/gproto/xgo/service/pbsvcspaceb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_request_dot_iaas__proxy__pb2.DESCRIPTOR,proto_dot_types_dot_response_dot_iaas__proxy__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_IAASPROXY = _descriptor.ServiceDescriptor(
  name='IaaSProxy',
  full_name='spacemanager.IaaSProxy',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=139,
  serialized_end=313,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListIaaSRouters',
    full_name='spacemanager.IaaSProxy.ListIaaSRouters',
    index=0,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_iaas__proxy__pb2._LISTIAASROUTERS,
    output_type=proto_dot_types_dot_response_dot_iaas__proxy__pb2._LISTIAASROUTERS,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListIaaSRouterVXNets',
    full_name='spacemanager.IaaSProxy.ListIaaSRouterVXNets',
    index=1,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_iaas__proxy__pb2._LISTIAASROUTERVXNETS,
    output_type=proto_dot_types_dot_response_dot_iaas__proxy__pb2._LISTIAASROUTERVXNETS,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_IAASPROXY)

DESCRIPTOR.services_by_name['IaaSProxy'] = _IAASPROXY

# @@protoc_insertion_point(module_scope)
