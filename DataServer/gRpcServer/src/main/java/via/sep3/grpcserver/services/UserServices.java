package via.sep3.grpcserver.services;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.User;

import via.sep3.grpcserver.protobuf.userservices.RequestUserInfo;
import via.sep3.grpcserver.protobuf.userservices.ResponseUserInfo;
import via.sep3.grpcserver.protobuf.userservices.UserServicesGrpc;
import via.sep3.grpcserver.repositorys.UserRepository;

@GRpcService
public class UserServices extends UserServicesGrpc.UserServicesImplBase {
    @Autowired
    UserRepository userRepository;

    @Override
    public void createUser(RequestUserInfo userInfo, StreamObserver<ResponseUserInfo> responseUserInfo) {
        System.out.println("getCalled");
        User u = new User();
        u.setAddress(userInfo.getAddress());
        u.setDriveLicence(userInfo.getDriveLicense());
        u.setEmail(userInfo.getEmail());
        u.setFirstName(userInfo.getFirstName());
        u.setLastName(userInfo.getLastName());
        u.setEmail(userInfo.getEmail());
        u.setPhone(userInfo.getPhone());
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

    }
}
