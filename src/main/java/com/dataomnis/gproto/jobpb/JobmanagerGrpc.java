package com.dataomnis.gproto.jobpb;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *    rpc Run(request.JobInfo) returns (response.JobState) {}
 *    rpc Syntax(request.JobInfo) returns (response.JobState) {}
 *    rpc Preview(request.JobInfo) returns (response.JobState) {}
 *    rpc GetState(request.JobGetState) returns (response.JobState) {}
 *    rpc CancelJob(request.JobCancel) returns (model.EmptyStruct) {}
 *    rpc CancelAllJob(request.DeleteWorkspaces) returns (model.EmptyStruct) {}
 *    rpc NodeRelations(model.EmptyStruct) returns(response.NodeRelations) {}
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/jobmanager.proto")
public final class JobmanagerGrpc {

  private JobmanagerGrpc() {}

  public static final String SERVICE_NAME = "jobpb.Jobmanager";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getFreeFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FreeFlinkJob",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getFreeFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getFreeFlinkJobMethod;
    if ((getFreeFlinkJobMethod = JobmanagerGrpc.getFreeFlinkJobMethod) == null) {
      synchronized (JobmanagerGrpc.class) {
        if ((getFreeFlinkJobMethod = JobmanagerGrpc.getFreeFlinkJobMethod) == null) {
          JobmanagerGrpc.getFreeFlinkJobMethod = getFreeFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FreeFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new JobmanagerMethodDescriptorSupplier("FreeFlinkJob"))
              .build();
        }
      }
    }
    return getFreeFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob> getInitFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "InitFlinkJob",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob> getInitFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob> getInitFlinkJobMethod;
    if ((getInitFlinkJobMethod = JobmanagerGrpc.getInitFlinkJobMethod) == null) {
      synchronized (JobmanagerGrpc.class) {
        if ((getInitFlinkJobMethod = JobmanagerGrpc.getInitFlinkJobMethod) == null) {
          JobmanagerGrpc.getInitFlinkJobMethod = getInitFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "InitFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new JobmanagerMethodDescriptorSupplier("InitFlinkJob"))
              .build();
        }
      }
    }
    return getInitFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob> getSubmitFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SubmitFlinkJob",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob> getSubmitFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob> getSubmitFlinkJobMethod;
    if ((getSubmitFlinkJobMethod = JobmanagerGrpc.getSubmitFlinkJobMethod) == null) {
      synchronized (JobmanagerGrpc.class) {
        if ((getSubmitFlinkJobMethod = JobmanagerGrpc.getSubmitFlinkJobMethod) == null) {
          JobmanagerGrpc.getSubmitFlinkJobMethod = getSubmitFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SubmitFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new JobmanagerMethodDescriptorSupplier("SubmitFlinkJob"))
              .build();
        }
      }
    }
    return getSubmitFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob> getGetFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetFlinkJob",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob> getGetFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob> getGetFlinkJobMethod;
    if ((getGetFlinkJobMethod = JobmanagerGrpc.getGetFlinkJobMethod) == null) {
      synchronized (JobmanagerGrpc.class) {
        if ((getGetFlinkJobMethod = JobmanagerGrpc.getGetFlinkJobMethod) == null) {
          JobmanagerGrpc.getGetFlinkJobMethod = getGetFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob.getDefaultInstance()))
              .setSchemaDescriptor(new JobmanagerMethodDescriptorSupplier("GetFlinkJob"))
              .build();
        }
      }
    }
    return getGetFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getCancelFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelFlinkJob",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob.class,
      responseType = com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob,
      com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getCancelFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> getCancelFlinkJobMethod;
    if ((getCancelFlinkJobMethod = JobmanagerGrpc.getCancelFlinkJobMethod) == null) {
      synchronized (JobmanagerGrpc.class) {
        if ((getCancelFlinkJobMethod = JobmanagerGrpc.getCancelFlinkJobMethod) == null) {
          JobmanagerGrpc.getCancelFlinkJobMethod = getCancelFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob, com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new JobmanagerMethodDescriptorSupplier("CancelFlinkJob"))
              .build();
        }
      }
    }
    return getCancelFlinkJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax> getValidateFlinkJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ValidateFlinkJob",
      requestType = com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob.class,
      responseType = com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob,
      com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax> getValidateFlinkJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax> getValidateFlinkJobMethod;
    if ((getValidateFlinkJobMethod = JobmanagerGrpc.getValidateFlinkJobMethod) == null) {
      synchronized (JobmanagerGrpc.class) {
        if ((getValidateFlinkJobMethod = JobmanagerGrpc.getValidateFlinkJobMethod) == null) {
          JobmanagerGrpc.getValidateFlinkJobMethod = getValidateFlinkJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob, com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ValidateFlinkJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax.getDefaultInstance()))
              .setSchemaDescriptor(new JobmanagerMethodDescriptorSupplier("ValidateFlinkJob"))
              .build();
        }
      }
    }
    return getValidateFlinkJobMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JobmanagerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobmanagerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobmanagerStub>() {
        @java.lang.Override
        public JobmanagerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobmanagerStub(channel, callOptions);
        }
      };
    return JobmanagerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JobmanagerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobmanagerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobmanagerBlockingStub>() {
        @java.lang.Override
        public JobmanagerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobmanagerBlockingStub(channel, callOptions);
        }
      };
    return JobmanagerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JobmanagerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JobmanagerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JobmanagerFutureStub>() {
        @java.lang.Override
        public JobmanagerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JobmanagerFutureStub(channel, callOptions);
        }
      };
    return JobmanagerFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *    rpc Run(request.JobInfo) returns (response.JobState) {}
   *    rpc Syntax(request.JobInfo) returns (response.JobState) {}
   *    rpc Preview(request.JobInfo) returns (response.JobState) {}
   *    rpc GetState(request.JobGetState) returns (response.JobState) {}
   *    rpc CancelJob(request.JobCancel) returns (model.EmptyStruct) {}
   *    rpc CancelAllJob(request.DeleteWorkspaces) returns (model.EmptyStruct) {}
   *    rpc NodeRelations(model.EmptyStruct) returns(response.NodeRelations) {}
   * </pre>
   */
  public static abstract class JobmanagerImplBase implements io.grpc.BindableService {

    /**
     */
    public void freeFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFreeFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void initFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getInitFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSubmitFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void getFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelFlinkJobMethod(), responseObserver);
    }

    /**
     */
    public void validateFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getValidateFlinkJobMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFreeFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_FREE_FLINK_JOB)))
          .addMethod(
            getInitFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob,
                com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob>(
                  this, METHODID_INIT_FLINK_JOB)))
          .addMethod(
            getSubmitFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob,
                com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob>(
                  this, METHODID_SUBMIT_FLINK_JOB)))
          .addMethod(
            getGetFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob,
                com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob>(
                  this, METHODID_GET_FLINK_JOB)))
          .addMethod(
            getCancelFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob,
                com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>(
                  this, METHODID_CANCEL_FLINK_JOB)))
          .addMethod(
            getValidateFlinkJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob,
                com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax>(
                  this, METHODID_VALIDATE_FLINK_JOB)))
          .build();
    }
  }

  /**
   * <pre>
   *    rpc Run(request.JobInfo) returns (response.JobState) {}
   *    rpc Syntax(request.JobInfo) returns (response.JobState) {}
   *    rpc Preview(request.JobInfo) returns (response.JobState) {}
   *    rpc GetState(request.JobGetState) returns (response.JobState) {}
   *    rpc CancelJob(request.JobCancel) returns (model.EmptyStruct) {}
   *    rpc CancelAllJob(request.DeleteWorkspaces) returns (model.EmptyStruct) {}
   *    rpc NodeRelations(model.EmptyStruct) returns(response.NodeRelations) {}
   * </pre>
   */
  public static final class JobmanagerStub extends io.grpc.stub.AbstractAsyncStub<JobmanagerStub> {
    private JobmanagerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobmanagerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobmanagerStub(channel, callOptions);
    }

    /**
     */
    public void freeFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFreeFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void initFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getInitFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void submitFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void validateFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getValidateFlinkJobMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *    rpc Run(request.JobInfo) returns (response.JobState) {}
   *    rpc Syntax(request.JobInfo) returns (response.JobState) {}
   *    rpc Preview(request.JobInfo) returns (response.JobState) {}
   *    rpc GetState(request.JobGetState) returns (response.JobState) {}
   *    rpc CancelJob(request.JobCancel) returns (model.EmptyStruct) {}
   *    rpc CancelAllJob(request.DeleteWorkspaces) returns (model.EmptyStruct) {}
   *    rpc NodeRelations(model.EmptyStruct) returns(response.NodeRelations) {}
   * </pre>
   */
  public static final class JobmanagerBlockingStub extends io.grpc.stub.AbstractBlockingStub<JobmanagerBlockingStub> {
    private JobmanagerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobmanagerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobmanagerBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct freeFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFreeFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob initFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getInitFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob submitFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSubmitFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob getFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct cancelFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelFlinkJobMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax validateFlinkJob(com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getValidateFlinkJobMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *    rpc Run(request.JobInfo) returns (response.JobState) {}
   *    rpc Syntax(request.JobInfo) returns (response.JobState) {}
   *    rpc Preview(request.JobInfo) returns (response.JobState) {}
   *    rpc GetState(request.JobGetState) returns (response.JobState) {}
   *    rpc CancelJob(request.JobCancel) returns (model.EmptyStruct) {}
   *    rpc CancelAllJob(request.DeleteWorkspaces) returns (model.EmptyStruct) {}
   *    rpc NodeRelations(model.EmptyStruct) returns(response.NodeRelations) {}
   * </pre>
   */
  public static final class JobmanagerFutureStub extends io.grpc.stub.AbstractFutureStub<JobmanagerFutureStub> {
    private JobmanagerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JobmanagerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JobmanagerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> freeFlinkJob(
        com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFreeFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob> initFlinkJob(
        com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getInitFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob> submitFlinkJob(
        com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSubmitFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob> getFlinkJob(
        com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct> cancelFlinkJob(
        com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelFlinkJobMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax> validateFlinkJob(
        com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob request) {
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
    private final JobmanagerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JobmanagerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FREE_FLINK_JOB:
          serviceImpl.freeFlinkJob((com.dataomnis.gproto.requestpb.RequestPB.FreeFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_INIT_FLINK_JOB:
          serviceImpl.initFlinkJob((com.dataomnis.gproto.requestpb.RequestPB.InitFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.InitFlinkJob>) responseObserver);
          break;
        case METHODID_SUBMIT_FLINK_JOB:
          serviceImpl.submitFlinkJob((com.dataomnis.gproto.requestpb.RequestPB.SubmitFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.SubmitFlinkJob>) responseObserver);
          break;
        case METHODID_GET_FLINK_JOB:
          serviceImpl.getFlinkJob((com.dataomnis.gproto.requestpb.RequestPB.GetFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.GetFlinkJob>) responseObserver);
          break;
        case METHODID_CANCEL_FLINK_JOB:
          serviceImpl.cancelFlinkJob((com.dataomnis.gproto.requestpb.RequestPB.CancelFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.modelpb.ModelPB.EmptyStruct>) responseObserver);
          break;
        case METHODID_VALIDATE_FLINK_JOB:
          serviceImpl.validateFlinkJob((com.dataomnis.gproto.requestpb.RequestPB.ValidateFlinkJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.responsepb.ResponsePB.StreamJobCodeSyntax>) responseObserver);
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

  private static abstract class JobmanagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JobmanagerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.jobpb.JobPB.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Jobmanager");
    }
  }

  private static final class JobmanagerFileDescriptorSupplier
      extends JobmanagerBaseDescriptorSupplier {
    JobmanagerFileDescriptorSupplier() {}
  }

  private static final class JobmanagerMethodDescriptorSupplier
      extends JobmanagerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JobmanagerMethodDescriptorSupplier(String methodName) {
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
      synchronized (JobmanagerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JobmanagerFileDescriptorSupplier())
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
