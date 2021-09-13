package configpb;

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
    comments = "Source: configpb.proto")
public final class ConfigGrpc {

  private ConfigGrpc() {}

  public static final String SERVICE_NAME = "configpb.Config";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<configpb.Configpb.CreateRequest,
      configpb.Configpb.CreateResponse> getCreateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Create",
      requestType = configpb.Configpb.CreateRequest.class,
      responseType = configpb.Configpb.CreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<configpb.Configpb.CreateRequest,
      configpb.Configpb.CreateResponse> getCreateMethod() {
    io.grpc.MethodDescriptor<configpb.Configpb.CreateRequest, configpb.Configpb.CreateResponse> getCreateMethod;
    if ((getCreateMethod = ConfigGrpc.getCreateMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getCreateMethod = ConfigGrpc.getCreateMethod) == null) {
          ConfigGrpc.getCreateMethod = getCreateMethod =
              io.grpc.MethodDescriptor.<configpb.Configpb.CreateRequest, configpb.Configpb.CreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Create"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.CreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.CreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Create"))
              .build();
        }
      }
    }
    return getCreateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<configpb.Configpb.GetAllRequest,
      configpb.Configpb.GetAllResponse> getGetAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAll",
      requestType = configpb.Configpb.GetAllRequest.class,
      responseType = configpb.Configpb.GetAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<configpb.Configpb.GetAllRequest,
      configpb.Configpb.GetAllResponse> getGetAllMethod() {
    io.grpc.MethodDescriptor<configpb.Configpb.GetAllRequest, configpb.Configpb.GetAllResponse> getGetAllMethod;
    if ((getGetAllMethod = ConfigGrpc.getGetAllMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getGetAllMethod = ConfigGrpc.getGetAllMethod) == null) {
          ConfigGrpc.getGetAllMethod = getGetAllMethod =
              io.grpc.MethodDescriptor.<configpb.Configpb.GetAllRequest, configpb.Configpb.GetAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.GetAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("GetAll"))
              .build();
        }
      }
    }
    return getGetAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<configpb.Configpb.GetRequest,
      configpb.Configpb.GetResponse> getGetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Get",
      requestType = configpb.Configpb.GetRequest.class,
      responseType = configpb.Configpb.GetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<configpb.Configpb.GetRequest,
      configpb.Configpb.GetResponse> getGetMethod() {
    io.grpc.MethodDescriptor<configpb.Configpb.GetRequest, configpb.Configpb.GetResponse> getGetMethod;
    if ((getGetMethod = ConfigGrpc.getGetMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getGetMethod = ConfigGrpc.getGetMethod) == null) {
          ConfigGrpc.getGetMethod = getGetMethod =
              io.grpc.MethodDescriptor.<configpb.Configpb.GetRequest, configpb.Configpb.GetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Get"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.GetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.GetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Get"))
              .build();
        }
      }
    }
    return getGetMethod;
  }

  private static volatile io.grpc.MethodDescriptor<configpb.Configpb.UpdateRequest,
      configpb.Configpb.UpdateResponse> getUpdateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Update",
      requestType = configpb.Configpb.UpdateRequest.class,
      responseType = configpb.Configpb.UpdateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<configpb.Configpb.UpdateRequest,
      configpb.Configpb.UpdateResponse> getUpdateMethod() {
    io.grpc.MethodDescriptor<configpb.Configpb.UpdateRequest, configpb.Configpb.UpdateResponse> getUpdateMethod;
    if ((getUpdateMethod = ConfigGrpc.getUpdateMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getUpdateMethod = ConfigGrpc.getUpdateMethod) == null) {
          ConfigGrpc.getUpdateMethod = getUpdateMethod =
              io.grpc.MethodDescriptor.<configpb.Configpb.UpdateRequest, configpb.Configpb.UpdateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Update"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.UpdateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.UpdateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Update"))
              .build();
        }
      }
    }
    return getUpdateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<configpb.Configpb.DeleteRequest,
      configpb.Configpb.DeleteResponse> getDeleteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Delete",
      requestType = configpb.Configpb.DeleteRequest.class,
      responseType = configpb.Configpb.DeleteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<configpb.Configpb.DeleteRequest,
      configpb.Configpb.DeleteResponse> getDeleteMethod() {
    io.grpc.MethodDescriptor<configpb.Configpb.DeleteRequest, configpb.Configpb.DeleteResponse> getDeleteMethod;
    if ((getDeleteMethod = ConfigGrpc.getDeleteMethod) == null) {
      synchronized (ConfigGrpc.class) {
        if ((getDeleteMethod = ConfigGrpc.getDeleteMethod) == null) {
          ConfigGrpc.getDeleteMethod = getDeleteMethod =
              io.grpc.MethodDescriptor.<configpb.Configpb.DeleteRequest, configpb.Configpb.DeleteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Delete"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.DeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  configpb.Configpb.DeleteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ConfigMethodDescriptorSupplier("Delete"))
              .build();
        }
      }
    }
    return getDeleteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ConfigStub newStub(io.grpc.Channel channel) {
    return new ConfigStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ConfigBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ConfigBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ConfigFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ConfigFutureStub(channel);
  }

  /**
   */
  public static abstract class ConfigImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(configpb.Configpb.CreateRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.CreateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMethod(), responseObserver);
    }

    /**
     */
    public void getAll(configpb.Configpb.GetAllRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.GetAllResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAllMethod(), responseObserver);
    }

    /**
     */
    public void get(configpb.Configpb.GetRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.GetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMethod(), responseObserver);
    }

    /**
     */
    public void update(configpb.Configpb.UpdateRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.UpdateResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateMethod(), responseObserver);
    }

    /**
     */
    public void delete(configpb.Configpb.DeleteRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.DeleteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                configpb.Configpb.CreateRequest,
                configpb.Configpb.CreateResponse>(
                  this, METHODID_CREATE)))
          .addMethod(
            getGetAllMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                configpb.Configpb.GetAllRequest,
                configpb.Configpb.GetAllResponse>(
                  this, METHODID_GET_ALL)))
          .addMethod(
            getGetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                configpb.Configpb.GetRequest,
                configpb.Configpb.GetResponse>(
                  this, METHODID_GET)))
          .addMethod(
            getUpdateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                configpb.Configpb.UpdateRequest,
                configpb.Configpb.UpdateResponse>(
                  this, METHODID_UPDATE)))
          .addMethod(
            getDeleteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                configpb.Configpb.DeleteRequest,
                configpb.Configpb.DeleteResponse>(
                  this, METHODID_DELETE)))
          .build();
    }
  }

  /**
   */
  public static final class ConfigStub extends io.grpc.stub.AbstractStub<ConfigStub> {
    private ConfigStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigStub(channel, callOptions);
    }

    /**
     */
    public void create(configpb.Configpb.CreateRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.CreateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAll(configpb.Configpb.GetAllRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.GetAllResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void get(configpb.Configpb.GetRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.GetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void update(configpb.Configpb.UpdateRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.UpdateResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void delete(configpb.Configpb.DeleteRequest request,
        io.grpc.stub.StreamObserver<configpb.Configpb.DeleteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ConfigBlockingStub extends io.grpc.stub.AbstractStub<ConfigBlockingStub> {
    private ConfigBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigBlockingStub(channel, callOptions);
    }

    /**
     */
    public configpb.Configpb.CreateResponse create(configpb.Configpb.CreateRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMethod(), getCallOptions(), request);
    }

    /**
     */
    public configpb.Configpb.GetAllResponse getAll(configpb.Configpb.GetAllRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public configpb.Configpb.GetResponse get(configpb.Configpb.GetRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMethod(), getCallOptions(), request);
    }

    /**
     */
    public configpb.Configpb.UpdateResponse update(configpb.Configpb.UpdateRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateMethod(), getCallOptions(), request);
    }

    /**
     */
    public configpb.Configpb.DeleteResponse delete(configpb.Configpb.DeleteRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ConfigFutureStub extends io.grpc.stub.AbstractStub<ConfigFutureStub> {
    private ConfigFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ConfigFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ConfigFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ConfigFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<configpb.Configpb.CreateResponse> create(
        configpb.Configpb.CreateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<configpb.Configpb.GetAllResponse> getAll(
        configpb.Configpb.GetAllRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<configpb.Configpb.GetResponse> get(
        configpb.Configpb.GetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<configpb.Configpb.UpdateResponse> update(
        configpb.Configpb.UpdateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<configpb.Configpb.DeleteResponse> delete(
        configpb.Configpb.DeleteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;
  private static final int METHODID_GET_ALL = 1;
  private static final int METHODID_GET = 2;
  private static final int METHODID_UPDATE = 3;
  private static final int METHODID_DELETE = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ConfigImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ConfigImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((configpb.Configpb.CreateRequest) request,
              (io.grpc.stub.StreamObserver<configpb.Configpb.CreateResponse>) responseObserver);
          break;
        case METHODID_GET_ALL:
          serviceImpl.getAll((configpb.Configpb.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<configpb.Configpb.GetAllResponse>) responseObserver);
          break;
        case METHODID_GET:
          serviceImpl.get((configpb.Configpb.GetRequest) request,
              (io.grpc.stub.StreamObserver<configpb.Configpb.GetResponse>) responseObserver);
          break;
        case METHODID_UPDATE:
          serviceImpl.update((configpb.Configpb.UpdateRequest) request,
              (io.grpc.stub.StreamObserver<configpb.Configpb.UpdateResponse>) responseObserver);
          break;
        case METHODID_DELETE:
          serviceImpl.delete((configpb.Configpb.DeleteRequest) request,
              (io.grpc.stub.StreamObserver<configpb.Configpb.DeleteResponse>) responseObserver);
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

  private static abstract class ConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ConfigBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return configpb.Configpb.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Config");
    }
  }

  private static final class ConfigFileDescriptorSupplier
      extends ConfigBaseDescriptorSupplier {
    ConfigFileDescriptorSupplier() {}
  }

  private static final class ConfigMethodDescriptorSupplier
      extends ConfigBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ConfigMethodDescriptorSupplier(String methodName) {
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
      synchronized (ConfigGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ConfigFileDescriptorSupplier())
              .addMethod(getCreateMethod())
              .addMethod(getGetAllMethod())
              .addMethod(getGetMethod())
              .addMethod(getUpdateMethod())
              .addMethod(getDeleteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
