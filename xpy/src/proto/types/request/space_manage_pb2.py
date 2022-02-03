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
from proto.types.model import opaudit_pb2 as proto_dot_types_dot_model_dot_opaudit__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/space_manage.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\030PBRequestWorkspaceManageP\000Z3github.com/DataWorkbench/gproto/pkg/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n&proto/types/request/space_manage.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\x32github.com/yu31/protoc-plugin/proto/defaults.proto\x1a!proto/types/model/workspace.proto\x1a\x1fproto/types/model/opaudit.proto\"\x96\x02\n\x0eListWorkspaces\x12&\n\x05limit\x18\x01 \x01(\x05\x42\x17\xa2\xa1\x1f\x06\xaa\x06\x03\x31\x30\x30\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x30\x00\x38\x64\x12\x1b\n\x06offset\x18\x02 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12\x38\n\x07sort_by\x18\x03 \x01(\tB\'\xe2\xdf\x1f#\x12!\xc2\x01\x1eJ\x00J\x02idJ\x04nameJ\x07\x63reatedJ\x07updated\x12\x0f\n\x07reverse\x18\x04 \x01(\x08\x12\x0e\n\x06search\x18\x05 \x01(\t\x12 \n\x07user_id\x18\x06 \x01(\tB\x0f\xe2\xdf\x1f\x0b\x12\t\xc2\x01\x06\x80\x02\x01\x88\x02\x41\x12\x34\n\x06status\x18\x07 \x01(\x0e\x32\x17.model.Workspace.StatusB\x0b\xe2\xdf\x1f\x07\x12\x05\xda\x01\x02X\x01\x12\x0c\n\x04name\x18\x08 \x01(\t\"@\n\x10\x44\x65leteWorkspaces\x12,\n\tspace_ids\x18\x01 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04wks-\"A\n\x11\x44isableWorkspaces\x12,\n\tspace_ids\x18\x01 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04wks-\"T\n\x10\x45nableWorkspaces\x12,\n\tspace_ids\x18\x01 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04wks-\x12\x12\n\nresume_job\x18\x02 \x01(\x08\"k\n\x0f\x43reateWorkspace\x12\x1b\n\x05owner\x18\x01 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x88\x02\x41\x12\x1e\n\x04name\x18\x02 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\xc0\x01\x02\xc8\x01\x80\x01\x12\x1b\n\x04\x64\x65sc\x18\x03 \x01(\tB\r\xe2\xdf\x1f\t\x12\x07\xc2\x01\x04\xc8\x01\x80\x08\"u\n\x0fUpdateWorkspace\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x1e\n\x04name\x18\x02 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\xc0\x01\x02\xc8\x01\x80\x01\x12\x1b\n\x04\x64\x65sc\x18\x03 \x01(\tB\r\xe2\xdf\x1f\t\x12\x07\xc2\x01\x04\xc8\x01\x80\x08\":\n\x11\x44\x65scribeWorkspace\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\"2\n\nAddOpAudit\x12$\n\x04info\x18\x01 \x01(\x0b\x32\x10.model.OperationB\x04\xe2\xdf\x1f\x00\"\xed\x02\n\x0cListOpAudits\x12&\n\x05limit\x18\x01 \x01(\x05\x42\x17\xa2\xa1\x1f\x06\xaa\x06\x03\x31\x30\x30\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x30\x00\x38\x64\x12\x1b\n\x06offset\x18\x02 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12)\n\x07sort_by\x18\x03 \x01(\tB\x18\xe2\xdf\x1f\x14\x12\x12\xc2\x01\x0fJ\x00J\x02idJ\x07\x63reated\x12\x15\n\x07reverse\x18\x04 \x01(\x08\x42\x04\xe2\xdf\x1f\x00\x12\x1d\n\x07user_id\x18\x05 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x88\x02\x41\x12\x16\n\x08space_id\x18\x06 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x30\n\x04type\x18\x07 \x01(\x0e\x32\x15.model.Operation.TypeB\x0b\xe2\xdf\x1f\x07\x12\x05\xda\x01\x02X\x01\x12\x14\n\x06\x61\x63tion\x18\x08 \x01(\tB\x04\xe2\xdf\x1f\x00\x12+\n\x05state\x18\t \x01(\x0e\x32\x16.model.Operation.StateB\x04\xe2\xdf\x1f\x00\x12\x15\n\x07started\x18\n \x01(\x03\x42\x04\xe2\xdf\x1f\x00\x12\x13\n\x05\x65nded\x18\x0b \x01(\x03\x42\x04\xe2\xdf\x1f\x00\"\xbe\x02\n\x0f\x43heckPermission\x12!\n\x0breq_user_id\x18\x01 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x88\x02\x41\x12%\n\x08space_id\x18\x02 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x1c\n\x06module\x18\x03 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x80\x02\x00\x12\x35\n\x07op_type\x18\x04 \x01(\x0e\x32\x15.model.Operation.TypeB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12\x1d\n\x07op_name\x18\x05 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x80\x02\x00\x12?\n\x05roles\x18\x06 \x03(\x0b\x32#.request.CheckPermission.RolesEntryB\x0b\xe2\xdf\x1f\x07\x12\x05\xf2\x01\x02\x30\x00\x1a,\n\nRolesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x08:\x02\x38\x01\x42w\n$com.dataomnis.gproto.types.pbrequestB\x18PBRequestWorkspaceManageP\x00Z3github.com/DataWorkbench/gproto/pkg/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_workspace__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_opaudit__pb2.DESCRIPTOR,])




