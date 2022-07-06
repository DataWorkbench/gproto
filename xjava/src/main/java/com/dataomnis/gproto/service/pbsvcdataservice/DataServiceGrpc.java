package com.dataomnis.gproto.service.pbsvcdataservice;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/dataservice/dataservice.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class DataServiceGrpc {

  private DataServiceGrpc() {}

  public static final String SERVICE_NAME = "dataservice.DataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster> getCreateDataServiceClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataServiceCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster> getCreateDataServiceClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster> getCreateDataServiceClusterMethod;
    if ((getCreateDataServiceClusterMethod = DataServiceGrpc.getCreateDataServiceClusterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCreateDataServiceClusterMethod = DataServiceGrpc.getCreateDataServiceClusterMethod) == null) {
          DataServiceGrpc.getCreateDataServiceClusterMethod = getCreateDataServiceClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataServiceCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CreateDataServiceCluster"))
              .build();
        }
      }
    }
    return getCreateDataServiceClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters> getListDataServiceClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataServiceClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters> getListDataServiceClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters> getListDataServiceClustersMethod;
    if ((getListDataServiceClustersMethod = DataServiceGrpc.getListDataServiceClustersMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListDataServiceClustersMethod = DataServiceGrpc.getListDataServiceClustersMethod) == null) {
          DataServiceGrpc.getListDataServiceClustersMethod = getListDataServiceClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataServiceClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ListDataServiceClusters"))
              .build();
        }
      }
    }
    return getListDataServiceClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataServiceClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataServiceCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataServiceClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataServiceClusterMethod;
    if ((getUpdateDataServiceClusterMethod = DataServiceGrpc.getUpdateDataServiceClusterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getUpdateDataServiceClusterMethod = DataServiceGrpc.getUpdateDataServiceClusterMethod) == null) {
          DataServiceGrpc.getUpdateDataServiceClusterMethod = getUpdateDataServiceClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataServiceCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("UpdateDataServiceCluster"))
              .build();
        }
      }
    }
    return getUpdateDataServiceClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster> getDescribeDataServiceClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataServiceCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster> getDescribeDataServiceClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster> getDescribeDataServiceClusterMethod;
    if ((getDescribeDataServiceClusterMethod = DataServiceGrpc.getDescribeDataServiceClusterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDescribeDataServiceClusterMethod = DataServiceGrpc.getDescribeDataServiceClusterMethod) == null) {
          DataServiceGrpc.getDescribeDataServiceClusterMethod = getDescribeDataServiceClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataServiceCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DescribeDataServiceCluster"))
              .build();
        }
      }
    }
    return getDescribeDataServiceClusterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataServiceClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataServiceClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataServiceClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataServiceClustersMethod;
    if ((getDeleteDataServiceClustersMethod = DataServiceGrpc.getDeleteDataServiceClustersMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteDataServiceClustersMethod = DataServiceGrpc.getDeleteDataServiceClustersMethod) == null) {
          DataServiceGrpc.getDeleteDataServiceClustersMethod = getDeleteDataServiceClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataServiceClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteDataServiceClusters"))
              .build();
        }
      }
    }
    return getDeleteDataServiceClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartDataServiceClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StartDataServiceClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartDataServiceClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStartDataServiceClustersMethod;
    if ((getStartDataServiceClustersMethod = DataServiceGrpc.getStartDataServiceClustersMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getStartDataServiceClustersMethod = DataServiceGrpc.getStartDataServiceClustersMethod) == null) {
          DataServiceGrpc.getStartDataServiceClustersMethod = getStartDataServiceClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StartDataServiceClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("StartDataServiceClusters"))
              .build();
        }
      }
    }
    return getStartDataServiceClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopDataServiceClustersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "StopDataServiceClusters",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopDataServiceClustersMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getStopDataServiceClustersMethod;
    if ((getStopDataServiceClustersMethod = DataServiceGrpc.getStopDataServiceClustersMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getStopDataServiceClustersMethod = DataServiceGrpc.getStopDataServiceClustersMethod) == null) {
          DataServiceGrpc.getStopDataServiceClustersMethod = getStopDataServiceClustersMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "StopDataServiceClusters"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("StopDataServiceClusters"))
              .build();
        }
      }
    }
    return getStopDataServiceClustersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds> getDescribeServiceDataSourceKindsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeServiceDataSourceKinds",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds> getDescribeServiceDataSourceKindsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds> getDescribeServiceDataSourceKindsMethod;
    if ((getDescribeServiceDataSourceKindsMethod = DataServiceGrpc.getDescribeServiceDataSourceKindsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDescribeServiceDataSourceKindsMethod = DataServiceGrpc.getDescribeServiceDataSourceKindsMethod) == null) {
          DataServiceGrpc.getDescribeServiceDataSourceKindsMethod = getDescribeServiceDataSourceKindsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeServiceDataSourceKinds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DescribeServiceDataSourceKinds"))
              .build();
        }
      }
    }
    return getDescribeServiceDataSourceKindsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup> getCreateApiGroupMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateApiGroup",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup> getCreateApiGroupMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup> getCreateApiGroupMethod;
    if ((getCreateApiGroupMethod = DataServiceGrpc.getCreateApiGroupMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCreateApiGroupMethod = DataServiceGrpc.getCreateApiGroupMethod) == null) {
          DataServiceGrpc.getCreateApiGroupMethod = getCreateApiGroupMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateApiGroup"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CreateApiGroup"))
              .build();
        }
      }
    }
    return getCreateApiGroupMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups> getListApiGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApiGroups",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups> getListApiGroupsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups> getListApiGroupsMethod;
    if ((getListApiGroupsMethod = DataServiceGrpc.getListApiGroupsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListApiGroupsMethod = DataServiceGrpc.getListApiGroupsMethod) == null) {
          DataServiceGrpc.getListApiGroupsMethod = getListApiGroupsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApiGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ListApiGroups"))
              .build();
        }
      }
    }
    return getListApiGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiGroupsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteApiGroups",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiGroupsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiGroupsMethod;
    if ((getDeleteApiGroupsMethod = DataServiceGrpc.getDeleteApiGroupsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteApiGroupsMethod = DataServiceGrpc.getDeleteApiGroupsMethod) == null) {
          DataServiceGrpc.getDeleteApiGroupsMethod = getDeleteApiGroupsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteApiGroups"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteApiGroups"))
              .build();
        }
      }
    }
    return getDeleteApiGroupsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs> getListApiConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApiConfigs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs> getListApiConfigsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs> getListApiConfigsMethod;
    if ((getListApiConfigsMethod = DataServiceGrpc.getListApiConfigsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListApiConfigsMethod = DataServiceGrpc.getListApiConfigsMethod) == null) {
          DataServiceGrpc.getListApiConfigsMethod = getListApiConfigsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApiConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ListApiConfigs"))
              .build();
        }
      }
    }
    return getListApiConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig> getDescribeApiConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeApiConfig",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig> getDescribeApiConfigMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig> getDescribeApiConfigMethod;
    if ((getDescribeApiConfigMethod = DataServiceGrpc.getDescribeApiConfigMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDescribeApiConfigMethod = DataServiceGrpc.getDescribeApiConfigMethod) == null) {
          DataServiceGrpc.getDescribeApiConfigMethod = getDescribeApiConfigMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeApiConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DescribeApiConfig"))
              .build();
        }
      }
    }
    return getDescribeApiConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig> getCreateApiConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateApiConfig",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig> getCreateApiConfigMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig> getCreateApiConfigMethod;
    if ((getCreateApiConfigMethod = DataServiceGrpc.getCreateApiConfigMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCreateApiConfigMethod = DataServiceGrpc.getCreateApiConfigMethod) == null) {
          DataServiceGrpc.getCreateApiConfigMethod = getCreateApiConfigMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateApiConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CreateApiConfig"))
              .build();
        }
      }
    }
    return getCreateApiConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateApiConfigMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateApiConfig",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateApiConfigMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateApiConfigMethod;
    if ((getUpdateApiConfigMethod = DataServiceGrpc.getUpdateApiConfigMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getUpdateApiConfigMethod = DataServiceGrpc.getUpdateApiConfigMethod) == null) {
          DataServiceGrpc.getUpdateApiConfigMethod = getUpdateApiConfigMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateApiConfig"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("UpdateApiConfig"))
              .build();
        }
      }
    }
    return getUpdateApiConfigMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiConfigsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteApiConfigs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiConfigsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiConfigsMethod;
    if ((getDeleteApiConfigsMethod = DataServiceGrpc.getDeleteApiConfigsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteApiConfigsMethod = DataServiceGrpc.getDeleteApiConfigsMethod) == null) {
          DataServiceGrpc.getDeleteApiConfigsMethod = getDeleteApiConfigsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteApiConfigs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteApiConfigs"))
              .build();
        }
      }
    }
    return getDeleteApiConfigsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi> getTestDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi> getTestDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi> getTestDataServiceApiMethod;
    if ((getTestDataServiceApiMethod = DataServiceGrpc.getTestDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getTestDataServiceApiMethod = DataServiceGrpc.getTestDataServiceApiMethod) == null) {
          DataServiceGrpc.getTestDataServiceApiMethod = getTestDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("TestDataServiceApi"))
              .build();
        }
      }
    }
    return getTestDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getPublishDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getPublishDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getPublishDataServiceApiMethod;
    if ((getPublishDataServiceApiMethod = DataServiceGrpc.getPublishDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getPublishDataServiceApiMethod = DataServiceGrpc.getPublishDataServiceApiMethod) == null) {
          DataServiceGrpc.getPublishDataServiceApiMethod = getPublishDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("PublishDataServiceApi"))
              .build();
        }
      }
    }
    return getPublishDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAbolishDataServiceApisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbolishDataServiceApis",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAbolishDataServiceApisMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAbolishDataServiceApisMethod;
    if ((getAbolishDataServiceApisMethod = DataServiceGrpc.getAbolishDataServiceApisMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAbolishDataServiceApisMethod = DataServiceGrpc.getAbolishDataServiceApisMethod) == null) {
          DataServiceGrpc.getAbolishDataServiceApisMethod = getAbolishDataServiceApisMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AbolishDataServiceApis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("AbolishDataServiceApis"))
              .build();
        }
      }
    }
    return getAbolishDataServiceApisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions> getListDataServiceApiVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataServiceApiVersions",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions> getListDataServiceApiVersionsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions> getListDataServiceApiVersionsMethod;
    if ((getListDataServiceApiVersionsMethod = DataServiceGrpc.getListDataServiceApiVersionsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListDataServiceApiVersionsMethod = DataServiceGrpc.getListDataServiceApiVersionsMethod) == null) {
          DataServiceGrpc.getListDataServiceApiVersionsMethod = getListDataServiceApiVersionsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataServiceApiVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ListDataServiceApiVersions"))
              .build();
        }
      }
    }
    return getListDataServiceApiVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion> getDescribeDataServiceApiVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataServiceApiVersion",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion> getDescribeDataServiceApiVersionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion> getDescribeDataServiceApiVersionMethod;
    if ((getDescribeDataServiceApiVersionMethod = DataServiceGrpc.getDescribeDataServiceApiVersionMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDescribeDataServiceApiVersionMethod = DataServiceGrpc.getDescribeDataServiceApiVersionMethod) == null) {
          DataServiceGrpc.getDescribeDataServiceApiVersionMethod = getDescribeDataServiceApiVersionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataServiceApiVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DescribeDataServiceApiVersion"))
              .build();
        }
      }
    }
    return getDescribeDataServiceApiVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRepublishDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RepublishDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRepublishDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRepublishDataServiceApiMethod;
    if ((getRepublishDataServiceApiMethod = DataServiceGrpc.getRepublishDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRepublishDataServiceApiMethod = DataServiceGrpc.getRepublishDataServiceApiMethod) == null) {
          DataServiceGrpc.getRepublishDataServiceApiMethod = getRepublishDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RepublishDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("RepublishDataServiceApi"))
              .build();
        }
      }
    }
    return getRepublishDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId> getListPublishedApiVersionsByClusterIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListPublishedApiVersionsByClusterId",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId> getListPublishedApiVersionsByClusterIdMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId> getListPublishedApiVersionsByClusterIdMethod;
    if ((getListPublishedApiVersionsByClusterIdMethod = DataServiceGrpc.getListPublishedApiVersionsByClusterIdMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListPublishedApiVersionsByClusterIdMethod = DataServiceGrpc.getListPublishedApiVersionsByClusterIdMethod) == null) {
          DataServiceGrpc.getListPublishedApiVersionsByClusterIdMethod = getListPublishedApiVersionsByClusterIdMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListPublishedApiVersionsByClusterId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ListPublishedApiVersionsByClusterId"))
              .build();
        }
      }
    }
    return getListPublishedApiVersionsByClusterIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceStub>() {
        @java.lang.Override
        public DataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceStub(channel, callOptions);
        }
      };
    return DataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub>() {
        @java.lang.Override
        public DataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceBlockingStub(channel, callOptions);
        }
      };
    return DataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub>() {
        @java.lang.Override
        public DataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceFutureStub(channel, callOptions);
        }
      };
    return DataServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class DataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * rpc DeleteByWorkspaces  request space_ids
     * </pre>
     */
    public void createDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataServiceClusterMethod(), responseObserver);
    }

    /**
     */
    public void listDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataServiceClustersMethod(), responseObserver);
    }

    /**
     */
    public void updateDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDataServiceClusterMethod(), responseObserver);
    }

    /**
     */
    public void describeDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataServiceClusterMethod(), responseObserver);
    }

    /**
     */
    public void deleteDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataServiceClustersMethod(), responseObserver);
    }

    /**
     */
    public void startDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStartDataServiceClustersMethod(), responseObserver);
    }

    /**
     */
    public void stopDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getStopDataServiceClustersMethod(), responseObserver);
    }

    /**
     */
    public void describeServiceDataSourceKinds(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeServiceDataSourceKindsMethod(), responseObserver);
    }

    /**
     */
    public void createApiGroup(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateApiGroupMethod(), responseObserver);
    }

    /**
     */
    public void listApiGroups(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListApiGroupsMethod(), responseObserver);
    }

    /**
     */
    public void deleteApiGroups(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteApiGroupsMethod(), responseObserver);
    }

    /**
     */
    public void listApiConfigs(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListApiConfigsMethod(), responseObserver);
    }

    /**
     */
    public void describeApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeApiConfigMethod(), responseObserver);
    }

    /**
     */
    public void createApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateApiConfigMethod(), responseObserver);
    }

    /**
     */
    public void updateApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateApiConfigMethod(), responseObserver);
    }

    /**
     */
    public void deleteApiConfigs(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteApiConfigsMethod(), responseObserver);
    }

    /**
     */
    public void testDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void publishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void abolishDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAbolishDataServiceApisMethod(), responseObserver);
    }

    /**
     */
    public void listDataServiceApiVersions(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataServiceApiVersionsMethod(), responseObserver);
    }

    /**
     */
    public void describeDataServiceApiVersion(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataServiceApiVersionMethod(), responseObserver);
    }

    /**
     */
    public void republishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepublishDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void listPublishedApiVersionsByClusterId(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListPublishedApiVersionsByClusterIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateDataServiceClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster>(
                  this, METHODID_CREATE_DATA_SERVICE_CLUSTER)))
          .addMethod(
            getListDataServiceClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters>(
                  this, METHODID_LIST_DATA_SERVICE_CLUSTERS)))
          .addMethod(
            getUpdateDataServiceClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_DATA_SERVICE_CLUSTER)))
          .addMethod(
            getDescribeDataServiceClusterMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster>(
                  this, METHODID_DESCRIBE_DATA_SERVICE_CLUSTER)))
          .addMethod(
            getDeleteDataServiceClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_DATA_SERVICE_CLUSTERS)))
          .addMethod(
            getStartDataServiceClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_START_DATA_SERVICE_CLUSTERS)))
          .addMethod(
            getStopDataServiceClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_STOP_DATA_SERVICE_CLUSTERS)))
          .addMethod(
            getDescribeServiceDataSourceKindsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds>(
                  this, METHODID_DESCRIBE_SERVICE_DATA_SOURCE_KINDS)))
          .addMethod(
            getCreateApiGroupMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup>(
                  this, METHODID_CREATE_API_GROUP)))
          .addMethod(
            getListApiGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups>(
                  this, METHODID_LIST_API_GROUPS)))
          .addMethod(
            getDeleteApiGroupsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_API_GROUPS)))
          .addMethod(
            getListApiConfigsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs>(
                  this, METHODID_LIST_API_CONFIGS)))
          .addMethod(
            getDescribeApiConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig>(
                  this, METHODID_DESCRIBE_API_CONFIG)))
          .addMethod(
            getCreateApiConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig>(
                  this, METHODID_CREATE_API_CONFIG)))
          .addMethod(
            getUpdateApiConfigMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_API_CONFIG)))
          .addMethod(
            getDeleteApiConfigsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_API_CONFIGS)))
          .addMethod(
            getTestDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi>(
                  this, METHODID_TEST_DATA_SERVICE_API)))
          .addMethod(
            getPublishDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_PUBLISH_DATA_SERVICE_API)))
          .addMethod(
            getAbolishDataServiceApisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ABOLISH_DATA_SERVICE_APIS)))
          .addMethod(
            getListDataServiceApiVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions>(
                  this, METHODID_LIST_DATA_SERVICE_API_VERSIONS)))
          .addMethod(
            getDescribeDataServiceApiVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion>(
                  this, METHODID_DESCRIBE_DATA_SERVICE_API_VERSION)))
          .addMethod(
            getRepublishDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_REPUBLISH_DATA_SERVICE_API)))
          .addMethod(
            getListPublishedApiVersionsByClusterIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId>(
                  this, METHODID_LIST_PUBLISHED_API_VERSIONS_BY_CLUSTER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class DataServiceStub extends io.grpc.stub.AbstractAsyncStub<DataServiceStub> {
    private DataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc DeleteByWorkspaces  request space_ids
     * </pre>
     */
    public void createDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataServiceClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataServiceClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataServiceClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataServiceClusterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataServiceClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void startDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStartDataServiceClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void stopDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getStopDataServiceClustersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeServiceDataSourceKinds(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeServiceDataSourceKindsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createApiGroup(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateApiGroupMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listApiGroups(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListApiGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteApiGroups(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteApiGroupsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listApiConfigs(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListApiConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeApiConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateApiConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateApiConfigMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteApiConfigs(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteApiConfigsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void publishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void abolishDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAbolishDataServiceApisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDataServiceApiVersions(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataServiceApiVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataServiceApiVersion(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataServiceApiVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void republishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepublishDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listPublishedApiVersionsByClusterId(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListPublishedApiVersionsByClusterIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class DataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataServiceBlockingStub> {
    private DataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc DeleteByWorkspaces  request space_ids
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster createDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataServiceClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters listDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataServiceClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataServiceClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster describeDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataServiceClusterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataServiceClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct startDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStartDataServiceClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct stopDataServiceClusters(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getStopDataServiceClustersMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds describeServiceDataSourceKinds(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeServiceDataSourceKindsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup createApiGroup(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateApiGroupMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups listApiGroups(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListApiGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteApiGroups(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteApiGroupsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs listApiConfigs(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListApiConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig describeApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeApiConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig createApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateApiConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateApiConfig(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateApiConfigMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteApiConfigs(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteApiConfigsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi testDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct publishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct abolishDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAbolishDataServiceApisMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions listDataServiceApiVersions(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataServiceApiVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion describeDataServiceApiVersion(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataServiceApiVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct republishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepublishDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId listPublishedApiVersionsByClusterId(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListPublishedApiVersionsByClusterIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataServiceFutureStub> {
    private DataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * rpc DeleteByWorkspaces  request space_ids
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster> createDataServiceCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataServiceClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters> listDataServiceClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataServiceClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateDataServiceCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataServiceClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster> describeDataServiceCluster(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataServiceClusterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteDataServiceClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataServiceClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> startDataServiceClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStartDataServiceClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> stopDataServiceClusters(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getStopDataServiceClustersMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds> describeServiceDataSourceKinds(
        com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeServiceDataSourceKindsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup> createApiGroup(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateApiGroupMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups> listApiGroups(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListApiGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteApiGroups(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteApiGroupsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs> listApiConfigs(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListApiConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig> describeApiConfig(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeApiConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig> createApiConfig(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateApiConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateApiConfig(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateApiConfigMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteApiConfigs(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteApiConfigsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi> testDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> publishDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> abolishDataServiceApis(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAbolishDataServiceApisMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions> listDataServiceApiVersions(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataServiceApiVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion> describeDataServiceApiVersion(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataServiceApiVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> republishDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepublishDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId> listPublishedApiVersionsByClusterId(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListPublishedApiVersionsByClusterIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATA_SERVICE_CLUSTER = 0;
  private static final int METHODID_LIST_DATA_SERVICE_CLUSTERS = 1;
  private static final int METHODID_UPDATE_DATA_SERVICE_CLUSTER = 2;
  private static final int METHODID_DESCRIBE_DATA_SERVICE_CLUSTER = 3;
  private static final int METHODID_DELETE_DATA_SERVICE_CLUSTERS = 4;
  private static final int METHODID_START_DATA_SERVICE_CLUSTERS = 5;
  private static final int METHODID_STOP_DATA_SERVICE_CLUSTERS = 6;
  private static final int METHODID_DESCRIBE_SERVICE_DATA_SOURCE_KINDS = 7;
  private static final int METHODID_CREATE_API_GROUP = 8;
  private static final int METHODID_LIST_API_GROUPS = 9;
  private static final int METHODID_DELETE_API_GROUPS = 10;
  private static final int METHODID_LIST_API_CONFIGS = 11;
  private static final int METHODID_DESCRIBE_API_CONFIG = 12;
  private static final int METHODID_CREATE_API_CONFIG = 13;
  private static final int METHODID_UPDATE_API_CONFIG = 14;
  private static final int METHODID_DELETE_API_CONFIGS = 15;
  private static final int METHODID_TEST_DATA_SERVICE_API = 16;
  private static final int METHODID_PUBLISH_DATA_SERVICE_API = 17;
  private static final int METHODID_ABOLISH_DATA_SERVICE_APIS = 18;
  private static final int METHODID_LIST_DATA_SERVICE_API_VERSIONS = 19;
  private static final int METHODID_DESCRIBE_DATA_SERVICE_API_VERSION = 20;
  private static final int METHODID_REPUBLISH_DATA_SERVICE_API = 21;
  private static final int METHODID_LIST_PUBLISHED_API_VERSIONS_BY_CLUSTER_ID = 22;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_DATA_SERVICE_CLUSTER:
          serviceImpl.createDataServiceCluster((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateDataServiceCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateDataServiceCluster>) responseObserver);
          break;
        case METHODID_LIST_DATA_SERVICE_CLUSTERS:
          serviceImpl.listDataServiceClusters((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceClusters>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_SERVICE_CLUSTER:
          serviceImpl.updateDataServiceCluster((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateDataServiceCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SERVICE_CLUSTER:
          serviceImpl.describeDataServiceCluster((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceCluster>) responseObserver);
          break;
        case METHODID_DELETE_DATA_SERVICE_CLUSTERS:
          serviceImpl.deleteDataServiceClusters((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_START_DATA_SERVICE_CLUSTERS:
          serviceImpl.startDataServiceClusters((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StartDataServiceClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_STOP_DATA_SERVICE_CLUSTERS:
          serviceImpl.stopDataServiceClusters((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.StopDataServiceClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_SERVICE_DATA_SOURCE_KINDS:
          serviceImpl.describeServiceDataSourceKinds((com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeServiceDataSourceKinds>) responseObserver);
          break;
        case METHODID_CREATE_API_GROUP:
          serviceImpl.createApiGroup((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiGroup) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiGroup>) responseObserver);
          break;
        case METHODID_LIST_API_GROUPS:
          serviceImpl.listApiGroups((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiGroups) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiGroups>) responseObserver);
          break;
        case METHODID_DELETE_API_GROUPS:
          serviceImpl.deleteApiGroups((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiGroups) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_API_CONFIGS:
          serviceImpl.listApiConfigs((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiConfigs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiConfigs>) responseObserver);
          break;
        case METHODID_DESCRIBE_API_CONFIG:
          serviceImpl.describeApiConfig((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiConfig) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiConfig>) responseObserver);
          break;
        case METHODID_CREATE_API_CONFIG:
          serviceImpl.createApiConfig((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateApiConfig) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateApiConfig>) responseObserver);
          break;
        case METHODID_UPDATE_API_CONFIG:
          serviceImpl.updateApiConfig((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateApiConfig) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_API_CONFIGS:
          serviceImpl.deleteApiConfigs((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteApiConfigs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_TEST_DATA_SERVICE_API:
          serviceImpl.testDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestDataServiceApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestDataServiceApi>) responseObserver);
          break;
        case METHODID_PUBLISH_DATA_SERVICE_API:
          serviceImpl.publishDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishDataServiceApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ABOLISH_DATA_SERVICE_APIS:
          serviceImpl.abolishDataServiceApis((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishDataServiceApis) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_DATA_SERVICE_API_VERSIONS:
          serviceImpl.listDataServiceApiVersions((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListDataServiceApiVersions) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListDataServiceApiVersions>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SERVICE_API_VERSION:
          serviceImpl.describeDataServiceApiVersion((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceApiVersion) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeDataServiceApiVersion>) responseObserver);
          break;
        case METHODID_REPUBLISH_DATA_SERVICE_API:
          serviceImpl.republishDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.RepublishDataServiceApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_PUBLISHED_API_VERSIONS_BY_CLUSTER_ID:
          serviceImpl.listPublishedApiVersionsByClusterId((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListPublishedApiVersionsByClusterId) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListPublishedApiVersionsByClusterId>) responseObserver);
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

  private static abstract class DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcdataservice.PBSvcDataService.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataService");
    }
  }

  private static final class DataServiceFileDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier {
    DataServiceFileDescriptorSupplier() {}
  }

  private static final class DataServiceMethodDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataServiceFileDescriptorSupplier())
              .addMethod(getCreateDataServiceClusterMethod())
              .addMethod(getListDataServiceClustersMethod())
              .addMethod(getUpdateDataServiceClusterMethod())
              .addMethod(getDescribeDataServiceClusterMethod())
              .addMethod(getDeleteDataServiceClustersMethod())
              .addMethod(getStartDataServiceClustersMethod())
              .addMethod(getStopDataServiceClustersMethod())
              .addMethod(getDescribeServiceDataSourceKindsMethod())
              .addMethod(getCreateApiGroupMethod())
              .addMethod(getListApiGroupsMethod())
              .addMethod(getDeleteApiGroupsMethod())
              .addMethod(getListApiConfigsMethod())
              .addMethod(getDescribeApiConfigMethod())
              .addMethod(getCreateApiConfigMethod())
              .addMethod(getUpdateApiConfigMethod())
              .addMethod(getDeleteApiConfigsMethod())
              .addMethod(getTestDataServiceApiMethod())
              .addMethod(getPublishDataServiceApiMethod())
              .addMethod(getAbolishDataServiceApisMethod())
              .addMethod(getListDataServiceApiVersionsMethod())
              .addMethod(getDescribeDataServiceApiVersionMethod())
              .addMethod(getRepublishDataServiceApiMethod())
              .addMethod(getListPublishedApiVersionsByClusterIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
