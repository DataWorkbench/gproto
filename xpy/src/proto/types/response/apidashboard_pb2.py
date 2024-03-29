# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/response/apidashboard.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import apidashboard_pb2 as proto_dot_types_dot_model_dot_apidashboard__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/response/apidashboard.proto',
  package='response',
  syntax='proto3',
  serialized_options=b'\n%com.dataomnis.gproto.types.pbresponseB\026PBResponseApiDashboardP\000Z4github.com/DataWorkbench/gproto/xgo/types/pbresponse',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n\'proto/types/response/apidashboard.proto\x12\x08response\x1a$proto/types/model/apidashboard.proto\"\x19\n\x0b\x43reateRoute\x12\n\n\x02id\x18\x01 \x01(\t\"\x1c\n\x0eRepublishRoute\x12\n\n\x02id\x18\x01 \x01(\t\"M\n\nListRoutes\x12\x1e\n\x08\x65ntities\x18\x01 \x03(\x0b\x32\x0c.model.Route\x12\r\n\x05total\x18\x02 \x01(\x03\x12\x10\n\x08has_more\x18\x03 \x01(\x08\"Y\n\rListUpstreams\x12\'\n\x08\x65ntities\x18\x01 \x03(\x0b\x32\x15.model.UpstreamEntity\x12\r\n\x05total\x18\x02 \x01(\x03\x12\x10\n\x08has_more\x18\x03 \x01(\x08\"\x1c\n\x0e\x43reateUpstream\x12\n\n\x02id\x18\x01 \x01(\t\"\x17\n\tCreateSSL\x12\n\n\x02id\x18\x01 \x01(\t\"7\n\x08ListSSLs\x12\x1c\n\x08\x65ntities\x18\x01 \x03(\x0b\x32\n.model.SSL\x12\r\n\x05total\x18\x02 \x01(\x03\"\x1e\n\x10\x43reateApiService\x12\n\n\x02id\x18\x01 \x01(\t\"]\n\x0fListApiServices\x12)\n\x08\x65ntities\x18\x01 \x03(\x0b\x32\x17.model.ApiServiceEntity\x12\r\n\x05total\x18\x02 \x01(\x03\x12\x10\n\x08has_more\x18\x03 \x01(\x08\"W\n\x0cListAuthKeys\x12&\n\x08\x65ntities\x18\x01 \x03(\x0b\x32\x14.model.AuthKeyEntity\x12\r\n\x05total\x18\x02 \x01(\x03\x12\x10\n\x08has_more\x18\x03 \x01(\x08\"/\n\rCreateAuthKey\x12\n\n\x02id\x18\x01 \x01(\t\x12\x12\n\nsecret_key\x18\x02 \x01(\t\"+\n\x0eGetSvcReqCount\x12\n\n\x02id\x18\x01 \x01(\t\x12\r\n\x05\x63ount\x18\x02 \x01(\x05\x42w\n%com.dataomnis.gproto.types.pbresponseB\x16PBResponseApiDashboardP\x00Z4github.com/DataWorkbench/gproto/xgo/types/pbresponseb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_apidashboard__pb2.DESCRIPTOR,])




_CREATEROUTE = _descriptor.Descriptor(
  name='CreateRoute',
  full_name='response.CreateRoute',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.CreateRoute.id', index=0,
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
  serialized_start=91,
  serialized_end=116,
)


_REPUBLISHROUTE = _descriptor.Descriptor(
  name='RepublishRoute',
  full_name='response.RepublishRoute',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.RepublishRoute.id', index=0,
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
  serialized_start=118,
  serialized_end=146,
)


_LISTROUTES = _descriptor.Descriptor(
  name='ListRoutes',
  full_name='response.ListRoutes',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entities', full_name='response.ListRoutes.entities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListRoutes.total', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_more', full_name='response.ListRoutes.has_more', index=2,
      number=3, type=8, cpp_type=7, label=1,
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
  serialized_start=148,
  serialized_end=225,
)


