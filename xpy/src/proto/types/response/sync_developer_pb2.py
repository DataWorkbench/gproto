# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/response/sync_developer.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/response/sync_developer.proto',
  package='response',
  syntax='proto3',
  serialized_options=b'\n%com.dataomnis.gproto.types.pbresponseB\027PBResponseSyncDeveloperP\000Z4github.com/DataWorkbench/gproto/xgo/types/pbresponse',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)proto/types/response/sync_developer.proto\x12\x08response\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\"\x90\x01\n\x14SubmitSyncJobToFlink\x12\x31\n\x04\x63ode\x18\x01 \x01(\x0e\x32#.response.SubmitSyncJobToFlink.Code\x12\x15\n\x07message\x18\x02 \x01(\tB\x04\xe2\xdf\x1f\x00\".\n\x04\x43ode\x12\r\n\tCodeUnset\x10\x00\x12\x0b\n\x07Success\x10\x01\x12\n\n\x06\x46\x61iled\x10\x02\x42x\n%com.dataomnis.gproto.types.pbresponseB\x17PBResponseSyncDeveloperP\x00Z4github.com/DataWorkbench/gproto/xgo/types/pbresponseb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,])



_SUBMITSYNCJOBTOFLINK_CODE = _descriptor.EnumDescriptor(
  name='Code',
  full_name='response.SubmitSyncJobToFlink.Code',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CodeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Success', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Failed', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=207,
  serialized_end=253,
)
_sym_db.RegisterEnumDescriptor(_SUBMITSYNCJOBTOFLINK_CODE)


_SUBMITSYNCJOBTOFLINK = _descriptor.Descriptor(
  name='SubmitSyncJobToFlink',
  full_name='response.SubmitSyncJobToFlink',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='response.SubmitSyncJobToFlink.code', index=0,
      number=1, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message', full_name='response.SubmitSyncJobToFlink.message', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _SUBMITSYNCJOBTOFLINK_CODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=109,
  serialized_end=253,
)

_SUBMITSYNCJOBTOFLINK.fields_by_name['code'].enum_type = _SUBMITSYNCJOBTOFLINK_CODE
_SUBMITSYNCJOBTOFLINK_CODE.containing_type = _SUBMITSYNCJOBTOFLINK
DESCRIPTOR.message_types_by_name['SubmitSyncJobToFlink'] = _SUBMITSYNCJOBTOFLINK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SubmitSyncJobToFlink = _reflection.GeneratedProtocolMessageType('SubmitSyncJobToFlink', (_message.Message,), {
  'DESCRIPTOR' : _SUBMITSYNCJOBTOFLINK,
  '__module__' : 'proto.types.response.sync_developer_pb2'
  # @@protoc_insertion_point(class_scope:response.SubmitSyncJobToFlink)
  })
_sym_db.RegisterMessage(SubmitSyncJobToFlink)


DESCRIPTOR._options = None
_SUBMITSYNCJOBTOFLINK.fields_by_name['message']._options = None
# @@protoc_insertion_point(module_scope)
