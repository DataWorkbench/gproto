// Code generated by protoc-gen-go-grpc. DO NOT EDIT.
// versions:
// - protoc-gen-go-grpc v1.2.0
// - protoc             v3.19.3
// source: proto/service/spacemanager/alert_manage.proto

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

// AlertManageClient is the client API for AlertManage service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type AlertManageClient interface {
	ListAlertPolicies(ctx context.Context, in *pbrequest.ListAlertPolicies, opts ...grpc.CallOption) (*pbresponse.ListAlertPolicies, error)
	DeleteAlertPolicies(ctx context.Context, in *pbrequest.DeleteAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	EnableAlertPolicies(ctx context.Context, in *pbrequest.EnableAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DisableAlertPolicies(ctx context.Context, in *pbrequest.DisableAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	CreateAlertPolicy(ctx context.Context, in *pbrequest.CreateAlertPolicy, opts ...grpc.CallOption) (*pbresponse.CreateAlertPolicy, error)
	UpdateAlertPolicy(ctx context.Context, in *pbrequest.UpdateAlertPolicy, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	DescribeAlertPolicy(ctx context.Context, in *pbrequest.DescribeAlertPolicy, opts ...grpc.CallOption) (*pbresponse.DescribeAlertPolicy, error)
	// JobBoundAlertPolicy bind the alert policies to the specified job(stream or sync)
	JobBoundAlertPolicies(ctx context.Context, in *pbrequest.JobBoundAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	// JobUnboundAlertPolicies unbind the alert policies from the specified job.
	JobUnboundAlertPolicies(ctx context.Context, in *pbrequest.JobUnboundAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	// ListAlertPoliciesByJob query which alert policies are bound to the specified job(stream or sync).
	ListAlertPoliciesByJob(ctx context.Context, in *pbrequest.ListAlertPoliciesByJob, opts ...grpc.CallOption) (*pbresponse.ListAlertPoliciesByJob, error)
	// AlertPolicyBoundJobs bind the jobs(stream or sync) to specified alert policy.
	AlertPolicyBoundJobs(ctx context.Context, in *pbrequest.AlertPolicyBoundJobs, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	// AlertPolicyUnboundJobs unbind the jobs(stream or sync) from the specified alert policy.
	AlertPolicyUnboundJobs(ctx context.Context, in *pbrequest.AlertPolicyUnboundJobs, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
	// ListJobsByAlertPolicy query which jobs are bound to the specified alert policy.
	ListJobsByAlertPolicy(ctx context.Context, in *pbrequest.ListJobsByAlertPolicy, opts ...grpc.CallOption) (*pbresponse.ListJobsByAlertPolicy, error)
	ListAlertLogs(ctx context.Context, in *pbrequest.ListAlertLogs, opts ...grpc.CallOption) (*pbresponse.ListAlertLogs, error)
	// Internal API
	SendAlert(ctx context.Context, in *pbrequest.SendAlert, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error)
}

type alertManageClient struct {
	cc grpc.ClientConnInterface
}

func NewAlertManageClient(cc grpc.ClientConnInterface) AlertManageClient {
	return &alertManageClient{cc}
}

func (c *alertManageClient) ListAlertPolicies(ctx context.Context, in *pbrequest.ListAlertPolicies, opts ...grpc.CallOption) (*pbresponse.ListAlertPolicies, error) {
	out := new(pbresponse.ListAlertPolicies)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/ListAlertPolicies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) DeleteAlertPolicies(ctx context.Context, in *pbrequest.DeleteAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/DeleteAlertPolicies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) EnableAlertPolicies(ctx context.Context, in *pbrequest.EnableAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/EnableAlertPolicies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) DisableAlertPolicies(ctx context.Context, in *pbrequest.DisableAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/DisableAlertPolicies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) CreateAlertPolicy(ctx context.Context, in *pbrequest.CreateAlertPolicy, opts ...grpc.CallOption) (*pbresponse.CreateAlertPolicy, error) {
	out := new(pbresponse.CreateAlertPolicy)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/CreateAlertPolicy", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) UpdateAlertPolicy(ctx context.Context, in *pbrequest.UpdateAlertPolicy, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/UpdateAlertPolicy", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) DescribeAlertPolicy(ctx context.Context, in *pbrequest.DescribeAlertPolicy, opts ...grpc.CallOption) (*pbresponse.DescribeAlertPolicy, error) {
	out := new(pbresponse.DescribeAlertPolicy)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/DescribeAlertPolicy", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) JobBoundAlertPolicies(ctx context.Context, in *pbrequest.JobBoundAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/JobBoundAlertPolicies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) JobUnboundAlertPolicies(ctx context.Context, in *pbrequest.JobUnboundAlertPolicies, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/JobUnboundAlertPolicies", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) ListAlertPoliciesByJob(ctx context.Context, in *pbrequest.ListAlertPoliciesByJob, opts ...grpc.CallOption) (*pbresponse.ListAlertPoliciesByJob, error) {
	out := new(pbresponse.ListAlertPoliciesByJob)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/ListAlertPoliciesByJob", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) AlertPolicyBoundJobs(ctx context.Context, in *pbrequest.AlertPolicyBoundJobs, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/AlertPolicyBoundJobs", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) AlertPolicyUnboundJobs(ctx context.Context, in *pbrequest.AlertPolicyUnboundJobs, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/AlertPolicyUnboundJobs", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) ListJobsByAlertPolicy(ctx context.Context, in *pbrequest.ListJobsByAlertPolicy, opts ...grpc.CallOption) (*pbresponse.ListJobsByAlertPolicy, error) {
	out := new(pbresponse.ListJobsByAlertPolicy)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/ListJobsByAlertPolicy", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) ListAlertLogs(ctx context.Context, in *pbrequest.ListAlertLogs, opts ...grpc.CallOption) (*pbresponse.ListAlertLogs, error) {
	out := new(pbresponse.ListAlertLogs)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/ListAlertLogs", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *alertManageClient) SendAlert(ctx context.Context, in *pbrequest.SendAlert, opts ...grpc.CallOption) (*pbmodel.EmptyStruct, error) {
	out := new(pbmodel.EmptyStruct)
	err := c.cc.Invoke(ctx, "/spacemanager.AlertManage/SendAlert", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// AlertManageServer is the server API for AlertManage service.
// All implementations must embed UnimplementedAlertManageServer
// for forward compatibility
type AlertManageServer interface {
	ListAlertPolicies(context.Context, *pbrequest.ListAlertPolicies) (*pbresponse.ListAlertPolicies, error)
	DeleteAlertPolicies(context.Context, *pbrequest.DeleteAlertPolicies) (*pbmodel.EmptyStruct, error)
	EnableAlertPolicies(context.Context, *pbrequest.EnableAlertPolicies) (*pbmodel.EmptyStruct, error)
	DisableAlertPolicies(context.Context, *pbrequest.DisableAlertPolicies) (*pbmodel.EmptyStruct, error)
	CreateAlertPolicy(context.Context, *pbrequest.CreateAlertPolicy) (*pbresponse.CreateAlertPolicy, error)
	UpdateAlertPolicy(context.Context, *pbrequest.UpdateAlertPolicy) (*pbmodel.EmptyStruct, error)
	DescribeAlertPolicy(context.Context, *pbrequest.DescribeAlertPolicy) (*pbresponse.DescribeAlertPolicy, error)
	// JobBoundAlertPolicy bind the alert policies to the specified job(stream or sync)
	JobBoundAlertPolicies(context.Context, *pbrequest.JobBoundAlertPolicies) (*pbmodel.EmptyStruct, error)
	// JobUnboundAlertPolicies unbind the alert policies from the specified job.
	JobUnboundAlertPolicies(context.Context, *pbrequest.JobUnboundAlertPolicies) (*pbmodel.EmptyStruct, error)
	// ListAlertPoliciesByJob query which alert policies are bound to the specified job(stream or sync).
	ListAlertPoliciesByJob(context.Context, *pbrequest.ListAlertPoliciesByJob) (*pbresponse.ListAlertPoliciesByJob, error)
	// AlertPolicyBoundJobs bind the jobs(stream or sync) to specified alert policy.
	AlertPolicyBoundJobs(context.Context, *pbrequest.AlertPolicyBoundJobs) (*pbmodel.EmptyStruct, error)
	// AlertPolicyUnboundJobs unbind the jobs(stream or sync) from the specified alert policy.
	AlertPolicyUnboundJobs(context.Context, *pbrequest.AlertPolicyUnboundJobs) (*pbmodel.EmptyStruct, error)
	// ListJobsByAlertPolicy query which jobs are bound to the specified alert policy.
	ListJobsByAlertPolicy(context.Context, *pbrequest.ListJobsByAlertPolicy) (*pbresponse.ListJobsByAlertPolicy, error)
	ListAlertLogs(context.Context, *pbrequest.ListAlertLogs) (*pbresponse.ListAlertLogs, error)
	// Internal API
	SendAlert(context.Context, *pbrequest.SendAlert) (*pbmodel.EmptyStruct, error)
	mustEmbedUnimplementedAlertManageServer()
}

// UnimplementedAlertManageServer must be embedded to have forward compatible implementations.
type UnimplementedAlertManageServer struct {
}

func (UnimplementedAlertManageServer) ListAlertPolicies(context.Context, *pbrequest.ListAlertPolicies) (*pbresponse.ListAlertPolicies, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListAlertPolicies not implemented")
}
func (UnimplementedAlertManageServer) DeleteAlertPolicies(context.Context, *pbrequest.DeleteAlertPolicies) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteAlertPolicies not implemented")
}
func (UnimplementedAlertManageServer) EnableAlertPolicies(context.Context, *pbrequest.EnableAlertPolicies) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method EnableAlertPolicies not implemented")
}
func (UnimplementedAlertManageServer) DisableAlertPolicies(context.Context, *pbrequest.DisableAlertPolicies) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DisableAlertPolicies not implemented")
}
func (UnimplementedAlertManageServer) CreateAlertPolicy(context.Context, *pbrequest.CreateAlertPolicy) (*pbresponse.CreateAlertPolicy, error) {
	return nil, status.Errorf(codes.Unimplemented, "method CreateAlertPolicy not implemented")
}
func (UnimplementedAlertManageServer) UpdateAlertPolicy(context.Context, *pbrequest.UpdateAlertPolicy) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method UpdateAlertPolicy not implemented")
}
func (UnimplementedAlertManageServer) DescribeAlertPolicy(context.Context, *pbrequest.DescribeAlertPolicy) (*pbresponse.DescribeAlertPolicy, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DescribeAlertPolicy not implemented")
}
func (UnimplementedAlertManageServer) JobBoundAlertPolicies(context.Context, *pbrequest.JobBoundAlertPolicies) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method JobBoundAlertPolicies not implemented")
}
func (UnimplementedAlertManageServer) JobUnboundAlertPolicies(context.Context, *pbrequest.JobUnboundAlertPolicies) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method JobUnboundAlertPolicies not implemented")
}
func (UnimplementedAlertManageServer) ListAlertPoliciesByJob(context.Context, *pbrequest.ListAlertPoliciesByJob) (*pbresponse.ListAlertPoliciesByJob, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListAlertPoliciesByJob not implemented")
}
func (UnimplementedAlertManageServer) AlertPolicyBoundJobs(context.Context, *pbrequest.AlertPolicyBoundJobs) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AlertPolicyBoundJobs not implemented")
}
func (UnimplementedAlertManageServer) AlertPolicyUnboundJobs(context.Context, *pbrequest.AlertPolicyUnboundJobs) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method AlertPolicyUnboundJobs not implemented")
}
func (UnimplementedAlertManageServer) ListJobsByAlertPolicy(context.Context, *pbrequest.ListJobsByAlertPolicy) (*pbresponse.ListJobsByAlertPolicy, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListJobsByAlertPolicy not implemented")
}
func (UnimplementedAlertManageServer) ListAlertLogs(context.Context, *pbrequest.ListAlertLogs) (*pbresponse.ListAlertLogs, error) {
	return nil, status.Errorf(codes.Unimplemented, "method ListAlertLogs not implemented")
}
func (UnimplementedAlertManageServer) SendAlert(context.Context, *pbrequest.SendAlert) (*pbmodel.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method SendAlert not implemented")
}
func (UnimplementedAlertManageServer) mustEmbedUnimplementedAlertManageServer() {}

// UnsafeAlertManageServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to AlertManageServer will
// result in compilation errors.
type UnsafeAlertManageServer interface {
	mustEmbedUnimplementedAlertManageServer()
}

func RegisterAlertManageServer(s grpc.ServiceRegistrar, srv AlertManageServer) {
	s.RegisterService(&AlertManage_ServiceDesc, srv)
}

func _AlertManage_ListAlertPolicies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListAlertPolicies)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).ListAlertPolicies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/ListAlertPolicies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).ListAlertPolicies(ctx, req.(*pbrequest.ListAlertPolicies))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_DeleteAlertPolicies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DeleteAlertPolicies)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).DeleteAlertPolicies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/DeleteAlertPolicies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).DeleteAlertPolicies(ctx, req.(*pbrequest.DeleteAlertPolicies))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_EnableAlertPolicies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.EnableAlertPolicies)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).EnableAlertPolicies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/EnableAlertPolicies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).EnableAlertPolicies(ctx, req.(*pbrequest.EnableAlertPolicies))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_DisableAlertPolicies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DisableAlertPolicies)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).DisableAlertPolicies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/DisableAlertPolicies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).DisableAlertPolicies(ctx, req.(*pbrequest.DisableAlertPolicies))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_CreateAlertPolicy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.CreateAlertPolicy)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).CreateAlertPolicy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/CreateAlertPolicy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).CreateAlertPolicy(ctx, req.(*pbrequest.CreateAlertPolicy))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_UpdateAlertPolicy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.UpdateAlertPolicy)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).UpdateAlertPolicy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/UpdateAlertPolicy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).UpdateAlertPolicy(ctx, req.(*pbrequest.UpdateAlertPolicy))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_DescribeAlertPolicy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.DescribeAlertPolicy)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).DescribeAlertPolicy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/DescribeAlertPolicy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).DescribeAlertPolicy(ctx, req.(*pbrequest.DescribeAlertPolicy))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_JobBoundAlertPolicies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.JobBoundAlertPolicies)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).JobBoundAlertPolicies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/JobBoundAlertPolicies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).JobBoundAlertPolicies(ctx, req.(*pbrequest.JobBoundAlertPolicies))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_JobUnboundAlertPolicies_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.JobUnboundAlertPolicies)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).JobUnboundAlertPolicies(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/JobUnboundAlertPolicies",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).JobUnboundAlertPolicies(ctx, req.(*pbrequest.JobUnboundAlertPolicies))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_ListAlertPoliciesByJob_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListAlertPoliciesByJob)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).ListAlertPoliciesByJob(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/ListAlertPoliciesByJob",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).ListAlertPoliciesByJob(ctx, req.(*pbrequest.ListAlertPoliciesByJob))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_AlertPolicyBoundJobs_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.AlertPolicyBoundJobs)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).AlertPolicyBoundJobs(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/AlertPolicyBoundJobs",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).AlertPolicyBoundJobs(ctx, req.(*pbrequest.AlertPolicyBoundJobs))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_AlertPolicyUnboundJobs_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.AlertPolicyUnboundJobs)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).AlertPolicyUnboundJobs(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/AlertPolicyUnboundJobs",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).AlertPolicyUnboundJobs(ctx, req.(*pbrequest.AlertPolicyUnboundJobs))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_ListJobsByAlertPolicy_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListJobsByAlertPolicy)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).ListJobsByAlertPolicy(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/ListJobsByAlertPolicy",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).ListJobsByAlertPolicy(ctx, req.(*pbrequest.ListJobsByAlertPolicy))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_ListAlertLogs_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.ListAlertLogs)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).ListAlertLogs(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/ListAlertLogs",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).ListAlertLogs(ctx, req.(*pbrequest.ListAlertLogs))
	}
	return interceptor(ctx, in, info, handler)
}

