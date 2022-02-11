# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: proto/service/notifier/notifier.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()




DESCRIPTOR = _descriptor.FileDescriptor(
  name='proto/service/notifier/notifier.proto',
  package='notifier',
  syntax='proto3',
  serialized_options=b'\n)com.dataomnis.gproto.service.pbsvcaccountB\rPBSvcNotifierP\000Z9github.com/DataWorkbench/gproto/xgo/service/pbsvcnotifier',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n%proto/service/notifier/notifier.proto\x12\x08notifier\"z\n\x19SendInternalNoticeRequest\x12\x0f\n\x07user_id\x18\x01 \x01(\t\x12\r\n\x05title\x18\x02 \x01(\t\x12\x0f\n\x07\x63ontent\x18\x03 \x01(\t\x12\x15\n\rshort_content\x18\x04 \x01(\t\x12\x15\n\remail_address\x18\x05 \x03(\t\":\n\x17SendInternalNoticeReply\x12\x0e\n\x06status\x18\x01 \x01(\x05\x12\x0f\n\x07message\x18\x02 \x01(\t\"\xd7\x01\n\x0bRecordEntry\x12\x1c\n\x14notification_post_id\x18\x01 \x01(\t\x12\r\n\x05owner\x18\x02 \x01(\t\x12\x13\n\x0bnotify_type\x18\x03 \x01(\t\x12\r\n\x05title\x18\x04 \x01(\t\x12\x0f\n\x07\x63ontent\x18\x05 \x01(\t\x12\x15\n\rshort_content\x18\x06 \x01(\t\x12\x0e\n\x06status\x18\x07 \x01(\t\x12\x13\n\x0b\x63reate_time\x18\x08 \x01(\x03\x12\x13\n\x0bstatus_time\x18\t \x01(\x03\x12\x15\n\remail_address\x18\n \x01(\t\"i\n\x0bListRequest\x12\x1c\n\x14notification_post_id\x18\x01 \x01(\t\x12\r\n\x05owner\x18\x02 \x01(\t\x12\x0e\n\x06status\x18\x03 \x03(\t\x12\r\n\x05limit\x18\x04 \x01(\x05\x12\x0e\n\x06offset\x18\x05 \x01(\x05\"i\n\tListReply\x12&\n\x07records\x18\x01 \x03(\x0b\x32\x15.notifier.RecordEntry\x12\x13\n\x0btotal_count\x18\x02 \x01(\x03\x12\x0e\n\x06status\x18\x03 \x01(\x05\x12\x0f\n\x07message\x18\x04 \x01(\t2\xad\x01\n\x08Notifier\x12^\n\x12SendInternalNotice\x12#.notifier.SendInternalNoticeRequest\x1a!.notifier.SendInternalNoticeReply\"\x00\x12\x41\n\x11ListNotifications\x12\x15.notifier.ListRequest\x1a\x13.notifier.ListReply\"\x00\x42w\n)com.dataomnis.gproto.service.pbsvcaccountB\rPBSvcNotifierP\x00Z9github.com/DataWorkbench/gproto/xgo/service/pbsvcnotifierb\x06proto3'
)




_SENDINTERNALNOTICEREQUEST = _descriptor.Descriptor(
  name='SendInternalNoticeRequest',
  full_name='notifier.SendInternalNoticeRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='user_id', full_name='notifier.SendInternalNoticeRequest.user_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='title', full_name='notifier.SendInternalNoticeRequest.title', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content', full_name='notifier.SendInternalNoticeRequest.content', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='short_content', full_name='notifier.SendInternalNoticeRequest.short_content', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='email_address', full_name='notifier.SendInternalNoticeRequest.email_address', index=4,
      number=5, type=9, cpp_type=9, label=3,
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
  serialized_start=51,
  serialized_end=173,
)


_SENDINTERNALNOTICEREPLY = _descriptor.Descriptor(
  name='SendInternalNoticeReply',
  full_name='notifier.SendInternalNoticeReply',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='status', full_name='notifier.SendInternalNoticeReply.status', index=0,
      number=1, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message', full_name='notifier.SendInternalNoticeReply.message', index=1,
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
  serialized_start=175,
  serialized_end=233,
)


_RECORDENTRY = _descriptor.Descriptor(
  name='RecordEntry',
  full_name='notifier.RecordEntry',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='notification_post_id', full_name='notifier.RecordEntry.notification_post_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='owner', full_name='notifier.RecordEntry.owner', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='notify_type', full_name='notifier.RecordEntry.notify_type', index=2,
      number=3, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='title', full_name='notifier.RecordEntry.title', index=3,
      number=4, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='content', full_name='notifier.RecordEntry.content', index=4,
      number=5, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='short_content', full_name='notifier.RecordEntry.short_content', index=5,
      number=6, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='notifier.RecordEntry.status', index=6,
      number=7, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='create_time', full_name='notifier.RecordEntry.create_time', index=7,
      number=8, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status_time', full_name='notifier.RecordEntry.status_time', index=8,
      number=9, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='email_address', full_name='notifier.RecordEntry.email_address', index=9,
      number=10, type=9, cpp_type=9, label=1,
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
  serialized_start=236,
  serialized_end=451,
)


