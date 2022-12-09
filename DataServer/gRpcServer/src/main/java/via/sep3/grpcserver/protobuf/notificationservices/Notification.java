// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notification.proto

package via.sep3.grpcserver.protobuf.notificationservices;

public final class Notification {
  private Notification() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestSeatNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestSeatNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseSeatNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseSeatNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestGetMyNotifications_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestGetMyNotifications_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseActiveNotifications_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseActiveNotifications_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReturnedNotification_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReturnedNotification_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Location_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Location_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022notification.proto\"\225\002\n\027RequestSeatNoti" +
      "fication\022\023\n\013consumer_id\030\001 \001(\t\022\021\n\tsender_" +
      "id\030\002 \001(\t\022$\n\034requested_pickup_location_id" +
      "\030\003 \001(\005\022\"\n\032requested_drop_location_id\030\004 \001" +
      "(\005\022\022\n\nseat_price\030\005 \001(\001\022\022\n\nseat_count\030\006 \001" +
      "(\005\022\013\n\003msg\030\007 \001(\t\022\020\n\010consumed\030\010 \001(\010\022\017\n\007tri" +
      "p_id\030\t \001(\005\022\034\n\017notification_id\030\n \001(\005H\000\210\001\001" +
      "B\022\n\020_notification_id\"G\n\030ResponseSeatNoti" +
      "fication\022\024\n\014response_msg\030\001 \001(\t\022\025\n\rrespon" +
      "se_code\030\002 \001(\005\"0\n\031RequestGetMyNotificatio" +
      "ns\022\023\n\013consumer_id\030\001 \001(\t\"K\n\033ResponseActiv" +
      "eNotifications\022,\n\rnotifications\030\001 \003(\0132\025." +
      "ReturnedNotification\"\360\001\n\024ReturnedNotific" +
      "ation\022\023\n\013consumer_id\030\001 \001(\t\022\021\n\tsender_id\030" +
      "\002 \001(\t\022/\n\034requested_pickup_location_id\030\003 " +
      "\001(\0132\t.Location\022-\n\032requested_drop_locatio" +
      "n_id\030\004 \001(\0132\t.Location\022\022\n\nseat_price\030\005 \001(" +
      "\001\022\022\n\nseat_count\030\006 \001(\005\022\013\n\003msg\030\007 \001(\t\022\n\n\002id" +
      "\030\010 \001(\005\022\017\n\007trip_id\030\t \001(\005\"y\n\010Location\022\n\n\002i" +
      "d\030\001 \001(\003\022\021\n\tpost_code\030\002 \001(\t\022\014\n\004city\030\003 \001(\t" +
      "\022\023\n\013street_name\030\004 \001(\t\022\025\n\rstreet_number\030\005" +
      " \001(\t\022\024\n\014arrival_time\030\006 \001(\t2\265\001\n\024Notificat" +
      "ionServices\022P\n\031createRequestNotification" +
      "\022\030.RequestSeatNotification\032\031.ResponseSea" +
      "tNotification\022K\n\017getNotification\022\032.Reque" +
      "stGetMyNotifications\032\034.ResponseActiveNot" +
      "ificationsB5\n1via.sep3.grpcserver.protob" +
      "uf.notificationservicesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RequestSeatNotification_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RequestSeatNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestSeatNotification_descriptor,
        new java.lang.String[] { "ConsumerId", "SenderId", "RequestedPickupLocationId", "RequestedDropLocationId", "SeatPrice", "SeatCount", "Msg", "Consumed", "TripId", "NotificationId", "NotificationId", });
    internal_static_ResponseSeatNotification_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_ResponseSeatNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseSeatNotification_descriptor,
        new java.lang.String[] { "ResponseMsg", "ResponseCode", });
    internal_static_RequestGetMyNotifications_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_RequestGetMyNotifications_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestGetMyNotifications_descriptor,
        new java.lang.String[] { "ConsumerId", });
    internal_static_ResponseActiveNotifications_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ResponseActiveNotifications_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseActiveNotifications_descriptor,
        new java.lang.String[] { "Notifications", });
    internal_static_ReturnedNotification_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ReturnedNotification_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReturnedNotification_descriptor,
        new java.lang.String[] { "ConsumerId", "SenderId", "RequestedPickupLocationId", "RequestedDropLocationId", "SeatPrice", "SeatCount", "Msg", "Id", "TripId", });
    internal_static_Location_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_Location_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Location_descriptor,
        new java.lang.String[] { "Id", "PostCode", "City", "StreetName", "StreetNumber", "ArrivalTime", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
