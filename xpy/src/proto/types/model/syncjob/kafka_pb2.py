# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/syncjob/kafka.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model.syncjob import column_pb2 as proto_dot_types_dot_model_dot_syncjob_dot_column__pb2
from github.com.yu31.protoc_plugin.proto import gosql_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2
from proto.types.model.syncjob import baseenum_pb2 as proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/syncjob/kafka.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\007PBKafkaP\000Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%proto/types/model/syncjob/kafka.proto\x12\x05model\x1a&proto/types/model/syncjob/column.proto\x1a/github.com/yu31/protoc-plugin/proto/gosql.proto\x1a(proto/types/model/syncjob/baseenum.proto\"\xf8\x02\n\x0bKafkaSource\x12\x1d\n\x06\x63olumn\x18\x01 \x03(\x0b\x32\r.model.Column\x12\r\n\x05topic\x18\x02 \x01(\t\x12*\n\x04mode\x18\x03 \x01(\x0e\x32\x1c.model.BaseEnum.ConsumerMode\x12\x11\n\ttimestamp\x18\x04 \x01(\x03\x12\x0e\n\x06offset\x18\x05 \x01(\t\x12\x10\n\x08group_id\x18\x06 \x01(\t\x12*\n\x08\x65ncoding\x18\x07 \x01(\x0e\x32\x18.model.BaseEnum.Encoding\x12(\n\x05\x63odec\x18\x08 \x01(\x0e\x32\x19.model.BaseEnum.CodecMode\x12\x43\n\x11\x63onsumer_settings\x18\t \x03(\x0b\x32(.model.KafkaSource.ConsumerSettingsEntry\x1a\x37\n\x15\x43onsumerSettingsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x06\xca\xb2\x04\x02\n\x00\"\xc6\x01\n\x0bKafkaTarget\x12\"\n\x0btableFields\x18\x01 \x03(\x0b\x32\r.model.Column\x12\r\n\x05topic\x18\x02 \x01(\t\x12\x43\n\x11producer_settings\x18\x03 \x03(\x0b\x32(.model.KafkaTarget.ProducerSettingsEntry\x1a\x37\n\x15ProducerSettingsEntry\x12\x0b\n\x03key\x18\x01 \x01(\t\x12\r\n\x05value\x18\x02 \x01(\t:\x02\x38\x01:\x06\xca\xb2\x04\x02\n\x00\x42v\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\x07PBKafkaP\x00Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjobb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_syncjob_dot_column__pb2.DESCRIPTOR,github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_gosql__pb2.DESCRIPTOR,proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2.DESCRIPTOR,])




_KAFKASOURCE_CONSUMERSETTINGSENTRY = _descriptor.Descriptor(
  name='ConsumerSettingsEntry',
  full_name='model.KafkaSource.ConsumerSettingsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='model.KafkaSource.ConsumerSettingsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='model.KafkaSource.ConsumerSettingsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=493,
  serialized_end=548,
)

_KAFKASOURCE = _descriptor.Descriptor(
  name='KafkaSource',
  full_name='model.KafkaSource',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='column', full_name='model.KafkaSource.column', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='topic', full_name='model.KafkaSource.topic', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='mode', full_name='model.KafkaSource.mode', index=2,
      number=3, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='timestamp', full_name='model.KafkaSource.timestamp', index=3,
      number=4, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='model.KafkaSource.offset', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='group_id', full_name='model.KafkaSource.group_id', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='encoding', full_name='model.KafkaSource.encoding', index=6,
      number=7, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='codec', full_name='model.KafkaSource.codec', index=7,
      number=8, type=14, cpp_type=8, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='consumer_settings', full_name='model.KafkaSource.consumer_settings', index=8,
      number=9, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_KAFKASOURCE_CONSUMERSETTINGSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\312\262\004\002\n\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=180,
  serialized_end=556,
)


_KAFKATARGET_PRODUCERSETTINGSENTRY = _descriptor.Descriptor(
  name='ProducerSettingsEntry',
  full_name='model.KafkaTarget.ProducerSettingsEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='key', full_name='model.KafkaTarget.ProducerSettingsEntry.key', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='value', full_name='model.KafkaTarget.ProducerSettingsEntry.value', index=1,
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
  serialized_options=b'8\001',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=694,
  serialized_end=749,
)

_KAFKATARGET = _descriptor.Descriptor(
  name='KafkaTarget',
  full_name='model.KafkaTarget',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='tableFields', full_name='model.KafkaTarget.tableFields', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='topic', full_name='model.KafkaTarget.topic', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='producer_settings', full_name='model.KafkaTarget.producer_settings', index=2,
      number=3, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
  ],
  extensions=[
  ],
  nested_types=[_KAFKATARGET_PRODUCERSETTINGSENTRY, ],
  enum_types=[
  ],
  serialized_options=b'\312\262\004\002\n\000',
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=559,
  serialized_end=757,
)

