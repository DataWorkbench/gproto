// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/spacemanager/observable.proto

package com.dataomnis.gproto.service.pbsvcspace;

public final class PBSvcObservable {
  private PBSvcObservable() {}
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
      "\n+proto/service/spacemanager/observable." +
      "proto\022\014spacemanager\032$proto/types/request" +
      "/observable.proto\032%proto/types/response/" +
      "observable.proto2t\n\nObservable\022f\n\031Descri" +
      "beWorkspaceOverview\022\".request.DescribeWo" +
      "rkspaceOverview\032#.response.DescribeWorks" +
      "paceOverview\"\000Bt\n\'com.dataomnis.gproto.s" +
      "ervice.pbsvcspaceB\017PBSvcObservableP\000Z6gi" +
      "thub.com/DataWorkbench/gproto/xgo/servic" +
      "e/pbsvcspaceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbrequest.PBRequestObserver.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseObserver.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbrequest.PBRequestObserver.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseObserver.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
