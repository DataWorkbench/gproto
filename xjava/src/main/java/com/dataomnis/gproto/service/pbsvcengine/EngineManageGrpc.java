package com.dataomnis.gproto.service.pbsvcengine;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/enginemanager/engine_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class EngineManageGrpc {

  private EngineManageGrpc() {}

  public static final String SERVICE_NAME = "enginecenter.EngineManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlinkClusterInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sMethod;
    if ((getCreateFlinkClusterInK8sMethod = EngineManageGrpc.getCreateFlinkClusterInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getCreateFlinkClusterInK8sMethod = EngineManageGrpc.getCreateFlinkClusterInK8sMethod) == null) {
          EngineManageGrpc.getCreateFlinkClusterInK8sMethod = getCreateFlinkClusterInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlinkClusterInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("CreateFlinkClusterInK8s"))
              .build();
        }
      }
    }
    return getCreateFlinkClusterInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClusterInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkClusterInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClusterInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClusterInK8sMethod;
    if ((getDeleteFlinkClusterInK8sMethod = EngineManageGrpc.getDeleteFlinkClusterInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getDeleteFlinkClusterInK8sMethod = EngineManageGrpc.getDeleteFlinkClusterInK8sMethod) == null) {
          EngineManageGrpc.getDeleteFlinkClusterInK8sMethod = getDeleteFlinkClusterInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkClusterInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("DeleteFlinkClusterInK8s"))
              .build();
        }
      }
    }
    return getDeleteFlinkClusterInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNetworkBrokerInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sMethod;
    if ((getCreateNetworkBrokerInK8sMethod = EngineManageGrpc.getCreateNetworkBrokerInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getCreateNetworkBrokerInK8sMethod = EngineManageGrpc.getCreateNetworkBrokerInK8sMethod) == null) {
          EngineManageGrpc.getCreateNetworkBrokerInK8sMethod = getCreateNetworkBrokerInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNetworkBrokerInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("CreateNetworkBrokerInK8s"))
              .build();
        }
      }
    }
    return getCreateNetworkBrokerInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNetworkBrokerInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sMethod;
    if ((getDeleteNetworkBrokerInK8sMethod = EngineManageGrpc.getDeleteNetworkBrokerInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getDeleteNetworkBrokerInK8sMethod = EngineManageGrpc.getDeleteNetworkBrokerInK8sMethod) == null) {
          EngineManageGrpc.getDeleteNetworkBrokerInK8sMethod = getDeleteNetworkBrokerInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNetworkBrokerInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("DeleteNetworkBrokerInK8s"))
              .build();
        }
      }
    }
    return getDeleteNetworkBrokerInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNamespacesInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNamespacesInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNamespacesInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNamespacesInK8sMethod;
    if ((getDeleteNamespacesInK8sMethod = EngineManageGrpc.getDeleteNamespacesInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getDeleteNamespacesInK8sMethod = EngineManageGrpc.getDeleteNamespacesInK8sMethod) == null) {
          EngineManageGrpc.getDeleteNamespacesInK8sMethod = getDeleteNamespacesInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNamespacesInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("DeleteNamespacesInK8s"))
              .build();
        }
      }
    }
    return getDeleteNamespacesInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlinkClusterInK8sV2",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sV2Method() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFlinkClusterInK8sV2Method;
    if ((getCreateFlinkClusterInK8sV2Method = EngineManageGrpc.getCreateFlinkClusterInK8sV2Method) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getCreateFlinkClusterInK8sV2Method = EngineManageGrpc.getCreateFlinkClusterInK8sV2Method) == null) {
          EngineManageGrpc.getCreateFlinkClusterInK8sV2Method = getCreateFlinkClusterInK8sV2Method =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlinkClusterInK8sV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("CreateFlinkClusterInK8sV2"))
              .build();
        }
      }
    }
    return getCreateFlinkClusterInK8sV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClusterInK8sV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkClusterInK8sV2",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClusterInK8sV2Method() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClusterInK8sV2Method;
    if ((getDeleteFlinkClusterInK8sV2Method = EngineManageGrpc.getDeleteFlinkClusterInK8sV2Method) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getDeleteFlinkClusterInK8sV2Method = EngineManageGrpc.getDeleteFlinkClusterInK8sV2Method) == null) {
          EngineManageGrpc.getDeleteFlinkClusterInK8sV2Method = getDeleteFlinkClusterInK8sV2Method =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkClusterInK8sV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("DeleteFlinkClusterInK8sV2"))
              .build();
        }
      }
    }
    return getDeleteFlinkClusterInK8sV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRestartFlinkClusterInK8sMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RestartFlinkClusterInK8s",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRestartFlinkClusterInK8sMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRestartFlinkClusterInK8sMethod;
    if ((getRestartFlinkClusterInK8sMethod = EngineManageGrpc.getRestartFlinkClusterInK8sMethod) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getRestartFlinkClusterInK8sMethod = EngineManageGrpc.getRestartFlinkClusterInK8sMethod) == null) {
          EngineManageGrpc.getRestartFlinkClusterInK8sMethod = getRestartFlinkClusterInK8sMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RestartFlinkClusterInK8s"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("RestartFlinkClusterInK8s"))
              .build();
        }
      }
    }
    return getRestartFlinkClusterInK8sMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNetworkBrokerInK8sV2",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sV2Method() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateNetworkBrokerInK8sV2Method;
    if ((getCreateNetworkBrokerInK8sV2Method = EngineManageGrpc.getCreateNetworkBrokerInK8sV2Method) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getCreateNetworkBrokerInK8sV2Method = EngineManageGrpc.getCreateNetworkBrokerInK8sV2Method) == null) {
          EngineManageGrpc.getCreateNetworkBrokerInK8sV2Method = getCreateNetworkBrokerInK8sV2Method =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNetworkBrokerInK8sV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("CreateNetworkBrokerInK8sV2"))
              .build();
        }
      }
    }
    return getCreateNetworkBrokerInK8sV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNetworkBrokerInK8sV2",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sV2Method() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteNetworkBrokerInK8sV2Method;
    if ((getDeleteNetworkBrokerInK8sV2Method = EngineManageGrpc.getDeleteNetworkBrokerInK8sV2Method) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getDeleteNetworkBrokerInK8sV2Method = EngineManageGrpc.getDeleteNetworkBrokerInK8sV2Method) == null) {
          EngineManageGrpc.getDeleteNetworkBrokerInK8sV2Method = getDeleteNetworkBrokerInK8sV2Method =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNetworkBrokerInK8sV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("DeleteNetworkBrokerInK8sV2"))
              .build();
        }
      }
    }
    return getDeleteNetworkBrokerInK8sV2Method;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateDataServiceClusterInK8SV2Method;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataServiceClusterInK8SV2",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateDataServiceClusterInK8SV2Method() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateDataServiceClusterInK8SV2Method;
    if ((getCreateDataServiceClusterInK8SV2Method = EngineManageGrpc.getCreateDataServiceClusterInK8SV2Method) == null) {
      synchronized (EngineManageGrpc.class) {
        if ((getCreateDataServiceClusterInK8SV2Method = EngineManageGrpc.getCreateDataServiceClusterInK8SV2Method) == null) {
          EngineManageGrpc.getCreateDataServiceClusterInK8SV2Method = getCreateDataServiceClusterInK8SV2Method =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataServiceClusterInK8SV2"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineManageMethodDescriptorSupplier("CreateDataServiceClusterInK8SV2"))
              .build();
        }
      }
    }
    return getCreateDataServiceClusterInK8SV2Method;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EngineManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineManageStub>() {
        @java.lang.Override
        public EngineManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineManageStub(channel, callOptions);
        }
      };
    return EngineManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EngineManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineManageBlockingStub>() {
        @java.lang.Override
        public EngineManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineManageBlockingStub(channel, callOptions);
        }
      };
    return EngineManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EngineManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineManageFutureStub>() {
        @java.lang.Override
        public EngineManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineManageFutureStub(channel, callOptions);
        }
      };
    return EngineManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class EngineManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void createFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlinkClusterInK8sMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void deleteFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkClusterInK8sMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void createNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNetworkBrokerInK8sMethod(), responseObserver);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void deleteNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNetworkBrokerInK8sMethod(), responseObserver);
    }

    /**
     */
    public void deleteNamespacesInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNamespacesInK8sMethod(), responseObserver);
    }

    /**
     */
    public void createFlinkClusterInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlinkClusterInK8sV2Method(), responseObserver);
    }

    /**
     */
    public void deleteFlinkClusterInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkClusterInK8sV2Method(), responseObserver);
    }

    /**
     */
    public void restartFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRestartFlinkClusterInK8sMethod(), responseObserver);
    }

    /**
     */
    public void createNetworkBrokerInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNetworkBrokerInK8sV2Method(), responseObserver);
    }

    /**
     */
    public void deleteNetworkBrokerInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNetworkBrokerInK8sV2Method(), responseObserver);
    }

    /**
     */
    public void createDataServiceClusterInK8SV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataServiceClusterInK8SV2Method(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateFlinkClusterInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_FLINK_CLUSTER_IN_K8S)))
          .addMethod(
            getDeleteFlinkClusterInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_CLUSTER_IN_K8S)))
          .addMethod(
            getCreateNetworkBrokerInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_NETWORK_BROKER_IN_K8S)))
          .addMethod(
            getDeleteNetworkBrokerInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_NETWORK_BROKER_IN_K8S)))
          .addMethod(
            getDeleteNamespacesInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_NAMESPACES_IN_K8S)))
          .addMethod(
            getCreateFlinkClusterInK8sV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_FLINK_CLUSTER_IN_K8S_V2)))
          .addMethod(
            getDeleteFlinkClusterInK8sV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_CLUSTER_IN_K8S_V2)))
          .addMethod(
            getRestartFlinkClusterInK8sMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RESTART_FLINK_CLUSTER_IN_K8S)))
          .addMethod(
            getCreateNetworkBrokerInK8sV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_NETWORK_BROKER_IN_K8S_V2)))
          .addMethod(
            getDeleteNetworkBrokerInK8sV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_NETWORK_BROKER_IN_K8S_V2)))
          .addMethod(
            getCreateDataServiceClusterInK8SV2Method(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_DATA_SERVICE_CLUSTER_IN_K8SV2)))
          .build();
    }
  }

  /**
   */
  public static final class EngineManageStub extends io.grpc.stub.AbstractAsyncStub<EngineManageStub> {
    private EngineManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void createFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlinkClusterInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void deleteFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkClusterInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void createNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNetworkBrokerInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public void deleteNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNetworkBrokerInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNamespacesInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNamespacesInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFlinkClusterInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlinkClusterInK8sV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlinkClusterInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkClusterInK8sV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void restartFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRestartFlinkClusterInK8sMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createNetworkBrokerInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNetworkBrokerInK8sV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNetworkBrokerInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNetworkBrokerInK8sV2Method(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDataServiceClusterInK8SV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2 request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataServiceClusterInK8SV2Method(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class EngineManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<EngineManageBlockingStub> {
    private EngineManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlinkClusterInK8sMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkClusterInK8sMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNetworkBrokerInK8sMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteNetworkBrokerInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNetworkBrokerInK8sMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteNamespacesInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNamespacesInK8sMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createFlinkClusterInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlinkClusterInK8sV2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFlinkClusterInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkClusterInK8sV2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct restartFlinkClusterInK8s(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRestartFlinkClusterInK8sMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createNetworkBrokerInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNetworkBrokerInK8sV2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteNetworkBrokerInK8sV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNetworkBrokerInK8sV2Method(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createDataServiceClusterInK8SV2(com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2 request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataServiceClusterInK8SV2Method(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class EngineManageFutureStub extends io.grpc.stub.AbstractFutureStub<EngineManageFutureStub> {
    private EngineManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createFlinkClusterInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlinkClusterInK8sMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFlinkClusterInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlinkClusterInK8sMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createNetworkBrokerInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNetworkBrokerInK8sMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Deprecated: FIXME: remove it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteNetworkBrokerInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNetworkBrokerInK8sMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteNamespacesInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNamespacesInK8sMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createFlinkClusterInK8sV2(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlinkClusterInK8sV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFlinkClusterInK8sV2(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlinkClusterInK8sV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> restartFlinkClusterInK8s(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRestartFlinkClusterInK8sMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createNetworkBrokerInK8sV2(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNetworkBrokerInK8sV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteNetworkBrokerInK8sV2(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNetworkBrokerInK8sV2Method(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createDataServiceClusterInK8SV2(
        com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2 request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataServiceClusterInK8SV2Method(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FLINK_CLUSTER_IN_K8S = 0;
  private static final int METHODID_DELETE_FLINK_CLUSTER_IN_K8S = 1;
  private static final int METHODID_CREATE_NETWORK_BROKER_IN_K8S = 2;
  private static final int METHODID_DELETE_NETWORK_BROKER_IN_K8S = 3;
  private static final int METHODID_DELETE_NAMESPACES_IN_K8S = 4;
  private static final int METHODID_CREATE_FLINK_CLUSTER_IN_K8S_V2 = 5;
  private static final int METHODID_DELETE_FLINK_CLUSTER_IN_K8S_V2 = 6;
  private static final int METHODID_RESTART_FLINK_CLUSTER_IN_K8S = 7;
  private static final int METHODID_CREATE_NETWORK_BROKER_IN_K8S_V2 = 8;
  private static final int METHODID_DELETE_NETWORK_BROKER_IN_K8S_V2 = 9;
  private static final int METHODID_CREATE_DATA_SERVICE_CLUSTER_IN_K8SV2 = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EngineManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EngineManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FLINK_CLUSTER_IN_K8S:
          serviceImpl.createFlinkClusterInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_CLUSTER_IN_K8S:
          serviceImpl.deleteFlinkClusterInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_NETWORK_BROKER_IN_K8S:
          serviceImpl.createNetworkBrokerInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_NETWORK_BROKER_IN_K8S:
          serviceImpl.deleteNetworkBrokerInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_NAMESPACES_IN_K8S:
          serviceImpl.deleteNamespacesInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNamespacesInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_FLINK_CLUSTER_IN_K8S_V2:
          serviceImpl.createFlinkClusterInK8sV2((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateFlinkClusterInK8sV2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_CLUSTER_IN_K8S_V2:
          serviceImpl.deleteFlinkClusterInK8sV2((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteFlinkClusterInK8sV2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RESTART_FLINK_CLUSTER_IN_K8S:
          serviceImpl.restartFlinkClusterInK8s((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.RestartFlinkClusterInK8s) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_NETWORK_BROKER_IN_K8S_V2:
          serviceImpl.createNetworkBrokerInK8sV2((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateNetworkBrokerInK8sV2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_NETWORK_BROKER_IN_K8S_V2:
          serviceImpl.deleteNetworkBrokerInK8sV2((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.DeleteNetworkBrokerInK8sV2) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_DATA_SERVICE_CLUSTER_IN_K8SV2:
          serviceImpl.createDataServiceClusterInK8SV2((com.dataomnis.gproto.types.pbrequest.PBRequestEngineManage.CreateDataServiceClusterInK8sV2) request,
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

  private static abstract class EngineManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EngineManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcengine.PBSvcEngineManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("EngineManage");
    }
  }

  private static final class EngineManageFileDescriptorSupplier
      extends EngineManageBaseDescriptorSupplier {
    EngineManageFileDescriptorSupplier() {}
  }

  private static final class EngineManageMethodDescriptorSupplier
      extends EngineManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EngineManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (EngineManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EngineManageFileDescriptorSupplier())
              .addMethod(getCreateFlinkClusterInK8sMethod())
              .addMethod(getDeleteFlinkClusterInK8sMethod())
              .addMethod(getCreateNetworkBrokerInK8sMethod())
              .addMethod(getDeleteNetworkBrokerInK8sMethod())
              .addMethod(getDeleteNamespacesInK8sMethod())
              .addMethod(getCreateFlinkClusterInK8sV2Method())
              .addMethod(getDeleteFlinkClusterInK8sV2Method())
              .addMethod(getRestartFlinkClusterInK8sMethod())
              .addMethod(getCreateNetworkBrokerInK8sV2Method())
              .addMethod(getDeleteNetworkBrokerInK8sV2Method())
              .addMethod(getCreateDataServiceClusterInK8SV2Method())
              .build();
        }
      }
    }
    return result;
  }
}
