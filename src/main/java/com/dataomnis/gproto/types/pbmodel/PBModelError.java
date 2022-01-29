// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/types/model/error.proto

package com.dataomnis.gproto.types.pbmodel;

public final class PBModelError {
  private PBModelError() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ErrorOrBuilder extends
      // @@protoc_insertion_point(interface_extends:model.Error)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Code is summary information of error.
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The code.
     */
    java.lang.String getCode();
    /**
     * <pre>
     * Code is summary information of error.
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The bytes for code.
     */
    com.google.protobuf.ByteString
        getCodeBytes();

    /**
     * <pre>
     * Status is http status code.
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return The status.
     */
    int getStatus();

    /**
     * <pre>
     * EnUS is detail information of error with en_us format.
     * </pre>
     *
     * <code>string en_us = 3;</code>
     * @return The enUs.
     */
    java.lang.String getEnUs();
    /**
     * <pre>
     * EnUS is detail information of error with en_us format.
     * </pre>
     *
     * <code>string en_us = 3;</code>
     * @return The bytes for enUs.
     */
    com.google.protobuf.ByteString
        getEnUsBytes();

    /**
     * <pre>
     * ZhCN is detail information of error with zh_cn format.
     * </pre>
     *
     * <code>string zh_cn = 4;</code>
     * @return The zhCn.
     */
    java.lang.String getZhCn();
    /**
     * <pre>
     * ZhCN is detail information of error with zh_cn format.
     * </pre>
     *
     * <code>string zh_cn = 4;</code>
     * @return The bytes for zhCn.
     */
    com.google.protobuf.ByteString
        getZhCnBytes();
  }
  /**
   * <pre>
   * Error transmits customized-error between grpc client and server by status details
   * </pre>
   *
   * Protobuf type {@code model.Error}
   */
  public static final class Error extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:model.Error)
      ErrorOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Error.newBuilder() to construct.
    private Error(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Error() {
      code_ = "";
      enUs_ = "";
      zhCn_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Error();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Error(
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

              code_ = s;
              break;
            }
            case 16: {

              status_ = input.readInt32();
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              enUs_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              zhCn_ = s;
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
      return com.dataomnis.gproto.types.pbmodel.PBModelError.internal_static_model_Error_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.dataomnis.gproto.types.pbmodel.PBModelError.internal_static_model_Error_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.dataomnis.gproto.types.pbmodel.PBModelError.Error.class, com.dataomnis.gproto.types.pbmodel.PBModelError.Error.Builder.class);
    }

    public static final int CODE_FIELD_NUMBER = 1;
    private volatile java.lang.Object code_;
    /**
     * <pre>
     * Code is summary information of error.
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The code.
     */
    @java.lang.Override
    public java.lang.String getCode() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        code_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Code is summary information of error.
     * </pre>
     *
     * <code>string code = 1;</code>
     * @return The bytes for code.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCodeBytes() {
      java.lang.Object ref = code_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        code_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int STATUS_FIELD_NUMBER = 2;
    private int status_;
    /**
     * <pre>
     * Status is http status code.
     * </pre>
     *
     * <code>int32 status = 2;</code>
     * @return The status.
     */
    @java.lang.Override
    public int getStatus() {
      return status_;
    }

    public static final int EN_US_FIELD_NUMBER = 3;
    private volatile java.lang.Object enUs_;
    /**
     * <pre>
     * EnUS is detail information of error with en_us format.
     * </pre>
     *
     * <code>string en_us = 3;</code>
     * @return The enUs.
     */
    @java.lang.Override
    public java.lang.String getEnUs() {
      java.lang.Object ref = enUs_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        enUs_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * EnUS is detail information of error with en_us format.
     * </pre>
     *
     * <code>string en_us = 3;</code>
     * @return The bytes for enUs.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getEnUsBytes() {
      java.lang.Object ref = enUs_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        enUs_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ZH_CN_FIELD_NUMBER = 4;
    private volatile java.lang.Object zhCn_;
    /**
     * <pre>
     * ZhCN is detail information of error with zh_cn format.
     * </pre>
     *
     * <code>string zh_cn = 4;</code>
     * @return The zhCn.
     */
    @java.lang.Override
    public java.lang.String getZhCn() {
      java.lang.Object ref = zhCn_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zhCn_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * ZhCN is detail information of error with zh_cn format.
     * </pre>
     *
     * <code>string zh_cn = 4;</code>
     * @return The bytes for zhCn.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getZhCnBytes() {
      java.lang.Object ref = zhCn_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        zhCn_ = b;
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, code_);
      }
      if (status_ != 0) {
        output.writeInt32(2, status_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enUs_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, enUs_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zhCn_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, zhCn_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(code_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, code_);
      }
      if (status_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, status_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(enUs_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, enUs_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zhCn_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, zhCn_);
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
      if (!(obj instanceof com.dataomnis.gproto.types.pbmodel.PBModelError.Error)) {
        return super.equals(obj);
      }
      com.dataomnis.gproto.types.pbmodel.PBModelError.Error other = (com.dataomnis.gproto.types.pbmodel.PBModelError.Error) obj;

      if (!getCode()
          .equals(other.getCode())) return false;
      if (getStatus()
          != other.getStatus()) return false;
      if (!getEnUs()
          .equals(other.getEnUs())) return false;
      if (!getZhCn()
          .equals(other.getZhCn())) return false;
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
      hash = (37 * hash) + CODE_FIELD_NUMBER;
      hash = (53 * hash) + getCode().hashCode();
      hash = (37 * hash) + STATUS_FIELD_NUMBER;
      hash = (53 * hash) + getStatus();
      hash = (37 * hash) + EN_US_FIELD_NUMBER;
      hash = (53 * hash) + getEnUs().hashCode();
      hash = (37 * hash) + ZH_CN_FIELD_NUMBER;
      hash = (53 * hash) + getZhCn().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error parseFrom(
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
    public static Builder newBuilder(com.dataomnis.gproto.types.pbmodel.PBModelError.Error prototype) {
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
     * <pre>
     * Error transmits customized-error between grpc client and server by status details
     * </pre>
     *
     * Protobuf type {@code model.Error}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:model.Error)
        com.dataomnis.gproto.types.pbmodel.PBModelError.ErrorOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.dataomnis.gproto.types.pbmodel.PBModelError.internal_static_model_Error_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.dataomnis.gproto.types.pbmodel.PBModelError.internal_static_model_Error_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.dataomnis.gproto.types.pbmodel.PBModelError.Error.class, com.dataomnis.gproto.types.pbmodel.PBModelError.Error.Builder.class);
      }

      // Construct using com.dataomnis.gproto.types.pbmodel.PBModelError.Error.newBuilder()
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
        code_ = "";

        status_ = 0;

        enUs_ = "";

        zhCn_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.dataomnis.gproto.types.pbmodel.PBModelError.internal_static_model_Error_descriptor;
      }

      @java.lang.Override
      public com.dataomnis.gproto.types.pbmodel.PBModelError.Error getDefaultInstanceForType() {
        return com.dataomnis.gproto.types.pbmodel.PBModelError.Error.getDefaultInstance();
      }

      @java.lang.Override
      public com.dataomnis.gproto.types.pbmodel.PBModelError.Error build() {
        com.dataomnis.gproto.types.pbmodel.PBModelError.Error result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.dataomnis.gproto.types.pbmodel.PBModelError.Error buildPartial() {
        com.dataomnis.gproto.types.pbmodel.PBModelError.Error result = new com.dataomnis.gproto.types.pbmodel.PBModelError.Error(this);
        result.code_ = code_;
        result.status_ = status_;
        result.enUs_ = enUs_;
        result.zhCn_ = zhCn_;
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
        if (other instanceof com.dataomnis.gproto.types.pbmodel.PBModelError.Error) {
          return mergeFrom((com.dataomnis.gproto.types.pbmodel.PBModelError.Error)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.dataomnis.gproto.types.pbmodel.PBModelError.Error other) {
        if (other == com.dataomnis.gproto.types.pbmodel.PBModelError.Error.getDefaultInstance()) return this;
        if (!other.getCode().isEmpty()) {
          code_ = other.code_;
          onChanged();
        }
        if (other.getStatus() != 0) {
          setStatus(other.getStatus());
        }
        if (!other.getEnUs().isEmpty()) {
          enUs_ = other.enUs_;
          onChanged();
        }
        if (!other.getZhCn().isEmpty()) {
          zhCn_ = other.zhCn_;
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
        com.dataomnis.gproto.types.pbmodel.PBModelError.Error parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.dataomnis.gproto.types.pbmodel.PBModelError.Error) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object code_ = "";
      /**
       * <pre>
       * Code is summary information of error.
       * </pre>
       *
       * <code>string code = 1;</code>
       * @return The code.
       */
      public java.lang.String getCode() {
        java.lang.Object ref = code_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          code_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Code is summary information of error.
       * </pre>
       *
       * <code>string code = 1;</code>
       * @return The bytes for code.
       */
      public com.google.protobuf.ByteString
          getCodeBytes() {
        java.lang.Object ref = code_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          code_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Code is summary information of error.
       * </pre>
       *
       * <code>string code = 1;</code>
       * @param value The code to set.
       * @return This builder for chaining.
       */
      public Builder setCode(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        code_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Code is summary information of error.
       * </pre>
       *
       * <code>string code = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCode() {
        
        code_ = getDefaultInstance().getCode();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Code is summary information of error.
       * </pre>
       *
       * <code>string code = 1;</code>
       * @param value The bytes for code to set.
       * @return This builder for chaining.
       */
      public Builder setCodeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        code_ = value;
        onChanged();
        return this;
      }

      private int status_ ;
      /**
       * <pre>
       * Status is http status code.
       * </pre>
       *
       * <code>int32 status = 2;</code>
       * @return The status.
       */
      @java.lang.Override
      public int getStatus() {
        return status_;
      }
      /**
       * <pre>
       * Status is http status code.
       * </pre>
       *
       * <code>int32 status = 2;</code>
       * @param value The status to set.
       * @return This builder for chaining.
       */
      public Builder setStatus(int value) {
        
        status_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Status is http status code.
       * </pre>
       *
       * <code>int32 status = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearStatus() {
        
        status_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object enUs_ = "";
      /**
       * <pre>
       * EnUS is detail information of error with en_us format.
       * </pre>
       *
       * <code>string en_us = 3;</code>
       * @return The enUs.
       */
      public java.lang.String getEnUs() {
        java.lang.Object ref = enUs_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          enUs_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * EnUS is detail information of error with en_us format.
       * </pre>
       *
       * <code>string en_us = 3;</code>
       * @return The bytes for enUs.
       */
      public com.google.protobuf.ByteString
          getEnUsBytes() {
        java.lang.Object ref = enUs_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          enUs_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * EnUS is detail information of error with en_us format.
       * </pre>
       *
       * <code>string en_us = 3;</code>
       * @param value The enUs to set.
       * @return This builder for chaining.
       */
      public Builder setEnUs(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        enUs_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * EnUS is detail information of error with en_us format.
       * </pre>
       *
       * <code>string en_us = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearEnUs() {
        
        enUs_ = getDefaultInstance().getEnUs();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * EnUS is detail information of error with en_us format.
       * </pre>
       *
       * <code>string en_us = 3;</code>
       * @param value The bytes for enUs to set.
       * @return This builder for chaining.
       */
      public Builder setEnUsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        enUs_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object zhCn_ = "";
      /**
       * <pre>
       * ZhCN is detail information of error with zh_cn format.
       * </pre>
       *
       * <code>string zh_cn = 4;</code>
       * @return The zhCn.
       */
      public java.lang.String getZhCn() {
        java.lang.Object ref = zhCn_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          zhCn_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * ZhCN is detail information of error with zh_cn format.
       * </pre>
       *
       * <code>string zh_cn = 4;</code>
       * @return The bytes for zhCn.
       */
      public com.google.protobuf.ByteString
          getZhCnBytes() {
        java.lang.Object ref = zhCn_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          zhCn_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * ZhCN is detail information of error with zh_cn format.
       * </pre>
       *
       * <code>string zh_cn = 4;</code>
       * @param value The zhCn to set.
       * @return This builder for chaining.
       */
      public Builder setZhCn(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        zhCn_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ZhCN is detail information of error with zh_cn format.
       * </pre>
       *
       * <code>string zh_cn = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearZhCn() {
        
        zhCn_ = getDefaultInstance().getZhCn();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * ZhCN is detail information of error with zh_cn format.
       * </pre>
       *
       * <code>string zh_cn = 4;</code>
       * @param value The bytes for zhCn to set.
       * @return This builder for chaining.
       */
      public Builder setZhCnBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        zhCn_ = value;
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


      // @@protoc_insertion_point(builder_scope:model.Error)
    }

    // @@protoc_insertion_point(class_scope:model.Error)
    private static final com.dataomnis.gproto.types.pbmodel.PBModelError.Error DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.dataomnis.gproto.types.pbmodel.PBModelError.Error();
    }

    public static com.dataomnis.gproto.types.pbmodel.PBModelError.Error getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Error>
        PARSER = new com.google.protobuf.AbstractParser<Error>() {
      @java.lang.Override
      public Error parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Error(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Error> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Error> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.dataomnis.gproto.types.pbmodel.PBModelError.Error getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_model_Error_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_model_Error_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\035proto/types/model/error.proto\022\005model\"C" +
      "\n\005Error\022\014\n\004code\030\001 \001(\t\022\016\n\006status\030\002 \001(\005\022\r\n" +
      "\005en_us\030\003 \001(\t\022\r\n\005zh_cn\030\004 \001(\tBg\n\"com.datao" +
      "mnis.gproto.types.pbmodelB\014PBModelErrorP" +
      "\000Z1github.com/DataWorkbench/gproto/pkg/t" +
      "ypes/pbmodelb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_model_Error_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_model_Error_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_model_Error_descriptor,
        new java.lang.String[] { "Code", "Status", "EnUs", "ZhCn", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
