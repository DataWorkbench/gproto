# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/response/network_manage.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import network_pb2 as proto_dot_types_dot_model_dot_network__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/response/network_manage.proto',
  package='response',
  syntax='proto3',
  serialized_options=b'\n%com.dataomnis.gproto.types.pbresponseB\027PBResponseNetworkManageP\000Z4github.com/DataWorkbench/gproto/xgo/types/pbresponse',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n)proto/types/response/network_manage.proto\x12\x08response\x1a\x1fproto/types/model/network.proto\"N\n\x0cListNetworks\x12\x1d\n\x05infos\x18\x01 \x03(\x0b\x32\x0e.model.Network\x12\x10\n\x08has_more\x18\x02 \x01(\x08\x12\r\n\x05total\x18\x03 \x01(\x03\"\x1b\n\rCreateNetwork\x12\n\n\x02id\x18\x01 \x01(\t\"/\n\x0f\x44\x65scribeNetwork\x12\x1c\n\x04info\x18\x01 \x01(\x0b\x32\x0e.model.NetworkBx\n%com.dataomnis.gproto.types.pbresponseB\x17PBResponseNetworkManageP\x00Z4github.com/DataWorkbench/gproto/xgo/types/pbresponseb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_network__pb2.DESCRIPTOR,])




_LISTNETWORKS = _descriptor.Descriptor(
  name='ListNetworks',
  full_name='response.ListNetworks',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.ListNetworks.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_more', full_name='response.ListNetworks.has_more', index=1,
      number=2, type=8, cpp_type=7, label=1,
      has_default_value=False, default_value=False,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListNetworks.total', index=2,
      number=3, type=3, cpp_type=2, label=1,
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
  serialized_start=88,
  serialized_end=166,
)


_CREATENETWORK = _descriptor.Descriptor(
  name='CreateNetwork',
  full_name='response.CreateNetwork',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.CreateNetwork.id', index=0,
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
  serialized_start=168,
  serialized_end=195,
)


_DESCRIBENETWORK = _descriptor.Descriptor(
  name='DescribeNetwork',
  full_name='response.DescribeNetwork',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='info', full_name='response.DescribeNetwork.info', index=0,
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
  serialized_start=197,
  serialized_end=244,
)

_LISTNETWORKS.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_network__pb2._NETWORK
_DESCRIBENETWORK.fields_by_name['info'].message_type = proto_dot_types_dot_model_dot_network__pb2._NETWORK
DESCRIPTOR.message_types_by_name['ListNetworks'] = _LISTNETWORKS
DESCRIPTOR.message_types_by_name['CreateNetwork'] = _CREATENETWORK
DESCRIPTOR.message_types_by_name['DescribeNetwork'] = _DESCRIBENETWORK
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ListNetworks = _reflection.GeneratedProtocolMessageType('ListNetworks', (_message.Message,), {
  'DESCRIPTOR' : _LISTNETWORKS,
  '__module__' : 'proto.types.response.network_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.ListNetworks)
  })
_sym_db.RegisterMessage(ListNetworks)

CreateNetwork = _reflection.GeneratedProtocolMessageType('CreateNetwork', (_message.Message,), {
  'DESCRIPTOR' : _CREATENETWORK,
  '__module__' : 'proto.types.response.network_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.CreateNetwork)
  })
_sym_db.RegisterMessage(CreateNetwork)

DescribeNetwork = _reflection.GeneratedProtocolMessageType('DescribeNetwork', (_message.Message,), {
  'DESCRIPTOR' : _DESCRIBENETWORK,
  '__module__' : 'proto.types.response.network_manage_pb2'
  # @@protoc_insertion_point(class_scope:response.DescribeNetwork)
  })
_sym_db.RegisterMessage(DescribeNetwork)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
