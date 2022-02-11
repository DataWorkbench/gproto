# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/request/account.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/request/account.proto',
  package='request',
  syntax='proto3',
  serialized_options=b'\n$com.dataomnis.gproto.types.pbrequestB\020PBRequestAccountP\000Z3github.com/DataWorkbench/gproto/xgo/types/pbrequest',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n!proto/types/request/account.proto\x12\x07request\"*\n\x11\x44\x65scribeAccessKey\x12\x15\n\raccess_key_id\x18\x01 \x01(\t\"Q\n\rDescribeUsers\x12\r\n\x05users\x18\x01 \x03(\t\x12\r\n\x05limit\x18\x02 \x01(\x05\x12\x0e\n\x06offset\x18\x03 \x01(\x05\x12\x12\n\nreq_source\x18\x04 \x01(\t\"\xca\x01\n\x18ValidateRequestSignature\x12\x12\n\nreq_method\x18\x01 \x01(\t\x12\x10\n\x08req_path\x18\x02 \x01(\t\x12\x18\n\x10req_query_string\x18\x03 \x01(\t\x12\x10\n\x08req_body\x18\x04 \x01(\t\x12\x15\n\rreq_signature\x18\x05 \x01(\t\x12\x19\n\x11req_access_key_id\x18\x06 \x01(\t\x12\x12\n\nreq_source\x18\x07 \x01(\t\x12\x16\n\x0ereq_user_agent\x18\x08 \x01(\tBo\n$com.dataomnis.gproto.types.pbrequestB\x10PBRequestAccountP\x00Z3github.com/DataWorkbench/gproto/xgo/types/pbrequestb\x06proto3'
)




_DESCRIBEACCESSKEY = _descriptor.Descriptor(
  name='DescribeAccessKey',
  full_name='request.DescribeAccessKey',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='access_key_id', full_name='request.DescribeAccessKey.access_key_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
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
  serialized_start=46,
  serialized_end=88,
)


_DESCRIBEUSERS = _descriptor.Descriptor(
  name='DescribeUsers',
  full_name='request.DescribeUsers',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='users', full_name='request.DescribeUsers.users', index=0,
      number=1, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='limit', full_name='request.DescribeUsers.limit', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='request.DescribeUsers.offset', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_source', full_name='request.DescribeUsers.req_source', index=3,
      number=4, type=9, cpp_type=9, label=1,
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
  serialized_start=90,
  serialized_end=171,
)


_VALIDATEREQUESTSIGNATURE = _descriptor.Descriptor(
  name='ValidateRequestSignature',
  full_name='request.ValidateRequestSignature',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='req_method', full_name='request.ValidateRequestSignature.req_method', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_path', full_name='request.ValidateRequestSignature.req_path', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_query_string', full_name='request.ValidateRequestSignature.req_query_string', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_body', full_name='request.ValidateRequestSignature.req_body', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_signature', full_name='request.ValidateRequestSignature.req_signature', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_access_key_id', full_name='request.ValidateRequestSignature.req_access_key_id', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_source', full_name='request.ValidateRequestSignature.req_source', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='req_user_agent', full_name='request.ValidateRequestSignature.req_user_agent', index=7,
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
  serialized_start=174,
  serialized_end=376,
)

DESCRIPTOR.message_types_by_name['DescribeAccessKey'] = _DESCRIBEACCESSKEY
DESCRIPTOR.message_types_by_name['DescribeUsers'] = _DESCRIBEUSERS
DESCRIPTOR.message_types_by_name['ValidateRequestSignature'] = _VALIDATEREQUESTSIGNATURE
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

DescribeAccessKey = _reflection.GeneratedProtocolMessageType('DescribeAccessKey', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEACCESSKEY,
  '__module__' : 'proto.types.request.account_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeAccessKey)
  })
_sym_db.RegisterMessage(DescribeAccessKey)

DescribeUsers = _reflection.GeneratedProtocolMessageType('DescribeUsers', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEUSERS,
  '__module__' : 'proto.types.request.account_pb2'
  # @@protoc_insertion_point(class_scope:request.DescribeUsers)
  })
_sym_db.RegisterMessage(DescribeUsers)

ValidateRequestSignature = _reflection.GeneratedProtocolMessageType('ValidateRequestSignature', (_message.Message,), {
  'DESCRIPTOR' : _VALIDATEREQUESTSIGNATURE,
  '__module__' : 'proto.types.request.account_pb2'
  # @@protoc_insertion_point(class_scope:request.ValidateRequestSignature)
  })
_sym_db.RegisterMessage(ValidateRequestSignature)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)