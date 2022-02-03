# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/types/response/observer.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from proto.types.model import observer_pb2 as proto_dot_types_dot_model_dot_observer__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/types/response/observer.proto',
  package='response',
  syntax='proto3',
  serialized_options=b'\n%com.dataomnis.gproto.types.pbresponseB\022PBResponseObserverP\000Z4github.com/DataWorkbench/gproto/pkg/types/pbresponse',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n#proto/types/response/observer.proto\x12\x08response\x1a proto/types/model/observer.proto\"<\n\x10PTasksStatusStat\x12(\n\x05infos\x18\x01 \x03(\x0b\x32\x19.model.InstanceStatusStat\"\x9a\x01\n\x0ePTasksExecStat\x12*\n\x05today\x18\x01 \x03(\x0b\x32\x1b.model.InstanceTaskExecStat\x12.\n\tyesterday\x18\x02 \x03(\x0b\x32\x1b.model.InstanceTaskExecStat\x12,\n\x07history\x18\x03 \x03(\x0b\x32\x1b.model.InstanceTaskExecStat\"S\n\x13PTaskRuntimeRanking\x12-\n\x05infos\x18\x01 \x03(\x0b\x32\x1e.model.InstanceRuntimeRankInfo\x12\r\n\x05total\x18\x02 \x01(\x03\"O\n\x11PTaskErrorRanking\x12+\n\x05infos\x18\x01 \x03(\x0b\x32\x1c.model.InstanceErrorRankInfo\x12\r\n\x05total\x18\x02 \x01(\x03\"A\n\x12PTaskDispatchCount\x12+\n\x05infos\x18\x01 \x03(\x0b\x32\x1c.model.DispatchTaskCountInfoBs\n%com.dataomnis.gproto.types.pbresponseB\x12PBResponseObserverP\x00Z4github.com/DataWorkbench/gproto/pkg/types/pbresponseb\x06proto3'
  ,
  dependencies=[proto_dot_types_dot_model_dot_observer__pb2.DESCRIPTOR,])




_PTASKSSTATUSSTAT = _descriptor.Descriptor(
  name='PTasksStatusStat',
  full_name='response.PTasksStatusStat',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.PTasksStatusStat.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_start=83,
  serialized_end=143,
)


_PTASKSEXECSTAT = _descriptor.Descriptor(
  name='PTasksExecStat',
  full_name='response.PTasksExecStat',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='today', full_name='response.PTasksExecStat.today', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='yesterday', full_name='response.PTasksExecStat.yesterday', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='history', full_name='response.PTasksExecStat.history', index=2,
      number=3, type=11, cpp_type=10, label=3,
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
  serialized_start=146,
  serialized_end=300,
)


_PTASKRUNTIMERANKING = _descriptor.Descriptor(
  name='PTaskRuntimeRanking',
  full_name='response.PTaskRuntimeRanking',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.PTaskRuntimeRanking.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.PTaskRuntimeRanking.total', index=1,
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
  serialized_start=302,
  serialized_end=385,
)


_PTASKERRORRANKING = _descriptor.Descriptor(
  name='PTaskErrorRanking',
  full_name='response.PTaskErrorRanking',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.PTaskErrorRanking.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total', full_name='response.PTaskErrorRanking.total', index=1,
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
  serialized_start=387,
  serialized_end=466,
)


_PTASKDISPATCHCOUNT = _descriptor.Descriptor(
  name='PTaskDispatchCount',
  full_name='response.PTaskDispatchCount',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='infos', full_name='response.PTaskDispatchCount.infos', index=0,
      number=1, type=11, cpp_type=10, label=3,
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
  serialized_start=468,
  serialized_end=533,
)

_PTASKSSTATUSSTAT.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_observer__pb2._INSTANCESTATUSSTAT
_PTASKSEXECSTAT.fields_by_name['today'].message_type = proto_dot_types_dot_model_dot_observer__pb2._INSTANCETASKEXECSTAT
_PTASKSEXECSTAT.fields_by_name['yesterday'].message_type = proto_dot_types_dot_model_dot_observer__pb2._INSTANCETASKEXECSTAT
_PTASKSEXECSTAT.fields_by_name['history'].message_type = proto_dot_types_dot_model_dot_observer__pb2._INSTANCETASKEXECSTAT
_PTASKRUNTIMERANKING.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_observer__pb2._INSTANCERUNTIMERANKINFO
_PTASKERRORRANKING.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_observer__pb2._INSTANCEERRORRANKINFO
_PTASKDISPATCHCOUNT.fields_by_name['infos'].message_type = proto_dot_types_dot_model_dot_observer__pb2._DISPATCHTASKCOUNTINFO
DESCRIPTOR.message_types_by_name['PTasksStatusStat'] = _PTASKSSTATUSSTAT
DESCRIPTOR.message_types_by_name['PTasksExecStat'] = _PTASKSEXECSTAT
DESCRIPTOR.message_types_by_name['PTaskRuntimeRanking'] = _PTASKRUNTIMERANKING
DESCRIPTOR.message_types_by_name['PTaskErrorRanking'] = _PTASKERRORRANKING
DESCRIPTOR.message_types_by_name['PTaskDispatchCount'] = _PTASKDISPATCHCOUNT
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

PTasksStatusStat = _reflection.GeneratedProtocolMessageType('PTasksStatusStat', (_message.Message,), {
  'DESCRIPTOR' : _PTASKSSTATUSSTAT,
  '__module__' : 'proto.types.response.observer_pb2'
  # @@protoc_insertion_point(class_scope:response.PTasksStatusStat)
  })
_sym_db.RegisterMessage(PTasksStatusStat)

PTasksExecStat = _reflection.GeneratedProtocolMessageType('PTasksExecStat', (_message.Message,), {
  'DESCRIPTOR' : _PTASKSEXECSTAT,
  '__module__' : 'proto.types.response.observer_pb2'
  # @@protoc_insertion_point(class_scope:response.PTasksExecStat)
  })
_sym_db.RegisterMessage(PTasksExecStat)

PTaskRuntimeRanking = _reflection.GeneratedProtocolMessageType('PTaskRuntimeRanking', (_message.Message,), {
  'DESCRIPTOR' : _PTASKRUNTIMERANKING,
  '__module__' : 'proto.types.response.observer_pb2'
  # @@protoc_insertion_point(class_scope:response.PTaskRuntimeRanking)
  })
_sym_db.RegisterMessage(PTaskRuntimeRanking)

PTaskErrorRanking = _reflection.GeneratedProtocolMessageType('PTaskErrorRanking', (_message.Message,), {
  'DESCRIPTOR' : _PTASKERRORRANKING,
  '__module__' : 'proto.types.response.observer_pb2'
  # @@protoc_insertion_point(class_scope:response.PTaskErrorRanking)
  })
_sym_db.RegisterMessage(PTaskErrorRanking)

PTaskDispatchCount = _reflection.GeneratedProtocolMessageType('PTaskDispatchCount', (_message.Message,), {
  'DESCRIPTOR' : _PTASKDISPATCHCOUNT,
  '__module__' : 'proto.types.response.observer_pb2'
  # @@protoc_insertion_point(class_scope:response.PTaskDispatchCount)
  })
_sym_db.RegisterMessage(PTaskDispatchCount)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
