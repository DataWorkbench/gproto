// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package accountpb

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// AccountClient is the client API for Account service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AccountClient interface {
	ValidateRequestSignature(ctx context.Context, in *ValidateRequestSignatureRequest, opts ...grpc.CallOption) (*ValidateRequestSignatureReply, error)
	DescribeUsers(ctx context.Context, in *DescribeUsersRequest, opts ...grpc.CallOption) (*DescribeUsersReply, error)
}

type accountClient struct {
	cc grpc.ClientConnInterface
}

func NewAccountClient(cc grpc.ClientConnInterface) AccountClient {
	return &accountClient{cc}
}

func (c *accountClient) ValidateRequestSignature(ctx context.Context, in *ValidateRequestSignatureRequest, opts ...grpc.CallOption) (*ValidateRequestSignatureReply, error) {
	out := new(ValidateRequestSignatureReply)
	err := c.cc.Invoke(ctx, "/Account/ValidateRequestSignature", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *accountClient) DescribeUsers(ctx context.Context, in *DescribeUsersRequest, opts ...grpc.CallOption) (*DescribeUsersReply, error) {
	out := new(DescribeUsersReply)
	err := c.cc.Invoke(ctx, "/Account/DescribeUsers", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AccountServer is the server API for Account service.
// All implementations must embed UnimplementedAccountServer
// for forward compatibility
type AccountServer interface {
	ValidateRequestSignature(context.Context, *ValidateRequestSignatureRequest) (*ValidateRequestSignatureReply, error)
	DescribeUsers(context.Context, *DescribeUsersRequest) (*DescribeUsersReply, error)
	mustEmbedUnimplementedAccountServer()
}

// UnimplementedAccountServer must be embedded to have forward compatible implementations.
type UnimplementedAccountServer struct {
}

func (UnimplementedAccountServer) ValidateRequestSignature(context.Context, *ValidateRequestSignatureRequest) (*ValidateRequestSignatureReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ValidateRequestSignature not implemented")
}
func (UnimplementedAccountServer) DescribeUsers(context.Context, *DescribeUsersRequest) (*DescribeUsersReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeUsers not implemented")
}
func (UnimplementedAccountServer) mustEmbedUnimplementedAccountServer() {}

// UnsafeAccountServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AccountServer will
// result in compilation errors.
type UnsafeAccountServer interface {
	mustEmbedUnimplementedAccountServer()
}

func RegisterAccountServer(s grpc.ServiceRegistrar, srv AccountServer) {
	s.RegisterService(&_Account_serviceDesc, srv)
}

func _Account_ValidateRequestSignature_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ValidateRequestSignatureRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServer).ValidateRequestSignature(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/Account/ValidateRequestSignature",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServer).ValidateRequestSignature(ctx, req.(*ValidateRequestSignatureRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _Account_DescribeUsers_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DescribeUsersRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AccountServer).DescribeUsers(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/Account/DescribeUsers",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AccountServer).DescribeUsers(ctx, req.(*DescribeUsersRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _Account_serviceDesc = grpc.ServiceDesc{
	ServiceName: "Account",
	HandlerType: (*AccountServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ValidateRequestSignature",
			Handler:    _Account_ValidateRequestSignature_Handler,
		},
		{
			MethodName: "DescribeUsers",
			Handler:    _Account_DescribeUsers_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/account.proto",
}
