# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/syncjob/baseenum.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/syncjob/baseenum.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\nPBBaseEnumP\000Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjob',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n(proto/types/model/syncjob/baseenum.proto\x12\x05model\"\xe2\x05\n\x08\x42\x61seEnum\"F\n\rPartitionType\x12\x16\n\x12PartitionTypeUnset\x10\x00\x12\x07\n\x03\x44\x41Y\x10\x01\x12\x08\n\x04HOUR\x10\x02\x12\n\n\x06MINUTE\x10\x03\":\n\tWriteMode\x12\x12\n\x0eWriteModeUnset\x10\x00\x12\n\n\x06\x61ppend\x10\x01\x12\r\n\toverwrite\x10\x02\"=\n\x08\x46ileType\x12\x11\n\rFileTypeUnset\x10\x00\x12\x08\n\x04text\x10\x01\x12\x07\n\x03orc\x10\x02\x12\x0b\n\x07parquet\x10\x03\"b\n\x0c\x43ompressType\x12\x15\n\x11\x43ompressTypeUnset\x10\x00\x12\x08\n\x04GZIP\x10\x01\x12\t\n\x05\x42ZIP2\x10\x02\x12\n\n\x06SNAPPY\x10\x03\x12\x08\n\x04\x42ZIP\x10\x04\x12\x07\n\x03LZ4\x10\x05\x12\x07\n\x03LZO\x10\x06\"0\n\x08\x45ncoding\x12\x11\n\rEncodingUnset\x10\x00\x12\x08\n\x04UTF8\x10\x01\x12\x07\n\x03GBK\x10\x02\"=\n\rColumnMapping\x12\x0f\n\x0b\x43olumnUnset\x10\x00\x12\x08\n\x04Name\x10\x01\x12\x07\n\x03Row\x10\x02\x12\x08\n\x04\x41uto\x10\x03\"G\n\rConditionType\x12\x16\n\x12\x43onditionTypeUnset\x10\x00\x12\x11\n\rVisualization\x10\x01\x12\x0b\n\x07\x45xpress\x10\x02\"2\n\x08NullMode\x12\x11\n\rNullModeUnset\x10\x00\x12\x08\n\x04skip\x10\x01\x12\t\n\x05\x65mpty\x10\x02\"=\n\tCodecMode\x12\x12\n\x0e\x43odecModeUnset\x10\x00\x12\r\n\tCodecText\x10\x01\x12\r\n\tCodecJson\x10\x02\"\x81\x01\n\x0c\x43onsumerMode\x12\x15\n\x11\x43onsumerModeUnset\x10\x00\x12\x10\n\x0cGroupOffsets\x10\x01\x12\x12\n\x0e\x45\x61rliestOffset\x10\x02\x12\x10\n\x0cLatestOffset\x10\x03\x12\r\n\tTimestamp\x10\x04\x12\x13\n\x0fSpecificOffsets\x10\x05\x42y\n,com.dataomnis.gproto.types.pbmodel.pbsyncjobB\nPBBaseEnumP\x00Z;github.com/DataWorkbench/gproto/xgo/types/pbmodel/pbsyncjobb\x06proto3'
)



_BASEENUM_PARTITIONTYPE = _descriptor.EnumDescriptor(
  name='PartitionType',
  full_name='model.BaseEnum.PartitionType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='PartitionTypeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='DAY', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='HOUR', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='MINUTE', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=64,
  serialized_end=134,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_PARTITIONTYPE)

_BASEENUM_WRITEMODE = _descriptor.EnumDescriptor(
  name='WriteMode',
  full_name='model.BaseEnum.WriteMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='WriteModeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='append', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='overwrite', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=136,
  serialized_end=194,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_WRITEMODE)

_BASEENUM_FILETYPE = _descriptor.EnumDescriptor(
  name='FileType',
  full_name='model.BaseEnum.FileType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='FileTypeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='text', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='orc', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='parquet', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=196,
  serialized_end=257,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_FILETYPE)

_BASEENUM_COMPRESSTYPE = _descriptor.EnumDescriptor(
  name='CompressType',
  full_name='model.BaseEnum.CompressType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CompressTypeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GZIP', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BZIP2', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SNAPPY', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='BZIP', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LZ4', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LZO', index=6, number=6,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=259,
  serialized_end=357,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_COMPRESSTYPE)

