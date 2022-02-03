# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/model/observer.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from github.com.yu31.protoc_plugin.proto import validator_pb2 as github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/model/observer.proto',
  package='model',
  syntax='proto3',
  serialized_options=b'\n\"com.dataomnis.gproto.types.pbmodelB\017PBModelObserverP\000Z1github.com/DataWorkbench/gproto/pkg/types/pbmodel',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n proto/types/model/observer.proto\x12\x05model\x1a\x33github.com/yu31/protoc-plugin/proto/validator.proto\"L\n\x12InstanceStatusStat\x12\x1a\n\x05state\x18\x01 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12\x1a\n\x05\x63ount\x18\x02 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\"{\n\x17InstanceRuntimeRankInfo\x12\x10\n\x02id\x18\x01 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x14\n\x06job_id\x18\x02 \x01(\tB\x04\xe2\xdf\x1f\x00\x12!\n\x0crunning_time\x18\x03 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12\x15\n\x07version\x18\x04 \x01(\tB\x04\xe2\xdf\x1f\x00\"f\n\x15InstanceErrorRankInfo\x12\x14\n\x06job_id\x18\x01 \x01(\tB\x04\xe2\xdf\x1f\x00\x12\x15\n\x07version\x18\x02 \x01(\tB\x04\xe2\xdf\x1f\x00\x12 \n\x0b\x65rror_count\x18\x03 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\"{\n\x15\x44ispatchTaskCountInfo\x12\x1f\n\nflow_count\x18\x01 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12#\n\x0einstance_count\x18\x02 \x01(\x05\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x12\x1c\n\x07updated\x18\x06 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02\x30\x00\"X\n\x14InstanceTaskExecStat\x12\x1b\n\x04hour\x18\x01 \x01(\x05\x42\r\xe2\xdf\x1f\t\x12\x07\xb2\x01\x04\x38\x18@\x00\x12#\n\x0einstance_count\x18\x02 \x01(\x03\x42\x0b\xe2\xdf\x1f\x07\x12\x05\xb2\x01\x02@\x00\x42j\n\"com.dataomnis.gproto.types.pbmodelB\x0fPBModelObserverP\x00Z1github.com/DataWorkbench/gproto/pkg/types/pbmodelb\x06proto3'
  ,
  dependencies=[github_dot_com_dot_yu31_dot_protoc__plugin_dot_proto_dot_validator__pb2.DESCRIPTOR,])




_INSTANCESTATUSSTAT = _descriptor.Descriptor(
  name='InstanceStatusStat',
  full_name='model.InstanceStatusStat',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='state', full_name='model.InstanceStatusStat.state', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='count', full_name='model.InstanceStatusStat.count', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=96,
  serialized_end=172,
)


_INSTANCERUNTIMERANKINFO = _descriptor.Descriptor(
  name='InstanceRuntimeRankInfo',
  full_name='model.InstanceRuntimeRankInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='id', full_name='model.InstanceRuntimeRankInfo.id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='job_id', full_name='model.InstanceRuntimeRankInfo.job_id', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='running_time', full_name='model.InstanceRuntimeRankInfo.running_time', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='model.InstanceRuntimeRankInfo.version', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_end=297,
)


_INSTANCEERRORRANKINFO = _descriptor.Descriptor(
  name='InstanceErrorRankInfo',
  full_name='model.InstanceErrorRankInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='job_id', full_name='model.InstanceErrorRankInfo.job_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='version', full_name='model.InstanceErrorRankInfo.version', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='error_count', full_name='model.InstanceErrorRankInfo.error_count', index=2,
      number=3, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=299,
  serialized_end=401,
)


_DISPATCHTASKCOUNTINFO = _descriptor.Descriptor(
  name='DispatchTaskCountInfo',
  full_name='model.DispatchTaskCountInfo',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='flow_count', full_name='model.DispatchTaskCountInfo.flow_count', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_count', full_name='model.DispatchTaskCountInfo.instance_count', index=1,
      number=2, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='updated', full_name='model.DispatchTaskCountInfo.updated', index=2,
      number=6, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\0020\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=403,
  serialized_end=526,
)


