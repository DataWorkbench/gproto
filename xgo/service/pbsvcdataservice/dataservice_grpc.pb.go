// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.3
// source: proto/service/dataservice/dataservice.proto

package pbsvcdataservice

import (
	context "context"
	pbmodel "github.com/DataWorkbench/gproto/xgo/types/pbmodel"
	pbrequest "github.com/DataWorkbench/gproto/xgo/types/pbrequest"
	pbresponse "github.com/DataWorkbench/gproto/xgo/types/pbresponse"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// DataServiceClient is the client API for DataService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type DataServiceClient interface {
	CreateDataServiceCluster(ctx context.Context, in *pbrequest.CreateDataServiceCluster, opts ...grpc.CallOption) (*pbresponse.CreateDataServiceCluster, error)
	ListDataServiceClusters(ctx context.Context, in *pbrequest.ListDataServiceClusters, opts ...grpc.CallOption) (*pbresponse.ListDataServiceClusters, error)
	UpdateDataServiceCluster(ctx context.Context, in *pbrequest.UpdateDataServiceCluster, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DescribeDataServiceCluster(ctx context.Context, in *pbrequest.DescribeDataServiceCluster, opts ...grpc.CallOption) (*pbmodel.DataServiceCluster, error)
	DeleteDataServiceClusters(ctx context.Context, in *pbrequest.DeleteDataServiceClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	CreateApiGroup(ctx context.Context, in *pbrequest.CreateApiGroup, opts ...grpc.CallOption) (*pbresponse.CreateApiGroup, error)
	ListApiGroups(ctx context.Context, in *pbrequest.ListApiGroups, opts ...grpc.CallOption) (*pbresponse.ListApiGroups, error)
	DeleteApiGroups(ctx context.Context, in *pbrequest.DeleteApiGroups, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	CreateDataServiceApi(ctx context.Context, in *pbrequest.CreateCustomerApi, opts ...grpc.CallOption) (*pbresponse.CreateCustomerApi, error)
	UpdateDataServiceApi(ctx context.Context, in *pbrequest.UpdateCustomerApi, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DescribeDataServiceApi(ctx context.Context, in *pbrequest.DescribeCustomerApi, opts ...grpc.CallOption) (*pbresponse.DescribeCustomerApi, error)
	ListDataServiceApis(ctx context.Context, in *pbrequest.ListCustomerApis, opts ...grpc.CallOption) (*pbresponse.ListCustomerApis, error)
	DeleteDataServiceApis(ctx context.Context, in *pbrequest.DeleteCustomerApis, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	TestDataServiceApi(ctx context.Context, in *pbrequest.TestCustomerApi, opts ...grpc.CallOption) (*pbresponse.TestCustomerApi, error)
	PublishDataServiceApi(ctx context.Context, in *pbrequest.PublishCustomerApi, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	ListDataServiceApiVersions(ctx context.Context, in *pbrequest.ListApiVersions, opts ...grpc.CallOption) (*pbresponse.ListApiVersions, error)
	DescribeDataServiceApiVersion(ctx context.Context, in *pbrequest.DescribeApiVersion, opts ...grpc.CallOption) (*pbresponse.DescribeApiVersion, error)
	RepublishDataServiceApi(ctx context.Context, in *pbrequest.DescribeApiVersion, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	AbolishDataServiceApi(ctx context.Context, in *pbrequest.PublishCustomerApi, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
}

type dataServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewDataServiceClient(cc grpc.ClientConnInterface) DataServiceClient {
	return &dataServiceClient{cc}
}

func (c *dataServiceClient) CreateDataServiceCluster(ctx context.Context, in *pbrequest.CreateDataServiceCluster, opts ...grpc.CallOption) (*pbresponse.CreateDataServiceCluster, error) {
	out := new(pbresponse.CreateDataServiceCluster)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/CreateDataServiceCluster", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) ListDataServiceClusters(ctx context.Context, in *pbrequest.ListDataServiceClusters, opts ...grpc.CallOption) (*pbresponse.ListDataServiceClusters, error) {
	out := new(pbresponse.ListDataServiceClusters)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/ListDataServiceClusters", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) UpdateDataServiceCluster(ctx context.Context, in *pbrequest.UpdateDataServiceCluster, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/UpdateDataServiceCluster", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) DescribeDataServiceCluster(ctx context.Context, in *pbrequest.DescribeDataServiceCluster, opts ...grpc.CallOption) (*pbmodel.DataServiceCluster, error) {
	out := new(pbmodel.DataServiceCluster)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/DescribeDataServiceCluster", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) DeleteDataServiceClusters(ctx context.Context, in *pbrequest.DeleteDataServiceClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/DeleteDataServiceClusters", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) CreateApiGroup(ctx context.Context, in *pbrequest.CreateApiGroup, opts ...grpc.CallOption) (*pbresponse.CreateApiGroup, error) {
	out := new(pbresponse.CreateApiGroup)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/CreateApiGroup", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) ListApiGroups(ctx context.Context, in *pbrequest.ListApiGroups, opts ...grpc.CallOption) (*pbresponse.ListApiGroups, error) {
	out := new(pbresponse.ListApiGroups)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/ListApiGroups", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) DeleteApiGroups(ctx context.Context, in *pbrequest.DeleteApiGroups, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/DeleteApiGroups", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) CreateDataServiceApi(ctx context.Context, in *pbrequest.CreateCustomerApi, opts ...grpc.CallOption) (*pbresponse.CreateCustomerApi, error) {
	out := new(pbresponse.CreateCustomerApi)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/CreateDataServiceApi", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) UpdateDataServiceApi(ctx context.Context, in *pbrequest.UpdateCustomerApi, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/UpdateDataServiceApi", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) DescribeDataServiceApi(ctx context.Context, in *pbrequest.DescribeCustomerApi, opts ...grpc.CallOption) (*pbresponse.DescribeCustomerApi, error) {
	out := new(pbresponse.DescribeCustomerApi)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/DescribeDataServiceApi", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) ListDataServiceApis(ctx context.Context, in *pbrequest.ListCustomerApis, opts ...grpc.CallOption) (*pbresponse.ListCustomerApis, error) {
	out := new(pbresponse.ListCustomerApis)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/ListDataServiceApis", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) DeleteDataServiceApis(ctx context.Context, in *pbrequest.DeleteCustomerApis, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/DeleteDataServiceApis", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) TestDataServiceApi(ctx context.Context, in *pbrequest.TestCustomerApi, opts ...grpc.CallOption) (*pbresponse.TestCustomerApi, error) {
	out := new(pbresponse.TestCustomerApi)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/TestDataServiceApi", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) PublishDataServiceApi(ctx context.Context, in *pbrequest.PublishCustomerApi, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/PublishDataServiceApi", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) ListDataServiceApiVersions(ctx context.Context, in *pbrequest.ListApiVersions, opts ...grpc.CallOption) (*pbresponse.ListApiVersions, error) {
	out := new(pbresponse.ListApiVersions)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/ListDataServiceApiVersions", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) DescribeDataServiceApiVersion(ctx context.Context, in *pbrequest.DescribeApiVersion, opts ...grpc.CallOption) (*pbresponse.DescribeApiVersion, error) {
	out := new(pbresponse.DescribeApiVersion)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/DescribeDataServiceApiVersion", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) RepublishDataServiceApi(ctx context.Context, in *pbrequest.DescribeApiVersion, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/RepublishDataServiceApi", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *dataServiceClient) AbolishDataServiceApi(ctx context.Context, in *pbrequest.PublishCustomerApi, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/dataservice.DataService/AbolishDataServiceApi", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// DataServiceServer is the server API for DataService service.
// All implementations must embed UnimplementedDataServiceServer
// for forward compatibility
type DataServiceServer interface {
	CreateDataServiceCluster(context.Context, *pbrequest.CreateDataServiceCluster) (*pbresponse.CreateDataServiceCluster, error)
	ListDataServiceClusters(context.Context, *pbrequest.ListDataServiceClusters) (*pbresponse.ListDataServiceClusters, error)
	UpdateDataServiceCluster(context.Context, *pbrequest.UpdateDataServiceCluster) (*pbmodel.EmptyStruct, error)
	DescribeDataServiceCluster(context.Context, *pbrequest.DescribeDataServiceCluster) (*pbmodel.DataServiceCluster, error)
	DeleteDataServiceClusters(context.Context, *pbrequest.DeleteDataServiceClusters) (*pbmodel.EmptyStruct, error)
	CreateApiGroup(context.Context, *pbrequest.CreateApiGroup) (*pbresponse.CreateApiGroup, error)
	ListApiGroups(context.Context, *pbrequest.ListApiGroups) (*pbresponse.ListApiGroups, error)
	DeleteApiGroups(context.Context, *pbrequest.DeleteApiGroups) (*pbmodel.EmptyStruct, error)
	CreateDataServiceApi(context.Context, *pbrequest.CreateCustomerApi) (*pbresponse.CreateCustomerApi, error)
	UpdateDataServiceApi(context.Context, *pbrequest.UpdateCustomerApi) (*pbmodel.EmptyStruct, error)
	DescribeDataServiceApi(context.Context, *pbrequest.DescribeCustomerApi) (*pbresponse.DescribeCustomerApi, error)
	ListDataServiceApis(context.Context, *pbrequest.ListCustomerApis) (*pbresponse.ListCustomerApis, error)
	DeleteDataServiceApis(context.Context, *pbrequest.DeleteCustomerApis) (*pbmodel.EmptyStruct, error)
	TestDataServiceApi(context.Context, *pbrequest.TestCustomerApi) (*pbresponse.TestCustomerApi, error)
	PublishDataServiceApi(context.Context, *pbrequest.PublishCustomerApi) (*pbmodel.EmptyStruct, error)
	ListDataServiceApiVersions(context.Context, *pbrequest.ListApiVersions) (*pbresponse.ListApiVersions, error)
	DescribeDataServiceApiVersion(context.Context, *pbrequest.DescribeApiVersion) (*pbresponse.DescribeApiVersion, error)
	RepublishDataServiceApi(context.Context, *pbrequest.DescribeApiVersion) (*pbmodel.EmptyStruct, error)
	AbolishDataServiceApi(context.Context, *pbrequest.PublishCustomerApi) (*pbmodel.EmptyStruct, error)
	mustEmbedUnimplementedDataServiceServer()
}

// UnimplementedDataServiceServer must be embedded to have forward compatible implementations.
type UnimplementedDataServiceServer struct {
}

func (UnimplementedDataServiceServer) CreateDataServiceCluster(context.Context, *pbrequest.CreateDataServiceCluster) (*pbresponse.CreateDataServiceCluster, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateDataServiceCluster not implemented")
}
func (UnimplementedDataServiceServer) ListDataServiceClusters(context.Context, *pbrequest.ListDataServiceClusters) (*pbresponse.ListDataServiceClusters, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListDataServiceClusters not implemented")
}
func (UnimplementedDataServiceServer) UpdateDataServiceCluster(context.Context, *pbrequest.UpdateDataServiceCluster) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateDataServiceCluster not implemented")
}
func (UnimplementedDataServiceServer) DescribeDataServiceCluster(context.Context, *pbrequest.DescribeDataServiceCluster) (*pbmodel.DataServiceCluster, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeDataServiceCluster not implemented")
}
func (UnimplementedDataServiceServer) DeleteDataServiceClusters(context.Context, *pbrequest.DeleteDataServiceClusters) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteDataServiceClusters not implemented")
}
func (UnimplementedDataServiceServer) CreateApiGroup(context.Context, *pbrequest.CreateApiGroup) (*pbresponse.CreateApiGroup, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateApiGroup not implemented")
}
func (UnimplementedDataServiceServer) ListApiGroups(context.Context, *pbrequest.ListApiGroups) (*pbresponse.ListApiGroups, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListApiGroups not implemented")
}
func (UnimplementedDataServiceServer) DeleteApiGroups(context.Context, *pbrequest.DeleteApiGroups) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteApiGroups not implemented")
}
func (UnimplementedDataServiceServer) CreateDataServiceApi(context.Context, *pbrequest.CreateCustomerApi) (*pbresponse.CreateCustomerApi, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateDataServiceApi not implemented")
}
func (UnimplementedDataServiceServer) UpdateDataServiceApi(context.Context, *pbrequest.UpdateCustomerApi) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateDataServiceApi not implemented")
}
func (UnimplementedDataServiceServer) DescribeDataServiceApi(context.Context, *pbrequest.DescribeCustomerApi) (*pbresponse.DescribeCustomerApi, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeDataServiceApi not implemented")
}
func (UnimplementedDataServiceServer) ListDataServiceApis(context.Context, *pbrequest.ListCustomerApis) (*pbresponse.ListCustomerApis, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListDataServiceApis not implemented")
}
func (UnimplementedDataServiceServer) DeleteDataServiceApis(context.Context, *pbrequest.DeleteCustomerApis) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteDataServiceApis not implemented")
}
func (UnimplementedDataServiceServer) TestDataServiceApi(context.Context, *pbrequest.TestCustomerApi) (*pbresponse.TestCustomerApi, error) {
	return nil, status.Errorf(codes.Unimplemented, "method TestDataServiceApi not implemented")
}
func (UnimplementedDataServiceServer) PublishDataServiceApi(context.Context, *pbrequest.PublishCustomerApi) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method PublishDataServiceApi not implemented")
}
func (UnimplementedDataServiceServer) ListDataServiceApiVersions(context.Context, *pbrequest.ListApiVersions) (*pbresponse.ListApiVersions, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListDataServiceApiVersions not implemented")
}
func (UnimplementedDataServiceServer) DescribeDataServiceApiVersion(context.Context, *pbrequest.DescribeApiVersion) (*pbresponse.DescribeApiVersion, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeDataServiceApiVersion not implemented")
}
func (UnimplementedDataServiceServer) RepublishDataServiceApi(context.Context, *pbrequest.DescribeApiVersion) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RepublishDataServiceApi not implemented")
}
func (UnimplementedDataServiceServer) AbolishDataServiceApi(context.Context, *pbrequest.PublishCustomerApi) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AbolishDataServiceApi not implemented")
}
func (UnimplementedDataServiceServer) mustEmbedUnimplementedDataServiceServer() {}

// UnsafeDataServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to DataServiceServer will
// result in compilation errors.
type UnsafeDataServiceServer interface {
	mustEmbedUnimplementedDataServiceServer()
}

func RegisterDataServiceServer(s grpc.ServiceRegistrar, srv DataServiceServer) {
	s.RegisterService(&DataService_ServiceDesc, srv)
}

func _DataService_CreateDataServiceCluster_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.CreateDataServiceCluster)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).CreateDataServiceCluster(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/CreateDataServiceCluster",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).CreateDataServiceCluster(ctx, req.(*pbrequest.CreateDataServiceCluster))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_ListDataServiceClusters_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListDataServiceClusters)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).ListDataServiceClusters(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/ListDataServiceClusters",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).ListDataServiceClusters(ctx, req.(*pbrequest.ListDataServiceClusters))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_UpdateDataServiceCluster_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.UpdateDataServiceCluster)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).UpdateDataServiceCluster(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/UpdateDataServiceCluster",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).UpdateDataServiceCluster(ctx, req.(*pbrequest.UpdateDataServiceCluster))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_DescribeDataServiceCluster_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeDataServiceCluster)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).DescribeDataServiceCluster(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/DescribeDataServiceCluster",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).DescribeDataServiceCluster(ctx, req.(*pbrequest.DescribeDataServiceCluster))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_DeleteDataServiceClusters_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DeleteDataServiceClusters)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).DeleteDataServiceClusters(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/DeleteDataServiceClusters",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).DeleteDataServiceClusters(ctx, req.(*pbrequest.DeleteDataServiceClusters))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_CreateApiGroup_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.CreateApiGroup)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).CreateApiGroup(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/CreateApiGroup",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).CreateApiGroup(ctx, req.(*pbrequest.CreateApiGroup))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_ListApiGroups_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListApiGroups)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).ListApiGroups(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/ListApiGroups",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).ListApiGroups(ctx, req.(*pbrequest.ListApiGroups))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_DeleteApiGroups_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DeleteApiGroups)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).DeleteApiGroups(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/DeleteApiGroups",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).DeleteApiGroups(ctx, req.(*pbrequest.DeleteApiGroups))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_CreateDataServiceApi_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.CreateCustomerApi)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).CreateDataServiceApi(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/CreateDataServiceApi",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).CreateDataServiceApi(ctx, req.(*pbrequest.CreateCustomerApi))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_UpdateDataServiceApi_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.UpdateCustomerApi)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).UpdateDataServiceApi(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/UpdateDataServiceApi",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).UpdateDataServiceApi(ctx, req.(*pbrequest.UpdateCustomerApi))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_DescribeDataServiceApi_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeCustomerApi)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).DescribeDataServiceApi(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/DescribeDataServiceApi",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).DescribeDataServiceApi(ctx, req.(*pbrequest.DescribeCustomerApi))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_ListDataServiceApis_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListCustomerApis)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).ListDataServiceApis(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/ListDataServiceApis",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).ListDataServiceApis(ctx, req.(*pbrequest.ListCustomerApis))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_DeleteDataServiceApis_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DeleteCustomerApis)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).DeleteDataServiceApis(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/DeleteDataServiceApis",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).DeleteDataServiceApis(ctx, req.(*pbrequest.DeleteCustomerApis))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_TestDataServiceApi_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.TestCustomerApi)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).TestDataServiceApi(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/TestDataServiceApi",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).TestDataServiceApi(ctx, req.(*pbrequest.TestCustomerApi))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_PublishDataServiceApi_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.PublishCustomerApi)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).PublishDataServiceApi(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/PublishDataServiceApi",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).PublishDataServiceApi(ctx, req.(*pbrequest.PublishCustomerApi))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_ListDataServiceApiVersions_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListApiVersions)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).ListDataServiceApiVersions(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/ListDataServiceApiVersions",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).ListDataServiceApiVersions(ctx, req.(*pbrequest.ListApiVersions))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_DescribeDataServiceApiVersion_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeApiVersion)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).DescribeDataServiceApiVersion(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/DescribeDataServiceApiVersion",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).DescribeDataServiceApiVersion(ctx, req.(*pbrequest.DescribeApiVersion))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_RepublishDataServiceApi_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeApiVersion)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).RepublishDataServiceApi(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/RepublishDataServiceApi",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).RepublishDataServiceApi(ctx, req.(*pbrequest.DescribeApiVersion))
	}
	return interceptor(ctx, in, info, handler)
}

