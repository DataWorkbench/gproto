# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/syncjob/elasticsearch.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2
from github.com.yu31.protoc_plugin.proto import gosql_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2
from github.com.yu31.protoc_plugin.proto import defaults_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2
from proto.types.model.syncjob import column_pb2 as proto_dot_types_dot_model_dot_syncjob_dot_column__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/syncjob/elasticsearch.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\017PBElasticSearchP\000Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n-proto/types/model/syncjob/elasticsearch.proto\x12\x05model\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\x1a/github.com/yu31/protoc-plugin/proto/gosql.proto\x1a\x32github.com/yu31/protoc-plugin/proto/defaults.proto\x1a&proto/types/model/syncjob/column.proto\"h\n\x13\x45lasticSearchSource\x12\x1d\n\x06\x63olumn\x18\x01 \x03(\x0b\x32\r.model.Column\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\r\n\x05index\x18\x03 \x01(\t\x12\x12\n\nbatch_size\x18\x04 \x01(\x05\"\x7f\n\x13\x45lasticSearchTarget\x12\x1d\n\x06\x63olumn\x18\x01 \x03(\x0b\x32\r.model.Column\x12\x0f\n\x07version\x18\x02 \x01(\t\x12\r\n\x05index\x18\x03 \x01(\t\x12\x12\n\nbatch_size\x18\x04 \x01(\x05\x12\x15\n\rkey_delimiter\x18\x05 \x01(\tB~\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\x0fPBElasticSearchP\x00Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjobb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_defaults__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_syncjob_dot_column__pb2.DESCRIPTOR,])




_ELASTICSEARCHSOURCE = _descriptor.Descriptor(
  name='ElasticSearchSource',
  full_name='model.ElasticSearchSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='column', full_name='model.ElasticSearchSource.column', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='model.ElasticSearchSource.version', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='index', full_name='model.ElasticSearchSource.index', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='batch_size', full_name='model.ElasticSearchSource.batch_size', index=3,
      number=4, type=5, cpp_type=1, label=1,
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
  serialized_start=250,
  serialized_end=354,
)


_ELASTICSEARCHTARGET = _descriptor.Descriptor(
  name='ElasticSearchTarget',
  full_name='model.ElasticSearchTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='column', full_name='model.ElasticSearchTarget.column', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='model.ElasticSearchTarget.version', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='index', full_name='model.ElasticSearchTarget.index', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='batch_size', full_name='model.ElasticSearchTarget.batch_size', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='key_delimiter', full_name='model.ElasticSearchTarget.key_delimiter', index=4,
      number=5, type=9, cpp_type=9, label=1,
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
  serialized_start=356,
  serialized_end=483,
)

_ELASTICSEARCHSOURCE.fields_by_name['column'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
_ELASTICSEARCHTARGET.fields_by_name['column'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
DESCRIPTOR.message_types_by_name['ElasticSearchSource'] = _ELASTICSEARCHSOURCE
DESCRIPTOR.message_types_by_name['ElasticSearchTarget'] = _ELASTICSEARCHTARGET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

ElasticSearchSource = _reflection.GeneratedProtocolMessageType('ElasticSearchSource', (_message.Message,), {
  'DESCRIPTOR' : _ELASTICSEARCHSOURCE,
  '__module__' : 'proto.types.model.syncjob.elasticsearch_pb2'
  # @@protoc_insertion_point(class_scope:model.ElasticSearchSource)
  })
_sym_db.RegisterMessage(ElasticSearchSource)

ElasticSearchTarget = _reflection.GeneratedProtocolMessageType('ElasticSearchTarget', (_message.Message,), {
  'DESCRIPTOR' : _ELASTICSEARCHTARGET,
  '__module__' : 'proto.types.model.syncjob.elasticsearch_pb2'
  # @@protoc_insertion_point(class_scope:model.ElasticSearchTarget)
  })
_sym_db.RegisterMessage(ElasticSearchTarget)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
