// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package via.sep3.grpcserver.protobuf.ticketservices;

public interface TicketsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TicketsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .SeatTicketResponse tickets = 1;</code>
   */
  java.util.List<via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse> 
      getTicketsList();
  /**
   * <code>repeated .SeatTicketResponse tickets = 1;</code>
   */
  via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponse getTickets(int index);
  /**
   * <code>repeated .SeatTicketResponse tickets = 1;</code>
   */
  int getTicketsCount();
  /**
   * <code>repeated .SeatTicketResponse tickets = 1;</code>
   */
  java.util.List<? extends via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponseOrBuilder> 
      getTicketsOrBuilderList();
  /**
   * <code>repeated .SeatTicketResponse tickets = 1;</code>
   */
  via.sep3.grpcserver.protobuf.ticketservices.SeatTicketResponseOrBuilder getTicketsOrBuilder(
      int index);
}
