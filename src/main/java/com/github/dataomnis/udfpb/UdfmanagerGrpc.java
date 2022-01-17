package com.github.dataomnis.udfpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/udfmanager.proto")
public final class UdfmanagerGrpc {

  private UdfmanagerGrpc() {}

  public static final String SERVICE_NAME = "udfpb.Udfmanager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateUDF,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.github.dataomnis.requestpb.RequestPB.CreateUDF.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateUDF,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateUDF, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMethod;
    if ((getCreateMethod = UdfmanagerGrpc.getCreateMethod) == null) {
      synchronized (UdfmanagerGrpc.class) {
        if ((getCreateMethod = UdfmanagerGrpc.getCreateMethod) == null) {
          UdfmanagerGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.CreateUDF, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.CreateUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfmanagerMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateUDF,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.github.dataomnis.requestpb.RequestPB.UpdateUDF.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateUDF,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateUDF, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMethod;
    if ((getUpdateMethod = UdfmanagerGrpc.getUpdateMethod) == null) {
      synchronized (UdfmanagerGrpc.class) {
        if ((getUpdateMethod = UdfmanagerGrpc.getUpdateMethod) == null) {
          UdfmanagerGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UpdateUDF, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UpdateUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfmanagerMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeUDF,
      com.github.dataomnis.responsepb.ResponsePB.DescribeUDF> getDescribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Describe",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeUDF.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeUDF.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeUDF,
      com.github.dataomnis.responsepb.ResponsePB.DescribeUDF> getDescribeMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeUDF, com.github.dataomnis.responsepb.ResponsePB.DescribeUDF> getDescribeMethod;
    if ((getDescribeMethod = UdfmanagerGrpc.getDescribeMethod) == null) {
      synchronized (UdfmanagerGrpc.class) {
        if ((getDescribeMethod = UdfmanagerGrpc.getDescribeMethod) == null) {
          UdfmanagerGrpc.getDescribeMethod = getDescribeMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeUDF, com.github.dataomnis.responsepb.ResponsePB.DescribeUDF>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Describe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeUDF.getDefaultInstance()))
              .setSchemaDescriptor(new UdfmanagerMethodDescriptorSupplier("Describe"))
              .build();
        }
      }
    }
    return getDescribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteUDF,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteUDF.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteUDF,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteUDF, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMethod;
    if ((getDeleteMethod = UdfmanagerGrpc.getDeleteMethod) == null) {
      synchronized (UdfmanagerGrpc.class) {
        if ((getDeleteMethod = UdfmanagerGrpc.getDeleteMethod) == null) {
          UdfmanagerGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteUDF, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfmanagerMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAll",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteAllMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteAllMethod;
    if ((getDeleteAllMethod = UdfmanagerGrpc.getDeleteAllMethod) == null) {
      synchronized (UdfmanagerGrpc.class) {
        if ((getDeleteAllMethod = UdfmanagerGrpc.getDeleteAllMethod) == null) {
          UdfmanagerGrpc.getDeleteAllMethod = getDeleteAllMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new UdfmanagerMethodDescriptorSupplier("DeleteAll"))
              .build();
        }
      }
    }
    return getDeleteAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListUDF,
      com.github.dataomnis.responsepb.ResponsePB.ListUDF> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListUDF.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListUDF.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListUDF,
      com.github.dataomnis.responsepb.ResponsePB.ListUDF> getListMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListUDF, com.github.dataomnis.responsepb.ResponsePB.ListUDF> getListMethod;
    if ((getListMethod = UdfmanagerGrpc.getListMethod) == null) {
      synchronized (UdfmanagerGrpc.class) {
        if ((getListMethod = UdfmanagerGrpc.getListMethod) == null) {
          UdfmanagerGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListUDF, com.github.dataomnis.responsepb.ResponsePB.ListUDF>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListUDF.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListUDF.getDefaultInstance()))
              .setSchemaDescriptor(new UdfmanagerMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getCommonFuncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CommonFunc",
      requestType = com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getCommonFuncMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc, com.github.dataomnis.responsepb.ResponsePB.JsonList> getCommonFuncMethod;
    if ((getCommonFuncMethod = UdfmanagerGrpc.getCommonFuncMethod) == null) {
      synchronized (UdfmanagerGrpc.class) {
        if ((getCommonFuncMethod = UdfmanagerGrpc.getCommonFuncMethod) == null) {
          UdfmanagerGrpc.getCommonFuncMethod = getCommonFuncMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc, com.github.dataomnis.responsepb.ResponsePB.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CommonFunc"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new UdfmanagerMethodDescriptorSupplier("CommonFunc"))
              .build();
        }
      }
    }
    return getCommonFuncMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UdfmanagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UdfmanagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UdfmanagerStub>() {
        @java.lang.Override
        public UdfmanagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UdfmanagerStub(channel, callOptions);
        }
      };
    return UdfmanagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UdfmanagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UdfmanagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UdfmanagerBlockingStub>() {
        @java.lang.Override
        public UdfmanagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UdfmanagerBlockingStub(channel, callOptions);
        }
      };
    return UdfmanagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UdfmanagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UdfmanagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UdfmanagerFutureStub>() {
        @java.lang.Override
        public UdfmanagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UdfmanagerFutureStub(channel, callOptions);
        }
      };
    return UdfmanagerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UdfmanagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(com.github.dataomnis.requestpb.RequestPB.CreateUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.github.dataomnis.requestpb.RequestPB.UpdateUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void describe(com.github.dataomnis.requestpb.RequestPB.DescribeUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeUDF> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.github.dataomnis.requestpb.RequestPB.DeleteUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deleteAll(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllMethod(), responseObserver);
    }

    /**
     */
    public void list(com.github.dataomnis.requestpb.RequestPB.ListUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListUDF> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void commonFunc(com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCommonFuncMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.CreateUDF,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UpdateUDF,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDescribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeUDF,
                com.github.dataomnis.responsepb.ResponsePB.DescribeUDF>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteUDF,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE)))
          .addMethod(
            getDeleteAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_ALL)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListUDF,
                com.github.dataomnis.responsepb.ResponsePB.ListUDF>(
                  this, METHODID_LIST)))
          .addMethod(
            getCommonFuncMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc,
                com.github.dataomnis.responsepb.ResponsePB.JsonList>(
                  this, METHODID_COMMON_FUNC)))
          .build();
    }
  }

