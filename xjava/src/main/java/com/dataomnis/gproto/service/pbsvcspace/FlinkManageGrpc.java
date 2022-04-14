package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/flink_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FlinkManageGrpc {

  private FlinkManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.FlinkManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAvailableFlinkVersions",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions> getListAvailableFlinkVersionsMethod;
    if ((getListAvailableFlinkVersionsMethod = FlinkManageGrpc.getListAvailableFlinkVersionsMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getListAvailableFlinkVersionsMethod = FlinkManageGrpc.getListAvailableFlinkVersionsMethod) == null) {
          FlinkManageGrpc.getListAvailableFlinkVersionsMethod = getListAvailableFlinkVersionsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAvailableFlinkVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("ListAvailableFlinkVersions"))
              .build();
        }
      }
    }
    return getListAvailableFlinkVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkClusterAPI",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI> getDescribeFlinkClusterAPIMethod;
    if ((getDescribeFlinkClusterAPIMethod = FlinkManageGrpc.getDescribeFlinkClusterAPIMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getDescribeFlinkClusterAPIMethod = FlinkManageGrpc.getDescribeFlinkClusterAPIMethod) == null) {
          FlinkManageGrpc.getDescribeFlinkClusterAPIMethod = getDescribeFlinkClusterAPIMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkClusterAPI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("DescribeFlinkClusterAPI"))
              .build();
        }
      }
    }
    return getDescribeFlinkClusterAPIMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters> getListFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters> getListFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters> getListFlinkClustersMethod;
    if ((getListFlinkClustersMethod = FlinkManageGrpc.getListFlinkClustersMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getListFlinkClustersMethod = FlinkManageGrpc.getListFlinkClustersMethod) == null) {
          FlinkManageGrpc.getListFlinkClustersMethod = getListFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("ListFlinkClusters"))
              .build();
        }
      }
    }
    return getListFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster> getCreateFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFlinkCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster> getCreateFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster> getCreateFlinkClusterMethod;
    if ((getCreateFlinkClusterMethod = FlinkManageGrpc.getCreateFlinkClusterMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getCreateFlinkClusterMethod = FlinkManageGrpc.getCreateFlinkClusterMethod) == null) {
          FlinkManageGrpc.getCreateFlinkClusterMethod = getCreateFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("CreateFlinkCluster"))
              .build();
        }
      }
    }
    return getCreateFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster> getDescribeFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFlinkCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster> getDescribeFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster> getDescribeFlinkClusterMethod;
    if ((getDescribeFlinkClusterMethod = FlinkManageGrpc.getDescribeFlinkClusterMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getDescribeFlinkClusterMethod = FlinkManageGrpc.getDescribeFlinkClusterMethod) == null) {
          FlinkManageGrpc.getDescribeFlinkClusterMethod = getDescribeFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster, com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("DescribeFlinkCluster"))
              .build();
        }
      }
    }
    return getDescribeFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFlinkCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFlinkClusterMethod;
    if ((getUpdateFlinkClusterMethod = FlinkManageGrpc.getUpdateFlinkClusterMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getUpdateFlinkClusterMethod = FlinkManageGrpc.getUpdateFlinkClusterMethod) == null) {
          FlinkManageGrpc.getUpdateFlinkClusterMethod = getUpdateFlinkClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFlinkCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("UpdateFlinkCluster"))
              .build();
        }
      }
    }
    return getUpdateFlinkClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFlinkClustersMethod;
    if ((getDeleteFlinkClustersMethod = FlinkManageGrpc.getDeleteFlinkClustersMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getDeleteFlinkClustersMethod = FlinkManageGrpc.getDeleteFlinkClustersMethod) == null) {
          FlinkManageGrpc.getDeleteFlinkClustersMethod = getDeleteFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("DeleteFlinkClusters"))
              .build();
        }
      }
    }
    return getDeleteFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartFlinkClustersMethod;
    if ((getStartFlinkClustersMethod = FlinkManageGrpc.getStartFlinkClustersMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getStartFlinkClustersMethod = FlinkManageGrpc.getStartFlinkClustersMethod) == null) {
          FlinkManageGrpc.getStartFlinkClustersMethod = getStartFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("StartFlinkClusters"))
              .build();
        }
      }
    }
    return getStartFlinkClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopFlinkClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopFlinkClustersMethod;
    if ((getStopFlinkClustersMethod = FlinkManageGrpc.getStopFlinkClustersMethod) == null) {
      synchronized (FlinkManageGrpc.class) {
        if ((getStopFlinkClustersMethod = FlinkManageGrpc.getStopFlinkClustersMethod) == null) {
          FlinkManageGrpc.getStopFlinkClustersMethod = getStopFlinkClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopFlinkClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FlinkManageMethodDescriptorSupplier("StopFlinkClusters"))
              .build();
        }
      }
    }
    return getStopFlinkClustersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FlinkManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkManageStub>() {
        @java.lang.Override
        public FlinkManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkManageStub(channel, callOptions);
        }
      };
    return FlinkManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FlinkManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkManageBlockingStub>() {
        @java.lang.Override
        public FlinkManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkManageBlockingStub(channel, callOptions);
        }
      };
    return FlinkManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FlinkManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FlinkManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FlinkManageFutureStub>() {
        @java.lang.Override
        public FlinkManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FlinkManageFutureStub(channel, callOptions);
        }
      };
    return FlinkManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class FlinkManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public void listAvailableFlinkVersions(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAvailableFlinkVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * FIXME: removed it.
     * </pre>
     */
    public void describeFlinkClusterAPI(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkClusterAPIMethod(), responseObserver);
    }

    /**
     */
    public void listFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void createFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void describeFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void updateFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFlinkClusterMethod(), responseObserver);
    }

    /**
     */
    public void deleteFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void startFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartFlinkClustersMethod(), responseObserver);
    }

    /**
     */
    public void stopFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters request,
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
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions>(
                  this, METHODID_LIST_AVAILABLE_FLINK_VERSIONS)))
          .addMethod(
            getDescribeFlinkClusterAPIMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI>(
                  this, METHODID_DESCRIBE_FLINK_CLUSTER_API)))
          .addMethod(
            getListFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters>(
                  this, METHODID_LIST_FLINK_CLUSTERS)))
          .addMethod(
            getCreateFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster>(
                  this, METHODID_CREATE_FLINK_CLUSTER)))
          .addMethod(
            getDescribeFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster,
                com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster>(
                  this, METHODID_DESCRIBE_FLINK_CLUSTER)))
          .addMethod(
            getUpdateFlinkClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_FLINK_CLUSTER)))
          .addMethod(
            getDeleteFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FLINK_CLUSTERS)))
          .addMethod(
            getStartFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_START_FLINK_CLUSTERS)))
          .addMethod(
            getStopFlinkClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_STOP_FLINK_CLUSTERS)))
          .build();
    }
  }

  /**
   */
  public static final class FlinkManageStub extends io.grpc.stub.AbstractAsyncStub<FlinkManageStub> {
    private FlinkManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public void listAvailableFlinkVersions(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAvailableFlinkVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * FIXME: removed it.
     * </pre>
     */
    public void describeFlinkClusterAPI(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterAPIMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFlinkClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopFlinkClustersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class FlinkManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<FlinkManageBlockingStub> {
    private FlinkManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions listAvailableFlinkVersions(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAvailableFlinkVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * FIXME: removed it.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI describeFlinkClusterAPI(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkClusterAPIMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters listFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster createFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster describeFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateFlinkCluster(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFlinkClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct startFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartFlinkClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct stopFlinkClusters(com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopFlinkClustersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class FlinkManageFutureStub extends io.grpc.stub.AbstractFutureStub<FlinkManageFutureStub> {
    private FlinkManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FlinkManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FlinkManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for manage flink cluster
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions> listAvailableFlinkVersions(
        com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAvailableFlinkVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Describe flink cluster api that job-manager commit job to
     * FIXME: removed it.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI> describeFlinkClusterAPI(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterAPIMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters> listFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster> createFlinkCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster> describeFlinkCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateFlinkCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFlinkClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> startFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartFlinkClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> stopFlinkClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters request) {
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
    private final FlinkManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FlinkManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_AVAILABLE_FLINK_VERSIONS:
          serviceImpl.listAvailableFlinkVersions((com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListAvailableFlinkVersions>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_CLUSTER_API:
          serviceImpl.describeFlinkClusterAPI((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkClusterAPI) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkClusterAPI>) responseObserver);
          break;
        case METHODID_LIST_FLINK_CLUSTERS:
          serviceImpl.listFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.ListFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.ListFlinkClusters>) responseObserver);
          break;
        case METHODID_CREATE_FLINK_CLUSTER:
          serviceImpl.createFlinkCluster((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.CreateFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.CreateFlinkCluster>) responseObserver);
          break;
        case METHODID_DESCRIBE_FLINK_CLUSTER:
          serviceImpl.describeFlinkCluster((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DescribeFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFlinkManage.DescribeFlinkCluster>) responseObserver);
          break;
        case METHODID_UPDATE_FLINK_CLUSTER:
          serviceImpl.updateFlinkCluster((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.UpdateFlinkCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_FLINK_CLUSTERS:
          serviceImpl.deleteFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.DeleteFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_START_FLINK_CLUSTERS:
          serviceImpl.startFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StartFlinkClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_STOP_FLINK_CLUSTERS:
          serviceImpl.stopFlinkClusters((com.dataomnis.gproto.types.pbrequest.PBRequestFlinkManage.StopFlinkClusters) request,
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

  private static abstract class FlinkManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FlinkManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcFlinkManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FlinkManage");
    }
  }

  private static final class FlinkManageFileDescriptorSupplier
      extends FlinkManageBaseDescriptorSupplier {
    FlinkManageFileDescriptorSupplier() {}
  }

  private static final class FlinkManageMethodDescriptorSupplier
      extends FlinkManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FlinkManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (FlinkManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FlinkManageFileDescriptorSupplier())
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
