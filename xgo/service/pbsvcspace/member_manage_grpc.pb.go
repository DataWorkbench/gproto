// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.3
// source: proto/service/spacemanager/member_manage.proto

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

// MemberManageClient is the client API for MemberManage service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type MemberManageClient interface {
	// ListAvailableUsers for get all available users. not work when in IaaS.
	ListAvailableUsers(ctx context.Context, in *pbrequest.ListAvailableUsers, opts ...grpc.CallOption) (*pbresponse.ListAvailableUsers, error)
	// ListMembers get a lists of workspace member.
	ListMembers(ctx context.Context, in *pbrequest.ListMembers, opts ...grpc.CallOption) (*pbresponse.ListMembers, error)
	DeleteMembers(ctx context.Context, in *pbrequest.DeleteMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	AddMembers(ctx context.Context, in *pbrequest.AddMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	UpdateMember(ctx context.Context, in *pbrequest.UpdateMember, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DescribeMember(ctx context.Context, in *pbrequest.DescribeMember, opts ...grpc.CallOption) (*pbresponse.DescribeMember, error)
}

type memberManageClient struct {
	cc grpc.ClientConnInterface
}

func NewMemberManageClient(cc grpc.ClientConnInterface) MemberManageClient {
	return &memberManageClient{cc}
}

func (c *memberManageClient) ListAvailableUsers(ctx context.Context, in *pbrequest.ListAvailableUsers, opts ...grpc.CallOption) (*pbresponse.ListAvailableUsers, error) {
	out := new(pbresponse.ListAvailableUsers)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/ListAvailableUsers", in, out, opts...)
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

func (c *memberManageClient) DeleteMembers(ctx context.Context, in *pbrequest.DeleteMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/DeleteMembers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *memberManageClient) AddMembers(ctx context.Context, in *pbrequest.AddMembers, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/AddMembers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *memberManageClient) UpdateMember(ctx context.Context, in *pbrequest.UpdateMember, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/UpdateMember", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *memberManageClient) DescribeMember(ctx context.Context, in *pbrequest.DescribeMember, opts ...grpc.CallOption) (*pbresponse.DescribeMember, error) {
	out := new(pbresponse.DescribeMember)
	err := c.cc.Invoke(ctx, "/spacemanager.MemberManage/DescribeMember", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// MemberManageServer is the server API for MemberManage service.
// All implementations must embed UnimplementedMemberManageServer
// for forward compatibility
type MemberManageServer interface {
	// ListAvailableUsers for get all available users. not work when in IaaS.
	ListAvailableUsers(context.Context, *pbrequest.ListAvailableUsers) (*pbresponse.ListAvailableUsers, error)
	// ListMembers get a lists of workspace member.
	ListMembers(context.Context, *pbrequest.ListMembers) (*pbresponse.ListMembers, error)
	DeleteMembers(context.Context, *pbrequest.DeleteMembers) (*pbmodel.EmptyStruct, error)
	AddMembers(context.Context, *pbrequest.AddMembers) (*pbmodel.EmptyStruct, error)
	UpdateMember(context.Context, *pbrequest.UpdateMember) (*pbmodel.EmptyStruct, error)
	DescribeMember(context.Context, *pbrequest.DescribeMember) (*pbresponse.DescribeMember, error)
	mustEmbedUnimplementedMemberManageServer()
}

// UnimplementedMemberManageServer must be embedded to have forward compatible implementations.
type UnimplementedMemberManageServer struct {
}

func (UnimplementedMemberManageServer) ListAvailableUsers(context.Context, *pbrequest.ListAvailableUsers) (*pbresponse.ListAvailableUsers, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListAvailableUsers not implemented")
}
func (UnimplementedMemberManageServer) ListMembers(context.Context, *pbrequest.ListMembers) (*pbresponse.ListMembers, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListMembers not implemented")
}
func (UnimplementedMemberManageServer) DeleteMembers(context.Context, *pbrequest.DeleteMembers) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteMembers not implemented")
}
func (UnimplementedMemberManageServer) AddMembers(context.Context, *pbrequest.AddMembers) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AddMembers not implemented")
}
func (UnimplementedMemberManageServer) UpdateMember(context.Context, *pbrequest.UpdateMember) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateMember not implemented")
}
func (UnimplementedMemberManageServer) DescribeMember(context.Context, *pbrequest.DescribeMember) (*pbresponse.DescribeMember, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeMember not implemented")
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

func _MemberManage_ListAvailableUsers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListAvailableUsers)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).ListAvailableUsers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/ListAvailableUsers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).ListAvailableUsers(ctx, req.(*pbrequest.ListAvailableUsers))
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

func _MemberManage_AddMembers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.AddMembers)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).AddMembers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/AddMembers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).AddMembers(ctx, req.(*pbrequest.AddMembers))
	}
	return interceptor(ctx, in, info, handler)
}

func _MemberManage_UpdateMember_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.UpdateMember)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).UpdateMember(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/UpdateMember",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).UpdateMember(ctx, req.(*pbrequest.UpdateMember))
	}
	return interceptor(ctx, in, info, handler)
}

func _MemberManage_DescribeMember_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeMember)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(MemberManageServer).DescribeMember(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.MemberManage/DescribeMember",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(MemberManageServer).DescribeMember(ctx, req.(*pbrequest.DescribeMember))
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
			MethodName: "ListAvailableUsers",
			Handler:    _MemberManage_ListAvailableUsers_Handler,
		},
		{
			MethodName: "ListMembers",
			Handler:    _MemberManage_ListMembers_Handler,
		},
		{
			MethodName: "DeleteMembers",
			Handler:    _MemberManage_DeleteMembers_Handler,
		},
		{
			MethodName: "AddMembers",
			Handler:    _MemberManage_AddMembers_Handler,
		},
		{
			MethodName: "UpdateMember",
			Handler:    _MemberManage_UpdateMember_Handler,
		},
		{
			MethodName: "DescribeMember",
			Handler:    _MemberManage_DescribeMember_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/service/spacemanager/member_manage.proto",
}
