package com.github.dataomnis.respb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/resource.proto")
public final class ResourceGrpc {

  private ResourceGrpc() {}

  public static final String SERVICE_NAME = "resource.Resource";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.respb.Respb.ReUploadFileRequest,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getReUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReUploadFile",
      requestType = com.github.dataomnis.respb.Respb.ReUploadFileRequest.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.respb.Respb.ReUploadFileRequest,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getReUploadFileMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.respb.Respb.ReUploadFileRequest, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getReUploadFileMethod;
    if ((getReUploadFileMethod = ResourceGrpc.getReUploadFileMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getReUploadFileMethod = ResourceGrpc.getReUploadFileMethod) == null) {
          ResourceGrpc.getReUploadFileMethod = getReUploadFileMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.respb.Respb.ReUploadFileRequest, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReUploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.respb.Respb.ReUploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("ReUploadFile"))
              .build();
        }
      }
    }
    return getReUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.respb.Respb.UploadFileRequest,
      com.github.dataomnis.responsepb.ResponsePB.UploadFile> getUploadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadFile",
      requestType = com.github.dataomnis.respb.Respb.UploadFileRequest.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.UploadFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.respb.Respb.UploadFileRequest,
      com.github.dataomnis.responsepb.ResponsePB.UploadFile> getUploadFileMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.respb.Respb.UploadFileRequest, com.github.dataomnis.responsepb.ResponsePB.UploadFile> getUploadFileMethod;
    if ((getUploadFileMethod = ResourceGrpc.getUploadFileMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getUploadFileMethod = ResourceGrpc.getUploadFileMethod) == null) {
          ResourceGrpc.getUploadFileMethod = getUploadFileMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.respb.Respb.UploadFileRequest, com.github.dataomnis.responsepb.ResponsePB.UploadFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.respb.Respb.UploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.UploadFile.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("UploadFile"))
              .build();
        }
      }
    }
    return getUploadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DownloadFile,
      com.github.dataomnis.responsepb.ResponsePB.DownloadFile> getDownloadFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadFile",
      requestType = com.github.dataomnis.requestpb.RequestPB.DownloadFile.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DownloadFile.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DownloadFile,
      com.github.dataomnis.responsepb.ResponsePB.DownloadFile> getDownloadFileMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DownloadFile, com.github.dataomnis.responsepb.ResponsePB.DownloadFile> getDownloadFileMethod;
    if ((getDownloadFileMethod = ResourceGrpc.getDownloadFileMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getDownloadFileMethod = ResourceGrpc.getDownloadFileMethod) == null) {
          ResourceGrpc.getDownloadFileMethod = getDownloadFileMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DownloadFile, com.github.dataomnis.responsepb.ResponsePB.DownloadFile>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DownloadFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DownloadFile.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("DownloadFile"))
              .build();
        }
      }
    }
    return getDownloadFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFile,
      com.github.dataomnis.modelpb.ModelPB.Resource> getDescribeFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFile",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeFile.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.Resource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFile,
      com.github.dataomnis.modelpb.ModelPB.Resource> getDescribeFileMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFile, com.github.dataomnis.modelpb.ModelPB.Resource> getDescribeFileMethod;
    if ((getDescribeFileMethod = ResourceGrpc.getDescribeFileMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getDescribeFileMethod = ResourceGrpc.getDescribeFileMethod) == null) {
          ResourceGrpc.getDescribeFileMethod = getDescribeFileMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeFile, com.github.dataomnis.modelpb.ModelPB.Resource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeFile.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.Resource.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("DescribeFile"))
              .build();
        }
      }
    }
    return getDescribeFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListResources,
      com.github.dataomnis.responsepb.ResponsePB.ListResources> getListResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListResources",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListResources.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListResources.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListResources,
      com.github.dataomnis.responsepb.ResponsePB.ListResources> getListResourcesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListResources, com.github.dataomnis.responsepb.ResponsePB.ListResources> getListResourcesMethod;
    if ((getListResourcesMethod = ResourceGrpc.getListResourcesMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getListResourcesMethod = ResourceGrpc.getListResourcesMethod) == null) {
          ResourceGrpc.getListResourcesMethod = getListResourcesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListResources, com.github.dataomnis.responsepb.ResponsePB.ListResources>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListResources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListResources.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("ListResources"))
              .build();
        }
      }
    }
    return getListResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateResource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateResourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateResource",
      requestType = com.github.dataomnis.requestpb.RequestPB.UpdateResource.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateResource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateResourceMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateResource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateResourceMethod;
    if ((getUpdateResourceMethod = ResourceGrpc.getUpdateResourceMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getUpdateResourceMethod = ResourceGrpc.getUpdateResourceMethod) == null) {
          ResourceGrpc.getUpdateResourceMethod = getUpdateResourceMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UpdateResource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateResource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UpdateResource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("UpdateResource"))
              .build();
        }
      }
    }
    return getUpdateResourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteResources,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteResourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteResources",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteResources.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteResources,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteResourcesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteResources, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteResourcesMethod;
    if ((getDeleteResourcesMethod = ResourceGrpc.getDeleteResourcesMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getDeleteResourcesMethod = ResourceGrpc.getDeleteResourcesMethod) == null) {
          ResourceGrpc.getDeleteResourcesMethod = getDeleteResourcesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteResources, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteResources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteResources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("DeleteResources"))
              .build();
        }
      }
    }
    return getDeleteResourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteSpacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSpaces",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteSpacesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteSpacesMethod;
    if ((getDeleteSpacesMethod = ResourceGrpc.getDeleteSpacesMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getDeleteSpacesMethod = ResourceGrpc.getDeleteSpacesMethod) == null) {
          ResourceGrpc.getDeleteSpacesMethod = getDeleteSpacesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSpaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("DeleteSpaces"))
              .build();
        }
      }
    }
    return getDeleteSpacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getRenameFlinkStatePathMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenameFlinkStatePath",
      requestType = com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getRenameFlinkStatePathMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getRenameFlinkStatePathMethod;
    if ((getRenameFlinkStatePathMethod = ResourceGrpc.getRenameFlinkStatePathMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getRenameFlinkStatePathMethod = ResourceGrpc.getRenameFlinkStatePathMethod) == null) {
          ResourceGrpc.getRenameFlinkStatePathMethod = getRenameFlinkStatePathMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenameFlinkStatePath"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("RenameFlinkStatePath"))
              .build();
        }
      }
    }
    return getRenameFlinkStatePathMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteFlinkStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkState",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteFlinkStateMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteFlinkStateMethod;
    if ((getDeleteFlinkStateMethod = ResourceGrpc.getDeleteFlinkStateMethod) == null) {
      synchronized (ResourceGrpc.class) {
        if ((getDeleteFlinkStateMethod = ResourceGrpc.getDeleteFlinkStateMethod) == null) {
          ResourceGrpc.getDeleteFlinkStateMethod = getDeleteFlinkStateMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMethodDescriptorSupplier("DeleteFlinkState"))
              .build();
        }
      }
    }
    return getDeleteFlinkStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceStub>() {
        @java.lang.Override
        public ResourceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceStub(channel, callOptions);
        }
      };
    return ResourceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceBlockingStub>() {
        @java.lang.Override
        public ResourceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceBlockingStub(channel, callOptions);
        }
      };
    return ResourceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceFutureStub>() {
        @java.lang.Override
        public ResourceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceFutureStub(channel, callOptions);
        }
      };
    return ResourceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ResourceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.dataomnis.respb.Respb.ReUploadFileRequest> reUploadFile(
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getReUploadFileMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.dataomnis.respb.Respb.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.UploadFile> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getUploadFileMethod(), responseObserver);
    }

    /**
     */
    public void downloadFile(com.github.dataomnis.requestpb.RequestPB.DownloadFile request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DownloadFile> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadFileMethod(), responseObserver);
    }

    /**
     */
    public void describeFile(com.github.dataomnis.requestpb.RequestPB.DescribeFile request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.Resource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFileMethod(), responseObserver);
    }

    /**
     */
    public void listResources(com.github.dataomnis.requestpb.RequestPB.ListResources request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListResources> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListResourcesMethod(), responseObserver);
    }

    /**
     */
    public void updateResource(com.github.dataomnis.requestpb.RequestPB.UpdateResource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateResourceMethod(), responseObserver);
    }

    /**
     */
    public void deleteResources(com.github.dataomnis.requestpb.RequestPB.DeleteResources request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteResourcesMethod(), responseObserver);
    }

    /**
     */
    public void deleteSpaces(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSpacesMethod(), responseObserver);
    }

    /**
     */
    public void renameFlinkStatePath(com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenameFlinkStatePathMethod(), responseObserver);
    }

    /**
     */
    public void deleteFlinkState(com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReUploadFileMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.github.dataomnis.respb.Respb.ReUploadFileRequest,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_RE_UPLOAD_FILE)))
          .addMethod(
            getUploadFileMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.github.dataomnis.respb.Respb.UploadFileRequest,
                com.github.dataomnis.responsepb.ResponsePB.UploadFile>(
                  this, METHODID_UPLOAD_FILE)))
          .addMethod(
            getDownloadFileMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DownloadFile,
                com.github.dataomnis.responsepb.ResponsePB.DownloadFile>(
                  this, METHODID_DOWNLOAD_FILE)))
          .addMethod(
            getDescribeFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeFile,
                com.github.dataomnis.modelpb.ModelPB.Resource>(
                  this, METHODID_DESCRIBE_FILE)))
          .addMethod(
            getListResourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListResources,
                com.github.dataomnis.responsepb.ResponsePB.ListResources>(
                  this, METHODID_LIST_RESOURCES)))
          .addMethod(
            getUpdateResourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UpdateResource,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_RESOURCE)))
          .addMethod(
            getDeleteResourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteResources,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_RESOURCES)))
          .addMethod(
            getDeleteSpacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_SPACES)))
          .addMethod(
            getRenameFlinkStatePathMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_RENAME_FLINK_STATE_PATH)))
          .addMethod(
            getDeleteFlinkStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class ResourceStub extends io.grpc.stub.AbstractAsyncStub<ResourceStub> {
    private ResourceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.dataomnis.respb.Respb.ReUploadFileRequest> reUploadFile(
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getReUploadFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.github.dataomnis.respb.Respb.UploadFileRequest> uploadFile(
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.UploadFile> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getUploadFileMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void downloadFile(com.github.dataomnis.requestpb.RequestPB.DownloadFile request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DownloadFile> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDownloadFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFile(com.github.dataomnis.requestpb.RequestPB.DescribeFile request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.Resource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listResources(com.github.dataomnis.requestpb.RequestPB.ListResources request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListResources> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateResource(com.github.dataomnis.requestpb.RequestPB.UpdateResource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateResourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteResources(com.github.dataomnis.requestpb.RequestPB.DeleteResources request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteResourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSpaces(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSpacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renameFlinkStatePath(com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenameFlinkStatePathMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlinkState(com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ResourceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceBlockingStub> {
    private ResourceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.github.dataomnis.responsepb.ResponsePB.DownloadFile> downloadFile(
        com.github.dataomnis.requestpb.RequestPB.DownloadFile request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDownloadFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.Resource describeFile(com.github.dataomnis.requestpb.RequestPB.DescribeFile request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListResources listResources(com.github.dataomnis.requestpb.RequestPB.ListResources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListResourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct updateResource(com.github.dataomnis.requestpb.RequestPB.UpdateResource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateResourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteResources(com.github.dataomnis.requestpb.RequestPB.DeleteResources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteResourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteSpaces(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSpacesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct renameFlinkStatePath(com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenameFlinkStatePathMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteFlinkState(com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ResourceFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceFutureStub> {
    private ResourceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.Resource> describeFile(
        com.github.dataomnis.requestpb.RequestPB.DescribeFile request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListResources> listResources(
        com.github.dataomnis.requestpb.RequestPB.ListResources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListResourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> updateResource(
        com.github.dataomnis.requestpb.RequestPB.UpdateResource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateResourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteResources(
        com.github.dataomnis.requestpb.RequestPB.DeleteResources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteResourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteSpaces(
        com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSpacesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> renameFlinkStatePath(
        com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenameFlinkStatePathMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteFlinkState(
        com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState request) {
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
  private static final int METHODID_RE_UPLOAD_FILE = 8;
  private static final int METHODID_UPLOAD_FILE = 9;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DOWNLOAD_FILE:
          serviceImpl.downloadFile((com.github.dataomnis.requestpb.RequestPB.DownloadFile) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DownloadFile>) responseObserver);
          break;
        case METHODID_DESCRIBE_FILE:
          serviceImpl.describeFile((com.github.dataomnis.requestpb.RequestPB.DescribeFile) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.Resource>) responseObserver);
          break;
        case METHODID_LIST_RESOURCES:
          serviceImpl.listResources((com.github.dataomnis.requestpb.RequestPB.ListResources) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListResources>) responseObserver);
          break;
        case METHODID_UPDATE_RESOURCE:
          serviceImpl.updateResource((com.github.dataomnis.requestpb.RequestPB.UpdateResource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_RESOURCES:
          serviceImpl.deleteResources((com.github.dataomnis.requestpb.RequestPB.DeleteResources) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_SPACES:
          serviceImpl.deleteSpaces((com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_RENAME_FLINK_STATE_PATH:
          serviceImpl.renameFlinkStatePath((com.github.dataomnis.requestpb.RequestPB.RenameFlinkStatePath) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_STATE:
          serviceImpl.deleteFlinkState((com.github.dataomnis.requestpb.RequestPB.DeleteFlinkState) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
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
        case METHODID_RE_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.reUploadFile(
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
        case METHODID_UPLOAD_FILE:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.uploadFile(
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.UploadFile>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.dataomnis.respb.Respb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Resource");
    }
  }

  private static final class ResourceFileDescriptorSupplier
      extends ResourceBaseDescriptorSupplier {
    ResourceFileDescriptorSupplier() {}
  }

  private static final class ResourceMethodDescriptorSupplier
      extends ResourceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceFileDescriptorSupplier())
              .addMethod(getReUploadFileMethod())
              .addMethod(getUploadFileMethod())
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