_LISTWORKSPACES = _descriptor.Descriptor(
  name='ListWorkspaces',
  full_name='request.ListWorkspaces',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.ListWorkspaces.limit', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\242\241\037\006\252\006\003100\342\337\037\t\022\007\262\001\0040\0008d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.ListWorkspaces.offset', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sort_by', full_name='request.ListWorkspaces.sort_by', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037#\022!\302\001\036J\000J\002idJ\004nameJ\007createdJ\007updated', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reverse', full_name='request.ListWorkspaces.reverse', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='search', full_name='request.ListWorkspaces.search', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.ListWorkspaces.user_id', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\013\022\t\302\001\006\200\002\001\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=225,
  serialized_end=503,
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
  serialized_start=505,
  serialized_end=569,
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
  serialized_start=571,
  serialized_end=636,
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
  serialized_start=638,
  serialized_end=722,
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
      serialized_options=b'\342\337\037\010\022\006\302\001\003\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=724,
  serialized_end=831,
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
  serialized_start=833,
  serialized_end=950,
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
  serialized_start=952,
  serialized_end=1010,
)


_ADDOPAUDIT = _descriptor.Descriptor(
  name='AddOpAudit',
  full_name='request.AddOpAudit',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='info', full_name='request.AddOpAudit.info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1012,
  serialized_end=1062,
)


_LISTOPAUDITS = _descriptor.Descriptor(
  name='ListOpAudits',
  full_name='request.ListOpAudits',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.ListOpAudits.limit', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\242\241\037\006\252\006\003100\342\337\037\t\022\007\262\001\0040\0008d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.ListOpAudits.offset', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sort_by', full_name='request.ListOpAudits.sort_by', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\024\022\022\302\001\017J\000J\002idJ\007created', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reverse', full_name='request.ListOpAudits.reverse', index=3,
      number=4, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.ListOpAudits.user_id', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ListOpAudits.space_id', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='request.ListOpAudits.type', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\332\001\002X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='action', full_name='request.ListOpAudits.action', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='request.ListOpAudits.state', index=8,
      number=9, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='started', full_name='request.ListOpAudits.started', index=9,
      number=10, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='ended', full_name='request.ListOpAudits.ended', index=10,
      number=11, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=1065,
  serialized_end=1430,
)


_CHECKPERMISSION_ROLESENTRY = _descriptor.Descriptor(
  name='RolesEntry',
  full_name='request.CheckPermission.RolesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='request.CheckPermission.RolesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='request.CheckPermission.RolesEntry.value', index=1,
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
  serialized_start=1707,
  serialized_end=1751,
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
      serialized_options=b'\342\337\037\010\022\006\302\001\003\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.CheckPermission.space_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='module', full_name='request.CheckPermission.module', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\200\002\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='op_type', full_name='request.CheckPermission.op_type', index=3,
      number=4, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='op_name', full_name='request.CheckPermission.op_name', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\200\002\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='roles', full_name='request.CheckPermission.roles', index=5,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\362\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_CHECKPERMISSION_ROLESENTRY, ],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1433,
  serialized_end=1751,
)

