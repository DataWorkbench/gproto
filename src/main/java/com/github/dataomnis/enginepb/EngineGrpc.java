package com.github.dataomnis.enginepb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Engine Server
 * Interface for manage global apis of engine-manager
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/engine.proto")
public final class EngineGrpc {

  private EngineGrpc() {}

  public static final String SERVICE_NAME = "enginepb.Engine";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteWorkspacesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteWorkspaces",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteWorkspacesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteWorkspacesMethod;
    if ((getDeleteWorkspacesMethod = EngineGrpc.getDeleteWorkspacesMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDeleteWorkspacesMethod = EngineGrpc.getDeleteWorkspacesMethod) == null) {
          EngineGrpc.getDeleteWorkspacesMethod = getDeleteWorkspacesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteWorkspaces"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DeleteWorkspaces"))
              .build();
        }
      }
    }
    return getDeleteWorkspacesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableFlinkVersions",
      requestType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod;
    if ((getListAvailableFlinkVersionsMethod = EngineGrpc.getListAvailableFlinkVersionsMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getListAvailableFlinkVersionsMethod = EngineGrpc.getListAvailableFlinkVersionsMethod) == null) {
          EngineGrpc.getListAvailableFlinkVersionsMethod = getListAvailableFlinkVersionsMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailableFlinkVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("ListAvailableFlinkVersions"))
              .build();
        }
      }
    }
    return getListAvailableFlinkVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI,
      com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkClusterAPI",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI,
      com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI, com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod;
    if ((getDescribeFlinkClusterAPIMethod = EngineGrpc.getDescribeFlinkClusterAPIMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDescribeFlinkClusterAPIMethod = EngineGrpc.getDescribeFlinkClusterAPIMethod) == null) {
          EngineGrpc.getDescribeFlinkClusterAPIMethod = getDescribeFlinkClusterAPIMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI, com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkClusterAPI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DescribeFlinkClusterAPI"))
              .build();
        }
      }
    }
    return getDescribeFlinkClusterAPIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster,
      com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster> getCreateFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlinkCluster",
      requestType = com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster,
      com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster> getCreateFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster, com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster> getCreateFlinkClusterMethod;
    if ((getCreateFlinkClusterMethod = EngineGrpc.getCreateFlinkClusterMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getCreateFlinkClusterMethod = EngineGrpc.getCreateFlinkClusterMethod) == null) {
          EngineGrpc.getCreateFlinkClusterMethod = getCreateFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster, com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("CreateFlinkCluster"))
              .build();
        }
      }
    }
    return getCreateFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters,
      com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters> getListFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlinkClusters",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters,
      com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters> getListFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters, com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters> getListFlinkClustersMethod;
    if ((getListFlinkClustersMethod = EngineGrpc.getListFlinkClustersMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getListFlinkClustersMethod = EngineGrpc.getListFlinkClustersMethod) == null) {
          EngineGrpc.getListFlinkClustersMethod = getListFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters, com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("ListFlinkClusters"))
              .build();
        }
      }
    }
    return getListFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster,
      com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster> getDescribeFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkCluster",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster,
      com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster> getDescribeFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster, com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster> getDescribeFlinkClusterMethod;
    if ((getDescribeFlinkClusterMethod = EngineGrpc.getDescribeFlinkClusterMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDescribeFlinkClusterMethod = EngineGrpc.getDescribeFlinkClusterMethod) == null) {
          EngineGrpc.getDescribeFlinkClusterMethod = getDescribeFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster, com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DescribeFlinkCluster"))
              .build();
        }
      }
    }
    return getDescribeFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlinkCluster",
      requestType = com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateFlinkClusterMethod;
    if ((getUpdateFlinkClusterMethod = EngineGrpc.getUpdateFlinkClusterMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getUpdateFlinkClusterMethod = EngineGrpc.getUpdateFlinkClusterMethod) == null) {
          EngineGrpc.getUpdateFlinkClusterMethod = getUpdateFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("UpdateFlinkCluster"))
              .build();
        }
      }
    }
    return getUpdateFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkClusters",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteFlinkClustersMethod;
    if ((getDeleteFlinkClustersMethod = EngineGrpc.getDeleteFlinkClustersMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDeleteFlinkClustersMethod = EngineGrpc.getDeleteFlinkClustersMethod) == null) {
          EngineGrpc.getDeleteFlinkClustersMethod = getDeleteFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DeleteFlinkClusters"))
              .build();
        }
      }
    }
    return getDeleteFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getStartFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFlinkClusters",
      requestType = com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getStartFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getStartFlinkClustersMethod;
    if ((getStartFlinkClustersMethod = EngineGrpc.getStartFlinkClustersMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getStartFlinkClustersMethod = EngineGrpc.getStartFlinkClustersMethod) == null) {
          EngineGrpc.getStartFlinkClustersMethod = getStartFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("StartFlinkClusters"))
              .build();
        }
      }
    }
    return getStartFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getStopFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopFlinkClusters",
      requestType = com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getStopFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getStopFlinkClustersMethod;
    if ((getStopFlinkClustersMethod = EngineGrpc.getStopFlinkClustersMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getStopFlinkClustersMethod = EngineGrpc.getStopFlinkClustersMethod) == null) {
          EngineGrpc.getStopFlinkClustersMethod = getStopFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("StopFlinkClusters"))
              .build();
        }
      }
    }
    return getStopFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateNetwork,
      com.github.dataomnis.responsepb.ResponsePB.CreateNetwork> getCreateNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNetwork",
      requestType = com.github.dataomnis.requestpb.RequestPB.CreateNetwork.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.CreateNetwork.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateNetwork,
      com.github.dataomnis.responsepb.ResponsePB.CreateNetwork> getCreateNetworkMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateNetwork, com.github.dataomnis.responsepb.ResponsePB.CreateNetwork> getCreateNetworkMethod;
    if ((getCreateNetworkMethod = EngineGrpc.getCreateNetworkMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getCreateNetworkMethod = EngineGrpc.getCreateNetworkMethod) == null) {
          EngineGrpc.getCreateNetworkMethod = getCreateNetworkMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.CreateNetwork, com.github.dataomnis.responsepb.ResponsePB.CreateNetwork>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.CreateNetwork.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.CreateNetwork.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("CreateNetwork"))
              .build();
        }
      }
    }
    return getCreateNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListNetworks,
      com.github.dataomnis.responsepb.ResponsePB.ListNetworks> getListNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNetworks",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListNetworks.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListNetworks.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListNetworks,
      com.github.dataomnis.responsepb.ResponsePB.ListNetworks> getListNetworksMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListNetworks, com.github.dataomnis.responsepb.ResponsePB.ListNetworks> getListNetworksMethod;
    if ((getListNetworksMethod = EngineGrpc.getListNetworksMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getListNetworksMethod = EngineGrpc.getListNetworksMethod) == null) {
          EngineGrpc.getListNetworksMethod = getListNetworksMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListNetworks, com.github.dataomnis.responsepb.ResponsePB.ListNetworks>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListNetworks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListNetworks.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("ListNetworks"))
              .build();
        }
      }
    }
    return getListNetworksMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeNetwork,
      com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork> getDescribeNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeNetwork",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeNetwork.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeNetwork,
      com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork> getDescribeNetworkMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeNetwork, com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork> getDescribeNetworkMethod;
    if ((getDescribeNetworkMethod = EngineGrpc.getDescribeNetworkMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDescribeNetworkMethod = EngineGrpc.getDescribeNetworkMethod) == null) {
          EngineGrpc.getDescribeNetworkMethod = getDescribeNetworkMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeNetwork, com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeNetwork.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DescribeNetwork"))
              .build();
        }
      }
    }
    return getDescribeNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateNetwork,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateNetworkMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNetwork",
      requestType = com.github.dataomnis.requestpb.RequestPB.UpdateNetwork.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateNetwork,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateNetworkMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateNetwork, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateNetworkMethod;
    if ((getUpdateNetworkMethod = EngineGrpc.getUpdateNetworkMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getUpdateNetworkMethod = EngineGrpc.getUpdateNetworkMethod) == null) {
          EngineGrpc.getUpdateNetworkMethod = getUpdateNetworkMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UpdateNetwork, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateNetwork"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UpdateNetwork.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("UpdateNetwork"))
              .build();
        }
      }
    }
    return getUpdateNetworkMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteNetworks,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteNetworksMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNetworks",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteNetworks.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteNetworks,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteNetworksMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteNetworks, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteNetworksMethod;
    if ((getDeleteNetworksMethod = EngineGrpc.getDeleteNetworksMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getDeleteNetworksMethod = EngineGrpc.getDeleteNetworksMethod) == null) {
          EngineGrpc.getDeleteNetworksMethod = getDeleteNetworksMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteNetworks, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteNetworks"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteNetworks.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("DeleteNetworks"))
              .build();
        }
      }
    }
    return getDeleteNetworksMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EngineStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineStub>() {
        @java.lang.Override
        public EngineStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineStub(channel, callOptions);
        }
      };
    return EngineStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EngineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineBlockingStub>() {
        @java.lang.Override
        public EngineBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineBlockingStub(channel, callOptions);
        }
      };
    return EngineBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EngineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<EngineFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<EngineFutureStub>() {
        @java.lang.Override
        public EngineFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new EngineFutureStub(channel, callOptions);
        }
      };
    return EngineFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Engine Server
   * Interface for manage global apis of engine-manager
   * </pre>
   */
  public static abstract class EngineImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * DeleteWorkspaces for all resource of specified space ids.
     * </pre>
     */
    public void deleteWorkspaces(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteWorkspacesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Flink Server
     * Interface for manage flink cluster
     * </pre>
     */
    public void listAvailableFlinkVersions(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailableFlinkVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public void describeFlinkClusterAPI(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkClusterAPIMethod(), responseObserver);
    }

    /**
     */
    public void createFlinkCluster(com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void listFlinkClusters(com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void describeFlinkCluster(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void updateFlinkCluster(com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void deleteFlinkClusters(com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void startFlinkClusters(com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void stopFlinkClusters(com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopFlinkClustersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Network Server
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public void createNetwork(com.github.dataomnis.requestpb.RequestPB.CreateNetwork request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.CreateNetwork> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateNetworkMethod(), responseObserver);
    }

    /**
     */
    public void listNetworks(com.github.dataomnis.requestpb.RequestPB.ListNetworks request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListNetworks> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListNetworksMethod(), responseObserver);
    }

    /**
     */
    public void describeNetwork(com.github.dataomnis.requestpb.RequestPB.DescribeNetwork request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeNetworkMethod(), responseObserver);
    }

    /**
     */
    public void updateNetwork(com.github.dataomnis.requestpb.RequestPB.UpdateNetwork request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateNetworkMethod(), responseObserver);
    }

    /**
     */
    public void deleteNetworks(com.github.dataomnis.requestpb.RequestPB.DeleteNetworks request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteNetworksMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDeleteWorkspacesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_WORKSPACES)))
          .addMethod(
            getListAvailableFlinkVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
                com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions>(
                  this, METHODID_LIST_AVAILABLE_FLINK_VERSIONS)))
          .addMethod(
            getDescribeFlinkClusterAPIMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI,
                com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI>(
                  this, METHODID_DESCRIBE_FLINK_CLUSTER_API)))
          .addMethod(
            getCreateFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster,
                com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster>(
                  this, METHODID_CREATE_FLINK_CLUSTER)))
          .addMethod(
            getListFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters,
                com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters>(
                  this, METHODID_LIST_FLINK_CLUSTERS)))
          .addMethod(
            getDescribeFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster,
                com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster>(
                  this, METHODID_DESCRIBE_FLINK_CLUSTER)))
          .addMethod(
            getUpdateFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_FLINK_CLUSTER)))
          .addMethod(
            getDeleteFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_CLUSTERS)))
          .addMethod(
            getStartFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_START_FLINK_CLUSTERS)))
          .addMethod(
            getStopFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_STOP_FLINK_CLUSTERS)))
          .addMethod(
            getCreateNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.CreateNetwork,
                com.github.dataomnis.responsepb.ResponsePB.CreateNetwork>(
                  this, METHODID_CREATE_NETWORK)))
          .addMethod(
            getListNetworksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListNetworks,
                com.github.dataomnis.responsepb.ResponsePB.ListNetworks>(
                  this, METHODID_LIST_NETWORKS)))
          .addMethod(
            getDescribeNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeNetwork,
                com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork>(
                  this, METHODID_DESCRIBE_NETWORK)))
          .addMethod(
            getUpdateNetworkMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UpdateNetwork,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_NETWORK)))
          .addMethod(
            getDeleteNetworksMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteNetworks,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_NETWORKS)))
          .build();
    }
  }

  /**
   * <pre>
   * Engine Server
   * Interface for manage global apis of engine-manager
   * </pre>
   */
  public static final class EngineStub extends io.grpc.stub.AbstractAsyncStub<EngineStub> {
    private EngineStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteWorkspaces for all resource of specified space ids.
     * </pre>
     */
    public void deleteWorkspaces(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteWorkspacesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Flink Server
     * Interface for manage flink cluster
     * </pre>
     */
    public void listAvailableFlinkVersions(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailableFlinkVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public void describeFlinkClusterAPI(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterAPIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFlinkCluster(com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFlinkClusters(com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFlinkCluster(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFlinkCluster(com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlinkClusters(com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startFlinkClusters(com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopFlinkClusters(com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Network Server
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public void createNetwork(com.github.dataomnis.requestpb.RequestPB.CreateNetwork request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.CreateNetwork> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listNetworks(com.github.dataomnis.requestpb.RequestPB.ListNetworks request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListNetworks> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeNetwork(com.github.dataomnis.requestpb.RequestPB.DescribeNetwork request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateNetwork(com.github.dataomnis.requestpb.RequestPB.UpdateNetwork request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateNetworkMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteNetworks(com.github.dataomnis.requestpb.RequestPB.DeleteNetworks request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteNetworksMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Engine Server
   * Interface for manage global apis of engine-manager
   * </pre>
   */
  public static final class EngineBlockingStub extends io.grpc.stub.AbstractBlockingStub<EngineBlockingStub> {
    private EngineBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteWorkspaces for all resource of specified space ids.
     * </pre>
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteWorkspaces(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteWorkspacesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Flink Server
     * Interface for manage flink cluster
     * </pre>
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions listAvailableFlinkVersions(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailableFlinkVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI describeFlinkClusterAPI(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkClusterAPIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster createFlinkCluster(com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters listFlinkClusters(com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster describeFlinkCluster(com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct updateFlinkCluster(com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteFlinkClusters(com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct startFlinkClusters(com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct stopFlinkClusters(com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Network Server
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public com.github.dataomnis.responsepb.ResponsePB.CreateNetwork createNetwork(com.github.dataomnis.requestpb.RequestPB.CreateNetwork request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListNetworks listNetworks(com.github.dataomnis.requestpb.RequestPB.ListNetworks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListNetworksMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork describeNetwork(com.github.dataomnis.requestpb.RequestPB.DescribeNetwork request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct updateNetwork(com.github.dataomnis.requestpb.RequestPB.UpdateNetwork request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateNetworkMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteNetworks(com.github.dataomnis.requestpb.RequestPB.DeleteNetworks request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteNetworksMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Engine Server
   * Interface for manage global apis of engine-manager
   * </pre>
   */
  public static final class EngineFutureStub extends io.grpc.stub.AbstractFutureStub<EngineFutureStub> {
    private EngineFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new EngineFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DeleteWorkspaces for all resource of specified space ids.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteWorkspaces(
        com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteWorkspacesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Flink Server
     * Interface for manage flink cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions> listAvailableFlinkVersions(
        com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailableFlinkVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI> describeFlinkClusterAPI(
        com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterAPIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster> createFlinkCluster(
        com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters> listFlinkClusters(
        com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster> describeFlinkCluster(
        com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> updateFlinkCluster(
        com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteFlinkClusters(
        com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> startFlinkClusters(
        com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> stopFlinkClusters(
        com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Network Server
     * Interface for manage network configuration from iaas-pvc
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.CreateNetwork> createNetwork(
        com.github.dataomnis.requestpb.RequestPB.CreateNetwork request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListNetworks> listNetworks(
        com.github.dataomnis.requestpb.RequestPB.ListNetworks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListNetworksMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork> describeNetwork(
        com.github.dataomnis.requestpb.RequestPB.DescribeNetwork request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> updateNetwork(
        com.github.dataomnis.requestpb.RequestPB.UpdateNetwork request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateNetworkMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteNetworks(
        com.github.dataomnis.requestpb.RequestPB.DeleteNetworks request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteNetworksMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DELETE_WORKSPACES = 0;
  private static final int METHODID_LIST_AVAILABLE_FLINK_VERSIONS = 1;
  private static final int METHODID_DESCRIBE_FLINK_CLUSTER_API = 2;
  private static final int METHODID_CREATE_FLINK_CLUSTER = 3;
  private static final int METHODID_LIST_FLINK_CLUSTERS = 4;
  private static final int METHODID_DESCRIBE_FLINK_CLUSTER = 5;
  private static final int METHODID_UPDATE_FLINK_CLUSTER = 6;
  private static final int METHODID_DELETE_FLINK_CLUSTERS = 7;
  private static final int METHODID_START_FLINK_CLUSTERS = 8;
  private static final int METHODID_STOP_FLINK_CLUSTERS = 9;
  private static final int METHODID_CREATE_NETWORK = 10;
  private static final int METHODID_LIST_NETWORKS = 11;
  private static final int METHODID_DESCRIBE_NETWORK = 12;
  private static final int METHODID_UPDATE_NETWORK = 13;
  private static final int METHODID_DELETE_NETWORKS = 14;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EngineImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EngineImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DELETE_WORKSPACES:
          serviceImpl.deleteWorkspaces((com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_AVAILABLE_FLINK_VERSIONS:
          serviceImpl.listAvailableFlinkVersions((com.github.dataomnis.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListAvailableFlinkVersions>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_CLUSTER_API:
          serviceImpl.describeFlinkClusterAPI((com.github.dataomnis.requestpb.RequestPB.DescribeFlinkClusterAPI) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkClusterAPI>) responseObserver);
          break;
        case METHODID_CREATE_FLINK_CLUSTER:
          serviceImpl.createFlinkCluster((com.github.dataomnis.requestpb.RequestPB.CreateFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.CreateFlinkCluster>) responseObserver);
          break;
        case METHODID_LIST_FLINK_CLUSTERS:
          serviceImpl.listFlinkClusters((com.github.dataomnis.requestpb.RequestPB.ListFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListFlinkClusters>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_CLUSTER:
          serviceImpl.describeFlinkCluster((com.github.dataomnis.requestpb.RequestPB.DescribeFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeFlinkCluster>) responseObserver);
          break;
        case METHODID_UPDATE_FLINK_CLUSTER:
          serviceImpl.updateFlinkCluster((com.github.dataomnis.requestpb.RequestPB.UpdateFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_CLUSTERS:
          serviceImpl.deleteFlinkClusters((com.github.dataomnis.requestpb.RequestPB.DeleteFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_START_FLINK_CLUSTERS:
          serviceImpl.startFlinkClusters((com.github.dataomnis.requestpb.RequestPB.StartFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_STOP_FLINK_CLUSTERS:
          serviceImpl.stopFlinkClusters((com.github.dataomnis.requestpb.RequestPB.StopFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_NETWORK:
          serviceImpl.createNetwork((com.github.dataomnis.requestpb.RequestPB.CreateNetwork) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.CreateNetwork>) responseObserver);
          break;
        case METHODID_LIST_NETWORKS:
          serviceImpl.listNetworks((com.github.dataomnis.requestpb.RequestPB.ListNetworks) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListNetworks>) responseObserver);
          break;
        case METHODID_DESCRIBE_NETWORK:
          serviceImpl.describeNetwork((com.github.dataomnis.requestpb.RequestPB.DescribeNetwork) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeNetwork>) responseObserver);
          break;
        case METHODID_UPDATE_NETWORK:
          serviceImpl.updateNetwork((com.github.dataomnis.requestpb.RequestPB.UpdateNetwork) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_NETWORKS:
          serviceImpl.deleteNetworks((com.github.dataomnis.requestpb.RequestPB.DeleteNetworks) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
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

  private static abstract class EngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EngineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.github.dataomnis.enginepb.EnginePB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Engine");
    }
  }

  private static final class EngineFileDescriptorSupplier
      extends EngineBaseDescriptorSupplier {
    EngineFileDescriptorSupplier() {}
  }

  private static final class EngineMethodDescriptorSupplier
      extends EngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EngineMethodDescriptorSupplier(String methodName) {
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
      synchronized (EngineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EngineFileDescriptorSupplier())
              .addMethod(getDeleteWorkspacesMethod())
              .addMethod(getListAvailableFlinkVersionsMethod())
              .addMethod(getDescribeFlinkClusterAPIMethod())
              .addMethod(getCreateFlinkClusterMethod())
              .addMethod(getListFlinkClustersMethod())
              .addMethod(getDescribeFlinkClusterMethod())
              .addMethod(getUpdateFlinkClusterMethod())
              .addMethod(getDeleteFlinkClustersMethod())
              .addMethod(getStartFlinkClustersMethod())
              .addMethod(getStopFlinkClustersMethod())
              .addMethod(getCreateNetworkMethod())
              .addMethod(getListNetworksMethod())
              .addMethod(getDescribeNetworkMethod())
              .addMethod(getUpdateNetworkMethod())
              .addMethod(getDeleteNetworksMethod())
              .build();
        }
      }
    }
    return result;
  }
}
