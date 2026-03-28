/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/IRadioNetworkIndication.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/IRadioNetworkIndication.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * Interface declaring unsolicited radio indications for network APIs.
 * @hide
 */
public interface IRadioNetworkIndication extends android.os.IInterface
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
  /** Default implementation for IRadioNetworkIndication. */
  public static class Default implements android.hardware.radio.network.IRadioNetworkIndication
  {
    /**
     * Indicate barring information for the user’s access category / access class and PLMN.
     * 
     * <p>Provide information about the barring status of the cell for the user. The information
     * provided should describe all barring configurations that are applicable to the current user,
     * even if the user is not currently barred (due to conditional barring). This informs Android
     * of likely future (statistical) barring for specific services.
     * 
     * <p>This indication should be sent whenever the cell’s barring config changes for the current
     * user, or if the user’s conditional barring status changes due to re-evaluation of the
     * barring conditions. Barring status will likely change when the device camps for service,
     * when PLMN selection is completed, when the device attempts to access a conditionally barred
     * service, and when the System Information including barring info for a camped cell is updated.
     * 
     * @param type Type of radio indication
     * @param cellIdentity cellIdentity for the barring infos
     * @param barringInfos a vector of BarringInfos for all barring service types
     */
    @Override public void barringInfoChanged(int type, android.hardware.radio.network.CellIdentity cellIdentity, android.hardware.radio.network.BarringInfo[] barringInfos) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when PRL (preferred roaming list) changes.
     * 
     * @param type Type of radio indication
     * @param version PRL version after PRL changes
     * @deprecated Legacy CDMA is unsupported.
     */
    @Override public void cdmaPrlChanged(int type, int version) throws android.os.RemoteException
    {
    }
    /**
     * Report all of the current cell information known to the radio.
     * 
     * @param type Type of radio indication
     * @param records Current cell information
     */
    @Override public void cellInfoList(int type, android.hardware.radio.network.CellInfo[] records) throws android.os.RemoteException
    {
    }
    /**
     * Indicates current link capacity estimate. This indication is sent whenever the reporting
     * criteria, as set by IRadioNetwork.setLinkCapacityReportingCriteria(), are met and the
     * indication is not suppressed by IRadioNetwork.setIndicationFilter().
     * 
     * @param type Type of radio indication
     * @param lce LinkCapacityEstimate
     */
    @Override public void currentLinkCapacityEstimate(int type, android.hardware.radio.network.LinkCapacityEstimate lce) throws android.os.RemoteException
    {
    }
    /**
     * Indicates physical channel configurations. An empty configs list shall be returned when the
     * radio is in idle mode (i.e. RRC idle).
     * 
     * @param type Type of radio indication
     * @param configs Vector of PhysicalChannelConfigs
     */
    @Override public void currentPhysicalChannelConfigs(int type, android.hardware.radio.network.PhysicalChannelConfig[] configs) throws android.os.RemoteException
    {
    }
    /**
     * Indicates current signal strength of the radio.
     * 
     * @param type Type of radio indication
     * @param signalStrength SignalStrength information
     */
    @Override public void currentSignalStrength(int type, android.hardware.radio.network.SignalStrength signalStrength) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when IMS registration state has changed. To get IMS registration state and IMS SMS
     * format, callee needs to invoke getImsRegistrationState().
     * 
     * @param type Type of radio indication
     */
    @Override public void imsNetworkStateChanged(int type) throws android.os.RemoteException
    {
    }
    /**
     * Incremental network scan results.
     * 
     * @param type Type of radio indication
     * @param result the result of the network scan
     */
    @Override public void networkScanResult(int type, android.hardware.radio.network.NetworkScanResult result) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when voice or data network state changed. Callee must invoke
     * IRadioNetwork.getVoiceRegistrationState(), IRadioNetwork.getDataRegistrationState(), and
     * IRadioNetwork.getOperator()
     * 
     * @param type Type of radio indication
     */
    @Override public void networkStateChanged(int type) throws android.os.RemoteException
    {
    }
    /**
     * Indicates when radio has received a NITZ time message.
     * 
     * @param type Type of radio indication
     * @param nitzTime NITZ time string in the form "yy/mm/dd,hh:mm:ss(+/-)tz,dt"
     * @param receivedTimeMs time (in milliseconds since boot) at which RIL sent the NITZ time to
     *        the framework
     * @param ageMs time in milliseconds indicating how long NITZ was cached in RIL and modem.
     *        This must track true age and therefore must be calculated using clocks that
     *        include the time spent in sleep / low power states. If it can not be guaranteed,
     *        there must not be any caching done at the modem and should fill in 0 for ageMs
     */
    @Override public void nitzTimeReceived(int type, java.lang.String nitzTime, long receivedTimeMs, long ageMs) throws android.os.RemoteException
    {
    }
    /**
     * Report that Registration or a Location/Routing/Tracking Area update has failed.
     * 
     * <p>Indicate whenever a registration procedure, including a location, routing, or tracking
     * area update fails. This includes procedures that do not necessarily result in a change of
     * the modem's registration status. If the modem's registration status changes, that is
     * reflected in the onNetworkStateChanged() and subsequent get{Voice/Data}RegistrationState().
     * 
     * @param cellIdentity the CellIdentity, which must include the globally unique identifier for
     *        the cell (for example, all components of the CGI or ECGI).
     * @param chosenPlmn a 5 or 6 digit alphanumeric PLMN (MCC|MNC) among those broadcast by the
     *        cell that was chosen for the failed registration attempt.
     * @param domain Domain::CS, Domain::PS, or both in case of a combined procedure.
     * @param causeCode the primary failure cause code of the procedure.
     *        For GSM/UMTS (MM), values are in TS 24.008 Sec 10.5.95
     *        For GSM/UMTS (GMM), values are in TS 24.008 Sec 10.5.147
     *        For LTE (EMM), cause codes are TS 24.301 Sec 9.9.3.9
     *        For NR (5GMM), cause codes are TS 24.501 Sec 9.11.3.2
     *        MAX_INT if this value is unused.
     * @param additionalCauseCode the cause code of any secondary/combined procedure if appropriate.
     *        For UMTS, if a combined attach succeeds for PS only, then the GMM cause code shall be
     *        included as an additionalCauseCode.
     *        For LTE (ESM), cause codes are in TS 24.301 9.9.4.4
     *        MAX_INT if this value is unused.
     */
    @Override public void registrationFailed(int type, android.hardware.radio.network.CellIdentity cellIdentity, java.lang.String chosenPlmn, int domain, int causeCode, int additionalCauseCode) throws android.os.RemoteException
    {
    }
    /**
     * Indicates a restricted state change (eg, for Domain Specific Access Control).
     * Radio must send this msg after radio off/on cycle no matter it is changed or not.
     * 
     * @param type Type of radio indication
     * @param state Bitmask of restricted state as defined by PhoneRestrictedState
     */
    @Override public void restrictedStateChanged(int type, int state) throws android.os.RemoteException
    {
    }
    /**
     * Reports supplementary service related notification from the network.
     * 
     * @param type Type of radio indication
     * @param suppSvc SuppSvcNotification
     */
    @Override public void suppSvcNotify(int type, android.hardware.radio.network.SuppSvcNotification suppSvc) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that voice technology has changed. Responds with new rat.
     * 
     * @param type Type of radio indication
     * @param rat Current new voice rat
     */
    @Override public void voiceRadioTechChanged(int type, int rat) throws android.os.RemoteException
    {
    }
    /**
     * Emergency Scan Results.
     * 
     * @param type Type of radio indication
     * @param result the result of the Emergency Network Scan
     */
    @Override public void emergencyNetworkScanResult(int type, android.hardware.radio.network.EmergencyRegResult result) throws android.os.RemoteException
    {
    }
    /**
     * Report a cellular identifier disclosure event. See
     * IRadioNetwork.setCellularIdnetifierTransparencyEnabled for more details.
     * 
     * A non-exhaustive list of when this method should be called follows:
     * 
     * - If a device attempts an IMSI attach to the network.
     * - If a device includes an IMSI in the IDENTITY_RESPONSE message on the NAS and a security
     * context has not yet been established.
     * - If a device includes an IMSI in a DETACH_REQUEST message sent on the NAS and the message is
     * sent before a security context has been established.
     * - If a device includes an IMSI in a TRACKING_AREA_UPDATE message sent on the NAS and the
     * message is sent before a security context has been established.
     * - If a device uses a 2G network to send a LOCATION_UPDATE_REQUEST message on the NAS that
     * includes an IMSI or IMEI.
     * - If a device uses a 2G network to send a AUTHENTICATION_AND_CIPHERING_RESPONSE message on
     * the NAS and the message includes an IMEISV.
     * 
     * cellularIdentifierDisclosure indications must be sent to Android regardless of the screen
     * state. If the screen is off, the indications must still be sent to Android.
     * 
     * Note: in the NRSA scenario, only a SUCI generated by a null scheme should be considered as a
     * plain-text identifier.
     * 
     * @param type Type of radio indication
     * @param disclosure A CellularIdentifierDisclosure as specified by
     *         IRadioNetwork.setCellularIdentifierTransparencyEnabled.
     */
    @Override public void cellularIdentifierDisclosed(int type, android.hardware.radio.network.CellularIdentifierDisclosure disclosure) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that a new ciphering or integrity algorithm was used for a particular voice,
     * signaling, or data connection for a given PLMN and/or access network. Due to power
     * concerns, once a ConnectionEvent has been reported on, follow-up reports about that
     * ConnectionEvent are only generated if there is any change to the most-recently reported
     * encryption or integrity, if there is a RAT change, or if the value of
     * SecurityAlgorithmUpdate#isUnprotectedEmergency changes. A change only in cell ID should not
     * trigger an update, as the design is intended to be agnostic to dual connectivity ("secondary
     * serving cells").
     * 
     * Example to further clarify "most-recently reported":
     * 1. After booting up, the UE is in ENDC with LTE. Modem reports NAS_SIGNALLING_LTE and
     *    AS_SIGNALLING_LTE are well-ciphered but AS_SIGNALLING_5G is null-ciphered.
     * 2. UE moves to 3G and enters the connected mode. Modem reports indications of PS_SERVICE_3G
     *    and SIGNALLING_3G to Android.
     * 3. UE moves to LTE. UE enters the connected mode and there is no ENDC. The algorithms of
     *    NAS_SIGNALLING_LTE and AS_SIGNALLING_LTE are the same as in Step 1. The UE should send
     *    this indication to AP as it’s a RAT switch.
     * 4. Later, UE establishes ENDC. AS_SIGNALLING_5G is null-ciphered. The UE should send this
     *    indication as well, as it is a RAT switch.
     * 5. The UE enter IDLE mode, and later connected mode in ENDC. There are no changes to security
     *    algorithms, so the modem does not need to send any updates.
     * 
     * Most recently reported state is reset when (1) RadioState is transitioned to ON from any
     * other state (e.g. radio is turned on during device boot, or modem boot), and (2) when
     * CardState is transitioned to PRESENT from any other state (e.g. when SIM is inserted), or (3)
     * if there is a change in access network (PLMN) or RAT.
     * 
     * securityAlgorithmUpdate indications must be sent to Android regardless of the screen state.
     * If the screen is off, the indications must still be sent to Android.
     * 
     * 
     * 5G TS 38.331 cipheringDisabled and integrityProtection
     * ======================================================
     * For most connections, generally what is reported by the network is what ends up being used.
     * There are two significant cases where this may not be the case. In 5G, per the introduction
     * of network configuration options cipheringDisabled and integrityProtection (TS 38.331), the
     * network can have declared certain security algorithms to be used while also requiring a null
     * algorithm via those parameters.
     * 
     * 
     * Exceptions for DRBs with null integrity (pre-5G Rel 16)
     * =======================================================
     * When reporting the SecurityAlgorithm for a ConnectionType which includes a DRB, there is an
     * exception where a DRB with null integrity is not to be considered/included in reporting
     * except for 5G Rel 16 connections and newer. Because DRBs almost always use null integrity in
     * practice, and thus if included the report would always be null, rendering the report
     * useless. For anything 5G Rel 16 or newer, accurate reporting for the DRB's integrity is
     * required.
     * 
     * 
     * NRDC MCG and SCGs
     * =================
     * In the NRDC case, there can be two sets of algorithms, one for the MCG (Master Cell Group)
     * and one for the SCG (Secondary Cell Group). In this case, always send a combined update that
     * reflects the weaker of the algorithms, e.g. (weakest) NEA0 < NEA1 < NEA2 < NEA3 (strongest).
     * This applies to both the ciphering and integrity algorithms.
     * 
     * 
     * Determining the value of isUnprotectedEmergency
     * ===============================================
     * - 2G ConnectionEvents:
     *    - For CS_SIGNALLING_GSM and PS_SIGNALLING_GPRS isUnprotectedEmergency is true if emergency
     *      mode is ongoing and the ciphering algorithm is NULL (A5/0).
     * - 3G ConnectionEvents:
     *    - For CS_SIGNALLING_3G and PS_SIGNALLING_3G isUnprotectedEmergency is true if emergency
     *      mode is ongoing and the ciphering OR integrity algorithms are NULL (UEA0 or UIA0).
     * - 4G ConnectionEvents:
     *    - For NAS_SIGNALLING_LTE, isUnprotectedEmergency is true if emergency mode is ongoing and
     *      ciphering OR integrity are NULL (EEA0 or EIA0).
     *    - For AS_SIGNALLING_LTE, isUnprotectedEmergency is true if emergency mode is ongoing and
     *      a null encryption algorithm is used (EEA0).
     *    - For VOLTE_SIP, isUnprotectedEmergency is true if (1) emergency call is over IMS PDN, AND
     *      (2) IPSec configuration is absent (SIP_NO_IPSEC_CONFIG) OR NULL encryption OR NULL
     *      integrity algorithms are in use (e.g. SIP_NULL).
     *    - For VOLTE_SIP_SOS, isUnprotectedEmergency is true if (1) emergency call is over
     *      emergency IMS PDN, AND (2) IPSec configuration is absent (SIP_NO_IPSEC_CONFIG) OR NULL
     *      encryption OR NULL integrity algorithm are in use (e.g. SIP_NULL).
     *    - For VOLTE_RTP, isUnprotectedEmergency is true if (1) emergency call is over normal PDN,
     *      and (2) SRTP is not utilized (e.g. RTP or SRTP_NULL enums) OR NULL encryption OR NULL
     *      integrity algorithms are used.
     *    - For VOLTE_RTP_SOS, isUnprotectedEmergency is true if (1) emergency call is over
     *      emergency IMS PDN, and (2) SRTP is not utilized (RTP or SRTP_NULL enums) OR NULL
     *      encryption OR NULL integrity algorithms are used.
     * - 5G ConnectionEvents:
     *    - For NAS_SIGNALLING_5G, isUnprotectedEmergency is true if emergency mode is ongoing and
     *      NULL encryption OR NULL integrity are used (e.g. NEA0 or NIA0).
     *    - For AS_SIGNALLING_5G, isUnprotectedEmergency is true if emergency mode is ongoing and
     *      a NULL encryption algorithm us used (e.g. NEA0).
     *    - For VONR_SIP, isUnprotectedEmergency is true if (1) emergency call is over normal IMS
     *      PDN, AND (2) IPSec configuration is absent OR NULL encryption or NULL integrity
     *      algorithms are used.
     *    - For VONR_SIP_SOS, isUnprotectedEmergency is true if (1) emergency call is over emergency
     *      IMS PDN, and (2) IPSec configuration is absent OR NULL encryption or NULL integrity
     *      algorithm is used.
     *    - For VONR_RTP, isUnprotectedEmergency is true if (1) emergency call is over normal IMS
     *      PDN, AND (2) SRTP is not utilized OR NULL encryption OR NULL integrity algorithm is used
     *    - For VONR_RTP_SOS, isUnprotectedEmergency is true if (1) Emergency call is over emergency
     *      IMS PDN, AND (2) SRTP is not utilized OR NULL encryption OR NULL integrity algorithm is
     *      used.
     * Notes:
     *    - On integrity: In 4G, PDCP can be LTE-based or NR-based. Starting from 5G Rel 17, only
     *      the NR-based PDCP supports DRB integrity. As the PDCP version can change during a DRB's
     *      operation, it becomes complicated when integrity is used to determine whether an
     *      emergency call is protected or not, hence its exclusion to simplify implementation.
     *    - 4G and 5G with multiple DRBs : emergency calls are protected under that RAT only if all
     *      SRBs and DRBs are protected (including IMS DRB).
     *    - 4G and 5G DRB integrity: Since DRB integrity is not enabled in most networks, if both
     *      ciphering and integrity are taken into account to determine the value of
     *      isUnprotectedEmergency, the value will mostly be false, hence why it is excluded.
     * 
     * @param type Type of radio indication
     * @param securityAlgorithmUpdate SecurityAlgorithmUpdate encapsulates details of security
     *         algorithm updates
     */
    @Override public void securityAlgorithmsUpdated(int type, android.hardware.radio.network.SecurityAlgorithmUpdate securityAlgorithmUpdate) throws android.os.RemoteException
    {
    }
    /**
     * Indicates that the modem suggests display network type has changed.
     * 
     * This unsolicited indication is sent by the modem to the framework whenever
     * it determines that the user-facing representation of the network service
     * (e.g., "5G+", "5G UW", "5G UC") should be updated.
     * 
     * The Android framework, upon receiving this indication, should evaluate the
     * new {@link DisplayNetworkType}. If the feature is enabled (e.g., via the
     * {@code KEY_USE_MODEM_DISPLAY_NETWORK_TYPE_BOOL} carrier configuration),
     * the framework should update the network indicator icon and related text in the UI
     * accordingly.
     * 
     * @param type The type of indication, which will be {@link RadioIndicationType#UNSOLICITED}
     * for this message.
     * @param dnt The new display network type category suggested by the modem.
     * @hide
     */
    @Override public void displayNetworkTypeChanged(int type, int dnt) throws android.os.RemoteException
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
  public static abstract class Stub extends android.os.Binder implements android.hardware.radio.network.IRadioNetworkIndication
  {
    /** Construct the stub and attach it to the interface. */
    @SuppressWarnings("this-escape")
    public Stub()
    {
      this.markVintfStability();
      this.attachInterface(this, DESCRIPTOR);
    }
    /**
     * Cast an IBinder object into an android.hardware.radio.network.IRadioNetworkIndication interface,
     * generating a proxy if needed.
     */
    public static android.hardware.radio.network.IRadioNetworkIndication asInterface(android.os.IBinder obj)
    {
      if ((obj==null)) {
        return null;
      }
      android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
      if (((iin!=null)&&(iin instanceof android.hardware.radio.network.IRadioNetworkIndication))) {
        return ((android.hardware.radio.network.IRadioNetworkIndication)iin);
      }
      return new android.hardware.radio.network.IRadioNetworkIndication.Stub.Proxy(obj);
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
        case TRANSACTION_barringInfoChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.CellIdentity _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.CellIdentity.CREATOR);
          android.hardware.radio.network.BarringInfo[] _arg2;
          _arg2 = data.createTypedArray(android.hardware.radio.network.BarringInfo.CREATOR);
          data.enforceNoDataAvail();
          this.barringInfoChanged(_arg0, _arg1, _arg2);
          break;
        }
        case TRANSACTION_cdmaPrlChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.cdmaPrlChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_cellInfoList:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.CellInfo[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.network.CellInfo.CREATOR);
          data.enforceNoDataAvail();
          this.cellInfoList(_arg0, _arg1);
          break;
        }
        case TRANSACTION_currentLinkCapacityEstimate:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.LinkCapacityEstimate _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.LinkCapacityEstimate.CREATOR);
          data.enforceNoDataAvail();
          this.currentLinkCapacityEstimate(_arg0, _arg1);
          break;
        }
        case TRANSACTION_currentPhysicalChannelConfigs:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.PhysicalChannelConfig[] _arg1;
          _arg1 = data.createTypedArray(android.hardware.radio.network.PhysicalChannelConfig.CREATOR);
          data.enforceNoDataAvail();
          this.currentPhysicalChannelConfigs(_arg0, _arg1);
          break;
        }
        case TRANSACTION_currentSignalStrength:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.SignalStrength _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.SignalStrength.CREATOR);
          data.enforceNoDataAvail();
          this.currentSignalStrength(_arg0, _arg1);
          break;
        }
        case TRANSACTION_imsNetworkStateChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.imsNetworkStateChanged(_arg0);
          break;
        }
        case TRANSACTION_networkScanResult:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.NetworkScanResult _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.NetworkScanResult.CREATOR);
          data.enforceNoDataAvail();
          this.networkScanResult(_arg0, _arg1);
          break;
        }
        case TRANSACTION_networkStateChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          data.enforceNoDataAvail();
          this.networkStateChanged(_arg0);
          break;
        }
        case TRANSACTION_nitzTimeReceived:
        {
          int _arg0;
          _arg0 = data.readInt();
          java.lang.String _arg1;
          _arg1 = data.readString();
          long _arg2;
          _arg2 = data.readLong();
          long _arg3;
          _arg3 = data.readLong();
          data.enforceNoDataAvail();
          this.nitzTimeReceived(_arg0, _arg1, _arg2, _arg3);
          break;
        }
        case TRANSACTION_registrationFailed:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.CellIdentity _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.CellIdentity.CREATOR);
          java.lang.String _arg2;
          _arg2 = data.readString();
          int _arg3;
          _arg3 = data.readInt();
          int _arg4;
          _arg4 = data.readInt();
          int _arg5;
          _arg5 = data.readInt();
          data.enforceNoDataAvail();
          this.registrationFailed(_arg0, _arg1, _arg2, _arg3, _arg4, _arg5);
          break;
        }
        case TRANSACTION_restrictedStateChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.restrictedStateChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_suppSvcNotify:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.SuppSvcNotification _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.SuppSvcNotification.CREATOR);
          data.enforceNoDataAvail();
          this.suppSvcNotify(_arg0, _arg1);
          break;
        }
        case TRANSACTION_voiceRadioTechChanged:
        {
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.voiceRadioTechChanged(_arg0, _arg1);
          break;
        }
        case TRANSACTION_emergencyNetworkScanResult:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.EmergencyRegResult _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.EmergencyRegResult.CREATOR);
          data.enforceNoDataAvail();
          this.emergencyNetworkScanResult(_arg0, _arg1);
          break;
        }
        case TRANSACTION_cellularIdentifierDisclosed:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.CellularIdentifierDisclosure _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.CellularIdentifierDisclosure.CREATOR);
          data.enforceNoDataAvail();
          this.cellularIdentifierDisclosed(_arg0, _arg1);
          break;
        }
        case TRANSACTION_securityAlgorithmsUpdated:
        {
          int _arg0;
          _arg0 = data.readInt();
          android.hardware.radio.network.SecurityAlgorithmUpdate _arg1;
          _arg1 = data.readTypedObject(android.hardware.radio.network.SecurityAlgorithmUpdate.CREATOR);
          data.enforceNoDataAvail();
          this.securityAlgorithmsUpdated(_arg0, _arg1);
          break;
        }
        case TRANSACTION_displayNetworkTypeChanged:
        {
          if (true) {
            throw new android.os.RemoteException("Method displayNetworkTypeChanged is unimplemented.");
          }
          int _arg0;
          _arg0 = data.readInt();
          int _arg1;
          _arg1 = data.readInt();
          data.enforceNoDataAvail();
          this.displayNetworkTypeChanged(_arg0, _arg1);
          break;
        }
        default:
        {
          return super.onTransact(code, data, reply, flags);
        }
      }
      return true;
    }
    private static class Proxy implements android.hardware.radio.network.IRadioNetworkIndication
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
       * Indicate barring information for the user’s access category / access class and PLMN.
       * 
       * <p>Provide information about the barring status of the cell for the user. The information
       * provided should describe all barring configurations that are applicable to the current user,
       * even if the user is not currently barred (due to conditional barring). This informs Android
       * of likely future (statistical) barring for specific services.
       * 
       * <p>This indication should be sent whenever the cell’s barring config changes for the current
       * user, or if the user’s conditional barring status changes due to re-evaluation of the
       * barring conditions. Barring status will likely change when the device camps for service,
       * when PLMN selection is completed, when the device attempts to access a conditionally barred
       * service, and when the System Information including barring info for a camped cell is updated.
       * 
       * @param type Type of radio indication
       * @param cellIdentity cellIdentity for the barring infos
       * @param barringInfos a vector of BarringInfos for all barring service types
       */
      @Override public void barringInfoChanged(int type, android.hardware.radio.network.CellIdentity cellIdentity, android.hardware.radio.network.BarringInfo[] barringInfos) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(cellIdentity, 0);
          _data.writeTypedArray(barringInfos, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_barringInfoChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method barringInfoChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when PRL (preferred roaming list) changes.
       * 
       * @param type Type of radio indication
       * @param version PRL version after PRL changes
       * @deprecated Legacy CDMA is unsupported.
       */
      @Override public void cdmaPrlChanged(int type, int version) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(version);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cdmaPrlChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cdmaPrlChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Report all of the current cell information known to the radio.
       * 
       * @param type Type of radio indication
       * @param records Current cell information
       */
      @Override public void cellInfoList(int type, android.hardware.radio.network.CellInfo[] records) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedArray(records, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cellInfoList, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cellInfoList is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates current link capacity estimate. This indication is sent whenever the reporting
       * criteria, as set by IRadioNetwork.setLinkCapacityReportingCriteria(), are met and the
       * indication is not suppressed by IRadioNetwork.setIndicationFilter().
       * 
       * @param type Type of radio indication
       * @param lce LinkCapacityEstimate
       */
      @Override public void currentLinkCapacityEstimate(int type, android.hardware.radio.network.LinkCapacityEstimate lce) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(lce, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_currentLinkCapacityEstimate, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method currentLinkCapacityEstimate is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates physical channel configurations. An empty configs list shall be returned when the
       * radio is in idle mode (i.e. RRC idle).
       * 
       * @param type Type of radio indication
       * @param configs Vector of PhysicalChannelConfigs
       */
      @Override public void currentPhysicalChannelConfigs(int type, android.hardware.radio.network.PhysicalChannelConfig[] configs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedArray(configs, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_currentPhysicalChannelConfigs, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method currentPhysicalChannelConfigs is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates current signal strength of the radio.
       * 
       * @param type Type of radio indication
       * @param signalStrength SignalStrength information
       */
      @Override public void currentSignalStrength(int type, android.hardware.radio.network.SignalStrength signalStrength) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(signalStrength, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_currentSignalStrength, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method currentSignalStrength is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when IMS registration state has changed. To get IMS registration state and IMS SMS
       * format, callee needs to invoke getImsRegistrationState().
       * 
       * @param type Type of radio indication
       */
      @Override public void imsNetworkStateChanged(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_imsNetworkStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method imsNetworkStateChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Incremental network scan results.
       * 
       * @param type Type of radio indication
       * @param result the result of the network scan
       */
      @Override public void networkScanResult(int type, android.hardware.radio.network.NetworkScanResult result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(result, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_networkScanResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method networkScanResult is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when voice or data network state changed. Callee must invoke
       * IRadioNetwork.getVoiceRegistrationState(), IRadioNetwork.getDataRegistrationState(), and
       * IRadioNetwork.getOperator()
       * 
       * @param type Type of radio indication
       */
      @Override public void networkStateChanged(int type) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          boolean _status = mRemote.transact(Stub.TRANSACTION_networkStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method networkStateChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates when radio has received a NITZ time message.
       * 
       * @param type Type of radio indication
       * @param nitzTime NITZ time string in the form "yy/mm/dd,hh:mm:ss(+/-)tz,dt"
       * @param receivedTimeMs time (in milliseconds since boot) at which RIL sent the NITZ time to
       *        the framework
       * @param ageMs time in milliseconds indicating how long NITZ was cached in RIL and modem.
       *        This must track true age and therefore must be calculated using clocks that
       *        include the time spent in sleep / low power states. If it can not be guaranteed,
       *        there must not be any caching done at the modem and should fill in 0 for ageMs
       */
      @Override public void nitzTimeReceived(int type, java.lang.String nitzTime, long receivedTimeMs, long ageMs) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeString(nitzTime);
          _data.writeLong(receivedTimeMs);
          _data.writeLong(ageMs);
          boolean _status = mRemote.transact(Stub.TRANSACTION_nitzTimeReceived, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method nitzTimeReceived is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Report that Registration or a Location/Routing/Tracking Area update has failed.
       * 
       * <p>Indicate whenever a registration procedure, including a location, routing, or tracking
       * area update fails. This includes procedures that do not necessarily result in a change of
       * the modem's registration status. If the modem's registration status changes, that is
       * reflected in the onNetworkStateChanged() and subsequent get{Voice/Data}RegistrationState().
       * 
       * @param cellIdentity the CellIdentity, which must include the globally unique identifier for
       *        the cell (for example, all components of the CGI or ECGI).
       * @param chosenPlmn a 5 or 6 digit alphanumeric PLMN (MCC|MNC) among those broadcast by the
       *        cell that was chosen for the failed registration attempt.
       * @param domain Domain::CS, Domain::PS, or both in case of a combined procedure.
       * @param causeCode the primary failure cause code of the procedure.
       *        For GSM/UMTS (MM), values are in TS 24.008 Sec 10.5.95
       *        For GSM/UMTS (GMM), values are in TS 24.008 Sec 10.5.147
       *        For LTE (EMM), cause codes are TS 24.301 Sec 9.9.3.9
       *        For NR (5GMM), cause codes are TS 24.501 Sec 9.11.3.2
       *        MAX_INT if this value is unused.
       * @param additionalCauseCode the cause code of any secondary/combined procedure if appropriate.
       *        For UMTS, if a combined attach succeeds for PS only, then the GMM cause code shall be
       *        included as an additionalCauseCode.
       *        For LTE (ESM), cause codes are in TS 24.301 9.9.4.4
       *        MAX_INT if this value is unused.
       */
      @Override public void registrationFailed(int type, android.hardware.radio.network.CellIdentity cellIdentity, java.lang.String chosenPlmn, int domain, int causeCode, int additionalCauseCode) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(cellIdentity, 0);
          _data.writeString(chosenPlmn);
          _data.writeInt(domain);
          _data.writeInt(causeCode);
          _data.writeInt(additionalCauseCode);
          boolean _status = mRemote.transact(Stub.TRANSACTION_registrationFailed, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method registrationFailed is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates a restricted state change (eg, for Domain Specific Access Control).
       * Radio must send this msg after radio off/on cycle no matter it is changed or not.
       * 
       * @param type Type of radio indication
       * @param state Bitmask of restricted state as defined by PhoneRestrictedState
       */
      @Override public void restrictedStateChanged(int type, int state) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(state);
          boolean _status = mRemote.transact(Stub.TRANSACTION_restrictedStateChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method restrictedStateChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Reports supplementary service related notification from the network.
       * 
       * @param type Type of radio indication
       * @param suppSvc SuppSvcNotification
       */
      @Override public void suppSvcNotify(int type, android.hardware.radio.network.SuppSvcNotification suppSvc) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(suppSvc, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_suppSvcNotify, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method suppSvcNotify is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that voice technology has changed. Responds with new rat.
       * 
       * @param type Type of radio indication
       * @param rat Current new voice rat
       */
      @Override public void voiceRadioTechChanged(int type, int rat) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(rat);
          boolean _status = mRemote.transact(Stub.TRANSACTION_voiceRadioTechChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method voiceRadioTechChanged is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Emergency Scan Results.
       * 
       * @param type Type of radio indication
       * @param result the result of the Emergency Network Scan
       */
      @Override public void emergencyNetworkScanResult(int type, android.hardware.radio.network.EmergencyRegResult result) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(result, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_emergencyNetworkScanResult, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method emergencyNetworkScanResult is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Report a cellular identifier disclosure event. See
       * IRadioNetwork.setCellularIdnetifierTransparencyEnabled for more details.
       * 
       * A non-exhaustive list of when this method should be called follows:
       * 
       * - If a device attempts an IMSI attach to the network.
       * - If a device includes an IMSI in the IDENTITY_RESPONSE message on the NAS and a security
       * context has not yet been established.
       * - If a device includes an IMSI in a DETACH_REQUEST message sent on the NAS and the message is
       * sent before a security context has been established.
       * - If a device includes an IMSI in a TRACKING_AREA_UPDATE message sent on the NAS and the
       * message is sent before a security context has been established.
       * - If a device uses a 2G network to send a LOCATION_UPDATE_REQUEST message on the NAS that
       * includes an IMSI or IMEI.
       * - If a device uses a 2G network to send a AUTHENTICATION_AND_CIPHERING_RESPONSE message on
       * the NAS and the message includes an IMEISV.
       * 
       * cellularIdentifierDisclosure indications must be sent to Android regardless of the screen
       * state. If the screen is off, the indications must still be sent to Android.
       * 
       * Note: in the NRSA scenario, only a SUCI generated by a null scheme should be considered as a
       * plain-text identifier.
       * 
       * @param type Type of radio indication
       * @param disclosure A CellularIdentifierDisclosure as specified by
       *         IRadioNetwork.setCellularIdentifierTransparencyEnabled.
       */
      @Override public void cellularIdentifierDisclosed(int type, android.hardware.radio.network.CellularIdentifierDisclosure disclosure) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(disclosure, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_cellularIdentifierDisclosed, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method cellularIdentifierDisclosed is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that a new ciphering or integrity algorithm was used for a particular voice,
       * signaling, or data connection for a given PLMN and/or access network. Due to power
       * concerns, once a ConnectionEvent has been reported on, follow-up reports about that
       * ConnectionEvent are only generated if there is any change to the most-recently reported
       * encryption or integrity, if there is a RAT change, or if the value of
       * SecurityAlgorithmUpdate#isUnprotectedEmergency changes. A change only in cell ID should not
       * trigger an update, as the design is intended to be agnostic to dual connectivity ("secondary
       * serving cells").
       * 
       * Example to further clarify "most-recently reported":
       * 1. After booting up, the UE is in ENDC with LTE. Modem reports NAS_SIGNALLING_LTE and
       *    AS_SIGNALLING_LTE are well-ciphered but AS_SIGNALLING_5G is null-ciphered.
       * 2. UE moves to 3G and enters the connected mode. Modem reports indications of PS_SERVICE_3G
       *    and SIGNALLING_3G to Android.
       * 3. UE moves to LTE. UE enters the connected mode and there is no ENDC. The algorithms of
       *    NAS_SIGNALLING_LTE and AS_SIGNALLING_LTE are the same as in Step 1. The UE should send
       *    this indication to AP as it’s a RAT switch.
       * 4. Later, UE establishes ENDC. AS_SIGNALLING_5G is null-ciphered. The UE should send this
       *    indication as well, as it is a RAT switch.
       * 5. The UE enter IDLE mode, and later connected mode in ENDC. There are no changes to security
       *    algorithms, so the modem does not need to send any updates.
       * 
       * Most recently reported state is reset when (1) RadioState is transitioned to ON from any
       * other state (e.g. radio is turned on during device boot, or modem boot), and (2) when
       * CardState is transitioned to PRESENT from any other state (e.g. when SIM is inserted), or (3)
       * if there is a change in access network (PLMN) or RAT.
       * 
       * securityAlgorithmUpdate indications must be sent to Android regardless of the screen state.
       * If the screen is off, the indications must still be sent to Android.
       * 
       * 
       * 5G TS 38.331 cipheringDisabled and integrityProtection
       * ======================================================
       * For most connections, generally what is reported by the network is what ends up being used.
       * There are two significant cases where this may not be the case. In 5G, per the introduction
       * of network configuration options cipheringDisabled and integrityProtection (TS 38.331), the
       * network can have declared certain security algorithms to be used while also requiring a null
       * algorithm via those parameters.
       * 
       * 
       * Exceptions for DRBs with null integrity (pre-5G Rel 16)
       * =======================================================
       * When reporting the SecurityAlgorithm for a ConnectionType which includes a DRB, there is an
       * exception where a DRB with null integrity is not to be considered/included in reporting
       * except for 5G Rel 16 connections and newer. Because DRBs almost always use null integrity in
       * practice, and thus if included the report would always be null, rendering the report
       * useless. For anything 5G Rel 16 or newer, accurate reporting for the DRB's integrity is
       * required.
       * 
       * 
       * NRDC MCG and SCGs
       * =================
       * In the NRDC case, there can be two sets of algorithms, one for the MCG (Master Cell Group)
       * and one for the SCG (Secondary Cell Group). In this case, always send a combined update that
       * reflects the weaker of the algorithms, e.g. (weakest) NEA0 < NEA1 < NEA2 < NEA3 (strongest).
       * This applies to both the ciphering and integrity algorithms.
       * 
       * 
       * Determining the value of isUnprotectedEmergency
       * ===============================================
       * - 2G ConnectionEvents:
       *    - For CS_SIGNALLING_GSM and PS_SIGNALLING_GPRS isUnprotectedEmergency is true if emergency
       *      mode is ongoing and the ciphering algorithm is NULL (A5/0).
       * - 3G ConnectionEvents:
       *    - For CS_SIGNALLING_3G and PS_SIGNALLING_3G isUnprotectedEmergency is true if emergency
       *      mode is ongoing and the ciphering OR integrity algorithms are NULL (UEA0 or UIA0).
       * - 4G ConnectionEvents:
       *    - For NAS_SIGNALLING_LTE, isUnprotectedEmergency is true if emergency mode is ongoing and
       *      ciphering OR integrity are NULL (EEA0 or EIA0).
       *    - For AS_SIGNALLING_LTE, isUnprotectedEmergency is true if emergency mode is ongoing and
       *      a null encryption algorithm is used (EEA0).
       *    - For VOLTE_SIP, isUnprotectedEmergency is true if (1) emergency call is over IMS PDN, AND
       *      (2) IPSec configuration is absent (SIP_NO_IPSEC_CONFIG) OR NULL encryption OR NULL
       *      integrity algorithms are in use (e.g. SIP_NULL).
       *    - For VOLTE_SIP_SOS, isUnprotectedEmergency is true if (1) emergency call is over
       *      emergency IMS PDN, AND (2) IPSec configuration is absent (SIP_NO_IPSEC_CONFIG) OR NULL
       *      encryption OR NULL integrity algorithm are in use (e.g. SIP_NULL).
       *    - For VOLTE_RTP, isUnprotectedEmergency is true if (1) emergency call is over normal PDN,
       *      and (2) SRTP is not utilized (e.g. RTP or SRTP_NULL enums) OR NULL encryption OR NULL
       *      integrity algorithms are used.
       *    - For VOLTE_RTP_SOS, isUnprotectedEmergency is true if (1) emergency call is over
       *      emergency IMS PDN, and (2) SRTP is not utilized (RTP or SRTP_NULL enums) OR NULL
       *      encryption OR NULL integrity algorithms are used.
       * - 5G ConnectionEvents:
       *    - For NAS_SIGNALLING_5G, isUnprotectedEmergency is true if emergency mode is ongoing and
       *      NULL encryption OR NULL integrity are used (e.g. NEA0 or NIA0).
       *    - For AS_SIGNALLING_5G, isUnprotectedEmergency is true if emergency mode is ongoing and
       *      a NULL encryption algorithm us used (e.g. NEA0).
       *    - For VONR_SIP, isUnprotectedEmergency is true if (1) emergency call is over normal IMS
       *      PDN, AND (2) IPSec configuration is absent OR NULL encryption or NULL integrity
       *      algorithms are used.
       *    - For VONR_SIP_SOS, isUnprotectedEmergency is true if (1) emergency call is over emergency
       *      IMS PDN, and (2) IPSec configuration is absent OR NULL encryption or NULL integrity
       *      algorithm is used.
       *    - For VONR_RTP, isUnprotectedEmergency is true if (1) emergency call is over normal IMS
       *      PDN, AND (2) SRTP is not utilized OR NULL encryption OR NULL integrity algorithm is used
       *    - For VONR_RTP_SOS, isUnprotectedEmergency is true if (1) Emergency call is over emergency
       *      IMS PDN, AND (2) SRTP is not utilized OR NULL encryption OR NULL integrity algorithm is
       *      used.
       * Notes:
       *    - On integrity: In 4G, PDCP can be LTE-based or NR-based. Starting from 5G Rel 17, only
       *      the NR-based PDCP supports DRB integrity. As the PDCP version can change during a DRB's
       *      operation, it becomes complicated when integrity is used to determine whether an
       *      emergency call is protected or not, hence its exclusion to simplify implementation.
       *    - 4G and 5G with multiple DRBs : emergency calls are protected under that RAT only if all
       *      SRBs and DRBs are protected (including IMS DRB).
       *    - 4G and 5G DRB integrity: Since DRB integrity is not enabled in most networks, if both
       *      ciphering and integrity are taken into account to determine the value of
       *      isUnprotectedEmergency, the value will mostly be false, hence why it is excluded.
       * 
       * @param type Type of radio indication
       * @param securityAlgorithmUpdate SecurityAlgorithmUpdate encapsulates details of security
       *         algorithm updates
       */
      @Override public void securityAlgorithmsUpdated(int type, android.hardware.radio.network.SecurityAlgorithmUpdate securityAlgorithmUpdate) throws android.os.RemoteException
      {
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeTypedObject(securityAlgorithmUpdate, 0);
          boolean _status = mRemote.transact(Stub.TRANSACTION_securityAlgorithmsUpdated, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method securityAlgorithmsUpdated is unimplemented.");
          }
        }
        finally {
          _data.recycle();
        }
      }
      /**
       * Indicates that the modem suggests display network type has changed.
       * 
       * This unsolicited indication is sent by the modem to the framework whenever
       * it determines that the user-facing representation of the network service
       * (e.g., "5G+", "5G UW", "5G UC") should be updated.
       * 
       * The Android framework, upon receiving this indication, should evaluate the
       * new {@link DisplayNetworkType}. If the feature is enabled (e.g., via the
       * {@code KEY_USE_MODEM_DISPLAY_NETWORK_TYPE_BOOL} carrier configuration),
       * the framework should update the network indicator icon and related text in the UI
       * accordingly.
       * 
       * @param type The type of indication, which will be {@link RadioIndicationType#UNSOLICITED}
       * for this message.
       * @param dnt The new display network type category suggested by the modem.
       * @hide
       */
      @Override public void displayNetworkTypeChanged(int type, int dnt) throws android.os.RemoteException
      {
        if (true) {
          throw new android.os.RemoteException("Method displayNetworkTypeChanged is unimplemented.");
        }
        android.os.Parcel _data = android.os.Parcel.obtain(asBinder());
        try {
          _data.writeInterfaceToken(DESCRIPTOR);
          _data.writeInt(type);
          _data.writeInt(dnt);
          boolean _status = mRemote.transact(Stub.TRANSACTION_displayNetworkTypeChanged, _data, null, android.os.IBinder.FLAG_ONEWAY);
          if (!_status) {
            throw new android.os.RemoteException("Method displayNetworkTypeChanged is unimplemented.");
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
    static final int TRANSACTION_barringInfoChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
    static final int TRANSACTION_cdmaPrlChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
    static final int TRANSACTION_cellInfoList = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
    static final int TRANSACTION_currentLinkCapacityEstimate = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
    static final int TRANSACTION_currentPhysicalChannelConfigs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
    static final int TRANSACTION_currentSignalStrength = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
    static final int TRANSACTION_imsNetworkStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
    static final int TRANSACTION_networkScanResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
    static final int TRANSACTION_networkStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
    static final int TRANSACTION_nitzTimeReceived = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
    static final int TRANSACTION_registrationFailed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
    static final int TRANSACTION_restrictedStateChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
    static final int TRANSACTION_suppSvcNotify = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
    static final int TRANSACTION_voiceRadioTechChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
    static final int TRANSACTION_emergencyNetworkScanResult = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
    static final int TRANSACTION_cellularIdentifierDisclosed = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
    static final int TRANSACTION_securityAlgorithmsUpdated = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
    static final int TRANSACTION_displayNetworkTypeChanged = (android.os.IBinder.FIRST_CALL_TRANSACTION + 17);
    static final int TRANSACTION_getInterfaceVersion = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777214);
    static final int TRANSACTION_getInterfaceHash = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16777213);
  }
  /** @hide */
  public static final java.lang.String DESCRIPTOR = "android$hardware$radio$network$IRadioNetworkIndication".replace('$', '.');
  /**
   * Indicate barring information for the user’s access category / access class and PLMN.
   * 
   * <p>Provide information about the barring status of the cell for the user. The information
   * provided should describe all barring configurations that are applicable to the current user,
   * even if the user is not currently barred (due to conditional barring). This informs Android
   * of likely future (statistical) barring for specific services.
   * 
   * <p>This indication should be sent whenever the cell’s barring config changes for the current
   * user, or if the user’s conditional barring status changes due to re-evaluation of the
   * barring conditions. Barring status will likely change when the device camps for service,
   * when PLMN selection is completed, when the device attempts to access a conditionally barred
   * service, and when the System Information including barring info for a camped cell is updated.
   * 
   * @param type Type of radio indication
   * @param cellIdentity cellIdentity for the barring infos
   * @param barringInfos a vector of BarringInfos for all barring service types
   */
  public void barringInfoChanged(int type, android.hardware.radio.network.CellIdentity cellIdentity, android.hardware.radio.network.BarringInfo[] barringInfos) throws android.os.RemoteException;
  /**
   * Indicates when PRL (preferred roaming list) changes.
   * 
   * @param type Type of radio indication
   * @param version PRL version after PRL changes
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public void cdmaPrlChanged(int type, int version) throws android.os.RemoteException;
  /**
   * Report all of the current cell information known to the radio.
   * 
   * @param type Type of radio indication
   * @param records Current cell information
   */
  public void cellInfoList(int type, android.hardware.radio.network.CellInfo[] records) throws android.os.RemoteException;
  /**
   * Indicates current link capacity estimate. This indication is sent whenever the reporting
   * criteria, as set by IRadioNetwork.setLinkCapacityReportingCriteria(), are met and the
   * indication is not suppressed by IRadioNetwork.setIndicationFilter().
   * 
   * @param type Type of radio indication
   * @param lce LinkCapacityEstimate
   */
  public void currentLinkCapacityEstimate(int type, android.hardware.radio.network.LinkCapacityEstimate lce) throws android.os.RemoteException;
  /**
   * Indicates physical channel configurations. An empty configs list shall be returned when the
   * radio is in idle mode (i.e. RRC idle).
   * 
   * @param type Type of radio indication
   * @param configs Vector of PhysicalChannelConfigs
   */
  public void currentPhysicalChannelConfigs(int type, android.hardware.radio.network.PhysicalChannelConfig[] configs) throws android.os.RemoteException;
  /**
   * Indicates current signal strength of the radio.
   * 
   * @param type Type of radio indication
   * @param signalStrength SignalStrength information
   */
  public void currentSignalStrength(int type, android.hardware.radio.network.SignalStrength signalStrength) throws android.os.RemoteException;
  /**
   * Indicates when IMS registration state has changed. To get IMS registration state and IMS SMS
   * format, callee needs to invoke getImsRegistrationState().
   * 
   * @param type Type of radio indication
   */
  public void imsNetworkStateChanged(int type) throws android.os.RemoteException;
  /**
   * Incremental network scan results.
   * 
   * @param type Type of radio indication
   * @param result the result of the network scan
   */
  public void networkScanResult(int type, android.hardware.radio.network.NetworkScanResult result) throws android.os.RemoteException;
  /**
   * Indicates when voice or data network state changed. Callee must invoke
   * IRadioNetwork.getVoiceRegistrationState(), IRadioNetwork.getDataRegistrationState(), and
   * IRadioNetwork.getOperator()
   * 
   * @param type Type of radio indication
   */
  public void networkStateChanged(int type) throws android.os.RemoteException;
  /**
   * Indicates when radio has received a NITZ time message.
   * 
   * @param type Type of radio indication
   * @param nitzTime NITZ time string in the form "yy/mm/dd,hh:mm:ss(+/-)tz,dt"
   * @param receivedTimeMs time (in milliseconds since boot) at which RIL sent the NITZ time to
   *        the framework
   * @param ageMs time in milliseconds indicating how long NITZ was cached in RIL and modem.
   *        This must track true age and therefore must be calculated using clocks that
   *        include the time spent in sleep / low power states. If it can not be guaranteed,
   *        there must not be any caching done at the modem and should fill in 0 for ageMs
   */
  public void nitzTimeReceived(int type, java.lang.String nitzTime, long receivedTimeMs, long ageMs) throws android.os.RemoteException;
  /**
   * Report that Registration or a Location/Routing/Tracking Area update has failed.
   * 
   * <p>Indicate whenever a registration procedure, including a location, routing, or tracking
   * area update fails. This includes procedures that do not necessarily result in a change of
   * the modem's registration status. If the modem's registration status changes, that is
   * reflected in the onNetworkStateChanged() and subsequent get{Voice/Data}RegistrationState().
   * 
   * @param cellIdentity the CellIdentity, which must include the globally unique identifier for
   *        the cell (for example, all components of the CGI or ECGI).
   * @param chosenPlmn a 5 or 6 digit alphanumeric PLMN (MCC|MNC) among those broadcast by the
   *        cell that was chosen for the failed registration attempt.
   * @param domain Domain::CS, Domain::PS, or both in case of a combined procedure.
   * @param causeCode the primary failure cause code of the procedure.
   *        For GSM/UMTS (MM), values are in TS 24.008 Sec 10.5.95
   *        For GSM/UMTS (GMM), values are in TS 24.008 Sec 10.5.147
   *        For LTE (EMM), cause codes are TS 24.301 Sec 9.9.3.9
   *        For NR (5GMM), cause codes are TS 24.501 Sec 9.11.3.2
   *        MAX_INT if this value is unused.
   * @param additionalCauseCode the cause code of any secondary/combined procedure if appropriate.
   *        For UMTS, if a combined attach succeeds for PS only, then the GMM cause code shall be
   *        included as an additionalCauseCode.
   *        For LTE (ESM), cause codes are in TS 24.301 9.9.4.4
   *        MAX_INT if this value is unused.
   */
  public void registrationFailed(int type, android.hardware.radio.network.CellIdentity cellIdentity, java.lang.String chosenPlmn, int domain, int causeCode, int additionalCauseCode) throws android.os.RemoteException;
  /**
   * Indicates a restricted state change (eg, for Domain Specific Access Control).
   * Radio must send this msg after radio off/on cycle no matter it is changed or not.
   * 
   * @param type Type of radio indication
   * @param state Bitmask of restricted state as defined by PhoneRestrictedState
   */
  public void restrictedStateChanged(int type, int state) throws android.os.RemoteException;
  /**
   * Reports supplementary service related notification from the network.
   * 
   * @param type Type of radio indication
   * @param suppSvc SuppSvcNotification
   */
  public void suppSvcNotify(int type, android.hardware.radio.network.SuppSvcNotification suppSvc) throws android.os.RemoteException;
  /**
   * Indicates that voice technology has changed. Responds with new rat.
   * 
   * @param type Type of radio indication
   * @param rat Current new voice rat
   */
  public void voiceRadioTechChanged(int type, int rat) throws android.os.RemoteException;
  /**
   * Emergency Scan Results.
   * 
   * @param type Type of radio indication
   * @param result the result of the Emergency Network Scan
   */
  public void emergencyNetworkScanResult(int type, android.hardware.radio.network.EmergencyRegResult result) throws android.os.RemoteException;
  /**
   * Report a cellular identifier disclosure event. See
   * IRadioNetwork.setCellularIdnetifierTransparencyEnabled for more details.
   * 
   * A non-exhaustive list of when this method should be called follows:
   * 
   * - If a device attempts an IMSI attach to the network.
   * - If a device includes an IMSI in the IDENTITY_RESPONSE message on the NAS and a security
   * context has not yet been established.
   * - If a device includes an IMSI in a DETACH_REQUEST message sent on the NAS and the message is
   * sent before a security context has been established.
   * - If a device includes an IMSI in a TRACKING_AREA_UPDATE message sent on the NAS and the
   * message is sent before a security context has been established.
   * - If a device uses a 2G network to send a LOCATION_UPDATE_REQUEST message on the NAS that
   * includes an IMSI or IMEI.
   * - If a device uses a 2G network to send a AUTHENTICATION_AND_CIPHERING_RESPONSE message on
   * the NAS and the message includes an IMEISV.
   * 
   * cellularIdentifierDisclosure indications must be sent to Android regardless of the screen
   * state. If the screen is off, the indications must still be sent to Android.
   * 
   * Note: in the NRSA scenario, only a SUCI generated by a null scheme should be considered as a
   * plain-text identifier.
   * 
   * @param type Type of radio indication
   * @param disclosure A CellularIdentifierDisclosure as specified by
   *         IRadioNetwork.setCellularIdentifierTransparencyEnabled.
   */
  public void cellularIdentifierDisclosed(int type, android.hardware.radio.network.CellularIdentifierDisclosure disclosure) throws android.os.RemoteException;
  /**
   * Indicates that a new ciphering or integrity algorithm was used for a particular voice,
   * signaling, or data connection for a given PLMN and/or access network. Due to power
   * concerns, once a ConnectionEvent has been reported on, follow-up reports about that
   * ConnectionEvent are only generated if there is any change to the most-recently reported
   * encryption or integrity, if there is a RAT change, or if the value of
   * SecurityAlgorithmUpdate#isUnprotectedEmergency changes. A change only in cell ID should not
   * trigger an update, as the design is intended to be agnostic to dual connectivity ("secondary
   * serving cells").
   * 
   * Example to further clarify "most-recently reported":
   * 1. After booting up, the UE is in ENDC with LTE. Modem reports NAS_SIGNALLING_LTE and
   *    AS_SIGNALLING_LTE are well-ciphered but AS_SIGNALLING_5G is null-ciphered.
   * 2. UE moves to 3G and enters the connected mode. Modem reports indications of PS_SERVICE_3G
   *    and SIGNALLING_3G to Android.
   * 3. UE moves to LTE. UE enters the connected mode and there is no ENDC. The algorithms of
   *    NAS_SIGNALLING_LTE and AS_SIGNALLING_LTE are the same as in Step 1. The UE should send
   *    this indication to AP as it’s a RAT switch.
   * 4. Later, UE establishes ENDC. AS_SIGNALLING_5G is null-ciphered. The UE should send this
   *    indication as well, as it is a RAT switch.
   * 5. The UE enter IDLE mode, and later connected mode in ENDC. There are no changes to security
   *    algorithms, so the modem does not need to send any updates.
   * 
   * Most recently reported state is reset when (1) RadioState is transitioned to ON from any
   * other state (e.g. radio is turned on during device boot, or modem boot), and (2) when
   * CardState is transitioned to PRESENT from any other state (e.g. when SIM is inserted), or (3)
   * if there is a change in access network (PLMN) or RAT.
   * 
   * securityAlgorithmUpdate indications must be sent to Android regardless of the screen state.
   * If the screen is off, the indications must still be sent to Android.
   * 
   * 
   * 5G TS 38.331 cipheringDisabled and integrityProtection
   * ======================================================
   * For most connections, generally what is reported by the network is what ends up being used.
   * There are two significant cases where this may not be the case. In 5G, per the introduction
   * of network configuration options cipheringDisabled and integrityProtection (TS 38.331), the
   * network can have declared certain security algorithms to be used while also requiring a null
   * algorithm via those parameters.
   * 
   * 
   * Exceptions for DRBs with null integrity (pre-5G Rel 16)
   * =======================================================
   * When reporting the SecurityAlgorithm for a ConnectionType which includes a DRB, there is an
   * exception where a DRB with null integrity is not to be considered/included in reporting
   * except for 5G Rel 16 connections and newer. Because DRBs almost always use null integrity in
   * practice, and thus if included the report would always be null, rendering the report
   * useless. For anything 5G Rel 16 or newer, accurate reporting for the DRB's integrity is
   * required.
   * 
   * 
   * NRDC MCG and SCGs
   * =================
   * In the NRDC case, there can be two sets of algorithms, one for the MCG (Master Cell Group)
   * and one for the SCG (Secondary Cell Group). In this case, always send a combined update that
   * reflects the weaker of the algorithms, e.g. (weakest) NEA0 < NEA1 < NEA2 < NEA3 (strongest).
   * This applies to both the ciphering and integrity algorithms.
   * 
   * 
   * Determining the value of isUnprotectedEmergency
   * ===============================================
   * - 2G ConnectionEvents:
   *    - For CS_SIGNALLING_GSM and PS_SIGNALLING_GPRS isUnprotectedEmergency is true if emergency
   *      mode is ongoing and the ciphering algorithm is NULL (A5/0).
   * - 3G ConnectionEvents:
   *    - For CS_SIGNALLING_3G and PS_SIGNALLING_3G isUnprotectedEmergency is true if emergency
   *      mode is ongoing and the ciphering OR integrity algorithms are NULL (UEA0 or UIA0).
   * - 4G ConnectionEvents:
   *    - For NAS_SIGNALLING_LTE, isUnprotectedEmergency is true if emergency mode is ongoing and
   *      ciphering OR integrity are NULL (EEA0 or EIA0).
   *    - For AS_SIGNALLING_LTE, isUnprotectedEmergency is true if emergency mode is ongoing and
   *      a null encryption algorithm is used (EEA0).
   *    - For VOLTE_SIP, isUnprotectedEmergency is true if (1) emergency call is over IMS PDN, AND
   *      (2) IPSec configuration is absent (SIP_NO_IPSEC_CONFIG) OR NULL encryption OR NULL
   *      integrity algorithms are in use (e.g. SIP_NULL).
   *    - For VOLTE_SIP_SOS, isUnprotectedEmergency is true if (1) emergency call is over
   *      emergency IMS PDN, AND (2) IPSec configuration is absent (SIP_NO_IPSEC_CONFIG) OR NULL
   *      encryption OR NULL integrity algorithm are in use (e.g. SIP_NULL).
   *    - For VOLTE_RTP, isUnprotectedEmergency is true if (1) emergency call is over normal PDN,
   *      and (2) SRTP is not utilized (e.g. RTP or SRTP_NULL enums) OR NULL encryption OR NULL
   *      integrity algorithms are used.
   *    - For VOLTE_RTP_SOS, isUnprotectedEmergency is true if (1) emergency call is over
   *      emergency IMS PDN, and (2) SRTP is not utilized (RTP or SRTP_NULL enums) OR NULL
   *      encryption OR NULL integrity algorithms are used.
   * - 5G ConnectionEvents:
   *    - For NAS_SIGNALLING_5G, isUnprotectedEmergency is true if emergency mode is ongoing and
   *      NULL encryption OR NULL integrity are used (e.g. NEA0 or NIA0).
   *    - For AS_SIGNALLING_5G, isUnprotectedEmergency is true if emergency mode is ongoing and
   *      a NULL encryption algorithm us used (e.g. NEA0).
   *    - For VONR_SIP, isUnprotectedEmergency is true if (1) emergency call is over normal IMS
   *      PDN, AND (2) IPSec configuration is absent OR NULL encryption or NULL integrity
   *      algorithms are used.
   *    - For VONR_SIP_SOS, isUnprotectedEmergency is true if (1) emergency call is over emergency
   *      IMS PDN, and (2) IPSec configuration is absent OR NULL encryption or NULL integrity
   *      algorithm is used.
   *    - For VONR_RTP, isUnprotectedEmergency is true if (1) emergency call is over normal IMS
   *      PDN, AND (2) SRTP is not utilized OR NULL encryption OR NULL integrity algorithm is used
   *    - For VONR_RTP_SOS, isUnprotectedEmergency is true if (1) Emergency call is over emergency
   *      IMS PDN, AND (2) SRTP is not utilized OR NULL encryption OR NULL integrity algorithm is
   *      used.
   * Notes:
   *    - On integrity: In 4G, PDCP can be LTE-based or NR-based. Starting from 5G Rel 17, only
   *      the NR-based PDCP supports DRB integrity. As the PDCP version can change during a DRB's
   *      operation, it becomes complicated when integrity is used to determine whether an
   *      emergency call is protected or not, hence its exclusion to simplify implementation.
   *    - 4G and 5G with multiple DRBs : emergency calls are protected under that RAT only if all
   *      SRBs and DRBs are protected (including IMS DRB).
   *    - 4G and 5G DRB integrity: Since DRB integrity is not enabled in most networks, if both
   *      ciphering and integrity are taken into account to determine the value of
   *      isUnprotectedEmergency, the value will mostly be false, hence why it is excluded.
   * 
   * @param type Type of radio indication
   * @param securityAlgorithmUpdate SecurityAlgorithmUpdate encapsulates details of security
   *         algorithm updates
   */
  public void securityAlgorithmsUpdated(int type, android.hardware.radio.network.SecurityAlgorithmUpdate securityAlgorithmUpdate) throws android.os.RemoteException;
  /**
   * Indicates that the modem suggests display network type has changed.
   * 
   * This unsolicited indication is sent by the modem to the framework whenever
   * it determines that the user-facing representation of the network service
   * (e.g., "5G+", "5G UW", "5G UC") should be updated.
   * 
   * The Android framework, upon receiving this indication, should evaluate the
   * new {@link DisplayNetworkType}. If the feature is enabled (e.g., via the
   * {@code KEY_USE_MODEM_DISPLAY_NETWORK_TYPE_BOOL} carrier configuration),
   * the framework should update the network indicator icon and related text in the UI
   * accordingly.
   * 
   * @param type The type of indication, which will be {@link RadioIndicationType#UNSOLICITED}
   * for this message.
   * @param dnt The new display network type category suggested by the modem.
   * @hide
   */
  public void displayNetworkTypeChanged(int type, int dnt) throws android.os.RemoteException;
  public int getInterfaceVersion() throws android.os.RemoteException;
  public String getInterfaceHash() throws android.os.RemoteException;
}
