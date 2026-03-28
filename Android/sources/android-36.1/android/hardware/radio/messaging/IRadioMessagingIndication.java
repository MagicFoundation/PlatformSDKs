/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.messaging/4 --previous_hash b28416394e6595c08e97c0473855eb05eed1baed --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen/android/hardware/radio/messaging/IRadioMessagingIndication.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/messaging/IRadioMessagingIndication.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.messaging;
/**
 * Interface declaring unsolicited radio indications for messaging APIs.
 * @hide
 */
public interface IRadioMessagingIndication extends android.os.IInterface
{
  /**
   * The version of this interface that the caller is built against.
   * This might be different from what {@link #getInterfaceVersion()
   * getInterfaceVersion} returns as that is the version of the interface
   * that the remote object is implementing.
   */
  public static final int VERSION = true ? 4 : 5;
  // Interface is being downgraded to the last frozen version due to
  // RELEASE_AIDL_USE_UNFROZEN. See
  // https://source.android.com/docs/core/architecture/aidl/stable-aidl#flag-based-development
  public static final String HASH = "b28416394e6595c08e97c0473855eb05eed1baed";
  /** Default implementation for IRadioMessagingIndication. */
  public static class Default implements android.hardware.radio.messaging.IRadioMessagingIndication
  {
    /**
     * Indicates when new CDMA SMS is received. Callee must subsequently confirm the receipt of the
     * SMS with acknowledgeLastIncomingCdmaSms(). Server must not send cdmaNewSms() messages until
     * acknowledgeLastIncomingCdmaSms() has been received.
     * 
     * @param type Type of radio indication
     * @param msg Cdma Sms Message
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void cdmaNewSms(int type, android.hardware.radio.messaging.CdmaSmsMessage msg) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that SMS storage on the RUIM is full. Messages cannot be saved on the RUIM until
     * space is freed.
     * 
     * @param type Type of radio indication
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void cdmaRuimSmsStorageFull(int type) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when new Broadcast SMS is received
     * 
     * @param type Type of radio indication
     * @param data If received from GSM network, "data" is byte array of 88 bytes which indicates
     *        each page of a CBS Message sent to the MS by the BTS as coded in 3GPP 23.041 Section
     *        9.4.1.2. If received from UMTS network, "data" is byte array of 90 up to 1252 bytes
     *        which contain between 1 and 15 CBS Message pages sent as one packet to the MS by the
     *        BTS as coded in 3GPP 23.041 Section 9.4.2.2
     */
    @Override public void newBroadcastSms(int type, byte[] data) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when new SMS is received. Callee must subsequently confirm the receipt of the SMS
     * with a acknowledgeLastIncomingGsmSms(). Server must not send newSms() or newSmsStatusReport()
     * messages until an acknowledgeLastIncomingGsmSms() has been received.
     * 
     * @param type Type of radio indication
     * @param pdu PDU of SMS-DELIVER represented as byte array.
     *        The PDU starts with the SMSC address per TS 27.005 (+CMT:)
     */
    @Override public void newSms(int type, byte[] pdu) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when new SMS has been stored on SIM card
     * 
     * @param type Type of radio indication
     * @param recordNumber Record number on the sim
     */
    @Override public void newSmsOnSim(int type, int recordNumber) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when new SMS Status Report is received. Callee must subsequently confirm the
     * receipt of the SMS with a acknowledgeLastIncomingGsmSms(). Server must not send newSms() or
     * newSmsStatusReport() messages until an acknowledgeLastIncomingGsmSms() has been received
     * 
     * @param type Type of radio indication
     * @param pdu PDU of SMS-STATUS-REPORT represented as byte array.
     *        The PDU starts with the SMSC address per TS 27.005 (+CMT:)
     */
    @Override public void newSmsStatusReport(int type, byte[] pdu) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that SMS storage on the SIM is full. Sent when the network attempts to deliver a
     * new SMS message. Messages cannot be saved on the SIM until space is freed. In particular,
     * incoming Class 2 messages must not be stored.
     * 
     * @param type Type of radio indication
     */
    @Override public void simSmsStorageFull(int type) throws android.os.RemoteException
    {
    }
    @Override
    public int getInterfaceVersion() {
      return 0;
    }
    @Override
    public String getInterfaceHash() {
      return "";
    }
    @Override
    public android.os.IBinder asBinder() {
      return null;
    }
  }
  /** Local-side IPC implementation stub class. */
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.messaging.IRadioMessagingIndication
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.messaging.IRadioMessagingIndication interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.messaging.IRadioMessagingIndication asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.messaging.IRadioMessagingIndication))) {
        return ((android.hardware.radio.messaging.IRadioMessagingIndication)iin);
      }
      return new android.hardware.radio.messaging.IRadioMessagingIndication.Stub.Proxy(obj);
    }
    @Override public android.os.IBinder asBinder()
    {
      return this;
    }
    @Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
    {
      java.lang.String descriptor = DESCRIPTOR;
      if (code >= android.os.IBinder.FIRST_CALL_TRANSACTION && code <= android.os.IBinder.LAST_CALL_TRANSACTION) {
        data.enforceInterface(descriptor);
      }
      if (code == INTERFACE_TRANSACTION) {
        reply.writeString(descriptor);
        return true;
      }
      else if (code == TRANSACTION_getInterfaceVersion) {
        reply.writeNoException();
        reply.writeInt(getInterfaceVersion());
        return true;
      }
      else if (code == TRANSACTION_getInterfaceHash) {
        reply.writeNoException();
        reply.writeString(getInterfaceHash());
        return true;
      }
      switch (code)
      {
        case TRANSACTION_cdmaNewSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.messaging.CdmaSmsMessage _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.messaging.CdmaSmsMessage.CREATOR);
          data.enforceNoDataAvail();
          this.cdmaNewSms(_arg0, _arg1);
          break;
        }
        case TRANSACTION_cdmaRuimSmsStorageFull:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.cdmaRuimSmsStorageFull(_arg0);
          break;
        }
        case TRANSACTION_newBroadcastSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          data.enforceNoDataAvail();
          this.newBroadcastSms(_arg0, _arg1);
          break;
        }
        case TRANSACTION_newSms:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          data.enforceNoDataAvail();
          this.newSms(_arg0, _arg1);
          break;
        }
        case TRANSACTION_newSmsOnSim:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.newSmsOnSim(_arg0, _arg1);
          break;
        }
        case TRANSACTION_newSmsStatusReport:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte[] _arg1;
          _arg1 = data.createByteArray();
          data.enforceNoDataAvail();
          this.newSmsStatusReport(_arg0, _arg1);
          break;
        }
        case TRANSACTION_simSmsStorageFull:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.simSmsStorageFull(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.messaging.IRadioMessagingIndication
    {
      private android.os.IBinder mRemote;
      Proxy(android.os.IBinder remote)
      {
        mRemote = remote;
      }
      private int mCachedVersion = -1;
      private String mCachedHash = "-1";
      @Override public android.os.IBinder asBinder()
      {
        return mRemote;
      }
      public java.lang.String getInterfaceDescriptor()
      {
        return DESCRIPTOR;
      }
      /**
       * Indicates when new CDMA SMS is received. Callee must subsequently confirm the receipt of the
       * SMS with acknowledgeLastIncomingCdmaSms(). Server must not send cdmaNewSms() messages until
       * acknowledgeLastIncomingCdmaSms() has been received.
       * 
       * @param type Type of radio indication
       * @param msg Cdma Sms Message
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void cdmaNewSms(int type, android.hardware.radio.messaging.CdmaSmsMessage msg) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(msg, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cdmaNewSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cdmaNewSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that SMS storage on the RUIM is full. Messages cannot be saved on the RUIM until
       * space is freed.
       * 
       * @param type Type of radio indication
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void cdmaRuimSmsStorageFull(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cdmaRuimSmsStorageFull, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cdmaRuimSmsStorageFull is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when new Broadcast SMS is received
       * 
       * @param type Type of radio indication
       * @param data If received from GSM network, "data" is byte array of 88 bytes which indicates
       *        each page of a CBS Message sent to the MS by the BTS as coded in 3GPP 23.041 Section
       *        9.4.1.2. If received from UMTS network, "data" is byte array of 90 up to 1252 bytes
       *        which contain between 1 and 15 CBS Message pages sent as one packet to the MS by the
       *        BTS as coded in 3GPP 23.041 Section 9.4.2.2
       */
      @Override public void newBroadcastSms(int type, byte[] data) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeByteArray(data);
          boolean _status = mRemote.transact(Stub.TRANSACTION_newBroadcastSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method newBroadcastSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when new SMS is received. Callee must subsequently confirm the receipt of the SMS
       * with a acknowledgeLastIncomingGsmSms(). Server must not send newSms() or newSmsStatusReport()
       * messages until an acknowledgeLastIncomingGsmSms() has been received.
       * 
       * @param type Type of radio indication
       * @param pdu PDU of SMS-DELIVER represented as byte array.
       *        The PDU starts with the SMSC address per TS 27.005 (+CMT:)
       */
      @Override public void newSms(int type, byte[] pdu) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeByteArray(pdu);
          boolean _status = mRemote.transact(Stub.TRANSACTION_newSms, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method newSms is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when new SMS has been stored on SIM card
       * 
       * @param type Type of radio indication
       * @param recordNumber Record number on the sim
       */
      @Override public void newSmsOnSim(int type, int recordNumber) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(recordNumber);
          boolean _status = mRemote.transact(Stub.TRANSACTION_newSmsOnSim, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method newSmsOnSim is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when new SMS Status Report is received. Callee must subsequently confirm the
       * receipt of the SMS with a acknowledgeLastIncomingGsmSms(). Server must not send newSms() or
       * newSmsStatusReport() messages until an acknowledgeLastIncomingGsmSms() has been received
       * 
       * @param type Type of radio indication
       * @param pdu PDU of SMS-STATUS-REPORT represented as byte array.
       *        The PDU starts with the SMSC address per TS 27.005 (+CMT:)
       */
      @Override public void newSmsStatusReport(int type, byte[] pdu) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeByteArray(pdu);
          boolean _status = mRemote.transact(Stub.TRANSACTION_newSmsStatusReport, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method newSmsStatusReport is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that SMS storage on the SIM is full. Sent when the network attempts to deliver a
       * new SMS message. Messages cannot be saved on the SIM until space is freed. In particular,
       * incoming Class 2 messages must not be stored.
       * 
       * @param type Type of radio indication
       */
      @Override public void simSmsStorageFull(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_simSmsStorageFull, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method simSmsStorageFull is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      @Override
      public int getInterfaceVersion() throws android.os.RemoteException {
        if (mCachedVersion == -1) {
          android.os.Parcel data = android.os.Parcel.obtain(asBinder());
          android.os.Parcel reply = android.os.Parcel.obtain();
          try {
            data.writeInterfaceToken(DESCRIPTOR);
            boolean _status = mRemote.transact(Stub.TRANSACTION_getInterfaceVersion, data, reply, 0);
            reply.readException();
            mCachedVersion = reply.readInt();
          } finally {
            reply.recycle();
            data.recycle();
          }
        }
        return mCachedVersion;
      }
      @Override
      public synchronized String getInterfaceHash() throws android.os.RemoteException {
        if ("-1".equals(mCachedHash)) {
          android.os.Parcel data = android.os.Parcel.obtain(asBinder());
          android.os.Parcel reply = android.os.Parcel.obtain();
          try {
            data.writeInterfaceToken(DESCRIPTOR);
            boolean _status = mRemote.transact(Stub.TRANSACTION_getInterfaceHash, data, reply, 0);
            reply.readException();
            mCachedHash = reply.readString();
          } finally {
            reply.recycle();
            data.recycle();
          }
        }
        return mCachedHash;
      }
    }
    static final int TRANSACTION_cdmaNewSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_cdmaRuimSmsStorageFull = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_newBroadcastSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_newSms = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_newSmsOnSim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_newSmsStatusReport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_simSmsStorageFull = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$messaging$IRadioMessagingIndication".replace('$', '.');
  /**
   * Indicates when new CDMA SMS is received. Callee must subsequently confirm the receipt of the
   * SMS with acknowledgeLastIncomingCdmaSms(). Server must not send cdmaNewSms() messages until
   * acknowledgeLastIncomingCdmaSms() has been received.
   * 
   * @param type Type of radio indication
   * @param msg Cdma Sms Message
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void cdmaNewSms(int type, android.hardware.radio.messaging.CdmaSmsMessage msg) throws android.os.RemoteException;
  /**
   * Indicates that SMS storage on the RUIM is full. Messages cannot be saved on the RUIM until
   * space is freed.
   * 
   * @param type Type of radio indication
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void cdmaRuimSmsStorageFull(int type) throws android.os.RemoteException;
  /**
   * Indicates when new Broadcast SMS is received
   * 
   * @param type Type of radio indication
   * @param data If received from GSM network, "data" is byte array of 88 bytes which indicates
   *        each page of a CBS Message sent to the MS by the BTS as coded in 3GPP 23.041 Section
   *        9.4.1.2. If received from UMTS network, "data" is byte array of 90 up to 1252 bytes
   *        which contain between 1 and 15 CBS Message pages sent as one packet to the MS by the
   *        BTS as coded in 3GPP 23.041 Section 9.4.2.2
   */
  public void newBroadcastSms(int type, byte[] data) throws android.os.RemoteException;
  /**
   * Indicates when new SMS is received. Callee must subsequently confirm the receipt of the SMS
   * with a acknowledgeLastIncomingGsmSms(). Server must not send newSms() or newSmsStatusReport()
   * messages until an acknowledgeLastIncomingGsmSms() has been received.
   * 
   * @param type Type of radio indication
   * @param pdu PDU of SMS-DELIVER represented as byte array.
   *        The PDU starts with the SMSC address per TS 27.005 (+CMT:)
   */
  public void newSms(int type, byte[] pdu) throws android.os.RemoteException;
  /**
   * Indicates when new SMS has been stored on SIM card
   * 
   * @param type Type of radio indication
   * @param recordNumber Record number on the sim
   */
  public void newSmsOnSim(int type, int recordNumber) throws android.os.RemoteException;
  /**
   * Indicates when new SMS Status Report is received. Callee must subsequently confirm the
   * receipt of the SMS with a acknowledgeLastIncomingGsmSms(). Server must not send newSms() or
   * newSmsStatusReport() messages until an acknowledgeLastIncomingGsmSms() has been received
   * 
   * @param type Type of radio indication
   * @param pdu PDU of SMS-STATUS-REPORT represented as byte array.
   *        The PDU starts with the SMSC address per TS 27.005 (+CMT:)
   */
  public void newSmsStatusReport(int type, byte[] pdu) throws android.os.RemoteException;
  /**
   * Indicates that SMS storage on the SIM is full. Sent when the network attempts to deliver a
   * new SMS message. Messages cannot be saved on the SIM until space is freed. In particular,
   * incoming Class 2 messages must not be stored.
   * 
   * @param type Type of radio indication
   */
  public void simSmsStorageFull(int type) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
