/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/IRadioSimIndication.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/IRadioSimIndication.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/**
 * Interface declaring unsolicited radio indications for SIM APIs.
 * @hide
 */
public interface IRadioSimIndication extends android.os.IInterface
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
  public static final String HASH = "fc1a19a4f86a58981158cc8d956763c9d8ace630";
  /** Default implementation for IRadioSimIndication. */
  public static class Default implements android.hardware.radio.sim.IRadioSimIndication
  {
    /**
     * Indicates that the modem requires the Carrier info for IMSI/IMPI encryption. This might
     * happen when the modem restarts or for some reason its cache has been invalidated.
     * 
     * @param type Type of radio indication
     */
    @Override public void carrierInfoForImsiEncryption(int info) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when CDMA subscription source changed.
     * 
     * @param type Type of radio indication
     * @param cdmaSource New CdmaSubscriptionSource
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void cdmaSubscriptionSourceChanged(int type, int cdmaSource) throws android.os.RemoteException
    {
    }
    /**
     * Indicates whether SIM phonebook is changed. This indication is sent whenever the SIM
     * phonebook is changed, including SIM is inserted or removed and updated by
     * IRadioSim.updateSimPhonebookRecords.
     * 
     * @param type Type of radio indication
     */
    @Override public void simPhonebookChanged(int type) throws android.os.RemoteException
    {
    }
    /**
     * Indicates the content of all the used records in the SIM phonebook. This indication is
     * associated with the API getSimPhonebookRecords and might be received more than once that is
     * replying on the record count.
     * 
     * @param type Type of radio indication
     * @param status Status of PbReceivedStatus
     * @param records Vector of PhonebookRecordInfo
     */
    @Override public void simPhonebookRecordsReceived(int type, byte status, android.hardware.radio.sim.PhonebookRecordInfo[] records) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that file(s) on the SIM have been updated, or the SIM has been reinitialized.
     * If the SIM state changes as a result of the SIM refresh (eg, SIM_READY ->
     * SIM_LOCKED_OR_ABSENT), simStatusChanged() must be sent.
     * 
     * @param type Type of radio indication
     * @param refreshResult Result of sim refresh
     */
    @Override public void simRefresh(int type, android.hardware.radio.sim.SimRefreshResult refreshResult) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that SIM state changes. Callee must invoke getIccCardStatus().
     * 
     * @param type Type of radio indication
     */
    @Override public void simStatusChanged(int type) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when SIM notifies applications some event happens.
     * 
     * @param type Type of radio indication
     * @param cmd SAT/USAT commands or responses sent by ME to SIM or commands handled by ME,
     *        represented as byte array starting with first byte of response data for command tag.
     *        Refer to TS 102.223 section 9.4 for command types
     */
    @Override public void stkEventNotify(int type, java.lang.String cmd) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when SIM issue a STK proactive command to applications.
     * 
     * @param type Type of radio indication
     * @param cmd SAT/USAT proactive represented as byte array starting with command tag.
     *        Refer to TS 102.223 section 9.4 for command types
     */
    @Override public void stkProactiveCommand(int type, java.lang.String cmd) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when STK session is terminated by SIM.
     * 
     * @param type Type of radio indication
     */
    @Override public void stkSessionEnd(int type) throws android.os.RemoteException
    {
    }
    /**
     * Indicated when there is a change in subscription status.
     * This event must be sent in the following scenarios
     * - subscription readiness at modem, which was selected by telephony layer
     * - when subscription is deactivated by modem due to UICC card removal
     * - when network invalidates the subscription i.e. attach reject due to authentication reject
     * 
     * @param type Type of radio indication
     * @param activate false for subscription deactivated, true for subscription activated
     */
    @Override public void subscriptionStatusChanged(int type, boolean activate) throws android.os.RemoteException
    {
    }
    /**
     * Report change of whether uiccApplications are enabled, or disabled.
     * 
     * @param type Type of radio indication
     * @param enabled whether uiccApplications are enabled or disabled
     */
    @Override public void uiccApplicationsEnablementChanged(int type, boolean enabled) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.sim.IRadioSimIndication
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.sim.IRadioSimIndication interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.sim.IRadioSimIndication asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.sim.IRadioSimIndication))) {
        return ((android.hardware.radio.sim.IRadioSimIndication)iin);
      }
      return new android.hardware.radio.sim.IRadioSimIndication.Stub.Proxy(obj);
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
        case TRANSACTION_carrierInfoForImsiEncryption:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.carrierInfoForImsiEncryption(_arg0);
          break;
        }
        case TRANSACTION_cdmaSubscriptionSourceChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.cdmaSubscriptionSourceChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_simPhonebookChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.simPhonebookChanged(_arg0);
          break;
        }
        case TRANSACTION_simPhonebookRecordsReceived:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte _arg1;
          _arg1 = data.readByte();
          android.hardware.radio.sim.PhonebookRecordInfo[] _arg2;
          _arg2 = data.createTypedArray(android.hardware.radio.sim.PhonebookRecordInfo.CREATOR);
          data.enforceNoDataAvail();
          this.simPhonebookRecordsReceived(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_simRefresh:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.SimRefreshResult _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.SimRefreshResult.CREATOR);
          data.enforceNoDataAvail();
          this.simRefresh(_arg0, _arg1);
          break;
        }
        case TRANSACTION_simStatusChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.simStatusChanged(_arg0);
          break;
        }
        case TRANSACTION_stkEventNotify:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.stkEventNotify(_arg0, _arg1);
          break;
        }
        case TRANSACTION_stkProactiveCommand:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.stkProactiveCommand(_arg0, _arg1);
          break;
        }
        case TRANSACTION_stkSessionEnd:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.stkSessionEnd(_arg0);
          break;
        }
        case TRANSACTION_subscriptionStatusChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.subscriptionStatusChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_uiccApplicationsEnablementChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.uiccApplicationsEnablementChanged(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.sim.IRadioSimIndication
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
       * Indicates that the modem requires the Carrier info for IMSI/IMPI encryption. This might
       * happen when the modem restarts or for some reason its cache has been invalidated.
       * 
       * @param type Type of radio indication
       */
      @Override public void carrierInfoForImsiEncryption(int info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(info);
          boolean _status = mRemote.transact(Stub.TRANSACTION_carrierInfoForImsiEncryption, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method carrierInfoForImsiEncryption is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when CDMA subscription source changed.
       * 
       * @param type Type of radio indication
       * @param cdmaSource New CdmaSubscriptionSource
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void cdmaSubscriptionSourceChanged(int type, int cdmaSource) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(cdmaSource);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cdmaSubscriptionSourceChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cdmaSubscriptionSourceChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates whether SIM phonebook is changed. This indication is sent whenever the SIM
       * phonebook is changed, including SIM is inserted or removed and updated by
       * IRadioSim.updateSimPhonebookRecords.
       * 
       * @param type Type of radio indication
       */
      @Override public void simPhonebookChanged(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_simPhonebookChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method simPhonebookChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates the content of all the used records in the SIM phonebook. This indication is
       * associated with the API getSimPhonebookRecords and might be received more than once that is
       * replying on the record count.
       * 
       * @param type Type of radio indication
       * @param status Status of PbReceivedStatus
       * @param records Vector of PhonebookRecordInfo
       */
      @Override public void simPhonebookRecordsReceived(int type, byte status, android.hardware.radio.sim.PhonebookRecordInfo[] records) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeByte(status);
          _data.writeTypedArray(records, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_simPhonebookRecordsReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method simPhonebookRecordsReceived is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that file(s) on the SIM have been updated, or the SIM has been reinitialized.
       * If the SIM state changes as a result of the SIM refresh (eg, SIM_READY ->
       * SIM_LOCKED_OR_ABSENT), simStatusChanged() must be sent.
       * 
       * @param type Type of radio indication
       * @param refreshResult Result of sim refresh
       */
      @Override public void simRefresh(int type, android.hardware.radio.sim.SimRefreshResult refreshResult) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(refreshResult, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_simRefresh, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method simRefresh is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that SIM state changes. Callee must invoke getIccCardStatus().
       * 
       * @param type Type of radio indication
       */
      @Override public void simStatusChanged(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_simStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method simStatusChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when SIM notifies applications some event happens.
       * 
       * @param type Type of radio indication
       * @param cmd SAT/USAT commands or responses sent by ME to SIM or commands handled by ME,
       *        represented as byte array starting with first byte of response data for command tag.
       *        Refer to TS 102.223 section 9.4 for command types
       */
      @Override public void stkEventNotify(int type, java.lang.String cmd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeString(cmd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stkEventNotify, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stkEventNotify is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when SIM issue a STK proactive command to applications.
       * 
       * @param type Type of radio indication
       * @param cmd SAT/USAT proactive represented as byte array starting with command tag.
       *        Refer to TS 102.223 section 9.4 for command types
       */
      @Override public void stkProactiveCommand(int type, java.lang.String cmd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeString(cmd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stkProactiveCommand, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stkProactiveCommand is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when STK session is terminated by SIM.
       * 
       * @param type Type of radio indication
       */
      @Override public void stkSessionEnd(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stkSessionEnd, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stkSessionEnd is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicated when there is a change in subscription status.
       * This event must be sent in the following scenarios
       * - subscription readiness at modem, which was selected by telephony layer
       * - when subscription is deactivated by modem due to UICC card removal
       * - when network invalidates the subscription i.e. attach reject due to authentication reject
       * 
       * @param type Type of radio indication
       * @param activate false for subscription deactivated, true for subscription activated
       */
      @Override public void subscriptionStatusChanged(int type, boolean activate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeBoolean(activate);
          boolean _status = mRemote.transact(Stub.TRANSACTION_subscriptionStatusChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method subscriptionStatusChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Report change of whether uiccApplications are enabled, or disabled.
       * 
       * @param type Type of radio indication
       * @param enabled whether uiccApplications are enabled or disabled
       */
      @Override public void uiccApplicationsEnablementChanged(int type, boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeBoolean(enabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_uiccApplicationsEnablementChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method uiccApplicationsEnablementChanged is unimplemented.");
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
    static final int TRANSACTION_carrierInfoForImsiEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_cdmaSubscriptionSourceChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_simPhonebookChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_simPhonebookRecordsReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_simRefresh = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_simStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_stkEventNotify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_stkProactiveCommand = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_stkSessionEnd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_subscriptionStatusChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_uiccApplicationsEnablementChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$sim$IRadioSimIndication".replace('$', '.');
  /**
   * Indicates that the modem requires the Carrier info for IMSI/IMPI encryption. This might
   * happen when the modem restarts or for some reason its cache has been invalidated.
   * 
   * @param type Type of radio indication
   */
  public void carrierInfoForImsiEncryption(int info) throws android.os.RemoteException;
  /**
   * Indicates when CDMA subscription source changed.
   * 
   * @param type Type of radio indication
   * @param cdmaSource New CdmaSubscriptionSource
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void cdmaSubscriptionSourceChanged(int type, int cdmaSource) throws android.os.RemoteException;
  /**
   * Indicates whether SIM phonebook is changed. This indication is sent whenever the SIM
   * phonebook is changed, including SIM is inserted or removed and updated by
   * IRadioSim.updateSimPhonebookRecords.
   * 
   * @param type Type of radio indication
   */
  public void simPhonebookChanged(int type) throws android.os.RemoteException;
  /**
   * Indicates the content of all the used records in the SIM phonebook. This indication is
   * associated with the API getSimPhonebookRecords and might be received more than once that is
   * replying on the record count.
   * 
   * @param type Type of radio indication
   * @param status Status of PbReceivedStatus
   * @param records Vector of PhonebookRecordInfo
   */
  public void simPhonebookRecordsReceived(int type, byte status, android.hardware.radio.sim.PhonebookRecordInfo[] records) throws android.os.RemoteException;
  /**
   * Indicates that file(s) on the SIM have been updated, or the SIM has been reinitialized.
   * If the SIM state changes as a result of the SIM refresh (eg, SIM_READY ->
   * SIM_LOCKED_OR_ABSENT), simStatusChanged() must be sent.
   * 
   * @param type Type of radio indication
   * @param refreshResult Result of sim refresh
   */
  public void simRefresh(int type, android.hardware.radio.sim.SimRefreshResult refreshResult) throws android.os.RemoteException;
  /**
   * Indicates that SIM state changes. Callee must invoke getIccCardStatus().
   * 
   * @param type Type of radio indication
   */
  public void simStatusChanged(int type) throws android.os.RemoteException;
  /**
   * Indicates when SIM notifies applications some event happens.
   * 
   * @param type Type of radio indication
   * @param cmd SAT/USAT commands or responses sent by ME to SIM or commands handled by ME,
   *        represented as byte array starting with first byte of response data for command tag.
   *        Refer to TS 102.223 section 9.4 for command types
   */
  public void stkEventNotify(int type, java.lang.String cmd) throws android.os.RemoteException;
  /**
   * Indicates when SIM issue a STK proactive command to applications.
   * 
   * @param type Type of radio indication
   * @param cmd SAT/USAT proactive represented as byte array starting with command tag.
   *        Refer to TS 102.223 section 9.4 for command types
   */
  public void stkProactiveCommand(int type, java.lang.String cmd) throws android.os.RemoteException;
  /**
   * Indicates when STK session is terminated by SIM.
   * 
   * @param type Type of radio indication
   */
  public void stkSessionEnd(int type) throws android.os.RemoteException;
  /**
   * Indicated when there is a change in subscription status.
   * This event must be sent in the following scenarios
   * - subscription readiness at modem, which was selected by telephony layer
   * - when subscription is deactivated by modem due to UICC card removal
   * - when network invalidates the subscription i.e. attach reject due to authentication reject
   * 
   * @param type Type of radio indication
   * @param activate false for subscription deactivated, true for subscription activated
   */
  public void subscriptionStatusChanged(int type, boolean activate) throws android.os.RemoteException;
  /**
   * Report change of whether uiccApplications are enabled, or disabled.
   * 
   * @param type Type of radio indication
   * @param enabled whether uiccApplications are enabled or disabled
   */
  public void uiccApplicationsEnablementChanged(int type, boolean enabled) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
