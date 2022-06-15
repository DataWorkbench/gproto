// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/account/account.proto

package com.dataomnis.gproto.service.pbsvcaccount;

public final class PBSvcAccount {
  private PBSvcAccount() {}
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
      "\n#proto/service/account/account.proto\022\007a" +
      "ccount\032!proto/types/request/account.prot" +
      "o\032\"proto/types/response/account.proto2\343\006" +
      "\n\007Account\022B\n\rDescribeUsers\022\026.request.Des" +
      "cribeUsers\032\027.response.DescribeUsers\"\000\022N\n" +
      "\021DescribeAccessKey\022\032.request.DescribeAcc" +
      "essKey\032\033.response.DescribeAccessKey\"\000\0229\n" +
      "\nCreateUser\022\023.request.CreateUser\032\024.respo" +
      "nse.CreateUser\"\000\0229\n\nUpdateUser\022\023.request" +
      ".UpdateUser\032\024.response.UpdateUser\"\000\0229\n\nD" +
      "eleteUser\022\023.request.DeleteUser\032\024.respons" +
      "e.DeleteUser\"\000\022?\n\014CheckSession\022\025.request" +
      ".CheckSession\032\026.response.CheckSession\"\000\022" +
      "B\n\rCreateSession\022\026.request.CreateSession" +
      "\032\027.response.CreateSession\"\000\022H\n\017CheckUser" +
      "Exists\022\030.request.CheckUserExists\032\031.respo" +
      "nse.CheckUserExists\"\000\022Q\n\022CreateNotificat" +
      "ion\022\033.request.CreateNotification\032\034.respo" +
      "nse.CreateNotification\"\000\022Q\n\022UpdateNotifi" +
      "cation\022\033.request.UpdateNotification\032\034.re" +
      "sponse.UpdateNotification\"\000\022Q\n\022DeleteNot" +
      "ification\022\033.request.DeleteNotification\032\034" +
      ".response.DeleteNotification\"\000\022K\n\020GetNot" +
      "ifications\022\031.request.GetNotifications\032\032." +
      "response.GetNotifications\"\000Bu\n)com.datao" +
      "mnis.gproto.service.pbsvcaccountB\014PBSvcA" +
      "ccountP\000Z8github.com/DataWorkbench/gprot" +
      "o/xgo/service/pbsvcaccountb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbrequest.PBRequestAccount.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseAccount.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbrequest.PBRequestAccount.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseAccount.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
