package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/spacemanager/opaudit_manage.proto")
public final class OpAuditManageGrpc {

  private OpAuditManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.OpAuditManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits,
      com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits> getListOpAuditsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListOpAudits",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits,
      com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits> getListOpAuditsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits, com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits> getListOpAuditsMethod;
    if ((getListOpAuditsMethod = OpAuditManageGrpc.getListOpAuditsMethod) == null) {
      synchronized (OpAuditManageGrpc.class) {
        if ((getListOpAuditsMethod = OpAuditManageGrpc.getListOpAuditsMethod) == null) {
          OpAuditManageGrpc.getListOpAuditsMethod = getListOpAuditsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits, com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListOpAudits"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits.getDefaultInstance()))
              .setSchemaDescriptor(new OpAuditManageMethodDescriptorSupplier("ListOpAudits"))
              .build();
        }
      }
    }
    return getListOpAuditsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddOpAuditMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddOpAudit",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddOpAuditMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddOpAuditMethod;
    if ((getAddOpAuditMethod = OpAuditManageGrpc.getAddOpAuditMethod) == null) {
      synchronized (OpAuditManageGrpc.class) {
        if ((getAddOpAuditMethod = OpAuditManageGrpc.getAddOpAuditMethod) == null) {
          OpAuditManageGrpc.getAddOpAuditMethod = getAddOpAuditMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddOpAudit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new OpAuditManageMethodDescriptorSupplier("AddOpAudit"))
              .build();
        }
      }
    }
    return getAddOpAuditMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OpAuditManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpAuditManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpAuditManageStub>() {
        @java.lang.Override
        public OpAuditManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpAuditManageStub(channel, callOptions);
        }
      };
    return OpAuditManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OpAuditManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpAuditManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpAuditManageBlockingStub>() {
        @java.lang.Override
        public OpAuditManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpAuditManageBlockingStub(channel, callOptions);
        }
      };
    return OpAuditManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OpAuditManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OpAuditManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OpAuditManageFutureStub>() {
        @java.lang.Override
        public OpAuditManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OpAuditManageFutureStub(channel, callOptions);
        }
      };
    return OpAuditManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OpAuditManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public void listOpAudits(com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListOpAuditsMethod(), responseObserver);
    }

    /**
     */
    public void addOpAudit(com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddOpAuditMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListOpAuditsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits,
                com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits>(
                  this, METHODID_LIST_OP_AUDITS)))
          .addMethod(
            getAddOpAuditMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ADD_OP_AUDIT)))
          .build();
    }
  }

  /**
   */
  public static final class OpAuditManageStub extends io.grpc.stub.AbstractAsyncStub<OpAuditManageStub> {
    private OpAuditManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpAuditManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpAuditManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public void listOpAudits(com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListOpAuditsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addOpAudit(com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddOpAuditMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OpAuditManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<OpAuditManageBlockingStub> {
    private OpAuditManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpAuditManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpAuditManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits listOpAudits(com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListOpAuditsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct addOpAudit(com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddOpAuditMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OpAuditManageFutureStub extends io.grpc.stub.AbstractFutureStub<OpAuditManageFutureStub> {
    private OpAuditManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OpAuditManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OpAuditManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * API of workspace operation audit log.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits> listOpAudits(
        com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListOpAuditsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> addOpAudit(
        com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddOpAuditMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_OP_AUDITS = 0;
  private static final int METHODID_ADD_OP_AUDIT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OpAuditManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OpAuditManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_OP_AUDITS:
          serviceImpl.listOpAudits((com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.ListOpAudits) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseOpAuditManage.ListOpAudits>) responseObserver);
          break;
        case METHODID_ADD_OP_AUDIT:
          serviceImpl.addOpAudit((com.dataomnis.gproto.types.pbrequest.PBRequestOpAuditManage.AddOpAudit) request,
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

  private static abstract class OpAuditManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OpAuditManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcOpAuditManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OpAuditManage");
    }
  }

  private static final class OpAuditManageFileDescriptorSupplier
      extends OpAuditManageBaseDescriptorSupplier {
    OpAuditManageFileDescriptorSupplier() {}
  }

  private static final class OpAuditManageMethodDescriptorSupplier
      extends OpAuditManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OpAuditManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (OpAuditManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OpAuditManageFileDescriptorSupplier())
              .addMethod(getListOpAuditsMethod())
              .addMethod(getAddOpAuditMethod())
              .build();
        }
      }
    }
    return result;
  }
}
