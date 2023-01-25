/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/logging/v2/logging_config.proto

package com.google.logging.v2;

/**
 *
 *
 * <pre>
 * The parameters to CopyLogEntries.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.CopyLogEntriesRequest}
 */
public final class CopyLogEntriesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.CopyLogEntriesRequest)
    CopyLogEntriesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CopyLogEntriesRequest.newBuilder() to construct.
  private CopyLogEntriesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CopyLogEntriesRequest() {
    name_ = "";
    filter_ = "";
    destination_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CopyLogEntriesRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_CopyLogEntriesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_CopyLogEntriesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.CopyLogEntriesRequest.class,
            com.google.logging.v2.CopyLogEntriesRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Log bucket from which to copy log entries.
   * For example:
   *   `"projects/my-project/locations/global/buckets/my-source-bucket"`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Log bucket from which to copy log entries.
   * For example:
   *   `"projects/my-project/locations/global/buckets/my-source-bucket"`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTER_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object filter_ = "";
  /**
   *
   *
   * <pre>
   * Optional. A filter specifying which log entries to copy. The filter must be no more
   * than 20k characters. An empty filter matches all log entries.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  @java.lang.Override
  public java.lang.String getFilter() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. A filter specifying which log entries to copy. The filter must be no more
   * than 20k characters. An empty filter matches all log entries.
   * </pre>
   *
   * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFilterBytes() {
    java.lang.Object ref = filter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      filter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object destination_ = "";
  /**
   *
   *
   * <pre>
   * Required. Destination to which to copy log entries.
   * </pre>
   *
   * <code>string destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The destination.
   */
  @java.lang.Override
  public java.lang.String getDestination() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destination_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Destination to which to copy log entries.
   * </pre>
   *
   * <code>string destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for destination.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationBytes() {
    java.lang.Object ref = destination_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destination_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destination_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, destination_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(filter_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filter_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destination_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, destination_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.logging.v2.CopyLogEntriesRequest)) {
      return super.equals(obj);
    }
    com.google.logging.v2.CopyLogEntriesRequest other =
        (com.google.logging.v2.CopyLogEntriesRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getFilter().equals(other.getFilter())) return false;
    if (!getDestination().equals(other.getDestination())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getFilter().hashCode();
    hash = (37 * hash) + DESTINATION_FIELD_NUMBER;
    hash = (53 * hash) + getDestination().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.CopyLogEntriesRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.logging.v2.CopyLogEntriesRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The parameters to CopyLogEntries.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.CopyLogEntriesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.CopyLogEntriesRequest)
      com.google.logging.v2.CopyLogEntriesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CopyLogEntriesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CopyLogEntriesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.CopyLogEntriesRequest.class,
              com.google.logging.v2.CopyLogEntriesRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.CopyLogEntriesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      filter_ = "";
      destination_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_CopyLogEntriesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.CopyLogEntriesRequest getDefaultInstanceForType() {
      return com.google.logging.v2.CopyLogEntriesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.CopyLogEntriesRequest build() {
      com.google.logging.v2.CopyLogEntriesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.CopyLogEntriesRequest buildPartial() {
      com.google.logging.v2.CopyLogEntriesRequest result =
          new com.google.logging.v2.CopyLogEntriesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.logging.v2.CopyLogEntriesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.filter_ = filter_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.destination_ = destination_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.logging.v2.CopyLogEntriesRequest) {
        return mergeFrom((com.google.logging.v2.CopyLogEntriesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.CopyLogEntriesRequest other) {
      if (other == com.google.logging.v2.CopyLogEntriesRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getFilter().isEmpty()) {
        filter_ = other.filter_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDestination().isEmpty()) {
        destination_ = other.destination_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                filter_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 26
            case 34:
              {
                destination_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 34
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Log bucket from which to copy log entries.
     * For example:
     *   `"projects/my-project/locations/global/buckets/my-source-bucket"`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Log bucket from which to copy log entries.
     * For example:
     *   `"projects/my-project/locations/global/buckets/my-source-bucket"`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Log bucket from which to copy log entries.
     * For example:
     *   `"projects/my-project/locations/global/buckets/my-source-bucket"`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Log bucket from which to copy log entries.
     * For example:
     *   `"projects/my-project/locations/global/buckets/my-source-bucket"`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Log bucket from which to copy log entries.
     * For example:
     *   `"projects/my-project/locations/global/buckets/my-source-bucket"`
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object filter_ = "";
    /**
     *
     *
     * <pre>
     * Optional. A filter specifying which log entries to copy. The filter must be no more
     * than 20k characters. An empty filter matches all log entries.
     * </pre>
     *
     * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The filter.
     */
    public java.lang.String getFilter() {
      java.lang.Object ref = filter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A filter specifying which log entries to copy. The filter must be no more
     * than 20k characters. An empty filter matches all log entries.
     * </pre>
     *
     * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for filter.
     */
    public com.google.protobuf.ByteString getFilterBytes() {
      java.lang.Object ref = filter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        filter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. A filter specifying which log entries to copy. The filter must be no more
     * than 20k characters. An empty filter matches all log entries.
     * </pre>
     *
     * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A filter specifying which log entries to copy. The filter must be no more
     * than 20k characters. An empty filter matches all log entries.
     * </pre>
     *
     * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFilter() {
      filter_ = getDefaultInstance().getFilter();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. A filter specifying which log entries to copy. The filter must be no more
     * than 20k characters. An empty filter matches all log entries.
     * </pre>
     *
     * <code>string filter = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for filter to set.
     * @return This builder for chaining.
     */
    public Builder setFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      filter_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object destination_ = "";
    /**
     *
     *
     * <pre>
     * Required. Destination to which to copy log entries.
     * </pre>
     *
     * <code>string destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The destination.
     */
    public java.lang.String getDestination() {
      java.lang.Object ref = destination_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destination_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination to which to copy log entries.
     * </pre>
     *
     * <code>string destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for destination.
     */
    public com.google.protobuf.ByteString getDestinationBytes() {
      java.lang.Object ref = destination_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destination_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Destination to which to copy log entries.
     * </pre>
     *
     * <code>string destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestination(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destination_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination to which to copy log entries.
     * </pre>
     *
     * <code>string destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestination() {
      destination_ = getDefaultInstance().getDestination();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Destination to which to copy log entries.
     * </pre>
     *
     * <code>string destination = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for destination to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destination_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.logging.v2.CopyLogEntriesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.CopyLogEntriesRequest)
  private static final com.google.logging.v2.CopyLogEntriesRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.CopyLogEntriesRequest();
  }

  public static com.google.logging.v2.CopyLogEntriesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CopyLogEntriesRequest> PARSER =
      new com.google.protobuf.AbstractParser<CopyLogEntriesRequest>() {
        @java.lang.Override
        public CopyLogEntriesRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CopyLogEntriesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CopyLogEntriesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.CopyLogEntriesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
