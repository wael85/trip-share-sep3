// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ticket.proto

package via.sep3.grpcserver.protobuf.ticketservices;

public final class Ticket {
  private Ticket() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketEmptyMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketEmptyMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketIdMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketIdMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketsByUserId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketsByUserId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketsByTripIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketsByTripIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeatTicketCreationRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeatTicketCreationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SeatTicketResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SeatTicketResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LocationMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LocationMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TicketErrorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TicketErrorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014ticket.proto\"\024\n\022TicketEmptyMessage\"\035\n\017" +
      "TicketIdMessage\022\n\n\002id\030\001 \001(\003\" \n\017TicketsBy" +
      "UserId\022\r\n\005email\030\001 \001(\t\")\n\026TicketsByTripId" +
      "Request\022\017\n\007trip_id\030\001 \001(\003\"7\n\017TicketsRespo" +
      "nse\022$\n\007tickets\030\001 \003(\0132\023.SeatTicketRespons" +
      "e\"\222\001\n\031SeatTicketCreationRequest\022\022\n\nseat_" +
      "price\030\001 \001(\001\022\023\n\013total_seats\030\002 \001(\005\022\024\n\014pass" +
      "enger_id\030\003 \001(\t\022\017\n\007trip_id\030\004 \001(\003\022\021\n\tpicku" +
      "p_id\030\005 \001(\003\022\022\n\ndropoff_id\030\006 \001(\003\"\265\001\n\022SeatT" +
      "icketResponse\022\n\n\002id\030\001 \001(\003\022\022\n\nseat_price\030" +
      "\002 \001(\001\022\023\n\013total_seats\030\003 \001(\005\022\024\n\014passenger_" +
      "id\030\004 \001(\t\022\017\n\007trip_id\030\005 \001(\003\022 \n\006pickup\030\006 \001(" +
      "\0132\020.LocationMessage\022!\n\007dropoff\030\007 \001(\0132\020.L" +
      "ocationMessage\"\200\001\n\017LocationMessage\022\n\n\002id" +
      "\030\001 \001(\003\022\021\n\tpost_code\030\002 \001(\t\022\014\n\004city\030\003 \001(\t\022" +
      "\023\n\013street_name\030\004 \001(\t\022\025\n\rstreet_number\030\005 " +
      "\001(\t\022\024\n\014arrival_time\030\006 \001(\t\"6\n\023TicketError" +
      "Response\022\016\n\006status\030\001 \001(\005\022\017\n\007message\030\002 \001(" +
      "\t2\375\001\n\016TicketServices\022?\n\014createTicket\022\032.S" +
      "eatTicketCreationRequest\032\023.SeatTicketRes" +
      "ponse\022=\n\020getTicketsByTrip\022\027.TicketsByTri" +
      "pIdRequest\032\020.TicketsResponse\0226\n\020getAllUs" +
      "erTicket\022\020.TicketsByUserId\032\020.TicketsResp" +
      "onse\0223\n\ndeleteById\022\020.TicketIdMessage\032\023.T" +
      "icketEmptyMessageB/\n+via.sep3.grpcserver" +
      ".protobuf.ticketservicesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TicketEmptyMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TicketEmptyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketEmptyMessage_descriptor,
        new java.lang.String[] { });
    internal_static_TicketIdMessage_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_TicketIdMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketIdMessage_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_TicketsByUserId_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_TicketsByUserId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketsByUserId_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_TicketsByTripIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_TicketsByTripIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketsByTripIdRequest_descriptor,
        new java.lang.String[] { "TripId", });
    internal_static_TicketsResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_TicketsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketsResponse_descriptor,
        new java.lang.String[] { "Tickets", });
    internal_static_SeatTicketCreationRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_SeatTicketCreationRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeatTicketCreationRequest_descriptor,
        new java.lang.String[] { "SeatPrice", "TotalSeats", "PassengerId", "TripId", "PickupId", "DropoffId", });
    internal_static_SeatTicketResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_SeatTicketResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SeatTicketResponse_descriptor,
        new java.lang.String[] { "Id", "SeatPrice", "TotalSeats", "PassengerId", "TripId", "Pickup", "Dropoff", });
    internal_static_LocationMessage_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_LocationMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LocationMessage_descriptor,
        new java.lang.String[] { "Id", "PostCode", "City", "StreetName", "StreetNumber", "ArrivalTime", });
    internal_static_TicketErrorResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_TicketErrorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TicketErrorResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
