package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/cluster_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ClusterManageGrpc {

  private ClusterManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.ClusterManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableFlinkVersions",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod;
    if ((getListAvailableFlinkVersionsMethod = ClusterManageGrpc.getListAvailableFlinkVersionsMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getListAvailableFlinkVersionsMethod = ClusterManageGrpc.getListAvailableFlinkVersionsMethod) == null) {
          ClusterManageGrpc.getListAvailableFlinkVersionsMethod = getListAvailableFlinkVersionsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailableFlinkVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("ListAvailableFlinkVersions"))
              .build();
        }
      }
    }
    return getListAvailableFlinkVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkClusterAPI",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod;
    if ((getDescribeFlinkClusterAPIMethod = ClusterManageGrpc.getDescribeFlinkClusterAPIMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getDescribeFlinkClusterAPIMethod = ClusterManageGrpc.getDescribeFlinkClusterAPIMethod) == null) {
          ClusterManageGrpc.getDescribeFlinkClusterAPIMethod = getDescribeFlinkClusterAPIMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkClusterAPI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("DescribeFlinkClusterAPI"))
              .build();
        }
      }
    }
    return getDescribeFlinkClusterAPIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters> getListFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters> getListFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters> getListFlinkClustersMethod;
    if ((getListFlinkClustersMethod = ClusterManageGrpc.getListFlinkClustersMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getListFlinkClustersMethod = ClusterManageGrpc.getListFlinkClustersMethod) == null) {
          ClusterManageGrpc.getListFlinkClustersMethod = getListFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("ListFlinkClusters"))
              .build();
        }
      }
    }
    return getListFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster> getCreateFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlinkCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster> getCreateFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster> getCreateFlinkClusterMethod;
    if ((getCreateFlinkClusterMethod = ClusterManageGrpc.getCreateFlinkClusterMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getCreateFlinkClusterMethod = ClusterManageGrpc.getCreateFlinkClusterMethod) == null) {
          ClusterManageGrpc.getCreateFlinkClusterMethod = getCreateFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("CreateFlinkCluster"))
              .build();
        }
      }
    }
    return getCreateFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster> getDescribeFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster> getDescribeFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster> getDescribeFlinkClusterMethod;
    if ((getDescribeFlinkClusterMethod = ClusterManageGrpc.getDescribeFlinkClusterMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getDescribeFlinkClusterMethod = ClusterManageGrpc.getDescribeFlinkClusterMethod) == null) {
          ClusterManageGrpc.getDescribeFlinkClusterMethod = getDescribeFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("DescribeFlinkCluster"))
              .build();
        }
      }
    }
    return getDescribeFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlinkCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkClusterMethod;
    if ((getUpdateFlinkClusterMethod = ClusterManageGrpc.getUpdateFlinkClusterMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getUpdateFlinkClusterMethod = ClusterManageGrpc.getUpdateFlinkClusterMethod) == null) {
          ClusterManageGrpc.getUpdateFlinkClusterMethod = getUpdateFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("UpdateFlinkCluster"))
              .build();
        }
      }
    }
    return getUpdateFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClustersMethod;
    if ((getDeleteFlinkClustersMethod = ClusterManageGrpc.getDeleteFlinkClustersMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getDeleteFlinkClustersMethod = ClusterManageGrpc.getDeleteFlinkClustersMethod) == null) {
          ClusterManageGrpc.getDeleteFlinkClustersMethod = getDeleteFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("DeleteFlinkClusters"))
              .build();
        }
      }
    }
    return getDeleteFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClustersMethod;
    if ((getStartFlinkClustersMethod = ClusterManageGrpc.getStartFlinkClustersMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getStartFlinkClustersMethod = ClusterManageGrpc.getStartFlinkClustersMethod) == null) {
          ClusterManageGrpc.getStartFlinkClustersMethod = getStartFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("StartFlinkClusters"))
              .build();
        }
      }
    }
    return getStartFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClustersMethod;
    if ((getStopFlinkClustersMethod = ClusterManageGrpc.getStopFlinkClustersMethod) == null) {
      synchronized (ClusterManageGrpc.class) {
        if ((getStopFlinkClustersMethod = ClusterManageGrpc.getStopFlinkClustersMethod) == null) {
          ClusterManageGrpc.getStopFlinkClustersMethod = getStopFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ClusterManageMethodDescriptorSupplier("StopFlinkClusters"))
              .build();
        }
      }
    }
    return getStopFlinkClustersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ClusterManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterManageStub>() {
        @java.lang.Override
        public ClusterManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterManageStub(channel, callOptions);
        }
      };
    return ClusterManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ClusterManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterManageBlockingStub>() {
        @java.lang.Override
        public ClusterManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterManageBlockingStub(channel, callOptions);
        }
      };
    return ClusterManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ClusterManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ClusterManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ClusterManageFutureStub>() {
        @java.lang.Override
        public ClusterManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ClusterManageFutureStub(channel, callOptions);
        }
      };
    return ClusterManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ClusterManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public void listAvailableFlinkVersions(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailableFlinkVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public void describeFlinkClusterAPI(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkClusterAPIMethod(), responseObserver);
    }

    /**
     */
    public void listFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void createFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void describeFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void updateFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void deleteFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void startFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void stopFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopFlinkClustersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListAvailableFlinkVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
                com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions>(
                  this, METHODID_LIST_AVAILABLE_FLINK_VERSIONS)))
          .addMethod(
            getDescribeFlinkClusterAPIMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI,
                com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI>(
                  this, METHODID_DESCRIBE_FLINK_CLUSTER_API)))
          .addMethod(
            getListFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters,
                com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters>(
                  this, METHODID_LIST_FLINK_CLUSTERS)))
          .addMethod(
            getCreateFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster,
                com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster>(
                  this, METHODID_CREATE_FLINK_CLUSTER)))
          .addMethod(
            getDescribeFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster,
                com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster>(
                  this, METHODID_DESCRIBE_FLINK_CLUSTER)))
          .addMethod(
            getUpdateFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_FLINK_CLUSTER)))
          .addMethod(
            getDeleteFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_CLUSTERS)))
          .addMethod(
            getStartFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_START_FLINK_CLUSTERS)))
          .addMethod(
            getStopFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_STOP_FLINK_CLUSTERS)))
          .build();
    }
  }

  /**
   */
  public static final class ClusterManageStub extends io.grpc.stub.AbstractAsyncStub<ClusterManageStub> {
    private ClusterManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public void listAvailableFlinkVersions(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailableFlinkVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public void describeFlinkClusterAPI(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterAPIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ClusterManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<ClusterManageBlockingStub> {
    private ClusterManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions listAvailableFlinkVersions(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailableFlinkVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI describeFlinkClusterAPI(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkClusterAPIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters listFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster createFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster describeFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct startFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct stopFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopFlinkClustersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ClusterManageFutureStub extends io.grpc.stub.AbstractFutureStub<ClusterManageFutureStub> {
    private ClusterManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ClusterManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ClusterManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions> listAvailableFlinkVersions(
        com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailableFlinkVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI> describeFlinkClusterAPI(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterAPIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters> listFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster> createFlinkCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster> describeFlinkCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateFlinkCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> startFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> stopFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopFlinkClustersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_AVAILABLE_FLINK_VERSIONS = 0;
  private static final int METHODID_DESCRIBE_FLINK_CLUSTER_API = 1;
  private static final int METHODID_LIST_FLINK_CLUSTERS = 2;
  private static final int METHODID_CREATE_FLINK_CLUSTER = 3;
  private static final int METHODID_DESCRIBE_FLINK_CLUSTER = 4;
  private static final int METHODID_UPDATE_FLINK_CLUSTER = 5;
  private static final int METHODID_DELETE_FLINK_CLUSTERS = 6;
  private static final int METHODID_START_FLINK_CLUSTERS = 7;
  private static final int METHODID_STOP_FLINK_CLUSTERS = 8;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ClusterManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ClusterManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_AVAILABLE_FLINK_VERSIONS:
          serviceImpl.listAvailableFlinkVersions((com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListAvailableFlinkVersions>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_CLUSTER_API:
          serviceImpl.describeFlinkClusterAPI((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkClusterAPI) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkClusterAPI>) responseObserver);
          break;
        case METHODID_LIST_FLINK_CLUSTERS:
          serviceImpl.listFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.ListFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.ListFlinkClusters>) responseObserver);
          break;
        case METHODID_CREATE_FLINK_CLUSTER:
          serviceImpl.createFlinkCluster((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.CreateFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.CreateFlinkCluster>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_CLUSTER:
          serviceImpl.describeFlinkCluster((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DescribeFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseClusterManage.DescribeFlinkCluster>) responseObserver);
          break;
        case METHODID_UPDATE_FLINK_CLUSTER:
          serviceImpl.updateFlinkCluster((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.UpdateFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_CLUSTERS:
          serviceImpl.deleteFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.DeleteFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_START_FLINK_CLUSTERS:
          serviceImpl.startFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StartFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_STOP_FLINK_CLUSTERS:
          serviceImpl.stopFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestClusterManage.StopFlinkClusters) request,
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

  private static abstract class ClusterManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ClusterManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcClusterManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ClusterManage");
    }
  }

  private static final class ClusterManageFileDescriptorSupplier
      extends ClusterManageBaseDescriptorSupplier {
    ClusterManageFileDescriptorSupplier() {}
  }

  private static final class ClusterManageMethodDescriptorSupplier
      extends ClusterManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ClusterManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (ClusterManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ClusterManageFileDescriptorSupplier())
              .addMethod(getListAvailableFlinkVersionsMethod())
              .addMethod(getDescribeFlinkClusterAPIMethod())
              .addMethod(getListFlinkClustersMethod())
              .addMethod(getCreateFlinkClusterMethod())
              .addMethod(getDescribeFlinkClusterMethod())
              .addMethod(getUpdateFlinkClusterMethod())
              .addMethod(getDeleteFlinkClustersMethod())
              .addMethod(getStartFlinkClustersMethod())
              .addMethod(getStopFlinkClustersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
