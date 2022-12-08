package via.sep3.grpcserver.protobuf.notificationservices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: notification.proto")
public final class NotificationServicesGrpc {

  private NotificationServicesGrpc() {}

  public static final String SERVICE_NAME = "NotificationServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification,
      via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification> getCreateRequestNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRequestNotification",
      requestType = via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.class,
      responseType = via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification,
      via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification> getCreateRequestNotificationMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification, via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification> getCreateRequestNotificationMethod;
    if ((getCreateRequestNotificationMethod = NotificationServicesGrpc.getCreateRequestNotificationMethod) == null) {
      synchronized (NotificationServicesGrpc.class) {
        if ((getCreateRequestNotificationMethod = NotificationServicesGrpc.getCreateRequestNotificationMethod) == null) {
          NotificationServicesGrpc.getCreateRequestNotificationMethod = getCreateRequestNotificationMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification, via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRequestNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServicesMethodDescriptorSupplier("createRequestNotification"))
              .build();
        }
      }
    }
    return getCreateRequestNotificationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications,
      via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications> getGetNotificationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getNotification",
      requestType = via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications.class,
      responseType = via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications,
      via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications> getGetNotificationMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications, via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications> getGetNotificationMethod;
    if ((getGetNotificationMethod = NotificationServicesGrpc.getGetNotificationMethod) == null) {
      synchronized (NotificationServicesGrpc.class) {
        if ((getGetNotificationMethod = NotificationServicesGrpc.getGetNotificationMethod) == null) {
          NotificationServicesGrpc.getGetNotificationMethod = getGetNotificationMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications, via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getNotification"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServicesMethodDescriptorSupplier("getNotification"))
              .build();
        }
      }
    }
    return getGetNotificationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServicesStub>() {
        @java.lang.Override
        public NotificationServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServicesStub(channel, callOptions);
        }
      };
    return NotificationServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServicesBlockingStub>() {
        @java.lang.Override
        public NotificationServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServicesBlockingStub(channel, callOptions);
        }
      };
    return NotificationServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServicesFutureStub>() {
        @java.lang.Override
        public NotificationServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServicesFutureStub(channel, callOptions);
        }
      };
    return NotificationServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class NotificationServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRequestNotification(via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRequestNotificationMethod(), responseObserver);
    }

    /**
     */
    public void getNotification(via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetNotificationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRequestNotificationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification,
                via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification>(
                  this, METHODID_CREATE_REQUEST_NOTIFICATION)))
          .addMethod(
            getGetNotificationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications,
                via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications>(
                  this, METHODID_GET_NOTIFICATION)))
          .build();
    }
  }

  /**
   */
  public static final class NotificationServicesStub extends io.grpc.stub.AbstractAsyncStub<NotificationServicesStub> {
    private NotificationServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServicesStub(channel, callOptions);
    }

    /**
     */
    public void createRequestNotification(via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRequestNotificationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getNotification(via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class NotificationServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<NotificationServicesBlockingStub> {
    private NotificationServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification createRequestNotification(via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRequestNotificationMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications getNotification(via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetNotificationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class NotificationServicesFutureStub extends io.grpc.stub.AbstractFutureStub<NotificationServicesFutureStub> {
    private NotificationServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification> createRequestNotification(
        via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRequestNotificationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications> getNotification(
        via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetNotificationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_REQUEST_NOTIFICATION = 0;
  private static final int METHODID_GET_NOTIFICATION = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_REQUEST_NOTIFICATION:
          serviceImpl.createRequestNotification((via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.notificationservices.ResponseSeatNotification>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION:
          serviceImpl.getNotification((via.sep3.grpcserver.protobuf.notificationservices.RequestGetMyNotifications) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.notificationservices.ResponseActiveNotifications>) responseObserver);
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

  private static abstract class NotificationServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.grpcserver.protobuf.notificationservices.Notification.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationServices");
    }
  }

  private static final class NotificationServicesFileDescriptorSupplier
      extends NotificationServicesBaseDescriptorSupplier {
    NotificationServicesFileDescriptorSupplier() {}
  }

  private static final class NotificationServicesMethodDescriptorSupplier
      extends NotificationServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotificationServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationServicesFileDescriptorSupplier())
              .addMethod(getCreateRequestNotificationMethod())
              .addMethod(getGetNotificationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
