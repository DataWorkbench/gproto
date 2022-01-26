package com.dataomnis.gproto.workspacepb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/workspace.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamInstanceManageGrpc {

  private StreamInstanceManageGrpc() {}

  public static final String SERVICE_NAME = "wspb.StreamInstanceManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances,
      com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances> getListStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStreamInstances",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances,
      com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances> getListStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances, com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances> getListStreamInstancesMethod;
    if ((getListStreamInstancesMethod = StreamInstanceManageGrpc.getListStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getListStreamInstancesMethod = StreamInstanceManageGrpc.getListStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getListStreamInstancesMethod = getListStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances, com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("ListStreamInstances"))
              .build();
        }
      }
    }
    return getListStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getTerminateStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateStreamInstances",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getTerminateStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getTerminateStreamInstancesMethod;
    if ((getTerminateStreamInstancesMethod = StreamInstanceManageGrpc.getTerminateStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getTerminateStreamInstancesMethod = StreamInstanceManageGrpc.getTerminateStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getTerminateStreamInstancesMethod = getTerminateStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("TerminateStreamInstances"))
              .build();
        }
      }
    }
    return getTerminateStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getSuspendStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendStreamInstances",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getSuspendStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getSuspendStreamInstancesMethod;
    if ((getSuspendStreamInstancesMethod = StreamInstanceManageGrpc.getSuspendStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getSuspendStreamInstancesMethod = StreamInstanceManageGrpc.getSuspendStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getSuspendStreamInstancesMethod = getSuspendStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("SuspendStreamInstances"))
              .build();
        }
      }
    }
    return getSuspendStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getResumeStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeStreamInstances",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getResumeStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getResumeStreamInstancesMethod;
    if ((getResumeStreamInstancesMethod = StreamInstanceManageGrpc.getResumeStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getResumeStreamInstancesMethod = StreamInstanceManageGrpc.getResumeStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getResumeStreamInstancesMethod = getResumeStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("ResumeStreamInstances"))
              .build();
        }
      }
    }
    return getResumeStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> getDescribeFlinkUIByInstanceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkUIByInstanceId",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> getDescribeFlinkUIByInstanceIdMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId, com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> getDescribeFlinkUIByInstanceIdMethod;
    if ((getDescribeFlinkUIByInstanceIdMethod = StreamInstanceManageGrpc.getDescribeFlinkUIByInstanceIdMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getDescribeFlinkUIByInstanceIdMethod = StreamInstanceManageGrpc.getDescribeFlinkUIByInstanceIdMethod) == null) {
          StreamInstanceManageGrpc.getDescribeFlinkUIByInstanceIdMethod = getDescribeFlinkUIByInstanceIdMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId, com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkUIByInstanceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("DescribeFlinkUIByInstanceId"))
              .build();
        }
      }
    }
    return getDescribeFlinkUIByInstanceIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static StreamInstanceManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamInstanceManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamInstanceManageStub>() {
        @java.lang.Override
        public StreamInstanceManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamInstanceManageStub(channel, callOptions);
        }
      };
    return StreamInstanceManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static StreamInstanceManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamInstanceManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamInstanceManageBlockingStub>() {
        @java.lang.Override
        public StreamInstanceManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamInstanceManageBlockingStub(channel, callOptions);
        }
      };
    return StreamInstanceManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static StreamInstanceManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<StreamInstanceManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<StreamInstanceManageFutureStub>() {
        @java.lang.Override
        public StreamInstanceManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new StreamInstanceManageFutureStub(channel, callOptions);
        }
      };
    return StreamInstanceManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class StreamInstanceManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public void listStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void terminateStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void suspendStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void resumeStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void describeFlinkUIByInstanceId(com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkUIByInstanceIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances,
                com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances>(
                  this, METHODID_LIST_STREAM_INSTANCES)))
          .addMethod(
            getTerminateStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_TERMINATE_STREAM_INSTANCES)))
          .addMethod(
            getSuspendStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_SUSPEND_STREAM_INSTANCES)))
          .addMethod(
            getResumeStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_RESUME_STREAM_INSTANCES)))
          .addMethod(
            getDescribeFlinkUIByInstanceIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId,
                com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId>(
                  this, METHODID_DESCRIBE_FLINK_UIBY_INSTANCE_ID)))
          .build();
    }
  }

  /**
   */
  public static final class StreamInstanceManageStub extends io.grpc.stub.AbstractAsyncStub<StreamInstanceManageStub> {
    private StreamInstanceManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamInstanceManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamInstanceManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public void listStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void suspendStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resumeStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFlinkUIByInstanceId(com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkUIByInstanceIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class StreamInstanceManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<StreamInstanceManageBlockingStub> {
    private StreamInstanceManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamInstanceManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamInstanceManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances listStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct terminateStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct suspendStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct resumeStreamInstances(com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId describeFlinkUIByInstanceId(com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkUIByInstanceIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class StreamInstanceManageFutureStub extends io.grpc.stub.AbstractFutureStub<StreamInstanceManageFutureStub> {
    private StreamInstanceManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected StreamInstanceManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new StreamInstanceManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances> listStreamInstances(
        com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> terminateStreamInstances(
        com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> suspendStreamInstances(
        com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> resumeStreamInstances(
        com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> describeFlinkUIByInstanceId(
        com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkUIByInstanceIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_STREAM_INSTANCES = 0;
  private static final int METHODID_TERMINATE_STREAM_INSTANCES = 1;
  private static final int METHODID_SUSPEND_STREAM_INSTANCES = 2;
  private static final int METHODID_RESUME_STREAM_INSTANCES = 3;
  private static final int METHODID_DESCRIBE_FLINK_UIBY_INSTANCE_ID = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final StreamInstanceManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(StreamInstanceManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_STREAM_INSTANCES:
          serviceImpl.listStreamInstances((com.dataomnis.gproto.requestpb.RequestPB.ListStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListStreamInstances>) responseObserver);
          break;
        case METHODID_TERMINATE_STREAM_INSTANCES:
          serviceImpl.terminateStreamInstances((com.dataomnis.gproto.requestpb.RequestPB.TerminateStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_SUSPEND_STREAM_INSTANCES:
          serviceImpl.suspendStreamInstances((com.dataomnis.gproto.requestpb.RequestPB.SuspendStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_RESUME_STREAM_INSTANCES:
          serviceImpl.resumeStreamInstances((com.dataomnis.gproto.requestpb.RequestPB.ResumeStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_UIBY_INSTANCE_ID:
          serviceImpl.describeFlinkUIByInstanceId((com.dataomnis.gproto.requestpb.RequestPB.DescribeFlinkUIByInstanceId) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeFlinkUIByInstanceId>) responseObserver);
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

  private static abstract class StreamInstanceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamInstanceManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.workspacepb.WorkspacePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("StreamInstanceManage");
    }
  }

  private static final class StreamInstanceManageFileDescriptorSupplier
      extends StreamInstanceManageBaseDescriptorSupplier {
    StreamInstanceManageFileDescriptorSupplier() {}
  }

  private static final class StreamInstanceManageMethodDescriptorSupplier
      extends StreamInstanceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    StreamInstanceManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (StreamInstanceManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new StreamInstanceManageFileDescriptorSupplier())
              .addMethod(getListStreamInstancesMethod())
              .addMethod(getTerminateStreamInstancesMethod())
              .addMethod(getSuspendStreamInstancesMethod())
              .addMethod(getResumeStreamInstancesMethod())
              .addMethod(getDescribeFlinkUIByInstanceIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
