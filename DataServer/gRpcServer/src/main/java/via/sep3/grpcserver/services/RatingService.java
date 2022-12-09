package via.sep3.grpcserver.services;

import io.grpc.Metadata;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sep3.grpcserver.Entities.Rating;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.protobuf.carservices.ErrorResponse;
import via.sep3.grpcserver.protobuf.ratingservices.*;
import via.sep3.grpcserver.repositorys.RatingRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@GRpcService
public class RatingService extends RatingServicesGrpc.RatingServicesImplBase {
    RatingRepository ratingRepository;
    UserRepository userRepository;

    public RatingService (RatingRepository ratingRepository, UserRepository userRepository) {
        this.ratingRepository = ratingRepository;
        this.userRepository = userRepository;
    }

    @Override
    public void createRating(RatingCreationRequest request, StreamObserver<RatingResponse> responseObserver) {
        List<Rating> subjectsRatings = ratingRepository.findBySubject_Email(request.getSubjectEmail());

        Optional<User> writer = userRepository.findByEmail(request.getWriterEmail());
        Optional<User> subject = userRepository.findByEmail(request.getSubjectEmail());

        if (writer.isEmpty()) {
            Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
            ErrorResponse errorResponse = ErrorResponse.newBuilder()
                    .setMessage("Writer does not exist")
                    .setStatus(400)
                    .build();
            Metadata metadata = new Metadata();
            metadata.put(errorResponseKey, errorResponse);
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Writer does not exist")
                    .asRuntimeException(metadata));
            return;
        }

        if (subject.isEmpty()) {
            Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
            ErrorResponse errorResponse = ErrorResponse.newBuilder()
                    .setMessage("Subject does not exist")
                    .setStatus(400)
                    .build();
            Metadata metadata = new Metadata();
            metadata.put(errorResponseKey, errorResponse);
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Subject does not exist")
                    .asRuntimeException(metadata));
            return;
        }

        if (request.getSubjectEmail().equals(request.getWriterEmail())) {
            Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
            ErrorResponse errorResponse = ErrorResponse.newBuilder()
                    .setMessage("A User can not rate themselves")
                    .setStatus(400)
                    .build();
            Metadata metadata = new Metadata();
            metadata.put(errorResponseKey, errorResponse);
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("A User can not rate themselves")
                    .asRuntimeException(metadata));
            return;
        }

        for (Rating rating: subjectsRatings) {
            if (rating.getWriter().getEmail().equals(request.getWriterEmail())) {
                Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
                ErrorResponse errorResponse = ErrorResponse.newBuilder()
                        .setMessage("A rating for this user has already been written by this driver")
                        .setStatus(400)
                        .build();
                Metadata metadata = new Metadata();
                metadata.put(errorResponseKey, errorResponse);
                responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("A rating for this user has already been written by this driver")
                        .asRuntimeException(metadata));
                return;
            }
        }

        Rating rating = new Rating();
        rating.setWriter(writer.get());
        rating.setSubject(subject.get());
        rating.setRating(request.getRating());
        rating.setComment(request.getRatingComment());

        ratingRepository.save(rating);

        responseObserver.onNext(ratingToRatingResponse(rating));
        responseObserver.onCompleted();
    }

    @Override
    public void getRatingsBySubjectEmail(UserEmailRequest request, StreamObserver<RatingResponseMultiple> responseObserver) {
        Optional<User> subject = userRepository.findByEmail(request.getEmail());

        if (subject.isEmpty()) {
            Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
            ErrorResponse errorResponse = ErrorResponse.newBuilder()
                    .setMessage("Subject does not exist")
                    .setStatus(400)
                    .build();
            Metadata metadata = new Metadata();
            metadata.put(errorResponseKey, errorResponse);
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Subject does not exist")
                    .asRuntimeException(metadata));
            return;
        }

        List<Rating> ratings = ratingRepository.findBySubject_Email(request.getEmail());
        List<RatingResponse> ratingResponses = new ArrayList<>();

        for (Rating rating : ratings)
            ratingResponses.add(ratingToRatingResponse(rating));

        RatingResponseMultiple response = RatingResponseMultiple.newBuilder()
                .addAllRatings(ratingResponses)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void getRatingsByWriterEmail(UserEmailRequest request, StreamObserver<RatingResponseMultiple> responseObserver) {
        Optional<User> writer = userRepository.findByEmail(request.getEmail());

        if (writer.isEmpty()) {
            Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
            ErrorResponse errorResponse = ErrorResponse.newBuilder()
                    .setMessage("Writer does not exist")
                    .setStatus(400)
                    .build();
            Metadata metadata = new Metadata();
            metadata.put(errorResponseKey, errorResponse);
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Writer does not exist")
                    .asRuntimeException(metadata));
            return;
        }

        List<Rating> ratings = ratingRepository.findByWriter_Email(request.getEmail());
        List<RatingResponse> ratingResponses = new ArrayList<>();

        for (Rating rating : ratings)
            ratingResponses.add(ratingToRatingResponse(rating));

        RatingResponseMultiple response = RatingResponseMultiple.newBuilder()
                .addAllRatings(ratingResponses)
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    private RatingResponse ratingToRatingResponse (Rating rating) {
        return RatingResponse.newBuilder()
                .setRatingId(rating.getId())
                .setWriterEmail(rating.getWriter().getEmail())
                .setSubjectEmail(rating.getSubject().getEmail())
                .setRating(rating.getRating())
                .setRatingComment(rating.getComment())
                .build();
    }
}
