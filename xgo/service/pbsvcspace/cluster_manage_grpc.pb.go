// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.3
// source: proto/service/spacemanager/cluster_manage.proto

package pbsvcspace

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

// ClusterManageClient is the client API for ClusterManage service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ClusterManageClient interface {
	// Interface for manage flink cluster
	ListAvailableFlinkVersions(ctx context.Context, in *pbmodel.EmptyStruct, opts ...grpc.CallOption) (*pbresponse.ListAvailableFlinkVersions, error)
	// Describe flink cluster api that job-manager commit job to
	DescribeFlinkClusterAPI(ctx context.Context, in *pbrequest.DescribeFlinkClusterAPI, opts ...grpc.CallOption) (*pbresponse.DescribeFlinkClusterAPI, error)
	ListFlinkClusters(ctx context.Context, in *pbrequest.ListFlinkClusters, opts ...grpc.CallOption) (*pbresponse.ListFlinkClusters, error)
	CreateFlinkCluster(ctx context.Context, in *pbrequest.CreateFlinkCluster, opts ...grpc.CallOption) (*pbresponse.CreateFlinkCluster, error)
	DescribeFlinkCluster(ctx context.Context, in *pbrequest.DescribeFlinkCluster, opts ...grpc.CallOption) (*pbresponse.DescribeFlinkCluster, error)
	UpdateFlinkCluster(ctx context.Context, in *pbrequest.UpdateFlinkCluster, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DeleteFlinkClusters(ctx context.Context, in *pbrequest.DeleteFlinkClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	StartFlinkClusters(ctx context.Context, in *pbrequest.StartFlinkClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	StopFlinkClusters(ctx context.Context, in *pbrequest.StopFlinkClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
}

type clusterManageClient struct {
	cc grpc.ClientConnInterface
}

func NewClusterManageClient(cc grpc.ClientConnInterface) ClusterManageClient {
	return &clusterManageClient{cc}
}

func (c *clusterManageClient) ListAvailableFlinkVersions(ctx context.Context, in *pbmodel.EmptyStruct, opts ...grpc.CallOption) (*pbresponse.ListAvailableFlinkVersions, error) {
	out := new(pbresponse.ListAvailableFlinkVersions)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/ListAvailableFlinkVersions", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) DescribeFlinkClusterAPI(ctx context.Context, in *pbrequest.DescribeFlinkClusterAPI, opts ...grpc.CallOption) (*pbresponse.DescribeFlinkClusterAPI, error) {
	out := new(pbresponse.DescribeFlinkClusterAPI)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/DescribeFlinkClusterAPI", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) ListFlinkClusters(ctx context.Context, in *pbrequest.ListFlinkClusters, opts ...grpc.CallOption) (*pbresponse.ListFlinkClusters, error) {
	out := new(pbresponse.ListFlinkClusters)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/ListFlinkClusters", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) CreateFlinkCluster(ctx context.Context, in *pbrequest.CreateFlinkCluster, opts ...grpc.CallOption) (*pbresponse.CreateFlinkCluster, error) {
	out := new(pbresponse.CreateFlinkCluster)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/CreateFlinkCluster", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) DescribeFlinkCluster(ctx context.Context, in *pbrequest.DescribeFlinkCluster, opts ...grpc.CallOption) (*pbresponse.DescribeFlinkCluster, error) {
	out := new(pbresponse.DescribeFlinkCluster)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/DescribeFlinkCluster", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) UpdateFlinkCluster(ctx context.Context, in *pbrequest.UpdateFlinkCluster, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/UpdateFlinkCluster", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) DeleteFlinkClusters(ctx context.Context, in *pbrequest.DeleteFlinkClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/DeleteFlinkClusters", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) StartFlinkClusters(ctx context.Context, in *pbrequest.StartFlinkClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/StartFlinkClusters", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *clusterManageClient) StopFlinkClusters(ctx context.Context, in *pbrequest.StopFlinkClusters, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.ClusterManage/StopFlinkClusters", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ClusterManageServer is the server API for ClusterManage service.
// All implementations must embed UnimplementedClusterManageServer
// for forward compatibility
type ClusterManageServer interface {
	// Interface for manage flink cluster
	ListAvailableFlinkVersions(context.Context, *pbmodel.EmptyStruct) (*pbresponse.ListAvailableFlinkVersions, error)
	// Describe flink cluster api that job-manager commit job to
	DescribeFlinkClusterAPI(context.Context, *pbrequest.DescribeFlinkClusterAPI) (*pbresponse.DescribeFlinkClusterAPI, error)
	ListFlinkClusters(context.Context, *pbrequest.ListFlinkClusters) (*pbresponse.ListFlinkClusters, error)
	CreateFlinkCluster(context.Context, *pbrequest.CreateFlinkCluster) (*pbresponse.CreateFlinkCluster, error)
	DescribeFlinkCluster(context.Context, *pbrequest.DescribeFlinkCluster) (*pbresponse.DescribeFlinkCluster, error)
	UpdateFlinkCluster(context.Context, *pbrequest.UpdateFlinkCluster) (*pbmodel.EmptyStruct, error)
	DeleteFlinkClusters(context.Context, *pbrequest.DeleteFlinkClusters) (*pbmodel.EmptyStruct, error)
	StartFlinkClusters(context.Context, *pbrequest.StartFlinkClusters) (*pbmodel.EmptyStruct, error)
	StopFlinkClusters(context.Context, *pbrequest.StopFlinkClusters) (*pbmodel.EmptyStruct, error)
	mustEmbedUnimplementedClusterManageServer()
}

// UnimplementedClusterManageServer must be embedded to have forward compatible implementations.
type UnimplementedClusterManageServer struct {
}

func (UnimplementedClusterManageServer) ListAvailableFlinkVersions(context.Context, *pbmodel.EmptyStruct) (*pbresponse.ListAvailableFlinkVersions, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListAvailableFlinkVersions not implemented")
}
func (UnimplementedClusterManageServer) DescribeFlinkClusterAPI(context.Context, *pbrequest.DescribeFlinkClusterAPI) (*pbresponse.DescribeFlinkClusterAPI, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeFlinkClusterAPI not implemented")
}
func (UnimplementedClusterManageServer) ListFlinkClusters(context.Context, *pbrequest.ListFlinkClusters) (*pbresponse.ListFlinkClusters, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListFlinkClusters not implemented")
}
func (UnimplementedClusterManageServer) CreateFlinkCluster(context.Context, *pbrequest.CreateFlinkCluster) (*pbresponse.CreateFlinkCluster, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateFlinkCluster not implemented")
}
func (UnimplementedClusterManageServer) DescribeFlinkCluster(context.Context, *pbrequest.DescribeFlinkCluster) (*pbresponse.DescribeFlinkCluster, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeFlinkCluster not implemented")
}
func (UnimplementedClusterManageServer) UpdateFlinkCluster(context.Context, *pbrequest.UpdateFlinkCluster) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateFlinkCluster not implemented")
}
func (UnimplementedClusterManageServer) DeleteFlinkClusters(context.Context, *pbrequest.DeleteFlinkClusters) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteFlinkClusters not implemented")
}
func (UnimplementedClusterManageServer) StartFlinkClusters(context.Context, *pbrequest.StartFlinkClusters) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StartFlinkClusters not implemented")
}
func (UnimplementedClusterManageServer) StopFlinkClusters(context.Context, *pbrequest.StopFlinkClusters) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StopFlinkClusters not implemented")
}
func (UnimplementedClusterManageServer) mustEmbedUnimplementedClusterManageServer() {}

// UnsafeClusterManageServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ClusterManageServer will
// result in compilation errors.
type UnsafeClusterManageServer interface {
	mustEmbedUnimplementedClusterManageServer()
}

func RegisterClusterManageServer(s grpc.ServiceRegistrar, srv ClusterManageServer) {
	s.RegisterService(&ClusterManage_ServiceDesc, srv)
}

func _ClusterManage_ListAvailableFlinkVersions_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbmodel.EmptyStruct)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).ListAvailableFlinkVersions(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/ListAvailableFlinkVersions",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).ListAvailableFlinkVersions(ctx, req.(*pbmodel.EmptyStruct))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_DescribeFlinkClusterAPI_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeFlinkClusterAPI)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).DescribeFlinkClusterAPI(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/DescribeFlinkClusterAPI",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).DescribeFlinkClusterAPI(ctx, req.(*pbrequest.DescribeFlinkClusterAPI))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_ListFlinkClusters_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListFlinkClusters)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).ListFlinkClusters(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/ListFlinkClusters",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).ListFlinkClusters(ctx, req.(*pbrequest.ListFlinkClusters))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_CreateFlinkCluster_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.CreateFlinkCluster)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).CreateFlinkCluster(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/CreateFlinkCluster",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).CreateFlinkCluster(ctx, req.(*pbrequest.CreateFlinkCluster))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_DescribeFlinkCluster_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeFlinkCluster)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).DescribeFlinkCluster(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/DescribeFlinkCluster",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).DescribeFlinkCluster(ctx, req.(*pbrequest.DescribeFlinkCluster))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_UpdateFlinkCluster_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.UpdateFlinkCluster)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).UpdateFlinkCluster(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/UpdateFlinkCluster",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).UpdateFlinkCluster(ctx, req.(*pbrequest.UpdateFlinkCluster))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_DeleteFlinkClusters_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DeleteFlinkClusters)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).DeleteFlinkClusters(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/DeleteFlinkClusters",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).DeleteFlinkClusters(ctx, req.(*pbrequest.DeleteFlinkClusters))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_StartFlinkClusters_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.StartFlinkClusters)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).StartFlinkClusters(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/StartFlinkClusters",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).StartFlinkClusters(ctx, req.(*pbrequest.StartFlinkClusters))
	}
	return interceptor(ctx, in, info, handler)
}

