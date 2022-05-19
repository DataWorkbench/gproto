package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SpaceManage declares API for manage workspace.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/space_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SpaceManageGrpc {

  private SpaceManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.SpaceManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> getListWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWorkspaces",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> getListWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> getListWorkspacesMethod;
    if ((getListWorkspacesMethod = SpaceManageGrpc.getListWorkspacesMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getListWorkspacesMethod = SpaceManageGrpc.getListWorkspacesMethod) == null) {
          SpaceManageGrpc.getListWorkspacesMethod = getListWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("ListWorkspaces"))
              .build();
        }
      }
    }
    return getListWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> getListMemberWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMemberWorkspaces",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> getListMemberWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> getListMemberWorkspacesMethod;
    if ((getListMemberWorkspacesMethod = SpaceManageGrpc.getListMemberWorkspacesMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getListMemberWorkspacesMethod = SpaceManageGrpc.getListMemberWorkspacesMethod) == null) {
          SpaceManageGrpc.getListMemberWorkspacesMethod = getListMemberWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMemberWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("ListMemberWorkspaces"))
              .build();
        }
      }
    }
    return getListMemberWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkspaces",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteWorkspacesMethod;
    if ((getDeleteWorkspacesMethod = SpaceManageGrpc.getDeleteWorkspacesMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getDeleteWorkspacesMethod = SpaceManageGrpc.getDeleteWorkspacesMethod) == null) {
          SpaceManageGrpc.getDeleteWorkspacesMethod = getDeleteWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("DeleteWorkspaces"))
              .build();
        }
      }
    }
    return getDeleteWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableWorkspaces",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableWorkspacesMethod;
    if ((getDisableWorkspacesMethod = SpaceManageGrpc.getDisableWorkspacesMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getDisableWorkspacesMethod = SpaceManageGrpc.getDisableWorkspacesMethod) == null) {
          SpaceManageGrpc.getDisableWorkspacesMethod = getDisableWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("DisableWorkspaces"))
              .build();
        }
      }
    }
    return getDisableWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableWorkspaces",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableWorkspacesMethod;
    if ((getEnableWorkspacesMethod = SpaceManageGrpc.getEnableWorkspacesMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getEnableWorkspacesMethod = SpaceManageGrpc.getEnableWorkspacesMethod) == null) {
          SpaceManageGrpc.getEnableWorkspacesMethod = getEnableWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("EnableWorkspaces"))
              .build();
        }
      }
    }
    return getEnableWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace> getCreateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspace",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace> getCreateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace> getCreateWorkspaceMethod;
    if ((getCreateWorkspaceMethod = SpaceManageGrpc.getCreateWorkspaceMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getCreateWorkspaceMethod = SpaceManageGrpc.getCreateWorkspaceMethod) == null) {
          SpaceManageGrpc.getCreateWorkspaceMethod = getCreateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("CreateWorkspace"))
              .build();
        }
      }
    }
    return getCreateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkspace",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateWorkspaceMethod;
    if ((getUpdateWorkspaceMethod = SpaceManageGrpc.getUpdateWorkspaceMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getUpdateWorkspaceMethod = SpaceManageGrpc.getUpdateWorkspaceMethod) == null) {
          SpaceManageGrpc.getUpdateWorkspaceMethod = getUpdateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("UpdateWorkspace"))
              .build();
        }
      }
    }
    return getUpdateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace> getDescribeWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeWorkspace",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace> getDescribeWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace> getDescribeWorkspaceMethod;
    if ((getDescribeWorkspaceMethod = SpaceManageGrpc.getDescribeWorkspaceMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getDescribeWorkspaceMethod = SpaceManageGrpc.getDescribeWorkspaceMethod) == null) {
          SpaceManageGrpc.getDescribeWorkspaceMethod = getDescribeWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("DescribeWorkspace"))
              .build();
        }
      }
    }
    return getDescribeWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission> getCheckPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermission",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission> getCheckPermissionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission> getCheckPermissionMethod;
    if ((getCheckPermissionMethod = SpaceManageGrpc.getCheckPermissionMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getCheckPermissionMethod = SpaceManageGrpc.getCheckPermissionMethod) == null) {
          SpaceManageGrpc.getCheckPermissionMethod = getCheckPermissionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("CheckPermission"))
              .build();
        }
      }
    }
    return getCheckPermissionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig> getDescribeNetworkConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeNetworkConfig",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig,
      com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig> getDescribeNetworkConfigMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig> getDescribeNetworkConfigMethod;
    if ((getDescribeNetworkConfigMethod = SpaceManageGrpc.getDescribeNetworkConfigMethod) == null) {
      synchronized (SpaceManageGrpc.class) {
        if ((getDescribeNetworkConfigMethod = SpaceManageGrpc.getDescribeNetworkConfigMethod) == null) {
          SpaceManageGrpc.getDescribeNetworkConfigMethod = getDescribeNetworkConfigMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig, com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeNetworkConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig.getDefaultInstance()))
              .setSchemaDescriptor(new SpaceManageMethodDescriptorSupplier("DescribeNetworkConfig"))
              .build();
        }
      }
    }
    return getDescribeNetworkConfigMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SpaceManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceManageStub>() {
        @java.lang.Override
        public SpaceManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceManageStub(channel, callOptions);
        }
      };
    return SpaceManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SpaceManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceManageBlockingStub>() {
        @java.lang.Override
        public SpaceManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceManageBlockingStub(channel, callOptions);
        }
      };
    return SpaceManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SpaceManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SpaceManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SpaceManageFutureStub>() {
        @java.lang.Override
        public SpaceManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SpaceManageFutureStub(channel, callOptions);
        }
      };
    return SpaceManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SpaceManage declares API for manage workspace.
   * </pre>
   */
  public static abstract class SpaceManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListWorkspaces get a lists of workspaces.
     * </pre>
     */
    public void listWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWorkspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListMemberWorkspaces get a lists of workspaces that the specified user has be joined.
     * </pre>
     */
    public void listMemberWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMemberWorkspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public void deleteWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public void disableWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableWorkspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public void enableWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableWorkspacesMethod(), responseObserver);
    }

    /**
     */
    public void createWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkspaceMethod(), responseObserver);
    }

    /**
     */
    public void updateWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWorkspaceMethod(), responseObserver);
    }

    /**
     */
    public void describeWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * Permission Check.
     * Notice: cannot check API includes: ListWorkspaces, DeleteWorkspaces, DisableWorkspaces, EnableWorkspaces.
     * </pre>
     */
    public void checkPermission(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionMethod(), responseObserver);
    }

    /**
     * <pre>
     * Network config
     * </pre>
     */
    public void describeNetworkConfig(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeNetworkConfigMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces,
                com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces>(
                  this, METHODID_LIST_WORKSPACES)))
          .addMethod(
            getListMemberWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces,
                com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces>(
                  this, METHODID_LIST_MEMBER_WORKSPACES)))
          .addMethod(
            getDeleteWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_WORKSPACES)))
          .addMethod(
            getDisableWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DISABLE_WORKSPACES)))
          .addMethod(
            getEnableWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ENABLE_WORKSPACES)))
          .addMethod(
            getCreateWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace,
                com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace>(
                  this, METHODID_CREATE_WORKSPACE)))
          .addMethod(
            getUpdateWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_WORKSPACE)))
          .addMethod(
            getDescribeWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace,
                com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace>(
                  this, METHODID_DESCRIBE_WORKSPACE)))
          .addMethod(
            getCheckPermissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission,
                com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission>(
                  this, METHODID_CHECK_PERMISSION)))
          .addMethod(
            getDescribeNetworkConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig,
                com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig>(
                  this, METHODID_DESCRIBE_NETWORK_CONFIG)))
          .build();
    }
  }

  /**
   * <pre>
   * SpaceManage declares API for manage workspace.
   * </pre>
   */
  public static final class SpaceManageStub extends io.grpc.stub.AbstractAsyncStub<SpaceManageStub> {
    private SpaceManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListWorkspaces get a lists of workspaces.
     * </pre>
     */
    public void listWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListMemberWorkspaces get a lists of workspaces that the specified user has be joined.
     * </pre>
     */
    public void listMemberWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMemberWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public void deleteWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public void disableWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public void enableWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Permission Check.
     * Notice: cannot check API includes: ListWorkspaces, DeleteWorkspaces, DisableWorkspaces, EnableWorkspaces.
     * </pre>
     */
    public void checkPermission(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Network config
     * </pre>
     */
    public void describeNetworkConfig(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeNetworkConfigMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SpaceManage declares API for manage workspace.
   * </pre>
   */
  public static final class SpaceManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<SpaceManageBlockingStub> {
    private SpaceManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListWorkspaces get a lists of workspaces.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces listWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListMemberWorkspaces get a lists of workspaces that the specified user has be joined.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces listMemberWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMemberWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct disableWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct enableWorkspaces(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace createWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace describeWorkspace(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Permission Check.
     * Notice: cannot check API includes: ListWorkspaces, DeleteWorkspaces, DisableWorkspaces, EnableWorkspaces.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission checkPermission(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Network config
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig describeNetworkConfig(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeNetworkConfigMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SpaceManage declares API for manage workspace.
   * </pre>
   */
  public static final class SpaceManageFutureStub extends io.grpc.stub.AbstractFutureStub<SpaceManageFutureStub> {
    private SpaceManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SpaceManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SpaceManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListWorkspaces get a lists of workspaces.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> listWorkspaces(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListMemberWorkspaces get a lists of workspaces that the specified user has be joined.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces> listMemberWorkspaces(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMemberWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteWorkspaces(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> disableWorkspaces(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DisableWorkspaces allowed only invoke by space owner.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> enableWorkspaces(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace> createWorkspace(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateWorkspace(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace> describeWorkspace(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Permission Check.
     * Notice: cannot check API includes: ListWorkspaces, DeleteWorkspaces, DisableWorkspaces, EnableWorkspaces.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission> checkPermission(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Network config
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig> describeNetworkConfig(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeNetworkConfigMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_WORKSPACES = 0;
  private static final int METHODID_LIST_MEMBER_WORKSPACES = 1;
  private static final int METHODID_DELETE_WORKSPACES = 2;
  private static final int METHODID_DISABLE_WORKSPACES = 3;
  private static final int METHODID_ENABLE_WORKSPACES = 4;
  private static final int METHODID_CREATE_WORKSPACE = 5;
  private static final int METHODID_UPDATE_WORKSPACE = 6;
  private static final int METHODID_DESCRIBE_WORKSPACE = 7;
  private static final int METHODID_CHECK_PERMISSION = 8;
  private static final int METHODID_DESCRIBE_NETWORK_CONFIG = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SpaceManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SpaceManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_WORKSPACES:
          serviceImpl.listWorkspaces((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces>) responseObserver);
          break;
        case METHODID_LIST_MEMBER_WORKSPACES:
          serviceImpl.listMemberWorkspaces((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.ListWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.ListWorkspaces>) responseObserver);
          break;
        case METHODID_DELETE_WORKSPACES:
          serviceImpl.deleteWorkspaces((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DISABLE_WORKSPACES:
          serviceImpl.disableWorkspaces((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DisableWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ENABLE_WORKSPACES:
          serviceImpl.enableWorkspaces((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.EnableWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_WORKSPACE:
          serviceImpl.createWorkspace((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CreateWorkspace) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CreateWorkspace>) responseObserver);
          break;
        case METHODID_UPDATE_WORKSPACE:
          serviceImpl.updateWorkspace((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.UpdateWorkspace) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_WORKSPACE:
          serviceImpl.describeWorkspace((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeWorkspace) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeWorkspace>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSION:
          serviceImpl.checkPermission((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.CheckPermission) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.CheckPermission>) responseObserver);
          break;
        case METHODID_DESCRIBE_NETWORK_CONFIG:
          serviceImpl.describeNetworkConfig((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DescribeNetworkConfig) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSpaceManage.DescribeNetworkConfig>) responseObserver);
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

  private static abstract class SpaceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SpaceManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcSpaceManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SpaceManage");
    }
  }

  private static final class SpaceManageFileDescriptorSupplier
      extends SpaceManageBaseDescriptorSupplier {
    SpaceManageFileDescriptorSupplier() {}
  }

  private static final class SpaceManageMethodDescriptorSupplier
      extends SpaceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SpaceManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (SpaceManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SpaceManageFileDescriptorSupplier())
              .addMethod(getListWorkspacesMethod())
              .addMethod(getListMemberWorkspacesMethod())
              .addMethod(getDeleteWorkspacesMethod())
              .addMethod(getDisableWorkspacesMethod())
              .addMethod(getEnableWorkspacesMethod())
              .addMethod(getCreateWorkspaceMethod())
              .addMethod(getUpdateWorkspaceMethod())
              .addMethod(getDescribeWorkspaceMethod())
              .addMethod(getCheckPermissionMethod())
              .addMethod(getDescribeNetworkConfigMethod())
              .build();
        }
      }
    }
    return result;
  }
}
