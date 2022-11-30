package via.sep3.grpcserver.protobuf.ticketservices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: ticket.proto")
public final class TicketServicesGrpc {

  private TicketServicesGrpc() {}

  public static final String SERVICE_NAME = "TicketServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest,
      via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse> getCreateTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createTicket",
      requestType = via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest,
      via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse> getCreateTicketMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest, via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse> getCreateTicketMethod;
    if ((getCreateTicketMethod = TicketServicesGrpc.getCreateTicketMethod) == null) {
      synchronized (TicketServicesGrpc.class) {
        if ((getCreateTicketMethod = TicketServicesGrpc.getCreateTicketMethod) == null) {
          TicketServicesGrpc.getCreateTicketMethod = getCreateTicketMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest, via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServicesMethodDescriptorSupplier("createTicket"))
              .build();
        }
      }
    }
    return getCreateTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest,
      via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse> getGetTicketsByTripMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTicketsByTrip",
      requestType = via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest,
      via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse> getGetTicketsByTripMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest, via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse> getGetTicketsByTripMethod;
    if ((getGetTicketsByTripMethod = TicketServicesGrpc.getGetTicketsByTripMethod) == null) {
      synchronized (TicketServicesGrpc.class) {
        if ((getGetTicketsByTripMethod = TicketServicesGrpc.getGetTicketsByTripMethod) == null) {
          TicketServicesGrpc.getGetTicketsByTripMethod = getGetTicketsByTripMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest, via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getTicketsByTrip"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TicketServicesMethodDescriptorSupplier("getTicketsByTrip"))
              .build();
        }
      }
    }
    return getGetTicketsByTripMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TicketServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServicesStub>() {
        @java.lang.Override
        public TicketServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServicesStub(channel, callOptions);
        }
      };
    return TicketServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TicketServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServicesBlockingStub>() {
        @java.lang.Override
        public TicketServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServicesBlockingStub(channel, callOptions);
        }
      };
    return TicketServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TicketServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TicketServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TicketServicesFutureStub>() {
        @java.lang.Override
        public TicketServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TicketServicesFutureStub(channel, callOptions);
        }
      };
    return TicketServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TicketServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void createTicket(via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateTicketMethod(), responseObserver);
    }

    /**
     */
    public void getTicketsByTrip(via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTicketsByTripMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateTicketMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest,
                via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse>(
                  this, METHODID_CREATE_TICKET)))
          .addMethod(
            getGetTicketsByTripMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest,
                via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse>(
                  this, METHODID_GET_TICKETS_BY_TRIP)))
          .build();
    }
  }

  /**
   */
  public static final class TicketServicesStub extends io.grpc.stub.AbstractAsyncStub<TicketServicesStub> {
    private TicketServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServicesStub(channel, callOptions);
    }

    /**
     */
    public void createTicket(via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTicketsByTrip(via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTicketsByTripMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TicketServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<TicketServicesBlockingStub> {
    private TicketServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse createTicket(via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse getTicketsByTrip(via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTicketsByTripMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TicketServicesFutureStub extends io.grpc.stub.AbstractFutureStub<TicketServicesFutureStub> {
    private TicketServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TicketServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TicketServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse> createTicket(
        via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse> getTicketsByTrip(
        via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTicketsByTripMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_TICKET = 0;
  private static final int METHODID_GET_TICKETS_BY_TRIP = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TicketServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TicketServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_TICKET:
          serviceImpl.createTicket((via.sep3.grpcserver.protobuf.ticketservices.SeatTicketCreationRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse>) responseObserver);
          break;
        case METHODID_GET_TICKETS_BY_TRIP:
          serviceImpl.getTicketsByTrip((via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ticketservices.TicketsByTripResponse>) responseObserver);
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

  private static abstract class TicketServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TicketServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.grpcserver.protobuf.ticketservices.Ticket.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("TicketServices");
    }
  }

  private static final class TicketServicesFileDescriptorSupplier
      extends TicketServicesBaseDescriptorSupplier {
    TicketServicesFileDescriptorSupplier() {}
  }

  private static final class TicketServicesMethodDescriptorSupplier
      extends TicketServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TicketServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (TicketServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TicketServicesFileDescriptorSupplier())
              .addMethod(getCreateTicketMethod())
              .addMethod(getGetTicketsByTripMethod())
              .build();
        }
      }
    }
    return result;
  }
}
