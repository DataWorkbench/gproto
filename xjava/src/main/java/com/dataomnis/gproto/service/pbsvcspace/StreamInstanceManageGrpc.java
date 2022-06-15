package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * StreamInstanceManage declares API for manage stream instance.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/stream_instance_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class StreamInstanceManageGrpc {

  private StreamInstanceManageGrpc() {}

  public static final String SERVICE_NAME = "scheduler.StreamInstanceManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances,
      com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances> getListStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStreamInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances,
      com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances> getListStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances, com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances> getListStreamInstancesMethod;
    if ((getListStreamInstancesMethod = StreamInstanceManageGrpc.getListStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getListStreamInstancesMethod = StreamInstanceManageGrpc.getListStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getListStreamInstancesMethod = getListStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances, com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("ListStreamInstances"))
              .build();
        }
      }
    }
    return getListStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getTerminateStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateStreamInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getTerminateStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getTerminateStreamInstancesMethod;
    if ((getTerminateStreamInstancesMethod = StreamInstanceManageGrpc.getTerminateStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getTerminateStreamInstancesMethod = StreamInstanceManageGrpc.getTerminateStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getTerminateStreamInstancesMethod = getTerminateStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("TerminateStreamInstances"))
              .build();
        }
      }
    }
    return getTerminateStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendStreamInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendStreamInstancesMethod;
    if ((getSuspendStreamInstancesMethod = StreamInstanceManageGrpc.getSuspendStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getSuspendStreamInstancesMethod = StreamInstanceManageGrpc.getSuspendStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getSuspendStreamInstancesMethod = getSuspendStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("SuspendStreamInstances"))
              .build();
        }
      }
    }
    return getSuspendStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeStreamInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeStreamInstancesMethod;
    if ((getResumeStreamInstancesMethod = StreamInstanceManageGrpc.getResumeStreamInstancesMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getResumeStreamInstancesMethod = StreamInstanceManageGrpc.getResumeStreamInstancesMethod) == null) {
          StreamInstanceManageGrpc.getResumeStreamInstancesMethod = getResumeStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("ResumeStreamInstances"))
              .build();
        }
      }
    }
    return getResumeStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance> getDescribeStreamInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeStreamInstance",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance> getDescribeStreamInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance, com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance> getDescribeStreamInstanceMethod;
    if ((getDescribeStreamInstanceMethod = StreamInstanceManageGrpc.getDescribeStreamInstanceMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getDescribeStreamInstanceMethod = StreamInstanceManageGrpc.getDescribeStreamInstanceMethod) == null) {
          StreamInstanceManageGrpc.getDescribeStreamInstanceMethod = getDescribeStreamInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance, com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeStreamInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("DescribeStreamInstance"))
              .build();
        }
      }
    }
    return getDescribeStreamInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateStreamInstanceWithIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateStreamInstanceWithId",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateStreamInstanceWithIdMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateStreamInstanceWithIdMethod;
    if ((getCreateStreamInstanceWithIdMethod = StreamInstanceManageGrpc.getCreateStreamInstanceWithIdMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getCreateStreamInstanceWithIdMethod = StreamInstanceManageGrpc.getCreateStreamInstanceWithIdMethod) == null) {
          StreamInstanceManageGrpc.getCreateStreamInstanceWithIdMethod = getCreateStreamInstanceWithIdMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateStreamInstanceWithId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("CreateStreamInstanceWithId"))
              .build();
        }
      }
    }
    return getCreateStreamInstanceWithIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateStreamInstanceStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateStreamInstanceState",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateStreamInstanceStateMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateStreamInstanceStateMethod;
    if ((getUpdateStreamInstanceStateMethod = StreamInstanceManageGrpc.getUpdateStreamInstanceStateMethod) == null) {
      synchronized (StreamInstanceManageGrpc.class) {
        if ((getUpdateStreamInstanceStateMethod = StreamInstanceManageGrpc.getUpdateStreamInstanceStateMethod) == null) {
          StreamInstanceManageGrpc.getUpdateStreamInstanceStateMethod = getUpdateStreamInstanceStateMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateStreamInstanceState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new StreamInstanceManageMethodDescriptorSupplier("UpdateStreamInstanceState"))
              .build();
        }
      }
    }
    return getUpdateStreamInstanceStateMethod;
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
   * <pre>
   * StreamInstanceManage declares API for manage stream instance.
   * </pre>
   */
  public static abstract class StreamInstanceManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void listStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void terminateStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateStreamInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public void suspendStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendStreamInstancesMethod(), responseObserver);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public void resumeStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void describeStreamInstance(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeStreamInstanceMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateStreamInstanceWithId do creates a instance with generated id. Only used in internal.
     * Return no error is the give instance id already exists.
     * </pre>
     */
    public void createStreamInstanceWithId(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateStreamInstanceWithIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateStreamInstanceState do updates the instance state, Only used in internal.
     * </pre>
     */
    public void updateStreamInstanceState(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateStreamInstanceStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances,
                com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances>(
                  this, METHODID_LIST_STREAM_INSTANCES)))
          .addMethod(
            getTerminateStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_TERMINATE_STREAM_INSTANCES)))
          .addMethod(
            getSuspendStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SUSPEND_STREAM_INSTANCES)))
          .addMethod(
            getResumeStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RESUME_STREAM_INSTANCES)))
          .addMethod(
            getDescribeStreamInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance,
                com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance>(
                  this, METHODID_DESCRIBE_STREAM_INSTANCE)))
          .addMethod(
            getCreateStreamInstanceWithIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_STREAM_INSTANCE_WITH_ID)))
          .addMethod(
            getUpdateStreamInstanceStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_STREAM_INSTANCE_STATE)))
          .build();
    }
  }

  /**
   * <pre>
   * StreamInstanceManage declares API for manage stream instance.
   * </pre>
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
     */
    public void listStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public void suspendStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public void resumeStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeStreamInstance(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeStreamInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateStreamInstanceWithId do creates a instance with generated id. Only used in internal.
     * Return no error is the give instance id already exists.
     * </pre>
     */
    public void createStreamInstanceWithId(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateStreamInstanceWithIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateStreamInstanceState do updates the instance state, Only used in internal.
     * </pre>
     */
    public void updateStreamInstanceState(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateStreamInstanceStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * StreamInstanceManage declares API for manage stream instance.
   * </pre>
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
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances listStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct terminateStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct suspendStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct resumeStreamInstances(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance describeStreamInstance(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeStreamInstanceMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateStreamInstanceWithId do creates a instance with generated id. Only used in internal.
     * Return no error is the give instance id already exists.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createStreamInstanceWithId(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateStreamInstanceWithIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateStreamInstanceState do updates the instance state, Only used in internal.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateStreamInstanceState(com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateStreamInstanceStateMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * StreamInstanceManage declares API for manage stream instance.
   * </pre>
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
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances> listStreamInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> terminateStreamInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> suspendStreamInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * TODO: unused on present.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> resumeStreamInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance> describeStreamInstance(
        com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeStreamInstanceMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateStreamInstanceWithId do creates a instance with generated id. Only used in internal.
     * Return no error is the give instance id already exists.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createStreamInstanceWithId(
        com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateStreamInstanceWithIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateStreamInstanceState do updates the instance state, Only used in internal.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateStreamInstanceState(
        com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateStreamInstanceStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_STREAM_INSTANCES = 0;
  private static final int METHODID_TERMINATE_STREAM_INSTANCES = 1;
  private static final int METHODID_SUSPEND_STREAM_INSTANCES = 2;
  private static final int METHODID_RESUME_STREAM_INSTANCES = 3;
  private static final int METHODID_DESCRIBE_STREAM_INSTANCE = 4;
  private static final int METHODID_CREATE_STREAM_INSTANCE_WITH_ID = 5;
  private static final int METHODID_UPDATE_STREAM_INSTANCE_STATE = 6;

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
          serviceImpl.listStreamInstances((com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ListStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.ListStreamInstances>) responseObserver);
          break;
        case METHODID_TERMINATE_STREAM_INSTANCES:
          serviceImpl.terminateStreamInstances((com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.TerminateStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_SUSPEND_STREAM_INSTANCES:
          serviceImpl.suspendStreamInstances((com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.SuspendStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RESUME_STREAM_INSTANCES:
          serviceImpl.resumeStreamInstances((com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.ResumeStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_STREAM_INSTANCE:
          serviceImpl.describeStreamInstance((com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.DescribeStreamInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamInstanceManage.DescribeStreamInstance>) responseObserver);
          break;
        case METHODID_CREATE_STREAM_INSTANCE_WITH_ID:
          serviceImpl.createStreamInstanceWithId((com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.CreateStreamInstanceWithId) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE_STREAM_INSTANCE_STATE:
          serviceImpl.updateStreamInstanceState((com.dataomnis.gproto.types.pbrequest.PBRequestStreamInstanceManage.UpdateStreamInstanceState) request,
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

  private static abstract class StreamInstanceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    StreamInstanceManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcStreamInstanceManage.getDescriptor();
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
              .addMethod(getDescribeStreamInstanceMethod())
              .addMethod(getCreateStreamInstanceWithIdMethod())
              .addMethod(getUpdateStreamInstanceStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
