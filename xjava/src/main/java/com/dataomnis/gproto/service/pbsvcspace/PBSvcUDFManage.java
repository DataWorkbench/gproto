// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/spacemanager/udf_manage.proto

package com.dataomnis.gproto.service.pbsvcspace;

public final class PBSvcUDFManage {
  private PBSvcUDFManage() {}
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
      "\n+proto/service/spacemanager/udf_manage." +
      "proto\022\014spacemanager\032\035proto/types/model/e" +
      "mpty.proto\032$proto/types/request/udf_mana" +
      "ge.proto\032%proto/types/response/udf_manag" +
      "e.proto2\246\002\n\tUDFManage\0223\n\010ListUDFs\022\021.requ" +
      "est.ListUDFs\032\022.response.ListUDFs\"\000\0227\n\nDe" +
      "leteUDFs\022\023.request.DeleteUDFs\032\022.model.Em" +
      "ptyStruct\"\000\0226\n\tCreateUDF\022\022.request.Creat" +
      "eUDF\032\023.response.CreateUDF\"\000\0225\n\tUpdateUDF" +
      "\022\022.request.UpdateUDF\032\022.model.EmptyStruct" +
      "\"\000\022<\n\013DescribeUDF\022\024.request.DescribeUDF\032" +
      "\025.response.DescribeUDF\"\000Bs\n\'com.dataomni" +
      "s.gproto.service.pbsvcspaceB\016PBSvcUDFMan" +
      "ageP\000Z6github.com/DataWorkbench/gproto/x" +
      "go/service/pbsvcspaceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor(),
          com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor();
    com.dataomnis.gproto.types.pbrequest.PBRequestUDFManage.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseUDFManage.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
