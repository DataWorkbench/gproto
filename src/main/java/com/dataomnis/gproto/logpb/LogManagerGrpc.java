package com.dataomnis.gproto.logpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/logmanager.proto")
public final class LogManagerGrpc {

  private LogManagerGrpc() {}

  public static final String SERVICE_NAME = "LogManager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest,
      com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply> getListJMHistoryLogFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListJMHistoryLogFiles",
      requestType = com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest.class,
      responseType = com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest,
      com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply> getListJMHistoryLogFilesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest, com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply> getListJMHistoryLogFilesMethod;
    if ((getListJMHistoryLogFilesMethod = LogManagerGrpc.getListJMHistoryLogFilesMethod) == null) {
      synchronized (LogManagerGrpc.class) {
        if ((getListJMHistoryLogFilesMethod = LogManagerGrpc.getListJMHistoryLogFilesMethod) == null) {
          LogManagerGrpc.getListJMHistoryLogFilesMethod = getListJMHistoryLogFilesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest, com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListJMHistoryLogFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply.getDefaultInstance()))
              .setSchemaDescriptor(new LogManagerMethodDescriptorSupplier("ListJMHistoryLogFiles"))
              .build();
        }
      }
    }
    return getListJMHistoryLogFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest,
      com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply> getListTMHistoryLogFilesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTMHistoryLogFiles",
      requestType = com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest.class,
      responseType = com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest,
      com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply> getListTMHistoryLogFilesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest, com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply> getListTMHistoryLogFilesMethod;
    if ((getListTMHistoryLogFilesMethod = LogManagerGrpc.getListTMHistoryLogFilesMethod) == null) {
      synchronized (LogManagerGrpc.class) {
        if ((getListTMHistoryLogFilesMethod = LogManagerGrpc.getListTMHistoryLogFilesMethod) == null) {
          LogManagerGrpc.getListTMHistoryLogFilesMethod = getListTMHistoryLogFilesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest, com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTMHistoryLogFiles"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply.getDefaultInstance()))
              .setSchemaDescriptor(new LogManagerMethodDescriptorSupplier("ListTMHistoryLogFiles"))
              .build();
        }
      }
    }
    return getListTMHistoryLogFilesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest,
      com.dataomnis.gproto.logpb.LogPB.FileContent> getDownloadJobMgrLogFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadJobMgrLogFile",
      requestType = com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest.class,
      responseType = com.dataomnis.gproto.logpb.LogPB.FileContent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest,
      com.dataomnis.gproto.logpb.LogPB.FileContent> getDownloadJobMgrLogFileMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest, com.dataomnis.gproto.logpb.LogPB.FileContent> getDownloadJobMgrLogFileMethod;
    if ((getDownloadJobMgrLogFileMethod = LogManagerGrpc.getDownloadJobMgrLogFileMethod) == null) {
      synchronized (LogManagerGrpc.class) {
        if ((getDownloadJobMgrLogFileMethod = LogManagerGrpc.getDownloadJobMgrLogFileMethod) == null) {
          LogManagerGrpc.getDownloadJobMgrLogFileMethod = getDownloadJobMgrLogFileMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest, com.dataomnis.gproto.logpb.LogPB.FileContent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadJobMgrLogFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.FileContent.getDefaultInstance()))
              .setSchemaDescriptor(new LogManagerMethodDescriptorSupplier("DownloadJobMgrLogFile"))
              .build();
        }
      }
    }
    return getDownloadJobMgrLogFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest,
      com.dataomnis.gproto.logpb.LogPB.FileContent> getDownloadTaskMgrLogFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DownloadTaskMgrLogFile",
      requestType = com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest.class,
      responseType = com.dataomnis.gproto.logpb.LogPB.FileContent.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest,
      com.dataomnis.gproto.logpb.LogPB.FileContent> getDownloadTaskMgrLogFileMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest, com.dataomnis.gproto.logpb.LogPB.FileContent> getDownloadTaskMgrLogFileMethod;
    if ((getDownloadTaskMgrLogFileMethod = LogManagerGrpc.getDownloadTaskMgrLogFileMethod) == null) {
      synchronized (LogManagerGrpc.class) {
        if ((getDownloadTaskMgrLogFileMethod = LogManagerGrpc.getDownloadTaskMgrLogFileMethod) == null) {
          LogManagerGrpc.getDownloadTaskMgrLogFileMethod = getDownloadTaskMgrLogFileMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest, com.dataomnis.gproto.logpb.LogPB.FileContent>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DownloadTaskMgrLogFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.FileContent.getDefaultInstance()))
              .setSchemaDescriptor(new LogManagerMethodDescriptorSupplier("DownloadTaskMgrLogFile"))
              .build();
        }
      }
    }
    return getDownloadTaskMgrLogFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.UploadFileRequest,
      com.dataomnis.gproto.logpb.LogPB.UploadFileReply> getUploadLogFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadLogFile",
      requestType = com.dataomnis.gproto.logpb.LogPB.UploadFileRequest.class,
      responseType = com.dataomnis.gproto.logpb.LogPB.UploadFileReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.UploadFileRequest,
      com.dataomnis.gproto.logpb.LogPB.UploadFileReply> getUploadLogFileMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.UploadFileRequest, com.dataomnis.gproto.logpb.LogPB.UploadFileReply> getUploadLogFileMethod;
    if ((getUploadLogFileMethod = LogManagerGrpc.getUploadLogFileMethod) == null) {
      synchronized (LogManagerGrpc.class) {
        if ((getUploadLogFileMethod = LogManagerGrpc.getUploadLogFileMethod) == null) {
          LogManagerGrpc.getUploadLogFileMethod = getUploadLogFileMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.logpb.LogPB.UploadFileRequest, com.dataomnis.gproto.logpb.LogPB.UploadFileReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadLogFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.UploadFileRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.UploadFileReply.getDefaultInstance()))
              .setSchemaDescriptor(new LogManagerMethodDescriptorSupplier("UploadLogFile"))
              .build();
        }
      }
    }
    return getUploadLogFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.TaskStatRequest,
      com.dataomnis.gproto.logpb.LogPB.TaskStatReply> getGetUploadingTaskStatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUploadingTaskStat",
      requestType = com.dataomnis.gproto.logpb.LogPB.TaskStatRequest.class,
      responseType = com.dataomnis.gproto.logpb.LogPB.TaskStatReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.TaskStatRequest,
      com.dataomnis.gproto.logpb.LogPB.TaskStatReply> getGetUploadingTaskStatMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.logpb.LogPB.TaskStatRequest, com.dataomnis.gproto.logpb.LogPB.TaskStatReply> getGetUploadingTaskStatMethod;
    if ((getGetUploadingTaskStatMethod = LogManagerGrpc.getGetUploadingTaskStatMethod) == null) {
      synchronized (LogManagerGrpc.class) {
        if ((getGetUploadingTaskStatMethod = LogManagerGrpc.getGetUploadingTaskStatMethod) == null) {
          LogManagerGrpc.getGetUploadingTaskStatMethod = getGetUploadingTaskStatMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.logpb.LogPB.TaskStatRequest, com.dataomnis.gproto.logpb.LogPB.TaskStatReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUploadingTaskStat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.TaskStatRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.logpb.LogPB.TaskStatReply.getDefaultInstance()))
              .setSchemaDescriptor(new LogManagerMethodDescriptorSupplier("GetUploadingTaskStat"))
              .build();
        }
      }
    }
    return getGetUploadingTaskStatMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static LogManagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogManagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogManagerStub>() {
        @java.lang.Override
        public LogManagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogManagerStub(channel, callOptions);
        }
      };
    return LogManagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static LogManagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogManagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogManagerBlockingStub>() {
        @java.lang.Override
        public LogManagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogManagerBlockingStub(channel, callOptions);
        }
      };
    return LogManagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static LogManagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<LogManagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<LogManagerFutureStub>() {
        @java.lang.Override
        public LogManagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new LogManagerFutureStub(channel, callOptions);
        }
      };
    return LogManagerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class LogManagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void listJMHistoryLogFiles(com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListJMHistoryLogFilesMethod(), responseObserver);
    }

    /**
     */
    public void listTMHistoryLogFiles(com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListTMHistoryLogFilesMethod(), responseObserver);
    }

    /**
     */
    public void downloadJobMgrLogFile(com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.FileContent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadJobMgrLogFileMethod(), responseObserver);
    }

    /**
     */
    public void downloadTaskMgrLogFile(com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.FileContent> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDownloadTaskMgrLogFileMethod(), responseObserver);
    }

    /**
     */
    public void uploadLogFile(com.dataomnis.gproto.logpb.LogPB.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.UploadFileReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadLogFileMethod(), responseObserver);
    }

    /**
     */
    public void getUploadingTaskStat(com.dataomnis.gproto.logpb.LogPB.TaskStatRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.TaskStatReply> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUploadingTaskStatMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListJMHistoryLogFilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest,
                com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply>(
                  this, METHODID_LIST_JMHISTORY_LOG_FILES)))
          .addMethod(
            getListTMHistoryLogFilesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest,
                com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply>(
                  this, METHODID_LIST_TMHISTORY_LOG_FILES)))
          .addMethod(
            getDownloadJobMgrLogFileMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest,
                com.dataomnis.gproto.logpb.LogPB.FileContent>(
                  this, METHODID_DOWNLOAD_JOB_MGR_LOG_FILE)))
          .addMethod(
            getDownloadTaskMgrLogFileMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest,
                com.dataomnis.gproto.logpb.LogPB.FileContent>(
                  this, METHODID_DOWNLOAD_TASK_MGR_LOG_FILE)))
          .addMethod(
            getUploadLogFileMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.logpb.LogPB.UploadFileRequest,
                com.dataomnis.gproto.logpb.LogPB.UploadFileReply>(
                  this, METHODID_UPLOAD_LOG_FILE)))
          .addMethod(
            getGetUploadingTaskStatMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.logpb.LogPB.TaskStatRequest,
                com.dataomnis.gproto.logpb.LogPB.TaskStatReply>(
                  this, METHODID_GET_UPLOADING_TASK_STAT)))
          .build();
    }
  }

  /**
   */
  public static final class LogManagerStub extends io.grpc.stub.AbstractAsyncStub<LogManagerStub> {
    private LogManagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogManagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogManagerStub(channel, callOptions);
    }

    /**
     */
    public void listJMHistoryLogFiles(com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListJMHistoryLogFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listTMHistoryLogFiles(com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListTMHistoryLogFilesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadJobMgrLogFile(com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.FileContent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDownloadJobMgrLogFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void downloadTaskMgrLogFile(com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.FileContent> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getDownloadTaskMgrLogFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadLogFile(com.dataomnis.gproto.logpb.LogPB.UploadFileRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.UploadFileReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadLogFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUploadingTaskStat(com.dataomnis.gproto.logpb.LogPB.TaskStatRequest request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.TaskStatReply> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUploadingTaskStatMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class LogManagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<LogManagerBlockingStub> {
    private LogManagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogManagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogManagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply listJMHistoryLogFiles(com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListJMHistoryLogFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply listTMHistoryLogFiles(com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListTMHistoryLogFilesMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.dataomnis.gproto.logpb.LogPB.FileContent> downloadJobMgrLogFile(
        com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDownloadJobMgrLogFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<com.dataomnis.gproto.logpb.LogPB.FileContent> downloadTaskMgrLogFile(
        com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getDownloadTaskMgrLogFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.logpb.LogPB.UploadFileReply uploadLogFile(com.dataomnis.gproto.logpb.LogPB.UploadFileRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadLogFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.logpb.LogPB.TaskStatReply getUploadingTaskStat(com.dataomnis.gproto.logpb.LogPB.TaskStatRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUploadingTaskStatMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class LogManagerFutureStub extends io.grpc.stub.AbstractFutureStub<LogManagerFutureStub> {
    private LogManagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected LogManagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new LogManagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply> listJMHistoryLogFiles(
        com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListJMHistoryLogFilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply> listTMHistoryLogFiles(
        com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListTMHistoryLogFilesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.logpb.LogPB.UploadFileReply> uploadLogFile(
        com.dataomnis.gproto.logpb.LogPB.UploadFileRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadLogFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.logpb.LogPB.TaskStatReply> getUploadingTaskStat(
        com.dataomnis.gproto.logpb.LogPB.TaskStatRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUploadingTaskStatMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_JMHISTORY_LOG_FILES = 0;
  private static final int METHODID_LIST_TMHISTORY_LOG_FILES = 1;
  private static final int METHODID_DOWNLOAD_JOB_MGR_LOG_FILE = 2;
  private static final int METHODID_DOWNLOAD_TASK_MGR_LOG_FILE = 3;
  private static final int METHODID_UPLOAD_LOG_FILE = 4;
  private static final int METHODID_GET_UPLOADING_TASK_STAT = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final LogManagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(LogManagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_JMHISTORY_LOG_FILES:
          serviceImpl.listJMHistoryLogFiles((com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.ListJMHistLogsReply>) responseObserver);
          break;
        case METHODID_LIST_TMHISTORY_LOG_FILES:
          serviceImpl.listTMHistoryLogFiles((com.dataomnis.gproto.logpb.LogPB.ListHistLogsRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.ListTMHistLogsReply>) responseObserver);
          break;
        case METHODID_DOWNLOAD_JOB_MGR_LOG_FILE:
          serviceImpl.downloadJobMgrLogFile((com.dataomnis.gproto.logpb.LogPB.DownloadJobMgrRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.FileContent>) responseObserver);
          break;
        case METHODID_DOWNLOAD_TASK_MGR_LOG_FILE:
          serviceImpl.downloadTaskMgrLogFile((com.dataomnis.gproto.logpb.LogPB.DownloadTaskMgrRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.FileContent>) responseObserver);
          break;
        case METHODID_UPLOAD_LOG_FILE:
          serviceImpl.uploadLogFile((com.dataomnis.gproto.logpb.LogPB.UploadFileRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.UploadFileReply>) responseObserver);
          break;
        case METHODID_GET_UPLOADING_TASK_STAT:
          serviceImpl.getUploadingTaskStat((com.dataomnis.gproto.logpb.LogPB.TaskStatRequest) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.logpb.LogPB.TaskStatReply>) responseObserver);
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

  private static abstract class LogManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    LogManagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.logpb.LogPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("LogManager");
    }
  }

  private static final class LogManagerFileDescriptorSupplier
      extends LogManagerBaseDescriptorSupplier {
    LogManagerFileDescriptorSupplier() {}
  }

  private static final class LogManagerMethodDescriptorSupplier
      extends LogManagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    LogManagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (LogManagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new LogManagerFileDescriptorSupplier())
              .addMethod(getListJMHistoryLogFilesMethod())
              .addMethod(getListTMHistoryLogFilesMethod())
              .addMethod(getDownloadJobMgrLogFileMethod())
              .addMethod(getDownloadTaskMgrLogFileMethod())
              .addMethod(getUploadLogFileMethod())
              .addMethod(getGetUploadingTaskStatMethod())
              .build();
        }
      }
    }
    return result;
  }
}
