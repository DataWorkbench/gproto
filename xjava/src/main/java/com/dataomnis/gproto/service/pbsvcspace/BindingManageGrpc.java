package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/binding_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BindingManageGrpc {

  private BindingManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.BindingManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding,
      com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding> getDescribeResourceBindingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeResourceBinding",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding,
      com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding> getDescribeResourceBindingMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding, com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding> getDescribeResourceBindingMethod;
    if ((getDescribeResourceBindingMethod = BindingManageGrpc.getDescribeResourceBindingMethod) == null) {
      synchronized (BindingManageGrpc.class) {
        if ((getDescribeResourceBindingMethod = BindingManageGrpc.getDescribeResourceBindingMethod) == null) {
          BindingManageGrpc.getDescribeResourceBindingMethod = getDescribeResourceBindingMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding, com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeResourceBinding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding.getDefaultInstance()))
              .setSchemaDescriptor(new BindingManageMethodDescriptorSupplier("DescribeResourceBinding"))
              .build();
        }
      }
    }
    return getDescribeResourceBindingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BindingManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BindingManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BindingManageStub>() {
        @java.lang.Override
        public BindingManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BindingManageStub(channel, callOptions);
        }
      };
    return BindingManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BindingManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BindingManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BindingManageBlockingStub>() {
        @java.lang.Override
        public BindingManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BindingManageBlockingStub(channel, callOptions);
        }
      };
    return BindingManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BindingManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BindingManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BindingManageFutureStub>() {
        @java.lang.Override
        public BindingManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BindingManageFutureStub(channel, callOptions);
        }
      };
    return BindingManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BindingManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * DescribeResourceBinding to get a module lists that bound this resource.
     * </pre>
     */
    public void describeResourceBinding(com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeResourceBindingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDescribeResourceBindingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding,
                com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding>(
                  this, METHODID_DESCRIBE_RESOURCE_BINDING)))
          .build();
    }
  }

  /**
   */
  public static final class BindingManageStub extends io.grpc.stub.AbstractAsyncStub<BindingManageStub> {
    private BindingManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BindingManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BindingManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * DescribeResourceBinding to get a module lists that bound this resource.
     * </pre>
     */
    public void describeResourceBinding(com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeResourceBindingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BindingManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<BindingManageBlockingStub> {
    private BindingManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BindingManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BindingManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DescribeResourceBinding to get a module lists that bound this resource.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding describeResourceBinding(com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeResourceBindingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BindingManageFutureStub extends io.grpc.stub.AbstractFutureStub<BindingManageFutureStub> {
    private BindingManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BindingManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BindingManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DescribeResourceBinding to get a module lists that bound this resource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding> describeResourceBinding(
        com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeResourceBindingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE_RESOURCE_BINDING = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BindingManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BindingManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE_RESOURCE_BINDING:
          serviceImpl.describeResourceBinding((com.dataomnis.gproto.types.pbrequest.PBRequestBindingManage.DescribeResourceBinding) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseBindingManage.DescribeResourceBinding>) responseObserver);
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

  private static abstract class BindingManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BindingManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcBindingManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BindingManage");
    }
  }

  private static final class BindingManageFileDescriptorSupplier
      extends BindingManageBaseDescriptorSupplier {
    BindingManageFileDescriptorSupplier() {}
  }

  private static final class BindingManageMethodDescriptorSupplier
      extends BindingManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BindingManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (BindingManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BindingManageFileDescriptorSupplier())
              .addMethod(getDescribeResourceBindingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
