package com.github.dataomnis.smpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/sourcemanager.proto")
public final class SourcemanagerGrpc {

  private SourcemanagerGrpc() {}

  public static final String SERVICE_NAME = "smpb.Sourcemanager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = com.github.dataomnis.requestpb.RequestPB.CreateSource.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateMethod;
    if ((getCreateMethod = SourcemanagerGrpc.getCreateMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getCreateMethod = SourcemanagerGrpc.getCreateMethod) == null) {
          SourcemanagerGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.CreateSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.CreateSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = com.github.dataomnis.requestpb.RequestPB.UpdateSource.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateMethod;
    if ((getUpdateMethod = SourcemanagerGrpc.getUpdateMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getUpdateMethod = SourcemanagerGrpc.getUpdateMethod) == null) {
          SourcemanagerGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UpdateSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UpdateSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeSource,
      com.github.dataomnis.responsepb.ResponsePB.DescribeSource> getDescribeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Describe",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeSource.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeSource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeSource,
      com.github.dataomnis.responsepb.ResponsePB.DescribeSource> getDescribeMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeSource, com.github.dataomnis.responsepb.ResponsePB.DescribeSource> getDescribeMethod;
    if ((getDescribeMethod = SourcemanagerGrpc.getDescribeMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDescribeMethod = SourcemanagerGrpc.getDescribeMethod) == null) {
          SourcemanagerGrpc.getDescribeMethod = getDescribeMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeSource, com.github.dataomnis.responsepb.ResponsePB.DescribeSource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Describe"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeSource.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("Describe"))
              .build();
        }
      }
    }
    return getDescribeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.EnableSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getEnableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Enable",
      requestType = com.github.dataomnis.requestpb.RequestPB.EnableSource.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.EnableSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getEnableMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.EnableSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getEnableMethod;
    if ((getEnableMethod = SourcemanagerGrpc.getEnableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getEnableMethod = SourcemanagerGrpc.getEnableMethod) == null) {
          SourcemanagerGrpc.getEnableMethod = getEnableMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.EnableSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Enable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.EnableSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("Enable"))
              .build();
        }
      }
    }
    return getEnableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DisableSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDisableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Disable",
      requestType = com.github.dataomnis.requestpb.RequestPB.DisableSource.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DisableSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDisableMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DisableSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDisableMethod;
    if ((getDisableMethod = SourcemanagerGrpc.getDisableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDisableMethod = SourcemanagerGrpc.getDisableMethod) == null) {
          SourcemanagerGrpc.getDisableMethod = getDisableMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DisableSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Disable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DisableSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("Disable"))
              .build();
        }
      }
    }
    return getDisableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListSource,
      com.github.dataomnis.responsepb.ResponsePB.ListSource> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "List",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListSource.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListSource.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListSource,
      com.github.dataomnis.responsepb.ResponsePB.ListSource> getListMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListSource, com.github.dataomnis.responsepb.ResponsePB.ListSource> getListMethod;
    if ((getListMethod = SourcemanagerGrpc.getListMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getListMethod = SourcemanagerGrpc.getListMethod) == null) {
          SourcemanagerGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListSource, com.github.dataomnis.responsepb.ResponsePB.ListSource>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "List"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListSource.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("List"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteSource.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteMethod;
    if ((getDeleteMethod = SourcemanagerGrpc.getDeleteMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDeleteMethod = SourcemanagerGrpc.getDeleteMethod) == null) {
          SourcemanagerGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAll",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteAllMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteAllMethod;
    if ((getDeleteAllMethod = SourcemanagerGrpc.getDeleteAllMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDeleteAllMethod = SourcemanagerGrpc.getDeleteAllMethod) == null) {
          SourcemanagerGrpc.getDeleteAllMethod = getDeleteAllMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DeleteAll"))
              .build();
        }
      }
    }
    return getDeleteAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.PingSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getPingSourceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingSource",
      requestType = com.github.dataomnis.requestpb.RequestPB.PingSource.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.PingSource,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getPingSourceMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.PingSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getPingSourceMethod;
    if ((getPingSourceMethod = SourcemanagerGrpc.getPingSourceMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getPingSourceMethod = SourcemanagerGrpc.getPingSourceMethod) == null) {
          SourcemanagerGrpc.getPingSourceMethod = getPingSourceMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.PingSource, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingSource"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.PingSource.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("PingSource"))
              .build();
        }
      }
    }
    return getPingSourceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.SourceKind> getSourceKindMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SourceKind",
      requestType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.SourceKind.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.SourceKind> getSourceKindMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.SourceKind> getSourceKindMethod;
    if ((getSourceKindMethod = SourcemanagerGrpc.getSourceKindMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getSourceKindMethod = SourcemanagerGrpc.getSourceKindMethod) == null) {
          SourcemanagerGrpc.getSourceKindMethod = getSourceKindMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.SourceKind>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SourceKind"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.SourceKind.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("SourceKind"))
              .build();
        }
      }
    }
    return getSourceKindMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getDataFormatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataFormat",
      requestType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getDataFormatMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.JsonList> getDataFormatMethod;
    if ((getDataFormatMethod = SourcemanagerGrpc.getDataFormatMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDataFormatMethod = SourcemanagerGrpc.getDataFormatMethod) == null) {
          SourcemanagerGrpc.getDataFormatMethod = getDataFormatMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataFormat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DataFormat"))
              .build();
        }
      }
    }
    return getDataFormatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getDataTypeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DataType",
      requestType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getDataTypeMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.JsonList> getDataTypeMethod;
    if ((getDataTypeMethod = SourcemanagerGrpc.getDataTypeMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDataTypeMethod = SourcemanagerGrpc.getDataTypeMethod) == null) {
          SourcemanagerGrpc.getDataTypeMethod = getDataTypeMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.modelpb.ModelPB.EmptyStruct, com.github.dataomnis.responsepb.ResponsePB.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DataType"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DataType"))
              .build();
        }
      }
    }
    return getDataTypeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateTable,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTable",
      requestType = com.github.dataomnis.requestpb.RequestPB.CreateTable.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateTable,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateTableMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.CreateTable, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getCreateTableMethod;
    if ((getCreateTableMethod = SourcemanagerGrpc.getCreateTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getCreateTableMethod = SourcemanagerGrpc.getCreateTableMethod) == null) {
          SourcemanagerGrpc.getCreateTableMethod = getCreateTableMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.CreateTable, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.CreateTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("CreateTable"))
              .build();
        }
      }
    }
    return getCreateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeTable,
      com.github.dataomnis.responsepb.ResponsePB.DescribeTable> getDescribeTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeTable",
      requestType = com.github.dataomnis.requestpb.RequestPB.DescribeTable.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.DescribeTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeTable,
      com.github.dataomnis.responsepb.ResponsePB.DescribeTable> getDescribeTableMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DescribeTable, com.github.dataomnis.responsepb.ResponsePB.DescribeTable> getDescribeTableMethod;
    if ((getDescribeTableMethod = SourcemanagerGrpc.getDescribeTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDescribeTableMethod = SourcemanagerGrpc.getDescribeTableMethod) == null) {
          SourcemanagerGrpc.getDescribeTableMethod = getDescribeTableMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DescribeTable, com.github.dataomnis.responsepb.ResponsePB.DescribeTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DescribeTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.DescribeTable.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DescribeTable"))
              .build();
        }
      }
    }
    return getDescribeTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateTable,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateTable",
      requestType = com.github.dataomnis.requestpb.RequestPB.UpdateTable.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateTable,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateTableMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.UpdateTable, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getUpdateTableMethod;
    if ((getUpdateTableMethod = SourcemanagerGrpc.getUpdateTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getUpdateTableMethod = SourcemanagerGrpc.getUpdateTableMethod) == null) {
          SourcemanagerGrpc.getUpdateTableMethod = getUpdateTableMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.UpdateTable, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.UpdateTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("UpdateTable"))
              .build();
        }
      }
    }
    return getUpdateTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteTable,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteTable",
      requestType = com.github.dataomnis.requestpb.RequestPB.DeleteTable.class,
      responseType = com.github.dataomnis.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteTable,
      com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteTableMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.DeleteTable, com.github.dataomnis.modelpb.ModelPB.EmptyStruct> getDeleteTableMethod;
    if ((getDeleteTableMethod = SourcemanagerGrpc.getDeleteTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getDeleteTableMethod = SourcemanagerGrpc.getDeleteTableMethod) == null) {
          SourcemanagerGrpc.getDeleteTableMethod = getDeleteTableMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.DeleteTable, com.github.dataomnis.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.DeleteTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("DeleteTable"))
              .build();
        }
      }
    }
    return getDeleteTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListTable,
      com.github.dataomnis.responsepb.ResponsePB.ListTable> getListTableMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTable",
      requestType = com.github.dataomnis.requestpb.RequestPB.ListTable.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.ListTable.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListTable,
      com.github.dataomnis.responsepb.ResponsePB.ListTable> getListTableMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.ListTable, com.github.dataomnis.responsepb.ResponsePB.ListTable> getListTableMethod;
    if ((getListTableMethod = SourcemanagerGrpc.getListTableMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getListTableMethod = SourcemanagerGrpc.getListTableMethod) == null) {
          SourcemanagerGrpc.getListTableMethod = getListTableMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.ListTable, com.github.dataomnis.responsepb.ResponsePB.ListTable>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTable"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.ListTable.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.ListTable.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("ListTable"))
              .build();
        }
      }
    }
    return getListTableMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.SourceTables,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getSourceTablesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SourceTables",
      requestType = com.github.dataomnis.requestpb.RequestPB.SourceTables.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.JsonList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.SourceTables,
      com.github.dataomnis.responsepb.ResponsePB.JsonList> getSourceTablesMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.SourceTables, com.github.dataomnis.responsepb.ResponsePB.JsonList> getSourceTablesMethod;
    if ((getSourceTablesMethod = SourcemanagerGrpc.getSourceTablesMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getSourceTablesMethod = SourcemanagerGrpc.getSourceTablesMethod) == null) {
          SourcemanagerGrpc.getSourceTablesMethod = getSourceTablesMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.SourceTables, com.github.dataomnis.responsepb.ResponsePB.JsonList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SourceTables"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.SourceTables.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.JsonList.getDefaultInstance()))
              .setSchemaDescriptor(new SourcemanagerMethodDescriptorSupplier("SourceTables"))
              .build();
        }
      }
    }
    return getSourceTablesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.TableColumns,
      com.github.dataomnis.responsepb.ResponsePB.TableColumns> getTableColumnsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "TableColumns",
      requestType = com.github.dataomnis.requestpb.RequestPB.TableColumns.class,
      responseType = com.github.dataomnis.responsepb.ResponsePB.TableColumns.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.TableColumns,
      com.github.dataomnis.responsepb.ResponsePB.TableColumns> getTableColumnsMethod() {
    io.grpc.MethodDescriptor<com.github.dataomnis.requestpb.RequestPB.TableColumns, com.github.dataomnis.responsepb.ResponsePB.TableColumns> getTableColumnsMethod;
    if ((getTableColumnsMethod = SourcemanagerGrpc.getTableColumnsMethod) == null) {
      synchronized (SourcemanagerGrpc.class) {
        if ((getTableColumnsMethod = SourcemanagerGrpc.getTableColumnsMethod) == null) {
          SourcemanagerGrpc.getTableColumnsMethod = getTableColumnsMethod =
              io.grpc.MethodDescriptor.<com.github.dataomnis.requestpb.RequestPB.TableColumns, com.github.dataomnis.responsepb.ResponsePB.TableColumns>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "TableColumns"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.requestpb.RequestPB.TableColumns.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.github.dataomnis.responsepb.ResponsePB.TableColumns.getDefaultInstance()))
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
     *source
     * </pre>
     */
    public void create(com.github.dataomnis.requestpb.RequestPB.CreateSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void update(com.github.dataomnis.requestpb.RequestPB.UpdateSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void describe(com.github.dataomnis.requestpb.RequestPB.DescribeSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeSource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeMethod(), responseObserver);
    }

    /**
     */
    public void enable(com.github.dataomnis.requestpb.RequestPB.EnableSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getEnableMethod(), responseObserver);
    }

    /**
     */
    public void disable(com.github.dataomnis.requestpb.RequestPB.DisableSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDisableMethod(), responseObserver);
    }

    /**
     */
    public void list(com.github.dataomnis.requestpb.RequestPB.ListSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListSource> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    /**
     */
    public void delete(com.github.dataomnis.requestpb.RequestPB.DeleteSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    /**
     */
    public void deleteAll(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAllMethod(), responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void pingSource(com.github.dataomnis.requestpb.RequestPB.PingSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingSourceMethod(), responseObserver);
    }

    /**
     */
    public void sourceKind(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.SourceKind> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSourceKindMethod(), responseObserver);
    }

    /**
     */
    public void dataFormat(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataFormatMethod(), responseObserver);
    }

    /**
     */
    public void dataType(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDataTypeMethod(), responseObserver);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public void createTable(com.github.dataomnis.requestpb.RequestPB.CreateTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTableMethod(), responseObserver);
    }

    /**
     */
    public void describeTable(com.github.dataomnis.requestpb.RequestPB.DescribeTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeTableMethod(), responseObserver);
    }

    /**
     */
    public void updateTable(com.github.dataomnis.requestpb.RequestPB.UpdateTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateTableMethod(), responseObserver);
    }

    /**
     */
    public void deleteTable(com.github.dataomnis.requestpb.RequestPB.DeleteTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteTableMethod(), responseObserver);
    }

    /**
     */
    public void listTable(com.github.dataomnis.requestpb.RequestPB.ListTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListTable> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTableMethod(), responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void sourceTables(com.github.dataomnis.requestpb.RequestPB.SourceTables request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSourceTablesMethod(), responseObserver);
    }

    /**
     */
    public void tableColumns(com.github.dataomnis.requestpb.RequestPB.TableColumns request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.TableColumns> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getTableColumnsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.CreateSource,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_CREATE)))
          .addMethod(
            getUpdateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UpdateSource,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDescribeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeSource,
                com.github.dataomnis.responsepb.ResponsePB.DescribeSource>(
                  this, METHODID_DESCRIBE)))
          .addMethod(
            getEnableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.EnableSource,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_ENABLE)))
          .addMethod(
            getDisableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DisableSource,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DISABLE)))
          .addMethod(
            getListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListSource,
                com.github.dataomnis.responsepb.ResponsePB.ListSource>(
                  this, METHODID_LIST)))
          .addMethod(
            getDeleteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteSource,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE)))
          .addMethod(
            getDeleteAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_ALL)))
          .addMethod(
            getPingSourceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.PingSource,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_PING_SOURCE)))
          .addMethod(
            getSourceKindMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
                com.github.dataomnis.responsepb.ResponsePB.SourceKind>(
                  this, METHODID_SOURCE_KIND)))
          .addMethod(
            getDataFormatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
                com.github.dataomnis.responsepb.ResponsePB.JsonList>(
                  this, METHODID_DATA_FORMAT)))
          .addMethod(
            getDataTypeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct,
                com.github.dataomnis.responsepb.ResponsePB.JsonList>(
                  this, METHODID_DATA_TYPE)))
          .addMethod(
            getCreateTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.CreateTable,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_CREATE_TABLE)))
          .addMethod(
            getDescribeTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DescribeTable,
                com.github.dataomnis.responsepb.ResponsePB.DescribeTable>(
                  this, METHODID_DESCRIBE_TABLE)))
          .addMethod(
            getUpdateTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.UpdateTable,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_UPDATE_TABLE)))
          .addMethod(
            getDeleteTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.DeleteTable,
                com.github.dataomnis.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_DELETE_TABLE)))
          .addMethod(
            getListTableMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.ListTable,
                com.github.dataomnis.responsepb.ResponsePB.ListTable>(
                  this, METHODID_LIST_TABLE)))
          .addMethod(
            getSourceTablesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.SourceTables,
                com.github.dataomnis.responsepb.ResponsePB.JsonList>(
                  this, METHODID_SOURCE_TABLES)))
          .addMethod(
            getTableColumnsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.github.dataomnis.requestpb.RequestPB.TableColumns,
                com.github.dataomnis.responsepb.ResponsePB.TableColumns>(
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
     *source
     * </pre>
     */
    public void create(com.github.dataomnis.requestpb.RequestPB.CreateSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(com.github.dataomnis.requestpb.RequestPB.UpdateSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describe(com.github.dataomnis.requestpb.RequestPB.DescribeSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeSource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void enable(com.github.dataomnis.requestpb.RequestPB.EnableSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void disable(com.github.dataomnis.requestpb.RequestPB.DisableSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.github.dataomnis.requestpb.RequestPB.ListSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListSource> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(com.github.dataomnis.requestpb.RequestPB.DeleteSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAll(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void pingSource(com.github.dataomnis.requestpb.RequestPB.PingSource request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingSourceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void sourceKind(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.SourceKind> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSourceKindMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataFormat(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataFormatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void dataType(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDataTypeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public void createTable(com.github.dataomnis.requestpb.RequestPB.CreateTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeTable(com.github.dataomnis.requestpb.RequestPB.DescribeTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateTable(com.github.dataomnis.requestpb.RequestPB.UpdateTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteTable(com.github.dataomnis.requestpb.RequestPB.DeleteTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTable(com.github.dataomnis.requestpb.RequestPB.ListTable request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListTable> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTableMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public void sourceTables(com.github.dataomnis.requestpb.RequestPB.SourceTables request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSourceTablesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void tableColumns(com.github.dataomnis.requestpb.RequestPB.TableColumns request,
        io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.TableColumns> responseObserver) {
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
     *source
     * </pre>
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct create(com.github.dataomnis.requestpb.RequestPB.CreateSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct update(com.github.dataomnis.requestpb.RequestPB.UpdateSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeSource describe(com.github.dataomnis.requestpb.RequestPB.DescribeSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct enable(com.github.dataomnis.requestpb.RequestPB.EnableSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getEnableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct disable(com.github.dataomnis.requestpb.RequestPB.DisableSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDisableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListSource list(com.github.dataomnis.requestpb.RequestPB.ListSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct delete(com.github.dataomnis.requestpb.RequestPB.DeleteSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteAll(com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAllMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct pingSource(com.github.dataomnis.requestpb.RequestPB.PingSource request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingSourceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.SourceKind sourceKind(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSourceKindMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.JsonList dataFormat(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataFormatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.JsonList dataType(com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDataTypeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct createTable(com.github.dataomnis.requestpb.RequestPB.CreateTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.DescribeTable describeTable(com.github.dataomnis.requestpb.RequestPB.DescribeTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct updateTable(com.github.dataomnis.requestpb.RequestPB.UpdateTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.modelpb.ModelPB.EmptyStruct deleteTable(com.github.dataomnis.requestpb.RequestPB.DeleteTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteTableMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.ListTable listTable(com.github.dataomnis.requestpb.RequestPB.ListTable request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTableMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.github.dataomnis.responsepb.ResponsePB.JsonList sourceTables(com.github.dataomnis.requestpb.RequestPB.SourceTables request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSourceTablesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.github.dataomnis.responsepb.ResponsePB.TableColumns tableColumns(com.github.dataomnis.requestpb.RequestPB.TableColumns request) {
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
     *source
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> create(
        com.github.dataomnis.requestpb.RequestPB.CreateSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> update(
        com.github.dataomnis.requestpb.RequestPB.UpdateSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeSource> describe(
        com.github.dataomnis.requestpb.RequestPB.DescribeSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> enable(
        com.github.dataomnis.requestpb.RequestPB.EnableSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getEnableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> disable(
        com.github.dataomnis.requestpb.RequestPB.DisableSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDisableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListSource> list(
        com.github.dataomnis.requestpb.RequestPB.ListSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> delete(
        com.github.dataomnis.requestpb.RequestPB.DeleteSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteAll(
        com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAllMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> pingSource(
        com.github.dataomnis.requestpb.RequestPB.PingSource request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingSourceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.SourceKind> sourceKind(
        com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSourceKindMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.JsonList> dataFormat(
        com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataFormatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.JsonList> dataType(
        com.github.dataomnis.modelpb.ModelPB.EmptyStruct request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDataTypeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *table
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> createTable(
        com.github.dataomnis.requestpb.RequestPB.CreateTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.DescribeTable> describeTable(
        com.github.dataomnis.requestpb.RequestPB.DescribeTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> updateTable(
        com.github.dataomnis.requestpb.RequestPB.UpdateTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.modelpb.ModelPB.EmptyStruct> deleteTable(
        com.github.dataomnis.requestpb.RequestPB.DeleteTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteTableMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.ListTable> listTable(
        com.github.dataomnis.requestpb.RequestPB.ListTable request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTableMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *source utile
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.JsonList> sourceTables(
        com.github.dataomnis.requestpb.RequestPB.SourceTables request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSourceTablesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.github.dataomnis.responsepb.ResponsePB.TableColumns> tableColumns(
        com.github.dataomnis.requestpb.RequestPB.TableColumns request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getTableColumnsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_UPDATE = 1;
  private static final int METHODID_DESCRIBE = 2;
  private static final int METHODID_ENABLE = 3;
  private static final int METHODID_DISABLE = 4;
  private static final int METHODID_LIST = 5;
  private static final int METHODID_DELETE = 6;
  private static final int METHODID_DELETE_ALL = 7;
  private static final int METHODID_PING_SOURCE = 8;
  private static final int METHODID_SOURCE_KIND = 9;
  private static final int METHODID_DATA_FORMAT = 10;
  private static final int METHODID_DATA_TYPE = 11;
  private static final int METHODID_CREATE_TABLE = 12;
  private static final int METHODID_DESCRIBE_TABLE = 13;
  private static final int METHODID_UPDATE_TABLE = 14;
  private static final int METHODID_DELETE_TABLE = 15;
  private static final int METHODID_LIST_TABLE = 16;
  private static final int METHODID_SOURCE_TABLES = 17;
  private static final int METHODID_TABLE_COLUMNS = 18;

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
        case METHODID_CREATE:
          serviceImpl.create((com.github.dataomnis.requestpb.RequestPB.CreateSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((com.github.dataomnis.requestpb.RequestPB.UpdateSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE:
          serviceImpl.describe((com.github.dataomnis.requestpb.RequestPB.DescribeSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeSource>) responseObserver);
          break;
        case METHODID_ENABLE:
          serviceImpl.enable((com.github.dataomnis.requestpb.RequestPB.EnableSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DISABLE:
          serviceImpl.disable((com.github.dataomnis.requestpb.RequestPB.DisableSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.github.dataomnis.requestpb.RequestPB.ListSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListSource>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((com.github.dataomnis.requestpb.RequestPB.DeleteSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_ALL:
          serviceImpl.deleteAll((com.github.dataomnis.requestpb.RequestPB.DeleteWorkspaces) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_PING_SOURCE:
          serviceImpl.pingSource((com.github.dataomnis.requestpb.RequestPB.PingSource) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_SOURCE_KIND:
          serviceImpl.sourceKind((com.github.dataomnis.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.SourceKind>) responseObserver);
          break;
        case METHODID_DATA_FORMAT:
          serviceImpl.dataFormat((com.github.dataomnis.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList>) responseObserver);
          break;
        case METHODID_DATA_TYPE:
          serviceImpl.dataType((com.github.dataomnis.modelpb.ModelPB.EmptyStruct) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList>) responseObserver);
          break;
        case METHODID_CREATE_TABLE:
          serviceImpl.createTable((com.github.dataomnis.requestpb.RequestPB.CreateTable) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_TABLE:
          serviceImpl.describeTable((com.github.dataomnis.requestpb.RequestPB.DescribeTable) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.DescribeTable>) responseObserver);
          break;
        case METHODID_UPDATE_TABLE:
          serviceImpl.updateTable((com.github.dataomnis.requestpb.RequestPB.UpdateTable) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_DELETE_TABLE:
          serviceImpl.deleteTable((com.github.dataomnis.requestpb.RequestPB.DeleteTable) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_TABLE:
          serviceImpl.listTable((com.github.dataomnis.requestpb.RequestPB.ListTable) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.ListTable>) responseObserver);
          break;
        case METHODID_SOURCE_TABLES:
          serviceImpl.sourceTables((com.github.dataomnis.requestpb.RequestPB.SourceTables) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.JsonList>) responseObserver);
          break;
        case METHODID_TABLE_COLUMNS:
          serviceImpl.tableColumns((com.github.dataomnis.requestpb.RequestPB.TableColumns) request,
              (io.grpc.stub.StreamObserver<com.github.dataomnis.responsepb.ResponsePB.TableColumns>) responseObserver);
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
      return com.github.dataomnis.smpb.SmPB.getDescriptor();
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
              .addMethod(getCreateMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDescribeMethod())
              .addMethod(getEnableMethod())
              .addMethod(getDisableMethod())
              .addMethod(getListMethod())
              .addMethod(getDeleteMethod())
              .addMethod(getDeleteAllMethod())
              .addMethod(getPingSourceMethod())
              .addMethod(getSourceKindMethod())
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
