package com.dataomnis.gproto.service.pbsvcapidashboard;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.43.2)",
    comments = "Source: proto/service/apidashboard/apidashboard.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ApiDashboardGrpc {

  private ApiDashboardGrpc() {}

  public static final String SERVICE_NAME = "apidashboard.ApiDashboard";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute> getCreateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRoute",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute> getCreateRouteMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute> getCreateRouteMethod;
    if ((getCreateRouteMethod = ApiDashboardGrpc.getCreateRouteMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getCreateRouteMethod = ApiDashboardGrpc.getCreateRouteMethod) == null) {
          ApiDashboardGrpc.getCreateRouteMethod = getCreateRouteMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("CreateRoute"))
              .build();
        }
      }
    }
    return getCreateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRoute",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteRouteMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteRouteMethod;
    if ((getDeleteRouteMethod = ApiDashboardGrpc.getDeleteRouteMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getDeleteRouteMethod = ApiDashboardGrpc.getDeleteRouteMethod) == null) {
          ApiDashboardGrpc.getDeleteRouteMethod = getDeleteRouteMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("DeleteRoute"))
              .build();
        }
      }
    }
    return getDeleteRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes> getListRoutesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListRoutes",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes> getListRoutesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes> getListRoutesMethod;
    if ((getListRoutesMethod = ApiDashboardGrpc.getListRoutesMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getListRoutesMethod = ApiDashboardGrpc.getListRoutesMethod) == null) {
          ApiDashboardGrpc.getListRoutesMethod = getListRoutesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListRoutes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("ListRoutes"))
              .build();
        }
      }
    }
    return getListRoutesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateRouteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateRoute",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateRouteMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateRouteMethod;
    if ((getUpdateRouteMethod = ApiDashboardGrpc.getUpdateRouteMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getUpdateRouteMethod = ApiDashboardGrpc.getUpdateRouteMethod) == null) {
          ApiDashboardGrpc.getUpdateRouteMethod = getUpdateRouteMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateRoute"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("UpdateRoute"))
              .build();
        }
      }
    }
    return getUpdateRouteMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream> getCreateUpstreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateUpstream",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream> getCreateUpstreamMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream> getCreateUpstreamMethod;
    if ((getCreateUpstreamMethod = ApiDashboardGrpc.getCreateUpstreamMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getCreateUpstreamMethod = ApiDashboardGrpc.getCreateUpstreamMethod) == null) {
          ApiDashboardGrpc.getCreateUpstreamMethod = getCreateUpstreamMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateUpstream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("CreateUpstream"))
              .build();
        }
      }
    }
    return getCreateUpstreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUpstreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteUpstream",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUpstreamMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteUpstreamMethod;
    if ((getDeleteUpstreamMethod = ApiDashboardGrpc.getDeleteUpstreamMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getDeleteUpstreamMethod = ApiDashboardGrpc.getDeleteUpstreamMethod) == null) {
          ApiDashboardGrpc.getDeleteUpstreamMethod = getDeleteUpstreamMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteUpstream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("DeleteUpstream"))
              .build();
        }
      }
    }
    return getDeleteUpstreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUpstreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateUpstream",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUpstreamMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateUpstreamMethod;
    if ((getUpdateUpstreamMethod = ApiDashboardGrpc.getUpdateUpstreamMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getUpdateUpstreamMethod = ApiDashboardGrpc.getUpdateUpstreamMethod) == null) {
          ApiDashboardGrpc.getUpdateUpstreamMethod = getUpdateUpstreamMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateUpstream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("UpdateUpstream"))
              .build();
        }
      }
    }
    return getUpdateUpstreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams> getListUpstreamsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListUpstreams",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams> getListUpstreamsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams> getListUpstreamsMethod;
    if ((getListUpstreamsMethod = ApiDashboardGrpc.getListUpstreamsMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getListUpstreamsMethod = ApiDashboardGrpc.getListUpstreamsMethod) == null) {
          ApiDashboardGrpc.getListUpstreamsMethod = getListUpstreamsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListUpstreams"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("ListUpstreams"))
              .build();
        }
      }
    }
    return getListUpstreamsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL> getCreateSSLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSSL",
      requestType = com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL> getCreateSSLMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL> getCreateSSLMethod;
    if ((getCreateSSLMethod = ApiDashboardGrpc.getCreateSSLMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getCreateSSLMethod = ApiDashboardGrpc.getCreateSSLMethod) == null) {
          ApiDashboardGrpc.getCreateSSLMethod = getCreateSSLMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSSL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("CreateSSL"))
              .build();
        }
      }
    }
    return getCreateSSLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSSLMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteSSL",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSSLMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteSSLMethod;
    if ((getDeleteSSLMethod = ApiDashboardGrpc.getDeleteSSLMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getDeleteSSLMethod = ApiDashboardGrpc.getDeleteSSLMethod) == null) {
          ApiDashboardGrpc.getDeleteSSLMethod = getDeleteSSLMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteSSL"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("DeleteSSL"))
              .build();
        }
      }
    }
    return getDeleteSSLMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs> getListSSLsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListSSLs",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs> getListSSLsMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs> getListSSLsMethod;
    if ((getListSSLsMethod = ApiDashboardGrpc.getListSSLsMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getListSSLsMethod = ApiDashboardGrpc.getListSSLsMethod) == null) {
          ApiDashboardGrpc.getListSSLsMethod = getListSSLsMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListSSLs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("ListSSLs"))
              .build();
        }
      }
    }
    return getListSSLsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService> getCreateApiServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateApiService",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService> getCreateApiServiceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService> getCreateApiServiceMethod;
    if ((getCreateApiServiceMethod = ApiDashboardGrpc.getCreateApiServiceMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getCreateApiServiceMethod = ApiDashboardGrpc.getCreateApiServiceMethod) == null) {
          ApiDashboardGrpc.getCreateApiServiceMethod = getCreateApiServiceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateApiService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("CreateApiService"))
              .build();
        }
      }
    }
    return getCreateApiServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteApiService",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiServiceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteApiServiceMethod;
    if ((getDeleteApiServiceMethod = ApiDashboardGrpc.getDeleteApiServiceMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getDeleteApiServiceMethod = ApiDashboardGrpc.getDeleteApiServiceMethod) == null) {
          ApiDashboardGrpc.getDeleteApiServiceMethod = getDeleteApiServiceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteApiService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("DeleteApiService"))
              .build();
        }
      }
    }
    return getDeleteApiServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateApiServiceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateApiService",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateApiServiceMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateApiServiceMethod;
    if ((getUpdateApiServiceMethod = ApiDashboardGrpc.getUpdateApiServiceMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getUpdateApiServiceMethod = ApiDashboardGrpc.getUpdateApiServiceMethod) == null) {
          ApiDashboardGrpc.getUpdateApiServiceMethod = getUpdateApiServiceMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateApiService"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("UpdateApiService"))
              .build();
        }
      }
    }
    return getUpdateApiServiceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices> getListApiServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListApiServices",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices> getListApiServicesMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices> getListApiServicesMethod;
    if ((getListApiServicesMethod = ApiDashboardGrpc.getListApiServicesMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getListApiServicesMethod = ApiDashboardGrpc.getListApiServicesMethod) == null) {
          ApiDashboardGrpc.getListApiServicesMethod = getListApiServicesMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListApiServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("ListApiServices"))
              .build();
        }
      }
    }
    return getListApiServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddSvcReqCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "AddSvcReqCount",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddSvcReqCountMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getAddSvcReqCountMethod;
    if ((getAddSvcReqCountMethod = ApiDashboardGrpc.getAddSvcReqCountMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getAddSvcReqCountMethod = ApiDashboardGrpc.getAddSvcReqCountMethod) == null) {
          ApiDashboardGrpc.getAddSvcReqCountMethod = getAddSvcReqCountMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "AddSvcReqCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("AddSvcReqCount"))
              .build();
        }
      }
    }
    return getAddSvcReqCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount> getGetSvcReqCountMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetSvcReqCount",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount> getGetSvcReqCountMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount> getGetSvcReqCountMethod;
    if ((getGetSvcReqCountMethod = ApiDashboardGrpc.getGetSvcReqCountMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getGetSvcReqCountMethod = ApiDashboardGrpc.getGetSvcReqCountMethod) == null) {
          ApiDashboardGrpc.getGetSvcReqCountMethod = getGetSvcReqCountMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetSvcReqCount"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("GetSvcReqCount"))
              .build();
        }
      }
    }
    return getGetSvcReqCountMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey> getCreateAuthKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateAuthKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey> getCreateAuthKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey> getCreateAuthKeyMethod;
    if ((getCreateAuthKeyMethod = ApiDashboardGrpc.getCreateAuthKeyMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getCreateAuthKeyMethod = ApiDashboardGrpc.getCreateAuthKeyMethod) == null) {
          ApiDashboardGrpc.getCreateAuthKeyMethod = getCreateAuthKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateAuthKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("CreateAuthKey"))
              .build();
        }
      }
    }
    return getCreateAuthKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAuthKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteAuthKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAuthKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getDeleteAuthKeyMethod;
    if ((getDeleteAuthKeyMethod = ApiDashboardGrpc.getDeleteAuthKeyMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getDeleteAuthKeyMethod = ApiDashboardGrpc.getDeleteAuthKeyMethod) == null) {
          ApiDashboardGrpc.getDeleteAuthKeyMethod = getDeleteAuthKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteAuthKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("DeleteAuthKey"))
              .build();
        }
      }
    }
    return getDeleteAuthKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateAuthKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateAuthKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateAuthKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUpdateAuthKeyMethod;
    if ((getUpdateAuthKeyMethod = ApiDashboardGrpc.getUpdateAuthKeyMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getUpdateAuthKeyMethod = ApiDashboardGrpc.getUpdateAuthKeyMethod) == null) {
          ApiDashboardGrpc.getUpdateAuthKeyMethod = getUpdateAuthKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UpdateAuthKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("UpdateAuthKey"))
              .build();
        }
      }
    }
    return getUpdateAuthKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys> getListAuthKeysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListAuthKeys",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys.class,
      responseType = com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys,
      com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys> getListAuthKeysMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys> getListAuthKeysMethod;
    if ((getListAuthKeysMethod = ApiDashboardGrpc.getListAuthKeysMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getListAuthKeysMethod = ApiDashboardGrpc.getListAuthKeysMethod) == null) {
          ApiDashboardGrpc.getListAuthKeysMethod = getListAuthKeysMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys, com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListAuthKeys"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("ListAuthKeys"))
              .build();
        }
      }
    }
    return getListAuthKeysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getBindAuthKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BindAuthKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getBindAuthKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getBindAuthKeyMethod;
    if ((getBindAuthKeyMethod = ApiDashboardGrpc.getBindAuthKeyMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getBindAuthKeyMethod = ApiDashboardGrpc.getBindAuthKeyMethod) == null) {
          ApiDashboardGrpc.getBindAuthKeyMethod = getBindAuthKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BindAuthKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("BindAuthKey"))
              .build();
        }
      }
    }
    return getBindAuthKeyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUnbindAuthKeyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnbindAuthKey",
      requestType = com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey.class,
      responseType = com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey,
      com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUnbindAuthKeyMethod() {
    io.grpc.MethodDescriptor<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> getUnbindAuthKeyMethod;
    if ((getUnbindAuthKeyMethod = ApiDashboardGrpc.getUnbindAuthKeyMethod) == null) {
      synchronized (ApiDashboardGrpc.class) {
        if ((getUnbindAuthKeyMethod = ApiDashboardGrpc.getUnbindAuthKeyMethod) == null) {
          ApiDashboardGrpc.getUnbindAuthKeyMethod = getUnbindAuthKeyMethod =
              io.grpc.MethodDescriptor.<com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey, com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnbindAuthKey"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct.getDefaultInstance()))
              .setSchemaDescriptor(new ApiDashboardMethodDescriptorSupplier("UnbindAuthKey"))
              .build();
        }
      }
    }
    return getUnbindAuthKeyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ApiDashboardStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiDashboardStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiDashboardStub>() {
        @java.lang.Override
        public ApiDashboardStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiDashboardStub(channel, callOptions);
        }
      };
    return ApiDashboardStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ApiDashboardBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiDashboardBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiDashboardBlockingStub>() {
        @java.lang.Override
        public ApiDashboardBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiDashboardBlockingStub(channel, callOptions);
        }
      };
    return ApiDashboardBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ApiDashboardFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ApiDashboardFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ApiDashboardFutureStub>() {
        @java.lang.Override
        public ApiDashboardFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ApiDashboardFutureStub(channel, callOptions);
        }
      };
    return ApiDashboardFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ApiDashboardImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRoute(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRouteMethod(), responseObserver);
    }

    /**
     */
    public void deleteRoute(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRouteMethod(), responseObserver);
    }

    /**
     */
    public void listRoutes(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListRoutesMethod(), responseObserver);
    }

    /**
     */
    public void updateRoute(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateRouteMethod(), responseObserver);
    }

    /**
     */
    public void createUpstream(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUpstreamMethod(), responseObserver);
    }

    /**
     */
    public void deleteUpstream(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteUpstreamMethod(), responseObserver);
    }

    /**
     */
    public void updateUpstream(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateUpstreamMethod(), responseObserver);
    }

    /**
     */
    public void listUpstreams(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListUpstreamsMethod(), responseObserver);
    }

    /**
     */
    public void createSSL(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSSLMethod(), responseObserver);
    }

    /**
     */
    public void deleteSSL(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteSSLMethod(), responseObserver);
    }

    /**
     */
    public void listSSLs(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListSSLsMethod(), responseObserver);
    }

    /**
     */
    public void createApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateApiServiceMethod(), responseObserver);
    }

    /**
     */
    public void deleteApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteApiServiceMethod(), responseObserver);
    }

    /**
     */
    public void updateApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateApiServiceMethod(), responseObserver);
    }

    /**
     */
    public void listApiServices(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListApiServicesMethod(), responseObserver);
    }

    /**
     */
    public void addSvcReqCount(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddSvcReqCountMethod(), responseObserver);
    }

    /**
     */
    public void getSvcReqCount(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetSvcReqCountMethod(), responseObserver);
    }

    /**
     */
    public void createAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateAuthKeyMethod(), responseObserver);
    }

    /**
     */
    public void deleteAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteAuthKeyMethod(), responseObserver);
    }

    /**
     */
    public void updateAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUpdateAuthKeyMethod(), responseObserver);
    }

    /**
     */
    public void listAuthKeys(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAuthKeysMethod(), responseObserver);
    }

    /**
     */
    public void bindAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBindAuthKeyMethod(), responseObserver);
    }

    /**
     */
    public void unbindAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnbindAuthKeyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute>(
                  this, METHODID_CREATE_ROUTE)))
          .addMethod(
            getDeleteRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_ROUTE)))
          .addMethod(
            getListRoutesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes>(
                  this, METHODID_LIST_ROUTES)))
          .addMethod(
            getUpdateRouteMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_ROUTE)))
          .addMethod(
            getCreateUpstreamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream>(
                  this, METHODID_CREATE_UPSTREAM)))
          .addMethod(
            getDeleteUpstreamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_UPSTREAM)))
          .addMethod(
            getUpdateUpstreamMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_UPSTREAM)))
          .addMethod(
            getListUpstreamsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams>(
                  this, METHODID_LIST_UPSTREAMS)))
          .addMethod(
            getCreateSSLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL>(
                  this, METHODID_CREATE_SSL)))
          .addMethod(
            getDeleteSSLMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_SSL)))
          .addMethod(
            getListSSLsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs>(
                  this, METHODID_LIST_SSLS)))
          .addMethod(
            getCreateApiServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService>(
                  this, METHODID_CREATE_API_SERVICE)))
          .addMethod(
            getDeleteApiServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_API_SERVICE)))
          .addMethod(
            getUpdateApiServiceMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_API_SERVICE)))
          .addMethod(
            getListApiServicesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices>(
                  this, METHODID_LIST_API_SERVICES)))
          .addMethod(
            getAddSvcReqCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_ADD_SVC_REQ_COUNT)))
          .addMethod(
            getGetSvcReqCountMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount>(
                  this, METHODID_GET_SVC_REQ_COUNT)))
          .addMethod(
            getCreateAuthKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey>(
                  this, METHODID_CREATE_AUTH_KEY)))
          .addMethod(
            getDeleteAuthKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_DELETE_AUTH_KEY)))
          .addMethod(
            getUpdateAuthKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UPDATE_AUTH_KEY)))
          .addMethod(
            getListAuthKeysMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys,
                com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys>(
                  this, METHODID_LIST_AUTH_KEYS)))
          .addMethod(
            getBindAuthKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_BIND_AUTH_KEY)))
          .addMethod(
            getUnbindAuthKeyMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey,
                com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>(
                  this, METHODID_UNBIND_AUTH_KEY)))
          .build();
    }
  }

  /**
   */
  public static final class ApiDashboardStub extends io.grpc.stub.AbstractAsyncStub<ApiDashboardStub> {
    private ApiDashboardStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiDashboardStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiDashboardStub(channel, callOptions);
    }

    /**
     */
    public void createRoute(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRoute(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listRoutes(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateRoute(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createUpstream(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUpstreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteUpstream(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteUpstreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateUpstream(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateUpstreamMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listUpstreams(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListUpstreamsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSSL(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSSLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteSSL(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteSSLMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listSSLs(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListSSLsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateApiServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteApiServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateApiServiceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listApiServices(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListApiServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addSvcReqCount(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddSvcReqCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getSvcReqCount(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetSvcReqCountMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateAuthKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteAuthKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void updateAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUpdateAuthKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAuthKeys(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAuthKeysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bindAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBindAuthKeyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void unbindAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey request,
        io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnbindAuthKeyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ApiDashboardBlockingStub extends io.grpc.stub.AbstractBlockingStub<ApiDashboardBlockingStub> {
    private ApiDashboardBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiDashboardBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiDashboardBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute createRoute(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteRoute(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes listRoutes(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListRoutesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateRoute(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateRouteMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream createUpstream(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUpstreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteUpstream(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteUpstreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateUpstream(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateUpstreamMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams listUpstreams(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListUpstreamsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL createSSL(com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSSLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteSSL(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteSSLMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs listSSLs(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListSSLsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService createApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateApiServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteApiServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateApiService(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateApiServiceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices listApiServices(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListApiServicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct addSvcReqCount(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddSvcReqCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount getSvcReqCount(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetSvcReqCountMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey createAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateAuthKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct deleteAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteAuthKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct updateAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUpdateAuthKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys listAuthKeys(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAuthKeysMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct bindAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBindAuthKeyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct unbindAuthKey(com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUnbindAuthKeyMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ApiDashboardFutureStub extends io.grpc.stub.AbstractFutureStub<ApiDashboardFutureStub> {
    private ApiDashboardFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ApiDashboardFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ApiDashboardFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute> createRoute(
        com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteRoute(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes> listRoutes(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListRoutesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateRoute(
        com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateRouteMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream> createUpstream(
        com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUpstreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteUpstream(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteUpstreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateUpstream(
        com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateUpstreamMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams> listUpstreams(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListUpstreamsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL> createSSL(
        com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSSLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteSSL(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteSSLMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs> listSSLs(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListSSLsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService> createApiService(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateApiServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteApiService(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteApiServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateApiService(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateApiServiceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices> listApiServices(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListApiServicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> addSvcReqCount(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddSvcReqCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount> getSvcReqCount(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetSvcReqCountMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey> createAuthKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateAuthKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> deleteAuthKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteAuthKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> updateAuthKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUpdateAuthKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys> listAuthKeys(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAuthKeysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> bindAuthKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBindAuthKeyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct> unbindAuthKey(
        com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUnbindAuthKeyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_ROUTE = 0;
  private static final int METHODID_DELETE_ROUTE = 1;
  private static final int METHODID_LIST_ROUTES = 2;
  private static final int METHODID_UPDATE_ROUTE = 3;
  private static final int METHODID_CREATE_UPSTREAM = 4;
  private static final int METHODID_DELETE_UPSTREAM = 5;
  private static final int METHODID_UPDATE_UPSTREAM = 6;
  private static final int METHODID_LIST_UPSTREAMS = 7;
  private static final int METHODID_CREATE_SSL = 8;
  private static final int METHODID_DELETE_SSL = 9;
  private static final int METHODID_LIST_SSLS = 10;
  private static final int METHODID_CREATE_API_SERVICE = 11;
  private static final int METHODID_DELETE_API_SERVICE = 12;
  private static final int METHODID_UPDATE_API_SERVICE = 13;
  private static final int METHODID_LIST_API_SERVICES = 14;
  private static final int METHODID_ADD_SVC_REQ_COUNT = 15;
  private static final int METHODID_GET_SVC_REQ_COUNT = 16;
  private static final int METHODID_CREATE_AUTH_KEY = 17;
  private static final int METHODID_DELETE_AUTH_KEY = 18;
  private static final int METHODID_UPDATE_AUTH_KEY = 19;
  private static final int METHODID_LIST_AUTH_KEYS = 20;
  private static final int METHODID_BIND_AUTH_KEY = 21;
  private static final int METHODID_UNBIND_AUTH_KEY = 22;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ApiDashboardImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ApiDashboardImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_ROUTE:
          serviceImpl.createRoute((com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateRoute>) responseObserver);
          break;
        case METHODID_DELETE_ROUTE:
          serviceImpl.deleteRoute((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteRoute) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_ROUTES:
          serviceImpl.listRoutes((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListRoutes) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListRoutes>) responseObserver);
          break;
        case METHODID_UPDATE_ROUTE:
          serviceImpl.updateRoute((com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Route) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_CREATE_UPSTREAM:
          serviceImpl.createUpstream((com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateUpstream>) responseObserver);
          break;
        case METHODID_DELETE_UPSTREAM:
          serviceImpl.deleteUpstream((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteUpstream) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE_UPSTREAM:
          serviceImpl.updateUpstream((com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.Upstream) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_UPSTREAMS:
          serviceImpl.listUpstreams((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListUpstreams) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListUpstreams>) responseObserver);
          break;
        case METHODID_CREATE_SSL:
          serviceImpl.createSSL((com.dataomnis.gproto.types.pbmodel.PBModelApiDashboard.SSL) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateSSL>) responseObserver);
          break;
        case METHODID_DELETE_SSL:
          serviceImpl.deleteSSL((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteSSL) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_SSLS:
          serviceImpl.listSSLs((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListSSLs) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListSSLs>) responseObserver);
          break;
        case METHODID_CREATE_API_SERVICE:
          serviceImpl.createApiService((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateApiService) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateApiService>) responseObserver);
          break;
        case METHODID_DELETE_API_SERVICE:
          serviceImpl.deleteApiService((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteApiService) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE_API_SERVICE:
          serviceImpl.updateApiService((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateApiService) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_API_SERVICES:
          serviceImpl.listApiServices((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListApiServices) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListApiServices>) responseObserver);
          break;
        case METHODID_ADD_SVC_REQ_COUNT:
          serviceImpl.addSvcReqCount((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.AddSvcReqCount) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_GET_SVC_REQ_COUNT:
          serviceImpl.getSvcReqCount((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.GetSvcReqCount) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.GetSvcReqCount>) responseObserver);
          break;
        case METHODID_CREATE_AUTH_KEY:
          serviceImpl.createAuthKey((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.CreateAuthKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.CreateAuthKey>) responseObserver);
          break;
        case METHODID_DELETE_AUTH_KEY:
          serviceImpl.deleteAuthKey((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.DeleteAuthKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UPDATE_AUTH_KEY:
          serviceImpl.updateAuthKey((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UpdateAuthKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_LIST_AUTH_KEYS:
          serviceImpl.listAuthKeys((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.ListAuthKeys) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbresponse.PBResponseApiDashboard.ListAuthKeys>) responseObserver);
          break;
        case METHODID_BIND_AUTH_KEY:
          serviceImpl.bindAuthKey((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.BindAuthKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        case METHODID_UNBIND_AUTH_KEY:
          serviceImpl.unbindAuthKey((com.dataomnis.gproto.types.pbrequest.PBRequestApiDashboard.UnbindAuthKey) request,
              (io.grpc.stub.StreamObserver<com.dataomnis.gproto.types.pbmodel.PBModelEmpty.EmptyStruct>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ApiDashboardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ApiDashboardBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.dataomnis.gproto.service.pbsvcapidashboard.PBSvcApiDashboard.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ApiDashboard");
    }
  }

  private static final class ApiDashboardFileDescriptorSupplier
      extends ApiDashboardBaseDescriptorSupplier {
    ApiDashboardFileDescriptorSupplier() {}
  }

  private static final class ApiDashboardMethodDescriptorSupplier
      extends ApiDashboardBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ApiDashboardMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ApiDashboardGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ApiDashboardFileDescriptorSupplier())
              .addMethod(getCreateRouteMethod())
              .addMethod(getDeleteRouteMethod())
              .addMethod(getListRoutesMethod())
              .addMethod(getUpdateRouteMethod())
              .addMethod(getCreateUpstreamMethod())
              .addMethod(getDeleteUpstreamMethod())
              .addMethod(getUpdateUpstreamMethod())
              .addMethod(getListUpstreamsMethod())
              .addMethod(getCreateSSLMethod())
              .addMethod(getDeleteSSLMethod())
              .addMethod(getListSSLsMethod())
              .addMethod(getCreateApiServiceMethod())
              .addMethod(getDeleteApiServiceMethod())
              .addMethod(getUpdateApiServiceMethod())
              .addMethod(getListApiServicesMethod())
              .addMethod(getAddSvcReqCountMethod())
              .addMethod(getGetSvcReqCountMethod())
              .addMethod(getCreateAuthKeyMethod())
              .addMethod(getDeleteAuthKeyMethod())
              .addMethod(getUpdateAuthKeyMethod())
              .addMethod(getListAuthKeysMethod())
              .addMethod(getBindAuthKeyMethod())
              .addMethod(getUnbindAuthKeyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
