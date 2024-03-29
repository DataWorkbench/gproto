# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/spacemanager/quota_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import empty_pb2 as proto_dot_types_dot_model_dot_empty__pb2
from proto.types.request import quota_manage_pb2 as proto_dot_types_dot_request_dot_quota__manage__pb2
from proto.types.response import quota_manage_pb2 as proto_dot_types_dot_response_dot_quota__manage__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/spacemanager/quota_manage.proto',
  package='spacemanager',
  syntax='proto3',
  serialized_options=b'\n\'com.dataomnis.gproto.service.pbsvcspaceB\020PBSvcQuotaManageP\000Z6github.com/DataWorkbench/gproto/xgo/service/pbsvcspace',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-proto/service/spacemanager/quota_manage.proto\x12\x0cspacemanager\x1a\x1dproto/types/model/empty.proto\x1a&proto/types/request/quota_manage.proto\x1a\'proto/types/response/quota_manage.proto2\xe9\x03\n\x0bQuotaManage\x12N\n\x11\x44\x65scribeUserQuota\x12\x1a.request.DescribeUserQuota\x1a\x1b.response.DescribeUserQuota\"\x00\x12\x41\n\x0fUpsertUserQuota\x12\x18.request.UpsertUserQuota\x1a\x12.model.EmptyStruct\"\x00\x12]\n\x16\x44\x65scribeWorkspaceQuota\x12\x1f.request.DescribeWorkspaceQuota\x1a .response.DescribeWorkspaceQuota\"\x00\x12K\n\x14UpsertWorkspaceQuota\x12\x1d.request.UpsertWorkspaceQuota\x1a\x12.model.EmptyStruct\"\x00\x12T\n\x13\x44\x65scribeMemberQuota\x12\x1c.request.DescribeMemberQuota\x1a\x1d.response.DescribeMemberQuota\"\x00\x12\x45\n\x11UpsertMemberQuota\x12\x1a.request.UpsertMemberQuota\x1a\x12.model.EmptyStruct\"\x00\x42u\n\'com.dataomnis.gproto.service.pbsvcspaceB\x10PBSvcQuotaManageP\x00Z6github.com/DataWorkbench/gproto/xgo/service/pbsvcspaceb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_empty__pb2.DESCRIPTOR,proto_dot_types_dot_request_dot_quota__manage__pb2.DESCRIPTOR,proto_dot_types_dot_response_dot_quota__manage__pb2.DESCRIPTOR,])



_sym_db.RegisterFileDescriptor(DESCRIPTOR)


DESCRIPTOR._options = None

_QUOTAMANAGE = _descriptor.ServiceDescriptor(
  name='QuotaManage',
  full_name='spacemanager.QuotaManage',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=176,
  serialized_end=665,
  methods=[
  _descriptor.MethodDescriptor(
    name='DescribeUserQuota',
    full_name='spacemanager.QuotaManage.DescribeUserQuota',
    index=0,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_quota__manage__pb2._DESCRIBEUSERQUOTA,
    output_type=proto_dot_types_dot_response_dot_quota__manage__pb2._DESCRIBEUSERQUOTA,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpsertUserQuota',
    full_name='spacemanager.QuotaManage.UpsertUserQuota',
    index=1,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_quota__manage__pb2._UPSERTUSERQUOTA,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeWorkspaceQuota',
    full_name='spacemanager.QuotaManage.DescribeWorkspaceQuota',
    index=2,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_quota__manage__pb2._DESCRIBEWORKSPACEQUOTA,
    output_type=proto_dot_types_dot_response_dot_quota__manage__pb2._DESCRIBEWORKSPACEQUOTA,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpsertWorkspaceQuota',
    full_name='spacemanager.QuotaManage.UpsertWorkspaceQuota',
    index=3,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_quota__manage__pb2._UPSERTWORKSPACEQUOTA,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='DescribeMemberQuota',
    full_name='spacemanager.QuotaManage.DescribeMemberQuota',
    index=4,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_quota__manage__pb2._DESCRIBEMEMBERQUOTA,
    output_type=proto_dot_types_dot_response_dot_quota__manage__pb2._DESCRIBEMEMBERQUOTA,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='UpsertMemberQuota',
    full_name='spacemanager.QuotaManage.UpsertMemberQuota',
    index=5,
    containing_service=None,
    input_type=proto_dot_types_dot_request_dot_quota__manage__pb2._UPSERTMEMBERQUOTA,
    output_type=proto_dot_types_dot_model_dot_empty__pb2._EMPTYSTRUCT,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_QUOTAMANAGE)

DESCRIPTOR.services_by_name['QuotaManage'] = _QUOTAMANAGE

# @@protoc_insertion_point(module_scope)
