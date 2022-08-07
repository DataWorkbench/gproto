package com.dataomnis.gproto.service.pbsvcaccount;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/account/account_proxy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountProxyGrpc {

  private AccountProxyGrpc() {}

  public static final String SERVICE_NAME = "account.AccountProxy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy> getListUsersByProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsersByProxy",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy> getListUsersByProxyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy, com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy> getListUsersByProxyMethod;
    if ((getListUsersByProxyMethod = AccountProxyGrpc.getListUsersByProxyMethod) == null) {
      synchronized (AccountProxyGrpc.class) {
        if ((getListUsersByProxyMethod = AccountProxyGrpc.getListUsersByProxyMethod) == null) {
          AccountProxyGrpc.getListUsersByProxyMethod = getListUsersByProxyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy, com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsersByProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy.getDefaultInstance()))
              .setSchemaDescriptor(new AccountProxyMethodDescriptorSupplier("ListUsersByProxy"))
              .build();
        }
      }
    }
    return getListUsersByProxyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy> getDescribeAccessKeyByProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeAccessKeyByProxy",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy> getDescribeAccessKeyByProxyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy, com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy> getDescribeAccessKeyByProxyMethod;
    if ((getDescribeAccessKeyByProxyMethod = AccountProxyGrpc.getDescribeAccessKeyByProxyMethod) == null) {
      synchronized (AccountProxyGrpc.class) {
        if ((getDescribeAccessKeyByProxyMethod = AccountProxyGrpc.getDescribeAccessKeyByProxyMethod) == null) {
          AccountProxyGrpc.getDescribeAccessKeyByProxyMethod = getDescribeAccessKeyByProxyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy, com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeAccessKeyByProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy.getDefaultInstance()))
              .setSchemaDescriptor(new AccountProxyMethodDescriptorSupplier("DescribeAccessKeyByProxy"))
              .build();
        }
      }
    }
    return getDescribeAccessKeyByProxyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy> getListNotificationsByProxyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotificationsByProxy",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy> getListNotificationsByProxyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy, com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy> getListNotificationsByProxyMethod;
    if ((getListNotificationsByProxyMethod = AccountProxyGrpc.getListNotificationsByProxyMethod) == null) {
      synchronized (AccountProxyGrpc.class) {
        if ((getListNotificationsByProxyMethod = AccountProxyGrpc.getListNotificationsByProxyMethod) == null) {
          AccountProxyGrpc.getListNotificationsByProxyMethod = getListNotificationsByProxyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy, com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotificationsByProxy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy.getDefaultInstance()))
              .setSchemaDescriptor(new AccountProxyMethodDescriptorSupplier("ListNotificationsByProxy"))
              .build();
        }
      }
    }
    return getListNotificationsByProxyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountProxyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountProxyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountProxyStub>() {
        @java.lang.Override
        public AccountProxyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountProxyStub(channel, callOptions);
        }
      };
    return AccountProxyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountProxyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountProxyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountProxyBlockingStub>() {
        @java.lang.Override
        public AccountProxyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountProxyBlockingStub(channel, callOptions);
        }
      };
    return AccountProxyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountProxyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountProxyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountProxyFutureStub>() {
        @java.lang.Override
        public AccountProxyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountProxyFutureStub(channel, callOptions);
        }
      };
    return AccountProxyFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountProxyImplBase implements io.grpc.BindableService {

    /**
     */
    public void listUsersByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersByProxyMethod(), responseObserver);
    }

    /**
     */
    public void describeAccessKeyByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeAccessKeyByProxyMethod(), responseObserver);
    }

    /**
     */
    public void listNotificationsByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNotificationsByProxyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUsersByProxyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy>(
                  this, METHODID_LIST_USERS_BY_PROXY)))
          .addMethod(
            getDescribeAccessKeyByProxyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy>(
                  this, METHODID_DESCRIBE_ACCESS_KEY_BY_PROXY)))
          .addMethod(
            getListNotificationsByProxyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy>(
                  this, METHODID_LIST_NOTIFICATIONS_BY_PROXY)))
          .build();
    }
  }

  /**
   */
  public static final class AccountProxyStub extends io.grpc.stub.AbstractAsyncStub<AccountProxyStub> {
    private AccountProxyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountProxyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountProxyStub(channel, callOptions);
    }

    /**
     */
    public void listUsersByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersByProxyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeAccessKeyByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeAccessKeyByProxyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNotificationsByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNotificationsByProxyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountProxyBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountProxyBlockingStub> {
    private AccountProxyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountProxyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountProxyBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy listUsersByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersByProxyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy describeAccessKeyByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeAccessKeyByProxyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy listNotificationsByProxy(com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNotificationsByProxyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountProxyFutureStub extends io.grpc.stub.AbstractFutureStub<AccountProxyFutureStub> {
    private AccountProxyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountProxyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountProxyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy> listUsersByProxy(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersByProxyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy> describeAccessKeyByProxy(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeAccessKeyByProxyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy> listNotificationsByProxy(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNotificationsByProxyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USERS_BY_PROXY = 0;
  private static final int METHODID_DESCRIBE_ACCESS_KEY_BY_PROXY = 1;
  private static final int METHODID_LIST_NOTIFICATIONS_BY_PROXY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountProxyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountProxyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_USERS_BY_PROXY:
          serviceImpl.listUsersByProxy((com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListUsersByProxy) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListUsersByProxy>) responseObserver);
          break;
        case METHODID_DESCRIBE_ACCESS_KEY_BY_PROXY:
          serviceImpl.describeAccessKeyByProxy((com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.DescribeAccessKeyByProxy) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.DescribeAccessKeyByProxy>) responseObserver);
          break;
        case METHODID_LIST_NOTIFICATIONS_BY_PROXY:
          serviceImpl.listNotificationsByProxy((com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.ListNotificationsByProxy) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.ListNotificationsByProxy>) responseObserver);
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

  private static abstract class AccountProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountProxyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcaccount.PBSvcAccountProxy.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountProxy");
    }
  }

  private static final class AccountProxyFileDescriptorSupplier
      extends AccountProxyBaseDescriptorSupplier {
    AccountProxyFileDescriptorSupplier() {}
  }

  private static final class AccountProxyMethodDescriptorSupplier
      extends AccountProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountProxyMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountProxyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountProxyFileDescriptorSupplier())
              .addMethod(getListUsersByProxyMethod())
              .addMethod(getDescribeAccessKeyByProxyMethod())
              .addMethod(getListNotificationsByProxyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
