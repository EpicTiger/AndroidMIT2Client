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
public class SubscriptionUserClientService {

  public interface Iface {

    public SubscriptionResult Subscribe(SubscriptionData subscriptionData) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void Subscribe(SubscriptionData subscriptionData, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public SubscriptionResult Subscribe(SubscriptionData subscriptionData) throws org.apache.thrift.TException
    {
      send_Subscribe(subscriptionData);
      return recv_Subscribe();
    }

    public void send_Subscribe(SubscriptionData subscriptionData) throws org.apache.thrift.TException
    {
      Subscribe_args args = new Subscribe_args();
      args.setSubscriptionData(subscriptionData);
      sendBase("Subscribe", args);
    }

    public SubscriptionResult recv_Subscribe() throws org.apache.thrift.TException
    {
      Subscribe_result result = new Subscribe_result();
      receiveBase(result, "Subscribe");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "Subscribe failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void Subscribe(SubscriptionData subscriptionData, org.apache.thrift.async.AsyncMethodCallback resultHandler) throws org.apache.thrift.TException {
      checkReady();
      Subscribe_call method_call = new Subscribe_call(subscriptionData, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class Subscribe_call extends org.apache.thrift.async.TAsyncMethodCall {
      private SubscriptionData subscriptionData;
      public Subscribe_call(SubscriptionData subscriptionData, org.apache.thrift.async.AsyncMethodCallback resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.subscriptionData = subscriptionData;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("Subscribe", org.apache.thrift.protocol.TMessageType.CALL, 0));
        Subscribe_args args = new Subscribe_args();
        args.setSubscriptionData(subscriptionData);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public SubscriptionResult getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_Subscribe();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("Subscribe", new Subscribe());
      return processMap;
    }

    public static class Subscribe<I extends Iface> extends org.apache.thrift.ProcessFunction<I, Subscribe_args> {
      public Subscribe() {
        super("Subscribe");
      }

      public Subscribe_args getEmptyArgsInstance() {
        return new Subscribe_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public Subscribe_result getResult(I iface, Subscribe_args args) throws org.apache.thrift.TException {
        Subscribe_result result = new Subscribe_result();
        result.success = iface.Subscribe(args.subscriptionData);
        return result;
      }
    }

  }

  public static class AsyncProcessor<I extends AsyncIface> extends org.apache.thrift.TBaseAsyncProcessor<I> {
    private static final Logger LOGGER = LoggerFactory.getLogger(AsyncProcessor.class.getName());
    public AsyncProcessor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.AsyncProcessFunction<I, ? extends org.apache.thrift.TBase, ?>>()));
    }

    protected AsyncProcessor(I iface, Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends AsyncIface> Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase,?>> getProcessMap(Map<String,  org.apache.thrift.AsyncProcessFunction<I, ? extends  org.apache.thrift.TBase, ?>> processMap) {
      processMap.put("Subscribe", new Subscribe());
      return processMap;
    }

    public static class Subscribe<I extends AsyncIface> extends org.apache.thrift.AsyncProcessFunction<I, Subscribe_args, SubscriptionResult> {
      public Subscribe() {
        super("Subscribe");
      }

      public Subscribe_args getEmptyArgsInstance() {
        return new Subscribe_args();
      }

      public AsyncMethodCallback<SubscriptionResult> getResultHandler(final AsyncFrameBuffer fb, final int seqid) {
        final org.apache.thrift.AsyncProcessFunction fcall = this;
        return new AsyncMethodCallback<SubscriptionResult>() { 
          public void onComplete(SubscriptionResult o) {
            Subscribe_result result = new Subscribe_result();
            result.success = o;
            try {
              fcall.sendResponse(fb,result, org.apache.thrift.protocol.TMessageType.REPLY,seqid);
              return;
            } catch (Exception e) {
              LOGGER.error("Exception writing to internal frame buffer", e);
            }
            fb.close();
          }
          public void onError(Exception e) {
            byte msgType = org.apache.thrift.protocol.TMessageType.REPLY;
            org.apache.thrift.TBase msg;
            Subscribe_result result = new Subscribe_result();
            {
              msgType = org.apache.thrift.protocol.TMessageType.EXCEPTION;
              msg = (org.apache.thrift.TBase)new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, e.getMessage());
            }
            try {
              fcall.sendResponse(fb,msg,msgType,seqid);
              return;
            } catch (Exception ex) {
              LOGGER.error("Exception writing to internal frame buffer", ex);
            }
            fb.close();
          }
        };
      }

      protected boolean isOneway() {
        return false;
      }

      public void start(I iface, Subscribe_args args, org.apache.thrift.async.AsyncMethodCallback<SubscriptionResult> resultHandler) throws TException {
        iface.Subscribe(args.subscriptionData,resultHandler);
      }
    }

  }

