package com.dataomnis.gproto.service.pbsvcresource;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/resourcemanager/resource_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ResourceManageGrpc {

  private ResourceManageGrpc() {}

  public static final String SERVICE_NAME = "resourcemanager.ResourceManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile> getUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFile",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile> getUploadFileMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest, com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile> getUploadFileMethod;
    if ((getUploadFileMethod = ResourceManageGrpc.getUploadFileMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getUploadFileMethod = ResourceManageGrpc.getUploadFileMethod) == null) {
          ResourceManageGrpc.getUploadFileMethod = getUploadFileMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest, com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("UploadFile"))
              .build();
        }
      }
    }
    return getUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReUploadFile",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReUploadFileMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReUploadFileMethod;
    if ((getReUploadFileMethod = ResourceManageGrpc.getReUploadFileMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getReUploadFileMethod = ResourceManageGrpc.getReUploadFileMethod) == null) {
          ResourceManageGrpc.getReUploadFileMethod = getReUploadFileMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReUploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("ReUploadFile"))
              .build();
        }
      }
    }
    return getReUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadFile",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile, com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile> getDownloadFileMethod;
    if ((getDownloadFileMethod = ResourceManageGrpc.getDownloadFileMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getDownloadFileMethod = ResourceManageGrpc.getDownloadFileMethod) == null) {
          ResourceManageGrpc.getDownloadFileMethod = getDownloadFileMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile, com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("DownloadFile"))
              .build();
        }
      }
    }
    return getDownloadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile,
      com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource> getDescribeFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFile",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile,
      com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource> getDescribeFileMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile, com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource> getDescribeFileMethod;
    if ((getDescribeFileMethod = ResourceManageGrpc.getDescribeFileMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getDescribeFileMethod = ResourceManageGrpc.getDescribeFileMethod) == null) {
          ResourceManageGrpc.getDescribeFileMethod = getDescribeFileMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile, com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("DescribeFile"))
              .build();
        }
      }
    }
    return getDescribeFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources> getListResourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources, com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources> getListResourcesMethod;
    if ((getListResourcesMethod = ResourceManageGrpc.getListResourcesMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getListResourcesMethod = ResourceManageGrpc.getListResourcesMethod) == null) {
          ResourceManageGrpc.getListResourcesMethod = getListResourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources, com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("ListResources"))
              .build();
        }
      }
    }
    return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateResource",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateResourceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateResourceMethod;
    if ((getUpdateResourceMethod = ResourceManageGrpc.getUpdateResourceMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getUpdateResourceMethod = ResourceManageGrpc.getUpdateResourceMethod) == null) {
          ResourceManageGrpc.getUpdateResourceMethod = getUpdateResourceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("UpdateResource"))
              .build();
        }
      }
    }
    return getUpdateResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteResources",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteResourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteResourcesMethod;
    if ((getDeleteResourcesMethod = ResourceManageGrpc.getDeleteResourcesMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getDeleteResourcesMethod = ResourceManageGrpc.getDeleteResourcesMethod) == null) {
          ResourceManageGrpc.getDeleteResourcesMethod = getDeleteResourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("DeleteResources"))
              .build();
        }
      }
    }
    return getDeleteResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSpacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSpaces",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSpacesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSpacesMethod;
    if ((getDeleteSpacesMethod = ResourceManageGrpc.getDeleteSpacesMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getDeleteSpacesMethod = ResourceManageGrpc.getDeleteSpacesMethod) == null) {
          ResourceManageGrpc.getDeleteSpacesMethod = getDeleteSpacesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSpaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("DeleteSpaces"))
              .build();
        }
      }
    }
    return getDeleteSpacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRenameFlinkStatePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameFlinkStatePath",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRenameFlinkStatePathMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRenameFlinkStatePathMethod;
    if ((getRenameFlinkStatePathMethod = ResourceManageGrpc.getRenameFlinkStatePathMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getRenameFlinkStatePathMethod = ResourceManageGrpc.getRenameFlinkStatePathMethod) == null) {
          ResourceManageGrpc.getRenameFlinkStatePathMethod = getRenameFlinkStatePathMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameFlinkStatePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("RenameFlinkStatePath"))
              .build();
        }
      }
    }
    return getRenameFlinkStatePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkState",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkStateMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkStateMethod;
    if ((getDeleteFlinkStateMethod = ResourceManageGrpc.getDeleteFlinkStateMethod) == null) {
      synchronized (ResourceManageGrpc.class) {
        if ((getDeleteFlinkStateMethod = ResourceManageGrpc.getDeleteFlinkStateMethod) == null) {
          ResourceManageGrpc.getDeleteFlinkStateMethod = getDeleteFlinkStateMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceManageMethodDescriptorSupplier("DeleteFlinkState"))
              .build();
        }
      }
    }
    return getDeleteFlinkStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceManageStub>() {
        @java.lang.Override
        public ResourceManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceManageStub(channel, callOptions);
        }
      };
    return ResourceManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceManageBlockingStub>() {
        @java.lang.Override
        public ResourceManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceManageBlockingStub(channel, callOptions);
        }
      };
    return ResourceManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceManageFutureStub>() {
        @java.lang.Override
        public ResourceManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceManageFutureStub(channel, callOptions);
        }
      };
    return ResourceManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ResourceManageImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadFileMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest> reUploadFile(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getReUploadFileMethod(), responseObserver);
    }

    /**
     */
    public void downloadFile(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    /**
     */
    public void describeFile(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFileMethod(), responseObserver);
    }

    /**
     */
    public void listResources(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     */
    public void updateResource(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateResourceMethod(), responseObserver);
    }

    /**
     */
    public void deleteResources(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteResourcesMethod(), responseObserver);
    }

    /**
     */
    public void deleteSpaces(com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSpacesMethod(), responseObserver);
    }

    /**
     */
    public void renameFlinkStatePath(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameFlinkStatePathMethod(), responseObserver);
    }

    /**
     */
    public void deleteFlinkState(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getUploadFileMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            getReUploadFileMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RE_UPLOAD_FILE)))
          .addMethod(
            getDownloadFileMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile>(
                  this, METHODID_DOWNLOAD_FILE)))
          .addMethod(
            getDescribeFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile,
                com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource>(
                  this, METHODID_DESCRIBE_FILE)))
          .addMethod(
            getListResourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources>(
                  this, METHODID_LIST_RESOURCES)))
          .addMethod(
            getUpdateResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_RESOURCE)))
          .addMethod(
            getDeleteResourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_RESOURCES)))
          .addMethod(
            getDeleteSpacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_SPACES)))
          .addMethod(
            getRenameFlinkStatePathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RENAME_FLINK_STATE_PATH)))
          .addMethod(
            getDeleteFlinkStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class ResourceManageStub extends io.grpc.stub.AbstractAsyncStub<ResourceManageStub> {
    private ResourceManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceManageStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ReUploadFileRequest> reUploadFile(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getReUploadFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void downloadFile(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFile(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listResources(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateResource(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteResources(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSpaces(com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSpacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameFlinkStatePath(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameFlinkStatePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlinkState(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResourceManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceManageBlockingStub> {
    private ResourceManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile> downloadFile(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource describeFile(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources listResources(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateResource(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteResources(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteResourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteSpaces(com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSpacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct renameFlinkStatePath(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameFlinkStatePathMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFlinkState(com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResourceManageFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceManageFutureStub> {
    private ResourceManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource> describeFile(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources> listResources(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateResource(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteResources(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteResourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteSpaces(
        com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSpacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> renameFlinkStatePath(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameFlinkStatePathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFlinkState(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlinkStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DOWNLOAD_FILE = 0;
  private static final int METHODID_DESCRIBE_FILE = 1;
  private static final int METHODID_LIST_RESOURCES = 2;
  private static final int METHODID_UPDATE_RESOURCE = 3;
  private static final int METHODID_DELETE_RESOURCES = 4;
  private static final int METHODID_DELETE_SPACES = 5;
  private static final int METHODID_RENAME_FLINK_STATE_PATH = 6;
  private static final int METHODID_DELETE_FLINK_STATE = 7;
  private static final int METHODID_UPLOAD_FILE = 8;
  private static final int METHODID_RE_UPLOAD_FILE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DownloadFile) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.DownloadFile>) responseObserver);
          break;
        case METHODID_DESCRIBE_FILE:
          serviceImpl.describeFile((com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DescribeFile) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelResource.Resource>) responseObserver);
          break;
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.ListResources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.ListResources>) responseObserver);
          break;
        case METHODID_UPDATE_RESOURCE:
          serviceImpl.updateResource((com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.UpdateResource) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_RESOURCES:
          serviceImpl.deleteResources((com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteResources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_SPACES:
          serviceImpl.deleteSpaces((com.dataomnis.gproto.types.pbrequest.PBRequestWorkspaceManage.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RENAME_FLINK_STATE_PATH:
          serviceImpl.renameFlinkStatePath((com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.RenameFlinkStatePath) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_STATE:
          serviceImpl.deleteFlinkState((com.dataomnis.gproto.types.pbrequest.PBRequestResourceManage.DeleteFlinkState) request,
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
        case METHODID_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadFile(
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceManage.UploadFile>) responseObserver);
        case METHODID_RE_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reUploadFile(
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ResourceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcresource.PBSvcResourceManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceManage");
    }
  }

  private static final class ResourceManageFileDescriptorSupplier
      extends ResourceManageBaseDescriptorSupplier {
    ResourceManageFileDescriptorSupplier() {}
  }

  private static final class ResourceManageMethodDescriptorSupplier
      extends ResourceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceManageFileDescriptorSupplier())
              .addMethod(getUploadFileMethod())
              .addMethod(getReUploadFileMethod())
              .addMethod(getDownloadFileMethod())
              .addMethod(getDescribeFileMethod())
              .addMethod(getListResourcesMethod())
              .addMethod(getUpdateResourceMethod())
              .addMethod(getDeleteResourcesMethod())
              .addMethod(getDeleteSpacesMethod())
              .addMethod(getRenameFlinkStatePathMethod())
              .addMethod(getDeleteFlinkStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
