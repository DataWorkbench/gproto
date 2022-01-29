// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.3
// source: proto/service/spacemanager/member_manage.proto

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

// MemberManageClient is the client API for MemberManage service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type MemberManageClient interface {
	// API of workspace role.
	ListSystemRoles(ctx context.Context, in *pbrequest.ListSystemRoles, opts ...grpc.CallOption) (*pbresponse.ListSystemRoles, error)
	// API of workspace member.
	ListMembers(ctx context.Context, in *pbrequest.ListMembers, opts ...grpc.CallOption) (*pbresponse.ListMembers, error)
	UpsertMembers(ctx context.Context, in *pbrequest.UpsertMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DeleteMembers(ctx context.Context, in *pbrequest.DeleteMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
}

type memberManageClient struct {
	cc grpc.ClientConnInterface
}

func NewMemberManageClient(cc grpc.ClientConnInterface) MemberManageClient {
	return &memberManageClient{cc}
}

func (c *memberManageClient) ListSystemRoles(ctx context.Context, in *pbrequest.ListSystemRoles, opts ...grpc.CallOption) (*pbresponse.ListSystemRoles, error) {
	out := new(pbresponse.ListSystemRoles)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/ListSystemRoles", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *memberManageClient) ListMembers(ctx context.Context, in *pbrequest.ListMembers, opts ...grpc.CallOption) (*pbresponse.ListMembers, error) {
	out := new(pbresponse.ListMembers)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/ListMembers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *memberManageClient) UpsertMembers(ctx context.Context, in *pbrequest.UpsertMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/UpsertMembers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *memberManageClient) DeleteMembers(ctx context.Context, in *pbrequest.DeleteMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/DeleteMembers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// MemberManageServer is the server API for MemberManage service.
// All implementations must embed UnimplementedMemberManageServer
// for forward compatibility
type MemberManageServer interface {
	// API of workspace role.
	ListSystemRoles(context.Context, *pbrequest.ListSystemRoles) (*pbresponse.ListSystemRoles, error)
	// API of workspace member.
	ListMembers(context.Context, *pbrequest.ListMembers) (*pbresponse.ListMembers, error)
	UpsertMembers(context.Context, *pbrequest.UpsertMembers) (*pbmodel.EmptyStruct, error)
	DeleteMembers(context.Context, *pbrequest.DeleteMembers) (*pbmodel.EmptyStruct, error)
	mustEmbedUnimplementedMemberManageServer()
}

// UnimplementedMemberManageServer must be embedded to have forward compatible implementations.
type UnimplementedMemberManageServer struct {
}

func (UnimplementedMemberManageServer) ListSystemRoles(context.Context, *pbrequest.ListSystemRoles) (*pbresponse.ListSystemRoles, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListSystemRoles not implemented")
}
func (UnimplementedMemberManageServer) ListMembers(context.Context, *pbrequest.ListMembers) (*pbresponse.ListMembers, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListMembers not implemented")
}
func (UnimplementedMemberManageServer) UpsertMembers(context.Context, *pbrequest.UpsertMembers) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpsertMembers not implemented")
}
func (UnimplementedMemberManageServer) DeleteMembers(context.Context, *pbrequest.DeleteMembers) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteMembers not implemented")
}
func (UnimplementedMemberManageServer) mustEmbedUnimplementedMemberManageServer() {}

// UnsafeMemberManageServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to MemberManageServer will
// result in compilation errors.
type UnsafeMemberManageServer interface {
	mustEmbedUnimplementedMemberManageServer()
}

func RegisterMemberManageServer(s grpc.ServiceRegistrar, srv MemberManageServer) {
	s.RegisterService(&MemberManage_ServiceDesc, srv)
}

func _MemberManage_ListSystemRoles_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListSystemRoles)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).ListSystemRoles(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/ListSystemRoles",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).ListSystemRoles(ctx, req.(*pbrequest.ListSystemRoles))
	}
	return interceptor(ctx, in, info, handler)
}

func _MemberManage_ListMembers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListMembers)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).ListMembers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/ListMembers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).ListMembers(ctx, req.(*pbrequest.ListMembers))
	}
	return interceptor(ctx, in, info, handler)
}

func _MemberManage_UpsertMembers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.UpsertMembers)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).UpsertMembers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/UpsertMembers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).UpsertMembers(ctx, req.(*pbrequest.UpsertMembers))
	}
	return interceptor(ctx, in, info, handler)
}

func _MemberManage_DeleteMembers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DeleteMembers)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).DeleteMembers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/DeleteMembers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).DeleteMembers(ctx, req.(*pbrequest.DeleteMembers))
	}
	return interceptor(ctx, in, info, handler)
}

// MemberManage_ServiceDesc is the grpc.ServiceDesc for MemberManage service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var MemberManage_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "spacemanager.MemberManage",
	HandlerType: (*MemberManageServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ListSystemRoles",
			Handler:    _MemberManage_ListSystemRoles_Handler,
		},
		{
			MethodName: "ListMembers",
			Handler:    _MemberManage_ListMembers_Handler,
		},
		{
			MethodName: "UpsertMembers",
			Handler:    _MemberManage_UpsertMembers_Handler,
		},
		{
			MethodName: "DeleteMembers",
			Handler:    _MemberManage_DeleteMembers_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/service/spacemanager/member_manage.proto",
}
