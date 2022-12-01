// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: trip.proto

package via.sep3.grpcserver.protobuf.tripservices;

/**
 * Protobuf type {@code TripsByDriverIDResponse}
 */
public final class TripsByDriverIDResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TripsByDriverIDResponse)
    TripsByDriverIDResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TripsByDriverIDResponse.newBuilder() to construct.
  private TripsByDriverIDResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TripsByDriverIDResponse() {
    trips_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TripsByDriverIDResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private TripsByDriverIDResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              trips_ = new java.util.ArrayList<via.sep3.grpcserver.protobuf.tripservices.TripResponse>();
              mutable_bitField0_ |= 0x00000001;
            }
            trips_.add(
                input.readMessage(via.sep3.grpcserver.protobuf.tripservices.TripResponse.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        trips_ = java.util.Collections.unmodifiableList(trips_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_TripsByDriverIDResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_TripsByDriverIDResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.class, via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.Builder.class);
  }

  public static final int TRIPS_FIELD_NUMBER = 1;
  private java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripResponse> trips_;
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  @java.lang.Override
  public java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripResponse> getTripsList() {
    return trips_;
  }
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder> 
      getTripsOrBuilderList() {
    return trips_;
  }
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  @java.lang.Override
  public int getTripsCount() {
    return trips_.size();
  }
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  @java.lang.Override
  public via.sep3.grpcserver.protobuf.tripservices.TripResponse getTrips(int index) {
    return trips_.get(index);
  }
  /**
   * <code>repeated .TripResponse trips = 1;</code>
   */
  @java.lang.Override
  public via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder getTripsOrBuilder(
      int index) {
    return trips_.get(index);
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
    for (int i = 0; i < trips_.size(); i++) {
      output.writeMessage(1, trips_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < trips_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, trips_.get(i));
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
    if (!(obj instanceof via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse)) {
      return super.equals(obj);
    }
    via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse other = (via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse) obj;

    if (!getTripsList()
        .equals(other.getTripsList())) return false;
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
    if (getTripsCount() > 0) {
      hash = (37 * hash) + TRIPS_FIELD_NUMBER;
      hash = (53 * hash) + getTripsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parseFrom(
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
  public static Builder newBuilder(via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse prototype) {
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
   * Protobuf type {@code TripsByDriverIDResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TripsByDriverIDResponse)
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_TripsByDriverIDResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_TripsByDriverIDResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.class, via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.Builder.class);
    }

    // Construct using via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.newBuilder()
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
        getTripsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (tripsBuilder_ == null) {
        trips_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        tripsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return via.sep3.grpcserver.protobuf.tripservices.Trip.internal_static_TripsByDriverIDResponse_descriptor;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse getDefaultInstanceForType() {
      return via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.getDefaultInstance();
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse build() {
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse buildPartial() {
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse result = new via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse(this);
      int from_bitField0_ = bitField0_;
      if (tripsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          trips_ = java.util.Collections.unmodifiableList(trips_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.trips_ = trips_;
      } else {
        result.trips_ = tripsBuilder_.build();
      }
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
      if (other instanceof via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse) {
        return mergeFrom((via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse other) {
      if (other == via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse.getDefaultInstance()) return this;
      if (tripsBuilder_ == null) {
        if (!other.trips_.isEmpty()) {
          if (trips_.isEmpty()) {
            trips_ = other.trips_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureTripsIsMutable();
            trips_.addAll(other.trips_);
          }
          onChanged();
        }
      } else {
        if (!other.trips_.isEmpty()) {
          if (tripsBuilder_.isEmpty()) {
            tripsBuilder_.dispose();
            tripsBuilder_ = null;
            trips_ = other.trips_;
            bitField0_ = (bitField0_ & ~0x00000001);
            tripsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTripsFieldBuilder() : null;
          } else {
            tripsBuilder_.addAllMessages(other.trips_);
          }
        }
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
      via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripResponse> trips_ =
      java.util.Collections.emptyList();
    private void ensureTripsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        trips_ = new java.util.ArrayList<via.sep3.grpcserver.protobuf.tripservices.TripResponse>(trips_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.sep3.grpcserver.protobuf.tripservices.TripResponse, via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder, via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder> tripsBuilder_;

    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripResponse> getTripsList() {
      if (tripsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(trips_);
      } else {
        return tripsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public int getTripsCount() {
      if (tripsBuilder_ == null) {
        return trips_.size();
      } else {
        return tripsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripResponse getTrips(int index) {
      if (tripsBuilder_ == null) {
        return trips_.get(index);
      } else {
        return tripsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder setTrips(
        int index, via.sep3.grpcserver.protobuf.tripservices.TripResponse value) {
      if (tripsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTripsIsMutable();
        trips_.set(index, value);
        onChanged();
      } else {
        tripsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder setTrips(
        int index, via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder builderForValue) {
      if (tripsBuilder_ == null) {
        ensureTripsIsMutable();
        trips_.set(index, builderForValue.build());
        onChanged();
      } else {
        tripsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder addTrips(via.sep3.grpcserver.protobuf.tripservices.TripResponse value) {
      if (tripsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTripsIsMutable();
        trips_.add(value);
        onChanged();
      } else {
        tripsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder addTrips(
        int index, via.sep3.grpcserver.protobuf.tripservices.TripResponse value) {
      if (tripsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTripsIsMutable();
        trips_.add(index, value);
        onChanged();
      } else {
        tripsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder addTrips(
        via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder builderForValue) {
      if (tripsBuilder_ == null) {
        ensureTripsIsMutable();
        trips_.add(builderForValue.build());
        onChanged();
      } else {
        tripsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder addTrips(
        int index, via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder builderForValue) {
      if (tripsBuilder_ == null) {
        ensureTripsIsMutable();
        trips_.add(index, builderForValue.build());
        onChanged();
      } else {
        tripsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder addAllTrips(
        java.lang.Iterable<? extends via.sep3.grpcserver.protobuf.tripservices.TripResponse> values) {
      if (tripsBuilder_ == null) {
        ensureTripsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, trips_);
        onChanged();
      } else {
        tripsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder clearTrips() {
      if (tripsBuilder_ == null) {
        trips_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        tripsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public Builder removeTrips(int index) {
      if (tripsBuilder_ == null) {
        ensureTripsIsMutable();
        trips_.remove(index);
        onChanged();
      } else {
        tripsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder getTripsBuilder(
        int index) {
      return getTripsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder getTripsOrBuilder(
        int index) {
      if (tripsBuilder_ == null) {
        return trips_.get(index);  } else {
        return tripsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public java.util.List<? extends via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder> 
         getTripsOrBuilderList() {
      if (tripsBuilder_ != null) {
        return tripsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(trips_);
      }
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder addTripsBuilder() {
      return getTripsFieldBuilder().addBuilder(
          via.sep3.grpcserver.protobuf.tripservices.TripResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder addTripsBuilder(
        int index) {
      return getTripsFieldBuilder().addBuilder(
          index, via.sep3.grpcserver.protobuf.tripservices.TripResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .TripResponse trips = 1;</code>
     */
    public java.util.List<via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder> 
         getTripsBuilderList() {
      return getTripsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        via.sep3.grpcserver.protobuf.tripservices.TripResponse, via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder, via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder> 
        getTripsFieldBuilder() {
      if (tripsBuilder_ == null) {
        tripsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            via.sep3.grpcserver.protobuf.tripservices.TripResponse, via.sep3.grpcserver.protobuf.tripservices.TripResponse.Builder, via.sep3.grpcserver.protobuf.tripservices.TripResponseOrBuilder>(
                trips_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        trips_ = null;
      }
      return tripsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:TripsByDriverIDResponse)
  }

  // @@protoc_insertion_point(class_scope:TripsByDriverIDResponse)
  private static final via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse();
  }

  public static via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TripsByDriverIDResponse>
      PARSER = new com.google.protobuf.AbstractParser<TripsByDriverIDResponse>() {
    @java.lang.Override
    public TripsByDriverIDResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new TripsByDriverIDResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TripsByDriverIDResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TripsByDriverIDResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public via.sep3.grpcserver.protobuf.tripservices.TripsByDriverIDResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
