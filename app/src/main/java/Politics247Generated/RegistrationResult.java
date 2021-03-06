/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package Politics247Generated;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-26")
public class RegistrationResult implements org.apache.thrift.TBase<RegistrationResult, RegistrationResult._Fields>, java.io.Serializable, Cloneable, Comparable<RegistrationResult>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("RegistrationResult");

  private static final org.apache.thrift.protocol.TField IS_REGISTRATION_SUCCESSFUL_FIELD_DESC = new org.apache.thrift.protocol.TField("isRegistrationSuccessful", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField IS_USERNAME_VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("isUsernameValid", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField IS_PASSWORD_VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("isPasswordValid", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField IS_EMAIL_VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("isEmailValid", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new RegistrationResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new RegistrationResultTupleSchemeFactory());
  }

  public boolean isRegistrationSuccessful; // required
  public boolean isUsernameValid; // required
  public boolean isPasswordValid; // required
  public boolean isEmailValid; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeInt(isRegistrationSuccessful ? 1 : 0);
    out.writeInt(isUsernameValid ? 1 : 0);
    out.writeInt(isPasswordValid ? 1 : 0);
    out.writeInt(isEmailValid ? 1 : 0);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public RegistrationResult(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.isRegistrationSuccessful = (in.readInt()==1);
    this.isUsernameValid = (in.readInt()==1);
    this.isPasswordValid = (in.readInt()==1);
    this.isEmailValid = (in.readInt()==1);
  }

  public static final android.os.Parcelable.Creator<RegistrationResult> CREATOR = new android.os.Parcelable.Creator<RegistrationResult>() {
    @Override
    public RegistrationResult[] newArray(int size) {
      return new RegistrationResult[size];
    }

    @Override
    public RegistrationResult createFromParcel(android.os.Parcel in) {
      return new RegistrationResult(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_REGISTRATION_SUCCESSFUL((short)1, "isRegistrationSuccessful"),
    IS_USERNAME_VALID((short)2, "isUsernameValid"),
    IS_PASSWORD_VALID((short)3, "isPasswordValid"),
    IS_EMAIL_VALID((short)4, "isEmailValid");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // IS_REGISTRATION_SUCCESSFUL
          return IS_REGISTRATION_SUCCESSFUL;
        case 2: // IS_USERNAME_VALID
          return IS_USERNAME_VALID;
        case 3: // IS_PASSWORD_VALID
          return IS_PASSWORD_VALID;
        case 4: // IS_EMAIL_VALID
          return IS_EMAIL_VALID;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __ISREGISTRATIONSUCCESSFUL_ISSET_ID = 0;
  private static final int __ISUSERNAMEVALID_ISSET_ID = 1;
  private static final int __ISPASSWORDVALID_ISSET_ID = 2;
  private static final int __ISEMAILVALID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_REGISTRATION_SUCCESSFUL, new org.apache.thrift.meta_data.FieldMetaData("isRegistrationSuccessful", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_USERNAME_VALID, new org.apache.thrift.meta_data.FieldMetaData("isUsernameValid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_PASSWORD_VALID, new org.apache.thrift.meta_data.FieldMetaData("isPasswordValid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_EMAIL_VALID, new org.apache.thrift.meta_data.FieldMetaData("isEmailValid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(RegistrationResult.class, metaDataMap);
  }

  public RegistrationResult() {
  }

  public RegistrationResult(
    boolean isRegistrationSuccessful,
    boolean isUsernameValid,
    boolean isPasswordValid,
    boolean isEmailValid)
  {
    this();
    this.isRegistrationSuccessful = isRegistrationSuccessful;
    setIsRegistrationSuccessfulIsSet(true);
    this.isUsernameValid = isUsernameValid;
    setIsUsernameValidIsSet(true);
    this.isPasswordValid = isPasswordValid;
    setIsPasswordValidIsSet(true);
    this.isEmailValid = isEmailValid;
    setIsEmailValidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RegistrationResult(RegistrationResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isRegistrationSuccessful = other.isRegistrationSuccessful;
    this.isUsernameValid = other.isUsernameValid;
    this.isPasswordValid = other.isPasswordValid;
    this.isEmailValid = other.isEmailValid;
  }

  public RegistrationResult deepCopy() {
    return new RegistrationResult(this);
  }

  @Override
  public void clear() {
    setIsRegistrationSuccessfulIsSet(false);
    this.isRegistrationSuccessful = false;
    setIsUsernameValidIsSet(false);
    this.isUsernameValid = false;
    setIsPasswordValidIsSet(false);
    this.isPasswordValid = false;
    setIsEmailValidIsSet(false);
    this.isEmailValid = false;
  }

  public boolean isIsRegistrationSuccessful() {
    return this.isRegistrationSuccessful;
  }

  public RegistrationResult setIsRegistrationSuccessful(boolean isRegistrationSuccessful) {
    this.isRegistrationSuccessful = isRegistrationSuccessful;
    setIsRegistrationSuccessfulIsSet(true);
    return this;
  }

  public void unsetIsRegistrationSuccessful() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISREGISTRATIONSUCCESSFUL_ISSET_ID);
  }

  /** Returns true if field isRegistrationSuccessful is set (has been assigned a value) and false otherwise */
  public boolean isSetIsRegistrationSuccessful() {
    return EncodingUtils.testBit(__isset_bitfield, __ISREGISTRATIONSUCCESSFUL_ISSET_ID);
  }

  public void setIsRegistrationSuccessfulIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISREGISTRATIONSUCCESSFUL_ISSET_ID, value);
  }

  public boolean isIsUsernameValid() {
    return this.isUsernameValid;
  }

  public RegistrationResult setIsUsernameValid(boolean isUsernameValid) {
    this.isUsernameValid = isUsernameValid;
    setIsUsernameValidIsSet(true);
    return this;
  }

  public void unsetIsUsernameValid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISUSERNAMEVALID_ISSET_ID);
  }

  /** Returns true if field isUsernameValid is set (has been assigned a value) and false otherwise */
  public boolean isSetIsUsernameValid() {
    return EncodingUtils.testBit(__isset_bitfield, __ISUSERNAMEVALID_ISSET_ID);
  }

  public void setIsUsernameValidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISUSERNAMEVALID_ISSET_ID, value);
  }

  public boolean isIsPasswordValid() {
    return this.isPasswordValid;
  }

  public RegistrationResult setIsPasswordValid(boolean isPasswordValid) {
    this.isPasswordValid = isPasswordValid;
    setIsPasswordValidIsSet(true);
    return this;
  }

  public void unsetIsPasswordValid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISPASSWORDVALID_ISSET_ID);
  }

  /** Returns true if field isPasswordValid is set (has been assigned a value) and false otherwise */
  public boolean isSetIsPasswordValid() {
    return EncodingUtils.testBit(__isset_bitfield, __ISPASSWORDVALID_ISSET_ID);
  }

  public void setIsPasswordValidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISPASSWORDVALID_ISSET_ID, value);
  }

  public boolean isIsEmailValid() {
    return this.isEmailValid;
  }

  public RegistrationResult setIsEmailValid(boolean isEmailValid) {
    this.isEmailValid = isEmailValid;
    setIsEmailValidIsSet(true);
    return this;
  }

  public void unsetIsEmailValid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISEMAILVALID_ISSET_ID);
  }

  /** Returns true if field isEmailValid is set (has been assigned a value) and false otherwise */
  public boolean isSetIsEmailValid() {
    return EncodingUtils.testBit(__isset_bitfield, __ISEMAILVALID_ISSET_ID);
  }

  public void setIsEmailValidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISEMAILVALID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_REGISTRATION_SUCCESSFUL:
      if (value == null) {
        unsetIsRegistrationSuccessful();
      } else {
        setIsRegistrationSuccessful((Boolean)value);
      }
      break;

    case IS_USERNAME_VALID:
      if (value == null) {
        unsetIsUsernameValid();
      } else {
        setIsUsernameValid((Boolean)value);
      }
      break;

    case IS_PASSWORD_VALID:
      if (value == null) {
        unsetIsPasswordValid();
      } else {
        setIsPasswordValid((Boolean)value);
      }
      break;

    case IS_EMAIL_VALID:
      if (value == null) {
        unsetIsEmailValid();
      } else {
        setIsEmailValid((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_REGISTRATION_SUCCESSFUL:
      return isIsRegistrationSuccessful();

    case IS_USERNAME_VALID:
      return isIsUsernameValid();

    case IS_PASSWORD_VALID:
      return isIsPasswordValid();

    case IS_EMAIL_VALID:
      return isIsEmailValid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_REGISTRATION_SUCCESSFUL:
      return isSetIsRegistrationSuccessful();
    case IS_USERNAME_VALID:
      return isSetIsUsernameValid();
    case IS_PASSWORD_VALID:
      return isSetIsPasswordValid();
    case IS_EMAIL_VALID:
      return isSetIsEmailValid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof RegistrationResult)
      return this.equals((RegistrationResult)that);
    return false;
  }

  public boolean equals(RegistrationResult that) {
    if (that == null)
      return false;

    boolean this_present_isRegistrationSuccessful = true;
    boolean that_present_isRegistrationSuccessful = true;
    if (this_present_isRegistrationSuccessful || that_present_isRegistrationSuccessful) {
      if (!(this_present_isRegistrationSuccessful && that_present_isRegistrationSuccessful))
        return false;
      if (this.isRegistrationSuccessful != that.isRegistrationSuccessful)
        return false;
    }

    boolean this_present_isUsernameValid = true;
    boolean that_present_isUsernameValid = true;
    if (this_present_isUsernameValid || that_present_isUsernameValid) {
      if (!(this_present_isUsernameValid && that_present_isUsernameValid))
        return false;
      if (this.isUsernameValid != that.isUsernameValid)
        return false;
    }

    boolean this_present_isPasswordValid = true;
    boolean that_present_isPasswordValid = true;
    if (this_present_isPasswordValid || that_present_isPasswordValid) {
      if (!(this_present_isPasswordValid && that_present_isPasswordValid))
        return false;
      if (this.isPasswordValid != that.isPasswordValid)
        return false;
    }

    boolean this_present_isEmailValid = true;
    boolean that_present_isEmailValid = true;
    if (this_present_isEmailValid || that_present_isEmailValid) {
      if (!(this_present_isEmailValid && that_present_isEmailValid))
        return false;
      if (this.isEmailValid != that.isEmailValid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_isRegistrationSuccessful = true;
    list.add(present_isRegistrationSuccessful);
    if (present_isRegistrationSuccessful)
      list.add(isRegistrationSuccessful);

    boolean present_isUsernameValid = true;
    list.add(present_isUsernameValid);
    if (present_isUsernameValid)
      list.add(isUsernameValid);

    boolean present_isPasswordValid = true;
    list.add(present_isPasswordValid);
    if (present_isPasswordValid)
      list.add(isPasswordValid);

    boolean present_isEmailValid = true;
    list.add(present_isEmailValid);
    if (present_isEmailValid)
      list.add(isEmailValid);

    return list.hashCode();
  }

  @Override
  public int compareTo(RegistrationResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIsRegistrationSuccessful()).compareTo(other.isSetIsRegistrationSuccessful());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsRegistrationSuccessful()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isRegistrationSuccessful, other.isRegistrationSuccessful);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsUsernameValid()).compareTo(other.isSetIsUsernameValid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsUsernameValid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isUsernameValid, other.isUsernameValid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsPasswordValid()).compareTo(other.isSetIsPasswordValid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsPasswordValid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isPasswordValid, other.isPasswordValid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsEmailValid()).compareTo(other.isSetIsEmailValid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsEmailValid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isEmailValid, other.isEmailValid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("RegistrationResult(");
    boolean first = true;

    sb.append("isRegistrationSuccessful:");
    sb.append(this.isRegistrationSuccessful);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isUsernameValid:");
    sb.append(this.isUsernameValid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isPasswordValid:");
    sb.append(this.isPasswordValid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isEmailValid:");
    sb.append(this.isEmailValid);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class RegistrationResultStandardSchemeFactory implements SchemeFactory {
    public RegistrationResultStandardScheme getScheme() {
      return new RegistrationResultStandardScheme();
    }
  }

  private static class RegistrationResultStandardScheme extends StandardScheme<RegistrationResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, RegistrationResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_REGISTRATION_SUCCESSFUL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isRegistrationSuccessful = iprot.readBool();
              struct.setIsRegistrationSuccessfulIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_USERNAME_VALID
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isUsernameValid = iprot.readBool();
              struct.setIsUsernameValidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_PASSWORD_VALID
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isPasswordValid = iprot.readBool();
              struct.setIsPasswordValidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_EMAIL_VALID
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isEmailValid = iprot.readBool();
              struct.setIsEmailValidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, RegistrationResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_REGISTRATION_SUCCESSFUL_FIELD_DESC);
      oprot.writeBool(struct.isRegistrationSuccessful);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_USERNAME_VALID_FIELD_DESC);
      oprot.writeBool(struct.isUsernameValid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_PASSWORD_VALID_FIELD_DESC);
      oprot.writeBool(struct.isPasswordValid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_EMAIL_VALID_FIELD_DESC);
      oprot.writeBool(struct.isEmailValid);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class RegistrationResultTupleSchemeFactory implements SchemeFactory {
    public RegistrationResultTupleScheme getScheme() {
      return new RegistrationResultTupleScheme();
    }
  }

  private static class RegistrationResultTupleScheme extends TupleScheme<RegistrationResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, RegistrationResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIsRegistrationSuccessful()) {
        optionals.set(0);
      }
      if (struct.isSetIsUsernameValid()) {
        optionals.set(1);
      }
      if (struct.isSetIsPasswordValid()) {
        optionals.set(2);
      }
      if (struct.isSetIsEmailValid()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIsRegistrationSuccessful()) {
        oprot.writeBool(struct.isRegistrationSuccessful);
      }
      if (struct.isSetIsUsernameValid()) {
        oprot.writeBool(struct.isUsernameValid);
      }
      if (struct.isSetIsPasswordValid()) {
        oprot.writeBool(struct.isPasswordValid);
      }
      if (struct.isSetIsEmailValid()) {
        oprot.writeBool(struct.isEmailValid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, RegistrationResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.isRegistrationSuccessful = iprot.readBool();
        struct.setIsRegistrationSuccessfulIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isUsernameValid = iprot.readBool();
        struct.setIsUsernameValidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isPasswordValid = iprot.readBool();
        struct.setIsPasswordValidIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isEmailValid = iprot.readBool();
        struct.setIsEmailValidIsSet(true);
      }
    }
  }

}

