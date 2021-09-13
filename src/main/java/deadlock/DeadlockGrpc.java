package deadlock;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: deadlock.proto")
public final class DeadlockGrpc {

  private DeadlockGrpc() {}

  public static final String SERVICE_NAME = "deadlock.Deadlock";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<deadlock.DeadlockOuterClass.WaitForEntriesRequest,
      deadlock.DeadlockOuterClass.WaitForEntriesResponse> getGetWaitForEntriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetWaitForEntries",
      requestType = deadlock.DeadlockOuterClass.WaitForEntriesRequest.class,
      responseType = deadlock.DeadlockOuterClass.WaitForEntriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<deadlock.DeadlockOuterClass.WaitForEntriesRequest,
      deadlock.DeadlockOuterClass.WaitForEntriesResponse> getGetWaitForEntriesMethod() {
    io.grpc.MethodDescriptor<deadlock.DeadlockOuterClass.WaitForEntriesRequest, deadlock.DeadlockOuterClass.WaitForEntriesResponse> getGetWaitForEntriesMethod;
    if ((getGetWaitForEntriesMethod = DeadlockGrpc.getGetWaitForEntriesMethod) == null) {
      synchronized (DeadlockGrpc.class) {
        if ((getGetWaitForEntriesMethod = DeadlockGrpc.getGetWaitForEntriesMethod) == null) {
          DeadlockGrpc.getGetWaitForEntriesMethod = getGetWaitForEntriesMethod =
              io.grpc.MethodDescriptor.<deadlock.DeadlockOuterClass.WaitForEntriesRequest, deadlock.DeadlockOuterClass.WaitForEntriesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetWaitForEntries"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deadlock.DeadlockOuterClass.WaitForEntriesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deadlock.DeadlockOuterClass.WaitForEntriesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeadlockMethodDescriptorSupplier("GetWaitForEntries"))
              .build();
        }
      }
    }
    return getGetWaitForEntriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<deadlock.DeadlockOuterClass.DeadlockRequest,
      deadlock.DeadlockOuterClass.DeadlockResponse> getDetectMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Detect",
      requestType = deadlock.DeadlockOuterClass.DeadlockRequest.class,
      responseType = deadlock.DeadlockOuterClass.DeadlockResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<deadlock.DeadlockOuterClass.DeadlockRequest,
      deadlock.DeadlockOuterClass.DeadlockResponse> getDetectMethod() {
    io.grpc.MethodDescriptor<deadlock.DeadlockOuterClass.DeadlockRequest, deadlock.DeadlockOuterClass.DeadlockResponse> getDetectMethod;
    if ((getDetectMethod = DeadlockGrpc.getDetectMethod) == null) {
      synchronized (DeadlockGrpc.class) {
        if ((getDetectMethod = DeadlockGrpc.getDetectMethod) == null) {
          DeadlockGrpc.getDetectMethod = getDetectMethod =
              io.grpc.MethodDescriptor.<deadlock.DeadlockOuterClass.DeadlockRequest, deadlock.DeadlockOuterClass.DeadlockResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Detect"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deadlock.DeadlockOuterClass.DeadlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  deadlock.DeadlockOuterClass.DeadlockResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DeadlockMethodDescriptorSupplier("Detect"))
              .build();
        }
      }
    }
    return getDetectMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DeadlockStub newStub(io.grpc.Channel channel) {
    return new DeadlockStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DeadlockBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new DeadlockBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DeadlockFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new DeadlockFutureStub(channel);
  }

  /**
   */
  public static abstract class DeadlockImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Get local wait for entries, should be handle by every node.
     * The owner should sent this request to all members to build the complete wait for graph.
     * </pre>
     */
    public void getWaitForEntries(deadlock.DeadlockOuterClass.WaitForEntriesRequest request,
        io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.WaitForEntriesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetWaitForEntriesMethod(), responseObserver);
    }

    /**
     * <pre>
     * Detect should only sent to the owner. only be handled by the owner.
     * The DeadlockResponse is sent back only if there is deadlock detected.
     * CleanUpWaitFor and CleanUp doesn't return responses.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.DeadlockRequest> detect(
        io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.DeadlockResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getDetectMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetWaitForEntriesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                deadlock.DeadlockOuterClass.WaitForEntriesRequest,
                deadlock.DeadlockOuterClass.WaitForEntriesResponse>(
                  this, METHODID_GET_WAIT_FOR_ENTRIES)))
          .addMethod(
            getDetectMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                deadlock.DeadlockOuterClass.DeadlockRequest,
                deadlock.DeadlockOuterClass.DeadlockResponse>(
                  this, METHODID_DETECT)))
          .build();
    }
  }

  /**
   */
  public static final class DeadlockStub extends io.grpc.stub.AbstractStub<DeadlockStub> {
    private DeadlockStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeadlockStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeadlockStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeadlockStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get local wait for entries, should be handle by every node.
     * The owner should sent this request to all members to build the complete wait for graph.
     * </pre>
     */
    public void getWaitForEntries(deadlock.DeadlockOuterClass.WaitForEntriesRequest request,
        io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.WaitForEntriesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetWaitForEntriesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Detect should only sent to the owner. only be handled by the owner.
     * The DeadlockResponse is sent back only if there is deadlock detected.
     * CleanUpWaitFor and CleanUp doesn't return responses.
     * </pre>
     */
    public io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.DeadlockRequest> detect(
        io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.DeadlockResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getDetectMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class DeadlockBlockingStub extends io.grpc.stub.AbstractStub<DeadlockBlockingStub> {
    private DeadlockBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeadlockBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeadlockBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeadlockBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get local wait for entries, should be handle by every node.
     * The owner should sent this request to all members to build the complete wait for graph.
     * </pre>
     */
    public deadlock.DeadlockOuterClass.WaitForEntriesResponse getWaitForEntries(deadlock.DeadlockOuterClass.WaitForEntriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetWaitForEntriesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class DeadlockFutureStub extends io.grpc.stub.AbstractStub<DeadlockFutureStub> {
    private DeadlockFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private DeadlockFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DeadlockFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new DeadlockFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Get local wait for entries, should be handle by every node.
     * The owner should sent this request to all members to build the complete wait for graph.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<deadlock.DeadlockOuterClass.WaitForEntriesResponse> getWaitForEntries(
        deadlock.DeadlockOuterClass.WaitForEntriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetWaitForEntriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_WAIT_FOR_ENTRIES = 0;
  private static final int METHODID_DETECT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DeadlockImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DeadlockImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_WAIT_FOR_ENTRIES:
          serviceImpl.getWaitForEntries((deadlock.DeadlockOuterClass.WaitForEntriesRequest) request,
              (io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.WaitForEntriesResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DETECT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.detect(
              (io.grpc.stub.StreamObserver<deadlock.DeadlockOuterClass.DeadlockResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class DeadlockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DeadlockBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return deadlock.DeadlockOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Deadlock");
    }
  }

  private static final class DeadlockFileDescriptorSupplier
      extends DeadlockBaseDescriptorSupplier {
    DeadlockFileDescriptorSupplier() {}
  }

  private static final class DeadlockMethodDescriptorSupplier
      extends DeadlockBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DeadlockMethodDescriptorSupplier(String methodName) {
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
      synchronized (DeadlockGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DeadlockFileDescriptorSupplier())
              .addMethod(getGetWaitForEntriesMethod())
              .addMethod(getDetectMethod())
              .build();
        }
      }
    }
    return result;
  }
}
