package com.dataomnis.gproto.service.pbsvcnetworkbroker;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/networkbroker/dataousrce_broker.proto")
public final class DataSourceBrokerGrpc {

  private DataSourceBrokerGrpc() {}

  public static final String SERVICE_NAME = "networkbroker.DataSourceBroker";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker> getPingDataSourceConnectionByBrokerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingDataSourceConnectionByBroker",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker> getPingDataSourceConnectionByBrokerMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker> getPingDataSourceConnectionByBrokerMethod;
    if ((getPingDataSourceConnectionByBrokerMethod = DataSourceBrokerGrpc.getPingDataSourceConnectionByBrokerMethod) == null) {
      synchronized (DataSourceBrokerGrpc.class) {
        if ((getPingDataSourceConnectionByBrokerMethod = DataSourceBrokerGrpc.getPingDataSourceConnectionByBrokerMethod) == null) {
          DataSourceBrokerGrpc.getPingDataSourceConnectionByBrokerMethod = getPingDataSourceConnectionByBrokerMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingDataSourceConnectionByBroker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceBrokerMethodDescriptorSupplier("PingDataSourceConnectionByBroker"))
              .build();
        }
      }
    }
    return getPingDataSourceConnectionByBrokerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> getDescribeDataSourceTablesByBrokerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSourceTablesByBroker",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> getDescribeDataSourceTablesByBrokerMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> getDescribeDataSourceTablesByBrokerMethod;
    if ((getDescribeDataSourceTablesByBrokerMethod = DataSourceBrokerGrpc.getDescribeDataSourceTablesByBrokerMethod) == null) {
      synchronized (DataSourceBrokerGrpc.class) {
        if ((getDescribeDataSourceTablesByBrokerMethod = DataSourceBrokerGrpc.getDescribeDataSourceTablesByBrokerMethod) == null) {
          DataSourceBrokerGrpc.getDescribeDataSourceTablesByBrokerMethod = getDescribeDataSourceTablesByBrokerMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSourceTablesByBroker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceBrokerMethodDescriptorSupplier("DescribeDataSourceTablesByBroker"))
              .build();
        }
      }
    }
    return getDescribeDataSourceTablesByBrokerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> getDescribeDataSourceTableSchemaByBrokerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSourceTableSchemaByBroker",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> getDescribeDataSourceTableSchemaByBrokerMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> getDescribeDataSourceTableSchemaByBrokerMethod;
    if ((getDescribeDataSourceTableSchemaByBrokerMethod = DataSourceBrokerGrpc.getDescribeDataSourceTableSchemaByBrokerMethod) == null) {
      synchronized (DataSourceBrokerGrpc.class) {
        if ((getDescribeDataSourceTableSchemaByBrokerMethod = DataSourceBrokerGrpc.getDescribeDataSourceTableSchemaByBrokerMethod) == null) {
          DataSourceBrokerGrpc.getDescribeDataSourceTableSchemaByBrokerMethod = getDescribeDataSourceTableSchemaByBrokerMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSourceTableSchemaByBroker"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceBrokerMethodDescriptorSupplier("DescribeDataSourceTableSchemaByBroker"))
              .build();
        }
      }
    }
    return getDescribeDataSourceTableSchemaByBrokerMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataSourceBrokerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceBrokerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceBrokerStub>() {
        @java.lang.Override
        public DataSourceBrokerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceBrokerStub(channel, callOptions);
        }
      };
    return DataSourceBrokerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataSourceBrokerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceBrokerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceBrokerBlockingStub>() {
        @java.lang.Override
        public DataSourceBrokerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceBrokerBlockingStub(channel, callOptions);
        }
      };
    return DataSourceBrokerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataSourceBrokerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceBrokerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceBrokerFutureStub>() {
        @java.lang.Override
        public DataSourceBrokerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceBrokerFutureStub(channel, callOptions);
        }
      };
    return DataSourceBrokerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DataSourceBrokerImplBase implements io.grpc.BindableService {

    /**
     */
    public void pingDataSourceConnectionByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingDataSourceConnectionByBrokerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public void describeDataSourceTablesByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceTablesByBrokerMethod(), responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public void describeDataSourceTableSchemaByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceTableSchemaByBrokerMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPingDataSourceConnectionByBrokerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker>(
                  this, METHODID_PING_DATA_SOURCE_CONNECTION_BY_BROKER)))
          .addMethod(
            getDescribeDataSourceTablesByBrokerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables>(
                  this, METHODID_DESCRIBE_DATA_SOURCE_TABLES_BY_BROKER)))
          .addMethod(
            getDescribeDataSourceTableSchemaByBrokerMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema>(
                  this, METHODID_DESCRIBE_DATA_SOURCE_TABLE_SCHEMA_BY_BROKER)))
          .build();
    }
  }

  /**
   */
  public static final class DataSourceBrokerStub extends io.grpc.stub.AbstractAsyncStub<DataSourceBrokerStub> {
    private DataSourceBrokerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceBrokerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceBrokerStub(channel, callOptions);
    }

    /**
     */
    public void pingDataSourceConnectionByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingDataSourceConnectionByBrokerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public void describeDataSourceTablesByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceTablesByBrokerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public void describeDataSourceTableSchemaByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceTableSchemaByBrokerMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataSourceBrokerBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataSourceBrokerBlockingStub> {
    private DataSourceBrokerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceBrokerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceBrokerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker pingDataSourceConnectionByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingDataSourceConnectionByBrokerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables describeDataSourceTablesByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceTablesByBrokerMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema describeDataSourceTableSchemaByBroker(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceTableSchemaByBrokerMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataSourceBrokerFutureStub extends io.grpc.stub.AbstractFutureStub<DataSourceBrokerFutureStub> {
    private DataSourceBrokerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceBrokerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceBrokerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker> pingDataSourceConnectionByBroker(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingDataSourceConnectionByBrokerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> describeDataSourceTablesByBroker(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceTablesByBrokerMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> describeDataSourceTableSchemaByBroker(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceTableSchemaByBrokerMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PING_DATA_SOURCE_CONNECTION_BY_BROKER = 0;
  private static final int METHODID_DESCRIBE_DATA_SOURCE_TABLES_BY_BROKER = 1;
  private static final int METHODID_DESCRIBE_DATA_SOURCE_TABLE_SCHEMA_BY_BROKER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataSourceBrokerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataSourceBrokerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PING_DATA_SOURCE_CONNECTION_BY_BROKER:
          serviceImpl.pingDataSourceConnectionByBroker((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.PingDataSourceConnectionByBroker) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceBroker.PingDataSourceConnectionByBroker>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE_TABLES_BY_BROKER:
          serviceImpl.describeDataSourceTablesByBroker((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTablesByBroker) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE_TABLE_SCHEMA_BY_BROKER:
          serviceImpl.describeDataSourceTableSchemaByBroker((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceBroker.DescribeDataSourceTableSchemaByBroker) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema>) responseObserver);
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

  private static abstract class DataSourceBrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataSourceBrokerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcnetworkbroker.PBSvcDataSourceBroker.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataSourceBroker");
    }
  }

  private static final class DataSourceBrokerFileDescriptorSupplier
      extends DataSourceBrokerBaseDescriptorSupplier {
    DataSourceBrokerFileDescriptorSupplier() {}
  }

  private static final class DataSourceBrokerMethodDescriptorSupplier
      extends DataSourceBrokerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataSourceBrokerMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataSourceBrokerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataSourceBrokerFileDescriptorSupplier())
              .addMethod(getPingDataSourceConnectionByBrokerMethod())
              .addMethod(getDescribeDataSourceTablesByBrokerMethod())
              .addMethod(getDescribeDataSourceTableSchemaByBrokerMethod())
              .build();
        }
      }
    }
    return result;
  }
}