func _DataService_AbolishDataServiceApi_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.PublishCustomerApi)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(DataServiceServer).AbolishDataServiceApi(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/dataservice.DataService/AbolishDataServiceApi",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(DataServiceServer).AbolishDataServiceApi(ctx, req.(*pbrequest.PublishCustomerApi))
	}
	return interceptor(ctx, in, info, handler)
}

// DataService_ServiceDesc is the grpc.ServiceDesc for DataService service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var DataService_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "dataservice.DataService",
	HandlerType: (*DataServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "CreateDataServiceCluster",
			Handler:    _DataService_CreateDataServiceCluster_Handler,
		},
		{
			MethodName: "ListDataServiceClusters",
			Handler:    _DataService_ListDataServiceClusters_Handler,
		},
		{
			MethodName: "UpdateDataServiceCluster",
			Handler:    _DataService_UpdateDataServiceCluster_Handler,
		},
		{
			MethodName: "DescribeDataServiceCluster",
			Handler:    _DataService_DescribeDataServiceCluster_Handler,
		},
		{
			MethodName: "DeleteDataServiceClusters",
			Handler:    _DataService_DeleteDataServiceClusters_Handler,
		},
		{
			MethodName: "CreateApiGroup",
			Handler:    _DataService_CreateApiGroup_Handler,
		},
		{
			MethodName: "ListApiGroups",
			Handler:    _DataService_ListApiGroups_Handler,
		},
		{
			MethodName: "DeleteApiGroups",
			Handler:    _DataService_DeleteApiGroups_Handler,
		},
		{
			MethodName: "CreateDataServiceApi",
			Handler:    _DataService_CreateDataServiceApi_Handler,
		},
		{
			MethodName: "UpdateDataServiceApi",
			Handler:    _DataService_UpdateDataServiceApi_Handler,
		},
		{
			MethodName: "DescribeDataServiceApi",
			Handler:    _DataService_DescribeDataServiceApi_Handler,
		},
		{
			MethodName: "ListDataServiceApis",
			Handler:    _DataService_ListDataServiceApis_Handler,
		},
		{
			MethodName: "DeleteDataServiceApis",
			Handler:    _DataService_DeleteDataServiceApis_Handler,
		},
		{
			MethodName: "TestDataServiceApi",
			Handler:    _DataService_TestDataServiceApi_Handler,
		},
		{
			MethodName: "PublishDataServiceApi",
			Handler:    _DataService_PublishDataServiceApi_Handler,
		},
		{
			MethodName: "ListDataServiceApiVersions",
			Handler:    _DataService_ListDataServiceApiVersions_Handler,
		},
		{
			MethodName: "DescribeDataServiceApiVersion",
			Handler:    _DataService_DescribeDataServiceApiVersion_Handler,
		},
		{
			MethodName: "RepublishDataServiceApi",
			Handler:    _DataService_RepublishDataServiceApi_Handler,
		},
		{
			MethodName: "AbolishDataServiceApi",
			Handler:    _DataService_AbolishDataServiceApi_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/service/dataservice/dataservice.proto",
}
