package enginepb;

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
    comments = "Source: enginepb.proto")
public final class EngineGrpc {

  private EngineGrpc() {}

  public static final String SERVICE_NAME = "enginepb.Engine";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<enginepb.Enginepb.CommandRequestBatch,
      enginepb.Enginepb.CommandResponseBatch> getApplyCommandBatchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplyCommandBatch",
      requestType = enginepb.Enginepb.CommandRequestBatch.class,
      responseType = enginepb.Enginepb.CommandResponseBatch.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<enginepb.Enginepb.CommandRequestBatch,
      enginepb.Enginepb.CommandResponseBatch> getApplyCommandBatchMethod() {
    io.grpc.MethodDescriptor<enginepb.Enginepb.CommandRequestBatch, enginepb.Enginepb.CommandResponseBatch> getApplyCommandBatchMethod;
    if ((getApplyCommandBatchMethod = EngineGrpc.getApplyCommandBatchMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getApplyCommandBatchMethod = EngineGrpc.getApplyCommandBatchMethod) == null) {
          EngineGrpc.getApplyCommandBatchMethod = getApplyCommandBatchMethod =
              io.grpc.MethodDescriptor.<enginepb.Enginepb.CommandRequestBatch, enginepb.Enginepb.CommandResponseBatch>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplyCommandBatch"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  enginepb.Enginepb.CommandRequestBatch.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  enginepb.Enginepb.CommandResponseBatch.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("ApplyCommandBatch"))
              .build();
        }
      }
    }
    return getApplyCommandBatchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<enginepb.Enginepb.SnapshotRequest,
      enginepb.Enginepb.SnapshotDone> getApplySnapshotMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ApplySnapshot",
      requestType = enginepb.Enginepb.SnapshotRequest.class,
      responseType = enginepb.Enginepb.SnapshotDone.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
  public static io.grpc.MethodDescriptor<enginepb.Enginepb.SnapshotRequest,
      enginepb.Enginepb.SnapshotDone> getApplySnapshotMethod() {
    io.grpc.MethodDescriptor<enginepb.Enginepb.SnapshotRequest, enginepb.Enginepb.SnapshotDone> getApplySnapshotMethod;
    if ((getApplySnapshotMethod = EngineGrpc.getApplySnapshotMethod) == null) {
      synchronized (EngineGrpc.class) {
        if ((getApplySnapshotMethod = EngineGrpc.getApplySnapshotMethod) == null) {
          EngineGrpc.getApplySnapshotMethod = getApplySnapshotMethod =
              io.grpc.MethodDescriptor.<enginepb.Enginepb.SnapshotRequest, enginepb.Enginepb.SnapshotDone>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ApplySnapshot"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  enginepb.Enginepb.SnapshotRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  enginepb.Enginepb.SnapshotDone.getDefaultInstance()))
              .setSchemaDescriptor(new EngineMethodDescriptorSupplier("ApplySnapshot"))
              .build();
        }
      }
    }
    return getApplySnapshotMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static EngineStub newStub(io.grpc.Channel channel) {
    return new EngineStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static EngineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new EngineBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static EngineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new EngineFutureStub(channel);
  }

  /**
   */
  public static abstract class EngineImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<enginepb.Enginepb.CommandRequestBatch> applyCommandBatch(
        io.grpc.stub.StreamObserver<enginepb.Enginepb.CommandResponseBatch> responseObserver) {
      return asyncUnimplementedStreamingCall(getApplyCommandBatchMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<enginepb.Enginepb.SnapshotRequest> applySnapshot(
        io.grpc.stub.StreamObserver<enginepb.Enginepb.SnapshotDone> responseObserver) {
      return asyncUnimplementedStreamingCall(getApplySnapshotMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getApplyCommandBatchMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                enginepb.Enginepb.CommandRequestBatch,
                enginepb.Enginepb.CommandResponseBatch>(
                  this, METHODID_APPLY_COMMAND_BATCH)))
          .addMethod(
            getApplySnapshotMethod(),
            asyncClientStreamingCall(
              new MethodHandlers<
                enginepb.Enginepb.SnapshotRequest,
                enginepb.Enginepb.SnapshotDone>(
                  this, METHODID_APPLY_SNAPSHOT)))
          .build();
    }
  }

  /**
   */
  public static final class EngineStub extends io.grpc.stub.AbstractStub<EngineStub> {
    private EngineStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<enginepb.Enginepb.CommandRequestBatch> applyCommandBatch(
        io.grpc.stub.StreamObserver<enginepb.Enginepb.CommandResponseBatch> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getApplyCommandBatchMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<enginepb.Enginepb.SnapshotRequest> applySnapshot(
        io.grpc.stub.StreamObserver<enginepb.Enginepb.SnapshotDone> responseObserver) {
      return asyncClientStreamingCall(
          getChannel().newCall(getApplySnapshotMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class EngineBlockingStub extends io.grpc.stub.AbstractStub<EngineBlockingStub> {
    private EngineBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class EngineFutureStub extends io.grpc.stub.AbstractStub<EngineFutureStub> {
    private EngineFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private EngineFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected EngineFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new EngineFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_APPLY_COMMAND_BATCH = 0;
  private static final int METHODID_APPLY_SNAPSHOT = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final EngineImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(EngineImplBase serviceImpl, int methodId) {
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
        case METHODID_APPLY_COMMAND_BATCH:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.applyCommandBatch(
              (io.grpc.stub.StreamObserver<enginepb.Enginepb.CommandResponseBatch>) responseObserver);
        case METHODID_APPLY_SNAPSHOT:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.applySnapshot(
              (io.grpc.stub.StreamObserver<enginepb.Enginepb.SnapshotDone>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class EngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    EngineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return enginepb.Enginepb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Engine");
    }
  }

  private static final class EngineFileDescriptorSupplier
      extends EngineBaseDescriptorSupplier {
    EngineFileDescriptorSupplier() {}
  }

  private static final class EngineMethodDescriptorSupplier
      extends EngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    EngineMethodDescriptorSupplier(String methodName) {
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
      synchronized (EngineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new EngineFileDescriptorSupplier())
              .addMethod(getApplyCommandBatchMethod())
              .addMethod(getApplySnapshotMethod())
              .build();
        }
      }
    }
    return result;
  }
}
