// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/developer/developer.proto

package com.dataomnis.gproto.service.pbsvcdeveloper;

public final class PBSvcDeveloper {
  private PBSvcDeveloper() {}
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
      "\n\'proto/service/developer/developer.prot" +
      "o\022\tdeveloper\032\035proto/types/model/empty.pr" +
      "oto\032#proto/types/request/developer.proto" +
      "\032$proto/types/response/developer.proto2\263" +
      "\002\n\tDeveloper\022K\n\016SubmitFlinkJob\022\032.request" +
      ".SubmitFlinkJob_v2\032\033.response.SubmitFlin" +
      "kJob_v2\"\000\022B\n\013GetFlinkJob\022\027.request.GetFl" +
      "inkJob_v2\032\030.response.GetFlinkJob_v2\"\000\022B\n" +
      "\016CancelFlinkJob\022\032.request.CancelFlinkJob" +
      "_v2\032\022.model.EmptyStruct\"\000\022Q\n\020ValidateFli" +
      "nkJob\022\034.request.ValidateFlinkJob_v2\032\035.re" +
      "sponse.ValidateFlinkJob_v2\"\000B{\n+com.data" +
      "omnis.gproto.service.pbsvcdeveloperB\016PBS" +
      "vcDeveloperP\000Z:github.com/DataWorkbench/" +
      "gproto/xgo/service/pbsvcdeveloperb\006proto" +
      "3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor(),
          com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor();
    com.dataomnis.gproto.types.pbrequest.PBRequestDeveloper.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseDeveloper.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
