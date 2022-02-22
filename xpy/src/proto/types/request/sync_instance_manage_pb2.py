# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/sync_instance_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from github.com.yu31.protoc_plugin.proto import defaults_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2
from proto.types.model import sync_instance_pb2 as proto_dot_types_dot_model_dot_sync__instance__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/sync_instance_manage.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\033PBRequestSyncInstanceManageP\000Z3github.com/DataWorkbench/gproto/xgo/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n.proto/types/request/sync_instance_manage.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a\x32github.com/yu31/protoc-plugin/proto/defaults.proto\x1a%proto/types/model/sync_instance.proto\"\xb9\x02\n\x11ListSyncInstances\x12&\n\x05limit\x18\x01 \x01(\x05\x42\x17\xa2\xa1\x1f\x06\xaa\x06\x03\x31\x30\x30\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x30\x00\x38\x64\x12\x1b\n\x06offset\x18\x02 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12%\n\x08space_id\x18\x03 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x0e\n\x06job_id\x18\x04 \x01(\t\x12\x0f\n\x07version\x18\x05 \x01(\t\x12\x35\n\x05state\x18\x06 \x01(\x0e\x32\x19.model.SyncInstance.StateB\x0b\xe2\xdf\x1f\x07\x12\x05\xda\x01\x02X\x01\x12:\n\x07sort_by\x18\x07 \x01(\tB)\xe2\xdf\x1f%\x12#\xc2\x01 J\x00J\x02idJ\x06job_idJ\x07\x63reatedJ\x07updated\x12\x0f\n\x07reverse\x18\x08 \x01(\x08\x12\x13\n\x0binstance_id\x18\t \x01(\t\"p\n\x16TerminateSyncInstances\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12/\n\x0cinstance_ids\x18\x02 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04sti-\"n\n\x14SuspendSyncInstances\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12/\n\x0cinstance_ids\x18\x02 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04sti-\"m\n\x13ResumeSyncInstances\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12/\n\x0cinstance_ids\x18\x02 \x03(\tB\x19\xe2\xdf\x1f\x15\x12\x13\xea\x01\x10\x30\x00\x38\x64Z\n\xc2\x01\x07\xca\x02\x04sti-\"@\n\x14\x44\x65scribeSyncInstance\x12(\n\x0binstance_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04sti-Bz\n$com.dataomnis.gproto.types.pbrequestB\x1bPBRequestSyncInstanceManageP\x00Z3github.com/DataWorkbench/gproto/xgo/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_sync__instance__pb2.DESCRIPTOR,])




_LISTSYNCINSTANCES = _descriptor.Descriptor(
  name='ListSyncInstances',
  full_name='request.ListSyncInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.ListSyncInstances.limit', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\242\241\037\006\252\006\003100\342\337\037\t\022\007\262\001\0040\0008d', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.ListSyncInstances.offset', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ListSyncInstances.space_id', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='job_id', full_name='request.ListSyncInstances.job_id', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='request.ListSyncInstances.version', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='state', full_name='request.ListSyncInstances.state', index=5,
      number=6, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\332\001\002X\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='sort_by', full_name='request.ListSyncInstances.sort_by', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037%\022#\302\001 J\000J\002idJ\006job_idJ\007createdJ\007updated', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='reverse', full_name='request.ListSyncInstances.reverse', index=7,
      number=8, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_id', full_name='request.ListSyncInstances.instance_id', index=8,
      number=9, type=9, cpp_type=9, label=1,
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
  serialized_start=204,
  serialized_end=517,
)


_TERMINATESYNCINSTANCES = _descriptor.Descriptor(
  name='TerminateSyncInstances',
  full_name='request.TerminateSyncInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.TerminateSyncInstances.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_ids', full_name='request.TerminateSyncInstances.instance_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004sti-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=519,
  serialized_end=631,
)


_SUSPENDSYNCINSTANCES = _descriptor.Descriptor(
  name='SuspendSyncInstances',
  full_name='request.SuspendSyncInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.SuspendSyncInstances.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_ids', full_name='request.SuspendSyncInstances.instance_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004sti-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=633,
  serialized_end=743,
)


