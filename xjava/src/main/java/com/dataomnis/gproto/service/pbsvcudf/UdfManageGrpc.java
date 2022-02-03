package com.dataomnis.gproto.service.pbsvcudf;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/udfmanager/udf_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class UdfManageGrpc {

  private UdfManageGrpc() {}

  public static final String SERVICE_NAME = "udfmanager.UdfManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateMethod;
    if ((getCreateMethod = UdfManageGrpc.getCreateMethod) == null) {
      synchronized (UdfManageGrpc.class) {
        if ((getCreateMethod = UdfManageGrpc.getCreateMethod) == null) {
          UdfManageGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfManageMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMethod;
    if ((getUpdateMethod = UdfManageGrpc.getUpdateMethod) == null) {
      synchronized (UdfManageGrpc.class) {
        if ((getUpdateMethod = UdfManageGrpc.getUpdateMethod) == null) {
          UdfManageGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfManageMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> getDescribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Describe",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> getDescribeMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> getDescribeMethod;
    if ((getDescribeMethod = UdfManageGrpc.getDescribeMethod) == null) {
      synchronized (UdfManageGrpc.class) {
        if ((getDescribeMethod = UdfManageGrpc.getDescribeMethod) == null) {
          UdfManageGrpc.getDescribeMethod = getDescribeMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Describe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF.getDefaultInstance()))
              .setSchemaDescriptor(new UdfManageMethodDescriptorSupplier("Describe"))
              .build();
        }
      }
    }
    return getDescribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMethod;
    if ((getDeleteMethod = UdfManageGrpc.getDeleteMethod) == null) {
      synchronized (UdfManageGrpc.class) {
        if ((getDeleteMethod = UdfManageGrpc.getDeleteMethod) == null) {
          UdfManageGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfManageMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAll",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAllMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAllMethod;
    if ((getDeleteAllMethod = UdfManageGrpc.getDeleteAllMethod) == null) {
      synchronized (UdfManageGrpc.class) {
        if ((getDeleteAllMethod = UdfManageGrpc.getDeleteAllMethod) == null) {
          UdfManageGrpc.getDeleteAllMethod = getDeleteAllMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfManageMethodDescriptorSupplier("DeleteAll"))
              .build();
        }
      }
    }
    return getDeleteAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF> getListMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF> getListMethod;
    if ((getListMethod = UdfManageGrpc.getListMethod) == null) {
      synchronized (UdfManageGrpc.class) {
        if ((getListMethod = UdfManageGrpc.getListMethod) == null) {
          UdfManageGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF.getDefaultInstance()))
              .setSchemaDescriptor(new UdfManageMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList> getCommonFuncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommonFunc",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc,
      com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList> getCommonFuncMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList> getCommonFuncMethod;
    if ((getCommonFuncMethod = UdfManageGrpc.getCommonFuncMethod) == null) {
      synchronized (UdfManageGrpc.class) {
        if ((getCommonFuncMethod = UdfManageGrpc.getCommonFuncMethod) == null) {
          UdfManageGrpc.getCommonFuncMethod = getCommonFuncMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc, com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommonFunc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new UdfManageMethodDescriptorSupplier("CommonFunc"))
              .build();
        }
      }
    }
    return getCommonFuncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UdfManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UdfManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UdfManageStub>() {
        @java.lang.Override
        public UdfManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UdfManageStub(channel, callOptions);
        }
      };
    return UdfManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UdfManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UdfManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UdfManageBlockingStub>() {
        @java.lang.Override
        public UdfManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UdfManageBlockingStub(channel, callOptions);
        }
      };
    return UdfManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UdfManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UdfManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UdfManageFutureStub>() {
        @java.lang.Override
        public UdfManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UdfManageFutureStub(channel, callOptions);
        }
      };
    return UdfManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UdfManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void describe(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deleteAll(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllMethod(), responseObserver);
    }

    /**
     */
    public void list(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void commonFunc(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommonFuncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDescribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF,
                com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE)))
          .addMethod(
            getDeleteAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_ALL)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF,
                com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF>(
                  this, METHODID_LIST)))
          .addMethod(
            getCommonFuncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc,
                com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList>(
                  this, METHODID_COMMON_FUNC)))
          .build();
    }
  }

  /**
   */
  public static final class UdfManageStub extends io.grpc.stub.AbstractAsyncStub<UdfManageStub> {
    private UdfManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UdfManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UdfManageStub(channel, callOptions);
    }

    /**
     */
    public void create(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAll(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commonFunc(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommonFuncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UdfManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<UdfManageBlockingStub> {
    private UdfManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UdfManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UdfManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct create(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct update(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF describe(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct delete(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteAll(com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF list(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList commonFunc(com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommonFuncMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UdfManageFutureStub extends io.grpc.stub.AbstractFutureStub<UdfManageFutureStub> {
    private UdfManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UdfManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UdfManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> create(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> update(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF> describe(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> delete(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteAll(
        com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF> list(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList> commonFunc(
        com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCommonFuncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DESCRIBE = 2;
  private static final int METHODID_DELETE = 3;
  private static final int METHODID_DELETE_ALL = 4;
  private static final int METHODID_LIST = 5;
  private static final int METHODID_COMMON_FUNC = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UdfManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UdfManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.CreateUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UpdateUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DescribeUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.DescribeUDF>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.DeleteUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_ALL:
          serviceImpl.deleteAll((com.dataomnis.gproto.types.pbrequest.PBRequestSpaceManage.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.ListUDF) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.ListUDF>) responseObserver);
          break;
        case METHODID_COMMON_FUNC:
          serviceImpl.commonFunc((com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.UDFCommonFunc) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.JsonList>) responseObserver);
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

  private static abstract class UdfManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UdfManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcudf.PBSvcUDFManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UdfManage");
    }
  }

  private static final class UdfManageFileDescriptorSupplier
      extends UdfManageBaseDescriptorSupplier {
    UdfManageFileDescriptorSupplier() {}
  }

  private static final class UdfManageMethodDescriptorSupplier
      extends UdfManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UdfManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (UdfManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UdfManageFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDescribeMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDeleteAllMethod())
              .addMethod(getListMethod())
              .addMethod(getCommonFuncMethod())
              .build();
        }
      }
    }
    return result;
  }
}
