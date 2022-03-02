package com.dataomnis.gproto.service.pbsvcdeveloper;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/developer/developer.proto")
public final class DeveloperGrpc {

  private DeveloperGrpc() {}

  public static final String SERVICE_NAME = "developer.Developer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2,
      com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2> getSubmitFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2,
      com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2> getSubmitFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2, com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2> getSubmitFlinkJobMethod;
    if ((getSubmitFlinkJobMethod = DeveloperGrpc.getSubmitFlinkJobMethod) == null) {
      synchronized (DeveloperGrpc.class) {
        if ((getSubmitFlinkJobMethod = DeveloperGrpc.getSubmitFlinkJobMethod) == null) {
          DeveloperGrpc.getSubmitFlinkJobMethod = getSubmitFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2, com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2.getDefaultInstance()))
              .setSchemaDescriptor(new DeveloperMethodDescriptorSupplier("SubmitFlinkJob"))
              .build();
        }
      }
    }
    return getSubmitFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2,
      com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2> getGetFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2,
      com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2> getGetFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2, com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2> getGetFlinkJobMethod;
    if ((getGetFlinkJobMethod = DeveloperGrpc.getGetFlinkJobMethod) == null) {
      synchronized (DeveloperGrpc.class) {
        if ((getGetFlinkJobMethod = DeveloperGrpc.getGetFlinkJobMethod) == null) {
          DeveloperGrpc.getGetFlinkJobMethod = getGetFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2, com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2.getDefaultInstance()))
              .setSchemaDescriptor(new DeveloperMethodDescriptorSupplier("GetFlinkJob"))
              .build();
        }
      }
    }
    return getGetFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod;
    if ((getCancelFlinkJobMethod = DeveloperGrpc.getCancelFlinkJobMethod) == null) {
      synchronized (DeveloperGrpc.class) {
        if ((getCancelFlinkJobMethod = DeveloperGrpc.getCancelFlinkJobMethod) == null) {
          DeveloperGrpc.getCancelFlinkJobMethod = getCancelFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DeveloperMethodDescriptorSupplier("CancelFlinkJob"))
              .build();
        }
      }
    }
    return getCancelFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2,
      com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2> getValidateFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2,
      com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2> getValidateFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2, com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2> getValidateFlinkJobMethod;
    if ((getValidateFlinkJobMethod = DeveloperGrpc.getValidateFlinkJobMethod) == null) {
      synchronized (DeveloperGrpc.class) {
        if ((getValidateFlinkJobMethod = DeveloperGrpc.getValidateFlinkJobMethod) == null) {
          DeveloperGrpc.getValidateFlinkJobMethod = getValidateFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2, com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2.getDefaultInstance()))
              .setSchemaDescriptor(new DeveloperMethodDescriptorSupplier("ValidateFlinkJob"))
              .build();
        }
      }
    }
    return getValidateFlinkJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeveloperStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeveloperStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeveloperStub>() {
        @java.lang.Override
        public DeveloperStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeveloperStub(channel, callOptions);
        }
      };
    return DeveloperStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeveloperBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeveloperBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeveloperBlockingStub>() {
        @java.lang.Override
        public DeveloperBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeveloperBlockingStub(channel, callOptions);
        }
      };
    return DeveloperBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeveloperFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeveloperFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeveloperFutureStub>() {
        @java.lang.Override
        public DeveloperFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeveloperFutureStub(channel, callOptions);
        }
      };
    return DeveloperFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DeveloperImplBase implements io.grpc.BindableService {

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void getFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void validateFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateFlinkJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2,
                com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2>(
                  this, METHODID_SUBMIT_FLINK_JOB)))
          .addMethod(
            getGetFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2,
                com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2>(
                  this, METHODID_GET_FLINK_JOB)))
          .addMethod(
            getCancelFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CANCEL_FLINK_JOB)))
          .addMethod(
            getValidateFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2,
                com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2>(
                  this, METHODID_VALIDATE_FLINK_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class DeveloperStub extends io.grpc.stub.AbstractAsyncStub<DeveloperStub> {
    private DeveloperStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeveloperStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeveloperStub(channel, callOptions);
    }

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DeveloperBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeveloperBlockingStub> {
    private DeveloperBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeveloperBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeveloperBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2 submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2 getFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2 validateFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateFlinkJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeveloperFutureStub extends io.grpc.stub.AbstractFutureStub<DeveloperFutureStub> {
    private DeveloperFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeveloperFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeveloperFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2> submitFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2> getFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> cancelFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2> validateFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateFlinkJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_FLINK_JOB = 0;
  private static final int METHODID_GET_FLINK_JOB = 1;
  private static final int METHODID_CANCEL_FLINK_JOB = 2;
  private static final int METHODID_VALIDATE_FLINK_JOB = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeveloperImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeveloperImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_FLINK_JOB:
          serviceImpl.submitFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.SubmitFlinkJob_v2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.SubmitFlinkJob_v2>) responseObserver);
          break;
        case METHODID_GET_FLINK_JOB:
          serviceImpl.getFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.GetFlinkJob_v2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.GetFlinkJob_v2>) responseObserver);
          break;
        case METHODID_CANCEL_FLINK_JOB:
          serviceImpl.cancelFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.CancelFlinkJob_v2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_VALIDATE_FLINK_JOB:
          serviceImpl.validateFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.ValidateFlinkJob_v2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.ValidateFlinkJob_v2>) responseObserver);
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

  private static abstract class DeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeveloperBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcdeveloper.PBSvcDeveloper.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Developer");
    }
  }

  private static final class DeveloperFileDescriptorSupplier
      extends DeveloperBaseDescriptorSupplier {
    DeveloperFileDescriptorSupplier() {}
  }

  private static final class DeveloperMethodDescriptorSupplier
      extends DeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeveloperMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeveloperGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeveloperFileDescriptorSupplier())
              .addMethod(getSubmitFlinkJobMethod())
              .addMethod(getGetFlinkJobMethod())
              .addMethod(getCancelFlinkJobMethod())
              .addMethod(getValidateFlinkJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
