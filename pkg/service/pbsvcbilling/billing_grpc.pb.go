// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.3
// source: proto/service/billing/billing.proto

package pbsvcbilling

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

// BillingClient is the client API for Billing service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type BillingClient interface {
	GetBillingPriceComponents(ctx context.Context, in *pbmodel.EmptyStruct, opts ...grpc.CallOption) (*pbresponse.GetPriceComponents, error)
	CreateBillingInstance(ctx context.Context, in *pbrequest.CreateBillingInstance, opts ...grpc.CallOption) (*pbresponse.CreateBillingInstance, error)
	StopBillingInstance(ctx context.Context, in *pbrequest.StopBillingInstance, opts ...grpc.CallOption) (*pbresponse.StopBillingInstance, error)
	RecoveryBillingInstance(ctx context.Context, in *pbrequest.RecoveryBillingInstance, opts ...grpc.CallOption) (*pbresponse.RecoveryBillingInstance, error)
}

type billingClient struct {
	cc grpc.ClientConnInterface
}

func NewBillingClient(cc grpc.ClientConnInterface) BillingClient {
	return &billingClient{cc}
}

func (c *billingClient) GetBillingPriceComponents(ctx context.Context, in *pbmodel.EmptyStruct, opts ...grpc.CallOption) (*pbresponse.GetPriceComponents, error) {
	out := new(pbresponse.GetPriceComponents)
	err := c.cc.Invoke(ctx, "/billing.Billing/GetBillingPriceComponents", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *billingClient) CreateBillingInstance(ctx context.Context, in *pbrequest.CreateBillingInstance, opts ...grpc.CallOption) (*pbresponse.CreateBillingInstance, error) {
	out := new(pbresponse.CreateBillingInstance)
	err := c.cc.Invoke(ctx, "/billing.Billing/CreateBillingInstance", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *billingClient) StopBillingInstance(ctx context.Context, in *pbrequest.StopBillingInstance, opts ...grpc.CallOption) (*pbresponse.StopBillingInstance, error) {
	out := new(pbresponse.StopBillingInstance)
	err := c.cc.Invoke(ctx, "/billing.Billing/StopBillingInstance", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *billingClient) RecoveryBillingInstance(ctx context.Context, in *pbrequest.RecoveryBillingInstance, opts ...grpc.CallOption) (*pbresponse.RecoveryBillingInstance, error) {
	out := new(pbresponse.RecoveryBillingInstance)
	err := c.cc.Invoke(ctx, "/billing.Billing/RecoveryBillingInstance", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// BillingServer is the server API for Billing service.
// All implementations must embed UnimplementedBillingServer
// for forward compatibility
type BillingServer interface {
	GetBillingPriceComponents(context.Context, *pbmodel.EmptyStruct) (*pbresponse.GetPriceComponents, error)
	CreateBillingInstance(context.Context, *pbrequest.CreateBillingInstance) (*pbresponse.CreateBillingInstance, error)
	StopBillingInstance(context.Context, *pbrequest.StopBillingInstance) (*pbresponse.StopBillingInstance, error)
	RecoveryBillingInstance(context.Context, *pbrequest.RecoveryBillingInstance) (*pbresponse.RecoveryBillingInstance, error)
	mustEmbedUnimplementedBillingServer()
}

// UnimplementedBillingServer must be embedded to have forward compatible implementations.
type UnimplementedBillingServer struct {
}

func (UnimplementedBillingServer) GetBillingPriceComponents(context.Context, *pbmodel.EmptyStruct) (*pbresponse.GetPriceComponents, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetBillingPriceComponents not implemented")
}
func (UnimplementedBillingServer) CreateBillingInstance(context.Context, *pbrequest.CreateBillingInstance) (*pbresponse.CreateBillingInstance, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateBillingInstance not implemented")
}
func (UnimplementedBillingServer) StopBillingInstance(context.Context, *pbrequest.StopBillingInstance) (*pbresponse.StopBillingInstance, error) {
	return nil, status.Errorf(codes.Unimplemented, "method StopBillingInstance not implemented")
}
func (UnimplementedBillingServer) RecoveryBillingInstance(context.Context, *pbrequest.RecoveryBillingInstance) (*pbresponse.RecoveryBillingInstance, error) {
	return nil, status.Errorf(codes.Unimplemented, "method RecoveryBillingInstance not implemented")
}
func (UnimplementedBillingServer) mustEmbedUnimplementedBillingServer() {}

// UnsafeBillingServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to BillingServer will
// result in compilation errors.
type UnsafeBillingServer interface {
	mustEmbedUnimplementedBillingServer()
}

func RegisterBillingServer(s grpc.ServiceRegistrar, srv BillingServer) {
	s.RegisterService(&Billing_ServiceDesc, srv)
}

func _Billing_GetBillingPriceComponents_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbmodel.EmptyStruct)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BillingServer).GetBillingPriceComponents(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/billing.Billing/GetBillingPriceComponents",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BillingServer).GetBillingPriceComponents(ctx, req.(*pbmodel.EmptyStruct))
	}
	return interceptor(ctx, in, info, handler)
}

func _Billing_CreateBillingInstance_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.CreateBillingInstance)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BillingServer).CreateBillingInstance(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/billing.Billing/CreateBillingInstance",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BillingServer).CreateBillingInstance(ctx, req.(*pbrequest.CreateBillingInstance))
	}
	return interceptor(ctx, in, info, handler)
}

func _Billing_StopBillingInstance_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.StopBillingInstance)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BillingServer).StopBillingInstance(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/billing.Billing/StopBillingInstance",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BillingServer).StopBillingInstance(ctx, req.(*pbrequest.StopBillingInstance))
	}
	return interceptor(ctx, in, info, handler)
}

func _Billing_RecoveryBillingInstance_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.RecoveryBillingInstance)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(BillingServer).RecoveryBillingInstance(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/billing.Billing/RecoveryBillingInstance",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(BillingServer).RecoveryBillingInstance(ctx, req.(*pbrequest.RecoveryBillingInstance))
	}
	return interceptor(ctx, in, info, handler)
}

// Billing_ServiceDesc is the grpc.ServiceDesc for Billing service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var Billing_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "billing.Billing",
	HandlerType: (*BillingServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "GetBillingPriceComponents",
			Handler:    _Billing_GetBillingPriceComponents_Handler,
		},
		{
			MethodName: "CreateBillingInstance",
			Handler:    _Billing_CreateBillingInstance_Handler,
		},
		{
			MethodName: "StopBillingInstance",
			Handler:    _Billing_StopBillingInstance_Handler,
		},
		{
			MethodName: "RecoveryBillingInstance",
			Handler:    _Billing_RecoveryBillingInstance_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/service/billing/billing.proto",
}
