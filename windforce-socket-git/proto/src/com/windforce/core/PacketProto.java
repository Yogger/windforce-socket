// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: packet_proto.proto

package com.windforce.core;

public final class PacketProto {
  private PacketProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PacketOrBuilder extends
      // @@protoc_insertion_point(interface_extends:com.windforce.core.Packet)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 module = 1;</code>
     */
    boolean hasModule();
    /**
     * <code>required int32 module = 1;</code>
     */
    int getModule();

    /**
     * <code>required int32 command = 2;</code>
     */
    boolean hasCommand();
    /**
     * <code>required int32 command = 2;</code>
     */
    int getCommand();

    /**
     * <code>optional int32 seq = 3;</code>
     */
    boolean hasSeq();
    /**
     * <code>optional int32 seq = 3;</code>
     */
    int getSeq();

    /**
     * <code>required bytes data = 4;</code>
     */
    boolean hasData();
    /**
     * <code>required bytes data = 4;</code>
     */
    com.google.protobuf.ByteString getData();
  }
  /**
   * Protobuf type {@code com.windforce.core.Packet}
   */
  public static final class Packet extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:com.windforce.core.Packet)
      PacketOrBuilder {
    // Use Packet.newBuilder() to construct.
    private Packet(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private Packet(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final Packet defaultInstance;
    public static Packet getDefaultInstance() {
      return defaultInstance;
    }

    public Packet getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private Packet(
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
              module_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              command_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              seq_ = input.readInt32();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              data_ = input.readBytes();
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
      return com.windforce.core.PacketProto.internal_static_com_windforce_core_Packet_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.windforce.core.PacketProto.internal_static_com_windforce_core_Packet_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.windforce.core.PacketProto.Packet.class, com.windforce.core.PacketProto.Packet.Builder.class);
    }

    public static com.google.protobuf.Parser<Packet> PARSER =
        new com.google.protobuf.AbstractParser<Packet>() {
      public Packet parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Packet(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<Packet> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int MODULE_FIELD_NUMBER = 1;
    private int module_;
    /**
     * <code>required int32 module = 1;</code>
     */
    public boolean hasModule() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 module = 1;</code>
     */
    public int getModule() {
      return module_;
    }

    public static final int COMMAND_FIELD_NUMBER = 2;
    private int command_;
    /**
     * <code>required int32 command = 2;</code>
     */
    public boolean hasCommand() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>required int32 command = 2;</code>
     */
    public int getCommand() {
      return command_;
    }

    public static final int SEQ_FIELD_NUMBER = 3;
    private int seq_;
    /**
     * <code>optional int32 seq = 3;</code>
     */
    public boolean hasSeq() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 seq = 3;</code>
     */
    public int getSeq() {
      return seq_;
    }

    public static final int DATA_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString data_;
    /**
     * <code>required bytes data = 4;</code>
     */
    public boolean hasData() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>required bytes data = 4;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }

    private void initFields() {
      module_ = 0;
      command_ = 0;
      seq_ = 0;
      data_ = com.google.protobuf.ByteString.EMPTY;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasModule()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasCommand()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasData()) {
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
        output.writeInt32(1, module_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, command_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, seq_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, data_);
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
          .computeInt32Size(1, module_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, command_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, seq_);
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, data_);
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

    public static com.windforce.core.PacketProto.Packet parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.windforce.core.PacketProto.Packet parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.windforce.core.PacketProto.Packet parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.windforce.core.PacketProto.Packet parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.windforce.core.PacketProto.Packet parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.windforce.core.PacketProto.Packet parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.windforce.core.PacketProto.Packet parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.windforce.core.PacketProto.Packet parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.windforce.core.PacketProto.Packet parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.windforce.core.PacketProto.Packet parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.windforce.core.PacketProto.Packet prototype) {
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
     * Protobuf type {@code com.windforce.core.Packet}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:com.windforce.core.Packet)
        com.windforce.core.PacketProto.PacketOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.windforce.core.PacketProto.internal_static_com_windforce_core_Packet_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.windforce.core.PacketProto.internal_static_com_windforce_core_Packet_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.windforce.core.PacketProto.Packet.class, com.windforce.core.PacketProto.Packet.Builder.class);
      }

      // Construct using com.windforce.core.PacketProto.Packet.newBuilder()
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
        module_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        command_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        seq_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        data_ = com.google.protobuf.ByteString.EMPTY;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.windforce.core.PacketProto.internal_static_com_windforce_core_Packet_descriptor;
      }

      public com.windforce.core.PacketProto.Packet getDefaultInstanceForType() {
        return com.windforce.core.PacketProto.Packet.getDefaultInstance();
      }

      public com.windforce.core.PacketProto.Packet build() {
        com.windforce.core.PacketProto.Packet result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.windforce.core.PacketProto.Packet buildPartial() {
        com.windforce.core.PacketProto.Packet result = new com.windforce.core.PacketProto.Packet(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.module_ = module_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.command_ = command_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.seq_ = seq_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.data_ = data_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.windforce.core.PacketProto.Packet) {
          return mergeFrom((com.windforce.core.PacketProto.Packet)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.windforce.core.PacketProto.Packet other) {
        if (other == com.windforce.core.PacketProto.Packet.getDefaultInstance()) return this;
        if (other.hasModule()) {
          setModule(other.getModule());
        }
        if (other.hasCommand()) {
          setCommand(other.getCommand());
        }
        if (other.hasSeq()) {
          setSeq(other.getSeq());
        }
        if (other.hasData()) {
          setData(other.getData());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasModule()) {
          
          return false;
        }
        if (!hasCommand()) {
          
          return false;
        }
        if (!hasData()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.windforce.core.PacketProto.Packet parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.windforce.core.PacketProto.Packet) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int module_ ;
      /**
       * <code>required int32 module = 1;</code>
       */
      public boolean hasModule() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 module = 1;</code>
       */
      public int getModule() {
        return module_;
      }
      /**
       * <code>required int32 module = 1;</code>
       */
      public Builder setModule(int value) {
        bitField0_ |= 0x00000001;
        module_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 module = 1;</code>
       */
      public Builder clearModule() {
        bitField0_ = (bitField0_ & ~0x00000001);
        module_ = 0;
        onChanged();
        return this;
      }

      private int command_ ;
      /**
       * <code>required int32 command = 2;</code>
       */
      public boolean hasCommand() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>required int32 command = 2;</code>
       */
      public int getCommand() {
        return command_;
      }
      /**
       * <code>required int32 command = 2;</code>
       */
      public Builder setCommand(int value) {
        bitField0_ |= 0x00000002;
        command_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 command = 2;</code>
       */
      public Builder clearCommand() {
        bitField0_ = (bitField0_ & ~0x00000002);
        command_ = 0;
        onChanged();
        return this;
      }

      private int seq_ ;
      /**
       * <code>optional int32 seq = 3;</code>
       */
      public boolean hasSeq() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 seq = 3;</code>
       */
      public int getSeq() {
        return seq_;
      }
      /**
       * <code>optional int32 seq = 3;</code>
       */
      public Builder setSeq(int value) {
        bitField0_ |= 0x00000004;
        seq_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 seq = 3;</code>
       */
      public Builder clearSeq() {
        bitField0_ = (bitField0_ & ~0x00000004);
        seq_ = 0;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>required bytes data = 4;</code>
       */
      public boolean hasData() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>required bytes data = 4;</code>
       */
      public com.google.protobuf.ByteString getData() {
        return data_;
      }
      /**
       * <code>required bytes data = 4;</code>
       */
      public Builder setData(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        data_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required bytes data = 4;</code>
       */
      public Builder clearData() {
        bitField0_ = (bitField0_ & ~0x00000008);
        data_ = getDefaultInstance().getData();
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.windforce.core.Packet)
    }

    static {
      defaultInstance = new Packet(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.windforce.core.Packet)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_windforce_core_Packet_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_windforce_core_Packet_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022packet_proto.proto\022\022com.windforce.core" +
      "\"D\n\006Packet\022\016\n\006module\030\001 \002(\005\022\017\n\007command\030\002 " +
      "\002(\005\022\013\n\003seq\030\003 \001(\005\022\014\n\004data\030\004 \002(\014"
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
    internal_static_com_windforce_core_Packet_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_windforce_core_Packet_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_com_windforce_core_Packet_descriptor,
        new java.lang.String[] { "Module", "Command", "Seq", "Data", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
