# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/role.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/role.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n\"com.dataomnis.gproto.types.pbmodelB\013PBModelRoleP\000Z1github.com/DataWorkbench/gproto/xgo/types/pbmodel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1cproto/types/model/role.proto\x12\x05model\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\"\xa7\x03\n\nCustomRole\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x18\n\x02id\x18\x02 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\xf0\x01\x14\x12\x1e\n\x04name\x18\x03 \x01(\tB\x10\xe2\xdf\x1f\x0c\x12\n\xc2\x01\x07\x90\x02\x01\x98\x02\x80\x01\x12\x1b\n\x04\x64\x65sc\x18\x04 \x01(\tB\r\xe2\xdf\x1f\t\x12\x07\xc2\x01\x04\xc8\x01\x80\x08\x12\x37\n\x06status\x18\x05 \x01(\x0e\x32\x18.model.CustomRole.StatusB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12!\n\nmodule_ids\x18\x06 \x01(\tB\r\xe2\xdf\x1f\t\x12\x07\xc2\x01\x04\x98\x02\x80\x08\x12U\n\tperm_type\x18\x07 \x01(\x0e\x32\x1a.model.ProjectAPI.PermTypeB&\xe2\xdf\x1f\x15\n\x13\n\nmodule_ids\x12\x05\xc2\x01\x02\"\x00\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12\x11\n\tapi_names\x18\x08 \x01(\t\x12\x0f\n\x07\x63reated\x18\t \x01(\x03\x12\x0f\n\x07updated\x18\n \x01(\x03\"3\n\x06Status\x12\x0f\n\x0bStatusUnset\x10\x00\x12\x0b\n\x07\x44\x65leted\x10\x01\x12\x0b\n\x07\x45nabled\x10\x02\"\xdd\x01\n\nSystemRole\x12\x1f\n\x02id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04ros-\x12\x33\n\x04type\x18\x02 \x01(\x0e\x32\x16.model.SystemRole.TypeB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12\x19\n\x04name\x18\x03 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\"^\n\x04Type\x12\r\n\tTypeUnset\x10\x00\x12\x0e\n\nSpaceAdmin\x10\x01\x12\x12\n\x0eSpaceDeveloper\x10\x02\x12\x11\n\rSpaceOperator\x10\x03\x12\x10\n\x0cSpaceVisitor\x10\x04\"\xf3\x04\n\rProjectModule\x12\x1f\n\x02id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04pmo-\x12>\n\x08\x63lassify\x18\x02 \x01(\x0e\x32\x1d.model.ProjectModule.ClassifyB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12\x19\n\x04name\x18\x03 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\x12$\n\tapi_lists\x18\x04 \x03(\x0b\x32\x11.model.ProjectAPI\"\xbf\x03\n\x08\x43lassify\x12\x11\n\rClassifyUnSet\x10\x00\x12\x0f\n\x0b\x41uditManage\x10\x01\x12\x0f\n\x0bSpaceManage\x10\x02\x12\x0e\n\nUserManage\x10\x03\x12\x11\n\rSessionManage\x10\x04\x12\x11\n\rMessageManage\x10\x05\x12\x10\n\x0cMemberManage\x10\x65\x12\x0e\n\nRoleManage\x10\x66\x12\x13\n\x0f\x44\x61taSourceMange\x10g\x12\r\n\tUDFManage\x10h\x12\x0e\n\nFileManage\x10i\x12\x10\n\x0cNetworkMange\x10j\x12\x10\n\x0c\x43lusterMange\x10k\x12\x15\n\x11StreamJobDevMange\x10l\x12\x1a\n\x16StreamJobReleaseManage\x10m\x12\x1a\n\x16StreamJobVersionManage\x10n\x12\x1b\n\x17StreamJobInstanceManage\x10o\x12\x13\n\x0fSyncJobDevMange\x10p\x12\x18\n\x14SyncJobReleaseManage\x10q\x12\x18\n\x14SyncJobVersionManage\x10r\x12\x19\n\x15SyncJobInstanceManage\x10s\"\xc2\x03\n\nProjectAPI\x12\x1d\n\x08\x61pi_name\x18\x01 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\x12!\n\x0c\x64isplay_name\x18\x02 \x01(\tB\x0b\xe2\xdf\x1f\x07\x12\x05\xc2\x01\x02\"\x00\x12<\n\tperm_type\x18\x03 \x01(\x0e\x32\x1a.model.ProjectAPI.PermTypeB\r\xe2\xdf\x1f\t\x12\x07\xda\x01\x04\x30\x00X\x01\x12>\n\x0bpermissions\x18\x04 \x03(\x0b\x32\x1c.model.ProjectAPI.PermissionB\x0b\xe2\xdf\x1f\x07\x12\x05\xea\x01\x02\x30\x00\x12\x45\n\x0csystem_roles\x18\x06 \x03(\x0b\x32\".model.ProjectAPI.SystemRolesEntryB\x0b\xe2\xdf\x1f\x07\x12\x05\xf2\x01\x02\x30\x00\x1a\x45\n\nPermission\x12&\n\x0bsystem_role\x18\x01 \x01(\x0b\x32\x11.model.SystemRole\x12\x0f\n\x07\x61llowed\x18\x02 \x01(\x08\x1a\x32\n\x10SystemRolesEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\x08:\x02\x38\x01\"2\n\x08PermType\x12\x11\n\rPermTypeUnset\x10\x00\x12\t\n\x05Write\x10\x01\x12\x08\n\x04Read\x10\x02\x42\x66\n\"com.dataomnis.gproto.types.pbmodelB\x0bPBModelRoleP\x00Z1github.com/DataWorkbench/gproto/xgo/types/pbmodelb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,])



