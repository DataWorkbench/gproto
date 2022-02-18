package com.dataomnis.gproto.service.pbsvcscheduler;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SyncInstanceManage declares API for manage stream instance.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/scheduler/sync_instance_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SyncInstanceManageGrpc {

  private SyncInstanceManageGrpc() {}

  public static final String SERVICE_NAME = "scheduler.SyncInstanceManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances> getListSyncInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSyncInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances> getListSyncInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances, com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances> getListSyncInstancesMethod;
    if ((getListSyncInstancesMethod = SyncInstanceManageGrpc.getListSyncInstancesMethod) == null) {
      synchronized (SyncInstanceManageGrpc.class) {
        if ((getListSyncInstancesMethod = SyncInstanceManageGrpc.getListSyncInstancesMethod) == null) {
          SyncInstanceManageGrpc.getListSyncInstancesMethod = getListSyncInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances, com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSyncInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances.getDefaultInstance()))
              .setSchemaDescriptor(new SyncInstanceManageMethodDescriptorSupplier("ListSyncInstances"))
              .build();
        }
      }
    }
    return getListSyncInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getTerminateSyncInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateSyncInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getTerminateSyncInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getTerminateSyncInstancesMethod;
    if ((getTerminateSyncInstancesMethod = SyncInstanceManageGrpc.getTerminateSyncInstancesMethod) == null) {
      synchronized (SyncInstanceManageGrpc.class) {
        if ((getTerminateSyncInstancesMethod = SyncInstanceManageGrpc.getTerminateSyncInstancesMethod) == null) {
          SyncInstanceManageGrpc.getTerminateSyncInstancesMethod = getTerminateSyncInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateSyncInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncInstanceManageMethodDescriptorSupplier("TerminateSyncInstances"))
              .build();
        }
      }
    }
    return getTerminateSyncInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendSyncInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendSyncInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendSyncInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendSyncInstancesMethod;
    if ((getSuspendSyncInstancesMethod = SyncInstanceManageGrpc.getSuspendSyncInstancesMethod) == null) {
      synchronized (SyncInstanceManageGrpc.class) {
        if ((getSuspendSyncInstancesMethod = SyncInstanceManageGrpc.getSuspendSyncInstancesMethod) == null) {
          SyncInstanceManageGrpc.getSuspendSyncInstancesMethod = getSuspendSyncInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendSyncInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncInstanceManageMethodDescriptorSupplier("SuspendSyncInstances"))
              .build();
        }
      }
    }
    return getSuspendSyncInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeSyncInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeSyncInstances",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeSyncInstancesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeSyncInstancesMethod;
    if ((getResumeSyncInstancesMethod = SyncInstanceManageGrpc.getResumeSyncInstancesMethod) == null) {
      synchronized (SyncInstanceManageGrpc.class) {
        if ((getResumeSyncInstancesMethod = SyncInstanceManageGrpc.getResumeSyncInstancesMethod) == null) {
          SyncInstanceManageGrpc.getResumeSyncInstancesMethod = getResumeSyncInstancesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeSyncInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncInstanceManageMethodDescriptorSupplier("ResumeSyncInstances"))
              .build();
        }
      }
    }
    return getResumeSyncInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance> getDescribeSyncInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeSyncInstance",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance> getDescribeSyncInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance, com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance> getDescribeSyncInstanceMethod;
    if ((getDescribeSyncInstanceMethod = SyncInstanceManageGrpc.getDescribeSyncInstanceMethod) == null) {
      synchronized (SyncInstanceManageGrpc.class) {
        if ((getDescribeSyncInstanceMethod = SyncInstanceManageGrpc.getDescribeSyncInstanceMethod) == null) {
          SyncInstanceManageGrpc.getDescribeSyncInstanceMethod = getDescribeSyncInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance, com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeSyncInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance.getDefaultInstance()))
              .setSchemaDescriptor(new SyncInstanceManageMethodDescriptorSupplier("DescribeSyncInstance"))
              .build();
        }
      }
    }
    return getDescribeSyncInstanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SyncInstanceManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncInstanceManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncInstanceManageStub>() {
        @java.lang.Override
        public SyncInstanceManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncInstanceManageStub(channel, callOptions);
        }
      };
    return SyncInstanceManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SyncInstanceManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncInstanceManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncInstanceManageBlockingStub>() {
        @java.lang.Override
        public SyncInstanceManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncInstanceManageBlockingStub(channel, callOptions);
        }
      };
    return SyncInstanceManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SyncInstanceManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncInstanceManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncInstanceManageFutureStub>() {
        @java.lang.Override
        public SyncInstanceManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncInstanceManageFutureStub(channel, callOptions);
        }
      };
    return SyncInstanceManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SyncInstanceManage declares API for manage stream instance.
   * </pre>
   */
  public static abstract class SyncInstanceManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void listSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSyncInstancesMethod(), responseObserver);
    }

    /**
     */
    public void terminateSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateSyncInstancesMethod(), responseObserver);
    }

    /**
     */
    public void suspendSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendSyncInstancesMethod(), responseObserver);
    }

    /**
     */
    public void resumeSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeSyncInstancesMethod(), responseObserver);
    }

    /**
     */
    public void describeSyncInstance(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeSyncInstanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSyncInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances>(
                  this, METHODID_LIST_SYNC_INSTANCES)))
          .addMethod(
            getTerminateSyncInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_TERMINATE_SYNC_INSTANCES)))
          .addMethod(
            getSuspendSyncInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SUSPEND_SYNC_INSTANCES)))
          .addMethod(
            getResumeSyncInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RESUME_SYNC_INSTANCES)))
          .addMethod(
            getDescribeSyncInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance>(
                  this, METHODID_DESCRIBE_SYNC_INSTANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * SyncInstanceManage declares API for manage stream instance.
   * </pre>
   */
  public static final class SyncInstanceManageStub extends io.grpc.stub.AbstractAsyncStub<SyncInstanceManageStub> {
    private SyncInstanceManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncInstanceManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncInstanceManageStub(channel, callOptions);
    }

    /**
     */
    public void listSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSyncInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateSyncInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void suspendSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendSyncInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resumeSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeSyncInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeSyncInstance(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeSyncInstanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SyncInstanceManage declares API for manage stream instance.
   * </pre>
   */
  public static final class SyncInstanceManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<SyncInstanceManageBlockingStub> {
    private SyncInstanceManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncInstanceManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncInstanceManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances listSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSyncInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct terminateSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateSyncInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct suspendSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendSyncInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct resumeSyncInstances(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeSyncInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance describeSyncInstance(com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeSyncInstanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SyncInstanceManage declares API for manage stream instance.
   * </pre>
   */
  public static final class SyncInstanceManageFutureStub extends io.grpc.stub.AbstractFutureStub<SyncInstanceManageFutureStub> {
    private SyncInstanceManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncInstanceManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncInstanceManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances> listSyncInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSyncInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> terminateSyncInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateSyncInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> suspendSyncInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendSyncInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> resumeSyncInstances(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeSyncInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance> describeSyncInstance(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeSyncInstanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SYNC_INSTANCES = 0;
  private static final int METHODID_TERMINATE_SYNC_INSTANCES = 1;
  private static final int METHODID_SUSPEND_SYNC_INSTANCES = 2;
  private static final int METHODID_RESUME_SYNC_INSTANCES = 3;
  private static final int METHODID_DESCRIBE_SYNC_INSTANCE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SyncInstanceManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SyncInstanceManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SYNC_INSTANCES:
          serviceImpl.listSyncInstances((com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ListSyncInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.ListSyncInstances>) responseObserver);
          break;
        case METHODID_TERMINATE_SYNC_INSTANCES:
          serviceImpl.terminateSyncInstances((com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.TerminateSyncInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_SUSPEND_SYNC_INSTANCES:
          serviceImpl.suspendSyncInstances((com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.SuspendSyncInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RESUME_SYNC_INSTANCES:
          serviceImpl.resumeSyncInstances((com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.ResumeSyncInstances) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_SYNC_INSTANCE:
          serviceImpl.describeSyncInstance((com.dataomnis.gproto.types.pbrequest.PBRequestSyncInstanceManage.DescribeSyncInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncInstanceManage.DescribeSyncInstance>) responseObserver);
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

  private static abstract class SyncInstanceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SyncInstanceManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcscheduler.PBSvcSyncInstanceManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SyncInstanceManage");
    }
  }

  private static final class SyncInstanceManageFileDescriptorSupplier
      extends SyncInstanceManageBaseDescriptorSupplier {
    SyncInstanceManageFileDescriptorSupplier() {}
  }

  private static final class SyncInstanceManageMethodDescriptorSupplier
      extends SyncInstanceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SyncInstanceManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (SyncInstanceManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SyncInstanceManageFileDescriptorSupplier())
              .addMethod(getListSyncInstancesMethod())
              .addMethod(getTerminateSyncInstancesMethod())
              .addMethod(getSuspendSyncInstancesMethod())
              .addMethod(getResumeSyncInstancesMethod())
              .addMethod(getDescribeSyncInstanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
