package com.dataomnis.gproto.smpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/sourcemanager.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SourcemanagerGrpc {

  private SourcemanagerGrpc() {}

  public static final String SERVICE_NAME = "smpb.Sourcemanager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListDataSources,
      com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources> getListDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataSources",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListDataSources.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListDataSources,
      com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources> getListDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListDataSources, com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources> getListDataSourcesMethod;
    if ((getListDataSourcesMethod = SourcemanagerGrpc.getListDataSourcesMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getListDataSourcesMethod = SourcemanagerGrpc.getListDataSourcesMethod) == null) {
          SourcemanagerGrpc.getListDataSourcesMethod = getListDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListDataSources, com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("ListDataSources"))
              .build();
        }
      }
    }
    return getListDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource,
      com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource> getCreateDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateDataSource",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource,
      com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource> getCreateDataSourceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource, com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource> getCreateDataSourceMethod;
    if ((getCreateDataSourceMethod = SourcemanagerGrpc.getCreateDataSourceMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getCreateDataSourceMethod = SourcemanagerGrpc.getCreateDataSourceMethod) == null) {
          SourcemanagerGrpc.getCreateDataSourceMethod = getCreateDataSourceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource, com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("CreateDataSource"))
              .build();
        }
      }
    }
    return getCreateDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateDataSource",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateDataSourceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateDataSourceMethod;
    if ((getUpdateDataSourceMethod = SourcemanagerGrpc.getUpdateDataSourceMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getUpdateDataSourceMethod = SourcemanagerGrpc.getUpdateDataSourceMethod) == null) {
          SourcemanagerGrpc.getUpdateDataSourceMethod = getUpdateDataSourceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("UpdateDataSource"))
              .build();
        }
      }
    }
    return getUpdateDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource> getDescribeDataSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSource",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource> getDescribeDataSourceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource, com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource> getDescribeDataSourceMethod;
    if ((getDescribeDataSourceMethod = SourcemanagerGrpc.getDescribeDataSourceMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDescribeDataSourceMethod = SourcemanagerGrpc.getDescribeDataSourceMethod) == null) {
          SourcemanagerGrpc.getDescribeDataSourceMethod = getDescribeDataSourceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource, com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DescribeDataSource"))
              .build();
        }
      }
    }
    return getDescribeDataSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDisableDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DisableDataSources",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDisableDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDisableDataSourcesMethod;
    if ((getDisableDataSourcesMethod = SourcemanagerGrpc.getDisableDataSourcesMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDisableDataSourcesMethod = SourcemanagerGrpc.getDisableDataSourcesMethod) == null) {
          SourcemanagerGrpc.getDisableDataSourcesMethod = getDisableDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DisableDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DisableDataSources"))
              .build();
        }
      }
    }
    return getDisableDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getEnableDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "EnableDataSources",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getEnableDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getEnableDataSourcesMethod;
    if ((getEnableDataSourcesMethod = SourcemanagerGrpc.getEnableDataSourcesMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getEnableDataSourcesMethod = SourcemanagerGrpc.getEnableDataSourcesMethod) == null) {
          SourcemanagerGrpc.getEnableDataSourcesMethod = getEnableDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "EnableDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("EnableDataSources"))
              .build();
        }
      }
    }
    return getEnableDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteDataSourcesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataSources",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteDataSourcesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteDataSourcesMethod;
    if ((getDeleteDataSourcesMethod = SourcemanagerGrpc.getDeleteDataSourcesMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDeleteDataSourcesMethod = SourcemanagerGrpc.getDeleteDataSourcesMethod) == null) {
          SourcemanagerGrpc.getDeleteDataSourcesMethod = getDeleteDataSourcesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataSources"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DeleteDataSources"))
              .build();
        }
      }
    }
    return getDeleteDataSourcesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteDataSourcesBySpaceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteDataSourcesBySpaceId",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteDataSourcesBySpaceIdMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteDataSourcesBySpaceIdMethod;
    if ((getDeleteDataSourcesBySpaceIdMethod = SourcemanagerGrpc.getDeleteDataSourcesBySpaceIdMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDeleteDataSourcesBySpaceIdMethod = SourcemanagerGrpc.getDeleteDataSourcesBySpaceIdMethod) == null) {
          SourcemanagerGrpc.getDeleteDataSourcesBySpaceIdMethod = getDeleteDataSourcesBySpaceIdMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteDataSourcesBySpaceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DeleteDataSourcesBySpaceId"))
              .build();
        }
      }
    }
    return getDeleteDataSourcesBySpaceIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds> getDescribeDataSourceKindsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeDataSourceKinds",
      requestType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds> getDescribeDataSourceKindsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds> getDescribeDataSourceKindsMethod;
    if ((getDescribeDataSourceKindsMethod = SourcemanagerGrpc.getDescribeDataSourceKindsMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDescribeDataSourceKindsMethod = SourcemanagerGrpc.getDescribeDataSourceKindsMethod) == null) {
          SourcemanagerGrpc.getDescribeDataSourceKindsMethod = getDescribeDataSourceKindsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeDataSourceKinds"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DescribeDataSourceKinds"))
              .build();
        }
      }
    }
    return getDescribeDataSourceKindsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection,
      com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection> getPingDataSourceConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingDataSourceConnection",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection,
      com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection> getPingDataSourceConnectionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection, com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection> getPingDataSourceConnectionMethod;
    if ((getPingDataSourceConnectionMethod = SourcemanagerGrpc.getPingDataSourceConnectionMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getPingDataSourceConnectionMethod = SourcemanagerGrpc.getPingDataSourceConnectionMethod) == null) {
          SourcemanagerGrpc.getPingDataSourceConnectionMethod = getPingDataSourceConnectionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection, com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingDataSourceConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("PingDataSourceConnection"))
              .build();
        }
      }
    }
    return getPingDataSourceConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections,
      com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections> getListDataSourceConnectionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListDataSourceConnections",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections,
      com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections> getListDataSourceConnectionsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections, com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections> getListDataSourceConnectionsMethod;
    if ((getListDataSourceConnectionsMethod = SourcemanagerGrpc.getListDataSourceConnectionsMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getListDataSourceConnectionsMethod = SourcemanagerGrpc.getListDataSourceConnectionsMethod) == null) {
          SourcemanagerGrpc.getListDataSourceConnectionsMethod = getListDataSourceConnectionsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections, com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListDataSourceConnections"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("ListDataSourceConnections"))
              .build();
        }
      }
    }
    return getListDataSourceConnectionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getDataFormatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataFormat",
      requestType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getDataFormatMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getDataFormatMethod;
    if ((getDataFormatMethod = SourcemanagerGrpc.getDataFormatMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDataFormatMethod = SourcemanagerGrpc.getDataFormatMethod) == null) {
          SourcemanagerGrpc.getDataFormatMethod = getDataFormatMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataFormat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DataFormat"))
              .build();
        }
      }
    }
    return getDataFormatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getDataTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataType",
      requestType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
      com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getDataTypeMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getDataTypeMethod;
    if ((getDataTypeMethod = SourcemanagerGrpc.getDataTypeMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDataTypeMethod = SourcemanagerGrpc.getDataTypeMethod) == null) {
          SourcemanagerGrpc.getDataTypeMethod = getDataTypeMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct, com.dataomnis.gproto.responsepb.ResponsePB.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DataType"))
              .build();
        }
      }
    }
    return getDataTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateTable,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getCreateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTable",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.CreateTable.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateTable,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getCreateTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CreateTable, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getCreateTableMethod;
    if ((getCreateTableMethod = SourcemanagerGrpc.getCreateTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getCreateTableMethod = SourcemanagerGrpc.getCreateTableMethod) == null) {
          SourcemanagerGrpc.getCreateTableMethod = getCreateTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.CreateTable, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.CreateTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("CreateTable"))
              .build();
        }
      }
    }
    return getCreateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeTable,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable> getDescribeTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeTable",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DescribeTable.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeTable,
      com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable> getDescribeTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DescribeTable, com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable> getDescribeTableMethod;
    if ((getDescribeTableMethod = SourcemanagerGrpc.getDescribeTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDescribeTableMethod = SourcemanagerGrpc.getDescribeTableMethod) == null) {
          SourcemanagerGrpc.getDescribeTableMethod = getDescribeTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DescribeTable, com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DescribeTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DescribeTable"))
              .build();
        }
      }
    }
    return getDescribeTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateTable,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTable",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.UpdateTable.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateTable,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.UpdateTable, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getUpdateTableMethod;
    if ((getUpdateTableMethod = SourcemanagerGrpc.getUpdateTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getUpdateTableMethod = SourcemanagerGrpc.getUpdateTableMethod) == null) {
          SourcemanagerGrpc.getUpdateTableMethod = getUpdateTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.UpdateTable, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.UpdateTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("UpdateTable"))
              .build();
        }
      }
    }
    return getUpdateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteTable,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTable",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.DeleteTable.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteTable,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.DeleteTable, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getDeleteTableMethod;
    if ((getDeleteTableMethod = SourcemanagerGrpc.getDeleteTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDeleteTableMethod = SourcemanagerGrpc.getDeleteTableMethod) == null) {
          SourcemanagerGrpc.getDeleteTableMethod = getDeleteTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.DeleteTable, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.DeleteTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DeleteTable"))
              .build();
        }
      }
    }
    return getDeleteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListTable,
      com.dataomnis.gproto.responsepb.ResponsePB.ListTable> getListTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTable",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ListTable.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.ListTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListTable,
      com.dataomnis.gproto.responsepb.ResponsePB.ListTable> getListTableMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ListTable, com.dataomnis.gproto.responsepb.ResponsePB.ListTable> getListTableMethod;
    if ((getListTableMethod = SourcemanagerGrpc.getListTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getListTableMethod = SourcemanagerGrpc.getListTableMethod) == null) {
          SourcemanagerGrpc.getListTableMethod = getListTableMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ListTable, com.dataomnis.gproto.responsepb.ResponsePB.ListTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ListTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.ListTable.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("ListTable"))
              .build();
        }
      }
    }
    return getListTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SourceTables,
      com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getSourceTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SourceTables",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.SourceTables.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SourceTables,
      com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getSourceTablesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SourceTables, com.dataomnis.gproto.responsepb.ResponsePB.JsonList> getSourceTablesMethod;
    if ((getSourceTablesMethod = SourcemanagerGrpc.getSourceTablesMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getSourceTablesMethod = SourcemanagerGrpc.getSourceTablesMethod) == null) {
          SourcemanagerGrpc.getSourceTablesMethod = getSourceTablesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.SourceTables, com.dataomnis.gproto.responsepb.ResponsePB.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SourceTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.SourceTables.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("SourceTables"))
              .build();
        }
      }
    }
    return getSourceTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.TableColumns,
      com.dataomnis.gproto.responsepb.ResponsePB.TableColumns> getTableColumnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableColumns",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.TableColumns.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.TableColumns.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.TableColumns,
      com.dataomnis.gproto.responsepb.ResponsePB.TableColumns> getTableColumnsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.TableColumns, com.dataomnis.gproto.responsepb.ResponsePB.TableColumns> getTableColumnsMethod;
    if ((getTableColumnsMethod = SourcemanagerGrpc.getTableColumnsMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getTableColumnsMethod = SourcemanagerGrpc.getTableColumnsMethod) == null) {
          SourcemanagerGrpc.getTableColumnsMethod = getTableColumnsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.TableColumns, com.dataomnis.gproto.responsepb.ResponsePB.TableColumns>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TableColumns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.TableColumns.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.TableColumns.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("TableColumns"))
              .build();
        }
      }
    }
    return getTableColumnsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SourcemanagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SourcemanagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SourcemanagerStub>() {
        @java.lang.Override
        public SourcemanagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SourcemanagerStub(channel, callOptions);
        }
      };
    return SourcemanagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SourcemanagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SourcemanagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SourcemanagerBlockingStub>() {
        @java.lang.Override
        public SourcemanagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SourcemanagerBlockingStub(channel, callOptions);
        }
      };
    return SourcemanagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SourcemanagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SourcemanagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SourcemanagerFutureStub>() {
        @java.lang.Override
        public SourcemanagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SourcemanagerFutureStub(channel, callOptions);
        }
      };
    return SourcemanagerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class SourcemanagerImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public void listDataSources(com.dataomnis.gproto.requestpb.RequestPB.ListDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void createDataSource(com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateDataSourceMethod(), responseObserver);
    }

    /**
     */
    public void updateDataSource(com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateDataSourceMethod(), responseObserver);
    }

    /**
     */
    public void describeDataSource(com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceMethod(), responseObserver);
    }

    /**
     */
    public void disableDataSources(com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void enableDataSources(com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void deleteDataSources(com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataSourcesMethod(), responseObserver);
    }

    /**
     */
    public void deleteDataSourcesBySpaceId(com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteDataSourcesBySpaceIdMethod(), responseObserver);
    }

    /**
     */
    public void describeDataSourceKinds(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeDataSourceKindsMethod(), responseObserver);
    }

    /**
     */
    public void pingDataSourceConnection(com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingDataSourceConnectionMethod(), responseObserver);
    }

    /**
     */
    public void listDataSourceConnections(com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListDataSourceConnectionsMethod(), responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void dataFormat(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataFormatMethod(), responseObserver);
    }

    /**
     */
    public void dataType(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public void createTable(com.dataomnis.gproto.requestpb.RequestPB.CreateTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTableMethod(), responseObserver);
    }

    /**
     */
    public void describeTable(com.dataomnis.gproto.requestpb.RequestPB.DescribeTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeTableMethod(), responseObserver);
    }

    /**
     */
    public void updateTable(com.dataomnis.gproto.requestpb.RequestPB.UpdateTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTableMethod(), responseObserver);
    }

    /**
     */
    public void deleteTable(com.dataomnis.gproto.requestpb.RequestPB.DeleteTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTableMethod(), responseObserver);
    }

    /**
     */
    public void listTable(com.dataomnis.gproto.requestpb.RequestPB.ListTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTableMethod(), responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void sourceTables(com.dataomnis.gproto.requestpb.RequestPB.SourceTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSourceTablesMethod(), responseObserver);
    }

    /**
     */
    public void tableColumns(com.dataomnis.gproto.requestpb.RequestPB.TableColumns request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.TableColumns> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTableColumnsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListDataSources,
                com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources>(
                  this, METHODID_LIST_DATA_SOURCES)))
          .addMethod(
            getCreateDataSourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource,
                com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource>(
                  this, METHODID_CREATE_DATA_SOURCE)))
          .addMethod(
            getUpdateDataSourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_DATA_SOURCE)))
          .addMethod(
            getDescribeDataSourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource,
                com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource>(
                  this, METHODID_DESCRIBE_DATA_SOURCE)))
          .addMethod(
            getDisableDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DISABLE_DATA_SOURCES)))
          .addMethod(
            getEnableDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_ENABLE_DATA_SOURCES)))
          .addMethod(
            getDeleteDataSourcesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_DATA_SOURCES)))
          .addMethod(
            getDeleteDataSourcesBySpaceIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_DATA_SOURCES_BY_SPACE_ID)))
          .addMethod(
            getDescribeDataSourceKindsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
                com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds>(
                  this, METHODID_DESCRIBE_DATA_SOURCE_KINDS)))
          .addMethod(
            getPingDataSourceConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection,
                com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection>(
                  this, METHODID_PING_DATA_SOURCE_CONNECTION)))
          .addMethod(
            getListDataSourceConnectionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections,
                com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections>(
                  this, METHODID_LIST_DATA_SOURCE_CONNECTIONS)))
          .addMethod(
            getDataFormatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
                com.dataomnis.gproto.responsepb.ResponsePB.JsonList>(
                  this, METHODID_DATA_FORMAT)))
          .addMethod(
            getDataTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct,
                com.dataomnis.gproto.responsepb.ResponsePB.JsonList>(
                  this, METHODID_DATA_TYPE)))
          .addMethod(
            getCreateTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.CreateTable,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_CREATE_TABLE)))
          .addMethod(
            getDescribeTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DescribeTable,
                com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable>(
                  this, METHODID_DESCRIBE_TABLE)))
          .addMethod(
            getUpdateTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.UpdateTable,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_TABLE)))
          .addMethod(
            getDeleteTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.DeleteTable,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_TABLE)))
          .addMethod(
            getListTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ListTable,
                com.dataomnis.gproto.responsepb.ResponsePB.ListTable>(
                  this, METHODID_LIST_TABLE)))
          .addMethod(
            getSourceTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.SourceTables,
                com.dataomnis.gproto.responsepb.ResponsePB.JsonList>(
                  this, METHODID_SOURCE_TABLES)))
          .addMethod(
            getTableColumnsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.TableColumns,
                com.dataomnis.gproto.responsepb.ResponsePB.TableColumns>(
                  this, METHODID_TABLE_COLUMNS)))
          .build();
    }
  }

  /**
   */
  public static final class SourcemanagerStub extends io.grpc.stub.AbstractAsyncStub<SourcemanagerStub> {
    private SourcemanagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SourcemanagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SourcemanagerStub(channel, callOptions);
    }

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public void listDataSources(com.dataomnis.gproto.requestpb.RequestPB.ListDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createDataSource(com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateDataSource(com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataSource(com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disableDataSources(com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enableDataSources(com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDataSources(com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataSourcesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteDataSourcesBySpaceId(com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteDataSourcesBySpaceIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeDataSourceKinds(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeDataSourceKindsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void pingDataSourceConnection(com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingDataSourceConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listDataSourceConnections(com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListDataSourceConnectionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void dataFormat(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataFormatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataType(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public void createTable(com.dataomnis.gproto.requestpb.RequestPB.CreateTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeTable(com.dataomnis.gproto.requestpb.RequestPB.DescribeTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTable(com.dataomnis.gproto.requestpb.RequestPB.UpdateTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTable(com.dataomnis.gproto.requestpb.RequestPB.DeleteTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTable(com.dataomnis.gproto.requestpb.RequestPB.ListTable request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void sourceTables(com.dataomnis.gproto.requestpb.RequestPB.SourceTables request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSourceTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tableColumns(com.dataomnis.gproto.requestpb.RequestPB.TableColumns request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.TableColumns> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getTableColumnsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class SourcemanagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<SourcemanagerBlockingStub> {
    private SourcemanagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SourcemanagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SourcemanagerBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources listDataSources(com.dataomnis.gproto.requestpb.RequestPB.ListDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource createDataSource(com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct updateDataSource(com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource describeDataSource(com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct disableDataSources(com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct enableDataSources(com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct deleteDataSources(com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataSourcesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct deleteDataSourcesBySpaceId(com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteDataSourcesBySpaceIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds describeDataSourceKinds(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeDataSourceKindsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection pingDataSourceConnection(com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingDataSourceConnectionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections listDataSourceConnections(com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListDataSourceConnectionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.JsonList dataFormat(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataFormatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.JsonList dataType(com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct createTable(com.dataomnis.gproto.requestpb.RequestPB.CreateTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable describeTable(com.dataomnis.gproto.requestpb.RequestPB.DescribeTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct updateTable(com.dataomnis.gproto.requestpb.RequestPB.UpdateTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct deleteTable(com.dataomnis.gproto.requestpb.RequestPB.DeleteTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.ListTable listTable(com.dataomnis.gproto.requestpb.RequestPB.ListTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.JsonList sourceTables(com.dataomnis.gproto.requestpb.RequestPB.SourceTables request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSourceTablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.TableColumns tableColumns(com.dataomnis.gproto.requestpb.RequestPB.TableColumns request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getTableColumnsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class SourcemanagerFutureStub extends io.grpc.stub.AbstractFutureStub<SourcemanagerFutureStub> {
    private SourcemanagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SourcemanagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SourcemanagerFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * datasource
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources> listDataSources(
        com.dataomnis.gproto.requestpb.RequestPB.ListDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource> createDataSource(
        com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateDataSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> updateDataSource(
        com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateDataSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource> describeDataSource(
        com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> disableDataSources(
        com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> enableDataSources(
        com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> deleteDataSources(
        com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataSourcesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> deleteDataSourcesBySpaceId(
        com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteDataSourcesBySpaceIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds> describeDataSourceKinds(
        com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeDataSourceKindsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection> pingDataSourceConnection(
        com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingDataSourceConnectionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections> listDataSourceConnections(
        com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListDataSourceConnectionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> dataFormat(
        com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataFormatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> dataType(
        com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> createTable(
        com.dataomnis.gproto.requestpb.RequestPB.CreateTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable> describeTable(
        com.dataomnis.gproto.requestpb.RequestPB.DescribeTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> updateTable(
        com.dataomnis.gproto.requestpb.RequestPB.UpdateTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> deleteTable(
        com.dataomnis.gproto.requestpb.RequestPB.DeleteTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.ListTable> listTable(
        com.dataomnis.gproto.requestpb.RequestPB.ListTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.JsonList> sourceTables(
        com.dataomnis.gproto.requestpb.RequestPB.SourceTables request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSourceTablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.TableColumns> tableColumns(
        com.dataomnis.gproto.requestpb.RequestPB.TableColumns request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTableColumnsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_DATA_SOURCES = 0;
  private static final int METHODID_CREATE_DATA_SOURCE = 1;
  private static final int METHODID_UPDATE_DATA_SOURCE = 2;
  private static final int METHODID_DESCRIBE_DATA_SOURCE = 3;
  private static final int METHODID_DISABLE_DATA_SOURCES = 4;
  private static final int METHODID_ENABLE_DATA_SOURCES = 5;
  private static final int METHODID_DELETE_DATA_SOURCES = 6;
  private static final int METHODID_DELETE_DATA_SOURCES_BY_SPACE_ID = 7;
  private static final int METHODID_DESCRIBE_DATA_SOURCE_KINDS = 8;
  private static final int METHODID_PING_DATA_SOURCE_CONNECTION = 9;
  private static final int METHODID_LIST_DATA_SOURCE_CONNECTIONS = 10;
  private static final int METHODID_DATA_FORMAT = 11;
  private static final int METHODID_DATA_TYPE = 12;
  private static final int METHODID_CREATE_TABLE = 13;
  private static final int METHODID_DESCRIBE_TABLE = 14;
  private static final int METHODID_UPDATE_TABLE = 15;
  private static final int METHODID_DELETE_TABLE = 16;
  private static final int METHODID_LIST_TABLE = 17;
  private static final int METHODID_SOURCE_TABLES = 18;
  private static final int METHODID_TABLE_COLUMNS = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SourcemanagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SourcemanagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_DATA_SOURCES:
          serviceImpl.listDataSources((com.dataomnis.gproto.requestpb.RequestPB.ListDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSources>) responseObserver);
          break;
        case METHODID_CREATE_DATA_SOURCE:
          serviceImpl.createDataSource((com.dataomnis.gproto.requestpb.RequestPB.CreateDataSource) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.CreateDataSource>) responseObserver);
          break;
        case METHODID_UPDATE_DATA_SOURCE:
          serviceImpl.updateDataSource((com.dataomnis.gproto.requestpb.RequestPB.UpdateDataSource) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE:
          serviceImpl.describeDataSource((com.dataomnis.gproto.requestpb.RequestPB.DescribeDataSource) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSource>) responseObserver);
          break;
        case METHODID_DISABLE_DATA_SOURCES:
          serviceImpl.disableDataSources((com.dataomnis.gproto.requestpb.RequestPB.DisableDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_ENABLE_DATA_SOURCES:
          serviceImpl.enableDataSources((com.dataomnis.gproto.requestpb.RequestPB.EnableDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_DATA_SOURCES:
          serviceImpl.deleteDataSources((com.dataomnis.gproto.requestpb.RequestPB.DeleteDataSources) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_DATA_SOURCES_BY_SPACE_ID:
          serviceImpl.deleteDataSourcesBySpaceId((com.dataomnis.gproto.requestpb.RequestPB.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_DATA_SOURCE_KINDS:
          serviceImpl.describeDataSourceKinds((com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeDataSourceKinds>) responseObserver);
          break;
        case METHODID_PING_DATA_SOURCE_CONNECTION:
          serviceImpl.pingDataSourceConnection((com.dataomnis.gproto.requestpb.RequestPB.PingDataSourceConnection) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.PingDataSourceConnection>) responseObserver);
          break;
        case METHODID_LIST_DATA_SOURCE_CONNECTIONS:
          serviceImpl.listDataSourceConnections((com.dataomnis.gproto.requestpb.RequestPB.ListDataSourceConnections) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListDataSourceConnections>) responseObserver);
          break;
        case METHODID_DATA_FORMAT:
          serviceImpl.dataFormat((com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList>) responseObserver);
          break;
        case METHODID_DATA_TYPE:
          serviceImpl.dataType((com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList>) responseObserver);
          break;
        case METHODID_CREATE_TABLE:
          serviceImpl.createTable((com.dataomnis.gproto.requestpb.RequestPB.CreateTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_TABLE:
          serviceImpl.describeTable((com.dataomnis.gproto.requestpb.RequestPB.DescribeTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.DescribeTable>) responseObserver);
          break;
        case METHODID_UPDATE_TABLE:
          serviceImpl.updateTable((com.dataomnis.gproto.requestpb.RequestPB.UpdateTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_TABLE:
          serviceImpl.deleteTable((com.dataomnis.gproto.requestpb.RequestPB.DeleteTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_TABLE:
          serviceImpl.listTable((com.dataomnis.gproto.requestpb.RequestPB.ListTable) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.ListTable>) responseObserver);
          break;
        case METHODID_SOURCE_TABLES:
          serviceImpl.sourceTables((com.dataomnis.gproto.requestpb.RequestPB.SourceTables) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.JsonList>) responseObserver);
          break;
        case METHODID_TABLE_COLUMNS:
          serviceImpl.tableColumns((com.dataomnis.gproto.requestpb.RequestPB.TableColumns) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.TableColumns>) responseObserver);
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

  private static abstract class SourcemanagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SourcemanagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.smpb.SmPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Sourcemanager");
    }
  }

  private static final class SourcemanagerFileDescriptorSupplier
      extends SourcemanagerBaseDescriptorSupplier {
    SourcemanagerFileDescriptorSupplier() {}
  }

  private static final class SourcemanagerMethodDescriptorSupplier
      extends SourcemanagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SourcemanagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (SourcemanagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SourcemanagerFileDescriptorSupplier())
              .addMethod(getListDataSourcesMethod())
              .addMethod(getCreateDataSourceMethod())
              .addMethod(getUpdateDataSourceMethod())
              .addMethod(getDescribeDataSourceMethod())
              .addMethod(getDisableDataSourcesMethod())
              .addMethod(getEnableDataSourcesMethod())
              .addMethod(getDeleteDataSourcesMethod())
              .addMethod(getDeleteDataSourcesBySpaceIdMethod())
              .addMethod(getDescribeDataSourceKindsMethod())
              .addMethod(getPingDataSourceConnectionMethod())
              .addMethod(getListDataSourceConnectionsMethod())
              .addMethod(getDataFormatMethod())
              .addMethod(getDataTypeMethod())
              .addMethod(getCreateTableMethod())
              .addMethod(getDescribeTableMethod())
              .addMethod(getUpdateTableMethod())
              .addMethod(getDeleteTableMethod())
              .addMethod(getListTableMethod())
              .addMethod(getSourceTablesMethod())
              .addMethod(getTableColumnsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
