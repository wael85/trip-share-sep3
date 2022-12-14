// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package via.sep3.grpcserver.protobuf.carservices;

public final class Car {
  private Car() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_DriverIdInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_DriverIdInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestCarInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestCarInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseCarInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseCarInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ErrorResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ErrorResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\tcar.proto\"!\n\014DriverIdInfo\022\021\n\tdriver_id" +
      "\030\001 \001(\t\"\226\001\n\016RequestCarInfo\022\r\n\005model\030\001 \001(\t" +
      "\022\r\n\005color\030\002 \001(\t\022\024\n\014plate_number\030\003 \001(\t\022\023\n" +
      "\013seats_count\030\004 \001(\005\022\021\n\tfuel_type\030\005 \001(\t\022\021\n" +
      "\tdriver_id\030\006 \001(\t\022\025\n\rdrive_license\030\007 \001(\t\"" +
      "m\n\017ResponseCarInfo\022\r\n\005model\030\001 \001(\t\022\r\n\005col" +
      "or\030\002 \001(\t\022\024\n\014plate_number\030\003 \001(\t\022\023\n\013seats_" +
      "count\030\004 \001(\005\022\021\n\tfuel_type\030\005 \001(\t\"0\n\rErrorR" +
      "esponse\022\016\n\006status\030\001 \001(\005\022\017\n\007message\030\002 \001(\t" +
      "2r\n\013CarServices\022.\n\tcreateCar\022\017.RequestCa" +
      "rInfo\032\020.ResponseCarInfo\0223\n\020getCarByDrive" +
      "rId\022\r.DriverIdInfo\032\020.ResponseCarInfoB,\n(" +
      "via.sep3.grpcserver.protobuf.carservices" +
      "P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_DriverIdInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_DriverIdInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_DriverIdInfo_descriptor,
        new java.lang.String[] { "DriverId", });
    internal_static_RequestCarInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RequestCarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestCarInfo_descriptor,
        new java.lang.String[] { "Model", "Color", "PlateNumber", "SeatsCount", "FuelType", "DriverId", "DriveLicense", });
    internal_static_ResponseCarInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ResponseCarInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseCarInfo_descriptor,
        new java.lang.String[] { "Model", "Color", "PlateNumber", "SeatsCount", "FuelType", });
    internal_static_ErrorResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_ErrorResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ErrorResponse_descriptor,
        new java.lang.String[] { "Status", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
