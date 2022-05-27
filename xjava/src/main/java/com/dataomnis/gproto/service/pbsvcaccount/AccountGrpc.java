package com.dataomnis.gproto.service.pbsvcaccount;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/account/account.proto")
public final class AccountGrpc {

  private AccountGrpc() {}

  public static final String SERVICE_NAME = "account.Account";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature> getValidateRequestSignatureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateRequestSignature",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature> getValidateRequestSignatureMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature> getValidateRequestSignatureMethod;
    if ((getValidateRequestSignatureMethod = AccountGrpc.getValidateRequestSignatureMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getValidateRequestSignatureMethod = AccountGrpc.getValidateRequestSignatureMethod) == null) {
          AccountGrpc.getValidateRequestSignatureMethod = getValidateRequestSignatureMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateRequestSignature"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("ValidateRequestSignature"))
              .build();
        }
      }
    }
    return getValidateRequestSignatureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers> getDescribeUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeUsers",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers> getDescribeUsersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers> getDescribeUsersMethod;
    if ((getDescribeUsersMethod = AccountGrpc.getDescribeUsersMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getDescribeUsersMethod = AccountGrpc.getDescribeUsersMethod) == null) {
          AccountGrpc.getDescribeUsersMethod = getDescribeUsersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("DescribeUsers"))
              .build();
        }
      }
    }
    return getDescribeUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey> getDescribeAccessKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeAccessKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey> getDescribeAccessKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey> getDescribeAccessKeyMethod;
    if ((getDescribeAccessKeyMethod = AccountGrpc.getDescribeAccessKeyMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getDescribeAccessKeyMethod = AccountGrpc.getDescribeAccessKeyMethod) == null) {
          AccountGrpc.getDescribeAccessKeyMethod = getDescribeAccessKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeAccessKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("DescribeAccessKey"))
              .build();
        }
      }
    }
    return getDescribeAccessKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUser",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser> getCreateUserMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser> getCreateUserMethod;
    if ((getCreateUserMethod = AccountGrpc.getCreateUserMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getCreateUserMethod = AccountGrpc.getCreateUserMethod) == null) {
          AccountGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser> getUpdateUserMethod;
    if ((getUpdateUserMethod = AccountGrpc.getUpdateUserMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getUpdateUserMethod = AccountGrpc.getUpdateUserMethod) == null) {
          AccountGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser> getDeleteUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUser",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser> getDeleteUserMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser> getDeleteUserMethod;
    if ((getDeleteUserMethod = AccountGrpc.getDeleteUserMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getDeleteUserMethod = AccountGrpc.getDeleteUserMethod) == null) {
          AccountGrpc.getDeleteUserMethod = getDeleteUserMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("DeleteUser"))
              .build();
        }
      }
    }
    return getDeleteUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> getCheckSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckSession",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> getCheckSessionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> getCheckSessionMethod;
    if ((getCheckSessionMethod = AccountGrpc.getCheckSessionMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getCheckSessionMethod = AccountGrpc.getCheckSessionMethod) == null) {
          AccountGrpc.getCheckSessionMethod = getCheckSessionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("CheckSession"))
              .build();
        }
      }
    }
    return getCheckSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> getCreateSessionMethod;
    if ((getCreateSessionMethod = AccountGrpc.getCreateSessionMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getCreateSessionMethod = AccountGrpc.getCreateSessionMethod) == null) {
          AccountGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
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
    public void validateRequestSignature(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateRequestSignatureMethod(), responseObserver);
    }

    /**
     */
    public void describeUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeUsersMethod(), responseObserver);
    }

    /**
     */
    public void describeAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeAccessKeyMethod(), responseObserver);
    }

    /**
     */
    public void createUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void updateUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void deleteUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUserMethod(), responseObserver);
    }

    /**
     */
    public void checkSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckSessionMethod(), responseObserver);
    }

    /**
     */
    public void createSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getValidateRequestSignatureMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature>(
                  this, METHODID_VALIDATE_REQUEST_SIGNATURE)))
          .addMethod(
            getDescribeUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers>(
                  this, METHODID_DESCRIBE_USERS)))
          .addMethod(
            getDescribeAccessKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey>(
                  this, METHODID_DESCRIBE_ACCESS_KEY)))
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getUpdateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getDeleteUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser>(
                  this, METHODID_DELETE_USER)))
          .addMethod(
            getCheckSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession>(
                  this, METHODID_CHECK_SESSION)))
          .addMethod(
            getCreateSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession>(
                  this, METHODID_CREATE_SESSION)))
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
    public void validateRequestSignature(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateRequestSignatureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeAccessKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
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
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature validateRequestSignature(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateRequestSignatureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers describeUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey describeAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeAccessKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser createUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser updateUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser deleteUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession checkSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession createSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature> validateRequestSignature(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateRequestSignatureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers> describeUsers(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey> describeAccessKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeAccessKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser> createUser(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser> updateUser(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser> deleteUser(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> checkSession(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> createSession(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_VALIDATE_REQUEST_SIGNATURE = 0;
  private static final int METHODID_DESCRIBE_USERS = 1;
  private static final int METHODID_DESCRIBE_ACCESS_KEY = 2;
  private static final int METHODID_CREATE_USER = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_DELETE_USER = 5;
  private static final int METHODID_CHECK_SESSION = 6;
  private static final int METHODID_CREATE_SESSION = 7;

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
          serviceImpl.validateRequestSignature((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ValidateRequestSignature) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ValidateRequestSignature>) responseObserver);
          break;
        case METHODID_DESCRIBE_USERS:
          serviceImpl.describeUsers((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUsers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUsers>) responseObserver);
          break;
        case METHODID_DESCRIBE_ACCESS_KEY:
          serviceImpl.describeAccessKey((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateUser>) responseObserver);
          break;
        case METHODID_DELETE_USER:
          serviceImpl.deleteUser((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUser) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteUser>) responseObserver);
          break;
        case METHODID_CHECK_SESSION:
          serviceImpl.checkSession((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession>) responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession>) responseObserver);
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
      return com.dataomnis.gproto.service.pbsvcaccount.PBSvcAccount.getDescriptor();
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
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getCheckSessionMethod())
              .addMethod(getCreateSessionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
