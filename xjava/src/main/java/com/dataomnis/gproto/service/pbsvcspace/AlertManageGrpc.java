package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * AlertManage declares API for manage alert policy.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/spacemanager/alert_manage.proto")
public final class AlertManageGrpc {

  private AlertManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.AlertManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies> getListAlertPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAlertPolicies",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies> getListAlertPoliciesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies> getListAlertPoliciesMethod;
    if ((getListAlertPoliciesMethod = AlertManageGrpc.getListAlertPoliciesMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getListAlertPoliciesMethod = AlertManageGrpc.getListAlertPoliciesMethod) == null) {
          AlertManageGrpc.getListAlertPoliciesMethod = getListAlertPoliciesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAlertPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("ListAlertPolicies"))
              .build();
        }
      }
    }
    return getListAlertPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAlertPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAlertPolicies",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAlertPoliciesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAlertPoliciesMethod;
    if ((getDeleteAlertPoliciesMethod = AlertManageGrpc.getDeleteAlertPoliciesMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getDeleteAlertPoliciesMethod = AlertManageGrpc.getDeleteAlertPoliciesMethod) == null) {
          AlertManageGrpc.getDeleteAlertPoliciesMethod = getDeleteAlertPoliciesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAlertPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("DeleteAlertPolicies"))
              .build();
        }
      }
    }
    return getDeleteAlertPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableAlertPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableAlertPolicies",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableAlertPoliciesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableAlertPoliciesMethod;
    if ((getEnableAlertPoliciesMethod = AlertManageGrpc.getEnableAlertPoliciesMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getEnableAlertPoliciesMethod = AlertManageGrpc.getEnableAlertPoliciesMethod) == null) {
          AlertManageGrpc.getEnableAlertPoliciesMethod = getEnableAlertPoliciesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableAlertPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("EnableAlertPolicies"))
              .build();
        }
      }
    }
    return getEnableAlertPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableAlertPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableAlertPolicies",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableAlertPoliciesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableAlertPoliciesMethod;
    if ((getDisableAlertPoliciesMethod = AlertManageGrpc.getDisableAlertPoliciesMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getDisableAlertPoliciesMethod = AlertManageGrpc.getDisableAlertPoliciesMethod) == null) {
          AlertManageGrpc.getDisableAlertPoliciesMethod = getDisableAlertPoliciesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableAlertPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("DisableAlertPolicies"))
              .build();
        }
      }
    }
    return getDisableAlertPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy> getCreateAlertPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAlertPolicy",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy> getCreateAlertPolicyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy> getCreateAlertPolicyMethod;
    if ((getCreateAlertPolicyMethod = AlertManageGrpc.getCreateAlertPolicyMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getCreateAlertPolicyMethod = AlertManageGrpc.getCreateAlertPolicyMethod) == null) {
          AlertManageGrpc.getCreateAlertPolicyMethod = getCreateAlertPolicyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAlertPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("CreateAlertPolicy"))
              .build();
        }
      }
    }
    return getCreateAlertPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateAlertPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAlertPolicy",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateAlertPolicyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateAlertPolicyMethod;
    if ((getUpdateAlertPolicyMethod = AlertManageGrpc.getUpdateAlertPolicyMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getUpdateAlertPolicyMethod = AlertManageGrpc.getUpdateAlertPolicyMethod) == null) {
          AlertManageGrpc.getUpdateAlertPolicyMethod = getUpdateAlertPolicyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAlertPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("UpdateAlertPolicy"))
              .build();
        }
      }
    }
    return getUpdateAlertPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy> getDescribeAlertPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeAlertPolicy",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy> getDescribeAlertPolicyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy> getDescribeAlertPolicyMethod;
    if ((getDescribeAlertPolicyMethod = AlertManageGrpc.getDescribeAlertPolicyMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getDescribeAlertPolicyMethod = AlertManageGrpc.getDescribeAlertPolicyMethod) == null) {
          AlertManageGrpc.getDescribeAlertPolicyMethod = getDescribeAlertPolicyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeAlertPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("DescribeAlertPolicy"))
              .build();
        }
      }
    }
    return getDescribeAlertPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getJobBoundAlertPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JobBoundAlertPolicies",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getJobBoundAlertPoliciesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getJobBoundAlertPoliciesMethod;
    if ((getJobBoundAlertPoliciesMethod = AlertManageGrpc.getJobBoundAlertPoliciesMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getJobBoundAlertPoliciesMethod = AlertManageGrpc.getJobBoundAlertPoliciesMethod) == null) {
          AlertManageGrpc.getJobBoundAlertPoliciesMethod = getJobBoundAlertPoliciesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JobBoundAlertPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("JobBoundAlertPolicies"))
              .build();
        }
      }
    }
    return getJobBoundAlertPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getJobUnboundAlertPoliciesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JobUnboundAlertPolicies",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getJobUnboundAlertPoliciesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getJobUnboundAlertPoliciesMethod;
    if ((getJobUnboundAlertPoliciesMethod = AlertManageGrpc.getJobUnboundAlertPoliciesMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getJobUnboundAlertPoliciesMethod = AlertManageGrpc.getJobUnboundAlertPoliciesMethod) == null) {
          AlertManageGrpc.getJobUnboundAlertPoliciesMethod = getJobUnboundAlertPoliciesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JobUnboundAlertPolicies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("JobUnboundAlertPolicies"))
              .build();
        }
      }
    }
    return getJobUnboundAlertPoliciesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob> getListAlertPoliciesByJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAlertPoliciesByJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob> getListAlertPoliciesByJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob> getListAlertPoliciesByJobMethod;
    if ((getListAlertPoliciesByJobMethod = AlertManageGrpc.getListAlertPoliciesByJobMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getListAlertPoliciesByJobMethod = AlertManageGrpc.getListAlertPoliciesByJobMethod) == null) {
          AlertManageGrpc.getListAlertPoliciesByJobMethod = getListAlertPoliciesByJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAlertPoliciesByJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("ListAlertPoliciesByJob"))
              .build();
        }
      }
    }
    return getListAlertPoliciesByJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAlertPolicyBoundJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlertPolicyBoundJobs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAlertPolicyBoundJobsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAlertPolicyBoundJobsMethod;
    if ((getAlertPolicyBoundJobsMethod = AlertManageGrpc.getAlertPolicyBoundJobsMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getAlertPolicyBoundJobsMethod = AlertManageGrpc.getAlertPolicyBoundJobsMethod) == null) {
          AlertManageGrpc.getAlertPolicyBoundJobsMethod = getAlertPolicyBoundJobsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlertPolicyBoundJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("AlertPolicyBoundJobs"))
              .build();
        }
      }
    }
    return getAlertPolicyBoundJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAlertPolicyUnboundJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AlertPolicyUnboundJobs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAlertPolicyUnboundJobsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAlertPolicyUnboundJobsMethod;
    if ((getAlertPolicyUnboundJobsMethod = AlertManageGrpc.getAlertPolicyUnboundJobsMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getAlertPolicyUnboundJobsMethod = AlertManageGrpc.getAlertPolicyUnboundJobsMethod) == null) {
          AlertManageGrpc.getAlertPolicyUnboundJobsMethod = getAlertPolicyUnboundJobsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AlertPolicyUnboundJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("AlertPolicyUnboundJobs"))
              .build();
        }
      }
    }
    return getAlertPolicyUnboundJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy> getListJobsByAlertPolicyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListJobsByAlertPolicy",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy> getListJobsByAlertPolicyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy> getListJobsByAlertPolicyMethod;
    if ((getListJobsByAlertPolicyMethod = AlertManageGrpc.getListJobsByAlertPolicyMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getListJobsByAlertPolicyMethod = AlertManageGrpc.getListJobsByAlertPolicyMethod) == null) {
          AlertManageGrpc.getListJobsByAlertPolicyMethod = getListJobsByAlertPolicyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListJobsByAlertPolicy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("ListJobsByAlertPolicy"))
              .build();
        }
      }
    }
    return getListJobsByAlertPolicyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs> getListAlertLogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAlertLogs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs,
      com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs> getListAlertLogsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs> getListAlertLogsMethod;
    if ((getListAlertLogsMethod = AlertManageGrpc.getListAlertLogsMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getListAlertLogsMethod = AlertManageGrpc.getListAlertLogsMethod) == null) {
          AlertManageGrpc.getListAlertLogsMethod = getListAlertLogsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs, com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAlertLogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("ListAlertLogs"))
              .build();
        }
      }
    }
    return getListAlertLogsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSendAlertMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendAlert",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSendAlertMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSendAlertMethod;
    if ((getSendAlertMethod = AlertManageGrpc.getSendAlertMethod) == null) {
      synchronized (AlertManageGrpc.class) {
        if ((getSendAlertMethod = AlertManageGrpc.getSendAlertMethod) == null) {
          AlertManageGrpc.getSendAlertMethod = getSendAlertMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SendAlert"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new AlertManageMethodDescriptorSupplier("SendAlert"))
              .build();
        }
      }
    }
    return getSendAlertMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AlertManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertManageStub>() {
        @java.lang.Override
        public AlertManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertManageStub(channel, callOptions);
        }
      };
    return AlertManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AlertManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertManageBlockingStub>() {
        @java.lang.Override
        public AlertManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertManageBlockingStub(channel, callOptions);
        }
      };
    return AlertManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AlertManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AlertManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AlertManageFutureStub>() {
        @java.lang.Override
        public AlertManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AlertManageFutureStub(channel, callOptions);
        }
      };
    return AlertManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AlertManage declares API for manage alert policy.
   * </pre>
   */
  public static abstract class AlertManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void listAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAlertPoliciesMethod(), responseObserver);
    }

    /**
     */
    public void deleteAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAlertPoliciesMethod(), responseObserver);
    }

    /**
     */
    public void enableAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableAlertPoliciesMethod(), responseObserver);
    }

    /**
     */
    public void disableAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableAlertPoliciesMethod(), responseObserver);
    }

    /**
     */
    public void createAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAlertPolicyMethod(), responseObserver);
    }

    /**
     */
    public void updateAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAlertPolicyMethod(), responseObserver);
    }

    /**
     */
    public void describeAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeAlertPolicyMethod(), responseObserver);
    }

    /**
     * <pre>
     * JobBoundAlertPolicy bind the alert policies to the specified job(stream or sync)
     * </pre>
     */
    public void jobBoundAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJobBoundAlertPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * JobUnboundAlertPolicies unbind the alert policies from the specified job.
     * </pre>
     */
    public void jobUnboundAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJobUnboundAlertPoliciesMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListAlertPoliciesByJob query which alert policies are bound to the specified job(stream or sync).
     * </pre>
     */
    public void listAlertPoliciesByJob(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAlertPoliciesByJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * AlertPolicyBoundJobs bind the jobs(stream or sync) to specified alert policy.
     * </pre>
     */
    public void alertPolicyBoundJobs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlertPolicyBoundJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * AlertPolicyUnboundJobs unbind the jobs(stream or sync) from the specified alert policy.
     * </pre>
     */
    public void alertPolicyUnboundJobs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAlertPolicyUnboundJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListJobsByAlertPolicy query which jobs are bound to the specified alert policy.
     * </pre>
     */
    public void listJobsByAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListJobsByAlertPolicyMethod(), responseObserver);
    }

    /**
     */
    public void listAlertLogs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAlertLogsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Internal API
     * </pre>
     */
    public void sendAlert(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSendAlertMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListAlertPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies,
                com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies>(
                  this, METHODID_LIST_ALERT_POLICIES)))
          .addMethod(
            getDeleteAlertPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_ALERT_POLICIES)))
          .addMethod(
            getEnableAlertPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ENABLE_ALERT_POLICIES)))
          .addMethod(
            getDisableAlertPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DISABLE_ALERT_POLICIES)))
          .addMethod(
            getCreateAlertPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy,
                com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy>(
                  this, METHODID_CREATE_ALERT_POLICY)))
          .addMethod(
            getUpdateAlertPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_ALERT_POLICY)))
          .addMethod(
            getDescribeAlertPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy,
                com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy>(
                  this, METHODID_DESCRIBE_ALERT_POLICY)))
          .addMethod(
            getJobBoundAlertPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_JOB_BOUND_ALERT_POLICIES)))
          .addMethod(
            getJobUnboundAlertPoliciesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_JOB_UNBOUND_ALERT_POLICIES)))
          .addMethod(
            getListAlertPoliciesByJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob>(
                  this, METHODID_LIST_ALERT_POLICIES_BY_JOB)))
          .addMethod(
            getAlertPolicyBoundJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ALERT_POLICY_BOUND_JOBS)))
          .addMethod(
            getAlertPolicyUnboundJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ALERT_POLICY_UNBOUND_JOBS)))
          .addMethod(
            getListJobsByAlertPolicyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy,
                com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy>(
                  this, METHODID_LIST_JOBS_BY_ALERT_POLICY)))
          .addMethod(
            getListAlertLogsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs,
                com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs>(
                  this, METHODID_LIST_ALERT_LOGS)))
          .addMethod(
            getSendAlertMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SEND_ALERT)))
          .build();
    }
  }

  /**
   * <pre>
   * AlertManage declares API for manage alert policy.
   * </pre>
   */
  public static final class AlertManageStub extends io.grpc.stub.AbstractAsyncStub<AlertManageStub> {
    private AlertManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertManageStub(channel, callOptions);
    }

    /**
     */
    public void listAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAlertPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAlertPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableAlertPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableAlertPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAlertPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAlertPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeAlertPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * JobBoundAlertPolicy bind the alert policies to the specified job(stream or sync)
     * </pre>
     */
    public void jobBoundAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJobBoundAlertPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * JobUnboundAlertPolicies unbind the alert policies from the specified job.
     * </pre>
     */
    public void jobUnboundAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJobUnboundAlertPoliciesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListAlertPoliciesByJob query which alert policies are bound to the specified job(stream or sync).
     * </pre>
     */
    public void listAlertPoliciesByJob(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAlertPoliciesByJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AlertPolicyBoundJobs bind the jobs(stream or sync) to specified alert policy.
     * </pre>
     */
    public void alertPolicyBoundJobs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlertPolicyBoundJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * AlertPolicyUnboundJobs unbind the jobs(stream or sync) from the specified alert policy.
     * </pre>
     */
    public void alertPolicyUnboundJobs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAlertPolicyUnboundJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListJobsByAlertPolicy query which jobs are bound to the specified alert policy.
     * </pre>
     */
    public void listJobsByAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListJobsByAlertPolicyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAlertLogs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAlertLogsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Internal API
     * </pre>
     */
    public void sendAlert(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSendAlertMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AlertManage declares API for manage alert policy.
   * </pre>
   */
  public static final class AlertManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<AlertManageBlockingStub> {
    private AlertManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies listAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAlertPoliciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAlertPoliciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct enableAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableAlertPoliciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct disableAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableAlertPoliciesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy createAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAlertPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAlertPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy describeAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeAlertPolicyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * JobBoundAlertPolicy bind the alert policies to the specified job(stream or sync)
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct jobBoundAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJobBoundAlertPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * JobUnboundAlertPolicies unbind the alert policies from the specified job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct jobUnboundAlertPolicies(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJobUnboundAlertPoliciesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListAlertPoliciesByJob query which alert policies are bound to the specified job(stream or sync).
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob listAlertPoliciesByJob(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAlertPoliciesByJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AlertPolicyBoundJobs bind the jobs(stream or sync) to specified alert policy.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct alertPolicyBoundJobs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlertPolicyBoundJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * AlertPolicyUnboundJobs unbind the jobs(stream or sync) from the specified alert policy.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct alertPolicyUnboundJobs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAlertPolicyUnboundJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListJobsByAlertPolicy query which jobs are bound to the specified alert policy.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy listJobsByAlertPolicy(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListJobsByAlertPolicyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs listAlertLogs(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAlertLogsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Internal API
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct sendAlert(com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSendAlertMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AlertManage declares API for manage alert policy.
   * </pre>
   */
  public static final class AlertManageFutureStub extends io.grpc.stub.AbstractFutureStub<AlertManageFutureStub> {
    private AlertManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AlertManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AlertManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies> listAlertPolicies(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAlertPoliciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteAlertPolicies(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAlertPoliciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> enableAlertPolicies(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableAlertPoliciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> disableAlertPolicies(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableAlertPoliciesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy> createAlertPolicy(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAlertPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateAlertPolicy(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAlertPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy> describeAlertPolicy(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeAlertPolicyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * JobBoundAlertPolicy bind the alert policies to the specified job(stream or sync)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> jobBoundAlertPolicies(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJobBoundAlertPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * JobUnboundAlertPolicies unbind the alert policies from the specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> jobUnboundAlertPolicies(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJobUnboundAlertPoliciesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListAlertPoliciesByJob query which alert policies are bound to the specified job(stream or sync).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob> listAlertPoliciesByJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAlertPoliciesByJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AlertPolicyBoundJobs bind the jobs(stream or sync) to specified alert policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> alertPolicyBoundJobs(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlertPolicyBoundJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * AlertPolicyUnboundJobs unbind the jobs(stream or sync) from the specified alert policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> alertPolicyUnboundJobs(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAlertPolicyUnboundJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListJobsByAlertPolicy query which jobs are bound to the specified alert policy.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy> listJobsByAlertPolicy(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListJobsByAlertPolicyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs> listAlertLogs(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAlertLogsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Internal API
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> sendAlert(
        com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSendAlertMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_ALERT_POLICIES = 0;
  private static final int METHODID_DELETE_ALERT_POLICIES = 1;
  private static final int METHODID_ENABLE_ALERT_POLICIES = 2;
  private static final int METHODID_DISABLE_ALERT_POLICIES = 3;
  private static final int METHODID_CREATE_ALERT_POLICY = 4;
  private static final int METHODID_UPDATE_ALERT_POLICY = 5;
  private static final int METHODID_DESCRIBE_ALERT_POLICY = 6;
  private static final int METHODID_JOB_BOUND_ALERT_POLICIES = 7;
  private static final int METHODID_JOB_UNBOUND_ALERT_POLICIES = 8;
  private static final int METHODID_LIST_ALERT_POLICIES_BY_JOB = 9;
  private static final int METHODID_ALERT_POLICY_BOUND_JOBS = 10;
  private static final int METHODID_ALERT_POLICY_UNBOUND_JOBS = 11;
  private static final int METHODID_LIST_JOBS_BY_ALERT_POLICY = 12;
  private static final int METHODID_LIST_ALERT_LOGS = 13;
  private static final int METHODID_SEND_ALERT = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AlertManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AlertManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_ALERT_POLICIES:
          serviceImpl.listAlertPolicies((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPolicies) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPolicies>) responseObserver);
          break;
        case METHODID_DELETE_ALERT_POLICIES:
          serviceImpl.deleteAlertPolicies((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DeleteAlertPolicies) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ENABLE_ALERT_POLICIES:
          serviceImpl.enableAlertPolicies((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.EnableAlertPolicies) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DISABLE_ALERT_POLICIES:
          serviceImpl.disableAlertPolicies((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DisableAlertPolicies) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_ALERT_POLICY:
          serviceImpl.createAlertPolicy((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.CreateAlertPolicy) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.CreateAlertPolicy>) responseObserver);
          break;
        case METHODID_UPDATE_ALERT_POLICY:
          serviceImpl.updateAlertPolicy((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.UpdateAlertPolicy) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_ALERT_POLICY:
          serviceImpl.describeAlertPolicy((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.DescribeAlertPolicy) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.DescribeAlertPolicy>) responseObserver);
          break;
        case METHODID_JOB_BOUND_ALERT_POLICIES:
          serviceImpl.jobBoundAlertPolicies((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobBoundAlertPolicies) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_JOB_UNBOUND_ALERT_POLICIES:
          serviceImpl.jobUnboundAlertPolicies((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.JobUnboundAlertPolicies) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_ALERT_POLICIES_BY_JOB:
          serviceImpl.listAlertPoliciesByJob((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertPoliciesByJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertPoliciesByJob>) responseObserver);
          break;
        case METHODID_ALERT_POLICY_BOUND_JOBS:
          serviceImpl.alertPolicyBoundJobs((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyBoundJobs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ALERT_POLICY_UNBOUND_JOBS:
          serviceImpl.alertPolicyUnboundJobs((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.AlertPolicyUnboundJobs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_JOBS_BY_ALERT_POLICY:
          serviceImpl.listJobsByAlertPolicy((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListJobsByAlertPolicy) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListJobsByAlertPolicy>) responseObserver);
          break;
        case METHODID_LIST_ALERT_LOGS:
          serviceImpl.listAlertLogs((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.ListAlertLogs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseAlertManage.ListAlertLogs>) responseObserver);
          break;
        case METHODID_SEND_ALERT:
          serviceImpl.sendAlert((com.dataomnis.gproto.types.pbrequest.PBRequestAlertManage.SendAlert) request,
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

  private static abstract class AlertManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AlertManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcAlertManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AlertManage");
    }
  }

  private static final class AlertManageFileDescriptorSupplier
      extends AlertManageBaseDescriptorSupplier {
    AlertManageFileDescriptorSupplier() {}
  }

  private static final class AlertManageMethodDescriptorSupplier
      extends AlertManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AlertManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (AlertManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AlertManageFileDescriptorSupplier())
              .addMethod(getListAlertPoliciesMethod())
              .addMethod(getDeleteAlertPoliciesMethod())
              .addMethod(getEnableAlertPoliciesMethod())
              .addMethod(getDisableAlertPoliciesMethod())
              .addMethod(getCreateAlertPolicyMethod())
              .addMethod(getUpdateAlertPolicyMethod())
              .addMethod(getDescribeAlertPolicyMethod())
              .addMethod(getJobBoundAlertPoliciesMethod())
              .addMethod(getJobUnboundAlertPoliciesMethod())
              .addMethod(getListAlertPoliciesByJobMethod())
              .addMethod(getAlertPolicyBoundJobsMethod())
              .addMethod(getAlertPolicyUnboundJobsMethod())
              .addMethod(getListJobsByAlertPolicyMethod())
              .addMethod(getListAlertLogsMethod())
              .addMethod(getSendAlertMethod())
              .build();
        }
      }
    }
    return result;
  }
}