_RESUMESYNCINSTANCES = _descriptor.Descriptor(
  name='ResumeSyncInstances',
  full_name='request.ResumeSyncInstances',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.ResumeSyncInstances.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_ids', full_name='request.ResumeSyncInstances.instance_ids', index=1,
      number=2, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\025\022\023\352\001\0200\0008dZ\n\302\001\007\312\002\004sti-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=745,
  serialized_end=854,
)


_DESCRIBESYNCINSTANCE = _descriptor.Descriptor(
  name='DescribeSyncInstance',
  full_name='request.DescribeSyncInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='instance_id', full_name='request.DescribeSyncInstance.instance_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004sti-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=856,
  serialized_end=920,
)

_LISTSYNCINSTANCES.fields_by_name['state'].enum_type = proto_dot_types_dot_model_dot_sync__instance__pb2._SYNCINSTANCE_STATE
DESCRIPTOR.message_types_by_name['ListSyncInstances'] = _LISTSYNCINSTANCES
DESCRIPTOR.message_types_by_name['TerminateSyncInstances'] = _TERMINATESYNCINSTANCES
DESCRIPTOR.message_types_by_name['SuspendSyncInstances'] = _SUSPENDSYNCINSTANCES
DESCRIPTOR.message_types_by_name['ResumeSyncInstances'] = _RESUMESYNCINSTANCES
DESCRIPTOR.message_types_by_name['DescribeSyncInstance'] = _DESCRIBESYNCINSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListSyncInstances = _reflection.GeneratedProtocolMessageType('ListSyncInstances', (_message.Message,), {
  'DESCRIPTOR' : _LISTSYNCINSTANCES,
  '__module__' : 'proto.types.request.sync_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ListSyncInstances)
  })
_sym_db.RegisterMessage(ListSyncInstances)

TerminateSyncInstances = _reflection.GeneratedProtocolMessageType('TerminateSyncInstances', (_message.Message,), {
  'DESCRIPTOR' : _TERMINATESYNCINSTANCES,
  '__module__' : 'proto.types.request.sync_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.TerminateSyncInstances)
  })
_sym_db.RegisterMessage(TerminateSyncInstances)

SuspendSyncInstances = _reflection.GeneratedProtocolMessageType('SuspendSyncInstances', (_message.Message,), {
  'DESCRIPTOR' : _SUSPENDSYNCINSTANCES,
  '__module__' : 'proto.types.request.sync_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.SuspendSyncInstances)
  })
_sym_db.RegisterMessage(SuspendSyncInstances)

ResumeSyncInstances = _reflection.GeneratedProtocolMessageType('ResumeSyncInstances', (_message.Message,), {
  'DESCRIPTOR' : _RESUMESYNCINSTANCES,
  '__module__' : 'proto.types.request.sync_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.ResumeSyncInstances)
  })
_sym_db.RegisterMessage(ResumeSyncInstances)

DescribeSyncInstance = _reflection.GeneratedProtocolMessageType('DescribeSyncInstance', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBESYNCINSTANCE,
  '__module__' : 'proto.types.request.sync_instance_manage_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeSyncInstance)
  })
_sym_db.RegisterMessage(DescribeSyncInstance)


DESCRIPTOR._options = None
_LISTSYNCINSTANCES.fields_by_name['limit']._options = None
_LISTSYNCINSTANCES.fields_by_name['offset']._options = None
_LISTSYNCINSTANCES.fields_by_name['space_id']._options = None
_LISTSYNCINSTANCES.fields_by_name['state']._options = None
_LISTSYNCINSTANCES.fields_by_name['sort_by']._options = None
_TERMINATESYNCINSTANCES.fields_by_name['space_id']._options = None
_TERMINATESYNCINSTANCES.fields_by_name['instance_ids']._options = None
_SUSPENDSYNCINSTANCES.fields_by_name['space_id']._options = None
_SUSPENDSYNCINSTANCES.fields_by_name['instance_ids']._options = None
_RESUMESYNCINSTANCES.fields_by_name['space_id']._options = None
_RESUMESYNCINSTANCES.fields_by_name['instance_ids']._options = None
_DESCRIBESYNCINSTANCE.fields_by_name['instance_id']._options = None
# @@protoc_insertion_point(module_scope)