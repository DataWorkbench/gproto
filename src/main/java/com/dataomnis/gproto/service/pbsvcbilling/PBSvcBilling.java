// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/billing/billing.proto

package com.dataomnis.gproto.service.pbsvcbilling;

public final class PBSvcBilling {
  private PBSvcBilling() {}
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
      "\n#proto/service/billing/billing.proto\022\007b" +
      "illing\032\035proto/types/model/empty.proto\032!p" +
      "roto/types/request/billing.proto\032\"proto/" +
      "types/response/billing.proto2\356\002\n\007Billing" +
      "\022O\n\031GetBillingPriceComponents\022\022.model.Em" +
      "ptyStruct\032\034.response.GetPriceComponents\"" +
      "\000\022Z\n\025CreateBillingInstance\022\036.request.Cre" +
      "ateBillingInstance\032\037.response.CreateBill" +
      "ingInstance\"\000\022T\n\023StopBillingInstance\022\034.r" +
      "equest.StopBillingInstance\032\035.response.St" +
      "opBillingInstance\"\000\022`\n\027RecoveryBillingIn" +
      "stance\022 .request.RecoveryBillingInstance" +
      "\032!.response.RecoveryBillingInstance\"\000Bu\n" +
      ")com.dataomnis.gproto.service.pbsvcbilli" +
      "ngB\014PBSvcBillingP\000Z8github.com/DataWorkb" +
      "ench/gproto/pkg/service/pbsvcbillingb\006pr" +
      "oto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor(),
          com.dataomnis.gproto.types.pbrequest.PBRequestBilling.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseBilling.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor();
    com.dataomnis.gproto.types.pbrequest.PBRequestBilling.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseBilling.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
