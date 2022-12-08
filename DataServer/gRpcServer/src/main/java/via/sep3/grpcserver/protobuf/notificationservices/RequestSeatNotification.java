// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: notification.proto

package via.sep3.grpcserver.protobuf.notificationservices;

/**
 * Protobuf type {@code RequestSeatNotification}
 */
public final class RequestSeatNotification extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RequestSeatNotification)
    RequestSeatNotificationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RequestSeatNotification.newBuilder() to construct.
  private RequestSeatNotification(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RequestSeatNotification() {
    consumerId_ = "";
    senderId_ = "";
    msg_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RequestSeatNotification();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RequestSeatNotification(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            consumerId_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            senderId_ = s;
            break;
          }
          case 24: {

            requestedPickupLocationId_ = input.readInt32();
            break;
          }
          case 32: {

            requestedDropLocationId_ = input.readInt32();
            break;
          }
          case 41: {

            seatPrice_ = input.readDouble();
            break;
          }
          case 48: {

            seatCount_ = input.readInt32();
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            msg_ = s;
            break;
          }
          case 64: {

            consumed_ = input.readBool();
            break;
          }
          case 72: {

            tripId_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sep3.grpcserver.protobuf.notificationservices.Notification.internal_static_RequestSeatNotification_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.grpcserver.protobuf.notificationservices.Notification.internal_static_RequestSeatNotification_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.class, via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.Builder.class);
  }

  public static final int CONSUMER_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object consumerId_;
  /**
   * <code>string consumer_id = 1;</code>
   * @return The consumerId.
   */
  @java.lang.Override
  public java.lang.String getConsumerId() {
    java.lang.Object ref = consumerId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      consumerId_ = s;
      return s;
    }
  }
  /**
   * <code>string consumer_id = 1;</code>
   * @return The bytes for consumerId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getConsumerIdBytes() {
    java.lang.Object ref = consumerId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      consumerId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SENDER_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object senderId_;
  /**
   * <code>string sender_id = 2;</code>
   * @return The senderId.
   */
  @java.lang.Override
  public java.lang.String getSenderId() {
    java.lang.Object ref = senderId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      senderId_ = s;
      return s;
    }
  }
  /**
   * <code>string sender_id = 2;</code>
   * @return The bytes for senderId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderIdBytes() {
    java.lang.Object ref = senderId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      senderId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int REQUESTED_PICKUP_LOCATION_ID_FIELD_NUMBER = 3;
  private int requestedPickupLocationId_;
  /**
   * <code>int32 requested_pickup_location_id = 3;</code>
   * @return The requestedPickupLocationId.
   */
  @java.lang.Override
  public int getRequestedPickupLocationId() {
    return requestedPickupLocationId_;
  }

  public static final int REQUESTED_DROP_LOCATION_ID_FIELD_NUMBER = 4;
  private int requestedDropLocationId_;
  /**
   * <code>int32 requested_drop_location_id = 4;</code>
   * @return The requestedDropLocationId.
   */
  @java.lang.Override
  public int getRequestedDropLocationId() {
    return requestedDropLocationId_;
  }

  public static final int SEAT_PRICE_FIELD_NUMBER = 5;
  private double seatPrice_;
  /**
   * <code>double seat_price = 5;</code>
   * @return The seatPrice.
   */
  @java.lang.Override
  public double getSeatPrice() {
    return seatPrice_;
  }

  public static final int SEAT_COUNT_FIELD_NUMBER = 6;
  private int seatCount_;
  /**
   * <code>int32 seat_count = 6;</code>
   * @return The seatCount.
   */
  @java.lang.Override
  public int getSeatCount() {
    return seatCount_;
  }

  public static final int MSG_FIELD_NUMBER = 7;
  private volatile java.lang.Object msg_;
  /**
   * <code>string msg = 7;</code>
   * @return The msg.
   */
  @java.lang.Override
  public java.lang.String getMsg() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      msg_ = s;
      return s;
    }
  }
  /**
   * <code>string msg = 7;</code>
   * @return The bytes for msg.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getMsgBytes() {
    java.lang.Object ref = msg_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      msg_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONSUMED_FIELD_NUMBER = 8;
  private boolean consumed_;
  /**
   * <code>bool consumed = 8;</code>
   * @return The consumed.
   */
  @java.lang.Override
  public boolean getConsumed() {
    return consumed_;
  }

  public static final int TRIP_ID_FIELD_NUMBER = 9;
  private int tripId_;
  /**
   * <code>int32 trip_id = 9;</code>
   * @return The tripId.
   */
  @java.lang.Override
  public int getTripId() {
    return tripId_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consumerId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, consumerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(senderId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, senderId_);
    }
    if (requestedPickupLocationId_ != 0) {
      output.writeInt32(3, requestedPickupLocationId_);
    }
    if (requestedDropLocationId_ != 0) {
      output.writeInt32(4, requestedDropLocationId_);
    }
    if (java.lang.Double.doubleToRawLongBits(seatPrice_) != 0) {
      output.writeDouble(5, seatPrice_);
    }
    if (seatCount_ != 0) {
      output.writeInt32(6, seatCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, msg_);
    }
    if (consumed_ != false) {
      output.writeBool(8, consumed_);
    }
    if (tripId_ != 0) {
      output.writeInt32(9, tripId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(consumerId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, consumerId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(senderId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, senderId_);
    }
    if (requestedPickupLocationId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, requestedPickupLocationId_);
    }
    if (requestedDropLocationId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, requestedDropLocationId_);
    }
    if (java.lang.Double.doubleToRawLongBits(seatPrice_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, seatPrice_);
    }
    if (seatCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, seatCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(msg_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, msg_);
    }
    if (consumed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(8, consumed_);
    }
    if (tripId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(9, tripId_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification)) {
      return super.equals(obj);
    }
    via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification other = (via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification) obj;

    if (!getConsumerId()
        .equals(other.getConsumerId())) return false;
    if (!getSenderId()
        .equals(other.getSenderId())) return false;
    if (getRequestedPickupLocationId()
        != other.getRequestedPickupLocationId()) return false;
    if (getRequestedDropLocationId()
        != other.getRequestedDropLocationId()) return false;
    if (java.lang.Double.doubleToLongBits(getSeatPrice())
        != java.lang.Double.doubleToLongBits(
            other.getSeatPrice())) return false;
    if (getSeatCount()
        != other.getSeatCount()) return false;
    if (!getMsg()
        .equals(other.getMsg())) return false;
    if (getConsumed()
        != other.getConsumed()) return false;
    if (getTripId()
        != other.getTripId()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CONSUMER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getConsumerId().hashCode();
    hash = (37 * hash) + SENDER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSenderId().hashCode();
    hash = (37 * hash) + REQUESTED_PICKUP_LOCATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestedPickupLocationId();
    hash = (37 * hash) + REQUESTED_DROP_LOCATION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRequestedDropLocationId();
    hash = (37 * hash) + SEAT_PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSeatPrice()));
    hash = (37 * hash) + SEAT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSeatCount();
    hash = (37 * hash) + MSG_FIELD_NUMBER;
    hash = (53 * hash) + getMsg().hashCode();
    hash = (37 * hash) + CONSUMED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getConsumed());
    hash = (37 * hash) + TRIP_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTripId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RequestSeatNotification}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RequestSeatNotification)
      via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotificationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.grpcserver.protobuf.notificationservices.Notification.internal_static_RequestSeatNotification_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.grpcserver.protobuf.notificationservices.Notification.internal_static_RequestSeatNotification_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.class, via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.Builder.class);
    }

    // Construct using via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      consumerId_ = "";

      senderId_ = "";

      requestedPickupLocationId_ = 0;

      requestedDropLocationId_ = 0;

      seatPrice_ = 0D;

      seatCount_ = 0;

      msg_ = "";

      consumed_ = false;

      tripId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.grpcserver.protobuf.notificationservices.Notification.internal_static_RequestSeatNotification_descriptor;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification getDefaultInstanceForType() {
      return via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification build() {
      via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification buildPartial() {
      via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification result = new via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification(this);
      result.consumerId_ = consumerId_;
      result.senderId_ = senderId_;
      result.requestedPickupLocationId_ = requestedPickupLocationId_;
      result.requestedDropLocationId_ = requestedDropLocationId_;
      result.seatPrice_ = seatPrice_;
      result.seatCount_ = seatCount_;
      result.msg_ = msg_;
      result.consumed_ = consumed_;
      result.tripId_ = tripId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification) {
        return mergeFrom((via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification other) {
      if (other == via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification.getDefaultInstance()) return this;
      if (!other.getConsumerId().isEmpty()) {
        consumerId_ = other.consumerId_;
        onChanged();
      }
      if (!other.getSenderId().isEmpty()) {
        senderId_ = other.senderId_;
        onChanged();
      }
      if (other.getRequestedPickupLocationId() != 0) {
        setRequestedPickupLocationId(other.getRequestedPickupLocationId());
      }
      if (other.getRequestedDropLocationId() != 0) {
        setRequestedDropLocationId(other.getRequestedDropLocationId());
      }
      if (other.getSeatPrice() != 0D) {
        setSeatPrice(other.getSeatPrice());
      }
      if (other.getSeatCount() != 0) {
        setSeatCount(other.getSeatCount());
      }
      if (!other.getMsg().isEmpty()) {
        msg_ = other.msg_;
        onChanged();
      }
      if (other.getConsumed() != false) {
        setConsumed(other.getConsumed());
      }
      if (other.getTripId() != 0) {
        setTripId(other.getTripId());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object consumerId_ = "";
    /**
     * <code>string consumer_id = 1;</code>
     * @return The consumerId.
     */
    public java.lang.String getConsumerId() {
      java.lang.Object ref = consumerId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        consumerId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @return The bytes for consumerId.
     */
    public com.google.protobuf.ByteString
        getConsumerIdBytes() {
      java.lang.Object ref = consumerId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        consumerId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @param value The consumerId to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      consumerId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumerId() {
      
      consumerId_ = getDefaultInstance().getConsumerId();
      onChanged();
      return this;
    }
    /**
     * <code>string consumer_id = 1;</code>
     * @param value The bytes for consumerId to set.
     * @return This builder for chaining.
     */
    public Builder setConsumerIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      consumerId_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object senderId_ = "";
    /**
     * <code>string sender_id = 2;</code>
     * @return The senderId.
     */
    public java.lang.String getSenderId() {
      java.lang.Object ref = senderId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        senderId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender_id = 2;</code>
     * @return The bytes for senderId.
     */
    public com.google.protobuf.ByteString
        getSenderIdBytes() {
      java.lang.Object ref = senderId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        senderId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender_id = 2;</code>
     * @param value The senderId to set.
     * @return This builder for chaining.
     */
    public Builder setSenderId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senderId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string sender_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSenderId() {
      
      senderId_ = getDefaultInstance().getSenderId();
      onChanged();
      return this;
    }
    /**
     * <code>string sender_id = 2;</code>
     * @param value The bytes for senderId to set.
     * @return This builder for chaining.
     */
    public Builder setSenderIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      senderId_ = value;
      onChanged();
      return this;
    }

    private int requestedPickupLocationId_ ;
    /**
     * <code>int32 requested_pickup_location_id = 3;</code>
     * @return The requestedPickupLocationId.
     */
    @java.lang.Override
    public int getRequestedPickupLocationId() {
      return requestedPickupLocationId_;
    }
    /**
     * <code>int32 requested_pickup_location_id = 3;</code>
     * @param value The requestedPickupLocationId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestedPickupLocationId(int value) {
      
      requestedPickupLocationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 requested_pickup_location_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestedPickupLocationId() {
      
      requestedPickupLocationId_ = 0;
      onChanged();
      return this;
    }

    private int requestedDropLocationId_ ;
    /**
     * <code>int32 requested_drop_location_id = 4;</code>
     * @return The requestedDropLocationId.
     */
    @java.lang.Override
    public int getRequestedDropLocationId() {
      return requestedDropLocationId_;
    }
    /**
     * <code>int32 requested_drop_location_id = 4;</code>
     * @param value The requestedDropLocationId to set.
     * @return This builder for chaining.
     */
    public Builder setRequestedDropLocationId(int value) {
      
      requestedDropLocationId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 requested_drop_location_id = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRequestedDropLocationId() {
      
      requestedDropLocationId_ = 0;
      onChanged();
      return this;
    }

    private double seatPrice_ ;
    /**
     * <code>double seat_price = 5;</code>
     * @return The seatPrice.
     */
    @java.lang.Override
    public double getSeatPrice() {
      return seatPrice_;
    }
    /**
     * <code>double seat_price = 5;</code>
     * @param value The seatPrice to set.
     * @return This builder for chaining.
     */
    public Builder setSeatPrice(double value) {
      
      seatPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double seat_price = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeatPrice() {
      
      seatPrice_ = 0D;
      onChanged();
      return this;
    }

    private int seatCount_ ;
    /**
     * <code>int32 seat_count = 6;</code>
     * @return The seatCount.
     */
    @java.lang.Override
    public int getSeatCount() {
      return seatCount_;
    }
    /**
     * <code>int32 seat_count = 6;</code>
     * @param value The seatCount to set.
     * @return This builder for chaining.
     */
    public Builder setSeatCount(int value) {
      
      seatCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 seat_count = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeatCount() {
      
      seatCount_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object msg_ = "";
    /**
     * <code>string msg = 7;</code>
     * @return The msg.
     */
    public java.lang.String getMsg() {
      java.lang.Object ref = msg_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        msg_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string msg = 7;</code>
     * @return The bytes for msg.
     */
    public com.google.protobuf.ByteString
        getMsgBytes() {
      java.lang.Object ref = msg_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        msg_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string msg = 7;</code>
     * @param value The msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsg(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      msg_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearMsg() {
      
      msg_ = getDefaultInstance().getMsg();
      onChanged();
      return this;
    }
    /**
     * <code>string msg = 7;</code>
     * @param value The bytes for msg to set.
     * @return This builder for chaining.
     */
    public Builder setMsgBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      msg_ = value;
      onChanged();
      return this;
    }

    private boolean consumed_ ;
    /**
     * <code>bool consumed = 8;</code>
     * @return The consumed.
     */
    @java.lang.Override
    public boolean getConsumed() {
      return consumed_;
    }
    /**
     * <code>bool consumed = 8;</code>
     * @param value The consumed to set.
     * @return This builder for chaining.
     */
    public Builder setConsumed(boolean value) {
      
      consumed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool consumed = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearConsumed() {
      
      consumed_ = false;
      onChanged();
      return this;
    }

    private int tripId_ ;
    /**
     * <code>int32 trip_id = 9;</code>
     * @return The tripId.
     */
    @java.lang.Override
    public int getTripId() {
      return tripId_;
    }
    /**
     * <code>int32 trip_id = 9;</code>
     * @param value The tripId to set.
     * @return This builder for chaining.
     */
    public Builder setTripId(int value) {
      
      tripId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 trip_id = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearTripId() {
      
      tripId_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RequestSeatNotification)
  }

  // @@protoc_insertion_point(class_scope:RequestSeatNotification)
  private static final via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification();
  }

  public static via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequestSeatNotification>
      PARSER = new com.google.protobuf.AbstractParser<RequestSeatNotification>() {
    @java.lang.Override
    public RequestSeatNotification parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RequestSeatNotification(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RequestSeatNotification> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequestSeatNotification> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.grpcserver.protobuf.notificationservices.RequestSeatNotification getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
