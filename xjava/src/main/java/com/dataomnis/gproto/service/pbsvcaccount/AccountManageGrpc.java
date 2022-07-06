package com.dataomnis.gproto.service.pbsvcaccount;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/account/account_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountManageGrpc {

  private AccountManageGrpc() {}

  public static final String SERVICE_NAME = "account.AccountManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers> getListUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUsers",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers> getListUsersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers> getListUsersMethod;
    if ((getListUsersMethod = AccountManageGrpc.getListUsersMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getListUsersMethod = AccountManageGrpc.getListUsersMethod) == null) {
          AccountManageGrpc.getListUsersMethod = getListUsersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("ListUsers"))
              .build();
        }
      }
    }
    return getListUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUsersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUsers",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUsersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUsersMethod;
    if ((getDeleteUsersMethod = AccountManageGrpc.getDeleteUsersMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getDeleteUsersMethod = AccountManageGrpc.getDeleteUsersMethod) == null) {
          AccountManageGrpc.getDeleteUsersMethod = getDeleteUsersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("DeleteUsers"))
              .build();
        }
      }
    }
    return getDeleteUsersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser> getDescribeUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeUser",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser> getDescribeUserMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser> getDescribeUserMethod;
    if ((getDescribeUserMethod = AccountManageGrpc.getDescribeUserMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getDescribeUserMethod = AccountManageGrpc.getDescribeUserMethod) == null) {
          AccountManageGrpc.getDescribeUserMethod = getDescribeUserMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("DescribeUser"))
              .build();
        }
      }
    }
    return getDescribeUserMethod;
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
    if ((getCreateUserMethod = AccountManageGrpc.getCreateUserMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getCreateUserMethod = AccountManageGrpc.getCreateUserMethod) == null) {
          AccountManageGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("CreateUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUser",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUserMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUserMethod;
    if ((getUpdateUserMethod = AccountManageGrpc.getUpdateUserMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getUpdateUserMethod = AccountManageGrpc.getUpdateUserMethod) == null) {
          AccountManageGrpc.getUpdateUserMethod = getUpdateUserMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("UpdateUser"))
              .build();
        }
      }
    }
    return getUpdateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getChangeUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeUserPassword",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getChangeUserPasswordMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getChangeUserPasswordMethod;
    if ((getChangeUserPasswordMethod = AccountManageGrpc.getChangeUserPasswordMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getChangeUserPasswordMethod = AccountManageGrpc.getChangeUserPasswordMethod) == null) {
          AccountManageGrpc.getChangeUserPasswordMethod = getChangeUserPasswordMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("ChangeUserPassword"))
              .build();
        }
      }
    }
    return getChangeUserPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResetUserPasswordMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResetUserPassword",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResetUserPasswordMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResetUserPasswordMethod;
    if ((getResetUserPasswordMethod = AccountManageGrpc.getResetUserPasswordMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getResetUserPasswordMethod = AccountManageGrpc.getResetUserPasswordMethod) == null) {
          AccountManageGrpc.getResetUserPasswordMethod = getResetUserPasswordMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResetUserPassword"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("ResetUserPassword"))
              .build();
        }
      }
    }
    return getResetUserPasswordMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys> getListAccessKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAccessKeys",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys> getListAccessKeysMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys> getListAccessKeysMethod;
    if ((getListAccessKeysMethod = AccountManageGrpc.getListAccessKeysMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getListAccessKeysMethod = AccountManageGrpc.getListAccessKeysMethod) == null) {
          AccountManageGrpc.getListAccessKeysMethod = getListAccessKeysMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAccessKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("ListAccessKeys"))
              .build();
        }
      }
    }
    return getListAccessKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAccessKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAccessKeys",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAccessKeysMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAccessKeysMethod;
    if ((getDeleteAccessKeysMethod = AccountManageGrpc.getDeleteAccessKeysMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getDeleteAccessKeysMethod = AccountManageGrpc.getDeleteAccessKeysMethod) == null) {
          AccountManageGrpc.getDeleteAccessKeysMethod = getDeleteAccessKeysMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAccessKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("DeleteAccessKeys"))
              .build();
        }
      }
    }
    return getDeleteAccessKeysMethod;
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
    if ((getDescribeAccessKeyMethod = AccountManageGrpc.getDescribeAccessKeyMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getDescribeAccessKeyMethod = AccountManageGrpc.getDescribeAccessKeyMethod) == null) {
          AccountManageGrpc.getDescribeAccessKeyMethod = getDescribeAccessKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeAccessKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("DescribeAccessKey"))
              .build();
        }
      }
    }
    return getDescribeAccessKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey> getCreateAccessKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAccessKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey> getCreateAccessKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey> getCreateAccessKeyMethod;
    if ((getCreateAccessKeyMethod = AccountManageGrpc.getCreateAccessKeyMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getCreateAccessKeyMethod = AccountManageGrpc.getCreateAccessKeyMethod) == null) {
          AccountManageGrpc.getCreateAccessKeyMethod = getCreateAccessKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAccessKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("CreateAccessKey"))
              .build();
        }
      }
    }
    return getCreateAccessKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdatedAccessKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdatedAccessKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdatedAccessKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdatedAccessKeyMethod;
    if ((getUpdatedAccessKeyMethod = AccountManageGrpc.getUpdatedAccessKeyMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getUpdatedAccessKeyMethod = AccountManageGrpc.getUpdatedAccessKeyMethod) == null) {
          AccountManageGrpc.getUpdatedAccessKeyMethod = getUpdatedAccessKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdatedAccessKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("UpdatedAccessKey"))
              .build();
        }
      }
    }
    return getUpdatedAccessKeyMethod;
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
    if ((getCreateSessionMethod = AccountManageGrpc.getCreateSessionMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getCreateSessionMethod = AccountManageGrpc.getCreateSessionMethod) == null) {
          AccountManageGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
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
    if ((getCheckSessionMethod = AccountManageGrpc.getCheckSessionMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getCheckSessionMethod = AccountManageGrpc.getCheckSessionMethod) == null) {
          AccountManageGrpc.getCheckSessionMethod = getCheckSessionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("CheckSession"))
              .build();
        }
      }
    }
    return getCheckSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications> getListNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotifications",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications> getListNotificationsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications> getListNotificationsMethod;
    if ((getListNotificationsMethod = AccountManageGrpc.getListNotificationsMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getListNotificationsMethod = AccountManageGrpc.getListNotificationsMethod) == null) {
          AccountManageGrpc.getListNotificationsMethod = getListNotificationsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("ListNotifications"))
              .build();
        }
      }
    }
    return getListNotificationsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification> getDescribeNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeNotification",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification> getDescribeNotificationMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification> getDescribeNotificationMethod;
    if ((getDescribeNotificationMethod = AccountManageGrpc.getDescribeNotificationMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getDescribeNotificationMethod = AccountManageGrpc.getDescribeNotificationMethod) == null) {
          AccountManageGrpc.getDescribeNotificationMethod = getDescribeNotificationMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("DescribeNotification"))
              .build();
        }
      }
    }
    return getDescribeNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification> getCreateNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNotification",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification> getCreateNotificationMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification> getCreateNotificationMethod;
    if ((getCreateNotificationMethod = AccountManageGrpc.getCreateNotificationMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getCreateNotificationMethod = AccountManageGrpc.getCreateNotificationMethod) == null) {
          AccountManageGrpc.getCreateNotificationMethod = getCreateNotificationMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("CreateNotification"))
              .build();
        }
      }
    }
    return getCreateNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNotification",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateNotificationMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateNotificationMethod;
    if ((getUpdateNotificationMethod = AccountManageGrpc.getUpdateNotificationMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getUpdateNotificationMethod = AccountManageGrpc.getUpdateNotificationMethod) == null) {
          AccountManageGrpc.getUpdateNotificationMethod = getUpdateNotificationMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("UpdateNotification"))
              .build();
        }
      }
    }
    return getUpdateNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotifications",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNotificationsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNotificationsMethod;
    if ((getDeleteNotificationsMethod = AccountManageGrpc.getDeleteNotificationsMethod) == null) {
      synchronized (AccountManageGrpc.class) {
        if ((getDeleteNotificationsMethod = AccountManageGrpc.getDeleteNotificationsMethod) == null) {
          AccountManageGrpc.getDeleteNotificationsMethod = getDeleteNotificationsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AccountManageMethodDescriptorSupplier("DeleteNotifications"))
              .build();
        }
      }
    }
    return getDeleteNotificationsMethod;
  }

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
   */
  public static abstract class AccountManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void listUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUsersMethod(), responseObserver);
    }

    /**
     */
    public void deleteUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUsersMethod(), responseObserver);
    }

    /**
     */
    public void describeUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeUserMethod(), responseObserver);
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
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUserMethod(), responseObserver);
    }

    /**
     */
    public void changeUserPassword(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeUserPasswordMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO: Only used by admin.
     * </pre>
     */
    public void resetUserPassword(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResetUserPasswordMethod(), responseObserver);
    }

    /**
     */
    public void listAccessKeys(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAccessKeysMethod(), responseObserver);
    }

    /**
     */
    public void deleteAccessKeys(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAccessKeysMethod(), responseObserver);
    }

    /**
     */
    public void describeAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeAccessKeyMethod(), responseObserver);
    }

    /**
     */
    public void createAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAccessKeyMethod(), responseObserver);
    }

    /**
     */
    public void updatedAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdatedAccessKeyMethod(), responseObserver);
    }

    /**
     * <pre>
     * Session API
     * </pre>
     */
    public void createSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     */
    public void checkSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckSessionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notification API
     * </pre>
     */
    public void listNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNotificationsMethod(), responseObserver);
    }

    /**
     */
    public void describeNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeNotificationMethod(), responseObserver);
    }

    /**
     */
    public void createNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNotificationMethod(), responseObserver);
    }

    /**
     */
    public void updateNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNotificationMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers>(
                  this, METHODID_LIST_USERS)))
          .addMethod(
            getDeleteUsersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_USERS)))
          .addMethod(
            getDescribeUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser>(
                  this, METHODID_DESCRIBE_USER)))
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
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_USER)))
          .addMethod(
            getChangeUserPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CHANGE_USER_PASSWORD)))
          .addMethod(
            getResetUserPasswordMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RESET_USER_PASSWORD)))
          .addMethod(
            getListAccessKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys>(
                  this, METHODID_LIST_ACCESS_KEYS)))
          .addMethod(
            getDeleteAccessKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_ACCESS_KEYS)))
          .addMethod(
            getDescribeAccessKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey>(
                  this, METHODID_DESCRIBE_ACCESS_KEY)))
          .addMethod(
            getCreateAccessKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey>(
                  this, METHODID_CREATE_ACCESS_KEY)))
          .addMethod(
            getUpdatedAccessKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATED_ACCESS_KEY)))
          .addMethod(
            getCreateSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession>(
                  this, METHODID_CREATE_SESSION)))
          .addMethod(
            getCheckSessionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession>(
                  this, METHODID_CHECK_SESSION)))
          .addMethod(
            getListNotificationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications>(
                  this, METHODID_LIST_NOTIFICATIONS)))
          .addMethod(
            getDescribeNotificationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification>(
                  this, METHODID_DESCRIBE_NOTIFICATION)))
          .addMethod(
            getCreateNotificationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification>(
                  this, METHODID_CREATE_NOTIFICATION)))
          .addMethod(
            getUpdateNotificationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_NOTIFICATION)))
          .addMethod(
            getDeleteNotificationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_NOTIFICATIONS)))
          .build();
    }
  }

  /**
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

    /**
     */
    public void listUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUsersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeUserMethod(), getCallOptions()), request, responseObserver);
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
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeUserPassword(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO: Only used by admin.
     * </pre>
     */
    public void resetUserPassword(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResetUserPasswordMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAccessKeys(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAccessKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAccessKeys(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAccessKeysMethod(), getCallOptions()), request, responseObserver);
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
    public void createAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAccessKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updatedAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdatedAccessKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Session API
     * </pre>
     */
    public void createSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notification API
     * </pre>
     */
    public void listNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
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

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers listUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteUsers(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUsersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser describeUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser createUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateUser(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct changeUserPassword(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO: Only used by admin.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct resetUserPassword(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResetUserPasswordMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys listAccessKeys(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAccessKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteAccessKeys(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAccessKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey describeAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeAccessKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey createAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAccessKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updatedAccessKey(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdatedAccessKeyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Session API
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession createSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession checkSession(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckSessionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notification API
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications listNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNotificationsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification describeNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification createNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationsMethod(), getCallOptions(), request);
    }
  }

  /**
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers> listUsers(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteUsers(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUsersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser> describeUser(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeUserMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateUser(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> changeUserPassword(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeUserPasswordMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO: Only used by admin.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> resetUserPassword(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResetUserPasswordMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys> listAccessKeys(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAccessKeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteAccessKeys(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAccessKeysMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey> createAccessKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAccessKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updatedAccessKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdatedAccessKeyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Session API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession> createSession(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession> checkSession(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckSessionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notification API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications> listNotifications(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNotificationsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification> describeNotification(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification> createNotification(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateNotification(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteNotifications(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_USERS = 0;
  private static final int METHODID_DELETE_USERS = 1;
  private static final int METHODID_DESCRIBE_USER = 2;
  private static final int METHODID_CREATE_USER = 3;
  private static final int METHODID_UPDATE_USER = 4;
  private static final int METHODID_CHANGE_USER_PASSWORD = 5;
  private static final int METHODID_RESET_USER_PASSWORD = 6;
  private static final int METHODID_LIST_ACCESS_KEYS = 7;
  private static final int METHODID_DELETE_ACCESS_KEYS = 8;
  private static final int METHODID_DESCRIBE_ACCESS_KEY = 9;
  private static final int METHODID_CREATE_ACCESS_KEY = 10;
  private static final int METHODID_UPDATED_ACCESS_KEY = 11;
  private static final int METHODID_CREATE_SESSION = 12;
  private static final int METHODID_CHECK_SESSION = 13;
  private static final int METHODID_LIST_NOTIFICATIONS = 14;
  private static final int METHODID_DESCRIBE_NOTIFICATION = 15;
  private static final int METHODID_CREATE_NOTIFICATION = 16;
  private static final int METHODID_UPDATE_NOTIFICATION = 17;
  private static final int METHODID_DELETE_NOTIFICATIONS = 18;

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
        case METHODID_LIST_USERS:
          serviceImpl.listUsers((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListUsers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListUsers>) responseObserver);
          break;
        case METHODID_DELETE_USERS:
          serviceImpl.deleteUsers((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteUsers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_USER:
          serviceImpl.describeUser((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeUser) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeUser>) responseObserver);
          break;
        case METHODID_CREATE_USER:
          serviceImpl.createUser((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateUser) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateUser>) responseObserver);
          break;
        case METHODID_UPDATE_USER:
          serviceImpl.updateUser((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateUser) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CHANGE_USER_PASSWORD:
          serviceImpl.changeUserPassword((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ChangeUserPassword) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RESET_USER_PASSWORD:
          serviceImpl.resetUserPassword((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ResetUserPassword) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_ACCESS_KEYS:
          serviceImpl.listAccessKeys((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListAccessKeys) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListAccessKeys>) responseObserver);
          break;
        case METHODID_DELETE_ACCESS_KEYS:
          serviceImpl.deleteAccessKeys((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteAccessKeys) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_ACCESS_KEY:
          serviceImpl.describeAccessKey((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeAccessKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeAccessKey>) responseObserver);
          break;
        case METHODID_CREATE_ACCESS_KEY:
          serviceImpl.createAccessKey((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateAccessKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateAccessKey>) responseObserver);
          break;
        case METHODID_UPDATED_ACCESS_KEY:
          serviceImpl.updatedAccessKey((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdatedAccessKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateSession) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateSession>) responseObserver);
          break;
        case METHODID_CHECK_SESSION:
          serviceImpl.checkSession((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckSession) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckSession>) responseObserver);
          break;
        case METHODID_LIST_NOTIFICATIONS:
          serviceImpl.listNotifications((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.ListNotifications) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.ListNotifications>) responseObserver);
          break;
        case METHODID_DESCRIBE_NOTIFICATION:
          serviceImpl.describeNotification((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DescribeNotification) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DescribeNotification>) responseObserver);
          break;
        case METHODID_CREATE_NOTIFICATION:
          serviceImpl.createNotification((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification>) responseObserver);
          break;
        case METHODID_UPDATE_NOTIFICATION:
          serviceImpl.updateNotification((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATIONS:
          serviceImpl.deleteNotifications((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotifications) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
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
              .addMethod(getListUsersMethod())
              .addMethod(getDeleteUsersMethod())
              .addMethod(getDescribeUserMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getChangeUserPasswordMethod())
              .addMethod(getResetUserPasswordMethod())
              .addMethod(getListAccessKeysMethod())
              .addMethod(getDeleteAccessKeysMethod())
              .addMethod(getDescribeAccessKeyMethod())
              .addMethod(getCreateAccessKeyMethod())
              .addMethod(getUpdatedAccessKeyMethod())
              .addMethod(getCreateSessionMethod())
              .addMethod(getCheckSessionMethod())
              .addMethod(getListNotificationsMethod())
              .addMethod(getDescribeNotificationMethod())
              .addMethod(getCreateNotificationMethod())
              .addMethod(getUpdateNotificationMethod())
              .addMethod(getDeleteNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
