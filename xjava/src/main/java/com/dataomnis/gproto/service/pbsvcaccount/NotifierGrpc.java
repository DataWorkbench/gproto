package com.dataomnis.gproto.service.pbsvcaccount;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/notifier/notifier.proto")
public final class NotifierGrpc {

  private NotifierGrpc() {}

  public static final String SERVICE_NAME = "notifier.Notifier";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSendNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNotification",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSendNotificationMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSendNotificationMethod;
    if ((getSendNotificationMethod = NotifierGrpc.getSendNotificationMethod) == null) {
      synchronized (NotifierGrpc.class) {
        if ((getSendNotificationMethod = NotifierGrpc.getSendNotificationMethod) == null) {
          NotifierGrpc.getSendNotificationMethod = getSendNotificationMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new NotifierMethodDescriptorSupplier("SendNotification"))
              .build();
        }
      }
    }
    return getSendNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications,
      com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications> getListNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotifications",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications,
      com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications> getListNotificationsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications, com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications> getListNotificationsMethod;
    if ((getListNotificationsMethod = NotifierGrpc.getListNotificationsMethod) == null) {
      synchronized (NotifierGrpc.class) {
        if ((getListNotificationsMethod = NotifierGrpc.getListNotificationsMethod) == null) {
          NotifierGrpc.getListNotificationsMethod = getListNotificationsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications, com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications.getDefaultInstance()))
              .setSchemaDescriptor(new NotifierMethodDescriptorSupplier("ListNotifications"))
              .build();
        }
      }
    }
    return getListNotificationsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotifierStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotifierStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotifierStub>() {
        @java.lang.Override
        public NotifierStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotifierStub(channel, callOptions);
        }
      };
    return NotifierStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotifierBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotifierBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotifierBlockingStub>() {
        @java.lang.Override
        public NotifierBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotifierBlockingStub(channel, callOptions);
        }
      };
    return NotifierBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotifierFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotifierFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotifierFutureStub>() {
        @java.lang.Override
        public NotifierFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotifierFutureStub(channel, callOptions);
        }
      };
    return NotifierFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NotifierImplBase implements io.grpc.BindableService {

    /**
     */
    public void sendNotification(com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendNotificationMethod(), responseObserver);
    }

    /**
     */
    public void listNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendNotificationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SEND_NOTIFICATION)))
          .addMethod(
            getListNotificationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications,
                com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications>(
                  this, METHODID_LIST_NOTIFICATIONS)))
          .build();
    }
  }

  /**
   */
  public static final class NotifierStub extends io.grpc.stub.AbstractAsyncStub<NotifierStub> {
    private NotifierStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotifierStub(channel, callOptions);
    }

    /**
     */
    public void sendNotification(com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotifierBlockingStub extends io.grpc.stub.AbstractBlockingStub<NotifierBlockingStub> {
    private NotifierBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotifierBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct sendNotification(com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications listNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotifierFutureStub extends io.grpc.stub.AbstractFutureStub<NotifierFutureStub> {
    private NotifierFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotifierFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotifierFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> sendNotification(
        com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications> listNotifications(
        com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_NOTIFICATION = 0;
  private static final int METHODID_LIST_NOTIFICATIONS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotifierImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotifierImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_NOTIFICATION:
          serviceImpl.sendNotification((com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.SendNotification) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_NOTIFICATIONS:
          serviceImpl.listNotifications((com.dataomnis.gproto.types.pbrequest.PBRequestNotifier.ListNotifications) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNotifier.ListNotifications>) responseObserver);
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

  private static abstract class NotifierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotifierBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcaccount.PBSvcNotifier.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Notifier");
    }
  }

  private static final class NotifierFileDescriptorSupplier
      extends NotifierBaseDescriptorSupplier {
    NotifierFileDescriptorSupplier() {}
  }

  private static final class NotifierMethodDescriptorSupplier
      extends NotifierBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotifierMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotifierGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotifierFileDescriptorSupplier())
              .addMethod(getSendNotificationMethod())
              .addMethod(getListNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