  public static class Subscribe_args implements org.apache.thrift.TBase<Subscribe_args, Subscribe_args._Fields>, java.io.Serializable, Cloneable, Comparable<Subscribe_args>, android.os.Parcelable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Subscribe_args");

    private static final org.apache.thrift.protocol.TField SUBSCRIPTION_DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("subscriptionData", org.apache.thrift.protocol.TType.STRUCT, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new Subscribe_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new Subscribe_argsTupleSchemeFactory());
    }

    public SubscriptionData subscriptionData; // required

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {
      out.writeParcelable(subscriptionData, flags);
    }

    @Override
    public int describeContents() {
      return 0;
    }

    public Subscribe_args(android.os.Parcel in) {
      this.subscriptionData= in.readParcelable(Subscribe_args.class.getClassLoader());
    }

    public static final android.os.Parcelable.Creator<Subscribe_args> CREATOR = new android.os.Parcelable.Creator<Subscribe_args>() {
      @Override
      public Subscribe_args[] newArray(int size) {
        return new Subscribe_args[size];
      }

      @Override
      public Subscribe_args createFromParcel(android.os.Parcel in) {
        return new Subscribe_args(in);
      }
    };

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUBSCRIPTION_DATA((short)1, "subscriptionData");

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
          case 1: // SUBSCRIPTION_DATA
            return SUBSCRIPTION_DATA;
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
      tmpMap.put(_Fields.SUBSCRIPTION_DATA, new org.apache.thrift.meta_data.FieldMetaData("subscriptionData", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SubscriptionData.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Subscribe_args.class, metaDataMap);
    }

    public Subscribe_args() {
    }

    public Subscribe_args(
      SubscriptionData subscriptionData)
    {
      this();
      this.subscriptionData = subscriptionData;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Subscribe_args(Subscribe_args other) {
      if (other.isSetSubscriptionData()) {
        this.subscriptionData = new SubscriptionData(other.subscriptionData);
      }
    }

    public Subscribe_args deepCopy() {
      return new Subscribe_args(this);
    }

    @Override
    public void clear() {
      this.subscriptionData = null;
    }

    public SubscriptionData getSubscriptionData() {
      return this.subscriptionData;
    }

    public Subscribe_args setSubscriptionData(SubscriptionData subscriptionData) {
      this.subscriptionData = subscriptionData;
      return this;
    }

    public void unsetSubscriptionData() {
      this.subscriptionData = null;
    }

    /** Returns true if field subscriptionData is set (has been assigned a value) and false otherwise */
    public boolean isSetSubscriptionData() {
      return this.subscriptionData != null;
    }

    public void setSubscriptionDataIsSet(boolean value) {
      if (!value) {
        this.subscriptionData = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUBSCRIPTION_DATA:
        if (value == null) {
          unsetSubscriptionData();
        } else {
          setSubscriptionData((SubscriptionData)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUBSCRIPTION_DATA:
        return getSubscriptionData();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUBSCRIPTION_DATA:
        return isSetSubscriptionData();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof Subscribe_args)
        return this.equals((Subscribe_args)that);
      return false;
    }

    public boolean equals(Subscribe_args that) {
      if (that == null)
        return false;

      boolean this_present_subscriptionData = true && this.isSetSubscriptionData();
      boolean that_present_subscriptionData = true && that.isSetSubscriptionData();
      if (this_present_subscriptionData || that_present_subscriptionData) {
        if (!(this_present_subscriptionData && that_present_subscriptionData))
          return false;
        if (!this.subscriptionData.equals(that.subscriptionData))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_subscriptionData = true && (isSetSubscriptionData());
      list.add(present_subscriptionData);
      if (present_subscriptionData)
        list.add(subscriptionData);

      return list.hashCode();
    }

    @Override
    public int compareTo(Subscribe_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSubscriptionData()).compareTo(other.isSetSubscriptionData());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSubscriptionData()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.subscriptionData, other.subscriptionData);
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
      StringBuilder sb = new StringBuilder("Subscribe_args(");
      boolean first = true;

      sb.append("subscriptionData:");
      if (this.subscriptionData == null) {
        sb.append("null");
      } else {
        sb.append(this.subscriptionData);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (subscriptionData != null) {
        subscriptionData.validate();
      }
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

    private static class Subscribe_argsStandardSchemeFactory implements SchemeFactory {
      public Subscribe_argsStandardScheme getScheme() {
        return new Subscribe_argsStandardScheme();
      }
    }

    private static class Subscribe_argsStandardScheme extends StandardScheme<Subscribe_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, Subscribe_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // SUBSCRIPTION_DATA
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.subscriptionData = new SubscriptionData();
                struct.subscriptionData.read(iprot);
                struct.setSubscriptionDataIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, Subscribe_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.subscriptionData != null) {
          oprot.writeFieldBegin(SUBSCRIPTION_DATA_FIELD_DESC);
          struct.subscriptionData.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class Subscribe_argsTupleSchemeFactory implements SchemeFactory {
      public Subscribe_argsTupleScheme getScheme() {
        return new Subscribe_argsTupleScheme();
      }
    }

    private static class Subscribe_argsTupleScheme extends TupleScheme<Subscribe_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, Subscribe_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSubscriptionData()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSubscriptionData()) {
          struct.subscriptionData.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, Subscribe_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.subscriptionData = new SubscriptionData();
          struct.subscriptionData.read(iprot);
          struct.setSubscriptionDataIsSet(true);
        }
      }
    }

  }

