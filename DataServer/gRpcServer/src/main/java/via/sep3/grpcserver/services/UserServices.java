
package via.sep3.grpcserver.services;


import io.grpc.LoadBalancer;
import io.grpc.Metadata;
import io.grpc.protobuf.ProtoUtils;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.Login;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.protobuf.carservices.ErrorResponse;
import via.sep3.grpcserver.protobuf.userservices.*;
import via.sep3.grpcserver.repositorys.LoginRepository;
import via.sep3.grpcserver.repositorys.UserRepository;

import java.util.Optional;


@GRpcService
public class UserServices extends UserServicesGrpc.UserServicesImplBase {

    private final LoginRepository loginRepository;
    private final UserRepository userRepository ;

    @Autowired
    public UserServices(LoginRepository loginRepository, UserRepository userRepository) {
        this.loginRepository = loginRepository;
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
            Login l = new Login();
            l.setUser(resultUser);
            l.setPassword(userInfo.getPassword());
            loginRepository.save(l);
            String driveLicense = resultUser.getDriveLicense() == null? "":resultUser.getDriveLicense();
            ResponseUserInfo result = ResponseUserInfo.newBuilder()
                    .setAddress(resultUser.getAddress())
                    .setEmail(resultUser.getEmail())
                    .setFirstName(resultUser.getFirstName())
                    .setLastName(resultUser.getLastName())
                    .setPhone(resultUser.getPhone())
                    .setDriverLicense(driveLicense)
                    .build();
            responseUserInfo.onNext(result);
            responseUserInfo.onCompleted();
            System.out.println(resultUser);
        }

    }

    @Override
    public void getUserById(GetUserRequest request, StreamObserver<ResponseUserInfo> responseObserver) {
        Optional<User> resultUser = userRepository.findByEmail(request.getEmail());

        if (resultUser.isEmpty()) {
            Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
            ErrorResponse errorResponse = ErrorResponse.newBuilder()
                    .setMessage("Driver does not exist")
                    .setStatus(404)
                    .build();
            Metadata metadata = new Metadata();
            metadata.put(errorResponseKey, errorResponse);
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("User with provided email is already existed.")
                    .asRuntimeException(metadata));
        } else {
            var builder = ResponseUserInfo.newBuilder();
            builder.setAddress(resultUser.get().getAddress())
                    .setEmail(resultUser.get().getEmail())
                    .setFirstName(resultUser.get().getFirstName())
                    .setLastName(resultUser.get().getLastName())
                    .setPhone(resultUser.get().getPhone())
                    .setDriverLicense(resultUser.get().getDriveLicense() != null ? resultUser.get().getDriveLicense() : "");
            ResponseUserInfo result = builder.build();
            responseObserver.onNext(result);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void loginUser(LoginUserMessage request, StreamObserver<ResponseUserInfo> responseObserver) {
        Optional<User> resultUser = userRepository.findByEmail(request.getEmail());
        Optional<Login> login = loginRepository.getLoginByUserId(request.getEmail());
        if (resultUser.isEmpty()){
            Metadata metadata =errorResponse("Email not exist");
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("User not found")
                    .asRuntimeException(metadata));
        } else if (!login.get().getPassword().equals(request.getPassword())) {
            Metadata metadata =errorResponse("Password not correct");
            responseObserver.onError(io.grpc.Status.INVALID_ARGUMENT.withDescription("Password is not correct")
                    .asRuntimeException(metadata));
        }else {

            var userInfo = ResponseUserInfo.newBuilder();
            userInfo.setAddress(resultUser.get().getAddress())
                    .setEmail(resultUser.get().getEmail())
                    .setFirstName(resultUser.get().getFirstName())
                    .setLastName(resultUser.get().getLastName())
                    .setPhone(resultUser.get().getPhone())
                    .setAddress(resultUser.get().getAddress())
                    .setDriverLicense(resultUser.get().getDriveLicense() != null ? resultUser.get().getDriveLicense() : "");
            ResponseUserInfo result = userInfo.build();
            responseObserver.onNext(result);
            responseObserver.onCompleted();
        }

    }
    private Metadata errorResponse(String message){
        Metadata.Key<ErrorResponse> errorResponseKey = ProtoUtils.keyForProto(ErrorResponse.getDefaultInstance());
        ErrorResponse errorResponse = ErrorResponse.newBuilder()
                .setMessage(message)
                .setStatus(400)
                .build();
        Metadata metadata = new Metadata();
        metadata.put(errorResponseKey, errorResponse);
        return metadata;
    }
}