_CUSTOMROLE_STATUS = _descriptor.EnumDescriptor(
  name='Status',
  full_name='model.CustomRole.Status',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='StatusUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Deleted', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Enabled', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=465,
  serialized_end=516,
)
_sym_db.RegisterEnumDescriptor(_CUSTOMROLE_STATUS)

_SYSTEMROLE_TYPE = _descriptor.EnumDescriptor(
  name='Type',
  full_name='model.SystemRole.Type',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='TypeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SpaceAdmin', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SpaceDeveloper', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SpaceOperator', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SpaceVisitor', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=646,
  serialized_end=740,
)
_sym_db.RegisterEnumDescriptor(_SYSTEMROLE_TYPE)

_PROJECTMODULE_CLASSIFY = _descriptor.EnumDescriptor(
  name='Classify',
  full_name='model.ProjectModule.Classify',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ClassifyUnSet', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='AuditManage', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SpaceManage', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UserManage', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SessionManage', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MessageManage', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MemberManage', index=6, number=101,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='RoleManage', index=7, number=102,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DataSourceMange', index=8, number=103,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UDFManage', index=9, number=104,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='FileManage', index=10, number=105,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='NetworkMange', index=11, number=106,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='ClusterMange', index=12, number=107,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='StreamJobDevMange', index=13, number=108,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='StreamJobReleaseManage', index=14, number=109,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='StreamJobVersionManage', index=15, number=110,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='StreamJobInstanceManage', index=16, number=111,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SyncJobDevMange', index=17, number=112,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SyncJobReleaseManage', index=18, number=113,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SyncJobVersionManage', index=19, number=114,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SyncJobInstanceManage', index=20, number=115,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=923,
  serialized_end=1370,
)
_sym_db.RegisterEnumDescriptor(_PROJECTMODULE_CLASSIFY)

_PROJECTAPI_PERMTYPE = _descriptor.EnumDescriptor(
  name='PermType',
  full_name='model.ProjectAPI.PermType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='PermTypeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Write', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Read', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=1773,
  serialized_end=1823,
)
_sym_db.RegisterEnumDescriptor(_PROJECTAPI_PERMTYPE)


_CUSTOMROLE = _descriptor.Descriptor(
  name='CustomRole',
  full_name='model.CustomRole',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='model.CustomRole.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='id', full_name='model.CustomRole.id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\360\001\024', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='model.CustomRole.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\014\022\n\302\001\007\220\002\001\230\002\200\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='desc', full_name='model.CustomRole.desc', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\302\001\004\310\001\200\010', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='model.CustomRole.status', index=4,
      number=5, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='module_ids', full_name='model.CustomRole.module_ids', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\302\001\004\230\002\200\010', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='perm_type', full_name='model.CustomRole.perm_type', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\n\023\n\nmodule_ids\022\005\302\001\002\"\000\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='api_names', full_name='model.CustomRole.api_names', index=7,
      number=8, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='created', full_name='model.CustomRole.created', index=8,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='updated', full_name='model.CustomRole.updated', index=9,
      number=10, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _CUSTOMROLE_STATUS,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=93,
  serialized_end=516,
)


