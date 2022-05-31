package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/network_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class NetworkManageGrpc {

  private NetworkManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.NetworkManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork,
      com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork> getCreateNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNetwork",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork,
      com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork> getCreateNetworkMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork, com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork> getCreateNetworkMethod;
    if ((getCreateNetworkMethod = NetworkManageGrpc.getCreateNetworkMethod) == null) {
      synchronized (NetworkManageGrpc.class) {
        if ((getCreateNetworkMethod = NetworkManageGrpc.getCreateNetworkMethod) == null) {
          NetworkManageGrpc.getCreateNetworkMethod = getCreateNetworkMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork, com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkManageMethodDescriptorSupplier("CreateNetwork"))
              .build();
        }
      }
    }
    return getCreateNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks,
      com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks> getListNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNetworks",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks,
      com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks> getListNetworksMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks, com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks> getListNetworksMethod;
    if ((getListNetworksMethod = NetworkManageGrpc.getListNetworksMethod) == null) {
      synchronized (NetworkManageGrpc.class) {
        if ((getListNetworksMethod = NetworkManageGrpc.getListNetworksMethod) == null) {
          NetworkManageGrpc.getListNetworksMethod = getListNetworksMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks, com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkManageMethodDescriptorSupplier("ListNetworks"))
              .build();
        }
      }
    }
    return getListNetworksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork,
      com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork> getDescribeNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeNetwork",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork,
      com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork> getDescribeNetworkMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork, com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork> getDescribeNetworkMethod;
    if ((getDescribeNetworkMethod = NetworkManageGrpc.getDescribeNetworkMethod) == null) {
      synchronized (NetworkManageGrpc.class) {
        if ((getDescribeNetworkMethod = NetworkManageGrpc.getDescribeNetworkMethod) == null) {
          NetworkManageGrpc.getDescribeNetworkMethod = getDescribeNetworkMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork, com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkManageMethodDescriptorSupplier("DescribeNetwork"))
              .build();
        }
      }
    }
    return getDescribeNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNetwork",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateNetworkMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateNetworkMethod;
    if ((getUpdateNetworkMethod = NetworkManageGrpc.getUpdateNetworkMethod) == null) {
      synchronized (NetworkManageGrpc.class) {
        if ((getUpdateNetworkMethod = NetworkManageGrpc.getUpdateNetworkMethod) == null) {
          NetworkManageGrpc.getUpdateNetworkMethod = getUpdateNetworkMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkManageMethodDescriptorSupplier("UpdateNetwork"))
              .build();
        }
      }
    }
    return getUpdateNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNetworks",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworksMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworksMethod;
    if ((getDeleteNetworksMethod = NetworkManageGrpc.getDeleteNetworksMethod) == null) {
      synchronized (NetworkManageGrpc.class) {
        if ((getDeleteNetworksMethod = NetworkManageGrpc.getDeleteNetworksMethod) == null) {
          NetworkManageGrpc.getDeleteNetworksMethod = getDeleteNetworksMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new NetworkManageMethodDescriptorSupplier("DeleteNetworks"))
              .build();
        }
      }
    }
    return getDeleteNetworksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NetworkManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkManageStub>() {
        @java.lang.Override
        public NetworkManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkManageStub(channel, callOptions);
        }
      };
    return NetworkManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NetworkManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkManageBlockingStub>() {
        @java.lang.Override
        public NetworkManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkManageBlockingStub(channel, callOptions);
        }
      };
    return NetworkManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NetworkManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NetworkManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NetworkManageFutureStub>() {
        @java.lang.Override
        public NetworkManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NetworkManageFutureStub(channel, callOptions);
        }
      };
    return NetworkManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NetworkManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public void createNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNetworkMethod(), responseObserver);
    }

    /**
     */
    public void listNetworks(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNetworksMethod(), responseObserver);
    }

    /**
     */
    public void describeNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeNetworkMethod(), responseObserver);
    }

    /**
     */
    public void updateNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNetworkMethod(), responseObserver);
    }

    /**
     */
    public void deleteNetworks(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNetworksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork,
                com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork>(
                  this, METHODID_CREATE_NETWORK)))
          .addMethod(
            getListNetworksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks,
                com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks>(
                  this, METHODID_LIST_NETWORKS)))
          .addMethod(
            getDescribeNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork,
                com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork>(
                  this, METHODID_DESCRIBE_NETWORK)))
          .addMethod(
            getUpdateNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_NETWORK)))
          .addMethod(
            getDeleteNetworksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_NETWORKS)))
          .build();
    }
  }

  /**
   */
  public static final class NetworkManageStub extends io.grpc.stub.AbstractAsyncStub<NetworkManageStub> {
    private NetworkManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public void createNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNetworks(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNetworks(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNetworksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NetworkManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<NetworkManageBlockingStub> {
    private NetworkManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork createNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks listNetworks(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNetworksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork describeNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateNetwork(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteNetworks(com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNetworksMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NetworkManageFutureStub extends io.grpc.stub.AbstractFutureStub<NetworkManageFutureStub> {
    private NetworkManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NetworkManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NetworkManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork> createNetwork(
        com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks> listNetworks(
        com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork> describeNetwork(
        com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateNetwork(
        com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteNetworks(
        com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNetworksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_NETWORK = 0;
  private static final int METHODID_LIST_NETWORKS = 1;
  private static final int METHODID_DESCRIBE_NETWORK = 2;
  private static final int METHODID_UPDATE_NETWORK = 3;
  private static final int METHODID_DELETE_NETWORKS = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NetworkManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NetworkManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_NETWORK:
          serviceImpl.createNetwork((com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.CreateNetwork) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.CreateNetwork>) responseObserver);
          break;
        case METHODID_LIST_NETWORKS:
          serviceImpl.listNetworks((com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.ListNetworks) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.ListNetworks>) responseObserver);
          break;
        case METHODID_DESCRIBE_NETWORK:
          serviceImpl.describeNetwork((com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DescribeNetwork) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseNetworkManage.DescribeNetwork>) responseObserver);
          break;
        case METHODID_UPDATE_NETWORK:
          serviceImpl.updateNetwork((com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.UpdateNetwork) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_NETWORKS:
          serviceImpl.deleteNetworks((com.dataomnis.gproto.types.pbrequest.PBRequestNetworkManage.DeleteNetworks) request,
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

  private static abstract class NetworkManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NetworkManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcNetworkManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NetworkManage");
    }
  }

  private static final class NetworkManageFileDescriptorSupplier
      extends NetworkManageBaseDescriptorSupplier {
    NetworkManageFileDescriptorSupplier() {}
  }

  private static final class NetworkManageMethodDescriptorSupplier
      extends NetworkManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NetworkManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (NetworkManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NetworkManageFileDescriptorSupplier())
              .addMethod(getCreateNetworkMethod())
              .addMethod(getListNetworksMethod())
              .addMethod(getDescribeNetworkMethod())
              .addMethod(getUpdateNetworkMethod())
              .addMethod(getDeleteNetworksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
