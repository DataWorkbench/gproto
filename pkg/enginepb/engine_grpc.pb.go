// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package enginepb

import (
	context "context"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// FlinkEngineServiceClient is the client API for FlinkEngineService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type FlinkEngineServiceClient interface {
	Create(ctx context.Context, in *CreateFlinkRequest, opts ...grpc.CallOption) (*CreateFlinkResponse, error)
	Describe(ctx context.Context, in *DescribeFlinkRequest, opts ...grpc.CallOption) (*DescribeFlinkResponse, error)
	Delete(ctx context.Context, in *DeleteFlinkRequest, opts ...grpc.CallOption) (*DeleteFlinkResponse, error)
}

type flinkEngineServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewFlinkEngineServiceClient(cc grpc.ClientConnInterface) FlinkEngineServiceClient {
	return &flinkEngineServiceClient{cc}
}

func (c *flinkEngineServiceClient) Create(ctx context.Context, in *CreateFlinkRequest, opts ...grpc.CallOption) (*CreateFlinkResponse, error) {
	out := new(CreateFlinkResponse)
	err := c.cc.Invoke(ctx, "/enginepb.FlinkEngineService/Create", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *flinkEngineServiceClient) Describe(ctx context.Context, in *DescribeFlinkRequest, opts ...grpc.CallOption) (*DescribeFlinkResponse, error) {
	out := new(DescribeFlinkResponse)
	err := c.cc.Invoke(ctx, "/enginepb.FlinkEngineService/Describe", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *flinkEngineServiceClient) Delete(ctx context.Context, in *DeleteFlinkRequest, opts ...grpc.CallOption) (*DeleteFlinkResponse, error) {
	out := new(DeleteFlinkResponse)
	err := c.cc.Invoke(ctx, "/enginepb.FlinkEngineService/Delete", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// FlinkEngineServiceServer is the server API for FlinkEngineService service.
// All implementations must embed UnimplementedFlinkEngineServiceServer
// for forward compatibility
type FlinkEngineServiceServer interface {
	Create(context.Context, *CreateFlinkRequest) (*CreateFlinkResponse, error)
	Describe(context.Context, *DescribeFlinkRequest) (*DescribeFlinkResponse, error)
	Delete(context.Context, *DeleteFlinkRequest) (*DeleteFlinkResponse, error)
	mustEmbedUnimplementedFlinkEngineServiceServer()
}

// UnimplementedFlinkEngineServiceServer must be embedded to have forward compatible implementations.
type UnimplementedFlinkEngineServiceServer struct {
}

func (UnimplementedFlinkEngineServiceServer) Create(context.Context, *CreateFlinkRequest) (*CreateFlinkResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Create not implemented")
}
func (UnimplementedFlinkEngineServiceServer) Describe(context.Context, *DescribeFlinkRequest) (*DescribeFlinkResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Describe not implemented")
}
func (UnimplementedFlinkEngineServiceServer) Delete(context.Context, *DeleteFlinkRequest) (*DeleteFlinkResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Delete not implemented")
}
func (UnimplementedFlinkEngineServiceServer) mustEmbedUnimplementedFlinkEngineServiceServer() {}

// UnsafeFlinkEngineServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to FlinkEngineServiceServer will
// result in compilation errors.
type UnsafeFlinkEngineServiceServer interface {
	mustEmbedUnimplementedFlinkEngineServiceServer()
}

func RegisterFlinkEngineServiceServer(s grpc.ServiceRegistrar, srv FlinkEngineServiceServer) {
	s.RegisterService(&_FlinkEngineService_serviceDesc, srv)
}

func _FlinkEngineService_Create_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(CreateFlinkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FlinkEngineServiceServer).Create(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/enginepb.FlinkEngineService/Create",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FlinkEngineServiceServer).Create(ctx, req.(*CreateFlinkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FlinkEngineService_Describe_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DescribeFlinkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FlinkEngineServiceServer).Describe(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/enginepb.FlinkEngineService/Describe",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FlinkEngineServiceServer).Describe(ctx, req.(*DescribeFlinkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FlinkEngineService_Delete_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteFlinkRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FlinkEngineServiceServer).Delete(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/enginepb.FlinkEngineService/Delete",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FlinkEngineServiceServer).Delete(ctx, req.(*DeleteFlinkRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _FlinkEngineService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "enginepb.FlinkEngineService",
	HandlerType: (*FlinkEngineServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Create",
			Handler:    _FlinkEngineService_Create_Handler,
		},
		{
			MethodName: "Describe",
			Handler:    _FlinkEngineService_Describe_Handler,
		},
		{
			MethodName: "Delete",
			Handler:    _FlinkEngineService_Delete_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/engine.proto",
}

// ExternalServiceClient is the client API for ExternalService service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type ExternalServiceClient interface {
	Register(ctx context.Context, in *RegisterRequest, opts ...grpc.CallOption) (*RegisterResponse, error)
	DeRegister(ctx context.Context, in *DeregisterRequest, opts ...grpc.CallOption) (*DeregisterResponse, error)
}

type externalServiceClient struct {
	cc grpc.ClientConnInterface
}

func NewExternalServiceClient(cc grpc.ClientConnInterface) ExternalServiceClient {
	return &externalServiceClient{cc}
}

func (c *externalServiceClient) Register(ctx context.Context, in *RegisterRequest, opts ...grpc.CallOption) (*RegisterResponse, error) {
	out := new(RegisterResponse)
	err := c.cc.Invoke(ctx, "/enginepb.ExternalService/Register", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *externalServiceClient) DeRegister(ctx context.Context, in *DeregisterRequest, opts ...grpc.CallOption) (*DeregisterResponse, error) {
	out := new(DeregisterResponse)
	err := c.cc.Invoke(ctx, "/enginepb.ExternalService/DeRegister", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// ExternalServiceServer is the server API for ExternalService service.
// All implementations must embed UnimplementedExternalServiceServer
// for forward compatibility
type ExternalServiceServer interface {
	Register(context.Context, *RegisterRequest) (*RegisterResponse, error)
	DeRegister(context.Context, *DeregisterRequest) (*DeregisterResponse, error)
	mustEmbedUnimplementedExternalServiceServer()
}

// UnimplementedExternalServiceServer must be embedded to have forward compatible implementations.
type UnimplementedExternalServiceServer struct {
}

func (UnimplementedExternalServiceServer) Register(context.Context, *RegisterRequest) (*RegisterResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Register not implemented")
}
func (UnimplementedExternalServiceServer) DeRegister(context.Context, *DeregisterRequest) (*DeregisterResponse, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeRegister not implemented")
}
func (UnimplementedExternalServiceServer) mustEmbedUnimplementedExternalServiceServer() {}

// UnsafeExternalServiceServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to ExternalServiceServer will
// result in compilation errors.
type UnsafeExternalServiceServer interface {
	mustEmbedUnimplementedExternalServiceServer()
}

func RegisterExternalServiceServer(s grpc.ServiceRegistrar, srv ExternalServiceServer) {
	s.RegisterService(&_ExternalService_serviceDesc, srv)
}

func _ExternalService_Register_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(RegisterRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ExternalServiceServer).Register(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/enginepb.ExternalService/Register",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ExternalServiceServer).Register(ctx, req.(*RegisterRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _ExternalService_DeRegister_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeregisterRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(ExternalServiceServer).DeRegister(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/enginepb.ExternalService/DeRegister",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(ExternalServiceServer).DeRegister(ctx, req.(*DeregisterRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _ExternalService_serviceDesc = grpc.ServiceDesc{
	ServiceName: "enginepb.ExternalService",
	HandlerType: (*ExternalServiceServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Register",
			Handler:    _ExternalService_Register_Handler,
		},
		{
			MethodName: "DeRegister",
			Handler:    _ExternalService_DeRegister_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/engine.proto",
}
