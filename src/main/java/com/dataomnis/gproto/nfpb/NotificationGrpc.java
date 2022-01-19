package com.dataomnis.gproto.nfpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/notifier.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NotificationGrpc {

  private NotificationGrpc() {}

  public static final String SERVICE_NAME = "Notification";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest,
      com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply> getSendInternalNoticeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendInternalNotice",
      requestType = com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest.class,
      responseType = com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest,
      com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply> getSendInternalNoticeMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest, com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply> getSendInternalNoticeMethod;
    if ((getSendInternalNoticeMethod = NotificationGrpc.getSendInternalNoticeMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getSendInternalNoticeMethod = NotificationGrpc.getSendInternalNoticeMethod) == null) {
          NotificationGrpc.getSendInternalNoticeMethod = getSendInternalNoticeMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest, com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendInternalNotice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("SendInternalNotice"))
              .build();
        }
      }
    }
    return getSendInternalNoticeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.nfpb.NfPB.ListRequest,
      com.dataomnis.gproto.nfpb.NfPB.ListReply> getListNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotifications",
      requestType = com.dataomnis.gproto.nfpb.NfPB.ListRequest.class,
      responseType = com.dataomnis.gproto.nfpb.NfPB.ListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.nfpb.NfPB.ListRequest,
      com.dataomnis.gproto.nfpb.NfPB.ListReply> getListNotificationsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.nfpb.NfPB.ListRequest, com.dataomnis.gproto.nfpb.NfPB.ListReply> getListNotificationsMethod;
    if ((getListNotificationsMethod = NotificationGrpc.getListNotificationsMethod) == null) {
      synchronized (NotificationGrpc.class) {
        if ((getListNotificationsMethod = NotificationGrpc.getListNotificationsMethod) == null) {
          NotificationGrpc.getListNotificationsMethod = getListNotificationsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.nfpb.NfPB.ListRequest, com.dataomnis.gproto.nfpb.NfPB.ListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.nfpb.NfPB.ListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.nfpb.NfPB.ListReply.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationMethodDescriptorSupplier("ListNotifications"))
              .build();
        }
      }
    }
    return getListNotificationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationStub>() {
        @java.lang.Override
        public NotificationStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationStub(channel, callOptions);
        }
      };
    return NotificationStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationBlockingStub>() {
        @java.lang.Override
        public NotificationBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationBlockingStub(channel, callOptions);
        }
      };
    return NotificationBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationFutureStub>() {
        @java.lang.Override
        public NotificationFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationFutureStub(channel, callOptions);
        }
      };
    return NotificationFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NotificationImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendInternalNotice(com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendInternalNoticeMethod(), responseObserver);
    }

    /**
     */
    public void listNotifications(com.dataomnis.gproto.nfpb.NfPB.ListRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.nfpb.NfPB.ListReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendInternalNoticeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest,
                com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply>(
                  this, METHODID_SEND_INTERNAL_NOTICE)))
          .addMethod(
            getListNotificationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.nfpb.NfPB.ListRequest,
                com.dataomnis.gproto.nfpb.NfPB.ListReply>(
                  this, METHODID_LIST_NOTIFICATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationStub extends io.grpc.stub.AbstractAsyncStub<NotificationStub> {
    private NotificationStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationStub(channel, callOptions);
    }

    /**
     */
    public void sendInternalNotice(com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendInternalNoticeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNotifications(com.dataomnis.gproto.nfpb.NfPB.ListRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.nfpb.NfPB.ListReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationBlockingStub extends io.grpc.stub.AbstractBlockingStub<NotificationBlockingStub> {
    private NotificationBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply sendInternalNotice(com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendInternalNoticeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.nfpb.NfPB.ListReply listNotifications(com.dataomnis.gproto.nfpb.NfPB.ListRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationFutureStub extends io.grpc.stub.AbstractFutureStub<NotificationFutureStub> {
    private NotificationFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply> sendInternalNotice(
        com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendInternalNoticeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.nfpb.NfPB.ListReply> listNotifications(
        com.dataomnis.gproto.nfpb.NfPB.ListRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_INTERNAL_NOTICE = 0;
  private static final int METHODID_LIST_NOTIFICATIONS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_INTERNAL_NOTICE:
          serviceImpl.sendInternalNotice((com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.nfpb.NfPB.SendInternalNoticeReply>) responseObserver);
          break;
        case METHODID_LIST_NOTIFICATIONS:
          serviceImpl.listNotifications((com.dataomnis.gproto.nfpb.NfPB.ListRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.nfpb.NfPB.ListReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.nfpb.NfPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notification");
    }
  }

  private static final class NotificationFileDescriptorSupplier
      extends NotificationBaseDescriptorSupplier {
    NotificationFileDescriptorSupplier() {}
  }

  private static final class NotificationMethodDescriptorSupplier
      extends NotificationBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotificationGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationFileDescriptorSupplier())
              .addMethod(getSendInternalNoticeMethod())
              .addMethod(getListNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
