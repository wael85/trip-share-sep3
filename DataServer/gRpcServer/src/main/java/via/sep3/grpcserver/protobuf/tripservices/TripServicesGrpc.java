package via.sep3.grpcserver.protobuf.tripservices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: trip.proto")
public final class TripServicesGrpc {

  private TripServicesGrpc() {}

  public static final String SERVICE_NAME = "TripServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest,
      via.sep3.grpcserver.protobuf.tripservices.TripResponse> getCreateTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTrip",
      requestType = via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest.class,
      responseType = via.sep3.grpcserver.protobuf.tripservices.TripResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest,
      via.sep3.grpcserver.protobuf.tripservices.TripResponse> getCreateTripMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest, via.sep3.grpcserver.protobuf.tripservices.TripResponse> getCreateTripMethod;
    if ((getCreateTripMethod = TripServicesGrpc.getCreateTripMethod) == null) {
      synchronized (TripServicesGrpc.class) {
        if ((getCreateTripMethod = TripServicesGrpc.getCreateTripMethod) == null) {
          TripServicesGrpc.getCreateTripMethod = getCreateTripMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest, via.sep3.grpcserver.protobuf.tripservices.TripResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.tripservices.TripResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TripServicesMethodDescriptorSupplier("createTrip"))
              .build();
        }
      }
    }
    return getCreateTripMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest,
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getGetTripsByUserIDMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTripsByUserID",
      requestType = via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest.class,
      responseType = via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest,
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getGetTripsByUserIDMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest, via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getGetTripsByUserIDMethod;
    if ((getGetTripsByUserIDMethod = TripServicesGrpc.getGetTripsByUserIDMethod) == null) {
      synchronized (TripServicesGrpc.class) {
        if ((getGetTripsByUserIDMethod = TripServicesGrpc.getGetTripsByUserIDMethod) == null) {
          TripServicesGrpc.getGetTripsByUserIDMethod = getGetTripsByUserIDMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest, via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTripsByUserID"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TripServicesMethodDescriptorSupplier("getTripsByUserID"))
              .build();
        }
      }
    }
    return getGetTripsByUserIDMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.Emptymessage,
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getGetAllTripsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAllTrips",
      requestType = via.sep3.grpcserver.protobuf.tripservices.Emptymessage.class,
      responseType = via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.Emptymessage,
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getGetAllTripsMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.tripservices.Emptymessage, via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getGetAllTripsMethod;
    if ((getGetAllTripsMethod = TripServicesGrpc.getGetAllTripsMethod) == null) {
      synchronized (TripServicesGrpc.class) {
        if ((getGetAllTripsMethod = TripServicesGrpc.getGetAllTripsMethod) == null) {
          TripServicesGrpc.getGetAllTripsMethod = getGetAllTripsMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.tripservices.Emptymessage, via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getAllTrips"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.tripservices.Emptymessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TripServicesMethodDescriptorSupplier("getAllTrips"))
              .build();
        }
      }
    }
    return getGetAllTripsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TripServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripServicesStub>() {
        @java.lang.Override
        public TripServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripServicesStub(channel, callOptions);
        }
      };
    return TripServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TripServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripServicesBlockingStub>() {
        @java.lang.Override
        public TripServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripServicesBlockingStub(channel, callOptions);
        }
      };
    return TripServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TripServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TripServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TripServicesFutureStub>() {
        @java.lang.Override
        public TripServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TripServicesFutureStub(channel, callOptions);
        }
      };
    return TripServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TripServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTrip(via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTripMethod(), responseObserver);
    }

    /**
     */
    public void getTripsByUserID(via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTripsByUserIDMethod(), responseObserver);
    }

    /**
     */
    public void getAllTrips(via.sep3.grpcserver.protobuf.tripservices.Emptymessage request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllTripsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTripMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest,
                via.sep3.grpcserver.protobuf.tripservices.TripResponse>(
                  this, METHODID_CREATE_TRIP)))
          .addMethod(
            getGetTripsByUserIDMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest,
                via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse>(
                  this, METHODID_GET_TRIPS_BY_USER_ID)))
          .addMethod(
            getGetAllTripsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.tripservices.Emptymessage,
                via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse>(
                  this, METHODID_GET_ALL_TRIPS)))
          .build();
    }
  }

  /**
   */
  public static final class TripServicesStub extends io.grpc.stub.AbstractAsyncStub<TripServicesStub> {
    private TripServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripServicesStub(channel, callOptions);
    }

    /**
     */
    public void createTrip(via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTripMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTripsByUserID(via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTripsByUserIDMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllTrips(via.sep3.grpcserver.protobuf.tripservices.Emptymessage request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllTripsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TripServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<TripServicesBlockingStub> {
    private TripServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripResponse createTrip(via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTripMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse getTripsByUserID(via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTripsByUserIDMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse getAllTrips(via.sep3.grpcserver.protobuf.tripservices.Emptymessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllTripsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TripServicesFutureStub extends io.grpc.stub.AbstractFutureStub<TripServicesFutureStub> {
    private TripServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TripServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TripServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.tripservices.TripResponse> createTrip(
        via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTripMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getTripsByUserID(
        via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTripsByUserIDMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse> getAllTrips(
        via.sep3.grpcserver.protobuf.tripservices.Emptymessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllTripsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TRIP = 0;
  private static final int METHODID_GET_TRIPS_BY_USER_ID = 1;
  private static final int METHODID_GET_ALL_TRIPS = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TripServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TripServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TRIP:
          serviceImpl.createTrip((via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripResponse>) responseObserver);
          break;
        case METHODID_GET_TRIPS_BY_USER_ID:
          serviceImpl.getTripsByUserID((via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_TRIPS:
          serviceImpl.getAllTrips((via.sep3.grpcserver.protobuf.tripservices.Emptymessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse>) responseObserver);
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

  private static abstract class TripServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TripServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.grpcserver.protobuf.tripservices.Trip.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TripServices");
    }
  }

  private static final class TripServicesFileDescriptorSupplier
      extends TripServicesBaseDescriptorSupplier {
    TripServicesFileDescriptorSupplier() {}
  }

  private static final class TripServicesMethodDescriptorSupplier
      extends TripServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TripServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (TripServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TripServicesFileDescriptorSupplier())
              .addMethod(getCreateTripMethod())
              .addMethod(getGetTripsByUserIDMethod())
              .addMethod(getGetAllTripsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
