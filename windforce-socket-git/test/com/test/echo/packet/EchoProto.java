// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: echoProto.proto

package com.test.echo.packet;

public final class EchoProto {
  private EchoProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface EchoMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.windforce.test.echo.packet.EchoMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int64 guid = 1;</code>
     */
    boolean hasGuid();
    /**
     * <code>required int64 guid = 1;</code>
     */
    long getGuid();

    /**
     * <code>required string name = 2;</code>
     */
    boolean hasName();
    /**
     * <code>required string name = 2;</code>
     */
    java.lang.String getName();
    /**
     * <code>required string name = 2;</code>
     */
    com.google.protobuf.ByteString
        getNameBytes();
  }
  /**
   * Protobuf type {@code com.windforce.test.echo.packet.EchoMessage}
   */
  public static final class EchoMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.windforce.test.echo.packet.EchoMessage)
      EchoMessageOrBuilder {
    // Use EchoMessage.newBuilder() to construct.
    private EchoMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private EchoMessage(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final EchoMessage defaultInstance;
    public static EchoMessage getDefaultInstance() {
      return defaultInstance;
    }

    public EchoMessage getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private EchoMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              guid_ = input.readInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              name_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.test.echo.packet.EchoProto.internal_static_com_windforce_test_echo_packet_EchoMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.test.echo.packet.EchoProto.internal_static_com_windforce_test_echo_packet_EchoMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.test.echo.packet.EchoProto.EchoMessage.class, com.test.echo.packet.EchoProto.EchoMessage.Builder.class);
    }

    public static com.google.protobuf.Parser<EchoMessage> PARSER =
        new com.google.protobuf.AbstractParser<EchoMessage>() {
      public EchoMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new EchoMessage(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<EchoMessage> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int GUID_FIELD_NUMBER = 1;
    private long guid_;
    /**
     * <code>required int64 guid = 1;</code>
     */
    public boolean hasGuid() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int64 guid = 1;</code>
     */
    public long getGuid() {
      return guid_;
    }

    public static final int NAME_FIELD_NUMBER = 2;
    private java.lang.Object name_;
    /**
     * <code>required string name = 2;</code>
     */
    public boolean hasName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required string name = 2;</code>
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          name_ = s;
        }
        return s;
      }
    }
    /**
     * <code>required string name = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      guid_ = 0L;
      name_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasGuid()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasName()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt64(1, guid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getNameBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, guid_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getNameBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.test.echo.packet.EchoProto.EchoMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.test.echo.packet.EchoProto.EchoMessage prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.windforce.test.echo.packet.EchoMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.windforce.test.echo.packet.EchoMessage)
        com.test.echo.packet.EchoProto.EchoMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.test.echo.packet.EchoProto.internal_static_com_windforce_test_echo_packet_EchoMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.test.echo.packet.EchoProto.internal_static_com_windforce_test_echo_packet_EchoMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.test.echo.packet.EchoProto.EchoMessage.class, com.test.echo.packet.EchoProto.EchoMessage.Builder.class);
      }

      // Construct using com.windforce.test.echo.packet.EchoProto.EchoMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        guid_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        name_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.test.echo.packet.EchoProto.internal_static_com_windforce_test_echo_packet_EchoMessage_descriptor;
      }

      public com.test.echo.packet.EchoProto.EchoMessage getDefaultInstanceForType() {
        return com.test.echo.packet.EchoProto.EchoMessage.getDefaultInstance();
      }

      public com.test.echo.packet.EchoProto.EchoMessage build() {
        com.test.echo.packet.EchoProto.EchoMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.test.echo.packet.EchoProto.EchoMessage buildPartial() {
        com.test.echo.packet.EchoProto.EchoMessage result = new com.test.echo.packet.EchoProto.EchoMessage(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.guid_ = guid_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.name_ = name_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.test.echo.packet.EchoProto.EchoMessage) {
          return mergeFrom((com.test.echo.packet.EchoProto.EchoMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.test.echo.packet.EchoProto.EchoMessage other) {
        if (other == com.test.echo.packet.EchoProto.EchoMessage.getDefaultInstance()) return this;
        if (other.hasGuid()) {
          setGuid(other.getGuid());
        }
        if (other.hasName()) {
          bitField0_ |= 0x00000002;
          name_ = other.name_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasGuid()) {
          
          return false;
        }
        if (!hasName()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.test.echo.packet.EchoProto.EchoMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.test.echo.packet.EchoProto.EchoMessage) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long guid_ ;
      /**
       * <code>required int64 guid = 1;</code>
       */
      public boolean hasGuid() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int64 guid = 1;</code>
       */
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>required int64 guid = 1;</code>
       */
      public Builder setGuid(long value) {
        bitField0_ |= 0x00000001;
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int64 guid = 1;</code>
       */
      public Builder clearGuid() {
        bitField0_ = (bitField0_ & ~0x00000001);
        guid_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object name_ = "";
      /**
       * <code>required string name = 2;</code>
       */
      public boolean hasName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required string name = 2;</code>
       */
      public java.lang.String getName() {
        java.lang.Object ref = name_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            name_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public com.google.protobuf.ByteString
          getNameBytes() {
        java.lang.Object ref = name_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          name_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setName(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder clearName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        name_ = getDefaultInstance().getName();
        onChanged();
        return this;
      }
      /**
       * <code>required string name = 2;</code>
       */
      public Builder setNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        name_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.windforce.test.echo.packet.EchoMessage)
    }

    static {
      defaultInstance = new EchoMessage(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.windforce.test.echo.packet.EchoMessage)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_windforce_test_echo_packet_EchoMessage_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_windforce_test_echo_packet_EchoMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017echoProto.proto\022\036com.windforce.test.ec" +
      "ho.packet\")\n\013EchoMessage\022\014\n\004guid\030\001 \002(\003\022\014" +
      "\n\004name\030\002 \002(\t"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_windforce_test_echo_packet_EchoMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_windforce_test_echo_packet_EchoMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_windforce_test_echo_packet_EchoMessage_descriptor,
        new java.lang.String[] { "Guid", "Name", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}