func _ClusterManage_StopFlinkClusters_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.StopFlinkClusters)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ClusterManageServer).StopFlinkClusters(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.ClusterManage/StopFlinkClusters",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ClusterManageServer).StopFlinkClusters(ctx, req.(*pbrequest.StopFlinkClusters))
	}
	return interceptor(ctx, in, info, handler)
}

// ClusterManage_ServiceDesc is the grpc.ServiceDesc for ClusterManage service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var ClusterManage_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "spacemanager.ClusterManage",
	HandlerType: (*ClusterManageServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ListAvailableFlinkVersions",
			Handler:    _ClusterManage_ListAvailableFlinkVersions_Handler,
		},
		{
			MethodName: "DescribeFlinkClusterAPI",
			Handler:    _ClusterManage_DescribeFlinkClusterAPI_Handler,
		},
		{
			MethodName: "ListFlinkClusters",
			Handler:    _ClusterManage_ListFlinkClusters_Handler,
		},
		{
			MethodName: "CreateFlinkCluster",
			Handler:    _ClusterManage_CreateFlinkCluster_Handler,
		},
		{
			MethodName: "DescribeFlinkCluster",
			Handler:    _ClusterManage_DescribeFlinkCluster_Handler,
		},
		{
			MethodName: "UpdateFlinkCluster",
			Handler:    _ClusterManage_UpdateFlinkCluster_Handler,
		},
		{
			MethodName: "DeleteFlinkClusters",
			Handler:    _ClusterManage_DeleteFlinkClusters_Handler,
		},
		{
			MethodName: "StartFlinkClusters",
			Handler:    _ClusterManage_StartFlinkClusters_Handler,
		},
		{
			MethodName: "StopFlinkClusters",
			Handler:    _ClusterManage_StopFlinkClusters_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/service/spacemanager/cluster_manage.proto",
}