_KAFKASOURCE_CONSUMERSETTINGSENTRY.containing_type = _KAFKASOURCE
_KAFKASOURCE.fields_by_name['column'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
_KAFKASOURCE.fields_by_name['mode'].enum_type = proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2._BASEENUM_CONSUMERMODE
_KAFKASOURCE.fields_by_name['encoding'].enum_type = proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2._BASEENUM_ENCODING
_KAFKASOURCE.fields_by_name['codec'].enum_type = proto_dot_types_dot_model_dot_syncjob_dot_baseenum__pb2._BASEENUM_CODECMODE
_KAFKASOURCE.fields_by_name['consumer_settings'].message_type = _KAFKASOURCE_CONSUMERSETTINGSENTRY
_KAFKATARGET_PRODUCERSETTINGSENTRY.containing_type = _KAFKATARGET
_KAFKATARGET.fields_by_name['tableFields'].message_type = proto_dot_types_dot_model_dot_syncjob_dot_column__pb2._COLUMN
_KAFKATARGET.fields_by_name['producer_settings'].message_type = _KAFKATARGET_PRODUCERSETTINGSENTRY
DESCRIPTOR.message_types_by_name['KafkaSource'] = _KAFKASOURCE
DESCRIPTOR.message_types_by_name['KafkaTarget'] = _KAFKATARGET
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

KafkaSource = _reflection.GeneratedProtocolMessageType('KafkaSource', (_message.Message,), {

  'ConsumerSettingsEntry' : _reflection.GeneratedProtocolMessageType('ConsumerSettingsEntry', (_message.Message,), {
    'DESCRIPTOR' : _KAFKASOURCE_CONSUMERSETTINGSENTRY,
    '__module__' : 'proto.types.model.syncjob.kafka_pb2'
    # @@protoc_insertion_point(class_scope:model.KafkaSource.ConsumerSettingsEntry)
    })
  ,
  'DESCRIPTOR' : _KAFKASOURCE,
  '__module__' : 'proto.types.model.syncjob.kafka_pb2'
  # @@protoc_insertion_point(class_scope:model.KafkaSource)
  })
_sym_db.RegisterMessage(KafkaSource)
_sym_db.RegisterMessage(KafkaSource.ConsumerSettingsEntry)

KafkaTarget = _reflection.GeneratedProtocolMessageType('KafkaTarget', (_message.Message,), {

  'ProducerSettingsEntry' : _reflection.GeneratedProtocolMessageType('ProducerSettingsEntry', (_message.Message,), {
    'DESCRIPTOR' : _KAFKATARGET_PRODUCERSETTINGSENTRY,
    '__module__' : 'proto.types.model.syncjob.kafka_pb2'
    # @@protoc_insertion_point(class_scope:model.KafkaTarget.ProducerSettingsEntry)
    })
  ,
  'DESCRIPTOR' : _KAFKATARGET,
  '__module__' : 'proto.types.model.syncjob.kafka_pb2'
  # @@protoc_insertion_point(class_scope:model.KafkaTarget)
  })
_sym_db.RegisterMessage(KafkaTarget)
_sym_db.RegisterMessage(KafkaTarget.ProducerSettingsEntry)


DESCRIPTOR._options = None
_KAFKASOURCE_CONSUMERSETTINGSENTRY._options = None
_KAFKASOURCE._options = None
_KAFKATARGET_PRODUCERSETTINGSENTRY._options = None
_KAFKATARGET._options = None
# @@protoc_insertion_point(module_scope)
