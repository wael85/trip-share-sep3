package via.sep3.grpcserver.services;


import io.grpc.Metadata;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.protobuf.carservices.ErrorResponse;
import via.sep3.grpcserver.protobuf.userservices.RequestUserInfo;
import via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo;
import via.sep3.grpcserver.protobuf.userservices.UserServicesGrpc;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.util.Optional;


@GRpcService
public class UserServices extends UserServicesGrpc.UserServicesImplBase {

    private final UserRepository userRepository ;
    @Autowired
    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void  createUser(RequestUserInfo userInfo, StreamObserver<ResponseUserInfo> responseUserInfo) {
        User u = new User();
        u.setAddress(userInfo.getAddress());
        if(userInfo.hasDriveLicense()){
            u.setDriveLicense(userInfo.getDriveLicense());
        }
        u.setEmail(userInfo.getEmail());
        u.setFirstName(userInfo.getFirstName());
        u.setLastName(userInfo.getLastName());
        u.setEmail(userInfo.getEmail());
        u.setPhone(userInfo.getPhone());
        Optional<User> existed = userRepository.findByEmail(u.getEmail());
        if (existed.isPresent()){
                Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
                ErrorResponse errorResponse = ErrorResponse.newBuilder()
                        .setMessage("Driver already existed")
                        .setStatus(400)
                        .build();
                Metadata metadata = new Metadata();
                metadata.put(errorResponseKey, errorResponse);
                responseUserInfo.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("User with provided email is already existed.")
                        .asRuntimeException(metadata));
        }else {
            User resultUser = userRepository.save(u);
            ResponseUserInfo result = ResponseUserInfo.newBuilder()
                    .setAddress(resultUser.getAddress())
                    .setEmail(resultUser.getEmail())
                    .setFirstName(resultUser.getFirstName())
                    .setLastName(resultUser.getLastName())
                    .setPhone(resultUser.getPhone())
                    .build();
            responseUserInfo.onNext(result);
            responseUserInfo.onCompleted();
            System.out.println(resultUser);
        }

    }

}
