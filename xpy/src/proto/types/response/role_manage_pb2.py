# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/response/role_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import role_pb2 as proto_dot_types_dot_model_dot_role__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/response/role_manage.proto',
  package='response',
  syntax='proto3',
  serialized_options=b'\n%com.dataomnis.gproto.types.pbresponseB\024PBResponseRoleManageP\000Z4github.com/DataWorkbench/gproto/xgo/types/pbresponse',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&proto/types/response/role_manage.proto\x12\x08response\x1a\x1cproto/types/model/role.proto\"3\n\x0fListSystemRoles\x12 \n\x05infos\x18\x01 \x03(\x0b\x32\x11.model.SystemRole\"@\n\x19ListSystemRolePermissions\x12#\n\x05infos\x18\x01 \x03(\x0b\x32\x14.model.ProjectModuleBu\n%com.dataomnis.gproto.types.pbresponseB\x14PBResponseRoleManageP\x00Z4github.com/DataWorkbench/gproto/xgo/types/pbresponseb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_role__pb2.DESCRIPTOR,])




_LISTSYSTEMROLES = _descriptor.Descriptor(
  name='ListSystemRoles',
  full_name='response.ListSystemRoles',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.ListSystemRoles.infos', index=0,
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
  serialized_start=82,
  serialized_end=133,
)


_LISTSYSTEMROLEPERMISSIONS = _descriptor.Descriptor(
  name='ListSystemRolePermissions',
  full_name='response.ListSystemRolePermissions',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.ListSystemRolePermissions.infos', index=0,
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
  serialized_start=135,
  serialized_end=199,
)

_LISTSYSTEMROLES.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_role__pb2._SYSTEMROLE
_LISTSYSTEMROLEPERMISSIONS.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_role__pb2._PROJECTMODULE
DESCRIPTOR.message_types_by_name['ListSystemRoles'] = _LISTSYSTEMROLES
DESCRIPTOR.message_types_by_name['ListSystemRolePermissions'] = _LISTSYSTEMROLEPERMISSIONS
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListSystemRoles = _reflection.GeneratedProtocolMessageType('ListSystemRoles', (_message.Message,), {
  'DESCRIPTOR' : _LISTSYSTEMROLES,
  '__module__' : 'proto.types.response.role_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.ListSystemRoles)
  })
_sym_db.RegisterMessage(ListSystemRoles)

ListSystemRolePermissions = _reflection.GeneratedProtocolMessageType('ListSystemRolePermissions', (_message.Message,), {
  'DESCRIPTOR' : _LISTSYSTEMROLEPERMISSIONS,
  '__module__' : 'proto.types.response.role_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.ListSystemRolePermissions)
  })
_sym_db.RegisterMessage(ListSystemRolePermissions)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)