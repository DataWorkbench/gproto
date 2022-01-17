package com.github.dataomnis.workspacepb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Scheduler Service
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/workspace.proto")
public final class SchedulerGrpc {

  private SchedulerGrpc() {}

  public static final String SERVICE_NAME = "wspb.Scheduler";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListStreamInstances,
      com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances> getListStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListStreamInstances",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListStreamInstances.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListStreamInstances,
      com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances> getListStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListStreamInstances, com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances> getListStreamInstancesMethod;
    if ((getListStreamInstancesMethod = SchedulerGrpc.getListStreamInstancesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getListStreamInstancesMethod = SchedulerGrpc.getListStreamInstancesMethod) == null) {
          SchedulerGrpc.getListStreamInstancesMethod = getListStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListStreamInstances, com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("ListStreamInstances"))
              .build();
        }
      }
    }
    return getListStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getTerminateStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TerminateStreamInstances",
      requestType = com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getTerminateStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getTerminateStreamInstancesMethod;
    if ((getTerminateStreamInstancesMethod = SchedulerGrpc.getTerminateStreamInstancesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getTerminateStreamInstancesMethod = SchedulerGrpc.getTerminateStreamInstancesMethod) == null) {
          SchedulerGrpc.getTerminateStreamInstancesMethod = getTerminateStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TerminateStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("TerminateStreamInstances"))
              .build();
        }
      }
    }
    return getTerminateStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getSuspendStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendStreamInstances",
      requestType = com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getSuspendStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getSuspendStreamInstancesMethod;
    if ((getSuspendStreamInstancesMethod = SchedulerGrpc.getSuspendStreamInstancesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getSuspendStreamInstancesMethod = SchedulerGrpc.getSuspendStreamInstancesMethod) == null) {
          SchedulerGrpc.getSuspendStreamInstancesMethod = getSuspendStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("SuspendStreamInstances"))
              .build();
        }
      }
    }
    return getSuspendStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getResumeStreamInstancesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeStreamInstances",
      requestType = com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getResumeStreamInstancesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getResumeStreamInstancesMethod;
    if ((getResumeStreamInstancesMethod = SchedulerGrpc.getResumeStreamInstancesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getResumeStreamInstancesMethod = SchedulerGrpc.getResumeStreamInstancesMethod) == null) {
          SchedulerGrpc.getResumeStreamInstancesMethod = getResumeStreamInstancesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeStreamInstances"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("ResumeStreamInstances"))
              .build();
        }
      }
    }
    return getResumeStreamInstancesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId,
      com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> getDescribeFlinkUIByInstanceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkUIByInstanceId",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId,
      com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> getDescribeFlinkUIByInstanceIdMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId, com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> getDescribeFlinkUIByInstanceIdMethod;
    if ((getDescribeFlinkUIByInstanceIdMethod = SchedulerGrpc.getDescribeFlinkUIByInstanceIdMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getDescribeFlinkUIByInstanceIdMethod = SchedulerGrpc.getDescribeFlinkUIByInstanceIdMethod) == null) {
          SchedulerGrpc.getDescribeFlinkUIByInstanceIdMethod = getDescribeFlinkUIByInstanceIdMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId, com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkUIByInstanceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("DescribeFlinkUIByInstanceId"))
              .build();
        }
      }
    }
    return getDescribeFlinkUIByInstanceIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListMonitorRules,
      com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules> getListMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMonitorRules",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListMonitorRules.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListMonitorRules,
      com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules> getListMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListMonitorRules, com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules> getListMonitorRulesMethod;
    if ((getListMonitorRulesMethod = SchedulerGrpc.getListMonitorRulesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getListMonitorRulesMethod = SchedulerGrpc.getListMonitorRulesMethod) == null) {
          SchedulerGrpc.getListMonitorRulesMethod = getListMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListMonitorRules, com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("ListMonitorRules"))
              .build();
        }
      }
    }
    return getListMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMonitorRules",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMonitorRulesMethod;
    if ((getDeleteMonitorRulesMethod = SchedulerGrpc.getDeleteMonitorRulesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getDeleteMonitorRulesMethod = SchedulerGrpc.getDeleteMonitorRulesMethod) == null) {
          SchedulerGrpc.getDeleteMonitorRulesMethod = getDeleteMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("DeleteMonitorRules"))
              .build();
        }
      }
    }
    return getDeleteMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getEnableMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableMonitorRules",
      requestType = com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getEnableMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getEnableMonitorRulesMethod;
    if ((getEnableMonitorRulesMethod = SchedulerGrpc.getEnableMonitorRulesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getEnableMonitorRulesMethod = SchedulerGrpc.getEnableMonitorRulesMethod) == null) {
          SchedulerGrpc.getEnableMonitorRulesMethod = getEnableMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("EnableMonitorRules"))
              .build();
        }
      }
    }
    return getEnableMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDisableMonitorRulesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableMonitorRules",
      requestType = com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDisableMonitorRulesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDisableMonitorRulesMethod;
    if ((getDisableMonitorRulesMethod = SchedulerGrpc.getDisableMonitorRulesMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getDisableMonitorRulesMethod = SchedulerGrpc.getDisableMonitorRulesMethod) == null) {
          SchedulerGrpc.getDisableMonitorRulesMethod = getDisableMonitorRulesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableMonitorRules"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("DisableMonitorRules"))
              .build();
        }
      }
    }
    return getDisableMonitorRulesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMonitorRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMonitorRule",
      requestType = com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMonitorRuleMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMonitorRuleMethod;
    if ((getCreateMonitorRuleMethod = SchedulerGrpc.getCreateMonitorRuleMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getCreateMonitorRuleMethod = SchedulerGrpc.getCreateMonitorRuleMethod) == null) {
          SchedulerGrpc.getCreateMonitorRuleMethod = getCreateMonitorRuleMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateMonitorRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("CreateMonitorRule"))
              .build();
        }
      }
    }
    return getCreateMonitorRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMonitorRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateMonitorRule",
      requestType = com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMonitorRuleMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMonitorRuleMethod;
    if ((getUpdateMonitorRuleMethod = SchedulerGrpc.getUpdateMonitorRuleMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getUpdateMonitorRuleMethod = SchedulerGrpc.getUpdateMonitorRuleMethod) == null) {
          SchedulerGrpc.getUpdateMonitorRuleMethod = getUpdateMonitorRuleMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateMonitorRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("UpdateMonitorRule"))
              .build();
        }
      }
    }
    return getUpdateMonitorRuleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule,
      com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule> getDescribeMonitorRuleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeMonitorRule",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule,
      com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule> getDescribeMonitorRuleMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule, com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule> getDescribeMonitorRuleMethod;
    if ((getDescribeMonitorRuleMethod = SchedulerGrpc.getDescribeMonitorRuleMethod) == null) {
      synchronized (SchedulerGrpc.class) {
        if ((getDescribeMonitorRuleMethod = SchedulerGrpc.getDescribeMonitorRuleMethod) == null) {
          SchedulerGrpc.getDescribeMonitorRuleMethod = getDescribeMonitorRuleMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule, com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeMonitorRule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule.getDefaultInstance()))
              .setSchemaDescriptor(new SchedulerMethodDescriptorSupplier("DescribeMonitorRule"))
              .build();
        }
      }
    }
    return getDescribeMonitorRuleMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SchedulerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerStub>() {
        @java.lang.Override
        public SchedulerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerStub(channel, callOptions);
        }
      };
    return SchedulerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SchedulerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerBlockingStub>() {
        @java.lang.Override
        public SchedulerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerBlockingStub(channel, callOptions);
        }
      };
    return SchedulerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SchedulerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SchedulerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SchedulerFutureStub>() {
        @java.lang.Override
        public SchedulerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SchedulerFutureStub(channel, callOptions);
        }
      };
    return SchedulerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Scheduler Service
   * </pre>
   */
  public static abstract class SchedulerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public void listStreamInstances(com.github.dataomnis.requestpb.RequestPB.ListStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void terminateStreamInstances(com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTerminateStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void suspendStreamInstances(com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void resumeStreamInstances(com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeStreamInstancesMethod(), responseObserver);
    }

    /**
     */
    public void describeFlinkUIByInstanceId(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkUIByInstanceIdMethod(), responseObserver);
    }

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public void listMonitorRules(com.github.dataomnis.requestpb.RequestPB.ListMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void deleteMonitorRules(com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void enableMonitorRules(com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void disableMonitorRules(com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMonitorRulesMethod(), responseObserver);
    }

    /**
     */
    public void createMonitorRule(com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMonitorRuleMethod(), responseObserver);
    }

    /**
     */
    public void updateMonitorRule(com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMonitorRuleMethod(), responseObserver);
    }

    /**
     */
    public void describeMonitorRule(com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMonitorRuleMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListStreamInstances,
                com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances>(
                  this, METHODID_LIST_STREAM_INSTANCES)))
          .addMethod(
            getTerminateStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_TERMINATE_STREAM_INSTANCES)))
          .addMethod(
            getSuspendStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_SUSPEND_STREAM_INSTANCES)))
          .addMethod(
            getResumeStreamInstancesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_RESUME_STREAM_INSTANCES)))
          .addMethod(
            getDescribeFlinkUIByInstanceIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId,
                com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId>(
                  this, METHODID_DESCRIBE_FLINK_UIBY_INSTANCE_ID)))
          .addMethod(
            getListMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListMonitorRules,
                com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules>(
                  this, METHODID_LIST_MONITOR_RULES)))
          .addMethod(
            getDeleteMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_MONITOR_RULES)))
          .addMethod(
            getEnableMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_ENABLE_MONITOR_RULES)))
          .addMethod(
            getDisableMonitorRulesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DISABLE_MONITOR_RULES)))
          .addMethod(
            getCreateMonitorRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_CREATE_MONITOR_RULE)))
          .addMethod(
            getUpdateMonitorRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_MONITOR_RULE)))
          .addMethod(
            getDescribeMonitorRuleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule,
                com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule>(
                  this, METHODID_DESCRIBE_MONITOR_RULE)))
          .build();
    }
  }

  /**
   * <pre>
   * Scheduler Service
   * </pre>
   */
  public static final class SchedulerStub extends io.grpc.stub.AbstractAsyncStub<SchedulerStub> {
    private SchedulerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public void listStreamInstances(com.github.dataomnis.requestpb.RequestPB.ListStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void terminateStreamInstances(com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTerminateStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void suspendStreamInstances(com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void resumeStreamInstances(com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeStreamInstancesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFlinkUIByInstanceId(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkUIByInstanceIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public void listMonitorRules(com.github.dataomnis.requestpb.RequestPB.ListMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteMonitorRules(com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableMonitorRules(com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableMonitorRules(com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMonitorRulesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createMonitorRule(com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMonitorRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateMonitorRule(com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMonitorRuleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeMonitorRule(com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMonitorRuleMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Scheduler Service
   * </pre>
   */
  public static final class SchedulerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SchedulerBlockingStub> {
    private SchedulerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances listStreamInstances(com.github.dataomnis.requestpb.RequestPB.ListStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct terminateStreamInstances(com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTerminateStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct suspendStreamInstances(com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct resumeStreamInstances(com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeStreamInstancesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId describeFlinkUIByInstanceId(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkUIByInstanceIdMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules listMonitorRules(com.github.dataomnis.requestpb.RequestPB.ListMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteMonitorRules(com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct enableMonitorRules(com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct disableMonitorRules(com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMonitorRulesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct createMonitorRule(com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMonitorRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct updateMonitorRule(com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMonitorRuleMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule describeMonitorRule(com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMonitorRuleMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Scheduler Service
   * </pre>
   */
  public static final class SchedulerFutureStub extends io.grpc.stub.AbstractFutureStub<SchedulerFutureStub> {
    private SchedulerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SchedulerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SchedulerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for stream job cycle instance.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances> listStreamInstances(
        com.github.dataomnis.requestpb.RequestPB.ListStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> terminateStreamInstances(
        com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTerminateStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> suspendStreamInstances(
        com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> resumeStreamInstances(
        com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeStreamInstancesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId> describeFlinkUIByInstanceId(
        com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkUIByInstanceIdMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Interface for monitor.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules> listMonitorRules(
        com.github.dataomnis.requestpb.RequestPB.ListMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteMonitorRules(
        com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> enableMonitorRules(
        com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> disableMonitorRules(
        com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMonitorRulesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> createMonitorRule(
        com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMonitorRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> updateMonitorRule(
        com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMonitorRuleMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule> describeMonitorRule(
        com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMonitorRuleMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_STREAM_INSTANCES = 0;
  private static final int METHODID_TERMINATE_STREAM_INSTANCES = 1;
  private static final int METHODID_SUSPEND_STREAM_INSTANCES = 2;
  private static final int METHODID_RESUME_STREAM_INSTANCES = 3;
  private static final int METHODID_DESCRIBE_FLINK_UIBY_INSTANCE_ID = 4;
  private static final int METHODID_LIST_MONITOR_RULES = 5;
  private static final int METHODID_DELETE_MONITOR_RULES = 6;
  private static final int METHODID_ENABLE_MONITOR_RULES = 7;
  private static final int METHODID_DISABLE_MONITOR_RULES = 8;
  private static final int METHODID_CREATE_MONITOR_RULE = 9;
  private static final int METHODID_UPDATE_MONITOR_RULE = 10;
  private static final int METHODID_DESCRIBE_MONITOR_RULE = 11;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SchedulerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SchedulerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_STREAM_INSTANCES:
          serviceImpl.listStreamInstances((com.github.dataomnis.requestpb.RequestPB.ListStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListStreamInstances>) responseObserver);
          break;
        case METHODID_TERMINATE_STREAM_INSTANCES:
          serviceImpl.terminateStreamInstances((com.github.dataomnis.requestpb.RequestPB.TerminateStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_SUSPEND_STREAM_INSTANCES:
          serviceImpl.suspendStreamInstances((com.github.dataomnis.requestpb.RequestPB.SuspendStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_RESUME_STREAM_INSTANCES:
          serviceImpl.resumeStreamInstances((com.github.dataomnis.requestpb.RequestPB.ResumeStreamInstances) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_UIBY_INSTANCE_ID:
          serviceImpl.describeFlinkUIByInstanceId((com.github.dataomnis.requestpb.RequestPB.DescribeFlinkUIByInstanceId) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkUIByInstanceId>) responseObserver);
          break;
        case METHODID_LIST_MONITOR_RULES:
          serviceImpl.listMonitorRules((com.github.dataomnis.requestpb.RequestPB.ListMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListMonitorRules>) responseObserver);
          break;
        case METHODID_DELETE_MONITOR_RULES:
          serviceImpl.deleteMonitorRules((com.github.dataomnis.requestpb.RequestPB.DeleteMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_ENABLE_MONITOR_RULES:
          serviceImpl.enableMonitorRules((com.github.dataomnis.requestpb.RequestPB.EnableMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DISABLE_MONITOR_RULES:
          serviceImpl.disableMonitorRules((com.github.dataomnis.requestpb.RequestPB.DisableMonitorRules) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_MONITOR_RULE:
          serviceImpl.createMonitorRule((com.github.dataomnis.requestpb.RequestPB.CreateMonitorRule) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE_MONITOR_RULE:
          serviceImpl.updateMonitorRule((com.github.dataomnis.requestpb.RequestPB.UpdateMonitorRule) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_MONITOR_RULE:
          serviceImpl.describeMonitorRule((com.github.dataomnis.requestpb.RequestPB.DescribeMonitorRule) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeMonitorRule>) responseObserver);
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

  private static abstract class SchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SchedulerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.dataomnis.workspacepb.WorkspacePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Scheduler");
    }
  }

  private static final class SchedulerFileDescriptorSupplier
      extends SchedulerBaseDescriptorSupplier {
    SchedulerFileDescriptorSupplier() {}
  }

  private static final class SchedulerMethodDescriptorSupplier
      extends SchedulerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SchedulerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SchedulerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SchedulerFileDescriptorSupplier())
              .addMethod(getListStreamInstancesMethod())
              .addMethod(getTerminateStreamInstancesMethod())
              .addMethod(getSuspendStreamInstancesMethod())
              .addMethod(getResumeStreamInstancesMethod())
              .addMethod(getDescribeFlinkUIByInstanceIdMethod())
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
