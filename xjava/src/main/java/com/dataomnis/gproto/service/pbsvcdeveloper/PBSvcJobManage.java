// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/developer/job_manage.proto

package com.dataomnis.gproto.service.pbsvcdeveloper;

public final class PBSvcJobManage {
  private PBSvcJobManage() {}
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
      "\n(proto/service/developer/job_manage.pro" +
      "to\022\tdeveloper\032\035proto/types/model/empty.p" +
      "roto\032$proto/types/request/job_manage.pro" +
      "to\032%proto/types/response/job_manage.prot" +
      "o2\234\003\n\tJobManage\022;\n\014FreeFlinkJob\022\025.reques" +
      "t.FreeFlinkJob\032\022.model.EmptyStruct\"\000\022?\n\014" +
      "InitFlinkJob\022\025.request.InitFlinkJob\032\026.re" +
      "sponse.InitFlinkJob\"\000\022E\n\016SubmitFlinkJob\022" +
      "\027.request.SubmitFlinkJob\032\030.response.Subm" +
      "itFlinkJob\"\000\022<\n\013GetFlinkJob\022\024.request.Ge" +
      "tFlinkJob\032\025.response.GetFlinkJob\"\000\022?\n\016Ca" +
      "ncelFlinkJob\022\027.request.CancelFlinkJob\032\022." +
      "model.EmptyStruct\"\000\022K\n\020ValidateFlinkJob\022" +
      "\031.request.ValidateFlinkJob\032\032.response.Va" +
      "lidateFlinkJob\"\000B{\n+com.dataomnis.gproto" +
      ".service.pbsvcdeveloperB\016PBSvcJobManageP" +
      "\000Z:github.com/DataWorkbench/gproto/xgo/s" +
      "ervice/pbsvcdeveloperb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor(),
          com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor();
    com.dataomnis.gproto.types.pbrequest.PBRequestJobManage.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseJobManageManage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
