/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/4 --previous_hash 576f05d082e9269bcf773b0c9b9112d507ab4b9a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen/android/hardware/radio/voice/IRadioVoice.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/voice/IRadioVoice.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/**
 * This interface is used by telephony and telecom to talk to cellular radio for voice APIs.
 * All the functions have minimum one parameter:
 * serial: which corresponds to serial no. of request. Serial numbers must only be memorized for the
 * duration of a method call. If clients provide colliding serials (including passing the same
 * serial to different methods), multiple responses (one for each method call) must still be served.
 * setResponseFunctions must work with IRadioVoiceResponse and IRadioVoiceIndication.
 * @hide
 */
public interface IRadioVoice extends android.os.IInterface
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
  /** Default implementation for IRadioVoice. */
  public static class Default implements android.hardware.radio.voice.IRadioVoice
  {
    /**
     * Answer incoming call. Must not be called for WAITING calls.
     * switchWaitingOrHoldingAndActive() must be used in this case instead
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.acceptCallResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void acceptCall(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Cancel the current USSD session if one exists.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.cancelPendingUssdResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void cancelPendingUssd(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Conference holding and active (like AT+CHLD=3)
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.conferenceResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void conference(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Initiate voice call. This method is never used for supplementary service codes.
     * 
     * @param serial Serial number of request.
     * @param dialInfo Dial struct
     * 
     * Response function is IRadioVoiceResponse.dialResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void dial(int serial, android.hardware.radio.voice.Dial dialInfo) throws android.os.RemoteException
    {
    }
    /**
     * Initiate emergency voice call, with zero or more emergency service category(s), zero or
     * more emergency Uniform Resource Names (URN), and routing information for handling the call.
     * Android uses this request to make its emergency call instead of using IRadio.dial if the
     * 'address' in the 'dialInfo' field is identified as an emergency number by Android.
     * 
     * In multi-sim scenario, if the emergency number is from a specific subscription, this radio
     * request can still be sent out on the other subscription as long as routing is set to
     * EmergencyNumberRouting#EMERGENCY. This radio request will not be sent on an inactive
     * (PIN/PUK locked) subscription unless both subscriptions are PIN/PUK locked. In this case,
     * the request will be sent on the primary subscription.
     * 
     * Some countries or carriers require some emergency numbers that must be handled with normal
     * call routing if possible or emergency routing. 1) if the 'routing' field is specified as
     * EmergencyNumberRouting#NORMAL, the implementation must try the full radio service to use
     * normal call routing to handle the call; if service cannot support normal routing, the
     * implementation must use emergency routing to handle the call. 2) if 'routing' is specified
     * as EmergencyNumberRouting#EMERGENCY, the implementation must use emergency routing to handle
     * the call. 3) if 'routing' is specified as EmergencyNumberRouting#UNKNOWN, Android does not
     * know how to handle the call.
     * 
     * If the dialed emergency number does not have a specified emergency service category, the
     * 'categories' field is set to EmergencyServiceCategory#UNSPECIFIED; if the dialed emergency
     * number does not have specified emergency Uniform Resource Names, the 'urns' field is set to
     * an empty list. If the underlying technology used to request emergency services does not
     * support the emergency service category or emergency uniform resource names, the field
     * 'categories' or 'urns' may be ignored.
     * 
     * In the scenarios that the 'address' in the 'dialInfo' field has other functions besides the
     * emergency number function, if the 'hasKnownUserIntentEmergency' field is true, the user's
     * intent for this dial request is emergency call, and the modem must treat this as an actual
     * emergency dial; if the 'hasKnownUserIntentEmergency' field is false, Android does not know
     * user's intent for this call.
     * 
     * If 'isTesting' is true, this request is for testing purpose, and must not be sent to a real
     * emergency service; otherwise it's for a real emergency call request.
     * 
     * Reference: 3gpp 22.101, Section 10 - Emergency Calls;
     *            3gpp 23.167, Section 6 - Functional description;
     *            3gpp 24.503, Section 5.1.6.8.1 - General;
     *            RFC 5031
     * 
     * @param serial Serial number of request.
     * @param dialInfo the same Dial information used by IRadioVoice.dial.
     * @param categories bitfield<EmergencyServiceCategory> the Emergency Service Category(s)
     *        of the call.
     * @param urns the emergency Uniform Resource Names (URN)
     * @param routing EmergencyCallRouting the emergency call routing information.
     * @param hasKnownUserIntentEmergency Flag indicating if user's intent for the emergency call
     *        is known.
     * @param isTesting Flag indicating if this request is for testing purpose.
     * 
     * Response function is IRadioVoiceResponse.emergencyDialResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void emergencyDial(int serial, android.hardware.radio.voice.Dial dialInfo, int categories, java.lang.String[] urns, int routing, boolean hasKnownUserIntentEmergency, boolean isTesting) throws android.os.RemoteException
    {
    }
    /**
     * Request the radio's system selection module to exit emergency callback mode. Radio must not
     * respond with SUCCESS until the modem has completely exited from Emergency Callback Mode.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.exitEmergencyCallbackModeResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void exitEmergencyCallbackMode(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Connects the two calls and disconnects the subscriber from both calls.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.explicitCallTransferResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void explicitCallTransfer(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request call forward status.
     * 
     * @param serial Serial number of request.
     * @param callInfo CallForwardInfo
     * 
     * Response function is IRadioVoiceResponse.getCallForwardStatusResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getCallForwardStatus(int serial, android.hardware.radio.voice.CallForwardInfo callInfo) throws android.os.RemoteException
    {
    }
    /**
     * Query current call waiting state
     * 
     * @param serial Serial number of request.
     * @param serviceClass Service class is the TS 27.007 service class to query
     * 
     * Response function is IRadioVoiceResponse.getCallWaitingResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getCallWaiting(int serial, int serviceClass) throws android.os.RemoteException
    {
    }
    /**
     * Queries the status of the CLIP supplementary service (for MMI code "*#30#")
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.getClipResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getClip(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Gets current CLIR status
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.getClirResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getClir(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Requests current call list
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.getCurrentCallsResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getCurrentCalls(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Requests the failure cause code for the most recently terminated call.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.getLastCallFailCauseResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getLastCallFailCause(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Queries the current state of the uplink mute setting
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.getMuteResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getMute(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request the setting of preferred voice privacy mode.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.getPreferredVoicePrivacyResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getPreferredVoicePrivacy(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request the setting of TTY mode
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.getTtyModeResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void getTtyMode(int serial) throws android.os.RemoteException
    {
    }
    /**
     * When STK application gets stkCallSetup(), the call actually has been initialized by the
     * mobile device already. (We could see the call has been in the 'call list'). STK application
     * needs to accept/reject the call according to user operations.
     * 
     * @param serial Serial number of request.
     * @param accept true = accept the call setup, false = reject the call setup
     * 
     * Response function is IRadioVoiceResponse.handleStkCallSetupRequestFromSimResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void handleStkCallSetupRequestFromSim(int serial, boolean accept) throws android.os.RemoteException
    {
    }
    /**
     * Hang up a specific line (like AT+CHLD=1x). After this HANGUP request returns, Radio must
     * show the connection is NOT active anymore in next getCurrentCalls() query.
     * 
     * @param serial Serial number of request.
     * @param gsmIndex Connection index (value of 'x' in CHLD above)
     * 
     * Response function is IRadioVoiceResponse.hangupResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void hangup(int serial, int gsmIndex) throws android.os.RemoteException
    {
    }
    /**
     * Hang up waiting or held (like AT+CHLD=1). After this HANGUP request returns, Radio must show
     * the connection is NOT active anymore in next getCurrentCalls() query.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.hangupForegroundResumeBackgroundResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void hangupForegroundResumeBackground(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Hang up waiting or held (like AT+CHLD=0). After this HANGUP request returns, Radio must show
     * the connection is NOT active anymore in next getCurrentCalls() query.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.hangupWaitingOrBackgroundResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void hangupWaitingOrBackground(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Query current Voice NR enable state
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.isVoNrEnabledResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void isVoNrEnabled(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Send UDUB (user determined user busy) to ringing or waiting call answer)
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.rejectCallResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void rejectCall(int serial) throws android.os.RemoteException
    {
    }
    /**
     * When response type received from a radio indication or radio response is
     * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
     * acknowledge the receipt of those messages by sending responseAcknowledgement().
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void responseAcknowledgement() throws android.os.RemoteException
    {
    }
    /**
     * Send DTMF string
     * 
     * @param serial Serial number of request.
     * @param dtmf DTMF string
     * @param on DTMF ON length in milliseconds, or 0 to use default
     * @param off is the DTMF OFF length in milliseconds, or 0 to use default
     * 
     * Response function is IRadioVoiceResponse.sendBurstDtmfResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void sendBurstDtmf(int serial, java.lang.String dtmf, int on, int off) throws android.os.RemoteException
    {
    }
    /**
     * Send FLASH command
     * 
     * @param serial Serial number of request.
     * @param featureCode String associated with Flash command
     * 
     * Response function is IRadioVoiceResponse.sendCdmaFeatureCodeResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void sendCdmaFeatureCode(int serial, java.lang.String featureCode) throws android.os.RemoteException
    {
    }
    /**
     * Send a DTMF tone. If the implementation is currently playing a tone requested via
     * startDtmf(), that tone must be cancelled and the new tone must be played instead.
     * 
     * @param serial Serial number of request.
     * @param s string with single char having one of 12 values: 0-9, *, #
     * 
     * Response function is IRadioVoiceResponse.sendDtmfResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void sendDtmf(int serial, java.lang.String s) throws android.os.RemoteException
    {
    }
    /**
     * Send a USSD message. If a USSD session already exists, the message must be sent in the
     * context of that session. Otherwise, a new session must be created. The network reply must be
     * reported via unsolOnUssd.
     * 
     * Only one USSD session must exist at a time, and the session is assumed to exist until:
     * a) The android system invokes cancelUssd()
     * b) The implementation sends a unsolOnUssd() with a type code of
     *    "0" (USSD-Notify/no further action) or "2" (session terminated)
     * 
     * @param serial Serial number of request.
     * @param ussd string containing the USSD request in UTF-8 format
     * 
     * Response function is IRadioVoiceResponse.sendUssdResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void sendUssd(int serial, java.lang.String ussd) throws android.os.RemoteException
    {
    }
    /**
     * Separate a party from a multiparty call placing the multiparty call (less the specified
     * party) on hold and leaving the specified party as the only other member of the current
     * (active) call. Like AT+CHLD=2x.
     * 
     * See TS 22.084 1.3.8.2 (iii)
     * TS 22.030 6.5.5 "Entering "2X followed by send"
     * TS 27.007 "AT+CHLD=2x"
     * 
     * @param serial Serial number of request.
     * @param gsmIndex contains Connection index (value of 'x' in CHLD above)
     * 
     * Response function is IRadioVoiceResponse.separateConnectionResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void separateConnection(int serial, int gsmIndex) throws android.os.RemoteException
    {
    }
    /**
     * Configure call forward rule
     * 
     * @param serial Serial number of request.
     * @param callInfo CallForwardInfo
     * 
     * Response function is IRadioVoiceResponse.setCallForwardResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void setCallForward(int serial, android.hardware.radio.voice.CallForwardInfo callInfo) throws android.os.RemoteException
    {
    }
    /**
     * Configure current call waiting state
     * 
     * @param serial Serial number of request.
     * @param enable is false for "disabled" and true for "enabled"
     * @param serviceClass is the TS 27.007 service class bit vector of services to modify
     * 
     * Response function is IRadioVoiceResponse.setCallWaitingResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void setCallWaiting(int serial, boolean enable, int serviceClass) throws android.os.RemoteException
    {
    }
    /**
     * Set current CLIR status
     * 
     * @param serial Serial number of request.
     * @param status "n" parameter from TS 27.007 7.7
     * 
     * Response function is IRadioVoiceResponse.setClirResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void setClir(int serial, int status) throws android.os.RemoteException
    {
    }
    /**
     * Turn on or off uplink (microphone) mute. Must only be sent while voice call is active.
     * Must always be reset to "disable mute" when a new voice call is initiated
     * 
     * @param serial Serial number of request.
     * @param enable true for "enable mute" and false for "disable mute"
     * 
     * Response function is IRadioVoiceResponse.setMuteResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void setMute(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Request to set the preferred voice privacy mode used in voice scrambling.
     * 
     * @param serial Serial number of request.
     * @param enable false for Standard Privacy Mode (Public Long Code Mask)
     *        true for Enhanced Privacy Mode (Private Long Code Mask)
     * 
     * Response function is IRadioVoiceResponse.setPreferredVoicePrivacyResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void setPreferredVoicePrivacy(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Set response functions for voice radio requests and indications.
     * 
     * @param radioVoiceResponse Object containing response functions
     * @param radioVoiceIndication Object containing radio indications
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void setResponseFunctions(android.hardware.radio.voice.IRadioVoiceResponse radioVoiceResponse, android.hardware.radio.voice.IRadioVoiceIndication radioVoiceIndication) throws android.os.RemoteException
    {
    }
    /**
     * Request to set the TTY mode
     * 
     * @param serial Serial number of request.
     * @param mode TtyMode
     * 
     * Response function is IRadioVoiceResponse.setTtyModeResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void setTtyMode(int serial, int mode) throws android.os.RemoteException
    {
    }
    /**
     * Set Voice NR enable state
     * 
     * @param serial Serial number of request.
     * @param enable true for "enable vonr" and false for "disable vonr"
     * 
     * Response function is IRadioVoiceResponse.setVoNrEnabledResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     */
    @Override public void setVoNrEnabled(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Start playing a DTMF tone. Continue playing DTMF tone until stopDtmf is received. If a
     * startDtmf() is received while a tone is currently playing, it must cancel the previous tone
     * and play the new one.
     * 
     * @param serial Serial number of request.
     * @param s string having a single character with one of 12 values: 0-9,*,#
     * 
     * Response function is IRadioVoiceResponse.startDtmfResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void startDtmf(int serial, java.lang.String s) throws android.os.RemoteException
    {
    }
    /**
     * Stop playing a currently playing DTMF tone.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.stopDtmfResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void stopDtmf(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Switch waiting or holding call and active call (like AT+CHLD=2).
     * Call transitions must happen as shown below.
     *   BEFORE                               AFTER
     * Call 1   Call 2                 Call 1       Call 2
     * ACTIVE   HOLDING                HOLDING     ACTIVE
     * ACTIVE   WAITING                HOLDING     ACTIVE
     * HOLDING  WAITING                HOLDING     ACTIVE
     * ACTIVE   IDLE                   HOLDING     IDLE
     * IDLE     IDLE                   IDLE        IDLE
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioVoiceResponse.switchWaitingOrHoldingAndActiveResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     */
    @Override public void switchWaitingOrHoldingAndActive(int serial) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.voice.IRadioVoice
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.voice.IRadioVoice interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.voice.IRadioVoice asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.voice.IRadioVoice))) {
        return ((android.hardware.radio.voice.IRadioVoice)iin);
      }
      return new android.hardware.radio.voice.IRadioVoice.Stub.Proxy(obj);
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
        case TRANSACTION_acceptCall:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.acceptCall(_arg0);
          break;
        }
        case TRANSACTION_cancelPendingUssd:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.cancelPendingUssd(_arg0);
          break;
        }
        case TRANSACTION_conference:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.conference(_arg0);
          break;
        }
        case TRANSACTION_dial:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.voice.Dial _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.voice.Dial.CREATOR);
          data.enforceNoDataAvail();
          this.dial(_arg0, _arg1);
          break;
        }
        case TRANSACTION_emergencyDial:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.voice.Dial _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.voice.Dial.CREATOR);
          int _arg2;
          _arg2 = data.readInt();
          java.lang.String[] _arg3;
          _arg3 = data.createStringArray();
          int _arg4;
          _arg4 = data.readInt();
          boolean _arg5;
          _arg5 = data.readBoolean();
          boolean _arg6;
          _arg6 = data.readBoolean();
          data.enforceNoDataAvail();
          this.emergencyDial(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          break;
        }
        case TRANSACTION_exitEmergencyCallbackMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.exitEmergencyCallbackMode(_arg0);
          break;
        }
        case TRANSACTION_explicitCallTransfer:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.explicitCallTransfer(_arg0);
          break;
        }
        case TRANSACTION_getCallForwardStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.voice.CallForwardInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.voice.CallForwardInfo.CREATOR);
          data.enforceNoDataAvail();
          this.getCallForwardStatus(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getCallWaiting:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.getCallWaiting(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getClip:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getClip(_arg0);
          break;
        }
        case TRANSACTION_getClir:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getClir(_arg0);
          break;
        }
        case TRANSACTION_getCurrentCalls:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getCurrentCalls(_arg0);
          break;
        }
        case TRANSACTION_getLastCallFailCause:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getLastCallFailCause(_arg0);
          break;
        }
        case TRANSACTION_getMute:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getMute(_arg0);
          break;
        }
        case TRANSACTION_getPreferredVoicePrivacy:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getPreferredVoicePrivacy(_arg0);
          break;
        }
        case TRANSACTION_getTtyMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getTtyMode(_arg0);
          break;
        }
        case TRANSACTION_handleStkCallSetupRequestFromSim:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.handleStkCallSetupRequestFromSim(_arg0, _arg1);
          break;
        }
        case TRANSACTION_hangup:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.hangup(_arg0, _arg1);
          break;
        }
        case TRANSACTION_hangupForegroundResumeBackground:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.hangupForegroundResumeBackground(_arg0);
          break;
        }
        case TRANSACTION_hangupWaitingOrBackground:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.hangupWaitingOrBackground(_arg0);
          break;
        }
        case TRANSACTION_isVoNrEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.isVoNrEnabled(_arg0);
          break;
        }
        case TRANSACTION_rejectCall:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.rejectCall(_arg0);
          break;
        }
        case TRANSACTION_responseAcknowledgement:
        {
          this.responseAcknowledgement();
          break;
        }
        case TRANSACTION_sendBurstDtmf:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          data.enforceNoDataAvail();
          this.sendBurstDtmf(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_sendCdmaFeatureCode:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.sendCdmaFeatureCode(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendDtmf:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.sendDtmf(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendUssd:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.sendUssd(_arg0, _arg1);
          break;
        }
        case TRANSACTION_separateConnection:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.separateConnection(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setCallForward:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.voice.CallForwardInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.voice.CallForwardInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCallForward(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setCallWaiting:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.setCallWaiting(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_setClir:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setClir(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setMute:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setMute(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setPreferredVoicePrivacy:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setPreferredVoicePrivacy(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setResponseFunctions:
        {
          android.hardware.radio.voice.IRadioVoiceResponse _arg0;
          _arg0 = android.hardware.radio.voice.IRadioVoiceResponse.Stub.asInterface(data.readStrongBinder());
          android.hardware.radio.voice.IRadioVoiceIndication _arg1;
          _arg1 = android.hardware.radio.voice.IRadioVoiceIndication.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setResponseFunctions(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setTtyMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setTtyMode(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setVoNrEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setVoNrEnabled(_arg0, _arg1);
          break;
        }
        case TRANSACTION_startDtmf:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.startDtmf(_arg0, _arg1);
          break;
        }
        case TRANSACTION_stopDtmf:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.stopDtmf(_arg0);
          break;
        }
        case TRANSACTION_switchWaitingOrHoldingAndActive:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.switchWaitingOrHoldingAndActive(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.voice.IRadioVoice
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
       * Answer incoming call. Must not be called for WAITING calls.
       * switchWaitingOrHoldingAndActive() must be used in this case instead
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.acceptCallResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void acceptCall(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_acceptCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method acceptCall is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Cancel the current USSD session if one exists.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.cancelPendingUssdResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void cancelPendingUssd(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelPendingUssd, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cancelPendingUssd is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Conference holding and active (like AT+CHLD=3)
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.conferenceResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void conference(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_conference, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method conference is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Initiate voice call. This method is never used for supplementary service codes.
       * 
       * @param serial Serial number of request.
       * @param dialInfo Dial struct
       * 
       * Response function is IRadioVoiceResponse.dialResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void dial(int serial, android.hardware.radio.voice.Dial dialInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(dialInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_dial, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method dial is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Initiate emergency voice call, with zero or more emergency service category(s), zero or
       * more emergency Uniform Resource Names (URN), and routing information for handling the call.
       * Android uses this request to make its emergency call instead of using IRadio.dial if the
       * 'address' in the 'dialInfo' field is identified as an emergency number by Android.
       * 
       * In multi-sim scenario, if the emergency number is from a specific subscription, this radio
       * request can still be sent out on the other subscription as long as routing is set to
       * EmergencyNumberRouting#EMERGENCY. This radio request will not be sent on an inactive
       * (PIN/PUK locked) subscription unless both subscriptions are PIN/PUK locked. In this case,
       * the request will be sent on the primary subscription.
       * 
       * Some countries or carriers require some emergency numbers that must be handled with normal
       * call routing if possible or emergency routing. 1) if the 'routing' field is specified as
       * EmergencyNumberRouting#NORMAL, the implementation must try the full radio service to use
       * normal call routing to handle the call; if service cannot support normal routing, the
       * implementation must use emergency routing to handle the call. 2) if 'routing' is specified
       * as EmergencyNumberRouting#EMERGENCY, the implementation must use emergency routing to handle
       * the call. 3) if 'routing' is specified as EmergencyNumberRouting#UNKNOWN, Android does not
       * know how to handle the call.
       * 
       * If the dialed emergency number does not have a specified emergency service category, the
       * 'categories' field is set to EmergencyServiceCategory#UNSPECIFIED; if the dialed emergency
       * number does not have specified emergency Uniform Resource Names, the 'urns' field is set to
       * an empty list. If the underlying technology used to request emergency services does not
       * support the emergency service category or emergency uniform resource names, the field
       * 'categories' or 'urns' may be ignored.
       * 
       * In the scenarios that the 'address' in the 'dialInfo' field has other functions besides the
       * emergency number function, if the 'hasKnownUserIntentEmergency' field is true, the user's
       * intent for this dial request is emergency call, and the modem must treat this as an actual
       * emergency dial; if the 'hasKnownUserIntentEmergency' field is false, Android does not know
       * user's intent for this call.
       * 
       * If 'isTesting' is true, this request is for testing purpose, and must not be sent to a real
       * emergency service; otherwise it's for a real emergency call request.
       * 
       * Reference: 3gpp 22.101, Section 10 - Emergency Calls;
       *            3gpp 23.167, Section 6 - Functional description;
       *            3gpp 24.503, Section 5.1.6.8.1 - General;
       *            RFC 5031
       * 
       * @param serial Serial number of request.
       * @param dialInfo the same Dial information used by IRadioVoice.dial.
       * @param categories bitfield<EmergencyServiceCategory> the Emergency Service Category(s)
       *        of the call.
       * @param urns the emergency Uniform Resource Names (URN)
       * @param routing EmergencyCallRouting the emergency call routing information.
       * @param hasKnownUserIntentEmergency Flag indicating if user's intent for the emergency call
       *        is known.
       * @param isTesting Flag indicating if this request is for testing purpose.
       * 
       * Response function is IRadioVoiceResponse.emergencyDialResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void emergencyDial(int serial, android.hardware.radio.voice.Dial dialInfo, int categories, java.lang.String[] urns, int routing, boolean hasKnownUserIntentEmergency, boolean isTesting) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(dialInfo, 0);
          _data.writeInt(categories);
          _data.writeStringArray(urns);
          _data.writeInt(routing);
          _data.writeBoolean(hasKnownUserIntentEmergency);
          _data.writeBoolean(isTesting);
          boolean _status = mRemote.transact(Stub.TRANSACTION_emergencyDial, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method emergencyDial is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request the radio's system selection module to exit emergency callback mode. Radio must not
       * respond with SUCCESS until the modem has completely exited from Emergency Callback Mode.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.exitEmergencyCallbackModeResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void exitEmergencyCallbackMode(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitEmergencyCallbackMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method exitEmergencyCallbackMode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Connects the two calls and disconnects the subscriber from both calls.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.explicitCallTransferResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void explicitCallTransfer(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_explicitCallTransfer, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method explicitCallTransfer is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request call forward status.
       * 
       * @param serial Serial number of request.
       * @param callInfo CallForwardInfo
       * 
       * Response function is IRadioVoiceResponse.getCallForwardStatusResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getCallForwardStatus(int serial, android.hardware.radio.voice.CallForwardInfo callInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(callInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCallForwardStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCallForwardStatus is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Query current call waiting state
       * 
       * @param serial Serial number of request.
       * @param serviceClass Service class is the TS 27.007 service class to query
       * 
       * Response function is IRadioVoiceResponse.getCallWaitingResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getCallWaiting(int serial, int serviceClass) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(serviceClass);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCallWaiting, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCallWaiting is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Queries the status of the CLIP supplementary service (for MMI code "*#30#")
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.getClipResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getClip(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getClip, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getClip is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Gets current CLIR status
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.getClirResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getClir(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getClir, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getClir is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Requests current call list
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.getCurrentCallsResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getCurrentCalls(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCurrentCalls, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCurrentCalls is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Requests the failure cause code for the most recently terminated call.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.getLastCallFailCauseResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getLastCallFailCause(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getLastCallFailCause, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getLastCallFailCause is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Queries the current state of the uplink mute setting
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.getMuteResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getMute(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getMute, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getMute is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request the setting of preferred voice privacy mode.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.getPreferredVoicePrivacyResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getPreferredVoicePrivacy(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getPreferredVoicePrivacy, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getPreferredVoicePrivacy is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request the setting of TTY mode
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.getTtyModeResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void getTtyMode(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getTtyMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getTtyMode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * When STK application gets stkCallSetup(), the call actually has been initialized by the
       * mobile device already. (We could see the call has been in the 'call list'). STK application
       * needs to accept/reject the call according to user operations.
       * 
       * @param serial Serial number of request.
       * @param accept true = accept the call setup, false = reject the call setup
       * 
       * Response function is IRadioVoiceResponse.handleStkCallSetupRequestFromSimResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void handleStkCallSetupRequestFromSim(int serial, boolean accept) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(accept);
          boolean _status = mRemote.transact(Stub.TRANSACTION_handleStkCallSetupRequestFromSim, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method handleStkCallSetupRequestFromSim is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Hang up a specific line (like AT+CHLD=1x). After this HANGUP request returns, Radio must
       * show the connection is NOT active anymore in next getCurrentCalls() query.
       * 
       * @param serial Serial number of request.
       * @param gsmIndex Connection index (value of 'x' in CHLD above)
       * 
       * Response function is IRadioVoiceResponse.hangupResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void hangup(int serial, int gsmIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(gsmIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hangup, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method hangup is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Hang up waiting or held (like AT+CHLD=1). After this HANGUP request returns, Radio must show
       * the connection is NOT active anymore in next getCurrentCalls() query.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.hangupForegroundResumeBackgroundResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void hangupForegroundResumeBackground(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hangupForegroundResumeBackground, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method hangupForegroundResumeBackground is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Hang up waiting or held (like AT+CHLD=0). After this HANGUP request returns, Radio must show
       * the connection is NOT active anymore in next getCurrentCalls() query.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.hangupWaitingOrBackgroundResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void hangupWaitingOrBackground(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_hangupWaitingOrBackground, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method hangupWaitingOrBackground is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Query current Voice NR enable state
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.isVoNrEnabledResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void isVoNrEnabled(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isVoNrEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isVoNrEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send UDUB (user determined user busy) to ringing or waiting call answer)
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.rejectCallResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void rejectCall(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_rejectCall, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method rejectCall is unimplemented.");
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
       * This is available when android.hardware.telephony.calling is defined.
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
       * Send DTMF string
       * 
       * @param serial Serial number of request.
       * @param dtmf DTMF string
       * @param on DTMF ON length in milliseconds, or 0 to use default
       * @param off is the DTMF OFF length in milliseconds, or 0 to use default
       * 
       * Response function is IRadioVoiceResponse.sendBurstDtmfResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void sendBurstDtmf(int serial, java.lang.String dtmf, int on, int off) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(dtmf);
          _data.writeInt(on);
          _data.writeInt(off);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendBurstDtmf, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendBurstDtmf is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send FLASH command
       * 
       * @param serial Serial number of request.
       * @param featureCode String associated with Flash command
       * 
       * Response function is IRadioVoiceResponse.sendCdmaFeatureCodeResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void sendCdmaFeatureCode(int serial, java.lang.String featureCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(featureCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendCdmaFeatureCode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendCdmaFeatureCode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send a DTMF tone. If the implementation is currently playing a tone requested via
       * startDtmf(), that tone must be cancelled and the new tone must be played instead.
       * 
       * @param serial Serial number of request.
       * @param s string with single char having one of 12 values: 0-9, *, #
       * 
       * Response function is IRadioVoiceResponse.sendDtmfResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void sendDtmf(int serial, java.lang.String s) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(s);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendDtmf, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendDtmf is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Send a USSD message. If a USSD session already exists, the message must be sent in the
       * context of that session. Otherwise, a new session must be created. The network reply must be
       * reported via unsolOnUssd.
       * 
       * Only one USSD session must exist at a time, and the session is assumed to exist until:
       * a) The android system invokes cancelUssd()
       * b) The implementation sends a unsolOnUssd() with a type code of
       *    "0" (USSD-Notify/no further action) or "2" (session terminated)
       * 
       * @param serial Serial number of request.
       * @param ussd string containing the USSD request in UTF-8 format
       * 
       * Response function is IRadioVoiceResponse.sendUssdResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void sendUssd(int serial, java.lang.String ussd) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(ussd);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendUssd, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendUssd is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Separate a party from a multiparty call placing the multiparty call (less the specified
       * party) on hold and leaving the specified party as the only other member of the current
       * (active) call. Like AT+CHLD=2x.
       * 
       * See TS 22.084 1.3.8.2 (iii)
       * TS 22.030 6.5.5 "Entering "2X followed by send"
       * TS 27.007 "AT+CHLD=2x"
       * 
       * @param serial Serial number of request.
       * @param gsmIndex contains Connection index (value of 'x' in CHLD above)
       * 
       * Response function is IRadioVoiceResponse.separateConnectionResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void separateConnection(int serial, int gsmIndex) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(gsmIndex);
          boolean _status = mRemote.transact(Stub.TRANSACTION_separateConnection, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method separateConnection is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Configure call forward rule
       * 
       * @param serial Serial number of request.
       * @param callInfo CallForwardInfo
       * 
       * Response function is IRadioVoiceResponse.setCallForwardResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void setCallForward(int serial, android.hardware.radio.voice.CallForwardInfo callInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(callInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallForward, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCallForward is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Configure current call waiting state
       * 
       * @param serial Serial number of request.
       * @param enable is false for "disabled" and true for "enabled"
       * @param serviceClass is the TS 27.007 service class bit vector of services to modify
       * 
       * Response function is IRadioVoiceResponse.setCallWaitingResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void setCallWaiting(int serial, boolean enable, int serviceClass) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          _data.writeInt(serviceClass);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCallWaiting, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCallWaiting is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set current CLIR status
       * 
       * @param serial Serial number of request.
       * @param status "n" parameter from TS 27.007 7.7
       * 
       * Response function is IRadioVoiceResponse.setClirResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void setClir(int serial, int status) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(status);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setClir, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setClir is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Turn on or off uplink (microphone) mute. Must only be sent while voice call is active.
       * Must always be reset to "disable mute" when a new voice call is initiated
       * 
       * @param serial Serial number of request.
       * @param enable true for "enable mute" and false for "disable mute"
       * 
       * Response function is IRadioVoiceResponse.setMuteResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void setMute(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setMute, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setMute is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request to set the preferred voice privacy mode used in voice scrambling.
       * 
       * @param serial Serial number of request.
       * @param enable false for Standard Privacy Mode (Public Long Code Mask)
       *        true for Enhanced Privacy Mode (Private Long Code Mask)
       * 
       * Response function is IRadioVoiceResponse.setPreferredVoicePrivacyResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void setPreferredVoicePrivacy(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setPreferredVoicePrivacy, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setPreferredVoicePrivacy is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set response functions for voice radio requests and indications.
       * 
       * @param radioVoiceResponse Object containing response functions
       * @param radioVoiceIndication Object containing radio indications
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void setResponseFunctions(android.hardware.radio.voice.IRadioVoiceResponse radioVoiceResponse, android.hardware.radio.voice.IRadioVoiceIndication radioVoiceIndication) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(radioVoiceResponse);
          _data.writeStrongInterface(radioVoiceIndication);
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
       * Request to set the TTY mode
       * 
       * @param serial Serial number of request.
       * @param mode TtyMode
       * 
       * Response function is IRadioVoiceResponse.setTtyModeResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void setTtyMode(int serial, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setTtyMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setTtyMode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set Voice NR enable state
       * 
       * @param serial Serial number of request.
       * @param enable true for "enable vonr" and false for "disable vonr"
       * 
       * Response function is IRadioVoiceResponse.setVoNrEnabledResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       */
      @Override public void setVoNrEnabled(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setVoNrEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setVoNrEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Start playing a DTMF tone. Continue playing DTMF tone until stopDtmf is received. If a
       * startDtmf() is received while a tone is currently playing, it must cancel the previous tone
       * and play the new one.
       * 
       * @param serial Serial number of request.
       * @param s string having a single character with one of 12 values: 0-9,*,#
       * 
       * Response function is IRadioVoiceResponse.startDtmfResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void startDtmf(int serial, java.lang.String s) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(s);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startDtmf, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startDtmf is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Stop playing a currently playing DTMF tone.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.stopDtmfResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void stopDtmf(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopDtmf, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopDtmf is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Switch waiting or holding call and active call (like AT+CHLD=2).
       * Call transitions must happen as shown below.
       *   BEFORE                               AFTER
       * Call 1   Call 2                 Call 1       Call 2
       * ACTIVE   HOLDING                HOLDING     ACTIVE
       * ACTIVE   WAITING                HOLDING     ACTIVE
       * HOLDING  WAITING                HOLDING     ACTIVE
       * ACTIVE   IDLE                   HOLDING     IDLE
       * IDLE     IDLE                   IDLE        IDLE
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioVoiceResponse.switchWaitingOrHoldingAndActiveResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       */
      @Override public void switchWaitingOrHoldingAndActive(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_switchWaitingOrHoldingAndActive, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method switchWaitingOrHoldingAndActive is unimplemented.");
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
    static final int TRANSACTION_acceptCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_cancelPendingUssd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_conference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_dial = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_emergencyDial = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_exitEmergencyCallbackMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_explicitCallTransfer = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getCallForwardStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getCallWaiting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getClip = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getClir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getCurrentCalls = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getLastCallFailCause = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getMute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getPreferredVoicePrivacy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_getTtyMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_handleStkCallSetupRequestFromSim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_hangup = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_hangupForegroundResumeBackground = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_hangupWaitingOrBackground = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_isVoNrEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_rejectCall = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_responseAcknowledgement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_sendBurstDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_sendCdmaFeatureCode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_sendDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_sendUssd = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_separateConnection = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_setCallForward = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setCallWaiting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_setClir = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_setMute = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_setPreferredVoicePrivacy = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_setResponseFunctions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_setTtyMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_setVoNrEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_startDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_stopDtmf = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_switchWaitingOrHoldingAndActive = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$voice$IRadioVoice".replace('$', '.');
  /**
   * Answer incoming call. Must not be called for WAITING calls.
   * switchWaitingOrHoldingAndActive() must be used in this case instead
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.acceptCallResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void acceptCall(int serial) throws android.os.RemoteException;
  /**
   * Cancel the current USSD session if one exists.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.cancelPendingUssdResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void cancelPendingUssd(int serial) throws android.os.RemoteException;
  /**
   * Conference holding and active (like AT+CHLD=3)
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.conferenceResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void conference(int serial) throws android.os.RemoteException;
  /**
   * Initiate voice call. This method is never used for supplementary service codes.
   * 
   * @param serial Serial number of request.
   * @param dialInfo Dial struct
   * 
   * Response function is IRadioVoiceResponse.dialResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void dial(int serial, android.hardware.radio.voice.Dial dialInfo) throws android.os.RemoteException;
  /**
   * Initiate emergency voice call, with zero or more emergency service category(s), zero or
   * more emergency Uniform Resource Names (URN), and routing information for handling the call.
   * Android uses this request to make its emergency call instead of using IRadio.dial if the
   * 'address' in the 'dialInfo' field is identified as an emergency number by Android.
   * 
   * In multi-sim scenario, if the emergency number is from a specific subscription, this radio
   * request can still be sent out on the other subscription as long as routing is set to
   * EmergencyNumberRouting#EMERGENCY. This radio request will not be sent on an inactive
   * (PIN/PUK locked) subscription unless both subscriptions are PIN/PUK locked. In this case,
   * the request will be sent on the primary subscription.
   * 
   * Some countries or carriers require some emergency numbers that must be handled with normal
   * call routing if possible or emergency routing. 1) if the 'routing' field is specified as
   * EmergencyNumberRouting#NORMAL, the implementation must try the full radio service to use
   * normal call routing to handle the call; if service cannot support normal routing, the
   * implementation must use emergency routing to handle the call. 2) if 'routing' is specified
   * as EmergencyNumberRouting#EMERGENCY, the implementation must use emergency routing to handle
   * the call. 3) if 'routing' is specified as EmergencyNumberRouting#UNKNOWN, Android does not
   * know how to handle the call.
   * 
   * If the dialed emergency number does not have a specified emergency service category, the
   * 'categories' field is set to EmergencyServiceCategory#UNSPECIFIED; if the dialed emergency
   * number does not have specified emergency Uniform Resource Names, the 'urns' field is set to
   * an empty list. If the underlying technology used to request emergency services does not
   * support the emergency service category or emergency uniform resource names, the field
   * 'categories' or 'urns' may be ignored.
   * 
   * In the scenarios that the 'address' in the 'dialInfo' field has other functions besides the
   * emergency number function, if the 'hasKnownUserIntentEmergency' field is true, the user's
   * intent for this dial request is emergency call, and the modem must treat this as an actual
   * emergency dial; if the 'hasKnownUserIntentEmergency' field is false, Android does not know
   * user's intent for this call.
   * 
   * If 'isTesting' is true, this request is for testing purpose, and must not be sent to a real
   * emergency service; otherwise it's for a real emergency call request.
   * 
   * Reference: 3gpp 22.101, Section 10 - Emergency Calls;
   *            3gpp 23.167, Section 6 - Functional description;
   *            3gpp 24.503, Section 5.1.6.8.1 - General;
   *            RFC 5031
   * 
   * @param serial Serial number of request.
   * @param dialInfo the same Dial information used by IRadioVoice.dial.
   * @param categories bitfield<EmergencyServiceCategory> the Emergency Service Category(s)
   *        of the call.
   * @param urns the emergency Uniform Resource Names (URN)
   * @param routing EmergencyCallRouting the emergency call routing information.
   * @param hasKnownUserIntentEmergency Flag indicating if user's intent for the emergency call
   *        is known.
   * @param isTesting Flag indicating if this request is for testing purpose.
   * 
   * Response function is IRadioVoiceResponse.emergencyDialResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void emergencyDial(int serial, android.hardware.radio.voice.Dial dialInfo, int categories, java.lang.String[] urns, int routing, boolean hasKnownUserIntentEmergency, boolean isTesting) throws android.os.RemoteException;
  /**
   * Request the radio's system selection module to exit emergency callback mode. Radio must not
   * respond with SUCCESS until the modem has completely exited from Emergency Callback Mode.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.exitEmergencyCallbackModeResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void exitEmergencyCallbackMode(int serial) throws android.os.RemoteException;
  /**
   * Connects the two calls and disconnects the subscriber from both calls.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.explicitCallTransferResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void explicitCallTransfer(int serial) throws android.os.RemoteException;
  /**
   * Request call forward status.
   * 
   * @param serial Serial number of request.
   * @param callInfo CallForwardInfo
   * 
   * Response function is IRadioVoiceResponse.getCallForwardStatusResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getCallForwardStatus(int serial, android.hardware.radio.voice.CallForwardInfo callInfo) throws android.os.RemoteException;
  /**
   * Query current call waiting state
   * 
   * @param serial Serial number of request.
   * @param serviceClass Service class is the TS 27.007 service class to query
   * 
   * Response function is IRadioVoiceResponse.getCallWaitingResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getCallWaiting(int serial, int serviceClass) throws android.os.RemoteException;
  /**
   * Queries the status of the CLIP supplementary service (for MMI code "*#30#")
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.getClipResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getClip(int serial) throws android.os.RemoteException;
  /**
   * Gets current CLIR status
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.getClirResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getClir(int serial) throws android.os.RemoteException;
  /**
   * Requests current call list
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.getCurrentCallsResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getCurrentCalls(int serial) throws android.os.RemoteException;
  /**
   * Requests the failure cause code for the most recently terminated call.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.getLastCallFailCauseResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getLastCallFailCause(int serial) throws android.os.RemoteException;
  /**
   * Queries the current state of the uplink mute setting
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.getMuteResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getMute(int serial) throws android.os.RemoteException;
  /**
   * Request the setting of preferred voice privacy mode.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.getPreferredVoicePrivacyResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getPreferredVoicePrivacy(int serial) throws android.os.RemoteException;
  /**
   * Request the setting of TTY mode
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.getTtyModeResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void getTtyMode(int serial) throws android.os.RemoteException;
  /**
   * When STK application gets stkCallSetup(), the call actually has been initialized by the
   * mobile device already. (We could see the call has been in the 'call list'). STK application
   * needs to accept/reject the call according to user operations.
   * 
   * @param serial Serial number of request.
   * @param accept true = accept the call setup, false = reject the call setup
   * 
   * Response function is IRadioVoiceResponse.handleStkCallSetupRequestFromSimResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void handleStkCallSetupRequestFromSim(int serial, boolean accept) throws android.os.RemoteException;
  /**
   * Hang up a specific line (like AT+CHLD=1x). After this HANGUP request returns, Radio must
   * show the connection is NOT active anymore in next getCurrentCalls() query.
   * 
   * @param serial Serial number of request.
   * @param gsmIndex Connection index (value of 'x' in CHLD above)
   * 
   * Response function is IRadioVoiceResponse.hangupResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void hangup(int serial, int gsmIndex) throws android.os.RemoteException;
  /**
   * Hang up waiting or held (like AT+CHLD=1). After this HANGUP request returns, Radio must show
   * the connection is NOT active anymore in next getCurrentCalls() query.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.hangupForegroundResumeBackgroundResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void hangupForegroundResumeBackground(int serial) throws android.os.RemoteException;
  /**
   * Hang up waiting or held (like AT+CHLD=0). After this HANGUP request returns, Radio must show
   * the connection is NOT active anymore in next getCurrentCalls() query.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.hangupWaitingOrBackgroundResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void hangupWaitingOrBackground(int serial) throws android.os.RemoteException;
  /**
   * Query current Voice NR enable state
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.isVoNrEnabledResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void isVoNrEnabled(int serial) throws android.os.RemoteException;
  /**
   * Send UDUB (user determined user busy) to ringing or waiting call answer)
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.rejectCallResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void rejectCall(int serial) throws android.os.RemoteException;
  /**
   * When response type received from a radio indication or radio response is
   * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
   * acknowledge the receipt of those messages by sending responseAcknowledgement().
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void responseAcknowledgement() throws android.os.RemoteException;
  /**
   * Send DTMF string
   * 
   * @param serial Serial number of request.
   * @param dtmf DTMF string
   * @param on DTMF ON length in milliseconds, or 0 to use default
   * @param off is the DTMF OFF length in milliseconds, or 0 to use default
   * 
   * Response function is IRadioVoiceResponse.sendBurstDtmfResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void sendBurstDtmf(int serial, java.lang.String dtmf, int on, int off) throws android.os.RemoteException;
  /**
   * Send FLASH command
   * 
   * @param serial Serial number of request.
   * @param featureCode String associated with Flash command
   * 
   * Response function is IRadioVoiceResponse.sendCdmaFeatureCodeResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void sendCdmaFeatureCode(int serial, java.lang.String featureCode) throws android.os.RemoteException;
  /**
   * Send a DTMF tone. If the implementation is currently playing a tone requested via
   * startDtmf(), that tone must be cancelled and the new tone must be played instead.
   * 
   * @param serial Serial number of request.
   * @param s string with single char having one of 12 values: 0-9, *, #
   * 
   * Response function is IRadioVoiceResponse.sendDtmfResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void sendDtmf(int serial, java.lang.String s) throws android.os.RemoteException;
  /**
   * Send a USSD message. If a USSD session already exists, the message must be sent in the
   * context of that session. Otherwise, a new session must be created. The network reply must be
   * reported via unsolOnUssd.
   * 
   * Only one USSD session must exist at a time, and the session is assumed to exist until:
   * a) The android system invokes cancelUssd()
   * b) The implementation sends a unsolOnUssd() with a type code of
   *    "0" (USSD-Notify/no further action) or "2" (session terminated)
   * 
   * @param serial Serial number of request.
   * @param ussd string containing the USSD request in UTF-8 format
   * 
   * Response function is IRadioVoiceResponse.sendUssdResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void sendUssd(int serial, java.lang.String ussd) throws android.os.RemoteException;
  /**
   * Separate a party from a multiparty call placing the multiparty call (less the specified
   * party) on hold and leaving the specified party as the only other member of the current
   * (active) call. Like AT+CHLD=2x.
   * 
   * See TS 22.084 1.3.8.2 (iii)
   * TS 22.030 6.5.5 "Entering "2X followed by send"
   * TS 27.007 "AT+CHLD=2x"
   * 
   * @param serial Serial number of request.
   * @param gsmIndex contains Connection index (value of 'x' in CHLD above)
   * 
   * Response function is IRadioVoiceResponse.separateConnectionResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void separateConnection(int serial, int gsmIndex) throws android.os.RemoteException;
  /**
   * Configure call forward rule
   * 
   * @param serial Serial number of request.
   * @param callInfo CallForwardInfo
   * 
   * Response function is IRadioVoiceResponse.setCallForwardResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void setCallForward(int serial, android.hardware.radio.voice.CallForwardInfo callInfo) throws android.os.RemoteException;
  /**
   * Configure current call waiting state
   * 
   * @param serial Serial number of request.
   * @param enable is false for "disabled" and true for "enabled"
   * @param serviceClass is the TS 27.007 service class bit vector of services to modify
   * 
   * Response function is IRadioVoiceResponse.setCallWaitingResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void setCallWaiting(int serial, boolean enable, int serviceClass) throws android.os.RemoteException;
  /**
   * Set current CLIR status
   * 
   * @param serial Serial number of request.
   * @param status "n" parameter from TS 27.007 7.7
   * 
   * Response function is IRadioVoiceResponse.setClirResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void setClir(int serial, int status) throws android.os.RemoteException;
  /**
   * Turn on or off uplink (microphone) mute. Must only be sent while voice call is active.
   * Must always be reset to "disable mute" when a new voice call is initiated
   * 
   * @param serial Serial number of request.
   * @param enable true for "enable mute" and false for "disable mute"
   * 
   * Response function is IRadioVoiceResponse.setMuteResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void setMute(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Request to set the preferred voice privacy mode used in voice scrambling.
   * 
   * @param serial Serial number of request.
   * @param enable false for Standard Privacy Mode (Public Long Code Mask)
   *        true for Enhanced Privacy Mode (Private Long Code Mask)
   * 
   * Response function is IRadioVoiceResponse.setPreferredVoicePrivacyResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void setPreferredVoicePrivacy(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Set response functions for voice radio requests and indications.
   * 
   * @param radioVoiceResponse Object containing response functions
   * @param radioVoiceIndication Object containing radio indications
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void setResponseFunctions(android.hardware.radio.voice.IRadioVoiceResponse radioVoiceResponse, android.hardware.radio.voice.IRadioVoiceIndication radioVoiceIndication) throws android.os.RemoteException;
  /**
   * Request to set the TTY mode
   * 
   * @param serial Serial number of request.
   * @param mode TtyMode
   * 
   * Response function is IRadioVoiceResponse.setTtyModeResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void setTtyMode(int serial, int mode) throws android.os.RemoteException;
  /**
   * Set Voice NR enable state
   * 
   * @param serial Serial number of request.
   * @param enable true for "enable vonr" and false for "disable vonr"
   * 
   * Response function is IRadioVoiceResponse.setVoNrEnabledResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   */
  public void setVoNrEnabled(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Start playing a DTMF tone. Continue playing DTMF tone until stopDtmf is received. If a
   * startDtmf() is received while a tone is currently playing, it must cancel the previous tone
   * and play the new one.
   * 
   * @param serial Serial number of request.
   * @param s string having a single character with one of 12 values: 0-9,*,#
   * 
   * Response function is IRadioVoiceResponse.startDtmfResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void startDtmf(int serial, java.lang.String s) throws android.os.RemoteException;
  /**
   * Stop playing a currently playing DTMF tone.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.stopDtmfResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void stopDtmf(int serial) throws android.os.RemoteException;
  /**
   * Switch waiting or holding call and active call (like AT+CHLD=2).
   * Call transitions must happen as shown below.
   *   BEFORE                               AFTER
   * Call 1   Call 2                 Call 1       Call 2
   * ACTIVE   HOLDING                HOLDING     ACTIVE
   * ACTIVE   WAITING                HOLDING     ACTIVE
   * HOLDING  WAITING                HOLDING     ACTIVE
   * ACTIVE   IDLE                   HOLDING     IDLE
   * IDLE     IDLE                   IDLE        IDLE
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioVoiceResponse.switchWaitingOrHoldingAndActiveResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   */
  public void switchWaitingOrHoldingAndActive(int serial) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