_LISTUPSTREAMS = _descriptor.Descriptor(
  name='ListUpstreams',
  full_name='response.ListUpstreams',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entities', full_name='response.ListUpstreams.entities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListUpstreams.total', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_more', full_name='response.ListUpstreams.has_more', index=2,
      number=3, type=8, cpp_type=7, label=1,
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
  serialized_start=227,
  serialized_end=316,
)


_CREATEUPSTREAM = _descriptor.Descriptor(
  name='CreateUpstream',
  full_name='response.CreateUpstream',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.CreateUpstream.id', index=0,
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
  serialized_start=318,
  serialized_end=346,
)


_CREATESSL = _descriptor.Descriptor(
  name='CreateSSL',
  full_name='response.CreateSSL',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.CreateSSL.id', index=0,
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
  serialized_start=348,
  serialized_end=371,
)


_LISTSSLS = _descriptor.Descriptor(
  name='ListSSLs',
  full_name='response.ListSSLs',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entities', full_name='response.ListSSLs.entities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListSSLs.total', index=1,
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
  serialized_start=373,
  serialized_end=428,
)


_CREATEAPISERVICE = _descriptor.Descriptor(
  name='CreateApiService',
  full_name='response.CreateApiService',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.CreateApiService.id', index=0,
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
  serialized_start=430,
  serialized_end=460,
)


_LISTAPISERVICES = _descriptor.Descriptor(
  name='ListApiServices',
  full_name='response.ListApiServices',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entities', full_name='response.ListApiServices.entities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListApiServices.total', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_more', full_name='response.ListApiServices.has_more', index=2,
      number=3, type=8, cpp_type=7, label=1,
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
  serialized_start=462,
  serialized_end=555,
)


_LISTAUTHKEYS = _descriptor.Descriptor(
  name='ListAuthKeys',
  full_name='response.ListAuthKeys',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='entities', full_name='response.ListAuthKeys.entities', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.ListAuthKeys.total', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='has_more', full_name='response.ListAuthKeys.has_more', index=2,
      number=3, type=8, cpp_type=7, label=1,
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
  serialized_start=557,
  serialized_end=644,
)


_CREATEAUTHKEY = _descriptor.Descriptor(
  name='CreateAuthKey',
  full_name='response.CreateAuthKey',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.CreateAuthKey.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='secret_key', full_name='response.CreateAuthKey.secret_key', index=1,
      number=2, type=9, cpp_type=9, label=1,
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
  serialized_start=646,
  serialized_end=693,
)


_GETSVCREQCOUNT = _descriptor.Descriptor(
  name='GetSvcReqCount',
  full_name='response.GetSvcReqCount',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='response.GetSvcReqCount.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='count', full_name='response.GetSvcReqCount.count', index=1,
      number=2, type=5, cpp_type=1, label=1,
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
  serialized_start=695,
  serialized_end=738,
)

_LISTROUTES.fields_by_name['entities'].message_type = proto_dot_types_dot_model_dot_apidashboard__pb2._ROUTE
_LISTUPSTREAMS.fields_by_name['entities'].message_type = proto_dot_types_dot_model_dot_apidashboard__pb2._UPSTREAMENTITY
_LISTSSLS.fields_by_name['entities'].message_type = proto_dot_types_dot_model_dot_apidashboard__pb2._SSL
_LISTAPISERVICES.fields_by_name['entities'].message_type = proto_dot_types_dot_model_dot_apidashboard__pb2._APISERVICEENTITY
_LISTAUTHKEYS.fields_by_name['entities'].message_type = proto_dot_types_dot_model_dot_apidashboard__pb2._AUTHKEYENTITY
DESCRIPTOR.message_types_by_name['CreateRoute'] = _CREATEROUTE
DESCRIPTOR.message_types_by_name['RepublishRoute'] = _REPUBLISHROUTE
DESCRIPTOR.message_types_by_name['ListRoutes'] = _LISTROUTES
DESCRIPTOR.message_types_by_name['ListUpstreams'] = _LISTUPSTREAMS
DESCRIPTOR.message_types_by_name['CreateUpstream'] = _CREATEUPSTREAM
DESCRIPTOR.message_types_by_name['CreateSSL'] = _CREATESSL
DESCRIPTOR.message_types_by_name['ListSSLs'] = _LISTSSLS
DESCRIPTOR.message_types_by_name['CreateApiService'] = _CREATEAPISERVICE
DESCRIPTOR.message_types_by_name['ListApiServices'] = _LISTAPISERVICES
DESCRIPTOR.message_types_by_name['ListAuthKeys'] = _LISTAUTHKEYS
DESCRIPTOR.message_types_by_name['CreateAuthKey'] = _CREATEAUTHKEY
DESCRIPTOR.message_types_by_name['GetSvcReqCount'] = _GETSVCREQCOUNT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

