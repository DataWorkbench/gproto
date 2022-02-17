package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SyncJobManage declares API for manage Sync job.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/spacemanager/sync_job_manage.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class SyncJobManageGrpc {

  private SyncJobManageGrpc() {}

  public static final String SERVICE_NAME = "spacemanager.SyncJobManage";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs> getListSyncJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSyncJobs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs> getListSyncJobsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs> getListSyncJobsMethod;
    if ((getListSyncJobsMethod = SyncJobManageGrpc.getListSyncJobsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getListSyncJobsMethod = SyncJobManageGrpc.getListSyncJobsMethod) == null) {
          SyncJobManageGrpc.getListSyncJobsMethod = getListSyncJobsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSyncJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("ListSyncJobs"))
              .build();
        }
      }
    }
    return getListSyncJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSyncJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSyncJobs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSyncJobsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSyncJobsMethod;
    if ((getDeleteSyncJobsMethod = SyncJobManageGrpc.getDeleteSyncJobsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getDeleteSyncJobsMethod = SyncJobManageGrpc.getDeleteSyncJobsMethod) == null) {
          SyncJobManageGrpc.getDeleteSyncJobsMethod = getDeleteSyncJobsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSyncJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("DeleteSyncJobs"))
              .build();
        }
      }
    }
    return getDeleteSyncJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getMoveSyncJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MoveSyncJobs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getMoveSyncJobsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getMoveSyncJobsMethod;
    if ((getMoveSyncJobsMethod = SyncJobManageGrpc.getMoveSyncJobsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getMoveSyncJobsMethod = SyncJobManageGrpc.getMoveSyncJobsMethod) == null) {
          SyncJobManageGrpc.getMoveSyncJobsMethod = getMoveSyncJobsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MoveSyncJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("MoveSyncJobs"))
              .build();
        }
      }
    }
    return getMoveSyncJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob> getCreateSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob> getCreateSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob> getCreateSyncJobMethod;
    if ((getCreateSyncJobMethod = SyncJobManageGrpc.getCreateSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getCreateSyncJobMethod = SyncJobManageGrpc.getCreateSyncJobMethod) == null) {
          SyncJobManageGrpc.getCreateSyncJobMethod = getCreateSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("CreateSyncJob"))
              .build();
        }
      }
    }
    return getCreateSyncJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateSyncJobMethod;
    if ((getUpdateSyncJobMethod = SyncJobManageGrpc.getUpdateSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getUpdateSyncJobMethod = SyncJobManageGrpc.getUpdateSyncJobMethod) == null) {
          SyncJobManageGrpc.getUpdateSyncJobMethod = getUpdateSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("UpdateSyncJob"))
              .build();
        }
      }
    }
    return getUpdateSyncJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> getDescribeSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> getDescribeSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> getDescribeSyncJobMethod;
    if ((getDescribeSyncJobMethod = SyncJobManageGrpc.getDescribeSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getDescribeSyncJobMethod = SyncJobManageGrpc.getDescribeSyncJobMethod) == null) {
          SyncJobManageGrpc.getDescribeSyncJobMethod = getDescribeSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("DescribeSyncJob"))
              .build();
        }
      }
    }
    return getDescribeSyncJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobArgsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSyncJobArgs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobArgsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobArgsMethod;
    if ((getSetSyncJobArgsMethod = SyncJobManageGrpc.getSetSyncJobArgsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getSetSyncJobArgsMethod = SyncJobManageGrpc.getSetSyncJobArgsMethod) == null) {
          SyncJobManageGrpc.getSetSyncJobArgsMethod = getSetSyncJobArgsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSyncJobArgs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("SetSyncJobArgs"))
              .build();
        }
      }
    }
    return getSetSyncJobArgsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getGetSyncJobArgsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSyncJobArgs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getGetSyncJobArgsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getGetSyncJobArgsMethod;
    if ((getGetSyncJobArgsMethod = SyncJobManageGrpc.getGetSyncJobArgsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getGetSyncJobArgsMethod = SyncJobManageGrpc.getGetSyncJobArgsMethod) == null) {
          SyncJobManageGrpc.getGetSyncJobArgsMethod = getGetSyncJobArgsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSyncJobArgs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("GetSyncJobArgs"))
              .build();
        }
      }
    }
    return getGetSyncJobArgsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSyncJobSchedule",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobScheduleMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobScheduleMethod;
    if ((getSetSyncJobScheduleMethod = SyncJobManageGrpc.getSetSyncJobScheduleMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getSetSyncJobScheduleMethod = SyncJobManageGrpc.getSetSyncJobScheduleMethod) == null) {
          SyncJobManageGrpc.getSetSyncJobScheduleMethod = getSetSyncJobScheduleMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSyncJobSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("SetSyncJobSchedule"))
              .build();
        }
      }
    }
    return getSetSyncJobScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getGetSyncJobScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSyncJobSchedule",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getGetSyncJobScheduleMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getGetSyncJobScheduleMethod;
    if ((getGetSyncJobScheduleMethod = SyncJobManageGrpc.getGetSyncJobScheduleMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getGetSyncJobScheduleMethod = SyncJobManageGrpc.getGetSyncJobScheduleMethod) == null) {
          SyncJobManageGrpc.getGetSyncJobScheduleMethod = getGetSyncJobScheduleMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSyncJobSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("GetSyncJobSchedule"))
              .build();
        }
      }
    }
    return getGetSyncJobScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReleaseSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReleaseSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReleaseSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReleaseSyncJobMethod;
    if ((getReleaseSyncJobMethod = SyncJobManageGrpc.getReleaseSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getReleaseSyncJobMethod = SyncJobManageGrpc.getReleaseSyncJobMethod) == null) {
          SyncJobManageGrpc.getReleaseSyncJobMethod = getReleaseSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReleaseSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("ReleaseSyncJob"))
              .build();
        }
      }
    }
    return getReleaseSyncJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getOfflineReleaseSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "OfflineReleaseSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getOfflineReleaseSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getOfflineReleaseSyncJobMethod;
    if ((getOfflineReleaseSyncJobMethod = SyncJobManageGrpc.getOfflineReleaseSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getOfflineReleaseSyncJobMethod = SyncJobManageGrpc.getOfflineReleaseSyncJobMethod) == null) {
          SyncJobManageGrpc.getOfflineReleaseSyncJobMethod = getOfflineReleaseSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "OfflineReleaseSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("OfflineReleaseSyncJob"))
              .build();
        }
      }
    }
    return getOfflineReleaseSyncJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendReleaseSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SuspendReleaseSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendReleaseSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSuspendReleaseSyncJobMethod;
    if ((getSuspendReleaseSyncJobMethod = SyncJobManageGrpc.getSuspendReleaseSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getSuspendReleaseSyncJobMethod = SyncJobManageGrpc.getSuspendReleaseSyncJobMethod) == null) {
          SyncJobManageGrpc.getSuspendReleaseSyncJobMethod = getSuspendReleaseSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SuspendReleaseSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("SuspendReleaseSyncJob"))
              .build();
        }
      }
    }
    return getSuspendReleaseSyncJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeReleaseSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ResumeReleaseSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeReleaseSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getResumeReleaseSyncJobMethod;
    if ((getResumeReleaseSyncJobMethod = SyncJobManageGrpc.getResumeReleaseSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getResumeReleaseSyncJobMethod = SyncJobManageGrpc.getResumeReleaseSyncJobMethod) == null) {
          SyncJobManageGrpc.getResumeReleaseSyncJobMethod = getResumeReleaseSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ResumeReleaseSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("ResumeReleaseSyncJob"))
              .build();
        }
      }
    }
    return getResumeReleaseSyncJobMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs> getListReleaseSyncJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListReleaseSyncJobs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs> getListReleaseSyncJobsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs> getListReleaseSyncJobsMethod;
    if ((getListReleaseSyncJobsMethod = SyncJobManageGrpc.getListReleaseSyncJobsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getListReleaseSyncJobsMethod = SyncJobManageGrpc.getListReleaseSyncJobsMethod) == null) {
          SyncJobManageGrpc.getListReleaseSyncJobsMethod = getListReleaseSyncJobsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListReleaseSyncJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("ListReleaseSyncJobs"))
              .build();
        }
      }
    }
    return getListReleaseSyncJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions> getListSyncJobVersionsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSyncJobVersions",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions> getListSyncJobVersionsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions> getListSyncJobVersionsMethod;
    if ((getListSyncJobVersionsMethod = SyncJobManageGrpc.getListSyncJobVersionsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getListSyncJobVersionsMethod = SyncJobManageGrpc.getListSyncJobVersionsMethod) == null) {
          SyncJobManageGrpc.getListSyncJobVersionsMethod = getListSyncJobVersionsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSyncJobVersions"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("ListSyncJobVersions"))
              .build();
        }
      }
    }
    return getListSyncJobVersionsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> getDescribeSyncJobVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeSyncJobVersion",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> getDescribeSyncJobVersionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> getDescribeSyncJobVersionMethod;
    if ((getDescribeSyncJobVersionMethod = SyncJobManageGrpc.getDescribeSyncJobVersionMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getDescribeSyncJobVersionMethod = SyncJobManageGrpc.getDescribeSyncJobVersionMethod) == null) {
          SyncJobManageGrpc.getDescribeSyncJobVersionMethod = getDescribeSyncJobVersionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeSyncJobVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("DescribeSyncJobVersion"))
              .build();
        }
      }
    }
    return getDescribeSyncJobVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getGetSyncJobVersionArgsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSyncJobVersionArgs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getGetSyncJobVersionArgsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getGetSyncJobVersionArgsMethod;
    if ((getGetSyncJobVersionArgsMethod = SyncJobManageGrpc.getGetSyncJobVersionArgsMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getGetSyncJobVersionArgsMethod = SyncJobManageGrpc.getGetSyncJobVersionArgsMethod) == null) {
          SyncJobManageGrpc.getGetSyncJobVersionArgsMethod = getGetSyncJobVersionArgsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSyncJobVersionArgs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("GetSyncJobVersionArgs"))
              .build();
        }
      }
    }
    return getGetSyncJobVersionArgsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getGetSyncJobVersionScheduleMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSyncJobVersionSchedule",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getGetSyncJobVersionScheduleMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getGetSyncJobVersionScheduleMethod;
    if ((getGetSyncJobVersionScheduleMethod = SyncJobManageGrpc.getGetSyncJobVersionScheduleMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getGetSyncJobVersionScheduleMethod = SyncJobManageGrpc.getGetSyncJobVersionScheduleMethod) == null) {
          SyncJobManageGrpc.getGetSyncJobVersionScheduleMethod = getGetSyncJobVersionScheduleMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSyncJobVersionSchedule"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("GetSyncJobVersionSchedule"))
              .build();
        }
      }
    }
    return getGetSyncJobVersionScheduleMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId> getDescribeSyncFlinkUIByInstanceIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeSyncFlinkUIByInstanceId",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId> getDescribeSyncFlinkUIByInstanceIdMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId> getDescribeSyncFlinkUIByInstanceIdMethod;
    if ((getDescribeSyncFlinkUIByInstanceIdMethod = SyncJobManageGrpc.getDescribeSyncFlinkUIByInstanceIdMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getDescribeSyncFlinkUIByInstanceIdMethod = SyncJobManageGrpc.getDescribeSyncFlinkUIByInstanceIdMethod) == null) {
          SyncJobManageGrpc.getDescribeSyncFlinkUIByInstanceIdMethod = getDescribeSyncFlinkUIByInstanceIdMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeSyncFlinkUIByInstanceId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("DescribeSyncFlinkUIByInstanceId"))
              .build();
        }
      }
    }
    return getDescribeSyncFlinkUIByInstanceIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static SyncJobManageStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncJobManageStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncJobManageStub>() {
        @java.lang.Override
        public SyncJobManageStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncJobManageStub(channel, callOptions);
        }
      };
    return SyncJobManageStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static SyncJobManageBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncJobManageBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncJobManageBlockingStub>() {
        @java.lang.Override
        public SyncJobManageBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncJobManageBlockingStub(channel, callOptions);
        }
      };
    return SyncJobManageBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static SyncJobManageFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<SyncJobManageFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<SyncJobManageFutureStub>() {
        @java.lang.Override
        public SyncJobManageFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new SyncJobManageFutureStub(channel, callOptions);
        }
      };
    return SyncJobManageFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * SyncJobManage declares API for manage Sync job.
   * </pre>
   */
  public static abstract class SyncJobManageImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Interface for Sync job dev.
     * ListSyncJobs to get a list of Sync job of the workspace.
     * </pre>
     */
    public void listSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSyncJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DeleteSyncJobs delete Sync job ant its related resources where in ids.
     * Cannot not delete directory in this API.
     * Resources includes:
     *  - History version and Released's job.
     *  - code, env schedule and its history version.
     *  - Offline job and force stop all running instances. (By Scheduler-Server)
     *  - All instances records. (By Scheduler-Server)
     * </pre>
     */
    public void deleteSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSyncJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Move SyncJob to other directory.
     * </pre>
     */
    public void moveSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMoveSyncJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * CreateSyncJob to create a new Sync job.
     * </pre>
     */
    public void createSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSyncJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * UpdateSyncJob to update the info for the specified Sync job.
     * </pre>
     */
    public void updateSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateSyncJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * DescribeSyncJob to get the info of the specified Sync job.
     * </pre>
     */
    public void describeSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeSyncJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetSyncJobArgs to set the run parameters of the specified Sync job.
     * </pre>
     */
    public void setSyncJobArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSyncJobArgsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobArgs to get the run parameters of the specified Sync job.
     * </pre>
     */
    public void getSyncJobArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSyncJobArgsMethod(), responseObserver);
    }

    /**
     * <pre>
     * SetSyncJobSchedule to set the schedule properties of the specified Sync job.
     * </pre>
     */
    public void setSyncJobSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSyncJobScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobSchedule to get the schedule properties of the specified Sync job.
     * </pre>
     */
    public void getSyncJobSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSyncJobScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Interface for Sync job release.
     * ReleaseSyncJob to publish the specified job to schedule system with a new version.
     * </pre>
     */
    public void releaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReleaseSyncJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJobs to suspend the specified job list in schedule system.
     * </pre>
     */
    public void offlineReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getOfflineReleaseSyncJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJob to suspend the specified job list in schedule system.
     * </pre>
     */
    public void suspendReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSuspendReleaseSyncJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * ResumeReleaseSyncJob to resume the suspended job list in schedule system.
     * </pre>
     */
    public void resumeReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getResumeReleaseSyncJobMethod(), responseObserver);
    }

    /**
     * <pre>
     * ListReleaseSyncJobs for gets a list of all published job in the workspace.
     * </pre>
     */
    public void listReleaseSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListReleaseSyncJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     * ListSyncJobVersions for gets a list of all versions of the specified job.
     * </pre>
     */
    public void listSyncJobVersions(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSyncJobVersionsMethod(), responseObserver);
    }

    /**
     * <pre>
     * DescribeSyncJobVersion for get the info of the job of the specified version.
     * </pre>
     */
    public void describeSyncJobVersion(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeSyncJobVersionMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobVersionArgs for get the run parameters of the job of the specified version.
     * </pre>
     */
    public void getSyncJobVersionArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSyncJobVersionArgsMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobVersionSchedule for get the schedule properties of the job of the specified version.
     * </pre>
     */
    public void getSyncJobVersionSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSyncJobVersionScheduleMethod(), responseObserver);
    }

    /**
     * <pre>
     * Interface for helper.
     * </pre>
     */
    public void describeSyncFlinkUIByInstanceId(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeSyncFlinkUIByInstanceIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getListSyncJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs>(
                  this, METHODID_LIST_SYNC_JOBS)))
          .addMethod(
            getDeleteSyncJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_SYNC_JOBS)))
          .addMethod(
            getMoveSyncJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_MOVE_SYNC_JOBS)))
          .addMethod(
            getCreateSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob>(
                  this, METHODID_CREATE_SYNC_JOB)))
          .addMethod(
            getUpdateSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_SYNC_JOB)))
          .addMethod(
            getDescribeSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob>(
                  this, METHODID_DESCRIBE_SYNC_JOB)))
          .addMethod(
            getSetSyncJobArgsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SET_SYNC_JOB_ARGS)))
          .addMethod(
            getGetSyncJobArgsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs>(
                  this, METHODID_GET_SYNC_JOB_ARGS)))
          .addMethod(
            getSetSyncJobScheduleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SET_SYNC_JOB_SCHEDULE)))
          .addMethod(
            getGetSyncJobScheduleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule>(
                  this, METHODID_GET_SYNC_JOB_SCHEDULE)))
          .addMethod(
            getReleaseSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RELEASE_SYNC_JOB)))
          .addMethod(
            getOfflineReleaseSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_OFFLINE_RELEASE_SYNC_JOB)))
          .addMethod(
            getSuspendReleaseSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SUSPEND_RELEASE_SYNC_JOB)))
          .addMethod(
            getResumeReleaseSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_RESUME_RELEASE_SYNC_JOB)))
          .addMethod(
            getListReleaseSyncJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs>(
                  this, METHODID_LIST_RELEASE_SYNC_JOBS)))
          .addMethod(
            getListSyncJobVersionsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions>(
                  this, METHODID_LIST_SYNC_JOB_VERSIONS)))
          .addMethod(
            getDescribeSyncJobVersionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob>(
                  this, METHODID_DESCRIBE_SYNC_JOB_VERSION)))
          .addMethod(
            getGetSyncJobVersionArgsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs>(
                  this, METHODID_GET_SYNC_JOB_VERSION_ARGS)))
          .addMethod(
            getGetSyncJobVersionScheduleMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule>(
                  this, METHODID_GET_SYNC_JOB_VERSION_SCHEDULE)))
          .addMethod(
            getDescribeSyncFlinkUIByInstanceIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId>(
                  this, METHODID_DESCRIBE_SYNC_FLINK_UIBY_INSTANCE_ID)))
          .build();
    }
  }

  /**
   * <pre>
   * SyncJobManage declares API for manage Sync job.
   * </pre>
   */
  public static final class SyncJobManageStub extends io.grpc.stub.AbstractAsyncStub<SyncJobManageStub> {
    private SyncJobManageStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncJobManageStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncJobManageStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for Sync job dev.
     * ListSyncJobs to get a list of Sync job of the workspace.
     * </pre>
     */
    public void listSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSyncJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DeleteSyncJobs delete Sync job ant its related resources where in ids.
     * Cannot not delete directory in this API.
     * Resources includes:
     *  - History version and Released's job.
     *  - code, env schedule and its history version.
     *  - Offline job and force stop all running instances. (By Scheduler-Server)
     *  - All instances records. (By Scheduler-Server)
     * </pre>
     */
    public void deleteSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSyncJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Move SyncJob to other directory.
     * </pre>
     */
    public void moveSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMoveSyncJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * CreateSyncJob to create a new Sync job.
     * </pre>
     */
    public void createSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSyncJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * UpdateSyncJob to update the info for the specified Sync job.
     * </pre>
     */
    public void updateSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateSyncJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DescribeSyncJob to get the info of the specified Sync job.
     * </pre>
     */
    public void describeSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeSyncJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetSyncJobArgs to set the run parameters of the specified Sync job.
     * </pre>
     */
    public void setSyncJobArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSyncJobArgsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobArgs to get the run parameters of the specified Sync job.
     * </pre>
     */
    public void getSyncJobArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSyncJobArgsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SetSyncJobSchedule to set the schedule properties of the specified Sync job.
     * </pre>
     */
    public void setSyncJobSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSyncJobScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobSchedule to get the schedule properties of the specified Sync job.
     * </pre>
     */
    public void getSyncJobSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSyncJobScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Interface for Sync job release.
     * ReleaseSyncJob to publish the specified job to schedule system with a new version.
     * </pre>
     */
    public void releaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReleaseSyncJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJobs to suspend the specified job list in schedule system.
     * </pre>
     */
    public void offlineReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getOfflineReleaseSyncJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJob to suspend the specified job list in schedule system.
     * </pre>
     */
    public void suspendReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSuspendReleaseSyncJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ResumeReleaseSyncJob to resume the suspended job list in schedule system.
     * </pre>
     */
    public void resumeReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getResumeReleaseSyncJobMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * ListReleaseSyncJobs for gets a list of all published job in the workspace.
     * </pre>
     */
    public void listReleaseSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListReleaseSyncJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     * ListSyncJobVersions for gets a list of all versions of the specified job.
     * </pre>
     */
    public void listSyncJobVersions(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSyncJobVersionsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DescribeSyncJobVersion for get the info of the job of the specified version.
     * </pre>
     */
    public void describeSyncJobVersion(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeSyncJobVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobVersionArgs for get the run parameters of the job of the specified version.
     * </pre>
     */
    public void getSyncJobVersionArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSyncJobVersionArgsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobVersionSchedule for get the schedule properties of the job of the specified version.
     * </pre>
     */
    public void getSyncJobVersionSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSyncJobVersionScheduleMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Interface for helper.
     * </pre>
     */
    public void describeSyncFlinkUIByInstanceId(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeSyncFlinkUIByInstanceIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * SyncJobManage declares API for manage Sync job.
   * </pre>
   */
  public static final class SyncJobManageBlockingStub extends io.grpc.stub.AbstractBlockingStub<SyncJobManageBlockingStub> {
    private SyncJobManageBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncJobManageBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncJobManageBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for Sync job dev.
     * ListSyncJobs to get a list of Sync job of the workspace.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs listSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSyncJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DeleteSyncJobs delete Sync job ant its related resources where in ids.
     * Cannot not delete directory in this API.
     * Resources includes:
     *  - History version and Released's job.
     *  - code, env schedule and its history version.
     *  - Offline job and force stop all running instances. (By Scheduler-Server)
     *  - All instances records. (By Scheduler-Server)
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSyncJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Move SyncJob to other directory.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct moveSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMoveSyncJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * CreateSyncJob to create a new Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob createSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSyncJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * UpdateSyncJob to update the info for the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateSyncJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DescribeSyncJob to get the info of the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob describeSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeSyncJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetSyncJobArgs to set the run parameters of the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct setSyncJobArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSyncJobArgsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSyncJobArgs to get the run parameters of the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs getSyncJobArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSyncJobArgsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SetSyncJobSchedule to set the schedule properties of the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct setSyncJobSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSyncJobScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSyncJobSchedule to get the schedule properties of the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule getSyncJobSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSyncJobScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Interface for Sync job release.
     * ReleaseSyncJob to publish the specified job to schedule system with a new version.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct releaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReleaseSyncJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJobs to suspend the specified job list in schedule system.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct offlineReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getOfflineReleaseSyncJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJob to suspend the specified job list in schedule system.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct suspendReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSuspendReleaseSyncJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ResumeReleaseSyncJob to resume the suspended job list in schedule system.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct resumeReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getResumeReleaseSyncJobMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * ListReleaseSyncJobs for gets a list of all published job in the workspace.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs listReleaseSyncJobs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListReleaseSyncJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     * ListSyncJobVersions for gets a list of all versions of the specified job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions listSyncJobVersions(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSyncJobVersionsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DescribeSyncJobVersion for get the info of the job of the specified version.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob describeSyncJobVersion(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeSyncJobVersionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSyncJobVersionArgs for get the run parameters of the job of the specified version.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs getSyncJobVersionArgs(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSyncJobVersionArgsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSyncJobVersionSchedule for get the schedule properties of the job of the specified version.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule getSyncJobVersionSchedule(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSyncJobVersionScheduleMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Interface for helper.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId describeSyncFlinkUIByInstanceId(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeSyncFlinkUIByInstanceIdMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * SyncJobManage declares API for manage Sync job.
   * </pre>
   */
  public static final class SyncJobManageFutureStub extends io.grpc.stub.AbstractFutureStub<SyncJobManageFutureStub> {
    private SyncJobManageFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected SyncJobManageFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new SyncJobManageFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Interface for Sync job dev.
     * ListSyncJobs to get a list of Sync job of the workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs> listSyncJobs(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSyncJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DeleteSyncJobs delete Sync job ant its related resources where in ids.
     * Cannot not delete directory in this API.
     * Resources includes:
     *  - History version and Released's job.
     *  - code, env schedule and its history version.
     *  - Offline job and force stop all running instances. (By Scheduler-Server)
     *  - All instances records. (By Scheduler-Server)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteSyncJobs(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSyncJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Move SyncJob to other directory.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> moveSyncJobs(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMoveSyncJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * CreateSyncJob to create a new Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob> createSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSyncJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * UpdateSyncJob to update the info for the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateSyncJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DescribeSyncJob to get the info of the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> describeSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeSyncJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetSyncJobArgs to set the run parameters of the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> setSyncJobArgs(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSyncJobArgsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSyncJobArgs to get the run parameters of the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getSyncJobArgs(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSyncJobArgsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SetSyncJobSchedule to set the schedule properties of the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> setSyncJobSchedule(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSyncJobScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSyncJobSchedule to get the schedule properties of the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getSyncJobSchedule(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSyncJobScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Interface for Sync job release.
     * ReleaseSyncJob to publish the specified job to schedule system with a new version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> releaseSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReleaseSyncJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJobs to suspend the specified job list in schedule system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> offlineReleaseSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getOfflineReleaseSyncJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * SuspendReleaseSyncJob to suspend the specified job list in schedule system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> suspendReleaseSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSuspendReleaseSyncJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ResumeReleaseSyncJob to resume the suspended job list in schedule system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> resumeReleaseSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getResumeReleaseSyncJobMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * ListReleaseSyncJobs for gets a list of all published job in the workspace.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs> listReleaseSyncJobs(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListReleaseSyncJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     * ListSyncJobVersions for gets a list of all versions of the specified job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions> listSyncJobVersions(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSyncJobVersionsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DescribeSyncJobVersion for get the info of the job of the specified version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob> describeSyncJobVersion(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeSyncJobVersionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSyncJobVersionArgs for get the run parameters of the job of the specified version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs> getSyncJobVersionArgs(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSyncJobVersionArgsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSyncJobVersionSchedule for get the schedule properties of the job of the specified version.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule> getSyncJobVersionSchedule(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSyncJobVersionScheduleMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Interface for helper.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId> describeSyncFlinkUIByInstanceId(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeSyncFlinkUIByInstanceIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SYNC_JOBS = 0;
  private static final int METHODID_DELETE_SYNC_JOBS = 1;
  private static final int METHODID_MOVE_SYNC_JOBS = 2;
  private static final int METHODID_CREATE_SYNC_JOB = 3;
  private static final int METHODID_UPDATE_SYNC_JOB = 4;
  private static final int METHODID_DESCRIBE_SYNC_JOB = 5;
  private static final int METHODID_SET_SYNC_JOB_ARGS = 6;
  private static final int METHODID_GET_SYNC_JOB_ARGS = 7;
  private static final int METHODID_SET_SYNC_JOB_SCHEDULE = 8;
  private static final int METHODID_GET_SYNC_JOB_SCHEDULE = 9;
  private static final int METHODID_RELEASE_SYNC_JOB = 10;
  private static final int METHODID_OFFLINE_RELEASE_SYNC_JOB = 11;
  private static final int METHODID_SUSPEND_RELEASE_SYNC_JOB = 12;
  private static final int METHODID_RESUME_RELEASE_SYNC_JOB = 13;
  private static final int METHODID_LIST_RELEASE_SYNC_JOBS = 14;
  private static final int METHODID_LIST_SYNC_JOB_VERSIONS = 15;
  private static final int METHODID_DESCRIBE_SYNC_JOB_VERSION = 16;
  private static final int METHODID_GET_SYNC_JOB_VERSION_ARGS = 17;
  private static final int METHODID_GET_SYNC_JOB_VERSION_SCHEDULE = 18;
  private static final int METHODID_DESCRIBE_SYNC_FLINK_UIBY_INSTANCE_ID = 19;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final SyncJobManageImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(SyncJobManageImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_SYNC_JOBS:
          serviceImpl.listSyncJobs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobs>) responseObserver);
          break;
        case METHODID_DELETE_SYNC_JOBS:
          serviceImpl.deleteSyncJobs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DeleteSyncJobs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_MOVE_SYNC_JOBS:
          serviceImpl.moveSyncJobs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.MoveSyncJobs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_SYNC_JOB:
          serviceImpl.createSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.CreateSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.CreateSyncJob>) responseObserver);
          break;
        case METHODID_UPDATE_SYNC_JOB:
          serviceImpl.updateSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_DESCRIBE_SYNC_JOB:
          serviceImpl.describeSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob>) responseObserver);
          break;
        case METHODID_SET_SYNC_JOB_ARGS:
          serviceImpl.setSyncJobArgs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobArgs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_GET_SYNC_JOB_ARGS:
          serviceImpl.getSyncJobArgs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs>) responseObserver);
          break;
        case METHODID_SET_SYNC_JOB_SCHEDULE:
          serviceImpl.setSyncJobSchedule((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobSchedule) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_GET_SYNC_JOB_SCHEDULE:
          serviceImpl.getSyncJobSchedule((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule>) responseObserver);
          break;
        case METHODID_RELEASE_SYNC_JOB:
          serviceImpl.releaseSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReleaseSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_OFFLINE_RELEASE_SYNC_JOB:
          serviceImpl.offlineReleaseSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.OfflineReleaseSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_SUSPEND_RELEASE_SYNC_JOB:
          serviceImpl.suspendReleaseSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SuspendReleaseSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_RESUME_RELEASE_SYNC_JOB:
          serviceImpl.resumeReleaseSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ResumeReleaseSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_RELEASE_SYNC_JOBS:
          serviceImpl.listReleaseSyncJobs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs>) responseObserver);
          break;
        case METHODID_LIST_SYNC_JOB_VERSIONS:
          serviceImpl.listSyncJobVersions((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions>) responseObserver);
          break;
        case METHODID_DESCRIBE_SYNC_JOB_VERSION:
          serviceImpl.describeSyncJobVersion((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob>) responseObserver);
          break;
        case METHODID_GET_SYNC_JOB_VERSION_ARGS:
          serviceImpl.getSyncJobVersionArgs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobArgs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobArgs>) responseObserver);
          break;
        case METHODID_GET_SYNC_JOB_VERSION_SCHEDULE:
          serviceImpl.getSyncJobVersionSchedule((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule>) responseObserver);
          break;
        case METHODID_DESCRIBE_SYNC_FLINK_UIBY_INSTANCE_ID:
          serviceImpl.describeSyncFlinkUIByInstanceId((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId>) responseObserver);
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

  private static abstract class SyncJobManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    SyncJobManageBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcspace.PBSvcSyncJobManage.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("SyncJobManage");
    }
  }

  private static final class SyncJobManageFileDescriptorSupplier
      extends SyncJobManageBaseDescriptorSupplier {
    SyncJobManageFileDescriptorSupplier() {}
  }

  private static final class SyncJobManageMethodDescriptorSupplier
      extends SyncJobManageBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    SyncJobManageMethodDescriptorSupplier(String methodName) {
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
      synchronized (SyncJobManageGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new SyncJobManageFileDescriptorSupplier())
              .addMethod(getListSyncJobsMethod())
              .addMethod(getDeleteSyncJobsMethod())
              .addMethod(getMoveSyncJobsMethod())
              .addMethod(getCreateSyncJobMethod())
              .addMethod(getUpdateSyncJobMethod())
              .addMethod(getDescribeSyncJobMethod())
              .addMethod(getSetSyncJobArgsMethod())
              .addMethod(getGetSyncJobArgsMethod())
              .addMethod(getSetSyncJobScheduleMethod())
              .addMethod(getGetSyncJobScheduleMethod())
              .addMethod(getReleaseSyncJobMethod())
              .addMethod(getOfflineReleaseSyncJobMethod())
              .addMethod(getSuspendReleaseSyncJobMethod())
              .addMethod(getResumeReleaseSyncJobMethod())
              .addMethod(getListReleaseSyncJobsMethod())
              .addMethod(getListSyncJobVersionsMethod())
              .addMethod(getDescribeSyncJobVersionMethod())
              .addMethod(getGetSyncJobVersionArgsMethod())
              .addMethod(getGetSyncJobVersionScheduleMethod())
              .addMethod(getDescribeSyncFlinkUIByInstanceIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
