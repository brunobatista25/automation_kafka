/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package modelAvro.user;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class UserAvro extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -304222949678103148L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"UserAvro\",\"namespace\":\"modelAvro.user\",\"fields\":[{\"name\":\"nome\",\"type\":[\"string\"]},{\"name\":\"email\",\"type\":[\"string\"]},{\"name\":\"age\",\"type\":[\"string\"]}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<UserAvro> ENCODER =
      new BinaryMessageEncoder<UserAvro>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<UserAvro> DECODER =
      new BinaryMessageDecoder<UserAvro>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<UserAvro> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<UserAvro> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<UserAvro>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this UserAvro to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a UserAvro from a ByteBuffer. */
  public static UserAvro fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.Object nome;
  @Deprecated public java.lang.Object email;
  @Deprecated public java.lang.Object age;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public UserAvro() {}

  /**
   * All-args constructor.
   * @param nome The new value for nome
   * @param email The new value for email
   * @param age The new value for age
   */
  public UserAvro(java.lang.Object nome, java.lang.Object email, java.lang.Object age) {
    this.nome = nome;
    this.email = email;
    this.age = age;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return nome;
    case 1: return email;
    case 2: return age;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: nome = (java.lang.Object)value$; break;
    case 1: email = (java.lang.Object)value$; break;
    case 2: age = (java.lang.Object)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'nome' field.
   * @return The value of the 'nome' field.
   */
  public java.lang.Object getNome() {
    return nome;
  }

  /**
   * Sets the value of the 'nome' field.
   * @param value the value to set.
   */
  public void setNome(java.lang.Object value) {
    this.nome = value;
  }

  /**
   * Gets the value of the 'email' field.
   * @return The value of the 'email' field.
   */
  public java.lang.Object getEmail() {
    return email;
  }

  /**
   * Sets the value of the 'email' field.
   * @param value the value to set.
   */
  public void setEmail(java.lang.Object value) {
    this.email = value;
  }

  /**
   * Gets the value of the 'age' field.
   * @return The value of the 'age' field.
   */
  public java.lang.Object getAge() {
    return age;
  }

  /**
   * Sets the value of the 'age' field.
   * @param value the value to set.
   */
  public void setAge(java.lang.Object value) {
    this.age = value;
  }

  /**
   * Creates a new UserAvro RecordBuilder.
   * @return A new UserAvro RecordBuilder
   */
  public static modelAvro.user.UserAvro.Builder newBuilder() {
    return new modelAvro.user.UserAvro.Builder();
  }

  /**
   * Creates a new UserAvro RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new UserAvro RecordBuilder
   */
  public static modelAvro.user.UserAvro.Builder newBuilder(modelAvro.user.UserAvro.Builder other) {
    return new modelAvro.user.UserAvro.Builder(other);
  }

  /**
   * Creates a new UserAvro RecordBuilder by copying an existing UserAvro instance.
   * @param other The existing instance to copy.
   * @return A new UserAvro RecordBuilder
   */
  public static modelAvro.user.UserAvro.Builder newBuilder(modelAvro.user.UserAvro other) {
    return new modelAvro.user.UserAvro.Builder(other);
  }

  /**
   * RecordBuilder for UserAvro instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<UserAvro>
    implements org.apache.avro.data.RecordBuilder<UserAvro> {

    private java.lang.Object nome;
    private java.lang.Object email;
    private java.lang.Object age;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(modelAvro.user.UserAvro.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing UserAvro instance
     * @param other The existing instance to copy.
     */
    private Builder(modelAvro.user.UserAvro other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.nome)) {
        this.nome = data().deepCopy(fields()[0].schema(), other.nome);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.email)) {
        this.email = data().deepCopy(fields()[1].schema(), other.email);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.age)) {
        this.age = data().deepCopy(fields()[2].schema(), other.age);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'nome' field.
      * @return The value.
      */
    public java.lang.Object getNome() {
      return nome;
    }

    /**
      * Sets the value of the 'nome' field.
      * @param value The value of 'nome'.
      * @return This builder.
      */
    public modelAvro.user.UserAvro.Builder setNome(java.lang.Object value) {
      validate(fields()[0], value);
      this.nome = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'nome' field has been set.
      * @return True if the 'nome' field has been set, false otherwise.
      */
    public boolean hasNome() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'nome' field.
      * @return This builder.
      */
    public modelAvro.user.UserAvro.Builder clearNome() {
      nome = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'email' field.
      * @return The value.
      */
    public java.lang.Object getEmail() {
      return email;
    }

    /**
      * Sets the value of the 'email' field.
      * @param value The value of 'email'.
      * @return This builder.
      */
    public modelAvro.user.UserAvro.Builder setEmail(java.lang.Object value) {
      validate(fields()[1], value);
      this.email = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'email' field has been set.
      * @return True if the 'email' field has been set, false otherwise.
      */
    public boolean hasEmail() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'email' field.
      * @return This builder.
      */
    public modelAvro.user.UserAvro.Builder clearEmail() {
      email = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * @return The value.
      */
    public java.lang.Object getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * @param value The value of 'age'.
      * @return This builder.
      */
    public modelAvro.user.UserAvro.Builder setAge(java.lang.Object value) {
      validate(fields()[2], value);
      this.age = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'age' field.
      * @return This builder.
      */
    public modelAvro.user.UserAvro.Builder clearAge() {
      age = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public UserAvro build() {
      try {
        UserAvro record = new UserAvro();
        record.nome = fieldSetFlags()[0] ? this.nome : (java.lang.Object) defaultValue(fields()[0]);
        record.email = fieldSetFlags()[1] ? this.email : (java.lang.Object) defaultValue(fields()[1]);
        record.age = fieldSetFlags()[2] ? this.age : (java.lang.Object) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<UserAvro>
    WRITER$ = (org.apache.avro.io.DatumWriter<UserAvro>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<UserAvro>
    READER$ = (org.apache.avro.io.DatumReader<UserAvro>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
