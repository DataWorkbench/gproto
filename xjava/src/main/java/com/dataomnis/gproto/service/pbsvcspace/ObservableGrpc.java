package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/spacemanager/observable.proto")
public final class ObservableGrpc {

  private ObservableGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.Observable";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview> getDescribeWorkspaceOverviewMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeWorkspaceOverview",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview,
      com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview> getDescribeWorkspaceOverviewMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview> getDescribeWorkspaceOverviewMethod;
    if ((getDescribeWorkspaceOverviewMethod = ObservableGrpc.getDescribeWorkspaceOverviewMethod) == null) {
      synchronized (ObservableGrpc.class) {
        if ((getDescribeWorkspaceOverviewMethod = ObservableGrpc.getDescribeWorkspaceOverviewMethod) == null) {
          ObservableGrpc.getDescribeWorkspaceOverviewMethod = getDescribeWorkspaceOverviewMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview, com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeWorkspaceOverview"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview.getDefaultInstance()))
              .setSchemaDescriptor(new ObservableMethodDescriptorSupplier("DescribeWorkspaceOverview"))
              .build();
        }
      }
    }
    return getDescribeWorkspaceOverviewMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ObservableStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObservableStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObservableStub>() {
        @java.lang.Override
        public ObservableStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObservableStub(channel, callOptions);
        }
      };
    return ObservableStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ObservableBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObservableBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObservableBlockingStub>() {
        @java.lang.Override
        public ObservableBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObservableBlockingStub(channel, callOptions);
        }
      };
    return ObservableBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ObservableFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ObservableFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ObservableFutureStub>() {
        @java.lang.Override
        public ObservableFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ObservableFutureStub(channel, callOptions);
        }
      };
    return ObservableFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ObservableImplBase implements io.grpc.BindableService {

    /**
     */
    public void describeWorkspaceOverview(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeWorkspaceOverviewMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDescribeWorkspaceOverviewMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview,
                com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview>(
                  this, METHODID_DESCRIBE_WORKSPACE_OVERVIEW)))
          .build();
    }
  }

  /**
   */
  public static final class ObservableStub extends io.grpc.stub.AbstractAsyncStub<ObservableStub> {
    private ObservableStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObservableStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObservableStub(channel, callOptions);
    }

    /**
     */
    public void describeWorkspaceOverview(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeWorkspaceOverviewMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ObservableBlockingStub extends io.grpc.stub.AbstractBlockingStub<ObservableBlockingStub> {
    private ObservableBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObservableBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObservableBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview describeWorkspaceOverview(com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeWorkspaceOverviewMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ObservableFutureStub extends io.grpc.stub.AbstractFutureStub<ObservableFutureStub> {
    private ObservableFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ObservableFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ObservableFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview> describeWorkspaceOverview(
        com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeWorkspaceOverviewMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE_WORKSPACE_OVERVIEW = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ObservableImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ObservableImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE_WORKSPACE_OVERVIEW:
          serviceImpl.describeWorkspaceOverview((com.dataomnis.gproto.types.pbrequest.PBRequestObserver.DescribeWorkspaceOverview) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseObserver.DescribeWorkspaceOverview>) responseObserver);
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

  private static abstract class ObservableBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ObservableBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcObservable.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Observable");
    }
  }

  private static final class ObservableFileDescriptorSupplier
      extends ObservableBaseDescriptorSupplier {
    ObservableFileDescriptorSupplier() {}
  }

  private static final class ObservableMethodDescriptorSupplier
      extends ObservableBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ObservableMethodDescriptorSupplier(String methodName) {
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
      synchronized (ObservableGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ObservableFileDescriptorSupplier())
              .addMethod(getDescribeWorkspaceOverviewMethod())
              .build();
        }
      }
    }
    return result;
  }
}
