package via.sep3.grpcserver.services;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.springframework.beans.factory.annotation.Autowired;
import via.sep3.grpcserver.Entities.User;
import via.sep3.grpcserver.protobuf.user.RequestUserInfo;
import via.sep3.grpcserver.protobuf.user.ResponseUserInfo;
import via.sep3.grpcserver.protobuf.user.UserGrpc;
import via.sep3.grpcserver.repositorys.UserRepository;

@GRpcService
public class UserService extends UserGrpc.UserImplBase {
    @Autowired
    UserRepository userRepository;

    @Override
    public void CreateUser(RequestUserInfo userInfo , StreamObserver<RequestUserInfo> responseUserInfo){
        User u = new User();
        u.setAddress(userInfo.getAddress());
        u.setDriveLicence(userInfo.getDriveLicense());
        u.setEmail(userInfo.getEmail());
        u.setFirstName(userInfo.getFirstName());
        u.setLastName(userInfo.getLastName());
        u.setEmail(userInfo.getEmail());
        u.setPhone(userInfo.getPhone());
        User existed  = userRepository.getReferenceById(userInfo.getEmail());
        if(existed != null){
            responseUserInfo.onError(new Exception
                    ("User is existed"));
        }
        User resultUser = userRepository.save(u);
        RequestUserInfo result = RequestUserInfo.newBuilder()
                .setAddress(resultUser.getAddress())
                .setEmail(resultUser.getEmail())
                .setFirstName(resultUser.getFirstName())
                .setLastName(resultUser.getLastName())
                .setPhone(resultUser.getPhone())
                .setDriveLicense(resultUser.getDriveLicence())
                .build();
        responseUserInfo.onNext(result);
        responseUserInfo.onCompleted();


    }

}