CreateRoute = _reflection.GeneratedProtocolMessageType('CreateRoute', (_message.Message,), {
  'DESCRIPTOR' : _CREATEROUTE,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.CreateRoute)
  })
_sym_db.RegisterMessage(CreateRoute)

RepublishRoute = _reflection.GeneratedProtocolMessageType('RepublishRoute', (_message.Message,), {
  'DESCRIPTOR' : _REPUBLISHROUTE,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.RepublishRoute)
  })
_sym_db.RegisterMessage(RepublishRoute)

ListRoutes = _reflection.GeneratedProtocolMessageType('ListRoutes', (_message.Message,), {
  'DESCRIPTOR' : _LISTROUTES,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.ListRoutes)
  })
_sym_db.RegisterMessage(ListRoutes)

ListUpstreams = _reflection.GeneratedProtocolMessageType('ListUpstreams', (_message.Message,), {
  'DESCRIPTOR' : _LISTUPSTREAMS,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.ListUpstreams)
  })
_sym_db.RegisterMessage(ListUpstreams)

CreateUpstream = _reflection.GeneratedProtocolMessageType('CreateUpstream', (_message.Message,), {
  'DESCRIPTOR' : _CREATEUPSTREAM,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.CreateUpstream)
  })
_sym_db.RegisterMessage(CreateUpstream)

CreateSSL = _reflection.GeneratedProtocolMessageType('CreateSSL', (_message.Message,), {
  'DESCRIPTOR' : _CREATESSL,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.CreateSSL)
  })
_sym_db.RegisterMessage(CreateSSL)

ListSSLs = _reflection.GeneratedProtocolMessageType('ListSSLs', (_message.Message,), {
  'DESCRIPTOR' : _LISTSSLS,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.ListSSLs)
  })
_sym_db.RegisterMessage(ListSSLs)

CreateApiService = _reflection.GeneratedProtocolMessageType('CreateApiService', (_message.Message,), {
  'DESCRIPTOR' : _CREATEAPISERVICE,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.CreateApiService)
  })
_sym_db.RegisterMessage(CreateApiService)

ListApiServices = _reflection.GeneratedProtocolMessageType('ListApiServices', (_message.Message,), {
  'DESCRIPTOR' : _LISTAPISERVICES,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.ListApiServices)
  })
_sym_db.RegisterMessage(ListApiServices)

ListAuthKeys = _reflection.GeneratedProtocolMessageType('ListAuthKeys', (_message.Message,), {
  'DESCRIPTOR' : _LISTAUTHKEYS,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.ListAuthKeys)
  })
_sym_db.RegisterMessage(ListAuthKeys)

CreateAuthKey = _reflection.GeneratedProtocolMessageType('CreateAuthKey', (_message.Message,), {
  'DESCRIPTOR' : _CREATEAUTHKEY,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.CreateAuthKey)
  })
_sym_db.RegisterMessage(CreateAuthKey)

GetSvcReqCount = _reflection.GeneratedProtocolMessageType('GetSvcReqCount', (_message.Message,), {
  'DESCRIPTOR' : _GETSVCREQCOUNT,
  '__module__' : 'proto.types.response.apidashboard_pb2'
  # @@protoc_insertion_point(class_scope:response.GetSvcReqCount)
  })
_sym_db.RegisterMessage(GetSvcReqCount)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
