// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package via.sep3.grpcserver.protobuf.ticketservices;

public interface LocationMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:LocationMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string post_code = 2;</code>
   * @return The postCode.
   */
  java.lang.String getPostCode();
  /**
   * <code>string post_code = 2;</code>
   * @return The bytes for postCode.
   */
  com.google.protobuf.ByteString
      getPostCodeBytes();

  /**
   * <code>string city = 3;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 3;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>string street_name = 4;</code>
   * @return The streetName.
   */
  java.lang.String getStreetName();
  /**
   * <code>string street_name = 4;</code>
   * @return The bytes for streetName.
   */
  com.google.protobuf.ByteString
      getStreetNameBytes();

  /**
   * <code>string street_number = 5;</code>
   * @return The streetNumber.
   */
  java.lang.String getStreetNumber();
  /**
   * <code>string street_number = 5;</code>
   * @return The bytes for streetNumber.
   */
  com.google.protobuf.ByteString
      getStreetNumberBytes();

  /**
   * <code>string arrival_time = 6;</code>
   * @return The arrivalTime.
   */
  java.lang.String getArrivalTime();
  /**
   * <code>string arrival_time = 6;</code>
   * @return The bytes for arrivalTime.
   */
  com.google.protobuf.ByteString
      getArrivalTimeBytes();
}
