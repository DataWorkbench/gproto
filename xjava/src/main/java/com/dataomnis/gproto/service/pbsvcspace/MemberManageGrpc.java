package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * MemberManage declares API for manage member and role of member.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/member_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MemberManageGrpc {

  private MemberManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.MemberManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers,
      com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMembers",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers,
      com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers> getListMembersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers, com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers> getListMembersMethod;
    if ((getListMembersMethod = MemberManageGrpc.getListMembersMethod) == null) {
      synchronized (MemberManageGrpc.class) {
        if ((getListMembersMethod = MemberManageGrpc.getListMembersMethod) == null) {
          MemberManageGrpc.getListMembersMethod = getListMembersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers, com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers.getDefaultInstance()))
              .setSchemaDescriptor(new MemberManageMethodDescriptorSupplier("ListMembers"))
              .build();
        }
      }
    }
    return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMembers",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMembersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMembersMethod;
    if ((getDeleteMembersMethod = MemberManageGrpc.getDeleteMembersMethod) == null) {
      synchronized (MemberManageGrpc.class) {
        if ((getDeleteMembersMethod = MemberManageGrpc.getDeleteMembersMethod) == null) {
          MemberManageGrpc.getDeleteMembersMethod = getDeleteMembersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MemberManageMethodDescriptorSupplier("DeleteMembers"))
              .build();
        }
      }
    }
    return getDeleteMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddMembers",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddMembersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddMembersMethod;
    if ((getAddMembersMethod = MemberManageGrpc.getAddMembersMethod) == null) {
      synchronized (MemberManageGrpc.class) {
        if ((getAddMembersMethod = MemberManageGrpc.getAddMembersMethod) == null) {
          MemberManageGrpc.getAddMembersMethod = getAddMembersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MemberManageMethodDescriptorSupplier("AddMembers"))
              .build();
        }
      }
    }
    return getAddMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMember",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMemberMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMemberMethod;
    if ((getUpdateMemberMethod = MemberManageGrpc.getUpdateMemberMethod) == null) {
      synchronized (MemberManageGrpc.class) {
        if ((getUpdateMemberMethod = MemberManageGrpc.getUpdateMemberMethod) == null) {
          MemberManageGrpc.getUpdateMemberMethod = getUpdateMemberMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MemberManageMethodDescriptorSupplier("UpdateMember"))
              .build();
        }
      }
    }
    return getUpdateMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember,
      com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember> getDescribeMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeMember",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember,
      com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember> getDescribeMemberMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember, com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember> getDescribeMemberMethod;
    if ((getDescribeMemberMethod = MemberManageGrpc.getDescribeMemberMethod) == null) {
      synchronized (MemberManageGrpc.class) {
        if ((getDescribeMemberMethod = MemberManageGrpc.getDescribeMemberMethod) == null) {
          MemberManageGrpc.getDescribeMemberMethod = getDescribeMemberMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember, com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember.getDefaultInstance()))
              .setSchemaDescriptor(new MemberManageMethodDescriptorSupplier("DescribeMember"))
              .build();
        }
      }
    }
    return getDescribeMemberMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MemberManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberManageStub>() {
        @java.lang.Override
        public MemberManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberManageStub(channel, callOptions);
        }
      };
    return MemberManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MemberManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberManageBlockingStub>() {
        @java.lang.Override
        public MemberManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberManageBlockingStub(channel, callOptions);
        }
      };
    return MemberManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MemberManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MemberManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MemberManageFutureStub>() {
        @java.lang.Override
        public MemberManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MemberManageFutureStub(channel, callOptions);
        }
      };
    return MemberManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * MemberManage declares API for manage member and role of member.
   * </pre>
   */
  public static abstract class MemberManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * ListMembers get a lists of workspace member.
     * </pre>
     */
    public void listMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     */
    public void deleteMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMembersMethod(), responseObserver);
    }

    /**
     */
    public void addMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddMembersMethod(), responseObserver);
    }

    /**
     */
    public void updateMember(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMemberMethod(), responseObserver);
    }

    /**
     */
    public void describeMember(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMemberMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers,
                com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers>(
                  this, METHODID_LIST_MEMBERS)))
          .addMethod(
            getDeleteMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_MEMBERS)))
          .addMethod(
            getAddMembersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ADD_MEMBERS)))
          .addMethod(
            getUpdateMemberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_MEMBER)))
          .addMethod(
            getDescribeMemberMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember,
                com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember>(
                  this, METHODID_DESCRIBE_MEMBER)))
          .build();
    }
  }

  /**
   * <pre>
   * MemberManage declares API for manage member and role of member.
   * </pre>
   */
  public static final class MemberManageStub extends io.grpc.stub.AbstractAsyncStub<MemberManageStub> {
    private MemberManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListMembers get a lists of workspace member.
     * </pre>
     */
    public void listMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMember(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeMember(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMemberMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * MemberManage declares API for manage member and role of member.
   * </pre>
   */
  public static final class MemberManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<MemberManageBlockingStub> {
    private MemberManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListMembers get a lists of workspace member.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers listMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct addMembers(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddMembersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateMember(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMemberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember describeMember(com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMemberMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * MemberManage declares API for manage member and role of member.
   * </pre>
   */
  public static final class MemberManageFutureStub extends io.grpc.stub.AbstractFutureStub<MemberManageFutureStub> {
    private MemberManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MemberManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MemberManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * ListMembers get a lists of workspace member.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers> listMembers(
        com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteMembers(
        com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> addMembers(
        com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddMembersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateMember(
        com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMemberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember> describeMember(
        com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMemberMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MEMBERS = 0;
  private static final int METHODID_DELETE_MEMBERS = 1;
  private static final int METHODID_ADD_MEMBERS = 2;
  private static final int METHODID_UPDATE_MEMBER = 3;
  private static final int METHODID_DESCRIBE_MEMBER = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MemberManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MemberManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.ListMembers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.ListMembers>) responseObserver);
          break;
        case METHODID_DELETE_MEMBERS:
          serviceImpl.deleteMembers((com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DeleteMembers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ADD_MEMBERS:
          serviceImpl.addMembers((com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.AddMembers) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE_MEMBER:
          serviceImpl.updateMember((com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.UpdateMember) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_MEMBER:
          serviceImpl.describeMember((com.dataomnis.gproto.types.pbrequest.PBRequestMemberManage.DescribeMember) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMemberManage.DescribeMember>) responseObserver);
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

  private static abstract class MemberManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MemberManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcMemberManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MemberManage");
    }
  }

  private static final class MemberManageFileDescriptorSupplier
      extends MemberManageBaseDescriptorSupplier {
    MemberManageFileDescriptorSupplier() {}
  }

  private static final class MemberManageMethodDescriptorSupplier
      extends MemberManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MemberManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (MemberManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MemberManageFileDescriptorSupplier())
              .addMethod(getListMembersMethod())
              .addMethod(getDeleteMembersMethod())
              .addMethod(getAddMembersMethod())
              .addMethod(getUpdateMemberMethod())
              .addMethod(getDescribeMemberMethod())
              .build();
        }
      }
    }
    return result;
  }
}
