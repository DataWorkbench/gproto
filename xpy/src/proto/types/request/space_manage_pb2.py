# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/space_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from github.com.yu31.protoc_plugin.proto import defaults_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2
from proto.types.model import workspace_pb2 as proto_dot_types_dot_model_dot_workspace__pb2
from proto.types.model import role_pb2 as proto_dot_types_dot_model_dot_role__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/space_manage.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\024PBRequestSpaceManageP\000Z3github.com/DataWorkbench/gproto/xgo/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&proto/types/request/space_manage.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\x32github.com/yu31/protoc-plugin/proto/defaults.proto\x1a!proto/types/model/workspace.proto\x1a\x1cproto/types/model/role.proto\"\xa9\x02\n\x0eListWorkspaces\x12 \n\x07user_id\x18\x06 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x01\x88\x02\x41\x12&\n\x05limit\x18\x01 \x01(\x05\x42\x17\xa2\xa1\x1f\x06\xaa\x06\x03\x31\x30\x30\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x30\x00\x38\x64\x12\x1b\n\x06offset\x18\x02 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12\x38\n\x07sort_by\x18\x03 \x01(\tB\'\xe2\xdf\x1f#\x12!\xc2\x01\x1eJ\x00J\x02idJ\x04nameJ\x07\x63reatedJ\x07updated\x12\x0f\n\x07reverse\x18\x04 \x01(\x08\x12\x0e\n\x06search\x18\x05 \x01(\t\x12\x34\n\x06status\x18\x07 \x01(\x0e\x32\x17.model.Workspace.StatusB\x0b\xe2\xdf\x1f\x07\x12\x05\xda\x01\x02X\x01\x12\x0c\n\x04name\x18\x08 \x01(\t\x12\x11\n\tspace_ids\x18\t \x03(\t\"f\n\x10\x44\x65leteWorkspaces\x12,\n\tspace_ids\x18\x01 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04wks-\x12$\n\x0breq_user_id\x18\x02 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x01\x88\x02\x41\"g\n\x11\x44isableWorkspaces\x12,\n\tspace_ids\x18\x01 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04wks-\x12$\n\x0breq_user_id\x18\x02 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x01\x88\x02\x41\"z\n\x10\x45nableWorkspaces\x12,\n\tspace_ids\x18\x01 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04wks-\x12\x12\n\nresume_job\x18\x02 \x01(\x08\x12$\n\x0breq_user_id\x18\x03 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x01\x88\x02\x41\"\x93\x01\n\x0f\x43reateWorkspace\x12\x1e\n\x05owner\x18\x01 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x01\x88\x02\x41\x12\x1e\n\x04name\x18\x02 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\xc0\x01\x02\xc8\x01\x80\x01\x12\x1b\n\x04\x64\x65sc\x18\x03 \x01(\tB\r\xe2\xdf\x1f\t\x12\x07\xc2\x01\x04\xc8\x01\x80\x08\x12\x11\n\trouter_id\x18\x05 \x01(\t\x12\x10\n\x08vxnet_id\x18\x06 \x01(\t\"u\n\x0fUpdateWorkspace\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x1e\n\x04name\x18\x02 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\xc0\x01\x02\xc8\x01\x80\x01\x12\x1b\n\x04\x64\x65sc\x18\x03 \x01(\tB\r\xe2\xdf\x1f\t\x12\x07\xc2\x01\x04\xc8\x01\x80\x08\":\n\x11\x44\x65scribeWorkspace\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\"\xe6\x02\n\x0f\x43heckPermission\x12$\n\x0breq_user_id\x18\x01 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x01\x88\x02\x41\x12%\n\x08space_id\x18\x02 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12&\n\tmodule_id\x18\x03 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04pmo-\x12<\n\tperm_type\x18\x04 \x01(\x0e\x32\x1a.model.ProjectAPI.PermTypeB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12\x1e\n\x08\x61pi_name\x18\x05 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x80\x02\x00\x12L\n\x0csystem_roles\x18\x06 \x03(\x0b\x32).request.CheckPermission.SystemRolesEntryB\x0b\xe2\xdf\x1f\x07\x12\x05\xf2\x01\x02\x30\x00\x1a\x32\n\x10SystemRolesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x08:\x02\x38\x01\">\n\x15\x44\x65scribeNetworkConfig\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\"\x88\x01\n\x14\x41ttachVPCToWorkspace\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12#\n\trouter_id\x18\x02 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\xca\x02\x04rtr-\x12$\n\x08vxnet_id\x18\x03 \x01(\tB\x12\xe2\xdf\x1f\x0e\x12\x0c\xc2\x01\t\xca\x02\x06vxnet-\"?\n\x16\x44\x65tachVPCFromWorkspace\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-Bs\n$com.dataomnis.gproto.types.pbrequestB\x14PBRequestSpaceManageP\x00Z3github.com/DataWorkbench/gproto/xgo/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_workspace__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_role__pb2.DESCRIPTOR,])




