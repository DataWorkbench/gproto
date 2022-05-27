package com.dataomnis.gproto.service.pbsvcspace;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * SyncJobManage declares API for manage Sync job.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/spacemanager/sync_job_manage.proto")
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

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobConfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SetSyncJobConf",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobConfMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getSetSyncJobConfMethod;
    if ((getSetSyncJobConfMethod = SyncJobManageGrpc.getSetSyncJobConfMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getSetSyncJobConfMethod = SyncJobManageGrpc.getSetSyncJobConfMethod) == null) {
          SyncJobManageGrpc.getSetSyncJobConfMethod = getSetSyncJobConfMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "SetSyncJobConf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("SetSyncJobConf"))
              .build();
        }
      }
    }
    return getSetSyncJobConfMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getGetSyncJobConfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSyncJobConf",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getGetSyncJobConfMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getGetSyncJobConfMethod;
    if ((getGetSyncJobConfMethod = SyncJobManageGrpc.getGetSyncJobConfMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getGetSyncJobConfMethod = SyncJobManageGrpc.getGetSyncJobConfMethod) == null) {
          SyncJobManageGrpc.getGetSyncJobConfMethod = getGetSyncJobConfMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSyncJobConf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("GetSyncJobConf"))
              .build();
        }
      }
    }
    return getGetSyncJobConfMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReopenReleaseSyncJobMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ReopenReleaseSyncJob",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReopenReleaseSyncJobMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getReopenReleaseSyncJobMethod;
    if ((getReopenReleaseSyncJobMethod = SyncJobManageGrpc.getReopenReleaseSyncJobMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getReopenReleaseSyncJobMethod = SyncJobManageGrpc.getReopenReleaseSyncJobMethod) == null) {
          SyncJobManageGrpc.getReopenReleaseSyncJobMethod = getReopenReleaseSyncJobMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ReopenReleaseSyncJob"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("ReopenReleaseSyncJob"))
              .build();
        }
      }
    }
    return getReopenReleaseSyncJobMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateReleaseSyncJobStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateReleaseSyncJobStatus",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateReleaseSyncJobStatusMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateReleaseSyncJobStatusMethod;
    if ((getUpdateReleaseSyncJobStatusMethod = SyncJobManageGrpc.getUpdateReleaseSyncJobStatusMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getUpdateReleaseSyncJobStatusMethod = SyncJobManageGrpc.getUpdateReleaseSyncJobStatusMethod) == null) {
          SyncJobManageGrpc.getUpdateReleaseSyncJobStatusMethod = getUpdateReleaseSyncJobStatusMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateReleaseSyncJobStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("UpdateReleaseSyncJobStatus"))
              .build();
        }
      }
    }
    return getUpdateReleaseSyncJobStatusMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getGetSyncJobVersionConfMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSyncJobVersionConf",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getGetSyncJobVersionConfMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getGetSyncJobVersionConfMethod;
    if ((getGetSyncJobVersionConfMethod = SyncJobManageGrpc.getGetSyncJobVersionConfMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getGetSyncJobVersionConfMethod = SyncJobManageGrpc.getGetSyncJobVersionConfMethod) == null) {
          SyncJobManageGrpc.getGetSyncJobVersionConfMethod = getGetSyncJobVersionConfMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSyncJobVersionConf"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("GetSyncJobVersionConf"))
              .build();
        }
      }
    }
    return getGetSyncJobVersionConfMethod;
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

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson> getGenerateJobJsonMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GenerateJobJson",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson> getGenerateJobJsonMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson> getGenerateJobJsonMethod;
    if ((getGenerateJobJsonMethod = SyncJobManageGrpc.getGenerateJobJsonMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getGenerateJobJsonMethod = SyncJobManageGrpc.getGenerateJobJsonMethod) == null) {
          SyncJobManageGrpc.getGenerateJobJsonMethod = getGenerateJobJsonMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GenerateJobJson"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("GenerateJobJson"))
              .build();
        }
      }
    }
    return getGenerateJobJsonMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode> getConvertSyncJobModeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ConvertSyncJobMode",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode> getConvertSyncJobModeMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode> getConvertSyncJobModeMethod;
    if ((getConvertSyncJobModeMethod = SyncJobManageGrpc.getConvertSyncJobModeMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getConvertSyncJobModeMethod = SyncJobManageGrpc.getConvertSyncJobModeMethod) == null) {
          SyncJobManageGrpc.getConvertSyncJobModeMethod = getConvertSyncJobModeMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ConvertSyncJobMode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("ConvertSyncJobMode"))
              .build();
        }
      }
    }
    return getConvertSyncJobModeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection> getPingSyncJobConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PingSyncJobConnection",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection> getPingSyncJobConnectionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection> getPingSyncJobConnectionMethod;
    if ((getPingSyncJobConnectionMethod = SyncJobManageGrpc.getPingSyncJobConnectionMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getPingSyncJobConnectionMethod = SyncJobManageGrpc.getPingSyncJobConnectionMethod) == null) {
          SyncJobManageGrpc.getPingSyncJobConnectionMethod = getPingSyncJobConnectionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PingSyncJobConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("PingSyncJobConnection"))
              .build();
        }
      }
    }
    return getPingSyncJobConnectionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection> getDescribeSyncConnectionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DescribeSyncConnection",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection,
      com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection> getDescribeSyncConnectionMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection> getDescribeSyncConnectionMethod;
    if ((getDescribeSyncConnectionMethod = SyncJobManageGrpc.getDescribeSyncConnectionMethod) == null) {
      synchronized (SyncJobManageGrpc.class) {
        if ((getDescribeSyncConnectionMethod = SyncJobManageGrpc.getDescribeSyncConnectionMethod) == null) {
          SyncJobManageGrpc.getDescribeSyncConnectionMethod = getDescribeSyncConnectionMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection, com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DescribeSyncConnection"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection.getDefaultInstance()))
              .setSchemaDescriptor(new SyncJobManageMethodDescriptorSupplier("DescribeSyncConnection"))
              .build();
        }
      }
    }
    return getDescribeSyncConnectionMethod;
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
     *
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
     * SetSyncJobConf to set the run parameters of the specified Sync job.
     * </pre>
     */
    public void setSyncJobConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSetSyncJobConfMethod(), responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobConf to get the run parameters of the specified Sync job.
     * </pre>
     */
    public void getSyncJobConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSyncJobConfMethod(), responseObserver);
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
     *
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
     * ReopenReleaseSyncJob to re open the offline job in schedule system.
     * </pre>
     */
    public void reopenReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReopenReleaseSyncJobMethod(), responseObserver);
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
     * UpdateReleaseSyncJobStatus is an internal API. called by scheduler when status of sync job is changed.
     * </pre>
     */
    public void updateReleaseSyncJobStatus(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateReleaseSyncJobStatusMethod(), responseObserver);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     *
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
    public void getSyncJobVersionConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSyncJobVersionConfMethod(), responseObserver);
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

    /**
     * <pre>
     * Generate Job Json
     * </pre>
     */
    public void generateJobJson(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGenerateJobJsonMethod(), responseObserver);
    }

    /**
     */
    public void convertSyncJobMode(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getConvertSyncJobModeMethod(), responseObserver);
    }

    /**
     * <pre>
     * PingSyncJobConnection for check the network connection between cluster and datasource that used in sync job.
     * </pre>
     */
    public void pingSyncJobConnection(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPingSyncJobConnectionMethod(), responseObserver);
    }

    /**
     * <pre>
     * DescribeSyncConnection fro query the connection results of sync job. return nil means no check connection.
     * </pre>
     */
    public void describeSyncConnection(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDescribeSyncConnectionMethod(), responseObserver);
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
            getSetSyncJobConfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_SET_SYNC_JOB_CONF)))
          .addMethod(
            getGetSyncJobConfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf>(
                  this, METHODID_GET_SYNC_JOB_CONF)))
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
            getReopenReleaseSyncJobMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_REOPEN_RELEASE_SYNC_JOB)))
          .addMethod(
            getListReleaseSyncJobsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs>(
                  this, METHODID_LIST_RELEASE_SYNC_JOBS)))
          .addMethod(
            getUpdateReleaseSyncJobStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_RELEASE_SYNC_JOB_STATUS)))
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
            getGetSyncJobVersionConfMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf>(
                  this, METHODID_GET_SYNC_JOB_VERSION_CONF)))
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
          .addMethod(
            getGenerateJobJsonMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson>(
                  this, METHODID_GENERATE_JOB_JSON)))
          .addMethod(
            getConvertSyncJobModeMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode>(
                  this, METHODID_CONVERT_SYNC_JOB_MODE)))
          .addMethod(
            getPingSyncJobConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection>(
                  this, METHODID_PING_SYNC_JOB_CONNECTION)))
          .addMethod(
            getDescribeSyncConnectionMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection,
                com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection>(
                  this, METHODID_DESCRIBE_SYNC_CONNECTION)))
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
     *
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
     * SetSyncJobConf to set the run parameters of the specified Sync job.
     * </pre>
     */
    public void setSyncJobConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSetSyncJobConfMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * GetSyncJobConf to get the run parameters of the specified Sync job.
     * </pre>
     */
    public void getSyncJobConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSyncJobConfMethod(), getCallOptions()), request, responseObserver);
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
     *
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
     * ReopenReleaseSyncJob to re open the offline job in schedule system.
     * </pre>
     */
    public void reopenReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReopenReleaseSyncJobMethod(), getCallOptions()), request, responseObserver);
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
     * UpdateReleaseSyncJobStatus is an internal API. called by scheduler when status of sync job is changed.
     * </pre>
     */
    public void updateReleaseSyncJobStatus(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateReleaseSyncJobStatusMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     *
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
    public void getSyncJobVersionConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSyncJobVersionConfMethod(), getCallOptions()), request, responseObserver);
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

    /**
     * <pre>
     * Generate Job Json
     * </pre>
     */
    public void generateJobJson(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGenerateJobJsonMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void convertSyncJobMode(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getConvertSyncJobModeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * PingSyncJobConnection for check the network connection between cluster and datasource that used in sync job.
     * </pre>
     */
    public void pingSyncJobConnection(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPingSyncJobConnectionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DescribeSyncConnection fro query the connection results of sync job. return nil means no check connection.
     * </pre>
     */
    public void describeSyncConnection(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDescribeSyncConnectionMethod(), getCallOptions()), request, responseObserver);
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
     *
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
     * SetSyncJobConf to set the run parameters of the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct setSyncJobConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSetSyncJobConfMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * GetSyncJobConf to get the run parameters of the specified Sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf getSyncJobConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSyncJobConfMethod(), getCallOptions(), request);
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
     *
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
     * ReopenReleaseSyncJob to re open the offline job in schedule system.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct reopenReleaseSyncJob(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReopenReleaseSyncJobMethod(), getCallOptions(), request);
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
     * UpdateReleaseSyncJobStatus is an internal API. called by scheduler when status of sync job is changed.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateReleaseSyncJobStatus(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateReleaseSyncJobStatusMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     *
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
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf getSyncJobVersionConf(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSyncJobVersionConfMethod(), getCallOptions(), request);
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

    /**
     * <pre>
     * Generate Job Json
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson generateJobJson(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGenerateJobJsonMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode convertSyncJobMode(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getConvertSyncJobModeMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * PingSyncJobConnection for check the network connection between cluster and datasource that used in sync job.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection pingSyncJobConnection(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPingSyncJobConnectionMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DescribeSyncConnection fro query the connection results of sync job. return nil means no check connection.
     * </pre>
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection describeSyncConnection(com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDescribeSyncConnectionMethod(), getCallOptions(), request);
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
     *
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
     * SetSyncJobConf to set the run parameters of the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> setSyncJobConf(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSetSyncJobConfMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * GetSyncJobConf to get the run parameters of the specified Sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getSyncJobConf(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSyncJobConfMethod(), getCallOptions()), request);
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
     *
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
     * ReopenReleaseSyncJob to re open the offline job in schedule system.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> reopenReleaseSyncJob(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReopenReleaseSyncJobMethod(), getCallOptions()), request);
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
     * UpdateReleaseSyncJobStatus is an internal API. called by scheduler when status of sync job is changed.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateReleaseSyncJobStatus(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateReleaseSyncJobStatusMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Interface for Sync job versions.
     *
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
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf> getSyncJobVersionConf(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSyncJobVersionConfMethod(), getCallOptions()), request);
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

    /**
     * <pre>
     * Generate Job Json
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson> generateJobJson(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGenerateJobJsonMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode> convertSyncJobMode(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getConvertSyncJobModeMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * PingSyncJobConnection for check the network connection between cluster and datasource that used in sync job.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection> pingSyncJobConnection(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPingSyncJobConnectionMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * DescribeSyncConnection fro query the connection results of sync job. return nil means no check connection.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection> describeSyncConnection(
        com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDescribeSyncConnectionMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_SYNC_JOBS = 0;
  private static final int METHODID_DELETE_SYNC_JOBS = 1;
  private static final int METHODID_MOVE_SYNC_JOBS = 2;
  private static final int METHODID_CREATE_SYNC_JOB = 3;
  private static final int METHODID_UPDATE_SYNC_JOB = 4;
  private static final int METHODID_DESCRIBE_SYNC_JOB = 5;
  private static final int METHODID_SET_SYNC_JOB_CONF = 6;
  private static final int METHODID_GET_SYNC_JOB_CONF = 7;
  private static final int METHODID_SET_SYNC_JOB_SCHEDULE = 8;
  private static final int METHODID_GET_SYNC_JOB_SCHEDULE = 9;
  private static final int METHODID_RELEASE_SYNC_JOB = 10;
  private static final int METHODID_OFFLINE_RELEASE_SYNC_JOB = 11;
  private static final int METHODID_REOPEN_RELEASE_SYNC_JOB = 12;
  private static final int METHODID_LIST_RELEASE_SYNC_JOBS = 13;
  private static final int METHODID_UPDATE_RELEASE_SYNC_JOB_STATUS = 14;
  private static final int METHODID_LIST_SYNC_JOB_VERSIONS = 15;
  private static final int METHODID_DESCRIBE_SYNC_JOB_VERSION = 16;
  private static final int METHODID_GET_SYNC_JOB_VERSION_CONF = 17;
  private static final int METHODID_GET_SYNC_JOB_VERSION_SCHEDULE = 18;
  private static final int METHODID_DESCRIBE_SYNC_FLINK_UIBY_INSTANCE_ID = 19;
  private static final int METHODID_GENERATE_JOB_JSON = 20;
  private static final int METHODID_CONVERT_SYNC_JOB_MODE = 21;
  private static final int METHODID_PING_SYNC_JOB_CONNECTION = 22;
  private static final int METHODID_DESCRIBE_SYNC_CONNECTION = 23;

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
        case METHODID_SET_SYNC_JOB_CONF:
          serviceImpl.setSyncJobConf((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.SetSyncJobConf) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_GET_SYNC_JOB_CONF:
          serviceImpl.getSyncJobConf((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf>) responseObserver);
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
        case METHODID_REOPEN_RELEASE_SYNC_JOB:
          serviceImpl.reopenReleaseSyncJob((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ReopenReleaseSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_RELEASE_SYNC_JOBS:
          serviceImpl.listReleaseSyncJobs((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListReleaseSyncJobs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListReleaseSyncJobs>) responseObserver);
          break;
        case METHODID_UPDATE_RELEASE_SYNC_JOB_STATUS:
          serviceImpl.updateReleaseSyncJobStatus((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.UpdateReleaseSyncJobStatus) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_SYNC_JOB_VERSIONS:
          serviceImpl.listSyncJobVersions((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ListSyncJobVersions) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ListSyncJobVersions>) responseObserver);
          break;
        case METHODID_DESCRIBE_SYNC_JOB_VERSION:
          serviceImpl.describeSyncJobVersion((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncJob) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncJob>) responseObserver);
          break;
        case METHODID_GET_SYNC_JOB_VERSION_CONF:
          serviceImpl.getSyncJobVersionConf((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobConf) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobConf>) responseObserver);
          break;
        case METHODID_GET_SYNC_JOB_VERSION_SCHEDULE:
          serviceImpl.getSyncJobVersionSchedule((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GetSyncJobSchedule) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GetSyncJobSchedule>) responseObserver);
          break;
        case METHODID_DESCRIBE_SYNC_FLINK_UIBY_INSTANCE_ID:
          serviceImpl.describeSyncFlinkUIByInstanceId((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncFlinkUIByInstanceId) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncFlinkUIByInstanceId>) responseObserver);
          break;
        case METHODID_GENERATE_JOB_JSON:
          serviceImpl.generateJobJson((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.GenerateJobJson) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.GenerateJobJson>) responseObserver);
          break;
        case METHODID_CONVERT_SYNC_JOB_MODE:
          serviceImpl.convertSyncJobMode((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.ConvertSyncJobMode) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.ConvertSyncJobMode>) responseObserver);
          break;
        case METHODID_PING_SYNC_JOB_CONNECTION:
          serviceImpl.pingSyncJobConnection((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.PingSyncJobConnection) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.PingSyncJobConnection>) responseObserver);
          break;
        case METHODID_DESCRIBE_SYNC_CONNECTION:
          serviceImpl.describeSyncConnection((com.dataomnis.gproto.types.pbrequest.PBRequestSyncJobManage.DescribeSyncConnection) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseSyncJobManage.DescribeSyncConnection>) responseObserver);
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
              .addMethod(getSetSyncJobConfMethod())
              .addMethod(getGetSyncJobConfMethod())
              .addMethod(getSetSyncJobScheduleMethod())
              .addMethod(getGetSyncJobScheduleMethod())
              .addMethod(getReleaseSyncJobMethod())
              .addMethod(getOfflineReleaseSyncJobMethod())
              .addMethod(getReopenReleaseSyncJobMethod())
              .addMethod(getListReleaseSyncJobsMethod())
              .addMethod(getUpdateReleaseSyncJobStatusMethod())
              .addMethod(getListSyncJobVersionsMethod())
              .addMethod(getDescribeSyncJobVersionMethod())
              .addMethod(getGetSyncJobVersionConfMethod())
              .addMethod(getGetSyncJobVersionScheduleMethod())
              .addMethod(getDescribeSyncFlinkUIByInstanceIdMethod())
              .addMethod(getGenerateJobJsonMethod())
              .addMethod(getConvertSyncJobModeMethod())
              .addMethod(getPingSyncJobConnectionMethod())
              .addMethod(getDescribeSyncConnectionMethod())
              .build();
        }
      }
    }
    return result;
  }
}
