/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/IRadioNetwork.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/IRadioNetwork.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * This interface is used by telephony and telecom to talk to cellular radio for network APIs.
 * All functions apply to both terrestrial and extraterrestrial (satellite) based cellular networks.
 * All the functions have minimum one parameter:
 * serial: which corresponds to serial no. of request. Serial numbers must only be memorized for the
 * duration of a method call. If clients provide colliding serials (including passing the same
 * serial to different methods), multiple responses (one for each method call) must still be served.
 * setResponseFunctions must work with IRadioNetworkResponse and IRadioNetworkIndication.
 * @hide
 */
public interface IRadioNetwork extends android.os.IInterface
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
  public static final String HASH = "5867b4f5be491ec815fafea8a3f268b0295427df";
  /** Default implementation for IRadioNetwork. */
  public static class Default implements android.hardware.radio.network.IRadioNetwork
  {
    /**
     * Requests bitmap representing the currently allowed network types.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getAllowedNetworkTypesBitmapResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getAllowedNetworkTypesBitmap(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get the list of band modes supported by RF.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getAvailableBandModesResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void getAvailableBandModes(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Scans for available networks
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getAvailableNetworksResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getAvailableNetworks(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get all the barring info for the current camped cell applicable to the current user.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getBarringInfoResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getBarringInfo(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request the actual setting of the roaming preferences in CDMA in the modem
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getCdmaRoamingPreferenceResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void getCdmaRoamingPreference(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request all of the current cell information known to the radio. The radio must return a list
     * of all current cells, including the neighboring cells. If for a particular cell information
     * isn't known then the appropriate unknown value will be returned.
     * This does not cause or change the rate of unsolicited cellInfoList().
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getCellInfoListResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getCellInfoList(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request current data registration state.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getDataRegistrationStateResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getDataRegistrationState(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request current IMS registration state
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getImsRegistrationStateResponse()
     * 
     * This is available when android.hardware.telephony.ims is defined.
     * 
     * @deprecated Deprecated starting from Android U.
     */
    @Override public void getImsRegistrationState(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Query current network selection mode
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getNetworkSelectionModeResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getNetworkSelectionMode(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request current operator ONS or EONS
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getOperatorResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getOperator(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Requests current signal strength and associated information. Must succeed if radio is on.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getSignalStrengthResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getSignalStrength(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Get which bands the modem's background scan is acting on.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getSystemSelectionChannelsResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getSystemSelectionChannels(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Query the radio technology type (3GPP/3GPP2) used for voice. Query is valid only
     * when radio state is not RADIO_STATE_UNAVAILABLE
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getVoiceRadioTechnologyResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getVoiceRadioTechnology(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Request current voice registration state.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.getVoiceRegistrationStateResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void getVoiceRegistrationState(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Is E-UTRA-NR Dual Connectivity enabled
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.isNrDualConnectivityEnabledResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void isNrDualConnectivityEnabled(int serial) throws android.os.RemoteException
    {
    }
    /**
     * When response type received from a radio indication or radio response is
     * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
     * acknowledge the receipt of those messages by sending responseAcknowledgement().
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void responseAcknowledgement() throws android.os.RemoteException
    {
    }
    /**
     * Requests to set the network type for searching and registering. Instruct the radio to
     * *only* accept the types of network provided. In case of an emergency call, the modem is
     * authorized to bypass this restriction.
     * 
     * @param serial Serial number of request.
     * @param networkTypeBitmap a 32-bit bearer bitmap of RadioAccessFamily
     * 
     * Response function is IRadioNetworkResponse.setAllowedNetworkTypesBitmapResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setAllowedNetworkTypesBitmap(int serial, int networkTypeBitmap) throws android.os.RemoteException
    {
    }
    /**
     * Assign a specified band for RF configuration.
     * 
     * @param serial Serial number of request.
     * @param mode RadioBandMode
     * 
     * Response function is IRadioNetworkResponse.setBandModeResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void setBandMode(int serial, int mode) throws android.os.RemoteException
    {
    }
    /**
     * Change call barring facility password
     * 
     * @param serial Serial number of request.
     * @param facility facility string code from TS 27.007 7.4 (eg "AO" for BAOC)
     * @param oldPassword old password
     * @param newPassword new password
     * 
     * Response function is IRadioNetworkResponse.setBarringPasswordResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setBarringPassword(int serial, java.lang.String facility, java.lang.String oldPassword, java.lang.String newPassword) throws android.os.RemoteException
    {
    }
    /**
     * Request to set the roaming preferences in CDMA
     * 
     * @param serial Serial number of request.
     * @param type CdmaRoamingType defined in types.hal
     * 
     * Response function is IRadioNetworkResponse.setCdmaRoamingPreferenceResponse()
     * 
     * This is available when android.hardware.telephony.cdma is defined.
     * 
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void setCdmaRoamingPreference(int serial, int type) throws android.os.RemoteException
    {
    }
    /**
     * Sets the minimum time between when unsolicited cellInfoList() must be invoked.
     * A value of 0, means invoke cellInfoList() when any of the reported information changes.
     * Value of RadioConst:VALUE_UNAVAILABLE means never issue a unsolicited cellInfoList().
     * 
     * @param serial Serial number of request.
     * @param rate minimum time in milliseconds to indicate time between unsolicited cellInfoList()
     * 
     * Response function is IRadioNetworkResponse.setCellInfoListRateResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setCellInfoListRate(int serial, int rate) throws android.os.RemoteException
    {
    }
    /**
     * Sets the indication filter. Prevents the reporting of specified unsolicited indications from
     * the radio. This is used for power saving in instances when those indications are not needed.
     * If unset, defaults to IndicationFilter:ALL.
     * 
     * @param serial Serial number of request.
     * @param indicationFilter 32-bit bitmap of IndicationFilter. Bits set to 1 indicate the
     *        indications are enabled. See IndicationFilter for the definition of each bit.
     * 
     * Response function is IRadioNetworkResponse.setIndicationFilterResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setIndicationFilter(int serial, int indicationFilter) throws android.os.RemoteException
    {
    }
    /**
     * Sets the link capacity reporting criteria. The resulting reporting criteria are the AND of
     * all the supplied criteria. Note that reporting criteria must be individually set for each
     * RAN. If unset, reporting criteria for that RAN are implementation-defined.
     * 
     * @param serial Serial number of request.
     * @param hysteresisMs A hysteresis time in milliseconds to prevent flapping. A value of 0
     *        disables hysteresis.
     * @param hysteresisDlKbps An interval in kbps defining the required magnitude change between DL
     *        reports. hysteresisDlKbps must be smaller than the smallest threshold delta. A value
     *        of 0 disables hysteresis.
     * @param hysteresisUlKbps An interval in kbps defining the required magnitude change between UL
     *        reports. hysteresisUlKbps must be smaller than the smallest threshold delta. A value
     *        of 0 disables hysteresis.
     * @param thresholdsDownlinkKbps A vector of trigger thresholds in kbps for downlink reports. A
     *        vector size of 0 disables the use of DL thresholds for reporting.
     * @param thresholdsUplinkKbps A vector of trigger thresholds in kbps for uplink reports. A
     *        vector size of 0 disables the use of UL thresholds for reporting.
     * @param accessNetwork The type of network for which to apply these thresholds.
     * 
     * Response function is IRadioNetworkResponse.setLinkCapacityReportingCriteriaResponse().
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setLinkCapacityReportingCriteria(int serial, int hysteresisMs, int hysteresisDlKbps, int hysteresisUlKbps, int[] thresholdsDownlinkKbps, int[] thresholdsUplinkKbps, int accessNetwork) throws android.os.RemoteException
    {
    }
    /**
     * Enables/disables network state change notifications due to changes in LAC and/or CID (for
     * GSM). Basically +CREG=2 vs. +CREG=1 (TS 27.007).
     * The Radio implementation must default to "updates enabled" when the screen is on and
     * "updates disabled" when the screen is off.
     * 
     * @param serial Serial number of request.
     * @param enable true=updates enabled (+CREG=2), false=updates disabled (+CREG=1)
     * 
     * Response function is IRadioNetworkResponse.setLocationUpdatesResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void setLocationUpdates(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Specify that the network must be selected automatically.
     * This request must not respond until the new operator is selected and registered.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.setNetworkSelectionModeAutomaticResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setNetworkSelectionModeAutomatic(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Manually select a specified network. This request must not respond until the new operator is
     * selected and registered. Per TS 23.122, the RAN is just the initial suggested value.
     * If registration fails, the RAN is not available afterwards, or the RAN is not within the
     * network types specified by IRadioNetwork::setAllowedNetworkTypeBitmap, then the modem will
     * need to select the next best RAN for network registration.
     * 
     * @param serial Serial number of request.
     * @param operatorNumeric String specifying MCCMNC of network to select (eg "310170").
     * @param ran Initial suggested access network type. If value is UNKNOWN, the modem will select
     *        the next best RAN for network registration.
     * 
     * Response function is IRadioNetworkResponse.setNetworkSelectionModeManualResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setNetworkSelectionModeManual(int serial, java.lang.String operatorNumeric, int ran) throws android.os.RemoteException
    {
    }
    /**
     * Enable or disable E-UTRA-NR dual connectivity. If disabled then UE will not connect
     * to secondary carrier.
     * 
     * @param serial Serial number of request.
     * @param nrDualConnectivityState expected NR dual connectivity state.
     *        1: Enable NR dual connectivity {NrDualConnectivityState:ENABLE}
     *        2: Disable NR dual connectivity {NrDualConnectivityState:DISABLE}
     *        3: Disable NR dual connectivity and force secondary cell to be released
     *           {NrDualConnectivityState:DISABLE_IMMEDIATE}
     * 
     * Response function is IRadioNetworkResponse.setNrDualConnectivityStateResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setNrDualConnectivityState(int serial, byte nrDualConnectivityState) throws android.os.RemoteException
    {
    }
    /**
     * Set response functions for network radio requests and indications.
     * 
     * @param radioNetworkResponse Object containing response functions
     * @param radioNetworkIndication Object containing radio indications
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setResponseFunctions(android.hardware.radio.network.IRadioNetworkResponse radioNetworkResponse, android.hardware.radio.network.IRadioNetworkIndication radioNetworkIndication) throws android.os.RemoteException
    {
    }
    /**
     * Sets or clears the signal strength reporting criteria for multiple RANs in one request.
     * 
     * The reporting criteria are set individually for each combination of RAN and measurement type.
     * For each RAN type, if no reporting criteria are set, then the reporting of SignalStrength for
     * that RAN is implementation-defined. If any criteria are supplied for a RAN type, then
     * SignalStrength is only reported as specified by those criteria. For any RAN types not defined
     * by this HAL, reporting is implementation-defined.
     * 
     * @param serial Serial number of request.
     * @param signalThresholdInfos Collection of SignalThresholdInfo specifying the reporting
     *        criteria. See SignalThresholdInfo for details.
     * 
     * Response function is IRadioNetworkResponse.setSignalStrengthReportingCriteriaResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setSignalStrengthReportingCriteria(int serial, android.hardware.radio.network.SignalThresholdInfo[] signalThresholdInfos) throws android.os.RemoteException
    {
    }
    /**
     * Enables/disables supplementary service related notifications from the network.
     * Notifications are reported via unsolSuppSvcNotification().
     * 
     * @param serial Serial number of request.
     * @param enable true = notifications enabled, false = notifications disabled.
     * 
     * Response function is IRadioNetworkResponse.setSuppServiceNotificationsResponse()
     * 
     * This is available when android.hardware.telephony.calling is defined.
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void setSuppServiceNotifications(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Specify which bands modem's background scan must act on. If specifyChannels is true, it only
     * scans bands specified in specifiers. If specifyChannels is false, it scans all bands. For
     * example, CBRS is only on LTE band 48. By specifying this band, modem saves more power.
     * 
     * @param serial Serial number of request.
     * @param specifyChannels whether to scan bands defined in specifiers.
     * @param specifiers which bands to scan. Only used if specifyChannels is true.
     * 
     * Response function is IRadioNetworkResponse.setSystemSelectionChannelsResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setSystemSelectionChannels(int serial, boolean specifyChannels, android.hardware.radio.network.RadioAccessSpecifier[] specifiers) throws android.os.RemoteException
    {
    }
    /**
     * Starts a network scan.
     * 
     * @param serial Serial number of request.
     * @param request Defines the radio networks/bands/channels which need to be scanned.
     * 
     * Response function is IRadioNetworkResponse.startNetworkScanResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void startNetworkScan(int serial, android.hardware.radio.network.NetworkScanRequest request) throws android.os.RemoteException
    {
    }
    /**
     * Stops ongoing network scan
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.stopNetworkScanResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void stopNetworkScan(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Requests that network personalization be deactivated
     * 
     * @param serial Serial number of request.
     * @param netPin Network depersonalization code
     * 
     * Response function is IRadioNetworkResponse.supplyNetworkDepersonalizationResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void supplyNetworkDepersonalization(int serial, java.lang.String netPin) throws android.os.RemoteException
    {
    }
    /**
     * Set the UE usage setting for data/voice centric usage.
     * 
     * <p>Sets the usage setting in accordance with 3gpp 24.301 sec 4.3 and 3gpp 24.501 sec 4.3.
     * <p>This value must be independently preserved for each SIM; (setting the value is not a
     * "global" override).
     * 
     * @param serial Serial number of request.
     * @param usageSetting the usage setting for the current SIM.
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void setUsageSetting(int serial, int usageSetting) throws android.os.RemoteException
    {
    }
    /**
     * Get the UE usage setting for data/voice centric usage.
     * 
     * <p>Gets the usage setting in accordance with 3gpp 24.301 sec 4.3 and 3gpp 24.501 sec 4.3.
     * 
     * @param serial Serial number of request.
     * 
     * This is available when android.hardware.telephony is defined.
     */
    @Override public void getUsageSetting(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Set the Emergency Mode
     * 
     * @param serial Serial number of the request.
     * @param emcModeType Defines the radio emergency mode type/radio network required/
     * type of service to be scanned.
     * 
     * Response function is IRadioEmergencyResponse.setEmergencyModeResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setEmergencyMode(int serial, int emcModeType) throws android.os.RemoteException
    {
    }
    /**
     * Triggers an Emergency network scan.
     * 
     * @param serial Serial number of the request.
     * @param request Contains the preferred networks and type of service to be scanned.
     *                See {@link EmergencyNetworkScanTrigger}.
     * 
     * Response function is IRadioEmergencyResponse.triggerEmergencyNetworkScanResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void triggerEmergencyNetworkScan(int serial, android.hardware.radio.network.EmergencyNetworkScanTrigger request) throws android.os.RemoteException
    {
    }
    /**
     * Cancels ongoing Emergency network scan
     * 
     * @param serial Serial number of the request.
     * @param resetScan Indicates how the next {@link #triggerEmergencyNetworkScan} should work.
     *        If {@code true}, then the modem shall start the new scan from the beginning,
     *        otherwise the modem shall resume from the last search.
     * 
     * Response function is IRadioEmergencyResponse.cancelEmergencyNetworkScan()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void cancelEmergencyNetworkScan(int serial, boolean resetScan) throws android.os.RemoteException
    {
    }
    /**
     * Exits ongoing Emergency Mode
     * 
     * @param serial Serial number of the request.
     * 
     * Response function is IRadioEmergencyResponse.exitEmergencyModeResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void exitEmergencyMode(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Set if null encryption and integrity modes are enabled. If the value of enabled is false
     * the modem must not allow any network communications with null ciphering (for both signalling
     * and user data) or null integrity (for signalling) modes for 3G and above, even if the
     * network only uses null algorithms. This setting must be respected even if
     * "cipheringDisabled" (as defined in TS 38.331) is in use by the network.
     * 
     * For 2G, which does not use integrity protection, the modem must only disallow any network
     * communications with null ciphering.
     * 
     * In the case when enabled is false, integrity protection for user data is optional, but
     * ciphering for user data is required.
     * 
     * In case of an emergency call, the modem must bypass this setting.
     * 
     * Null ciphering and integrity modes include (but are not limited to):
     * 2G: A5/0 and GEA0
     * 3G: UEA0 and UIA0
     * 4G: EEA0 and EIA0
     * 5G: NEA0 and NIA0
     * 
     * 
     * @param serial Serial number of the request.
     * @param enabled To allow null encryption/integrity, set to true.
     *                Otherwise, false.
     * 
     * Response callback is IRadioResponse.setNullCipherAndIntegrityEnabledResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setNullCipherAndIntegrityEnabled(int serial, boolean enabled) throws android.os.RemoteException
    {
    }
    /**
     * Get whether null encryption and integrity modes are enabled.
     * 
     * Null ciphering and integrity modes include, (but are not limited to):
     * 2G: A5/0, GAE0 (no integrity algorithm supported)
     * 3G: UEA0 and UIA0
     * 4G: EEA0 and EIA
     * 5G: NEA0 and NIA0
     * 
     * @param serial Serial number of the request.
     * 
     * Response callback is IRadioNetworkResponse.isNullCipherAndIntegrityEnabledResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void isNullCipherAndIntegrityEnabled(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Checks whether N1 mode (access to 5G core network) is enabled or not.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.isN1ModeEnabledResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void isN1ModeEnabled(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Enables or disables N1 mode (access to 5G core network) in accordance with
     * 3GPP TS 24.501 4.9.
     * 
     * Note: The default value of N1 mode shall be based on the modem's internal configuration
     * as per device or carrier. This API may be invoked on demand first to disable N1 mode and
     * later to re-enable for certain use case. This setting shall not be persisted by modem.
     * This setting shall not interfere with the allowed network type bitmap set using
     * {@link IRadioNetwork#setAllowedNetworkTypesBitmap()} API.
     * 
     * @param serial Serial number of request.
     * @param enable {@code true} to enable N1 mode, {@code false} to disable N1 mode.
     * 
     * Response function is IRadioNetworkResponse.setN1ModeEnabledResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setN1ModeEnabled(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Get whether pre-auth cellular identifier in-the-clear transparency is enabled. If
     * IRadioNetworkInterface.setCellularIdentifierTransparencyEnabled has been called, this should
     * return the value of the `enabled` parameter of the last successful call and false if
     * IRadioNetworkInterface.setCellularIdentifierTransparencyEnabled has not been called yet.
     * 
     * @param serial Serial number of request
     * 
     * Response callback is IRadioNetworkResponse.isCellularIdentifierTransparencyEnabledResponse
     * 
     * This is available when android.hardware.telephony.access is defined.
     */
    @Override public void isCellularIdentifierTransparencyEnabled(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Enable or disable transparency for in-the-clear cellular identifiers. If the value of enabled
     * is true, the modem must call IRadioNetworkIndication.cellularIdentifierDisclosed when an
     * IMSI, IMEI, or unciphered SUCI (in 5G SA) appears in one of the following UE-initiated NAS
     * messages before a security context is established.
     * 
     * Note: Cellular identifiers disclosed in uplink messages covered under a NAS Security Context
     * as well as identifiers disclosed in downlink messages are out of scope.
     * 
     * This feature applies to 2g, 3g, 4g, and 5g (SA and NSA) messages sent before a security
     * context is established. In scope message definitions and their associated spec references can
     * be found in NasProtocolMessage.
     * 
     * If the value of enabled is false, the modem must not call
     * IRadioNetworkIndication.sentCellularIdentifierDisclosure again until a subsequent call
     * re-enables this functionality. The modem may choose to stop tracking cellular identifiers in
     * the clear during this time.
     * 
     * @param serial Serial number of request
     * @param enabled Whether or not to enable sending indications for cellular identifiers in the
     *         clear
     * 
     * Response function is IRadioNetworkResponse.setCellularIdentifierTransparencyEnabledResponse
     * 
     * This is available when android.hardware.telephony.access is defined.
     */
    @Override public void setCellularIdentifierTransparencyEnabled(int serial, boolean enabled) throws android.os.RemoteException
    {
    }
    /**
     * Enables or disables security algorithm update reports via indication API
     * {@link IRadioNetworkIndication.securityAlgorithmsUpdated()}.
     * 
     * @param serial Serial number of request.
     * @param enable {@code true} to enable security algorithm update reports, {@code false} to
     *         disable.
     * 
     * Response function is IRadioNetworkResponse.setSecurityAlgorithmsUpdatedEnabledResponse()
     * 
     * This is available when android.hardware.telephony.access is defined.
     */
    @Override public void setSecurityAlgorithmsUpdatedEnabled(int serial, boolean enable) throws android.os.RemoteException
    {
    }
    /**
     * Checks whether security algorithm update reports are enabled via indication API
     * {@link IRadioNetworkIndication.securityAlgorithmsUpdated()}.
     * 
     * @param serial Serial number of request.
     * 
     * Response function is IRadioNetworkResponse.isSecurityAlgorithmsUpdatedEnabledResponse()
     * 
     * This is available when android.hardware.telephony.access is defined.
     */
    @Override public void isSecurityAlgorithmsUpdatedEnabled(int serial) throws android.os.RemoteException
    {
    }
    /**
     * Set the non-terrestrial PLMN with lower priority than terrestrial networks.
     * MCC/MNC broadcast by the non-terrestrial networks may not be included in OPLMNwACT file on
     * SIM profile. Acquisition of satellite based system is lower priority to terrestrial
     * networks. UE shall make all attempts to acquire terrestrial service prior to camping on
     * satellite LTE service.
     * 
     * @param serial Serial number of request
     * @param carrierPlmnArray Array of roaming PLMN used for connecting to satellite networks
     *                         supported by user subscription.
     * @param allSatellitePlmnArray allSatellitePlmnArray contains all the PLMNs present in
     *                              carrierPlmnArray and also list of satellite PLMNs that are not
     *                              supported by the carrier.
     *                              Modem should use the allSatellitePlmnArray to identify satellite
     *                              PLMNs that are not supported by the carrier and make sure not to
     *                              attach to them.
     * 
     * Response function is IRadioNetworkResponse.setSatellitePlmnResponse()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setSatellitePlmn(int serial, java.lang.String[] carrierPlmnArray, java.lang.String[] allSatellitePlmnArray) throws android.os.RemoteException
    {
    }
    /**
     * Enable or disable satellite in the cellular modem associated with a carrier.
     * 
     * Refer setSatellitePlmn for the details of satellite PLMN scanning process. Once modem is
     * disabled, modem should not attach to any of the PLMNs present in allSatellitePlmnArray.
     * If modem is enabled, modem should attach to only PLMNs present in carrierPlmnArray.
     * 
     * @param serial Serial number of request
     * @param satelliteEnabled {@code true} to enable satellite, {@code false} to disable satellite.
     * 
     * Response function is IRadioNetworkResponse.setSatelliteEnabledForCarrier()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void setSatelliteEnabledForCarrier(int serial, boolean satelliteEnabled) throws android.os.RemoteException
    {
    }
    /**
     * Check whether satellite is enabled in the cellular modem associated with a carrier.
     * 
     * @param serial Serial number of request
     * 
     * Response function is IRadioNetworkResponse.isSatelliteEnabledForCarrier()
     * 
     * This is available when android.hardware.telephony.radio.access is defined.
     */
    @Override public void isSatelliteEnabledForCarrier(int serial) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.network.IRadioNetwork
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.network.IRadioNetwork interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.network.IRadioNetwork asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.network.IRadioNetwork))) {
        return ((android.hardware.radio.network.IRadioNetwork)iin);
      }
      return new android.hardware.radio.network.IRadioNetwork.Stub.Proxy(obj);
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
        case TRANSACTION_getAllowedNetworkTypesBitmap:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getAllowedNetworkTypesBitmap(_arg0);
          break;
        }
        case TRANSACTION_getAvailableBandModes:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getAvailableBandModes(_arg0);
          break;
        }
        case TRANSACTION_getAvailableNetworks:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getAvailableNetworks(_arg0);
          break;
        }
        case TRANSACTION_getBarringInfo:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getBarringInfo(_arg0);
          break;
        }
        case TRANSACTION_getCdmaRoamingPreference:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getCdmaRoamingPreference(_arg0);
          break;
        }
        case TRANSACTION_getCellInfoList:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getCellInfoList(_arg0);
          break;
        }
        case TRANSACTION_getDataRegistrationState:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getDataRegistrationState(_arg0);
          break;
        }
        case TRANSACTION_getImsRegistrationState:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getImsRegistrationState(_arg0);
          break;
        }
        case TRANSACTION_getNetworkSelectionMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getNetworkSelectionMode(_arg0);
          break;
        }
        case TRANSACTION_getOperator:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getOperator(_arg0);
          break;
        }
        case TRANSACTION_getSignalStrength:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSignalStrength(_arg0);
          break;
        }
        case TRANSACTION_getSystemSelectionChannels:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getSystemSelectionChannels(_arg0);
          break;
        }
        case TRANSACTION_getVoiceRadioTechnology:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getVoiceRadioTechnology(_arg0);
          break;
        }
        case TRANSACTION_getVoiceRegistrationState:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getVoiceRegistrationState(_arg0);
          break;
        }
        case TRANSACTION_isNrDualConnectivityEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.isNrDualConnectivityEnabled(_arg0);
          break;
        }
        case TRANSACTION_responseAcknowledgement:
        {
          this.responseAcknowledgement();
          break;
        }
        case TRANSACTION_setAllowedNetworkTypesBitmap:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setAllowedNetworkTypesBitmap(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setBandMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setBandMode(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setBarringPassword:
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
          this.setBarringPassword(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_setCdmaRoamingPreference:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setCdmaRoamingPreference(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setCellInfoListRate:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setCellInfoListRate(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setIndicationFilter:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setIndicationFilter(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setLinkCapacityReportingCriteria:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          int _arg2;
          _arg2 = data.readInt();
          int _arg3;
          _arg3 = data.readInt();
          int[] _arg4;
          _arg4 = data.createIntArray();
          int[] _arg5;
          _arg5 = data.createIntArray();
          int _arg6;
          _arg6 = data.readInt();
          data.enforceNoDataAvail();
          this.setLinkCapacityReportingCriteria(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5, _arg6);
          break;
        }
        case TRANSACTION_setLocationUpdates:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setLocationUpdates(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setNetworkSelectionModeAutomatic:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.setNetworkSelectionModeAutomatic(_arg0);
          break;
        }
        case TRANSACTION_setNetworkSelectionModeManual:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.setNetworkSelectionModeManual(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_setNrDualConnectivityState:
        {
          int _arg0;
          _arg0 = data.readInt();
          byte _arg1;
          _arg1 = data.readByte();
          data.enforceNoDataAvail();
          this.setNrDualConnectivityState(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setResponseFunctions:
        {
          android.hardware.radio.network.IRadioNetworkResponse _arg0;
          _arg0 = android.hardware.radio.network.IRadioNetworkResponse.Stub.asInterface(data.readStrongBinder());
          android.hardware.radio.network.IRadioNetworkIndication _arg1;
          _arg1 = android.hardware.radio.network.IRadioNetworkIndication.Stub.asInterface(data.readStrongBinder());
          data.enforceNoDataAvail();
          this.setResponseFunctions(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSignalStrengthReportingCriteria:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.SignalThresholdInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.network.SignalThresholdInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSignalStrengthReportingCriteria(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSuppServiceNotifications:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setSuppServiceNotifications(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSystemSelectionChannels:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          android.hardware.radio.network.RadioAccessSpecifier[] _arg2;
          _arg2 = data.createTypedArray(android.hardware.radio.network.RadioAccessSpecifier.CREATOR);
          data.enforceNoDataAvail();
          this.setSystemSelectionChannels(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_startNetworkScan:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.NetworkScanRequest _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.NetworkScanRequest.CREATOR);
          data.enforceNoDataAvail();
          this.startNetworkScan(_arg0, _arg1);
          break;
        }
        case TRANSACTION_stopNetworkScan:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.stopNetworkScan(_arg0);
          break;
        }
        case TRANSACTION_supplyNetworkDepersonalization:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          data.enforceNoDataAvail();
          this.supplyNetworkDepersonalization(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setUsageSetting:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setUsageSetting(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getUsageSetting:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.getUsageSetting(_arg0);
          break;
        }
        case TRANSACTION_setEmergencyMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.setEmergencyMode(_arg0, _arg1);
          break;
        }
        case TRANSACTION_triggerEmergencyNetworkScan:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.EmergencyNetworkScanTrigger _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.EmergencyNetworkScanTrigger.CREATOR);
          data.enforceNoDataAvail();
          this.triggerEmergencyNetworkScan(_arg0, _arg1);
          break;
        }
        case TRANSACTION_cancelEmergencyNetworkScan:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.cancelEmergencyNetworkScan(_arg0, _arg1);
          break;
        }
        case TRANSACTION_exitEmergencyMode:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.exitEmergencyMode(_arg0);
          break;
        }
        case TRANSACTION_setNullCipherAndIntegrityEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setNullCipherAndIntegrityEnabled(_arg0, _arg1);
          break;
        }
        case TRANSACTION_isNullCipherAndIntegrityEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.isNullCipherAndIntegrityEnabled(_arg0);
          break;
        }
        case TRANSACTION_isN1ModeEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.isN1ModeEnabled(_arg0);
          break;
        }
        case TRANSACTION_setN1ModeEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setN1ModeEnabled(_arg0, _arg1);
          break;
        }
        case TRANSACTION_isCellularIdentifierTransparencyEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.isCellularIdentifierTransparencyEnabled(_arg0);
          break;
        }
        case TRANSACTION_setCellularIdentifierTransparencyEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setCellularIdentifierTransparencyEnabled(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSecurityAlgorithmsUpdatedEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setSecurityAlgorithmsUpdatedEnabled(_arg0, _arg1);
          break;
        }
        case TRANSACTION_isSecurityAlgorithmsUpdatedEnabled:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.isSecurityAlgorithmsUpdatedEnabled(_arg0);
          break;
        }
        case TRANSACTION_setSatellitePlmn:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String[] _arg1;
          _arg1 = data.createStringArray();
          java.lang.String[] _arg2;
          _arg2 = data.createStringArray();
          data.enforceNoDataAvail();
          this.setSatellitePlmn(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_setSatelliteEnabledForCarrier:
        {
          int _arg0;
          _arg0 = data.readInt();
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.setSatelliteEnabledForCarrier(_arg0, _arg1);
          break;
        }
        case TRANSACTION_isSatelliteEnabledForCarrier:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.isSatelliteEnabledForCarrier(_arg0);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.network.IRadioNetwork
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
       * Requests bitmap representing the currently allowed network types.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getAllowedNetworkTypesBitmapResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getAllowedNetworkTypesBitmap(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllowedNetworkTypesBitmap, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getAllowedNetworkTypesBitmap is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the list of band modes supported by RF.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getAvailableBandModesResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void getAvailableBandModes(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvailableBandModes, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getAvailableBandModes is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Scans for available networks
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getAvailableNetworksResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getAvailableNetworks(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvailableNetworks, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getAvailableNetworks is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get all the barring info for the current camped cell applicable to the current user.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getBarringInfoResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getBarringInfo(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBarringInfo, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getBarringInfo is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request the actual setting of the roaming preferences in CDMA in the modem
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getCdmaRoamingPreferenceResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void getCdmaRoamingPreference(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCdmaRoamingPreference, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCdmaRoamingPreference is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request all of the current cell information known to the radio. The radio must return a list
       * of all current cells, including the neighboring cells. If for a particular cell information
       * isn't known then the appropriate unknown value will be returned.
       * This does not cause or change the rate of unsolicited cellInfoList().
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getCellInfoListResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getCellInfoList(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCellInfoList, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCellInfoList is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request current data registration state.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getDataRegistrationStateResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getDataRegistrationState(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDataRegistrationState, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getDataRegistrationState is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request current IMS registration state
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getImsRegistrationStateResponse()
       * 
       * This is available when android.hardware.telephony.ims is defined.
       * 
       * @deprecated Deprecated starting from Android U.
       */
      @Override public void getImsRegistrationState(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getImsRegistrationState, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getImsRegistrationState is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Query current network selection mode
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getNetworkSelectionModeResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getNetworkSelectionMode(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNetworkSelectionMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getNetworkSelectionMode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request current operator ONS or EONS
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getOperatorResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getOperator(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOperator, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getOperator is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Requests current signal strength and associated information. Must succeed if radio is on.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getSignalStrengthResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getSignalStrength(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSignalStrength, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSignalStrength is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get which bands the modem's background scan is acting on.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getSystemSelectionChannelsResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getSystemSelectionChannels(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSystemSelectionChannels, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSystemSelectionChannels is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Query the radio technology type (3GPP/3GPP2) used for voice. Query is valid only
       * when radio state is not RADIO_STATE_UNAVAILABLE
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getVoiceRadioTechnologyResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getVoiceRadioTechnology(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVoiceRadioTechnology, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getVoiceRadioTechnology is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request current voice registration state.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.getVoiceRegistrationStateResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void getVoiceRegistrationState(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVoiceRegistrationState, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getVoiceRegistrationState is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Is E-UTRA-NR Dual Connectivity enabled
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.isNrDualConnectivityEnabledResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void isNrDualConnectivityEnabled(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isNrDualConnectivityEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isNrDualConnectivityEnabled is unimplemented.");
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
       * This is available when android.hardware.telephony.radio.access is defined.
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
       * Requests to set the network type for searching and registering. Instruct the radio to
       * *only* accept the types of network provided. In case of an emergency call, the modem is
       * authorized to bypass this restriction.
       * 
       * @param serial Serial number of request.
       * @param networkTypeBitmap a 32-bit bearer bitmap of RadioAccessFamily
       * 
       * Response function is IRadioNetworkResponse.setAllowedNetworkTypesBitmapResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setAllowedNetworkTypesBitmap(int serial, int networkTypeBitmap) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(networkTypeBitmap);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAllowedNetworkTypesBitmap, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setAllowedNetworkTypesBitmap is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Assign a specified band for RF configuration.
       * 
       * @param serial Serial number of request.
       * @param mode RadioBandMode
       * 
       * Response function is IRadioNetworkResponse.setBandModeResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void setBandMode(int serial, int mode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(mode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBandMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setBandMode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Change call barring facility password
       * 
       * @param serial Serial number of request.
       * @param facility facility string code from TS 27.007 7.4 (eg "AO" for BAOC)
       * @param oldPassword old password
       * @param newPassword new password
       * 
       * Response function is IRadioNetworkResponse.setBarringPasswordResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setBarringPassword(int serial, java.lang.String facility, java.lang.String oldPassword, java.lang.String newPassword) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(facility);
          _data.writeString(oldPassword);
          _data.writeString(newPassword);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBarringPassword, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setBarringPassword is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Request to set the roaming preferences in CDMA
       * 
       * @param serial Serial number of request.
       * @param type CdmaRoamingType defined in types.hal
       * 
       * Response function is IRadioNetworkResponse.setCdmaRoamingPreferenceResponse()
       * 
       * This is available when android.hardware.telephony.cdma is defined.
       * 
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void setCdmaRoamingPreference(int serial, int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCdmaRoamingPreference, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCdmaRoamingPreference is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Sets the minimum time between when unsolicited cellInfoList() must be invoked.
       * A value of 0, means invoke cellInfoList() when any of the reported information changes.
       * Value of RadioConst:VALUE_UNAVAILABLE means never issue a unsolicited cellInfoList().
       * 
       * @param serial Serial number of request.
       * @param rate minimum time in milliseconds to indicate time between unsolicited cellInfoList()
       * 
       * Response function is IRadioNetworkResponse.setCellInfoListRateResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setCellInfoListRate(int serial, int rate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(rate);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCellInfoListRate, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCellInfoListRate is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Sets the indication filter. Prevents the reporting of specified unsolicited indications from
       * the radio. This is used for power saving in instances when those indications are not needed.
       * If unset, defaults to IndicationFilter:ALL.
       * 
       * @param serial Serial number of request.
       * @param indicationFilter 32-bit bitmap of IndicationFilter. Bits set to 1 indicate the
       *        indications are enabled. See IndicationFilter for the definition of each bit.
       * 
       * Response function is IRadioNetworkResponse.setIndicationFilterResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setIndicationFilter(int serial, int indicationFilter) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(indicationFilter);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIndicationFilter, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setIndicationFilter is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Sets the link capacity reporting criteria. The resulting reporting criteria are the AND of
       * all the supplied criteria. Note that reporting criteria must be individually set for each
       * RAN. If unset, reporting criteria for that RAN are implementation-defined.
       * 
       * @param serial Serial number of request.
       * @param hysteresisMs A hysteresis time in milliseconds to prevent flapping. A value of 0
       *        disables hysteresis.
       * @param hysteresisDlKbps An interval in kbps defining the required magnitude change between DL
       *        reports. hysteresisDlKbps must be smaller than the smallest threshold delta. A value
       *        of 0 disables hysteresis.
       * @param hysteresisUlKbps An interval in kbps defining the required magnitude change between UL
       *        reports. hysteresisUlKbps must be smaller than the smallest threshold delta. A value
       *        of 0 disables hysteresis.
       * @param thresholdsDownlinkKbps A vector of trigger thresholds in kbps for downlink reports. A
       *        vector size of 0 disables the use of DL thresholds for reporting.
       * @param thresholdsUplinkKbps A vector of trigger thresholds in kbps for uplink reports. A
       *        vector size of 0 disables the use of UL thresholds for reporting.
       * @param accessNetwork The type of network for which to apply these thresholds.
       * 
       * Response function is IRadioNetworkResponse.setLinkCapacityReportingCriteriaResponse().
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setLinkCapacityReportingCriteria(int serial, int hysteresisMs, int hysteresisDlKbps, int hysteresisUlKbps, int[] thresholdsDownlinkKbps, int[] thresholdsUplinkKbps, int accessNetwork) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(hysteresisMs);
          _data.writeInt(hysteresisDlKbps);
          _data.writeInt(hysteresisUlKbps);
          _data.writeIntArray(thresholdsDownlinkKbps);
          _data.writeIntArray(thresholdsUplinkKbps);
          _data.writeInt(accessNetwork);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLinkCapacityReportingCriteria, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setLinkCapacityReportingCriteria is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enables/disables network state change notifications due to changes in LAC and/or CID (for
       * GSM). Basically +CREG=2 vs. +CREG=1 (TS 27.007).
       * The Radio implementation must default to "updates enabled" when the screen is on and
       * "updates disabled" when the screen is off.
       * 
       * @param serial Serial number of request.
       * @param enable true=updates enabled (+CREG=2), false=updates disabled (+CREG=1)
       * 
       * Response function is IRadioNetworkResponse.setLocationUpdatesResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void setLocationUpdates(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLocationUpdates, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setLocationUpdates is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Specify that the network must be selected automatically.
       * This request must not respond until the new operator is selected and registered.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.setNetworkSelectionModeAutomaticResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setNetworkSelectionModeAutomatic(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNetworkSelectionModeAutomatic, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNetworkSelectionModeAutomatic is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Manually select a specified network. This request must not respond until the new operator is
       * selected and registered. Per TS 23.122, the RAN is just the initial suggested value.
       * If registration fails, the RAN is not available afterwards, or the RAN is not within the
       * network types specified by IRadioNetwork::setAllowedNetworkTypeBitmap, then the modem will
       * need to select the next best RAN for network registration.
       * 
       * @param serial Serial number of request.
       * @param operatorNumeric String specifying MCCMNC of network to select (eg "310170").
       * @param ran Initial suggested access network type. If value is UNKNOWN, the modem will select
       *        the next best RAN for network registration.
       * 
       * Response function is IRadioNetworkResponse.setNetworkSelectionModeManualResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setNetworkSelectionModeManual(int serial, java.lang.String operatorNumeric, int ran) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(operatorNumeric);
          _data.writeInt(ran);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNetworkSelectionModeManual, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNetworkSelectionModeManual is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enable or disable E-UTRA-NR dual connectivity. If disabled then UE will not connect
       * to secondary carrier.
       * 
       * @param serial Serial number of request.
       * @param nrDualConnectivityState expected NR dual connectivity state.
       *        1: Enable NR dual connectivity {NrDualConnectivityState:ENABLE}
       *        2: Disable NR dual connectivity {NrDualConnectivityState:DISABLE}
       *        3: Disable NR dual connectivity and force secondary cell to be released
       *           {NrDualConnectivityState:DISABLE_IMMEDIATE}
       * 
       * Response function is IRadioNetworkResponse.setNrDualConnectivityStateResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setNrDualConnectivityState(int serial, byte nrDualConnectivityState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeByte(nrDualConnectivityState);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNrDualConnectivityState, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNrDualConnectivityState is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set response functions for network radio requests and indications.
       * 
       * @param radioNetworkResponse Object containing response functions
       * @param radioNetworkIndication Object containing radio indications
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setResponseFunctions(android.hardware.radio.network.IRadioNetworkResponse radioNetworkResponse, android.hardware.radio.network.IRadioNetworkIndication radioNetworkIndication) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeStrongInterface(radioNetworkResponse);
          _data.writeStrongInterface(radioNetworkIndication);
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
       * Sets or clears the signal strength reporting criteria for multiple RANs in one request.
       * 
       * The reporting criteria are set individually for each combination of RAN and measurement type.
       * For each RAN type, if no reporting criteria are set, then the reporting of SignalStrength for
       * that RAN is implementation-defined. If any criteria are supplied for a RAN type, then
       * SignalStrength is only reported as specified by those criteria. For any RAN types not defined
       * by this HAL, reporting is implementation-defined.
       * 
       * @param serial Serial number of request.
       * @param signalThresholdInfos Collection of SignalThresholdInfo specifying the reporting
       *        criteria. See SignalThresholdInfo for details.
       * 
       * Response function is IRadioNetworkResponse.setSignalStrengthReportingCriteriaResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setSignalStrengthReportingCriteria(int serial, android.hardware.radio.network.SignalThresholdInfo[] signalThresholdInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedArray(signalThresholdInfos, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSignalStrengthReportingCriteria, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSignalStrengthReportingCriteria is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enables/disables supplementary service related notifications from the network.
       * Notifications are reported via unsolSuppSvcNotification().
       * 
       * @param serial Serial number of request.
       * @param enable true = notifications enabled, false = notifications disabled.
       * 
       * Response function is IRadioNetworkResponse.setSuppServiceNotificationsResponse()
       * 
       * This is available when android.hardware.telephony.calling is defined.
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void setSuppServiceNotifications(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSuppServiceNotifications, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSuppServiceNotifications is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Specify which bands modem's background scan must act on. If specifyChannels is true, it only
       * scans bands specified in specifiers. If specifyChannels is false, it scans all bands. For
       * example, CBRS is only on LTE band 48. By specifying this band, modem saves more power.
       * 
       * @param serial Serial number of request.
       * @param specifyChannels whether to scan bands defined in specifiers.
       * @param specifiers which bands to scan. Only used if specifyChannels is true.
       * 
       * Response function is IRadioNetworkResponse.setSystemSelectionChannelsResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setSystemSelectionChannels(int serial, boolean specifyChannels, android.hardware.radio.network.RadioAccessSpecifier[] specifiers) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(specifyChannels);
          _data.writeTypedArray(specifiers, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSystemSelectionChannels, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSystemSelectionChannels is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Starts a network scan.
       * 
       * @param serial Serial number of request.
       * @param request Defines the radio networks/bands/channels which need to be scanned.
       * 
       * Response function is IRadioNetworkResponse.startNetworkScanResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void startNetworkScan(int serial, android.hardware.radio.network.NetworkScanRequest request) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(request, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startNetworkScan, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startNetworkScan is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Stops ongoing network scan
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.stopNetworkScanResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void stopNetworkScan(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopNetworkScan, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopNetworkScan is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Requests that network personalization be deactivated
       * 
       * @param serial Serial number of request.
       * @param netPin Network depersonalization code
       * 
       * Response function is IRadioNetworkResponse.supplyNetworkDepersonalizationResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void supplyNetworkDepersonalization(int serial, java.lang.String netPin) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeString(netPin);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supplyNetworkDepersonalization, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method supplyNetworkDepersonalization is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set the UE usage setting for data/voice centric usage.
       * 
       * <p>Sets the usage setting in accordance with 3gpp 24.301 sec 4.3 and 3gpp 24.501 sec 4.3.
       * <p>This value must be independently preserved for each SIM; (setting the value is not a
       * "global" override).
       * 
       * @param serial Serial number of request.
       * @param usageSetting the usage setting for the current SIM.
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void setUsageSetting(int serial, int usageSetting) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(usageSetting);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUsageSetting, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setUsageSetting is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get the UE usage setting for data/voice centric usage.
       * 
       * <p>Gets the usage setting in accordance with 3gpp 24.301 sec 4.3 and 3gpp 24.501 sec 4.3.
       * 
       * @param serial Serial number of request.
       * 
       * This is available when android.hardware.telephony is defined.
       */
      @Override public void getUsageSetting(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUsageSetting, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getUsageSetting is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set the Emergency Mode
       * 
       * @param serial Serial number of the request.
       * @param emcModeType Defines the radio emergency mode type/radio network required/
       * type of service to be scanned.
       * 
       * Response function is IRadioEmergencyResponse.setEmergencyModeResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setEmergencyMode(int serial, int emcModeType) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeInt(emcModeType);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setEmergencyMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setEmergencyMode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Triggers an Emergency network scan.
       * 
       * @param serial Serial number of the request.
       * @param request Contains the preferred networks and type of service to be scanned.
       *                See {@link EmergencyNetworkScanTrigger}.
       * 
       * Response function is IRadioEmergencyResponse.triggerEmergencyNetworkScanResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void triggerEmergencyNetworkScan(int serial, android.hardware.radio.network.EmergencyNetworkScanTrigger request) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeTypedObject(request, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_triggerEmergencyNetworkScan, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method triggerEmergencyNetworkScan is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Cancels ongoing Emergency network scan
       * 
       * @param serial Serial number of the request.
       * @param resetScan Indicates how the next {@link #triggerEmergencyNetworkScan} should work.
       *        If {@code true}, then the modem shall start the new scan from the beginning,
       *        otherwise the modem shall resume from the last search.
       * 
       * Response function is IRadioEmergencyResponse.cancelEmergencyNetworkScan()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void cancelEmergencyNetworkScan(int serial, boolean resetScan) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(resetScan);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelEmergencyNetworkScan, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cancelEmergencyNetworkScan is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Exits ongoing Emergency Mode
       * 
       * @param serial Serial number of the request.
       * 
       * Response function is IRadioEmergencyResponse.exitEmergencyModeResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void exitEmergencyMode(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitEmergencyMode, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method exitEmergencyMode is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set if null encryption and integrity modes are enabled. If the value of enabled is false
       * the modem must not allow any network communications with null ciphering (for both signalling
       * and user data) or null integrity (for signalling) modes for 3G and above, even if the
       * network only uses null algorithms. This setting must be respected even if
       * "cipheringDisabled" (as defined in TS 38.331) is in use by the network.
       * 
       * For 2G, which does not use integrity protection, the modem must only disallow any network
       * communications with null ciphering.
       * 
       * In the case when enabled is false, integrity protection for user data is optional, but
       * ciphering for user data is required.
       * 
       * In case of an emergency call, the modem must bypass this setting.
       * 
       * Null ciphering and integrity modes include (but are not limited to):
       * 2G: A5/0 and GEA0
       * 3G: UEA0 and UIA0
       * 4G: EEA0 and EIA0
       * 5G: NEA0 and NIA0
       * 
       * 
       * @param serial Serial number of the request.
       * @param enabled To allow null encryption/integrity, set to true.
       *                Otherwise, false.
       * 
       * Response callback is IRadioResponse.setNullCipherAndIntegrityEnabledResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setNullCipherAndIntegrityEnabled(int serial, boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNullCipherAndIntegrityEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNullCipherAndIntegrityEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get whether null encryption and integrity modes are enabled.
       * 
       * Null ciphering and integrity modes include, (but are not limited to):
       * 2G: A5/0, GAE0 (no integrity algorithm supported)
       * 3G: UEA0 and UIA0
       * 4G: EEA0 and EIA
       * 5G: NEA0 and NIA0
       * 
       * @param serial Serial number of the request.
       * 
       * Response callback is IRadioNetworkResponse.isNullCipherAndIntegrityEnabledResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void isNullCipherAndIntegrityEnabled(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isNullCipherAndIntegrityEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isNullCipherAndIntegrityEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Checks whether N1 mode (access to 5G core network) is enabled or not.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.isN1ModeEnabledResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void isN1ModeEnabled(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isN1ModeEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isN1ModeEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enables or disables N1 mode (access to 5G core network) in accordance with
       * 3GPP TS 24.501 4.9.
       * 
       * Note: The default value of N1 mode shall be based on the modem's internal configuration
       * as per device or carrier. This API may be invoked on demand first to disable N1 mode and
       * later to re-enable for certain use case. This setting shall not be persisted by modem.
       * This setting shall not interfere with the allowed network type bitmap set using
       * {@link IRadioNetwork#setAllowedNetworkTypesBitmap()} API.
       * 
       * @param serial Serial number of request.
       * @param enable {@code true} to enable N1 mode, {@code false} to disable N1 mode.
       * 
       * Response function is IRadioNetworkResponse.setN1ModeEnabledResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setN1ModeEnabled(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setN1ModeEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setN1ModeEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Get whether pre-auth cellular identifier in-the-clear transparency is enabled. If
       * IRadioNetworkInterface.setCellularIdentifierTransparencyEnabled has been called, this should
       * return the value of the `enabled` parameter of the last successful call and false if
       * IRadioNetworkInterface.setCellularIdentifierTransparencyEnabled has not been called yet.
       * 
       * @param serial Serial number of request
       * 
       * Response callback is IRadioNetworkResponse.isCellularIdentifierTransparencyEnabledResponse
       * 
       * This is available when android.hardware.telephony.access is defined.
       */
      @Override public void isCellularIdentifierTransparencyEnabled(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isCellularIdentifierTransparencyEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isCellularIdentifierTransparencyEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enable or disable transparency for in-the-clear cellular identifiers. If the value of enabled
       * is true, the modem must call IRadioNetworkIndication.cellularIdentifierDisclosed when an
       * IMSI, IMEI, or unciphered SUCI (in 5G SA) appears in one of the following UE-initiated NAS
       * messages before a security context is established.
       * 
       * Note: Cellular identifiers disclosed in uplink messages covered under a NAS Security Context
       * as well as identifiers disclosed in downlink messages are out of scope.
       * 
       * This feature applies to 2g, 3g, 4g, and 5g (SA and NSA) messages sent before a security
       * context is established. In scope message definitions and their associated spec references can
       * be found in NasProtocolMessage.
       * 
       * If the value of enabled is false, the modem must not call
       * IRadioNetworkIndication.sentCellularIdentifierDisclosure again until a subsequent call
       * re-enables this functionality. The modem may choose to stop tracking cellular identifiers in
       * the clear during this time.
       * 
       * @param serial Serial number of request
       * @param enabled Whether or not to enable sending indications for cellular identifiers in the
       *         clear
       * 
       * Response function is IRadioNetworkResponse.setCellularIdentifierTransparencyEnabledResponse
       * 
       * This is available when android.hardware.telephony.access is defined.
       */
      @Override public void setCellularIdentifierTransparencyEnabled(int serial, boolean enabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCellularIdentifierTransparencyEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCellularIdentifierTransparencyEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enables or disables security algorithm update reports via indication API
       * {@link IRadioNetworkIndication.securityAlgorithmsUpdated()}.
       * 
       * @param serial Serial number of request.
       * @param enable {@code true} to enable security algorithm update reports, {@code false} to
       *         disable.
       * 
       * Response function is IRadioNetworkResponse.setSecurityAlgorithmsUpdatedEnabledResponse()
       * 
       * This is available when android.hardware.telephony.access is defined.
       */
      @Override public void setSecurityAlgorithmsUpdatedEnabled(int serial, boolean enable) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(enable);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSecurityAlgorithmsUpdatedEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSecurityAlgorithmsUpdatedEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Checks whether security algorithm update reports are enabled via indication API
       * {@link IRadioNetworkIndication.securityAlgorithmsUpdated()}.
       * 
       * @param serial Serial number of request.
       * 
       * Response function is IRadioNetworkResponse.isSecurityAlgorithmsUpdatedEnabledResponse()
       * 
       * This is available when android.hardware.telephony.access is defined.
       */
      @Override public void isSecurityAlgorithmsUpdatedEnabled(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isSecurityAlgorithmsUpdatedEnabled, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isSecurityAlgorithmsUpdatedEnabled is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Set the non-terrestrial PLMN with lower priority than terrestrial networks.
       * MCC/MNC broadcast by the non-terrestrial networks may not be included in OPLMNwACT file on
       * SIM profile. Acquisition of satellite based system is lower priority to terrestrial
       * networks. UE shall make all attempts to acquire terrestrial service prior to camping on
       * satellite LTE service.
       * 
       * @param serial Serial number of request
       * @param carrierPlmnArray Array of roaming PLMN used for connecting to satellite networks
       *                         supported by user subscription.
       * @param allSatellitePlmnArray allSatellitePlmnArray contains all the PLMNs present in
       *                              carrierPlmnArray and also list of satellite PLMNs that are not
       *                              supported by the carrier.
       *                              Modem should use the allSatellitePlmnArray to identify satellite
       *                              PLMNs that are not supported by the carrier and make sure not to
       *                              attach to them.
       * 
       * Response function is IRadioNetworkResponse.setSatellitePlmnResponse()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setSatellitePlmn(int serial, java.lang.String[] carrierPlmnArray, java.lang.String[] allSatellitePlmnArray) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeStringArray(carrierPlmnArray);
          _data.writeStringArray(allSatellitePlmnArray);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSatellitePlmn, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSatellitePlmn is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Enable or disable satellite in the cellular modem associated with a carrier.
       * 
       * Refer setSatellitePlmn for the details of satellite PLMN scanning process. Once modem is
       * disabled, modem should not attach to any of the PLMNs present in allSatellitePlmnArray.
       * If modem is enabled, modem should attach to only PLMNs present in carrierPlmnArray.
       * 
       * @param serial Serial number of request
       * @param satelliteEnabled {@code true} to enable satellite, {@code false} to disable satellite.
       * 
       * Response function is IRadioNetworkResponse.setSatelliteEnabledForCarrier()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void setSatelliteEnabledForCarrier(int serial, boolean satelliteEnabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          _data.writeBoolean(satelliteEnabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSatelliteEnabledForCarrier, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSatelliteEnabledForCarrier is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Check whether satellite is enabled in the cellular modem associated with a carrier.
       * 
       * @param serial Serial number of request
       * 
       * Response function is IRadioNetworkResponse.isSatelliteEnabledForCarrier()
       * 
       * This is available when android.hardware.telephony.radio.access is defined.
       */
      @Override public void isSatelliteEnabledForCarrier(int serial) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(serial);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isSatelliteEnabledForCarrier, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isSatelliteEnabledForCarrier is unimplemented.");
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
    static final int TRANSACTION_getAllowedNetworkTypesBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_getAvailableBandModes = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getAvailableNetworks = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getBarringInfo = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getCdmaRoamingPreference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getCellInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getDataRegistrationState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getImsRegistrationState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getNetworkSelectionMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getOperator = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getSignalStrength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getSystemSelectionChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getVoiceRadioTechnology = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getVoiceRegistrationState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_isNrDualConnectivityEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_responseAcknowledgement = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setAllowedNetworkTypesBitmap = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setBandMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_setBarringPassword = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_setCdmaRoamingPreference = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_setCellInfoListRate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_setIndicationFilter = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_setLinkCapacityReportingCriteria = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_setLocationUpdates = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_setNetworkSelectionModeAutomatic = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_setNetworkSelectionModeManual = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setNrDualConnectivityState = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_setResponseFunctions = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_setSignalStrengthReportingCriteria = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setSuppServiceNotifications = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_setSystemSelectionChannels = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_startNetworkScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_stopNetworkScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_supplyNetworkDepersonalization = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_setUsageSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_getUsageSetting = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_setEmergencyMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_triggerEmergencyNetworkScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_cancelEmergencyNetworkScan = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_exitEmergencyMode = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_setNullCipherAndIntegrityEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_isNullCipherAndIntegrityEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_isN1ModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_setN1ModeEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_isCellularIdentifierTransparencyEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_setCellularIdentifierTransparencyEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_setSecurityAlgorithmsUpdatedEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_isSecurityAlgorithmsUpdatedEnabled = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_setSatellitePlmn = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_setSatelliteEnabledForCarrier = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_isSatelliteEnabledForCarrier = (android.os.IBinder.FIRST_CALL_TRANSACTION + 50);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$network$IRadioNetwork".replace('$', '.');
  /**
   * Requests bitmap representing the currently allowed network types.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getAllowedNetworkTypesBitmapResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getAllowedNetworkTypesBitmap(int serial) throws android.os.RemoteException;
  /**
   * Get the list of band modes supported by RF.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getAvailableBandModesResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void getAvailableBandModes(int serial) throws android.os.RemoteException;
  /**
   * Scans for available networks
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getAvailableNetworksResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getAvailableNetworks(int serial) throws android.os.RemoteException;
  /**
   * Get all the barring info for the current camped cell applicable to the current user.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getBarringInfoResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getBarringInfo(int serial) throws android.os.RemoteException;
  /**
   * Request the actual setting of the roaming preferences in CDMA in the modem
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getCdmaRoamingPreferenceResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void getCdmaRoamingPreference(int serial) throws android.os.RemoteException;
  /**
   * Request all of the current cell information known to the radio. The radio must return a list
   * of all current cells, including the neighboring cells. If for a particular cell information
   * isn't known then the appropriate unknown value will be returned.
   * This does not cause or change the rate of unsolicited cellInfoList().
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getCellInfoListResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getCellInfoList(int serial) throws android.os.RemoteException;
  /**
   * Request current data registration state.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getDataRegistrationStateResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getDataRegistrationState(int serial) throws android.os.RemoteException;
  /**
   * Request current IMS registration state
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getImsRegistrationStateResponse()
   * 
   * This is available when android.hardware.telephony.ims is defined.
   * 
   * @deprecated Deprecated starting from Android U.
   */
  @Deprecated
  public void getImsRegistrationState(int serial) throws android.os.RemoteException;
  /**
   * Query current network selection mode
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getNetworkSelectionModeResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getNetworkSelectionMode(int serial) throws android.os.RemoteException;
  /**
   * Request current operator ONS or EONS
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getOperatorResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getOperator(int serial) throws android.os.RemoteException;
  /**
   * Requests current signal strength and associated information. Must succeed if radio is on.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getSignalStrengthResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getSignalStrength(int serial) throws android.os.RemoteException;
  /**
   * Get which bands the modem's background scan is acting on.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getSystemSelectionChannelsResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getSystemSelectionChannels(int serial) throws android.os.RemoteException;
  /**
   * Query the radio technology type (3GPP/3GPP2) used for voice. Query is valid only
   * when radio state is not RADIO_STATE_UNAVAILABLE
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getVoiceRadioTechnologyResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getVoiceRadioTechnology(int serial) throws android.os.RemoteException;
  /**
   * Request current voice registration state.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.getVoiceRegistrationStateResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void getVoiceRegistrationState(int serial) throws android.os.RemoteException;
  /**
   * Is E-UTRA-NR Dual Connectivity enabled
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.isNrDualConnectivityEnabledResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void isNrDualConnectivityEnabled(int serial) throws android.os.RemoteException;
  /**
   * When response type received from a radio indication or radio response is
   * RadioIndicationType:UNSOLICITED_ACK_EXP or RadioResponseType:SOLICITED_ACK_EXP respectively,
   * acknowledge the receipt of those messages by sending responseAcknowledgement().
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void responseAcknowledgement() throws android.os.RemoteException;
  /**
   * Requests to set the network type for searching and registering. Instruct the radio to
   * *only* accept the types of network provided. In case of an emergency call, the modem is
   * authorized to bypass this restriction.
   * 
   * @param serial Serial number of request.
   * @param networkTypeBitmap a 32-bit bearer bitmap of RadioAccessFamily
   * 
   * Response function is IRadioNetworkResponse.setAllowedNetworkTypesBitmapResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setAllowedNetworkTypesBitmap(int serial, int networkTypeBitmap) throws android.os.RemoteException;
  /**
   * Assign a specified band for RF configuration.
   * 
   * @param serial Serial number of request.
   * @param mode RadioBandMode
   * 
   * Response function is IRadioNetworkResponse.setBandModeResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void setBandMode(int serial, int mode) throws android.os.RemoteException;
  /**
   * Change call barring facility password
   * 
   * @param serial Serial number of request.
   * @param facility facility string code from TS 27.007 7.4 (eg "AO" for BAOC)
   * @param oldPassword old password
   * @param newPassword new password
   * 
   * Response function is IRadioNetworkResponse.setBarringPasswordResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setBarringPassword(int serial, java.lang.String facility, java.lang.String oldPassword, java.lang.String newPassword) throws android.os.RemoteException;
  /**
   * Request to set the roaming preferences in CDMA
   * 
   * @param serial Serial number of request.
   * @param type CdmaRoamingType defined in types.hal
   * 
   * Response function is IRadioNetworkResponse.setCdmaRoamingPreferenceResponse()
   * 
   * This is available when android.hardware.telephony.cdma is defined.
   * 
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void setCdmaRoamingPreference(int serial, int type) throws android.os.RemoteException;
  /**
   * Sets the minimum time between when unsolicited cellInfoList() must be invoked.
   * A value of 0, means invoke cellInfoList() when any of the reported information changes.
   * Value of RadioConst:VALUE_UNAVAILABLE means never issue a unsolicited cellInfoList().
   * 
   * @param serial Serial number of request.
   * @param rate minimum time in milliseconds to indicate time between unsolicited cellInfoList()
   * 
   * Response function is IRadioNetworkResponse.setCellInfoListRateResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setCellInfoListRate(int serial, int rate) throws android.os.RemoteException;
  /**
   * Sets the indication filter. Prevents the reporting of specified unsolicited indications from
   * the radio. This is used for power saving in instances when those indications are not needed.
   * If unset, defaults to IndicationFilter:ALL.
   * 
   * @param serial Serial number of request.
   * @param indicationFilter 32-bit bitmap of IndicationFilter. Bits set to 1 indicate the
   *        indications are enabled. See IndicationFilter for the definition of each bit.
   * 
   * Response function is IRadioNetworkResponse.setIndicationFilterResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setIndicationFilter(int serial, int indicationFilter) throws android.os.RemoteException;
  /**
   * Sets the link capacity reporting criteria. The resulting reporting criteria are the AND of
   * all the supplied criteria. Note that reporting criteria must be individually set for each
   * RAN. If unset, reporting criteria for that RAN are implementation-defined.
   * 
   * @param serial Serial number of request.
   * @param hysteresisMs A hysteresis time in milliseconds to prevent flapping. A value of 0
   *        disables hysteresis.
   * @param hysteresisDlKbps An interval in kbps defining the required magnitude change between DL
   *        reports. hysteresisDlKbps must be smaller than the smallest threshold delta. A value
   *        of 0 disables hysteresis.
   * @param hysteresisUlKbps An interval in kbps defining the required magnitude change between UL
   *        reports. hysteresisUlKbps must be smaller than the smallest threshold delta. A value
   *        of 0 disables hysteresis.
   * @param thresholdsDownlinkKbps A vector of trigger thresholds in kbps for downlink reports. A
   *        vector size of 0 disables the use of DL thresholds for reporting.
   * @param thresholdsUplinkKbps A vector of trigger thresholds in kbps for uplink reports. A
   *        vector size of 0 disables the use of UL thresholds for reporting.
   * @param accessNetwork The type of network for which to apply these thresholds.
   * 
   * Response function is IRadioNetworkResponse.setLinkCapacityReportingCriteriaResponse().
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setLinkCapacityReportingCriteria(int serial, int hysteresisMs, int hysteresisDlKbps, int hysteresisUlKbps, int[] thresholdsDownlinkKbps, int[] thresholdsUplinkKbps, int accessNetwork) throws android.os.RemoteException;
  /**
   * Enables/disables network state change notifications due to changes in LAC and/or CID (for
   * GSM). Basically +CREG=2 vs. +CREG=1 (TS 27.007).
   * The Radio implementation must default to "updates enabled" when the screen is on and
   * "updates disabled" when the screen is off.
   * 
   * @param serial Serial number of request.
   * @param enable true=updates enabled (+CREG=2), false=updates disabled (+CREG=1)
   * 
   * Response function is IRadioNetworkResponse.setLocationUpdatesResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void setLocationUpdates(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Specify that the network must be selected automatically.
   * This request must not respond until the new operator is selected and registered.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.setNetworkSelectionModeAutomaticResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setNetworkSelectionModeAutomatic(int serial) throws android.os.RemoteException;
  /**
   * Manually select a specified network. This request must not respond until the new operator is
   * selected and registered. Per TS 23.122, the RAN is just the initial suggested value.
   * If registration fails, the RAN is not available afterwards, or the RAN is not within the
   * network types specified by IRadioNetwork::setAllowedNetworkTypeBitmap, then the modem will
   * need to select the next best RAN for network registration.
   * 
   * @param serial Serial number of request.
   * @param operatorNumeric String specifying MCCMNC of network to select (eg "310170").
   * @param ran Initial suggested access network type. If value is UNKNOWN, the modem will select
   *        the next best RAN for network registration.
   * 
   * Response function is IRadioNetworkResponse.setNetworkSelectionModeManualResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setNetworkSelectionModeManual(int serial, java.lang.String operatorNumeric, int ran) throws android.os.RemoteException;
  /**
   * Enable or disable E-UTRA-NR dual connectivity. If disabled then UE will not connect
   * to secondary carrier.
   * 
   * @param serial Serial number of request.
   * @param nrDualConnectivityState expected NR dual connectivity state.
   *        1: Enable NR dual connectivity {NrDualConnectivityState:ENABLE}
   *        2: Disable NR dual connectivity {NrDualConnectivityState:DISABLE}
   *        3: Disable NR dual connectivity and force secondary cell to be released
   *           {NrDualConnectivityState:DISABLE_IMMEDIATE}
   * 
   * Response function is IRadioNetworkResponse.setNrDualConnectivityStateResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setNrDualConnectivityState(int serial, byte nrDualConnectivityState) throws android.os.RemoteException;
  /**
   * Set response functions for network radio requests and indications.
   * 
   * @param radioNetworkResponse Object containing response functions
   * @param radioNetworkIndication Object containing radio indications
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setResponseFunctions(android.hardware.radio.network.IRadioNetworkResponse radioNetworkResponse, android.hardware.radio.network.IRadioNetworkIndication radioNetworkIndication) throws android.os.RemoteException;
  /**
   * Sets or clears the signal strength reporting criteria for multiple RANs in one request.
   * 
   * The reporting criteria are set individually for each combination of RAN and measurement type.
   * For each RAN type, if no reporting criteria are set, then the reporting of SignalStrength for
   * that RAN is implementation-defined. If any criteria are supplied for a RAN type, then
   * SignalStrength is only reported as specified by those criteria. For any RAN types not defined
   * by this HAL, reporting is implementation-defined.
   * 
   * @param serial Serial number of request.
   * @param signalThresholdInfos Collection of SignalThresholdInfo specifying the reporting
   *        criteria. See SignalThresholdInfo for details.
   * 
   * Response function is IRadioNetworkResponse.setSignalStrengthReportingCriteriaResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setSignalStrengthReportingCriteria(int serial, android.hardware.radio.network.SignalThresholdInfo[] signalThresholdInfos) throws android.os.RemoteException;
  /**
   * Enables/disables supplementary service related notifications from the network.
   * Notifications are reported via unsolSuppSvcNotification().
   * 
   * @param serial Serial number of request.
   * @param enable true = notifications enabled, false = notifications disabled.
   * 
   * Response function is IRadioNetworkResponse.setSuppServiceNotificationsResponse()
   * 
   * This is available when android.hardware.telephony.calling is defined.
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void setSuppServiceNotifications(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Specify which bands modem's background scan must act on. If specifyChannels is true, it only
   * scans bands specified in specifiers. If specifyChannels is false, it scans all bands. For
   * example, CBRS is only on LTE band 48. By specifying this band, modem saves more power.
   * 
   * @param serial Serial number of request.
   * @param specifyChannels whether to scan bands defined in specifiers.
   * @param specifiers which bands to scan. Only used if specifyChannels is true.
   * 
   * Response function is IRadioNetworkResponse.setSystemSelectionChannelsResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setSystemSelectionChannels(int serial, boolean specifyChannels, android.hardware.radio.network.RadioAccessSpecifier[] specifiers) throws android.os.RemoteException;
  /**
   * Starts a network scan.
   * 
   * @param serial Serial number of request.
   * @param request Defines the radio networks/bands/channels which need to be scanned.
   * 
   * Response function is IRadioNetworkResponse.startNetworkScanResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void startNetworkScan(int serial, android.hardware.radio.network.NetworkScanRequest request) throws android.os.RemoteException;
  /**
   * Stops ongoing network scan
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.stopNetworkScanResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void stopNetworkScan(int serial) throws android.os.RemoteException;
  /**
   * Requests that network personalization be deactivated
   * 
   * @param serial Serial number of request.
   * @param netPin Network depersonalization code
   * 
   * Response function is IRadioNetworkResponse.supplyNetworkDepersonalizationResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void supplyNetworkDepersonalization(int serial, java.lang.String netPin) throws android.os.RemoteException;
  /**
   * Set the UE usage setting for data/voice centric usage.
   * 
   * <p>Sets the usage setting in accordance with 3gpp 24.301 sec 4.3 and 3gpp 24.501 sec 4.3.
   * <p>This value must be independently preserved for each SIM; (setting the value is not a
   * "global" override).
   * 
   * @param serial Serial number of request.
   * @param usageSetting the usage setting for the current SIM.
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void setUsageSetting(int serial, int usageSetting) throws android.os.RemoteException;
  /**
   * Get the UE usage setting for data/voice centric usage.
   * 
   * <p>Gets the usage setting in accordance with 3gpp 24.301 sec 4.3 and 3gpp 24.501 sec 4.3.
   * 
   * @param serial Serial number of request.
   * 
   * This is available when android.hardware.telephony is defined.
   */
  public void getUsageSetting(int serial) throws android.os.RemoteException;
  /**
   * Set the Emergency Mode
   * 
   * @param serial Serial number of the request.
   * @param emcModeType Defines the radio emergency mode type/radio network required/
   * type of service to be scanned.
   * 
   * Response function is IRadioEmergencyResponse.setEmergencyModeResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setEmergencyMode(int serial, int emcModeType) throws android.os.RemoteException;
  /**
   * Triggers an Emergency network scan.
   * 
   * @param serial Serial number of the request.
   * @param request Contains the preferred networks and type of service to be scanned.
   *                See {@link EmergencyNetworkScanTrigger}.
   * 
   * Response function is IRadioEmergencyResponse.triggerEmergencyNetworkScanResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void triggerEmergencyNetworkScan(int serial, android.hardware.radio.network.EmergencyNetworkScanTrigger request) throws android.os.RemoteException;
  /**
   * Cancels ongoing Emergency network scan
   * 
   * @param serial Serial number of the request.
   * @param resetScan Indicates how the next {@link #triggerEmergencyNetworkScan} should work.
   *        If {@code true}, then the modem shall start the new scan from the beginning,
   *        otherwise the modem shall resume from the last search.
   * 
   * Response function is IRadioEmergencyResponse.cancelEmergencyNetworkScan()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void cancelEmergencyNetworkScan(int serial, boolean resetScan) throws android.os.RemoteException;
  /**
   * Exits ongoing Emergency Mode
   * 
   * @param serial Serial number of the request.
   * 
   * Response function is IRadioEmergencyResponse.exitEmergencyModeResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void exitEmergencyMode(int serial) throws android.os.RemoteException;
  /**
   * Set if null encryption and integrity modes are enabled. If the value of enabled is false
   * the modem must not allow any network communications with null ciphering (for both signalling
   * and user data) or null integrity (for signalling) modes for 3G and above, even if the
   * network only uses null algorithms. This setting must be respected even if
   * "cipheringDisabled" (as defined in TS 38.331) is in use by the network.
   * 
   * For 2G, which does not use integrity protection, the modem must only disallow any network
   * communications with null ciphering.
   * 
   * In the case when enabled is false, integrity protection for user data is optional, but
   * ciphering for user data is required.
   * 
   * In case of an emergency call, the modem must bypass this setting.
   * 
   * Null ciphering and integrity modes include (but are not limited to):
   * 2G: A5/0 and GEA0
   * 3G: UEA0 and UIA0
   * 4G: EEA0 and EIA0
   * 5G: NEA0 and NIA0
   * 
   * 
   * @param serial Serial number of the request.
   * @param enabled To allow null encryption/integrity, set to true.
   *                Otherwise, false.
   * 
   * Response callback is IRadioResponse.setNullCipherAndIntegrityEnabledResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setNullCipherAndIntegrityEnabled(int serial, boolean enabled) throws android.os.RemoteException;
  /**
   * Get whether null encryption and integrity modes are enabled.
   * 
   * Null ciphering and integrity modes include, (but are not limited to):
   * 2G: A5/0, GAE0 (no integrity algorithm supported)
   * 3G: UEA0 and UIA0
   * 4G: EEA0 and EIA
   * 5G: NEA0 and NIA0
   * 
   * @param serial Serial number of the request.
   * 
   * Response callback is IRadioNetworkResponse.isNullCipherAndIntegrityEnabledResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void isNullCipherAndIntegrityEnabled(int serial) throws android.os.RemoteException;
  /**
   * Checks whether N1 mode (access to 5G core network) is enabled or not.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.isN1ModeEnabledResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void isN1ModeEnabled(int serial) throws android.os.RemoteException;
  /**
   * Enables or disables N1 mode (access to 5G core network) in accordance with
   * 3GPP TS 24.501 4.9.
   * 
   * Note: The default value of N1 mode shall be based on the modem's internal configuration
   * as per device or carrier. This API may be invoked on demand first to disable N1 mode and
   * later to re-enable for certain use case. This setting shall not be persisted by modem.
   * This setting shall not interfere with the allowed network type bitmap set using
   * {@link IRadioNetwork#setAllowedNetworkTypesBitmap()} API.
   * 
   * @param serial Serial number of request.
   * @param enable {@code true} to enable N1 mode, {@code false} to disable N1 mode.
   * 
   * Response function is IRadioNetworkResponse.setN1ModeEnabledResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setN1ModeEnabled(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Get whether pre-auth cellular identifier in-the-clear transparency is enabled. If
   * IRadioNetworkInterface.setCellularIdentifierTransparencyEnabled has been called, this should
   * return the value of the `enabled` parameter of the last successful call and false if
   * IRadioNetworkInterface.setCellularIdentifierTransparencyEnabled has not been called yet.
   * 
   * @param serial Serial number of request
   * 
   * Response callback is IRadioNetworkResponse.isCellularIdentifierTransparencyEnabledResponse
   * 
   * This is available when android.hardware.telephony.access is defined.
   */
  public void isCellularIdentifierTransparencyEnabled(int serial) throws android.os.RemoteException;
  /**
   * Enable or disable transparency for in-the-clear cellular identifiers. If the value of enabled
   * is true, the modem must call IRadioNetworkIndication.cellularIdentifierDisclosed when an
   * IMSI, IMEI, or unciphered SUCI (in 5G SA) appears in one of the following UE-initiated NAS
   * messages before a security context is established.
   * 
   * Note: Cellular identifiers disclosed in uplink messages covered under a NAS Security Context
   * as well as identifiers disclosed in downlink messages are out of scope.
   * 
   * This feature applies to 2g, 3g, 4g, and 5g (SA and NSA) messages sent before a security
   * context is established. In scope message definitions and their associated spec references can
   * be found in NasProtocolMessage.
   * 
   * If the value of enabled is false, the modem must not call
   * IRadioNetworkIndication.sentCellularIdentifierDisclosure again until a subsequent call
   * re-enables this functionality. The modem may choose to stop tracking cellular identifiers in
   * the clear during this time.
   * 
   * @param serial Serial number of request
   * @param enabled Whether or not to enable sending indications for cellular identifiers in the
   *         clear
   * 
   * Response function is IRadioNetworkResponse.setCellularIdentifierTransparencyEnabledResponse
   * 
   * This is available when android.hardware.telephony.access is defined.
   */
  public void setCellularIdentifierTransparencyEnabled(int serial, boolean enabled) throws android.os.RemoteException;
  /**
   * Enables or disables security algorithm update reports via indication API
   * {@link IRadioNetworkIndication.securityAlgorithmsUpdated()}.
   * 
   * @param serial Serial number of request.
   * @param enable {@code true} to enable security algorithm update reports, {@code false} to
   *         disable.
   * 
   * Response function is IRadioNetworkResponse.setSecurityAlgorithmsUpdatedEnabledResponse()
   * 
   * This is available when android.hardware.telephony.access is defined.
   */
  public void setSecurityAlgorithmsUpdatedEnabled(int serial, boolean enable) throws android.os.RemoteException;
  /**
   * Checks whether security algorithm update reports are enabled via indication API
   * {@link IRadioNetworkIndication.securityAlgorithmsUpdated()}.
   * 
   * @param serial Serial number of request.
   * 
   * Response function is IRadioNetworkResponse.isSecurityAlgorithmsUpdatedEnabledResponse()
   * 
   * This is available when android.hardware.telephony.access is defined.
   */
  public void isSecurityAlgorithmsUpdatedEnabled(int serial) throws android.os.RemoteException;
  /**
   * Set the non-terrestrial PLMN with lower priority than terrestrial networks.
   * MCC/MNC broadcast by the non-terrestrial networks may not be included in OPLMNwACT file on
   * SIM profile. Acquisition of satellite based system is lower priority to terrestrial
   * networks. UE shall make all attempts to acquire terrestrial service prior to camping on
   * satellite LTE service.
   * 
   * @param serial Serial number of request
   * @param carrierPlmnArray Array of roaming PLMN used for connecting to satellite networks
   *                         supported by user subscription.
   * @param allSatellitePlmnArray allSatellitePlmnArray contains all the PLMNs present in
   *                              carrierPlmnArray and also list of satellite PLMNs that are not
   *                              supported by the carrier.
   *                              Modem should use the allSatellitePlmnArray to identify satellite
   *                              PLMNs that are not supported by the carrier and make sure not to
   *                              attach to them.
   * 
   * Response function is IRadioNetworkResponse.setSatellitePlmnResponse()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setSatellitePlmn(int serial, java.lang.String[] carrierPlmnArray, java.lang.String[] allSatellitePlmnArray) throws android.os.RemoteException;
  /**
   * Enable or disable satellite in the cellular modem associated with a carrier.
   * 
   * Refer setSatellitePlmn for the details of satellite PLMN scanning process. Once modem is
   * disabled, modem should not attach to any of the PLMNs present in allSatellitePlmnArray.
   * If modem is enabled, modem should attach to only PLMNs present in carrierPlmnArray.
   * 
   * @param serial Serial number of request
   * @param satelliteEnabled {@code true} to enable satellite, {@code false} to disable satellite.
   * 
   * Response function is IRadioNetworkResponse.setSatelliteEnabledForCarrier()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void setSatelliteEnabledForCarrier(int serial, boolean satelliteEnabled) throws android.os.RemoteException;
  /**
   * Check whether satellite is enabled in the cellular modem associated with a carrier.
   * 
   * @param serial Serial number of request
   * 
   * Response function is IRadioNetworkResponse.isSatelliteEnabledForCarrier()
   * 
   * This is available when android.hardware.telephony.radio.access is defined.
   */
  public void isSatelliteEnabledForCarrier(int serial) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
