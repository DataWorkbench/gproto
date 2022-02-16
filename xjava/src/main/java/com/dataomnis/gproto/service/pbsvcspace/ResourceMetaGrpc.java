package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ResourceMeta for manage metadata of file(resource)
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/spacemanager/resource_meta.proto")
public final class ResourceMetaGrpc {

  private ResourceMetaGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.ResourceMeta";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare> getCreateFilePrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFilePrepare",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare> getCreateFilePrepareMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare> getCreateFilePrepareMethod;
    if ((getCreateFilePrepareMethod = ResourceMetaGrpc.getCreateFilePrepareMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getCreateFilePrepareMethod = ResourceMetaGrpc.getCreateFilePrepareMethod) == null) {
          ResourceMetaGrpc.getCreateFilePrepareMethod = getCreateFilePrepareMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFilePrepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("CreateFilePrepare"))
              .build();
        }
      }
    }
    return getCreateFilePrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFileMetaMethod;
    if ((getCreateFileMetaMethod = ResourceMetaGrpc.getCreateFileMetaMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getCreateFileMetaMethod = ResourceMetaGrpc.getCreateFileMetaMethod) == null) {
          ResourceMetaGrpc.getCreateFileMetaMethod = getCreateFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("CreateFileMeta"))
              .build();
        }
      }
    }
    return getCreateFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare> getReCreateFilePrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReCreateFilePrepare",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare> getReCreateFilePrepareMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare> getReCreateFilePrepareMethod;
    if ((getReCreateFilePrepareMethod = ResourceMetaGrpc.getReCreateFilePrepareMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getReCreateFilePrepareMethod = ResourceMetaGrpc.getReCreateFilePrepareMethod) == null) {
          ResourceMetaGrpc.getReCreateFilePrepareMethod = getReCreateFilePrepareMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReCreateFilePrepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("ReCreateFilePrepare"))
              .build();
        }
      }
    }
    return getReCreateFilePrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReCreateFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReCreateFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReCreateFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReCreateFileMetaMethod;
    if ((getReCreateFileMetaMethod = ResourceMetaGrpc.getReCreateFileMetaMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getReCreateFileMetaMethod = ResourceMetaGrpc.getReCreateFileMetaMethod) == null) {
          ResourceMetaGrpc.getReCreateFileMetaMethod = getReCreateFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReCreateFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("ReCreateFileMeta"))
              .build();
        }
      }
    }
    return getReCreateFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta> getDescribeFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta> getDescribeFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta> getDescribeFileMetaMethod;
    if ((getDescribeFileMetaMethod = ResourceMetaGrpc.getDescribeFileMetaMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getDescribeFileMetaMethod = ResourceMetaGrpc.getDescribeFileMetaMethod) == null) {
          ResourceMetaGrpc.getDescribeFileMetaMethod = getDescribeFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("DescribeFileMeta"))
              .build();
        }
      }
    }
    return getDescribeFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFileMetaMethod;
    if ((getUpdateFileMetaMethod = ResourceMetaGrpc.getUpdateFileMetaMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getUpdateFileMetaMethod = ResourceMetaGrpc.getUpdateFileMetaMethod) == null) {
          ResourceMetaGrpc.getUpdateFileMetaMethod = getUpdateFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("UpdateFileMeta"))
              .build();
        }
      }
    }
    return getUpdateFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas> getListFileMetasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFileMetas",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas> getListFileMetasMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas> getListFileMetasMethod;
    if ((getListFileMetasMethod = ResourceMetaGrpc.getListFileMetasMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getListFileMetasMethod = ResourceMetaGrpc.getListFileMetasMethod) == null) {
          ResourceMetaGrpc.getListFileMetasMethod = getListFileMetasMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas, com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFileMetas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("ListFileMetas"))
              .build();
        }
      }
    }
    return getListFileMetasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileMetasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileMetas",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileMetasMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileMetasMethod;
    if ((getDeleteFileMetasMethod = ResourceMetaGrpc.getDeleteFileMetasMethod) == null) {
      synchronized (ResourceMetaGrpc.class) {
        if ((getDeleteFileMetasMethod = ResourceMetaGrpc.getDeleteFileMetasMethod) == null) {
          ResourceMetaGrpc.getDeleteFileMetasMethod = getDeleteFileMetasMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileMetas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceMetaMethodDescriptorSupplier("DeleteFileMetas"))
              .build();
        }
      }
    }
    return getDeleteFileMetasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceMetaStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceMetaStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceMetaStub>() {
        @java.lang.Override
        public ResourceMetaStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceMetaStub(channel, callOptions);
        }
      };
    return ResourceMetaStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceMetaBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceMetaBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceMetaBlockingStub>() {
        @java.lang.Override
        public ResourceMetaBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceMetaBlockingStub(channel, callOptions);
        }
      };
    return ResourceMetaBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceMetaFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceMetaFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceMetaFutureStub>() {
        @java.lang.Override
        public ResourceMetaFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceMetaFutureStub(channel, callOptions);
        }
      };
    return ResourceMetaFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ResourceMeta for manage metadata of file(resource)
   * </pre>
   */
  public static abstract class ResourceMetaImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public void createFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFilePrepareMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public void createFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFileMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public void reCreateFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReCreateFilePrepareMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public void reCreateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReCreateFileMetaMethod(), responseObserver);
    }

    /**
     */
    public void describeFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFileMetaMethod(), responseObserver);
    }

    /**
     */
    public void updateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFileMetaMethod(), responseObserver);
    }

    /**
     */
    public void listFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFileMetasMethod(), responseObserver);
    }

    /**
     */
    public void deleteFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileMetasMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateFilePrepareMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare>(
                  this, METHODID_CREATE_FILE_PREPARE)))
          .addMethod(
            getCreateFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_FILE_META)))
          .addMethod(
            getReCreateFilePrepareMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare>(
                  this, METHODID_RE_CREATE_FILE_PREPARE)))
          .addMethod(
            getReCreateFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RE_CREATE_FILE_META)))
          .addMethod(
            getDescribeFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta>(
                  this, METHODID_DESCRIBE_FILE_META)))
          .addMethod(
            getUpdateFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_FILE_META)))
          .addMethod(
            getListFileMetasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas>(
                  this, METHODID_LIST_FILE_METAS)))
          .addMethod(
            getDeleteFileMetasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FILE_METAS)))
          .build();
    }
  }

  /**
   * <pre>
   * ResourceMeta for manage metadata of file(resource)
   * </pre>
   */
  public static final class ResourceMetaStub extends io.grpc.stub.AbstractAsyncStub<ResourceMetaStub> {
    private ResourceMetaStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceMetaStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceMetaStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public void createFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFilePrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public void createFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public void reCreateFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReCreateFilePrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public void reCreateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReCreateFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFileMetasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileMetasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ResourceMeta for manage metadata of file(resource)
   * </pre>
   */
  public static final class ResourceMetaBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceMetaBlockingStub> {
    private ResourceMetaBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceMetaBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceMetaBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare createFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFilePrepareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFileMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare reCreateFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReCreateFilePrepareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct reCreateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReCreateFileMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta describeFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFileMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFileMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas listFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFileMetasMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileMetasMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ResourceMeta for manage metadata of file(resource)
   * </pre>
   */
  public static final class ResourceMetaFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceMetaFutureStub> {
    private ResourceMetaFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceMetaFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceMetaFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare> createFilePrepare(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFilePrepareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFileMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare> reCreateFilePrepare(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReCreateFilePrepareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> reCreateFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReCreateFileMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta> describeFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFileMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFileMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas> listFileMetas(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFileMetasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFileMetas(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileMetasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FILE_PREPARE = 0;
  private static final int METHODID_CREATE_FILE_META = 1;
  private static final int METHODID_RE_CREATE_FILE_PREPARE = 2;
  private static final int METHODID_RE_CREATE_FILE_META = 3;
  private static final int METHODID_DESCRIBE_FILE_META = 4;
  private static final int METHODID_UPDATE_FILE_META = 5;
  private static final int METHODID_LIST_FILE_METAS = 6;
  private static final int METHODID_DELETE_FILE_METAS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceMetaImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceMetaImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FILE_PREPARE:
          serviceImpl.createFilePrepare((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFilePrepare) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.CreateFilePrepare>) responseObserver);
          break;
        case METHODID_CREATE_FILE_META:
          serviceImpl.createFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.CreateFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RE_CREATE_FILE_PREPARE:
          serviceImpl.reCreateFilePrepare((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFilePrepare) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ReCreateFilePrepare>) responseObserver);
          break;
        case METHODID_RE_CREATE_FILE_META:
          serviceImpl.reCreateFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ReCreateFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_FILE_META:
          serviceImpl.describeFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DescribeFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.DescribeFileMeta>) responseObserver);
          break;
        case METHODID_UPDATE_FILE_META:
          serviceImpl.updateFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.UpdateFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_FILE_METAS:
          serviceImpl.listFileMetas((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.ListFileMetas) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceMeta.ListFileMetas>) responseObserver);
          break;
        case METHODID_DELETE_FILE_METAS:
          serviceImpl.deleteFileMetas((com.dataomnis.gproto.types.pbrequest.PBRequestResourceMeta.DeleteFileMetas) request,
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

  private static abstract class ResourceMetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceMetaBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcResourceMeta.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceMeta");
    }
  }

  private static final class ResourceMetaFileDescriptorSupplier
      extends ResourceMetaBaseDescriptorSupplier {
    ResourceMetaFileDescriptorSupplier() {}
  }

  private static final class ResourceMetaMethodDescriptorSupplier
      extends ResourceMetaBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceMetaMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceMetaGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceMetaFileDescriptorSupplier())
              .addMethod(getCreateFilePrepareMethod())
              .addMethod(getCreateFileMetaMethod())
              .addMethod(getReCreateFilePrepareMethod())
              .addMethod(getReCreateFileMetaMethod())
              .addMethod(getDescribeFileMetaMethod())
              .addMethod(getUpdateFileMetaMethod())
              .addMethod(getListFileMetasMethod())
              .addMethod(getDeleteFileMetasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
