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
public class CreateContentData implements org.apache.thrift.TBase<CreateContentData, CreateContentData._Fields>, java.io.Serializable, Cloneable, Comparable<CreateContentData>, android.os.Parcelable {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("CreateContentData");

  private static final org.apache.thrift.protocol.TField USER_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("userID", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField POST_TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("postTitle", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField POST_TEXT_FIELD_DESC = new org.apache.thrift.protocol.TField("postText", org.apache.thrift.protocol.TType.STRING, (short)3);
  private static final org.apache.thrift.protocol.TField EMAIL_ADDRESS_FIELD_DESC = new org.apache.thrift.protocol.TField("emailAddress", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField POST_IMAGE_FIELD_DESC = new org.apache.thrift.protocol.TField("postImage", org.apache.thrift.protocol.TType.STRING, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new CreateContentDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new CreateContentDataTupleSchemeFactory());
  }

  public long userID; // required
  public String postTitle; // required
  public String postText; // required
  public String emailAddress; // required
  public String postImage; // required

  @Override
  public void writeToParcel(android.os.Parcel out, int flags) {
    //primitive bitfield of type: byte
    out.writeByte(__isset_bitfield);

    out.writeLong(userID);
    out.writeString(postTitle);
    out.writeString(postText);
    out.writeString(emailAddress);
    out.writeString(postImage);
  }

  @Override
  public int describeContents() {
    return 0;
  }

  public CreateContentData(android.os.Parcel in) {
    //primitive bitfield of type: byte
    __isset_bitfield = in.readByte();

    this.userID = in.readLong();
    this.postTitle= in.readString();
    this.postText= in.readString();
    this.emailAddress= in.readString();
    this.postImage= in.readString();
  }

  public static final android.os.Parcelable.Creator<CreateContentData> CREATOR = new android.os.Parcelable.Creator<CreateContentData>() {
    @Override
    public CreateContentData[] newArray(int size) {
      return new CreateContentData[size];
    }

    @Override
    public CreateContentData createFromParcel(android.os.Parcel in) {
      return new CreateContentData(in);
    }
  };

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    USER_ID((short)1, "userID"),
    POST_TITLE((short)2, "postTitle"),
    POST_TEXT((short)3, "postText"),
    EMAIL_ADDRESS((short)4, "emailAddress"),
    POST_IMAGE((short)5, "postImage");

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
        case 1: // USER_ID
          return USER_ID;
        case 2: // POST_TITLE
          return POST_TITLE;
        case 3: // POST_TEXT
          return POST_TEXT;
        case 4: // EMAIL_ADDRESS
          return EMAIL_ADDRESS;
        case 5: // POST_IMAGE
          return POST_IMAGE;
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
  private static final int __USERID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.USER_ID, new org.apache.thrift.meta_data.FieldMetaData("userID", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "long")));
    tmpMap.put(_Fields.POST_TITLE, new org.apache.thrift.meta_data.FieldMetaData("postTitle", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POST_TEXT, new org.apache.thrift.meta_data.FieldMetaData("postText", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.EMAIL_ADDRESS, new org.apache.thrift.meta_data.FieldMetaData("emailAddress", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.POST_IMAGE, new org.apache.thrift.meta_data.FieldMetaData("postImage", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(CreateContentData.class, metaDataMap);
  }

  public CreateContentData() {
  }

  public CreateContentData(
    long userID,
    String postTitle,
    String postText,
    String emailAddress,
    String postImage)
  {
    this();
    this.userID = userID;
    setUserIDIsSet(true);
    this.postTitle = postTitle;
    this.postText = postText;
    this.emailAddress = emailAddress;
    this.postImage = postImage;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public CreateContentData(CreateContentData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.userID = other.userID;
    if (other.isSetPostTitle()) {
      this.postTitle = other.postTitle;
    }
    if (other.isSetPostText()) {
      this.postText = other.postText;
    }
    if (other.isSetEmailAddress()) {
      this.emailAddress = other.emailAddress;
    }
    if (other.isSetPostImage()) {
      this.postImage = other.postImage;
    }
  }

  public CreateContentData deepCopy() {
    return new CreateContentData(this);
  }

  @Override
  public void clear() {
    setUserIDIsSet(false);
    this.userID = 0;
    this.postTitle = null;
    this.postText = null;
    this.emailAddress = null;
    this.postImage = null;
  }

  public long getUserID() {
    return this.userID;
  }

  public CreateContentData setUserID(long userID) {
    this.userID = userID;
    setUserIDIsSet(true);
    return this;
  }

  public void unsetUserID() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  /** Returns true if field userID is set (has been assigned a value) and false otherwise */
  public boolean isSetUserID() {
    return EncodingUtils.testBit(__isset_bitfield, __USERID_ISSET_ID);
  }

  public void setUserIDIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __USERID_ISSET_ID, value);
  }

  public String getPostTitle() {
    return this.postTitle;
  }

  public CreateContentData setPostTitle(String postTitle) {
    this.postTitle = postTitle;
    return this;
  }

  public void unsetPostTitle() {
    this.postTitle = null;
  }

  /** Returns true if field postTitle is set (has been assigned a value) and false otherwise */
  public boolean isSetPostTitle() {
    return this.postTitle != null;
  }

  public void setPostTitleIsSet(boolean value) {
    if (!value) {
      this.postTitle = null;
    }
  }

  public String getPostText() {
    return this.postText;
  }

  public CreateContentData setPostText(String postText) {
    this.postText = postText;
    return this;
  }

  public void unsetPostText() {
    this.postText = null;
  }

  /** Returns true if field postText is set (has been assigned a value) and false otherwise */
  public boolean isSetPostText() {
    return this.postText != null;
  }

  public void setPostTextIsSet(boolean value) {
    if (!value) {
      this.postText = null;
    }
  }

  public String getEmailAddress() {
    return this.emailAddress;
  }

  public CreateContentData setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  public void unsetEmailAddress() {
    this.emailAddress = null;
  }

  /** Returns true if field emailAddress is set (has been assigned a value) and false otherwise */
  public boolean isSetEmailAddress() {
    return this.emailAddress != null;
  }

  public void setEmailAddressIsSet(boolean value) {
    if (!value) {
      this.emailAddress = null;
    }
  }

  public String getPostImage() {
    return this.postImage;
  }

  public CreateContentData setPostImage(String postImage) {
    this.postImage = postImage;
    return this;
  }

  public void unsetPostImage() {
    this.postImage = null;
  }

  /** Returns true if field postImage is set (has been assigned a value) and false otherwise */
  public boolean isSetPostImage() {
    return this.postImage != null;
  }

  public void setPostImageIsSet(boolean value) {
    if (!value) {
      this.postImage = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case USER_ID:
      if (value == null) {
        unsetUserID();
      } else {
        setUserID((Long)value);
      }
      break;

    case POST_TITLE:
      if (value == null) {
        unsetPostTitle();
      } else {
        setPostTitle((String)value);
      }
      break;

    case POST_TEXT:
      if (value == null) {
        unsetPostText();
      } else {
        setPostText((String)value);
      }
      break;

    case EMAIL_ADDRESS:
      if (value == null) {
        unsetEmailAddress();
      } else {
        setEmailAddress((String)value);
      }
      break;

    case POST_IMAGE:
      if (value == null) {
        unsetPostImage();
      } else {
        setPostImage((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case USER_ID:
      return getUserID();

    case POST_TITLE:
      return getPostTitle();

    case POST_TEXT:
      return getPostText();

    case EMAIL_ADDRESS:
      return getEmailAddress();

    case POST_IMAGE:
      return getPostImage();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case USER_ID:
      return isSetUserID();
    case POST_TITLE:
      return isSetPostTitle();
    case POST_TEXT:
      return isSetPostText();
    case EMAIL_ADDRESS:
      return isSetEmailAddress();
    case POST_IMAGE:
      return isSetPostImage();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof CreateContentData)
      return this.equals((CreateContentData)that);
    return false;
  }

  public boolean equals(CreateContentData that) {
    if (that == null)
      return false;

    boolean this_present_userID = true;
    boolean that_present_userID = true;
    if (this_present_userID || that_present_userID) {
      if (!(this_present_userID && that_present_userID))
        return false;
      if (this.userID != that.userID)
        return false;
    }

    boolean this_present_postTitle = true && this.isSetPostTitle();
    boolean that_present_postTitle = true && that.isSetPostTitle();
    if (this_present_postTitle || that_present_postTitle) {
      if (!(this_present_postTitle && that_present_postTitle))
        return false;
      if (!this.postTitle.equals(that.postTitle))
        return false;
    }

    boolean this_present_postText = true && this.isSetPostText();
    boolean that_present_postText = true && that.isSetPostText();
    if (this_present_postText || that_present_postText) {
      if (!(this_present_postText && that_present_postText))
        return false;
      if (!this.postText.equals(that.postText))
        return false;
    }

    boolean this_present_emailAddress = true && this.isSetEmailAddress();
    boolean that_present_emailAddress = true && that.isSetEmailAddress();
    if (this_present_emailAddress || that_present_emailAddress) {
      if (!(this_present_emailAddress && that_present_emailAddress))
        return false;
      if (!this.emailAddress.equals(that.emailAddress))
        return false;
    }

    boolean this_present_postImage = true && this.isSetPostImage();
    boolean that_present_postImage = true && that.isSetPostImage();
    if (this_present_postImage || that_present_postImage) {
      if (!(this_present_postImage && that_present_postImage))
        return false;
      if (!this.postImage.equals(that.postImage))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_userID = true;
    list.add(present_userID);
    if (present_userID)
      list.add(userID);

    boolean present_postTitle = true && (isSetPostTitle());
    list.add(present_postTitle);
    if (present_postTitle)
      list.add(postTitle);

    boolean present_postText = true && (isSetPostText());
    list.add(present_postText);
    if (present_postText)
      list.add(postText);

    boolean present_emailAddress = true && (isSetEmailAddress());
    list.add(present_emailAddress);
    if (present_emailAddress)
      list.add(emailAddress);

    boolean present_postImage = true && (isSetPostImage());
    list.add(present_postImage);
    if (present_postImage)
      list.add(postImage);

    return list.hashCode();
  }

  @Override
  public int compareTo(CreateContentData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUserID()).compareTo(other.isSetUserID());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetUserID()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.userID, other.userID);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPostTitle()).compareTo(other.isSetPostTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPostTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.postTitle, other.postTitle);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPostText()).compareTo(other.isSetPostText());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPostText()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.postText, other.postText);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetEmailAddress()).compareTo(other.isSetEmailAddress());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEmailAddress()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.emailAddress, other.emailAddress);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetPostImage()).compareTo(other.isSetPostImage());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPostImage()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.postImage, other.postImage);
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
    StringBuilder sb = new StringBuilder("CreateContentData(");
    boolean first = true;

    sb.append("userID:");
    sb.append(this.userID);
    first = false;
    if (!first) sb.append(", ");
    sb.append("postTitle:");
    if (this.postTitle == null) {
      sb.append("null");
    } else {
      sb.append(this.postTitle);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("postText:");
    if (this.postText == null) {
      sb.append("null");
    } else {
      sb.append(this.postText);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("emailAddress:");
    if (this.emailAddress == null) {
      sb.append("null");
    } else {
      sb.append(this.emailAddress);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("postImage:");
    if (this.postImage == null) {
      sb.append("null");
    } else {
      sb.append(this.postImage);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class CreateContentDataStandardSchemeFactory implements SchemeFactory {
    public CreateContentDataStandardScheme getScheme() {
      return new CreateContentDataStandardScheme();
    }
  }

  private static class CreateContentDataStandardScheme extends StandardScheme<CreateContentData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, CreateContentData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // USER_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.userID = iprot.readI64();
              struct.setUserIDIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // POST_TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.postTitle = iprot.readString();
              struct.setPostTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // POST_TEXT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.postText = iprot.readString();
              struct.setPostTextIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // EMAIL_ADDRESS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.emailAddress = iprot.readString();
              struct.setEmailAddressIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // POST_IMAGE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.postImage = iprot.readString();
              struct.setPostImageIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, CreateContentData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(USER_ID_FIELD_DESC);
      oprot.writeI64(struct.userID);
      oprot.writeFieldEnd();
      if (struct.postTitle != null) {
        oprot.writeFieldBegin(POST_TITLE_FIELD_DESC);
        oprot.writeString(struct.postTitle);
        oprot.writeFieldEnd();
      }
      if (struct.postText != null) {
        oprot.writeFieldBegin(POST_TEXT_FIELD_DESC);
        oprot.writeString(struct.postText);
        oprot.writeFieldEnd();
      }
      if (struct.emailAddress != null) {
        oprot.writeFieldBegin(EMAIL_ADDRESS_FIELD_DESC);
        oprot.writeString(struct.emailAddress);
        oprot.writeFieldEnd();
      }
      if (struct.postImage != null) {
        oprot.writeFieldBegin(POST_IMAGE_FIELD_DESC);
        oprot.writeString(struct.postImage);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class CreateContentDataTupleSchemeFactory implements SchemeFactory {
    public CreateContentDataTupleScheme getScheme() {
      return new CreateContentDataTupleScheme();
    }
  }

  private static class CreateContentDataTupleScheme extends TupleScheme<CreateContentData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, CreateContentData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetUserID()) {
        optionals.set(0);
      }
      if (struct.isSetPostTitle()) {
        optionals.set(1);
      }
      if (struct.isSetPostText()) {
        optionals.set(2);
      }
      if (struct.isSetEmailAddress()) {
        optionals.set(3);
      }
      if (struct.isSetPostImage()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetUserID()) {
        oprot.writeI64(struct.userID);
      }
      if (struct.isSetPostTitle()) {
        oprot.writeString(struct.postTitle);
      }
      if (struct.isSetPostText()) {
        oprot.writeString(struct.postText);
      }
      if (struct.isSetEmailAddress()) {
        oprot.writeString(struct.emailAddress);
      }
      if (struct.isSetPostImage()) {
        oprot.writeString(struct.postImage);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, CreateContentData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.userID = iprot.readI64();
        struct.setUserIDIsSet(true);
      }
      if (incoming.get(1)) {
        struct.postTitle = iprot.readString();
        struct.setPostTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.postText = iprot.readString();
        struct.setPostTextIsSet(true);
      }
      if (incoming.get(3)) {
        struct.emailAddress = iprot.readString();
        struct.setEmailAddressIsSet(true);
      }
      if (incoming.get(4)) {
        struct.postImage = iprot.readString();
        struct.setPostImageIsSet(true);
      }
    }
  }

}