_SYSTEMROLE = _descriptor.Descriptor(
  name='SystemRole',
  full_name='model.SystemRole',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='model.SystemRole.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004ros-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='type', full_name='model.SystemRole.type', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='model.SystemRole.name', index=2,
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
    _SYSTEMROLE_TYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=519,
  serialized_end=740,
)


_PROJECTMODULE = _descriptor.Descriptor(
  name='ProjectModule',
  full_name='model.ProjectModule',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='model.ProjectModule.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004pmo-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='classify', full_name='model.ProjectModule.classify', index=1,
      number=2, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='name', full_name='model.ProjectModule.name', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\302\001\002\"\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='api_lists', full_name='model.ProjectModule.api_lists', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _PROJECTMODULE_CLASSIFY,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=743,
  serialized_end=1370,
)


_PROJECTAPI_PERMISSION = _descriptor.Descriptor(
  name='Permission',
  full_name='model.ProjectAPI.Permission',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='system_role', full_name='model.ProjectAPI.Permission.system_role', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='allowed', full_name='model.ProjectAPI.Permission.allowed', index=1,
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
  serialized_start=1650,
  serialized_end=1719,
)

_PROJECTAPI_SYSTEMROLESENTRY = _descriptor.Descriptor(
  name='SystemRolesEntry',
  full_name='model.ProjectAPI.SystemRolesEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='model.ProjectAPI.SystemRolesEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='model.ProjectAPI.SystemRolesEntry.value', index=1,
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
  serialized_start=1721,
  serialized_end=1771,
)

_PROJECTAPI = _descriptor.Descriptor(
  name='ProjectAPI',
  full_name='model.ProjectAPI',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='api_name', full_name='model.ProjectAPI.api_name', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\302\001\002\"\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='display_name', full_name='model.ProjectAPI.display_name', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\302\001\002\"\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='perm_type', full_name='model.ProjectAPI.perm_type', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\332\001\0040\000X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='permissions', full_name='model.ProjectAPI.permissions', index=3,
      number=4, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\352\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='system_roles', full_name='model.ProjectAPI.system_roles', index=4,
      number=6, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\362\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_PROJECTAPI_PERMISSION, _PROJECTAPI_SYSTEMROLESENTRY, ],
  enum_types=[
    _PROJECTAPI_PERMTYPE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=1373,
  serialized_end=1823,
)

_CUSTOMROLE.fields_by_name['status'].enum_type = _CUSTOMROLE_STATUS
_CUSTOMROLE.fields_by_name['perm_type'].enum_type = _PROJECTAPI_PERMTYPE
_CUSTOMROLE_STATUS.containing_type = _CUSTOMROLE
_SYSTEMROLE.fields_by_name['type'].enum_type = _SYSTEMROLE_TYPE
_SYSTEMROLE_TYPE.containing_type = _SYSTEMROLE
_PROJECTMODULE.fields_by_name['classify'].enum_type = _PROJECTMODULE_CLASSIFY
_PROJECTMODULE.fields_by_name['api_lists'].message_type = _PROJECTAPI
_PROJECTMODULE_CLASSIFY.containing_type = _PROJECTMODULE
_PROJECTAPI_PERMISSION.fields_by_name['system_role'].message_type = _SYSTEMROLE
_PROJECTAPI_PERMISSION.containing_type = _PROJECTAPI
_PROJECTAPI_SYSTEMROLESENTRY.containing_type = _PROJECTAPI
_PROJECTAPI.fields_by_name['perm_type'].enum_type = _PROJECTAPI_PERMTYPE
_PROJECTAPI.fields_by_name['permissions'].message_type = _PROJECTAPI_PERMISSION
_PROJECTAPI.fields_by_name['system_roles'].message_type = _PROJECTAPI_SYSTEMROLESENTRY
_PROJECTAPI_PERMTYPE.containing_type = _PROJECTAPI
DESCRIPTOR.message_types_by_name['CustomRole'] = _CUSTOMROLE
DESCRIPTOR.message_types_by_name['SystemRole'] = _SYSTEMROLE
DESCRIPTOR.message_types_by_name['ProjectModule'] = _PROJECTMODULE
DESCRIPTOR.message_types_by_name['ProjectAPI'] = _PROJECTAPI
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CustomRole = _reflection.GeneratedProtocolMessageType('CustomRole', (_message.Message,), {
  'DESCRIPTOR' : _CUSTOMROLE,
  '__module__' : 'proto.types.model.role_pb2'
  # @@protoc_insertion_point(class_scope:model.CustomRole)
  })