_LISTWORKSPACES = _descriptor.Descriptor(
  name='ListWorkspaces',
  full_name='request.ListWorkspaces',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.ListWorkspaces.user_id', index=0,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\001\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.ListWorkspaces.limit', index=1,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\242\241\037\006\252\006\003100\342\337\037\t\022\007\262\001\0040\0008d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.ListWorkspaces.offset', index=2,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sort_by', full_name='request.ListWorkspaces.sort_by', index=3,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037#\022!\302\001\036J\000J\002idJ\004nameJ\007createdJ\007updated', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reverse', full_name='request.ListWorkspaces.reverse', index=4,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search', full_name='request.ListWorkspaces.search', index=5,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='request.ListWorkspaces.status', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\332\001\002X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='request.ListWorkspaces.name', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_ids', full_name='request.ListWorkspaces.space_ids', index=8,
      number=9, type=9, cpp_type=9, label=3,
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
  serialized_start=222,
  serialized_end=519,
)


_DELETEWORKSPACES = _descriptor.Descriptor(
  name='DeleteWorkspaces',
  full_name='request.DeleteWorkspaces',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_ids', full_name='request.DeleteWorkspaces.space_ids', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_user_id', full_name='request.DeleteWorkspaces.req_user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\001\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=521,
  serialized_end=623,
)


_DISABLEWORKSPACES = _descriptor.Descriptor(
  name='DisableWorkspaces',
  full_name='request.DisableWorkspaces',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_ids', full_name='request.DisableWorkspaces.space_ids', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_user_id', full_name='request.DisableWorkspaces.req_user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\001\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=625,
  serialized_end=728,
)


_ENABLEWORKSPACES = _descriptor.Descriptor(
  name='EnableWorkspaces',
  full_name='request.EnableWorkspaces',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_ids', full_name='request.EnableWorkspaces.space_ids', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='resume_job', full_name='request.EnableWorkspaces.resume_job', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_user_id', full_name='request.EnableWorkspaces.req_user_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\001\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=730,
  serialized_end=852,
)


_CREATEWORKSPACE = _descriptor.Descriptor(
  name='CreateWorkspace',
  full_name='request.CreateWorkspace',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='owner', full_name='request.CreateWorkspace.owner', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\001\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='request.CreateWorkspace.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\014\022\n\302\001\007\300\001\002\310\001\200\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='desc', full_name='request.CreateWorkspace.desc', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\302\001\004\310\001\200\010', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='router_id', full_name='request.CreateWorkspace.router_id', index=3,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vxnet_id', full_name='request.CreateWorkspace.vxnet_id', index=4,
      number=6, type=9, cpp_type=9, label=1,
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
  serialized_start=855,
  serialized_end=1002,
)


_UPDATEWORKSPACE = _descriptor.Descriptor(
  name='UpdateWorkspace',
  full_name='request.UpdateWorkspace',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.UpdateWorkspace.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='request.UpdateWorkspace.name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\014\022\n\302\001\007\300\001\002\310\001\200\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='desc', full_name='request.UpdateWorkspace.desc', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\302\001\004\310\001\200\010', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1004,
  serialized_end=1121,
)


_DESCRIBEWORKSPACE = _descriptor.Descriptor(
  name='DescribeWorkspace',
  full_name='request.DescribeWorkspace',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DescribeWorkspace.space_id', index=0,
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
  serialized_start=1123,
  serialized_end=1181,
)


_CHECKPERMISSION_SYSTEMROLESENTRY = _descriptor.Descriptor(
  name='SystemRolesEntry',
  full_name='request.CheckPermission.SystemRolesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='request.CheckPermission.SystemRolesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='request.CheckPermission.SystemRolesEntry.value', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1492,
  serialized_end=1542,
)

_CHECKPERMISSION = _descriptor.Descriptor(
  name='CheckPermission',
  full_name='request.CheckPermission',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='req_user_id', full_name='request.CheckPermission.req_user_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\001\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.CheckPermission.space_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='module_id', full_name='request.CheckPermission.module_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004pmo-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='perm_type', full_name='request.CheckPermission.perm_type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='api_name', full_name='request.CheckPermission.api_name', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\200\002\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='system_roles', full_name='request.CheckPermission.system_roles', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\362\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_CHECKPERMISSION_SYSTEMROLESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1184,
  serialized_end=1542,
)


