package com.dataomnis.gproto.billingpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * newbilling Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/billingmanager.proto")
public final class BillingManagerGrpc {

  private BillingManagerGrpc() {}

  public static final String SERVICE_NAME = "billing.BillingManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents> getGetBillingPriceComponentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingPriceComponents",
      requestType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents> getGetBillingPriceComponentsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents> getGetBillingPriceComponentsMethod;
    if ((getGetBillingPriceComponentsMethod = BillingManagerGrpc.getGetBillingPriceComponentsMethod) == null) {
      synchronized (BillingManagerGrpc.class) {
        if ((getGetBillingPriceComponentsMethod = BillingManagerGrpc.getGetBillingPriceComponentsMethod) == null) {
          BillingManagerGrpc.getGetBillingPriceComponentsMethod = getGetBillingPriceComponentsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingPriceComponents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents.getDefaultInstance()))
              .setSchemaDescriptor(new BillingManagerMethodDescriptorSupplier("GetBillingPriceComponents"))
              .build();
        }
      }
    }
    return getGetBillingPriceComponentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance,
      com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance> getCreateBillingInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBillingInstance",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance,
      com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance> getCreateBillingInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance, com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance> getCreateBillingInstanceMethod;
    if ((getCreateBillingInstanceMethod = BillingManagerGrpc.getCreateBillingInstanceMethod) == null) {
      synchronized (BillingManagerGrpc.class) {
        if ((getCreateBillingInstanceMethod = BillingManagerGrpc.getCreateBillingInstanceMethod) == null) {
          BillingManagerGrpc.getCreateBillingInstanceMethod = getCreateBillingInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance, com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBillingInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new BillingManagerMethodDescriptorSupplier("CreateBillingInstance"))
              .build();
        }
      }
    }
    return getCreateBillingInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance,
      com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance> getStopBillingInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopBillingInstance",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance,
      com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance> getStopBillingInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance, com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance> getStopBillingInstanceMethod;
    if ((getStopBillingInstanceMethod = BillingManagerGrpc.getStopBillingInstanceMethod) == null) {
      synchronized (BillingManagerGrpc.class) {
        if ((getStopBillingInstanceMethod = BillingManagerGrpc.getStopBillingInstanceMethod) == null) {
          BillingManagerGrpc.getStopBillingInstanceMethod = getStopBillingInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance, com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopBillingInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new BillingManagerMethodDescriptorSupplier("StopBillingInstance"))
              .build();
        }
      }
    }
    return getStopBillingInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance,
      com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance> getRecoveryBillingInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecoveryBillingInstance",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance,
      com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance> getRecoveryBillingInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance, com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance> getRecoveryBillingInstanceMethod;
    if ((getRecoveryBillingInstanceMethod = BillingManagerGrpc.getRecoveryBillingInstanceMethod) == null) {
      synchronized (BillingManagerGrpc.class) {
        if ((getRecoveryBillingInstanceMethod = BillingManagerGrpc.getRecoveryBillingInstanceMethod) == null) {
          BillingManagerGrpc.getRecoveryBillingInstanceMethod = getRecoveryBillingInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance, com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecoveryBillingInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new BillingManagerMethodDescriptorSupplier("RecoveryBillingInstance"))
              .build();
        }
      }
    }
    return getRecoveryBillingInstanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingManagerStub>() {
        @java.lang.Override
        public BillingManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingManagerStub(channel, callOptions);
        }
      };
    return BillingManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingManagerBlockingStub>() {
        @java.lang.Override
        public BillingManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingManagerBlockingStub(channel, callOptions);
        }
      };
    return BillingManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingManagerFutureStub>() {
        @java.lang.Override
        public BillingManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingManagerFutureStub(channel, callOptions);
        }
      };
    return BillingManagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * newbilling Service
   * </pre>
   */
  public static abstract class BillingManagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * API of newbilling manager.
     * </pre>
     */
    public void getBillingPriceComponents(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingPriceComponentsMethod(), responseObserver);
    }

    /**
     */
    public void createBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBillingInstanceMethod(), responseObserver);
    }

    /**
     */
    public void stopBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopBillingInstanceMethod(), responseObserver);
    }

    /**
     */
    public void recoveryBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecoveryBillingInstanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBillingPriceComponentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
                com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents>(
                  this, METHODID_GET_BILLING_PRICE_COMPONENTS)))
          .addMethod(
            getCreateBillingInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance,
                com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance>(
                  this, METHODID_CREATE_BILLING_INSTANCE)))
          .addMethod(
            getStopBillingInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance,
                com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance>(
                  this, METHODID_STOP_BILLING_INSTANCE)))
          .addMethod(
            getRecoveryBillingInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance,
                com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance>(
                  this, METHODID_RECOVERY_BILLING_INSTANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * newbilling Service
   * </pre>
   */
  public static final class BillingManagerStub extends io.grpc.stub.AbstractAsyncStub<BillingManagerStub> {
    private BillingManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingManagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of newbilling manager.
     * </pre>
     */
    public void getBillingPriceComponents(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingPriceComponentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBillingInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopBillingInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recoveryBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecoveryBillingInstanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * newbilling Service
   * </pre>
   */
  public static final class BillingManagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<BillingManagerBlockingStub> {
    private BillingManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingManagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of newbilling manager.
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents getBillingPriceComponents(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingPriceComponentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance createBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBillingInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance stopBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopBillingInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance recoveryBillingInstance(com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoveryBillingInstanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * newbilling Service
   * </pre>
   */
  public static final class BillingManagerFutureStub extends io.grpc.stub.AbstractFutureStub<BillingManagerFutureStub> {
    private BillingManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingManagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of newbilling manager.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents> getBillingPriceComponents(
        com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingPriceComponentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance> createBillingInstance(
        com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBillingInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance> stopBillingInstance(
        com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopBillingInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance> recoveryBillingInstance(
        com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecoveryBillingInstanceMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BILLING_PRICE_COMPONENTS = 0;
  private static final int METHODID_CREATE_BILLING_INSTANCE = 1;
  private static final int METHODID_STOP_BILLING_INSTANCE = 2;
  private static final int METHODID_RECOVERY_BILLING_INSTANCE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BillingManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BillingManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BILLING_PRICE_COMPONENTS:
          serviceImpl.getBillingPriceComponents((com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.GetPriceComponents>) responseObserver);
          break;
        case METHODID_CREATE_BILLING_INSTANCE:
          serviceImpl.createBillingInstance((com.dataomnis.gproto.requestpb.RequestPB.CreateBillingInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateBillingInstance>) responseObserver);
          break;
        case METHODID_STOP_BILLING_INSTANCE:
          serviceImpl.stopBillingInstance((com.dataomnis.gproto.requestpb.RequestPB.StopBillingInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.StopBillingInstance>) responseObserver);
          break;
        case METHODID_RECOVERY_BILLING_INSTANCE:
          serviceImpl.recoveryBillingInstance((com.dataomnis.gproto.requestpb.RequestPB.RecoveryBillingInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.RecoveryBillingInstance>) responseObserver);
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

  private static abstract class BillingManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.billingpb.BillingPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BillingManager");
    }
  }

  private static final class BillingManagerFileDescriptorSupplier
      extends BillingManagerBaseDescriptorSupplier {
    BillingManagerFileDescriptorSupplier() {}
  }

  private static final class BillingManagerMethodDescriptorSupplier
      extends BillingManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillingManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillingManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingManagerFileDescriptorSupplier())
              .addMethod(getGetBillingPriceComponentsMethod())
              .addMethod(getCreateBillingInstanceMethod())
              .addMethod(getStopBillingInstanceMethod())
              .addMethod(getRecoveryBillingInstanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