  /**
   */
  public static final class UdfmanagerStub extends io.grpc.stub.AbstractAsyncStub<UdfmanagerStub> {
    private UdfmanagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UdfmanagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UdfmanagerStub(channel, callOptions);
    }

    /**
     */
    public void create(com.github.dataomnis.requestpb.RequestPB.CreateUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.github.dataomnis.requestpb.RequestPB.UpdateUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.github.dataomnis.requestpb.RequestPB.DescribeUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeUDF> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.github.dataomnis.requestpb.RequestPB.DeleteUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAll(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.github.dataomnis.requestpb.RequestPB.ListUDF request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListUDF> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void commonFunc(com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCommonFuncMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UdfmanagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<UdfmanagerBlockingStub> {
    private UdfmanagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UdfmanagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UdfmanagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct create(com.github.dataomnis.requestpb.RequestPB.CreateUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct update(com.github.dataomnis.requestpb.RequestPB.UpdateUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeUDF describe(com.github.dataomnis.requestpb.RequestPB.DescribeUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct delete(com.github.dataomnis.requestpb.RequestPB.DeleteUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteAll(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListUDF list(com.github.dataomnis.requestpb.RequestPB.ListUDF request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.JsonList commonFunc(com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCommonFuncMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UdfmanagerFutureStub extends io.grpc.stub.AbstractFutureStub<UdfmanagerFutureStub> {
    private UdfmanagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UdfmanagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UdfmanagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> create(
        com.github.dataomnis.requestpb.RequestPB.CreateUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> update(
        com.github.dataomnis.requestpb.RequestPB.UpdateUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeUDF> describe(
        com.github.dataomnis.requestpb.RequestPB.DescribeUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> delete(
        com.github.dataomnis.requestpb.RequestPB.DeleteUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteAll(
        com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListUDF> list(
        com.github.dataomnis.requestpb.RequestPB.ListUDF request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.JsonList> commonFunc(
        com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc request) {
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
    private final UdfmanagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UdfmanagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((com.github.dataomnis.requestpb.RequestPB.CreateUDF) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.github.dataomnis.requestpb.RequestPB.UpdateUDF) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.github.dataomnis.requestpb.RequestPB.DescribeUDF) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeUDF>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.github.dataomnis.requestpb.RequestPB.DeleteUDF) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_ALL:
          serviceImpl.deleteAll((com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.github.dataomnis.requestpb.RequestPB.ListUDF) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListUDF>) responseObserver);
          break;
        case METHODID_COMMON_FUNC:
          serviceImpl.commonFunc((com.github.dataomnis.requestpb.RequestPB.UDFCommonFunc) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList>) responseObserver);
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

  private static abstract class UdfmanagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UdfmanagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.dataomnis.udfpb.UdfPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Udfmanager");
    }
  }

  private static final class UdfmanagerFileDescriptorSupplier
      extends UdfmanagerBaseDescriptorSupplier {
    UdfmanagerFileDescriptorSupplier() {}
  }

  private static final class UdfmanagerMethodDescriptorSupplier
      extends UdfmanagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UdfmanagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (UdfmanagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UdfmanagerFileDescriptorSupplier())
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
