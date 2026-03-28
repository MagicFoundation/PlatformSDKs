/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/4 --previous_hash fc7eeb47f5238e538dead4af7575507920c359f7 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen/android/hardware/radio/config/IRadioConfig.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/config/IRadioConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.config;
/** @hide */
public interface IRadioConfig extends android.os.IInterface
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
  /** Default implementation for IRadioConfig. */
  public static class Default implements android.hardware.radio.config.IRadioConfig
  {
    /**
     * Gets the available Radio Hal capabilities on the current device.
     * 
     * This is called once per device boot up.
     * 
     * @param serial Serial number of request
     * 
     * Response callback is
     * IRadioConfigResponse.getHalDeviceCapabilitiesResponse()
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void getHalDeviceCapabilities(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get the number of live modems (i.e modems that are
     * enabled and actively working as part of a working telephony stack)
     * 
     * Note: in order to get the overall number of modems available on the phone,
     * refer to getPhoneCapability API
     * 
     * @param serial Serial number of request.
     * 
     * Response callback is IRadioConfigResponse.getNumOfLiveModemsResponse() which
     * will return <byte>.
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void getNumOfLiveModems(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request current phone capability.
     * 
     * @param serial Serial number of request.
     * 
     * Response callback is IRadioResponse.getPhoneCapabilityResponse() which
     * will return <PhoneCapability>.
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void getPhoneCapability(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get SIM Slot status.
     * 
     * Request provides the slot status of all active and inactive SIM slots and whether card is
     * present in the slots or not.
     * 
     * @param serial Serial number of request.
     * 
     * Response callback is IRadioConfigResponse.getSimSlotsStatusResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getSimSlotsStatus(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Set modems configurations by specifying the number of live modems (i.e modems that are
     * enabled and actively working as part of a working telephony stack).
     * 
     * Example: this interface can be used to switch to single/multi sim mode by specifying
     * the number of live modems as 1, 2, etc
     * 
     * Note: by setting the number of live modems in this API, that number of modems will
     * subsequently get enabled/disabled
     * 
     * @param serial serial number of request.
     * @param modemsConfig byte object including the number of live modems
     * 
     * Response callback is IRadioResponse.setNumOfLiveModemsResponse()
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void setNumOfLiveModems(int serial, byte numOfLiveModems) throws android.os.RemoteException
    {
    }
    /**
     * Set preferred data modem Id.
     * In a multi-SIM device, notify the modem layer which logical modem will be used primarily
     * for data. It helps the modem with resource optimization and decisions of what data
     * connections should be satisfied.
     * 
     * @param serial Serial number of request.
     * @param modemId the logical modem ID which should match one of the modem IDs returned
     * from getPhoneCapability().
     * 
     * Response callback is IRadioConfigResponse.setPreferredDataModemResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setPreferredDataModem(int serial, byte modemId) throws android.os.RemoteException
    {
    }
    /**
     * Set response functions for radio config requests & radio config indications.
     * 
     * @param radioConfigResponse Object containing radio config response functions
     * @param radioConfigIndication Object containing radio config indications
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse radioConfigResponse, android.hardware.radio.config.IRadioConfigIndication radioConfigIndication) throws android.os.RemoteException
    {
    }
    /**
     * Set SIM Slot mapping.
     * 
     * Maps the logical slots to the SlotPortMapping, which consists of both physical slot id and
     * port id. Logical slot is the slot that is seen by the modem. Physical slot is the actual
     * physical slot. PortId is the id (enumerated value) for the associated port available on the
     * SIM. Each physical slot can have multiple ports, which enables multi-enabled profile(MEP). If
     * eUICC physical slot supports 2 ports, then the portId is numbered 0,1 and if eUICC2 supports
     * 4 ports then the portID is numbered 0,1,2,3. Each portId is unique within a UICC physical
     * slot but not necessarily unique across UICC’s. SEP(Single enabled profile) eUICC and
     * non-eUICC will only have portId 0.
     * 
     * Logical slots that are already mapped to the requested SlotPortMapping are not impacted.
     * 
     * Example: There is 1 logical slot, 2 physical slots, MEP is not supported and each physical
     * slot has one port:
     * The only logical slot (index 0) can be mapped to the first physical slot (value 0),
     * port(index 0), or second physical slot(value 1), port (index 0), while the other physical
     * slot remains unmapped and inactive.
     * slotMap[0] = SlotPortMapping{0 //physical slot//, 0 //port//}
     * slotMap[0] = SlotPortMapping{1 //physical slot//, 0 //port//}
     * 
     * Example: There are 2 logical slots, 2 physical slots, MEP is supported and there are 2 ports
     * available:
     * Each logical slot must be mapped to a port (physical slot and port combination). The first
     * logical slot (index 0) can be mapped to the physical slot 1 and the second logical slot can
     * be mapped to either port from physical slot 2.
     * 
     * slotMap[0] = SlotPortMapping{0, 0} and slotMap[1] = SlotPortMapping{1, 0} or
     * slotMap[0] = SlotPortMapping{0, 0} and slotMap[1] = SlotPortMapping{1, 1}
     * 
     * or the other way around, the second logical slot(index 1) can be mapped to physical slot 1
     * and the first logical slot can be mapped to either port from physical slot 2.
     * 
     * slotMap[1] = SlotPortMapping{0, 0} and slotMap[0] = SlotPortMapping{1, 0} or
     * slotMap[1] = SlotPortMapping{0, 0} and slotMap[0] = SlotPortMapping{1, 1}
     * 
     * another possible mapping is each logical slot maps to each port of physical slot 2 and there
     * is no active logical modem mapped to physical slot 1.
     * 
     * slotMap[0] = SlotPortMapping{1, 0} and slotMap[1] = SlotPortMapping{1, 1} or
     * slotMap[0] = SlotPortMapping{1, 1} and slotMap[1] = SlotPortMapping{1, 0}
     * 
     * @param serial Serial number of request
     * @param slotMap Logical to physical slot and port mapping.
     *        The index maps to the logical slot, and the value to the physical slot and port id. In
     *        the case of a multi-slot device, provide all the slot mappings when sending a request.
     * 
     *        Example: SlotPortMapping(physical slot, port id)
     *        index 0 is the first logical_slot number of logical slots is equal to number of Radio
     *        instances and number of physical slots is equal to size of slotStatus in
     *        getSimSlotsStatusResponse
     * 
     * Response callback is IRadioConfigResponse.setSimSlotsMappingResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void setSimSlotsMapping(int serial, android.hardware.radio.config.SlotPortMapping[] slotMap) throws android.os.RemoteException
    {
    }
    /**
     * Get the set of logical slots where simultaneous cellular calling is currently possible. This
     * does not include simultaneous calling availability over other non-cellular transports, such
     * as IWLAN.
     * 
     * Get the set of slots that currently support simultaneous cellular calling. When a new
     * cellular call is placed/received, if another slot is active and handing a call, both the
     * active slot and proposed slot must be in this list in order to support simultaneous cellular
     * calling for both of those slots.
     * 
     * @param serial Serial number of request
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void getSimultaneousCallingSupport(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get the sim type information.
     * 
     * Response provides the current active sim type and supported sim types associated with each
     * active physical slot ids.
     * 
     * @param serial Serial number of request.
     * 
     * Response callback is IRadioConfigResponse.getSimTypeInfoResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getSimTypeInfo(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Set the sim type associated with the physical slot id and activate if the sim type is
     * currently inactive.
     * 
     * Example: There are 2 active physical slot ids and 3 physical sims(2 pSIM and 1 eSIM). First
     * physical slot id is always linked pSIM and 2nd physical slot id supports either pSIM/eSIM one
     * at a time. In order to activate eSIM on 2nd physical slot id, caller should pass
     * corresponding sim type.
     * 
     * simTypes[0] = pSIM
     * simTypes[1] = eSIM
     * 
     * @param serial Serial number of request.
     * @param simTypes SimType to be activated on each logical slot
     * 
     * Response callback is IRadioConfigResponse.setSimTypeResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void setSimType(int serial, int[] simTypes) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.config.IRadioConfig
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.config.IRadioConfig interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.config.IRadioConfig asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.config.IRadioConfig))) {
        return ((android.hardware.radio.config.IRadioConfig)iin);
      }
      return new android.hardware.radio.config.IRadioConfig.Stub.Proxy(obj);
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
        case TRANSACTION_getHalDeviceCapabilities:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getHalDeviceCapabilities(_arg0);
          break;
        }
        case TRANSACTION_getNumOfLiveModems:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getNumOfLiveModems(_arg0);
          break;
        }
        case TRANSACTION_getPhoneCapability:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getPhoneCapability(_arg0);
          break;
        }
        case TRANSACTION_getSimSlotsStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSimSlotsStatus(_arg0);
          break;
        }
        case TRANSACTION_setNumOfLiveModems:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte _arg1;
          _arg1 = data.readByte();
          data.enforceNoDataAvail();
          this.setNumOfLiveModems(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setPreferredDataModem:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte _arg1;
          _arg1 = data.readByte();
          data.enforceNoDataAvail();
          this.setPreferredDataModem(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setResponseFunctions:
        {
          android.hardware.radio.config.IRadioConfigResponse _arg0;
          _arg0 = android.hardware.radio.config.IRadioConfigResponse.Stub.asInterface(data.readStrongBinder());
          android.hardware.radio.config.IRadioConfigIndication _arg1;
          _arg1 = android.hardware.radio.config.IRadioConfigIndication.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setResponseFunctions(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSimSlotsMapping:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.config.SlotPortMapping[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.config.SlotPortMapping.CREATOR);
          data.enforceNoDataAvail();
          this.setSimSlotsMapping(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getSimultaneousCallingSupport:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSimultaneousCallingSupport(_arg0);
          break;
        }
        case TRANSACTION_getSimTypeInfo:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSimTypeInfo(_arg0);
          break;
        }
        case TRANSACTION_setSimType:
        {
          int _arg0;
          _arg0 = data.readInt();
          int[] _arg1;
          _arg1 = data.createIntArray();
          data.enforceNoDataAvail();
          this.setSimType(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.config.IRadioConfig
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
       * Gets the available Radio Hal capabilities on the current device.
       * 
       * This is called once per device boot up.
       * 
       * @param serial Serial number of request
       * 
       * Response callback is
       * IRadioConfigResponse.getHalDeviceCapabilitiesResponse()
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void getHalDeviceCapabilities(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getHalDeviceCapabilities, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getHalDeviceCapabilities is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the number of live modems (i.e modems that are
       * enabled and actively working as part of a working telephony stack)
       * 
       * Note: in order to get the overall number of modems available on the phone,
       * refer to getPhoneCapability API
       * 
       * @param serial Serial number of request.
       * 
       * Response callback is IRadioConfigResponse.getNumOfLiveModemsResponse() which
       * will return <byte>.
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void getNumOfLiveModems(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNumOfLiveModems, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getNumOfLiveModems is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request current phone capability.
       * 
       * @param serial Serial number of request.
       * 
       * Response callback is IRadioResponse.getPhoneCapabilityResponse() which
       * will return <PhoneCapability>.
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void getPhoneCapability(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPhoneCapability, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getPhoneCapability is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get SIM Slot status.
       * 
       * Request provides the slot status of all active and inactive SIM slots and whether card is
       * present in the slots or not.
       * 
       * @param serial Serial number of request.
       * 
       * Response callback is IRadioConfigResponse.getSimSlotsStatusResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getSimSlotsStatus(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimSlotsStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimSlotsStatus is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set modems configurations by specifying the number of live modems (i.e modems that are
       * enabled and actively working as part of a working telephony stack).
       * 
       * Example: this interface can be used to switch to single/multi sim mode by specifying
       * the number of live modems as 1, 2, etc
       * 
       * Note: by setting the number of live modems in this API, that number of modems will
       * subsequently get enabled/disabled
       * 
       * @param serial serial number of request.
       * @param modemsConfig byte object including the number of live modems
       * 
       * Response callback is IRadioResponse.setNumOfLiveModemsResponse()
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void setNumOfLiveModems(int serial, byte numOfLiveModems) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeByte(numOfLiveModems);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNumOfLiveModems, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNumOfLiveModems is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set preferred data modem Id.
       * In a multi-SIM device, notify the modem layer which logical modem will be used primarily
       * for data. It helps the modem with resource optimization and decisions of what data
       * connections should be satisfied.
       * 
       * @param serial Serial number of request.
       * @param modemId the logical modem ID which should match one of the modem IDs returned
       * from getPhoneCapability().
       * 
       * Response callback is IRadioConfigResponse.setPreferredDataModemResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setPreferredDataModem(int serial, byte modemId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeByte(modemId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPreferredDataModem, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setPreferredDataModem is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set response functions for radio config requests & radio config indications.
       * 
       * @param radioConfigResponse Object containing radio config response functions
       * @param radioConfigIndication Object containing radio config indications
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse radioConfigResponse, android.hardware.radio.config.IRadioConfigIndication radioConfigIndication) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(radioConfigResponse);
          _data.writeStrongInterface(radioConfigIndication);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setResponseFunctions, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setResponseFunctions is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set SIM Slot mapping.
       * 
       * Maps the logical slots to the SlotPortMapping, which consists of both physical slot id and
       * port id. Logical slot is the slot that is seen by the modem. Physical slot is the actual
       * physical slot. PortId is the id (enumerated value) for the associated port available on the
       * SIM. Each physical slot can have multiple ports, which enables multi-enabled profile(MEP). If
       * eUICC physical slot supports 2 ports, then the portId is numbered 0,1 and if eUICC2 supports
       * 4 ports then the portID is numbered 0,1,2,3. Each portId is unique within a UICC physical
       * slot but not necessarily unique across UICC’s. SEP(Single enabled profile) eUICC and
       * non-eUICC will only have portId 0.
       * 
       * Logical slots that are already mapped to the requested SlotPortMapping are not impacted.
       * 
       * Example: There is 1 logical slot, 2 physical slots, MEP is not supported and each physical
       * slot has one port:
       * The only logical slot (index 0) can be mapped to the first physical slot (value 0),
       * port(index 0), or second physical slot(value 1), port (index 0), while the other physical
       * slot remains unmapped and inactive.
       * slotMap[0] = SlotPortMapping{0 //physical slot//, 0 //port//}
       * slotMap[0] = SlotPortMapping{1 //physical slot//, 0 //port//}
       * 
       * Example: There are 2 logical slots, 2 physical slots, MEP is supported and there are 2 ports
       * available:
       * Each logical slot must be mapped to a port (physical slot and port combination). The first
       * logical slot (index 0) can be mapped to the physical slot 1 and the second logical slot can
       * be mapped to either port from physical slot 2.
       * 
       * slotMap[0] = SlotPortMapping{0, 0} and slotMap[1] = SlotPortMapping{1, 0} or
       * slotMap[0] = SlotPortMapping{0, 0} and slotMap[1] = SlotPortMapping{1, 1}
       * 
       * or the other way around, the second logical slot(index 1) can be mapped to physical slot 1
       * and the first logical slot can be mapped to either port from physical slot 2.
       * 
       * slotMap[1] = SlotPortMapping{0, 0} and slotMap[0] = SlotPortMapping{1, 0} or
       * slotMap[1] = SlotPortMapping{0, 0} and slotMap[0] = SlotPortMapping{1, 1}
       * 
       * another possible mapping is each logical slot maps to each port of physical slot 2 and there
       * is no active logical modem mapped to physical slot 1.
       * 
       * slotMap[0] = SlotPortMapping{1, 0} and slotMap[1] = SlotPortMapping{1, 1} or
       * slotMap[0] = SlotPortMapping{1, 1} and slotMap[1] = SlotPortMapping{1, 0}
       * 
       * @param serial Serial number of request
       * @param slotMap Logical to physical slot and port mapping.
       *        The index maps to the logical slot, and the value to the physical slot and port id. In
       *        the case of a multi-slot device, provide all the slot mappings when sending a request.
       * 
       *        Example: SlotPortMapping(physical slot, port id)
       *        index 0 is the first logical_slot number of logical slots is equal to number of Radio
       *        instances and number of physical slots is equal to size of slotStatus in
       *        getSimSlotsStatusResponse
       * 
       * Response callback is IRadioConfigResponse.setSimSlotsMappingResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void setSimSlotsMapping(int serial, android.hardware.radio.config.SlotPortMapping[] slotMap) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(slotMap, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSimSlotsMapping, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSimSlotsMapping is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the set of logical slots where simultaneous cellular calling is currently possible. This
       * does not include simultaneous calling availability over other non-cellular transports, such
       * as IWLAN.
       * 
       * Get the set of slots that currently support simultaneous cellular calling. When a new
       * cellular call is placed/received, if another slot is active and handing a call, both the
       * active slot and proposed slot must be in this list in order to support simultaneous cellular
       * calling for both of those slots.
       * 
       * @param serial Serial number of request
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void getSimultaneousCallingSupport(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimultaneousCallingSupport, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimultaneousCallingSupport is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the sim type information.
       * 
       * Response provides the current active sim type and supported sim types associated with each
       * active physical slot ids.
       * 
       * @param serial Serial number of request.
       * 
       * Response callback is IRadioConfigResponse.getSimTypeInfoResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getSimTypeInfo(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimTypeInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimTypeInfo is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set the sim type associated with the physical slot id and activate if the sim type is
       * currently inactive.
       * 
       * Example: There are 2 active physical slot ids and 3 physical sims(2 pSIM and 1 eSIM). First
       * physical slot id is always linked pSIM and 2nd physical slot id supports either pSIM/eSIM one
       * at a time. In order to activate eSIM on 2nd physical slot id, caller should pass
       * corresponding sim type.
       * 
       * simTypes[0] = pSIM
       * simTypes[1] = eSIM
       * 
       * @param serial Serial number of request.
       * @param simTypes SimType to be activated on each logical slot
       * 
       * Response callback is IRadioConfigResponse.setSimTypeResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void setSimType(int serial, int[] simTypes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeIntArray(simTypes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSimType, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSimType is unimplemented.");
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
    static final int TRANSACTION_getHalDeviceCapabilities = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getNumOfLiveModems = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getPhoneCapability = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getSimSlotsStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_setNumOfLiveModems = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setPreferredDataModem = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_setResponseFunctions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setSimSlotsMapping = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getSimultaneousCallingSupport = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getSimTypeInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setSimType = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$config$IRadioConfig".replace('$', '.');
  /**
   * Gets the available Radio Hal capabilities on the current device.
   * 
   * This is called once per device boot up.
   * 
   * @param serial Serial number of request
   * 
   * Response callback is
   * IRadioConfigResponse.getHalDeviceCapabilitiesResponse()
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void getHalDeviceCapabilities(int serial) throws android.os.RemoteException;
  /**
   * Get the number of live modems (i.e modems that are
   * enabled and actively working as part of a working telephony stack)
   * 
   * Note: in order to get the overall number of modems available on the phone,
   * refer to getPhoneCapability API
   * 
   * @param serial Serial number of request.
   * 
   * Response callback is IRadioConfigResponse.getNumOfLiveModemsResponse() which
   * will return <byte>.
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void getNumOfLiveModems(int serial) throws android.os.RemoteException;
  /**
   * Request current phone capability.
   * 
   * @param serial Serial number of request.
   * 
   * Response callback is IRadioResponse.getPhoneCapabilityResponse() which
   * will return <PhoneCapability>.
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void getPhoneCapability(int serial) throws android.os.RemoteException;
  /**
   * Get SIM Slot status.
   * 
   * Request provides the slot status of all active and inactive SIM slots and whether card is
   * present in the slots or not.
   * 
   * @param serial Serial number of request.
   * 
   * Response callback is IRadioConfigResponse.getSimSlotsStatusResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getSimSlotsStatus(int serial) throws android.os.RemoteException;
  /**
   * Set modems configurations by specifying the number of live modems (i.e modems that are
   * enabled and actively working as part of a working telephony stack).
   * 
   * Example: this interface can be used to switch to single/multi sim mode by specifying
   * the number of live modems as 1, 2, etc
   * 
   * Note: by setting the number of live modems in this API, that number of modems will
   * subsequently get enabled/disabled
   * 
   * @param serial serial number of request.
   * @param modemsConfig byte object including the number of live modems
   * 
   * Response callback is IRadioResponse.setNumOfLiveModemsResponse()
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void setNumOfLiveModems(int serial, byte numOfLiveModems) throws android.os.RemoteException;
  /**
   * Set preferred data modem Id.
   * In a multi-SIM device, notify the modem layer which logical modem will be used primarily
   * for data. It helps the modem with resource optimization and decisions of what data
   * connections should be satisfied.
   * 
   * @param serial Serial number of request.
   * @param modemId the logical modem ID which should match one of the modem IDs returned
   * from getPhoneCapability().
   * 
   * Response callback is IRadioConfigResponse.setPreferredDataModemResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setPreferredDataModem(int serial, byte modemId) throws android.os.RemoteException;
  /**
   * Set response functions for radio config requests & radio config indications.
   * 
   * @param radioConfigResponse Object containing radio config response functions
   * @param radioConfigIndication Object containing radio config indications
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void setResponseFunctions(android.hardware.radio.config.IRadioConfigResponse radioConfigResponse, android.hardware.radio.config.IRadioConfigIndication radioConfigIndication) throws android.os.RemoteException;
  /**
   * Set SIM Slot mapping.
   * 
   * Maps the logical slots to the SlotPortMapping, which consists of both physical slot id and
   * port id. Logical slot is the slot that is seen by the modem. Physical slot is the actual
   * physical slot. PortId is the id (enumerated value) for the associated port available on the
   * SIM. Each physical slot can have multiple ports, which enables multi-enabled profile(MEP). If
   * eUICC physical slot supports 2 ports, then the portId is numbered 0,1 and if eUICC2 supports
   * 4 ports then the portID is numbered 0,1,2,3. Each portId is unique within a UICC physical
   * slot but not necessarily unique across UICC’s. SEP(Single enabled profile) eUICC and
   * non-eUICC will only have portId 0.
   * 
   * Logical slots that are already mapped to the requested SlotPortMapping are not impacted.
   * 
   * Example: There is 1 logical slot, 2 physical slots, MEP is not supported and each physical
   * slot has one port:
   * The only logical slot (index 0) can be mapped to the first physical slot (value 0),
   * port(index 0), or second physical slot(value 1), port (index 0), while the other physical
   * slot remains unmapped and inactive.
   * slotMap[0] = SlotPortMapping{0 //physical slot//, 0 //port//}
   * slotMap[0] = SlotPortMapping{1 //physical slot//, 0 //port//}
   * 
   * Example: There are 2 logical slots, 2 physical slots, MEP is supported and there are 2 ports
   * available:
   * Each logical slot must be mapped to a port (physical slot and port combination). The first
   * logical slot (index 0) can be mapped to the physical slot 1 and the second logical slot can
   * be mapped to either port from physical slot 2.
   * 
   * slotMap[0] = SlotPortMapping{0, 0} and slotMap[1] = SlotPortMapping{1, 0} or
   * slotMap[0] = SlotPortMapping{0, 0} and slotMap[1] = SlotPortMapping{1, 1}
   * 
   * or the other way around, the second logical slot(index 1) can be mapped to physical slot 1
   * and the first logical slot can be mapped to either port from physical slot 2.
   * 
   * slotMap[1] = SlotPortMapping{0, 0} and slotMap[0] = SlotPortMapping{1, 0} or
   * slotMap[1] = SlotPortMapping{0, 0} and slotMap[0] = SlotPortMapping{1, 1}
   * 
   * another possible mapping is each logical slot maps to each port of physical slot 2 and there
   * is no active logical modem mapped to physical slot 1.
   * 
   * slotMap[0] = SlotPortMapping{1, 0} and slotMap[1] = SlotPortMapping{1, 1} or
   * slotMap[0] = SlotPortMapping{1, 1} and slotMap[1] = SlotPortMapping{1, 0}
   * 
   * @param serial Serial number of request
   * @param slotMap Logical to physical slot and port mapping.
   *        The index maps to the logical slot, and the value to the physical slot and port id. In
   *        the case of a multi-slot device, provide all the slot mappings when sending a request.
   * 
   *        Example: SlotPortMapping(physical slot, port id)
   *        index 0 is the first logical_slot number of logical slots is equal to number of Radio
   *        instances and number of physical slots is equal to size of slotStatus in
   *        getSimSlotsStatusResponse
   * 
   * Response callback is IRadioConfigResponse.setSimSlotsMappingResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void setSimSlotsMapping(int serial, android.hardware.radio.config.SlotPortMapping[] slotMap) throws android.os.RemoteException;
  /**
   * Get the set of logical slots where simultaneous cellular calling is currently possible. This
   * does not include simultaneous calling availability over other non-cellular transports, such
   * as IWLAN.
   * 
   * Get the set of slots that currently support simultaneous cellular calling. When a new
   * cellular call is placed/received, if another slot is active and handing a call, both the
   * active slot and proposed slot must be in this list in order to support simultaneous cellular
   * calling for both of those slots.
   * 
   * @param serial Serial number of request
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void getSimultaneousCallingSupport(int serial) throws android.os.RemoteException;
  /**
   * Get the sim type information.
   * 
   * Response provides the current active sim type and supported sim types associated with each
   * active physical slot ids.
   * 
   * @param serial Serial number of request.
   * 
   * Response callback is IRadioConfigResponse.getSimTypeInfoResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getSimTypeInfo(int serial) throws android.os.RemoteException;
  /**
   * Set the sim type associated with the physical slot id and activate if the sim type is
   * currently inactive.
   * 
   * Example: There are 2 active physical slot ids and 3 physical sims(2 pSIM and 1 eSIM). First
   * physical slot id is always linked pSIM and 2nd physical slot id supports either pSIM/eSIM one
   * at a time. In order to activate eSIM on 2nd physical slot id, caller should pass
   * corresponding sim type.
   * 
   * simTypes[0] = pSIM
   * simTypes[1] = eSIM
   * 
   * @param serial Serial number of request.
   * @param simTypes SimType to be activated on each logical slot
   * 
   * Response callback is IRadioConfigResponse.setSimTypeResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void setSimType(int serial, int[] simTypes) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
