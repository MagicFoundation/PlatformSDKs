/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 4 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.ims/3 --previous_hash b2a615a151c7114c4216b1987fd32d40c797d00a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen/android/hardware/radio/ims/IRadioIms.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/ims/IRadioIms.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.ims;
/**
 * This interface is used by IMS telephony layer to talk to cellular radio.
 * All the functions have minimum one parameter:
 * serial: which corresponds to serial no. of request. Serial numbers must only be memorized for the
 * duration of a method call. If clients provide colliding serials (including passing the same
 * serial to different methods), multiple responses (one for each method call) must still be served.
 * setResponseFunctions must work with IRadioImsResponse and IRadioImsIndication.
 * @hide
 */
public interface IRadioIms extends android.os.IInterface
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
  /** Default implementation for IRadioIms. */
  public static class Default implements android.hardware.radio.ims.IRadioIms
  {
    /**
     * Provides a list of SRVCC call information to radio.
     * 
     * @param serial Serial number of request
     * @param srvccCalls the list of calls
     * 
     * Response function is IRadioImsResponse.setSrvccCallInfoResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void setSrvccCallInfo(int serial, android.hardware.radio.ims.SrvccCall[] srvccCalls) throws android.os.RemoteException
    {
    }
    /**
     * Update the IMS registration information to the radio.
     * 
     * This information shall be used by radio to implement following carrier requirements:
     * 1) Graceful IMS PDN disconnection on cellular when NAS is about to perform detach
     * eg. SIM removal or SIM refresh
     * 2) Block PLMN or RAT based on the IMS registration failure reason
     * 
     * @param serial Serial number of request
     * @param imsRegistration IMS registration information
     * 
     * Response function is IRadioImsResponse.updateImsRegistrationInfoResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void updateImsRegistrationInfo(int serial, android.hardware.radio.ims.ImsRegistration imsRegistration) throws android.os.RemoteException
    {
    }
    /**
     * IMS stack notifies the NAS and RRC layers of the radio that the upcoming IMS traffic is
     * for the service mentioned in the ImsTrafficType. If this API is not
     * explicitly invoked and IMS module sends traffic on IMS PDN then the radio
     * shall treat type as background data traffic type.
     * This API shall be used by modem
     *  1. To set the appropriate establishment cause in RRC connection request.
     *  2. To prioritize RF resources in case of DSDS. The service priority is
     * EMERGENCY > EMERGENCY SMS > VOICE > VIDEO > SMS > REGISTRATION > Ut/XCAP. The RF
     * shall be prioritized to the subscription which handles higher priority service.
     * When both subscriptions are handling the same type of service then RF shall be
     * prioritized to the voice preferred sub.
     *  3. To evaluate the overall access barring in the case of ACB, ACB-Skp/SCM and UAC.
     * The response {@link IRadioImsResponse#startImsTrafficResponse()} with success shall
     * be sent by modem upon access class is allowed and RF resource is allotted. Otherwise
     * the same API shall be invoked with appropriate {@link ConnectionFailureInfo}. Further
     * if RRC connection setup fails then {@link IRadioImsIndication#onConnectionSetupFailure()}
     * shall be invoked by modem with appropriate {@link ConnectionFailureInfo}.
     * 
     * @param serial Serial number of request
     * @param token A nonce to identify the request
     * @param imsTrafficType IMS traffic type like registration, voice, and video
     * @param accessNetworkType The type of the radio access network used
     * @param trafficDirection Indicates whether traffic is originated by mobile originated or
     *        mobile terminated use case eg. MO/MT call/SMS etc
     * 
     * Response function is IRadioImsResponse.startImsTrafficResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void startImsTraffic(int serial, int token, int imsTrafficType, int accessNetworkType, int trafficDirection) throws android.os.RemoteException
    {
    }
    /**
     * Indicates IMS traffic has been stopped.
     * For all IMS traffic, notified with startImsTraffic, IMS service shall notify
     * stopImsTraffic when it completes the traffic specified by the token.
     * 
     * @param serial Serial number of request
     * @param token The token assigned by startImsTraffic()
     * 
     * Response function is IRadioImsResponse.stopImsTrafficResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void stopImsTraffic(int serial, int token) throws android.os.RemoteException
    {
    }
    /**
     * Triggers the UE initiated EPS fallback when a MO voice call failed to establish on 5G NR
     * network and network didn't initiate a fallback.
     * 
     * @param serial Serial number of request
     * @param reason Specifies the reason that causes EPS fallback
     * 
     * Response function is IRadioImsResponse.triggerEpsFallbackResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void triggerEpsFallback(int serial, int reason) throws android.os.RemoteException
    {
    }
    /**
     * Set response functions for IMS radio requests and indications.
     * 
     * @param radioImsResponse Object containing response functions
     * @param radioImsIndication Object containing radio indications
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void setResponseFunctions(android.hardware.radio.ims.IRadioImsResponse radioImsResponse, android.hardware.radio.ims.IRadioImsIndication radioImsIndication) throws android.os.RemoteException
    {
    }
    /**
     * Access Network Bitrate Recommendation Query (ANBRQ), see 3GPP TS 26.114.
     * This API triggers radio to send ANBRQ message
     * to the access network to query the desired bitrate.
     * 
     * @param serial Serial number of request
     * @param mediaType Media type is used to identify media stream such as audio or video
     * @param direction Direction of this packet stream (e.g. uplink or downlink)
     * @param bitsPerSecond The bit rate requested by the opponent UE
     * 
     * Response function is IRadioImsResponse.sendAnbrQueryResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void sendAnbrQuery(int serial, int mediaType, int direction, int bitsPerSecond) throws android.os.RemoteException
    {
    }
    /**
     * Provides a list of IMS call information to radio.
     * 
     * @param serial Serial number of request
     * @param imsCalls The list of IMS calls
     * 
     * Response function is IRadioImsResponse.updateImsCallStatusResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void updateImsCallStatus(int serial, android.hardware.radio.ims.ImsCall[] imsCalls) throws android.os.RemoteException
    {
    }
    /**
     * Update allowed IMS services to the modem. The modem can use the information for 3GPP
     * specifications and carriers' requirements e.g. system determination.
     * 
     * @param serial Serial number of request.
     * @param imsServices The list of allowed services
     * 
     * Response function is IRadioImsResponse.updateAllowedServicesResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void updateAllowedServices(int serial, android.hardware.radio.ims.ImsService[] imsServices) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.ims.IRadioIms
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.ims.IRadioIms interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.ims.IRadioIms asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.ims.IRadioIms))) {
        return ((android.hardware.radio.ims.IRadioIms)iin);
      }
      return new android.hardware.radio.ims.IRadioIms.Stub.Proxy(obj);
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
        case TRANSACTION_setSrvccCallInfo:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.ims.SrvccCall[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.ims.SrvccCall.CREATOR);
          data.enforceNoDataAvail();
          this.setSrvccCallInfo(_arg0, _arg1);
          break;
        }
        case TRANSACTION_updateImsRegistrationInfo:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.ims.ImsRegistration _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.ims.ImsRegistration.CREATOR);
          data.enforceNoDataAvail();
          this.updateImsRegistrationInfo(_arg0, _arg1);
          break;
        }
        case TRANSACTION_startImsTraffic:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          data.enforceNoDataAvail();
          this.startImsTraffic(_arg0, _arg1, _arg2, _arg3, _arg4);
          break;
        }
        case TRANSACTION_stopImsTraffic:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.stopImsTraffic(_arg0, _arg1);
          break;
        }
        case TRANSACTION_triggerEpsFallback:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.triggerEpsFallback(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setResponseFunctions:
        {
          android.hardware.radio.ims.IRadioImsResponse _arg0;
          _arg0 = android.hardware.radio.ims.IRadioImsResponse.Stub.asInterface(data.readStrongBinder());
          android.hardware.radio.ims.IRadioImsIndication _arg1;
          _arg1 = android.hardware.radio.ims.IRadioImsIndication.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setResponseFunctions(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendAnbrQuery:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          data.enforceNoDataAvail();
          this.sendAnbrQuery(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_updateImsCallStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.ims.ImsCall[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.ims.ImsCall.CREATOR);
          data.enforceNoDataAvail();
          this.updateImsCallStatus(_arg0, _arg1);
          break;
        }
        case TRANSACTION_updateAllowedServices:
        {
          if (true) {
            throw new android.os.RemoteException("Method updateAllowedServices is unimplemented.");
          }
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.ims.ImsService[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.ims.ImsService.CREATOR);
          data.enforceNoDataAvail();
          this.updateAllowedServices(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.ims.IRadioIms
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
       * Provides a list of SRVCC call information to radio.
       * 
       * @param serial Serial number of request
       * @param srvccCalls the list of calls
       * 
       * Response function is IRadioImsResponse.setSrvccCallInfoResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void setSrvccCallInfo(int serial, android.hardware.radio.ims.SrvccCall[] srvccCalls) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(srvccCalls, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSrvccCallInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSrvccCallInfo is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Update the IMS registration information to the radio.
       * 
       * This information shall be used by radio to implement following carrier requirements:
       * 1) Graceful IMS PDN disconnection on cellular when NAS is about to perform detach
       * eg. SIM removal or SIM refresh
       * 2) Block PLMN or RAT based on the IMS registration failure reason
       * 
       * @param serial Serial number of request
       * @param imsRegistration IMS registration information
       * 
       * Response function is IRadioImsResponse.updateImsRegistrationInfoResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void updateImsRegistrationInfo(int serial, android.hardware.radio.ims.ImsRegistration imsRegistration) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(imsRegistration, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateImsRegistrationInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method updateImsRegistrationInfo is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * IMS stack notifies the NAS and RRC layers of the radio that the upcoming IMS traffic is
       * for the service mentioned in the ImsTrafficType. If this API is not
       * explicitly invoked and IMS module sends traffic on IMS PDN then the radio
       * shall treat type as background data traffic type.
       * This API shall be used by modem
       *  1. To set the appropriate establishment cause in RRC connection request.
       *  2. To prioritize RF resources in case of DSDS. The service priority is
       * EMERGENCY > EMERGENCY SMS > VOICE > VIDEO > SMS > REGISTRATION > Ut/XCAP. The RF
       * shall be prioritized to the subscription which handles higher priority service.
       * When both subscriptions are handling the same type of service then RF shall be
       * prioritized to the voice preferred sub.
       *  3. To evaluate the overall access barring in the case of ACB, ACB-Skp/SCM and UAC.
       * The response {@link IRadioImsResponse#startImsTrafficResponse()} with success shall
       * be sent by modem upon access class is allowed and RF resource is allotted. Otherwise
       * the same API shall be invoked with appropriate {@link ConnectionFailureInfo}. Further
       * if RRC connection setup fails then {@link IRadioImsIndication#onConnectionSetupFailure()}
       * shall be invoked by modem with appropriate {@link ConnectionFailureInfo}.
       * 
       * @param serial Serial number of request
       * @param token A nonce to identify the request
       * @param imsTrafficType IMS traffic type like registration, voice, and video
       * @param accessNetworkType The type of the radio access network used
       * @param trafficDirection Indicates whether traffic is originated by mobile originated or
       *        mobile terminated use case eg. MO/MT call/SMS etc
       * 
       * Response function is IRadioImsResponse.startImsTrafficResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void startImsTraffic(int serial, int token, int imsTrafficType, int accessNetworkType, int trafficDirection) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(token);
          _data.writeInt(imsTrafficType);
          _data.writeInt(accessNetworkType);
          _data.writeInt(trafficDirection);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startImsTraffic, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startImsTraffic is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates IMS traffic has been stopped.
       * For all IMS traffic, notified with startImsTraffic, IMS service shall notify
       * stopImsTraffic when it completes the traffic specified by the token.
       * 
       * @param serial Serial number of request
       * @param token The token assigned by startImsTraffic()
       * 
       * Response function is IRadioImsResponse.stopImsTrafficResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void stopImsTraffic(int serial, int token) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(token);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopImsTraffic, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopImsTraffic is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Triggers the UE initiated EPS fallback when a MO voice call failed to establish on 5G NR
       * network and network didn't initiate a fallback.
       * 
       * @param serial Serial number of request
       * @param reason Specifies the reason that causes EPS fallback
       * 
       * Response function is IRadioImsResponse.triggerEpsFallbackResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void triggerEpsFallback(int serial, int reason) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(reason);
          boolean _status = mRemote.transact(Stub.TRANSACTION_triggerEpsFallback, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method triggerEpsFallback is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set response functions for IMS radio requests and indications.
       * 
       * @param radioImsResponse Object containing response functions
       * @param radioImsIndication Object containing radio indications
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void setResponseFunctions(android.hardware.radio.ims.IRadioImsResponse radioImsResponse, android.hardware.radio.ims.IRadioImsIndication radioImsIndication) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(radioImsResponse);
          _data.writeStrongInterface(radioImsIndication);
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
       * Access Network Bitrate Recommendation Query (ANBRQ), see 3GPP TS 26.114.
       * This API triggers radio to send ANBRQ message
       * to the access network to query the desired bitrate.
       * 
       * @param serial Serial number of request
       * @param mediaType Media type is used to identify media stream such as audio or video
       * @param direction Direction of this packet stream (e.g. uplink or downlink)
       * @param bitsPerSecond The bit rate requested by the opponent UE
       * 
       * Response function is IRadioImsResponse.sendAnbrQueryResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void sendAnbrQuery(int serial, int mediaType, int direction, int bitsPerSecond) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(mediaType);
          _data.writeInt(direction);
          _data.writeInt(bitsPerSecond);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendAnbrQuery, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendAnbrQuery is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Provides a list of IMS call information to radio.
       * 
       * @param serial Serial number of request
       * @param imsCalls The list of IMS calls
       * 
       * Response function is IRadioImsResponse.updateImsCallStatusResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void updateImsCallStatus(int serial, android.hardware.radio.ims.ImsCall[] imsCalls) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(imsCalls, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateImsCallStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method updateImsCallStatus is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Update allowed IMS services to the modem. The modem can use the information for 3GPP
       * specifications and carriers' requirements e.g. system determination.
       * 
       * @param serial Serial number of request.
       * @param imsServices The list of allowed services
       * 
       * Response function is IRadioImsResponse.updateAllowedServicesResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void updateAllowedServices(int serial, android.hardware.radio.ims.ImsService[] imsServices) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method updateAllowedServices is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(imsServices, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateAllowedServices, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method updateAllowedServices is unimplemented.");
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
    static final int TRANSACTION_setSrvccCallInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_updateImsRegistrationInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_startImsTraffic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_stopImsTraffic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_triggerEpsFallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_setResponseFunctions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_sendAnbrQuery = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_updateImsCallStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_updateAllowedServices = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$ims$IRadioIms".replace('$', '.');
  /**
   * Provides a list of SRVCC call information to radio.
   * 
   * @param serial Serial number of request
   * @param srvccCalls the list of calls
   * 
   * Response function is IRadioImsResponse.setSrvccCallInfoResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void setSrvccCallInfo(int serial, android.hardware.radio.ims.SrvccCall[] srvccCalls) throws android.os.RemoteException;
  /**
   * Update the IMS registration information to the radio.
   * 
   * This information shall be used by radio to implement following carrier requirements:
   * 1) Graceful IMS PDN disconnection on cellular when NAS is about to perform detach
   * eg. SIM removal or SIM refresh
   * 2) Block PLMN or RAT based on the IMS registration failure reason
   * 
   * @param serial Serial number of request
   * @param imsRegistration IMS registration information
   * 
   * Response function is IRadioImsResponse.updateImsRegistrationInfoResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void updateImsRegistrationInfo(int serial, android.hardware.radio.ims.ImsRegistration imsRegistration) throws android.os.RemoteException;
  /**
   * IMS stack notifies the NAS and RRC layers of the radio that the upcoming IMS traffic is
   * for the service mentioned in the ImsTrafficType. If this API is not
   * explicitly invoked and IMS module sends traffic on IMS PDN then the radio
   * shall treat type as background data traffic type.
   * This API shall be used by modem
   *  1. To set the appropriate establishment cause in RRC connection request.
   *  2. To prioritize RF resources in case of DSDS. The service priority is
   * EMERGENCY > EMERGENCY SMS > VOICE > VIDEO > SMS > REGISTRATION > Ut/XCAP. The RF
   * shall be prioritized to the subscription which handles higher priority service.
   * When both subscriptions are handling the same type of service then RF shall be
   * prioritized to the voice preferred sub.
   *  3. To evaluate the overall access barring in the case of ACB, ACB-Skp/SCM and UAC.
   * The response {@link IRadioImsResponse#startImsTrafficResponse()} with success shall
   * be sent by modem upon access class is allowed and RF resource is allotted. Otherwise
   * the same API shall be invoked with appropriate {@link ConnectionFailureInfo}. Further
   * if RRC connection setup fails then {@link IRadioImsIndication#onConnectionSetupFailure()}
   * shall be invoked by modem with appropriate {@link ConnectionFailureInfo}.
   * 
   * @param serial Serial number of request
   * @param token A nonce to identify the request
   * @param imsTrafficType IMS traffic type like registration, voice, and video
   * @param accessNetworkType The type of the radio access network used
   * @param trafficDirection Indicates whether traffic is originated by mobile originated or
   *        mobile terminated use case eg. MO/MT call/SMS etc
   * 
   * Response function is IRadioImsResponse.startImsTrafficResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void startImsTraffic(int serial, int token, int imsTrafficType, int accessNetworkType, int trafficDirection) throws android.os.RemoteException;
  /**
   * Indicates IMS traffic has been stopped.
   * For all IMS traffic, notified with startImsTraffic, IMS service shall notify
   * stopImsTraffic when it completes the traffic specified by the token.
   * 
   * @param serial Serial number of request
   * @param token The token assigned by startImsTraffic()
   * 
   * Response function is IRadioImsResponse.stopImsTrafficResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void stopImsTraffic(int serial, int token) throws android.os.RemoteException;
  /**
   * Triggers the UE initiated EPS fallback when a MO voice call failed to establish on 5G NR
   * network and network didn't initiate a fallback.
   * 
   * @param serial Serial number of request
   * @param reason Specifies the reason that causes EPS fallback
   * 
   * Response function is IRadioImsResponse.triggerEpsFallbackResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void triggerEpsFallback(int serial, int reason) throws android.os.RemoteException;
  /**
   * Set response functions for IMS radio requests and indications.
   * 
   * @param radioImsResponse Object containing response functions
   * @param radioImsIndication Object containing radio indications
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void setResponseFunctions(android.hardware.radio.ims.IRadioImsResponse radioImsResponse, android.hardware.radio.ims.IRadioImsIndication radioImsIndication) throws android.os.RemoteException;
  /**
   * Access Network Bitrate Recommendation Query (ANBRQ), see 3GPP TS 26.114.
   * This API triggers radio to send ANBRQ message
   * to the access network to query the desired bitrate.
   * 
   * @param serial Serial number of request
   * @param mediaType Media type is used to identify media stream such as audio or video
   * @param direction Direction of this packet stream (e.g. uplink or downlink)
   * @param bitsPerSecond The bit rate requested by the opponent UE
   * 
   * Response function is IRadioImsResponse.sendAnbrQueryResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void sendAnbrQuery(int serial, int mediaType, int direction, int bitsPerSecond) throws android.os.RemoteException;
  /**
   * Provides a list of IMS call information to radio.
   * 
   * @param serial Serial number of request
   * @param imsCalls The list of IMS calls
   * 
   * Response function is IRadioImsResponse.updateImsCallStatusResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void updateImsCallStatus(int serial, android.hardware.radio.ims.ImsCall[] imsCalls) throws android.os.RemoteException;
  /**
   * Update allowed IMS services to the modem. The modem can use the information for 3GPP
   * specifications and carriers' requirements e.g. system determination.
   * 
   * @param serial Serial number of request.
   * @param imsServices The list of allowed services
   * 
   * Response function is IRadioImsResponse.updateAllowedServicesResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void updateAllowedServices(int serial, android.hardware.radio.ims.ImsService[] imsServices) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
