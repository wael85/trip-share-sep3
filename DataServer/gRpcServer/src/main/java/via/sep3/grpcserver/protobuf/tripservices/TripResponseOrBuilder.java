// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trip.proto

package via.sep3.grpcserver.protobuf.tripservices;

public interface TripResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TripResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>double full_price = 2;</code>
   * @return The fullPrice.
   */
  double getFullPrice();

  /**
   * <code>int32 available_seats = 3;</code>
   * @return The availableSeats.
   */
  int getAvailableSeats();

  /**
   * <code>string driver_id = 4;</code>
   * @return The driverId.
   */
  java.lang.String getDriverId();
  /**
   * <code>string driver_id = 4;</code>
   * @return The bytes for driverId.
   */
  com.google.protobuf.ByteString
      getDriverIdBytes();

  /**
   * <code>repeated .TripResponse.Location stops = 5;</code>
   */
  java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripResponse.Location> 
      getStopsList();
  /**
   * <code>repeated .TripResponse.Location stops = 5;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.TripResponse.Location getStops(int index);
  /**
   * <code>repeated .TripResponse.Location stops = 5;</code>
   */
  int getStopsCount();
  /**
   * <code>repeated .TripResponse.Location stops = 5;</code>
   */
  java.util.List<? extends via.sep3.grpcserver.protobuf.tripservices.TripResponse.LocationOrBuilder> 
      getStopsOrBuilderList();
  /**
   * <code>repeated .TripResponse.Location stops = 5;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.TripResponse.LocationOrBuilder getStopsOrBuilder(
      int index);

  /**
   * <code>repeated .SeatTicketResponseB tickets = 6;</code>
   */
  java.util.List<via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB> 
      getTicketsList();
  /**
   * <code>repeated .SeatTicketResponseB tickets = 6;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseB getTickets(int index);
  /**
   * <code>repeated .SeatTicketResponseB tickets = 6;</code>
   */
  int getTicketsCount();
  /**
   * <code>repeated .SeatTicketResponseB tickets = 6;</code>
   */
  java.util.List<? extends via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseBOrBuilder> 
      getTicketsOrBuilderList();
  /**
   * <code>repeated .SeatTicketResponseB tickets = 6;</code>
   */
  via.sep3.grpcserver.protobuf.tripservices.SeatTicketResponseBOrBuilder getTicketsOrBuilder(
      int index);
}
