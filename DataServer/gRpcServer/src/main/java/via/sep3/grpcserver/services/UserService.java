package via.sep3.grpcserver.services;

import org.lognet.springboot.grpc.GRpcService;
import via.sep3.grpcserver.protobuf.user.UserGrpc;

@GRpcService
public class UserService extends UserGrpc.UserImplBase {

}
