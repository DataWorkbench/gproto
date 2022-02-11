# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/response/udf_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import udf_pb2 as proto_dot_types_dot_model_dot_udf__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/response/udf_manage.proto',
  package='response',
  syntax='proto3',
  serialized_options=b'\n%com.dataomnis.gproto.types.pbresponseB\023PBResponseUDFManageP\000Z4github.com/DataWorkbench/gproto/xgo/types/pbresponse',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%proto/types/response/udf_manage.proto\x12\x08response\x1a\x1bproto/types/model/udf.proto\"7\n\x07ListUDF\x12\x1d\n\x05infos\x18\x01 \x03(\x0b\x32\x0e.model.UDFInfo\x12\r\n\x05total\x18\x02 \x01(\x03\"+\n\x0b\x44\x65scribeUDF\x12\x1c\n\x04info\x18\x01 \x01(\x0b\x32\x0e.model.UDFInfo\"\x1d\n\x08JsonList\x12\x11\n\tjson_list\x18\x01 \x03(\tBt\n%com.dataomnis.gproto.types.pbresponseB\x13PBResponseUDFManageP\x00Z4github.com/DataWorkbench/gproto/xgo/types/pbresponseb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_udf__pb2.DESCRIPTOR,])




_LISTUDF = _descriptor.Descriptor(
  name='ListUDF',
  full_name='response.ListUDF',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.ListUDF.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListUDF.total', index=1,
      number=2, type=3, cpp_type=2, label=1,
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
  serialized_start=80,
  serialized_end=135,
)


_DESCRIBEUDF = _descriptor.Descriptor(
  name='DescribeUDF',
  full_name='response.DescribeUDF',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='info', full_name='response.DescribeUDF.info', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
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
  serialized_start=137,
  serialized_end=180,
)


_JSONLIST = _descriptor.Descriptor(
  name='JsonList',
  full_name='response.JsonList',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='json_list', full_name='response.JsonList.json_list', index=0,
      number=1, type=9, cpp_type=9, label=3,
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
  serialized_start=182,
  serialized_end=211,
)

_LISTUDF.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_udf__pb2._UDFINFO
_DESCRIBEUDF.fields_by_name['info'].message_type = proto_dot_types_dot_model_dot_udf__pb2._UDFINFO
DESCRIPTOR.message_types_by_name['ListUDF'] = _LISTUDF
DESCRIPTOR.message_types_by_name['DescribeUDF'] = _DESCRIBEUDF
DESCRIPTOR.message_types_by_name['JsonList'] = _JSONLIST
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListUDF = _reflection.GeneratedProtocolMessageType('ListUDF', (_message.Message,), {
  'DESCRIPTOR' : _LISTUDF,
  '__module__' : 'proto.types.response.udf_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.ListUDF)
  })
_sym_db.RegisterMessage(ListUDF)

DescribeUDF = _reflection.GeneratedProtocolMessageType('DescribeUDF', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBEUDF,
  '__module__' : 'proto.types.response.udf_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.DescribeUDF)
  })
_sym_db.RegisterMessage(DescribeUDF)

JsonList = _reflection.GeneratedProtocolMessageType('JsonList', (_message.Message,), {
  'DESCRIPTOR' : _JSONLIST,
  '__module__' : 'proto.types.response.udf_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.JsonList)
  })
_sym_db.RegisterMessage(JsonList)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)