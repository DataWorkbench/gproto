// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package shpb

import (
	context "context"
	model "github.com/DataWorkbench/gproto/pkg/model"
	request "github.com/DataWorkbench/gproto/pkg/request"
	response "github.com/DataWorkbench/gproto/pkg/response"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// SchedulerClient is the client API for Scheduler service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type SchedulerClient interface {
	// Interface for stream workflow task.
	//
	// DeleteFlowsBySpaceIds delete the specified workspaces and its resources;
	// This Interface called by flowmanager(DeleteFlowsBySpaceIds).
	// Resources Includes:
	//   - Offline workflow and force stop all running instances.
	//   - All instances records.
	DeleteFlowsBySpaceIds(ctx context.Context, in *request.DeleteWorkspaces, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	// DeleteStreamFlows delete stream workflow ant its related resources where in ids.
	// Resources includes:
	//  - Offline workflow and force stop all running instances.
	//  - All instances records.
	DeleteStreamFlows(ctx context.Context, in *request.DeleteStreamFlows, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	// FIXME
	// Execute execute immediately a workflow task. It trigger by user on console.
	ExecuteStreamFlow(ctx context.Context, in *request.ExecuteStreamFlow, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	// Submit submit a workflow task to scheduler system, It will
	// be cover if old job exists.
	// FIXME
	SubmitStreamFlows(ctx context.Context, in *request.SubmitStreamFlows, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	// Remove remove specific workflow task from scheduler system.
	// FIXME
	OfflineStreamFlows(ctx context.Context, in *request.OfflineStreamFlows, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	// Interface for stream workflow cycle instance.
	//
	ListStreamCycleInsts(ctx context.Context, in *request.ListStreamInsts, opts ...grpc.CallOption) (*response.ListStreamInsts, error)
	TerminateStreamCycleInsts(ctx context.Context, in *request.TerminateStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	SuspendStreamCycleInsts(ctx context.Context, in *request.SuspendStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	ResumeStreamCycleInsts(ctx context.Context, in *request.ResumeStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	// Interface for stream workflow test instance.
	//
	ListStreamTestInsts(ctx context.Context, in *request.ListStreamInsts, opts ...grpc.CallOption) (*response.ListStreamInsts, error)
	TerminateStreamTestInsts(ctx context.Context, in *request.TerminateStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	SuspendStreamTestInsts(ctx context.Context, in *request.SuspendStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	ResumeStreamTestInsts(ctx context.Context, in *request.ResumeStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	// Interface for monitor.
	ListMonitorRules(ctx context.Context, in *request.ListMonitorRules, opts ...grpc.CallOption) (*response.ListMonitorRules, error)
	DeleteMonitorRules(ctx context.Context, in *request.DeleteMonitorRules, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	EnableMonitorRules(ctx context.Context, in *request.EnableMonitorRules, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	DisableMonitorRules(ctx context.Context, in *request.DisableMonitorRules, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	CreateMonitorRule(ctx context.Context, in *request.CreateMonitorRule, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	UpdateMonitorRule(ctx context.Context, in *request.UpdateMonitorRule, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	DescribeMonitorRule(ctx context.Context, in *request.DescribeMonitorRule, opts ...grpc.CallOption) (*response.DescribeMonitorRule, error)
}

type schedulerClient struct {
	cc grpc.ClientConnInterface
}

func NewSchedulerClient(cc grpc.ClientConnInterface) SchedulerClient {
	return &schedulerClient{cc}
}

func (c *schedulerClient) DeleteFlowsBySpaceIds(ctx context.Context, in *request.DeleteWorkspaces, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/DeleteFlowsBySpaceIds", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) DeleteStreamFlows(ctx context.Context, in *request.DeleteStreamFlows, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/DeleteStreamFlows", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) ExecuteStreamFlow(ctx context.Context, in *request.ExecuteStreamFlow, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/ExecuteStreamFlow", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) SubmitStreamFlows(ctx context.Context, in *request.SubmitStreamFlows, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/SubmitStreamFlows", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) OfflineStreamFlows(ctx context.Context, in *request.OfflineStreamFlows, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/OfflineStreamFlows", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) ListStreamCycleInsts(ctx context.Context, in *request.ListStreamInsts, opts ...grpc.CallOption) (*response.ListStreamInsts, error) {
	out := new(response.ListStreamInsts)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/ListStreamCycleInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) TerminateStreamCycleInsts(ctx context.Context, in *request.TerminateStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/TerminateStreamCycleInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) SuspendStreamCycleInsts(ctx context.Context, in *request.SuspendStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/SuspendStreamCycleInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) ResumeStreamCycleInsts(ctx context.Context, in *request.ResumeStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/ResumeStreamCycleInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) ListStreamTestInsts(ctx context.Context, in *request.ListStreamInsts, opts ...grpc.CallOption) (*response.ListStreamInsts, error) {
	out := new(response.ListStreamInsts)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/ListStreamTestInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) TerminateStreamTestInsts(ctx context.Context, in *request.TerminateStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/TerminateStreamTestInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) SuspendStreamTestInsts(ctx context.Context, in *request.SuspendStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/SuspendStreamTestInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) ResumeStreamTestInsts(ctx context.Context, in *request.ResumeStreamInsts, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/ResumeStreamTestInsts", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) ListMonitorRules(ctx context.Context, in *request.ListMonitorRules, opts ...grpc.CallOption) (*response.ListMonitorRules, error) {
	out := new(response.ListMonitorRules)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/ListMonitorRules", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) DeleteMonitorRules(ctx context.Context, in *request.DeleteMonitorRules, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/DeleteMonitorRules", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) EnableMonitorRules(ctx context.Context, in *request.EnableMonitorRules, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/EnableMonitorRules", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) DisableMonitorRules(ctx context.Context, in *request.DisableMonitorRules, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/DisableMonitorRules", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) CreateMonitorRule(ctx context.Context, in *request.CreateMonitorRule, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/CreateMonitorRule", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) UpdateMonitorRule(ctx context.Context, in *request.UpdateMonitorRule, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/UpdateMonitorRule", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *schedulerClient) DescribeMonitorRule(ctx context.Context, in *request.DescribeMonitorRule, opts ...grpc.CallOption) (*response.DescribeMonitorRule, error) {
	out := new(response.DescribeMonitorRule)
	err := c.cc.Invoke(ctx, "/shpb.Scheduler/DescribeMonitorRule", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// SchedulerServer is the server API for Scheduler service.
// All implementations must embed UnimplementedSchedulerServer
// for forward compatibility
type SchedulerServer interface {
	// Interface for stream workflow task.
	//
	// DeleteFlowsBySpaceIds delete the specified workspaces and its resources;
	// This Interface called by flowmanager(DeleteFlowsBySpaceIds).
	// Resources Includes:
	//   - Offline workflow and force stop all running instances.
	//   - All instances records.
	DeleteFlowsBySpaceIds(context.Context, *request.DeleteWorkspaces) (*model.EmptyStruct, error)
	// DeleteStreamFlows delete stream workflow ant its related resources where in ids.
	// Resources includes:
	//  - Offline workflow and force stop all running instances.
	//  - All instances records.
	DeleteStreamFlows(context.Context, *request.DeleteStreamFlows) (*model.EmptyStruct, error)
	// FIXME
	// Execute execute immediately a workflow task. It trigger by user on console.
	ExecuteStreamFlow(context.Context, *request.ExecuteStreamFlow) (*model.EmptyStruct, error)
	// Submit submit a workflow task to scheduler system, It will
	// be cover if old job exists.
	// FIXME
	SubmitStreamFlows(context.Context, *request.SubmitStreamFlows) (*model.EmptyStruct, error)
	// Remove remove specific workflow task from scheduler system.
	// FIXME
	OfflineStreamFlows(context.Context, *request.OfflineStreamFlows) (*model.EmptyStruct, error)
	// Interface for stream workflow cycle instance.
	//
	ListStreamCycleInsts(context.Context, *request.ListStreamInsts) (*response.ListStreamInsts, error)
	TerminateStreamCycleInsts(context.Context, *request.TerminateStreamInsts) (*model.EmptyStruct, error)
	SuspendStreamCycleInsts(context.Context, *request.SuspendStreamInsts) (*model.EmptyStruct, error)
	ResumeStreamCycleInsts(context.Context, *request.ResumeStreamInsts) (*model.EmptyStruct, error)
	// Interface for stream workflow test instance.
	//
	ListStreamTestInsts(context.Context, *request.ListStreamInsts) (*response.ListStreamInsts, error)
	TerminateStreamTestInsts(context.Context, *request.TerminateStreamInsts) (*model.EmptyStruct, error)
	SuspendStreamTestInsts(context.Context, *request.SuspendStreamInsts) (*model.EmptyStruct, error)
	ResumeStreamTestInsts(context.Context, *request.ResumeStreamInsts) (*model.EmptyStruct, error)
	// Interface for monitor.
	ListMonitorRules(context.Context, *request.ListMonitorRules) (*response.ListMonitorRules, error)
	DeleteMonitorRules(context.Context, *request.DeleteMonitorRules) (*model.EmptyStruct, error)
	EnableMonitorRules(context.Context, *request.EnableMonitorRules) (*model.EmptyStruct, error)
	DisableMonitorRules(context.Context, *request.DisableMonitorRules) (*model.EmptyStruct, error)
	CreateMonitorRule(context.Context, *request.CreateMonitorRule) (*model.EmptyStruct, error)
	UpdateMonitorRule(context.Context, *request.UpdateMonitorRule) (*model.EmptyStruct, error)
	DescribeMonitorRule(context.Context, *request.DescribeMonitorRule) (*response.DescribeMonitorRule, error)
	mustEmbedUnimplementedSchedulerServer()
}

// UnimplementedSchedulerServer must be embedded to have forward compatible implementations.
type UnimplementedSchedulerServer struct {
}

func (UnimplementedSchedulerServer) DeleteFlowsBySpaceIds(context.Context, *request.DeleteWorkspaces) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteFlowsBySpaceIds not implemented")
}
func (UnimplementedSchedulerServer) DeleteStreamFlows(context.Context, *request.DeleteStreamFlows) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteStreamFlows not implemented")
}
func (UnimplementedSchedulerServer) ExecuteStreamFlow(context.Context, *request.ExecuteStreamFlow) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ExecuteStreamFlow not implemented")
}
func (UnimplementedSchedulerServer) SubmitStreamFlows(context.Context, *request.SubmitStreamFlows) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SubmitStreamFlows not implemented")
}
func (UnimplementedSchedulerServer) OfflineStreamFlows(context.Context, *request.OfflineStreamFlows) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method OfflineStreamFlows not implemented")
}
func (UnimplementedSchedulerServer) ListStreamCycleInsts(context.Context, *request.ListStreamInsts) (*response.ListStreamInsts, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListStreamCycleInsts not implemented")
}
func (UnimplementedSchedulerServer) TerminateStreamCycleInsts(context.Context, *request.TerminateStreamInsts) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method TerminateStreamCycleInsts not implemented")
}
func (UnimplementedSchedulerServer) SuspendStreamCycleInsts(context.Context, *request.SuspendStreamInsts) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SuspendStreamCycleInsts not implemented")
}
func (UnimplementedSchedulerServer) ResumeStreamCycleInsts(context.Context, *request.ResumeStreamInsts) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ResumeStreamCycleInsts not implemented")
}
func (UnimplementedSchedulerServer) ListStreamTestInsts(context.Context, *request.ListStreamInsts) (*response.ListStreamInsts, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListStreamTestInsts not implemented")
}
func (UnimplementedSchedulerServer) TerminateStreamTestInsts(context.Context, *request.TerminateStreamInsts) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method TerminateStreamTestInsts not implemented")
}
func (UnimplementedSchedulerServer) SuspendStreamTestInsts(context.Context, *request.SuspendStreamInsts) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SuspendStreamTestInsts not implemented")
}
func (UnimplementedSchedulerServer) ResumeStreamTestInsts(context.Context, *request.ResumeStreamInsts) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ResumeStreamTestInsts not implemented")
}
func (UnimplementedSchedulerServer) ListMonitorRules(context.Context, *request.ListMonitorRules) (*response.ListMonitorRules, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListMonitorRules not implemented")
}
func (UnimplementedSchedulerServer) DeleteMonitorRules(context.Context, *request.DeleteMonitorRules) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteMonitorRules not implemented")
}
func (UnimplementedSchedulerServer) EnableMonitorRules(context.Context, *request.EnableMonitorRules) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method EnableMonitorRules not implemented")
}
func (UnimplementedSchedulerServer) DisableMonitorRules(context.Context, *request.DisableMonitorRules) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DisableMonitorRules not implemented")
}
func (UnimplementedSchedulerServer) CreateMonitorRule(context.Context, *request.CreateMonitorRule) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateMonitorRule not implemented")
}
func (UnimplementedSchedulerServer) UpdateMonitorRule(context.Context, *request.UpdateMonitorRule) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateMonitorRule not implemented")
}
func (UnimplementedSchedulerServer) DescribeMonitorRule(context.Context, *request.DescribeMonitorRule) (*response.DescribeMonitorRule, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeMonitorRule not implemented")
}
func (UnimplementedSchedulerServer) mustEmbedUnimplementedSchedulerServer() {}

// UnsafeSchedulerServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to SchedulerServer will
// result in compilation errors.
type UnsafeSchedulerServer interface {
	mustEmbedUnimplementedSchedulerServer()
}

func RegisterSchedulerServer(s grpc.ServiceRegistrar, srv SchedulerServer) {
	s.RegisterService(&_Scheduler_serviceDesc, srv)
}

func _Scheduler_DeleteFlowsBySpaceIds_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.DeleteWorkspaces)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).DeleteFlowsBySpaceIds(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/DeleteFlowsBySpaceIds",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).DeleteFlowsBySpaceIds(ctx, req.(*request.DeleteWorkspaces))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_DeleteStreamFlows_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.DeleteStreamFlows)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).DeleteStreamFlows(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/DeleteStreamFlows",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).DeleteStreamFlows(ctx, req.(*request.DeleteStreamFlows))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_ExecuteStreamFlow_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.ExecuteStreamFlow)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).ExecuteStreamFlow(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/ExecuteStreamFlow",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).ExecuteStreamFlow(ctx, req.(*request.ExecuteStreamFlow))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_SubmitStreamFlows_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.SubmitStreamFlows)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).SubmitStreamFlows(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/SubmitStreamFlows",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).SubmitStreamFlows(ctx, req.(*request.SubmitStreamFlows))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_OfflineStreamFlows_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.OfflineStreamFlows)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).OfflineStreamFlows(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/OfflineStreamFlows",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).OfflineStreamFlows(ctx, req.(*request.OfflineStreamFlows))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_ListStreamCycleInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.ListStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).ListStreamCycleInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/ListStreamCycleInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).ListStreamCycleInsts(ctx, req.(*request.ListStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_TerminateStreamCycleInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.TerminateStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).TerminateStreamCycleInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/TerminateStreamCycleInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).TerminateStreamCycleInsts(ctx, req.(*request.TerminateStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_SuspendStreamCycleInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.SuspendStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).SuspendStreamCycleInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/SuspendStreamCycleInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).SuspendStreamCycleInsts(ctx, req.(*request.SuspendStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_ResumeStreamCycleInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.ResumeStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).ResumeStreamCycleInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/ResumeStreamCycleInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).ResumeStreamCycleInsts(ctx, req.(*request.ResumeStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_ListStreamTestInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.ListStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).ListStreamTestInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/ListStreamTestInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).ListStreamTestInsts(ctx, req.(*request.ListStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_TerminateStreamTestInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.TerminateStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).TerminateStreamTestInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/TerminateStreamTestInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).TerminateStreamTestInsts(ctx, req.(*request.TerminateStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_SuspendStreamTestInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.SuspendStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).SuspendStreamTestInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/SuspendStreamTestInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).SuspendStreamTestInsts(ctx, req.(*request.SuspendStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_ResumeStreamTestInsts_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.ResumeStreamInsts)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).ResumeStreamTestInsts(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/ResumeStreamTestInsts",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).ResumeStreamTestInsts(ctx, req.(*request.ResumeStreamInsts))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_ListMonitorRules_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.ListMonitorRules)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).ListMonitorRules(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/ListMonitorRules",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).ListMonitorRules(ctx, req.(*request.ListMonitorRules))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_DeleteMonitorRules_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.DeleteMonitorRules)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).DeleteMonitorRules(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/DeleteMonitorRules",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).DeleteMonitorRules(ctx, req.(*request.DeleteMonitorRules))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_EnableMonitorRules_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.EnableMonitorRules)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).EnableMonitorRules(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/EnableMonitorRules",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).EnableMonitorRules(ctx, req.(*request.EnableMonitorRules))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_DisableMonitorRules_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.DisableMonitorRules)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).DisableMonitorRules(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/DisableMonitorRules",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).DisableMonitorRules(ctx, req.(*request.DisableMonitorRules))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_CreateMonitorRule_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.CreateMonitorRule)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).CreateMonitorRule(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/CreateMonitorRule",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).CreateMonitorRule(ctx, req.(*request.CreateMonitorRule))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_UpdateMonitorRule_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.UpdateMonitorRule)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).UpdateMonitorRule(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/UpdateMonitorRule",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).UpdateMonitorRule(ctx, req.(*request.UpdateMonitorRule))
	}
	return interceptor(ctx, in, info, handler)
}