_LISTREQUEST = _descriptor.Descriptor(
  name='ListRequest',
  full_name='notifier.ListRequest',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='notification_post_id', full_name='notifier.ListRequest.notification_post_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='owner', full_name='notifier.ListRequest.owner', index=1,
      number=2, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='notifier.ListRequest.status', index=2,
      number=3, type=9, cpp_type=9, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='limit', full_name='notifier.ListRequest.limit', index=3,
      number=4, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='offset', full_name='notifier.ListRequest.offset', index=4,
      number=5, type=5, cpp_type=1, label=1,
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
  serialized_start=453,
  serialized_end=558,
)


_LISTREPLY = _descriptor.Descriptor(
  name='ListReply',
  full_name='notifier.ListReply',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='records', full_name='notifier.ListReply.records', index=0,
      number=1, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='total_count', full_name='notifier.ListReply.total_count', index=1,
      number=2, type=3, cpp_type=2, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='status', full_name='notifier.ListReply.status', index=2,
      number=3, type=5, cpp_type=1, label=1,
      has_default_value=False, default_value=0,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='message', full_name='notifier.ListReply.message', index=3,
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
  serialized_start=560,
  serialized_end=665,
)

_LISTREPLY.fields_by_name['records'].message_type = _RECORDENTRY
DESCRIPTOR.message_types_by_name['SendInternalNoticeRequest'] = _SENDINTERNALNOTICEREQUEST
DESCRIPTOR.message_types_by_name['SendInternalNoticeReply'] = _SENDINTERNALNOTICEREPLY
DESCRIPTOR.message_types_by_name['RecordEntry'] = _RECORDENTRY
DESCRIPTOR.message_types_by_name['ListRequest'] = _LISTREQUEST
DESCRIPTOR.message_types_by_name['ListReply'] = _LISTREPLY
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

SendInternalNoticeRequest = _reflection.GeneratedProtocolMessageType('SendInternalNoticeRequest', (_message.Message,), {
  'DESCRIPTOR' : _SENDINTERNALNOTICEREQUEST,
  '__module__' : 'proto.service.notifier.notifier_pb2'
  # @@protoc_insertion_point(class_scope:notifier.SendInternalNoticeRequest)
  })
_sym_db.RegisterMessage(SendInternalNoticeRequest)

SendInternalNoticeReply = _reflection.GeneratedProtocolMessageType('SendInternalNoticeReply', (_message.Message,), {
  'DESCRIPTOR' : _SENDINTERNALNOTICEREPLY,
  '__module__' : 'proto.service.notifier.notifier_pb2'
  # @@protoc_insertion_point(class_scope:notifier.SendInternalNoticeReply)
  })
_sym_db.RegisterMessage(SendInternalNoticeReply)

RecordEntry = _reflection.GeneratedProtocolMessageType('RecordEntry', (_message.Message,), {
  'DESCRIPTOR' : _RECORDENTRY,
  '__module__' : 'proto.service.notifier.notifier_pb2'
  # @@protoc_insertion_point(class_scope:notifier.RecordEntry)
  })
_sym_db.RegisterMessage(RecordEntry)

ListRequest = _reflection.GeneratedProtocolMessageType('ListRequest', (_message.Message,), {
  'DESCRIPTOR' : _LISTREQUEST,
  '__module__' : 'proto.service.notifier.notifier_pb2'
  # @@protoc_insertion_point(class_scope:notifier.ListRequest)
  })
_sym_db.RegisterMessage(ListRequest)

ListReply = _reflection.GeneratedProtocolMessageType('ListReply', (_message.Message,), {
  'DESCRIPTOR' : _LISTREPLY,
  '__module__' : 'proto.service.notifier.notifier_pb2'
  # @@protoc_insertion_point(class_scope:notifier.ListReply)
  })
_sym_db.RegisterMessage(ListReply)


DESCRIPTOR._options = None

_NOTIFIER = _descriptor.ServiceDescriptor(
  name='Notifier',
  full_name='notifier.Notifier',
  file=DESCRIPTOR,
  index=0,
  serialized_options=None,
  create_key=_descriptor._internal_create_key,
  serialized_start=668,
  serialized_end=841,
  methods=[
  _descriptor.MethodDescriptor(
    name='SendInternalNotice',
    full_name='notifier.Notifier.SendInternalNotice',
    index=0,
    containing_service=None,
    input_type=_SENDINTERNALNOTICEREQUEST,
    output_type=_SENDINTERNALNOTICEREPLY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
  _descriptor.MethodDescriptor(
    name='ListNotifications',
    full_name='notifier.Notifier.ListNotifications',
    index=1,
    containing_service=None,
    input_type=_LISTREQUEST,
    output_type=_LISTREPLY,
    serialized_options=None,
    create_key=_descriptor._internal_create_key,
  ),
])
_sym_db.RegisterServiceDescriptor(_NOTIFIER)

DESCRIPTOR.services_by_name['Notifier'] = _NOTIFIER

# @@protoc_insertion_point(module_scope)