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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-01-24")
public class CommentResult implements org.apache.thrift.TBase<CommentResult, CommentResult._Fields>, java.io.Serializable, Cloneable, Comparable<CommentResult>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CommentResult");

  private static final org.apache.thrift.protocol.TField IS_SUCCESSFUL_FIELD_DESC = new org.apache.thrift.protocol.TField("isSuccessful", org.apache.thrift.protocol.TType.BOOL, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CommentResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CommentResultTupleSchemeFactory());
  }

  public boolean isSuccessful; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeInt(isSuccessful ? 1 : 0);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public CommentResult(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.isSuccessful = (in.readInt()==1);
  }

  public static final android.os.Parcelable.Creator<CommentResult> CREATOR = new android.os.Parcelable.Creator<CommentResult>() {
    @Override
    public CommentResult[] newArray(int size) {
      return new CommentResult[size];
    }

    @Override
    public CommentResult createFromParcel(android.os.Parcel in) {
      return new CommentResult(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    IS_SUCCESSFUL((short)1, "isSuccessful");

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
        case 1: // IS_SUCCESSFUL
          return IS_SUCCESSFUL;
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
  private static final int __ISSUCCESSFUL_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.IS_SUCCESSFUL, new org.apache.thrift.meta_data.FieldMetaData("isSuccessful", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CommentResult.class, metaDataMap);
  }

  public CommentResult() {
  }

  public CommentResult(
    boolean isSuccessful)
  {
    this();
    this.isSuccessful = isSuccessful;
    setIsSuccessfulIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CommentResult(CommentResult other) {
    __isset_bitfield = other.__isset_bitfield;
    this.isSuccessful = other.isSuccessful;
  }

  public CommentResult deepCopy() {
    return new CommentResult(this);
  }

  @Override
  public void clear() {
    setIsSuccessfulIsSet(false);
    this.isSuccessful = false;
  }

  public boolean isIsSuccessful() {
    return this.isSuccessful;
  }

  public CommentResult setIsSuccessful(boolean isSuccessful) {
    this.isSuccessful = isSuccessful;
    setIsSuccessfulIsSet(true);
    return this;
  }

  public void unsetIsSuccessful() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ISSUCCESSFUL_ISSET_ID);
  }

  /** Returns true if field isSuccessful is set (has been assigned a value) and false otherwise */
  public boolean isSetIsSuccessful() {
    return EncodingUtils.testBit(__isset_bitfield, __ISSUCCESSFUL_ISSET_ID);
  }

  public void setIsSuccessfulIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ISSUCCESSFUL_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case IS_SUCCESSFUL:
      if (value == null) {
        unsetIsSuccessful();
      } else {
        setIsSuccessful((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case IS_SUCCESSFUL:
      return isIsSuccessful();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case IS_SUCCESSFUL:
      return isSetIsSuccessful();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CommentResult)
      return this.equals((CommentResult)that);
    return false;
  }

  public boolean equals(CommentResult that) {
    if (that == null)
      return false;

    boolean this_present_isSuccessful = true;
    boolean that_present_isSuccessful = true;
    if (this_present_isSuccessful || that_present_isSuccessful) {
      if (!(this_present_isSuccessful && that_present_isSuccessful))
        return false;
      if (this.isSuccessful != that.isSuccessful)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_isSuccessful = true;
    list.add(present_isSuccessful);
    if (present_isSuccessful)
      list.add(isSuccessful);

    return list.hashCode();
  }

  @Override
  public int compareTo(CommentResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIsSuccessful()).compareTo(other.isSetIsSuccessful());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIsSuccessful()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.isSuccessful, other.isSuccessful);
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
    StringBuilder sb = new StringBuilder("CommentResult(");
    boolean first = true;

    sb.append("isSuccessful:");
    sb.append(this.isSuccessful);
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

  private static class CommentResultStandardSchemeFactory implements SchemeFactory {
    public CommentResultStandardScheme getScheme() {
      return new CommentResultStandardScheme();
    }
  }

  private static class CommentResultStandardScheme extends StandardScheme<CommentResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CommentResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // IS_SUCCESSFUL
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.isSuccessful = iprot.readBool();
              struct.setIsSuccessfulIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CommentResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(IS_SUCCESSFUL_FIELD_DESC);
      oprot.writeBool(struct.isSuccessful);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CommentResultTupleSchemeFactory implements SchemeFactory {
    public CommentResultTupleScheme getScheme() {
      return new CommentResultTupleScheme();
    }
  }

  private static class CommentResultTupleScheme extends TupleScheme<CommentResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CommentResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIsSuccessful()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetIsSuccessful()) {
        oprot.writeBool(struct.isSuccessful);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CommentResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.isSuccessful = iprot.readBool();
        struct.setIsSuccessfulIsSet(true);
      }
    }
  }

}

