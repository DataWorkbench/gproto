package com.dataomnis.gproto.workspacepb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Workspace Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/workspace.proto")
public final class WorkspaceGrpc {

  private WorkspaceGrpc() {}

  public static final String SERVICE_NAME = "wspb.Workspace";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces,
      com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces> getListWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListWorkspaces",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces,
      com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces> getListWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces, com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces> getListWorkspacesMethod;
    if ((getListWorkspacesMethod = WorkspaceGrpc.getListWorkspacesMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getListWorkspacesMethod = WorkspaceGrpc.getListWorkspacesMethod) == null) {
          WorkspaceGrpc.getListWorkspacesMethod = getListWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces, com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("ListWorkspaces"))
              .build();
        }
      }
    }
    return getListWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkspaces",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteWorkspacesMethod;
    if ((getDeleteWorkspacesMethod = WorkspaceGrpc.getDeleteWorkspacesMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getDeleteWorkspacesMethod = WorkspaceGrpc.getDeleteWorkspacesMethod) == null) {
          WorkspaceGrpc.getDeleteWorkspacesMethod = getDeleteWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("DeleteWorkspaces"))
              .build();
        }
      }
    }
    return getDeleteWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDisableWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableWorkspaces",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDisableWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDisableWorkspacesMethod;
    if ((getDisableWorkspacesMethod = WorkspaceGrpc.getDisableWorkspacesMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getDisableWorkspacesMethod = WorkspaceGrpc.getDisableWorkspacesMethod) == null) {
          WorkspaceGrpc.getDisableWorkspacesMethod = getDisableWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("DisableWorkspaces"))
              .build();
        }
      }
    }
    return getDisableWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getEnableWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableWorkspaces",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getEnableWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getEnableWorkspacesMethod;
    if ((getEnableWorkspacesMethod = WorkspaceGrpc.getEnableWorkspacesMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getEnableWorkspacesMethod = WorkspaceGrpc.getEnableWorkspacesMethod) == null) {
          WorkspaceGrpc.getEnableWorkspacesMethod = getEnableWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("EnableWorkspaces"))
              .build();
        }
      }
    }
    return getEnableWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace,
      com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace> getCreateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateWorkspace",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace,
      com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace> getCreateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace, com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace> getCreateWorkspaceMethod;
    if ((getCreateWorkspaceMethod = WorkspaceGrpc.getCreateWorkspaceMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getCreateWorkspaceMethod = WorkspaceGrpc.getCreateWorkspaceMethod) == null) {
          WorkspaceGrpc.getCreateWorkspaceMethod = getCreateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace, com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("CreateWorkspace"))
              .build();
        }
      }
    }
    return getCreateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateWorkspace",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateWorkspaceMethod;
    if ((getUpdateWorkspaceMethod = WorkspaceGrpc.getUpdateWorkspaceMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getUpdateWorkspaceMethod = WorkspaceGrpc.getUpdateWorkspaceMethod) == null) {
          WorkspaceGrpc.getUpdateWorkspaceMethod = getUpdateWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("UpdateWorkspace"))
              .build();
        }
      }
    }
    return getUpdateWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace> getDescribeWorkspaceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeWorkspace",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace> getDescribeWorkspaceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace, com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace> getDescribeWorkspaceMethod;
    if ((getDescribeWorkspaceMethod = WorkspaceGrpc.getDescribeWorkspaceMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getDescribeWorkspaceMethod = WorkspaceGrpc.getDescribeWorkspaceMethod) == null) {
          WorkspaceGrpc.getDescribeWorkspaceMethod = getDescribeWorkspaceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace, com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeWorkspace"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("DescribeWorkspace"))
              .build();
        }
      }
    }
    return getDescribeWorkspaceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.AddAudit,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getAddAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddAudit",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.AddAudit.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.AddAudit,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getAddAuditMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.AddAudit, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getAddAuditMethod;
    if ((getAddAuditMethod = WorkspaceGrpc.getAddAuditMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getAddAuditMethod = WorkspaceGrpc.getAddAuditMethod) == null) {
          WorkspaceGrpc.getAddAuditMethod = getAddAuditMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.AddAudit, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddAudit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.AddAudit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("AddAudit"))
              .build();
        }
      }
    }
    return getAddAuditMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListAudits,
      com.dataomnis.gproto.responsepb.ResponsePB.ListAudits> getListAuditsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAudits",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListAudits.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListAudits.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListAudits,
      com.dataomnis.gproto.responsepb.ResponsePB.ListAudits> getListAuditsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListAudits, com.dataomnis.gproto.responsepb.ResponsePB.ListAudits> getListAuditsMethod;
    if ((getListAuditsMethod = WorkspaceGrpc.getListAuditsMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getListAuditsMethod = WorkspaceGrpc.getListAuditsMethod) == null) {
          WorkspaceGrpc.getListAuditsMethod = getListAuditsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListAudits, com.dataomnis.gproto.responsepb.ResponsePB.ListAudits>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAudits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListAudits.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListAudits.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("ListAudits"))
              .build();
        }
      }
    }
    return getListAuditsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles,
      com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles> getListSystemRolesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSystemRoles",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles,
      com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles> getListSystemRolesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles, com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles> getListSystemRolesMethod;
    if ((getListSystemRolesMethod = WorkspaceGrpc.getListSystemRolesMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getListSystemRolesMethod = WorkspaceGrpc.getListSystemRolesMethod) == null) {
          WorkspaceGrpc.getListSystemRolesMethod = getListSystemRolesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles, com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSystemRoles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("ListSystemRoles"))
              .build();
        }
      }
    }
    return getListSystemRolesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListMembers,
      com.dataomnis.gproto.responsepb.ResponsePB.ListMembers> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMembers",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListMembers.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListMembers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListMembers,
      com.dataomnis.gproto.responsepb.ResponsePB.ListMembers> getListMembersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListMembers, com.dataomnis.gproto.responsepb.ResponsePB.ListMembers> getListMembersMethod;
    if ((getListMembersMethod = WorkspaceGrpc.getListMembersMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getListMembersMethod = WorkspaceGrpc.getListMembersMethod) == null) {
          WorkspaceGrpc.getListMembersMethod = getListMembersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListMembers, com.dataomnis.gproto.responsepb.ResponsePB.ListMembers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListMembers.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("ListMembers"))
              .build();
        }
      }
    }
    return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpsertMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertMembers",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpsertMembersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpsertMembersMethod;
    if ((getUpsertMembersMethod = WorkspaceGrpc.getUpsertMembersMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getUpsertMembersMethod = WorkspaceGrpc.getUpsertMembersMethod) == null) {
          WorkspaceGrpc.getUpsertMembersMethod = getUpsertMembersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("UpsertMembers"))
              .build();
        }
      }
    }
    return getUpsertMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMembers",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteMembersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteMembersMethod;
    if ((getDeleteMembersMethod = WorkspaceGrpc.getDeleteMembersMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getDeleteMembersMethod = WorkspaceGrpc.getDeleteMembersMethod) == null) {
          WorkspaceGrpc.getDeleteMembersMethod = getDeleteMembersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("DeleteMembers"))
              .build();
        }
      }
    }
    return getDeleteMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CheckPermission,
      com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission> getCheckPermissionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckPermission",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.CheckPermission.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CheckPermission,
      com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission> getCheckPermissionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CheckPermission, com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission> getCheckPermissionMethod;
    if ((getCheckPermissionMethod = WorkspaceGrpc.getCheckPermissionMethod) == null) {
      synchronized (WorkspaceGrpc.class) {
        if ((getCheckPermissionMethod = WorkspaceGrpc.getCheckPermissionMethod) == null) {
          WorkspaceGrpc.getCheckPermissionMethod = getCheckPermissionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.CheckPermission, com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckPermission"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.CheckPermission.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission.getDefaultInstance()))
              .setSchemaDescriptor(new WorkspaceMethodDescriptorSupplier("CheckPermission"))
              .build();
        }
      }
    }
    return getCheckPermissionMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WorkspaceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceStub>() {
        @java.lang.Override
        public WorkspaceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceStub(channel, callOptions);
        }
      };
    return WorkspaceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WorkspaceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceBlockingStub>() {
        @java.lang.Override
        public WorkspaceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceBlockingStub(channel, callOptions);
        }
      };
    return WorkspaceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WorkspaceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WorkspaceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WorkspaceFutureStub>() {
        @java.lang.Override
        public WorkspaceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WorkspaceFutureStub(channel, callOptions);
        }
      };
    return WorkspaceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Workspace Service
   * </pre>
   */
  public static abstract class WorkspaceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * API of workspace manager.
     * </pre>
     */
    public void listWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListWorkspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspaces delete the specified workspaces and its resources;
     * Resources includes
     *  - Members.
     *  - Audit(Operation Records).
     * </pre>
     */
    public void deleteWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkspacesMethod(), responseObserver);
    }

    /**
     */
    public void disableWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableWorkspacesMethod(), responseObserver);
    }

    /**
     */
    public void enableWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableWorkspacesMethod(), responseObserver);
    }

    /**
     */
    public void createWorkspace(com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateWorkspaceMethod(), responseObserver);
    }

    /**
     */
    public void updateWorkspace(com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateWorkspaceMethod(), responseObserver);
    }

    /**
     */
    public void describeWorkspace(com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeWorkspaceMethod(), responseObserver);
    }

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public void addAudit(com.dataomnis.gproto.requestpb.RequestPB.AddAudit request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddAuditMethod(), responseObserver);
    }

    /**
     */
    public void listAudits(com.dataomnis.gproto.requestpb.RequestPB.ListAudits request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListAudits> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuditsMethod(), responseObserver);
    }

    /**
     * <pre>
     * API of workspace role.
     * </pre>
     */
    public void listSystemRoles(com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSystemRolesMethod(), responseObserver);
    }

    /**
     * <pre>
     * API of workspace member.
     * </pre>
     */
    public void listMembers(com.dataomnis.gproto.requestpb.RequestPB.ListMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListMembers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     */
    public void upsertMembers(com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertMembersMethod(), responseObserver);
    }

    /**
     */
    public void deleteMembers(com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Permission Auth.
     * </pre>
     */
    public void checkPermission(com.dataomnis.gproto.requestpb.RequestPB.CheckPermission request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckPermissionMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces,
                com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces>(
                  this, METHODID_LIST_WORKSPACES)))
          .addMethod(
            getDeleteWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_WORKSPACES)))
          .addMethod(
            getDisableWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DISABLE_WORKSPACES)))
          .addMethod(
            getEnableWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_ENABLE_WORKSPACES)))
          .addMethod(
            getCreateWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace,
                com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace>(
                  this, METHODID_CREATE_WORKSPACE)))
          .addMethod(
            getUpdateWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_WORKSPACE)))
          .addMethod(
            getDescribeWorkspaceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace,
                com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace>(
                  this, METHODID_DESCRIBE_WORKSPACE)))
          .addMethod(
            getAddAuditMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.AddAudit,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_ADD_AUDIT)))
          .addMethod(
            getListAuditsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListAudits,
                com.dataomnis.gproto.responsepb.ResponsePB.ListAudits>(
                  this, METHODID_LIST_AUDITS)))
          .addMethod(
            getListSystemRolesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles,
                com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles>(
                  this, METHODID_LIST_SYSTEM_ROLES)))
          .addMethod(
            getListMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListMembers,
                com.dataomnis.gproto.responsepb.ResponsePB.ListMembers>(
                  this, METHODID_LIST_MEMBERS)))
          .addMethod(
            getUpsertMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPSERT_MEMBERS)))
          .addMethod(
            getDeleteMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_MEMBERS)))
          .addMethod(
            getCheckPermissionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.CheckPermission,
                com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission>(
                  this, METHODID_CHECK_PERMISSION)))
          .build();
    }
  }

  /**
   * <pre>
   * Workspace Service
   * </pre>
   */
  public static final class WorkspaceStub extends io.grpc.stub.AbstractAsyncStub<WorkspaceStub> {
    private WorkspaceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of workspace manager.
     * </pre>
     */
    public void listWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteWorkspaces delete the specified workspaces and its resources;
     * Resources includes
     *  - Members.
     *  - Audit(Operation Records).
     * </pre>
     */
    public void deleteWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createWorkspace(com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateWorkspace(com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeWorkspace(com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeWorkspaceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public void addAudit(com.dataomnis.gproto.requestpb.RequestPB.AddAudit request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddAuditMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAudits(com.dataomnis.gproto.requestpb.RequestPB.ListAudits request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListAudits> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuditsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * API of workspace role.
     * </pre>
     */
    public void listSystemRoles(com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSystemRolesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * API of workspace member.
     * </pre>
     */
    public void listMembers(com.dataomnis.gproto.requestpb.RequestPB.ListMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListMembers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsertMembers(com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMembers(com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Permission Auth.
     * </pre>
     */
    public void checkPermission(com.dataomnis.gproto.requestpb.RequestPB.CheckPermission request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Workspace Service
   * </pre>
   */
  public static final class WorkspaceBlockingStub extends io.grpc.stub.AbstractBlockingStub<WorkspaceBlockingStub> {
    private WorkspaceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of workspace manager.
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces listWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteWorkspaces delete the specified workspaces and its resources;
     * Resources includes
     *  - Members.
     *  - Audit(Operation Records).
     * </pre>
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct deleteWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct disableWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct enableWorkspaces(com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace createWorkspace(com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct updateWorkspace(com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace describeWorkspace(com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeWorkspaceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct addAudit(com.dataomnis.gproto.requestpb.RequestPB.AddAudit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddAuditMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListAudits listAudits(com.dataomnis.gproto.requestpb.RequestPB.ListAudits request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuditsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * API of workspace role.
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles listSystemRoles(com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSystemRolesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * API of workspace member.
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListMembers listMembers(com.dataomnis.gproto.requestpb.RequestPB.ListMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct upsertMembers(com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct deleteMembers(com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Permission Auth.
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission checkPermission(com.dataomnis.gproto.requestpb.RequestPB.CheckPermission request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckPermissionMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Workspace Service
   * </pre>
   */
  public static final class WorkspaceFutureStub extends io.grpc.stub.AbstractFutureStub<WorkspaceFutureStub> {
    private WorkspaceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WorkspaceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WorkspaceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of workspace manager.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces> listWorkspaces(
        com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteWorkspaces delete the specified workspaces and its resources;
     * Resources includes
     *  - Members.
     *  - Audit(Operation Records).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> deleteWorkspaces(
        com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> disableWorkspaces(
        com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> enableWorkspaces(
        com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace> createWorkspace(
        com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> updateWorkspace(
        com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace> describeWorkspace(
        com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeWorkspaceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> addAudit(
        com.dataomnis.gproto.requestpb.RequestPB.AddAudit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddAuditMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListAudits> listAudits(
        com.dataomnis.gproto.requestpb.RequestPB.ListAudits request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuditsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * API of workspace role.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles> listSystemRoles(
        com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSystemRolesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * API of workspace member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListMembers> listMembers(
        com.dataomnis.gproto.requestpb.RequestPB.ListMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> upsertMembers(
        com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> deleteMembers(
        com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Permission Auth.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission> checkPermission(
        com.dataomnis.gproto.requestpb.RequestPB.CheckPermission request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckPermissionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_WORKSPACES = 0;
  private static final int METHODID_DELETE_WORKSPACES = 1;
  private static final int METHODID_DISABLE_WORKSPACES = 2;
  private static final int METHODID_ENABLE_WORKSPACES = 3;
  private static final int METHODID_CREATE_WORKSPACE = 4;
  private static final int METHODID_UPDATE_WORKSPACE = 5;
  private static final int METHODID_DESCRIBE_WORKSPACE = 6;
  private static final int METHODID_ADD_AUDIT = 7;
  private static final int METHODID_LIST_AUDITS = 8;
  private static final int METHODID_LIST_SYSTEM_ROLES = 9;
  private static final int METHODID_LIST_MEMBERS = 10;
  private static final int METHODID_UPSERT_MEMBERS = 11;
  private static final int METHODID_DELETE_MEMBERS = 12;
  private static final int METHODID_CHECK_PERMISSION = 13;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WorkspaceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WorkspaceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_WORKSPACES:
          serviceImpl.listWorkspaces((com.dataomnis.gproto.requestpb.RequestPB.ListWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListWorkspaces>) responseObserver);
          break;
        case METHODID_DELETE_WORKSPACES:
          serviceImpl.deleteWorkspaces((com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DISABLE_WORKSPACES:
          serviceImpl.disableWorkspaces((com.dataomnis.gproto.requestpb.RequestPB.DisableWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_ENABLE_WORKSPACES:
          serviceImpl.enableWorkspaces((com.dataomnis.gproto.requestpb.RequestPB.EnableWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_WORKSPACE:
          serviceImpl.createWorkspace((com.dataomnis.gproto.requestpb.RequestPB.CreateWorkspace) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateWorkspace>) responseObserver);
          break;
        case METHODID_UPDATE_WORKSPACE:
          serviceImpl.updateWorkspace((com.dataomnis.gproto.requestpb.RequestPB.UpdateWorkspace) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_WORKSPACE:
          serviceImpl.describeWorkspace((com.dataomnis.gproto.requestpb.RequestPB.DescribeWorkspace) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeWorkspace>) responseObserver);
          break;
        case METHODID_ADD_AUDIT:
          serviceImpl.addAudit((com.dataomnis.gproto.requestpb.RequestPB.AddAudit) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_AUDITS:
          serviceImpl.listAudits((com.dataomnis.gproto.requestpb.RequestPB.ListAudits) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListAudits>) responseObserver);
          break;
        case METHODID_LIST_SYSTEM_ROLES:
          serviceImpl.listSystemRoles((com.dataomnis.gproto.requestpb.RequestPB.ListSystemRoles) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListSystemRoles>) responseObserver);
          break;
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((com.dataomnis.gproto.requestpb.RequestPB.ListMembers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListMembers>) responseObserver);
          break;
        case METHODID_UPSERT_MEMBERS:
          serviceImpl.upsertMembers((com.dataomnis.gproto.requestpb.RequestPB.UpsertMembers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_MEMBERS:
          serviceImpl.deleteMembers((com.dataomnis.gproto.requestpb.RequestPB.DeleteMembers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_CHECK_PERMISSION:
          serviceImpl.checkPermission((com.dataomnis.gproto.requestpb.RequestPB.CheckPermission) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CheckPermission>) responseObserver);
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

  private static abstract class WorkspaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WorkspaceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.workspacepb.WorkspacePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Workspace");
    }
  }

  private static final class WorkspaceFileDescriptorSupplier
      extends WorkspaceBaseDescriptorSupplier {
    WorkspaceFileDescriptorSupplier() {}
  }

  private static final class WorkspaceMethodDescriptorSupplier
      extends WorkspaceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WorkspaceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WorkspaceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WorkspaceFileDescriptorSupplier())
              .addMethod(getListWorkspacesMethod())
              .addMethod(getDeleteWorkspacesMethod())
              .addMethod(getDisableWorkspacesMethod())
              .addMethod(getEnableWorkspacesMethod())
              .addMethod(getCreateWorkspaceMethod())
              .addMethod(getUpdateWorkspaceMethod())
              .addMethod(getDescribeWorkspaceMethod())
              .addMethod(getAddAuditMethod())
              .addMethod(getListAuditsMethod())
              .addMethod(getListSystemRolesMethod())
              .addMethod(getListMembersMethod())
              .addMethod(getUpsertMembersMethod())
              .addMethod(getDeleteMembersMethod())
              .addMethod(getCheckPermissionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
