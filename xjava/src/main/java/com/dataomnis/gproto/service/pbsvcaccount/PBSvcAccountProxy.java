// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/account/account_proxy.proto

package com.dataomnis.gproto.service.pbsvcaccount;

public final class PBSvcAccountProxy {
  private PBSvcAccountProxy() {}
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
      "\n)proto/service/account/account_proxy.pr" +
      "oto\022\007account\032\'proto/types/request/accoun" +
      "t_proxy.proto\032(proto/types/response/acco" +
      "unt_proxy.proto2\245\002\n\014AccountProxy\022K\n\020List" +
      "UsersByProxy\022\031.request.ListUsersByProxy\032" +
      "\032.response.ListUsersByProxy\"\000\022c\n\030Describ" +
      "eAccessKeyByProxy\022!.request.DescribeAcce" +
      "ssKeyByProxy\032\".response.DescribeAccessKe" +
      "yByProxy\"\000\022c\n\030ListNotificationsByProxy\022!" +
      ".request.ListNotificationsByProxy\032\".resp" +
      "onse.ListNotificationsByProxy\"\000Bz\n)com.d" +
      "ataomnis.gproto.service.pbsvcaccountB\021PB" +
      "SvcAccountProxyP\000Z8github.com/DataWorkbe" +
      "nch/gproto/xgo/service/pbsvcaccountb\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbrequest.PBRequestAccountProxy.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseAccountProxy.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
