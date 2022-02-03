# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/billing.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/billing.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\020PBRequestBillingP\000Z3github.com/DataWorkbench/gproto/pkg/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!proto/types/request/billing.proto\x12\x07request\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\"\xbd\x01\n\x15\x43reateBillingInstance\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x1d\n\x07user_id\x18\x02 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x88\x02\x41\x12\x1e\n\x08\x66\x65\x65_type\x18\x03 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\xf0\x01\x01\x12\'\n\x02\x63u\x18\x04 \x01(\x01\x42\x1b\xe2\xdf\x1f\x17\x12\x15\xaa\x01\x12\x39\x00\x00\x00\x00\x00\x00\x34@A\x00\x00\x00\x00\x00\x00\xe0?\x12\x15\n\ris_auto_renew\x18\x05 \x01(\x05\"q\n\x13StopBillingInstance\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x1d\n\x07user_id\x18\x02 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x88\x02\x41\x12\x14\n\x0c\x63onstance_id\x18\x03 \x01(\t\"u\n\x17RecoveryBillingInstance\x12%\n\x08space_id\x18\x01 \x01(\tB\x13\xe2\xdf\x1f\x0f\x12\r\xc2\x01\n\xf0\x01\x14\xca\x02\x04wks-\x12\x1d\n\x07user_id\x18\x02 \x01(\tB\x0c\xe2\xdf\x1f\x08\x12\x06\xc2\x01\x03\x88\x02\x41\x12\x14\n\x0c\x63onstance_id\x18\x03 \x01(\tBo\n$com.dataomnis.gproto.types.pbrequestB\x10PBRequestBillingP\x00Z3github.com/DataWorkbench/gproto/pkg/types/pbrequestb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,])




_CREATEBILLINGINSTANCE = _descriptor.Descriptor(
  name='CreateBillingInstance',
  full_name='request.CreateBillingInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.CreateBillingInstance.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.CreateBillingInstance.user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='fee_type', full_name='request.CreateBillingInstance.fee_type', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\360\001\001', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='cu', full_name='request.CreateBillingInstance.cu', index=3,
      number=4, type=1, cpp_type=5, label=1,
      has_default_value=False, default_value=float(0),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\027\022\025\252\001\0229\000\000\000\000\000\0004@A\000\000\000\000\000\000\340?', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='is_auto_renew', full_name='request.CreateBillingInstance.is_auto_renew', index=4,
      number=5, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
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
  serialized_start=100,
  serialized_end=289,
)


_STOPBILLINGINSTANCE = _descriptor.Descriptor(
  name='StopBillingInstance',
  full_name='request.StopBillingInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.StopBillingInstance.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.StopBillingInstance.user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='constance_id', full_name='request.StopBillingInstance.constance_id', index=2,
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
  serialized_start=291,
  serialized_end=404,
)


_RECOVERYBILLINGINSTANCE = _descriptor.Descriptor(
  name='RecoveryBillingInstance',
  full_name='request.RecoveryBillingInstance',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='space_id', full_name='request.RecoveryBillingInstance.space_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\017\022\r\302\001\n\360\001\024\312\002\004wks-', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='user_id', full_name='request.RecoveryBillingInstance.user_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\010\022\006\302\001\003\210\002A', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='constance_id', full_name='request.RecoveryBillingInstance.constance_id', index=2,
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
  serialized_start=406,
  serialized_end=523,
)

DESCRIPTOR.message_types_by_name['CreateBillingInstance'] = _CREATEBILLINGINSTANCE
DESCRIPTOR.message_types_by_name['StopBillingInstance'] = _STOPBILLINGINSTANCE
DESCRIPTOR.message_types_by_name['RecoveryBillingInstance'] = _RECOVERYBILLINGINSTANCE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CreateBillingInstance = _reflection.GeneratedProtocolMessageType('CreateBillingInstance', (_message.Message,), {
  'DESCRIPTOR' : _CREATEBILLINGINSTANCE,
  '__module__' : 'proto.types.request.billing_pb2'
  # @@protoc_insertion_point(class_scope:request.CreateBillingInstance)
  })
_sym_db.RegisterMessage(CreateBillingInstance)

StopBillingInstance = _reflection.GeneratedProtocolMessageType('StopBillingInstance', (_message.Message,), {
  'DESCRIPTOR' : _STOPBILLINGINSTANCE,
  '__module__' : 'proto.types.request.billing_pb2'
  # @@protoc_insertion_point(class_scope:request.StopBillingInstance)
  })
_sym_db.RegisterMessage(StopBillingInstance)

RecoveryBillingInstance = _reflection.GeneratedProtocolMessageType('RecoveryBillingInstance', (_message.Message,), {
  'DESCRIPTOR' : _RECOVERYBILLINGINSTANCE,
  '__module__' : 'proto.types.request.billing_pb2'
  # @@protoc_insertion_point(class_scope:request.RecoveryBillingInstance)
  })
_sym_db.RegisterMessage(RecoveryBillingInstance)


DESCRIPTOR._options = None
_CREATEBILLINGINSTANCE.fields_by_name['space_id']._options = None
_CREATEBILLINGINSTANCE.fields_by_name['user_id']._options = None
_CREATEBILLINGINSTANCE.fields_by_name['fee_type']._options = None
_CREATEBILLINGINSTANCE.fields_by_name['cu']._options = None
_STOPBILLINGINSTANCE.fields_by_name['space_id']._options = None
_STOPBILLINGINSTANCE.fields_by_name['user_id']._options = None
_RECOVERYBILLINGINSTANCE.fields_by_name['space_id']._options = None
_RECOVERYBILLINGINSTANCE.fields_by_name['user_id']._options = None
# @@protoc_insertion_point(module_scope)
