// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trip.proto

package via.sep3.grpcserver.protobuf.tripservices;

public interface TripsByDriverIDResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TripsByDriverIDResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripResponse> 
      getTripsList();
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.TripResponse getTrips(int index);
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  int getTripsCount();
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  java.util.List<? extends via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder> 
      getTripsOrBuilderList();
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder getTripsOrBuilder(
      int index);
}
