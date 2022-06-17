package com.dataomnis.gproto.service.pbsvcaccount;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *  rpc DescribeUsers(request.DescribeUsers) returns (response.DescribeUsers) {}
 *  rpc DescribeAccessKey(request.DescribeAccessKey) returns (response.DescribeAccessKey) {}
 *  rpc CreateUser(request.CreateUser) returns (response.CreateUser) {}
 *  rpc UpdateUser(request.UpdateUser) returns (response.UpdateUser) {}
 *  rpc DeleteUser(request.DeleteUser) returns (response.DeleteUser) {}
 *  rpc CheckSession(request.CheckSession) returns (response.CheckSession) {}
 *  rpc CreateSession(request.CreateSession) returns (response.CreateSession) {}
 *  rpc CheckUserExists(request.CheckUserExists) returns (response.CheckUserExists) {}
 *  rpc CreateNotification(request.CreateNotification) returns (response.CreateNotification) {}
 *  rpc UpdateNotification(request.UpdateNotification) returns (response.UpdateNotification) {}
 *  rpc DeleteNotification(request.DeleteNotification) returns (response.DeleteNotification) {}
 *  rpc GetNotifications(request.GetNotifications) returns (response.GetNotifications) {}
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/account/account_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountManageGrpc {

  private AccountManageGrpc() {}

  public static final String SERVICE_NAME = "account.AccountManage";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountManageStub>() {
        @java.lang.Override
        public AccountManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountManageStub(channel, callOptions);
        }
      };
    return AccountManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountManageBlockingStub>() {
        @java.lang.Override
        public AccountManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountManageBlockingStub(channel, callOptions);
        }
      };
    return AccountManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountManageFutureStub>() {
        @java.lang.Override
        public AccountManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountManageFutureStub(channel, callOptions);
        }
      };
    return AccountManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *  rpc DescribeUsers(request.DescribeUsers) returns (response.DescribeUsers) {}
   *  rpc DescribeAccessKey(request.DescribeAccessKey) returns (response.DescribeAccessKey) {}
   *  rpc CreateUser(request.CreateUser) returns (response.CreateUser) {}
   *  rpc UpdateUser(request.UpdateUser) returns (response.UpdateUser) {}
   *  rpc DeleteUser(request.DeleteUser) returns (response.DeleteUser) {}
   *  rpc CheckSession(request.CheckSession) returns (response.CheckSession) {}
   *  rpc CreateSession(request.CreateSession) returns (response.CreateSession) {}
   *  rpc CheckUserExists(request.CheckUserExists) returns (response.CheckUserExists) {}
   *  rpc CreateNotification(request.CreateNotification) returns (response.CreateNotification) {}
   *  rpc UpdateNotification(request.UpdateNotification) returns (response.UpdateNotification) {}
   *  rpc DeleteNotification(request.DeleteNotification) returns (response.DeleteNotification) {}
   *  rpc GetNotifications(request.GetNotifications) returns (response.GetNotifications) {}
   * </pre>
   */
  public static abstract class AccountManageImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   * <pre>
   *  rpc DescribeUsers(request.DescribeUsers) returns (response.DescribeUsers) {}
   *  rpc DescribeAccessKey(request.DescribeAccessKey) returns (response.DescribeAccessKey) {}
   *  rpc CreateUser(request.CreateUser) returns (response.CreateUser) {}
   *  rpc UpdateUser(request.UpdateUser) returns (response.UpdateUser) {}
   *  rpc DeleteUser(request.DeleteUser) returns (response.DeleteUser) {}
   *  rpc CheckSession(request.CheckSession) returns (response.CheckSession) {}
   *  rpc CreateSession(request.CreateSession) returns (response.CreateSession) {}
   *  rpc CheckUserExists(request.CheckUserExists) returns (response.CheckUserExists) {}
   *  rpc CreateNotification(request.CreateNotification) returns (response.CreateNotification) {}
   *  rpc UpdateNotification(request.UpdateNotification) returns (response.UpdateNotification) {}
   *  rpc DeleteNotification(request.DeleteNotification) returns (response.DeleteNotification) {}
   *  rpc GetNotifications(request.GetNotifications) returns (response.GetNotifications) {}
   * </pre>
   */
  public static final class AccountManageStub extends io.grpc.stub.AbstractAsyncStub<AccountManageStub> {
    private AccountManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountManageStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *  rpc DescribeUsers(request.DescribeUsers) returns (response.DescribeUsers) {}
   *  rpc DescribeAccessKey(request.DescribeAccessKey) returns (response.DescribeAccessKey) {}
   *  rpc CreateUser(request.CreateUser) returns (response.CreateUser) {}
   *  rpc UpdateUser(request.UpdateUser) returns (response.UpdateUser) {}
   *  rpc DeleteUser(request.DeleteUser) returns (response.DeleteUser) {}
   *  rpc CheckSession(request.CheckSession) returns (response.CheckSession) {}
   *  rpc CreateSession(request.CreateSession) returns (response.CreateSession) {}
   *  rpc CheckUserExists(request.CheckUserExists) returns (response.CheckUserExists) {}
   *  rpc CreateNotification(request.CreateNotification) returns (response.CreateNotification) {}
   *  rpc UpdateNotification(request.UpdateNotification) returns (response.UpdateNotification) {}
   *  rpc DeleteNotification(request.DeleteNotification) returns (response.DeleteNotification) {}
   *  rpc GetNotifications(request.GetNotifications) returns (response.GetNotifications) {}
   * </pre>
   */
  public static final class AccountManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountManageBlockingStub> {
    private AccountManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountManageBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *  rpc DescribeUsers(request.DescribeUsers) returns (response.DescribeUsers) {}
   *  rpc DescribeAccessKey(request.DescribeAccessKey) returns (response.DescribeAccessKey) {}
   *  rpc CreateUser(request.CreateUser) returns (response.CreateUser) {}
   *  rpc UpdateUser(request.UpdateUser) returns (response.UpdateUser) {}
   *  rpc DeleteUser(request.DeleteUser) returns (response.DeleteUser) {}
   *  rpc CheckSession(request.CheckSession) returns (response.CheckSession) {}
   *  rpc CreateSession(request.CreateSession) returns (response.CreateSession) {}
   *  rpc CheckUserExists(request.CheckUserExists) returns (response.CheckUserExists) {}
   *  rpc CreateNotification(request.CreateNotification) returns (response.CreateNotification) {}
   *  rpc UpdateNotification(request.UpdateNotification) returns (response.UpdateNotification) {}
   *  rpc DeleteNotification(request.DeleteNotification) returns (response.DeleteNotification) {}
   *  rpc GetNotifications(request.GetNotifications) returns (response.GetNotifications) {}
   * </pre>
   */
  public static final class AccountManageFutureStub extends io.grpc.stub.AbstractFutureStub<AccountManageFutureStub> {
    private AccountManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountManageFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
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

  private static abstract class AccountManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcaccount.PBSvcAccountManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountManage");
    }
  }

  private static final class AccountManageFileDescriptorSupplier
      extends AccountManageBaseDescriptorSupplier {
    AccountManageFileDescriptorSupplier() {}
  }

  private static final class AccountManageMethodDescriptorSupplier
      extends AccountManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountManageFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
