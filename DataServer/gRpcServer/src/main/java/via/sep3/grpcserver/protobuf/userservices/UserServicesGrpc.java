package via.sep3.grpcserver.protobuf.userservices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: user.proto")
public final class UserServicesGrpc {

  private UserServicesGrpc() {}

  public static final String SERVICE_NAME = "UserServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.RequestUserInfo,
      via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getCreateUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createUser",
      requestType = via.sep3.grpcserver.protobuf.userservices.RequestUserInfo.class,
      responseType = via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.RequestUserInfo,
      via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getCreateUserMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.RequestUserInfo, via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getCreateUserMethod;
    if ((getCreateUserMethod = UserServicesGrpc.getCreateUserMethod) == null) {
      synchronized (UserServicesGrpc.class) {
        if ((getCreateUserMethod = UserServicesGrpc.getCreateUserMethod) == null) {
          UserServicesGrpc.getCreateUserMethod = getCreateUserMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.userservices.RequestUserInfo, via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.userservices.RequestUserInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo.getDefaultInstance()))
              .setSchemaDescriptor(new UserServicesMethodDescriptorSupplier("createUser"))
              .build();
        }
      }
    }
    return getCreateUserMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.GetUserRequest,
      via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getGetUserByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUserById",
      requestType = via.sep3.grpcserver.protobuf.userservices.GetUserRequest.class,
      responseType = via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.GetUserRequest,
      via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getGetUserByIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.GetUserRequest, via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getGetUserByIdMethod;
    if ((getGetUserByIdMethod = UserServicesGrpc.getGetUserByIdMethod) == null) {
      synchronized (UserServicesGrpc.class) {
        if ((getGetUserByIdMethod = UserServicesGrpc.getGetUserByIdMethod) == null) {
          UserServicesGrpc.getGetUserByIdMethod = getGetUserByIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.userservices.GetUserRequest, via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUserById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.userservices.GetUserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo.getDefaultInstance()))
              .setSchemaDescriptor(new UserServicesMethodDescriptorSupplier("GetUserById"))
              .build();
        }
      }
    }
    return getGetUserByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.LoginUserMessage,
      via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getLoginUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "LoginUser",
      requestType = via.sep3.grpcserver.protobuf.userservices.LoginUserMessage.class,
      responseType = via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.LoginUserMessage,
      via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getLoginUserMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.userservices.LoginUserMessage, via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getLoginUserMethod;
    if ((getLoginUserMethod = UserServicesGrpc.getLoginUserMethod) == null) {
      synchronized (UserServicesGrpc.class) {
        if ((getLoginUserMethod = UserServicesGrpc.getLoginUserMethod) == null) {
          UserServicesGrpc.getLoginUserMethod = getLoginUserMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.userservices.LoginUserMessage, via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "LoginUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.userservices.LoginUserMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo.getDefaultInstance()))
              .setSchemaDescriptor(new UserServicesMethodDescriptorSupplier("LoginUser"))
              .build();
        }
      }
    }
    return getLoginUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServicesStub>() {
        @java.lang.Override
        public UserServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServicesStub(channel, callOptions);
        }
      };
    return UserServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServicesBlockingStub>() {
        @java.lang.Override
        public UserServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServicesBlockingStub(channel, callOptions);
        }
      };
    return UserServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServicesFutureStub>() {
        @java.lang.Override
        public UserServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServicesFutureStub(channel, callOptions);
        }
      };
    return UserServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void createUser(via.sep3.grpcserver.protobuf.userservices.RequestUserInfo request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateUserMethod(), responseObserver);
    }

    /**
     */
    public void getUserById(via.sep3.grpcserver.protobuf.userservices.GetUserRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserByIdMethod(), responseObserver);
    }

    /**
     */
    public void loginUser(via.sep3.grpcserver.protobuf.userservices.LoginUserMessage request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.userservices.RequestUserInfo,
                via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>(
                  this, METHODID_CREATE_USER)))
          .addMethod(
            getGetUserByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.userservices.GetUserRequest,
                via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>(
                  this, METHODID_GET_USER_BY_ID)))
          .addMethod(
            getLoginUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.userservices.LoginUserMessage,
                via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>(
                  this, METHODID_LOGIN_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServicesStub extends io.grpc.stub.AbstractAsyncStub<UserServicesStub> {
    private UserServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServicesStub(channel, callOptions);
    }

    /**
     */
    public void createUser(via.sep3.grpcserver.protobuf.userservices.RequestUserInfo request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getUserById(via.sep3.grpcserver.protobuf.userservices.GetUserRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loginUser(via.sep3.grpcserver.protobuf.userservices.LoginUserMessage request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServicesBlockingStub> {
    private UserServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo createUser(via.sep3.grpcserver.protobuf.userservices.RequestUserInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateUserMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo getUserById(via.sep3.grpcserver.protobuf.userservices.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo loginUser(via.sep3.grpcserver.protobuf.userservices.LoginUserMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServicesFutureStub extends io.grpc.stub.AbstractFutureStub<UserServicesFutureStub> {
    private UserServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> createUser(
        via.sep3.grpcserver.protobuf.userservices.RequestUserInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateUserMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> getUserById(
        via.sep3.grpcserver.protobuf.userservices.GetUserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo> loginUser(
        via.sep3.grpcserver.protobuf.userservices.LoginUserMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_USER = 0;
  private static final int METHODID_GET_USER_BY_ID = 1;
  private static final int METHODID_LOGIN_USER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_USER:
          serviceImpl.createUser((via.sep3.grpcserver.protobuf.userservices.RequestUserInfo) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>) responseObserver);
          break;
        case METHODID_GET_USER_BY_ID:
          serviceImpl.getUserById((via.sep3.grpcserver.protobuf.userservices.GetUserRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>) responseObserver);
          break;
        case METHODID_LOGIN_USER:
          serviceImpl.loginUser((via.sep3.grpcserver.protobuf.userservices.LoginUserMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo>) responseObserver);
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

  private static abstract class UserServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.grpcserver.protobuf.userservices.User.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserServices");
    }
  }

  private static final class UserServicesFileDescriptorSupplier
      extends UserServicesBaseDescriptorSupplier {
    UserServicesFileDescriptorSupplier() {}
  }

  private static final class UserServicesMethodDescriptorSupplier
      extends UserServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServicesFileDescriptorSupplier())
              .addMethod(getCreateUserMethod())
              .addMethod(getGetUserByIdMethod())
              .addMethod(getLoginUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
