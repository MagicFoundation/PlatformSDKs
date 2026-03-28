/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/IRadioDataResponse.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/IRadioDataResponse.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/**
 * Interface declaring response functions to solicited radio requests for data APIs.
 * @hide
 */
public interface IRadioDataResponse extends android.os.IInterface
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
  public static final String HASH = "70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb";
  /** Default implementation for IRadioDataResponse. */
  public static class Default implements android.hardware.radio.data.IRadioDataResponse
  {
    /**
     * Acknowledge the receipt of radio request sent to the vendor. This must be sent only for
     * radio requests which take a long time to respond. For more details, refer
     * https://source.android.com/devices/tech/connect/ril.html
     * 
     * @param serial Serial no. of the request whose acknowledgement is sent.
     */
    @Override public void acknowledgeRequest(int serial) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param id The allocated id. On an error, this is set to 0.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES- Indicates that no pdu session ids are available
     */
    @Override public void allocatePduSessionIdResponse(android.hardware.radio.RadioResponseInfo info, int id) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param dcResponse Attributes of data call
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:INVALID_CALL_ID
     */
    @Override public void cancelHandoverResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE indicates success. Any other error will remove the network from the list.
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_CALL_ID
     *   RadioError:INVALID_STATE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     */
    @Override public void deactivateDataCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param dcResponse List of SetupDataCallResult
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:SIM_ABSENT
     */
    @Override public void getDataCallListResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SetupDataCallResult[] dcResponse) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param slicingConfig Current slicing configuration
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     */
    @Override public void getSlicingConfigResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SlicingConfig slicingConfig) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES
     */
    @Override public void releasePduSessionIdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:DEVICE_IN_USE
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setDataAllowedResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SUBSCRIPTION_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     */
    @Override public void setDataProfileResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     *  Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *  RadioError:NONE
     *  RadioError:RADIO_NOT_AVAILABLE
     *  RadioError:MODEM_ERR
     *  RadioError:INVALID_ARGUMENTS
     */
    @Override public void setDataThrottlingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SUBSCRIPTION_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NOT_PROVISIONED
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setInitialAttachApnResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param dcResponse SetupDataCallResult
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE must be returned on both success and failure of setup with the
     *              DataCallResponse.status containing the actual status
     *              For all other errors the DataCallResponse is ignored.
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:OP_NOT_ALLOWED_BEFORE_REG_TO_NW
     *   RadioError:OP_NOT_ALLOWED_DURING_VOICE_CALL
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES if the vendor is unable to handle due to resources being full.
     *   RadioError:SIM_ABSENT
     */
    @Override public void setupDataCallResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SetupDataCallResult dcResponse) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:INVALID_CALL_ID
     */
    @Override public void startHandoverResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param status Status object containing a new handle and a current status. The status returned
     *        here may be PENDING to indicate that the radio has not yet processed the keepalive
     *        request.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:NO_RESOURCES
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void startKeepaliveResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.KeepaliveStatus status) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void stopKeepaliveResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:INVALID_CALL_ID
     */
    @Override public void setUserDataEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:INVALID_CALL_ID
     */
    @Override public void setUserDataRoamingEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:INVALID_CALL_ID
     */
    @Override public void notifyImsDataNetworkResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.data.IRadioDataResponse
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.data.IRadioDataResponse interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.data.IRadioDataResponse asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.data.IRadioDataResponse))) {
        return ((android.hardware.radio.data.IRadioDataResponse)iin);
      }
      return new android.hardware.radio.data.IRadioDataResponse.Stub.Proxy(obj);
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
        case TRANSACTION_acknowledgeRequest:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.acknowledgeRequest(_arg0);
          break;
        }
        case TRANSACTION_allocatePduSessionIdResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.allocatePduSessionIdResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_cancelHandoverResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.cancelHandoverResponse(_arg0);
          break;
        }
        case TRANSACTION_deactivateDataCallResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.deactivateDataCallResponse(_arg0);
          break;
        }
        case TRANSACTION_getDataCallListResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.data.SetupDataCallResult[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.data.SetupDataCallResult.CREATOR);
          data.enforceNoDataAvail();
          this.getDataCallListResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getSlicingConfigResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.data.SlicingConfig _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.SlicingConfig.CREATOR);
          data.enforceNoDataAvail();
          this.getSlicingConfigResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_releasePduSessionIdResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.releasePduSessionIdResponse(_arg0);
          break;
        }
        case TRANSACTION_setDataAllowedResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setDataAllowedResponse(_arg0);
          break;
        }
        case TRANSACTION_setDataProfileResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setDataProfileResponse(_arg0);
          break;
        }
        case TRANSACTION_setDataThrottlingResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setDataThrottlingResponse(_arg0);
          break;
        }
        case TRANSACTION_setInitialAttachApnResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setInitialAttachApnResponse(_arg0);
          break;
        }
        case TRANSACTION_setupDataCallResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.data.SetupDataCallResult _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.SetupDataCallResult.CREATOR);
          data.enforceNoDataAvail();
          this.setupDataCallResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_startHandoverResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.startHandoverResponse(_arg0);
          break;
        }
        case TRANSACTION_startKeepaliveResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.data.KeepaliveStatus _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.KeepaliveStatus.CREATOR);
          data.enforceNoDataAvail();
          this.startKeepaliveResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_stopKeepaliveResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.stopKeepaliveResponse(_arg0);
          break;
        }
        case TRANSACTION_setUserDataEnabledResponse:
        {
          if (true) {
            throw new android.os.RemoteException("Method setUserDataEnabledResponse is unimplemented.");
          }
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setUserDataEnabledResponse(_arg0);
          break;
        }
        case TRANSACTION_setUserDataRoamingEnabledResponse:
        {
          if (true) {
            throw new android.os.RemoteException("Method setUserDataRoamingEnabledResponse is unimplemented.");
          }
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setUserDataRoamingEnabledResponse(_arg0);
          break;
        }
        case TRANSACTION_notifyImsDataNetworkResponse:
        {
          if (true) {
            throw new android.os.RemoteException("Method notifyImsDataNetworkResponse is unimplemented.");
          }
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.notifyImsDataNetworkResponse(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.data.IRadioDataResponse
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
       * Acknowledge the receipt of radio request sent to the vendor. This must be sent only for
       * radio requests which take a long time to respond. For more details, refer
       * https://source.android.com/devices/tech/connect/ril.html
       * 
       * @param serial Serial no. of the request whose acknowledgement is sent.
       */
      @Override public void acknowledgeRequest(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_acknowledgeRequest, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method acknowledgeRequest is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param id The allocated id. On an error, this is set to 0.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES- Indicates that no pdu session ids are available
       */
      @Override public void allocatePduSessionIdResponse(android.hardware.radio.RadioResponseInfo info, int id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_allocatePduSessionIdResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method allocatePduSessionIdResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param dcResponse Attributes of data call
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:INVALID_CALL_ID
       */
      @Override public void cancelHandoverResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelHandoverResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cancelHandoverResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE indicates success. Any other error will remove the network from the list.
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_CALL_ID
       *   RadioError:INVALID_STATE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       */
      @Override public void deactivateDataCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deactivateDataCallResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method deactivateDataCallResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param dcResponse List of SetupDataCallResult
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:SIM_ABSENT
       */
      @Override public void getDataCallListResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SetupDataCallResult[] dcResponse) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(dcResponse, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDataCallListResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getDataCallListResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param slicingConfig Current slicing configuration
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       */
      @Override public void getSlicingConfigResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SlicingConfig slicingConfig) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(slicingConfig, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSlicingConfigResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSlicingConfigResponse is unimplemented.");
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
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES
       */
      @Override public void releasePduSessionIdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_releasePduSessionIdResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method releasePduSessionIdResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:DEVICE_IN_USE
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setDataAllowedResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataAllowedResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setDataAllowedResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SUBSCRIPTION_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       */
      @Override public void setDataProfileResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataProfileResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setDataProfileResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * 
       *  Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *  RadioError:NONE
       *  RadioError:RADIO_NOT_AVAILABLE
       *  RadioError:MODEM_ERR
       *  RadioError:INVALID_ARGUMENTS
       */
      @Override public void setDataThrottlingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataThrottlingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setDataThrottlingResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SUBSCRIPTION_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NOT_PROVISIONED
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setInitialAttachApnResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setInitialAttachApnResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setInitialAttachApnResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param dcResponse SetupDataCallResult
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE must be returned on both success and failure of setup with the
       *              DataCallResponse.status containing the actual status
       *              For all other errors the DataCallResponse is ignored.
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:OP_NOT_ALLOWED_BEFORE_REG_TO_NW
       *   RadioError:OP_NOT_ALLOWED_DURING_VOICE_CALL
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES if the vendor is unable to handle due to resources being full.
       *   RadioError:SIM_ABSENT
       */
      @Override public void setupDataCallResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SetupDataCallResult dcResponse) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(dcResponse, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setupDataCallResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setupDataCallResponse is unimplemented.");
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
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:INVALID_CALL_ID
       */
      @Override public void startHandoverResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startHandoverResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startHandoverResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param status Status object containing a new handle and a current status. The status returned
       *        here may be PENDING to indicate that the radio has not yet processed the keepalive
       *        request.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:NO_RESOURCES
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void startKeepaliveResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.KeepaliveStatus status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(status, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startKeepaliveResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startKeepaliveResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void stopKeepaliveResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopKeepaliveResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopKeepaliveResponse is unimplemented.");
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
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:INVALID_CALL_ID
       */
      @Override public void setUserDataEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method setUserDataEnabledResponse is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUserDataEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setUserDataEnabledResponse is unimplemented.");
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
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:INVALID_CALL_ID
       */
      @Override public void setUserDataRoamingEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method setUserDataRoamingEnabledResponse is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUserDataRoamingEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setUserDataRoamingEnabledResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:INVALID_CALL_ID
       */
      @Override public void notifyImsDataNetworkResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method notifyImsDataNetworkResponse is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifyImsDataNetworkResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method notifyImsDataNetworkResponse is unimplemented.");
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
    static final int TRANSACTION_acknowledgeRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_allocatePduSessionIdResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelHandoverResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_deactivateDataCallResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getDataCallListResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getSlicingConfigResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_releasePduSessionIdResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setDataAllowedResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setDataProfileResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setDataThrottlingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setInitialAttachApnResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_setupDataCallResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_startHandoverResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_startKeepaliveResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_stopKeepaliveResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_setUserDataEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setUserDataRoamingEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_notifyImsDataNetworkResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$data$IRadioDataResponse".replace('$', '.');
  /**
   * Acknowledge the receipt of radio request sent to the vendor. This must be sent only for
   * radio requests which take a long time to respond. For more details, refer
   * https://source.android.com/devices/tech/connect/ril.html
   * 
   * @param serial Serial no. of the request whose acknowledgement is sent.
   */
  public void acknowledgeRequest(int serial) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param id The allocated id. On an error, this is set to 0.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES- Indicates that no pdu session ids are available
   */
  public void allocatePduSessionIdResponse(android.hardware.radio.RadioResponseInfo info, int id) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param dcResponse Attributes of data call
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:INVALID_CALL_ID
   */
  public void cancelHandoverResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE indicates success. Any other error will remove the network from the list.
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_CALL_ID
   *   RadioError:INVALID_STATE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   */
  public void deactivateDataCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param dcResponse List of SetupDataCallResult
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:SIM_ABSENT
   */
  public void getDataCallListResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SetupDataCallResult[] dcResponse) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param slicingConfig Current slicing configuration
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   */
  public void getSlicingConfigResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SlicingConfig slicingConfig) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES
   */
  public void releasePduSessionIdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:DEVICE_IN_USE
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setDataAllowedResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SUBSCRIPTION_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   */
  public void setDataProfileResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   *  Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *  RadioError:NONE
   *  RadioError:RADIO_NOT_AVAILABLE
   *  RadioError:MODEM_ERR
   *  RadioError:INVALID_ARGUMENTS
   */
  public void setDataThrottlingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SUBSCRIPTION_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NOT_PROVISIONED
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setInitialAttachApnResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param dcResponse SetupDataCallResult
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE must be returned on both success and failure of setup with the
   *              DataCallResponse.status containing the actual status
   *              For all other errors the DataCallResponse is ignored.
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:OP_NOT_ALLOWED_BEFORE_REG_TO_NW
   *   RadioError:OP_NOT_ALLOWED_DURING_VOICE_CALL
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES if the vendor is unable to handle due to resources being full.
   *   RadioError:SIM_ABSENT
   */
  public void setupDataCallResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.SetupDataCallResult dcResponse) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:INVALID_CALL_ID
   */
  public void startHandoverResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param status Status object containing a new handle and a current status. The status returned
   *        here may be PENDING to indicate that the radio has not yet processed the keepalive
   *        request.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:NO_RESOURCES
   *   RadioError:INVALID_ARGUMENTS
   */
  public void startKeepaliveResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.data.KeepaliveStatus status) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:INVALID_ARGUMENTS
   */
  public void stopKeepaliveResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:INVALID_CALL_ID
   */
  public void setUserDataEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:INVALID_CALL_ID
   */
  public void setUserDataRoamingEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:INVALID_CALL_ID
   */
  public void notifyImsDataNetworkResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
