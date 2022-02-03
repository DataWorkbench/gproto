# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/member_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from github.com.yu31.protoc_plugin.proto import defaults_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/member_manage.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\025PBRequestMemberManageP\000Z3github.com/DataWorkbench/gproto/pkg/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'proto/types/request/member_manage.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\x32github.com/yu31/protoc-plugin/proto/defaults.proto\"8\n\x0fListSystemRoles\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\"y\n\x0bListMembers\x12&\n\x05limit\x18\x01 \x01(\x05\x42\x17\xa2\xa1\x1f\x06\xaa\x06\x03\x31\x30\x30\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x30\x00\x38\x64\x12\x1b\n\x06offset\x18\x02 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12%\n\x08space_id\x18\x03 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\"\xa8\x01\n\rUpsertMembers\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x37\n\x05users\x18\x02 \x03(\x0b\x32\x1b.request.UpsertMembers.PairB\x0b\xe2\xdf\x1f\x07\x12\x05\xea\x01\x02\x38\x64\x1a\x37\n\x04Pair\x12\x1d\n\x07user_id\x18\x02 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x88\x02\x41\x12\x10\n\x08role_ids\x18\x03 \x01(\t\"U\n\rDeleteMembers\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x1d\n\x08user_ids\x18\x02 \x03(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xea\x01\x02\x38\x64\x42t\n$com.dataomnis.gproto.types.pbrequestB\x15PBRequestMemberManageP\x00Z3github.com/DataWorkbench/gproto/pkg/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2.DESCRIPTOR,])




_LISTSYSTEMROLES = _descriptor.Descriptor(
  name='ListSystemRoles',
  full_name='request.ListSystemRoles',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ListSystemRoles.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=157,
  serialized_end=213,
)


_LISTMEMBERS = _descriptor.Descriptor(
  name='ListMembers',
  full_name='request.ListMembers',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.ListMembers.limit', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\242\241\037\006\252\006\003100\342\337\037\t\022\007\262\001\0040\0008d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.ListMembers.offset', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ListMembers.space_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=215,
  serialized_end=336,
)


_UPSERTMEMBERS_PAIR = _descriptor.Descriptor(
  name='Pair',
  full_name='request.UpsertMembers.Pair',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.UpsertMembers.Pair.user_id', index=0,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='role_ids', full_name='request.UpsertMembers.Pair.role_ids', index=1,
      number=3, type=9, cpp_type=9, label=1,
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
  serialized_start=452,
  serialized_end=507,
)

_UPSERTMEMBERS = _descriptor.Descriptor(
  name='UpsertMembers',
  full_name='request.UpsertMembers',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.UpsertMembers.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='users', full_name='request.UpsertMembers.users', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\352\001\0028d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_UPSERTMEMBERS_PAIR, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=339,
  serialized_end=507,
)


_DELETEMEMBERS = _descriptor.Descriptor(
  name='DeleteMembers',
  full_name='request.DeleteMembers',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DeleteMembers.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_ids', full_name='request.DeleteMembers.user_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\352\001\0028d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=509,
  serialized_end=594,
)

_UPSERTMEMBERS_PAIR.containing_type = _UPSERTMEMBERS
_UPSERTMEMBERS.fields_by_name['users'].message_type = _UPSERTMEMBERS_PAIR
DESCRIPTOR.message_types_by_name['ListSystemRoles'] = _LISTSYSTEMROLES
DESCRIPTOR.message_types_by_name['ListMembers'] = _LISTMEMBERS
DESCRIPTOR.message_types_by_name['UpsertMembers'] = _UPSERTMEMBERS
DESCRIPTOR.message_types_by_name['DeleteMembers'] = _DELETEMEMBERS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListSystemRoles = _reflection.GeneratedProtocolMessageType('ListSystemRoles', (_message.Message,), {
  'DESCRIPTOR' : _LISTSYSTEMROLES,
  '__module__' : 'proto.types.request.member_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ListSystemRoles)
  })
_sym_db.RegisterMessage(ListSystemRoles)

ListMembers = _reflection.GeneratedProtocolMessageType('ListMembers', (_message.Message,), {
  'DESCRIPTOR' : _LISTMEMBERS,
  '__module__' : 'proto.types.request.member_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ListMembers)
  })
_sym_db.RegisterMessage(ListMembers)

UpsertMembers = _reflection.GeneratedProtocolMessageType('UpsertMembers', (_message.Message,), {

  'Pair' : _reflection.GeneratedProtocolMessageType('Pair', (_message.Message,), {
    'DESCRIPTOR' : _UPSERTMEMBERS_PAIR,
    '__module__' : 'proto.types.request.member_manage_pb2'
    # @@protoc_insertion_point(class_scope:request.UpsertMembers.Pair)
    })
  ,
  'DESCRIPTOR' : _UPSERTMEMBERS,
  '__module__' : 'proto.types.request.member_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.UpsertMembers)
  })
_sym_db.RegisterMessage(UpsertMembers)
_sym_db.RegisterMessage(UpsertMembers.Pair)

DeleteMembers = _reflection.GeneratedProtocolMessageType('DeleteMembers', (_message.Message,), {
  'DESCRIPTOR' : _DELETEMEMBERS,
  '__module__' : 'proto.types.request.member_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DeleteMembers)
  })
_sym_db.RegisterMessage(DeleteMembers)


DESCRIPTOR._options = None
_LISTSYSTEMROLES.fields_by_name['space_id']._options = None
_LISTMEMBERS.fields_by_name['limit']._options = None
_LISTMEMBERS.fields_by_name['offset']._options = None
_LISTMEMBERS.fields_by_name['space_id']._options = None
_UPSERTMEMBERS_PAIR.fields_by_name['user_id']._options = None
_UPSERTMEMBERS.fields_by_name['space_id']._options = None
_UPSERTMEMBERS.fields_by_name['users']._options = None
_DELETEMEMBERS.fields_by_name['space_id']._options = None
_DELETEMEMBERS.fields_by_name['user_ids']._options = None
# @@protoc_insertion_point(module_scope)
