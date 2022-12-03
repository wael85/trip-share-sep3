package via.sep3.grpcserver.protobuf.carservices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: car.proto")
public final class CarServicesGrpc {

  private CarServicesGrpc() {}

  public static final String SERVICE_NAME = "CarServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.carservices.RequestCarInfo,
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> getCreateCarMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createCar",
      requestType = via.sep3.grpcserver.protobuf.carservices.RequestCarInfo.class,
      responseType = via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.carservices.RequestCarInfo,
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> getCreateCarMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.carservices.RequestCarInfo, via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> getCreateCarMethod;
    if ((getCreateCarMethod = CarServicesGrpc.getCreateCarMethod) == null) {
      synchronized (CarServicesGrpc.class) {
        if ((getCreateCarMethod = CarServicesGrpc.getCreateCarMethod) == null) {
          CarServicesGrpc.getCreateCarMethod = getCreateCarMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.carservices.RequestCarInfo, via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createCar"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.carservices.RequestCarInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.getDefaultInstance()))
              .setSchemaDescriptor(new CarServicesMethodDescriptorSupplier("createCar"))
              .build();
        }
      }
    }
    return getCreateCarMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.carservices.DriverIdInfo,
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> getGetCarByDriverIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCarByDriverId",
      requestType = via.sep3.grpcserver.protobuf.carservices.DriverIdInfo.class,
      responseType = via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.carservices.DriverIdInfo,
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> getGetCarByDriverIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.carservices.DriverIdInfo, via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> getGetCarByDriverIdMethod;
    if ((getGetCarByDriverIdMethod = CarServicesGrpc.getGetCarByDriverIdMethod) == null) {
      synchronized (CarServicesGrpc.class) {
        if ((getGetCarByDriverIdMethod = CarServicesGrpc.getGetCarByDriverIdMethod) == null) {
          CarServicesGrpc.getGetCarByDriverIdMethod = getGetCarByDriverIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.carservices.DriverIdInfo, via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCarByDriverId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.carservices.DriverIdInfo.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.getDefaultInstance()))
              .setSchemaDescriptor(new CarServicesMethodDescriptorSupplier("getCarByDriverId"))
              .build();
        }
      }
    }
    return getGetCarByDriverIdMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CarServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServicesStub>() {
        @java.lang.Override
        public CarServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServicesStub(channel, callOptions);
        }
      };
    return CarServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CarServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServicesBlockingStub>() {
        @java.lang.Override
        public CarServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServicesBlockingStub(channel, callOptions);
        }
      };
    return CarServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CarServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CarServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CarServicesFutureStub>() {
        @java.lang.Override
        public CarServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CarServicesFutureStub(channel, callOptions);
        }
      };
    return CarServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CarServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void createCar(via.sep3.grpcserver.protobuf.carservices.RequestCarInfo request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCarMethod(), responseObserver);
    }

    /**
     */
    public void getCarByDriverId(via.sep3.grpcserver.protobuf.carservices.DriverIdInfo request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCarByDriverIdMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateCarMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.carservices.RequestCarInfo,
                via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo>(
                  this, METHODID_CREATE_CAR)))
          .addMethod(
            getGetCarByDriverIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.carservices.DriverIdInfo,
                via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo>(
                  this, METHODID_GET_CAR_BY_DRIVER_ID)))
          .build();
    }
  }

  /**
   */
  public static final class CarServicesStub extends io.grpc.stub.AbstractAsyncStub<CarServicesStub> {
    private CarServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServicesStub(channel, callOptions);
    }

    /**
     */
    public void createCar(via.sep3.grpcserver.protobuf.carservices.RequestCarInfo request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCarMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCarByDriverId(via.sep3.grpcserver.protobuf.carservices.DriverIdInfo request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCarByDriverIdMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CarServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<CarServicesBlockingStub> {
    private CarServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo createCar(via.sep3.grpcserver.protobuf.carservices.RequestCarInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCarMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo getCarByDriverId(via.sep3.grpcserver.protobuf.carservices.DriverIdInfo request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCarByDriverIdMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CarServicesFutureStub extends io.grpc.stub.AbstractFutureStub<CarServicesFutureStub> {
    private CarServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CarServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CarServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> createCar(
        via.sep3.grpcserver.protobuf.carservices.RequestCarInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCarMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo> getCarByDriverId(
        via.sep3.grpcserver.protobuf.carservices.DriverIdInfo request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCarByDriverIdMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_CAR = 0;
  private static final int METHODID_GET_CAR_BY_DRIVER_ID = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CarServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CarServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_CAR:
          serviceImpl.createCar((via.sep3.grpcserver.protobuf.carservices.RequestCarInfo) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo>) responseObserver);
          break;
        case METHODID_GET_CAR_BY_DRIVER_ID:
          serviceImpl.getCarByDriverId((via.sep3.grpcserver.protobuf.carservices.DriverIdInfo) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo>) responseObserver);
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

  private static abstract class CarServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CarServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.grpcserver.protobuf.carservices.Car.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CarServices");
    }
  }

  private static final class CarServicesFileDescriptorSupplier
      extends CarServicesBaseDescriptorSupplier {
    CarServicesFileDescriptorSupplier() {}
  }

  private static final class CarServicesMethodDescriptorSupplier
      extends CarServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CarServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (CarServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CarServicesFileDescriptorSupplier())
              .addMethod(getCreateCarMethod())
              .addMethod(getGetCarByDriverIdMethod())
              .build();
        }
      }
    }
    return result;
  }
}