_DESCRIBENETWORKCONFIG = _descriptor.Descriptor(
  name='DescribeNetworkConfig',
  full_name='request.DescribeNetworkConfig',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DescribeNetworkConfig.space_id', index=0,
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
  serialized_start=1544,
  serialized_end=1606,
)


_ATTACHVPCTOWORKSPACE = _descriptor.Descriptor(
  name='AttachVPCToWorkspace',
  full_name='request.AttachVPCToWorkspace',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.AttachVPCToWorkspace.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='router_id', full_name='request.AttachVPCToWorkspace.router_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\014\022\n\302\001\007\312\002\004rtr-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='vxnet_id', full_name='request.AttachVPCToWorkspace.vxnet_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\016\022\014\302\001\t\312\002\006vxnet-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1609,
  serialized_end=1745,
)


_DETACHVPCFROMWORKSPACE = _descriptor.Descriptor(
  name='DetachVPCFromWorkspace',
  full_name='request.DetachVPCFromWorkspace',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.DetachVPCFromWorkspace.space_id', index=0,
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
  serialized_start=1747,
  serialized_end=1810,
)

_LISTWORKSPACES.fields_by_name['status'].enum_type = proto_dot_types_dot_model_dot_workspace__pb2._WORKSPACE_STATUS
_CHECKPERMISSION_SYSTEMROLESENTRY.containing_type = _CHECKPERMISSION
_CHECKPERMISSION.fields_by_name['perm_type'].enum_type = proto_dot_types_dot_model_dot_role__pb2._PROJECTAPI_PERMTYPE
_CHECKPERMISSION.fields_by_name['system_roles'].message_type = _CHECKPERMISSION_SYSTEMROLESENTRY
DESCRIPTOR.message_types_by_name['ListWorkspaces'] = _LISTWORKSPACES
DESCRIPTOR.message_types_by_name['DeleteWorkspaces'] = _DELETEWORKSPACES
DESCRIPTOR.message_types_by_name['DisableWorkspaces'] = _DISABLEWORKSPACES
DESCRIPTOR.message_types_by_name['EnableWorkspaces'] = _ENABLEWORKSPACES
DESCRIPTOR.message_types_by_name['CreateWorkspace'] = _CREATEWORKSPACE
DESCRIPTOR.message_types_by_name['UpdateWorkspace'] = _UPDATEWORKSPACE
DESCRIPTOR.message_types_by_name['DescribeWorkspace'] = _DESCRIBEWORKSPACE
DESCRIPTOR.message_types_by_name['CheckPermission'] = _CHECKPERMISSION
DESCRIPTOR.message_types_by_name['DescribeNetworkConfig'] = _DESCRIBENETWORKCONFIG
DESCRIPTOR.message_types_by_name['AttachVPCToWorkspace'] = _ATTACHVPCTOWORKSPACE
DESCRIPTOR.message_types_by_name['DetachVPCFromWorkspace'] = _DETACHVPCFROMWORKSPACE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListWorkspaces = _reflection.GeneratedProtocolMessageType('ListWorkspaces', (_message.Message,), {
  'DESCRIPTOR' : _LISTWORKSPACES,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ListWorkspaces)
  })
_sym_db.RegisterMessage(ListWorkspaces)

DeleteWorkspaces = _reflection.GeneratedProtocolMessageType('DeleteWorkspaces', (_message.Message,), {
  'DESCRIPTOR' : _DELETEWORKSPACES,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DeleteWorkspaces)
  })
_sym_db.RegisterMessage(DeleteWorkspaces)

DisableWorkspaces = _reflection.GeneratedProtocolMessageType('DisableWorkspaces', (_message.Message,), {
  'DESCRIPTOR' : _DISABLEWORKSPACES,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DisableWorkspaces)
  })
_sym_db.RegisterMessage(DisableWorkspaces)

EnableWorkspaces = _reflection.GeneratedProtocolMessageType('EnableWorkspaces', (_message.Message,), {
  'DESCRIPTOR' : _ENABLEWORKSPACES,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.EnableWorkspaces)
  })
_sym_db.RegisterMessage(EnableWorkspaces)

CreateWorkspace = _reflection.GeneratedProtocolMessageType('CreateWorkspace', (_message.Message,), {
  'DESCRIPTOR' : _CREATEWORKSPACE,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.CreateWorkspace)
  })
_sym_db.RegisterMessage(CreateWorkspace)

