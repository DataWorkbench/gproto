// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/spacemanager/file_meta_manage.proto

package com.dataomnis.gproto.service.pbsvcspace;

public final class PBSvcFileMeta {
  private PBSvcFileMeta() {}
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
      "\n1proto/service/spacemanager/file_meta_m" +
      "anage.proto\022\014spacemanager\032\035proto/types/m" +
      "odel/empty.proto\032*proto/types/request/fi" +
      "le_meta_manage.proto\032+proto/types/respon" +
      "se/file_meta_manage.proto2\321\004\n\016FileMetaMa" +
      "nage\022N\n\021CreateFilePrepare\022\032.request.Crea" +
      "teFilePrepare\032\033.response.CreateFilePrepa" +
      "re\"\000\022?\n\016CreateFileMeta\022\027.request.CreateF" +
      "ileMeta\032\022.model.EmptyStruct\"\000\022T\n\023ReCreat" +
      "eFilePrepare\022\034.request.ReCreateFilePrepa" +
      "re\032\035.response.ReCreateFilePrepare\"\000\022C\n\020R" +
      "eCreateFileMeta\022\031.request.ReCreateFileMe" +
      "ta\032\022.model.EmptyStruct\"\000\022K\n\020DescribeFile" +
      "Meta\022\031.request.DescribeFileMeta\032\032.respon" +
      "se.DescribeFileMeta\"\000\022?\n\016UpdateFileMeta\022" +
      "\027.request.UpdateFileMeta\032\022.model.EmptySt" +
      "ruct\"\000\022B\n\rListFileMetas\022\026.request.ListFi" +
      "leMetas\032\027.response.ListFileMetas\"\000\022A\n\017De" +
      "leteFileMetas\022\030.request.DeleteFileMetas\032" +
      "\022.model.EmptyStruct\"\000Br\n\'com.dataomnis.g" +
      "proto.service.pbsvcspaceB\rPBSvcFileMetaP" +
      "\000Z6github.com/DataWorkbench/gproto/xgo/s" +
      "ervice/pbsvcspaceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor(),
          com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor();
    com.dataomnis.gproto.types.pbrequest.PBRequestFileMetaManage.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseFileMetaManage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
