package com.dataomnis.gproto.service.pbsvcengine;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/enginemanager/engine_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EngineManageGrpc {

  private EngineManageGrpc() {}

  public static final String SERVICE_NAME = "enginecenter.EngineManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlinkClusterInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sMethod;
    if ((getCreateFlinkClusterInK8sMethod = EngineManageGrpc.getCreateFlinkClusterInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getCreateFlinkClusterInK8sMethod = EngineManageGrpc.getCreateFlinkClusterInK8sMethod) == null) {
          EngineManageGrpc.getCreateFlinkClusterInK8sMethod = getCreateFlinkClusterInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlinkClusterInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("CreateFlinkClusterInK8s"))
              .build();
        }
      }
    }
    return getCreateFlinkClusterInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClusterInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFlinkClusterInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClusterInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClusterInK8sMethod;
    if ((getStartFlinkClusterInK8sMethod = EngineManageGrpc.getStartFlinkClusterInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getStartFlinkClusterInK8sMethod = EngineManageGrpc.getStartFlinkClusterInK8sMethod) == null) {
          EngineManageGrpc.getStartFlinkClusterInK8sMethod = getStartFlinkClusterInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFlinkClusterInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("StartFlinkClusterInK8s"))
              .build();
        }
      }
    }
    return getStartFlinkClusterInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClusterInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopFlinkClusterInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClusterInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClusterInK8sMethod;
    if ((getStopFlinkClusterInK8sMethod = EngineManageGrpc.getStopFlinkClusterInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getStopFlinkClusterInK8sMethod = EngineManageGrpc.getStopFlinkClusterInK8sMethod) == null) {
          EngineManageGrpc.getStopFlinkClusterInK8sMethod = getStopFlinkClusterInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopFlinkClusterInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("StopFlinkClusterInK8s"))
              .build();
        }
      }
    }
    return getStopFlinkClusterInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNetworkBrokerInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sMethod;
    if ((getCreateNetworkBrokerInK8sMethod = EngineManageGrpc.getCreateNetworkBrokerInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getCreateNetworkBrokerInK8sMethod = EngineManageGrpc.getCreateNetworkBrokerInK8sMethod) == null) {
          EngineManageGrpc.getCreateNetworkBrokerInK8sMethod = getCreateNetworkBrokerInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNetworkBrokerInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("CreateNetworkBrokerInK8s"))
              .build();
        }
      }
    }
    return getCreateNetworkBrokerInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNetworkBrokerInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sMethod;
    if ((getDeleteNetworkBrokerInK8sMethod = EngineManageGrpc.getDeleteNetworkBrokerInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getDeleteNetworkBrokerInK8sMethod = EngineManageGrpc.getDeleteNetworkBrokerInK8sMethod) == null) {
          EngineManageGrpc.getDeleteNetworkBrokerInK8sMethod = getDeleteNetworkBrokerInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNetworkBrokerInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("DeleteNetworkBrokerInK8s"))
              .build();
        }
      }
    }
    return getDeleteNetworkBrokerInK8sMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EngineManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineManageStub>() {
        @java.lang.Override
        public EngineManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineManageStub(channel, callOptions);
        }
      };
    return EngineManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EngineManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineManageBlockingStub>() {
        @java.lang.Override
        public EngineManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineManageBlockingStub(channel, callOptions);
        }
      };
    return EngineManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EngineManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineManageFutureStub>() {
        @java.lang.Override
        public EngineManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineManageFutureStub(channel, callOptions);
        }
      };
    return EngineManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EngineManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void createFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlinkClusterInK8sMethod(), responseObserver);
    }

    /**
     * <pre>
     *  rpc DeleteFlinkClusterInK8s(request.DeleteFlinkClusterInK8s) returns (model.EmptyStruct) {}
     * </pre>
     */
    public void startFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFlinkClusterInK8sMethod(), responseObserver);
    }

    /**
     */
    public void stopFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopFlinkClusterInK8sMethod(), responseObserver);
    }

    /**
     */
    public void createNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNetworkBrokerInK8sMethod(), responseObserver);
    }

    /**
     */
    public void deleteNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNetworkBrokerInK8sMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateFlinkClusterInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_FLINK_CLUSTER_IN_K8S)))
          .addMethod(
            getStartFlinkClusterInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_START_FLINK_CLUSTER_IN_K8S)))
          .addMethod(
            getStopFlinkClusterInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_STOP_FLINK_CLUSTER_IN_K8S)))
          .addMethod(
            getCreateNetworkBrokerInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_NETWORK_BROKER_IN_K8S)))
          .addMethod(
            getDeleteNetworkBrokerInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_NETWORK_BROKER_IN_K8S)))
          .build();
    }
  }

  /**
   */
  public static final class EngineManageStub extends io.grpc.stub.AbstractAsyncStub<EngineManageStub> {
    private EngineManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineManageStub(channel, callOptions);
    }

    /**
     */
    public void createFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlinkClusterInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *  rpc DeleteFlinkClusterInK8s(request.DeleteFlinkClusterInK8s) returns (model.EmptyStruct) {}
     * </pre>
     */
    public void startFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFlinkClusterInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopFlinkClusterInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNetworkBrokerInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNetworkBrokerInK8sMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EngineManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<EngineManageBlockingStub> {
    private EngineManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlinkClusterInK8sMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *  rpc DeleteFlinkClusterInK8s(request.DeleteFlinkClusterInK8s) returns (model.EmptyStruct) {}
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct startFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFlinkClusterInK8sMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct stopFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopFlinkClusterInK8sMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNetworkBrokerInK8sMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNetworkBrokerInK8sMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EngineManageFutureStub extends io.grpc.stub.AbstractFutureStub<EngineManageFutureStub> {
    private EngineManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createFlinkClusterInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlinkClusterInK8sMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *  rpc DeleteFlinkClusterInK8s(request.DeleteFlinkClusterInK8s) returns (model.EmptyStruct) {}
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> startFlinkClusterInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFlinkClusterInK8sMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> stopFlinkClusterInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopFlinkClusterInK8sMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createNetworkBrokerInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNetworkBrokerInK8sMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteNetworkBrokerInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNetworkBrokerInK8sMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FLINK_CLUSTER_IN_K8S = 0;
  private static final int METHODID_START_FLINK_CLUSTER_IN_K8S = 1;
  private static final int METHODID_STOP_FLINK_CLUSTER_IN_K8S = 2;
  private static final int METHODID_CREATE_NETWORK_BROKER_IN_K8S = 3;
  private static final int METHODID_DELETE_NETWORK_BROKER_IN_K8S = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EngineManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EngineManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FLINK_CLUSTER_IN_K8S:
          serviceImpl.createFlinkClusterInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_START_FLINK_CLUSTER_IN_K8S:
          serviceImpl.startFlinkClusterInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StartFlinkClusterInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_STOP_FLINK_CLUSTER_IN_K8S:
          serviceImpl.stopFlinkClusterInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.StopFlinkClusterInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_NETWORK_BROKER_IN_K8S:
          serviceImpl.createNetworkBrokerInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_NETWORK_BROKER_IN_K8S:
          serviceImpl.deleteNetworkBrokerInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s) request,
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

  private static abstract class EngineManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EngineManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcengine.PBSvcEngineManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EngineManage");
    }
  }

  private static final class EngineManageFileDescriptorSupplier
      extends EngineManageBaseDescriptorSupplier {
    EngineManageFileDescriptorSupplier() {}
  }

  private static final class EngineManageMethodDescriptorSupplier
      extends EngineManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EngineManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (EngineManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EngineManageFileDescriptorSupplier())
              .addMethod(getCreateFlinkClusterInK8sMethod())
              .addMethod(getStartFlinkClusterInK8sMethod())
              .addMethod(getStopFlinkClusterInK8sMethod())
              .addMethod(getCreateNetworkBrokerInK8sMethod())
              .addMethod(getDeleteNetworkBrokerInK8sMethod())
              .build();
        }
      }
    }
    return result;
  }
}
