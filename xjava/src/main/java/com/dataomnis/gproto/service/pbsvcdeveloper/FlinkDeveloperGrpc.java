package com.dataomnis.gproto.service.pbsvcdeveloper;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/developer/flink_developer.proto")
public final class FlinkDeveloperGrpc {

  private FlinkDeveloperGrpc() {}

  public static final String SERVICE_NAME = "developer.FlinkDeveloper";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob> getSubmitFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob> getSubmitFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob> getSubmitFlinkJobMethod;
    if ((getSubmitFlinkJobMethod = FlinkDeveloperGrpc.getSubmitFlinkJobMethod) == null) {
      synchronized (FlinkDeveloperGrpc.class) {
        if ((getSubmitFlinkJobMethod = FlinkDeveloperGrpc.getSubmitFlinkJobMethod) == null) {
          FlinkDeveloperGrpc.getSubmitFlinkJobMethod = getSubmitFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkDeveloperMethodDescriptorSupplier("SubmitFlinkJob"))
              .build();
        }
      }
    }
    return getSubmitFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus> getGetFlinkJobStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlinkJobStatus",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus> getGetFlinkJobStatusMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus> getGetFlinkJobStatusMethod;
    if ((getGetFlinkJobStatusMethod = FlinkDeveloperGrpc.getGetFlinkJobStatusMethod) == null) {
      synchronized (FlinkDeveloperGrpc.class) {
        if ((getGetFlinkJobStatusMethod = FlinkDeveloperGrpc.getGetFlinkJobStatusMethod) == null) {
          FlinkDeveloperGrpc.getGetFlinkJobStatusMethod = getGetFlinkJobStatusMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlinkJobStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkDeveloperMethodDescriptorSupplier("GetFlinkJobStatus"))
              .build();
        }
      }
    }
    return getGetFlinkJobStatusMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod;
    if ((getCancelFlinkJobMethod = FlinkDeveloperGrpc.getCancelFlinkJobMethod) == null) {
      synchronized (FlinkDeveloperGrpc.class) {
        if ((getCancelFlinkJobMethod = FlinkDeveloperGrpc.getCancelFlinkJobMethod) == null) {
          FlinkDeveloperGrpc.getCancelFlinkJobMethod = getCancelFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkDeveloperMethodDescriptorSupplier("CancelFlinkJob"))
              .build();
        }
      }
    }
    return getCancelFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob> getValidateFlinkJobContextMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateFlinkJobContext",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob> getValidateFlinkJobContextMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob> getValidateFlinkJobContextMethod;
    if ((getValidateFlinkJobContextMethod = FlinkDeveloperGrpc.getValidateFlinkJobContextMethod) == null) {
      synchronized (FlinkDeveloperGrpc.class) {
        if ((getValidateFlinkJobContextMethod = FlinkDeveloperGrpc.getValidateFlinkJobContextMethod) == null) {
          FlinkDeveloperGrpc.getValidateFlinkJobContextMethod = getValidateFlinkJobContextMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateFlinkJobContext"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkDeveloperMethodDescriptorSupplier("ValidateFlinkJobContext"))
              .build();
        }
      }
    }
    return getValidateFlinkJobContextMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql> getExecuteFlinkSqlMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ExecuteFlinkSql",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql> getExecuteFlinkSqlMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql> getExecuteFlinkSqlMethod;
    if ((getExecuteFlinkSqlMethod = FlinkDeveloperGrpc.getExecuteFlinkSqlMethod) == null) {
      synchronized (FlinkDeveloperGrpc.class) {
        if ((getExecuteFlinkSqlMethod = FlinkDeveloperGrpc.getExecuteFlinkSqlMethod) == null) {
          FlinkDeveloperGrpc.getExecuteFlinkSqlMethod = getExecuteFlinkSqlMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ExecuteFlinkSql"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkDeveloperMethodDescriptorSupplier("ExecuteFlinkSql"))
              .build();
        }
      }
    }
    return getExecuteFlinkSqlMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlinkDeveloperStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkDeveloperStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkDeveloperStub>() {
        @java.lang.Override
        public FlinkDeveloperStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkDeveloperStub(channel, callOptions);
        }
      };
    return FlinkDeveloperStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlinkDeveloperBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkDeveloperBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkDeveloperBlockingStub>() {
        @java.lang.Override
        public FlinkDeveloperBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkDeveloperBlockingStub(channel, callOptions);
        }
      };
    return FlinkDeveloperBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlinkDeveloperFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkDeveloperFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkDeveloperFutureStub>() {
        @java.lang.Override
        public FlinkDeveloperFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkDeveloperFutureStub(channel, callOptions);
        }
      };
    return FlinkDeveloperFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FlinkDeveloperImplBase implements io.grpc.BindableService {

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void getFlinkJobStatus(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlinkJobStatusMethod(), responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void validateFlinkJobContext(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateFlinkJobContextMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql> executeFlinkSql(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getExecuteFlinkSqlMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob>(
                  this, METHODID_SUBMIT_FLINK_JOB)))
          .addMethod(
            getGetFlinkJobStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus>(
                  this, METHODID_GET_FLINK_JOB_STATUS)))
          .addMethod(
            getCancelFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CANCEL_FLINK_JOB)))
          .addMethod(
            getValidateFlinkJobContextMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob>(
                  this, METHODID_VALIDATE_FLINK_JOB_CONTEXT)))
          .addMethod(
            getExecuteFlinkSqlMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql>(
                  this, METHODID_EXECUTE_FLINK_SQL)))
          .build();
    }
  }

  /**
   */
  public static final class FlinkDeveloperStub extends io.grpc.stub.AbstractAsyncStub<FlinkDeveloperStub> {
    private FlinkDeveloperStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkDeveloperStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkDeveloperStub(channel, callOptions);
    }

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlinkJobStatus(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlinkJobStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateFlinkJobContext(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateFlinkJobContextMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.ExecuteFlinkSql> executeFlinkSql(
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getExecuteFlinkSqlMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class FlinkDeveloperBlockingStub extends io.grpc.stub.AbstractBlockingStub<FlinkDeveloperBlockingStub> {
    private FlinkDeveloperBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkDeveloperBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkDeveloperBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus getFlinkJobStatus(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlinkJobStatusMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob validateFlinkJobContext(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateFlinkJobContextMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FlinkDeveloperFutureStub extends io.grpc.stub.AbstractFutureStub<FlinkDeveloperFutureStub> {
    private FlinkDeveloperFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkDeveloperFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkDeveloperFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob> submitFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus> getFlinkJobStatus(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlinkJobStatusMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> cancelFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob> validateFlinkJobContext(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateFlinkJobContextMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_FLINK_JOB = 0;
  private static final int METHODID_GET_FLINK_JOB_STATUS = 1;
  private static final int METHODID_CANCEL_FLINK_JOB = 2;
  private static final int METHODID_VALIDATE_FLINK_JOB_CONTEXT = 3;
  private static final int METHODID_EXECUTE_FLINK_SQL = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FlinkDeveloperImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FlinkDeveloperImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_FLINK_JOB:
          serviceImpl.submitFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.SubmitFlinkJob>) responseObserver);
          break;
        case METHODID_GET_FLINK_JOB_STATUS:
          serviceImpl.getFlinkJobStatus((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.GetFlinkJobStatus) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.GetFlinkJobStatus>) responseObserver);
          break;
        case METHODID_CANCEL_FLINK_JOB:
          serviceImpl.cancelFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.CancelFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_VALIDATE_FLINK_JOB_CONTEXT:
          serviceImpl.validateFlinkJobContext((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkDeveloper.SubmitFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ValidateFlinkJob>) responseObserver);
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
        case METHODID_EXECUTE_FLINK_SQL:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.executeFlinkSql(
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkDeveloper.ExecuteFlinkSql>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class FlinkDeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlinkDeveloperBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcdeveloper.PBSvcFlinkDeveloper.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlinkDeveloper");
    }
  }

  private static final class FlinkDeveloperFileDescriptorSupplier
      extends FlinkDeveloperBaseDescriptorSupplier {
    FlinkDeveloperFileDescriptorSupplier() {}
  }

  private static final class FlinkDeveloperMethodDescriptorSupplier
      extends FlinkDeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FlinkDeveloperMethodDescriptorSupplier(String methodName) {
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
      synchronized (FlinkDeveloperGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlinkDeveloperFileDescriptorSupplier())
              .addMethod(getSubmitFlinkJobMethod())
              .addMethod(getGetFlinkJobStatusMethod())
              .addMethod(getCancelFlinkJobMethod())
              .addMethod(getValidateFlinkJobContextMethod())
              .addMethod(getExecuteFlinkSqlMethod())
              .build();
        }
      }
    }
    return result;
  }
}
