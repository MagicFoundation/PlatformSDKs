/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/IRadioNetworkResponse.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/IRadioNetworkResponse.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * Interface declaring response functions to solicited radio requests for network APIs.
 * @hide
 */
public interface IRadioNetworkResponse extends android.os.IInterface
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
  /** Default implementation for IRadioNetworkResponse. */
  public static class Default implements android.hardware.radio.network.IRadioNetworkResponse
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
     * @param networkTypeBitmap a 32-bit bitmap of RadioAccessFamily.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:MODE_NOT_SUPPORTED
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     */
    @Override public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo info, int networkTypeBitmap) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param bandModes List of RadioBandMode listing supported modes
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void getAvailableBandModesResponse(android.hardware.radio.RadioResponseInfo info, int[] bandModes) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param networkInfos List of network operator information as OperatorInfos
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:ABORTED
     *   RadioError:DEVICE_IN_USE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:CANCELLED
     *   RadioError:NO_RESOURCES
     *   RadioError:INTERNAL_ERR
     */
    @Override public void getAvailableNetworksResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.OperatorInfo[] networkInfos) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param cellIdentity CellIdentity for the barring infos.
     * @param barringInfos a vector of barring info for all barring service types
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     */
    @Override public void getBarringInfoResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.CellIdentity cellIdentity, android.hardware.radio.network.BarringInfo[] barringInfos) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param type CdmaRoamingType
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
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void getCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo info, int type) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param cellInfo List of current cell information known to radio
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     */
    @Override public void getCellInfoListResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.CellInfo[] cellInfo) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param dataRegResponse Current data registration response as defined by RegStateResult
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NOT_PROVISIONED
     */
    @Override public void getDataRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RegStateResult dataRegResponse) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param isRegistered false = not registered, true = registered
     * @param ratFamily RadioTechnologyFamily. This value is valid only if isRegistered is true.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:INVALID_MODEM_STATE
     * 
     * @deprecated Deprecated starting from Android U.
     */
    @Override public void getImsRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, boolean isRegistered, int ratFamily) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param selection false for automatic selection, true for manual selection
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getNetworkSelectionModeResponse(android.hardware.radio.RadioResponseInfo info, boolean manual) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param longName is long alpha ONS or EONS or empty string if unregistered
     * @param shortName is short alpha ONS or EONS or empty string if unregistered
     * @param numeric is 5 or 6 digit numeric code (MCC + MNC) or empty string if unregistered
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getOperatorResponse(android.hardware.radio.RadioResponseInfo info, java.lang.String longName, java.lang.String shortName, java.lang.String numeric) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param signalStrength Current signal strength
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     */
    @Override public void getSignalStrengthResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.SignalStrength signalStrength) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param specifiers List of RadioAccessSpecifiers that are scanned.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void getSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RadioAccessSpecifier[] specifiers) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param rat Current voice RAT
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_MEMORY
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void getVoiceRadioTechnologyResponse(android.hardware.radio.RadioResponseInfo info, int rat) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param voiceRegResponse Current Voice registration response as defined by RegStateResult
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     */
    @Override public void getVoiceRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RegStateResult voiceRegResponse) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param isEnabled Indicates whether NR dual connectivity is enabled or not, True if enabled
     *        else false.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     */
    @Override public void isNrDualConnectivityEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:MODE_NOT_SUPPORTED
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     */
    @Override public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void setBandModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:SS_MODIFIED_TO_DIAL
     *   RadioError:SS_MODIFIED_TO_USSD
     *   RadioError:SS_MODIFIED_TO_SS
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_MEMORY
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:FDN_CHECK_FAILURE
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setBarringPasswordResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.cdma is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void setCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     */
    @Override public void setCellInfoListRateResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     */
    @Override public void setIndicationFilterResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     */
    @Override public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void setLocationUpdatesResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:ILLEGAL_SIM_OR_ME
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     * 
     * Returns RadioError:ILLEGAL_SIM_OR_ME when the failure is permanent and
     * no retries needed, such as illegal SIM or ME.
     */
    @Override public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:ILLEGAL_SIM_OR_ME
     *   RadioError:OPERATION_NOT_ALLOWED
     *   RadioError:INVALID_STATE
     *   RadioError:NO_MEMORY
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:MODEM_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     * 
     * Returns RadioError:ILLEGAL_SIM_OR_ME when the failure is permanent and
     * no retries needed, such as illegal SIM or ME.
     */
    @Override public void setNetworkSelectionModeManualResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_STATE
     */
    @Override public void setNrDualConnectivityStateResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:RADIO_NOT_AVAILABLE
     */
    @Override public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
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
     *   RadioError:SIM_BUSY
     *   RadioError:NO_MEMORY
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INTERNAL_ERR
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     * 
     * @deprecated Android Telephony framework doesn't use this.
     */
    @Override public void setSuppServiceNotificationsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void setSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:DEVICE_IN_USE
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void startNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:INTERNAL_ERR
     *   RadioError:MODEM_ERR
     */
    @Override public void stopNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param remainingRetries Number of retries remaining, must be equal to -1 if unknown.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:PASSWORD_INCORRECT (code is invalid)
     *   RadioError:NO_MEMORY
     *   RadioError:INVALID_SIM_STATE
     *   RadioError:INTERNAL_ERR
     *   RadioError:SYSTEM_ERR
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:NO_RESOURCES
     *   RadioError:CANCELLED
     *   RadioError:SIM_ABSENT
     */
    @Override public void supplyNetworkDepersonalizationResponse(android.hardware.radio.RadioResponseInfo info, int remainingRetries) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:INVALID_ARGUMENTS
     *   RadioError:INTERNAL_ERR
     *   RadioError:SIM_ABSENT
     */
    @Override public void setUsageSettingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error.
     * @param usageSetting the usage setting for the current SIM.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INVALID_STATE
     *   RadioError:INTERNAL_ERR
     *   RadioError:SIM_ABSENT
     */
    @Override public void getUsageSettingResponse(android.hardware.radio.RadioResponseInfo info, int usageSetting) throws android.os.RemoteException
    {
    }
    /**
     * Response of setEmergencyMode.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * @param regState the current registration state of the modem.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void setEmergencyModeResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.EmergencyRegResult regState) throws android.os.RemoteException
    {
    }
    /**
     * Response of triggerEmergencyNetworkScan.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:MODEM_ERR
     *   RadioError:INVALID_ARGUMENTS
     */
    @Override public void triggerEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response of exitEmergencyMode.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:MODEM_ERR
     */
    @Override public void exitEmergencyModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response of cancelEmergencyNetworkScan.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:MODEM_ERR
     */
    @Override public void cancelEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:MODEM_ERR
     */
    @Override public void setNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * @param info Response info struct containing response type, serial no. and error
     * @param enabled the last known state of null ciphering and integrity algorithms
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:MODEM_ERR
     */
    @Override public void isNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
    {
    }
    /**
     * Response of isN1ModeEnabled.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * @param isEnabled Indicates whether N1 mode is enabled or not.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:REQUEST_NOT_SUPPORTED
     */
    @Override public void isN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
    {
    }
    /**
     * Response of setN1ModeEnabled.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:INVALID_STATE
     */
    @Override public void setN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response of isCellularIdentifierTransparencyEnabled.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * @param isEnabled Indicates whether cellular identifier transparency is enabled or not.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:REQUEST_NOT_SUPPORTED
     */
    @Override public void isCellularIdentifierTransparencyEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
    {
    }
    /**
     * Response of setCellularIdentifierTransparencyEnabled.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_STATE
     *   RadioError:REQUEST_NOT_SUPPORTED
     */
    @Override public void setCellularIdentifierTransparencyEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response of setSecurityAlgorithmsUpdatedEnabled.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:INVALID_STATE
     *   RadioError:REQUEST_NOT_SUPPORTED
     */
    @Override public void setSecurityAlgorithmsUpdatedEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response of isSecurityAlgorithmsUpdatedEnabled.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * @param isEnabled Indicates whether cellular ciphering transparency is enabled or not.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
     *                                    defined
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:REQUEST_NOT_SUPPORTED
     */
    @Override public void isSecurityAlgorithmsUpdatedEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
    {
    }
    /**
     * Response of setSatellitePlmn.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:INVALID_STATE
     */
    @Override public void setSatellitePlmnResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response of setSatelliteEnabledForCarrier.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:INVALID_STATE
     */
    @Override public void setSatelliteEnabledForCarrierResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
    {
    }
    /**
     * Response of isSatelliteEnabledForCarrier.
     * This is an optional API.
     * 
     * @param info Response info struct containing response type, serial no. and error.
     * @param isEnabled Indicates whether satellite is enabled for carrier or not.
     * 
     * Valid errors returned:
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:NONE
     *   RadioError:RADIO_NOT_AVAILABLE
     *   RadioError:INTERNAL_ERR
     *   RadioError:REQUEST_NOT_SUPPORTED
     *   RadioError:INVALID_STATE
     */
    @Override public void isSatelliteEnabledForCarrierResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.network.IRadioNetworkResponse
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.network.IRadioNetworkResponse interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.network.IRadioNetworkResponse asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.network.IRadioNetworkResponse))) {
        return ((android.hardware.radio.network.IRadioNetworkResponse)iin);
      }
      return new android.hardware.radio.network.IRadioNetworkResponse.Stub.Proxy(obj);
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
        case TRANSACTION_getAllowedNetworkTypesBitmapResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.getAllowedNetworkTypesBitmapResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getAvailableBandModesResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int[] _arg1;
          _arg1 = data.createIntArray();
          data.enforceNoDataAvail();
          this.getAvailableBandModesResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getAvailableNetworksResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.OperatorInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.network.OperatorInfo.CREATOR);
          data.enforceNoDataAvail();
          this.getAvailableNetworksResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getBarringInfoResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.CellIdentity _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.CellIdentity.CREATOR);
          android.hardware.radio.network.BarringInfo[] _arg2;
          _arg2 = data.createTypedArray(android.hardware.radio.network.BarringInfo.CREATOR);
          data.enforceNoDataAvail();
          this.getBarringInfoResponse(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_getCdmaRoamingPreferenceResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.getCdmaRoamingPreferenceResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getCellInfoListResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.CellInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.network.CellInfo.CREATOR);
          data.enforceNoDataAvail();
          this.getCellInfoListResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getDataRegistrationStateResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.RegStateResult _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.RegStateResult.CREATOR);
          data.enforceNoDataAvail();
          this.getDataRegistrationStateResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getImsRegistrationStateResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          int _arg2;
          _arg2 = data.readInt();
          data.enforceNoDataAvail();
          this.getImsRegistrationStateResponse(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_getNetworkSelectionModeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.getNetworkSelectionModeResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getOperatorResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          java.lang.String _arg1;
          _arg1 = data.readString();
          java.lang.String _arg2;
          _arg2 = data.readString();
          java.lang.String _arg3;
          _arg3 = data.readString();
          data.enforceNoDataAvail();
          this.getOperatorResponse(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_getSignalStrengthResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.SignalStrength _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.SignalStrength.CREATOR);
          data.enforceNoDataAvail();
          this.getSignalStrengthResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getSystemSelectionChannelsResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.RadioAccessSpecifier[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.network.RadioAccessSpecifier.CREATOR);
          data.enforceNoDataAvail();
          this.getSystemSelectionChannelsResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getVoiceRadioTechnologyResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.getVoiceRadioTechnologyResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_getVoiceRegistrationStateResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.RegStateResult _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.RegStateResult.CREATOR);
          data.enforceNoDataAvail();
          this.getVoiceRegistrationStateResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_isNrDualConnectivityEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.isNrDualConnectivityEnabledResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setAllowedNetworkTypesBitmapResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setAllowedNetworkTypesBitmapResponse(_arg0);
          break;
        }
        case TRANSACTION_setBandModeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setBandModeResponse(_arg0);
          break;
        }
        case TRANSACTION_setBarringPasswordResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setBarringPasswordResponse(_arg0);
          break;
        }
        case TRANSACTION_setCdmaRoamingPreferenceResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCdmaRoamingPreferenceResponse(_arg0);
          break;
        }
        case TRANSACTION_setCellInfoListRateResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCellInfoListRateResponse(_arg0);
          break;
        }
        case TRANSACTION_setIndicationFilterResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setIndicationFilterResponse(_arg0);
          break;
        }
        case TRANSACTION_setLinkCapacityReportingCriteriaResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setLinkCapacityReportingCriteriaResponse(_arg0);
          break;
        }
        case TRANSACTION_setLocationUpdatesResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setLocationUpdatesResponse(_arg0);
          break;
        }
        case TRANSACTION_setNetworkSelectionModeAutomaticResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setNetworkSelectionModeAutomaticResponse(_arg0);
          break;
        }
        case TRANSACTION_setNetworkSelectionModeManualResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setNetworkSelectionModeManualResponse(_arg0);
          break;
        }
        case TRANSACTION_setNrDualConnectivityStateResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setNrDualConnectivityStateResponse(_arg0);
          break;
        }
        case TRANSACTION_setSignalStrengthReportingCriteriaResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSignalStrengthReportingCriteriaResponse(_arg0);
          break;
        }
        case TRANSACTION_setSuppServiceNotificationsResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSuppServiceNotificationsResponse(_arg0);
          break;
        }
        case TRANSACTION_setSystemSelectionChannelsResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSystemSelectionChannelsResponse(_arg0);
          break;
        }
        case TRANSACTION_startNetworkScanResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.startNetworkScanResponse(_arg0);
          break;
        }
        case TRANSACTION_stopNetworkScanResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.stopNetworkScanResponse(_arg0);
          break;
        }
        case TRANSACTION_supplyNetworkDepersonalizationResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.supplyNetworkDepersonalizationResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setUsageSettingResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setUsageSettingResponse(_arg0);
          break;
        }
        case TRANSACTION_getUsageSettingResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.getUsageSettingResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setEmergencyModeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          android.hardware.radio.network.EmergencyRegResult _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.EmergencyRegResult.CREATOR);
          data.enforceNoDataAvail();
          this.setEmergencyModeResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_triggerEmergencyNetworkScanResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.triggerEmergencyNetworkScanResponse(_arg0);
          break;
        }
        case TRANSACTION_exitEmergencyModeResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.exitEmergencyModeResponse(_arg0);
          break;
        }
        case TRANSACTION_cancelEmergencyNetworkScanResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.cancelEmergencyNetworkScanResponse(_arg0);
          break;
        }
        case TRANSACTION_setNullCipherAndIntegrityEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setNullCipherAndIntegrityEnabledResponse(_arg0);
          break;
        }
        case TRANSACTION_isNullCipherAndIntegrityEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.isNullCipherAndIntegrityEnabledResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_isN1ModeEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.isN1ModeEnabledResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setN1ModeEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setN1ModeEnabledResponse(_arg0);
          break;
        }
        case TRANSACTION_isCellularIdentifierTransparencyEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.isCellularIdentifierTransparencyEnabledResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setCellularIdentifierTransparencyEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setCellularIdentifierTransparencyEnabledResponse(_arg0);
          break;
        }
        case TRANSACTION_setSecurityAlgorithmsUpdatedEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSecurityAlgorithmsUpdatedEnabledResponse(_arg0);
          break;
        }
        case TRANSACTION_isSecurityAlgorithmsUpdatedEnabledResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.isSecurityAlgorithmsUpdatedEnabledResponse(_arg0, _arg1);
          break;
        }
        case TRANSACTION_setSatellitePlmnResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSatellitePlmnResponse(_arg0);
          break;
        }
        case TRANSACTION_setSatelliteEnabledForCarrierResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          data.enforceNoDataAvail();
          this.setSatelliteEnabledForCarrierResponse(_arg0);
          break;
        }
        case TRANSACTION_isSatelliteEnabledForCarrierResponse:
        {
          android.hardware.radio.RadioResponseInfo _arg0;
          _arg0 = data.readTypedObject(android.hardware.radio.RadioResponseInfo.CREATOR);
          boolean _arg1;
          _arg1 = data.readBoolean();
          data.enforceNoDataAvail();
          this.isSatelliteEnabledForCarrierResponse(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.network.IRadioNetworkResponse
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
       * @param networkTypeBitmap a 32-bit bitmap of RadioAccessFamily.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:MODE_NOT_SUPPORTED
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       */
      @Override public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo info, int networkTypeBitmap) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(networkTypeBitmap);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAllowedNetworkTypesBitmapResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getAllowedNetworkTypesBitmapResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param bandModes List of RadioBandMode listing supported modes
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void getAvailableBandModesResponse(android.hardware.radio.RadioResponseInfo info, int[] bandModes) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeIntArray(bandModes);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvailableBandModesResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getAvailableBandModesResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param networkInfos List of network operator information as OperatorInfos
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:ABORTED
       *   RadioError:DEVICE_IN_USE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:CANCELLED
       *   RadioError:NO_RESOURCES
       *   RadioError:INTERNAL_ERR
       */
      @Override public void getAvailableNetworksResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.OperatorInfo[] networkInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(networkInfos, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getAvailableNetworksResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getAvailableNetworksResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param cellIdentity CellIdentity for the barring infos.
       * @param barringInfos a vector of barring info for all barring service types
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       */
      @Override public void getBarringInfoResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.CellIdentity cellIdentity, android.hardware.radio.network.BarringInfo[] barringInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(cellIdentity, 0);
          _data.writeTypedArray(barringInfos, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getBarringInfoResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getBarringInfoResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param type CdmaRoamingType
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
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void getCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo info, int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCdmaRoamingPreferenceResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCdmaRoamingPreferenceResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param cellInfo List of current cell information known to radio
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       */
      @Override public void getCellInfoListResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.CellInfo[] cellInfo) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(cellInfo, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getCellInfoListResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getCellInfoListResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param dataRegResponse Current data registration response as defined by RegStateResult
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NOT_PROVISIONED
       */
      @Override public void getDataRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RegStateResult dataRegResponse) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(dataRegResponse, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getDataRegistrationStateResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getDataRegistrationStateResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param isRegistered false = not registered, true = registered
       * @param ratFamily RadioTechnologyFamily. This value is valid only if isRegistered is true.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:INVALID_MODEM_STATE
       * 
       * @deprecated Deprecated starting from Android U.
       */
      @Override public void getImsRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, boolean isRegistered, int ratFamily) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(isRegistered);
          _data.writeInt(ratFamily);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getImsRegistrationStateResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getImsRegistrationStateResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param selection false for automatic selection, true for manual selection
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getNetworkSelectionModeResponse(android.hardware.radio.RadioResponseInfo info, boolean manual) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(manual);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getNetworkSelectionModeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getNetworkSelectionModeResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param longName is long alpha ONS or EONS or empty string if unregistered
       * @param shortName is short alpha ONS or EONS or empty string if unregistered
       * @param numeric is 5 or 6 digit numeric code (MCC + MNC) or empty string if unregistered
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getOperatorResponse(android.hardware.radio.RadioResponseInfo info, java.lang.String longName, java.lang.String shortName, java.lang.String numeric) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeString(longName);
          _data.writeString(shortName);
          _data.writeString(numeric);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getOperatorResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getOperatorResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param signalStrength Current signal strength
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       */
      @Override public void getSignalStrengthResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.SignalStrength signalStrength) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(signalStrength, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSignalStrengthResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSignalStrengthResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param specifiers List of RadioAccessSpecifiers that are scanned.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void getSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RadioAccessSpecifier[] specifiers) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedArray(specifiers, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getSystemSelectionChannelsResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getSystemSelectionChannelsResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param rat Current voice RAT
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_MEMORY
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void getVoiceRadioTechnologyResponse(android.hardware.radio.RadioResponseInfo info, int rat) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(rat);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVoiceRadioTechnologyResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getVoiceRadioTechnologyResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param voiceRegResponse Current Voice registration response as defined by RegStateResult
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       */
      @Override public void getVoiceRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RegStateResult voiceRegResponse) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(voiceRegResponse, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getVoiceRegistrationStateResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getVoiceRegistrationStateResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param isEnabled Indicates whether NR dual connectivity is enabled or not, True if enabled
       *        else false.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       */
      @Override public void isNrDualConnectivityEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(isEnabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isNrDualConnectivityEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isNrDualConnectivityEnabledResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:MODE_NOT_SUPPORTED
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       */
      @Override public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setAllowedNetworkTypesBitmapResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setAllowedNetworkTypesBitmapResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void setBandModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBandModeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setBandModeResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:SS_MODIFIED_TO_DIAL
       *   RadioError:SS_MODIFIED_TO_USSD
       *   RadioError:SS_MODIFIED_TO_SS
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_MEMORY
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:FDN_CHECK_FAILURE
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setBarringPasswordResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setBarringPasswordResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setBarringPasswordResponse is unimplemented.");
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
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void setCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCdmaRoamingPreferenceResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCdmaRoamingPreferenceResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       */
      @Override public void setCellInfoListRateResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCellInfoListRateResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCellInfoListRateResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       */
      @Override public void setIndicationFilterResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setIndicationFilterResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setIndicationFilterResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       */
      @Override public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLinkCapacityReportingCriteriaResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setLinkCapacityReportingCriteriaResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void setLocationUpdatesResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setLocationUpdatesResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setLocationUpdatesResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:ILLEGAL_SIM_OR_ME
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       * 
       * Returns RadioError:ILLEGAL_SIM_OR_ME when the failure is permanent and
       * no retries needed, such as illegal SIM or ME.
       */
      @Override public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNetworkSelectionModeAutomaticResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNetworkSelectionModeAutomaticResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:ILLEGAL_SIM_OR_ME
       *   RadioError:OPERATION_NOT_ALLOWED
       *   RadioError:INVALID_STATE
       *   RadioError:NO_MEMORY
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:MODEM_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       * 
       * Returns RadioError:ILLEGAL_SIM_OR_ME when the failure is permanent and
       * no retries needed, such as illegal SIM or ME.
       */
      @Override public void setNetworkSelectionModeManualResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNetworkSelectionModeManualResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNetworkSelectionModeManualResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_STATE
       */
      @Override public void setNrDualConnectivityStateResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNrDualConnectivityStateResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNrDualConnectivityStateResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:RADIO_NOT_AVAILABLE
       */
      @Override public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSignalStrengthReportingCriteriaResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSignalStrengthReportingCriteriaResponse is unimplemented.");
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
       *   RadioError:SIM_BUSY
       *   RadioError:NO_MEMORY
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INTERNAL_ERR
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       * 
       * @deprecated Android Telephony framework doesn't use this.
       */
      @Override public void setSuppServiceNotificationsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSuppServiceNotificationsResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSuppServiceNotificationsResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void setSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSystemSelectionChannelsResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSystemSelectionChannelsResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:DEVICE_IN_USE
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void startNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_startNetworkScanResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method startNetworkScanResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:INTERNAL_ERR
       *   RadioError:MODEM_ERR
       */
      @Override public void stopNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_stopNetworkScanResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method stopNetworkScanResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param remainingRetries Number of retries remaining, must be equal to -1 if unknown.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:PASSWORD_INCORRECT (code is invalid)
       *   RadioError:NO_MEMORY
       *   RadioError:INVALID_SIM_STATE
       *   RadioError:INTERNAL_ERR
       *   RadioError:SYSTEM_ERR
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:NO_RESOURCES
       *   RadioError:CANCELLED
       *   RadioError:SIM_ABSENT
       */
      @Override public void supplyNetworkDepersonalizationResponse(android.hardware.radio.RadioResponseInfo info, int remainingRetries) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(remainingRetries);
          boolean _status = mRemote.transact(Stub.TRANSACTION_supplyNetworkDepersonalizationResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method supplyNetworkDepersonalizationResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:INVALID_ARGUMENTS
       *   RadioError:INTERNAL_ERR
       *   RadioError:SIM_ABSENT
       */
      @Override public void setUsageSettingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setUsageSettingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setUsageSettingResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error.
       * @param usageSetting the usage setting for the current SIM.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INVALID_STATE
       *   RadioError:INTERNAL_ERR
       *   RadioError:SIM_ABSENT
       */
      @Override public void getUsageSettingResponse(android.hardware.radio.RadioResponseInfo info, int usageSetting) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeInt(usageSetting);
          boolean _status = mRemote.transact(Stub.TRANSACTION_getUsageSettingResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method getUsageSettingResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of setEmergencyMode.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * @param regState the current registration state of the modem.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void setEmergencyModeResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.EmergencyRegResult regState) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeTypedObject(regState, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setEmergencyModeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setEmergencyModeResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of triggerEmergencyNetworkScan.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:MODEM_ERR
       *   RadioError:INVALID_ARGUMENTS
       */
      @Override public void triggerEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_triggerEmergencyNetworkScanResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method triggerEmergencyNetworkScanResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of exitEmergencyMode.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:MODEM_ERR
       */
      @Override public void exitEmergencyModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_exitEmergencyModeResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method exitEmergencyModeResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of cancelEmergencyNetworkScan.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:MODEM_ERR
       */
      @Override public void cancelEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cancelEmergencyNetworkScanResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cancelEmergencyNetworkScanResponse is unimplemented.");
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
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:MODEM_ERR
       */
      @Override public void setNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setNullCipherAndIntegrityEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setNullCipherAndIntegrityEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * @param info Response info struct containing response type, serial no. and error
       * @param enabled the last known state of null ciphering and integrity algorithms
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:MODEM_ERR
       */
      @Override public void isNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(isEnabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isNullCipherAndIntegrityEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isNullCipherAndIntegrityEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of isN1ModeEnabled.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * @param isEnabled Indicates whether N1 mode is enabled or not.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:REQUEST_NOT_SUPPORTED
       */
      @Override public void isN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(isEnabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isN1ModeEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isN1ModeEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of setN1ModeEnabled.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:INVALID_STATE
       */
      @Override public void setN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setN1ModeEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setN1ModeEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of isCellularIdentifierTransparencyEnabled.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * @param isEnabled Indicates whether cellular identifier transparency is enabled or not.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:REQUEST_NOT_SUPPORTED
       */
      @Override public void isCellularIdentifierTransparencyEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(isEnabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isCellularIdentifierTransparencyEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isCellularIdentifierTransparencyEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of setCellularIdentifierTransparencyEnabled.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_STATE
       *   RadioError:REQUEST_NOT_SUPPORTED
       */
      @Override public void setCellularIdentifierTransparencyEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setCellularIdentifierTransparencyEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setCellularIdentifierTransparencyEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of setSecurityAlgorithmsUpdatedEnabled.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:INVALID_STATE
       *   RadioError:REQUEST_NOT_SUPPORTED
       */
      @Override public void setSecurityAlgorithmsUpdatedEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSecurityAlgorithmsUpdatedEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSecurityAlgorithmsUpdatedEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of isSecurityAlgorithmsUpdatedEnabled.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * @param isEnabled Indicates whether cellular ciphering transparency is enabled or not.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
       *                                    defined
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:REQUEST_NOT_SUPPORTED
       */
      @Override public void isSecurityAlgorithmsUpdatedEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(isEnabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isSecurityAlgorithmsUpdatedEnabledResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isSecurityAlgorithmsUpdatedEnabledResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of setSatellitePlmn.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:INVALID_STATE
       */
      @Override public void setSatellitePlmnResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSatellitePlmnResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSatellitePlmnResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of setSatelliteEnabledForCarrier.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:INVALID_STATE
       */
      @Override public void setSatelliteEnabledForCarrierResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_setSatelliteEnabledForCarrierResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method setSatelliteEnabledForCarrierResponse is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Response of isSatelliteEnabledForCarrier.
       * This is an optional API.
       * 
       * @param info Response info struct containing response type, serial no. and error.
       * @param isEnabled Indicates whether satellite is enabled for carrier or not.
       * 
       * Valid errors returned:
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:NONE
       *   RadioError:RADIO_NOT_AVAILABLE
       *   RadioError:INTERNAL_ERR
       *   RadioError:REQUEST_NOT_SUPPORTED
       *   RadioError:INVALID_STATE
       */
      @Override public void isSatelliteEnabledForCarrierResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeTypedObject(info, 0);
          _data.writeBoolean(isEnabled);
          boolean _status = mRemote.transact(Stub.TRANSACTION_isSatelliteEnabledForCarrierResponse, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method isSatelliteEnabledForCarrierResponse is unimplemented.");
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
    static final int TRANSACTION_getAllowedNetworkTypesBitmapResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_getAvailableBandModesResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_getAvailableNetworksResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_getBarringInfoResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_getCdmaRoamingPreferenceResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_getCellInfoListResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_getDataRegistrationStateResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_getImsRegistrationStateResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_getNetworkSelectionModeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_getOperatorResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_getSignalStrengthResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_getSystemSelectionChannelsResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_getVoiceRadioTechnologyResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_getVoiceRegistrationStateResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_isNrDualConnectivityEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_setAllowedNetworkTypesBitmapResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_setBandModeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_setBarringPasswordResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 18);
    static final int TRANSACTION_setCdmaRoamingPreferenceResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 19);
    static final int TRANSACTION_setCellInfoListRateResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 20);
    static final int TRANSACTION_setIndicationFilterResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 21);
    static final int TRANSACTION_setLinkCapacityReportingCriteriaResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 22);
    static final int TRANSACTION_setLocationUpdatesResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 23);
    static final int TRANSACTION_setNetworkSelectionModeAutomaticResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 24);
    static final int TRANSACTION_setNetworkSelectionModeManualResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 25);
    static final int TRANSACTION_setNrDualConnectivityStateResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 26);
    static final int TRANSACTION_setSignalStrengthReportingCriteriaResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 27);
    static final int TRANSACTION_setSuppServiceNotificationsResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 28);
    static final int TRANSACTION_setSystemSelectionChannelsResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 29);
    static final int TRANSACTION_startNetworkScanResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 30);
    static final int TRANSACTION_stopNetworkScanResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 31);
    static final int TRANSACTION_supplyNetworkDepersonalizationResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 32);
    static final int TRANSACTION_setUsageSettingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 33);
    static final int TRANSACTION_getUsageSettingResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 34);
    static final int TRANSACTION_setEmergencyModeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 35);
    static final int TRANSACTION_triggerEmergencyNetworkScanResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 36);
    static final int TRANSACTION_exitEmergencyModeResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 37);
    static final int TRANSACTION_cancelEmergencyNetworkScanResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 38);
    static final int TRANSACTION_setNullCipherAndIntegrityEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 39);
    static final int TRANSACTION_isNullCipherAndIntegrityEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 40);
    static final int TRANSACTION_isN1ModeEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 41);
    static final int TRANSACTION_setN1ModeEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 42);
    static final int TRANSACTION_isCellularIdentifierTransparencyEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 43);
    static final int TRANSACTION_setCellularIdentifierTransparencyEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 44);
    static final int TRANSACTION_setSecurityAlgorithmsUpdatedEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 45);
    static final int TRANSACTION_isSecurityAlgorithmsUpdatedEnabledResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 46);
    static final int TRANSACTION_setSatellitePlmnResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 47);
    static final int TRANSACTION_setSatelliteEnabledForCarrierResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 48);
    static final int TRANSACTION_isSatelliteEnabledForCarrierResponse = (android.os.IBinder.FIRST_CALL_TRANSACTION + 49);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$network$IRadioNetworkResponse".replace('$', '.');
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
   * @param networkTypeBitmap a 32-bit bitmap of RadioAccessFamily.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:MODE_NOT_SUPPORTED
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   */
  public void getAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo info, int networkTypeBitmap) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param bandModes List of RadioBandMode listing supported modes
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void getAvailableBandModesResponse(android.hardware.radio.RadioResponseInfo info, int[] bandModes) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param networkInfos List of network operator information as OperatorInfos
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:ABORTED
   *   RadioError:DEVICE_IN_USE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:CANCELLED
   *   RadioError:NO_RESOURCES
   *   RadioError:INTERNAL_ERR
   */
  public void getAvailableNetworksResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.OperatorInfo[] networkInfos) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param cellIdentity CellIdentity for the barring infos.
   * @param barringInfos a vector of barring info for all barring service types
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   */
  public void getBarringInfoResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.CellIdentity cellIdentity, android.hardware.radio.network.BarringInfo[] barringInfos) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param type CdmaRoamingType
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
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void getCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo info, int type) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param cellInfo List of current cell information known to radio
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   */
  public void getCellInfoListResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.CellInfo[] cellInfo) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param dataRegResponse Current data registration response as defined by RegStateResult
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NOT_PROVISIONED
   */
  public void getDataRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RegStateResult dataRegResponse) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param isRegistered false = not registered, true = registered
   * @param ratFamily RadioTechnologyFamily. This value is valid only if isRegistered is true.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.ims is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:INVALID_MODEM_STATE
   * 
   * @deprecated Deprecated starting from Android U.
   */
  @Deprecated
  public void getImsRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, boolean isRegistered, int ratFamily) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param selection false for automatic selection, true for manual selection
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getNetworkSelectionModeResponse(android.hardware.radio.RadioResponseInfo info, boolean manual) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param longName is long alpha ONS or EONS or empty string if unregistered
   * @param shortName is short alpha ONS or EONS or empty string if unregistered
   * @param numeric is 5 or 6 digit numeric code (MCC + MNC) or empty string if unregistered
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getOperatorResponse(android.hardware.radio.RadioResponseInfo info, java.lang.String longName, java.lang.String shortName, java.lang.String numeric) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param signalStrength Current signal strength
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   */
  public void getSignalStrengthResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.SignalStrength signalStrength) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param specifiers List of RadioAccessSpecifiers that are scanned.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   */
  public void getSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RadioAccessSpecifier[] specifiers) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param rat Current voice RAT
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_MEMORY
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void getVoiceRadioTechnologyResponse(android.hardware.radio.RadioResponseInfo info, int rat) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param voiceRegResponse Current Voice registration response as defined by RegStateResult
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   */
  public void getVoiceRegistrationStateResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.RegStateResult voiceRegResponse) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param isEnabled Indicates whether NR dual connectivity is enabled or not, True if enabled
   *        else false.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   */
  public void isNrDualConnectivityEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:MODE_NOT_SUPPORTED
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   */
  public void setAllowedNetworkTypesBitmapResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void setBandModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:SS_MODIFIED_TO_DIAL
   *   RadioError:SS_MODIFIED_TO_USSD
   *   RadioError:SS_MODIFIED_TO_SS
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_MEMORY
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:FDN_CHECK_FAILURE
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setBarringPasswordResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.cdma is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void setCdmaRoamingPreferenceResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   */
  public void setCellInfoListRateResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   */
  public void setIndicationFilterResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   */
  public void setLinkCapacityReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void setLocationUpdatesResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:ILLEGAL_SIM_OR_ME
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   * 
   * Returns RadioError:ILLEGAL_SIM_OR_ME when the failure is permanent and
   * no retries needed, such as illegal SIM or ME.
   */
  public void setNetworkSelectionModeAutomaticResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:ILLEGAL_SIM_OR_ME
   *   RadioError:OPERATION_NOT_ALLOWED
   *   RadioError:INVALID_STATE
   *   RadioError:NO_MEMORY
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:MODEM_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   * 
   * Returns RadioError:ILLEGAL_SIM_OR_ME when the failure is permanent and
   * no retries needed, such as illegal SIM or ME.
   */
  public void setNetworkSelectionModeManualResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_STATE
   */
  public void setNrDualConnectivityStateResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:RADIO_NOT_AVAILABLE
   */
  public void setSignalStrengthReportingCriteriaResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.calling is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:SIM_BUSY
   *   RadioError:NO_MEMORY
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INTERNAL_ERR
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   * 
   * @deprecated Android Telephony framework doesn't use this.
   */
  @Deprecated
  public void setSuppServiceNotificationsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_ARGUMENTS
   */
  public void setSystemSelectionChannelsResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:DEVICE_IN_USE
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   */
  public void startNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:INTERNAL_ERR
   *   RadioError:MODEM_ERR
   */
  public void stopNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param remainingRetries Number of retries remaining, must be equal to -1 if unknown.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:PASSWORD_INCORRECT (code is invalid)
   *   RadioError:NO_MEMORY
   *   RadioError:INVALID_SIM_STATE
   *   RadioError:INTERNAL_ERR
   *   RadioError:SYSTEM_ERR
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:NO_RESOURCES
   *   RadioError:CANCELLED
   *   RadioError:SIM_ABSENT
   */
  public void supplyNetworkDepersonalizationResponse(android.hardware.radio.RadioResponseInfo info, int remainingRetries) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:INVALID_ARGUMENTS
   *   RadioError:INTERNAL_ERR
   *   RadioError:SIM_ABSENT
   */
  public void setUsageSettingResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error.
   * @param usageSetting the usage setting for the current SIM.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony is not defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INVALID_STATE
   *   RadioError:INTERNAL_ERR
   *   RadioError:SIM_ABSENT
   */
  public void getUsageSettingResponse(android.hardware.radio.RadioResponseInfo info, int usageSetting) throws android.os.RemoteException;
  /**
   * Response of setEmergencyMode.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * @param regState the current registration state of the modem.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   */
  public void setEmergencyModeResponse(android.hardware.radio.RadioResponseInfo info, android.hardware.radio.network.EmergencyRegResult regState) throws android.os.RemoteException;
  /**
   * Response of triggerEmergencyNetworkScan.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:MODEM_ERR
   *   RadioError:INVALID_ARGUMENTS
   */
  public void triggerEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response of exitEmergencyMode.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:MODEM_ERR
   */
  public void exitEmergencyModeResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response of cancelEmergencyNetworkScan.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:MODEM_ERR
   */
  public void cancelEmergencyNetworkScanResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:MODEM_ERR
   */
  public void setNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * @param info Response info struct containing response type, serial no. and error
   * @param enabled the last known state of null ciphering and integrity algorithms
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:MODEM_ERR
   */
  public void isNullCipherAndIntegrityEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException;
  /**
   * Response of isN1ModeEnabled.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * @param isEnabled Indicates whether N1 mode is enabled or not.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:REQUEST_NOT_SUPPORTED
   */
  public void isN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException;
  /**
   * Response of setN1ModeEnabled.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:INVALID_STATE
   */
  public void setN1ModeEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response of isCellularIdentifierTransparencyEnabled.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * @param isEnabled Indicates whether cellular identifier transparency is enabled or not.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:REQUEST_NOT_SUPPORTED
   */
  public void isCellularIdentifierTransparencyEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException;
  /**
   * Response of setCellularIdentifierTransparencyEnabled.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_STATE
   *   RadioError:REQUEST_NOT_SUPPORTED
   */
  public void setCellularIdentifierTransparencyEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response of setSecurityAlgorithmsUpdatedEnabled.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:INVALID_STATE
   *   RadioError:REQUEST_NOT_SUPPORTED
   */
  public void setSecurityAlgorithmsUpdatedEnabledResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response of isSecurityAlgorithmsUpdatedEnabled.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * @param isEnabled Indicates whether cellular ciphering transparency is enabled or not.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED when android.hardware.telephony.radio.access is not
   *                                    defined
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:REQUEST_NOT_SUPPORTED
   */
  public void isSecurityAlgorithmsUpdatedEnabledResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException;
  /**
   * Response of setSatellitePlmn.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:INVALID_STATE
   */
  public void setSatellitePlmnResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response of setSatelliteEnabledForCarrier.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:INVALID_STATE
   */
  public void setSatelliteEnabledForCarrierResponse(android.hardware.radio.RadioResponseInfo info) throws android.os.RemoteException;
  /**
   * Response of isSatelliteEnabledForCarrier.
   * This is an optional API.
   * 
   * @param info Response info struct containing response type, serial no. and error.
   * @param isEnabled Indicates whether satellite is enabled for carrier or not.
   * 
   * Valid errors returned:
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:NONE
   *   RadioError:RADIO_NOT_AVAILABLE
   *   RadioError:INTERNAL_ERR
   *   RadioError:REQUEST_NOT_SUPPORTED
   *   RadioError:INVALID_STATE
   */
  public void isSatelliteEnabledForCarrierResponse(android.hardware.radio.RadioResponseInfo info, boolean isEnabled) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
