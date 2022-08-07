package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * IaaSProxy declares API for get some info from iaas.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/iaas_proxy.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class IaaSProxyGrpc {

  private IaaSProxyGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.IaaSProxy";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters,
      com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters> getListIaaSRoutersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIaaSRouters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters,
      com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters> getListIaaSRoutersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters, com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters> getListIaaSRoutersMethod;
    if ((getListIaaSRoutersMethod = IaaSProxyGrpc.getListIaaSRoutersMethod) == null) {
      synchronized (IaaSProxyGrpc.class) {
        if ((getListIaaSRoutersMethod = IaaSProxyGrpc.getListIaaSRoutersMethod) == null) {
          IaaSProxyGrpc.getListIaaSRoutersMethod = getListIaaSRoutersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters, com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIaaSRouters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters.getDefaultInstance()))
              .setSchemaDescriptor(new IaaSProxyMethodDescriptorSupplier("ListIaaSRouters"))
              .build();
        }
      }
    }
    return getListIaaSRoutersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets,
      com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets> getListIaaSRouterVXNetsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListIaaSRouterVXNets",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets,
      com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets> getListIaaSRouterVXNetsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets, com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets> getListIaaSRouterVXNetsMethod;
    if ((getListIaaSRouterVXNetsMethod = IaaSProxyGrpc.getListIaaSRouterVXNetsMethod) == null) {
      synchronized (IaaSProxyGrpc.class) {
        if ((getListIaaSRouterVXNetsMethod = IaaSProxyGrpc.getListIaaSRouterVXNetsMethod) == null) {
          IaaSProxyGrpc.getListIaaSRouterVXNetsMethod = getListIaaSRouterVXNetsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets, com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListIaaSRouterVXNets"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets.getDefaultInstance()))
              .setSchemaDescriptor(new IaaSProxyMethodDescriptorSupplier("ListIaaSRouterVXNets"))
              .build();
        }
      }
    }
    return getListIaaSRouterVXNetsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static IaaSProxyStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IaaSProxyStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IaaSProxyStub>() {
        @java.lang.Override
        public IaaSProxyStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IaaSProxyStub(channel, callOptions);
        }
      };
    return IaaSProxyStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static IaaSProxyBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IaaSProxyBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IaaSProxyBlockingStub>() {
        @java.lang.Override
        public IaaSProxyBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IaaSProxyBlockingStub(channel, callOptions);
        }
      };
    return IaaSProxyBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static IaaSProxyFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<IaaSProxyFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<IaaSProxyFutureStub>() {
        @java.lang.Override
        public IaaSProxyFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new IaaSProxyFutureStub(channel, callOptions);
        }
      };
    return IaaSProxyFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * IaaSProxy declares API for get some info from iaas.
   * </pre>
   */
  public static abstract class IaaSProxyImplBase implements io.grpc.BindableService {

    /**
     */
    public void listIaaSRouters(com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIaaSRoutersMethod(), responseObserver);
    }

    /**
     */
    public void listIaaSRouterVXNets(com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListIaaSRouterVXNetsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListIaaSRoutersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters,
                com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters>(
                  this, METHODID_LIST_IAA_SROUTERS)))
          .addMethod(
            getListIaaSRouterVXNetsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets,
                com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets>(
                  this, METHODID_LIST_IAA_SROUTER_VXNETS)))
          .build();
    }
  }

  /**
   * <pre>
   * IaaSProxy declares API for get some info from iaas.
   * </pre>
   */
  public static final class IaaSProxyStub extends io.grpc.stub.AbstractAsyncStub<IaaSProxyStub> {
    private IaaSProxyStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IaaSProxyStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IaaSProxyStub(channel, callOptions);
    }

    /**
     */
    public void listIaaSRouters(com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIaaSRoutersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listIaaSRouterVXNets(com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListIaaSRouterVXNetsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * IaaSProxy declares API for get some info from iaas.
   * </pre>
   */
  public static final class IaaSProxyBlockingStub extends io.grpc.stub.AbstractBlockingStub<IaaSProxyBlockingStub> {
    private IaaSProxyBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IaaSProxyBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IaaSProxyBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters listIaaSRouters(com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIaaSRoutersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets listIaaSRouterVXNets(com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListIaaSRouterVXNetsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * IaaSProxy declares API for get some info from iaas.
   * </pre>
   */
  public static final class IaaSProxyFutureStub extends io.grpc.stub.AbstractFutureStub<IaaSProxyFutureStub> {
    private IaaSProxyFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected IaaSProxyFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new IaaSProxyFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters> listIaaSRouters(
        com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIaaSRoutersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets> listIaaSRouterVXNets(
        com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListIaaSRouterVXNetsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_IAA_SROUTERS = 0;
  private static final int METHODID_LIST_IAA_SROUTER_VXNETS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final IaaSProxyImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(IaaSProxyImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_IAA_SROUTERS:
          serviceImpl.listIaaSRouters((com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouters>) responseObserver);
          break;
        case METHODID_LIST_IAA_SROUTER_VXNETS:
          serviceImpl.listIaaSRouterVXNets((com.dataomnis.gproto.types.pbrequest.PBRequestIaaSProxy.ListIaaSRouterVXNets) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseIaaSProxy.ListIaaSRouterVXNets>) responseObserver);
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

  private static abstract class IaaSProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    IaaSProxyBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcIaaSProxy.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("IaaSProxy");
    }
  }

  private static final class IaaSProxyFileDescriptorSupplier
      extends IaaSProxyBaseDescriptorSupplier {
    IaaSProxyFileDescriptorSupplier() {}
  }

  private static final class IaaSProxyMethodDescriptorSupplier
      extends IaaSProxyBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    IaaSProxyMethodDescriptorSupplier(String methodName) {
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
      synchronized (IaaSProxyGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new IaaSProxyFileDescriptorSupplier())
              .addMethod(getListIaaSRoutersMethod())
              .addMethod(getListIaaSRouterVXNetsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
