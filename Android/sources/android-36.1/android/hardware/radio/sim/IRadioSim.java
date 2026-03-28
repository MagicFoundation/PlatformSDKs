/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/IRadioSim.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/IRadioSim.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/**
 * This interface is used by telephony and telecom to talk to cellular radio for SIM APIs.
 * All the functions have minimum one parameter:
 * serial: which corresponds to serial no. of request. Serial numbers must only be memorized for the
 * duration of a method call. If clients provide colliding serials (including passing the same
 * serial to different methods), multiple responses (one for each method call) must still be served.
 * setResponseFunctions must work with IRadioSimResponse and IRadioSimIndication.
 * @hide
 */
public interface IRadioSim extends android.os.IInterface
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
  /** Default implementation for IRadioSim. */
  public static class Default implements android.hardware.radio.sim.IRadioSim
  {
    /**
     * Whether uiccApplications are enabled or disabled.
     * By default uiccApplications must be enabled, unless enableUiccApplications() with enable
     * being false is called.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.areUiccApplicationsEnabledResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void areUiccApplicationsEnabled(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Supplies old ICC PIN2 and new PIN2.
     * 
     * @param serial Serial number of request.
     * @param oldPin2 Old pin2 value
     * @param newPin2 New pin2 value
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     * 
     * Response function is IRadioSimResponse.changeIccPin2ForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void changeIccPin2ForApp(int serial, java.lang.String oldPin2, java.lang.String newPin2, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * Supplies old ICC PIN and new PIN.
     * 
     * @param serial Serial number of request.
     * @param oldPin Old pin value
     * @param newPin New pin value
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     * 
     * Response function is IRadioSimResponse.changeIccPinForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void changeIccPinForApp(int serial, java.lang.String oldPin, java.lang.String newPin, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * Enable or disable UiccApplications on the SIM. If disabled:
     *  - Modem will not register on any network.
     *  - SIM must be PRESENT, and the IccId of the SIM must still be accessible.
     *  - The corresponding modem stack is still functional, e.g. able to make emergency calls or
     *    do network scan.
     * By default if this API is not called, the uiccApplications must be enabled automatically.
     * It must work for both single SIM and DSDS cases for UX consistency.
     * The preference is per SIM, and must be remembered over power cycle, modem reboot, or SIM
     * insertion / unplug.
     * 
     * @param serial Serial number of request.
     * @param enable true if to enable uiccApplications, false to disable.
     * 
     * Response function is IRadioSimResponse.enableUiccApplicationsResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void enableUiccApplications(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Get carrier restrictions.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.getAllowedCarriersResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getAllowedCarriers(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request the device MDN / H_SID / H_NID. The request is only allowed when CDMA subscription
     * is available. When CDMA subscription is changed, application layer must re-issue the request
     * to update the subscription information.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.getCdmaSubscriptionResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void getCdmaSubscription(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request to query the location where the CDMA subscription shall be retrieved.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.getCdmaSubscriptionSourceResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void getCdmaSubscriptionSource(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Query the status of a facility lock state
     * 
     * @param serial Serial number of request.
     * @param facility is the facility string code from TS 27.007 7.4
     *        (eg "AO" for BAOC, "SC" for SIM lock)
     * @param password is the password, or "" if not required
     * @param serviceClass is the TS 27.007 service class bit vector of services to query
     * @param appId is AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     *        This is only applicable in the case of Fixed Dialing Numbers (FDN) requests.
     * 
     * Response function is IRadioSimResponse.getFacilityLockForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getFacilityLockForApp(int serial, java.lang.String facility, java.lang.String password, int serviceClass, java.lang.String appId) throws android.os.RemoteException
    {
    }
    /**
     * Requests status of the ICC card
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.getIccCardStatusResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getIccCardStatus(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get the SIM IMSI. Only valid when radio state is "RADIO_STATE_ON"
     * 
     * @param serial Serial number of request.
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     * 
     * Response function is IRadioSimResponse.getImsiForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getImsiForApp(int serial, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * Get the phonebook capacity.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.getSimPhonebookCapacityResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getSimPhonebookCapacity(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get the local and global phonebook records from the SIM card.
     * This should be called again after a simPhonebookChanged notification is received.
     * The phonebook records are received via IRadioSimIndication.simPhonebookRecordsReceived()
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.getSimPhonebookRecordsResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void getSimPhonebookRecords(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Close a previously opened logical channel. This command reflects TS 27.007
     * "close logical channel" operation (+CCHC).
     * 
     * @param serial Serial number of request.
     * @param channelId session id of the logical channel (+CCHC).
     * 
     * Response function is IRadioSimResponse.iccCloseLogicalChannelResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     * 
     * @deprecated use iccCloseLogicalChannelWithSessionInfo instead.
     */
    @Override public void iccCloseLogicalChannel(int serial, int channelId) throws android.os.RemoteException
    {
    }
    /**
     * Request ICC I/O operation. This is similar to the TS 27.007 "restricted SIM" operation where
     * it assumes all of the EF selection must be done by the callee. Arguments and responses that
     * are unused for certain values of "command" must be ignored or set to empty string.
     * Note that IccIo has a "PIN2" field which may be empty string, or may specify a PIN2 for
     * operations that require a PIN2 (eg updating FDN records).
     * 
     * @param serial Serial number of request.
     * @param iccIo IccIo
     * 
     * Response function is IRadioSimResponse.iccIoForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void iccIoForApp(int serial, android.hardware.radio.sim.IccIo iccIo) throws android.os.RemoteException
    {
    }
    /**
     * Open a new logical channel and select the given application. This command
     * reflects TS 27.007 "open logical channel" operation (+CCHO).
     * 
     * For MEP-A(Multiple enabled profile), only dedicated port 0 is ISDR selectable.
     * e.g., Port0 - for ISDR access and Port1/Port2 - the currently active ports/subscriptions.
     * Port 0 should be transparent to AP and iccLogicalChannel API should remain the same.
     * Even if the ISDR request comes over port1 or port2, Modem would just internally convert the
     * portID to port0 and add the real port index as the payload of MANAGE_CHANNEL command.
     * 
     * @param serial Serial number of request.
     * @param aid AID value, See ETSI 102.221 and 101.220.
     * @param p2 P2 value, described in ISO 7816-4. Ignore if equal to RadioConst:P2_CONSTANT_NO_P2
     * 
     * Response function is IRadioSimResponse.iccOpenLogicalChannelResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void iccOpenLogicalChannel(int serial, java.lang.String aid, int p2) throws android.os.RemoteException
    {
    }
    /**
     * Request APDU exchange on the basic channel. This command reflects TS 27.007
     * "generic SIM access" operation (+CSIM). The modem must ensure proper function of GSM,
     * and filter commands appropriately. It must filter channel management and SELECT by DF
     * name commands. "sessionId" field is always 0 (for aid="") and may be ignored.
     * 
     * @param serial Serial number of request.
     * @param message SimApdu to be sent
     * 
     * Response function is IRadioSimResponse.iccTransmitApduBasicChannelResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void iccTransmitApduBasicChannel(int serial, android.hardware.radio.sim.SimApdu message) throws android.os.RemoteException
    {
    }
    /**
     * Exchange APDUs with a UICC over a previously opened logical channel. This command reflects
     * TS 27.007 "generic logical channel access" operation (+CGLA). The modem must filter channel
     * management and SELECT by DF name commands.
     * 
     * @param serial Serial number of request.
     * @param message SimApdu to be sent
     * 
     * Response function is IRadioSimResponse.iccTransmitApduLogicalChannelResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void iccTransmitApduLogicalChannel(int serial, android.hardware.radio.sim.SimApdu message) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that the StkService is running and is ready to receive unsolicited stk commands.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioSimResponse.reportStkServiceIsRunningResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void reportStkServiceIsRunning(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Returns the response of SIM Authentication through Radio challenge request.
     * 
     * @param serial Serial number of request.
     * @param authContext P2 value of authentication command, see P2 parameter in
     *        3GPP TS 31.102 7.1.2
     * @param authData the challenge string in Base64 format, see 3GPP TS 31.102 7.1.2
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value
     * 
     * Response function is IRadioSimResponse.requestIccSimAuthenticationResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void requestIccSimAuthentication(int serial, int authContext, java.lang.String authData, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * When response type received from a radio indication or radio response is
     * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
     * acknowledge the receipt of those messages by sending responseAcknowledgement().
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void responseAcknowledgement() throws android.os.RemoteException
    {
    }
    /**
     * Requests to send a SAT/USAT envelope command to SIM.
     * The SAT/USAT envelope command refers to 3GPP TS 11.14 and 3GPP TS 31.111
     * 
     * @param serial Serial number of request.
     * @param contents SAT/USAT command in hexadecimal format string starting with command tag
     * 
     * Response function is IRadioSimResponse.sendEnvelopeResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void sendEnvelope(int serial, java.lang.String contents) throws android.os.RemoteException
    {
    }
    /**
     * Requests to send a SAT/USAT envelope command to SIM. The SAT/USAT envelope command refers to
     * 3GPP TS 11.14 and 3GPP TS 31.111. This request has one difference from sendEnvelope():
     * The SW1 and SW2 status bytes from the UICC response are returned along with the response
     * data, using the same structure as iccIOForApp(). The implementation must perform normal
     * processing of a '91XX' response in SW1/SW2 to retrieve the pending proactive command and
     * send it as an unsolicited response, as sendEnvelope() does.
     * 
     * @param serial Serial number of request.
     * @param contents SAT/USAT command in hexadecimal format starting with command tag
     * 
     * Response function is IRadioSimResponse.sendEnvelopeWithStatusResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void sendEnvelopeWithStatus(int serial, java.lang.String contents) throws android.os.RemoteException
    {
    }
    /**
     * Requests to send a terminal response to SIM for a received proactive command
     * 
     * @param serial Serial number of request.
     * @param contents SAT/USAT response in hexadecimal format string starting with
     *        first byte of response data
     * 
     * Response function is IRadioSimResponse.sendTerminalResponseResponseToSim()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void sendTerminalResponseToSim(int serial, java.lang.String contents) throws android.os.RemoteException
    {
    }
    /**
     * Set carrier restrictions. Expected modem behavior:
     *  If never receives this command:
     *  - Must allow all carriers
     *  Receives this command:
     *  - Only allow carriers specified in carriers. The restriction persists across power cycles
     *    and FDR. If a present SIM is allowed, modem must not reload the SIM. If a present SIM is
     *    *not* allowed, modem must detach from the registered network and only keep emergency
     *    service, and notify Android SIM refresh reset with new SIM state being
     *    CardState:RESTRICTED. Emergency service must be enabled.
     * 
     * @param serial Serial number of request.
     * @param carriers CarrierRestrictions consisting allowed and excluded carriers
     * @param multiSimPolicy Policy to be used for devices with multiple SIMs.
     * 
     * Response function is IRadioSimResponse.setAllowedCarriersResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void setAllowedCarriers(int serial, android.hardware.radio.sim.CarrierRestrictions carriers, int multiSimPolicy) throws android.os.RemoteException
    {
    }
    /**
     * Provide Carrier specific information to the modem that must be used to encrypt the IMSI and
     * IMPI. Sent by the framework during boot, carrier switch and every time the framework receives
     * a new certificate.
     * 
     * @param serial Serial number of request.
     * @param imsiEncryptionInfo ImsiEncryptionInfo
     * 
     * Response function is IRadioSimResponse.setCarrierInfoForImsiEncryptionResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void setCarrierInfoForImsiEncryption(int serial, android.hardware.radio.sim.ImsiEncryptionInfo imsiEncryptionInfo) throws android.os.RemoteException
    {
    }
    /**
     * Request to set the location where the CDMA subscription shall be retrieved
     * 
     * @param serial Serial number of request.
     * @param cdmaSub CdmaSubscriptionSource
     * 
     * Response function is IRadioSimResponse.setCdmaSubscriptionSourceResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void setCdmaSubscriptionSource(int serial, int cdmaSub) throws android.os.RemoteException
    {
    }
    /**
     * Enable/disable one facility lock
     * 
     * @param serial Serial number of request.
     * @param facility is the facility string code from TS 27.007 7.4 (eg "AO" for BAOC)
     * @param lockState false for "unlock" and true for "lock"
     * @param password is the password
     * @param serviceClass is string representation of decimal TS 27.007 service class bit vector.
     *        Eg, the string "1" means "set this facility for voice services"
     * @param appId is AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     *        This is only applicable in the case of Fixed Dialing Numbers (FDN) requests.
     * 
     * Response function is IRadioSimResponse.setFacilityLockForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void setFacilityLockForApp(int serial, java.lang.String facility, boolean lockState, java.lang.String password, int serviceClass, java.lang.String appId) throws android.os.RemoteException
    {
    }
    /**
     * Set response functions for SIM radio requests and indications.
     * 
     * @param radioSimResponse Object containing response functions
     * @param radioSimIndication Object containing radio indications
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void setResponseFunctions(android.hardware.radio.sim.IRadioSimResponse radioSimResponse, android.hardware.radio.sim.IRadioSimIndication radioSimIndication) throws android.os.RemoteException
    {
    }
    /**
     * Set SIM card power state. Request is used to power off or power on the card. It should not
     * generate a CardState.CARDSTATE_ABSENT indication, since the SIM is still physically inserted.
     * When SIM card is in POWER_UP_PASS_THROUGH, the modem does not send any command to it (for
     * example SELECT of MF, or TERMINAL CAPABILITY), and the SIM card is controlled completely by
     * Telephony sending APDUs directly. The SIM card state must be RIL_CARDSTATE_PRESENT and the
     * number of card apps will be 0. No new error code is generated. Emergency calls are supported
     * in the same way as if the SIM card is absent. Pass-through mode is valid only for the
     * specific card session where it is activated, and normal behavior occurs at the next SIM
     * initialization, unless POWER_UP_PASS_THROUGH is requested again.
     * The device is required to power down the SIM card before it can switch the mode between
     * POWER_UP and POWER_UP_PASS_THROUGH. At device power up, the SIM interface is powered up
     * automatically. Each subsequent request to this method is processed only after the completion
     * of the previous one.
     * When the SIM is in POWER_DOWN, the modem should send an empty vector of AppStatus in
     * CardStatus.applications. If a SIM in the POWER_DOWN state is removed and a new SIM is
     * inserted, the new SIM should be in POWER_UP mode by default. If the device is turned off or
     * restarted while the SIM is in POWER_DOWN, then the SIM should turn on normally in POWER_UP
     * mode when the device turns back on.
     * 
     * @param serial Serial number of request
     * @param powerUp POWER_DOWN if powering down the SIM card
     *                POWER_UP if powering up the SIM card
     *                POWER_UP_PASS_THROUGH if powering up the SIM card in pass through mode
     * 
     * Response function is IRadioSimResponse.setSimCardPowerResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void setSimCardPower(int serial, int powerUp) throws android.os.RemoteException
    {
    }
    /**
     * Selection/de-selection of a subscription from a SIM card
     * 
     * @param serial Serial number of request.
     * @param uiccSub SelectUiccSub
     * 
     * Response function is IRadioSimResponse.setUiccSubscriptionResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void setUiccSubscription(int serial, android.hardware.radio.sim.SelectUiccSub uiccSub) throws android.os.RemoteException
    {
    }
    /**
     * Supplies ICC PIN2. Only called following operation where SIM_PIN2 was returned as a failure
     * from a previous operation. If the supplied PIN2 is empty, this should just query the number
     * of retries.
     * 
     * @param serial Serial number of request.
     * @param pin2 PIN2 value
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     * 
     * Response function is IRadioSimResponse.supplyIccPin2ForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void supplyIccPin2ForApp(int serial, java.lang.String pin2, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * Supplies ICC PIN. Only called if CardStatus has AppState.PIN state. If the supplied PIN is
     * empty, this should just query the number of retries.
     * 
     * @param serial Serial number of request.
     * @param pin PIN value
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     * 
     * Response function is IRadioSimResponse.supplyIccPinForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void supplyIccPinForApp(int serial, java.lang.String pin, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * Supplies ICC PUK2 and new PIN2. If the supplied PUK2 is empty, this should just query the
     * number of retries.
     * 
     * @param serial Serial number of request.
     * @param puk2 PUK2 value
     * @param pin2 New PIN2 value
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     * 
     * Response function is IRadioSimResponse.supplyIccPuk2ForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void supplyIccPuk2ForApp(int serial, java.lang.String puk2, java.lang.String pin2, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * Supplies ICC PUK and new PIN. If the supplied PUK is empty, this should just query the
     * number of retries.
     * 
     * @param serial Serial number of request.
     * @param puk PUK value
     * @param pin New PIN value
     * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
     * 
     * Response function is IRadioSimResponse.supplyIccPukForAppResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void supplyIccPukForApp(int serial, java.lang.String puk, java.lang.String pin, java.lang.String aid) throws android.os.RemoteException
    {
    }
    /**
     * Request that deactivates one category of device personalization. Device personalization
     * generally binds the device so it can only be used on one carrier or even one carrier subnet
     * (See TS 22.022). When the user has gained the rights to unbind the device (at the end of a
     * contract period or other event), the controlKey will be delivered to either the user for
     * manual entry or to a carrier app on the device for automatic entry.
     * 
     * @param serial Serial number of request.
     * @param persoType SIM personalization type.
     * @param controlKey the unlock code for removing persoType personalization from this device
     * 
     * Response function is IRadioSimResponse.supplySimDepersonalizationResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void supplySimDepersonalization(int serial, int persoType, java.lang.String controlKey) throws android.os.RemoteException
    {
    }
    /**
     * Insert, delete or update a phonebook record on the SIM card. If the index of recordInfo is 0,
     * the phonebook record will be added to global or local phonebook, and global phonebook has
     * higher priority than local phonebook. If the fields in the recordInfo are all empty except
     * for the index, the phonebook record specified by the index will be deleted. The indication
     * simPhonebookChanged will be called after every successful call of updateSimPhonebookRecords.
     * 
     * @param serial Serial number of request.
     * @param recordInfo Details of the record to insert, delete or update.
     * 
     * Response function is IRadioSimResponse.updateSimPhonebookRecordsResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void updateSimPhonebookRecords(int serial, android.hardware.radio.sim.PhonebookRecordInfo recordInfo) throws android.os.RemoteException
    {
    }
    /**
     * Close a previously opened logical channel. This command reflects TS 27.007
     * "close logical channel" operation (+CCHC).
     * 
     * Per spec SGP.22 V3.0, ES10 commands need to be sent over command port of MEP-A. In order
     * to close proper logical channel, should pass information about whether the logical channel
     * was opened for sending ES10 commands or not.
     * 
     * @param serial Serial number of request.
     * @param sessionInfo Details of the opened logical channel info like sessionId and isEs10.
     * 
     * Response function is IRadioSimResponse.iccCloseLogicalChannelWithSessionInfoResponse()
     * 
     * This is available when android.hardware.telephony.subscription is defined.
     */
    @Override public void iccCloseLogicalChannelWithSessionInfo(int serial, android.hardware.radio.sim.SessionInfo sessionInfo) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.sim.IRadioSim
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.sim.IRadioSim interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.sim.IRadioSim asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.sim.IRadioSim))) {
        return ((android.hardware.radio.sim.IRadioSim)iin);
      }
      return new android.hardware.radio.sim.IRadioSim.Stub.Proxy(obj);
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
        case TRANSACTION_areUiccApplicationsEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.areUiccApplicationsEnabled(_arg0);
          break;
        }
        case TRANSACTION_changeIccPin2ForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          data.enforceNoDataAvail();
          this.changeIccPin2ForApp(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_changeIccPinForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          data.enforceNoDataAvail();
          this.changeIccPinForApp(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_enableUiccApplications:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.enableUiccApplications(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getAllowedCarriers:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getAllowedCarriers(_arg0);
          break;
        }
        case TRANSACTION_getCdmaSubscription:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getCdmaSubscription(_arg0);
          break;
        }
        case TRANSACTION_getCdmaSubscriptionSource:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getCdmaSubscriptionSource(_arg0);
          break;
        }
        case TRANSACTION_getFacilityLockForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          java.lang.String _arg4;
          _arg4 = data.readString();
          data.enforceNoDataAvail();
          this.getFacilityLockForApp(_arg0, _arg1, _arg2, _arg3, _arg4);
          break;
        }
        case TRANSACTION_getIccCardStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getIccCardStatus(_arg0);
          break;
        }
        case TRANSACTION_getImsiForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.getImsiForApp(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getSimPhonebookCapacity:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSimPhonebookCapacity(_arg0);
          break;
        }
        case TRANSACTION_getSimPhonebookRecords:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSimPhonebookRecords(_arg0);
          break;
        }
        case TRANSACTION_iccCloseLogicalChannel:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.iccCloseLogicalChannel(_arg0, _arg1);
          break;
        }
        case TRANSACTION_iccIoForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.IccIo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.IccIo.CREATOR);
          data.enforceNoDataAvail();
          this.iccIoForApp(_arg0, _arg1);
          break;
        }
        case TRANSACTION_iccOpenLogicalChannel:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.iccOpenLogicalChannel(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_iccTransmitApduBasicChannel:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.SimApdu _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.SimApdu.CREATOR);
          data.enforceNoDataAvail();
          this.iccTransmitApduBasicChannel(_arg0, _arg1);
          break;
        }
        case TRANSACTION_iccTransmitApduLogicalChannel:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.SimApdu _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.SimApdu.CREATOR);
          data.enforceNoDataAvail();
          this.iccTransmitApduLogicalChannel(_arg0, _arg1);
          break;
        }
        case TRANSACTION_reportStkServiceIsRunning:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.reportStkServiceIsRunning(_arg0);
          break;
        }
        case TRANSACTION_requestIccSimAuthentication:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          data.enforceNoDataAvail();
          this.requestIccSimAuthentication(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_responseAcknowledgement:
        {
          this.responseAcknowledgement();
          break;
        }
        case TRANSACTION_sendEnvelope:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.sendEnvelope(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendEnvelopeWithStatus:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.sendEnvelopeWithStatus(_arg0, _arg1);
          break;
        }
        case TRANSACTION_sendTerminalResponseToSim:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.sendTerminalResponseToSim(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setAllowedCarriers:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.CarrierRestrictions _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.CarrierRestrictions.CREATOR);
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.setAllowedCarriers(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_setCarrierInfoForImsiEncryption:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.ImsiEncryptionInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.ImsiEncryptionInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCarrierInfoForImsiEncryption(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setCdmaSubscriptionSource:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setCdmaSubscriptionSource(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setFacilityLockForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          boolean _arg2;
          _arg2 = data.readBoolean();
          java.lang.String _arg3;
          _arg3 = data.readString();
          int _arg4;
          _arg4 = data.readInt();
          java.lang.String _arg5;
          _arg5 = data.readString();
          data.enforceNoDataAvail();
          this.setFacilityLockForApp(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          break;
        }
        case TRANSACTION_setResponseFunctions:
        {
          android.hardware.radio.sim.IRadioSimResponse _arg0;
          _arg0 = android.hardware.radio.sim.IRadioSimResponse.Stub.asInterface(data.readStrongBinder());
          android.hardware.radio.sim.IRadioSimIndication _arg1;
          _arg1 = android.hardware.radio.sim.IRadioSimIndication.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setResponseFunctions(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSimCardPower:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setSimCardPower(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setUiccSubscription:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.SelectUiccSub _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.SelectUiccSub.CREATOR);
          data.enforceNoDataAvail();
          this.setUiccSubscription(_arg0, _arg1);
          break;
        }
        case TRANSACTION_supplyIccPin2ForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          data.enforceNoDataAvail();
          this.supplyIccPin2ForApp(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_supplyIccPinForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          data.enforceNoDataAvail();
          this.supplyIccPinForApp(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_supplyIccPuk2ForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          data.enforceNoDataAvail();
          this.supplyIccPuk2ForApp(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_supplyIccPukForApp:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          data.enforceNoDataAvail();
          this.supplyIccPukForApp(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_supplySimDepersonalization:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          java.lang.String _arg2;
          _arg2 = data.readString();
          data.enforceNoDataAvail();
          this.supplySimDepersonalization(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_updateSimPhonebookRecords:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.PhonebookRecordInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.PhonebookRecordInfo.CREATOR);
          data.enforceNoDataAvail();
          this.updateSimPhonebookRecords(_arg0, _arg1);
          break;
        }
        case TRANSACTION_iccCloseLogicalChannelWithSessionInfo:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.sim.SessionInfo _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.sim.SessionInfo.CREATOR);
          data.enforceNoDataAvail();
          this.iccCloseLogicalChannelWithSessionInfo(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.sim.IRadioSim
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
       * Whether uiccApplications are enabled or disabled.
       * By default uiccApplications must be enabled, unless enableUiccApplications() with enable
       * being false is called.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.areUiccApplicationsEnabledResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void areUiccApplicationsEnabled(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_areUiccApplicationsEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method areUiccApplicationsEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Supplies old ICC PIN2 and new PIN2.
       * 
       * @param serial Serial number of request.
       * @param oldPin2 Old pin2 value
       * @param newPin2 New pin2 value
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       * 
       * Response function is IRadioSimResponse.changeIccPin2ForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void changeIccPin2ForApp(int serial, java.lang.String oldPin2, java.lang.String newPin2, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(oldPin2);
          _data.writeString(newPin2);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_changeIccPin2ForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method changeIccPin2ForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Supplies old ICC PIN and new PIN.
       * 
       * @param serial Serial number of request.
       * @param oldPin Old pin value
       * @param newPin New pin value
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       * 
       * Response function is IRadioSimResponse.changeIccPinForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void changeIccPinForApp(int serial, java.lang.String oldPin, java.lang.String newPin, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(oldPin);
          _data.writeString(newPin);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_changeIccPinForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method changeIccPinForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enable or disable UiccApplications on the SIM. If disabled:
       *  - Modem will not register on any network.
       *  - SIM must be PRESENT, and the IccId of the SIM must still be accessible.
       *  - The corresponding modem stack is still functional, e.g. able to make emergency calls or
       *    do network scan.
       * By default if this API is not called, the uiccApplications must be enabled automatically.
       * It must work for both single SIM and DSDS cases for UX consistency.
       * The preference is per SIM, and must be remembered over power cycle, modem reboot, or SIM
       * insertion / unplug.
       * 
       * @param serial Serial number of request.
       * @param enable true if to enable uiccApplications, false to disable.
       * 
       * Response function is IRadioSimResponse.enableUiccApplicationsResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void enableUiccApplications(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_enableUiccApplications, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method enableUiccApplications is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get carrier restrictions.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.getAllowedCarriersResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getAllowedCarriers(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllowedCarriers, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getAllowedCarriers is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request the device MDN / H_SID / H_NID. The request is only allowed when CDMA subscription
       * is available. When CDMA subscription is changed, application layer must re-issue the request
       * to update the subscription information.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.getCdmaSubscriptionResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void getCdmaSubscription(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCdmaSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCdmaSubscription is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request to query the location where the CDMA subscription shall be retrieved.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.getCdmaSubscriptionSourceResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void getCdmaSubscriptionSource(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCdmaSubscriptionSource, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCdmaSubscriptionSource is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Query the status of a facility lock state
       * 
       * @param serial Serial number of request.
       * @param facility is the facility string code from TS 27.007 7.4
       *        (eg "AO" for BAOC, "SC" for SIM lock)
       * @param password is the password, or "" if not required
       * @param serviceClass is the TS 27.007 service class bit vector of services to query
       * @param appId is AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       *        This is only applicable in the case of Fixed Dialing Numbers (FDN) requests.
       * 
       * Response function is IRadioSimResponse.getFacilityLockForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getFacilityLockForApp(int serial, java.lang.String facility, java.lang.String password, int serviceClass, java.lang.String appId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(facility);
          _data.writeString(password);
          _data.writeInt(serviceClass);
          _data.writeString(appId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getFacilityLockForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getFacilityLockForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Requests status of the ICC card
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.getIccCardStatusResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getIccCardStatus(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getIccCardStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getIccCardStatus is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the SIM IMSI. Only valid when radio state is "RADIO_STATE_ON"
       * 
       * @param serial Serial number of request.
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       * 
       * Response function is IRadioSimResponse.getImsiForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getImsiForApp(int serial, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getImsiForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getImsiForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the phonebook capacity.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.getSimPhonebookCapacityResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getSimPhonebookCapacity(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimPhonebookCapacity, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimPhonebookCapacity is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the local and global phonebook records from the SIM card.
       * This should be called again after a simPhonebookChanged notification is received.
       * The phonebook records are received via IRadioSimIndication.simPhonebookRecordsReceived()
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.getSimPhonebookRecordsResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void getSimPhonebookRecords(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSimPhonebookRecords, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSimPhonebookRecords is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Close a previously opened logical channel. This command reflects TS 27.007
       * "close logical channel" operation (+CCHC).
       * 
       * @param serial Serial number of request.
       * @param channelId session id of the logical channel (+CCHC).
       * 
       * Response function is IRadioSimResponse.iccCloseLogicalChannelResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       * 
       * @deprecated use iccCloseLogicalChannelWithSessionInfo instead.
       */
      @Override public void iccCloseLogicalChannel(int serial, int channelId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(channelId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_iccCloseLogicalChannel, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method iccCloseLogicalChannel is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request ICC I/O operation. This is similar to the TS 27.007 "restricted SIM" operation where
       * it assumes all of the EF selection must be done by the callee. Arguments and responses that
       * are unused for certain values of "command" must be ignored or set to empty string.
       * Note that IccIo has a "PIN2" field which may be empty string, or may specify a PIN2 for
       * operations that require a PIN2 (eg updating FDN records).
       * 
       * @param serial Serial number of request.
       * @param iccIo IccIo
       * 
       * Response function is IRadioSimResponse.iccIoForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void iccIoForApp(int serial, android.hardware.radio.sim.IccIo iccIo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(iccIo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_iccIoForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method iccIoForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Open a new logical channel and select the given application. This command
       * reflects TS 27.007 "open logical channel" operation (+CCHO).
       * 
       * For MEP-A(Multiple enabled profile), only dedicated port 0 is ISDR selectable.
       * e.g., Port0 - for ISDR access and Port1/Port2 - the currently active ports/subscriptions.
       * Port 0 should be transparent to AP and iccLogicalChannel API should remain the same.
       * Even if the ISDR request comes over port1 or port2, Modem would just internally convert the
       * portID to port0 and add the real port index as the payload of MANAGE_CHANNEL command.
       * 
       * @param serial Serial number of request.
       * @param aid AID value, See ETSI 102.221 and 101.220.
       * @param p2 P2 value, described in ISO 7816-4. Ignore if equal to RadioConst:P2_CONSTANT_NO_P2
       * 
       * Response function is IRadioSimResponse.iccOpenLogicalChannelResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void iccOpenLogicalChannel(int serial, java.lang.String aid, int p2) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(aid);
          _data.writeInt(p2);
          boolean _status = mRemote.transact(Stub.TRANSACTION_iccOpenLogicalChannel, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method iccOpenLogicalChannel is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request APDU exchange on the basic channel. This command reflects TS 27.007
       * "generic SIM access" operation (+CSIM). The modem must ensure proper function of GSM,
       * and filter commands appropriately. It must filter channel management and SELECT by DF
       * name commands. "sessionId" field is always 0 (for aid="") and may be ignored.
       * 
       * @param serial Serial number of request.
       * @param message SimApdu to be sent
       * 
       * Response function is IRadioSimResponse.iccTransmitApduBasicChannelResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void iccTransmitApduBasicChannel(int serial, android.hardware.radio.sim.SimApdu message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(message, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_iccTransmitApduBasicChannel, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method iccTransmitApduBasicChannel is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Exchange APDUs with a UICC over a previously opened logical channel. This command reflects
       * TS 27.007 "generic logical channel access" operation (+CGLA). The modem must filter channel
       * management and SELECT by DF name commands.
       * 
       * @param serial Serial number of request.
       * @param message SimApdu to be sent
       * 
       * Response function is IRadioSimResponse.iccTransmitApduLogicalChannelResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void iccTransmitApduLogicalChannel(int serial, android.hardware.radio.sim.SimApdu message) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(message, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_iccTransmitApduLogicalChannel, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method iccTransmitApduLogicalChannel is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that the StkService is running and is ready to receive unsolicited stk commands.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioSimResponse.reportStkServiceIsRunningResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void reportStkServiceIsRunning(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_reportStkServiceIsRunning, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method reportStkServiceIsRunning is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Returns the response of SIM Authentication through Radio challenge request.
       * 
       * @param serial Serial number of request.
       * @param authContext P2 value of authentication command, see P2 parameter in
       *        3GPP TS 31.102 7.1.2
       * @param authData the challenge string in Base64 format, see 3GPP TS 31.102 7.1.2
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value
       * 
       * Response function is IRadioSimResponse.requestIccSimAuthenticationResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void requestIccSimAuthentication(int serial, int authContext, java.lang.String authData, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(authContext);
          _data.writeString(authData);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_requestIccSimAuthentication, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method requestIccSimAuthentication is unimplemented.");
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
       * This is available when android.hardware.telephony.subscription is defined.
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
       * Requests to send a SAT/USAT envelope command to SIM.
       * The SAT/USAT envelope command refers to 3GPP TS 11.14 and 3GPP TS 31.111
       * 
       * @param serial Serial number of request.
       * @param contents SAT/USAT command in hexadecimal format string starting with command tag
       * 
       * Response function is IRadioSimResponse.sendEnvelopeResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void sendEnvelope(int serial, java.lang.String contents) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(contents);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendEnvelope, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendEnvelope is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Requests to send a SAT/USAT envelope command to SIM. The SAT/USAT envelope command refers to
       * 3GPP TS 11.14 and 3GPP TS 31.111. This request has one difference from sendEnvelope():
       * The SW1 and SW2 status bytes from the UICC response are returned along with the response
       * data, using the same structure as iccIOForApp(). The implementation must perform normal
       * processing of a '91XX' response in SW1/SW2 to retrieve the pending proactive command and
       * send it as an unsolicited response, as sendEnvelope() does.
       * 
       * @param serial Serial number of request.
       * @param contents SAT/USAT command in hexadecimal format starting with command tag
       * 
       * Response function is IRadioSimResponse.sendEnvelopeWithStatusResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void sendEnvelopeWithStatus(int serial, java.lang.String contents) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(contents);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendEnvelopeWithStatus, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendEnvelopeWithStatus is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Requests to send a terminal response to SIM for a received proactive command
       * 
       * @param serial Serial number of request.
       * @param contents SAT/USAT response in hexadecimal format string starting with
       *        first byte of response data
       * 
       * Response function is IRadioSimResponse.sendTerminalResponseResponseToSim()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void sendTerminalResponseToSim(int serial, java.lang.String contents) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(contents);
          boolean _status = mRemote.transact(Stub.TRANSACTION_sendTerminalResponseToSim, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method sendTerminalResponseToSim is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set carrier restrictions. Expected modem behavior:
       *  If never receives this command:
       *  - Must allow all carriers
       *  Receives this command:
       *  - Only allow carriers specified in carriers. The restriction persists across power cycles
       *    and FDR. If a present SIM is allowed, modem must not reload the SIM. If a present SIM is
       *    *not* allowed, modem must detach from the registered network and only keep emergency
       *    service, and notify Android SIM refresh reset with new SIM state being
       *    CardState:RESTRICTED. Emergency service must be enabled.
       * 
       * @param serial Serial number of request.
       * @param carriers CarrierRestrictions consisting allowed and excluded carriers
       * @param multiSimPolicy Policy to be used for devices with multiple SIMs.
       * 
       * Response function is IRadioSimResponse.setAllowedCarriersResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void setAllowedCarriers(int serial, android.hardware.radio.sim.CarrierRestrictions carriers, int multiSimPolicy) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(carriers, 0);
          _data.writeInt(multiSimPolicy);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAllowedCarriers, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setAllowedCarriers is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Provide Carrier specific information to the modem that must be used to encrypt the IMSI and
       * IMPI. Sent by the framework during boot, carrier switch and every time the framework receives
       * a new certificate.
       * 
       * @param serial Serial number of request.
       * @param imsiEncryptionInfo ImsiEncryptionInfo
       * 
       * Response function is IRadioSimResponse.setCarrierInfoForImsiEncryptionResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void setCarrierInfoForImsiEncryption(int serial, android.hardware.radio.sim.ImsiEncryptionInfo imsiEncryptionInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(imsiEncryptionInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCarrierInfoForImsiEncryption, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCarrierInfoForImsiEncryption is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request to set the location where the CDMA subscription shall be retrieved
       * 
       * @param serial Serial number of request.
       * @param cdmaSub CdmaSubscriptionSource
       * 
       * Response function is IRadioSimResponse.setCdmaSubscriptionSourceResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void setCdmaSubscriptionSource(int serial, int cdmaSub) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(cdmaSub);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCdmaSubscriptionSource, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCdmaSubscriptionSource is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enable/disable one facility lock
       * 
       * @param serial Serial number of request.
       * @param facility is the facility string code from TS 27.007 7.4 (eg "AO" for BAOC)
       * @param lockState false for "unlock" and true for "lock"
       * @param password is the password
       * @param serviceClass is string representation of decimal TS 27.007 service class bit vector.
       *        Eg, the string "1" means "set this facility for voice services"
       * @param appId is AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       *        This is only applicable in the case of Fixed Dialing Numbers (FDN) requests.
       * 
       * Response function is IRadioSimResponse.setFacilityLockForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void setFacilityLockForApp(int serial, java.lang.String facility, boolean lockState, java.lang.String password, int serviceClass, java.lang.String appId) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(facility);
          _data.writeBoolean(lockState);
          _data.writeString(password);
          _data.writeInt(serviceClass);
          _data.writeString(appId);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setFacilityLockForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setFacilityLockForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set response functions for SIM radio requests and indications.
       * 
       * @param radioSimResponse Object containing response functions
       * @param radioSimIndication Object containing radio indications
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void setResponseFunctions(android.hardware.radio.sim.IRadioSimResponse radioSimResponse, android.hardware.radio.sim.IRadioSimIndication radioSimIndication) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(radioSimResponse);
          _data.writeStrongInterface(radioSimIndication);
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
       * Set SIM card power state. Request is used to power off or power on the card. It should not
       * generate a CardState.CARDSTATE_ABSENT indication, since the SIM is still physically inserted.
       * When SIM card is in POWER_UP_PASS_THROUGH, the modem does not send any command to it (for
       * example SELECT of MF, or TERMINAL CAPABILITY), and the SIM card is controlled completely by
       * Telephony sending APDUs directly. The SIM card state must be RIL_CARDSTATE_PRESENT and the
       * number of card apps will be 0. No new error code is generated. Emergency calls are supported
       * in the same way as if the SIM card is absent. Pass-through mode is valid only for the
       * specific card session where it is activated, and normal behavior occurs at the next SIM
       * initialization, unless POWER_UP_PASS_THROUGH is requested again.
       * The device is required to power down the SIM card before it can switch the mode between
       * POWER_UP and POWER_UP_PASS_THROUGH. At device power up, the SIM interface is powered up
       * automatically. Each subsequent request to this method is processed only after the completion
       * of the previous one.
       * When the SIM is in POWER_DOWN, the modem should send an empty vector of AppStatus in
       * CardStatus.applications. If a SIM in the POWER_DOWN state is removed and a new SIM is
       * inserted, the new SIM should be in POWER_UP mode by default. If the device is turned off or
       * restarted while the SIM is in POWER_DOWN, then the SIM should turn on normally in POWER_UP
       * mode when the device turns back on.
       * 
       * @param serial Serial number of request
       * @param powerUp POWER_DOWN if powering down the SIM card
       *                POWER_UP if powering up the SIM card
       *                POWER_UP_PASS_THROUGH if powering up the SIM card in pass through mode
       * 
       * Response function is IRadioSimResponse.setSimCardPowerResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void setSimCardPower(int serial, int powerUp) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(powerUp);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSimCardPower, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSimCardPower is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Selection/de-selection of a subscription from a SIM card
       * 
       * @param serial Serial number of request.
       * @param uiccSub SelectUiccSub
       * 
       * Response function is IRadioSimResponse.setUiccSubscriptionResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void setUiccSubscription(int serial, android.hardware.radio.sim.SelectUiccSub uiccSub) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(uiccSub, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUiccSubscription, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setUiccSubscription is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Supplies ICC PIN2. Only called following operation where SIM_PIN2 was returned as a failure
       * from a previous operation. If the supplied PIN2 is empty, this should just query the number
       * of retries.
       * 
       * @param serial Serial number of request.
       * @param pin2 PIN2 value
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       * 
       * Response function is IRadioSimResponse.supplyIccPin2ForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void supplyIccPin2ForApp(int serial, java.lang.String pin2, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(pin2);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supplyIccPin2ForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method supplyIccPin2ForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Supplies ICC PIN. Only called if CardStatus has AppState.PIN state. If the supplied PIN is
       * empty, this should just query the number of retries.
       * 
       * @param serial Serial number of request.
       * @param pin PIN value
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       * 
       * Response function is IRadioSimResponse.supplyIccPinForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void supplyIccPinForApp(int serial, java.lang.String pin, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(pin);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supplyIccPinForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method supplyIccPinForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Supplies ICC PUK2 and new PIN2. If the supplied PUK2 is empty, this should just query the
       * number of retries.
       * 
       * @param serial Serial number of request.
       * @param puk2 PUK2 value
       * @param pin2 New PIN2 value
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       * 
       * Response function is IRadioSimResponse.supplyIccPuk2ForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void supplyIccPuk2ForApp(int serial, java.lang.String puk2, java.lang.String pin2, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(puk2);
          _data.writeString(pin2);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supplyIccPuk2ForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method supplyIccPuk2ForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Supplies ICC PUK and new PIN. If the supplied PUK is empty, this should just query the
       * number of retries.
       * 
       * @param serial Serial number of request.
       * @param puk PUK value
       * @param pin New PIN value
       * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
       * 
       * Response function is IRadioSimResponse.supplyIccPukForAppResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void supplyIccPukForApp(int serial, java.lang.String puk, java.lang.String pin, java.lang.String aid) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(puk);
          _data.writeString(pin);
          _data.writeString(aid);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supplyIccPukForApp, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method supplyIccPukForApp is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request that deactivates one category of device personalization. Device personalization
       * generally binds the device so it can only be used on one carrier or even one carrier subnet
       * (See TS 22.022). When the user has gained the rights to unbind the device (at the end of a
       * contract period or other event), the controlKey will be delivered to either the user for
       * manual entry or to a carrier app on the device for automatic entry.
       * 
       * @param serial Serial number of request.
       * @param persoType SIM personalization type.
       * @param controlKey the unlock code for removing persoType personalization from this device
       * 
       * Response function is IRadioSimResponse.supplySimDepersonalizationResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void supplySimDepersonalization(int serial, int persoType, java.lang.String controlKey) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(persoType);
          _data.writeString(controlKey);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supplySimDepersonalization, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method supplySimDepersonalization is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Insert, delete or update a phonebook record on the SIM card. If the index of recordInfo is 0,
       * the phonebook record will be added to global or local phonebook, and global phonebook has
       * higher priority than local phonebook. If the fields in the recordInfo are all empty except
       * for the index, the phonebook record specified by the index will be deleted. The indication
       * simPhonebookChanged will be called after every successful call of updateSimPhonebookRecords.
       * 
       * @param serial Serial number of request.
       * @param recordInfo Details of the record to insert, delete or update.
       * 
       * Response function is IRadioSimResponse.updateSimPhonebookRecordsResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void updateSimPhonebookRecords(int serial, android.hardware.radio.sim.PhonebookRecordInfo recordInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(recordInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_updateSimPhonebookRecords, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method updateSimPhonebookRecords is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Close a previously opened logical channel. This command reflects TS 27.007
       * "close logical channel" operation (+CCHC).
       * 
       * Per spec SGP.22 V3.0, ES10 commands need to be sent over command port of MEP-A. In order
       * to close proper logical channel, should pass information about whether the logical channel
       * was opened for sending ES10 commands or not.
       * 
       * @param serial Serial number of request.
       * @param sessionInfo Details of the opened logical channel info like sessionId and isEs10.
       * 
       * Response function is IRadioSimResponse.iccCloseLogicalChannelWithSessionInfoResponse()
       * 
       * This is available when android.hardware.telephony.subscription is defined.
       */
      @Override public void iccCloseLogicalChannelWithSessionInfo(int serial, android.hardware.radio.sim.SessionInfo sessionInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(sessionInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_iccCloseLogicalChannelWithSessionInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method iccCloseLogicalChannelWithSessionInfo is unimplemented.");
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
    static final int TRANSACTION_areUiccApplicationsEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_changeIccPin2ForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_changeIccPinForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_enableUiccApplications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getAllowedCarriers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getCdmaSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getCdmaSubscriptionSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getFacilityLockForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getIccCardStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getImsiForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getSimPhonebookCapacity = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getSimPhonebookRecords = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_iccCloseLogicalChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_iccIoForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_iccOpenLogicalChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_iccTransmitApduBasicChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_iccTransmitApduLogicalChannel = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_reportStkServiceIsRunning = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_requestIccSimAuthentication = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_responseAcknowledgement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_sendEnvelope = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_sendEnvelopeWithStatus = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_sendTerminalResponseToSim = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_setAllowedCarriers = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_setCarrierInfoForImsiEncryption = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_setCdmaSubscriptionSource = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setFacilityLockForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_setResponseFunctions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_setSimCardPower = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setUiccSubscription = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_supplyIccPin2ForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_supplyIccPinForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_supplyIccPuk2ForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_supplyIccPukForApp = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_supplySimDepersonalization = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_updateSimPhonebookRecords = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_iccCloseLogicalChannelWithSessionInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$sim$IRadioSim".replace('$', '.');
  /**
   * Whether uiccApplications are enabled or disabled.
   * By default uiccApplications must be enabled, unless enableUiccApplications() with enable
   * being false is called.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.areUiccApplicationsEnabledResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void areUiccApplicationsEnabled(int serial) throws android.os.RemoteException;
  /**
   * Supplies old ICC PIN2 and new PIN2.
   * 
   * @param serial Serial number of request.
   * @param oldPin2 Old pin2 value
   * @param newPin2 New pin2 value
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   * 
   * Response function is IRadioSimResponse.changeIccPin2ForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void changeIccPin2ForApp(int serial, java.lang.String oldPin2, java.lang.String newPin2, java.lang.String aid) throws android.os.RemoteException;
  /**
   * Supplies old ICC PIN and new PIN.
   * 
   * @param serial Serial number of request.
   * @param oldPin Old pin value
   * @param newPin New pin value
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   * 
   * Response function is IRadioSimResponse.changeIccPinForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void changeIccPinForApp(int serial, java.lang.String oldPin, java.lang.String newPin, java.lang.String aid) throws android.os.RemoteException;
  /**
   * Enable or disable UiccApplications on the SIM. If disabled:
   *  - Modem will not register on any network.
   *  - SIM must be PRESENT, and the IccId of the SIM must still be accessible.
   *  - The corresponding modem stack is still functional, e.g. able to make emergency calls or
   *    do network scan.
   * By default if this API is not called, the uiccApplications must be enabled automatically.
   * It must work for both single SIM and DSDS cases for UX consistency.
   * The preference is per SIM, and must be remembered over power cycle, modem reboot, or SIM
   * insertion / unplug.
   * 
   * @param serial Serial number of request.
   * @param enable true if to enable uiccApplications, false to disable.
   * 
   * Response function is IRadioSimResponse.enableUiccApplicationsResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void enableUiccApplications(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Get carrier restrictions.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.getAllowedCarriersResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getAllowedCarriers(int serial) throws android.os.RemoteException;
  /**
   * Request the device MDN / H_SID / H_NID. The request is only allowed when CDMA subscription
   * is available. When CDMA subscription is changed, application layer must re-issue the request
   * to update the subscription information.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.getCdmaSubscriptionResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void getCdmaSubscription(int serial) throws android.os.RemoteException;
  /**
   * Request to query the location where the CDMA subscription shall be retrieved.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.getCdmaSubscriptionSourceResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void getCdmaSubscriptionSource(int serial) throws android.os.RemoteException;
  /**
   * Query the status of a facility lock state
   * 
   * @param serial Serial number of request.
   * @param facility is the facility string code from TS 27.007 7.4
   *        (eg "AO" for BAOC, "SC" for SIM lock)
   * @param password is the password, or "" if not required
   * @param serviceClass is the TS 27.007 service class bit vector of services to query
   * @param appId is AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   *        This is only applicable in the case of Fixed Dialing Numbers (FDN) requests.
   * 
   * Response function is IRadioSimResponse.getFacilityLockForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getFacilityLockForApp(int serial, java.lang.String facility, java.lang.String password, int serviceClass, java.lang.String appId) throws android.os.RemoteException;
  /**
   * Requests status of the ICC card
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.getIccCardStatusResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getIccCardStatus(int serial) throws android.os.RemoteException;
  /**
   * Get the SIM IMSI. Only valid when radio state is "RADIO_STATE_ON"
   * 
   * @param serial Serial number of request.
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   * 
   * Response function is IRadioSimResponse.getImsiForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getImsiForApp(int serial, java.lang.String aid) throws android.os.RemoteException;
  /**
   * Get the phonebook capacity.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.getSimPhonebookCapacityResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getSimPhonebookCapacity(int serial) throws android.os.RemoteException;
  /**
   * Get the local and global phonebook records from the SIM card.
   * This should be called again after a simPhonebookChanged notification is received.
   * The phonebook records are received via IRadioSimIndication.simPhonebookRecordsReceived()
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.getSimPhonebookRecordsResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void getSimPhonebookRecords(int serial) throws android.os.RemoteException;
  /**
   * Close a previously opened logical channel. This command reflects TS 27.007
   * "close logical channel" operation (+CCHC).
   * 
   * @param serial Serial number of request.
   * @param channelId session id of the logical channel (+CCHC).
   * 
   * Response function is IRadioSimResponse.iccCloseLogicalChannelResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   * 
   * @deprecated use iccCloseLogicalChannelWithSessionInfo instead.
   */
  @Deprecated
  public void iccCloseLogicalChannel(int serial, int channelId) throws android.os.RemoteException;
  /**
   * Request ICC I/O operation. This is similar to the TS 27.007 "restricted SIM" operation where
   * it assumes all of the EF selection must be done by the callee. Arguments and responses that
   * are unused for certain values of "command" must be ignored or set to empty string.
   * Note that IccIo has a "PIN2" field which may be empty string, or may specify a PIN2 for
   * operations that require a PIN2 (eg updating FDN records).
   * 
   * @param serial Serial number of request.
   * @param iccIo IccIo
   * 
   * Response function is IRadioSimResponse.iccIoForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void iccIoForApp(int serial, android.hardware.radio.sim.IccIo iccIo) throws android.os.RemoteException;
  /**
   * Open a new logical channel and select the given application. This command
   * reflects TS 27.007 "open logical channel" operation (+CCHO).
   * 
   * For MEP-A(Multiple enabled profile), only dedicated port 0 is ISDR selectable.
   * e.g., Port0 - for ISDR access and Port1/Port2 - the currently active ports/subscriptions.
   * Port 0 should be transparent to AP and iccLogicalChannel API should remain the same.
   * Even if the ISDR request comes over port1 or port2, Modem would just internally convert the
   * portID to port0 and add the real port index as the payload of MANAGE_CHANNEL command.
   * 
   * @param serial Serial number of request.
   * @param aid AID value, See ETSI 102.221 and 101.220.
   * @param p2 P2 value, described in ISO 7816-4. Ignore if equal to RadioConst:P2_CONSTANT_NO_P2
   * 
   * Response function is IRadioSimResponse.iccOpenLogicalChannelResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void iccOpenLogicalChannel(int serial, java.lang.String aid, int p2) throws android.os.RemoteException;
  /**
   * Request APDU exchange on the basic channel. This command reflects TS 27.007
   * "generic SIM access" operation (+CSIM). The modem must ensure proper function of GSM,
   * and filter commands appropriately. It must filter channel management and SELECT by DF
   * name commands. "sessionId" field is always 0 (for aid="") and may be ignored.
   * 
   * @param serial Serial number of request.
   * @param message SimApdu to be sent
   * 
   * Response function is IRadioSimResponse.iccTransmitApduBasicChannelResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void iccTransmitApduBasicChannel(int serial, android.hardware.radio.sim.SimApdu message) throws android.os.RemoteException;
  /**
   * Exchange APDUs with a UICC over a previously opened logical channel. This command reflects
   * TS 27.007 "generic logical channel access" operation (+CGLA). The modem must filter channel
   * management and SELECT by DF name commands.
   * 
   * @param serial Serial number of request.
   * @param message SimApdu to be sent
   * 
   * Response function is IRadioSimResponse.iccTransmitApduLogicalChannelResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void iccTransmitApduLogicalChannel(int serial, android.hardware.radio.sim.SimApdu message) throws android.os.RemoteException;
  /**
   * Indicates that the StkService is running and is ready to receive unsolicited stk commands.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioSimResponse.reportStkServiceIsRunningResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void reportStkServiceIsRunning(int serial) throws android.os.RemoteException;
  /**
   * Returns the response of SIM Authentication through Radio challenge request.
   * 
   * @param serial Serial number of request.
   * @param authContext P2 value of authentication command, see P2 parameter in
   *        3GPP TS 31.102 7.1.2
   * @param authData the challenge string in Base64 format, see 3GPP TS 31.102 7.1.2
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value
   * 
   * Response function is IRadioSimResponse.requestIccSimAuthenticationResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void requestIccSimAuthentication(int serial, int authContext, java.lang.String authData, java.lang.String aid) throws android.os.RemoteException;
  /**
   * When response type received from a radio indication or radio response is
   * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
   * acknowledge the receipt of those messages by sending responseAcknowledgement().
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void responseAcknowledgement() throws android.os.RemoteException;
  /**
   * Requests to send a SAT/USAT envelope command to SIM.
   * The SAT/USAT envelope command refers to 3GPP TS 11.14 and 3GPP TS 31.111
   * 
   * @param serial Serial number of request.
   * @param contents SAT/USAT command in hexadecimal format string starting with command tag
   * 
   * Response function is IRadioSimResponse.sendEnvelopeResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void sendEnvelope(int serial, java.lang.String contents) throws android.os.RemoteException;
  /**
   * Requests to send a SAT/USAT envelope command to SIM. The SAT/USAT envelope command refers to
   * 3GPP TS 11.14 and 3GPP TS 31.111. This request has one difference from sendEnvelope():
   * The SW1 and SW2 status bytes from the UICC response are returned along with the response
   * data, using the same structure as iccIOForApp(). The implementation must perform normal
   * processing of a '91XX' response in SW1/SW2 to retrieve the pending proactive command and
   * send it as an unsolicited response, as sendEnvelope() does.
   * 
   * @param serial Serial number of request.
   * @param contents SAT/USAT command in hexadecimal format starting with command tag
   * 
   * Response function is IRadioSimResponse.sendEnvelopeWithStatusResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void sendEnvelopeWithStatus(int serial, java.lang.String contents) throws android.os.RemoteException;
  /**
   * Requests to send a terminal response to SIM for a received proactive command
   * 
   * @param serial Serial number of request.
   * @param contents SAT/USAT response in hexadecimal format string starting with
   *        first byte of response data
   * 
   * Response function is IRadioSimResponse.sendTerminalResponseResponseToSim()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void sendTerminalResponseToSim(int serial, java.lang.String contents) throws android.os.RemoteException;
  /**
   * Set carrier restrictions. Expected modem behavior:
   *  If never receives this command:
   *  - Must allow all carriers
   *  Receives this command:
   *  - Only allow carriers specified in carriers. The restriction persists across power cycles
   *    and FDR. If a present SIM is allowed, modem must not reload the SIM. If a present SIM is
   *    *not* allowed, modem must detach from the registered network and only keep emergency
   *    service, and notify Android SIM refresh reset with new SIM state being
   *    CardState:RESTRICTED. Emergency service must be enabled.
   * 
   * @param serial Serial number of request.
   * @param carriers CarrierRestrictions consisting allowed and excluded carriers
   * @param multiSimPolicy Policy to be used for devices with multiple SIMs.
   * 
   * Response function is IRadioSimResponse.setAllowedCarriersResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void setAllowedCarriers(int serial, android.hardware.radio.sim.CarrierRestrictions carriers, int multiSimPolicy) throws android.os.RemoteException;
  /**
   * Provide Carrier specific information to the modem that must be used to encrypt the IMSI and
   * IMPI. Sent by the framework during boot, carrier switch and every time the framework receives
   * a new certificate.
   * 
   * @param serial Serial number of request.
   * @param imsiEncryptionInfo ImsiEncryptionInfo
   * 
   * Response function is IRadioSimResponse.setCarrierInfoForImsiEncryptionResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void setCarrierInfoForImsiEncryption(int serial, android.hardware.radio.sim.ImsiEncryptionInfo imsiEncryptionInfo) throws android.os.RemoteException;
  /**
   * Request to set the location where the CDMA subscription shall be retrieved
   * 
   * @param serial Serial number of request.
   * @param cdmaSub CdmaSubscriptionSource
   * 
   * Response function is IRadioSimResponse.setCdmaSubscriptionSourceResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void setCdmaSubscriptionSource(int serial, int cdmaSub) throws android.os.RemoteException;
  /**
   * Enable/disable one facility lock
   * 
   * @param serial Serial number of request.
   * @param facility is the facility string code from TS 27.007 7.4 (eg "AO" for BAOC)
   * @param lockState false for "unlock" and true for "lock"
   * @param password is the password
   * @param serviceClass is string representation of decimal TS 27.007 service class bit vector.
   *        Eg, the string "1" means "set this facility for voice services"
   * @param appId is AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   *        This is only applicable in the case of Fixed Dialing Numbers (FDN) requests.
   * 
   * Response function is IRadioSimResponse.setFacilityLockForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void setFacilityLockForApp(int serial, java.lang.String facility, boolean lockState, java.lang.String password, int serviceClass, java.lang.String appId) throws android.os.RemoteException;
  /**
   * Set response functions for SIM radio requests and indications.
   * 
   * @param radioSimResponse Object containing response functions
   * @param radioSimIndication Object containing radio indications
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void setResponseFunctions(android.hardware.radio.sim.IRadioSimResponse radioSimResponse, android.hardware.radio.sim.IRadioSimIndication radioSimIndication) throws android.os.RemoteException;
  /**
   * Set SIM card power state. Request is used to power off or power on the card. It should not
   * generate a CardState.CARDSTATE_ABSENT indication, since the SIM is still physically inserted.
   * When SIM card is in POWER_UP_PASS_THROUGH, the modem does not send any command to it (for
   * example SELECT of MF, or TERMINAL CAPABILITY), and the SIM card is controlled completely by
   * Telephony sending APDUs directly. The SIM card state must be RIL_CARDSTATE_PRESENT and the
   * number of card apps will be 0. No new error code is generated. Emergency calls are supported
   * in the same way as if the SIM card is absent. Pass-through mode is valid only for the
   * specific card session where it is activated, and normal behavior occurs at the next SIM
   * initialization, unless POWER_UP_PASS_THROUGH is requested again.
   * The device is required to power down the SIM card before it can switch the mode between
   * POWER_UP and POWER_UP_PASS_THROUGH. At device power up, the SIM interface is powered up
   * automatically. Each subsequent request to this method is processed only after the completion
   * of the previous one.
   * When the SIM is in POWER_DOWN, the modem should send an empty vector of AppStatus in
   * CardStatus.applications. If a SIM in the POWER_DOWN state is removed and a new SIM is
   * inserted, the new SIM should be in POWER_UP mode by default. If the device is turned off or
   * restarted while the SIM is in POWER_DOWN, then the SIM should turn on normally in POWER_UP
   * mode when the device turns back on.
   * 
   * @param serial Serial number of request
   * @param powerUp POWER_DOWN if powering down the SIM card
   *                POWER_UP if powering up the SIM card
   *                POWER_UP_PASS_THROUGH if powering up the SIM card in pass through mode
   * 
   * Response function is IRadioSimResponse.setSimCardPowerResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void setSimCardPower(int serial, int powerUp) throws android.os.RemoteException;
  /**
   * Selection/de-selection of a subscription from a SIM card
   * 
   * @param serial Serial number of request.
   * @param uiccSub SelectUiccSub
   * 
   * Response function is IRadioSimResponse.setUiccSubscriptionResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void setUiccSubscription(int serial, android.hardware.radio.sim.SelectUiccSub uiccSub) throws android.os.RemoteException;
  /**
   * Supplies ICC PIN2. Only called following operation where SIM_PIN2 was returned as a failure
   * from a previous operation. If the supplied PIN2 is empty, this should just query the number
   * of retries.
   * 
   * @param serial Serial number of request.
   * @param pin2 PIN2 value
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   * 
   * Response function is IRadioSimResponse.supplyIccPin2ForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void supplyIccPin2ForApp(int serial, java.lang.String pin2, java.lang.String aid) throws android.os.RemoteException;
  /**
   * Supplies ICC PIN. Only called if CardStatus has AppState.PIN state. If the supplied PIN is
   * empty, this should just query the number of retries.
   * 
   * @param serial Serial number of request.
   * @param pin PIN value
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   * 
   * Response function is IRadioSimResponse.supplyIccPinForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void supplyIccPinForApp(int serial, java.lang.String pin, java.lang.String aid) throws android.os.RemoteException;
  /**
   * Supplies ICC PUK2 and new PIN2. If the supplied PUK2 is empty, this should just query the
   * number of retries.
   * 
   * @param serial Serial number of request.
   * @param puk2 PUK2 value
   * @param pin2 New PIN2 value
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   * 
   * Response function is IRadioSimResponse.supplyIccPuk2ForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void supplyIccPuk2ForApp(int serial, java.lang.String puk2, java.lang.String pin2, java.lang.String aid) throws android.os.RemoteException;
  /**
   * Supplies ICC PUK and new PIN. If the supplied PUK is empty, this should just query the
   * number of retries.
   * 
   * @param serial Serial number of request.
   * @param puk PUK value
   * @param pin New PIN value
   * @param aid AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value.
   * 
   * Response function is IRadioSimResponse.supplyIccPukForAppResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void supplyIccPukForApp(int serial, java.lang.String puk, java.lang.String pin, java.lang.String aid) throws android.os.RemoteException;
  /**
   * Request that deactivates one category of device personalization. Device personalization
   * generally binds the device so it can only be used on one carrier or even one carrier subnet
   * (See TS 22.022). When the user has gained the rights to unbind the device (at the end of a
   * contract period or other event), the controlKey will be delivered to either the user for
   * manual entry or to a carrier app on the device for automatic entry.
   * 
   * @param serial Serial number of request.
   * @param persoType SIM personalization type.
   * @param controlKey the unlock code for removing persoType personalization from this device
   * 
   * Response function is IRadioSimResponse.supplySimDepersonalizationResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void supplySimDepersonalization(int serial, int persoType, java.lang.String controlKey) throws android.os.RemoteException;
  /**
   * Insert, delete or update a phonebook record on the SIM card. If the index of recordInfo is 0,
   * the phonebook record will be added to global or local phonebook, and global phonebook has
   * higher priority than local phonebook. If the fields in the recordInfo are all empty except
   * for the index, the phonebook record specified by the index will be deleted. The indication
   * simPhonebookChanged will be called after every successful call of updateSimPhonebookRecords.
   * 
   * @param serial Serial number of request.
   * @param recordInfo Details of the record to insert, delete or update.
   * 
   * Response function is IRadioSimResponse.updateSimPhonebookRecordsResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void updateSimPhonebookRecords(int serial, android.hardware.radio.sim.PhonebookRecordInfo recordInfo) throws android.os.RemoteException;
  /**
   * Close a previously opened logical channel. This command reflects TS 27.007
   * "close logical channel" operation (+CCHC).
   * 
   * Per spec SGP.22 V3.0, ES10 commands need to be sent over command port of MEP-A. In order
   * to close proper logical channel, should pass information about whether the logical channel
   * was opened for sending ES10 commands or not.
   * 
   * @param serial Serial number of request.
   * @param sessionInfo Details of the opened logical channel info like sessionId and isEs10.
   * 
   * Response function is IRadioSimResponse.iccCloseLogicalChannelWithSessionInfoResponse()
   * 
   * This is available when android.hardware.telephony.subscription is defined.
   */
  public void iccCloseLogicalChannelWithSessionInfo(int serial, android.hardware.radio.sim.SessionInfo sessionInfo) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
