/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/4 --previous_hash fc7eeb47f5238e538dead4af7575507920c359f7 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen/android/hardware/radio/config/IRadioConfigResponse.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/config/IRadioConfigResponse.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.config;
/**
 * Interface declaring response functions to solicited radio config requests.
 * @hide
 */
public interface IRadioConfigResponse extends android.os.IInterface
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
  public static final String HASH = "fc7eeb47f5238e538dead4af7575507920c359f7";
  /** Default implementation for IRadioConfigResponse. */
  public static class Default implements android.hardware.radio.config.IRadioConfigResponse
  {
    /**
     * @param info Response info struct containing response type, serial number and error
     * @param modemReducedFeatureSet1 True indicates that the modem does NOT support the following
     *        features:
     *        - Providing either LinkCapacityEstimate#secondaryDownlinkCapacityKbps
     *          or LinkCapacityEstimate#secondaryUplinkCapacityKbps when given from
     *          IRadioNetworkIndication#currentLinkCapacityEstimate
     *        - Calling IRadioNetwork#setNrDualConnectivityState or querying
     *          IRadioNetwork#isNrDualConnectivityEnabled
     *        - Requesting IRadioData#setDataThrottling
     *        - Providing SlicingConfig through IRadioData#getSlicingConfig
     *        - Providing PhysicalChannelConfig through
     *          IRadioNetworkIndication#currentPhysicalChannelConfigs
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     */
    @Override public void getHalDeviceCapabilitiesResponse(android.hardware.radio.RadioResponseInfo info, boolean modemReducedFeatureSet1) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial number and error
     * @param numOfLiveModems <byte> indicate the number of live modems i.e. modems that
     *        are enabled and actively working as part of a working connectivity stack
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     */
    @Override public void getNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo info, byte numOfLiveModems) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial number and error
     * @param phoneCapability <PhoneCapability> it defines the modem's capability. For example,
     *        how many logical modems it has, how many data connections it supports.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     */
    @Override public void getPhoneCapabilityResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.PhoneCapability phoneCapability) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial number and error
     * @param slotStatus Sim slot struct containing all the physical SIM slots info with size
     *        equal to the number of physical slots on the device
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     */
    @Override public void getSimSlotsStatusResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.SimSlotStatus[] slotStatus) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial number and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void setNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial number and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void setPreferredDataModemResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial number and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void setSimSlotsMappingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response to the asynchronous
     * {@link IRadioConfig#getSimultaneousCallingSupport} request.
     * 
     * @param info Response info struct containing response type, serial number and error
     * @param enabledLogicalSlots The slots that have simultaneous cellular calling enabled. If
     * there is a call active on logical slot X, then a simultaneous cellular call is only possible
     * on logical slot Y if BOTH slot X and slot Y are in enabledLogicalSlots. If simultaneous
     * cellular calling is not currently supported, the expected value of enabledLogicalSLots is an
     * empty int array. Sending only one radio slot is not acceptable in any case.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     * 
     * @see IRadioConfig#getSimultaneousCallingSupport for more information.
     */
    @Override public void getSimultaneousCallingSupportResponse(android.hardware.radio.RadioResponseInfo info, int[] enabledLogicalSlots) throws android.os.RemoteException
    {
    }
    /**
     * Response to the asynchronous {@link IRadioConfig#getSimTypeInfo} request.
     * 
     * @param info Response info struct containing response type, serial number and error
     * @param simTypeInfos Currently active and supported sim types associated with active
     * physical slot ids.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     */
    @Override public void getSimTypeInfoResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.SimTypeInfo[] simTypeInfo) throws android.os.RemoteException
    {
    }
    /**
     * Response to the asynchronous {@link IRadioConfig#setSimType} request.
     * 
     * @param info Response info struct containing response type, serial number and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     */
    @Override public void setSimTypeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.config.IRadioConfigResponse
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.config.IRadioConfigResponse interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.config.IRadioConfigResponse asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.config.IRadioConfigResponse))) {
        return ((android.hardware.radio.config.IRadioConfigResponse)iin);
      }
      return new android.hardware.radio.config.IRadioConfigResponse.Stub.Proxy(obj);
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
        case TRANSACTION_getHalDeviceCapabilitiesResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.getHalDeviceCapabilitiesResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getNumOfLiveModemsResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          byte _arg1;
          _arg1 = data.readByte();
          data.enforceNoDataAvail();
          this.getNumOfLiveModemsResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getPhoneCapabilityResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.config.PhoneCapability _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.config.PhoneCapability.CREATOR);
          data.enforceNoDataAvail();
          this.getPhoneCapabilityResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getSimSlotsStatusResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.config.SimSlotStatus[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.config.SimSlotStatus.CREATOR);
          data.enforceNoDataAvail();
          this.getSimSlotsStatusResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setNumOfLiveModemsResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setNumOfLiveModemsResponse(_arg0);
          break;
        }
        case TRANSACTION_setPreferredDataModemResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setPreferredDataModemResponse(_arg0);
          break;
        }
        case TRANSACTION_setSimSlotsMappingResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSimSlotsMappingResponse(_arg0);
          break;
        }
        case TRANSACTION_getSimultaneousCallingSupportResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int[] _arg1;
          _arg1 = data.createIntArray();
          data.enforceNoDataAvail();
          this.getSimultaneousCallingSupportResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getSimTypeInfoResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.config.SimTypeInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.config.SimTypeInfo.CREATOR);
          data.enforceNoDataAvail();
          this.getSimTypeInfoResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSimTypeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSimTypeResponse(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.config.IRadioConfigResponse
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
       * @param info Response info struct containing response type, serial number and error
       * @param modemReducedFeatureSet1 True indicates that the modem does NOT support the following
       *        features:
       *        - Providing either LinkCapacityEstimate#secondaryDownlinkCapacityKbps
       *          or LinkCapacityEstimate#secondaryUplinkCapacityKbps when given from
       *          IRadioNetworkIndication#currentLinkCapacityEstimate
       *        - Calling IRadioNetwork#setNrDualConnectivityState or querying
       *          IRadioNetwork#isNrDualConnectivityEnabled
       *        - Requesting IRadioData#setDataThrottling
       *        - Providing SlicingConfig through IRadioData#getSlicingConfig
       *        - Providing PhysicalChannelConfig through
       *          IRadioNetworkIndication#currentPhysicalChannelConfigs
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       */
      @Override public void getHalDeviceCapabilitiesResponse(android.hardware.radio.RadioResponseInfo info, boolean modemReducedFeatureSet1) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(modemReducedFeatureSet1);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getHalDeviceCapabilitiesResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getHalDeviceCapabilitiesResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial number and error
       * @param numOfLiveModems <byte> indicate the number of live modems i.e. modems that
       *        are enabled and actively working as part of a working connectivity stack
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       */
      @Override public void getNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo info, byte numOfLiveModems) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeByte(numOfLiveModems);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNumOfLiveModemsResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getNumOfLiveModemsResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial number and error
       * @param phoneCapability <PhoneCapability> it defines the modem's capability. For example,
       *        how many logical modems it has, how many data connections it supports.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       */
      @Override public void getPhoneCapabilityResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.PhoneCapability phoneCapability) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(phoneCapability, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPhoneCapabilityResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getPhoneCapabilityResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial number and error
       * @param slotStatus Sim slot struct containing all the physical SIM slots info with size
       *        equal to the number of physical slots on the device
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       */
      @Override public void getSimSlotsStatusResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.SimSlotStatus[] slotStatus) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(slotStatus, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimSlotsStatusResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimSlotsStatusResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial number and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void setNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNumOfLiveModemsResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNumOfLiveModemsResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial number and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void setPreferredDataModemResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPreferredDataModemResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setPreferredDataModemResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial number and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void setSimSlotsMappingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSimSlotsMappingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSimSlotsMappingResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response to the asynchronous
       * {@link IRadioConfig#getSimultaneousCallingSupport} request.
       * 
       * @param info Response info struct containing response type, serial number and error
       * @param enabledLogicalSlots The slots that have simultaneous cellular calling enabled. If
       * there is a call active on logical slot X, then a simultaneous cellular call is only possible
       * on logical slot Y if BOTH slot X and slot Y are in enabledLogicalSlots. If simultaneous
       * cellular calling is not currently supported, the expected value of enabledLogicalSLots is an
       * empty int array. Sending only one radio slot is not acceptable in any case.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       * 
       * @see IRadioConfig#getSimultaneousCallingSupport for more information.
       */
      @Override public void getSimultaneousCallingSupportResponse(android.hardware.radio.RadioResponseInfo info, int[] enabledLogicalSlots) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeIntArray(enabledLogicalSlots);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimultaneousCallingSupportResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimultaneousCallingSupportResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response to the asynchronous {@link IRadioConfig#getSimTypeInfo} request.
       * 
       * @param info Response info struct containing response type, serial number and error
       * @param simTypeInfos Currently active and supported sim types associated with active
       * physical slot ids.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       */
      @Override public void getSimTypeInfoResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.SimTypeInfo[] simTypeInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(simTypeInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimTypeInfoResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimTypeInfoResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response to the asynchronous {@link IRadioConfig#setSimType} request.
       * 
       * @param info Response info struct containing response type, serial number and error
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       */
      @Override public void setSimTypeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSimTypeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSimTypeResponse is unimplemented.");
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
    static final int TRANSACTION_getHalDeviceCapabilitiesResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getNumOfLiveModemsResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getPhoneCapabilityResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getSimSlotsStatusResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setNumOfLiveModemsResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setPreferredDataModemResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setSimSlotsMappingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getSimultaneousCallingSupportResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getSimTypeInfoResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setSimTypeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$config$IRadioConfigResponse".replace('$', '.');
  /**
   * @param info Response info struct containing response type, serial number and error
   * @param modemReducedFeatureSet1 True indicates that the modem does NOT support the following
   *        features:
   *        - Providing either LinkCapacityEstimate#secondaryDownlinkCapacityKbps
   *          or LinkCapacityEstimate#secondaryUplinkCapacityKbps when given from
   *          IRadioNetworkIndication#currentLinkCapacityEstimate
   *        - Calling IRadioNetwork#setNrDualConnectivityState or querying
   *          IRadioNetwork#isNrDualConnectivityEnabled
   *        - Requesting IRadioData#setDataThrottling
   *        - Providing SlicingConfig through IRadioData#getSlicingConfig
   *        - Providing PhysicalChannelConfig through
   *          IRadioNetworkIndication#currentPhysicalChannelConfigs
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   */
  public void getHalDeviceCapabilitiesResponse(android.hardware.radio.RadioResponseInfo info, boolean modemReducedFeatureSet1) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial number and error
   * @param numOfLiveModems <byte> indicate the number of live modems i.e. modems that
   *        are enabled and actively working as part of a working connectivity stack
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   */
  public void getNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo info, byte numOfLiveModems) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial number and error
   * @param phoneCapability <PhoneCapability> it defines the modem's capability. For example,
   *        how many logical modems it has, how many data connections it supports.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   */
  public void getPhoneCapabilityResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.PhoneCapability phoneCapability) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial number and error
   * @param slotStatus Sim slot struct containing all the physical SIM slots info with size
   *        equal to the number of physical slots on the device
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   */
  public void getSimSlotsStatusResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.SimSlotStatus[] slotStatus) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial number and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   */
  public void setNumOfLiveModemsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial number and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.data is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   */
  public void setPreferredDataModemResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial number and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   */
  public void setSimSlotsMappingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response to the asynchronous
   * {@link IRadioConfig#getSimultaneousCallingSupport} request.
   * 
   * @param info Response info struct containing response type, serial number and error
   * @param enabledLogicalSlots The slots that have simultaneous cellular calling enabled. If
   * there is a call active on logical slot X, then a simultaneous cellular call is only possible
   * on logical slot Y if BOTH slot X and slot Y are in enabledLogicalSlots. If simultaneous
   * cellular calling is not currently supported, the expected value of enabledLogicalSLots is an
   * empty int array. Sending only one radio slot is not acceptable in any case.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   * 
   * @see IRadioConfig#getSimultaneousCallingSupport for more information.
   */
  public void getSimultaneousCallingSupportResponse(android.hardware.radio.RadioResponseInfo info, int[] enabledLogicalSlots) throws android.os.RemoteException;
  /**
   * Response to the asynchronous {@link IRadioConfig#getSimTypeInfo} request.
   * 
   * @param info Response info struct containing response type, serial number and error
   * @param simTypeInfos Currently active and supported sim types associated with active
   * physical slot ids.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   */
  public void getSimTypeInfoResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.config.SimTypeInfo[] simTypeInfo) throws android.os.RemoteException;
  /**
   * Response to the asynchronous {@link IRadioConfig#setSimType} request.
   * 
   * @param info Response info struct containing response type, serial number and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.subscription is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   */
  public void setSimTypeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
