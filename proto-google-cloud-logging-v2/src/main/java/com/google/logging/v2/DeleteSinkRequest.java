/*
 * Copyright 2024 Google LLC
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
 * The parameters to `DeleteSink`.
 * </pre>
 *
 * Protobuf type {@code google.logging.v2.DeleteSinkRequest}
 */
public final class DeleteSinkRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.logging.v2.DeleteSinkRequest)
    DeleteSinkRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DeleteSinkRequest.newBuilder() to construct.
  private DeleteSinkRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DeleteSinkRequest() {
    sinkName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DeleteSinkRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_DeleteSinkRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.logging.v2.LoggingConfigProto
        .internal_static_google_logging_v2_DeleteSinkRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.logging.v2.DeleteSinkRequest.class,
            com.google.logging.v2.DeleteSinkRequest.Builder.class);
  }

  public static final int SINK_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sinkName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The full resource name of the sink to delete, including the
   * parent resource and the sink identifier:
   *
   *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   *
   * For example:
   *
   *   `"projects/my-project/sinks/my-sink"`
   * </pre>
   *
   * <code>
   * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The sinkName.
   */
  @java.lang.Override
  public java.lang.String getSinkName() {
    java.lang.Object ref = sinkName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sinkName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The full resource name of the sink to delete, including the
   * parent resource and the sink identifier:
   *
   *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
   *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
   *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
   *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
   *
   * For example:
   *
   *   `"projects/my-project/sinks/my-sink"`
   * </pre>
   *
   * <code>
   * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for sinkName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSinkNameBytes() {
    java.lang.Object ref = sinkName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sinkName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sinkName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sinkName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sinkName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sinkName_);
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
    if (!(obj instanceof com.google.logging.v2.DeleteSinkRequest)) {
      return super.equals(obj);
    }
    com.google.logging.v2.DeleteSinkRequest other = (com.google.logging.v2.DeleteSinkRequest) obj;

    if (!getSinkName().equals(other.getSinkName())) return false;
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
    hash = (37 * hash) + SINK_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSinkName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.logging.v2.DeleteSinkRequest parseFrom(
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

  public static Builder newBuilder(com.google.logging.v2.DeleteSinkRequest prototype) {
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
   * The parameters to `DeleteSink`.
   * </pre>
   *
   * Protobuf type {@code google.logging.v2.DeleteSinkRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.logging.v2.DeleteSinkRequest)
      com.google.logging.v2.DeleteSinkRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_DeleteSinkRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_DeleteSinkRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.logging.v2.DeleteSinkRequest.class,
              com.google.logging.v2.DeleteSinkRequest.Builder.class);
    }

    // Construct using com.google.logging.v2.DeleteSinkRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sinkName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.logging.v2.LoggingConfigProto
          .internal_static_google_logging_v2_DeleteSinkRequest_descriptor;
    }

    @java.lang.Override
    public com.google.logging.v2.DeleteSinkRequest getDefaultInstanceForType() {
      return com.google.logging.v2.DeleteSinkRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.logging.v2.DeleteSinkRequest build() {
      com.google.logging.v2.DeleteSinkRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.logging.v2.DeleteSinkRequest buildPartial() {
      com.google.logging.v2.DeleteSinkRequest result =
          new com.google.logging.v2.DeleteSinkRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.logging.v2.DeleteSinkRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sinkName_ = sinkName_;
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
      if (other instanceof com.google.logging.v2.DeleteSinkRequest) {
        return mergeFrom((com.google.logging.v2.DeleteSinkRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.logging.v2.DeleteSinkRequest other) {
      if (other == com.google.logging.v2.DeleteSinkRequest.getDefaultInstance()) return this;
      if (!other.getSinkName().isEmpty()) {
        sinkName_ = other.sinkName_;
        bitField0_ |= 0x00000001;
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
                sinkName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object sinkName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the sink to delete, including the
     * parent resource and the sink identifier:
     *
     *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
     *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
     *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
     *
     * For example:
     *
     *   `"projects/my-project/sinks/my-sink"`
     * </pre>
     *
     * <code>
     * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The sinkName.
     */
    public java.lang.String getSinkName() {
      java.lang.Object ref = sinkName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sinkName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the sink to delete, including the
     * parent resource and the sink identifier:
     *
     *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
     *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
     *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
     *
     * For example:
     *
     *   `"projects/my-project/sinks/my-sink"`
     * </pre>
     *
     * <code>
     * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for sinkName.
     */
    public com.google.protobuf.ByteString getSinkNameBytes() {
      java.lang.Object ref = sinkName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sinkName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the sink to delete, including the
     * parent resource and the sink identifier:
     *
     *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
     *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
     *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
     *
     * For example:
     *
     *   `"projects/my-project/sinks/my-sink"`
     * </pre>
     *
     * <code>
     * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The sinkName to set.
     * @return This builder for chaining.
     */
    public Builder setSinkName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sinkName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the sink to delete, including the
     * parent resource and the sink identifier:
     *
     *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
     *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
     *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
     *
     * For example:
     *
     *   `"projects/my-project/sinks/my-sink"`
     * </pre>
     *
     * <code>
     * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSinkName() {
      sinkName_ = getDefaultInstance().getSinkName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The full resource name of the sink to delete, including the
     * parent resource and the sink identifier:
     *
     *     "projects/[PROJECT_ID]/sinks/[SINK_ID]"
     *     "organizations/[ORGANIZATION_ID]/sinks/[SINK_ID]"
     *     "billingAccounts/[BILLING_ACCOUNT_ID]/sinks/[SINK_ID]"
     *     "folders/[FOLDER_ID]/sinks/[SINK_ID]"
     *
     * For example:
     *
     *   `"projects/my-project/sinks/my-sink"`
     * </pre>
     *
     * <code>
     * string sink_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for sinkName to set.
     * @return This builder for chaining.
     */
    public Builder setSinkNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sinkName_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.logging.v2.DeleteSinkRequest)
  }

  // @@protoc_insertion_point(class_scope:google.logging.v2.DeleteSinkRequest)
  private static final com.google.logging.v2.DeleteSinkRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.logging.v2.DeleteSinkRequest();
  }

  public static com.google.logging.v2.DeleteSinkRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DeleteSinkRequest> PARSER =
      new com.google.protobuf.AbstractParser<DeleteSinkRequest>() {
        @java.lang.Override
        public DeleteSinkRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<DeleteSinkRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DeleteSinkRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.logging.v2.DeleteSinkRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
