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
      com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster> getDescribeDataServiceClusterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataServiceCluster",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster,
      com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster> getDescribeDataServiceClusterMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster, com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster> getDescribeDataServiceClusterMethod;
    if ((getDescribeDataServiceClusterMethod = DataServiceGrpc.getDescribeDataServiceClusterMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDescribeDataServiceClusterMethod = DataServiceGrpc.getDescribeDataServiceClusterMethod) == null) {
          DataServiceGrpc.getDescribeDataServiceClusterMethod = getDescribeDataServiceClusterMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster, com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataServiceCluster"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster.getDefaultInstance()))
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

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi> getCreateDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi> getCreateDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi> getCreateDataServiceApiMethod;
    if ((getCreateDataServiceApiMethod = DataServiceGrpc.getCreateDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getCreateDataServiceApiMethod = DataServiceGrpc.getCreateDataServiceApiMethod) == null) {
          DataServiceGrpc.getCreateDataServiceApiMethod = getCreateDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("CreateDataServiceApi"))
              .build();
        }
      }
    }
    return getCreateDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataServiceApiMethod;
    if ((getUpdateDataServiceApiMethod = DataServiceGrpc.getUpdateDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getUpdateDataServiceApiMethod = DataServiceGrpc.getUpdateDataServiceApiMethod) == null) {
          DataServiceGrpc.getUpdateDataServiceApiMethod = getUpdateDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("UpdateDataServiceApi"))
              .build();
        }
      }
    }
    return getUpdateDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi> getDescribeDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi> getDescribeDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi> getDescribeDataServiceApiMethod;
    if ((getDescribeDataServiceApiMethod = DataServiceGrpc.getDescribeDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDescribeDataServiceApiMethod = DataServiceGrpc.getDescribeDataServiceApiMethod) == null) {
          DataServiceGrpc.getDescribeDataServiceApiMethod = getDescribeDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DescribeDataServiceApi"))
              .build();
        }
      }
    }
    return getDescribeDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis> getListDataServiceApisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataServiceApis",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis> getListDataServiceApisMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis> getListDataServiceApisMethod;
    if ((getListDataServiceApisMethod = DataServiceGrpc.getListDataServiceApisMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListDataServiceApisMethod = DataServiceGrpc.getListDataServiceApisMethod) == null) {
          DataServiceGrpc.getListDataServiceApisMethod = getListDataServiceApisMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataServiceApis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ListDataServiceApis"))
              .build();
        }
      }
    }
    return getListDataServiceApisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataServiceApisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataServiceApis",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataServiceApisMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataServiceApisMethod;
    if ((getDeleteDataServiceApisMethod = DataServiceGrpc.getDeleteDataServiceApisMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteDataServiceApisMethod = DataServiceGrpc.getDeleteDataServiceApisMethod) == null) {
          DataServiceGrpc.getDeleteDataServiceApisMethod = getDeleteDataServiceApisMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataServiceApis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DeleteDataServiceApis"))
              .build();
        }
      }
    }
    return getDeleteDataServiceApisMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi> getTestDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TestDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi> getTestDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi> getTestDataServiceApiMethod;
    if ((getTestDataServiceApiMethod = DataServiceGrpc.getTestDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getTestDataServiceApiMethod = DataServiceGrpc.getTestDataServiceApiMethod) == null) {
          DataServiceGrpc.getTestDataServiceApiMethod = getTestDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TestDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("TestDataServiceApi"))
              .build();
        }
      }
    }
    return getTestDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getPublishDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PublishDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getPublishDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getPublishDataServiceApiMethod;
    if ((getPublishDataServiceApiMethod = DataServiceGrpc.getPublishDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getPublishDataServiceApiMethod = DataServiceGrpc.getPublishDataServiceApiMethod) == null) {
          DataServiceGrpc.getPublishDataServiceApiMethod = getPublishDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PublishDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("PublishDataServiceApi"))
              .build();
        }
      }
    }
    return getPublishDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions> getListDataServiceApiVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataServiceApiVersions",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions> getListDataServiceApiVersionsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions> getListDataServiceApiVersionsMethod;
    if ((getListDataServiceApiVersionsMethod = DataServiceGrpc.getListDataServiceApiVersionsMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getListDataServiceApiVersionsMethod = DataServiceGrpc.getListDataServiceApiVersionsMethod) == null) {
          DataServiceGrpc.getListDataServiceApiVersionsMethod = getListDataServiceApiVersionsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataServiceApiVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("ListDataServiceApiVersions"))
              .build();
        }
      }
    }
    return getListDataServiceApiVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion> getDescribeDataServiceApiVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataServiceApiVersion",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion> getDescribeDataServiceApiVersionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion> getDescribeDataServiceApiVersionMethod;
    if ((getDescribeDataServiceApiVersionMethod = DataServiceGrpc.getDescribeDataServiceApiVersionMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDescribeDataServiceApiVersionMethod = DataServiceGrpc.getDescribeDataServiceApiVersionMethod) == null) {
          DataServiceGrpc.getDescribeDataServiceApiVersionMethod = getDescribeDataServiceApiVersionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion, com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataServiceApiVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("DescribeDataServiceApiVersion"))
              .build();
        }
      }
    }
    return getDescribeDataServiceApiVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRepublishDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RepublishDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRepublishDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getRepublishDataServiceApiMethod;
    if ((getRepublishDataServiceApiMethod = DataServiceGrpc.getRepublishDataServiceApiMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRepublishDataServiceApiMethod = DataServiceGrpc.getRepublishDataServiceApiMethod) == null) {
          DataServiceGrpc.getRepublishDataServiceApiMethod = getRepublishDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RepublishDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("RepublishDataServiceApi"))
              .build();
        }
      }
    }
    return getRepublishDataServiceApiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAbolishDataServiceApisMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AbolishDataServiceApis",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAbolishDataServiceApisMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAbolishDataServiceApisMethod;
    if ((getAbolishDataServiceApisMethod = DataServiceGrpc.getAbolishDataServiceApisMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAbolishDataServiceApisMethod = DataServiceGrpc.getAbolishDataServiceApisMethod) == null) {
          DataServiceGrpc.getAbolishDataServiceApisMethod = getAbolishDataServiceApisMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AbolishDataServiceApis"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("AbolishDataServiceApis"))
              .build();
        }
      }
    }
    return getAbolishDataServiceApisMethod;
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
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster> responseObserver) {
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
    public void createDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void updateDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void describeDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void listDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataServiceApisMethod(), responseObserver);
    }

    /**
     */
    public void deleteDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataServiceApisMethod(), responseObserver);
    }

    /**
     */
    public void testDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTestDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void publishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPublishDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void listDataServiceApiVersions(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataServiceApiVersionsMethod(), responseObserver);
    }

    /**
     */
    public void describeDataServiceApiVersion(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataServiceApiVersionMethod(), responseObserver);
    }

    /**
     */
    public void republishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRepublishDataServiceApiMethod(), responseObserver);
    }

    /**
     */
    public void abolishDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAbolishDataServiceApisMethod(), responseObserver);
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
                com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster>(
                  this, METHODID_DESCRIBE_DATA_SERVICE_CLUSTER)))
          .addMethod(
            getDeleteDataServiceClustersMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_DATA_SERVICE_CLUSTERS)))
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
            getCreateDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi>(
                  this, METHODID_CREATE_DATA_SERVICE_API)))
          .addMethod(
            getUpdateDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_DATA_SERVICE_API)))
          .addMethod(
            getDescribeDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi>(
                  this, METHODID_DESCRIBE_DATA_SERVICE_API)))
          .addMethod(
            getListDataServiceApisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis>(
                  this, METHODID_LIST_DATA_SERVICE_APIS)))
          .addMethod(
            getDeleteDataServiceApisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_DATA_SERVICE_APIS)))
          .addMethod(
            getTestDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi>(
                  this, METHODID_TEST_DATA_SERVICE_API)))
          .addMethod(
            getPublishDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_PUBLISH_DATA_SERVICE_API)))
          .addMethod(
            getListDataServiceApiVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions>(
                  this, METHODID_LIST_DATA_SERVICE_API_VERSIONS)))
          .addMethod(
            getDescribeDataServiceApiVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion>(
                  this, METHODID_DESCRIBE_DATA_SERVICE_API_VERSION)))
          .addMethod(
            getRepublishDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_REPUBLISH_DATA_SERVICE_API)))
          .addMethod(
            getAbolishDataServiceApisMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ABOLISH_DATA_SERVICE_APIS)))
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
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster> responseObserver) {
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
    public void createDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataServiceApisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataServiceApisMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTestDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void publishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPublishDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDataServiceApiVersions(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataServiceApiVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataServiceApiVersion(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataServiceApiVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void republishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRepublishDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void abolishDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAbolishDataServiceApisMethod(), getCallOptions()), request, responseObserver);
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
    public com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster describeDataServiceCluster(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeDataServiceCluster request) {
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
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi createDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi describeDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis listDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataServiceApisMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataServiceApisMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi testDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTestDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct publishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPublishDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions listDataServiceApiVersions(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataServiceApiVersionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion describeDataServiceApiVersion(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataServiceApiVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct republishDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRepublishDataServiceApiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct abolishDataServiceApis(com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAbolishDataServiceApisMethod(), getCallOptions(), request);
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
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster> describeDataServiceCluster(
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
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi> createDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi> describeDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis> listDataServiceApis(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataServiceApisMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteDataServiceApis(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataServiceApisMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi> testDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTestDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> publishDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPublishDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions> listDataServiceApiVersions(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataServiceApiVersionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion> describeDataServiceApiVersion(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataServiceApiVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> republishDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRepublishDataServiceApiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> abolishDataServiceApis(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAbolishDataServiceApisMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_DATA_SERVICE_CLUSTER = 0;
  private static final int METHODID_LIST_DATA_SERVICE_CLUSTERS = 1;
  private static final int METHODID_UPDATE_DATA_SERVICE_CLUSTER = 2;
  private static final int METHODID_DESCRIBE_DATA_SERVICE_CLUSTER = 3;
  private static final int METHODID_DELETE_DATA_SERVICE_CLUSTERS = 4;
  private static final int METHODID_CREATE_API_GROUP = 5;
  private static final int METHODID_LIST_API_GROUPS = 6;
  private static final int METHODID_DELETE_API_GROUPS = 7;
  private static final int METHODID_CREATE_DATA_SERVICE_API = 8;
  private static final int METHODID_UPDATE_DATA_SERVICE_API = 9;
  private static final int METHODID_DESCRIBE_DATA_SERVICE_API = 10;
  private static final int METHODID_LIST_DATA_SERVICE_APIS = 11;
  private static final int METHODID_DELETE_DATA_SERVICE_APIS = 12;
  private static final int METHODID_TEST_DATA_SERVICE_API = 13;
  private static final int METHODID_PUBLISH_DATA_SERVICE_API = 14;
  private static final int METHODID_LIST_DATA_SERVICE_API_VERSIONS = 15;
  private static final int METHODID_DESCRIBE_DATA_SERVICE_API_VERSION = 16;
  private static final int METHODID_REPUBLISH_DATA_SERVICE_API = 17;
  private static final int METHODID_ABOLISH_DATA_SERVICE_APIS = 18;

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
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelDataService.DataServiceCluster>) responseObserver);
          break;
        case METHODID_DELETE_DATA_SERVICE_CLUSTERS:
          serviceImpl.deleteDataServiceClusters((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteDataServiceClusters) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
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
        case METHODID_CREATE_DATA_SERVICE_API:
          serviceImpl.createDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.CreateCustomerApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.CreateCustomerApi>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_SERVICE_API:
          serviceImpl.updateDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.UpdateCustomerApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SERVICE_API:
          serviceImpl.describeDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeCustomerApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeCustomerApi>) responseObserver);
          break;
        case METHODID_LIST_DATA_SERVICE_APIS:
          serviceImpl.listDataServiceApis((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListCustomerApis) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListCustomerApis>) responseObserver);
          break;
        case METHODID_DELETE_DATA_SERVICE_APIS:
          serviceImpl.deleteDataServiceApis((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DeleteCustomerApis) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_TEST_DATA_SERVICE_API:
          serviceImpl.testDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.TestCustomerApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.TestCustomerApi>) responseObserver);
          break;
        case METHODID_PUBLISH_DATA_SERVICE_API:
          serviceImpl.publishDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.PublishCustomerApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_DATA_SERVICE_API_VERSIONS:
          serviceImpl.listDataServiceApiVersions((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.ListApiVersions) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.ListApiVersions>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SERVICE_API_VERSION:
          serviceImpl.describeDataServiceApiVersion((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.DescribeApiVersion>) responseObserver);
          break;
        case METHODID_REPUBLISH_DATA_SERVICE_API:
          serviceImpl.republishDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.DescribeApiVersion) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ABOLISH_DATA_SERVICE_APIS:
          serviceImpl.abolishDataServiceApis((com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.AbolishCustomerApis) request,
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
              .addMethod(getCreateApiGroupMethod())
              .addMethod(getListApiGroupsMethod())
              .addMethod(getDeleteApiGroupsMethod())
              .addMethod(getCreateDataServiceApiMethod())
              .addMethod(getUpdateDataServiceApiMethod())
              .addMethod(getDescribeDataServiceApiMethod())
              .addMethod(getListDataServiceApisMethod())
              .addMethod(getDeleteDataServiceApisMethod())
              .addMethod(getTestDataServiceApiMethod())
              .addMethod(getPublishDataServiceApiMethod())
              .addMethod(getListDataServiceApiVersionsMethod())
              .addMethod(getDescribeDataServiceApiVersionMethod())
              .addMethod(getRepublishDataServiceApiMethod())
              .addMethod(getAbolishDataServiceApisMethod())
              .build();
        }
      }
    }
    return result;
  }
}
