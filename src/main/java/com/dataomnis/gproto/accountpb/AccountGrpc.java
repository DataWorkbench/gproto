package com.dataomnis.gproto.accountpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/account.proto")
public final class AccountGrpc {

  private AccountGrpc() {}

  public static final String SERVICE_NAME = "Account";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest,
      com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply> getValidateRequestSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateRequestSignature",
      requestType = com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest.class,
      responseType = com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest,
      com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply> getValidateRequestSignatureMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest, com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply> getValidateRequestSignatureMethod;
    if ((getValidateRequestSignatureMethod = AccountGrpc.getValidateRequestSignatureMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getValidateRequestSignatureMethod = AccountGrpc.getValidateRequestSignatureMethod) == null) {
          AccountGrpc.getValidateRequestSignatureMethod = getValidateRequestSignatureMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest, com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateRequestSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("ValidateRequestSignature"))
              .build();
        }
      }
    }
    return getValidateRequestSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest,
      com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply> getDescribeUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeUsers",
      requestType = com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest.class,
      responseType = com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest,
      com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply> getDescribeUsersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest, com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply> getDescribeUsersMethod;
    if ((getDescribeUsersMethod = AccountGrpc.getDescribeUsersMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getDescribeUsersMethod = AccountGrpc.getDescribeUsersMethod) == null) {
          AccountGrpc.getDescribeUsersMethod = getDescribeUsersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest, com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("DescribeUsers"))
              .build();
        }
      }
    }
    return getDescribeUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest,
      com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply> getDescribeAccessKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeAccessKey",
      requestType = com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest.class,
      responseType = com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest,
      com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply> getDescribeAccessKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest, com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply> getDescribeAccessKeyMethod;
    if ((getDescribeAccessKeyMethod = AccountGrpc.getDescribeAccessKeyMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getDescribeAccessKeyMethod = AccountGrpc.getDescribeAccessKeyMethod) == null) {
          AccountGrpc.getDescribeAccessKeyMethod = getDescribeAccessKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest, com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeAccessKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("DescribeAccessKey"))
              .build();
        }
      }
    }
    return getDescribeAccessKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountStub>() {
        @java.lang.Override
        public AccountStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountStub(channel, callOptions);
        }
      };
    return AccountStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountBlockingStub>() {
        @java.lang.Override
        public AccountBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountBlockingStub(channel, callOptions);
        }
      };
    return AccountBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountFutureStub>() {
        @java.lang.Override
        public AccountFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountFutureStub(channel, callOptions);
        }
      };
    return AccountFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountImplBase implements io.grpc.BindableService {

    /**
     */
    public void validateRequestSignature(com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateRequestSignatureMethod(), responseObserver);
    }

    /**
     */
    public void describeUsers(com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeUsersMethod(), responseObserver);
    }

    /**
     */
    public void describeAccessKey(com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeAccessKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateRequestSignatureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest,
                com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply>(
                  this, METHODID_VALIDATE_REQUEST_SIGNATURE)))
          .addMethod(
            getDescribeUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest,
                com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply>(
                  this, METHODID_DESCRIBE_USERS)))
          .addMethod(
            getDescribeAccessKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest,
                com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply>(
                  this, METHODID_DESCRIBE_ACCESS_KEY)))
          .build();
    }
  }

  /**
   */
  public static final class AccountStub extends io.grpc.stub.AbstractAsyncStub<AccountStub> {
    private AccountStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountStub(channel, callOptions);
    }

    /**
     */
    public void validateRequestSignature(com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateRequestSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeUsers(com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeAccessKey(com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeAccessKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountBlockingStub> {
    private AccountBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply validateRequestSignature(com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateRequestSignatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply describeUsers(com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply describeAccessKey(com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeAccessKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountFutureStub extends io.grpc.stub.AbstractFutureStub<AccountFutureStub> {
    private AccountFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply> validateRequestSignature(
        com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateRequestSignatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply> describeUsers(
        com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply> describeAccessKey(
        com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeAccessKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_REQUEST_SIGNATURE = 0;
  private static final int METHODID_DESCRIBE_USERS = 1;
  private static final int METHODID_DESCRIBE_ACCESS_KEY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_VALIDATE_REQUEST_SIGNATURE:
          serviceImpl.validateRequestSignature((com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.ValidateRequestSignatureReply>) responseObserver);
          break;
        case METHODID_DESCRIBE_USERS:
          serviceImpl.describeUsers((com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.DescribeUsersReply>) responseObserver);
          break;
        case METHODID_DESCRIBE_ACCESS_KEY:
          serviceImpl.describeAccessKey((com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.accountpb.AccountPB.DescribeAccessKeyReply>) responseObserver);
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

  private static abstract class AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.accountpb.AccountPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Account");
    }
  }

  private static final class AccountFileDescriptorSupplier
      extends AccountBaseDescriptorSupplier {
    AccountFileDescriptorSupplier() {}
  }

  private static final class AccountMethodDescriptorSupplier
      extends AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountFileDescriptorSupplier())
              .addMethod(getValidateRequestSignatureMethod())
              .addMethod(getDescribeUsersMethod())
              .addMethod(getDescribeAccessKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
