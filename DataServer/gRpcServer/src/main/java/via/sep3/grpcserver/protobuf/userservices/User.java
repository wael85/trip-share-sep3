// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: user.proto

package via.sep3.grpcserver.protobuf.userservices;

public final class User {
  private User() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetUserRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetUserRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RequestUserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RequestUserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ResponseUserInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ResponseUserInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nuser.proto\"\037\n\016GetUserRequest\022\r\n\005email\030" +
      "\001 \001(\t\"\247\001\n\017RequestUserInfo\022\r\n\005email\030\001 \001(\t" +
      "\022\020\n\010password\030\002 \001(\t\022\022\n\nfirst_name\030\003 \001(\t\022\021" +
      "\n\tlast_name\030\004 \001(\t\022\r\n\005phone\030\005 \001(\t\022\017\n\007addr" +
      "ess\030\006 \001(\t\022\032\n\rdrive_license\030\007 \001(\tH\000\210\001\001B\020\n" +
      "\016_drive_license\"\226\001\n\020ResponseUserInfo\022\022\n\n" +
      "first_name\030\001 \001(\t\022\021\n\tlast_name\030\002 \001(\t\022\r\n\005p" +
      "hone\030\003 \001(\t\022\017\n\007address\030\004 \001(\t\022\r\n\005email\030\005 \001" +
      "(\t\022\032\n\rdriverLicense\030\006 \001(\tH\000\210\001\001B\020\n\016_drive" +
      "rLicense2t\n\014UserServices\0221\n\ncreateUser\022\020" +
      ".RequestUserInfo\032\021.ResponseUserInfo\0221\n\013G" +
      "etUserById\022\017.GetUserRequest\032\021.ResponseUs" +
      "erInfoB-\n)via.sep3.grpcserver.protobuf.u" +
      "serservicesP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetUserRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetUserRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetUserRequest_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_RequestUserInfo_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RequestUserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RequestUserInfo_descriptor,
        new java.lang.String[] { "Email", "Password", "FirstName", "LastName", "Phone", "Address", "DriveLicense", "DriveLicense", });
    internal_static_ResponseUserInfo_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_ResponseUserInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ResponseUserInfo_descriptor,
        new java.lang.String[] { "FirstName", "LastName", "Phone", "Address", "Email", "DriverLicense", "DriverLicense", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
