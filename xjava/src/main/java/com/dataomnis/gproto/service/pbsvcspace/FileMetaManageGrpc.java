package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * FileMetaManage for manage metadata of file.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/file_meta_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class FileMetaManageGrpc {

  private FileMetaManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.FileMetaManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare> getCreateFilePrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFilePrepare",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare> getCreateFilePrepareMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare> getCreateFilePrepareMethod;
    if ((getCreateFilePrepareMethod = FileMetaManageGrpc.getCreateFilePrepareMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getCreateFilePrepareMethod = FileMetaManageGrpc.getCreateFilePrepareMethod) == null) {
          FileMetaManageGrpc.getCreateFilePrepareMethod = getCreateFilePrepareMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFilePrepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("CreateFilePrepare"))
              .build();
        }
      }
    }
    return getCreateFilePrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCreateFileMetaMethod;
    if ((getCreateFileMetaMethod = FileMetaManageGrpc.getCreateFileMetaMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getCreateFileMetaMethod = FileMetaManageGrpc.getCreateFileMetaMethod) == null) {
          FileMetaManageGrpc.getCreateFileMetaMethod = getCreateFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("CreateFileMeta"))
              .build();
        }
      }
    }
    return getCreateFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare> getReCreateFilePrepareMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReCreateFilePrepare",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare> getReCreateFilePrepareMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare> getReCreateFilePrepareMethod;
    if ((getReCreateFilePrepareMethod = FileMetaManageGrpc.getReCreateFilePrepareMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getReCreateFilePrepareMethod = FileMetaManageGrpc.getReCreateFilePrepareMethod) == null) {
          FileMetaManageGrpc.getReCreateFilePrepareMethod = getReCreateFilePrepareMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReCreateFilePrepare"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("ReCreateFilePrepare"))
              .build();
        }
      }
    }
    return getReCreateFilePrepareMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReCreateFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReCreateFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReCreateFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReCreateFileMetaMethod;
    if ((getReCreateFileMetaMethod = FileMetaManageGrpc.getReCreateFileMetaMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getReCreateFileMetaMethod = FileMetaManageGrpc.getReCreateFileMetaMethod) == null) {
          FileMetaManageGrpc.getReCreateFileMetaMethod = getReCreateFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReCreateFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("ReCreateFileMeta"))
              .build();
        }
      }
    }
    return getReCreateFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta> getDescribeFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta> getDescribeFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta> getDescribeFileMetaMethod;
    if ((getDescribeFileMetaMethod = FileMetaManageGrpc.getDescribeFileMetaMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getDescribeFileMetaMethod = FileMetaManageGrpc.getDescribeFileMetaMethod) == null) {
          FileMetaManageGrpc.getDescribeFileMetaMethod = getDescribeFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("DescribeFileMeta"))
              .build();
        }
      }
    }
    return getDescribeFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFileMetaMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateFileMeta",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFileMetaMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateFileMetaMethod;
    if ((getUpdateFileMetaMethod = FileMetaManageGrpc.getUpdateFileMetaMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getUpdateFileMetaMethod = FileMetaManageGrpc.getUpdateFileMetaMethod) == null) {
          FileMetaManageGrpc.getUpdateFileMetaMethod = getUpdateFileMetaMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateFileMeta"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("UpdateFileMeta"))
              .build();
        }
      }
    }
    return getUpdateFileMetaMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas> getListFileMetasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListFileMetas",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas,
      com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas> getListFileMetasMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas> getListFileMetasMethod;
    if ((getListFileMetasMethod = FileMetaManageGrpc.getListFileMetasMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getListFileMetasMethod = FileMetaManageGrpc.getListFileMetasMethod) == null) {
          FileMetaManageGrpc.getListFileMetasMethod = getListFileMetasMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas, com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListFileMetas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("ListFileMetas"))
              .build();
        }
      }
    }
    return getListFileMetasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileMetasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteFileMetas",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileMetasMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteFileMetasMethod;
    if ((getDeleteFileMetasMethod = FileMetaManageGrpc.getDeleteFileMetasMethod) == null) {
      synchronized (FileMetaManageGrpc.class) {
        if ((getDeleteFileMetasMethod = FileMetaManageGrpc.getDeleteFileMetasMethod) == null) {
          FileMetaManageGrpc.getDeleteFileMetasMethod = getDeleteFileMetasMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteFileMetas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new FileMetaManageMethodDescriptorSupplier("DeleteFileMetas"))
              .build();
        }
      }
    }
    return getDeleteFileMetasMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static FileMetaManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileMetaManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileMetaManageStub>() {
        @java.lang.Override
        public FileMetaManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileMetaManageStub(channel, callOptions);
        }
      };
    return FileMetaManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static FileMetaManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileMetaManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileMetaManageBlockingStub>() {
        @java.lang.Override
        public FileMetaManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileMetaManageBlockingStub(channel, callOptions);
        }
      };
    return FileMetaManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static FileMetaManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<FileMetaManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<FileMetaManageFutureStub>() {
        @java.lang.Override
        public FileMetaManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new FileMetaManageFutureStub(channel, callOptions);
        }
      };
    return FileMetaManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * FileMetaManage for manage metadata of file.
   * </pre>
   */
  public static abstract class FileMetaManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public void createFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFilePrepareMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public void createFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateFileMetaMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public void reCreateFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReCreateFilePrepareMethod(), responseObserver);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public void reCreateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReCreateFileMetaMethod(), responseObserver);
    }

    /**
     */
    public void describeFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeFileMetaMethod(), responseObserver);
    }

    /**
     */
    public void updateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateFileMetaMethod(), responseObserver);
    }

    /**
     */
    public void listFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListFileMetasMethod(), responseObserver);
    }

    /**
     */
    public void deleteFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteFileMetasMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateFilePrepareMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare,
                com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare>(
                  this, METHODID_CREATE_FILE_PREPARE)))
          .addMethod(
            getCreateFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CREATE_FILE_META)))
          .addMethod(
            getReCreateFilePrepareMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare,
                com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare>(
                  this, METHODID_RE_CREATE_FILE_PREPARE)))
          .addMethod(
            getReCreateFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RE_CREATE_FILE_META)))
          .addMethod(
            getDescribeFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta,
                com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta>(
                  this, METHODID_DESCRIBE_FILE_META)))
          .addMethod(
            getUpdateFileMetaMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_FILE_META)))
          .addMethod(
            getListFileMetasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas,
                com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas>(
                  this, METHODID_LIST_FILE_METAS)))
          .addMethod(
            getDeleteFileMetasMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_FILE_METAS)))
          .build();
    }
  }

  /**
   * <pre>
   * FileMetaManage for manage metadata of file.
   * </pre>
   */
  public static final class FileMetaManageStub extends io.grpc.stub.AbstractAsyncStub<FileMetaManageStub> {
    private FileMetaManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileMetaManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileMetaManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public void createFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFilePrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public void createFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public void reCreateFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReCreateFilePrepareMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public void reCreateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReCreateFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void describeFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateFileMetaMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListFileMetasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteFileMetasMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * FileMetaManage for manage metadata of file.
   * </pre>
   */
  public static final class FileMetaManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<FileMetaManageBlockingStub> {
    private FileMetaManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileMetaManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileMetaManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare createFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFilePrepareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct createFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateFileMetaMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare reCreateFilePrepare(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReCreateFilePrepareMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct reCreateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReCreateFileMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta describeFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeFileMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateFileMeta(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateFileMetaMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas listFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListFileMetasMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteFileMetas(com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteFileMetasMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * FileMetaManage for manage metadata of file.
   * </pre>
   */
  public static final class FileMetaManageFutureStub extends io.grpc.stub.AbstractFutureStub<FileMetaManageFutureStub> {
    private FileMetaManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected FileMetaManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new FileMetaManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new id.
     *   Generated a new version.
     *   Check name conflict.
     *   Check quota.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare> createFilePrepare(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFilePrepareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFileMeta for create metadata after write data success.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> createFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateFileMetaMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateFilePrepare used for before write data.
     * Do:
     *   Generated a new version.
     *   Check quota.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare> reCreateFilePrepare(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReCreateFilePrepareMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ReCreateFileMeta for update meta after re-upload file.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> reCreateFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReCreateFileMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta> describeFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeFileMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateFileMeta(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateFileMetaMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas> listFileMetas(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListFileMetasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteFileMetas(
        com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteFileMetasMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_FILE_PREPARE = 0;
  private static final int METHODID_CREATE_FILE_META = 1;
  private static final int METHODID_RE_CREATE_FILE_PREPARE = 2;
  private static final int METHODID_RE_CREATE_FILE_META = 3;
  private static final int METHODID_DESCRIBE_FILE_META = 4;
  private static final int METHODID_UPDATE_FILE_META = 5;
  private static final int METHODID_LIST_FILE_METAS = 6;
  private static final int METHODID_DELETE_FILE_METAS = 7;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final FileMetaManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(FileMetaManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_FILE_PREPARE:
          serviceImpl.createFilePrepare((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFilePrepare) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.CreateFilePrepare>) responseObserver);
          break;
        case METHODID_CREATE_FILE_META:
          serviceImpl.createFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.CreateFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RE_CREATE_FILE_PREPARE:
          serviceImpl.reCreateFilePrepare((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFilePrepare) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ReCreateFilePrepare>) responseObserver);
          break;
        case METHODID_RE_CREATE_FILE_META:
          serviceImpl.reCreateFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ReCreateFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_FILE_META:
          serviceImpl.describeFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DescribeFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.DescribeFileMeta>) responseObserver);
          break;
        case METHODID_UPDATE_FILE_META:
          serviceImpl.updateFileMeta((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.UpdateFileMeta) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_FILE_METAS:
          serviceImpl.listFileMetas((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.ListFileMetas) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.ListFileMetas>) responseObserver);
          break;
        case METHODID_DELETE_FILE_METAS:
          serviceImpl.deleteFileMetas((com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.DeleteFileMetas) request,
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

  private static abstract class FileMetaManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    FileMetaManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcFileMeta.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("FileMetaManage");
    }
  }

  private static final class FileMetaManageFileDescriptorSupplier
      extends FileMetaManageBaseDescriptorSupplier {
    FileMetaManageFileDescriptorSupplier() {}
  }

  private static final class FileMetaManageMethodDescriptorSupplier
      extends FileMetaManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    FileMetaManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (FileMetaManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new FileMetaManageFileDescriptorSupplier())
              .addMethod(getCreateFilePrepareMethod())
              .addMethod(getCreateFileMetaMethod())
              .addMethod(getReCreateFilePrepareMethod())
              .addMethod(getReCreateFileMetaMethod())
              .addMethod(getDescribeFileMetaMethod())
              .addMethod(getUpdateFileMetaMethod())
              .addMethod(getListFileMetasMethod())
              .addMethod(getDeleteFileMetasMethod())
              .build();
        }
      }
    }
    return result;
  }
}
