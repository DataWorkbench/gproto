// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/observer.proto

package com.github.dataomnis.obpb;

public final class ObPB {
  private ObPB() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024proto/observer.proto\032\rrequest.proto\032\016r" +
      "esponse.proto2\335\003\n\010Observer\022[\n GetPeriodi" +
      "cTasksStatusStatistics\022\031.request.PTasksS" +
      "tatusStat\032\032.response.PTasksStatusStat\"\000\022" +
      "Z\n#GetPeriodicTasksExecutingStatistics\022\027" +
      ".request.PTasksExecStat\032\030.response.PTask" +
      "sExecStat\"\000\022\\\n\035GetPeriodicTasksDispatchC" +
      "ount\022\033.request.PTaskDispatchCount\032\034.resp" +
      "onse.PTaskDispatchCount\"\000\022_\n\036GetPeriodic" +
      "TasksRuntimeRanking\022\034.request.PTaskRunti" +
      "meRanking\032\035.response.PTaskRuntimeRanking" +
      "\"\000\022Y\n\034GetPeriodicTasksErrorRanking\022\032.req" +
      "uest.PTaskErrorRanking\032\033.response.PTaskE" +
      "rrorRanking\"\000BM\n\031com.github.dataomnis.ob" +
      "pbB\004ObPBP\000Z(github.com/DataWorkbench/gpr" +
      "oto/pkg/obpbb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.github.dataomnis.requestpb.RequestPB.getDescriptor(),
          com.github.dataomnis.responsepb.ResponsePB.getDescriptor(),
        });
    com.github.dataomnis.requestpb.RequestPB.getDescriptor();
    com.github.dataomnis.responsepb.ResponsePB.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