  public static class Subscribe_result implements org.apache.thrift.TBase<Subscribe_result, Subscribe_result._Fields>, java.io.Serializable, Cloneable, Comparable<Subscribe_result>, android.os.Parcelable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Subscribe_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.STRUCT, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new Subscribe_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new Subscribe_resultTupleSchemeFactory());
    }

    public SubscriptionResult success; // required

    @Override
    public void writeToParcel(android.os.Parcel out, int flags) {
      out.writeParcelable(success, flags);
    }

    @Override
    public int describeContents() {
      return 0;
    }

    public Subscribe_result(android.os.Parcel in) {
      this.success= in.readParcelable(Subscribe_result.class.getClassLoader());
    }

    public static final android.os.Parcelable.Creator<Subscribe_result> CREATOR = new android.os.Parcelable.Creator<Subscribe_result>() {
      @Override
      public Subscribe_result[] newArray(int size) {
        return new Subscribe_result[size];
      }

      @Override
      public Subscribe_result createFromParcel(android.os.Parcel in) {
        return new Subscribe_result(in);
      }
    };

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      SUCCESS((short)0, "success");

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
          case 0: // SUCCESS
            return SUCCESS;
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
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SubscriptionResult.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Subscribe_result.class, metaDataMap);
    }

    public Subscribe_result() {
    }

    public Subscribe_result(
      SubscriptionResult success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public Subscribe_result(Subscribe_result other) {
      if (other.isSetSuccess()) {
        this.success = new SubscriptionResult(other.success);
      }
    }

    public Subscribe_result deepCopy() {
      return new Subscribe_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    public SubscriptionResult getSuccess() {
      return this.success;
    }

    public Subscribe_result setSuccess(SubscriptionResult success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((SubscriptionResult)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof Subscribe_result)
        return this.equals((Subscribe_result)that);
      return false;
    }

    public boolean equals(Subscribe_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      List<Object> list = new ArrayList<Object>();

      boolean present_success = true && (isSetSuccess());
      list.add(present_success);
      if (present_success)
        list.add(success);

      return list.hashCode();
    }

    @Override
    public int compareTo(Subscribe_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(other.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, other.success);
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
      StringBuilder sb = new StringBuilder("Subscribe_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
      if (success != null) {
        success.validate();
      }
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

    private static class Subscribe_resultStandardSchemeFactory implements SchemeFactory {
      public Subscribe_resultStandardScheme getScheme() {
        return new Subscribe_resultStandardScheme();
      }
    }

    private static class Subscribe_resultStandardScheme extends StandardScheme<Subscribe_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, Subscribe_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
                struct.success = new SubscriptionResult();
                struct.success.read(iprot);
                struct.setSuccessIsSet(true);
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

      public void write(org.apache.thrift.protocol.TProtocol oprot, Subscribe_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          struct.success.write(oprot);
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class Subscribe_resultTupleSchemeFactory implements SchemeFactory {
      public Subscribe_resultTupleScheme getScheme() {
        return new Subscribe_resultTupleScheme();
      }
    }

    private static class Subscribe_resultTupleScheme extends TupleScheme<Subscribe_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, Subscribe_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          struct.success.write(oprot);
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, Subscribe_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = new SubscriptionResult();
          struct.success.read(iprot);
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
