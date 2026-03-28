/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.modem/4 --previous_hash 787419262f7c39ea36c0fbe22681bada95d1f97b --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen/android/hardware/radio/modem/IRadioModemIndication.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/modem/IRadioModemIndication.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.modem;
/**
 * Interface declaring unsolicited radio indications for modem APIs.
 * @hide
 */
public interface IRadioModemIndication extends android.os.IInterface
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
  public static final String HASH = "787419262f7c39ea36c0fbe22681bada95d1f97b";
  /** Default implementation for IRadioModemIndication. */
  public static class Default implements android.hardware.radio.modem.IRadioModemIndication
  {
    /**
     * Indicates when the hardware configuration associated with the RILd changes.
     * 
     * @param type Type of radio indication
     * @param configs Array of hardware configs
     */
    @Override public void hardwareConfigChanged(int type, android.hardware.radio.modem.HardwareConfig[] configs) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when there is a modem reset.
     * When modem restarts, one of the following radio state transitions must happen
     * 1) RadioState:ON->RadioState:UNAVAILABLE->RadioState:ON or
     * 2) RadioState:OFF->RadioState:UNAVAILABLE->RadioState:OFF
     * This message must be sent either just before the Radio State changes to
     * RadioState:UNAVAILABLE or just after but must never be sent after the Radio State changes
     * from RadioState:UNAVAILABLE to RadioState:ON/RadioState:OFF again. It must NOT be sent after
     * the Radio state changes to RadioState:ON/RadioState:OFF after the modem restart as that may
     * be interpreted as a second modem reset by the framework.
     * 
     * @param type Type of radio indication
     * @param reason the reason for the reset. It may be a crash signature if the restart was due to
     *        a crash or some string such as "user-initiated restart" or "AT command initiated
     *        restart" that explains the cause of the modem restart
     */
    @Override public void modemReset(int type, java.lang.String reason) throws android.os.RemoteException
    {
    }
    /**
     * Sent when setRadioCapability() completes. Returns the phone radio capability exactly as
     * getRadioCapability() and must be the same set as sent by setRadioCapability().
     * 
     * @param type Type of radio indication
     * @param rc Current radio capability
     */
    @Override public void radioCapabilityIndication(int type, android.hardware.radio.modem.RadioCapability rc) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when radio state changes.
     * 
     * For DSDS device, this API should follow below rules:
     * 1) The radio state is a global property of the entire modem and is not specific to an
     *    individual stack. Therefore, the state indicated must be identical for both stacks.
     * 2) For example, in a single-SIM scenario, the modem cannot selectively process a "radio on"
     *    request exclusively for the stack with the inserted SIM while blocking the same request
     *    for the stack without a SIM.
     * 
     * @param type Type of radio indication
     * @param radioState Current radio state
     */
    @Override public void radioStateChanged(int type, int radioState) throws android.os.RemoteException
    {
    }
    /**
     * Indicates the ril connects to the modem.
     * 
     * @param type Type of radio indication
     */
    @Override public void rilConnected(int type) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when there is a change in the IMEI mapping.
     * 
     * @param type Type of radio indication
     * @param imeiInfo IMEI information
     */
    @Override public void onImeiMappingChanged(int type, android.hardware.radio.modem.ImeiInfo imeiInfo) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.modem.IRadioModemIndication
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.modem.IRadioModemIndication interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.modem.IRadioModemIndication asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.modem.IRadioModemIndication))) {
        return ((android.hardware.radio.modem.IRadioModemIndication)iin);
      }
      return new android.hardware.radio.modem.IRadioModemIndication.Stub.Proxy(obj);
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
        case TRANSACTION_hardwareConfigChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.modem.HardwareConfig[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.modem.HardwareConfig.CREATOR);
          data.enforceNoDataAvail();
          this.hardwareConfigChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_modemReset:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.modemReset(_arg0, _arg1);
          break;
        }
        case TRANSACTION_radioCapabilityIndication:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.modem.RadioCapability _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.modem.RadioCapability.CREATOR);
          data.enforceNoDataAvail();
          this.radioCapabilityIndication(_arg0, _arg1);
          break;
        }
        case TRANSACTION_radioStateChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.radioStateChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_rilConnected:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.rilConnected(_arg0);
          break;
        }
        case TRANSACTION_onImeiMappingChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.modem.ImeiInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.modem.ImeiInfo.CREATOR);
          data.enforceNoDataAvail();
          this.onImeiMappingChanged(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.modem.IRadioModemIndication
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
       * Indicates when the hardware configuration associated with the RILd changes.
       * 
       * @param type Type of radio indication
       * @param configs Array of hardware configs
       */
      @Override public void hardwareConfigChanged(int type, android.hardware.radio.modem.HardwareConfig[] configs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedArray(configs, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hardwareConfigChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method hardwareConfigChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when there is a modem reset.
       * When modem restarts, one of the following radio state transitions must happen
       * 1) RadioState:ON->RadioState:UNAVAILABLE->RadioState:ON or
       * 2) RadioState:OFF->RadioState:UNAVAILABLE->RadioState:OFF
       * This message must be sent either just before the Radio State changes to
       * RadioState:UNAVAILABLE or just after but must never be sent after the Radio State changes
       * from RadioState:UNAVAILABLE to RadioState:ON/RadioState:OFF again. It must NOT be sent after
       * the Radio state changes to RadioState:ON/RadioState:OFF after the modem restart as that may
       * be interpreted as a second modem reset by the framework.
       * 
       * @param type Type of radio indication
       * @param reason the reason for the reset. It may be a crash signature if the restart was due to
       *        a crash or some string such as "user-initiated restart" or "AT command initiated
       *        restart" that explains the cause of the modem restart
       */
      @Override public void modemReset(int type, java.lang.String reason) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeString(reason);
          boolean _status = mRemote.transact(Stub.TRANSACTION_modemReset, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method modemReset is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Sent when setRadioCapability() completes. Returns the phone radio capability exactly as
       * getRadioCapability() and must be the same set as sent by setRadioCapability().
       * 
       * @param type Type of radio indication
       * @param rc Current radio capability
       */
      @Override public void radioCapabilityIndication(int type, android.hardware.radio.modem.RadioCapability rc) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(rc, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_radioCapabilityIndication, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method radioCapabilityIndication is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when radio state changes.
       * 
       * For DSDS device, this API should follow below rules:
       * 1) The radio state is a global property of the entire modem and is not specific to an
       *    individual stack. Therefore, the state indicated must be identical for both stacks.
       * 2) For example, in a single-SIM scenario, the modem cannot selectively process a "radio on"
       *    request exclusively for the stack with the inserted SIM while blocking the same request
       *    for the stack without a SIM.
       * 
       * @param type Type of radio indication
       * @param radioState Current radio state
       */
      @Override public void radioStateChanged(int type, int radioState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(radioState);
          boolean _status = mRemote.transact(Stub.TRANSACTION_radioStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method radioStateChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates the ril connects to the modem.
       * 
       * @param type Type of radio indication
       */
      @Override public void rilConnected(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rilConnected, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method rilConnected is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when there is a change in the IMEI mapping.
       * 
       * @param type Type of radio indication
       * @param imeiInfo IMEI information
       */
      @Override public void onImeiMappingChanged(int type, android.hardware.radio.modem.ImeiInfo imeiInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(imeiInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_onImeiMappingChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method onImeiMappingChanged is unimplemented.");
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
    static final int TRANSACTION_hardwareConfigChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_modemReset = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_radioCapabilityIndication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_radioStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_rilConnected = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_onImeiMappingChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$modem$IRadioModemIndication".replace('$', '.');
  /**
   * Indicates when the hardware configuration associated with the RILd changes.
   * 
   * @param type Type of radio indication
   * @param configs Array of hardware configs
   */
  public void hardwareConfigChanged(int type, android.hardware.radio.modem.HardwareConfig[] configs) throws android.os.RemoteException;
  /**
   * Indicates when there is a modem reset.
   * When modem restarts, one of the following radio state transitions must happen
   * 1) RadioState:ON->RadioState:UNAVAILABLE->RadioState:ON or
   * 2) RadioState:OFF->RadioState:UNAVAILABLE->RadioState:OFF
   * This message must be sent either just before the Radio State changes to
   * RadioState:UNAVAILABLE or just after but must never be sent after the Radio State changes
   * from RadioState:UNAVAILABLE to RadioState:ON/RadioState:OFF again. It must NOT be sent after
   * the Radio state changes to RadioState:ON/RadioState:OFF after the modem restart as that may
   * be interpreted as a second modem reset by the framework.
   * 
   * @param type Type of radio indication
   * @param reason the reason for the reset. It may be a crash signature if the restart was due to
   *        a crash or some string such as "user-initiated restart" or "AT command initiated
   *        restart" that explains the cause of the modem restart
   */
  public void modemReset(int type, java.lang.String reason) throws android.os.RemoteException;
  /**
   * Sent when setRadioCapability() completes. Returns the phone radio capability exactly as
   * getRadioCapability() and must be the same set as sent by setRadioCapability().
   * 
   * @param type Type of radio indication
   * @param rc Current radio capability
   */
  public void radioCapabilityIndication(int type, android.hardware.radio.modem.RadioCapability rc) throws android.os.RemoteException;
  /**
   * Indicates when radio state changes.
   * 
   * For DSDS device, this API should follow below rules:
   * 1) The radio state is a global property of the entire modem and is not specific to an
   *    individual stack. Therefore, the state indicated must be identical for both stacks.
   * 2) For example, in a single-SIM scenario, the modem cannot selectively process a "radio on"
   *    request exclusively for the stack with the inserted SIM while blocking the same request
   *    for the stack without a SIM.
   * 
   * @param type Type of radio indication
   * @param radioState Current radio state
   */
  public void radioStateChanged(int type, int radioState) throws android.os.RemoteException;
  /**
   * Indicates the ril connects to the modem.
   * 
   * @param type Type of radio indication
   */
  public void rilConnected(int type) throws android.os.RemoteException;
  /**
   * Indicates when there is a change in the IMEI mapping.
   * 
   * @param type Type of radio indication
   * @param imeiInfo IMEI information
   */
  public void onImeiMappingChanged(int type, android.hardware.radio.modem.ImeiInfo imeiInfo) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
