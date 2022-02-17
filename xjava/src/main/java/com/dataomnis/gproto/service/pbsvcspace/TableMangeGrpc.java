package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * TableMange for manage flink table.
 * NOTICE: Unused on present.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/table_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class TableMangeGrpc {

  private TableMangeGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.TableMange";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables,
      com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables> getListFlinkTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlinkTables",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables,
      com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables> getListFlinkTablesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables, com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables> getListFlinkTablesMethod;
    if ((getListFlinkTablesMethod = TableMangeGrpc.getListFlinkTablesMethod) == null) {
      synchronized (TableMangeGrpc.class) {
        if ((getListFlinkTablesMethod = TableMangeGrpc.getListFlinkTablesMethod) == null) {
          TableMangeGrpc.getListFlinkTablesMethod = getListFlinkTablesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables, com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlinkTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables.getDefaultInstance()))
              .setSchemaDescriptor(new TableMangeMethodDescriptorSupplier("ListFlinkTables"))
              .build();
        }
      }
    }
    return getListFlinkTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlinkTable",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkTableMethod;
    if ((getCreateFlinkTableMethod = TableMangeGrpc.getCreateFlinkTableMethod) == null) {
      synchronized (TableMangeGrpc.class) {
        if ((getCreateFlinkTableMethod = TableMangeGrpc.getCreateFlinkTableMethod) == null) {
          TableMangeGrpc.getCreateFlinkTableMethod = getCreateFlinkTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlinkTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new TableMangeMethodDescriptorSupplier("CreateFlinkTable"))
              .build();
        }
      }
    }
    return getCreateFlinkTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable,
      com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable> getDescribeFlinkTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkTable",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable,
      com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable> getDescribeFlinkTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable, com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable> getDescribeFlinkTableMethod;
    if ((getDescribeFlinkTableMethod = TableMangeGrpc.getDescribeFlinkTableMethod) == null) {
      synchronized (TableMangeGrpc.class) {
        if ((getDescribeFlinkTableMethod = TableMangeGrpc.getDescribeFlinkTableMethod) == null) {
          TableMangeGrpc.getDescribeFlinkTableMethod = getDescribeFlinkTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable, com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable.getDefaultInstance()))
              .setSchemaDescriptor(new TableMangeMethodDescriptorSupplier("DescribeFlinkTable"))
              .build();
        }
      }
    }
    return getDescribeFlinkTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlinkTable",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkTableMethod;
    if ((getUpdateFlinkTableMethod = TableMangeGrpc.getUpdateFlinkTableMethod) == null) {
      synchronized (TableMangeGrpc.class) {
        if ((getUpdateFlinkTableMethod = TableMangeGrpc.getUpdateFlinkTableMethod) == null) {
          TableMangeGrpc.getUpdateFlinkTableMethod = getUpdateFlinkTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFlinkTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new TableMangeMethodDescriptorSupplier("UpdateFlinkTable"))
              .build();
        }
      }
    }
    return getUpdateFlinkTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkTables",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkTablesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkTablesMethod;
    if ((getDeleteFlinkTablesMethod = TableMangeGrpc.getDeleteFlinkTablesMethod) == null) {
      synchronized (TableMangeGrpc.class) {
        if ((getDeleteFlinkTablesMethod = TableMangeGrpc.getDeleteFlinkTablesMethod) == null) {
          TableMangeGrpc.getDeleteFlinkTablesMethod = getDeleteFlinkTablesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new TableMangeMethodDescriptorSupplier("DeleteFlinkTables"))
              .build();
        }
      }
    }
    return getDeleteFlinkTablesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TableMangeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableMangeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableMangeStub>() {
        @java.lang.Override
        public TableMangeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableMangeStub(channel, callOptions);
        }
      };
    return TableMangeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TableMangeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableMangeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableMangeBlockingStub>() {
        @java.lang.Override
        public TableMangeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableMangeBlockingStub(channel, callOptions);
        }
      };
    return TableMangeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TableMangeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TableMangeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TableMangeFutureStub>() {
        @java.lang.Override
        public TableMangeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TableMangeFutureStub(channel, callOptions);
        }
      };
    return TableMangeFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * TableMange for manage flink table.
   * NOTICE: Unused on present.
   * </pre>
   */
  public static abstract class TableMangeImplBase implements io.grpc.BindableService {

    /**
     */
    public void listFlinkTables(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlinkTablesMethod(), responseObserver);
    }

    /**
     */
    public void createFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlinkTableMethod(), responseObserver);
    }

    /**
     */
    public void describeFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkTableMethod(), responseObserver);
    }

    /**
     */
    public void updateFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlinkTableMethod(), responseObserver);
    }

    /**
     */
    public void deleteFlinkTables(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkTablesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListFlinkTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables,
                com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables>(
                  this, METHODID_LIST_FLINK_TABLES)))
          .addMethod(
            getCreateFlinkTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_FLINK_TABLE)))
          .addMethod(
            getDescribeFlinkTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable,
                com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable>(
                  this, METHODID_DESCRIBE_FLINK_TABLE)))
          .addMethod(
            getUpdateFlinkTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_FLINK_TABLE)))
          .addMethod(
            getDeleteFlinkTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_TABLES)))
          .build();
    }
  }

  /**
   * <pre>
   * TableMange for manage flink table.
   * NOTICE: Unused on present.
   * </pre>
   */
  public static final class TableMangeStub extends io.grpc.stub.AbstractAsyncStub<TableMangeStub> {
    private TableMangeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableMangeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableMangeStub(channel, callOptions);
    }

    /**
     */
    public void listFlinkTables(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlinkTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlinkTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlinkTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlinkTables(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkTablesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * TableMange for manage flink table.
   * NOTICE: Unused on present.
   * </pre>
   */
  public static final class TableMangeBlockingStub extends io.grpc.stub.AbstractBlockingStub<TableMangeBlockingStub> {
    private TableMangeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableMangeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableMangeBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables listFlinkTables(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlinkTablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlinkTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable describeFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateFlinkTable(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlinkTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFlinkTables(com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkTablesMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * TableMange for manage flink table.
   * NOTICE: Unused on present.
   * </pre>
   */
  public static final class TableMangeFutureStub extends io.grpc.stub.AbstractFutureStub<TableMangeFutureStub> {
    private TableMangeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TableMangeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TableMangeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables> listFlinkTables(
        com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlinkTablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createFlinkTable(
        com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlinkTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable> describeFlinkTable(
        com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateFlinkTable(
        com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlinkTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFlinkTables(
        com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlinkTablesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_FLINK_TABLES = 0;
  private static final int METHODID_CREATE_FLINK_TABLE = 1;
  private static final int METHODID_DESCRIBE_FLINK_TABLE = 2;
  private static final int METHODID_UPDATE_FLINK_TABLE = 3;
  private static final int METHODID_DELETE_FLINK_TABLES = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TableMangeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TableMangeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_FLINK_TABLES:
          serviceImpl.listFlinkTables((com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.ListFlinkTables) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.ListFlinkTables>) responseObserver);
          break;
        case METHODID_CREATE_FLINK_TABLE:
          serviceImpl.createFlinkTable((com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.CreateFlinkTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_TABLE:
          serviceImpl.describeFlinkTable((com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DescribeFlinkTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseTableManage.DescribeFlinkTable>) responseObserver);
          break;
        case METHODID_UPDATE_FLINK_TABLE:
          serviceImpl.updateFlinkTable((com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.UpdateFlinkTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_TABLES:
          serviceImpl.deleteFlinkTables((com.dataomnis.gproto.types.pbrequest.PBRequestTableManage.DeleteFlinkTables) request,
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

  private static abstract class TableMangeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TableMangeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcTableManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TableMange");
    }
  }

  private static final class TableMangeFileDescriptorSupplier
      extends TableMangeBaseDescriptorSupplier {
    TableMangeFileDescriptorSupplier() {}
  }

  private static final class TableMangeMethodDescriptorSupplier
      extends TableMangeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TableMangeMethodDescriptorSupplier(String methodName) {
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
      synchronized (TableMangeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TableMangeFileDescriptorSupplier())
              .addMethod(getListFlinkTablesMethod())
              .addMethod(getCreateFlinkTableMethod())
              .addMethod(getDescribeFlinkTableMethod())
              .addMethod(getUpdateFlinkTableMethod())
              .addMethod(getDeleteFlinkTablesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
