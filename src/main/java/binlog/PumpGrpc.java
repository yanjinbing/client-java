package binlog;

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
 * <pre>
 * Interfaces exported by Pump.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: binlog/pump.proto")
public final class PumpGrpc {

  private PumpGrpc() {}

  public static final String SERVICE_NAME = "binlog.Pump";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<binlog.PumpOuterClass.WriteBinlogReq,
      binlog.PumpOuterClass.WriteBinlogResp> getWriteBinlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "WriteBinlog",
      requestType = binlog.PumpOuterClass.WriteBinlogReq.class,
      responseType = binlog.PumpOuterClass.WriteBinlogResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<binlog.PumpOuterClass.WriteBinlogReq,
      binlog.PumpOuterClass.WriteBinlogResp> getWriteBinlogMethod() {
    io.grpc.MethodDescriptor<binlog.PumpOuterClass.WriteBinlogReq, binlog.PumpOuterClass.WriteBinlogResp> getWriteBinlogMethod;
    if ((getWriteBinlogMethod = PumpGrpc.getWriteBinlogMethod) == null) {
      synchronized (PumpGrpc.class) {
        if ((getWriteBinlogMethod = PumpGrpc.getWriteBinlogMethod) == null) {
          PumpGrpc.getWriteBinlogMethod = getWriteBinlogMethod =
              io.grpc.MethodDescriptor.<binlog.PumpOuterClass.WriteBinlogReq, binlog.PumpOuterClass.WriteBinlogResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "WriteBinlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.PumpOuterClass.WriteBinlogReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.PumpOuterClass.WriteBinlogResp.getDefaultInstance()))
              .setSchemaDescriptor(new PumpMethodDescriptorSupplier("WriteBinlog"))
              .build();
        }
      }
    }
    return getWriteBinlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<binlog.PumpOuterClass.PullBinlogReq,
      binlog.PumpOuterClass.PullBinlogResp> getPullBinlogsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "PullBinlogs",
      requestType = binlog.PumpOuterClass.PullBinlogReq.class,
      responseType = binlog.PumpOuterClass.PullBinlogResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<binlog.PumpOuterClass.PullBinlogReq,
      binlog.PumpOuterClass.PullBinlogResp> getPullBinlogsMethod() {
    io.grpc.MethodDescriptor<binlog.PumpOuterClass.PullBinlogReq, binlog.PumpOuterClass.PullBinlogResp> getPullBinlogsMethod;
    if ((getPullBinlogsMethod = PumpGrpc.getPullBinlogsMethod) == null) {
      synchronized (PumpGrpc.class) {
        if ((getPullBinlogsMethod = PumpGrpc.getPullBinlogsMethod) == null) {
          PumpGrpc.getPullBinlogsMethod = getPullBinlogsMethod =
              io.grpc.MethodDescriptor.<binlog.PumpOuterClass.PullBinlogReq, binlog.PumpOuterClass.PullBinlogResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "PullBinlogs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.PumpOuterClass.PullBinlogReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.PumpOuterClass.PullBinlogResp.getDefaultInstance()))
              .setSchemaDescriptor(new PumpMethodDescriptorSupplier("PullBinlogs"))
              .build();
        }
      }
    }
    return getPullBinlogsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PumpStub newStub(io.grpc.Channel channel) {
    return new PumpStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PumpBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PumpBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PumpFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PumpFutureStub(channel);
  }

  /**
   * <pre>
   * Interfaces exported by Pump.
   * </pre>
   */
  public static abstract class PumpImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Writes a binlog to the local file on the pump machine.
     * A response with an empty errmsg is returned if the binlog is written successfully.
     * </pre>
     */
    public void writeBinlog(binlog.PumpOuterClass.WriteBinlogReq request,
        io.grpc.stub.StreamObserver<binlog.PumpOuterClass.WriteBinlogResp> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteBinlogMethod(), responseObserver);
    }

    /**
     * <pre>
     * Sends binlog stream from a given location.
     * </pre>
     */
    public void pullBinlogs(binlog.PumpOuterClass.PullBinlogReq request,
        io.grpc.stub.StreamObserver<binlog.PumpOuterClass.PullBinlogResp> responseObserver) {
      asyncUnimplementedUnaryCall(getPullBinlogsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getWriteBinlogMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                binlog.PumpOuterClass.WriteBinlogReq,
                binlog.PumpOuterClass.WriteBinlogResp>(
                  this, METHODID_WRITE_BINLOG)))
          .addMethod(
            getPullBinlogsMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                binlog.PumpOuterClass.PullBinlogReq,
                binlog.PumpOuterClass.PullBinlogResp>(
                  this, METHODID_PULL_BINLOGS)))
          .build();
    }
  }

  /**
   * <pre>
   * Interfaces exported by Pump.
   * </pre>
   */
  public static final class PumpStub extends io.grpc.stub.AbstractStub<PumpStub> {
    private PumpStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PumpStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PumpStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PumpStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes a binlog to the local file on the pump machine.
     * A response with an empty errmsg is returned if the binlog is written successfully.
     * </pre>
     */
    public void writeBinlog(binlog.PumpOuterClass.WriteBinlogReq request,
        io.grpc.stub.StreamObserver<binlog.PumpOuterClass.WriteBinlogResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteBinlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Sends binlog stream from a given location.
     * </pre>
     */
    public void pullBinlogs(binlog.PumpOuterClass.PullBinlogReq request,
        io.grpc.stub.StreamObserver<binlog.PumpOuterClass.PullBinlogResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getPullBinlogsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interfaces exported by Pump.
   * </pre>
   */
  public static final class PumpBlockingStub extends io.grpc.stub.AbstractStub<PumpBlockingStub> {
    private PumpBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PumpBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PumpBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PumpBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes a binlog to the local file on the pump machine.
     * A response with an empty errmsg is returned if the binlog is written successfully.
     * </pre>
     */
    public binlog.PumpOuterClass.WriteBinlogResp writeBinlog(binlog.PumpOuterClass.WriteBinlogReq request) {
      return blockingUnaryCall(
          getChannel(), getWriteBinlogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Sends binlog stream from a given location.
     * </pre>
     */
    public java.util.Iterator<binlog.PumpOuterClass.PullBinlogResp> pullBinlogs(
        binlog.PumpOuterClass.PullBinlogReq request) {
      return blockingServerStreamingCall(
          getChannel(), getPullBinlogsMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interfaces exported by Pump.
   * </pre>
   */
  public static final class PumpFutureStub extends io.grpc.stub.AbstractStub<PumpFutureStub> {
    private PumpFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PumpFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PumpFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PumpFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Writes a binlog to the local file on the pump machine.
     * A response with an empty errmsg is returned if the binlog is written successfully.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<binlog.PumpOuterClass.WriteBinlogResp> writeBinlog(
        binlog.PumpOuterClass.WriteBinlogReq request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteBinlogMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_WRITE_BINLOG = 0;
  private static final int METHODID_PULL_BINLOGS = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PumpImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PumpImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_WRITE_BINLOG:
          serviceImpl.writeBinlog((binlog.PumpOuterClass.WriteBinlogReq) request,
              (io.grpc.stub.StreamObserver<binlog.PumpOuterClass.WriteBinlogResp>) responseObserver);
          break;
        case METHODID_PULL_BINLOGS:
          serviceImpl.pullBinlogs((binlog.PumpOuterClass.PullBinlogReq) request,
              (io.grpc.stub.StreamObserver<binlog.PumpOuterClass.PullBinlogResp>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class PumpBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PumpBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return binlog.PumpOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Pump");
    }
  }

  private static final class PumpFileDescriptorSupplier
      extends PumpBaseDescriptorSupplier {
    PumpFileDescriptorSupplier() {}
  }

  private static final class PumpMethodDescriptorSupplier
      extends PumpBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PumpMethodDescriptorSupplier(String methodName) {
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
      synchronized (PumpGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PumpFileDescriptorSupplier())
              .addMethod(getWriteBinlogMethod())
              .addMethod(getPullBinlogsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