func _AlertManage_SendAlert_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(pbrequest.SendAlert)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(AlertManageServer).SendAlert(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/spacemanager.AlertManage/SendAlert",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(AlertManageServer).SendAlert(ctx, req.(*pbrequest.SendAlert))
	}
	return interceptor(ctx, in, info, handler)
}

// AlertManage_ServiceDesc is the grpc.ServiceDesc for AlertManage service.
// It's only intended for direct use with grpc.RegisterService,
// and not to be introspected or modified (even as a copy)
var AlertManage_ServiceDesc = grpc.ServiceDesc{
	ServiceName: "spacemanager.AlertManage",
	HandlerType: (*AlertManageServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "ListAlertPolicies",
			Handler:    _AlertManage_ListAlertPolicies_Handler,
		},
		{
			MethodName: "DeleteAlertPolicies",
			Handler:    _AlertManage_DeleteAlertPolicies_Handler,
		},
		{
			MethodName: "EnableAlertPolicies",
			Handler:    _AlertManage_EnableAlertPolicies_Handler,
		},
		{
			MethodName: "DisableAlertPolicies",
			Handler:    _AlertManage_DisableAlertPolicies_Handler,
		},
		{
			MethodName: "CreateAlertPolicy",
			Handler:    _AlertManage_CreateAlertPolicy_Handler,
		},
		{
			MethodName: "UpdateAlertPolicy",
			Handler:    _AlertManage_UpdateAlertPolicy_Handler,
		},
		{
			MethodName: "DescribeAlertPolicy",
			Handler:    _AlertManage_DescribeAlertPolicy_Handler,
		},
		{
			MethodName: "JobBoundAlertPolicies",
			Handler:    _AlertManage_JobBoundAlertPolicies_Handler,
		},
		{
			MethodName: "JobUnboundAlertPolicies",
			Handler:    _AlertManage_JobUnboundAlertPolicies_Handler,
		},
		{
			MethodName: "ListAlertPoliciesByJob",
			Handler:    _AlertManage_ListAlertPoliciesByJob_Handler,
		},
		{
			MethodName: "AlertPolicyBoundJobs",
			Handler:    _AlertManage_AlertPolicyBoundJobs_Handler,
		},
		{
			MethodName: "AlertPolicyUnboundJobs",
			Handler:    _AlertManage_AlertPolicyUnboundJobs_Handler,
		},
		{
			MethodName: "ListJobsByAlertPolicy",
			Handler:    _AlertManage_ListJobsByAlertPolicy_Handler,
		},
		{
			MethodName: "ListAlertLogs",
			Handler:    _AlertManage_ListAlertLogs_Handler,
		},
		{
			MethodName: "SendAlert",
			Handler:    _AlertManage_SendAlert_Handler,
		},
	},
	Streams:  []grpc.StreamDesc{},
	Metadata: "proto/service/spacemanager/alert_manage.proto",
}
