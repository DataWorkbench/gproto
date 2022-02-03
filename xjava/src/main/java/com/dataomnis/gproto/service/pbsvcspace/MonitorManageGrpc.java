package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * MonitorManage declares API for manage monitor rule
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/monitor_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MonitorManageGrpc {

  private MonitorManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.MonitorManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules,
      com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules> getListMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMonitorRules",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules,
      com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules> getListMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules, com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules> getListMonitorRulesMethod;
    if ((getListMonitorRulesMethod = MonitorManageGrpc.getListMonitorRulesMethod) == null) {
      synchronized (MonitorManageGrpc.class) {
        if ((getListMonitorRulesMethod = MonitorManageGrpc.getListMonitorRulesMethod) == null) {
          MonitorManageGrpc.getListMonitorRulesMethod = getListMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules, com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorManageMethodDescriptorSupplier("ListMonitorRules"))
              .build();
        }
      }
    }
    return getListMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMonitorRules",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteMonitorRulesMethod;
    if ((getDeleteMonitorRulesMethod = MonitorManageGrpc.getDeleteMonitorRulesMethod) == null) {
      synchronized (MonitorManageGrpc.class) {
        if ((getDeleteMonitorRulesMethod = MonitorManageGrpc.getDeleteMonitorRulesMethod) == null) {
          MonitorManageGrpc.getDeleteMonitorRulesMethod = getDeleteMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorManageMethodDescriptorSupplier("DeleteMonitorRules"))
              .build();
        }
      }
    }
    return getDeleteMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableMonitorRules",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableMonitorRulesMethod;
    if ((getEnableMonitorRulesMethod = MonitorManageGrpc.getEnableMonitorRulesMethod) == null) {
      synchronized (MonitorManageGrpc.class) {
        if ((getEnableMonitorRulesMethod = MonitorManageGrpc.getEnableMonitorRulesMethod) == null) {
          MonitorManageGrpc.getEnableMonitorRulesMethod = getEnableMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorManageMethodDescriptorSupplier("EnableMonitorRules"))
              .build();
        }
      }
    }
    return getEnableMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableMonitorRules",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableMonitorRulesMethod;
    if ((getDisableMonitorRulesMethod = MonitorManageGrpc.getDisableMonitorRulesMethod) == null) {
      synchronized (MonitorManageGrpc.class) {
        if ((getDisableMonitorRulesMethod = MonitorManageGrpc.getDisableMonitorRulesMethod) == null) {
          MonitorManageGrpc.getDisableMonitorRulesMethod = getDisableMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorManageMethodDescriptorSupplier("DisableMonitorRules"))
              .build();
        }
      }
    }
    return getDisableMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateMonitorRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMonitorRule",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateMonitorRuleMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateMonitorRuleMethod;
    if ((getCreateMonitorRuleMethod = MonitorManageGrpc.getCreateMonitorRuleMethod) == null) {
      synchronized (MonitorManageGrpc.class) {
        if ((getCreateMonitorRuleMethod = MonitorManageGrpc.getCreateMonitorRuleMethod) == null) {
          MonitorManageGrpc.getCreateMonitorRuleMethod = getCreateMonitorRuleMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMonitorRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorManageMethodDescriptorSupplier("CreateMonitorRule"))
              .build();
        }
      }
    }
    return getCreateMonitorRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMonitorRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMonitorRule",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMonitorRuleMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateMonitorRuleMethod;
    if ((getUpdateMonitorRuleMethod = MonitorManageGrpc.getUpdateMonitorRuleMethod) == null) {
      synchronized (MonitorManageGrpc.class) {
        if ((getUpdateMonitorRuleMethod = MonitorManageGrpc.getUpdateMonitorRuleMethod) == null) {
          MonitorManageGrpc.getUpdateMonitorRuleMethod = getUpdateMonitorRuleMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMonitorRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorManageMethodDescriptorSupplier("UpdateMonitorRule"))
              .build();
        }
      }
    }
    return getUpdateMonitorRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule,
      com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule> getDescribeMonitorRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeMonitorRule",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule,
      com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule> getDescribeMonitorRuleMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule, com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule> getDescribeMonitorRuleMethod;
    if ((getDescribeMonitorRuleMethod = MonitorManageGrpc.getDescribeMonitorRuleMethod) == null) {
      synchronized (MonitorManageGrpc.class) {
        if ((getDescribeMonitorRuleMethod = MonitorManageGrpc.getDescribeMonitorRuleMethod) == null) {
          MonitorManageGrpc.getDescribeMonitorRuleMethod = getDescribeMonitorRuleMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule, com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeMonitorRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule.getDefaultInstance()))
              .setSchemaDescriptor(new MonitorManageMethodDescriptorSupplier("DescribeMonitorRule"))
              .build();
        }
      }
    }
    return getDescribeMonitorRuleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MonitorManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitorManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitorManageStub>() {
        @java.lang.Override
        public MonitorManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitorManageStub(channel, callOptions);
        }
      };
    return MonitorManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MonitorManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitorManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitorManageBlockingStub>() {
        @java.lang.Override
        public MonitorManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitorManageBlockingStub(channel, callOptions);
        }
      };
    return MonitorManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MonitorManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MonitorManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MonitorManageFutureStub>() {
        @java.lang.Override
        public MonitorManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MonitorManageFutureStub(channel, callOptions);
        }
      };
    return MonitorManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * MonitorManage declares API for manage monitor rule
   * </pre>
   */
  public static abstract class MonitorManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public void listMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void deleteMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void enableMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void disableMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void createMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMonitorRuleMethod(), responseObserver);
    }

    /**
     */
    public void updateMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMonitorRuleMethod(), responseObserver);
    }

    /**
     */
    public void describeMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMonitorRuleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules,
                com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules>(
                  this, METHODID_LIST_MONITOR_RULES)))
          .addMethod(
            getDeleteMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_MONITOR_RULES)))
          .addMethod(
            getEnableMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ENABLE_MONITOR_RULES)))
          .addMethod(
            getDisableMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DISABLE_MONITOR_RULES)))
          .addMethod(
            getCreateMonitorRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_MONITOR_RULE)))
          .addMethod(
            getUpdateMonitorRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_MONITOR_RULE)))
          .addMethod(
            getDescribeMonitorRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule,
                com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule>(
                  this, METHODID_DESCRIBE_MONITOR_RULE)))
          .build();
    }
  }

  /**
   * <pre>
   * MonitorManage declares API for manage monitor rule
   * </pre>
   */
  public static final class MonitorManageStub extends io.grpc.stub.AbstractAsyncStub<MonitorManageStub> {
    private MonitorManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitorManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public void listMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMonitorRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMonitorRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMonitorRuleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * MonitorManage declares API for manage monitor rule
   * </pre>
   */
  public static final class MonitorManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<MonitorManageBlockingStub> {
    private MonitorManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitorManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules listMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct enableMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct disableMonitorRules(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMonitorRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMonitorRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule describeMonitorRule(com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMonitorRuleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * MonitorManage declares API for manage monitor rule
   * </pre>
   */
  public static final class MonitorManageFutureStub extends io.grpc.stub.AbstractFutureStub<MonitorManageFutureStub> {
    private MonitorManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MonitorManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MonitorManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules> listMonitorRules(
        com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteMonitorRules(
        com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> enableMonitorRules(
        com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> disableMonitorRules(
        com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createMonitorRule(
        com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMonitorRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateMonitorRule(
        com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMonitorRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule> describeMonitorRule(
        com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMonitorRuleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MONITOR_RULES = 0;
  private static final int METHODID_DELETE_MONITOR_RULES = 1;
  private static final int METHODID_ENABLE_MONITOR_RULES = 2;
  private static final int METHODID_DISABLE_MONITOR_RULES = 3;
  private static final int METHODID_CREATE_MONITOR_RULE = 4;
  private static final int METHODID_UPDATE_MONITOR_RULE = 5;
  private static final int METHODID_DESCRIBE_MONITOR_RULE = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MonitorManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MonitorManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MONITOR_RULES:
          serviceImpl.listMonitorRules((com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.ListMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.ListMonitorRules>) responseObserver);
          break;
        case METHODID_DELETE_MONITOR_RULES:
          serviceImpl.deleteMonitorRules((com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DeleteMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ENABLE_MONITOR_RULES:
          serviceImpl.enableMonitorRules((com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.EnableMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DISABLE_MONITOR_RULES:
          serviceImpl.disableMonitorRules((com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DisableMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_MONITOR_RULE:
          serviceImpl.createMonitorRule((com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.CreateMonitorRule) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE_MONITOR_RULE:
          serviceImpl.updateMonitorRule((com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.UpdateMonitorRule) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_MONITOR_RULE:
          serviceImpl.describeMonitorRule((com.dataomnis.gproto.types.pbrequest.PBRequestMonitorManage.DescribeMonitorRule) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseMonitorManage.DescribeMonitorRule>) responseObserver);
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

  private static abstract class MonitorManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MonitorManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcMonitorManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MonitorManage");
    }
  }

  private static final class MonitorManageFileDescriptorSupplier
      extends MonitorManageBaseDescriptorSupplier {
    MonitorManageFileDescriptorSupplier() {}
  }

  private static final class MonitorManageMethodDescriptorSupplier
      extends MonitorManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MonitorManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (MonitorManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MonitorManageFileDescriptorSupplier())
              .addMethod(getListMonitorRulesMethod())
              .addMethod(getDeleteMonitorRulesMethod())
              .addMethod(getEnableMonitorRulesMethod())
              .addMethod(getDisableMonitorRulesMethod())
              .addMethod(getCreateMonitorRuleMethod())
              .addMethod(getUpdateMonitorRuleMethod())
              .addMethod(getDescribeMonitorRuleMethod())
              .build();
        }
      }
    }
    return result;
  }
}