UpdateWorkspace = _reflection.GeneratedProtocolMessageType('UpdateWorkspace', (_message.Message,), {
  'DESCRIPTOR' : _UPDATEWORKSPACE,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.UpdateWorkspace)
  })
_sym_db.RegisterMessage(UpdateWorkspace)

DescribeWorkspace = _reflection.GeneratedProtocolMessageType('DescribeWorkspace', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEWORKSPACE,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeWorkspace)
  })
_sym_db.RegisterMessage(DescribeWorkspace)

CheckPermission = _reflection.GeneratedProtocolMessageType('CheckPermission', (_message.Message,), {

  'SystemRolesEntry' : _reflection.GeneratedProtocolMessageType('SystemRolesEntry', (_message.Message,), {
    'DESCRIPTOR' : _CHECKPERMISSION_SYSTEMROLESENTRY,
    '__module__' : 'proto.types.request.space_manage_pb2'
    # @@protoc_insertion_point(class_scope:request.CheckPermission.SystemRolesEntry)
    })
  ,
  'DESCRIPTOR' : _CHECKPERMISSION,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.CheckPermission)
  })
_sym_db.RegisterMessage(CheckPermission)
_sym_db.RegisterMessage(CheckPermission.SystemRolesEntry)

DescribeNetworkConfig = _reflection.GeneratedProtocolMessageType('DescribeNetworkConfig', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBENETWORKCONFIG,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeNetworkConfig)
  })
_sym_db.RegisterMessage(DescribeNetworkConfig)

AttachVPCToWorkspace = _reflection.GeneratedProtocolMessageType('AttachVPCToWorkspace', (_message.Message,), {
  'DESCRIPTOR' : _ATTACHVPCTOWORKSPACE,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.AttachVPCToWorkspace)
  })
_sym_db.RegisterMessage(AttachVPCToWorkspace)

DetachVPCFromWorkspace = _reflection.GeneratedProtocolMessageType('DetachVPCFromWorkspace', (_message.Message,), {
  'DESCRIPTOR' : _DETACHVPCFROMWORKSPACE,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DetachVPCFromWorkspace)
  })
_sym_db.RegisterMessage(DetachVPCFromWorkspace)


DESCRIPTOR._options = None
_LISTWORKSPACES.fields_by_name['user_id']._options = None
_LISTWORKSPACES.fields_by_name['limit']._options = None
_LISTWORKSPACES.fields_by_name['offset']._options = None
_LISTWORKSPACES.fields_by_name['sort_by']._options = None
_LISTWORKSPACES.fields_by_name['status']._options = None
_DELETEWORKSPACES.fields_by_name['space_ids']._options = None
_DELETEWORKSPACES.fields_by_name['req_user_id']._options = None
_DISABLEWORKSPACES.fields_by_name['space_ids']._options = None
_DISABLEWORKSPACES.fields_by_name['req_user_id']._options = None
_ENABLEWORKSPACES.fields_by_name['space_ids']._options = None
_ENABLEWORKSPACES.fields_by_name['req_user_id']._options = None
_CREATEWORKSPACE.fields_by_name['owner']._options = None
_CREATEWORKSPACE.fields_by_name['name']._options = None
_CREATEWORKSPACE.fields_by_name['desc']._options = None
_UPDATEWORKSPACE.fields_by_name['space_id']._options = None
_UPDATEWORKSPACE.fields_by_name['name']._options = None
_UPDATEWORKSPACE.fields_by_name['desc']._options = None
_DESCRIBEWORKSPACE.fields_by_name['space_id']._options = None
_CHECKPERMISSION_SYSTEMROLESENTRY._options = None
_CHECKPERMISSION.fields_by_name['req_user_id']._options = None
_CHECKPERMISSION.fields_by_name['space_id']._options = None
_CHECKPERMISSION.fields_by_name['module_id']._options = None
_CHECKPERMISSION.fields_by_name['perm_type']._options = None
_CHECKPERMISSION.fields_by_name['api_name']._options = None
_CHECKPERMISSION.fields_by_name['system_roles']._options = None
_DESCRIBENETWORKCONFIG.fields_by_name['space_id']._options = None
_ATTACHVPCTOWORKSPACE.fields_by_name['space_id']._options = None
_ATTACHVPCTOWORKSPACE.fields_by_name['router_id']._options = None
_ATTACHVPCTOWORKSPACE.fields_by_name['vxnet_id']._options = None
_DETACHVPCFROMWORKSPACE.fields_by_name['space_id']._options = None
# @@protoc_insertion_point(module_scope)
