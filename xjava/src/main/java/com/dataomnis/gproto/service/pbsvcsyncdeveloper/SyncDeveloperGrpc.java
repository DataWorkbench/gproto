package com.dataomnis.gproto.service.pbsvcsyncdeveloper;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/syncmanager/sync_developer.proto")
public final class SyncDeveloperGrpc {

  private SyncDeveloperGrpc() {}

  public static final String SERVICE_NAME = "syncdeveloper.SyncDeveloper";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink> getSubmitSyncJobToFlinkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitSyncJobToFlink",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink> getSubmitSyncJobToFlinkMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink, com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink> getSubmitSyncJobToFlinkMethod;
    if ((getSubmitSyncJobToFlinkMethod = SyncDeveloperGrpc.getSubmitSyncJobToFlinkMethod) == null) {
      synchronized (SyncDeveloperGrpc.class) {
        if ((getSubmitSyncJobToFlinkMethod = SyncDeveloperGrpc.getSubmitSyncJobToFlinkMethod) == null) {
          SyncDeveloperGrpc.getSubmitSyncJobToFlinkMethod = getSubmitSyncJobToFlinkMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink, com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitSyncJobToFlink"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink.getDefaultInstance()))
              .setSchemaDescriptor(new SyncDeveloperMethodDescriptorSupplier("SubmitSyncJobToFlink"))
              .build();
        }
      }
    }
    return getSubmitSyncJobToFlinkMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SyncDeveloperStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncDeveloperStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncDeveloperStub>() {
        @java.lang.Override
        public SyncDeveloperStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncDeveloperStub(channel, callOptions);
        }
      };
    return SyncDeveloperStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SyncDeveloperBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncDeveloperBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncDeveloperBlockingStub>() {
        @java.lang.Override
        public SyncDeveloperBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncDeveloperBlockingStub(channel, callOptions);
        }
      };
    return SyncDeveloperBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SyncDeveloperFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncDeveloperFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncDeveloperFutureStub>() {
        @java.lang.Override
        public SyncDeveloperFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncDeveloperFutureStub(channel, callOptions);
        }
      };
    return SyncDeveloperFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SyncDeveloperImplBase implements io.grpc.BindableService {

    /**
     */
    public void submitSyncJobToFlink(com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitSyncJobToFlinkMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSubmitSyncJobToFlinkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink>(
                  this, METHODID_SUBMIT_SYNC_JOB_TO_FLINK)))
          .build();
    }
  }

  /**
   */
  public static final class SyncDeveloperStub extends io.grpc.stub.AbstractAsyncStub<SyncDeveloperStub> {
    private SyncDeveloperStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncDeveloperStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncDeveloperStub(channel, callOptions);
    }

    /**
     */
    public void submitSyncJobToFlink(com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitSyncJobToFlinkMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SyncDeveloperBlockingStub extends io.grpc.stub.AbstractBlockingStub<SyncDeveloperBlockingStub> {
    private SyncDeveloperBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncDeveloperBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncDeveloperBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink submitSyncJobToFlink(com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitSyncJobToFlinkMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SyncDeveloperFutureStub extends io.grpc.stub.AbstractFutureStub<SyncDeveloperFutureStub> {
    private SyncDeveloperFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncDeveloperFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncDeveloperFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink> submitSyncJobToFlink(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitSyncJobToFlinkMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SUBMIT_SYNC_JOB_TO_FLINK = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SyncDeveloperImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SyncDeveloperImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SUBMIT_SYNC_JOB_TO_FLINK:
          serviceImpl.submitSyncJobToFlink((com.dataomnis.gproto.types.pbrequest.PBRequestSyncDeveloper.SubmitSyncJobToFlink) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncDeveloper.SubmitSyncJobToFlink>) responseObserver);
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

  private static abstract class SyncDeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SyncDeveloperBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcsyncdeveloper.PBSvcSyncDeveloper.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SyncDeveloper");
    }
  }

  private static final class SyncDeveloperFileDescriptorSupplier
      extends SyncDeveloperBaseDescriptorSupplier {
    SyncDeveloperFileDescriptorSupplier() {}
  }

  private static final class SyncDeveloperMethodDescriptorSupplier
      extends SyncDeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SyncDeveloperMethodDescriptorSupplier(String methodName) {
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
      synchronized (SyncDeveloperGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SyncDeveloperFileDescriptorSupplier())
              .addMethod(getSubmitSyncJobToFlinkMethod())
              .build();
        }
      }
    }
    return result;
  }
}
