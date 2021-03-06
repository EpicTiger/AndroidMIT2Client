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
public class PasswordChangeResult implements org.apache.thrift.TBase<PasswordChangeResult, PasswordChangeResult._Fields>, java.io.Serializable, Cloneable, Comparable<PasswordChangeResult>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PasswordChangeResult");

  private static final org.apache.thrift.protocol.TField IS_PASSWORD_CHANGE_SUCCESSFUL_FIELD_DESC = new org.apache.thrift.protocol.TField("isPasswordChangeSuccessful", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField IS_EMAIL_VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("isEmailValid", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField IS_OLD_PASSWORD_VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("isOldPasswordValid", org.apache.thrift.protocol.TType.BOOL, (short)3);
  private static final org.apache.thrift.protocol.TField IS_NEW_PASSWORD_VALID_FIELD_DESC = new org.apache.thrift.protocol.TField("isNewPasswordValid", org.apache.thrift.protocol.TType.BOOL, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PasswordChangeResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PasswordChangeResultTupleSchemeFactory());
  }

  public boolean isPasswordChangeSuccessful; // required
  public boolean isEmailValid; // required
  public boolean isOldPasswordValid; // required
  public boolean isNewPasswordValid; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeInt(isPasswordChangeSuccessful ? 1 : 0);
    out.writeInt(isEmailValid ? 1 : 0);
    out.writeInt(isOldPasswordValid ? 1 : 0);
    out.writeInt(isNewPasswordValid ? 1 : 0);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public PasswordChangeResult(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.isPasswordChangeSuccessful = (in.readInt()==1);
    this.isEmailValid = (in.readInt()==1);
    this.isOldPasswordValid = (in.readInt()==1);
    this.isNewPasswordValid = (in.readInt()==1);
  }

  public static final android.os.Parcelable.Creator<PasswordChangeResult> CREATOR = new android.os.Parcelable.Creator<PasswordChangeResult>() {
    @Override
    public PasswordChangeResult[] newArray(int size) {
      return new PasswordChangeResult[size];
    }

    @Override
    public PasswordChangeResult createFromParcel(android.os.Parcel in) {
      return new PasswordChangeResult(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_PASSWORD_CHANGE_SUCCESSFUL((short)1, "isPasswordChangeSuccessful"),
    IS_EMAIL_VALID((short)2, "isEmailValid"),
    IS_OLD_PASSWORD_VALID((short)3, "isOldPasswordValid"),
    IS_NEW_PASSWORD_VALID((short)4, "isNewPasswordValid");

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
        case 1: // IS_PASSWORD_CHANGE_SUCCESSFUL
          return IS_PASSWORD_CHANGE_SUCCESSFUL;
        case 2: // IS_EMAIL_VALID
          return IS_EMAIL_VALID;
        case 3: // IS_OLD_PASSWORD_VALID
          return IS_OLD_PASSWORD_VALID;
        case 4: // IS_NEW_PASSWORD_VALID
          return IS_NEW_PASSWORD_VALID;
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
  private static final int __ISPASSWORDCHANGESUCCESSFUL_ISSET_ID = 0;
  private static final int __ISEMAILVALID_ISSET_ID = 1;
  private static final int __ISOLDPASSWORDVALID_ISSET_ID = 2;
  private static final int __ISNEWPASSWORDVALID_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_PASSWORD_CHANGE_SUCCESSFUL, new org.apache.thrift.meta_data.FieldMetaData("isPasswordChangeSuccessful", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_EMAIL_VALID, new org.apache.thrift.meta_data.FieldMetaData("isEmailValid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_OLD_PASSWORD_VALID, new org.apache.thrift.meta_data.FieldMetaData("isOldPasswordValid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.IS_NEW_PASSWORD_VALID, new org.apache.thrift.meta_data.FieldMetaData("isNewPasswordValid", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PasswordChangeResult.class, metaDataMap);
  }

  public PasswordChangeResult() {
  }

  public PasswordChangeResult(
    boolean isPasswordChangeSuccessful,
    boolean isEmailValid,
    boolean isOldPasswordValid,
    boolean isNewPasswordValid)
  {
    this();
    this.isPasswordChangeSuccessful = isPasswordChangeSuccessful;
    setIsPasswordChangeSuccessfulIsSet(true);
    this.isEmailValid = isEmailValid;
    setIsEmailValidIsSet(true);
    this.isOldPasswordValid = isOldPasswordValid;
    setIsOldPasswordValidIsSet(true);
    this.isNewPasswordValid = isNewPasswordValid;
    setIsNewPasswordValidIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PasswordChangeResult(PasswordChangeResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isPasswordChangeSuccessful = other.isPasswordChangeSuccessful;
    this.isEmailValid = other.isEmailValid;
    this.isOldPasswordValid = other.isOldPasswordValid;
    this.isNewPasswordValid = other.isNewPasswordValid;
  }

  public PasswordChangeResult deepCopy() {
    return new PasswordChangeResult(this);
  }

  @Override
  public void clear() {
    setIsPasswordChangeSuccessfulIsSet(false);
    this.isPasswordChangeSuccessful = false;
    setIsEmailValidIsSet(false);
    this.isEmailValid = false;
    setIsOldPasswordValidIsSet(false);
    this.isOldPasswordValid = false;
    setIsNewPasswordValidIsSet(false);
    this.isNewPasswordValid = false;
  }

  public boolean isIsPasswordChangeSuccessful() {
    return this.isPasswordChangeSuccessful;
  }

  public PasswordChangeResult setIsPasswordChangeSuccessful(boolean isPasswordChangeSuccessful) {
    this.isPasswordChangeSuccessful = isPasswordChangeSuccessful;
    setIsPasswordChangeSuccessfulIsSet(true);
    return this;
  }

  public void unsetIsPasswordChangeSuccessful() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISPASSWORDCHANGESUCCESSFUL_ISSET_ID);
  }

  /** Returns true if field isPasswordChangeSuccessful is set (has been assigned a value) and false otherwise */
  public boolean isSetIsPasswordChangeSuccessful() {
    return EncodingUtils.testBit(__isset_bitfield, __ISPASSWORDCHANGESUCCESSFUL_ISSET_ID);
  }

  public void setIsPasswordChangeSuccessfulIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISPASSWORDCHANGESUCCESSFUL_ISSET_ID, value);
  }

  public boolean isIsEmailValid() {
    return this.isEmailValid;
  }

  public PasswordChangeResult setIsEmailValid(boolean isEmailValid) {
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

  public boolean isIsOldPasswordValid() {
    return this.isOldPasswordValid;
  }

  public PasswordChangeResult setIsOldPasswordValid(boolean isOldPasswordValid) {
    this.isOldPasswordValid = isOldPasswordValid;
    setIsOldPasswordValidIsSet(true);
    return this;
  }

  public void unsetIsOldPasswordValid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISOLDPASSWORDVALID_ISSET_ID);
  }

  /** Returns true if field isOldPasswordValid is set (has been assigned a value) and false otherwise */
  public boolean isSetIsOldPasswordValid() {
    return EncodingUtils.testBit(__isset_bitfield, __ISOLDPASSWORDVALID_ISSET_ID);
  }

  public void setIsOldPasswordValidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISOLDPASSWORDVALID_ISSET_ID, value);
  }

  public boolean isIsNewPasswordValid() {
    return this.isNewPasswordValid;
  }

  public PasswordChangeResult setIsNewPasswordValid(boolean isNewPasswordValid) {
    this.isNewPasswordValid = isNewPasswordValid;
    setIsNewPasswordValidIsSet(true);
    return this;
  }

  public void unsetIsNewPasswordValid() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISNEWPASSWORDVALID_ISSET_ID);
  }

  /** Returns true if field isNewPasswordValid is set (has been assigned a value) and false otherwise */
  public boolean isSetIsNewPasswordValid() {
    return EncodingUtils.testBit(__isset_bitfield, __ISNEWPASSWORDVALID_ISSET_ID);
  }

  public void setIsNewPasswordValidIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISNEWPASSWORDVALID_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_PASSWORD_CHANGE_SUCCESSFUL:
      if (value == null) {
        unsetIsPasswordChangeSuccessful();
      } else {
        setIsPasswordChangeSuccessful((Boolean)value);
      }
      break;

    case IS_EMAIL_VALID:
      if (value == null) {
        unsetIsEmailValid();
      } else {
        setIsEmailValid((Boolean)value);
      }
      break;

    case IS_OLD_PASSWORD_VALID:
      if (value == null) {
        unsetIsOldPasswordValid();
      } else {
        setIsOldPasswordValid((Boolean)value);
      }
      break;

    case IS_NEW_PASSWORD_VALID:
      if (value == null) {
        unsetIsNewPasswordValid();
      } else {
        setIsNewPasswordValid((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_PASSWORD_CHANGE_SUCCESSFUL:
      return isIsPasswordChangeSuccessful();

    case IS_EMAIL_VALID:
      return isIsEmailValid();

    case IS_OLD_PASSWORD_VALID:
      return isIsOldPasswordValid();

    case IS_NEW_PASSWORD_VALID:
      return isIsNewPasswordValid();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_PASSWORD_CHANGE_SUCCESSFUL:
      return isSetIsPasswordChangeSuccessful();
    case IS_EMAIL_VALID:
      return isSetIsEmailValid();
    case IS_OLD_PASSWORD_VALID:
      return isSetIsOldPasswordValid();
    case IS_NEW_PASSWORD_VALID:
      return isSetIsNewPasswordValid();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PasswordChangeResult)
      return this.equals((PasswordChangeResult)that);
    return false;
  }

  public boolean equals(PasswordChangeResult that) {
    if (that == null)
      return false;

    boolean this_present_isPasswordChangeSuccessful = true;
    boolean that_present_isPasswordChangeSuccessful = true;
    if (this_present_isPasswordChangeSuccessful || that_present_isPasswordChangeSuccessful) {
      if (!(this_present_isPasswordChangeSuccessful && that_present_isPasswordChangeSuccessful))
        return false;
      if (this.isPasswordChangeSuccessful != that.isPasswordChangeSuccessful)
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

    boolean this_present_isOldPasswordValid = true;
    boolean that_present_isOldPasswordValid = true;
    if (this_present_isOldPasswordValid || that_present_isOldPasswordValid) {
      if (!(this_present_isOldPasswordValid && that_present_isOldPasswordValid))
        return false;
      if (this.isOldPasswordValid != that.isOldPasswordValid)
        return false;
    }

    boolean this_present_isNewPasswordValid = true;
    boolean that_present_isNewPasswordValid = true;
    if (this_present_isNewPasswordValid || that_present_isNewPasswordValid) {
      if (!(this_present_isNewPasswordValid && that_present_isNewPasswordValid))
        return false;
      if (this.isNewPasswordValid != that.isNewPasswordValid)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_isPasswordChangeSuccessful = true;
    list.add(present_isPasswordChangeSuccessful);
    if (present_isPasswordChangeSuccessful)
      list.add(isPasswordChangeSuccessful);

    boolean present_isEmailValid = true;
    list.add(present_isEmailValid);
    if (present_isEmailValid)
      list.add(isEmailValid);

    boolean present_isOldPasswordValid = true;
    list.add(present_isOldPasswordValid);
    if (present_isOldPasswordValid)
      list.add(isOldPasswordValid);

    boolean present_isNewPasswordValid = true;
    list.add(present_isNewPasswordValid);
    if (present_isNewPasswordValid)
      list.add(isNewPasswordValid);

    return list.hashCode();
  }

  @Override
  public int compareTo(PasswordChangeResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIsPasswordChangeSuccessful()).compareTo(other.isSetIsPasswordChangeSuccessful());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsPasswordChangeSuccessful()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isPasswordChangeSuccessful, other.isPasswordChangeSuccessful);
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
    lastComparison = Boolean.valueOf(isSetIsOldPasswordValid()).compareTo(other.isSetIsOldPasswordValid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsOldPasswordValid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isOldPasswordValid, other.isOldPasswordValid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetIsNewPasswordValid()).compareTo(other.isSetIsNewPasswordValid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsNewPasswordValid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isNewPasswordValid, other.isNewPasswordValid);
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
    StringBuilder sb = new StringBuilder("PasswordChangeResult(");
    boolean first = true;

    sb.append("isPasswordChangeSuccessful:");
    sb.append(this.isPasswordChangeSuccessful);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isEmailValid:");
    sb.append(this.isEmailValid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isOldPasswordValid:");
    sb.append(this.isOldPasswordValid);
    first = false;
    if (!first) sb.append(", ");
    sb.append("isNewPasswordValid:");
    sb.append(this.isNewPasswordValid);
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

  private static class PasswordChangeResultStandardSchemeFactory implements SchemeFactory {
    public PasswordChangeResultStandardScheme getScheme() {
      return new PasswordChangeResultStandardScheme();
    }
  }

  private static class PasswordChangeResultStandardScheme extends StandardScheme<PasswordChangeResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PasswordChangeResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_PASSWORD_CHANGE_SUCCESSFUL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isPasswordChangeSuccessful = iprot.readBool();
              struct.setIsPasswordChangeSuccessfulIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // IS_EMAIL_VALID
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isEmailValid = iprot.readBool();
              struct.setIsEmailValidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // IS_OLD_PASSWORD_VALID
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isOldPasswordValid = iprot.readBool();
              struct.setIsOldPasswordValidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // IS_NEW_PASSWORD_VALID
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isNewPasswordValid = iprot.readBool();
              struct.setIsNewPasswordValidIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PasswordChangeResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_PASSWORD_CHANGE_SUCCESSFUL_FIELD_DESC);
      oprot.writeBool(struct.isPasswordChangeSuccessful);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_EMAIL_VALID_FIELD_DESC);
      oprot.writeBool(struct.isEmailValid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_OLD_PASSWORD_VALID_FIELD_DESC);
      oprot.writeBool(struct.isOldPasswordValid);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(IS_NEW_PASSWORD_VALID_FIELD_DESC);
      oprot.writeBool(struct.isNewPasswordValid);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PasswordChangeResultTupleSchemeFactory implements SchemeFactory {
    public PasswordChangeResultTupleScheme getScheme() {
      return new PasswordChangeResultTupleScheme();
    }
  }

  private static class PasswordChangeResultTupleScheme extends TupleScheme<PasswordChangeResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PasswordChangeResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIsPasswordChangeSuccessful()) {
        optionals.set(0);
      }
      if (struct.isSetIsEmailValid()) {
        optionals.set(1);
      }
      if (struct.isSetIsOldPasswordValid()) {
        optionals.set(2);
      }
      if (struct.isSetIsNewPasswordValid()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIsPasswordChangeSuccessful()) {
        oprot.writeBool(struct.isPasswordChangeSuccessful);
      }
      if (struct.isSetIsEmailValid()) {
        oprot.writeBool(struct.isEmailValid);
      }
      if (struct.isSetIsOldPasswordValid()) {
        oprot.writeBool(struct.isOldPasswordValid);
      }
      if (struct.isSetIsNewPasswordValid()) {
        oprot.writeBool(struct.isNewPasswordValid);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PasswordChangeResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.isPasswordChangeSuccessful = iprot.readBool();
        struct.setIsPasswordChangeSuccessfulIsSet(true);
      }
      if (incoming.get(1)) {
        struct.isEmailValid = iprot.readBool();
        struct.setIsEmailValidIsSet(true);
      }
      if (incoming.get(2)) {
        struct.isOldPasswordValid = iprot.readBool();
        struct.setIsOldPasswordValidIsSet(true);
      }
      if (incoming.get(3)) {
        struct.isNewPasswordValid = iprot.readBool();
        struct.setIsNewPasswordValidIsSet(true);
      }
    }
  }

}