_BASEENUM_ENCODING = _descriptor.EnumDescriptor(
  name='Encoding',
  full_name='model.BaseEnum.Encoding',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='EncodingUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='UTF8', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GBK', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=359,
  serialized_end=407,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_ENCODING)

_BASEENUM_COLUMNMAPPING = _descriptor.EnumDescriptor(
  name='ColumnMapping',
  full_name='model.BaseEnum.ColumnMapping',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ColumnUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Name', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Row', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Auto', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=409,
  serialized_end=470,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_COLUMNMAPPING)

_BASEENUM_CONDITIONTYPE = _descriptor.EnumDescriptor(
  name='ConditionType',
  full_name='model.BaseEnum.ConditionType',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ConditionTypeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Visualization', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Express', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=472,
  serialized_end=543,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_CONDITIONTYPE)

_BASEENUM_NULLMODE = _descriptor.EnumDescriptor(
  name='NullMode',
  full_name='model.BaseEnum.NullMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='NullModeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='skip', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='empty', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=545,
  serialized_end=595,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_NULLMODE)

_BASEENUM_CODECMODE = _descriptor.EnumDescriptor(
  name='CodecMode',
  full_name='model.BaseEnum.CodecMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='CodecModeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CodecText', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='CodecJson', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=597,
  serialized_end=658,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_CODECMODE)

_BASEENUM_CONSUMERMODE = _descriptor.EnumDescriptor(
  name='ConsumerMode',
  full_name='model.BaseEnum.ConsumerMode',
  filename=None,
  file=DESCRIPTOR,
  create_key=_descriptor._internal_create_key,
  values=[
    _descriptor.EnumValueDescriptor(
      name='ConsumerModeUnset', index=0, number=0,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='GroupOffsets', index=1, number=1,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='EarliestOffset', index=2, number=2,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='LatestOffset', index=3, number=3,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='Timestamp', index=4, number=4,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
    _descriptor.EnumValueDescriptor(
      name='SpecificOffsets', index=5, number=5,
      serialized_options=None,
      type=None,
      create_key=_descriptor._internal_create_key),
  ],
  containing_type=None,
  serialized_options=None,
  serialized_start=661,
  serialized_end=790,
)
_sym_db.RegisterEnumDescriptor(_BASEENUM_CONSUMERMODE)


_BASEENUM = _descriptor.Descriptor(
  name='BaseEnum',
  full_name='model.BaseEnum',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
    _BASEENUM_PARTITIONTYPE,
    _BASEENUM_WRITEMODE,
    _BASEENUM_FILETYPE,
    _BASEENUM_COMPRESSTYPE,
    _BASEENUM_ENCODING,
    _BASEENUM_COLUMNMAPPING,
    _BASEENUM_CONDITIONTYPE,
    _BASEENUM_NULLMODE,
    _BASEENUM_CODECMODE,
    _BASEENUM_CONSUMERMODE,
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
  ],
  serialized_start=52,
  serialized_end=790,
)

_BASEENUM_PARTITIONTYPE.containing_type = _BASEENUM
_BASEENUM_WRITEMODE.containing_type = _BASEENUM
_BASEENUM_FILETYPE.containing_type = _BASEENUM
_BASEENUM_COMPRESSTYPE.containing_type = _BASEENUM
_BASEENUM_ENCODING.containing_type = _BASEENUM
_BASEENUM_COLUMNMAPPING.containing_type = _BASEENUM
_BASEENUM_CONDITIONTYPE.containing_type = _BASEENUM
_BASEENUM_NULLMODE.containing_type = _BASEENUM
_BASEENUM_CODECMODE.containing_type = _BASEENUM
_BASEENUM_CONSUMERMODE.containing_type = _BASEENUM
DESCRIPTOR.message_types_by_name['BaseEnum'] = _BASEENUM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

BaseEnum = _reflection.GeneratedProtocolMessageType('BaseEnum', (_message.Message,), {
  'DESCRIPTOR' : _BASEENUM,
  '__module__' : 'proto.types.model.syncjob.baseenum_pb2'
  # @@protoc_insertion_point(class_scope:model.BaseEnum)
  })
_sym_db.RegisterMessage(BaseEnum)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
