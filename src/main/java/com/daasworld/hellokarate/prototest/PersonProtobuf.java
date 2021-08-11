// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resources/person.proto

package com.daasworld.hellokarate.prototest;

public final class PersonProtobuf {
  private PersonProtobuf() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PersonOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Person)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string firstname = 1;</code>
     * @return The firstname.
     */
    java.lang.String getFirstname();
    /**
     * <code>string firstname = 1;</code>
     * @return The bytes for firstname.
     */
    com.google.protobuf.ByteString
        getFirstnameBytes();

    /**
     * <code>string lastname = 2;</code>
     * @return The lastname.
     */
    java.lang.String getLastname();
    /**
     * <code>string lastname = 2;</code>
     * @return The bytes for lastname.
     */
    com.google.protobuf.ByteString
        getLastnameBytes();

    /**
     * <code>int32 age = 3;</code>
     * @return The age.
     */
    int getAge();
  }
  /**
   * Protobuf type {@code Person}
   */
  public static final class Person extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Person)
      PersonOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Person.newBuilder() to construct.
    private Person(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Person() {
      firstname_ = "";
      lastname_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Person();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Person(
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

              firstname_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              lastname_ = s;
              break;
            }
            case 24: {

              age_ = input.readInt32();
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
      return com.daasworld.hellokarate.prototest.PersonProtobuf.internal_static_Person_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.daasworld.hellokarate.prototest.PersonProtobuf.internal_static_Person_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.daasworld.hellokarate.prototest.PersonProtobuf.Person.class, com.daasworld.hellokarate.prototest.PersonProtobuf.Person.Builder.class);
    }

    public static final int FIRSTNAME_FIELD_NUMBER = 1;
    private volatile java.lang.Object firstname_;
    /**
     * <code>string firstname = 1;</code>
     * @return The firstname.
     */
    @java.lang.Override
    public java.lang.String getFirstname() {
      java.lang.Object ref = firstname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstname_ = s;
        return s;
      }
    }
    /**
     * <code>string firstname = 1;</code>
     * @return The bytes for firstname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFirstnameBytes() {
      java.lang.Object ref = firstname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        firstname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int LASTNAME_FIELD_NUMBER = 2;
    private volatile java.lang.Object lastname_;
    /**
     * <code>string lastname = 2;</code>
     * @return The lastname.
     */
    @java.lang.Override
    public java.lang.String getLastname() {
      java.lang.Object ref = lastname_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastname_ = s;
        return s;
      }
    }
    /**
     * <code>string lastname = 2;</code>
     * @return The bytes for lastname.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getLastnameBytes() {
      java.lang.Object ref = lastname_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastname_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int AGE_FIELD_NUMBER = 3;
    private int age_;
    /**
     * <code>int32 age = 3;</code>
     * @return The age.
     */
    @java.lang.Override
    public int getAge() {
      return age_;
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
      if (!getFirstnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstname_);
      }
      if (!getLastnameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, lastname_);
      }
      if (age_ != 0) {
        output.writeInt32(3, age_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getFirstnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstname_);
      }
      if (!getLastnameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, lastname_);
      }
      if (age_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, age_);
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
      if (!(obj instanceof com.daasworld.hellokarate.prototest.PersonProtobuf.Person)) {
        return super.equals(obj);
      }
      com.daasworld.hellokarate.prototest.PersonProtobuf.Person other = (com.daasworld.hellokarate.prototest.PersonProtobuf.Person) obj;

      if (!getFirstname()
          .equals(other.getFirstname())) return false;
      if (!getLastname()
          .equals(other.getLastname())) return false;
      if (getAge()
          != other.getAge()) return false;
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
      hash = (37 * hash) + FIRSTNAME_FIELD_NUMBER;
      hash = (53 * hash) + getFirstname().hashCode();
      hash = (37 * hash) + LASTNAME_FIELD_NUMBER;
      hash = (53 * hash) + getLastname().hashCode();
      hash = (37 * hash) + AGE_FIELD_NUMBER;
      hash = (53 * hash) + getAge();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person parseFrom(
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
    public static Builder newBuilder(com.daasworld.hellokarate.prototest.PersonProtobuf.Person prototype) {
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
     * Protobuf type {@code Person}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Person)
        com.daasworld.hellokarate.prototest.PersonProtobuf.PersonOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.daasworld.hellokarate.prototest.PersonProtobuf.internal_static_Person_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.daasworld.hellokarate.prototest.PersonProtobuf.internal_static_Person_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.daasworld.hellokarate.prototest.PersonProtobuf.Person.class, com.daasworld.hellokarate.prototest.PersonProtobuf.Person.Builder.class);
      }

      // Construct using com.daasworld.hellokarate.prototest.PersonProtobuf.Person.newBuilder()
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
        firstname_ = "";

        lastname_ = "";

        age_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.daasworld.hellokarate.prototest.PersonProtobuf.internal_static_Person_descriptor;
      }

      @java.lang.Override
      public com.daasworld.hellokarate.prototest.PersonProtobuf.Person getDefaultInstanceForType() {
        return com.daasworld.hellokarate.prototest.PersonProtobuf.Person.getDefaultInstance();
      }

      @java.lang.Override
      public com.daasworld.hellokarate.prototest.PersonProtobuf.Person build() {
        com.daasworld.hellokarate.prototest.PersonProtobuf.Person result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.daasworld.hellokarate.prototest.PersonProtobuf.Person buildPartial() {
        com.daasworld.hellokarate.prototest.PersonProtobuf.Person result = new com.daasworld.hellokarate.prototest.PersonProtobuf.Person(this);
        result.firstname_ = firstname_;
        result.lastname_ = lastname_;
        result.age_ = age_;
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
        if (other instanceof com.daasworld.hellokarate.prototest.PersonProtobuf.Person) {
          return mergeFrom((com.daasworld.hellokarate.prototest.PersonProtobuf.Person)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.daasworld.hellokarate.prototest.PersonProtobuf.Person other) {
        if (other == com.daasworld.hellokarate.prototest.PersonProtobuf.Person.getDefaultInstance()) return this;
        if (!other.getFirstname().isEmpty()) {
          firstname_ = other.firstname_;
          onChanged();
        }
        if (!other.getLastname().isEmpty()) {
          lastname_ = other.lastname_;
          onChanged();
        }
        if (other.getAge() != 0) {
          setAge(other.getAge());
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
        com.daasworld.hellokarate.prototest.PersonProtobuf.Person parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.daasworld.hellokarate.prototest.PersonProtobuf.Person) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object firstname_ = "";
      /**
       * <code>string firstname = 1;</code>
       * @return The firstname.
       */
      public java.lang.String getFirstname() {
        java.lang.Object ref = firstname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          firstname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string firstname = 1;</code>
       * @return The bytes for firstname.
       */
      public com.google.protobuf.ByteString
          getFirstnameBytes() {
        java.lang.Object ref = firstname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          firstname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string firstname = 1;</code>
       * @param value The firstname to set.
       * @return This builder for chaining.
       */
      public Builder setFirstname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        firstname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string firstname = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearFirstname() {
        
        firstname_ = getDefaultInstance().getFirstname();
        onChanged();
        return this;
      }
      /**
       * <code>string firstname = 1;</code>
       * @param value The bytes for firstname to set.
       * @return This builder for chaining.
       */
      public Builder setFirstnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        firstname_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object lastname_ = "";
      /**
       * <code>string lastname = 2;</code>
       * @return The lastname.
       */
      public java.lang.String getLastname() {
        java.lang.Object ref = lastname_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          lastname_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string lastname = 2;</code>
       * @return The bytes for lastname.
       */
      public com.google.protobuf.ByteString
          getLastnameBytes() {
        java.lang.Object ref = lastname_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          lastname_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string lastname = 2;</code>
       * @param value The lastname to set.
       * @return This builder for chaining.
       */
      public Builder setLastname(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        lastname_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string lastname = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearLastname() {
        
        lastname_ = getDefaultInstance().getLastname();
        onChanged();
        return this;
      }
      /**
       * <code>string lastname = 2;</code>
       * @param value The bytes for lastname to set.
       * @return This builder for chaining.
       */
      public Builder setLastnameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        lastname_ = value;
        onChanged();
        return this;
      }

      private int age_ ;
      /**
       * <code>int32 age = 3;</code>
       * @return The age.
       */
      @java.lang.Override
      public int getAge() {
        return age_;
      }
      /**
       * <code>int32 age = 3;</code>
       * @param value The age to set.
       * @return This builder for chaining.
       */
      public Builder setAge(int value) {
        
        age_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 age = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearAge() {
        
        age_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Person)
    }

    // @@protoc_insertion_point(class_scope:Person)
    private static final com.daasworld.hellokarate.prototest.PersonProtobuf.Person DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.daasworld.hellokarate.prototest.PersonProtobuf.Person();
    }

    public static com.daasworld.hellokarate.prototest.PersonProtobuf.Person getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Person>
        PARSER = new com.google.protobuf.AbstractParser<Person>() {
      @java.lang.Override
      public Person parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Person(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Person> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Person> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.daasworld.hellokarate.prototest.PersonProtobuf.Person getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Person_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Person_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026resources/person.proto\":\n\006Person\022\021\n\tfi" +
      "rstname\030\001 \001(\t\022\020\n\010lastname\030\002 \001(\t\022\013\n\003age\030\003" +
      " \001(\005B5\n#com.daasworld.hellokarate.protot" +
      "estB\016PersonProtobufb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Person_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Person_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Person_descriptor,
        new java.lang.String[] { "Firstname", "Lastname", "Age", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
