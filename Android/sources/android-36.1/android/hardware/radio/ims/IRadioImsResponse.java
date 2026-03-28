/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 4 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.ims/3 --previous_hash b2a615a151c7114c4216b1987fd32d40c797d00a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen/android/hardware/radio/ims/IRadioImsResponse.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/ims/IRadioImsResponse.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.ims;
/**
 * Interface declaring response functions to solicited radio requests for ims APIs.
 * @hide
 */
public interface IRadioImsResponse extends android.os.IInterface
{
  /**
   * The version of this interface that the caller is built against.
   * This might be different from what {@link #getInterfaceVersion()
   * getInterfaceVersion} returns as that is the version of the interface
   * that the remote object is implementing.
   */
  public static final int VERSION = true ? 3 : 4;
  // Interface is being downgraded to the last frozen version due to
  // RELEASE_AIDL_USE_UNFROZEN. See
  // https://source.android.com/docs/core/architecture/aidl/stable-aidl#flag-based-development
  public static final String HASH = "b2a615a151c7114c4216b1987fd32d40c797d00a";
  /** Default implementation for IRadioImsResponse. */
  public static class Default implements android.hardware.radio.ims.IRadioImsResponse
  {
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error.
     * @param failureInfo Information about failure in detail. If there is no error,
     *        it should be {@code null}.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.ims.ConnectionFailureInfo failureInfo) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     */
    @Override public void updateAllowedServicesResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ims.IRadioImsResponse
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.ims.IRadioImsResponse interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.ims.IRadioImsResponse asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.ims.IRadioImsResponse))) {
        return ((android.hardware.radio.ims.IRadioImsResponse)iin);
      }
      return new android.hardware.radio.ims.IRadioImsResponse.Stub.Proxy(obj);
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
        case TRANSACTION_setSrvccCallInfoResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSrvccCallInfoResponse(_arg0);
          break;
        }
        case TRANSACTION_updateImsRegistrationInfoResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.updateImsRegistrationInfoResponse(_arg0);
          break;
        }
        case TRANSACTION_startImsTrafficResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.ims.ConnectionFailureInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.ims.ConnectionFailureInfo.CREATOR);
          data.enforceNoDataAvail();
          this.startImsTrafficResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_stopImsTrafficResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.stopImsTrafficResponse(_arg0);
          break;
        }
        case TRANSACTION_triggerEpsFallbackResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.triggerEpsFallbackResponse(_arg0);
          break;
        }
        case TRANSACTION_sendAnbrQueryResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.sendAnbrQueryResponse(_arg0);
          break;
        }
        case TRANSACTION_updateImsCallStatusResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.updateImsCallStatusResponse(_arg0);
          break;
        }
        case TRANSACTION_updateAllowedServicesResponse:
        {
          if (true) {
            throw new android.os.RemoteException("Method updateAllowedServicesResponse is unimplemented.");
          }
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.updateAllowedServicesResponse(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.ims.IRadioImsResponse
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
       * @param info Response info struct containing response type, serial no. and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSrvccCallInfoResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSrvccCallInfoResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateImsRegistrationInfoResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method updateImsRegistrationInfoResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error.
       * @param failureInfo Information about failure in detail. If there is no error,
       *        it should be {@code null}.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.ims.ConnectionFailureInfo failureInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(failureInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startImsTrafficResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startImsTrafficResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopImsTrafficResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopImsTrafficResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_triggerEpsFallbackResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method triggerEpsFallbackResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendAnbrQueryResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendAnbrQueryResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateImsCallStatusResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method updateImsCallStatusResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       */
      @Override public void updateAllowedServicesResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method updateAllowedServicesResponse is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAllowedServicesResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method updateAllowedServicesResponse is unimplemented.");
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
    static final int TRANSACTION_setSrvccCallInfoResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_updateImsRegistrationInfoResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_startImsTrafficResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_stopImsTrafficResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_triggerEpsFallbackResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_sendAnbrQueryResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_updateImsCallStatusResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_updateAllowedServicesResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$ims$IRadioImsResponse".replace('$', '.');
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void setSrvccCallInfoResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void updateImsRegistrationInfoResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error.
   * @param failureInfo Information about failure in detail. If there is no error,
   *        it should be {@code null}.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void startImsTrafficResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.ims.ConnectionFailureInfo failureInfo) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void stopImsTrafficResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void triggerEpsFallbackResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void sendAnbrQueryResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void updateImsCallStatusResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   */
  public void updateAllowedServicesResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
