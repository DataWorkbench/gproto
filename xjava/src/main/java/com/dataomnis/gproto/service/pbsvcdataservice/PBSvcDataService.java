// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/service/dataservice/dataservice.proto

package com.dataomnis.gproto.service.pbsvcdataservice;

public final class PBSvcDataService {
  private PBSvcDataService() {}
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
      "\n+proto/service/dataservice/dataservice." +
      "proto\022\013dataservice\032,proto/types/request/" +
      "dataservice_manage.proto\032-proto/types/re" +
      "sponse/dataservice_manage.proto\032\035proto/t" +
      "ypes/model/empty.proto\032#proto/types/mode" +
      "l/dataservice.proto2\322\020\n\013DataService\022c\n\030C" +
      "reateDataServiceCluster\022!.request.Create" +
      "DataServiceCluster\032\".response.CreateData" +
      "ServiceCluster\"\000\022`\n\027ListDataServiceClust" +
      "ers\022 .request.ListDataServiceClusters\032!." +
      "response.ListDataServiceClusters\"\000\022S\n\030Up" +
      "dateDataServiceCluster\022!.request.UpdateD" +
      "ataServiceCluster\032\022.model.EmptyStruct\"\000\022" +
      "i\n\032DescribeDataServiceCluster\022#.request." +
      "DescribeDataServiceCluster\032$.response.De" +
      "scribeDataServiceCluster\"\000\022U\n\031DeleteData" +
      "ServiceClusters\022\".request.DeleteDataServ" +
      "iceClusters\032\022.model.EmptyStruct\"\000\022S\n\030Sta" +
      "rtDataServiceClusters\022!.request.StartDat" +
      "aServiceClusters\032\022.model.EmptyStruct\"\000\022Q" +
      "\n\027StopDataServiceClusters\022 .request.Stop" +
      "DataServiceClusters\032\022.model.EmptyStruct\"" +
      "\000\022`\n\036DescribeServiceDataSourceKinds\022\022.mo" +
      "del.EmptyStruct\032(.response.DescribeServi" +
      "ceDataSourceKinds\"\000\022E\n\016CreateApiGroup\022\027." +
      "request.CreateApiGroup\032\030.response.Create" +
      "ApiGroup\"\000\022B\n\rListApiGroups\022\026.request.Li" +
      "stApiGroups\032\027.response.ListApiGroups\"\000\022A" +
      "\n\017DeleteApiGroups\022\030.request.DeleteApiGro" +
      "ups\032\022.model.EmptyStruct\"\000\022E\n\016ListApiConf" +
      "igs\022\027.request.ListApiConfigs\032\030.response." +
      "ListApiConfigs\"\000\022N\n\021DescribeApiConfig\022\032." +
      "request.DescribeApiConfig\032\033.response.Des" +
      "cribeApiConfig\"\000\022H\n\017CreateApiConfig\022\030.re" +
      "quest.CreateApiConfig\032\031.response.CreateA" +
      "piConfig\"\000\022A\n\017UpdateApiConfig\022\030.request." +
      "UpdateApiConfig\032\022.model.EmptyStruct\"\000\022C\n" +
      "\020DeleteApiConfigs\022\031.request.DeleteApiCon" +
      "figs\032\022.model.EmptyStruct\"\000\022Q\n\022TestDataSe" +
      "rviceApi\022\033.request.TestDataServiceApi\032\034." +
      "response.TestDataServiceApi\"\000\022M\n\025Publish" +
      "DataServiceApi\022\036.request.PublishDataServ" +
      "iceApi\032\022.model.EmptyStruct\"\000\022O\n\026AbolishD" +
      "ataServiceApis\022\037.request.AbolishDataServ" +
      "iceApis\032\022.model.EmptyStruct\"\000\022x\n\037Describ" +
      "ePublishedApiHttpDetails\022(.request.Descr" +
      "ibePublishedApiHttpDetails\032).response.De" +
      "scribePublishedApiHttpDetails\"\000\022i\n\032ListD" +
      "ataServiceApiVersions\022#.request.ListData" +
      "ServiceApiVersions\032$.response.ListDataSe" +
      "rviceApiVersions\"\000\022r\n\035DescribeDataServic" +
      "eApiVersion\022&.request.DescribeDataServic" +
      "eApiVersion\032\'.response.DescribeDataServi" +
      "ceApiVersion\"\000\022Q\n\027RepublishDataServiceAp" +
      "i\022 .request.RepublishDataServiceApi\032\022.mo" +
      "del.EmptyStruct\"\000\022\204\001\n#ListPublishedApiVe" +
      "rsionsByClusterId\022,.request.ListPublishe" +
      "dApiVersionsByClusterId\032-.response.ListP" +
      "ublishedApiVersionsByClusterId\"\000B\201\001\n-com" +
      ".dataomnis.gproto.service.pbsvcdataservi" +
      "ceB\020PBSvcDataServiceP\000Z<github.com/DataW" +
      "orkbench/gproto/xgo/service/pbsvcdataser" +
      "viceb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.getDescriptor(),
          com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.getDescriptor(),
          com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor(),
          com.dataomnis.gproto.types.pbmodel.PBModelDataService.getDescriptor(),
        });
    com.dataomnis.gproto.types.pbrequest.PBRequestDataServiceManage.getDescriptor();
    com.dataomnis.gproto.types.pbresponse.PBResponseDataServiceManage.getDescriptor();
    com.dataomnis.gproto.types.pbmodel.PBModelEmpty.getDescriptor();
    com.dataomnis.gproto.types.pbmodel.PBModelDataService.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
