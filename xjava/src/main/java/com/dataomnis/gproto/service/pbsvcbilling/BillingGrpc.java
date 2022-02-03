package com.dataomnis.gproto.service.pbsvcbilling;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Billing to provides billing related services
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/billing/billing.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BillingGrpc {

  private BillingGrpc() {}

  public static final String SERVICE_NAME = "billing.Billing";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents> getGetBillingPriceComponentsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetBillingPriceComponents",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents> getGetBillingPriceComponentsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents> getGetBillingPriceComponentsMethod;
    if ((getGetBillingPriceComponentsMethod = BillingGrpc.getGetBillingPriceComponentsMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getGetBillingPriceComponentsMethod = BillingGrpc.getGetBillingPriceComponentsMethod) == null) {
          BillingGrpc.getGetBillingPriceComponentsMethod = getGetBillingPriceComponentsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetBillingPriceComponents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("GetBillingPriceComponents"))
              .build();
        }
      }
    }
    return getGetBillingPriceComponentsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance> getCreateBillingInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateBillingInstance",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance> getCreateBillingInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance> getCreateBillingInstanceMethod;
    if ((getCreateBillingInstanceMethod = BillingGrpc.getCreateBillingInstanceMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getCreateBillingInstanceMethod = BillingGrpc.getCreateBillingInstanceMethod) == null) {
          BillingGrpc.getCreateBillingInstanceMethod = getCreateBillingInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateBillingInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("CreateBillingInstance"))
              .build();
        }
      }
    }
    return getCreateBillingInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance> getStopBillingInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopBillingInstance",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance> getStopBillingInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance> getStopBillingInstanceMethod;
    if ((getStopBillingInstanceMethod = BillingGrpc.getStopBillingInstanceMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getStopBillingInstanceMethod = BillingGrpc.getStopBillingInstanceMethod) == null) {
          BillingGrpc.getStopBillingInstanceMethod = getStopBillingInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopBillingInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("StopBillingInstance"))
              .build();
        }
      }
    }
    return getStopBillingInstanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance> getRecoveryBillingInstanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecoveryBillingInstance",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance,
      com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance> getRecoveryBillingInstanceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance> getRecoveryBillingInstanceMethod;
    if ((getRecoveryBillingInstanceMethod = BillingGrpc.getRecoveryBillingInstanceMethod) == null) {
      synchronized (BillingGrpc.class) {
        if ((getRecoveryBillingInstanceMethod = BillingGrpc.getRecoveryBillingInstanceMethod) == null) {
          BillingGrpc.getRecoveryBillingInstanceMethod = getRecoveryBillingInstanceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance, com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecoveryBillingInstance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance.getDefaultInstance()))
              .setSchemaDescriptor(new BillingMethodDescriptorSupplier("RecoveryBillingInstance"))
              .build();
        }
      }
    }
    return getRecoveryBillingInstanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BillingStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingStub>() {
        @java.lang.Override
        public BillingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingStub(channel, callOptions);
        }
      };
    return BillingStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BillingBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingBlockingStub>() {
        @java.lang.Override
        public BillingBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingBlockingStub(channel, callOptions);
        }
      };
    return BillingBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BillingFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BillingFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BillingFutureStub>() {
        @java.lang.Override
        public BillingFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BillingFutureStub(channel, callOptions);
        }
      };
    return BillingFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Billing to provides billing related services
   * </pre>
   */
  public static abstract class BillingImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBillingPriceComponents(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBillingPriceComponentsMethod(), responseObserver);
    }

    /**
     */
    public void createBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateBillingInstanceMethod(), responseObserver);
    }

    /**
     */
    public void stopBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopBillingInstanceMethod(), responseObserver);
    }

    /**
     */
    public void recoveryBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecoveryBillingInstanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBillingPriceComponentsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
                com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents>(
                  this, METHODID_GET_BILLING_PRICE_COMPONENTS)))
          .addMethod(
            getCreateBillingInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance,
                com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance>(
                  this, METHODID_CREATE_BILLING_INSTANCE)))
          .addMethod(
            getStopBillingInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance,
                com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance>(
                  this, METHODID_STOP_BILLING_INSTANCE)))
          .addMethod(
            getRecoveryBillingInstanceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance,
                com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance>(
                  this, METHODID_RECOVERY_BILLING_INSTANCE)))
          .build();
    }
  }

  /**
   * <pre>
   * Billing to provides billing related services
   * </pre>
   */
  public static final class BillingStub extends io.grpc.stub.AbstractAsyncStub<BillingStub> {
    private BillingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingStub(channel, callOptions);
    }

    /**
     */
    public void getBillingPriceComponents(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBillingPriceComponentsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateBillingInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopBillingInstanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recoveryBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecoveryBillingInstanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Billing to provides billing related services
   * </pre>
   */
  public static final class BillingBlockingStub extends io.grpc.stub.AbstractBlockingStub<BillingBlockingStub> {
    private BillingBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents getBillingPriceComponents(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBillingPriceComponentsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance createBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateBillingInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance stopBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopBillingInstanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance recoveryBillingInstance(com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecoveryBillingInstanceMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Billing to provides billing related services
   * </pre>
   */
  public static final class BillingFutureStub extends io.grpc.stub.AbstractFutureStub<BillingFutureStub> {
    private BillingFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BillingFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BillingFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents> getBillingPriceComponents(
        com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBillingPriceComponentsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance> createBillingInstance(
        com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateBillingInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance> stopBillingInstance(
        com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopBillingInstanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance> recoveryBillingInstance(
        com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance request) {
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
    private final BillingImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BillingImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BILLING_PRICE_COMPONENTS:
          serviceImpl.getBillingPriceComponents((com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.GetPriceComponents>) responseObserver);
          break;
        case METHODID_CREATE_BILLING_INSTANCE:
          serviceImpl.createBillingInstance((com.dataomnis.gproto.types.pbrequest.PBRequestBilling.CreateBillingInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.CreateBillingInstance>) responseObserver);
          break;
        case METHODID_STOP_BILLING_INSTANCE:
          serviceImpl.stopBillingInstance((com.dataomnis.gproto.types.pbrequest.PBRequestBilling.StopBillingInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.StopBillingInstance>) responseObserver);
          break;
        case METHODID_RECOVERY_BILLING_INSTANCE:
          serviceImpl.recoveryBillingInstance((com.dataomnis.gproto.types.pbrequest.PBRequestBilling.RecoveryBillingInstance) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBilling.RecoveryBillingInstance>) responseObserver);
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

  private static abstract class BillingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BillingBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcbilling.PBSvcBilling.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Billing");
    }
  }

  private static final class BillingFileDescriptorSupplier
      extends BillingBaseDescriptorSupplier {
    BillingFileDescriptorSupplier() {}
  }

  private static final class BillingMethodDescriptorSupplier
      extends BillingBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BillingMethodDescriptorSupplier(String methodName) {
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
      synchronized (BillingGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BillingFileDescriptorSupplier())
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
