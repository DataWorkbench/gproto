package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * DataSourceManage declares API for manage datasource.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/spacemanager/datasouce_manage.proto")
public final class DataSourceManageGrpc {

  private DataSourceManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.DataSourceManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources> getListDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataSources",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources> getListDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources> getListDataSourcesMethod;
    if ((getListDataSourcesMethod = DataSourceManageGrpc.getListDataSourcesMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getListDataSourcesMethod = DataSourceManageGrpc.getListDataSourcesMethod) == null) {
          DataSourceManageGrpc.getListDataSourcesMethod = getListDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("ListDataSources"))
              .build();
        }
      }
    }
    return getListDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource> getCreateDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataSource",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource> getCreateDataSourceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource> getCreateDataSourceMethod;
    if ((getCreateDataSourceMethod = DataSourceManageGrpc.getCreateDataSourceMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getCreateDataSourceMethod = DataSourceManageGrpc.getCreateDataSourceMethod) == null) {
          DataSourceManageGrpc.getCreateDataSourceMethod = getCreateDataSourceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("CreateDataSource"))
              .build();
        }
      }
    }
    return getCreateDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataSource",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataSourceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateDataSourceMethod;
    if ((getUpdateDataSourceMethod = DataSourceManageGrpc.getUpdateDataSourceMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getUpdateDataSourceMethod = DataSourceManageGrpc.getUpdateDataSourceMethod) == null) {
          DataSourceManageGrpc.getUpdateDataSourceMethod = getUpdateDataSourceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("UpdateDataSource"))
              .build();
        }
      }
    }
    return getUpdateDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource> getDescribeDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSource",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource> getDescribeDataSourceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource> getDescribeDataSourceMethod;
    if ((getDescribeDataSourceMethod = DataSourceManageGrpc.getDescribeDataSourceMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getDescribeDataSourceMethod = DataSourceManageGrpc.getDescribeDataSourceMethod) == null) {
          DataSourceManageGrpc.getDescribeDataSourceMethod = getDescribeDataSourceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("DescribeDataSource"))
              .build();
        }
      }
    }
    return getDescribeDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableDataSources",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDisableDataSourcesMethod;
    if ((getDisableDataSourcesMethod = DataSourceManageGrpc.getDisableDataSourcesMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getDisableDataSourcesMethod = DataSourceManageGrpc.getDisableDataSourcesMethod) == null) {
          DataSourceManageGrpc.getDisableDataSourcesMethod = getDisableDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("DisableDataSources"))
              .build();
        }
      }
    }
    return getDisableDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableDataSources",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getEnableDataSourcesMethod;
    if ((getEnableDataSourcesMethod = DataSourceManageGrpc.getEnableDataSourcesMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getEnableDataSourcesMethod = DataSourceManageGrpc.getEnableDataSourcesMethod) == null) {
          DataSourceManageGrpc.getEnableDataSourcesMethod = getEnableDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("EnableDataSources"))
              .build();
        }
      }
    }
    return getEnableDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataSources",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteDataSourcesMethod;
    if ((getDeleteDataSourcesMethod = DataSourceManageGrpc.getDeleteDataSourcesMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getDeleteDataSourcesMethod = DataSourceManageGrpc.getDeleteDataSourcesMethod) == null) {
          DataSourceManageGrpc.getDeleteDataSourcesMethod = getDeleteDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("DeleteDataSources"))
              .build();
        }
      }
    }
    return getDeleteDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds> getDescribeDataSourceKindsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSourceKinds",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds> getDescribeDataSourceKindsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds> getDescribeDataSourceKindsMethod;
    if ((getDescribeDataSourceKindsMethod = DataSourceManageGrpc.getDescribeDataSourceKindsMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getDescribeDataSourceKindsMethod = DataSourceManageGrpc.getDescribeDataSourceKindsMethod) == null) {
          DataSourceManageGrpc.getDescribeDataSourceKindsMethod = getDescribeDataSourceKindsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSourceKinds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("DescribeDataSourceKinds"))
              .build();
        }
      }
    }
    return getDescribeDataSourceKindsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections> getListDataSourceConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataSourceConnections",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections> getListDataSourceConnectionsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections> getListDataSourceConnectionsMethod;
    if ((getListDataSourceConnectionsMethod = DataSourceManageGrpc.getListDataSourceConnectionsMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getListDataSourceConnectionsMethod = DataSourceManageGrpc.getListDataSourceConnectionsMethod) == null) {
          DataSourceManageGrpc.getListDataSourceConnectionsMethod = getListDataSourceConnectionsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataSourceConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("ListDataSourceConnections"))
              .build();
        }
      }
    }
    return getListDataSourceConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection> getPingDataSourceConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingDataSourceConnection",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection> getPingDataSourceConnectionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection> getPingDataSourceConnectionMethod;
    if ((getPingDataSourceConnectionMethod = DataSourceManageGrpc.getPingDataSourceConnectionMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getPingDataSourceConnectionMethod = DataSourceManageGrpc.getPingDataSourceConnectionMethod) == null) {
          DataSourceManageGrpc.getPingDataSourceConnectionMethod = getPingDataSourceConnectionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingDataSourceConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("PingDataSourceConnection"))
              .build();
        }
      }
    }
    return getPingDataSourceConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> getDescribeDataSourceTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSourceTables",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> getDescribeDataSourceTablesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> getDescribeDataSourceTablesMethod;
    if ((getDescribeDataSourceTablesMethod = DataSourceManageGrpc.getDescribeDataSourceTablesMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getDescribeDataSourceTablesMethod = DataSourceManageGrpc.getDescribeDataSourceTablesMethod) == null) {
          DataSourceManageGrpc.getDescribeDataSourceTablesMethod = getDescribeDataSourceTablesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSourceTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("DescribeDataSourceTables"))
              .build();
        }
      }
    }
    return getDescribeDataSourceTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> getDescribeDataSourceTableSchemaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSourceTableSchema",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> getDescribeDataSourceTableSchemaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> getDescribeDataSourceTableSchemaMethod;
    if ((getDescribeDataSourceTableSchemaMethod = DataSourceManageGrpc.getDescribeDataSourceTableSchemaMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getDescribeDataSourceTableSchemaMethod = DataSourceManageGrpc.getDescribeDataSourceTableSchemaMethod) == null) {
          DataSourceManageGrpc.getDescribeDataSourceTableSchemaMethod = getDescribeDataSourceTableSchemaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSourceTableSchema"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("DescribeDataSourceTableSchema"))
              .build();
        }
      }
    }
    return getDescribeDataSourceTableSchemaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi> getDescribeTableSchemaDataServiceApiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeTableSchemaDataServiceApi",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi,
      com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi> getDescribeTableSchemaDataServiceApiMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi> getDescribeTableSchemaDataServiceApiMethod;
    if ((getDescribeTableSchemaDataServiceApiMethod = DataSourceManageGrpc.getDescribeTableSchemaDataServiceApiMethod) == null) {
      synchronized (DataSourceManageGrpc.class) {
        if ((getDescribeTableSchemaDataServiceApiMethod = DataSourceManageGrpc.getDescribeTableSchemaDataServiceApiMethod) == null) {
          DataSourceManageGrpc.getDescribeTableSchemaDataServiceApiMethod = getDescribeTableSchemaDataServiceApiMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi, com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeTableSchemaDataServiceApi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi.getDefaultInstance()))
              .setSchemaDescriptor(new DataSourceManageMethodDescriptorSupplier("DescribeTableSchemaDataServiceApi"))
              .build();
        }
      }
    }
    return getDescribeTableSchemaDataServiceApiMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataSourceManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceManageStub>() {
        @java.lang.Override
        public DataSourceManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceManageStub(channel, callOptions);
        }
      };
    return DataSourceManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataSourceManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceManageBlockingStub>() {
        @java.lang.Override
        public DataSourceManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceManageBlockingStub(channel, callOptions);
        }
      };
    return DataSourceManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataSourceManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataSourceManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataSourceManageFutureStub>() {
        @java.lang.Override
        public DataSourceManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataSourceManageFutureStub(channel, callOptions);
        }
      };
    return DataSourceManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * DataSourceManage declares API for manage datasource.
   * </pre>
   */
  public static abstract class DataSourceManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public void listDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void createDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataSourceMethod(), responseObserver);
    }

    /**
     */
    public void updateDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDataSourceMethod(), responseObserver);
    }

    /**
     */
    public void describeDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceMethod(), responseObserver);
    }

    /**
     */
    public void disableDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void enableDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void deleteDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void describeDataSourceKinds(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceKindsMethod(), responseObserver);
    }

    /**
     */
    public void listDataSourceConnections(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataSourceConnectionsMethod(), responseObserver);
    }

    /**
     */
    public void pingDataSourceConnection(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingDataSourceConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public void describeDataSourceTables(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceTablesMethod(), responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public void describeDataSourceTableSchema(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceTableSchemaMethod(), responseObserver);
    }

    /**
     */
    public void describeTableSchemaDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeTableSchemaDataServiceApiMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources>(
                  this, METHODID_LIST_DATA_SOURCES)))
          .addMethod(
            getCreateDataSourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource>(
                  this, METHODID_CREATE_DATA_SOURCE)))
          .addMethod(
            getUpdateDataSourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_DATA_SOURCE)))
          .addMethod(
            getDescribeDataSourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource>(
                  this, METHODID_DESCRIBE_DATA_SOURCE)))
          .addMethod(
            getDisableDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DISABLE_DATA_SOURCES)))
          .addMethod(
            getEnableDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ENABLE_DATA_SOURCES)))
          .addMethod(
            getDeleteDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_DATA_SOURCES)))
          .addMethod(
            getDescribeDataSourceKindsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds>(
                  this, METHODID_DESCRIBE_DATA_SOURCE_KINDS)))
          .addMethod(
            getListDataSourceConnectionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections>(
                  this, METHODID_LIST_DATA_SOURCE_CONNECTIONS)))
          .addMethod(
            getPingDataSourceConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection>(
                  this, METHODID_PING_DATA_SOURCE_CONNECTION)))
          .addMethod(
            getDescribeDataSourceTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables>(
                  this, METHODID_DESCRIBE_DATA_SOURCE_TABLES)))
          .addMethod(
            getDescribeDataSourceTableSchemaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema>(
                  this, METHODID_DESCRIBE_DATA_SOURCE_TABLE_SCHEMA)))
          .addMethod(
            getDescribeTableSchemaDataServiceApiMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi,
                com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi>(
                  this, METHODID_DESCRIBE_TABLE_SCHEMA_DATA_SERVICE_API)))
          .build();
    }
  }

  /**
   * <pre>
   * DataSourceManage declares API for manage datasource.
   * </pre>
   */
  public static final class DataSourceManageStub extends io.grpc.stub.AbstractAsyncStub<DataSourceManageStub> {
    private DataSourceManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public void listDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataSourceKinds(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceKindsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDataSourceConnections(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataSourceConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pingDataSourceConnection(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingDataSourceConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public void describeDataSourceTables(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public void describeDataSourceTableSchema(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceTableSchemaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeTableSchemaDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeTableSchemaDataServiceApiMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * DataSourceManage declares API for manage datasource.
   * </pre>
   */
  public static final class DataSourceManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataSourceManageBlockingStub> {
    private DataSourceManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources listDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource createDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource describeDataSource(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct disableDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct enableDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteDataSources(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds describeDataSourceKinds(com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceKindsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections listDataSourceConnections(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataSourceConnectionsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection pingDataSourceConnection(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingDataSourceConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables describeDataSourceTables(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceTablesMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema describeDataSourceTableSchema(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceTableSchemaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi describeTableSchemaDataServiceApi(com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeTableSchemaDataServiceApiMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * DataSourceManage declares API for manage datasource.
   * </pre>
   */
  public static final class DataSourceManageFutureStub extends io.grpc.stub.AbstractFutureStub<DataSourceManageFutureStub> {
    private DataSourceManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataSourceManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataSourceManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources> listDataSources(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource> createDataSource(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateDataSource(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource> describeDataSource(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> disableDataSources(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> enableDataSources(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteDataSources(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds> describeDataSourceKinds(
        com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceKindsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections> listDataSourceConnections(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataSourceConnectionsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection> pingDataSourceConnection(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingDataSourceConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTables get a table list of specified data source.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables> describeDataSourceTables(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceTablesMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DescribeDataSourceTableSchema get the table schema of specified table in datasource.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema> describeDataSourceTableSchema(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceTableSchemaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi> describeTableSchemaDataServiceApi(
        com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeTableSchemaDataServiceApiMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DATA_SOURCES = 0;
  private static final int METHODID_CREATE_DATA_SOURCE = 1;
  private static final int METHODID_UPDATE_DATA_SOURCE = 2;
  private static final int METHODID_DESCRIBE_DATA_SOURCE = 3;
  private static final int METHODID_DISABLE_DATA_SOURCES = 4;
  private static final int METHODID_ENABLE_DATA_SOURCES = 5;
  private static final int METHODID_DELETE_DATA_SOURCES = 6;
  private static final int METHODID_DESCRIBE_DATA_SOURCE_KINDS = 7;
  private static final int METHODID_LIST_DATA_SOURCE_CONNECTIONS = 8;
  private static final int METHODID_PING_DATA_SOURCE_CONNECTION = 9;
  private static final int METHODID_DESCRIBE_DATA_SOURCE_TABLES = 10;
  private static final int METHODID_DESCRIBE_DATA_SOURCE_TABLE_SCHEMA = 11;
  private static final int METHODID_DESCRIBE_TABLE_SCHEMA_DATA_SERVICE_API = 12;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataSourceManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataSourceManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DATA_SOURCES:
          serviceImpl.listDataSources((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSources>) responseObserver);
          break;
        case METHODID_CREATE_DATA_SOURCE:
          serviceImpl.createDataSource((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.CreateDataSource) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.CreateDataSource>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_SOURCE:
          serviceImpl.updateDataSource((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.UpdateDataSource) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE:
          serviceImpl.describeDataSource((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSource) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSource>) responseObserver);
          break;
        case METHODID_DISABLE_DATA_SOURCES:
          serviceImpl.disableDataSources((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DisableDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_ENABLE_DATA_SOURCES:
          serviceImpl.enableDataSources((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.EnableDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_DATA_SOURCES:
          serviceImpl.deleteDataSources((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DeleteDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE_KINDS:
          serviceImpl.describeDataSourceKinds((com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceKinds>) responseObserver);
          break;
        case METHODID_LIST_DATA_SOURCE_CONNECTIONS:
          serviceImpl.listDataSourceConnections((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.ListDataSourceConnections) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.ListDataSourceConnections>) responseObserver);
          break;
        case METHODID_PING_DATA_SOURCE_CONNECTION:
          serviceImpl.pingDataSourceConnection((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.PingDataSourceConnection) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.PingDataSourceConnection>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE_TABLES:
          serviceImpl.describeDataSourceTables((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTables) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTables>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE_TABLE_SCHEMA:
          serviceImpl.describeDataSourceTableSchema((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeDataSourceTableSchema) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeDataSourceTableSchema>) responseObserver);
          break;
        case METHODID_DESCRIBE_TABLE_SCHEMA_DATA_SERVICE_API:
          serviceImpl.describeTableSchemaDataServiceApi((com.dataomnis.gproto.types.pbrequest.PBRequestDataSourceManage.DescribeTableSchemaDataServiceApi) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseDataSourceManage.DescribeTableSchemaDataServiceApi>) responseObserver);
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

  private static abstract class DataSourceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataSourceManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcDataSourceManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataSourceManage");
    }
  }

  private static final class DataSourceManageFileDescriptorSupplier
      extends DataSourceManageBaseDescriptorSupplier {
    DataSourceManageFileDescriptorSupplier() {}
  }

  private static final class DataSourceManageMethodDescriptorSupplier
      extends DataSourceManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataSourceManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataSourceManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataSourceManageFileDescriptorSupplier())
              .addMethod(getListDataSourcesMethod())
              .addMethod(getCreateDataSourceMethod())
              .addMethod(getUpdateDataSourceMethod())
              .addMethod(getDescribeDataSourceMethod())
              .addMethod(getDisableDataSourcesMethod())
              .addMethod(getEnableDataSourcesMethod())
              .addMethod(getDeleteDataSourcesMethod())
              .addMethod(getDescribeDataSourceKindsMethod())
              .addMethod(getListDataSourceConnectionsMethod())
              .addMethod(getPingDataSourceConnectionMethod())
              .addMethod(getDescribeDataSourceTablesMethod())
              .addMethod(getDescribeDataSourceTableSchemaMethod())
              .addMethod(getDescribeTableSchemaDataServiceApiMethod())
              .build();
        }
      }
    }
    return result;
  }
}
