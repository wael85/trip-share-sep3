// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trip.proto

package via.sep3.grpcserver.protobuf.tripservices;

public interface TripCreationRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TripCreationRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>double full_price = 1;</code>
   * @return The fullPrice.
   */
  double getFullPrice();

  /**
   * <code>int32 available_seats = 2;</code>
   * @return The availableSeats.
   */
  int getAvailableSeats();

  /**
   * <code>string driver_id = 3;</code>
   * @return The driverId.
   */
  java.lang.String getDriverId();
  /**
   * <code>string driver_id = 3;</code>
   * @return The bytes for driverId.
   */
  com.google.protobuf.ByteString
      getDriverIdBytes();

  /**
   * <code>repeated .TripCreationRequest.Location stops = 4;</code>
   */
  java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest.Location> 
      getStopsList();
  /**
   * <code>repeated .TripCreationRequest.Location stops = 4;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest.Location getStops(int index);
  /**
   * <code>repeated .TripCreationRequest.Location stops = 4;</code>
   */
  int getStopsCount();
  /**
   * <code>repeated .TripCreationRequest.Location stops = 4;</code>
   */
  java.util.List<? extends via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest.LocationOrBuilder> 
      getStopsOrBuilderList();
  /**
   * <code>repeated .TripCreationRequest.Location stops = 4;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.TripCreationRequest.LocationOrBuilder getStopsOrBuilder(
      int index);
}
