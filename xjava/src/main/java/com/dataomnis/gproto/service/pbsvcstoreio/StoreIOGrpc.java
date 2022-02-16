package com.dataomnis.gproto.service.pbsvcstoreio;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * StoreIO for read/write file data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/resourcemanager/store_io.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StoreIOGrpc {

  private StoreIOGrpc() {}

  public static final String SERVICE_NAME = "resourcemanager.StoreIO";

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
    if ((getWriteFileDataMethod = StoreIOGrpc.getWriteFileDataMethod) == null) {
      synchronized (StoreIOGrpc.class) {
        if ((getWriteFileDataMethod = StoreIOGrpc.getWriteFileDataMethod) == null) {
          StoreIOGrpc.getWriteFileDataMethod = getWriteFileDataMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData, com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteFileData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.WriteFileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.WriteFileData.getDefaultInstance()))
              .setSchemaDescriptor(new StoreIOMethodDescriptorSupplier("WriteFileData"))
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
    if ((getReadFileDataMethod = StoreIOGrpc.getReadFileDataMethod) == null) {
      synchronized (StoreIOGrpc.class) {
        if ((getReadFileDataMethod = StoreIOGrpc.getReadFileDataMethod) == null) {
          StoreIOGrpc.getReadFileDataMethod = getReadFileDataMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData, com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReadFileData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.ReadFileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseResourceData.ReadFileData.getDefaultInstance()))
              .setSchemaDescriptor(new StoreIOMethodDescriptorSupplier("ReadFileData"))
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
    if ((getDeleteFileDataMethod = StoreIOGrpc.getDeleteFileDataMethod) == null) {
      synchronized (StoreIOGrpc.class) {
        if ((getDeleteFileDataMethod = StoreIOGrpc.getDeleteFileDataMethod) == null) {
          StoreIOGrpc.getDeleteFileDataMethod = getDeleteFileDataMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileData"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileData.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StoreIOMethodDescriptorSupplier("DeleteFileData"))
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
    if ((getDeleteFileDataByFileIdsMethod = StoreIOGrpc.getDeleteFileDataByFileIdsMethod) == null) {
      synchronized (StoreIOGrpc.class) {
        if ((getDeleteFileDataByFileIdsMethod = StoreIOGrpc.getDeleteFileDataByFileIdsMethod) == null) {
          StoreIOGrpc.getDeleteFileDataByFileIdsMethod = getDeleteFileDataByFileIdsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileDataByFileIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataByFileIds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StoreIOMethodDescriptorSupplier("DeleteFileDataByFileIds"))
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
    if ((getDeleteFileDataBySpaceIdsMethod = StoreIOGrpc.getDeleteFileDataBySpaceIdsMethod) == null) {
      synchronized (StoreIOGrpc.class) {
        if ((getDeleteFileDataBySpaceIdsMethod = StoreIOGrpc.getDeleteFileDataBySpaceIdsMethod) == null) {
          StoreIOGrpc.getDeleteFileDataBySpaceIdsMethod = getDeleteFileDataBySpaceIdsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileDataBySpaceIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestResourceData.DeleteFileDataBySpaceIds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StoreIOMethodDescriptorSupplier("DeleteFileDataBySpaceIds"))
              .build();
        }
      }
    }
    return getDeleteFileDataBySpaceIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StoreIOStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreIOStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreIOStub>() {
        @java.lang.Override
        public StoreIOStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreIOStub(channel, callOptions);
        }
      };
    return StoreIOStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StoreIOBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreIOBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreIOBlockingStub>() {
        @java.lang.Override
        public StoreIOBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreIOBlockingStub(channel, callOptions);
        }
      };
    return StoreIOBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StoreIOFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StoreIOFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StoreIOFutureStub>() {
        @java.lang.Override
        public StoreIOFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StoreIOFutureStub(channel, callOptions);
        }
      };
    return StoreIOFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * StoreIO for read/write file data.
   * </pre>
   */
  public static abstract class StoreIOImplBase implements io.grpc.BindableService {

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
   * StoreIO for read/write file data.
   * </pre>
   */
  public static final class StoreIOStub extends io.grpc.stub.AbstractAsyncStub<StoreIOStub> {
    private StoreIOStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreIOStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreIOStub(channel, callOptions);
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
   * StoreIO for read/write file data.
   * </pre>
   */
  public static final class StoreIOBlockingStub extends io.grpc.stub.AbstractBlockingStub<StoreIOBlockingStub> {
    private StoreIOBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreIOBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreIOBlockingStub(channel, callOptions);
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
   * StoreIO for read/write file data.
   * </pre>
   */
  public static final class StoreIOFutureStub extends io.grpc.stub.AbstractFutureStub<StoreIOFutureStub> {
    private StoreIOFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StoreIOFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StoreIOFutureStub(channel, callOptions);
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
    private final StoreIOImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StoreIOImplBase serviceImpl, int methodId) {
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

  private static abstract class StoreIOBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StoreIOBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcstoreio.PBSvcStoreIO.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StoreIO");
    }
  }

  private static final class StoreIOFileDescriptorSupplier
      extends StoreIOBaseDescriptorSupplier {
    StoreIOFileDescriptorSupplier() {}
  }

  private static final class StoreIOMethodDescriptorSupplier
      extends StoreIOBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StoreIOMethodDescriptorSupplier(String methodName) {
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
      synchronized (StoreIOGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StoreIOFileDescriptorSupplier())
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
