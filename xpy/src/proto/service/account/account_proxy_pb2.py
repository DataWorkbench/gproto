# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/account/account_proxy.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.request import account_proxy_pb2 as proto_dot_types_dot_request_dot_account__proxy__pb2
from proto.types.response import account_proxy_pb2 as proto_dot_types_dot_response_dot_account__proxy__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/account/account_proxy.proto',
  package='account',
  syntax='proto3',
  serialized_options=b'\n)com.dataomnis.gproto.service.pbsvcaccountB\021PBSvcAccountProxyP\000Z8github.com/DataWorkbench/gproto/xgo/service/pbsvcaccount',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)proto/service/account/account_proxy.proto\x12\x07\x61\x63\x63ount\x1a\'proto/types/request/account_proxy.proto\x1a(proto/types/response/account_proxy.proto2\xa5\x02\n\x0c\x41\x63\x63ountProxy\x12K\n\x10ListUsersByProxy\x12\x19.request.ListUsersByProxy\x1a\x1a.response.ListUsersByProxy\"\x00\x12\x63\n\x18\x44\x65scribeAccessKeyByProxy\x12!.request.DescribeAccessKeyByProxy\x1a\".response.DescribeAccessKeyByProxy\"\x00\x12\x63\n\x18ListNotificationsByProxy\x12!.request.ListNotificationsByProxy\x1a\".response.ListNotificationsByProxy\"\x00\x42z\n)com.dataomnis.gproto.service.pbsvcaccountB\x11PBSvcAccountProxyP\x00Z8github.com/DataWorkbench/gproto/xgo/service/pbsvcaccountb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_request_dot_account__proxy__pb2.DESCRIPTOR,proto_dot_types_dot_response_dot_account__proxy__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_ACCOUNTPROXY = _descriptor.ServiceDescriptor(
  name='AccountProxy',
  full_name='account.AccountProxy',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=138,
  serialized_end=431,
  methods=[
  _descriptor.MethodDescriptor(
    name='ListUsersByProxy',
    full_name='account.AccountProxy.ListUsersByProxy',
    index=0,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_account__proxy__pb2._LISTUSERSBYPROXY,
    output_type=proto_dot_types_dot_response_dot_account__proxy__pb2._LISTUSERSBYPROXY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeAccessKeyByProxy',
    full_name='account.AccountProxy.DescribeAccessKeyByProxy',
    index=1,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_account__proxy__pb2._DESCRIBEACCESSKEYBYPROXY,
    output_type=proto_dot_types_dot_response_dot_account__proxy__pb2._DESCRIBEACCESSKEYBYPROXY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListNotificationsByProxy',
    full_name='account.AccountProxy.ListNotificationsByProxy',
    index=2,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_account__proxy__pb2._LISTNOTIFICATIONSBYPROXY,
    output_type=proto_dot_types_dot_response_dot_account__proxy__pb2._LISTNOTIFICATIONSBYPROXY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_ACCOUNTPROXY)

DESCRIPTOR.services_by_name['AccountProxy'] = _ACCOUNTPROXY

# @@protoc_insertion_point(module_scope)