package com.dataomnis.gproto.service.pbsvcdeveloper;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/developer/job_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class JobManageGrpc {

  private JobManageGrpc() {}

  public static final String SERVICE_NAME = "developer.JobManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getFreeFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreeFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getFreeFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getFreeFlinkJobMethod;
    if ((getFreeFlinkJobMethod = JobManageGrpc.getFreeFlinkJobMethod) == null) {
      synchronized (JobManageGrpc.class) {
        if ((getFreeFlinkJobMethod = JobManageGrpc.getFreeFlinkJobMethod) == null) {
          JobManageGrpc.getFreeFlinkJobMethod = getFreeFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreeFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new JobManageMethodDescriptorSupplier("FreeFlinkJob"))
              .build();
        }
      }
    }
    return getFreeFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob> getInitFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob> getInitFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob> getInitFlinkJobMethod;
    if ((getInitFlinkJobMethod = JobManageGrpc.getInitFlinkJobMethod) == null) {
      synchronized (JobManageGrpc.class) {
        if ((getInitFlinkJobMethod = JobManageGrpc.getInitFlinkJobMethod) == null) {
          JobManageGrpc.getInitFlinkJobMethod = getInitFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new JobManageMethodDescriptorSupplier("InitFlinkJob"))
              .build();
        }
      }
    }
    return getInitFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob> getSubmitFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob> getSubmitFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob> getSubmitFlinkJobMethod;
    if ((getSubmitFlinkJobMethod = JobManageGrpc.getSubmitFlinkJobMethod) == null) {
      synchronized (JobManageGrpc.class) {
        if ((getSubmitFlinkJobMethod = JobManageGrpc.getSubmitFlinkJobMethod) == null) {
          JobManageGrpc.getSubmitFlinkJobMethod = getSubmitFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new JobManageMethodDescriptorSupplier("SubmitFlinkJob"))
              .build();
        }
      }
    }
    return getSubmitFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob> getGetFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob> getGetFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob> getGetFlinkJobMethod;
    if ((getGetFlinkJobMethod = JobManageGrpc.getGetFlinkJobMethod) == null) {
      synchronized (JobManageGrpc.class) {
        if ((getGetFlinkJobMethod = JobManageGrpc.getGetFlinkJobMethod) == null) {
          JobManageGrpc.getGetFlinkJobMethod = getGetFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new JobManageMethodDescriptorSupplier("GetFlinkJob"))
              .build();
        }
      }
    }
    return getGetFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getCancelFlinkJobMethod;
    if ((getCancelFlinkJobMethod = JobManageGrpc.getCancelFlinkJobMethod) == null) {
      synchronized (JobManageGrpc.class) {
        if ((getCancelFlinkJobMethod = JobManageGrpc.getCancelFlinkJobMethod) == null) {
          JobManageGrpc.getCancelFlinkJobMethod = getCancelFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new JobManageMethodDescriptorSupplier("CancelFlinkJob"))
              .build();
        }
      }
    }
    return getCancelFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax> getValidateFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateFlinkJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax> getValidateFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax> getValidateFlinkJobMethod;
    if ((getValidateFlinkJobMethod = JobManageGrpc.getValidateFlinkJobMethod) == null) {
      synchronized (JobManageGrpc.class) {
        if ((getValidateFlinkJobMethod = JobManageGrpc.getValidateFlinkJobMethod) == null) {
          JobManageGrpc.getValidateFlinkJobMethod = getValidateFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob, com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax.getDefaultInstance()))
              .setSchemaDescriptor(new JobManageMethodDescriptorSupplier("ValidateFlinkJob"))
              .build();
        }
      }
    }
    return getValidateFlinkJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobManageStub>() {
        @java.lang.Override
        public JobManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobManageStub(channel, callOptions);
        }
      };
    return JobManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobManageBlockingStub>() {
        @java.lang.Override
        public JobManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobManageBlockingStub(channel, callOptions);
        }
      };
    return JobManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobManageFutureStub>() {
        @java.lang.Override
        public JobManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobManageFutureStub(channel, callOptions);
        }
      };
    return JobManageFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JobManageImplBase implements io.grpc.BindableService {

    /**
     */
    public void freeFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreeFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void initFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void getFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void validateFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateFlinkJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFreeFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_FREE_FLINK_JOB)))
          .addMethod(
            getInitFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob>(
                  this, METHODID_INIT_FLINK_JOB)))
          .addMethod(
            getSubmitFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob>(
                  this, METHODID_SUBMIT_FLINK_JOB)))
          .addMethod(
            getGetFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob>(
                  this, METHODID_GET_FLINK_JOB)))
          .addMethod(
            getCancelFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_CANCEL_FLINK_JOB)))
          .addMethod(
            getValidateFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax>(
                  this, METHODID_VALIDATE_FLINK_JOB)))
          .build();
    }
  }

  /**
   */
  public static final class JobManageStub extends io.grpc.stub.AbstractAsyncStub<JobManageStub> {
    private JobManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobManageStub(channel, callOptions);
    }

    /**
     */
    public void freeFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreeFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JobManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobManageBlockingStub> {
    private JobManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobManageBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct freeFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreeFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob initFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob submitFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob getFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct cancelFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax validateFlinkJob(com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateFlinkJobMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JobManageFutureStub extends io.grpc.stub.AbstractFutureStub<JobManageFutureStub> {
    private JobManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobManageFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> freeFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreeFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob> initFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob> submitFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob> getFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> cancelFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax> validateFlinkJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getValidateFlinkJobMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_FREE_FLINK_JOB = 0;
  private static final int METHODID_INIT_FLINK_JOB = 1;
  private static final int METHODID_SUBMIT_FLINK_JOB = 2;
  private static final int METHODID_GET_FLINK_JOB = 3;
  private static final int METHODID_CANCEL_FLINK_JOB = 4;
  private static final int METHODID_VALIDATE_FLINK_JOB = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JobManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FREE_FLINK_JOB:
          serviceImpl.freeFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.FreeFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_INIT_FLINK_JOB:
          serviceImpl.initFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.InitFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.InitFlinkJob>) responseObserver);
          break;
        case METHODID_SUBMIT_FLINK_JOB:
          serviceImpl.submitFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.SubmitFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.SubmitFlinkJob>) responseObserver);
          break;
        case METHODID_GET_FLINK_JOB:
          serviceImpl.getFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.GetFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.GetFlinkJob>) responseObserver);
          break;
        case METHODID_CANCEL_FLINK_JOB:
          serviceImpl.cancelFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.CancelFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_VALIDATE_FLINK_JOB:
          serviceImpl.validateFlinkJob((com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.ValidateFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseStreamJobManage.StreamJobCodeSyntax>) responseObserver);
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

  private static abstract class JobManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcdeveloper.PBSvcJobManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("JobManage");
    }
  }

  private static final class JobManageFileDescriptorSupplier
      extends JobManageBaseDescriptorSupplier {
    JobManageFileDescriptorSupplier() {}
  }

  private static final class JobManageMethodDescriptorSupplier
      extends JobManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobManageFileDescriptorSupplier())
              .addMethod(getFreeFlinkJobMethod())
              .addMethod(getInitFlinkJobMethod())
              .addMethod(getSubmitFlinkJobMethod())
              .addMethod(getGetFlinkJobMethod())
              .addMethod(getCancelFlinkJobMethod())
              .addMethod(getValidateFlinkJobMethod())
              .build();
        }
      }
    }
    return result;
  }
}
