package via.sep3.grpcserver.protobuf.ratingservices;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: rating.proto")
public final class RatingServicesGrpc {

  private RatingServicesGrpc() {}

  public static final String SERVICE_NAME = "RatingServices";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getCreateRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateRating",
      requestType = via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ratingservices.RatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getCreateRatingMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getCreateRatingMethod;
    if ((getCreateRatingMethod = RatingServicesGrpc.getCreateRatingMethod) == null) {
      synchronized (RatingServicesGrpc.class) {
        if ((getCreateRatingMethod = RatingServicesGrpc.getCreateRatingMethod) == null) {
          RatingServicesGrpc.getCreateRatingMethod = getCreateRatingMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServicesMethodDescriptorSupplier("CreateRating"))
              .build();
        }
      }
    }
    return getCreateRatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getGetRatingByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRatingById",
      requestType = via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ratingservices.RatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getGetRatingByIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getGetRatingByIdMethod;
    if ((getGetRatingByIdMethod = RatingServicesGrpc.getGetRatingByIdMethod) == null) {
      synchronized (RatingServicesGrpc.class) {
        if ((getGetRatingByIdMethod = RatingServicesGrpc.getGetRatingByIdMethod) == null) {
          RatingServicesGrpc.getGetRatingByIdMethod = getGetRatingByIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRatingById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServicesMethodDescriptorSupplier("GetRatingById"))
              .build();
        }
      }
    }
    return getGetRatingByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetAllRatingsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllRatings",
      requestType = via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetAllRatingsMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetAllRatingsMethod;
    if ((getGetAllRatingsMethod = RatingServicesGrpc.getGetAllRatingsMethod) == null) {
      synchronized (RatingServicesGrpc.class) {
        if ((getGetAllRatingsMethod = RatingServicesGrpc.getGetAllRatingsMethod) == null) {
          RatingServicesGrpc.getGetAllRatingsMethod = getGetAllRatingsMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllRatings"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServicesMethodDescriptorSupplier("GetAllRatings"))
              .build();
        }
      }
    }
    return getGetAllRatingsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetRatingsByWriterEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRatingsByWriterEmail",
      requestType = via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetRatingsByWriterEmailMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetRatingsByWriterEmailMethod;
    if ((getGetRatingsByWriterEmailMethod = RatingServicesGrpc.getGetRatingsByWriterEmailMethod) == null) {
      synchronized (RatingServicesGrpc.class) {
        if ((getGetRatingsByWriterEmailMethod = RatingServicesGrpc.getGetRatingsByWriterEmailMethod) == null) {
          RatingServicesGrpc.getGetRatingsByWriterEmailMethod = getGetRatingsByWriterEmailMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRatingsByWriterEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServicesMethodDescriptorSupplier("GetRatingsByWriterEmail"))
              .build();
        }
      }
    }
    return getGetRatingsByWriterEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetRatingsBySubjectEmailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetRatingsBySubjectEmail",
      requestType = via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetRatingsBySubjectEmailMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getGetRatingsBySubjectEmailMethod;
    if ((getGetRatingsBySubjectEmailMethod = RatingServicesGrpc.getGetRatingsBySubjectEmailMethod) == null) {
      synchronized (RatingServicesGrpc.class) {
        if ((getGetRatingsBySubjectEmailMethod = RatingServicesGrpc.getGetRatingsBySubjectEmailMethod) == null) {
          RatingServicesGrpc.getGetRatingsBySubjectEmailMethod = getGetRatingsBySubjectEmailMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetRatingsBySubjectEmail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServicesMethodDescriptorSupplier("GetRatingsBySubjectEmail"))
              .build();
        }
      }
    }
    return getGetRatingsBySubjectEmailMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getDeleteRatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteRating",
      requestType = via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest.class,
      responseType = via.sep3.grpcserver.protobuf.ratingservices.RatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest,
      via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getDeleteRatingMethod() {
    io.grpc.MethodDescriptor<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getDeleteRatingMethod;
    if ((getDeleteRatingMethod = RatingServicesGrpc.getDeleteRatingMethod) == null) {
      synchronized (RatingServicesGrpc.class) {
        if ((getDeleteRatingMethod = RatingServicesGrpc.getDeleteRatingMethod) == null) {
          RatingServicesGrpc.getDeleteRatingMethod = getDeleteRatingMethod =
              io.grpc.MethodDescriptor.<via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest, via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteRating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.grpcserver.protobuf.ratingservices.RatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RatingServicesMethodDescriptorSupplier("DeleteRating"))
              .build();
        }
      }
    }
    return getDeleteRatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RatingServicesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingServicesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingServicesStub>() {
        @java.lang.Override
        public RatingServicesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingServicesStub(channel, callOptions);
        }
      };
    return RatingServicesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RatingServicesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingServicesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingServicesBlockingStub>() {
        @java.lang.Override
        public RatingServicesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingServicesBlockingStub(channel, callOptions);
        }
      };
    return RatingServicesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RatingServicesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RatingServicesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RatingServicesFutureStub>() {
        @java.lang.Override
        public RatingServicesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RatingServicesFutureStub(channel, callOptions);
        }
      };
    return RatingServicesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RatingServicesImplBase implements io.grpc.BindableService {

    /**
     */
    public void createRating(via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRatingMethod(), responseObserver);
    }

    /**
     */
    public void getRatingById(via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRatingByIdMethod(), responseObserver);
    }

    /**
     */
    public void getAllRatings(via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllRatingsMethod(), responseObserver);
    }

    /**
     */
    public void getRatingsByWriterEmail(via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRatingsByWriterEmailMethod(), responseObserver);
    }

    /**
     */
    public void getRatingsBySubjectEmail(via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRatingsBySubjectEmailMethod(), responseObserver);
    }

    /**
     */
    public void deleteRating(via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteRatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getCreateRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest,
                via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>(
                  this, METHODID_CREATE_RATING)))
          .addMethod(
            getGetRatingByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest,
                via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>(
                  this, METHODID_GET_RATING_BY_ID)))
          .addMethod(
            getGetAllRatingsMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest,
                via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>(
                  this, METHODID_GET_ALL_RATINGS)))
          .addMethod(
            getGetRatingsByWriterEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest,
                via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>(
                  this, METHODID_GET_RATINGS_BY_WRITER_EMAIL)))
          .addMethod(
            getGetRatingsBySubjectEmailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest,
                via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>(
                  this, METHODID_GET_RATINGS_BY_SUBJECT_EMAIL)))
          .addMethod(
            getDeleteRatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest,
                via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>(
                  this, METHODID_DELETE_RATING)))
          .build();
    }
  }

  /**
   */
  public static final class RatingServicesStub extends io.grpc.stub.AbstractAsyncStub<RatingServicesStub> {
    private RatingServicesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServicesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingServicesStub(channel, callOptions);
    }

    /**
     */
    public void createRating(via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRatingById(via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRatingByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAllRatings(via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAllRatingsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRatingsByWriterEmail(via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRatingsByWriterEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRatingsBySubjectEmail(via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRatingsBySubjectEmailMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteRating(via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request,
        io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteRatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RatingServicesBlockingStub extends io.grpc.stub.AbstractBlockingStub<RatingServicesBlockingStub> {
    private RatingServicesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServicesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingServicesBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ratingservices.RatingResponse createRating(via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ratingservices.RatingResponse getRatingById(via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRatingByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple getAllRatings(via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAllRatingsMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple getRatingsByWriterEmail(via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRatingsByWriterEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple getRatingsBySubjectEmail(via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRatingsBySubjectEmailMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.grpcserver.protobuf.ratingservices.RatingResponse deleteRating(via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteRatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RatingServicesFutureStub extends io.grpc.stub.AbstractFutureStub<RatingServicesFutureStub> {
    private RatingServicesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RatingServicesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RatingServicesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> createRating(
        via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> getRatingById(
        via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRatingByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getAllRatings(
        via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAllRatingsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getRatingsByWriterEmail(
        via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRatingsByWriterEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple> getRatingsBySubjectEmail(
        via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRatingsBySubjectEmailMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse> deleteRating(
        via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteRatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE_RATING = 0;
  private static final int METHODID_GET_RATING_BY_ID = 1;
  private static final int METHODID_GET_ALL_RATINGS = 2;
  private static final int METHODID_GET_RATINGS_BY_WRITER_EMAIL = 3;
  private static final int METHODID_GET_RATINGS_BY_SUBJECT_EMAIL = 4;
  private static final int METHODID_DELETE_RATING = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RatingServicesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RatingServicesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE_RATING:
          serviceImpl.createRating((via.sep3.grpcserver.protobuf.ratingservices.RatingCreationRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>) responseObserver);
          break;
        case METHODID_GET_RATING_BY_ID:
          serviceImpl.getRatingById((via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>) responseObserver);
          break;
        case METHODID_GET_ALL_RATINGS:
          serviceImpl.getAllRatings((via.sep3.grpcserver.protobuf.ratingservices.GetAllRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>) responseObserver);
          break;
        case METHODID_GET_RATINGS_BY_WRITER_EMAIL:
          serviceImpl.getRatingsByWriterEmail((via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>) responseObserver);
          break;
        case METHODID_GET_RATINGS_BY_SUBJECT_EMAIL:
          serviceImpl.getRatingsBySubjectEmail((via.sep3.grpcserver.protobuf.ratingservices.UserEmailRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponseMultiple>) responseObserver);
          break;
        case METHODID_DELETE_RATING:
          serviceImpl.deleteRating((via.sep3.grpcserver.protobuf.ratingservices.RatingIdRequest) request,
              (io.grpc.stub.StreamObserver<via.sep3.grpcserver.protobuf.ratingservices.RatingResponse>) responseObserver);
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

  private static abstract class RatingServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RatingServicesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.grpcserver.protobuf.ratingservices.Rating.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RatingServices");
    }
  }

  private static final class RatingServicesFileDescriptorSupplier
      extends RatingServicesBaseDescriptorSupplier {
    RatingServicesFileDescriptorSupplier() {}
  }

  private static final class RatingServicesMethodDescriptorSupplier
      extends RatingServicesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RatingServicesMethodDescriptorSupplier(String methodName) {
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
      synchronized (RatingServicesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RatingServicesFileDescriptorSupplier())
              .addMethod(getCreateRatingMethod())
              .addMethod(getGetRatingByIdMethod())
              .addMethod(getGetAllRatingsMethod())
              .addMethod(getGetRatingsByWriterEmailMethod())
              .addMethod(getGetRatingsBySubjectEmailMethod())
              .addMethod(getDeleteRatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
