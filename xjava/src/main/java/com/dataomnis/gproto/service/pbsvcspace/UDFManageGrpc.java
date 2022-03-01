package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * TODO: Reserved structure. unused on present.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/udf_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UDFManageGrpc {

  private UDFManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.UDFManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs> getListUDFsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUDFs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs> getListUDFsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs> getListUDFsMethod;
    if ((getListUDFsMethod = UDFManageGrpc.getListUDFsMethod) == null) {
      synchronized (UDFManageGrpc.class) {
        if ((getListUDFsMethod = UDFManageGrpc.getListUDFsMethod) == null) {
          UDFManageGrpc.getListUDFsMethod = getListUDFsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUDFs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs.getDefaultInstance()))
              .setSchemaDescriptor(new UDFManageMethodDescriptorSupplier("ListUDFs"))
              .build();
        }
      }
    }
    return getListUDFsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUDFsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUDFs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUDFsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUDFsMethod;
    if ((getDeleteUDFsMethod = UDFManageGrpc.getDeleteUDFsMethod) == null) {
      synchronized (UDFManageGrpc.class) {
        if ((getDeleteUDFsMethod = UDFManageGrpc.getDeleteUDFsMethod) == null) {
          UDFManageGrpc.getDeleteUDFsMethod = getDeleteUDFsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUDFs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UDFManageMethodDescriptorSupplier("DeleteUDFs"))
              .build();
        }
      }
    }
    return getDeleteUDFsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF> getCreateUDFMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUDF",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF> getCreateUDFMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF> getCreateUDFMethod;
    if ((getCreateUDFMethod = UDFManageGrpc.getCreateUDFMethod) == null) {
      synchronized (UDFManageGrpc.class) {
        if ((getCreateUDFMethod = UDFManageGrpc.getCreateUDFMethod) == null) {
          UDFManageGrpc.getCreateUDFMethod = getCreateUDFMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUDF"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF.getDefaultInstance()))
              .setSchemaDescriptor(new UDFManageMethodDescriptorSupplier("CreateUDF"))
              .build();
        }
      }
    }
    return getCreateUDFMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUDFMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUDF",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUDFMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUDFMethod;
    if ((getUpdateUDFMethod = UDFManageGrpc.getUpdateUDFMethod) == null) {
      synchronized (UDFManageGrpc.class) {
        if ((getUpdateUDFMethod = UDFManageGrpc.getUpdateUDFMethod) == null) {
          UDFManageGrpc.getUpdateUDFMethod = getUpdateUDFMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUDF"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UDFManageMethodDescriptorSupplier("UpdateUDF"))
              .build();
        }
      }
    }
    return getUpdateUDFMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> getDescribeUDFMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeUDF",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> getDescribeUDFMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> getDescribeUDFMethod;
    if ((getDescribeUDFMethod = UDFManageGrpc.getDescribeUDFMethod) == null) {
      synchronized (UDFManageGrpc.class) {
        if ((getDescribeUDFMethod = UDFManageGrpc.getDescribeUDFMethod) == null) {
          UDFManageGrpc.getDescribeUDFMethod = getDescribeUDFMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeUDF"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF.getDefaultInstance()))
              .setSchemaDescriptor(new UDFManageMethodDescriptorSupplier("DescribeUDF"))
              .build();
        }
      }
    }
    return getDescribeUDFMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UDFManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UDFManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UDFManageStub>() {
        @java.lang.Override
        public UDFManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UDFManageStub(channel, callOptions);
        }
      };
    return UDFManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UDFManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UDFManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UDFManageBlockingStub>() {
        @java.lang.Override
        public UDFManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UDFManageBlockingStub(channel, callOptions);
        }
      };
    return UDFManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UDFManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UDFManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UDFManageFutureStub>() {
        @java.lang.Override
        public UDFManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UDFManageFutureStub(channel, callOptions);
        }
      };
    return UDFManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * TODO: Reserved structure. unused on present.
   * </pre>
   */
  public static abstract class UDFManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void listUDFs(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUDFsMethod(), responseObserver);
    }

    /**
     */
    public void deleteUDFs(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUDFsMethod(), responseObserver);
    }

    /**
     */
    public void createUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUDFMethod(), responseObserver);
    }

    /**
     */
    public void updateUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUDFMethod(), responseObserver);
    }

    /**
     */
    public void describeUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeUDFMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListUDFsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs,
                com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs>(
                  this, METHODID_LIST_UDFS)))
          .addMethod(
            getDeleteUDFsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_UDFS)))
          .addMethod(
            getCreateUDFMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF,
                com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF>(
                  this, METHODID_CREATE_UDF)))
          .addMethod(
            getUpdateUDFMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_UDF)))
          .addMethod(
            getDescribeUDFMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF,
                com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF>(
                  this, METHODID_DESCRIBE_UDF)))
          .build();
    }
  }

  /**
   * <pre>
   * TODO: Reserved structure. unused on present.
   * </pre>
   */
  public static final class UDFManageStub extends io.grpc.stub.AbstractAsyncStub<UDFManageStub> {
    private UDFManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UDFManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UDFManageStub(channel, callOptions);
    }

    /**
     */
    public void listUDFs(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUDFsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUDFs(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUDFsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUDFMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUDFMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeUDFMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * TODO: Reserved structure. unused on present.
   * </pre>
   */
  public static final class UDFManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<UDFManageBlockingStub> {
    private UDFManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UDFManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UDFManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs listUDFs(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUDFsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteUDFs(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUDFsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF createUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUDFMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUDFMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF describeUDF(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeUDFMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * TODO: Reserved structure. unused on present.
   * </pre>
   */
  public static final class UDFManageFutureStub extends io.grpc.stub.AbstractFutureStub<UDFManageFutureStub> {
    private UDFManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UDFManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UDFManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs> listUDFs(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUDFsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteUDFs(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUDFsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF> createUDF(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUDFMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateUDF(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUDFMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> describeUDF(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeUDFMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_UDFS = 0;
  private static final int METHODID_DELETE_UDFS = 1;
  private static final int METHODID_CREATE_UDF = 2;
  private static final int METHODID_UPDATE_UDF = 3;
  private static final int METHODID_DESCRIBE_UDF = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UDFManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UDFManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_UDFS:
          serviceImpl.listUDFs((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDFs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDFs>) responseObserver);
          break;
        case METHODID_DELETE_UDFS:
          serviceImpl.deleteUDFs((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDFs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_UDF:
          serviceImpl.createUDF((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.CreateUDF>) responseObserver);
          break;
        case METHODID_UPDATE_UDF:
          serviceImpl.updateUDF((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_UDF:
          serviceImpl.describeUDF((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF>) responseObserver);
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

  private static abstract class UDFManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UDFManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcUDFManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UDFManage");
    }
  }

  private static final class UDFManageFileDescriptorSupplier
      extends UDFManageBaseDescriptorSupplier {
    UDFManageFileDescriptorSupplier() {}
  }

  private static final class UDFManageMethodDescriptorSupplier
      extends UDFManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UDFManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (UDFManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UDFManageFileDescriptorSupplier())
              .addMethod(getListUDFsMethod())
              .addMethod(getDeleteUDFsMethod())
              .addMethod(getCreateUDFMethod())
              .addMethod(getUpdateUDFMethod())
              .addMethod(getDescribeUDFMethod())
              .build();
        }
      }
    }
    return result;
  }
}
