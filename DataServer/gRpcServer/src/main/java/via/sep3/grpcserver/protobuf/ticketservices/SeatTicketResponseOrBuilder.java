// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package via.sep3.grpcserver.protobuf.ticketservices;

public interface SeatTicketResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SeatTicketResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>double seat_price = 2;</code>
   * @return The seatPrice.
   */
  double getSeatPrice();

  /**
   * <code>int32 total_seats = 3;</code>
   * @return The totalSeats.
   */
  int getTotalSeats();

  /**
   * <code>string passenger_id = 4;</code>
   * @return The passengerId.
   */
  java.lang.String getPassengerId();
  /**
   * <code>string passenger_id = 4;</code>
   * @return The bytes for passengerId.
   */
  com.google.protobuf.ByteString
      getPassengerIdBytes();

  /**
   * <code>int64 trip_id = 5;</code>
   * @return The tripId.
   */
  long getTripId();

  /**
   * <code>int64 pickup_id = 6;</code>
   * @return The pickupId.
   */
  long getPickupId();

  /**
   * <code>int64 dropoff_id = 7;</code>
   * @return The dropoffId.
   */
  long getDropoffId();
}
