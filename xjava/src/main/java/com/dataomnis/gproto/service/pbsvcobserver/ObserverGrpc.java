package com.dataomnis.gproto.service.pbsvcobserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/observer/observer.proto")
public final class ObserverGrpc {

  private ObserverGrpc() {}

  public static final String SERVICE_NAME = "observer.Observer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat> getGetPeriodicTasksStatusStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPeriodicTasksStatusStatistics",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat> getGetPeriodicTasksStatusStatisticsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat> getGetPeriodicTasksStatusStatisticsMethod;
    if ((getGetPeriodicTasksStatusStatisticsMethod = ObserverGrpc.getGetPeriodicTasksStatusStatisticsMethod) == null) {
      synchronized (ObserverGrpc.class) {
        if ((getGetPeriodicTasksStatusStatisticsMethod = ObserverGrpc.getGetPeriodicTasksStatusStatisticsMethod) == null) {
          ObserverGrpc.getGetPeriodicTasksStatusStatisticsMethod = getGetPeriodicTasksStatusStatisticsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPeriodicTasksStatusStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat.getDefaultInstance()))
              .setSchemaDescriptor(new ObserverMethodDescriptorSupplier("GetPeriodicTasksStatusStatistics"))
              .build();
        }
      }
    }
    return getGetPeriodicTasksStatusStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat> getGetPeriodicTasksExecutingStatisticsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPeriodicTasksExecutingStatistics",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat> getGetPeriodicTasksExecutingStatisticsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat> getGetPeriodicTasksExecutingStatisticsMethod;
    if ((getGetPeriodicTasksExecutingStatisticsMethod = ObserverGrpc.getGetPeriodicTasksExecutingStatisticsMethod) == null) {
      synchronized (ObserverGrpc.class) {
        if ((getGetPeriodicTasksExecutingStatisticsMethod = ObserverGrpc.getGetPeriodicTasksExecutingStatisticsMethod) == null) {
          ObserverGrpc.getGetPeriodicTasksExecutingStatisticsMethod = getGetPeriodicTasksExecutingStatisticsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPeriodicTasksExecutingStatistics"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat.getDefaultInstance()))
              .setSchemaDescriptor(new ObserverMethodDescriptorSupplier("GetPeriodicTasksExecutingStatistics"))
              .build();
        }
      }
    }
    return getGetPeriodicTasksExecutingStatisticsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount> getGetPeriodicTasksDispatchCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPeriodicTasksDispatchCount",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount> getGetPeriodicTasksDispatchCountMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount> getGetPeriodicTasksDispatchCountMethod;
    if ((getGetPeriodicTasksDispatchCountMethod = ObserverGrpc.getGetPeriodicTasksDispatchCountMethod) == null) {
      synchronized (ObserverGrpc.class) {
        if ((getGetPeriodicTasksDispatchCountMethod = ObserverGrpc.getGetPeriodicTasksDispatchCountMethod) == null) {
          ObserverGrpc.getGetPeriodicTasksDispatchCountMethod = getGetPeriodicTasksDispatchCountMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPeriodicTasksDispatchCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount.getDefaultInstance()))
              .setSchemaDescriptor(new ObserverMethodDescriptorSupplier("GetPeriodicTasksDispatchCount"))
              .build();
        }
      }
    }
    return getGetPeriodicTasksDispatchCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking> getGetPeriodicTasksRuntimeRankingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPeriodicTasksRuntimeRanking",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking> getGetPeriodicTasksRuntimeRankingMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking> getGetPeriodicTasksRuntimeRankingMethod;
    if ((getGetPeriodicTasksRuntimeRankingMethod = ObserverGrpc.getGetPeriodicTasksRuntimeRankingMethod) == null) {
      synchronized (ObserverGrpc.class) {
        if ((getGetPeriodicTasksRuntimeRankingMethod = ObserverGrpc.getGetPeriodicTasksRuntimeRankingMethod) == null) {
          ObserverGrpc.getGetPeriodicTasksRuntimeRankingMethod = getGetPeriodicTasksRuntimeRankingMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPeriodicTasksRuntimeRanking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking.getDefaultInstance()))
              .setSchemaDescriptor(new ObserverMethodDescriptorSupplier("GetPeriodicTasksRuntimeRanking"))
              .build();
        }
      }
    }
    return getGetPeriodicTasksRuntimeRankingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking> getGetPeriodicTasksErrorRankingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPeriodicTasksErrorRanking",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking> getGetPeriodicTasksErrorRankingMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking> getGetPeriodicTasksErrorRankingMethod;
    if ((getGetPeriodicTasksErrorRankingMethod = ObserverGrpc.getGetPeriodicTasksErrorRankingMethod) == null) {
      synchronized (ObserverGrpc.class) {
        if ((getGetPeriodicTasksErrorRankingMethod = ObserverGrpc.getGetPeriodicTasksErrorRankingMethod) == null) {
          ObserverGrpc.getGetPeriodicTasksErrorRankingMethod = getGetPeriodicTasksErrorRankingMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPeriodicTasksErrorRanking"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking.getDefaultInstance()))
              .setSchemaDescriptor(new ObserverMethodDescriptorSupplier("GetPeriodicTasksErrorRanking"))
              .build();
        }
      }
    }
    return getGetPeriodicTasksErrorRankingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObserverStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObserverStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObserverStub>() {
        @java.lang.Override
        public ObserverStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObserverStub(channel, callOptions);
        }
      };
    return ObserverStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObserverBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObserverBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObserverBlockingStub>() {
        @java.lang.Override
        public ObserverBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObserverBlockingStub(channel, callOptions);
        }
      };
    return ObserverBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObserverFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObserverFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObserverFutureStub>() {
        @java.lang.Override
        public ObserverFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObserverFutureStub(channel, callOptions);
        }
      };
    return ObserverFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ObserverImplBase implements io.grpc.BindableService {

    /**
     */
    public void getPeriodicTasksStatusStatistics(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPeriodicTasksStatusStatisticsMethod(), responseObserver);
    }

    /**
     */
    public void getPeriodicTasksExecutingStatistics(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPeriodicTasksExecutingStatisticsMethod(), responseObserver);
    }

    /**
     */
    public void getPeriodicTasksDispatchCount(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPeriodicTasksDispatchCountMethod(), responseObserver);
    }

    /**
     */
    public void getPeriodicTasksRuntimeRanking(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPeriodicTasksRuntimeRankingMethod(), responseObserver);
    }

    /**
     */
    public void getPeriodicTasksErrorRanking(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPeriodicTasksErrorRankingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetPeriodicTasksStatusStatisticsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat,
                com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat>(
                  this, METHODID_GET_PERIODIC_TASKS_STATUS_STATISTICS)))
          .addMethod(
            getGetPeriodicTasksExecutingStatisticsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat,
                com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat>(
                  this, METHODID_GET_PERIODIC_TASKS_EXECUTING_STATISTICS)))
          .addMethod(
            getGetPeriodicTasksDispatchCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount,
                com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount>(
                  this, METHODID_GET_PERIODIC_TASKS_DISPATCH_COUNT)))
          .addMethod(
            getGetPeriodicTasksRuntimeRankingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking,
                com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking>(
                  this, METHODID_GET_PERIODIC_TASKS_RUNTIME_RANKING)))
          .addMethod(
            getGetPeriodicTasksErrorRankingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking,
                com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking>(
                  this, METHODID_GET_PERIODIC_TASKS_ERROR_RANKING)))
          .build();
    }
  }

  /**
   */
  public static final class ObserverStub extends io.grpc.stub.AbstractAsyncStub<ObserverStub> {
    private ObserverStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObserverStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObserverStub(channel, callOptions);
    }

    /**
     */
    public void getPeriodicTasksStatusStatistics(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPeriodicTasksStatusStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPeriodicTasksExecutingStatistics(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPeriodicTasksExecutingStatisticsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPeriodicTasksDispatchCount(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPeriodicTasksDispatchCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPeriodicTasksRuntimeRanking(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPeriodicTasksRuntimeRankingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPeriodicTasksErrorRanking(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPeriodicTasksErrorRankingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ObserverBlockingStub extends io.grpc.stub.AbstractBlockingStub<ObserverBlockingStub> {
    private ObserverBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObserverBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObserverBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat getPeriodicTasksStatusStatistics(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPeriodicTasksStatusStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat getPeriodicTasksExecutingStatistics(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPeriodicTasksExecutingStatisticsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount getPeriodicTasksDispatchCount(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPeriodicTasksDispatchCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking getPeriodicTasksRuntimeRanking(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPeriodicTasksRuntimeRankingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking getPeriodicTasksErrorRanking(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPeriodicTasksErrorRankingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ObserverFutureStub extends io.grpc.stub.AbstractFutureStub<ObserverFutureStub> {
    private ObserverFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObserverFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObserverFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat> getPeriodicTasksStatusStatistics(
        com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPeriodicTasksStatusStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat> getPeriodicTasksExecutingStatistics(
        com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPeriodicTasksExecutingStatisticsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount> getPeriodicTasksDispatchCount(
        com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPeriodicTasksDispatchCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking> getPeriodicTasksRuntimeRanking(
        com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPeriodicTasksRuntimeRankingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking> getPeriodicTasksErrorRanking(
        com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPeriodicTasksErrorRankingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_PERIODIC_TASKS_STATUS_STATISTICS = 0;
  private static final int METHODID_GET_PERIODIC_TASKS_EXECUTING_STATISTICS = 1;
  private static final int METHODID_GET_PERIODIC_TASKS_DISPATCH_COUNT = 2;
  private static final int METHODID_GET_PERIODIC_TASKS_RUNTIME_RANKING = 3;
  private static final int METHODID_GET_PERIODIC_TASKS_ERROR_RANKING = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ObserverImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ObserverImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_PERIODIC_TASKS_STATUS_STATISTICS:
          serviceImpl.getPeriodicTasksStatusStatistics((com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksStatusStat) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksStatusStat>) responseObserver);
          break;
        case METHODID_GET_PERIODIC_TASKS_EXECUTING_STATISTICS:
          serviceImpl.getPeriodicTasksExecutingStatistics((com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTasksExecStat) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTasksExecStat>) responseObserver);
          break;
        case METHODID_GET_PERIODIC_TASKS_DISPATCH_COUNT:
          serviceImpl.getPeriodicTasksDispatchCount((com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskDispatchCount) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskDispatchCount>) responseObserver);
          break;
        case METHODID_GET_PERIODIC_TASKS_RUNTIME_RANKING:
          serviceImpl.getPeriodicTasksRuntimeRanking((com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskRuntimeRanking) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskRuntimeRanking>) responseObserver);
          break;
        case METHODID_GET_PERIODIC_TASKS_ERROR_RANKING:
          serviceImpl.getPeriodicTasksErrorRanking((com.dataomnis.gproto.types.pbrequest.PBRequestObserver.PTaskErrorRanking) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.PTaskErrorRanking>) responseObserver);
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

  private static abstract class ObserverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObserverBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcobserver.PBSvcObserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Observer");
    }
  }

  private static final class ObserverFileDescriptorSupplier
      extends ObserverBaseDescriptorSupplier {
    ObserverFileDescriptorSupplier() {}
  }

  private static final class ObserverMethodDescriptorSupplier
      extends ObserverBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObserverMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObserverGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObserverFileDescriptorSupplier())
              .addMethod(getGetPeriodicTasksStatusStatisticsMethod())
              .addMethod(getGetPeriodicTasksExecutingStatisticsMethod())
              .addMethod(getGetPeriodicTasksDispatchCountMethod())
              .addMethod(getGetPeriodicTasksRuntimeRankingMethod())
              .addMethod(getGetPeriodicTasksErrorRankingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
