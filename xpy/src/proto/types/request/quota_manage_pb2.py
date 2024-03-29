# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/quota_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from proto.types.model import quota_pb2 as proto_dot_types_dot_model_dot_quota__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/quota_manage.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\024PBRequestQuotaManageP\000Z3github.com/DataWorkbench/gproto/xgo/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&proto/types/request/quota_manage.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\x1dproto/types/model/quota.proto\"5\n\x11\x44\x65scribeUserQuota\x12 \n\x07user_id\x18\x01 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x00\x88\x02\x41\"d\n\x0fUpsertUserQuota\x12 \n\x07user_id\x18\x01 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x00\x88\x02\x41\x12/\n\tquota_set\x18\x02 \x01(\x0b\x32\x0f.model.QuotaSetB\x0b\xe2\xdf\x1f\x07\x12\x05\xe2\x01\x02\x10\x01\"a\n\x16\x44\x65scribeWorkspaceQuota\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12 \n\x0bspace_owner\x18\x02 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\"\x94\x01\n\x14UpsertWorkspaceQuota\x12$\n\x0bspace_owner\x18\x01 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x00\x88\x02\x41\x12%\n\x08space_id\x18\x02 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12/\n\tquota_set\x18\x03 \x01(\x0b\x32\x0f.model.QuotaSetB\x0b\xe2\xdf\x1f\x07\x12\x05\xe2\x01\x02\x10\x01\"\x80\x01\n\x13\x44\x65scribeMemberQuota\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12 \n\x07user_id\x18\x02 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x00\x88\x02\x41\x12 \n\x0bspace_owner\x18\x03 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\"\xb3\x01\n\x11UpsertMemberQuota\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12 \n\x07user_id\x18\x02 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x00\x88\x02\x41\x12$\n\x0bspace_owner\x18\x03 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x00\x88\x02\x41\x12/\n\tquota_set\x18\x04 \x01(\x0b\x32\x0f.model.QuotaSetB\x0b\xe2\xdf\x1f\x07\x12\x05\xe2\x01\x02\x10\x01\x42s\n$com.dataomnis.gproto.types.pbrequestB\x14PBRequestQuotaManageP\x00Z3github.com/DataWorkbench/gproto/xgo/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_quota__pb2.DESCRIPTOR,])




_DESCRIBEUSERQUOTA = _descriptor.Descriptor(
  name='DescribeUserQuota',
  full_name='request.DescribeUserQuota',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.DescribeUserQuota.user_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\000\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=135,
  serialized_end=188,
)


_UPSERTUSERQUOTA = _descriptor.Descriptor(
  name='UpsertUserQuota',
  full_name='request.UpsertUserQuota',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.UpsertUserQuota.user_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\000\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quota_set', full_name='request.UpsertUserQuota.quota_set', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\342\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=190,
  serialized_end=290,
)


_DESCRIBEWORKSPACEQUOTA = _descriptor.Descriptor(
  name='DescribeWorkspaceQuota',
  full_name='request.DescribeWorkspaceQuota',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DescribeWorkspaceQuota.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_owner', full_name='request.DescribeWorkspaceQuota.space_owner', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\302\001\002\"\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=292,
  serialized_end=389,
)


_UPSERTWORKSPACEQUOTA = _descriptor.Descriptor(
  name='UpsertWorkspaceQuota',
  full_name='request.UpsertWorkspaceQuota',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_owner', full_name='request.UpsertWorkspaceQuota.space_owner', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\000\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.UpsertWorkspaceQuota.space_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quota_set', full_name='request.UpsertWorkspaceQuota.quota_set', index=2,
      number=3, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\342\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=392,
  serialized_end=540,
)


_DESCRIBEMEMBERQUOTA = _descriptor.Descriptor(
  name='DescribeMemberQuota',
  full_name='request.DescribeMemberQuota',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DescribeMemberQuota.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.DescribeMemberQuota.user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\000\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_owner', full_name='request.DescribeMemberQuota.space_owner', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\302\001\002\"\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=543,
  serialized_end=671,
)


_UPSERTMEMBERQUOTA = _descriptor.Descriptor(
  name='UpsertMemberQuota',
  full_name='request.UpsertMemberQuota',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.UpsertMemberQuota.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.UpsertMemberQuota.user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\000\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_owner', full_name='request.UpsertMemberQuota.space_owner', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\000\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='quota_set', full_name='request.UpsertMemberQuota.quota_set', index=3,
      number=4, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\342\001\002\020\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=674,
  serialized_end=853,
)

