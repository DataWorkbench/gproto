// Code generated by protoc-gen-go-grpc. DO NOT EDIT.

package fmpb

import (
	context "context"
	model "github.com/DataWorkbench/gproto/pkg/model"
	grpc "google.golang.org/grpc"
	codes "google.golang.org/grpc/codes"
	status "google.golang.org/grpc/status"
)

// This is a compile-time assertion to ensure that this generated file
// is compatible with the grpc package it is being compiled against.
const _ = grpc.SupportPackageIsVersion7

// FileManagerClient is the client API for FileManager service.
//
// For semantics around ctx use and closing/ending streaming RPCs, please refer to https://pkg.go.dev/google.golang.org/grpc/?tab=doc#ClientConn.NewStream.
type FileManagerClient interface {
	Upload(ctx context.Context, in *UploadRequest, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	UploadStream(ctx context.Context, opts ...grpc.CallOption) (FileManager_UploadStreamClient, error)
	DownloadStream(ctx context.Context, in *DownloadRequest, opts ...grpc.CallOption) (FileManager_DownloadStreamClient, error)
	GetDirList(ctx context.Context, in *DirRequest, opts ...grpc.CallOption) (*ListDirReply, error)
	DeleteFileById(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	DeleteDirById(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*model.EmptyStruct, error)
	GetFileById(ctx context.Context, in *IdRequest, opts ...grpc.CallOption) (*FileInfoReply, error)
	GetFileList(ctx context.Context, in *ListFileRequest, opts ...grpc.CallOption) (*FileListReply, error)
}

type fileManagerClient struct {
	cc grpc.ClientConnInterface
}

func NewFileManagerClient(cc grpc.ClientConnInterface) FileManagerClient {
	return &fileManagerClient{cc}
}

func (c *fileManagerClient) Upload(ctx context.Context, in *UploadRequest, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/fmpb.FileManager/Upload", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *fileManagerClient) UploadStream(ctx context.Context, opts ...grpc.CallOption) (FileManager_UploadStreamClient, error) {
	stream, err := c.cc.NewStream(ctx, &_FileManager_serviceDesc.Streams[0], "/fmpb.FileManager/UploadStream", opts...)
	if err != nil {
		return nil, err
	}
	x := &fileManagerUploadStreamClient{stream}
	return x, nil
}

type FileManager_UploadStreamClient interface {
	Send(*UploadRequest) error
	CloseAndRecv() (*model.EmptyStruct, error)
	grpc.ClientStream
}

type fileManagerUploadStreamClient struct {
	grpc.ClientStream
}

func (x *fileManagerUploadStreamClient) Send(m *UploadRequest) error {
	return x.ClientStream.SendMsg(m)
}

func (x *fileManagerUploadStreamClient) CloseAndRecv() (*model.EmptyStruct, error) {
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	m := new(model.EmptyStruct)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *fileManagerClient) DownloadStream(ctx context.Context, in *DownloadRequest, opts ...grpc.CallOption) (FileManager_DownloadStreamClient, error) {
	stream, err := c.cc.NewStream(ctx, &_FileManager_serviceDesc.Streams[1], "/fmpb.FileManager/DownloadStream", opts...)
	if err != nil {
		return nil, err
	}
	x := &fileManagerDownloadStreamClient{stream}
	if err := x.ClientStream.SendMsg(in); err != nil {
		return nil, err
	}
	if err := x.ClientStream.CloseSend(); err != nil {
		return nil, err
	}
	return x, nil
}

type FileManager_DownloadStreamClient interface {
	Recv() (*DownloadReply, error)
	grpc.ClientStream
}

type fileManagerDownloadStreamClient struct {
	grpc.ClientStream
}

func (x *fileManagerDownloadStreamClient) Recv() (*DownloadReply, error) {
	m := new(DownloadReply)
	if err := x.ClientStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func (c *fileManagerClient) GetDirList(ctx context.Context, in *DirRequest, opts ...grpc.CallOption) (*ListDirReply, error) {
	out := new(ListDirReply)
	err := c.cc.Invoke(ctx, "/fmpb.FileManager/GetDirList", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *fileManagerClient) DeleteFileById(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/fmpb.FileManager/DeleteFileById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *fileManagerClient) DeleteDirById(ctx context.Context, in *DeleteRequest, opts ...grpc.CallOption) (*model.EmptyStruct, error) {
	out := new(model.EmptyStruct)
	err := c.cc.Invoke(ctx, "/fmpb.FileManager/DeleteDirById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *fileManagerClient) GetFileById(ctx context.Context, in *IdRequest, opts ...grpc.CallOption) (*FileInfoReply, error) {
	out := new(FileInfoReply)
	err := c.cc.Invoke(ctx, "/fmpb.FileManager/GetFileById", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

func (c *fileManagerClient) GetFileList(ctx context.Context, in *ListFileRequest, opts ...grpc.CallOption) (*FileListReply, error) {
	out := new(FileListReply)
	err := c.cc.Invoke(ctx, "/fmpb.FileManager/GetFileList", in, out, opts...)
	if err != nil {
		return nil, err
	}
	return out, nil
}

// FileManagerServer is the server API for FileManager service.
// All implementations must embed UnimplementedFileManagerServer
// for forward compatibility
type FileManagerServer interface {
	Upload(context.Context, *UploadRequest) (*model.EmptyStruct, error)
	UploadStream(FileManager_UploadStreamServer) error
	DownloadStream(*DownloadRequest, FileManager_DownloadStreamServer) error
	GetDirList(context.Context, *DirRequest) (*ListDirReply, error)
	DeleteFileById(context.Context, *DeleteRequest) (*model.EmptyStruct, error)
	DeleteDirById(context.Context, *DeleteRequest) (*model.EmptyStruct, error)
	GetFileById(context.Context, *IdRequest) (*FileInfoReply, error)
	GetFileList(context.Context, *ListFileRequest) (*FileListReply, error)
	mustEmbedUnimplementedFileManagerServer()
}

// UnimplementedFileManagerServer must be embedded to have forward compatible implementations.
type UnimplementedFileManagerServer struct {
}

func (UnimplementedFileManagerServer) Upload(context.Context, *UploadRequest) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method Upload not implemented")
}
func (UnimplementedFileManagerServer) UploadStream(FileManager_UploadStreamServer) error {
	return status.Errorf(codes.Unimplemented, "method UploadStream not implemented")
}
func (UnimplementedFileManagerServer) DownloadStream(*DownloadRequest, FileManager_DownloadStreamServer) error {
	return status.Errorf(codes.Unimplemented, "method DownloadStream not implemented")
}
func (UnimplementedFileManagerServer) GetDirList(context.Context, *DirRequest) (*ListDirReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetDirList not implemented")
}
func (UnimplementedFileManagerServer) DeleteFileById(context.Context, *DeleteRequest) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteFileById not implemented")
}
func (UnimplementedFileManagerServer) DeleteDirById(context.Context, *DeleteRequest) (*model.EmptyStruct, error) {
	return nil, status.Errorf(codes.Unimplemented, "method DeleteDirById not implemented")
}
func (UnimplementedFileManagerServer) GetFileById(context.Context, *IdRequest) (*FileInfoReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFileById not implemented")
}
func (UnimplementedFileManagerServer) GetFileList(context.Context, *ListFileRequest) (*FileListReply, error) {
	return nil, status.Errorf(codes.Unimplemented, "method GetFileList not implemented")
}
func (UnimplementedFileManagerServer) mustEmbedUnimplementedFileManagerServer() {}

// UnsafeFileManagerServer may be embedded to opt out of forward compatibility for this service.
// Use of this interface is not recommended, as added methods to FileManagerServer will
// result in compilation errors.
type UnsafeFileManagerServer interface {
	mustEmbedUnimplementedFileManagerServer()
}

func RegisterFileManagerServer(s grpc.ServiceRegistrar, srv FileManagerServer) {
	s.RegisterService(&_FileManager_serviceDesc, srv)
}

func _FileManager_Upload_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(UploadRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FileManagerServer).Upload(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/fmpb.FileManager/Upload",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FileManagerServer).Upload(ctx, req.(*UploadRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FileManager_UploadStream_Handler(srv interface{}, stream grpc.ServerStream) error {
	return srv.(FileManagerServer).UploadStream(&fileManagerUploadStreamServer{stream})
}

type FileManager_UploadStreamServer interface {
	SendAndClose(*model.EmptyStruct) error
	Recv() (*UploadRequest, error)
	grpc.ServerStream
}

type fileManagerUploadStreamServer struct {
	grpc.ServerStream
}

func (x *fileManagerUploadStreamServer) SendAndClose(m *model.EmptyStruct) error {
	return x.ServerStream.SendMsg(m)
}

func (x *fileManagerUploadStreamServer) Recv() (*UploadRequest, error) {
	m := new(UploadRequest)
	if err := x.ServerStream.RecvMsg(m); err != nil {
		return nil, err
	}
	return m, nil
}

func _FileManager_DownloadStream_Handler(srv interface{}, stream grpc.ServerStream) error {
	m := new(DownloadRequest)
	if err := stream.RecvMsg(m); err != nil {
		return err
	}
	return srv.(FileManagerServer).DownloadStream(m, &fileManagerDownloadStreamServer{stream})
}

type FileManager_DownloadStreamServer interface {
	Send(*DownloadReply) error
	grpc.ServerStream
}

type fileManagerDownloadStreamServer struct {
	grpc.ServerStream
}

func (x *fileManagerDownloadStreamServer) Send(m *DownloadReply) error {
	return x.ServerStream.SendMsg(m)
}

func _FileManager_GetDirList_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DirRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FileManagerServer).GetDirList(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/fmpb.FileManager/GetDirList",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FileManagerServer).GetDirList(ctx, req.(*DirRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FileManager_DeleteFileById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FileManagerServer).DeleteFileById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/fmpb.FileManager/DeleteFileById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FileManagerServer).DeleteFileById(ctx, req.(*DeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FileManager_DeleteDirById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(DeleteRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FileManagerServer).DeleteDirById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/fmpb.FileManager/DeleteDirById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FileManagerServer).DeleteDirById(ctx, req.(*DeleteRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FileManager_GetFileById_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(IdRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FileManagerServer).GetFileById(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/fmpb.FileManager/GetFileById",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FileManagerServer).GetFileById(ctx, req.(*IdRequest))
	}
	return interceptor(ctx, in, info, handler)
}

func _FileManager_GetFileList_Handler(srv interface{}, ctx context.Context, dec func(interface{}) error, interceptor grpc.UnaryServerInterceptor) (interface{}, error) {
	in := new(ListFileRequest)
	if err := dec(in); err != nil {
		return nil, err
	}
	if interceptor == nil {
		return srv.(FileManagerServer).GetFileList(ctx, in)
	}
	info := &grpc.UnaryServerInfo{
		Server:     srv,
		FullMethod: "/fmpb.FileManager/GetFileList",
	}
	handler := func(ctx context.Context, req interface{}) (interface{}, error) {
		return srv.(FileManagerServer).GetFileList(ctx, req.(*ListFileRequest))
	}
	return interceptor(ctx, in, info, handler)
}

var _FileManager_serviceDesc = grpc.ServiceDesc{
	ServiceName: "fmpb.FileManager",
	HandlerType: (*FileManagerServer)(nil),
	Methods: []grpc.MethodDesc{
		{
			MethodName: "Upload",
			Handler:    _FileManager_Upload_Handler,
		},
		{
			MethodName: "GetDirList",
			Handler:    _FileManager_GetDirList_Handler,
		},
		{
			MethodName: "DeleteFileById",
			Handler:    _FileManager_DeleteFileById_Handler,
		},
		{
			MethodName: "DeleteDirById",
			Handler:    _FileManager_DeleteDirById_Handler,
		},
		{
			MethodName: "GetFileById",
			Handler:    _FileManager_GetFileById_Handler,
		},
		{
			MethodName: "GetFileList",
			Handler:    _FileManager_GetFileList_Handler,
		},
	},
	Streams: []grpc.StreamDesc{
		{
			StreamName:    "UploadStream",
			Handler:       _FileManager_UploadStream_Handler,
			ClientStreams: true,
		},
		{
			StreamName:    "DownloadStream",
			Handler:       _FileManager_DownloadStream_Handler,
			ServerStreams: true,
		},
	},
	Metadata: "proto/filemanager.proto",
}