package com.dataomnis.gproto.service.pbsvcresource;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * ResourceData for manage file content.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/resourcemanager/resource_data.proto")
public final class ResourceDataGrpc {

  private ResourceDataGrpc() {}

  public static final String SERVICE_NAME = "resourcemanager.ResourceData";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData> getWriteFileDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteFileData",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData> getWriteFileDataMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData, com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData> getWriteFileDataMethod;
    if ((getWriteFileDataMethod = ResourceDataGrpc.getWriteFileDataMethod) == null) {
      synchronized (ResourceDataGrpc.class) {
        if ((getWriteFileDataMethod = ResourceDataGrpc.getWriteFileDataMethod) == null) {
          ResourceDataGrpc.getWriteFileDataMethod = getWriteFileDataMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData, com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteFileData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceDataMethodDescriptorSupplier("WriteFileData"))
              .build();
        }
      }
    }
    return getWriteFileDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData> getReadFileDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReadFileData",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData,
      com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData> getReadFileDataMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData, com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData> getReadFileDataMethod;
    if ((getReadFileDataMethod = ResourceDataGrpc.getReadFileDataMethod) == null) {
      synchronized (ResourceDataGrpc.class) {
        if ((getReadFileDataMethod = ResourceDataGrpc.getReadFileDataMethod) == null) {
          ResourceDataGrpc.getReadFileDataMethod = getReadFileDataMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData, com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadFileData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceDataMethodDescriptorSupplier("ReadFileData"))
              .build();
        }
      }
    }
    return getReadFileDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileData",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataMethod;
    if ((getDeleteFileDataMethod = ResourceDataGrpc.getDeleteFileDataMethod) == null) {
      synchronized (ResourceDataGrpc.class) {
        if ((getDeleteFileDataMethod = ResourceDataGrpc.getDeleteFileDataMethod) == null) {
          ResourceDataGrpc.getDeleteFileDataMethod = getDeleteFileDataMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceDataMethodDescriptorSupplier("DeleteFileData"))
              .build();
        }
      }
    }
    return getDeleteFileDataMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataByFileIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileDataByFileIds",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataByFileIdsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataByFileIdsMethod;
    if ((getDeleteFileDataByFileIdsMethod = ResourceDataGrpc.getDeleteFileDataByFileIdsMethod) == null) {
      synchronized (ResourceDataGrpc.class) {
        if ((getDeleteFileDataByFileIdsMethod = ResourceDataGrpc.getDeleteFileDataByFileIdsMethod) == null) {
          ResourceDataGrpc.getDeleteFileDataByFileIdsMethod = getDeleteFileDataByFileIdsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileDataByFileIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceDataMethodDescriptorSupplier("DeleteFileDataByFileIds"))
              .build();
        }
      }
    }
    return getDeleteFileDataByFileIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataBySpaceIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileDataBySpaceIds",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataBySpaceIdsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileDataBySpaceIdsMethod;
    if ((getDeleteFileDataBySpaceIdsMethod = ResourceDataGrpc.getDeleteFileDataBySpaceIdsMethod) == null) {
      synchronized (ResourceDataGrpc.class) {
        if ((getDeleteFileDataBySpaceIdsMethod = ResourceDataGrpc.getDeleteFileDataBySpaceIdsMethod) == null) {
          ResourceDataGrpc.getDeleteFileDataBySpaceIdsMethod = getDeleteFileDataBySpaceIdsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileDataBySpaceIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ResourceDataMethodDescriptorSupplier("DeleteFileDataBySpaceIds"))
              .build();
        }
      }
    }
    return getDeleteFileDataBySpaceIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ResourceDataStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceDataStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceDataStub>() {
        @java.lang.Override
        public ResourceDataStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceDataStub(channel, callOptions);
        }
      };
    return ResourceDataStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ResourceDataBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceDataBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceDataBlockingStub>() {
        @java.lang.Override
        public ResourceDataBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceDataBlockingStub(channel, callOptions);
        }
      };
    return ResourceDataBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ResourceDataFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ResourceDataFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ResourceDataFutureStub>() {
        @java.lang.Override
        public ResourceDataFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ResourceDataFutureStub(channel, callOptions);
        }
      };
    return ResourceDataFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * ResourceData for manage file content.
   * </pre>
   */
  public static abstract class ResourceDataImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * WriteFileData used for create a new file.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData> writeFileData(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getWriteFileDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReadFileData used to read data for giving file.
     * </pre>
     */
    public void readFileData(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReadFileDataMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteFileData used to delete a giving file.
     * </pre>
     */
    public void deleteFileData(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileDataMethod(), responseObserver);
    }

    /**
     */
    public void deleteFileDataByFileIds(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileDataByFileIdsMethod(), responseObserver);
    }

    /**
     */
    public void deleteFileDataBySpaceIds(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileDataBySpaceIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteFileDataMethod(),
            io.grpc.stub.ServerCalls.asyncClientStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData>(
                  this, METHODID_WRITE_FILE_DATA)))
          .addMethod(
            getReadFileDataMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData,
                com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData>(
                  this, METHODID_READ_FILE_DATA)))
          .addMethod(
            getDeleteFileDataMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FILE_DATA)))
          .addMethod(
            getDeleteFileDataByFileIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FILE_DATA_BY_FILE_IDS)))
          .addMethod(
            getDeleteFileDataBySpaceIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FILE_DATA_BY_SPACE_IDS)))
          .build();
    }
  }

  /**
   * <pre>
   * ResourceData for manage file content.
   * </pre>
   */
  public static final class ResourceDataStub extends io.grpc.stub.AbstractAsyncStub<ResourceDataStub> {
    private ResourceDataStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceDataStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceDataStub(channel, callOptions);
    }

    /**
     * <pre>
     * WriteFileData used for create a new file.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData> writeFileData(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getWriteFileDataMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * ReadFileData used to read data for giving file.
     * </pre>
     */
    public void readFileData(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getReadFileDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteFileData used to delete a giving file.
     * </pre>
     */
    public void deleteFileData(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileDataMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFileDataByFileIds(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileDataByFileIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFileDataBySpaceIds(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileDataBySpaceIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * ResourceData for manage file content.
   * </pre>
   */
  public static final class ResourceDataBlockingStub extends io.grpc.stub.AbstractBlockingStub<ResourceDataBlockingStub> {
    private ResourceDataBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceDataBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceDataBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ReadFileData used to read data for giving file.
     * </pre>
     */
    public java.util.Iterator<com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData> readFileData(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getReadFileDataMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteFileData used to delete a giving file.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFileData(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileDataMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFileDataByFileIds(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileDataByFileIdsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFileDataBySpaceIds(com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileDataBySpaceIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * ResourceData for manage file content.
   * </pre>
   */
  public static final class ResourceDataFutureStub extends io.grpc.stub.AbstractFutureStub<ResourceDataFutureStub> {
    private ResourceDataFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ResourceDataFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ResourceDataFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteFileData used to delete a giving file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFileData(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileDataMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFileDataByFileIds(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileDataByFileIdsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFileDataBySpaceIds(
        com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileDataBySpaceIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ_FILE_DATA = 0;
  private static final int METHODID_DELETE_FILE_DATA = 1;
  private static final int METHODID_DELETE_FILE_DATA_BY_FILE_IDS = 2;
  private static final int METHODID_DELETE_FILE_DATA_BY_SPACE_IDS = 3;
  private static final int METHODID_WRITE_FILE_DATA = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ResourceDataImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ResourceDataImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ_FILE_DATA:
          serviceImpl.readFileData((com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData>) responseObserver);
          break;
        case METHODID_DELETE_FILE_DATA:
          serviceImpl.deleteFileData((com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FILE_DATA_BY_FILE_IDS:
          serviceImpl.deleteFileDataByFileIds((com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FILE_DATA_BY_SPACE_IDS:
          serviceImpl.deleteFileDataBySpaceIds((com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds) request,
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
        case METHODID_WRITE_FILE_DATA:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.writeFileData(
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ResourceDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ResourceDataBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcresource.PBSvcResourceData.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ResourceData");
    }
  }

  private static final class ResourceDataFileDescriptorSupplier
      extends ResourceDataBaseDescriptorSupplier {
    ResourceDataFileDescriptorSupplier() {}
  }

  private static final class ResourceDataMethodDescriptorSupplier
      extends ResourceDataBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ResourceDataMethodDescriptorSupplier(String methodName) {
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
      synchronized (ResourceDataGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ResourceDataFileDescriptorSupplier())
              .addMethod(getWriteFileDataMethod())
              .addMethod(getReadFileDataMethod())
              .addMethod(getDeleteFileDataMethod())
              .addMethod(getDeleteFileDataByFileIdsMethod())
              .addMethod(getDeleteFileDataBySpaceIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
