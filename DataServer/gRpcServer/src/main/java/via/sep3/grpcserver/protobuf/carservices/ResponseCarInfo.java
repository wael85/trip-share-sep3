// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: car.proto

package via.sep3.grpcserver.protobuf.carservices;

/**
 * Protobuf type {@code ResponseCarInfo}
 */
public final class ResponseCarInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ResponseCarInfo)
    ResponseCarInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ResponseCarInfo.newBuilder() to construct.
  private ResponseCarInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ResponseCarInfo() {
    model_ = "";
    color_ = "";
    plateNumber_ = "";
    fuelType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ResponseCarInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ResponseCarInfo(
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

            model_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            color_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            plateNumber_ = s;
            break;
          }
          case 32: {

            seatsCount_ = input.readInt32();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            fuelType_ = s;
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
    return via.sep3.grpcserver.protobuf.carservices.Car.internal_static_ResponseCarInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.grpcserver.protobuf.carservices.Car.internal_static_ResponseCarInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.class, via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.Builder.class);
  }

  public static final int MODEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object model_;
  /**
   * <code>string model = 1;</code>
   * @return The model.
   */
  @java.lang.Override
  public java.lang.String getModel() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      model_ = s;
      return s;
    }
  }
  /**
   * <code>string model = 1;</code>
   * @return The bytes for model.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModelBytes() {
    java.lang.Object ref = model_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      model_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COLOR_FIELD_NUMBER = 2;
  private volatile java.lang.Object color_;
  /**
   * <code>string color = 2;</code>
   * @return The color.
   */
  @java.lang.Override
  public java.lang.String getColor() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      color_ = s;
      return s;
    }
  }
  /**
   * <code>string color = 2;</code>
   * @return The bytes for color.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getColorBytes() {
    java.lang.Object ref = color_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      color_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PLATE_NUMBER_FIELD_NUMBER = 3;
  private volatile java.lang.Object plateNumber_;
  /**
   * <code>string plate_number = 3;</code>
   * @return The plateNumber.
   */
  @java.lang.Override
  public java.lang.String getPlateNumber() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      plateNumber_ = s;
      return s;
    }
  }
  /**
   * <code>string plate_number = 3;</code>
   * @return The bytes for plateNumber.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPlateNumberBytes() {
    java.lang.Object ref = plateNumber_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      plateNumber_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SEATS_COUNT_FIELD_NUMBER = 4;
  private int seatsCount_;
  /**
   * <code>int32 seats_count = 4;</code>
   * @return The seatsCount.
   */
  @java.lang.Override
  public int getSeatsCount() {
    return seatsCount_;
  }

  public static final int FUEL_TYPE_FIELD_NUMBER = 5;
  private volatile java.lang.Object fuelType_;
  /**
   * <code>string fuel_type = 5;</code>
   * @return The fuelType.
   */
  @java.lang.Override
  public java.lang.String getFuelType() {
    java.lang.Object ref = fuelType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fuelType_ = s;
      return s;
    }
  }
  /**
   * <code>string fuel_type = 5;</code>
   * @return The bytes for fuelType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getFuelTypeBytes() {
    java.lang.Object ref = fuelType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      fuelType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, model_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(color_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, color_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plateNumber_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, plateNumber_);
    }
    if (seatsCount_ != 0) {
      output.writeInt32(4, seatsCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fuelType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, fuelType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(model_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, model_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(color_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, color_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(plateNumber_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, plateNumber_);
    }
    if (seatsCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, seatsCount_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fuelType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, fuelType_);
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
    if (!(obj instanceof via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo)) {
      return super.equals(obj);
    }
    via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo other = (via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo) obj;

    if (!getModel()
        .equals(other.getModel())) return false;
    if (!getColor()
        .equals(other.getColor())) return false;
    if (!getPlateNumber()
        .equals(other.getPlateNumber())) return false;
    if (getSeatsCount()
        != other.getSeatsCount()) return false;
    if (!getFuelType()
        .equals(other.getFuelType())) return false;
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
    hash = (37 * hash) + MODEL_FIELD_NUMBER;
    hash = (53 * hash) + getModel().hashCode();
    hash = (37 * hash) + COLOR_FIELD_NUMBER;
    hash = (53 * hash) + getColor().hashCode();
    hash = (37 * hash) + PLATE_NUMBER_FIELD_NUMBER;
    hash = (53 * hash) + getPlateNumber().hashCode();
    hash = (37 * hash) + SEATS_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getSeatsCount();
    hash = (37 * hash) + FUEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getFuelType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parseFrom(
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
  public static Builder newBuilder(via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo prototype) {
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
   * Protobuf type {@code ResponseCarInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ResponseCarInfo)
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.grpcserver.protobuf.carservices.Car.internal_static_ResponseCarInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.grpcserver.protobuf.carservices.Car.internal_static_ResponseCarInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.class, via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.Builder.class);
    }

    // Construct using via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.newBuilder()
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
      model_ = "";

      color_ = "";

      plateNumber_ = "";

      seatsCount_ = 0;

      fuelType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.grpcserver.protobuf.carservices.Car.internal_static_ResponseCarInfo_descriptor;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo getDefaultInstanceForType() {
      return via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo build() {
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo buildPartial() {
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo result = new via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo(this);
      result.model_ = model_;
      result.color_ = color_;
      result.plateNumber_ = plateNumber_;
      result.seatsCount_ = seatsCount_;
      result.fuelType_ = fuelType_;
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
      if (other instanceof via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo) {
        return mergeFrom((via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo other) {
      if (other == via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo.getDefaultInstance()) return this;
      if (!other.getModel().isEmpty()) {
        model_ = other.model_;
        onChanged();
      }
      if (!other.getColor().isEmpty()) {
        color_ = other.color_;
        onChanged();
      }
      if (!other.getPlateNumber().isEmpty()) {
        plateNumber_ = other.plateNumber_;
        onChanged();
      }
      if (other.getSeatsCount() != 0) {
        setSeatsCount(other.getSeatsCount());
      }
      if (!other.getFuelType().isEmpty()) {
        fuelType_ = other.fuelType_;
        onChanged();
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
      via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object model_ = "";
    /**
     * <code>string model = 1;</code>
     * @return The model.
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        model_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string model = 1;</code>
     * @return The bytes for model.
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string model = 1;</code>
     * @param value The model to set.
     * @return This builder for chaining.
     */
    public Builder setModel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      model_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string model = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearModel() {
      
      model_ = getDefaultInstance().getModel();
      onChanged();
      return this;
    }
    /**
     * <code>string model = 1;</code>
     * @param value The bytes for model to set.
     * @return This builder for chaining.
     */
    public Builder setModelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      model_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object color_ = "";
    /**
     * <code>string color = 2;</code>
     * @return The color.
     */
    public java.lang.String getColor() {
      java.lang.Object ref = color_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        color_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string color = 2;</code>
     * @return The bytes for color.
     */
    public com.google.protobuf.ByteString
        getColorBytes() {
      java.lang.Object ref = color_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        color_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string color = 2;</code>
     * @param value The color to set.
     * @return This builder for chaining.
     */
    public Builder setColor(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      color_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string color = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearColor() {
      
      color_ = getDefaultInstance().getColor();
      onChanged();
      return this;
    }
    /**
     * <code>string color = 2;</code>
     * @param value The bytes for color to set.
     * @return This builder for chaining.
     */
    public Builder setColorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      color_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object plateNumber_ = "";
    /**
     * <code>string plate_number = 3;</code>
     * @return The plateNumber.
     */
    public java.lang.String getPlateNumber() {
      java.lang.Object ref = plateNumber_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        plateNumber_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string plate_number = 3;</code>
     * @return The bytes for plateNumber.
     */
    public com.google.protobuf.ByteString
        getPlateNumberBytes() {
      java.lang.Object ref = plateNumber_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        plateNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string plate_number = 3;</code>
     * @param value The plateNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPlateNumber(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      plateNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string plate_number = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlateNumber() {
      
      plateNumber_ = getDefaultInstance().getPlateNumber();
      onChanged();
      return this;
    }
    /**
     * <code>string plate_number = 3;</code>
     * @param value The bytes for plateNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPlateNumberBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      plateNumber_ = value;
      onChanged();
      return this;
    }

    private int seatsCount_ ;
    /**
     * <code>int32 seats_count = 4;</code>
     * @return The seatsCount.
     */
    @java.lang.Override
    public int getSeatsCount() {
      return seatsCount_;
    }
    /**
     * <code>int32 seats_count = 4;</code>
     * @param value The seatsCount to set.
     * @return This builder for chaining.
     */
    public Builder setSeatsCount(int value) {
      
      seatsCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 seats_count = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearSeatsCount() {
      
      seatsCount_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fuelType_ = "";
    /**
     * <code>string fuel_type = 5;</code>
     * @return The fuelType.
     */
    public java.lang.String getFuelType() {
      java.lang.Object ref = fuelType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fuelType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string fuel_type = 5;</code>
     * @return The bytes for fuelType.
     */
    public com.google.protobuf.ByteString
        getFuelTypeBytes() {
      java.lang.Object ref = fuelType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        fuelType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string fuel_type = 5;</code>
     * @param value The fuelType to set.
     * @return This builder for chaining.
     */
    public Builder setFuelType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      fuelType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string fuel_type = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearFuelType() {
      
      fuelType_ = getDefaultInstance().getFuelType();
      onChanged();
      return this;
    }
    /**
     * <code>string fuel_type = 5;</code>
     * @param value The bytes for fuelType to set.
     * @return This builder for chaining.
     */
    public Builder setFuelTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      fuelType_ = value;
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


    // @@protoc_insertion_point(builder_scope:ResponseCarInfo)
  }

  // @@protoc_insertion_point(class_scope:ResponseCarInfo)
  private static final via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo();
  }

  public static via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResponseCarInfo>
      PARSER = new com.google.protobuf.AbstractParser<ResponseCarInfo>() {
    @java.lang.Override
    public ResponseCarInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ResponseCarInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ResponseCarInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResponseCarInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.grpcserver.protobuf.carservices.ResponseCarInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