_UPSERTUSERQUOTA.fields_by_name['quota_set'].message_type = proto_dot_types_dot_model_dot_quota__pb2._QUOTASET
_UPSERTWORKSPACEQUOTA.fields_by_name['quota_set'].message_type = proto_dot_types_dot_model_dot_quota__pb2._QUOTASET
_UPSERTMEMBERQUOTA.fields_by_name['quota_set'].message_type = proto_dot_types_dot_model_dot_quota__pb2._QUOTASET
DESCRIPTOR.message_types_by_name['DescribeUserQuota'] = _DESCRIBEUSERQUOTA
DESCRIPTOR.message_types_by_name['UpsertUserQuota'] = _UPSERTUSERQUOTA
DESCRIPTOR.message_types_by_name['DescribeWorkspaceQuota'] = _DESCRIBEWORKSPACEQUOTA
DESCRIPTOR.message_types_by_name['UpsertWorkspaceQuota'] = _UPSERTWORKSPACEQUOTA
DESCRIPTOR.message_types_by_name['DescribeMemberQuota'] = _DESCRIBEMEMBERQUOTA
DESCRIPTOR.message_types_by_name['UpsertMemberQuota'] = _UPSERTMEMBERQUOTA
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DescribeUserQuota = _reflection.GeneratedProtocolMessageType('DescribeUserQuota', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEUSERQUOTA,
  '__module__' : 'proto.types.request.quota_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeUserQuota)
  })
_sym_db.RegisterMessage(DescribeUserQuota)

UpsertUserQuota = _reflection.GeneratedProtocolMessageType('UpsertUserQuota', (_message.Message,), {
  'DESCRIPTOR' : _UPSERTUSERQUOTA,
  '__module__' : 'proto.types.request.quota_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.UpsertUserQuota)
  })
_sym_db.RegisterMessage(UpsertUserQuota)

DescribeWorkspaceQuota = _reflection.GeneratedProtocolMessageType('DescribeWorkspaceQuota', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEWORKSPACEQUOTA,
  '__module__' : 'proto.types.request.quota_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeWorkspaceQuota)
  })
_sym_db.RegisterMessage(DescribeWorkspaceQuota)

UpsertWorkspaceQuota = _reflection.GeneratedProtocolMessageType('UpsertWorkspaceQuota', (_message.Message,), {
  'DESCRIPTOR' : _UPSERTWORKSPACEQUOTA,
  '__module__' : 'proto.types.request.quota_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.UpsertWorkspaceQuota)
  })
_sym_db.RegisterMessage(UpsertWorkspaceQuota)

DescribeMemberQuota = _reflection.GeneratedProtocolMessageType('DescribeMemberQuota', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEMEMBERQUOTA,
  '__module__' : 'proto.types.request.quota_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeMemberQuota)
  })
_sym_db.RegisterMessage(DescribeMemberQuota)

UpsertMemberQuota = _reflection.GeneratedProtocolMessageType('UpsertMemberQuota', (_message.Message,), {
  'DESCRIPTOR' : _UPSERTMEMBERQUOTA,
  '__module__' : 'proto.types.request.quota_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.UpsertMemberQuota)
  })
_sym_db.RegisterMessage(UpsertMemberQuota)


DESCRIPTOR._options = None
_DESCRIBEUSERQUOTA.fields_by_name['user_id']._options = None
_UPSERTUSERQUOTA.fields_by_name['user_id']._options = None
_UPSERTUSERQUOTA.fields_by_name['quota_set']._options = None
_DESCRIBEWORKSPACEQUOTA.fields_by_name['space_id']._options = None
_DESCRIBEWORKSPACEQUOTA.fields_by_name['space_owner']._options = None
_UPSERTWORKSPACEQUOTA.fields_by_name['space_owner']._options = None
_UPSERTWORKSPACEQUOTA.fields_by_name['space_id']._options = None
_UPSERTWORKSPACEQUOTA.fields_by_name['quota_set']._options = None
_DESCRIBEMEMBERQUOTA.fields_by_name['space_id']._options = None
_DESCRIBEMEMBERQUOTA.fields_by_name['user_id']._options = None
_DESCRIBEMEMBERQUOTA.fields_by_name['space_owner']._options = None
_UPSERTMEMBERQUOTA.fields_by_name['space_id']._options = None
_UPSERTMEMBERQUOTA.fields_by_name['user_id']._options = None
_UPSERTMEMBERQUOTA.fields_by_name['space_owner']._options = None
_UPSERTMEMBERQUOTA.fields_by_name['quota_set']._options = None
# @@protoc_insertion_point(module_scope)