_LISTWORKSPACES.fields_by_name['status'].enum_type = proto_dot_types_dot_model_dot_workspace__pb2._WORKSPACE_STATUS
_ADDOPAUDIT.fields_by_name['info'].message_type = proto_dot_types_dot_model_dot_opaudit__pb2._OPERATION
_LISTOPAUDITS.fields_by_name['type'].enum_type = proto_dot_types_dot_model_dot_opaudit__pb2._OPERATION_TYPE
_LISTOPAUDITS.fields_by_name['state'].enum_type = proto_dot_types_dot_model_dot_opaudit__pb2._OPERATION_STATE
_CHECKPERMISSION_ROLESENTRY.containing_type = _CHECKPERMISSION
_CHECKPERMISSION.fields_by_name['op_type'].enum_type = proto_dot_types_dot_model_dot_opaudit__pb2._OPERATION_TYPE
_CHECKPERMISSION.fields_by_name['roles'].message_type = _CHECKPERMISSION_ROLESENTRY
DESCRIPTOR.message_types_by_name['ListWorkspaces'] = _LISTWORKSPACES
DESCRIPTOR.message_types_by_name['DeleteWorkspaces'] = _DELETEWORKSPACES
DESCRIPTOR.message_types_by_name['DisableWorkspaces'] = _DISABLEWORKSPACES
DESCRIPTOR.message_types_by_name['EnableWorkspaces'] = _ENABLEWORKSPACES
DESCRIPTOR.message_types_by_name['CreateWorkspace'] = _CREATEWORKSPACE
DESCRIPTOR.message_types_by_name['UpdateWorkspace'] = _UPDATEWORKSPACE
DESCRIPTOR.message_types_by_name['DescribeWorkspace'] = _DESCRIBEWORKSPACE
DESCRIPTOR.message_types_by_name['AddOpAudit'] = _ADDOPAUDIT
DESCRIPTOR.message_types_by_name['ListOpAudits'] = _LISTOPAUDITS
DESCRIPTOR.message_types_by_name['CheckPermission'] = _CHECKPERMISSION
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

AddOpAudit = _reflection.GeneratedProtocolMessageType('AddOpAudit', (_message.Message,), {
  'DESCRIPTOR' : _ADDOPAUDIT,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.AddOpAudit)
  })
_sym_db.RegisterMessage(AddOpAudit)

ListOpAudits = _reflection.GeneratedProtocolMessageType('ListOpAudits', (_message.Message,), {
  'DESCRIPTOR' : _LISTOPAUDITS,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ListOpAudits)
  })
_sym_db.RegisterMessage(ListOpAudits)

CheckPermission = _reflection.GeneratedProtocolMessageType('CheckPermission', (_message.Message,), {

  'RolesEntry' : _reflection.GeneratedProtocolMessageType('RolesEntry', (_message.Message,), {
    'DESCRIPTOR' : _CHECKPERMISSION_ROLESENTRY,
    '__module__' : 'proto.types.request.space_manage_pb2'
    # @@protoc_insertion_point(class_scope:request.CheckPermission.RolesEntry)
    })
  ,
  'DESCRIPTOR' : _CHECKPERMISSION,
  '__module__' : 'proto.types.request.space_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.CheckPermission)
  })
_sym_db.RegisterMessage(CheckPermission)
_sym_db.RegisterMessage(CheckPermission.RolesEntry)


DESCRIPTOR._options = None
_LISTWORKSPACES.fields_by_name['limit']._options = None
_LISTWORKSPACES.fields_by_name['offset']._options = None
_LISTWORKSPACES.fields_by_name['sort_by']._options = None
_LISTWORKSPACES.fields_by_name['user_id']._options = None
_LISTWORKSPACES.fields_by_name['status']._options = None
_DELETEWORKSPACES.fields_by_name['space_ids']._options = None
_DISABLEWORKSPACES.fields_by_name['space_ids']._options = None
_ENABLEWORKSPACES.fields_by_name['space_ids']._options = None
_CREATEWORKSPACE.fields_by_name['owner']._options = None
_CREATEWORKSPACE.fields_by_name['name']._options = None
_CREATEWORKSPACE.fields_by_name['desc']._options = None
_UPDATEWORKSPACE.fields_by_name['space_id']._options = None
_UPDATEWORKSPACE.fields_by_name['name']._options = None
_UPDATEWORKSPACE.fields_by_name['desc']._options = None
_DESCRIBEWORKSPACE.fields_by_name['space_id']._options = None
_ADDOPAUDIT.fields_by_name['info']._options = None
_LISTOPAUDITS.fields_by_name['limit']._options = None
_LISTOPAUDITS.fields_by_name['offset']._options = None
_LISTOPAUDITS.fields_by_name['sort_by']._options = None
_LISTOPAUDITS.fields_by_name['reverse']._options = None
_LISTOPAUDITS.fields_by_name['user_id']._options = None
_LISTOPAUDITS.fields_by_name['space_id']._options = None
_LISTOPAUDITS.fields_by_name['type']._options = None
_LISTOPAUDITS.fields_by_name['action']._options = None
_LISTOPAUDITS.fields_by_name['state']._options = None
_LISTOPAUDITS.fields_by_name['started']._options = None
_LISTOPAUDITS.fields_by_name['ended']._options = None
_CHECKPERMISSION_ROLESENTRY._options = None
_CHECKPERMISSION.fields_by_name['req_user_id']._options = None
_CHECKPERMISSION.fields_by_name['space_id']._options = None
_CHECKPERMISSION.fields_by_name['module']._options = None
_CHECKPERMISSION.fields_by_name['op_type']._options = None
_CHECKPERMISSION.fields_by_name['op_name']._options = None
_CHECKPERMISSION.fields_by_name['roles']._options = None
# @@protoc_insertion_point(module_scope)
