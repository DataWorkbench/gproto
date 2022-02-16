import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *  rpc SubmitFlinkJob(request.SubmitFlinkJob) returns(response.SubmitFlinkJob){}
 *  rpc GetFlinkJob(request.GetFlinkJob) returns (response.GetFlinkJob){}
 *  rpc CancelFlinkJob(request.CancelFlinkJob) returns(model.EmptyStruct){}
 *  rpc ValidateFlinkJob(request.ValidateFlinkJob) returns(response.ValidateFlinkJob){}
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: proto/service/developer/developer.proto")
public final class DeveloperGrpc {

  private DeveloperGrpc() {}

  public static final String SERVICE_NAME = "Developer";

  // Static method descriptors that strictly reflect the proto.
  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeveloperStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeveloperStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeveloperStub>() {
        @java.lang.Override
        public DeveloperStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeveloperStub(channel, callOptions);
        }
      };
    return DeveloperStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeveloperBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeveloperBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeveloperBlockingStub>() {
        @java.lang.Override
        public DeveloperBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeveloperBlockingStub(channel, callOptions);
        }
      };
    return DeveloperBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeveloperFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DeveloperFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DeveloperFutureStub>() {
        @java.lang.Override
        public DeveloperFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DeveloperFutureStub(channel, callOptions);
        }
      };
    return DeveloperFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *  rpc SubmitFlinkJob(request.SubmitFlinkJob) returns(response.SubmitFlinkJob){}
   *  rpc GetFlinkJob(request.GetFlinkJob) returns (response.GetFlinkJob){}
   *  rpc CancelFlinkJob(request.CancelFlinkJob) returns(model.EmptyStruct){}
   *  rpc ValidateFlinkJob(request.ValidateFlinkJob) returns(response.ValidateFlinkJob){}
   * </pre>
   */
  public static abstract class DeveloperImplBase implements io.grpc.BindableService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .build();
    }
  }

  /**
   * <pre>
   *  rpc SubmitFlinkJob(request.SubmitFlinkJob) returns(response.SubmitFlinkJob){}
   *  rpc GetFlinkJob(request.GetFlinkJob) returns (response.GetFlinkJob){}
   *  rpc CancelFlinkJob(request.CancelFlinkJob) returns(model.EmptyStruct){}
   *  rpc ValidateFlinkJob(request.ValidateFlinkJob) returns(response.ValidateFlinkJob){}
   * </pre>
   */
  public static final class DeveloperStub extends io.grpc.stub.AbstractAsyncStub<DeveloperStub> {
    private DeveloperStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeveloperStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeveloperStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *  rpc SubmitFlinkJob(request.SubmitFlinkJob) returns(response.SubmitFlinkJob){}
   *  rpc GetFlinkJob(request.GetFlinkJob) returns (response.GetFlinkJob){}
   *  rpc CancelFlinkJob(request.CancelFlinkJob) returns(model.EmptyStruct){}
   *  rpc ValidateFlinkJob(request.ValidateFlinkJob) returns(response.ValidateFlinkJob){}
   * </pre>
   */
  public static final class DeveloperBlockingStub extends io.grpc.stub.AbstractBlockingStub<DeveloperBlockingStub> {
    private DeveloperBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeveloperBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeveloperBlockingStub(channel, callOptions);
    }
  }

  /**
   * <pre>
   *  rpc SubmitFlinkJob(request.SubmitFlinkJob) returns(response.SubmitFlinkJob){}
   *  rpc GetFlinkJob(request.GetFlinkJob) returns (response.GetFlinkJob){}
   *  rpc CancelFlinkJob(request.CancelFlinkJob) returns(model.EmptyStruct){}
   *  rpc ValidateFlinkJob(request.ValidateFlinkJob) returns(response.ValidateFlinkJob){}
   * </pre>
   */
  public static final class DeveloperFutureStub extends io.grpc.stub.AbstractFutureStub<DeveloperFutureStub> {
    private DeveloperFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeveloperFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DeveloperFutureStub(channel, callOptions);
    }
  }


  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeveloperImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeveloperImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeveloperBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return DeveloperOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Developer");
    }
  }

  private static final class DeveloperFileDescriptorSupplier
      extends DeveloperBaseDescriptorSupplier {
    DeveloperFileDescriptorSupplier() {}
  }

  private static final class DeveloperMethodDescriptorSupplier
      extends DeveloperBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeveloperMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (DeveloperGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeveloperFileDescriptorSupplier())
              .build();
        }
      }
    }
    return result;
  }
}