_INSTANCETASKEXECSTAT = _descriptor.Descriptor(
  name='InstanceTaskExecStat',
  full_name='model.InstanceTaskExecStat',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='hour', full_name='model.InstanceTaskExecStat.hour', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\t\022\007\262\001\0048\030@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='instance_count', full_name='model.InstanceTaskExecStat.instance_count', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=b'\342\337\037\007\022\005\262\001\002@\000', file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  serialized_start=528,
  serialized_end=616,
)

DESCRIPTOR.message_types_by_name['InstanceStatusStat'] = _INSTANCESTATUSSTAT
DESCRIPTOR.message_types_by_name['InstanceRuntimeRankInfo'] = _INSTANCERUNTIMERANKINFO
DESCRIPTOR.message_types_by_name['InstanceErrorRankInfo'] = _INSTANCEERRORRANKINFO
DESCRIPTOR.message_types_by_name['DispatchTaskCountInfo'] = _DISPATCHTASKCOUNTINFO
DESCRIPTOR.message_types_by_name['InstanceTaskExecStat'] = _INSTANCETASKEXECSTAT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

InstanceStatusStat = _reflection.GeneratedProtocolMessageType('InstanceStatusStat', (_message.Message,), {
  'DESCRIPTOR' : _INSTANCESTATUSSTAT,
  '__module__' : 'proto.types.model.observer_pb2'
  # @@protoc_insertion_point(class_scope:model.InstanceStatusStat)
  })
_sym_db.RegisterMessage(InstanceStatusStat)

InstanceRuntimeRankInfo = _reflection.GeneratedProtocolMessageType('InstanceRuntimeRankInfo', (_message.Message,), {
  'DESCRIPTOR' : _INSTANCERUNTIMERANKINFO,
  '__module__' : 'proto.types.model.observer_pb2'
  # @@protoc_insertion_point(class_scope:model.InstanceRuntimeRankInfo)
  })
_sym_db.RegisterMessage(InstanceRuntimeRankInfo)

InstanceErrorRankInfo = _reflection.GeneratedProtocolMessageType('InstanceErrorRankInfo', (_message.Message,), {
  'DESCRIPTOR' : _INSTANCEERRORRANKINFO,
  '__module__' : 'proto.types.model.observer_pb2'
  # @@protoc_insertion_point(class_scope:model.InstanceErrorRankInfo)
  })
_sym_db.RegisterMessage(InstanceErrorRankInfo)

DispatchTaskCountInfo = _reflection.GeneratedProtocolMessageType('DispatchTaskCountInfo', (_message.Message,), {
  'DESCRIPTOR' : _DISPATCHTASKCOUNTINFO,
  '__module__' : 'proto.types.model.observer_pb2'
  # @@protoc_insertion_point(class_scope:model.DispatchTaskCountInfo)
  })
_sym_db.RegisterMessage(DispatchTaskCountInfo)

InstanceTaskExecStat = _reflection.GeneratedProtocolMessageType('InstanceTaskExecStat', (_message.Message,), {
  'DESCRIPTOR' : _INSTANCETASKEXECSTAT,
  '__module__' : 'proto.types.model.observer_pb2'
  # @@protoc_insertion_point(class_scope:model.InstanceTaskExecStat)
  })
_sym_db.RegisterMessage(InstanceTaskExecStat)


DESCRIPTOR._options = None
_INSTANCESTATUSSTAT.fields_by_name['state']._options = None
_INSTANCESTATUSSTAT.fields_by_name['count']._options = None
_INSTANCERUNTIMERANKINFO.fields_by_name['id']._options = None
_INSTANCERUNTIMERANKINFO.fields_by_name['job_id']._options = None
_INSTANCERUNTIMERANKINFO.fields_by_name['running_time']._options = None
_INSTANCERUNTIMERANKINFO.fields_by_name['version']._options = None
_INSTANCEERRORRANKINFO.fields_by_name['job_id']._options = None
_INSTANCEERRORRANKINFO.fields_by_name['version']._options = None
_INSTANCEERRORRANKINFO.fields_by_name['error_count']._options = None
_DISPATCHTASKCOUNTINFO.fields_by_name['flow_count']._options = None
_DISPATCHTASKCOUNTINFO.fields_by_name['instance_count']._options = None
_DISPATCHTASKCOUNTINFO.fields_by_name['updated']._options = None
_INSTANCETASKEXECSTAT.fields_by_name['hour']._options = None
_INSTANCETASKEXECSTAT.fields_by_name['instance_count']._options = None
# @@protoc_insertion_point(module_scope)
