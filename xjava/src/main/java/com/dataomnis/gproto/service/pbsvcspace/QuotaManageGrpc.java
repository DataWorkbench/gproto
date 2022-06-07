package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/spacemanager/quota_manage.proto")
public final class QuotaManageGrpc {

  private QuotaManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.QuotaManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota,
      com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota> getDescribeUserQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeUserQuota",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota,
      com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota> getDescribeUserQuotaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota, com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota> getDescribeUserQuotaMethod;
    if ((getDescribeUserQuotaMethod = QuotaManageGrpc.getDescribeUserQuotaMethod) == null) {
      synchronized (QuotaManageGrpc.class) {
        if ((getDescribeUserQuotaMethod = QuotaManageGrpc.getDescribeUserQuotaMethod) == null) {
          QuotaManageGrpc.getDescribeUserQuotaMethod = getDescribeUserQuotaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota, com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeUserQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaManageMethodDescriptorSupplier("DescribeUserQuota"))
              .build();
        }
      }
    }
    return getDescribeUserQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertUserQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertUserQuota",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertUserQuotaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertUserQuotaMethod;
    if ((getUpsertUserQuotaMethod = QuotaManageGrpc.getUpsertUserQuotaMethod) == null) {
      synchronized (QuotaManageGrpc.class) {
        if ((getUpsertUserQuotaMethod = QuotaManageGrpc.getUpsertUserQuotaMethod) == null) {
          QuotaManageGrpc.getUpsertUserQuotaMethod = getUpsertUserQuotaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertUserQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaManageMethodDescriptorSupplier("UpsertUserQuota"))
              .build();
        }
      }
    }
    return getUpsertUserQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota,
      com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota> getDescribeWorkspaceQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeWorkspaceQuota",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota,
      com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota> getDescribeWorkspaceQuotaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota, com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota> getDescribeWorkspaceQuotaMethod;
    if ((getDescribeWorkspaceQuotaMethod = QuotaManageGrpc.getDescribeWorkspaceQuotaMethod) == null) {
      synchronized (QuotaManageGrpc.class) {
        if ((getDescribeWorkspaceQuotaMethod = QuotaManageGrpc.getDescribeWorkspaceQuotaMethod) == null) {
          QuotaManageGrpc.getDescribeWorkspaceQuotaMethod = getDescribeWorkspaceQuotaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota, com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeWorkspaceQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaManageMethodDescriptorSupplier("DescribeWorkspaceQuota"))
              .build();
        }
      }
    }
    return getDescribeWorkspaceQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertWorkspaceQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertWorkspaceQuota",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertWorkspaceQuotaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertWorkspaceQuotaMethod;
    if ((getUpsertWorkspaceQuotaMethod = QuotaManageGrpc.getUpsertWorkspaceQuotaMethod) == null) {
      synchronized (QuotaManageGrpc.class) {
        if ((getUpsertWorkspaceQuotaMethod = QuotaManageGrpc.getUpsertWorkspaceQuotaMethod) == null) {
          QuotaManageGrpc.getUpsertWorkspaceQuotaMethod = getUpsertWorkspaceQuotaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertWorkspaceQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaManageMethodDescriptorSupplier("UpsertWorkspaceQuota"))
              .build();
        }
      }
    }
    return getUpsertWorkspaceQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota,
      com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota> getDescribeMemberQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeMemberQuota",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota,
      com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota> getDescribeMemberQuotaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota, com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota> getDescribeMemberQuotaMethod;
    if ((getDescribeMemberQuotaMethod = QuotaManageGrpc.getDescribeMemberQuotaMethod) == null) {
      synchronized (QuotaManageGrpc.class) {
        if ((getDescribeMemberQuotaMethod = QuotaManageGrpc.getDescribeMemberQuotaMethod) == null) {
          QuotaManageGrpc.getDescribeMemberQuotaMethod = getDescribeMemberQuotaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota, com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeMemberQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaManageMethodDescriptorSupplier("DescribeMemberQuota"))
              .build();
        }
      }
    }
    return getDescribeMemberQuotaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertMemberQuotaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpsertMemberQuota",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertMemberQuotaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpsertMemberQuotaMethod;
    if ((getUpsertMemberQuotaMethod = QuotaManageGrpc.getUpsertMemberQuotaMethod) == null) {
      synchronized (QuotaManageGrpc.class) {
        if ((getUpsertMemberQuotaMethod = QuotaManageGrpc.getUpsertMemberQuotaMethod) == null) {
          QuotaManageGrpc.getUpsertMemberQuotaMethod = getUpsertMemberQuotaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpsertMemberQuota"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new QuotaManageMethodDescriptorSupplier("UpsertMemberQuota"))
              .build();
        }
      }
    }
    return getUpsertMemberQuotaMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static QuotaManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaManageStub>() {
        @java.lang.Override
        public QuotaManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaManageStub(channel, callOptions);
        }
      };
    return QuotaManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static QuotaManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaManageBlockingStub>() {
        @java.lang.Override
        public QuotaManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaManageBlockingStub(channel, callOptions);
        }
      };
    return QuotaManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static QuotaManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<QuotaManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<QuotaManageFutureStub>() {
        @java.lang.Override
        public QuotaManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new QuotaManageFutureStub(channel, callOptions);
        }
      };
    return QuotaManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class QuotaManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void describeUserQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeUserQuotaMethod(), responseObserver);
    }

    /**
     */
    public void upsertUserQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertUserQuotaMethod(), responseObserver);
    }

    /**
     */
    public void describeWorkspaceQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeWorkspaceQuotaMethod(), responseObserver);
    }

    /**
     */
    public void upsertWorkspaceQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertWorkspaceQuotaMethod(), responseObserver);
    }

    /**
     */
    public void describeMemberQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMemberQuotaMethod(), responseObserver);
    }

    /**
     */
    public void upsertMemberQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpsertMemberQuotaMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDescribeUserQuotaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota,
                com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota>(
                  this, METHODID_DESCRIBE_USER_QUOTA)))
          .addMethod(
            getUpsertUserQuotaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPSERT_USER_QUOTA)))
          .addMethod(
            getDescribeWorkspaceQuotaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota,
                com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota>(
                  this, METHODID_DESCRIBE_WORKSPACE_QUOTA)))
          .addMethod(
            getUpsertWorkspaceQuotaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPSERT_WORKSPACE_QUOTA)))
          .addMethod(
            getDescribeMemberQuotaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota,
                com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota>(
                  this, METHODID_DESCRIBE_MEMBER_QUOTA)))
          .addMethod(
            getUpsertMemberQuotaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPSERT_MEMBER_QUOTA)))
          .build();
    }
  }

  /**
   */
  public static final class QuotaManageStub extends io.grpc.stub.AbstractAsyncStub<QuotaManageStub> {
    private QuotaManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaManageStub(channel, callOptions);
    }

    /**
     */
    public void describeUserQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeUserQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsertUserQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertUserQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeWorkspaceQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeWorkspaceQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsertWorkspaceQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertWorkspaceQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeMemberQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMemberQuotaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void upsertMemberQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpsertMemberQuotaMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class QuotaManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<QuotaManageBlockingStub> {
    private QuotaManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota describeUserQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeUserQuotaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct upsertUserQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertUserQuotaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota describeWorkspaceQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeWorkspaceQuotaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct upsertWorkspaceQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertWorkspaceQuotaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota describeMemberQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMemberQuotaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct upsertMemberQuota(com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpsertMemberQuotaMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class QuotaManageFutureStub extends io.grpc.stub.AbstractFutureStub<QuotaManageFutureStub> {
    private QuotaManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected QuotaManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new QuotaManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota> describeUserQuota(
        com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeUserQuotaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> upsertUserQuota(
        com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertUserQuotaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota> describeWorkspaceQuota(
        com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeWorkspaceQuotaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> upsertWorkspaceQuota(
        com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertWorkspaceQuotaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota> describeMemberQuota(
        com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMemberQuotaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> upsertMemberQuota(
        com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpsertMemberQuotaMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DESCRIBE_USER_QUOTA = 0;
  private static final int METHODID_UPSERT_USER_QUOTA = 1;
  private static final int METHODID_DESCRIBE_WORKSPACE_QUOTA = 2;
  private static final int METHODID_UPSERT_WORKSPACE_QUOTA = 3;
  private static final int METHODID_DESCRIBE_MEMBER_QUOTA = 4;
  private static final int METHODID_UPSERT_MEMBER_QUOTA = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final QuotaManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(QuotaManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DESCRIBE_USER_QUOTA:
          serviceImpl.describeUserQuota((com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeUserQuota) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeUserQuota>) responseObserver);
          break;
        case METHODID_UPSERT_USER_QUOTA:
          serviceImpl.upsertUserQuota((com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertUserQuota) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_WORKSPACE_QUOTA:
          serviceImpl.describeWorkspaceQuota((com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeWorkspaceQuota) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeWorkspaceQuota>) responseObserver);
          break;
        case METHODID_UPSERT_WORKSPACE_QUOTA:
          serviceImpl.upsertWorkspaceQuota((com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertWorkspaceQuota) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_MEMBER_QUOTA:
          serviceImpl.describeMemberQuota((com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.DescribeMemberQuota) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseQuotaManage.DescribeMemberQuota>) responseObserver);
          break;
        case METHODID_UPSERT_MEMBER_QUOTA:
          serviceImpl.upsertMemberQuota((com.dataomnis.gproto.types.pbrequest.PBRequestQuotaManage.UpsertMemberQuota) request,
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

  private static abstract class QuotaManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    QuotaManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcQuotaManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("QuotaManage");
    }
  }

  private static final class QuotaManageFileDescriptorSupplier
      extends QuotaManageBaseDescriptorSupplier {
    QuotaManageFileDescriptorSupplier() {}
  }

  private static final class QuotaManageMethodDescriptorSupplier
      extends QuotaManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    QuotaManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (QuotaManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new QuotaManageFileDescriptorSupplier())
              .addMethod(getDescribeUserQuotaMethod())
              .addMethod(getUpsertUserQuotaMethod())
              .addMethod(getDescribeWorkspaceQuotaMethod())
              .addMethod(getUpsertWorkspaceQuotaMethod())
              .addMethod(getDescribeMemberQuotaMethod())
              .addMethod(getUpsertMemberQuotaMethod())
              .build();
        }
      }
    }
    return result;
  }
}
