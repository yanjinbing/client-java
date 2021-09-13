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
 * Interfaces exported by CisternServer.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.24.0)",
    comments = "Source: binlog/cistern.proto")
public final class CisternGrpc {

  private CisternGrpc() {}

  public static final String SERVICE_NAME = "binlog.Cistern";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<binlog.CisternOuterClass.DumpBinlogReq,
      binlog.CisternOuterClass.DumpBinlogResp> getDumpBinlogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DumpBinlog",
      requestType = binlog.CisternOuterClass.DumpBinlogReq.class,
      responseType = binlog.CisternOuterClass.DumpBinlogResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<binlog.CisternOuterClass.DumpBinlogReq,
      binlog.CisternOuterClass.DumpBinlogResp> getDumpBinlogMethod() {
    io.grpc.MethodDescriptor<binlog.CisternOuterClass.DumpBinlogReq, binlog.CisternOuterClass.DumpBinlogResp> getDumpBinlogMethod;
    if ((getDumpBinlogMethod = CisternGrpc.getDumpBinlogMethod) == null) {
      synchronized (CisternGrpc.class) {
        if ((getDumpBinlogMethod = CisternGrpc.getDumpBinlogMethod) == null) {
          CisternGrpc.getDumpBinlogMethod = getDumpBinlogMethod =
              io.grpc.MethodDescriptor.<binlog.CisternOuterClass.DumpBinlogReq, binlog.CisternOuterClass.DumpBinlogResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DumpBinlog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.CisternOuterClass.DumpBinlogReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.CisternOuterClass.DumpBinlogResp.getDefaultInstance()))
              .setSchemaDescriptor(new CisternMethodDescriptorSupplier("DumpBinlog"))
              .build();
        }
      }
    }
    return getDumpBinlogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<binlog.CisternOuterClass.DumpDDLJobsReq,
      binlog.CisternOuterClass.DumpDDLJobsResp> getDumpDDLJobsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DumpDDLJobs",
      requestType = binlog.CisternOuterClass.DumpDDLJobsReq.class,
      responseType = binlog.CisternOuterClass.DumpDDLJobsResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<binlog.CisternOuterClass.DumpDDLJobsReq,
      binlog.CisternOuterClass.DumpDDLJobsResp> getDumpDDLJobsMethod() {
    io.grpc.MethodDescriptor<binlog.CisternOuterClass.DumpDDLJobsReq, binlog.CisternOuterClass.DumpDDLJobsResp> getDumpDDLJobsMethod;
    if ((getDumpDDLJobsMethod = CisternGrpc.getDumpDDLJobsMethod) == null) {
      synchronized (CisternGrpc.class) {
        if ((getDumpDDLJobsMethod = CisternGrpc.getDumpDDLJobsMethod) == null) {
          CisternGrpc.getDumpDDLJobsMethod = getDumpDDLJobsMethod =
              io.grpc.MethodDescriptor.<binlog.CisternOuterClass.DumpDDLJobsReq, binlog.CisternOuterClass.DumpDDLJobsResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DumpDDLJobs"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.CisternOuterClass.DumpDDLJobsReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.CisternOuterClass.DumpDDLJobsResp.getDefaultInstance()))
              .setSchemaDescriptor(new CisternMethodDescriptorSupplier("DumpDDLJobs"))
              .build();
        }
      }
    }
    return getDumpDDLJobsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<binlog.CisternOuterClass.NotifyReq,
      binlog.CisternOuterClass.NotifyResp> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Notify",
      requestType = binlog.CisternOuterClass.NotifyReq.class,
      responseType = binlog.CisternOuterClass.NotifyResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<binlog.CisternOuterClass.NotifyReq,
      binlog.CisternOuterClass.NotifyResp> getNotifyMethod() {
    io.grpc.MethodDescriptor<binlog.CisternOuterClass.NotifyReq, binlog.CisternOuterClass.NotifyResp> getNotifyMethod;
    if ((getNotifyMethod = CisternGrpc.getNotifyMethod) == null) {
      synchronized (CisternGrpc.class) {
        if ((getNotifyMethod = CisternGrpc.getNotifyMethod) == null) {
          CisternGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<binlog.CisternOuterClass.NotifyReq, binlog.CisternOuterClass.NotifyResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.CisternOuterClass.NotifyReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  binlog.CisternOuterClass.NotifyResp.getDefaultInstance()))
              .setSchemaDescriptor(new CisternMethodDescriptorSupplier("Notify"))
              .build();
        }
      }
    }
    return getNotifyMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CisternStub newStub(io.grpc.Channel channel) {
    return new CisternStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CisternBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CisternBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CisternFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CisternFutureStub(channel);
  }

  /**
   * <pre>
   * Interfaces exported by CisternServer.
   * </pre>
   */
  public static abstract class CisternImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * DumpBinlog dumps continuous binlog items in a stream from a given position
     * </pre>
     */
    public void dumpBinlog(binlog.CisternOuterClass.DumpBinlogReq request,
        io.grpc.stub.StreamObserver<binlog.CisternOuterClass.DumpBinlogResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDumpBinlogMethod(), responseObserver);
    }

    /**
     * <pre>
     * DumpDDLJobs dumps all history DDL jobs before a specified commitTS
     * </pre>
     */
    public void dumpDDLJobs(binlog.CisternOuterClass.DumpDDLJobsReq request,
        io.grpc.stub.StreamObserver<binlog.CisternOuterClass.DumpDDLJobsResp> responseObserver) {
      asyncUnimplementedUnaryCall(getDumpDDLJobsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify notifies all living cisterns that a new pump is coming
     * the living cisterns can be queried from pd
     * </pre>
     */
    public void notify(binlog.CisternOuterClass.NotifyReq request,
        io.grpc.stub.StreamObserver<binlog.CisternOuterClass.NotifyResp> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDumpBinlogMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                binlog.CisternOuterClass.DumpBinlogReq,
                binlog.CisternOuterClass.DumpBinlogResp>(
                  this, METHODID_DUMP_BINLOG)))
          .addMethod(
            getDumpDDLJobsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                binlog.CisternOuterClass.DumpDDLJobsReq,
                binlog.CisternOuterClass.DumpDDLJobsResp>(
                  this, METHODID_DUMP_DDLJOBS)))
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                binlog.CisternOuterClass.NotifyReq,
                binlog.CisternOuterClass.NotifyResp>(
                  this, METHODID_NOTIFY)))
          .build();
    }
  }

  /**
   * <pre>
   * Interfaces exported by CisternServer.
   * </pre>
   */
  public static final class CisternStub extends io.grpc.stub.AbstractStub<CisternStub> {
    private CisternStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CisternStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CisternStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CisternStub(channel, callOptions);
    }

    /**
     * <pre>
     * DumpBinlog dumps continuous binlog items in a stream from a given position
     * </pre>
     */
    public void dumpBinlog(binlog.CisternOuterClass.DumpBinlogReq request,
        io.grpc.stub.StreamObserver<binlog.CisternOuterClass.DumpBinlogResp> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDumpBinlogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * DumpDDLJobs dumps all history DDL jobs before a specified commitTS
     * </pre>
     */
    public void dumpDDLJobs(binlog.CisternOuterClass.DumpDDLJobsReq request,
        io.grpc.stub.StreamObserver<binlog.CisternOuterClass.DumpDDLJobsResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDumpDDLJobsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify notifies all living cisterns that a new pump is coming
     * the living cisterns can be queried from pd
     * </pre>
     */
    public void notify(binlog.CisternOuterClass.NotifyReq request,
        io.grpc.stub.StreamObserver<binlog.CisternOuterClass.NotifyResp> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * Interfaces exported by CisternServer.
   * </pre>
   */
  public static final class CisternBlockingStub extends io.grpc.stub.AbstractStub<CisternBlockingStub> {
    private CisternBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CisternBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CisternBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CisternBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * DumpBinlog dumps continuous binlog items in a stream from a given position
     * </pre>
     */
    public java.util.Iterator<binlog.CisternOuterClass.DumpBinlogResp> dumpBinlog(
        binlog.CisternOuterClass.DumpBinlogReq request) {
      return blockingServerStreamingCall(
          getChannel(), getDumpBinlogMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * DumpDDLJobs dumps all history DDL jobs before a specified commitTS
     * </pre>
     */
    public binlog.CisternOuterClass.DumpDDLJobsResp dumpDDLJobs(binlog.CisternOuterClass.DumpDDLJobsReq request) {
      return blockingUnaryCall(
          getChannel(), getDumpDDLJobsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify notifies all living cisterns that a new pump is coming
     * the living cisterns can be queried from pd
     * </pre>
     */
    public binlog.CisternOuterClass.NotifyResp notify(binlog.CisternOuterClass.NotifyReq request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * Interfaces exported by CisternServer.
   * </pre>
   */
  public static final class CisternFutureStub extends io.grpc.stub.AbstractStub<CisternFutureStub> {
    private CisternFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CisternFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CisternFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CisternFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * DumpDDLJobs dumps all history DDL jobs before a specified commitTS
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<binlog.CisternOuterClass.DumpDDLJobsResp> dumpDDLJobs(
        binlog.CisternOuterClass.DumpDDLJobsReq request) {
      return futureUnaryCall(
          getChannel().newCall(getDumpDDLJobsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify notifies all living cisterns that a new pump is coming
     * the living cisterns can be queried from pd
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<binlog.CisternOuterClass.NotifyResp> notify(
        binlog.CisternOuterClass.NotifyReq request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DUMP_BINLOG = 0;
  private static final int METHODID_DUMP_DDLJOBS = 1;
  private static final int METHODID_NOTIFY = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CisternImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CisternImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DUMP_BINLOG:
          serviceImpl.dumpBinlog((binlog.CisternOuterClass.DumpBinlogReq) request,
              (io.grpc.stub.StreamObserver<binlog.CisternOuterClass.DumpBinlogResp>) responseObserver);
          break;
        case METHODID_DUMP_DDLJOBS:
          serviceImpl.dumpDDLJobs((binlog.CisternOuterClass.DumpDDLJobsReq) request,
              (io.grpc.stub.StreamObserver<binlog.CisternOuterClass.DumpDDLJobsResp>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((binlog.CisternOuterClass.NotifyReq) request,
              (io.grpc.stub.StreamObserver<binlog.CisternOuterClass.NotifyResp>) responseObserver);
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

  private static abstract class CisternBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CisternBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return binlog.CisternOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Cistern");
    }
  }

  private static final class CisternFileDescriptorSupplier
      extends CisternBaseDescriptorSupplier {
    CisternFileDescriptorSupplier() {}
  }

  private static final class CisternMethodDescriptorSupplier
      extends CisternBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CisternMethodDescriptorSupplier(String methodName) {
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
      synchronized (CisternGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CisternFileDescriptorSupplier())
              .addMethod(getDumpBinlogMethod())
              .addMethod(getDumpDDLJobsMethod())
              .addMethod(getNotifyMethod())
              .build();
        }
      }
    }
    return result;
  }
}