func _Scheduler_DescribeMonitorRule_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(request.DescribeMonitorRule)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(SchedulerServer).DescribeMonitorRule(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/shpb.Scheduler/DescribeMonitorRule",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(SchedulerServer).DescribeMonitorRule(ctx, req.(*request.DescribeMonitorRule))
	}
	return interceptor(ctx, in, info, handler)
}

var _Scheduler_serviceDesc = grpc.ServiceDesc{
	ServiceName: "shpb.Scheduler",
	HandlerType: (*SchedulerServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "DeleteFlowsBySpaceIds",
			Handler:    _Scheduler_DeleteFlowsBySpaceIds_Handler,
		},
		{
			MethodName: "DeleteStreamFlows",
			Handler:    _Scheduler_DeleteStreamFlows_Handler,
		},
		{
			MethodName: "ExecuteStreamFlow",
			Handler:    _Scheduler_ExecuteStreamFlow_Handler,
		},
		{
			MethodName: "SubmitStreamFlows",
			Handler:    _Scheduler_SubmitStreamFlows_Handler,
		},
		{
			MethodName: "OfflineStreamFlows",
			Handler:    _Scheduler_OfflineStreamFlows_Handler,
		},
		{
			MethodName: "ListStreamCycleInsts",
			Handler:    _Scheduler_ListStreamCycleInsts_Handler,
		},
		{
			MethodName: "TerminateStreamCycleInsts",
			Handler:    _Scheduler_TerminateStreamCycleInsts_Handler,
		},
		{
			MethodName: "SuspendStreamCycleInsts",
			Handler:    _Scheduler_SuspendStreamCycleInsts_Handler,
		},
		{
			MethodName: "ResumeStreamCycleInsts",
			Handler:    _Scheduler_ResumeStreamCycleInsts_Handler,
		},
		{
			MethodName: "ListStreamTestInsts",
			Handler:    _Scheduler_ListStreamTestInsts_Handler,
		},
		{
			MethodName: "TerminateStreamTestInsts",
			Handler:    _Scheduler_TerminateStreamTestInsts_Handler,
		},
		{
			MethodName: "SuspendStreamTestInsts",
			Handler:    _Scheduler_SuspendStreamTestInsts_Handler,
		},
		{
			MethodName: "ResumeStreamTestInsts",
			Handler:    _Scheduler_ResumeStreamTestInsts_Handler,
		},
		{
			MethodName: "ListMonitorRules",
			Handler:    _Scheduler_ListMonitorRules_Handler,
		},
		{
			MethodName: "DeleteMonitorRules",
			Handler:    _Scheduler_DeleteMonitorRules_Handler,
		},
		{
			MethodName: "EnableMonitorRules",
			Handler:    _Scheduler_EnableMonitorRules_Handler,
		},
		{
			MethodName: "DisableMonitorRules",
			Handler:    _Scheduler_DisableMonitorRules_Handler,
		},
		{
			MethodName: "CreateMonitorRule",
			Handler:    _Scheduler_CreateMonitorRule_Handler,
		},
		{
			MethodName: "UpdateMonitorRule",
			Handler:    _Scheduler_UpdateMonitorRule_Handler,
		},
		{
			MethodName: "DescribeMonitorRule",
			Handler:    _Scheduler_DescribeMonitorRule_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/scheduler.proto",
}
