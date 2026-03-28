/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/IRadioData.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/IRadioData.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/**
 * This interface is used by telephony and telecom to talk to cellular radio for data APIs.
 * All the functions have minimum one parameter:
 * serial: which corresponds to serial no. of request. Serial numbers must only be memorized for the
 * duration of a method call. If clients provide colliding serials (including passing the same
 * serial to different methods), multiple responses (one for each method call) must still be served.
 * setResponseFunctions must work with IRadioDataResponse and IRadioDataIndication.
 * @hide
 */
public interface IRadioData extends android.os.IInterface
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
  /** Default implementation for IRadioData. */
  public static class Default implements android.hardware.radio.data.IRadioData
  {
    /**
     * Reserves an unallocated pdu session id from the pool of ids. The allocated id is returned
     * in the response. When the id is no longer needed, call releasePduSessionId to return it to
     * the pool.
     * 
     * Reference: 3GPP TS 24.007 section 11.2.3.1b
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioDataResponse.allocatePduSessionIdResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void allocatePduSessionId(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that a handover was cancelled after a call to IRadioData::startHandover.
     * Since the handover was unsuccessful, the modem retains ownership over any of the resources
     * being transferred and is still responsible for releasing them.
     * 
     * @param serial Serial number of request.
     * @param id callId The identifier of the data call which is provided in SetupDataCallResult
     * 
     * Response function is IRadioDataResponse.cancelHandoverResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void cancelHandover(int serial, int callId) throws android.os.RemoteException
    {
    }
    /**
     * Deactivate packet data connection and remove from the data call list. An
     * unsolDataCallListChanged() must be sent when data connection is deactivated.
     * Any return value other than RadioError::NONE will remove the network from the list.
     * 
     * @param serial Serial number of request.
     * @param cid Data call id.
     * @param reason The request reason. Must be normal, handover, or shutdown.
     * 
     * Response function is IRadioDataResponse.deactivateDataCallResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void deactivateDataCall(int serial, int cid, int reason) throws android.os.RemoteException
    {
    }
    /**
     * Returns the data call list. An entry is added when a setupDataCall() is issued and removed
     * on a deactivateDataCall(). The list is emptied when the vendor HAL crashes.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioDataResponse.getDataCallListResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void getDataCallList(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request to get the current slicing configuration including URSP rules and NSSAIs
     * (configured, allowed and rejected). URSP stands for UE route selection policy and is defined
     * in 3GPP TS 24.526 Section 4.2. An NSSAI is a collection of network slices. Each network slice
     * is identified by an S-NSSAI and is represented by the struct SliceInfo. NSSAI and S-NSSAI
     * are defined in 3GPP TS 24.501.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioDataResponse.getSlicingConfigResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void getSlicingConfig(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Releases a pdu session id that was previously allocated using allocatePduSessionId.
     * Reference: 3GPP TS 24.007 section 11.2.3.1b
     * 
     * @param serial Serial number of request.
     * @param id Pdu session id to release.
     * 
     * Response function is IRadioDataResponse.releasePduSessionIdResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void releasePduSessionId(int serial, int id) throws android.os.RemoteException
    {
    }
    /**
     * When response type received from a radio indication or radio response is
     * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
     * acknowledge the receipt of those messages by sending responseAcknowledgement().
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void responseAcknowledgement() throws android.os.RemoteException
    {
    }
    /**
     * Tells the modem whether data calls are allowed or not
     * 
     * @param serial Serial number of request.
     * @param allow true to allow data calls, false to disallow data calls
     * 
     * Response function is IRadioDataResponse.setDataAllowedResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setDataAllowed(int serial, boolean allow) throws android.os.RemoteException
    {
    }
    /**
     * Send data profiles of the current carrier to the modem.
     * 
     * @param serial Serial number of request.
     * @param profiles Array of DataProfileInfo to set.
     * 
     * Response function is IRadioDataResponse.setDataProfileResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setDataProfile(int serial, android.hardware.radio.data.DataProfileInfo[] profiles) throws android.os.RemoteException
    {
    }
    /**
     * Control data throttling at modem.
     * - DataThrottlingAction:NO_DATA_THROTTLING should clear any existing data throttling within
     *   the requested completion window.
     * - DataThrottlingAction:THROTTLE_SECONDARY_CARRIER: Remove any existing throttling on anchor
     *   carrier and achieve maximum data throttling on secondary carrier within the requested
     *   completion window.
     * - DataThrottlingAction:THROTTLE_ANCHOR_CARRIER: disable secondary carrier and achieve maximum
     *   data throttling on anchor carrier by requested completion window.
     * - DataThrottlingAction:HOLD: Immediately hold on to current level of throttling.
     * 
     * @param serial Serial number of request.
     * @param dataThrottlingAction DataThrottlingAction as defined in types.hal
     * @param completionDurationMillis window, in milliseconds, in which the requested throttling
     *        action has to be achieved. This must be 0 when dataThrottlingAction is
     *        DataThrottlingAction:HOLD.
     * 
     * Response function is IRadioDataResponse.setDataThrottlingResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setDataThrottling(int serial, byte dataThrottlingAction, long completionDurationMillis) throws android.os.RemoteException
    {
    }
    /**
     * Set an APN to initial attach network or clear the existing initial attach APN.
     * 
     * @param serial Serial number of request.
     * @param dataProfileInfo Data profile containing APN settings or null to clear the existing
     *        initial attach APN.
     * 
     * Response function is IRadioDataResponse.setInitialAttachApnResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setInitialAttachApn(int serial, android.hardware.radio.data.DataProfileInfo dataProfileInfo) throws android.os.RemoteException
    {
    }
    /**
     * Set response functions for data radio requests and indications.
     * 
     * @param radioDataResponse Object containing response functions
     * @param radioDataIndication Object containing radio indications
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setResponseFunctions(android.hardware.radio.data.IRadioDataResponse radioDataResponse, android.hardware.radio.data.IRadioDataIndication radioDataIndication) throws android.os.RemoteException
    {
    }
    /**
     * Setup a packet data connection. If DataCallResponse.status returns DataCallFailCause:NONE,
     * the data connection must be added to data calls and a unsolDataCallListChanged() must be
     * sent. The call remains until removed by subsequent unsolDataCallIstChanged(). It may be lost
     * due to many factors, including deactivateDataCall() being issued, the radio powered off,
     * reception lost or even transient factors like congestion. This data call list is returned by
     * getDataCallList() and dataCallListChanged().
     * The Radio is expected to:
     * - Create one data call context.
     * - Create and configure a dedicated interface for the context.
     * - The interface must be point to point.
     * - The interface is configured with one or more addresses and is capable of sending and
     *   receiving packets. The format is IP address with optional "/" prefix length (The format is
     *   defined in RFC-4291 section 2.3). For example, "192.0.1.3", "192.0.1.11/16", or
     *   "2001:db8::1/64". Typically one IPv4 or one IPv6 or one of each. If the prefix length is
     *   absent, then the addresses are assumed to be point to point with IPv4 with prefix length 32
     *   or IPv6 with prefix length 128.
     * - Must not modify routing configuration related to this interface; routing management is
     *   exclusively within the purview of the Android OS.
     * - Support simultaneous data call context, with limits defined in the specifications. For LTE,
     *   the max number of data calls is equal to the max number of EPS bearers that can be active.
     * 
     * @param serial Serial number of request.
     * @param accessNetwork The access network to setup the data call. If the data connection cannot
     *        be established on the specified access network then this should respond with an error.
     * @param dataProfileInfo Data profile info.
     * @param roamingAllowed Indicates whether or not data roaming is allowed by the user.
     * @param reason The request reason. Must be DataRequestReason:NORMAL or
     *        DataRequestReason:HANDOVER.
     * @param addresses If the reason is DataRequestReason:HANDOVER, this indicates the list of link
     *        addresses of the existing data connection. This parameter must be ignored unless
     *        reason is DataRequestReason:HANDOVER.
     * @param dnses If the reason is DataRequestReason:HANDOVER, this indicates the list of DNS
     *        addresses of the existing data connection. The format is defined in RFC-4291 section
     *        2.2. For example, "192.0.1.3" or "2001:db8::1". This parameter must be ignored unless
     *        reason is DataRequestReason:HANDOVER.
     * @param pduSessionId The pdu session id to be used for this data call. A value of 0 means no
     *        pdu session id was attached to this call. Reference: 3GPP TS 24.007 section 11.2.3.1b
     * @param sliceInfo SliceInfo to be used for the data connection when a handover occurs from
     *        EPDG to 5G. It is valid only when accessNetwork is AccessNetwork:NGRAN. If the slice
     *        passed from EPDG is rejected, then the data failure cause must be
     *        DataCallFailCause:SLICE_REJECTED.
     * @param matchAllRuleAllowed bool to indicate if using default match-all URSP rule for this
     *        request is allowed. If false, this request must not use the match-all URSP rule and if
     *        a non-match-all rule is not found (or if URSP rules are not available) it should
     *        return failure with cause DataCallFailCause:MATCH_ALL_RULE_NOT_ALLOWED. This is needed
     *        as some requests need to have a hard failure if the intention cannot be met, for
     *        example, a zero-rating slice.
     * 
     * Response function is IRadioDataResponse.setupDataCallResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setupDataCall(int serial, int accessNetwork, android.hardware.radio.data.DataProfileInfo dataProfileInfo, boolean roamingAllowed, int reason, android.hardware.radio.data.LinkAddress[] addresses, java.lang.String[] dnses, int pduSessionId, android.hardware.radio.data.SliceInfo sliceInfo, boolean matchAllRuleAllowed) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that a handover to the IWLAN transport has begun. Any resources being transferred
     * to the IWLAN transport cannot be released while a handover is underway. For example, if a
     * pdu session id needs to be transferred to IWLAN, then the modem should not release the id
     * while the handover is in progress. If a handover was unsuccessful, then the framework calls
     * IRadio::cancelHandover. The modem retains ownership over any of the resources being
     * transferred to IWLAN. If a handover was successful, the framework calls
     * IRadio::deactivateDataCall with reason HANDOVER. The IWLAN transport now owns the transferred
     * resources and is responsible for releasing them.
     * 
     * @param serial Serial number of request.
     * @param id callId The identifier of the data call which is provided in SetupDataCallResult
     * 
     * Response function is IRadioDataResponse.startHandoverResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void startHandover(int serial, int callId) throws android.os.RemoteException
    {
    }
    /**
     * Start a Keepalive session (for IPsec)
     * 
     * @param serial Serial number of request.
     * @param keepalive A request structure containing all necessary info to describe a keepalive
     * 
     * Response function is IRadioDataResponse.startKeepaliveResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void startKeepalive(int serial, android.hardware.radio.data.KeepaliveRequest keepalive) throws android.os.RemoteException
    {
    }
    /**
     * Stop an ongoing Keepalive session (for IPsec)
     * 
     * @param serial Serial number of request.
     * @param sessionHandle The handle that was provided by
     *        IRadioDataResponse.startKeepaliveResponse
     * 
     * Response function is IRadioDataResponse.stopKeepaliveResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void stopKeepalive(int serial, int sessionHandle) throws android.os.RemoteException
    {
    }
    /**
     * Set the user data setting to the modem. This API is for informational purposes. The modem
     * must not block any subsequent setup data call requests.
     * 
     * @param serial Serial number of request.
     * @param enabled Whether the user mobile data is enabled.
     * 
     * Response function is IRadioDataResponse.setUserDataEnabledResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setUserDataEnabled(int serial, boolean enabled) throws android.os.RemoteException
    {
    }
    /**
     * Set the user data roaming setting to the modem. This API is for informational purposes. The
     * modem must not block any subsequent setup data call requests.
     * 
     * @param serial Serial number of request.
     * @param enabled Whether the user mobile data roaming is enabled.
     * 
     * Response function is IRadioDataResponse.setUserDataRoamingEnabledResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void setUserDataRoamingEnabled(int serial, boolean enabled) throws android.os.RemoteException
    {
    }
    /**
     * Notify IMS data network to the modem.
     * 
     * @param serial Serial number of request.
     * @param accessNetwork The access network type.
     * @param dataNetworkState The data network connection state.
     * @param physicalTransportType The physical transport type of the data network.
     * @param physicalNetworkModemId The logic modem ID while the physical transport type is WWAN.
     *        If the physical transport type is WLAN, this modem ID will be -1.
     * 
     * Response function is IRadioDataResponse.notifyImsDataNetworkResponse()
     * 
     * This is available when android.hardware.telephony.data is defined.
     */
    @Override public void notifyImsDataNetwork(int serial, int accessNetwork, int dataNetworkState, int physicalTransportType, int physicalNetworkModemId) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.data.IRadioData
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.data.IRadioData interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.data.IRadioData asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.data.IRadioData))) {
        return ((android.hardware.radio.data.IRadioData)iin);
      }
      return new android.hardware.radio.data.IRadioData.Stub.Proxy(obj);
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
        case TRANSACTION_allocatePduSessionId:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.allocatePduSessionId(_arg0);
          break;
        }
        case TRANSACTION_cancelHandover:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.cancelHandover(_arg0, _arg1);
          break;
        }
        case TRANSACTION_deactivateDataCall:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.deactivateDataCall(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_getDataCallList:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getDataCallList(_arg0);
          break;
        }
        case TRANSACTION_getSlicingConfig:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSlicingConfig(_arg0);
          break;
        }
        case TRANSACTION_releasePduSessionId:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.releasePduSessionId(_arg0, _arg1);
          break;
        }
        case TRANSACTION_responseAcknowledgement:
        {
          this.responseAcknowledgement();
          break;
        }
        case TRANSACTION_setDataAllowed:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setDataAllowed(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setDataProfile:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.DataProfileInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.data.DataProfileInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setDataProfile(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setDataThrottling:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte _arg1;
          _arg1 = data.readByte();
          long _arg2;
          _arg2 = data.readLong();
          data.enforceNoDataAvail();
          this.setDataThrottling(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_setInitialAttachApn:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.DataProfileInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.DataProfileInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setInitialAttachApn(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setResponseFunctions:
        {
          android.hardware.radio.data.IRadioDataResponse _arg0;
          _arg0 = android.hardware.radio.data.IRadioDataResponse.Stub.asInterface(data.readStrongBinder());
          android.hardware.radio.data.IRadioDataIndication _arg1;
          _arg1 = android.hardware.radio.data.IRadioDataIndication.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setResponseFunctions(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setupDataCall:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          android.hardware.radio.data.DataProfileInfo _arg2;
          _arg2 = data.readTypedObject(android.hardware.radio.data.DataProfileInfo.CREATOR);
          boolean _arg3;
          _arg3 = data.readBoolean();
          int _arg4;
          _arg4 = data.readInt();
          android.hardware.radio.data.LinkAddress[] _arg5;
          _arg5 = data.createTypedArray(android.hardware.radio.data.LinkAddress.CREATOR);
          java.lang.String[] _arg6;
          _arg6 = data.createStringArray();
          int _arg7;
          _arg7 = data.readInt();
          android.hardware.radio.data.SliceInfo _arg8;
          _arg8 = data.readTypedObject(android.hardware.radio.data.SliceInfo.CREATOR);
          boolean _arg9;
          _arg9 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setupDataCall(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6, _arg7, _arg8, _arg9);
          break;
        }
        case TRANSACTION_startHandover:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.startHandover(_arg0, _arg1);
          break;
        }
        case TRANSACTION_startKeepalive:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.data.KeepaliveRequest _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.data.KeepaliveRequest.CREATOR);
          data.enforceNoDataAvail();
          this.startKeepalive(_arg0, _arg1);
          break;
        }
        case TRANSACTION_stopKeepalive:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.stopKeepalive(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setUserDataEnabled:
        {
          if (true) {
            throw new android.os.RemoteException("Method setUserDataEnabled is unimplemented.");
          }
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setUserDataEnabled(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setUserDataRoamingEnabled:
        {
          if (true) {
            throw new android.os.RemoteException("Method setUserDataRoamingEnabled is unimplemented.");
          }
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setUserDataRoamingEnabled(_arg0, _arg1);
          break;
        }
        case TRANSACTION_notifyImsDataNetwork:
        {
          if (true) {
            throw new android.os.RemoteException("Method notifyImsDataNetwork is unimplemented.");
          }
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
          this.notifyImsDataNetwork(_arg0, _arg1, _arg2, _arg3, _arg4);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.data.IRadioData
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
       * Reserves an unallocated pdu session id from the pool of ids. The allocated id is returned
       * in the response. When the id is no longer needed, call releasePduSessionId to return it to
       * the pool.
       * 
       * Reference: 3GPP TS 24.007 section 11.2.3.1b
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioDataResponse.allocatePduSessionIdResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void allocatePduSessionId(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_allocatePduSessionId, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method allocatePduSessionId is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that a handover was cancelled after a call to IRadioData::startHandover.
       * Since the handover was unsuccessful, the modem retains ownership over any of the resources
       * being transferred and is still responsible for releasing them.
       * 
       * @param serial Serial number of request.
       * @param id callId The identifier of the data call which is provided in SetupDataCallResult
       * 
       * Response function is IRadioDataResponse.cancelHandoverResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void cancelHandover(int serial, int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelHandover, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cancelHandover is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Deactivate packet data connection and remove from the data call list. An
       * unsolDataCallListChanged() must be sent when data connection is deactivated.
       * Any return value other than RadioError::NONE will remove the network from the list.
       * 
       * @param serial Serial number of request.
       * @param cid Data call id.
       * @param reason The request reason. Must be normal, handover, or shutdown.
       * 
       * Response function is IRadioDataResponse.deactivateDataCallResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void deactivateDataCall(int serial, int cid, int reason) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(cid);
          _data.writeInt(reason);
          boolean _status = mRemote.transact(Stub.TRANSACTION_deactivateDataCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method deactivateDataCall is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Returns the data call list. An entry is added when a setupDataCall() is issued and removed
       * on a deactivateDataCall(). The list is emptied when the vendor HAL crashes.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioDataResponse.getDataCallListResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void getDataCallList(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDataCallList, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getDataCallList is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request to get the current slicing configuration including URSP rules and NSSAIs
       * (configured, allowed and rejected). URSP stands for UE route selection policy and is defined
       * in 3GPP TS 24.526 Section 4.2. An NSSAI is a collection of network slices. Each network slice
       * is identified by an S-NSSAI and is represented by the struct SliceInfo. NSSAI and S-NSSAI
       * are defined in 3GPP TS 24.501.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioDataResponse.getSlicingConfigResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void getSlicingConfig(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSlicingConfig, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSlicingConfig is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Releases a pdu session id that was previously allocated using allocatePduSessionId.
       * Reference: 3GPP TS 24.007 section 11.2.3.1b
       * 
       * @param serial Serial number of request.
       * @param id Pdu session id to release.
       * 
       * Response function is IRadioDataResponse.releasePduSessionIdResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void releasePduSessionId(int serial, int id) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(id);
          boolean _status = mRemote.transact(Stub.TRANSACTION_releasePduSessionId, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method releasePduSessionId is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * When response type received from a radio indication or radio response is
       * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
       * acknowledge the receipt of those messages by sending responseAcknowledgement().
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void responseAcknowledgement() throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          boolean _status = mRemote.transact(Stub.TRANSACTION_responseAcknowledgement, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method responseAcknowledgement is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Tells the modem whether data calls are allowed or not
       * 
       * @param serial Serial number of request.
       * @param allow true to allow data calls, false to disallow data calls
       * 
       * Response function is IRadioDataResponse.setDataAllowedResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setDataAllowed(int serial, boolean allow) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(allow);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataAllowed, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setDataAllowed is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send data profiles of the current carrier to the modem.
       * 
       * @param serial Serial number of request.
       * @param profiles Array of DataProfileInfo to set.
       * 
       * Response function is IRadioDataResponse.setDataProfileResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setDataProfile(int serial, android.hardware.radio.data.DataProfileInfo[] profiles) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(profiles, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataProfile, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setDataProfile is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Control data throttling at modem.
       * - DataThrottlingAction:NO_DATA_THROTTLING should clear any existing data throttling within
       *   the requested completion window.
       * - DataThrottlingAction:THROTTLE_SECONDARY_CARRIER: Remove any existing throttling on anchor
       *   carrier and achieve maximum data throttling on secondary carrier within the requested
       *   completion window.
       * - DataThrottlingAction:THROTTLE_ANCHOR_CARRIER: disable secondary carrier and achieve maximum
       *   data throttling on anchor carrier by requested completion window.
       * - DataThrottlingAction:HOLD: Immediately hold on to current level of throttling.
       * 
       * @param serial Serial number of request.
       * @param dataThrottlingAction DataThrottlingAction as defined in types.hal
       * @param completionDurationMillis window, in milliseconds, in which the requested throttling
       *        action has to be achieved. This must be 0 when dataThrottlingAction is
       *        DataThrottlingAction:HOLD.
       * 
       * Response function is IRadioDataResponse.setDataThrottlingResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setDataThrottling(int serial, byte dataThrottlingAction, long completionDurationMillis) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeByte(dataThrottlingAction);
          _data.writeLong(completionDurationMillis);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setDataThrottling, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setDataThrottling is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set an APN to initial attach network or clear the existing initial attach APN.
       * 
       * @param serial Serial number of request.
       * @param dataProfileInfo Data profile containing APN settings or null to clear the existing
       *        initial attach APN.
       * 
       * Response function is IRadioDataResponse.setInitialAttachApnResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setInitialAttachApn(int serial, android.hardware.radio.data.DataProfileInfo dataProfileInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(dataProfileInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setInitialAttachApn, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setInitialAttachApn is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set response functions for data radio requests and indications.
       * 
       * @param radioDataResponse Object containing response functions
       * @param radioDataIndication Object containing radio indications
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setResponseFunctions(android.hardware.radio.data.IRadioDataResponse radioDataResponse, android.hardware.radio.data.IRadioDataIndication radioDataIndication) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(radioDataResponse);
          _data.writeStrongInterface(radioDataIndication);
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
       * Setup a packet data connection. If DataCallResponse.status returns DataCallFailCause:NONE,
       * the data connection must be added to data calls and a unsolDataCallListChanged() must be
       * sent. The call remains until removed by subsequent unsolDataCallIstChanged(). It may be lost
       * due to many factors, including deactivateDataCall() being issued, the radio powered off,
       * reception lost or even transient factors like congestion. This data call list is returned by
       * getDataCallList() and dataCallListChanged().
       * The Radio is expected to:
       * - Create one data call context.
       * - Create and configure a dedicated interface for the context.
       * - The interface must be point to point.
       * - The interface is configured with one or more addresses and is capable of sending and
       *   receiving packets. The format is IP address with optional "/" prefix length (The format is
       *   defined in RFC-4291 section 2.3). For example, "192.0.1.3", "192.0.1.11/16", or
       *   "2001:db8::1/64". Typically one IPv4 or one IPv6 or one of each. If the prefix length is
       *   absent, then the addresses are assumed to be point to point with IPv4 with prefix length 32
       *   or IPv6 with prefix length 128.
       * - Must not modify routing configuration related to this interface; routing management is
       *   exclusively within the purview of the Android OS.
       * - Support simultaneous data call context, with limits defined in the specifications. For LTE,
       *   the max number of data calls is equal to the max number of EPS bearers that can be active.
       * 
       * @param serial Serial number of request.
       * @param accessNetwork The access network to setup the data call. If the data connection cannot
       *        be established on the specified access network then this should respond with an error.
       * @param dataProfileInfo Data profile info.
       * @param roamingAllowed Indicates whether or not data roaming is allowed by the user.
       * @param reason The request reason. Must be DataRequestReason:NORMAL or
       *        DataRequestReason:HANDOVER.
       * @param addresses If the reason is DataRequestReason:HANDOVER, this indicates the list of link
       *        addresses of the existing data connection. This parameter must be ignored unless
       *        reason is DataRequestReason:HANDOVER.
       * @param dnses If the reason is DataRequestReason:HANDOVER, this indicates the list of DNS
       *        addresses of the existing data connection. The format is defined in RFC-4291 section
       *        2.2. For example, "192.0.1.3" or "2001:db8::1". This parameter must be ignored unless
       *        reason is DataRequestReason:HANDOVER.
       * @param pduSessionId The pdu session id to be used for this data call. A value of 0 means no
       *        pdu session id was attached to this call. Reference: 3GPP TS 24.007 section 11.2.3.1b
       * @param sliceInfo SliceInfo to be used for the data connection when a handover occurs from
       *        EPDG to 5G. It is valid only when accessNetwork is AccessNetwork:NGRAN. If the slice
       *        passed from EPDG is rejected, then the data failure cause must be
       *        DataCallFailCause:SLICE_REJECTED.
       * @param matchAllRuleAllowed bool to indicate if using default match-all URSP rule for this
       *        request is allowed. If false, this request must not use the match-all URSP rule and if
       *        a non-match-all rule is not found (or if URSP rules are not available) it should
       *        return failure with cause DataCallFailCause:MATCH_ALL_RULE_NOT_ALLOWED. This is needed
       *        as some requests need to have a hard failure if the intention cannot be met, for
       *        example, a zero-rating slice.
       * 
       * Response function is IRadioDataResponse.setupDataCallResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setupDataCall(int serial, int accessNetwork, android.hardware.radio.data.DataProfileInfo dataProfileInfo, boolean roamingAllowed, int reason, android.hardware.radio.data.LinkAddress[] addresses, java.lang.String[] dnses, int pduSessionId, android.hardware.radio.data.SliceInfo sliceInfo, boolean matchAllRuleAllowed) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(accessNetwork);
          _data.writeTypedObject(dataProfileInfo, 0);
          _data.writeBoolean(roamingAllowed);
          _data.writeInt(reason);
          _data.writeTypedArray(addresses, 0);
          _data.writeStringArray(dnses);
          _data.writeInt(pduSessionId);
          _data.writeTypedObject(sliceInfo, 0);
          _data.writeBoolean(matchAllRuleAllowed);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setupDataCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setupDataCall is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that a handover to the IWLAN transport has begun. Any resources being transferred
       * to the IWLAN transport cannot be released while a handover is underway. For example, if a
       * pdu session id needs to be transferred to IWLAN, then the modem should not release the id
       * while the handover is in progress. If a handover was unsuccessful, then the framework calls
       * IRadio::cancelHandover. The modem retains ownership over any of the resources being
       * transferred to IWLAN. If a handover was successful, the framework calls
       * IRadio::deactivateDataCall with reason HANDOVER. The IWLAN transport now owns the transferred
       * resources and is responsible for releasing them.
       * 
       * @param serial Serial number of request.
       * @param id callId The identifier of the data call which is provided in SetupDataCallResult
       * 
       * Response function is IRadioDataResponse.startHandoverResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void startHandover(int serial, int callId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(callId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startHandover, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startHandover is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Start a Keepalive session (for IPsec)
       * 
       * @param serial Serial number of request.
       * @param keepalive A request structure containing all necessary info to describe a keepalive
       * 
       * Response function is IRadioDataResponse.startKeepaliveResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void startKeepalive(int serial, android.hardware.radio.data.KeepaliveRequest keepalive) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(keepalive, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startKeepalive, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startKeepalive is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Stop an ongoing Keepalive session (for IPsec)
       * 
       * @param serial Serial number of request.
       * @param sessionHandle The handle that was provided by
       *        IRadioDataResponse.startKeepaliveResponse
       * 
       * Response function is IRadioDataResponse.stopKeepaliveResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void stopKeepalive(int serial, int sessionHandle) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(sessionHandle);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopKeepalive, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopKeepalive is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set the user data setting to the modem. This API is for informational purposes. The modem
       * must not block any subsequent setup data call requests.
       * 
       * @param serial Serial number of request.
       * @param enabled Whether the user mobile data is enabled.
       * 
       * Response function is IRadioDataResponse.setUserDataEnabledResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setUserDataEnabled(int serial, boolean enabled) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method setUserDataEnabled is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUserDataEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setUserDataEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set the user data roaming setting to the modem. This API is for informational purposes. The
       * modem must not block any subsequent setup data call requests.
       * 
       * @param serial Serial number of request.
       * @param enabled Whether the user mobile data roaming is enabled.
       * 
       * Response function is IRadioDataResponse.setUserDataRoamingEnabledResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void setUserDataRoamingEnabled(int serial, boolean enabled) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method setUserDataRoamingEnabled is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUserDataRoamingEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setUserDataRoamingEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Notify IMS data network to the modem.
       * 
       * @param serial Serial number of request.
       * @param accessNetwork The access network type.
       * @param dataNetworkState The data network connection state.
       * @param physicalTransportType The physical transport type of the data network.
       * @param physicalNetworkModemId The logic modem ID while the physical transport type is WWAN.
       *        If the physical transport type is WLAN, this modem ID will be -1.
       * 
       * Response function is IRadioDataResponse.notifyImsDataNetworkResponse()
       * 
       * This is available when android.hardware.telephony.data is defined.
       */
      @Override public void notifyImsDataNetwork(int serial, int accessNetwork, int dataNetworkState, int physicalTransportType, int physicalNetworkModemId) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method notifyImsDataNetwork is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(accessNetwork);
          _data.writeInt(dataNetworkState);
          _data.writeInt(physicalTransportType);
          _data.writeInt(physicalNetworkModemId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_notifyImsDataNetwork, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method notifyImsDataNetwork is unimplemented.");
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
    static final int TRANSACTION_allocatePduSessionId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_cancelHandover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_deactivateDataCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getDataCallList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getSlicingConfig = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_releasePduSessionId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_responseAcknowledgement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_setDataAllowed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_setDataProfile = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_setDataThrottling = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_setInitialAttachApn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_setResponseFunctions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_setupDataCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_startHandover = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_startKeepalive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_stopKeepalive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setUserDataEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setUserDataRoamingEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_notifyImsDataNetwork = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$data$IRadioData".replace('$', '.');
  /**
   * Reserves an unallocated pdu session id from the pool of ids. The allocated id is returned
   * in the response. When the id is no longer needed, call releasePduSessionId to return it to
   * the pool.
   * 
   * Reference: 3GPP TS 24.007 section 11.2.3.1b
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioDataResponse.allocatePduSessionIdResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void allocatePduSessionId(int serial) throws android.os.RemoteException;
  /**
   * Indicates that a handover was cancelled after a call to IRadioData::startHandover.
   * Since the handover was unsuccessful, the modem retains ownership over any of the resources
   * being transferred and is still responsible for releasing them.
   * 
   * @param serial Serial number of request.
   * @param id callId The identifier of the data call which is provided in SetupDataCallResult
   * 
   * Response function is IRadioDataResponse.cancelHandoverResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void cancelHandover(int serial, int callId) throws android.os.RemoteException;
  /**
   * Deactivate packet data connection and remove from the data call list. An
   * unsolDataCallListChanged() must be sent when data connection is deactivated.
   * Any return value other than RadioError::NONE will remove the network from the list.
   * 
   * @param serial Serial number of request.
   * @param cid Data call id.
   * @param reason The request reason. Must be normal, handover, or shutdown.
   * 
   * Response function is IRadioDataResponse.deactivateDataCallResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void deactivateDataCall(int serial, int cid, int reason) throws android.os.RemoteException;
  /**
   * Returns the data call list. An entry is added when a setupDataCall() is issued and removed
   * on a deactivateDataCall(). The list is emptied when the vendor HAL crashes.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioDataResponse.getDataCallListResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void getDataCallList(int serial) throws android.os.RemoteException;
  /**
   * Request to get the current slicing configuration including URSP rules and NSSAIs
   * (configured, allowed and rejected). URSP stands for UE route selection policy and is defined
   * in 3GPP TS 24.526 Section 4.2. An NSSAI is a collection of network slices. Each network slice
   * is identified by an S-NSSAI and is represented by the struct SliceInfo. NSSAI and S-NSSAI
   * are defined in 3GPP TS 24.501.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioDataResponse.getSlicingConfigResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void getSlicingConfig(int serial) throws android.os.RemoteException;
  /**
   * Releases a pdu session id that was previously allocated using allocatePduSessionId.
   * Reference: 3GPP TS 24.007 section 11.2.3.1b
   * 
   * @param serial Serial number of request.
   * @param id Pdu session id to release.
   * 
   * Response function is IRadioDataResponse.releasePduSessionIdResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void releasePduSessionId(int serial, int id) throws android.os.RemoteException;
  /**
   * When response type received from a radio indication or radio response is
   * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
   * acknowledge the receipt of those messages by sending responseAcknowledgement().
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void responseAcknowledgement() throws android.os.RemoteException;
  /**
   * Tells the modem whether data calls are allowed or not
   * 
   * @param serial Serial number of request.
   * @param allow true to allow data calls, false to disallow data calls
   * 
   * Response function is IRadioDataResponse.setDataAllowedResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setDataAllowed(int serial, boolean allow) throws android.os.RemoteException;
  /**
   * Send data profiles of the current carrier to the modem.
   * 
   * @param serial Serial number of request.
   * @param profiles Array of DataProfileInfo to set.
   * 
   * Response function is IRadioDataResponse.setDataProfileResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setDataProfile(int serial, android.hardware.radio.data.DataProfileInfo[] profiles) throws android.os.RemoteException;
  /**
   * Control data throttling at modem.
   * - DataThrottlingAction:NO_DATA_THROTTLING should clear any existing data throttling within
   *   the requested completion window.
   * - DataThrottlingAction:THROTTLE_SECONDARY_CARRIER: Remove any existing throttling on anchor
   *   carrier and achieve maximum data throttling on secondary carrier within the requested
   *   completion window.
   * - DataThrottlingAction:THROTTLE_ANCHOR_CARRIER: disable secondary carrier and achieve maximum
   *   data throttling on anchor carrier by requested completion window.
   * - DataThrottlingAction:HOLD: Immediately hold on to current level of throttling.
   * 
   * @param serial Serial number of request.
   * @param dataThrottlingAction DataThrottlingAction as defined in types.hal
   * @param completionDurationMillis window, in milliseconds, in which the requested throttling
   *        action has to be achieved. This must be 0 when dataThrottlingAction is
   *        DataThrottlingAction:HOLD.
   * 
   * Response function is IRadioDataResponse.setDataThrottlingResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setDataThrottling(int serial, byte dataThrottlingAction, long completionDurationMillis) throws android.os.RemoteException;
  /**
   * Set an APN to initial attach network or clear the existing initial attach APN.
   * 
   * @param serial Serial number of request.
   * @param dataProfileInfo Data profile containing APN settings or null to clear the existing
   *        initial attach APN.
   * 
   * Response function is IRadioDataResponse.setInitialAttachApnResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setInitialAttachApn(int serial, android.hardware.radio.data.DataProfileInfo dataProfileInfo) throws android.os.RemoteException;
  /**
   * Set response functions for data radio requests and indications.
   * 
   * @param radioDataResponse Object containing response functions
   * @param radioDataIndication Object containing radio indications
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setResponseFunctions(android.hardware.radio.data.IRadioDataResponse radioDataResponse, android.hardware.radio.data.IRadioDataIndication radioDataIndication) throws android.os.RemoteException;
  /**
   * Setup a packet data connection. If DataCallResponse.status returns DataCallFailCause:NONE,
   * the data connection must be added to data calls and a unsolDataCallListChanged() must be
   * sent. The call remains until removed by subsequent unsolDataCallIstChanged(). It may be lost
   * due to many factors, including deactivateDataCall() being issued, the radio powered off,
   * reception lost or even transient factors like congestion. This data call list is returned by
   * getDataCallList() and dataCallListChanged().
   * The Radio is expected to:
   * - Create one data call context.
   * - Create and configure a dedicated interface for the context.
   * - The interface must be point to point.
   * - The interface is configured with one or more addresses and is capable of sending and
   *   receiving packets. The format is IP address with optional "/" prefix length (The format is
   *   defined in RFC-4291 section 2.3). For example, "192.0.1.3", "192.0.1.11/16", or
   *   "2001:db8::1/64". Typically one IPv4 or one IPv6 or one of each. If the prefix length is
   *   absent, then the addresses are assumed to be point to point with IPv4 with prefix length 32
   *   or IPv6 with prefix length 128.
   * - Must not modify routing configuration related to this interface; routing management is
   *   exclusively within the purview of the Android OS.
   * - Support simultaneous data call context, with limits defined in the specifications. For LTE,
   *   the max number of data calls is equal to the max number of EPS bearers that can be active.
   * 
   * @param serial Serial number of request.
   * @param accessNetwork The access network to setup the data call. If the data connection cannot
   *        be established on the specified access network then this should respond with an error.
   * @param dataProfileInfo Data profile info.
   * @param roamingAllowed Indicates whether or not data roaming is allowed by the user.
   * @param reason The request reason. Must be DataRequestReason:NORMAL or
   *        DataRequestReason:HANDOVER.
   * @param addresses If the reason is DataRequestReason:HANDOVER, this indicates the list of link
   *        addresses of the existing data connection. This parameter must be ignored unless
   *        reason is DataRequestReason:HANDOVER.
   * @param dnses If the reason is DataRequestReason:HANDOVER, this indicates the list of DNS
   *        addresses of the existing data connection. The format is defined in RFC-4291 section
   *        2.2. For example, "192.0.1.3" or "2001:db8::1". This parameter must be ignored unless
   *        reason is DataRequestReason:HANDOVER.
   * @param pduSessionId The pdu session id to be used for this data call. A value of 0 means no
   *        pdu session id was attached to this call. Reference: 3GPP TS 24.007 section 11.2.3.1b
   * @param sliceInfo SliceInfo to be used for the data connection when a handover occurs from
   *        EPDG to 5G. It is valid only when accessNetwork is AccessNetwork:NGRAN. If the slice
   *        passed from EPDG is rejected, then the data failure cause must be
   *        DataCallFailCause:SLICE_REJECTED.
   * @param matchAllRuleAllowed bool to indicate if using default match-all URSP rule for this
   *        request is allowed. If false, this request must not use the match-all URSP rule and if
   *        a non-match-all rule is not found (or if URSP rules are not available) it should
   *        return failure with cause DataCallFailCause:MATCH_ALL_RULE_NOT_ALLOWED. This is needed
   *        as some requests need to have a hard failure if the intention cannot be met, for
   *        example, a zero-rating slice.
   * 
   * Response function is IRadioDataResponse.setupDataCallResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setupDataCall(int serial, int accessNetwork, android.hardware.radio.data.DataProfileInfo dataProfileInfo, boolean roamingAllowed, int reason, android.hardware.radio.data.LinkAddress[] addresses, java.lang.String[] dnses, int pduSessionId, android.hardware.radio.data.SliceInfo sliceInfo, boolean matchAllRuleAllowed) throws android.os.RemoteException;
  /**
   * Indicates that a handover to the IWLAN transport has begun. Any resources being transferred
   * to the IWLAN transport cannot be released while a handover is underway. For example, if a
   * pdu session id needs to be transferred to IWLAN, then the modem should not release the id
   * while the handover is in progress. If a handover was unsuccessful, then the framework calls
   * IRadio::cancelHandover. The modem retains ownership over any of the resources being
   * transferred to IWLAN. If a handover was successful, the framework calls
   * IRadio::deactivateDataCall with reason HANDOVER. The IWLAN transport now owns the transferred
   * resources and is responsible for releasing them.
   * 
   * @param serial Serial number of request.
   * @param id callId The identifier of the data call which is provided in SetupDataCallResult
   * 
   * Response function is IRadioDataResponse.startHandoverResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void startHandover(int serial, int callId) throws android.os.RemoteException;
  /**
   * Start a Keepalive session (for IPsec)
   * 
   * @param serial Serial number of request.
   * @param keepalive A request structure containing all necessary info to describe a keepalive
   * 
   * Response function is IRadioDataResponse.startKeepaliveResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void startKeepalive(int serial, android.hardware.radio.data.KeepaliveRequest keepalive) throws android.os.RemoteException;
  /**
   * Stop an ongoing Keepalive session (for IPsec)
   * 
   * @param serial Serial number of request.
   * @param sessionHandle The handle that was provided by
   *        IRadioDataResponse.startKeepaliveResponse
   * 
   * Response function is IRadioDataResponse.stopKeepaliveResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void stopKeepalive(int serial, int sessionHandle) throws android.os.RemoteException;
  /**
   * Set the user data setting to the modem. This API is for informational purposes. The modem
   * must not block any subsequent setup data call requests.
   * 
   * @param serial Serial number of request.
   * @param enabled Whether the user mobile data is enabled.
   * 
   * Response function is IRadioDataResponse.setUserDataEnabledResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setUserDataEnabled(int serial, boolean enabled) throws android.os.RemoteException;
  /**
   * Set the user data roaming setting to the modem. This API is for informational purposes. The
   * modem must not block any subsequent setup data call requests.
   * 
   * @param serial Serial number of request.
   * @param enabled Whether the user mobile data roaming is enabled.
   * 
   * Response function is IRadioDataResponse.setUserDataRoamingEnabledResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void setUserDataRoamingEnabled(int serial, boolean enabled) throws android.os.RemoteException;
  /**
   * Notify IMS data network to the modem.
   * 
   * @param serial Serial number of request.
   * @param accessNetwork The access network type.
   * @param dataNetworkState The data network connection state.
   * @param physicalTransportType The physical transport type of the data network.
   * @param physicalNetworkModemId The logic modem ID while the physical transport type is WWAN.
   *        If the physical transport type is WLAN, this modem ID will be -1.
   * 
   * Response function is IRadioDataResponse.notifyImsDataNetworkResponse()
   * 
   * This is available when android.hardware.telephony.data is defined.
   */
  public void notifyImsDataNetwork(int serial, int accessNetwork, int dataNetworkState, int physicalTransportType, int physicalNetworkModemId) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
