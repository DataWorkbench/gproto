# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/error.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/error.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n\"com.dataomnis.gproto.types.pbmodelB\014PBModelErrorP\000Z1github.com/DataWorkbench/gproto/pkg/types/pbmodel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\x1dproto/types/model/error.proto\x12\x05model\"C\n\x05\x45rror\x12\x0c\n\x04\x63ode\x18\x01 \x01(\t\x12\x0e\n\x06status\x18\x02 \x01(\x05\x12\r\n\x05\x65n_us\x18\x03 \x01(\t\x12\r\n\x05zh_cn\x18\x04 \x01(\tBg\n\"com.dataomnis.gproto.types.pbmodelB\x0cPBModelErrorP\x00Z1github.com/DataWorkbench/gproto/pkg/types/pbmodelb\x06proto3'
)




_ERROR = _descriptor.Descriptor(
  name='Error',
  full_name='model.Error',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='code', full_name='model.Error.code', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='model.Error.status', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='en_us', full_name='model.Error.en_us', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='zh_cn', full_name='model.Error.zh_cn', index=3,
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
  serialized_start=40,
  serialized_end=107,
)

DESCRIPTOR.message_types_by_name['Error'] = _ERROR
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

Error = _reflection.GeneratedProtocolMessageType('Error', (_message.Message,), {
  'DESCRIPTOR' : _ERROR,
  '__module__' : 'proto.types.model.error_pb2'
  # @@protoc_insertion_point(class_scope:model.Error)
  })
_sym_db.RegisterMessage(Error)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
