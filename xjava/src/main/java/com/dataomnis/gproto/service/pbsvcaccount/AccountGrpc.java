package com.dataomnis.gproto.service.pbsvcaccount;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/account/account.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class AccountGrpc {

  private AccountGrpc() {}

  public static final String SERVICE_NAME = "account.Account";

  // Static method descriptors that strictly reflect the proto.
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

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists> getCheckUserExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckUserExists",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists> getCheckUserExistsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists> getCheckUserExistsMethod;
    if ((getCheckUserExistsMethod = AccountGrpc.getCheckUserExistsMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getCheckUserExistsMethod = AccountGrpc.getCheckUserExistsMethod) == null) {
          AccountGrpc.getCheckUserExistsMethod = getCheckUserExistsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckUserExists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("CheckUserExists"))
              .build();
        }
      }
    }
    return getCheckUserExistsMethod;
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
    if ((getCreateNotificationMethod = AccountGrpc.getCreateNotificationMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getCreateNotificationMethod = AccountGrpc.getCreateNotificationMethod) == null) {
          AccountGrpc.getCreateNotificationMethod = getCreateNotificationMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("CreateNotification"))
              .build();
        }
      }
    }
    return getCreateNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification> getUpdateNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNotification",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification> getUpdateNotificationMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification> getUpdateNotificationMethod;
    if ((getUpdateNotificationMethod = AccountGrpc.getUpdateNotificationMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getUpdateNotificationMethod = AccountGrpc.getUpdateNotificationMethod) == null) {
          AccountGrpc.getUpdateNotificationMethod = getUpdateNotificationMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("UpdateNotification"))
              .build();
        }
      }
    }
    return getUpdateNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification> getDeleteNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotification",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification> getDeleteNotificationMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification> getDeleteNotificationMethod;
    if ((getDeleteNotificationMethod = AccountGrpc.getDeleteNotificationMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getDeleteNotificationMethod = AccountGrpc.getDeleteNotificationMethod) == null) {
          AccountGrpc.getDeleteNotificationMethod = getDeleteNotificationMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("DeleteNotification"))
              .build();
        }
      }
    }
    return getDeleteNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications> getGetNotificationsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotifications",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications,
      com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications> getGetNotificationsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications> getGetNotificationsMethod;
    if ((getGetNotificationsMethod = AccountGrpc.getGetNotificationsMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getGetNotificationsMethod = AccountGrpc.getGetNotificationsMethod) == null) {
          AccountGrpc.getGetNotificationsMethod = getGetNotificationsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications, com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetNotifications"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications.getDefaultInstance()))
              .setSchemaDescriptor(new AccountMethodDescriptorSupplier("GetNotifications"))
              .build();
        }
      }
    }
    return getGetNotificationsMethod;
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
     * <pre>
     * FIXME: removed it.
     *  rpc ValidateRequestSignature(request.ValidateRequestSignature) returns (response.ValidateRequestSignature) {}
     * </pre>
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

    /**
     */
    public void checkUserExists(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckUserExistsMethod(), responseObserver);
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
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNotificationMethod(), responseObserver);
    }

    /**
     */
    public void deleteNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNotificationMethod(), responseObserver);
    }

    /**
     */
    public void getNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
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
          .addMethod(
            getCheckUserExistsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists>(
                  this, METHODID_CHECK_USER_EXISTS)))
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
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification>(
                  this, METHODID_UPDATE_NOTIFICATION)))
          .addMethod(
            getDeleteNotificationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification>(
                  this, METHODID_DELETE_NOTIFICATION)))
          .addMethod(
            getGetNotificationsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications,
                com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications>(
                  this, METHODID_GET_NOTIFICATIONS)))
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
     * <pre>
     * FIXME: removed it.
     *  rpc ValidateRequestSignature(request.ValidateRequestSignature) returns (response.ValidateRequestSignature) {}
     * </pre>
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

    /**
     */
    public void checkUserExists(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckUserExistsMethod(), getCallOptions()), request, responseObserver);
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
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationsMethod(), getCallOptions()), request, responseObserver);
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
     * <pre>
     * FIXME: removed it.
     *  rpc ValidateRequestSignature(request.ValidateRequestSignature) returns (response.ValidateRequestSignature) {}
     * </pre>
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

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists checkUserExists(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserExistsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification createNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification updateNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification deleteNotification(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications getNotifications(com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationsMethod(), getCallOptions(), request);
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
     * <pre>
     * FIXME: removed it.
     *  rpc ValidateRequestSignature(request.ValidateRequestSignature) returns (response.ValidateRequestSignature) {}
     * </pre>
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

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists> checkUserExists(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckUserExistsMethod(), getCallOptions()), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification> updateNotification(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification> deleteNotification(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications> getNotifications(
        com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE_USERS = 0;
  private static final int METHODID_DESCRIBE_ACCESS_KEY = 1;
  private static final int METHODID_CREATE_USER = 2;
  private static final int METHODID_UPDATE_USER = 3;
  private static final int METHODID_DELETE_USER = 4;
  private static final int METHODID_CHECK_SESSION = 5;
  private static final int METHODID_CREATE_SESSION = 6;
  private static final int METHODID_CHECK_USER_EXISTS = 7;
  private static final int METHODID_CREATE_NOTIFICATION = 8;
  private static final int METHODID_UPDATE_NOTIFICATION = 9;
  private static final int METHODID_DELETE_NOTIFICATION = 10;
  private static final int METHODID_GET_NOTIFICATIONS = 11;

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
        case METHODID_CHECK_USER_EXISTS:
          serviceImpl.checkUserExists((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CheckUserExists) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CheckUserExists>) responseObserver);
          break;
        case METHODID_CREATE_NOTIFICATION:
          serviceImpl.createNotification((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.CreateNotification) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.CreateNotification>) responseObserver);
          break;
        case METHODID_UPDATE_NOTIFICATION:
          serviceImpl.updateNotification((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.UpdateNotification) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.UpdateNotification>) responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATION:
          serviceImpl.deleteNotification((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.DeleteNotification) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.DeleteNotification>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATIONS:
          serviceImpl.getNotifications((com.dataomnis.gproto.types.pbrequest.PBRequestAccount.GetNotifications) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAccount.GetNotifications>) responseObserver);
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
              .addMethod(getDescribeUsersMethod())
              .addMethod(getDescribeAccessKeyMethod())
              .addMethod(getCreateUserMethod())
              .addMethod(getUpdateUserMethod())
              .addMethod(getDeleteUserMethod())
              .addMethod(getCheckSessionMethod())
              .addMethod(getCreateSessionMethod())
              .addMethod(getCheckUserExistsMethod())
              .addMethod(getCreateNotificationMethod())
              .addMethod(getUpdateNotificationMethod())
              .addMethod(getDeleteNotificationMethod())
              .addMethod(getGetNotificationsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
