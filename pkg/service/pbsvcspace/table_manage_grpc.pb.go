// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.3
// source: proto/service/spacemanager/table_manage.proto

package pbsvcspace

import (
	context "context"
	pbmodel "github.com/DataWorkbench/gproto/pkg/types/pbmodel"
	pbrequest "github.com/DataWorkbench/gproto/pkg/types/pbrequest"
	pbresponse "github.com/DataWorkbench/gproto/pkg/types/pbresponse"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
// Requires gRPC-Go v1.32.0 or later.
const _ = grpc.SupportPackageIsVersion7

// TableMangeClient is the client API for TableMange service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type TableMangeClient interface {
	ListFlinkTables(ctx context.Context, in *pbrequest.ListFlinkTables, opts ...grpc.CallOption) (*pbresponse.ListFlinkTables, error)
	CreateFlinkTable(ctx context.Context, in *pbrequest.CreateFlinkTable, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DescribeFlinkTable(ctx context.Context, in *pbrequest.DescribeFlinkTable, opts ...grpc.CallOption) (*pbresponse.DescribeFlinkTable, error)
	UpdateFlinkTable(ctx context.Context, in *pbrequest.UpdateFlinkTable, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DeleteFlinkTables(ctx context.Context, in *pbrequest.DeleteFlinkTables, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
}

type tableMangeClient struct {
	cc grpc.ClientConnInterface
}

func NewTableMangeClient(cc grpc.ClientConnInterface) TableMangeClient {
	return &tableMangeClient{cc}
}

func (c *tableMangeClient) ListFlinkTables(ctx context.Context, in *pbrequest.ListFlinkTables, opts ...grpc.CallOption) (*pbresponse.ListFlinkTables, error) {
	out := new(pbresponse.ListFlinkTables)
	err := c.cc.Invoke(ctx, "/spacemanager.TableMange/ListFlinkTables", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tableMangeClient) CreateFlinkTable(ctx context.Context, in *pbrequest.CreateFlinkTable, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.TableMange/CreateFlinkTable", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tableMangeClient) DescribeFlinkTable(ctx context.Context, in *pbrequest.DescribeFlinkTable, opts ...grpc.CallOption) (*pbresponse.DescribeFlinkTable, error) {
	out := new(pbresponse.DescribeFlinkTable)
	err := c.cc.Invoke(ctx, "/spacemanager.TableMange/DescribeFlinkTable", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tableMangeClient) UpdateFlinkTable(ctx context.Context, in *pbrequest.UpdateFlinkTable, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.TableMange/UpdateFlinkTable", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *tableMangeClient) DeleteFlinkTables(ctx context.Context, in *pbrequest.DeleteFlinkTables, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.TableMange/DeleteFlinkTables", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// TableMangeServer is the server API for TableMange service.
// All implementations must embed UnimplementedTableMangeServer
// for forward compatibility
type TableMangeServer interface {
	ListFlinkTables(context.Context, *pbrequest.ListFlinkTables) (*pbresponse.ListFlinkTables, error)
	CreateFlinkTable(context.Context, *pbrequest.CreateFlinkTable) (*pbmodel.EmptyStruct, error)
	DescribeFlinkTable(context.Context, *pbrequest.DescribeFlinkTable) (*pbresponse.DescribeFlinkTable, error)
	UpdateFlinkTable(context.Context, *pbrequest.UpdateFlinkTable) (*pbmodel.EmptyStruct, error)
	DeleteFlinkTables(context.Context, *pbrequest.DeleteFlinkTables) (*pbmodel.EmptyStruct, error)
	mustEmbedUnimplementedTableMangeServer()
}

// UnimplementedTableMangeServer must be embedded to have forward compatible implementations.
type UnimplementedTableMangeServer struct {
}

func (UnimplementedTableMangeServer) ListFlinkTables(context.Context, *pbrequest.ListFlinkTables) (*pbresponse.ListFlinkTables, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListFlinkTables not implemented")
}
func (UnimplementedTableMangeServer) CreateFlinkTable(context.Context, *pbrequest.CreateFlinkTable) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateFlinkTable not implemented")
}
func (UnimplementedTableMangeServer) DescribeFlinkTable(context.Context, *pbrequest.DescribeFlinkTable) (*pbresponse.DescribeFlinkTable, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeFlinkTable not implemented")
}
func (UnimplementedTableMangeServer) UpdateFlinkTable(context.Context, *pbrequest.UpdateFlinkTable) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateFlinkTable not implemented")
}
func (UnimplementedTableMangeServer) DeleteFlinkTables(context.Context, *pbrequest.DeleteFlinkTables) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteFlinkTables not implemented")
}
func (UnimplementedTableMangeServer) mustEmbedUnimplementedTableMangeServer() {}

// UnsafeTableMangeServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to TableMangeServer will
// result in compilation errors.
type UnsafeTableMangeServer interface {
	mustEmbedUnimplementedTableMangeServer()
}

func RegisterTableMangeServer(s grpc.ServiceRegistrar, srv TableMangeServer) {
	s.RegisterService(&TableMange_ServiceDesc, srv)
}

func _TableMange_ListFlinkTables_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListFlinkTables)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TableMangeServer).ListFlinkTables(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.TableMange/ListFlinkTables",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TableMangeServer).ListFlinkTables(ctx, req.(*pbrequest.ListFlinkTables))
	}
	return interceptor(ctx, in, info, handler)
}

func _TableMange_CreateFlinkTable_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.CreateFlinkTable)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TableMangeServer).CreateFlinkTable(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.TableMange/CreateFlinkTable",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TableMangeServer).CreateFlinkTable(ctx, req.(*pbrequest.CreateFlinkTable))
	}
	return interceptor(ctx, in, info, handler)
}

func _TableMange_DescribeFlinkTable_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeFlinkTable)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TableMangeServer).DescribeFlinkTable(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.TableMange/DescribeFlinkTable",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TableMangeServer).DescribeFlinkTable(ctx, req.(*pbrequest.DescribeFlinkTable))
	}
	return interceptor(ctx, in, info, handler)
}

func _TableMange_UpdateFlinkTable_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.UpdateFlinkTable)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TableMangeServer).UpdateFlinkTable(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.TableMange/UpdateFlinkTable",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TableMangeServer).UpdateFlinkTable(ctx, req.(*pbrequest.UpdateFlinkTable))
	}
	return interceptor(ctx, in, info, handler)
}

func _TableMange_DeleteFlinkTables_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DeleteFlinkTables)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(TableMangeServer).DeleteFlinkTables(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.TableMange/DeleteFlinkTables",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(TableMangeServer).DeleteFlinkTables(ctx, req.(*pbrequest.DeleteFlinkTables))
	}
	return interceptor(ctx, in, info, handler)
}

// TableMange_ServiceDesc is the grpc.ServiceDesc for TableMange service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var TableMange_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "spacemanager.TableMange",
	HandlerType: (*TableMangeServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ListFlinkTables",
			Handler:    _TableMange_ListFlinkTables_Handler,
		},
		{
			MethodName: "CreateFlinkTable",
			Handler:    _TableMange_CreateFlinkTable_Handler,
		},
		{
			MethodName: "DescribeFlinkTable",
			Handler:    _TableMange_DescribeFlinkTable_Handler,
		},
		{
			MethodName: "UpdateFlinkTable",
			Handler:    _TableMange_UpdateFlinkTable_Handler,
		},
		{
			MethodName: "DeleteFlinkTables",
			Handler:    _TableMange_DeleteFlinkTables_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/service/spacemanager/table_manage.proto",
}
