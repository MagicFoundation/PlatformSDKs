/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/4 --previous_hash 576f05d082e9269bcf773b0c9b9112d507ab4b9a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen/android/hardware/radio/voice/IRadioVoiceResponse.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/voice/IRadioVoiceResponse.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/**
 * Interface declaring response functions to solicited radio requests for voice APIs.
 * @hide
 */
public interface IRadioVoiceResponse extends android.os.IInterface
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
  public static final String HASH = "576f05d082e9269bcf773b0c9b9112d507ab4b9a";
  /** Default implementation for IRadioVoiceResponse. */
  public static class Default implements android.hardware.radio.voice.IRadioVoiceResponse
  {
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void acceptCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Acknowledge the receipt of radio request sent to the vendor. This must be sent only for
     * radio request which take long time to respond. For more details, refer
     * https://source.android.com/devices/tech/connect/ril.html
     * 
     * @param serial Serial no. of the request whose acknowledgement is sent.
     */
    @Override public void acknowledgeRequest(int serial) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SIM_BUSY
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:INVALID_STATE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void cancelPendingUssdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_STATE
     *   RadioError:INVALID_CALL_ID
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void conferenceResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:DIAL_MODIFIED_TO_USSD
     *   RadioError:DIAL_MODIFIED_TO_SS
     *   RadioError:DIAL_MODIFIED_TO_DIAL
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:INVALID_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:INTERNAL_ERR
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:MODEM_ERR
     *   RadioError:NO_SUBSCRIPTION
     *   RadioError:NO_NETWORK_FOUND
     *   RadioError:INVALID_CALL_ID
     *   RadioError:DEVICE_IN_USE
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:ABORTED
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:CANCELLED
     */
    @Override public void dialResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:DIAL_MODIFIED_TO_USSD
     *   RadioError:DIAL_MODIFIED_TO_SS
     *   RadioError:DIAL_MODIFIED_TO_DIAL
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:INTERNAL_ERR
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:MODEM_ERR
     *   RadioError:NO_SUBSCRIPTION
     *   RadioError:NO_NETWORK_FOUND
     *   RadioError:INVALID_CALL_ID
     *   RadioError:DEVICE_IN_USE
     *   RadioError:ABORTED
     *   RadioError:INVALID_MODEM_STATE
     */
    @Override public void emergencyDialResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:OPERATION_NO_ALLOWED
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     */
    @Override public void exitEmergencyCallbackModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:INVALID_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void explicitCallTransferResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param callForwardInfos points to a vector of CallForwardInfo, one for each distinct
     *        registered phone number. For example, if data is forwarded to +18005551212 and voice
     *        is forwarded to +18005559999, then two separate CallForwardInfo's must be returned.
     *        However, if both data and voice are forwarded to +18005551212, then a single
     *        CallForwardInfo must be returned with the service class set to "data + voice = 3".
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getCallForwardStatusResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.CallForwardInfo[] callForwardInfos) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param enable If current call waiting state is disabled, enable = false else true
     * @param serviceClass If enable, then callWaitingResp[1] must follow, with the TS 27.007
     *        service class bit vector of services for which call waiting is enabled. For example,
     *        if callWaitingResp[0] is 1 and callWaitingResp[1] is 3, then call waiting is enabled
     *        for data and voice and disabled for everything else.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getCallWaitingResponse(android.hardware.radio.RadioResponseInfo info, boolean enable, int serviceClass) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param status indicates CLIP status
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getClipResponse(android.hardware.radio.RadioResponseInfo info, int status) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param n is "n" parameter from TS 27.007 7.7
     * @param m is "m" parameter from TS 27.007 7.7
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getClirResponse(android.hardware.radio.RadioResponseInfo info, int n, int m) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing respontype, serial no. and error
     * @param calls Current call list
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getCurrentCallsResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.Call[] calls) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param failCauseInfo Contains LastCallFailCause and vendor cause code.
     * 
     * The vendor cause code must be used for debugging purpose only. The implementation must return
     * one of the values of LastCallFailCause as mentioned below.
     * GSM failure reasons codes for the cause codes defined in TS 24.008 Annex H where possible.
     * CDMA failure reasons codes for the possible call failure scenarios described in the
     * "CDMA IS-2000 Release A (C.S0005-A v6.0)" standard.
     * Any of the following reason codes if the call is failed or dropped due to reason mentioned
     * with in the braces.
     *   LastCallFailCause:RADIO_OFF (Radio is OFF)
     *   LastCallFailCause:OUT_OF_SERVICE (No cell coverage)
     *   LastCallFailCause:NO_VALID_SIM (No valid SIM)
     *   LastCallFailCause:RADIO_INTERNAL_ERROR (Modem hit unexpected error scenario)
     *   LastCallFailCause:NETWORK_RESP_TIMEOUT (No response from network)
     *   LastCallFailCause:NETWORK_REJECT (Explicit network reject)
     *   LastCallFailCause:RADIO_ACCESS_FAILURE (RRC connection failure. Eg.RACH)
     *   LastCallFailCause:RADIO_LINK_FAILURE (Radio Link Failure)
     *   LastCallFailCause:RADIO_LINK_LOST (Radio link lost due to poor coverage)
     *   LastCallFailCause:RADIO_UPLINK_FAILURE (Radio uplink failure)
     *   LastCallFailCause:RADIO_SETUP_FAILURE (RRC connection setup failure)
     *   LastCallFailCause:RADIO_RELEASE_NORMAL (RRC connection release, normal)
     *   LastCallFailCause:RADIO_RELEASE_ABNORMAL (RRC connection release, abnormal)
     *   LastCallFailCause:ACCESS_CLASS_BLOCKED (Access class barring)
     *   LastCallFailCause:NETWORK_DETACH (Explicit network detach)
     *   OEM causes (LastCallFailCause:OEM_CAUSE_XX) must be used for debug purpose only
     * 
     * If the implementation does not have access to the exact cause codes, then it must return one
     * of the values listed in LastCallFailCause, as the UI layer needs to distinguish these cases
     * for tone generation or error notification.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:NO_MEMORY
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getLastCallFailCauseResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.LastCallFailCauseInfo failCauseinfo) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param enable true for "mute enabled" and false for "mute disabled"
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:NO_MEMORY
     *   RadioError:REQUEST_RATE_LIMITED
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getMuteResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param enable false for Standard Privacy Mode (Public Long Code Mask)
     *        true for Enhanced Privacy Mode (Private Long Code Mask)
     * 
     * Valid errors:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param mode TtyMode
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getTtyModeResponse(android.hardware.radio.RadioResponseInfo info, int mode) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     */
    @Override public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:INVALID_STATE
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void hangupConnectionResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:NO_RESOURCES
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:NO_RESOURCES
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:CANCELLED
     */
    @Override public void hangupWaitingOrBackgroundResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param enable true for "vonr enabled" and false for "vonr disabled"
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     */
    @Override public void isVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:INVALID_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void rejectCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:INVALID_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:OPERATION_NOT_ALLOWED
     */
    @Override public void sendBurstDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.cdma is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:INVALID_STATE
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:OPERATION_NOT_ALLOWED
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void sendCdmaFeatureCodeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:CANCELLED
     *   RadioError:INVALID_MODEM_STATE
     */
    @Override public void sendDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:USSD_MODIFIED_TO_DIAL
     *   RadioError:USSD_MODIFIED_TO_SS
     *   RadioError:USSD_MODIFIED_TO_USSD
     *   RadioError:SIM_BUSY
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:ABORTED
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_STATE
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void sendUssdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:INVALID_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:CANCELLED
     */
    @Override public void separateConnectionResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_STATE
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setCallForwardResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_STATE
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setCallWaitingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setClirResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:REQUEST_RATE_LIMITED
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setMuteResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setTtyModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     */
    @Override public void setVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:SYSTEM_ERR
     *   RadioError:CANCELLED
     *   RadioError:INVALID_MODEM_STATE
     */
    @Override public void startDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:NO_MEMORY
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_CALL_ID
     *   RadioError:CANCELLED
     *   RadioError:INVALID_MODEM_STATE
     */
    @Override public void stopDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_STATE
     *   RadioError:INVALID_CALL_ID
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_MODEM_STATE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.voice.IRadioVoiceResponse
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.voice.IRadioVoiceResponse interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.voice.IRadioVoiceResponse asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.voice.IRadioVoiceResponse))) {
        return ((android.hardware.radio.voice.IRadioVoiceResponse)iin);
      }
      return new android.hardware.radio.voice.IRadioVoiceResponse.Stub.Proxy(obj);
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
        case TRANSACTION_acceptCallResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.acceptCallResponse(_arg0);
          break;
        }
        case TRANSACTION_acknowledgeRequest:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.acknowledgeRequest(_arg0);
          break;
        }
        case TRANSACTION_cancelPendingUssdResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.cancelPendingUssdResponse(_arg0);
          break;
        }
        case TRANSACTION_conferenceResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.conferenceResponse(_arg0);
          break;
        }
        case TRANSACTION_dialResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.dialResponse(_arg0);
          break;
        }
        case TRANSACTION_emergencyDialResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.emergencyDialResponse(_arg0);
          break;
        }
        case TRANSACTION_exitEmergencyCallbackModeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.exitEmergencyCallbackModeResponse(_arg0);
          break;
        }
        case TRANSACTION_explicitCallTransferResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.explicitCallTransferResponse(_arg0);
          break;
        }
        case TRANSACTION_getCallForwardStatusResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.voice.CallForwardInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.voice.CallForwardInfo.CREATOR);
          data.enforceNoDataAvail();
          this.getCallForwardStatusResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getCallWaitingResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.getCallWaitingResponse(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_getClipResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.getClipResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getClirResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.getClirResponse(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_getCurrentCallsResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.voice.Call[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.voice.Call.CREATOR);
          data.enforceNoDataAvail();
          this.getCurrentCallsResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getLastCallFailCauseResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.voice.LastCallFailCauseInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.voice.LastCallFailCauseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.getLastCallFailCauseResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getMuteResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.getMuteResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getPreferredVoicePrivacyResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.getPreferredVoicePrivacyResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getTtyModeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.getTtyModeResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_handleStkCallSetupRequestFromSimResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.handleStkCallSetupRequestFromSimResponse(_arg0);
          break;
        }
        case TRANSACTION_hangupConnectionResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.hangupConnectionResponse(_arg0);
          break;
        }
        case TRANSACTION_hangupForegroundResumeBackgroundResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.hangupForegroundResumeBackgroundResponse(_arg0);
          break;
        }
        case TRANSACTION_hangupWaitingOrBackgroundResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.hangupWaitingOrBackgroundResponse(_arg0);
          break;
        }
        case TRANSACTION_isVoNrEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.isVoNrEnabledResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_rejectCallResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.rejectCallResponse(_arg0);
          break;
        }
        case TRANSACTION_sendBurstDtmfResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.sendBurstDtmfResponse(_arg0);
          break;
        }
        case TRANSACTION_sendCdmaFeatureCodeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.sendCdmaFeatureCodeResponse(_arg0);
          break;
        }
        case TRANSACTION_sendDtmfResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.sendDtmfResponse(_arg0);
          break;
        }
        case TRANSACTION_sendUssdResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.sendUssdResponse(_arg0);
          break;
        }
        case TRANSACTION_separateConnectionResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.separateConnectionResponse(_arg0);
          break;
        }
        case TRANSACTION_setCallForwardResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCallForwardResponse(_arg0);
          break;
        }
        case TRANSACTION_setCallWaitingResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCallWaitingResponse(_arg0);
          break;
        }
        case TRANSACTION_setClirResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setClirResponse(_arg0);
          break;
        }
        case TRANSACTION_setMuteResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setMuteResponse(_arg0);
          break;
        }
        case TRANSACTION_setPreferredVoicePrivacyResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setPreferredVoicePrivacyResponse(_arg0);
          break;
        }
        case TRANSACTION_setTtyModeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setTtyModeResponse(_arg0);
          break;
        }
        case TRANSACTION_setVoNrEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setVoNrEnabledResponse(_arg0);
          break;
        }
        case TRANSACTION_startDtmfResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.startDtmfResponse(_arg0);
          break;
        }
        case TRANSACTION_stopDtmfResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.stopDtmfResponse(_arg0);
          break;
        }
        case TRANSACTION_switchWaitingOrHoldingAndActiveResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.switchWaitingOrHoldingAndActiveResponse(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.voice.IRadioVoiceResponse
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void acceptCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_acceptCallResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method acceptCallResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Acknowledge the receipt of radio request sent to the vendor. This must be sent only for
       * radio request which take long time to respond. For more details, refer
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
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SIM_BUSY
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:INVALID_STATE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void cancelPendingUssdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelPendingUssdResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cancelPendingUssdResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_STATE
       *   RadioError:INVALID_CALL_ID
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void conferenceResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_conferenceResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method conferenceResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:DIAL_MODIFIED_TO_USSD
       *   RadioError:DIAL_MODIFIED_TO_SS
       *   RadioError:DIAL_MODIFIED_TO_DIAL
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:INVALID_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:INTERNAL_ERR
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:MODEM_ERR
       *   RadioError:NO_SUBSCRIPTION
       *   RadioError:NO_NETWORK_FOUND
       *   RadioError:INVALID_CALL_ID
       *   RadioError:DEVICE_IN_USE
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:ABORTED
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:CANCELLED
       */
      @Override public void dialResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dialResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method dialResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:DIAL_MODIFIED_TO_USSD
       *   RadioError:DIAL_MODIFIED_TO_SS
       *   RadioError:DIAL_MODIFIED_TO_DIAL
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:INTERNAL_ERR
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:MODEM_ERR
       *   RadioError:NO_SUBSCRIPTION
       *   RadioError:NO_NETWORK_FOUND
       *   RadioError:INVALID_CALL_ID
       *   RadioError:DEVICE_IN_USE
       *   RadioError:ABORTED
       *   RadioError:INVALID_MODEM_STATE
       */
      @Override public void emergencyDialResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_emergencyDialResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method emergencyDialResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:OPERATION_NO_ALLOWED
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       */
      @Override public void exitEmergencyCallbackModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitEmergencyCallbackModeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method exitEmergencyCallbackModeResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:INVALID_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void explicitCallTransferResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_explicitCallTransferResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method explicitCallTransferResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param callForwardInfos points to a vector of CallForwardInfo, one for each distinct
       *        registered phone number. For example, if data is forwarded to +18005551212 and voice
       *        is forwarded to +18005559999, then two separate CallForwardInfo's must be returned.
       *        However, if both data and voice are forwarded to +18005551212, then a single
       *        CallForwardInfo must be returned with the service class set to "data + voice = 3".
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getCallForwardStatusResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.CallForwardInfo[] callForwardInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(callForwardInfos, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCallForwardStatusResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCallForwardStatusResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param enable If current call waiting state is disabled, enable = false else true
       * @param serviceClass If enable, then callWaitingResp[1] must follow, with the TS 27.007
       *        service class bit vector of services for which call waiting is enabled. For example,
       *        if callWaitingResp[0] is 1 and callWaitingResp[1] is 3, then call waiting is enabled
       *        for data and voice and disabled for everything else.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getCallWaitingResponse(android.hardware.radio.RadioResponseInfo info, boolean enable, int serviceClass) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(enable);
          _data.writeInt(serviceClass);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCallWaitingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCallWaitingResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param status indicates CLIP status
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getClipResponse(android.hardware.radio.RadioResponseInfo info, int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getClipResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getClipResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param n is "n" parameter from TS 27.007 7.7
       * @param m is "m" parameter from TS 27.007 7.7
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getClirResponse(android.hardware.radio.RadioResponseInfo info, int n, int m) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(n);
          _data.writeInt(m);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getClirResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getClirResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing respontype, serial no. and error
       * @param calls Current call list
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getCurrentCallsResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.Call[] calls) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(calls, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCurrentCallsResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCurrentCallsResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param failCauseInfo Contains LastCallFailCause and vendor cause code.
       * 
       * The vendor cause code must be used for debugging purpose only. The implementation must return
       * one of the values of LastCallFailCause as mentioned below.
       * GSM failure reasons codes for the cause codes defined in TS 24.008 Annex H where possible.
       * CDMA failure reasons codes for the possible call failure scenarios described in the
       * "CDMA IS-2000 Release A (C.S0005-A v6.0)" standard.
       * Any of the following reason codes if the call is failed or dropped due to reason mentioned
       * with in the braces.
       *   LastCallFailCause:RADIO_OFF (Radio is OFF)
       *   LastCallFailCause:OUT_OF_SERVICE (No cell coverage)
       *   LastCallFailCause:NO_VALID_SIM (No valid SIM)
       *   LastCallFailCause:RADIO_INTERNAL_ERROR (Modem hit unexpected error scenario)
       *   LastCallFailCause:NETWORK_RESP_TIMEOUT (No response from network)
       *   LastCallFailCause:NETWORK_REJECT (Explicit network reject)
       *   LastCallFailCause:RADIO_ACCESS_FAILURE (RRC connection failure. Eg.RACH)
       *   LastCallFailCause:RADIO_LINK_FAILURE (Radio Link Failure)
       *   LastCallFailCause:RADIO_LINK_LOST (Radio link lost due to poor coverage)
       *   LastCallFailCause:RADIO_UPLINK_FAILURE (Radio uplink failure)
       *   LastCallFailCause:RADIO_SETUP_FAILURE (RRC connection setup failure)
       *   LastCallFailCause:RADIO_RELEASE_NORMAL (RRC connection release, normal)
       *   LastCallFailCause:RADIO_RELEASE_ABNORMAL (RRC connection release, abnormal)
       *   LastCallFailCause:ACCESS_CLASS_BLOCKED (Access class barring)
       *   LastCallFailCause:NETWORK_DETACH (Explicit network detach)
       *   OEM causes (LastCallFailCause:OEM_CAUSE_XX) must be used for debug purpose only
       * 
       * If the implementation does not have access to the exact cause codes, then it must return one
       * of the values listed in LastCallFailCause, as the UI layer needs to distinguish these cases
       * for tone generation or error notification.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:NO_MEMORY
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getLastCallFailCauseResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.LastCallFailCauseInfo failCauseinfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(failCauseinfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLastCallFailCauseResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getLastCallFailCauseResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param enable true for "mute enabled" and false for "mute disabled"
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:NO_MEMORY
       *   RadioError:REQUEST_RATE_LIMITED
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getMuteResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMuteResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getMuteResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param enable false for Standard Privacy Mode (Public Long Code Mask)
       *        true for Enhanced Privacy Mode (Private Long Code Mask)
       * 
       * Valid errors:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPreferredVoicePrivacyResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getPreferredVoicePrivacyResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param mode TtyMode
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getTtyModeResponse(android.hardware.radio.RadioResponseInfo info, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTtyModeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getTtyModeResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       */
      @Override public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleStkCallSetupRequestFromSimResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method handleStkCallSetupRequestFromSimResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:INVALID_STATE
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void hangupConnectionResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hangupConnectionResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method hangupConnectionResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:NO_RESOURCES
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hangupForegroundResumeBackgroundResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method hangupForegroundResumeBackgroundResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:NO_RESOURCES
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:CANCELLED
       */
      @Override public void hangupWaitingOrBackgroundResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hangupWaitingOrBackgroundResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method hangupWaitingOrBackgroundResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param enable true for "vonr enabled" and false for "vonr disabled"
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       */
      @Override public void isVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isVoNrEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isVoNrEnabledResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:INVALID_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void rejectCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rejectCallResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method rejectCallResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:INVALID_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:OPERATION_NOT_ALLOWED
       */
      @Override public void sendBurstDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendBurstDtmfResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendBurstDtmfResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.cdma is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:INVALID_STATE
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:OPERATION_NOT_ALLOWED
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void sendCdmaFeatureCodeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendCdmaFeatureCodeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendCdmaFeatureCodeResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:CANCELLED
       *   RadioError:INVALID_MODEM_STATE
       */
      @Override public void sendDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendDtmfResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendDtmfResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:USSD_MODIFIED_TO_DIAL
       *   RadioError:USSD_MODIFIED_TO_SS
       *   RadioError:USSD_MODIFIED_TO_USSD
       *   RadioError:SIM_BUSY
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:ABORTED
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_STATE
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void sendUssdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendUssdResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendUssdResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:INVALID_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:CANCELLED
       */
      @Override public void separateConnectionResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_separateConnectionResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method separateConnectionResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_STATE
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setCallForwardResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallForwardResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCallForwardResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_STATE
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setCallWaitingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallWaitingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCallWaitingResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setClirResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setClirResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setClirResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:REQUEST_RATE_LIMITED
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setMuteResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setMuteResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setMuteResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPreferredVoicePrivacyResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setPreferredVoicePrivacyResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setTtyModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTtyModeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setTtyModeResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       */
      @Override public void setVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setVoNrEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setVoNrEnabledResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:SYSTEM_ERR
       *   RadioError:CANCELLED
       *   RadioError:INVALID_MODEM_STATE
       */
      @Override public void startDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startDtmfResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startDtmfResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:NO_MEMORY
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_CALL_ID
       *   RadioError:CANCELLED
       *   RadioError:INVALID_MODEM_STATE
       */
      @Override public void stopDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopDtmfResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopDtmfResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_STATE
       *   RadioError:INVALID_CALL_ID
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_MODEM_STATE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_switchWaitingOrHoldingAndActiveResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method switchWaitingOrHoldingAndActiveResponse is unimplemented.");
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
    static final int TRANSACTION_acceptCallResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_acknowledgeRequest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cancelPendingUssdResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_conferenceResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_dialResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_emergencyDialResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_exitEmergencyCallbackModeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_explicitCallTransferResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getCallForwardStatusResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getCallWaitingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getClipResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getClirResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getCurrentCallsResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getLastCallFailCauseResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getMuteResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getPreferredVoicePrivacyResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_getTtyModeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_handleStkCallSetupRequestFromSimResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_hangupConnectionResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_hangupForegroundResumeBackgroundResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_hangupWaitingOrBackgroundResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_isVoNrEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_rejectCallResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_sendBurstDtmfResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_sendCdmaFeatureCodeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_sendDtmfResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_sendUssdResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_separateConnectionResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_setCallForwardResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setCallWaitingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_setClirResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_setMuteResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_setPreferredVoicePrivacyResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_setTtyModeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_setVoNrEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_startDtmfResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_stopDtmfResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_switchWaitingOrHoldingAndActiveResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$voice$IRadioVoiceResponse".replace('$', '.');
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void acceptCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Acknowledge the receipt of radio request sent to the vendor. This must be sent only for
   * radio request which take long time to respond. For more details, refer
   * https://source.android.com/devices/tech/connect/ril.html
   * 
   * @param serial Serial no. of the request whose acknowledgement is sent.
   */
  public void acknowledgeRequest(int serial) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SIM_BUSY
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:INVALID_STATE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void cancelPendingUssdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_STATE
   *   RadioError:INVALID_CALL_ID
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void conferenceResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:DIAL_MODIFIED_TO_USSD
   *   RadioError:DIAL_MODIFIED_TO_SS
   *   RadioError:DIAL_MODIFIED_TO_DIAL
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:INVALID_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:INTERNAL_ERR
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:MODEM_ERR
   *   RadioError:NO_SUBSCRIPTION
   *   RadioError:NO_NETWORK_FOUND
   *   RadioError:INVALID_CALL_ID
   *   RadioError:DEVICE_IN_USE
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:ABORTED
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:CANCELLED
   */
  public void dialResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:DIAL_MODIFIED_TO_USSD
   *   RadioError:DIAL_MODIFIED_TO_SS
   *   RadioError:DIAL_MODIFIED_TO_DIAL
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:INTERNAL_ERR
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:MODEM_ERR
   *   RadioError:NO_SUBSCRIPTION
   *   RadioError:NO_NETWORK_FOUND
   *   RadioError:INVALID_CALL_ID
   *   RadioError:DEVICE_IN_USE
   *   RadioError:ABORTED
   *   RadioError:INVALID_MODEM_STATE
   */
  public void emergencyDialResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:OPERATION_NO_ALLOWED
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   */
  public void exitEmergencyCallbackModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:INVALID_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void explicitCallTransferResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param callForwardInfos points to a vector of CallForwardInfo, one for each distinct
   *        registered phone number. For example, if data is forwarded to +18005551212 and voice
   *        is forwarded to +18005559999, then two separate CallForwardInfo's must be returned.
   *        However, if both data and voice are forwarded to +18005551212, then a single
   *        CallForwardInfo must be returned with the service class set to "data + voice = 3".
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getCallForwardStatusResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.CallForwardInfo[] callForwardInfos) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param enable If current call waiting state is disabled, enable = false else true
   * @param serviceClass If enable, then callWaitingResp[1] must follow, with the TS 27.007
   *        service class bit vector of services for which call waiting is enabled. For example,
   *        if callWaitingResp[0] is 1 and callWaitingResp[1] is 3, then call waiting is enabled
   *        for data and voice and disabled for everything else.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getCallWaitingResponse(android.hardware.radio.RadioResponseInfo info, boolean enable, int serviceClass) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param status indicates CLIP status
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getClipResponse(android.hardware.radio.RadioResponseInfo info, int status) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param n is "n" parameter from TS 27.007 7.7
   * @param m is "m" parameter from TS 27.007 7.7
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getClirResponse(android.hardware.radio.RadioResponseInfo info, int n, int m) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing respontype, serial no. and error
   * @param calls Current call list
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getCurrentCallsResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.Call[] calls) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param failCauseInfo Contains LastCallFailCause and vendor cause code.
   * 
   * The vendor cause code must be used for debugging purpose only. The implementation must return
   * one of the values of LastCallFailCause as mentioned below.
   * GSM failure reasons codes for the cause codes defined in TS 24.008 Annex H where possible.
   * CDMA failure reasons codes for the possible call failure scenarios described in the
   * "CDMA IS-2000 Release A (C.S0005-A v6.0)" standard.
   * Any of the following reason codes if the call is failed or dropped due to reason mentioned
   * with in the braces.
   *   LastCallFailCause:RADIO_OFF (Radio is OFF)
   *   LastCallFailCause:OUT_OF_SERVICE (No cell coverage)
   *   LastCallFailCause:NO_VALID_SIM (No valid SIM)
   *   LastCallFailCause:RADIO_INTERNAL_ERROR (Modem hit unexpected error scenario)
   *   LastCallFailCause:NETWORK_RESP_TIMEOUT (No response from network)
   *   LastCallFailCause:NETWORK_REJECT (Explicit network reject)
   *   LastCallFailCause:RADIO_ACCESS_FAILURE (RRC connection failure. Eg.RACH)
   *   LastCallFailCause:RADIO_LINK_FAILURE (Radio Link Failure)
   *   LastCallFailCause:RADIO_LINK_LOST (Radio link lost due to poor coverage)
   *   LastCallFailCause:RADIO_UPLINK_FAILURE (Radio uplink failure)
   *   LastCallFailCause:RADIO_SETUP_FAILURE (RRC connection setup failure)
   *   LastCallFailCause:RADIO_RELEASE_NORMAL (RRC connection release, normal)
   *   LastCallFailCause:RADIO_RELEASE_ABNORMAL (RRC connection release, abnormal)
   *   LastCallFailCause:ACCESS_CLASS_BLOCKED (Access class barring)
   *   LastCallFailCause:NETWORK_DETACH (Explicit network detach)
   *   OEM causes (LastCallFailCause:OEM_CAUSE_XX) must be used for debug purpose only
   * 
   * If the implementation does not have access to the exact cause codes, then it must return one
   * of the values listed in LastCallFailCause, as the UI layer needs to distinguish these cases
   * for tone generation or error notification.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:NO_MEMORY
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getLastCallFailCauseResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.voice.LastCallFailCauseInfo failCauseinfo) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param enable true for "mute enabled" and false for "mute disabled"
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:NO_MEMORY
   *   RadioError:REQUEST_RATE_LIMITED
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getMuteResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param enable false for Standard Privacy Mode (Public Long Code Mask)
   *        true for Enhanced Privacy Mode (Private Long Code Mask)
   * 
   * Valid errors:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param mode TtyMode
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getTtyModeResponse(android.hardware.radio.RadioResponseInfo info, int mode) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   */
  public void handleStkCallSetupRequestFromSimResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:INVALID_STATE
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void hangupConnectionResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:NO_RESOURCES
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void hangupForegroundResumeBackgroundResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:NO_RESOURCES
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:CANCELLED
   */
  public void hangupWaitingOrBackgroundResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param enable true for "vonr enabled" and false for "vonr disabled"
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   */
  public void isVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean enable) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:INVALID_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void rejectCallResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:INVALID_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:OPERATION_NOT_ALLOWED
   */
  public void sendBurstDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.cdma is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:INVALID_STATE
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:OPERATION_NOT_ALLOWED
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void sendCdmaFeatureCodeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:CANCELLED
   *   RadioError:INVALID_MODEM_STATE
   */
  public void sendDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:USSD_MODIFIED_TO_DIAL
   *   RadioError:USSD_MODIFIED_TO_SS
   *   RadioError:USSD_MODIFIED_TO_USSD
   *   RadioError:SIM_BUSY
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:ABORTED
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_STATE
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void sendUssdResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:INVALID_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:CANCELLED
   */
  public void separateConnectionResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_STATE
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setCallForwardResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_STATE
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setCallWaitingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setClirResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:REQUEST_RATE_LIMITED
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setMuteResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setPreferredVoicePrivacyResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setTtyModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   */
  public void setVoNrEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:SYSTEM_ERR
   *   RadioError:CANCELLED
   *   RadioError:INVALID_MODEM_STATE
   */
  public void startDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:NO_MEMORY
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_CALL_ID
   *   RadioError:CANCELLED
   *   RadioError:INVALID_MODEM_STATE
   */
  public void stopDtmfResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE (radio resetting)
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_STATE
   *   RadioError:INVALID_CALL_ID
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_MODEM_STATE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void switchWaitingOrHoldingAndActiveResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
