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
public class PasswordChangeData implements org.apache.thrift.TBase<PasswordChangeData, PasswordChangeData._Fields>, java.io.Serializable, Cloneable, Comparable<PasswordChangeData>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("PasswordChangeData");

  private static final org.apache.thrift.protocol.TField EMAIL_FIELD_DESC = new org.apache.thrift.protocol.TField("email", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField OLD_PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("oldPassword", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField NEW_PASSWORD_FIELD_DESC = new org.apache.thrift.protocol.TField("newPassword", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PasswordChangeDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PasswordChangeDataTupleSchemeFactory());
  }

  public String email; // required
  public String oldPassword; // required
  public String newPassword; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    out.writeString(email);
    out.writeString(oldPassword);
    out.writeString(newPassword);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public PasswordChangeData(android.os.Parcel in) {
    this.email= in.readString();
    this.oldPassword= in.readString();
    this.newPassword= in.readString();
  }

  public static final android.os.Parcelable.Creator<PasswordChangeData> CREATOR = new android.os.Parcelable.Creator<PasswordChangeData>() {
    @Override
    public PasswordChangeData[] newArray(int size) {
      return new PasswordChangeData[size];
    }

    @Override
    public PasswordChangeData createFromParcel(android.os.Parcel in) {
      return new PasswordChangeData(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    EMAIL((short)1, "email"),
    OLD_PASSWORD((short)2, "oldPassword"),
    NEW_PASSWORD((short)3, "newPassword");

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
        case 1: // EMAIL
          return EMAIL;
        case 2: // OLD_PASSWORD
          return OLD_PASSWORD;
        case 3: // NEW_PASSWORD
          return NEW_PASSWORD;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.EMAIL, new org.apache.thrift.meta_data.FieldMetaData("email", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.OLD_PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("oldPassword", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.NEW_PASSWORD, new org.apache.thrift.meta_data.FieldMetaData("newPassword", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(PasswordChangeData.class, metaDataMap);
  }

  public PasswordChangeData() {
  }

  public PasswordChangeData(
    String email,
    String oldPassword,
    String newPassword)
  {
    this();
    this.email = email;
    this.oldPassword = oldPassword;
    this.newPassword = newPassword;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public PasswordChangeData(PasswordChangeData other) {
    if (other.isSetEmail()) {
      this.email = other.email;
    }
    if (other.isSetOldPassword()) {
      this.oldPassword = other.oldPassword;
    }
    if (other.isSetNewPassword()) {
      this.newPassword = other.newPassword;
    }
  }

  public PasswordChangeData deepCopy() {
    return new PasswordChangeData(this);
  }

  @Override
  public void clear() {
    this.email = null;
    this.oldPassword = null;
    this.newPassword = null;
  }

  public String getEmail() {
    return this.email;
  }

  public PasswordChangeData setEmail(String email) {
    this.email = email;
    return this;
  }

  public void unsetEmail() {
    this.email = null;
  }

  /** Returns true if field email is set (has been assigned a value) and false otherwise */
  public boolean isSetEmail() {
    return this.email != null;
  }

  public void setEmailIsSet(boolean value) {
    if (!value) {
      this.email = null;
    }
  }

  public String getOldPassword() {
    return this.oldPassword;
  }

  public PasswordChangeData setOldPassword(String oldPassword) {
    this.oldPassword = oldPassword;
    return this;
  }

  public void unsetOldPassword() {
    this.oldPassword = null;
  }

  /** Returns true if field oldPassword is set (has been assigned a value) and false otherwise */
  public boolean isSetOldPassword() {
    return this.oldPassword != null;
  }

  public void setOldPasswordIsSet(boolean value) {
    if (!value) {
      this.oldPassword = null;
    }
  }

  public String getNewPassword() {
    return this.newPassword;
  }

  public PasswordChangeData setNewPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  public void unsetNewPassword() {
    this.newPassword = null;
  }

  /** Returns true if field newPassword is set (has been assigned a value) and false otherwise */
  public boolean isSetNewPassword() {
    return this.newPassword != null;
  }

  public void setNewPasswordIsSet(boolean value) {
    if (!value) {
      this.newPassword = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case EMAIL:
      if (value == null) {
        unsetEmail();
      } else {
        setEmail((String)value);
      }
      break;

    case OLD_PASSWORD:
      if (value == null) {
        unsetOldPassword();
      } else {
        setOldPassword((String)value);
      }
      break;

    case NEW_PASSWORD:
      if (value == null) {
        unsetNewPassword();
      } else {
        setNewPassword((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case EMAIL:
      return getEmail();

    case OLD_PASSWORD:
      return getOldPassword();

    case NEW_PASSWORD:
      return getNewPassword();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case EMAIL:
      return isSetEmail();
    case OLD_PASSWORD:
      return isSetOldPassword();
    case NEW_PASSWORD:
      return isSetNewPassword();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof PasswordChangeData)
      return this.equals((PasswordChangeData)that);
    return false;
  }

  public boolean equals(PasswordChangeData that) {
    if (that == null)
      return false;

    boolean this_present_email = true && this.isSetEmail();
    boolean that_present_email = true && that.isSetEmail();
    if (this_present_email || that_present_email) {
      if (!(this_present_email && that_present_email))
        return false;
      if (!this.email.equals(that.email))
        return false;
    }

    boolean this_present_oldPassword = true && this.isSetOldPassword();
    boolean that_present_oldPassword = true && that.isSetOldPassword();
    if (this_present_oldPassword || that_present_oldPassword) {
      if (!(this_present_oldPassword && that_present_oldPassword))
        return false;
      if (!this.oldPassword.equals(that.oldPassword))
        return false;
    }

    boolean this_present_newPassword = true && this.isSetNewPassword();
    boolean that_present_newPassword = true && that.isSetNewPassword();
    if (this_present_newPassword || that_present_newPassword) {
      if (!(this_present_newPassword && that_present_newPassword))
        return false;
      if (!this.newPassword.equals(that.newPassword))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_email = true && (isSetEmail());
    list.add(present_email);
    if (present_email)
      list.add(email);

    boolean present_oldPassword = true && (isSetOldPassword());
    list.add(present_oldPassword);
    if (present_oldPassword)
      list.add(oldPassword);

    boolean present_newPassword = true && (isSetNewPassword());
    list.add(present_newPassword);
    if (present_newPassword)
      list.add(newPassword);

    return list.hashCode();
  }

  @Override
  public int compareTo(PasswordChangeData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEmail()).compareTo(other.isSetEmail());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmail()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.email, other.email);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOldPassword()).compareTo(other.isSetOldPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOldPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.oldPassword, other.oldPassword);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetNewPassword()).compareTo(other.isSetNewPassword());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNewPassword()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.newPassword, other.newPassword);
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
    StringBuilder sb = new StringBuilder("PasswordChangeData(");
    boolean first = true;

    sb.append("email:");
    if (this.email == null) {
      sb.append("null");
    } else {
      sb.append(this.email);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("oldPassword:");
    if (this.oldPassword == null) {
      sb.append("null");
    } else {
      sb.append(this.oldPassword);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("newPassword:");
    if (this.newPassword == null) {
      sb.append("null");
    } else {
      sb.append(this.newPassword);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PasswordChangeDataStandardSchemeFactory implements SchemeFactory {
    public PasswordChangeDataStandardScheme getScheme() {
      return new PasswordChangeDataStandardScheme();
    }
  }

  private static class PasswordChangeDataStandardScheme extends StandardScheme<PasswordChangeData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, PasswordChangeData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // EMAIL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.email = iprot.readString();
              struct.setEmailIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OLD_PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.oldPassword = iprot.readString();
              struct.setOldPasswordIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NEW_PASSWORD
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.newPassword = iprot.readString();
              struct.setNewPasswordIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, PasswordChangeData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.email != null) {
        oprot.writeFieldBegin(EMAIL_FIELD_DESC);
        oprot.writeString(struct.email);
        oprot.writeFieldEnd();
      }
      if (struct.oldPassword != null) {
        oprot.writeFieldBegin(OLD_PASSWORD_FIELD_DESC);
        oprot.writeString(struct.oldPassword);
        oprot.writeFieldEnd();
      }
      if (struct.newPassword != null) {
        oprot.writeFieldBegin(NEW_PASSWORD_FIELD_DESC);
        oprot.writeString(struct.newPassword);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PasswordChangeDataTupleSchemeFactory implements SchemeFactory {
    public PasswordChangeDataTupleScheme getScheme() {
      return new PasswordChangeDataTupleScheme();
    }
  }

  private static class PasswordChangeDataTupleScheme extends TupleScheme<PasswordChangeData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, PasswordChangeData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEmail()) {
        optionals.set(0);
      }
      if (struct.isSetOldPassword()) {
        optionals.set(1);
      }
      if (struct.isSetNewPassword()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEmail()) {
        oprot.writeString(struct.email);
      }
      if (struct.isSetOldPassword()) {
        oprot.writeString(struct.oldPassword);
      }
      if (struct.isSetNewPassword()) {
        oprot.writeString(struct.newPassword);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, PasswordChangeData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.email = iprot.readString();
        struct.setEmailIsSet(true);
      }
      if (incoming.get(1)) {
        struct.oldPassword = iprot.readString();
        struct.setOldPasswordIsSet(true);
      }
      if (incoming.get(2)) {
        struct.newPassword = iprot.readString();
        struct.setNewPasswordIsSet(true);
      }
    }
  }

}