_sym_db.RegisterMessage(CustomRole)

SystemRole = _reflection.GeneratedProtocolMessageType('SystemRole', (_message.Message,), {
  'DESCRIPTOR' : _SYSTEMROLE,
  '__module__' : 'proto.types.model.role_pb2'
  # @@protoc_insertion_point(class_scope:model.SystemRole)
  })
_sym_db.RegisterMessage(SystemRole)

ProjectModule = _reflection.GeneratedProtocolMessageType('ProjectModule', (_message.Message,), {
  'DESCRIPTOR' : _PROJECTMODULE,
  '__module__' : 'proto.types.model.role_pb2'
  # @@protoc_insertion_point(class_scope:model.ProjectModule)
  })
_sym_db.RegisterMessage(ProjectModule)

ProjectAPI = _reflection.GeneratedProtocolMessageType('ProjectAPI', (_message.Message,), {

  'Permission' : _reflection.GeneratedProtocolMessageType('Permission', (_message.Message,), {
    'DESCRIPTOR' : _PROJECTAPI_PERMISSION,
    '__module__' : 'proto.types.model.role_pb2'
    # @@protoc_insertion_point(class_scope:model.ProjectAPI.Permission)
    })
  ,

  'SystemRolesEntry' : _reflection.GeneratedProtocolMessageType('SystemRolesEntry', (_message.Message,), {
    'DESCRIPTOR' : _PROJECTAPI_SYSTEMROLESENTRY,
    '__module__' : 'proto.types.model.role_pb2'
    # @@protoc_insertion_point(class_scope:model.ProjectAPI.SystemRolesEntry)
    })
  ,
  'DESCRIPTOR' : _PROJECTAPI,
  '__module__' : 'proto.types.model.role_pb2'
  # @@protoc_insertion_point(class_scope:model.ProjectAPI)
  })
_sym_db.RegisterMessage(ProjectAPI)
_sym_db.RegisterMessage(ProjectAPI.Permission)
_sym_db.RegisterMessage(ProjectAPI.SystemRolesEntry)


DESCRIPTOR._options = None
_CUSTOMROLE.fields_by_name['space_id']._options = None
_CUSTOMROLE.fields_by_name['id']._options = None
_CUSTOMROLE.fields_by_name['name']._options = None
_CUSTOMROLE.fields_by_name['desc']._options = None
_CUSTOMROLE.fields_by_name['status']._options = None
_CUSTOMROLE.fields_by_name['module_ids']._options = None
_CUSTOMROLE.fields_by_name['perm_type']._options = None
_SYSTEMROLE.fields_by_name['id']._options = None
_SYSTEMROLE.fields_by_name['type']._options = None
_SYSTEMROLE.fields_by_name['name']._options = None
_PROJECTMODULE.fields_by_name['id']._options = None
_PROJECTMODULE.fields_by_name['classify']._options = None
_PROJECTMODULE.fields_by_name['name']._options = None
_PROJECTAPI_SYSTEMROLESENTRY._options = None
_PROJECTAPI.fields_by_name['api_name']._options = None
_PROJECTAPI.fields_by_name['display_name']._options = None
_PROJECTAPI.fields_by_name['perm_type']._options = None
_PROJECTAPI.fields_by_name['permissions']._options = None
_PROJECTAPI.fields_by_name['system_roles']._options = None
# @@protoc_insertion_point(module_scope)
