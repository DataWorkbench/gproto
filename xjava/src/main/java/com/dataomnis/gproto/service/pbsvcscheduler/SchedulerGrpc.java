package com.dataomnis.gproto.service.pbsvcscheduler;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/scheduler/scheduler.proto")
public final class SchedulerGrpc {

  private SchedulerGrpc() {}

  public static final String SERVICE_NAME = "scheduler.Scheduler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSubmitStreamJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitStreamJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSubmitStreamJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSubmitStreamJobMethod;
    if ((getSubmitStreamJobMethod = SchedulerGrpc.getSubmitStreamJobMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getSubmitStreamJobMethod = SchedulerGrpc.getSubmitStreamJobMethod) == null) {
          SchedulerGrpc.getSubmitStreamJobMethod = getSubmitStreamJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitStreamJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("SubmitStreamJob"))
              .build();
        }
      }
    }
    return getSubmitStreamJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopStreamJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopStreamJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopStreamJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopStreamJobMethod;
    if ((getStopStreamJobMethod = SchedulerGrpc.getStopStreamJobMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getStopStreamJobMethod = SchedulerGrpc.getStopStreamJobMethod) == null) {
          SchedulerGrpc.getStopStreamJobMethod = getStopStreamJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopStreamJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("StopStreamJob"))
              .build();
        }
      }
    }
    return getStopStreamJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteStreamJobsBySpaceIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStreamJobsBySpaceIds",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteStreamJobsBySpaceIdsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteStreamJobsBySpaceIdsMethod;
    if ((getDeleteStreamJobsBySpaceIdsMethod = SchedulerGrpc.getDeleteStreamJobsBySpaceIdsMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getDeleteStreamJobsBySpaceIdsMethod = SchedulerGrpc.getDeleteStreamJobsBySpaceIdsMethod) == null) {
          SchedulerGrpc.getDeleteStreamJobsBySpaceIdsMethod = getDeleteStreamJobsBySpaceIdsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStreamJobsBySpaceIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("DeleteStreamJobsBySpaceIds"))
              .build();
        }
      }
    }
    return getDeleteStreamJobsBySpaceIdsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteStreamJobsByJobIdsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteStreamJobsByJobIds",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteStreamJobsByJobIdsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteStreamJobsByJobIdsMethod;
    if ((getDeleteStreamJobsByJobIdsMethod = SchedulerGrpc.getDeleteStreamJobsByJobIdsMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getDeleteStreamJobsByJobIdsMethod = SchedulerGrpc.getDeleteStreamJobsByJobIdsMethod) == null) {
          SchedulerGrpc.getDeleteStreamJobsByJobIdsMethod = getDeleteStreamJobsByJobIdsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteStreamJobsByJobIds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("DeleteStreamJobsByJobIds"))
              .build();
        }
      }
    }
    return getDeleteStreamJobsByJobIdsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SchedulerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerStub>() {
        @java.lang.Override
        public SchedulerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerStub(channel, callOptions);
        }
      };
    return SchedulerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SchedulerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerBlockingStub>() {
        @java.lang.Override
        public SchedulerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerBlockingStub(channel, callOptions);
        }
      };
    return SchedulerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SchedulerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerFutureStub>() {
        @java.lang.Override
        public SchedulerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerFutureStub(channel, callOptions);
        }
      };
    return SchedulerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SchedulerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * SubmitStreamJob used when release new stream job or resume stream job.
     * </pre>
     */
    public void submitStreamJob(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitStreamJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * StopStreamJob used when offline stream job.
     * </pre>
     */
    public void stopStreamJob(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopStreamJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteStreamJobsBySpaceIds used when delete workspaces.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public void deleteStreamJobsBySpaceIds(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStreamJobsBySpaceIdsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteStreamJobsByJobIds used when delete stream jobs.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public void deleteStreamJobsByJobIds(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStreamJobsByJobIdsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitStreamJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SUBMIT_STREAM_JOB)))
          .addMethod(
            getStopStreamJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_STOP_STREAM_JOB)))
          .addMethod(
            getDeleteStreamJobsBySpaceIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_STREAM_JOBS_BY_SPACE_IDS)))
          .addMethod(
            getDeleteStreamJobsByJobIdsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_STREAM_JOBS_BY_JOB_IDS)))
          .build();
    }
  }

  /**
   */
  public static final class SchedulerStub extends io.grpc.stub.AbstractAsyncStub<SchedulerStub> {
    private SchedulerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubmitStreamJob used when release new stream job or resume stream job.
     * </pre>
     */
    public void submitStreamJob(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitStreamJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * StopStreamJob used when offline stream job.
     * </pre>
     */
    public void stopStreamJob(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopStreamJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteStreamJobsBySpaceIds used when delete workspaces.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public void deleteStreamJobsBySpaceIds(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStreamJobsBySpaceIdsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteStreamJobsByJobIds used when delete stream jobs.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public void deleteStreamJobsByJobIds(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStreamJobsByJobIdsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SchedulerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SchedulerBlockingStub> {
    private SchedulerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubmitStreamJob used when release new stream job or resume stream job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct submitStreamJob(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitStreamJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * StopStreamJob used when offline stream job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct stopStreamJob(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopStreamJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteStreamJobsBySpaceIds used when delete workspaces.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteStreamJobsBySpaceIds(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStreamJobsBySpaceIdsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteStreamJobsByJobIds used when delete stream jobs.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteStreamJobsByJobIds(com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStreamJobsByJobIdsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SchedulerFutureStub extends io.grpc.stub.AbstractFutureStub<SchedulerFutureStub> {
    private SchedulerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * SubmitStreamJob used when release new stream job or resume stream job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> submitStreamJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitStreamJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * StopStreamJob used when offline stream job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> stopStreamJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopStreamJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteStreamJobsBySpaceIds used when delete workspaces.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteStreamJobsBySpaceIds(
        com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStreamJobsBySpaceIdsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteStreamJobsByJobIds used when delete stream jobs.
     * It will stop all stream jobs and terminate all instances.
     * And delete all instances.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteStreamJobsByJobIds(
        com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStreamJobsByJobIdsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_STREAM_JOB = 0;
  private static final int METHODID_STOP_STREAM_JOB = 1;
  private static final int METHODID_DELETE_STREAM_JOBS_BY_SPACE_IDS = 2;
  private static final int METHODID_DELETE_STREAM_JOBS_BY_JOB_IDS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SchedulerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SchedulerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_STREAM_JOB:
          serviceImpl.submitStreamJob((com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.SubmitStreamJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_STOP_STREAM_JOB:
          serviceImpl.stopStreamJob((com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.StopStreamJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_STREAM_JOBS_BY_SPACE_IDS:
          serviceImpl.deleteStreamJobsBySpaceIds((com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsBySpaceIds) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_STREAM_JOBS_BY_JOB_IDS:
          serviceImpl.deleteStreamJobsByJobIds((com.dataomnis.gproto.types.pbrequest.PBRequestScheduler.DeleteStreamJobsByJobIds) request,
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

  private static abstract class SchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SchedulerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcscheduler.PBSvcScheduler.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Scheduler");
    }
  }

  private static final class SchedulerFileDescriptorSupplier
      extends SchedulerBaseDescriptorSupplier {
    SchedulerFileDescriptorSupplier() {}
  }

  private static final class SchedulerMethodDescriptorSupplier
      extends SchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SchedulerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SchedulerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SchedulerFileDescriptorSupplier())
              .addMethod(getSubmitStreamJobMethod())
              .addMethod(getStopStreamJobMethod())
              .addMethod(getDeleteStreamJobsBySpaceIdsMethod())
              .addMethod(getDeleteStreamJobsByJobIdsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
