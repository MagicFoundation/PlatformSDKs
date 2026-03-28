/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/DataCallFailCause.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/DataCallFailCause.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/** @hide */
public @interface DataCallFailCause {
  /**
   * An integer cause code defined in TS 24.008 section 6.1.3.1.3 or TS 24.301 Release 8+ Annex B.
   * If the implementation does not have access to the exact cause codes, then it must return one
   * of the following values, as the UI layer needs to distinguish these cases for error
   * notification and potential retries.
   */
  public static final int NONE = 0;
  /** No retry */
  public static final int OPERATOR_BARRED = 8;
  /** PDP_FAIL_LLC_SNDCP = 0x19 */
  public static final int NAS_SIGNALLING = 14;
  public static final int INSUFFICIENT_RESOURCES = 26;
  /** No retry */
  public static final int MISSING_UNKNOWN_APN = 27;
  /** No retry */
  public static final int UNKNOWN_PDP_ADDRESS_TYPE = 28;
  /** No retry */
  public static final int USER_AUTHENTICATION = 29;
  /** No retry */
  public static final int ACTIVATION_REJECT_GGSN = 30;
  public static final int ACTIVATION_REJECT_UNSPECIFIED = 31;
  /** No retry */
  public static final int SERVICE_OPTION_NOT_SUPPORTED = 32;
  /** No retry */
  public static final int SERVICE_OPTION_NOT_SUBSCRIBED = 33;
  public static final int SERVICE_OPTION_OUT_OF_ORDER = 34;
  /** No retry */
  public static final int NSAPI_IN_USE = 35;
  /** Possibly restart radio, based on framework config */
  public static final int REGULAR_DEACTIVATION = 36;
  public static final int QOS_NOT_ACCEPTED = 37;
  public static final int NETWORK_FAILURE = 38;
  public static final int UMTS_REACTIVATION_REQ = 39;
  public static final int FEATURE_NOT_SUPP = 40;
  public static final int TFT_SEMANTIC_ERROR = 41;
  public static final int TFT_SYTAX_ERROR = 42;
  public static final int UNKNOWN_PDP_CONTEXT = 43;
  public static final int FILTER_SEMANTIC_ERROR = 44;
  public static final int FILTER_SYTAX_ERROR = 45;
  public static final int PDP_WITHOUT_ACTIVE_TFT = 46;
  /** No retry */
  public static final int ONLY_IPV4_ALLOWED = 50;
  /** No retry */
  public static final int ONLY_IPV6_ALLOWED = 51;
  public static final int ONLY_SINGLE_BEARER_ALLOWED = 52;
  public static final int ESM_INFO_NOT_RECEIVED = 53;
  public static final int PDN_CONN_DOES_NOT_EXIST = 54;
  public static final int MULTI_CONN_TO_SAME_PDN_NOT_ALLOWED = 55;
  public static final int MAX_ACTIVE_PDP_CONTEXT_REACHED = 65;
  public static final int UNSUPPORTED_APN_IN_CURRENT_PLMN = 66;
  public static final int INVALID_TRANSACTION_ID = 81;
  public static final int MESSAGE_INCORRECT_SEMANTIC = 95;
  public static final int INVALID_MANDATORY_INFO = 96;
  public static final int MESSAGE_TYPE_UNSUPPORTED = 97;
  public static final int MSG_TYPE_NONCOMPATIBLE_STATE = 98;
  public static final int UNKNOWN_INFO_ELEMENT = 99;
  public static final int CONDITIONAL_IE_ERROR = 100;
  public static final int MSG_AND_PROTOCOL_STATE_UNCOMPATIBLE = 101;
  /** No retry */
  public static final int PROTOCOL_ERRORS = 111;
  public static final int APN_TYPE_CONFLICT = 112;
  public static final int INVALID_PCSCF_ADDR = 113;
  public static final int INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN = 114;
  public static final int EMM_ACCESS_BARRED = 115;
  public static final int EMERGENCY_IFACE_ONLY = 116;
  public static final int IFACE_MISMATCH = 117;
  public static final int COMPANION_IFACE_IN_USE = 118;
  public static final int IP_ADDRESS_MISMATCH = 119;
  public static final int IFACE_AND_POL_FAMILY_MISMATCH = 120;
  public static final int EMM_ACCESS_BARRED_INFINITE_RETRY = 121;
  public static final int AUTH_FAILURE_ON_EMERGENCY_CALL = 122;
  public static final int OEM_DCFAILCAUSE_1 = 4097;
  public static final int OEM_DCFAILCAUSE_2 = 4098;
  public static final int OEM_DCFAILCAUSE_3 = 4099;
  public static final int OEM_DCFAILCAUSE_4 = 4100;
  public static final int OEM_DCFAILCAUSE_5 = 4101;
  public static final int OEM_DCFAILCAUSE_6 = 4102;
  public static final int OEM_DCFAILCAUSE_7 = 4103;
  public static final int OEM_DCFAILCAUSE_8 = 4104;
  public static final int OEM_DCFAILCAUSE_9 = 4105;
  public static final int OEM_DCFAILCAUSE_10 = 4106;
  public static final int OEM_DCFAILCAUSE_11 = 4107;
  public static final int OEM_DCFAILCAUSE_12 = 4108;
  public static final int OEM_DCFAILCAUSE_13 = 4109;
  public static final int OEM_DCFAILCAUSE_14 = 4110;
  public static final int OEM_DCFAILCAUSE_15 = 4111;
  /** Not mentioned in the specification */
  public static final int VOICE_REGISTRATION_FAIL = -1;
  /** Not mentioned in the specification */
  public static final int DATA_REGISTRATION_FAIL = -2;
  /** Network/modem disconnect */
  public static final int SIGNAL_LOST = -3;
  /** Preferred technology has changed, must retry with parameters appropriate for new technology */
  public static final int PREF_RADIO_TECH_CHANGED = -4;
  /** Data call was disconnected because radio was resetting, powered off - no retry */
  public static final int RADIO_POWER_OFF = -5;
  /**
   * Data call was disconnected by modem because tethered mode was up on same APN/data profile
   * No retry until tethered call is off
   */
  public static final int TETHERED_CALL_ACTIVE = -6;
  public static final int ERROR_UNSPECIFIED = 65535;
  /**
   * Network cannot provide the requested service and PDP context is deactivated because of LLC
   * or SNDCP failure.
   */
  public static final int LLC_SNDCP = 25;
  /**
   * UE requested to modify QoS parameters or the bearer control mode, which is not compatible
   * with the selected bearer control mode.
   */
  public static final int ACTIVATION_REJECTED_BCM_VIOLATION = 48;
  /**
   * Network has already initiated the activation, modification, or deactivation of bearer
   * resources that were requested by the UE.
   */
  public static final int COLLISION_WITH_NETWORK_INITIATED_REQUEST = 56;
  /**
   * Network supports IPv4v6 PDP type only. Non-IP type is not allowed. In LTE mode of operation,
   * this is a PDN throttling cause code, meaning the UE may throttle further requests to the
   * same APN.
   */
  public static final int ONLY_IPV4V6_ALLOWED = 57;
  /**
   * Network supports non-IP PDP type only. IPv4, IPv6 and IPv4v6 are not allowed. In LTE mode of
   * operation, this is a PDN throttling cause code, meaning the UE can throttle further requests
   * to the same APN.
   */
  public static final int ONLY_NON_IP_ALLOWED = 58;
  /** QCI (QoS Class Identifier) indicated in the UE request cannot be supported. */
  public static final int UNSUPPORTED_QCI_VALUE = 59;
  /** Procedure requested by the UE was rejected because the bearer handling is not supported. */
  public static final int BEARER_HANDLING_NOT_SUPPORTED = 60;
  /** Not receiving a DNS address that was mandatory. */
  public static final int INVALID_DNS_ADDR = 123;
  /** Not receiving either a PCSCF or a DNS address, one of them being mandatory. */
  public static final int INVALID_PCSCF_OR_DNS_ADDRESS = 124;
  /** Emergency call bring up on a different ePDG. */
  public static final int CALL_PREEMPT_BY_EMERGENCY_APN = 127;
  /** UE performs a detach or disconnect PDN action based on TE requirements. */
  public static final int UE_INITIATED_DETACH_OR_DISCONNECT = 128;
  /** Reason unspecified for foreign agent rejected MIP (Mobile IP) registration. */
  public static final int MIP_FA_REASON_UNSPECIFIED = 2000;
  /** Foreign agent administratively prohibited MIP (Mobile IP) registration. */
  public static final int MIP_FA_ADMIN_PROHIBITED = 2001;
  /** Foreign agent rejected MIP (Mobile IP) registration because of insufficient resources. */
  public static final int MIP_FA_INSUFFICIENT_RESOURCES = 2002;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of MN-AAA authenticator was
   * wrong.
   */
  public static final int MIP_FA_MOBILE_NODE_AUTHENTICATION_FAILURE = 2003;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of home agent authentication
   * failure.
   */
  public static final int MIP_FA_HOME_AGENT_AUTHENTICATION_FAILURE = 2004;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of requested lifetime was too
   * long.
   */
  public static final int MIP_FA_REQUESTED_LIFETIME_TOO_LONG = 2005;
  /** Foreign agent rejected MIP (Mobile IP) registration because of malformed request. */
  public static final int MIP_FA_MALFORMED_REQUEST = 2006;
  /** Foreign agent rejected MIP (Mobile IP) registration because of malformed reply. */
  public static final int MIP_FA_MALFORMED_REPLY = 2007;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of requested encapsulation was
   * unavailable.
   */
  public static final int MIP_FA_ENCAPSULATION_UNAVAILABLE = 2008;
  /** Foreign agent rejected MIP (Mobile IP) registration of VJ Header Compression was unavailable. */
  public static final int MIP_FA_VJ_HEADER_COMPRESSION_UNAVAILABLE = 2009;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of reverse tunnel was
   * unavailable.
   */
  public static final int MIP_FA_REVERSE_TUNNEL_UNAVAILABLE = 2010;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of reverse tunnel was mandatory
   * but not requested by device.
   */
  public static final int MIP_FA_REVERSE_TUNNEL_IS_MANDATORY = 2011;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of delivery style was not
   * supported.
   */
  public static final int MIP_FA_DELIVERY_STYLE_NOT_SUPPORTED = 2012;
  /**
   * Foreign agent rejected MIP (Mobile IP) registration because of missing NAI (Network Access
   * Identifier).
   */
  public static final int MIP_FA_MISSING_NAI = 2013;
  /** Foreign agent rejected MIP (Mobile IP) registration because of missing Home Agent. */
  public static final int MIP_FA_MISSING_HOME_AGENT = 2014;
  /** Foreign agent rejected MIP (Mobile IP) registration because of missing Home Address. */
  public static final int MIP_FA_MISSING_HOME_ADDRESS = 2015;
  /** Foreign agent rejected MIP (Mobile IP) registration because of unknown challenge. */
  public static final int MIP_FA_UNKNOWN_CHALLENGE = 2016;
  /** Foreign agent rejected MIP (Mobile IP) registration because of missing challenge. */
  public static final int MIP_FA_MISSING_CHALLENGE = 2017;
  /** Foreign agent rejected MIP (Mobile IP) registration because of stale challenge. */
  public static final int MIP_FA_STALE_CHALLENGE = 2018;
  /** Reason unspecified for home agent rejected MIP (Mobile IP) registration. */
  public static final int MIP_HA_REASON_UNSPECIFIED = 2019;
  /** Home agent administratively prohibited MIP (Mobile IP) registration. */
  public static final int MIP_HA_ADMIN_PROHIBITED = 2020;
  /** Home agent rejected MIP (Mobile IP) registration because of insufficient resources. */
  public static final int MIP_HA_INSUFFICIENT_RESOURCES = 2021;
  /** Home agent rejected MIP (Mobile IP) registration because of MN-HA authenticator was wrong. */
  public static final int MIP_HA_MOBILE_NODE_AUTHENTICATION_FAILURE = 2022;
  /**
   * Home agent rejected MIP (Mobile IP) registration because of foreign agent authentication
   * failure.
   */
  public static final int MIP_HA_FOREIGN_AGENT_AUTHENTICATION_FAILURE = 2023;
  /** Home agent rejected MIP (Mobile IP) registration because of registration id mismatch. */
  public static final int MIP_HA_REGISTRATION_ID_MISMATCH = 2024;
  /** Home agent rejected MIP (Mobile IP) registration because of malformed request. */
  public static final int MIP_HA_MALFORMED_REQUEST = 2025;
  /** Home agent rejected MIP (Mobile IP) registration because of unknown home agent address. */
  public static final int MIP_HA_UNKNOWN_HOME_AGENT_ADDRESS = 2026;
  /** Home agent rejected MIP (Mobile IP) registration because of reverse tunnel was unavailable. */
  public static final int MIP_HA_REVERSE_TUNNEL_UNAVAILABLE = 2027;
  /**
   * Home agent rejected MIP (Mobile IP) registration because of reverse tunnel is mandatory but
   * not requested by device.
   */
  public static final int MIP_HA_REVERSE_TUNNEL_IS_MANDATORY = 2028;
  /** Home agent rejected MIP (Mobile IP) registration because of encapsulation unavailable. */
  public static final int MIP_HA_ENCAPSULATION_UNAVAILABLE = 2029;
  /** Tearing down is in progress. */
  public static final int CLOSE_IN_PROGRESS = 2030;
  /** Brought down by the network. */
  public static final int NETWORK_INITIATED_TERMINATION = 2031;
  /** Another application in modem preempts the data call. */
  public static final int MODEM_APP_PREEMPTED = 2032;
  /**
   * IPV4 PDN is in throttled state due to network providing only IPV6 address during the previous
   * VSNCP bringup (subs_limited_to_v6).
   */
  public static final int PDN_IPV4_CALL_DISALLOWED = 2033;
  /** IPV4 PDN is in throttled state due to previous VSNCP bringup failure(s). */
  public static final int PDN_IPV4_CALL_THROTTLED = 2034;
  /**
   * IPV6 PDN is in throttled state due to network providing only IPV4 address during the previous
   * VSNCP bringup (subs_limited_to_v4).
   */
  public static final int PDN_IPV6_CALL_DISALLOWED = 2035;
  /** IPV6 PDN is in throttled state due to previous VSNCP bringup failure(s). */
  public static final int PDN_IPV6_CALL_THROTTLED = 2036;
  /** Modem restart. */
  public static final int MODEM_RESTART = 2037;
  /** PDP PPP calls are not supported. */
  public static final int PDP_PPP_NOT_SUPPORTED = 2038;
  /** RAT on which the data call is attempted/connected is no longer the preferred RAT. */
  public static final int UNPREFERRED_RAT = 2039;
  /** Physical link is in the process of cleanup. */
  public static final int PHYSICAL_LINK_CLOSE_IN_PROGRESS = 2040;
  /** Interface bring up is attempted for an APN that is yet to be handed over to target RAT. */
  public static final int APN_PENDING_HANDOVER = 2041;
  /** APN bearer type in the profile does not match preferred network mode. */
  public static final int PROFILE_BEARER_INCOMPATIBLE = 2042;
  /** Card was refreshed or removed. */
  public static final int SIM_CARD_CHANGED = 2043;
  /** Device is going into lower power mode or powering down. */
  public static final int LOW_POWER_MODE_OR_POWERING_DOWN = 2044;
  /** APN has been disabled. */
  public static final int APN_DISABLED = 2045;
  /** Maximum PPP inactivity timer expired. */
  public static final int MAX_PPP_INACTIVITY_TIMER_EXPIRED = 2046;
  /** IPv6 address transfer failed. */
  public static final int IPV6_ADDRESS_TRANSFER_FAILED = 2047;
  /** Target RAT swap failed. */
  public static final int TRAT_SWAP_FAILED = 2048;
  /**
   * Device falls back from eHRPD to HRPD.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EHRPD_TO_HRPD_FALLBACK = 2049;
  /**
   * UE is in MIP-only configuration but the MIP configuration fails on call bring up due to
   * incorrect provisioning.
   */
  public static final int MIP_CONFIG_FAILURE = 2050;
  /** PDN inactivity timer expired due to no data transmission in a configurable duration of time. */
  public static final int PDN_INACTIVITY_TIMER_EXPIRED = 2051;
  /**
   * IPv4 data call bring up is rejected because the UE already maintains the allotted maximum
   * number of IPv4 data connections.
   */
  public static final int MAX_IPV4_CONNECTIONS = 2052;
  /**
   * IPv6 data call bring up is rejected because the UE already maintains the allotted maximum
   * number of IPv6 data connections.
   */
  public static final int MAX_IPV6_CONNECTIONS = 2053;
  /**
   * New PDN bring up is rejected during interface selection because the UE has already allotted
   * the available interfaces for other PDNs.
   */
  public static final int APN_MISMATCH = 2054;
  /**
   * New call bring up is rejected since the existing data call IP type doesn't match the
   * requested IP.
   */
  public static final int IP_VERSION_MISMATCH = 2055;
  /** Dial up networking (DUN) call bring up is rejected since UE is in eHRPD RAT. */
  public static final int DUN_CALL_DISALLOWED = 2056;
  /** Rejected/Brought down since UE is transition between EPC and NONEPC RAT. */
  public static final int INTERNAL_EPC_NONEPC_TRANSITION = 2057;
  /** The current interface is being in use. */
  public static final int INTERFACE_IN_USE = 2058;
  /** PDN connection to the APN is disallowed on the roaming network. */
  public static final int APN_DISALLOWED_ON_ROAMING = 2059;
  /** APN-related parameters are changed. */
  public static final int APN_PARAMETERS_CHANGED = 2060;
  /** PDN is attempted to be brought up with NULL APN but NULL APN is not supported. */
  public static final int NULL_APN_DISALLOWED = 2061;
  /**
   * Thermal level increases and causes calls to be torn down when normal mode of operation is
   * not allowed.
   */
  public static final int THERMAL_MITIGATION = 2062;
  /**
   * PDN Connection to a given APN is disallowed because data is disabled from the device user
   * interface settings.
   */
  public static final int DATA_SETTINGS_DISABLED = 2063;
  /**
   * PDN Connection to a given APN is disallowed because data roaming is disabled from the device
   * user interface settings and the UE is roaming.
   */
  public static final int DATA_ROAMING_SETTINGS_DISABLED = 2064;
  /** DDS (Default data subscription) switch occurs. */
  public static final int DDS_SWITCHED = 2065;
  /** PDN being brought up with an APN that is part of forbidden APN Name list. */
  public static final int FORBIDDEN_APN_NAME = 2066;
  /** Default data subscription switch is in progress. */
  public static final int DDS_SWITCH_IN_PROGRESS = 2067;
  /** Roaming is disallowed during call bring up. */
  public static final int CALL_DISALLOWED_IN_ROAMING = 2068;
  /** UE is unable to bring up a non-IP data call because the device is not camped on a NB1 cell. */
  public static final int NON_IP_NOT_SUPPORTED = 2069;
  /** Non-IP PDN is in throttled state due to previous VSNCP bringup failure(s). */
  public static final int PDN_NON_IP_CALL_THROTTLED = 2070;
  /** Non-IP PDN is in disallowed state due to the network providing only an IP address. */
  public static final int PDN_NON_IP_CALL_DISALLOWED = 2071;
  /**
   * Device in CDMA locked state.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA_LOCK = 2072;
  /**
   * Received an intercept order from the base station.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA_INTERCEPT = 2073;
  /**
   * Receiving a reorder from the base station.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA_REORDER = 2074;
  /**
   * Receiving a release from the base station with a SO (Service Option) Reject reason.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA_RELEASE_DUE_TO_SO_REJECTION = 2075;
  /**
   * Receiving an incoming call from the base station.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA_INCOMING_CALL = 2076;
  /**
   * Received an alert stop from the base station due to incoming only.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA_ALERT_STOP = 2077;
  /**
   * Channel acquisition failures. This indicates that device has failed acquiring all the
   * channels in the PRL.
   */
  public static final int CHANNEL_ACQUISITION_FAILURE = 2078;
  /** Maximum access probes transmitted. */
  public static final int MAX_ACCESS_PROBE = 2079;
  /** Concurrent service is not supported by base station. */
  public static final int CONCURRENT_SERVICE_NOT_SUPPORTED_BY_BASE_STATION = 2080;
  /** There was no response received from the base station. */
  public static final int NO_RESPONSE_FROM_BASE_STATION = 2081;
  /** The base station rejecting the call. */
  public static final int REJECTED_BY_BASE_STATION = 2082;
  /** The concurrent services requested were not compatible. */
  public static final int CONCURRENT_SERVICES_INCOMPATIBLE = 2083;
  /**
   * Device does not have CDMA service.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int NO_CDMA_SERVICE = 2084;
  /** RUIM not being present. */
  public static final int RUIM_NOT_PRESENT = 2085;
  /**
   * Receiving a retry order from the base station.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA_RETRY_ORDER = 2086;
  /** Access blocked by the base station. */
  public static final int ACCESS_BLOCK = 2087;
  /** Access blocked by the base station for all mobile devices. */
  public static final int ACCESS_BLOCK_ALL = 2088;
  /** Maximum access probes for the IS-707B call. */
  public static final int IS707B_MAX_ACCESS_PROBES = 2089;
  /** Put device in thermal emergency. */
  public static final int THERMAL_EMERGENCY = 2090;
  /** In favor of a voice call or SMS when concurrent voice and data are not supported. */
  public static final int CONCURRENT_SERVICES_NOT_ALLOWED = 2091;
  /** The other clients rejected incoming call. */
  public static final int INCOMING_CALL_REJECTED = 2092;
  /** No service on the gateway. */
  public static final int NO_SERVICE_ON_GATEWAY = 2093;
  /** GPRS context is not available. */
  public static final int NO_GPRS_CONTEXT = 2094;
  /**
   * Network refuses service to the MS because either an identity of the MS is not acceptable to
   * the network or the MS does not pass the authentication check.
   */
  public static final int ILLEGAL_MS = 2095;
  /** ME could not be authenticated and the ME used is not acceptable to the network. */
  public static final int ILLEGAL_ME = 2096;
  /** Not allowed to operate either GPRS or non-GPRS services. */
  public static final int GPRS_SERVICES_AND_NON_GPRS_SERVICES_NOT_ALLOWED = 2097;
  /** MS is not allowed to operate GPRS services. */
  public static final int GPRS_SERVICES_NOT_ALLOWED = 2098;
  /** No matching identity or context could be found in the network. */
  public static final int MS_IDENTITY_CANNOT_BE_DERIVED_BY_THE_NETWORK = 2099;
  /**
   * Mobile reachable timer has expired, or the GMM context data related to the subscription does
   * not exist in the SGSN.
   */
  public static final int IMPLICITLY_DETACHED = 2100;
  /**
   * UE requests GPRS service, or the network initiates a detach request in a PLMN which does not
   * offer roaming for GPRS services to that MS.
   */
  public static final int PLMN_NOT_ALLOWED = 2101;
  /**
   * MS requests service, or the network initiates a detach request, in a location area where the
   * HPLMN determines that the MS, by subscription, is not allowed to operate.
   */
  public static final int LOCATION_AREA_NOT_ALLOWED = 2102;
  /**
   * UE requests GPRS service or the network initiates a detach request in a PLMN that does not
   * offer roaming for GPRS services.
   */
  public static final int GPRS_SERVICES_NOT_ALLOWED_IN_THIS_PLMN = 2103;
  /** PDP context already exists. */
  public static final int PDP_DUPLICATE = 2104;
  /** RAT change on the UE. */
  public static final int UE_RAT_CHANGE = 2105;
  /** Network cannot serve a request from the MS due to congestion. */
  public static final int CONGESTION = 2106;
  /**
   * MS requests an establishment of the radio access bearers for all active PDP contexts by
   * sending a service request message indicating data to the network, but the SGSN does not have
   * any active PDP context.
   */
  public static final int NO_PDP_CONTEXT_ACTIVATED = 2107;
  /** Access class blocking restrictions for the current camped cell. */
  public static final int ACCESS_CLASS_DSAC_REJECTION = 2108;
  /** SM attempts PDP activation for a maximum of four attempts. */
  public static final int PDP_ACTIVATE_MAX_RETRY_FAILED = 2109;
  /** Radio access bearer failure. */
  public static final int RADIO_ACCESS_BEARER_FAILURE = 2110;
  /** Invalid EPS bearer identity in the request. */
  public static final int ESM_UNKNOWN_EPS_BEARER_CONTEXT = 2111;
  /** Data radio bearer is released by the RRC. */
  public static final int DRB_RELEASED_BY_RRC = 2112;
  /** Indicate the connection was released. */
  public static final int CONNECTION_RELEASED = 2113;
  /** UE is detached. */
  public static final int EMM_DETACHED = 2114;
  /** Attach procedure is rejected by the network. */
  public static final int EMM_ATTACH_FAILED = 2115;
  /** Attach procedure is started for EMC purposes. */
  public static final int EMM_ATTACH_STARTED = 2116;
  /** Service request procedure failure. */
  public static final int LTE_NAS_SERVICE_REQUEST_FAILED = 2117;
  /** Active dedicated bearer was requested using the same default bearer ID. */
  public static final int DUPLICATE_BEARER_ID = 2118;
  /** Collision scenarios for the UE and network-initiated procedures. */
  public static final int ESM_COLLISION_SCENARIOS = 2119;
  /** Bearer must be deactivated to synchronize with the network. */
  public static final int ESM_BEARER_DEACTIVATED_TO_SYNC_WITH_NETWORK = 2120;
  /** Active dedicated bearer was requested for an existing default bearer. */
  public static final int ESM_NW_ACTIVATED_DED_BEARER_WITH_ID_OF_DEF_BEARER = 2121;
  /** Bad OTA message is received from the network. */
  public static final int ESM_BAD_OTA_MESSAGE = 2122;
  /** Download server rejected the call. */
  public static final int ESM_DOWNLOAD_SERVER_REJECTED_THE_CALL = 2123;
  /** PDN was disconnected by the downlaod server due to IRAT. */
  public static final int ESM_CONTEXT_TRANSFERRED_DUE_TO_IRAT = 2124;
  /** Dedicated bearer will be deactivated regardless of the network response. */
  public static final int DS_EXPLICIT_DEACTIVATION = 2125;
  /** No specific local cause is mentioned, usually a valid OTA cause. */
  public static final int ESM_LOCAL_CAUSE_NONE = 2126;
  /** Throttling is not needed for this service request failure. */
  public static final int LTE_THROTTLING_NOT_REQUIRED = 2127;
  /** Access control list check failure at the lower layer. */
  public static final int ACCESS_CONTROL_LIST_CHECK_FAILURE = 2128;
  /** Service is not allowed on the requested PLMN. */
  public static final int SERVICE_NOT_ALLOWED_ON_PLMN = 2129;
  /** T3417 timer expiration of the service request procedure. */
  public static final int EMM_T3417_EXPIRED = 2130;
  /** Extended service request fails due to expiration of the T3417 EXT timer. */
  public static final int EMM_T3417_EXT_EXPIRED = 2131;
  /** Transmission failure of radio resource control (RRC) uplink data. */
  public static final int RRC_UPLINK_DATA_TRANSMISSION_FAILURE = 2132;
  /** Radio resource control (RRC) uplink data delivery failed due to a handover. */
  public static final int RRC_UPLINK_DELIVERY_FAILED_DUE_TO_HANDOVER = 2133;
  /** Radio resource control (RRC) uplink data delivery failed due to a connection release. */
  public static final int RRC_UPLINK_CONNECTION_RELEASE = 2134;
  /** Radio resource control (RRC) uplink data delivery failed due to a radio link failure. */
  public static final int RRC_UPLINK_RADIO_LINK_FAILURE = 2135;
  /**
   * Radio resource control (RRC) is not connected but the non-access stratum (NAS) sends an
   * uplink data request.
   */
  public static final int RRC_UPLINK_ERROR_REQUEST_FROM_NAS = 2136;
  /** Radio resource control (RRC) connection failure at access stratum. */
  public static final int RRC_CONNECTION_ACCESS_STRATUM_FAILURE = 2137;
  /** Radio resource control (RRC) connection establishment is aborted due to another procedure. */
  public static final int RRC_CONNECTION_ANOTHER_PROCEDURE_IN_PROGRESS = 2138;
  /** Radio resource control (RRC) connection establishment failed due to access barrred. */
  public static final int RRC_CONNECTION_ACCESS_BARRED = 2139;
  /**
   * Radio resource control (RRC) connection establishment failed due to cell reselection at
   * access stratum.
   */
  public static final int RRC_CONNECTION_CELL_RESELECTION = 2140;
  /**
   * Connection establishment failed due to configuration failure at the radio resource control
   * (RRC).
   */
  public static final int RRC_CONNECTION_CONFIG_FAILURE = 2141;
  /** Radio resource control (RRC) connection could not be established in the time limit. */
  public static final int RRC_CONNECTION_TIMER_EXPIRED = 2142;
  /** Connection establishment failed due to a link failure at the radio resource control (RRC). */
  public static final int RRC_CONNECTION_LINK_FAILURE = 2143;
  /**
   * Connection establishment failed as the radio resource control (RRC) is not camped on any
   * cell.
   */
  public static final int RRC_CONNECTION_CELL_NOT_CAMPED = 2144;
  /**
   * Connection establishment failed due to a service interval failure at the radio resource
   * control (RRC).
   */
  public static final int RRC_CONNECTION_SYSTEM_INTERVAL_FAILURE = 2145;
  /**
   * Radio resource control (RRC) connection establishment failed due to the network rejecting the
   * UE connection request.
   */
  public static final int RRC_CONNECTION_REJECT_BY_NETWORK = 2146;
  /** Normal radio resource control (RRC) connection release. */
  public static final int RRC_CONNECTION_NORMAL_RELEASE = 2147;
  /** Radio resource control (RRC) connection release failed due to radio link failure conditions. */
  public static final int RRC_CONNECTION_RADIO_LINK_FAILURE = 2148;
  /** Radio resource control (RRC) connection re-establishment failure. */
  public static final int RRC_CONNECTION_REESTABLISHMENT_FAILURE = 2149;
  /** UE is out of service during the call register. */
  public static final int RRC_CONNECTION_OUT_OF_SERVICE_DURING_CELL_REGISTER = 2150;
  /** Connection has been released by the radio resource control (RRC) due to an abort request. */
  public static final int RRC_CONNECTION_ABORT_REQUEST = 2151;
  /**
   * Radio resource control (RRC) connection released due to a system information block read
   * error.
   */
  public static final int RRC_CONNECTION_SYSTEM_INFORMATION_BLOCK_READ_ERROR = 2152;
  /** Network-initiated detach with reattach. */
  public static final int NETWORK_INITIATED_DETACH_WITH_AUTO_REATTACH = 2153;
  /** Network-initiated detach without reattach. */
  public static final int NETWORK_INITIATED_DETACH_NO_AUTO_REATTACH = 2154;
  /** ESM procedure maximum attempt timeout failure. */
  public static final int ESM_PROCEDURE_TIME_OUT = 2155;
  /**
   * No PDP exists with the given connection ID while modifying or deactivating or activation for
   * an already active PDP.
   */
  public static final int INVALID_CONNECTION_ID = 2156;
  /** Maximum NSAPIs have been exceeded during PDP activation. */
  public static final int MAXIMIUM_NSAPIS_EXCEEDED = 2157;
  /** Primary context for NSAPI does not exist. */
  public static final int INVALID_PRIMARY_NSAPI = 2158;
  /** Unable to encode the OTA message for MT PDP or deactivate PDP. */
  public static final int CANNOT_ENCODE_OTA_MESSAGE = 2159;
  /**
   * Radio access bearer is not established by the lower layers during activation, modification,
   * or deactivation.
   */
  public static final int RADIO_ACCESS_BEARER_SETUP_FAILURE = 2160;
  /** Expiration of the PDP establish timer with a maximum of five retries. */
  public static final int PDP_ESTABLISH_TIMEOUT_EXPIRED = 2161;
  /** Expiration of the PDP modify timer with a maximum of four retries. */
  public static final int PDP_MODIFY_TIMEOUT_EXPIRED = 2162;
  /** Expiration of the PDP deactivate timer with a maximum of four retries. */
  public static final int PDP_INACTIVE_TIMEOUT_EXPIRED = 2163;
  /** PDP activation failed due to RRC_ABORT or a forbidden PLMN. */
  public static final int PDP_LOWERLAYER_ERROR = 2164;
  /** MO PDP modify collision when the MT PDP is already in progress. */
  public static final int PDP_MODIFY_COLLISION = 2165;
  /** @deprecated use MAXIMUM_SIZE_OF_L2_MESSAGE_EXCEEDED instead. */
  @Deprecated
  public static final int MAXINUM_SIZE_OF_L2_MESSAGE_EXCEEDED = 2166;
  /** Maximum size of the L2 message was exceeded. */
  public static final int MAXIMUM_SIZE_OF_L2_MESSAGE_EXCEEDED = 2166;
  /** Non-access stratum (NAS) request was rejected by the network. */
  public static final int NAS_REQUEST_REJECTED_BY_NETWORK = 2167;
  /**
   * Radio resource control (RRC) connection establishment failure due to an error in the request
   * message.
   */
  public static final int RRC_CONNECTION_INVALID_REQUEST = 2168;
  /**
   * Radio resource control (RRC) connection establishment failure due to a change in the tracking
   * area ID.
   */
  public static final int RRC_CONNECTION_TRACKING_AREA_ID_CHANGED = 2169;
  /** Radio resource control (RRC) connection establishment failure due to the RF was unavailable. */
  public static final int RRC_CONNECTION_RF_UNAVAILABLE = 2170;
  /**
   * Radio resource control (RRC) connection was aborted before deactivating the LTE stack due to
   * a successful LTE to WCDMA/GSM/TD-SCDMA IRAT change.
   */
  public static final int RRC_CONNECTION_ABORTED_DUE_TO_IRAT_CHANGE = 2171;
  /**
   * If the UE has an LTE radio link failure before security is established, the radio resource
   * control (RRC) connection must be released and the UE must return to idle.
   */
  public static final int RRC_CONNECTION_RELEASED_SECURITY_NOT_ACTIVE = 2172;
  /**
   * Radio resource control (RRC) connection was aborted by the non-access stratum (NAS) after an
   * IRAT to LTE IRAT handover.
   */
  public static final int RRC_CONNECTION_ABORTED_AFTER_HANDOVER = 2173;
  /**
   * Radio resource control (RRC) connection was aborted before deactivating the LTE stack after a
   * successful LTE to GSM/EDGE IRAT cell change order procedure.
   */
  public static final int RRC_CONNECTION_ABORTED_AFTER_IRAT_CELL_CHANGE = 2174;
  /**
   * Radio resource control (RRC) connection was aborted in the middle of a LTE to GSM IRAT cell
   * change order procedure.
   */
  public static final int RRC_CONNECTION_ABORTED_DURING_IRAT_CELL_CHANGE = 2175;
  /** IMSI present in the UE is unknown in the home subscriber server. */
  public static final int IMSI_UNKNOWN_IN_HOME_SUBSCRIBER_SERVER = 2176;
  /** IMEI of the UE is not accepted by the network. */
  public static final int IMEI_NOT_ACCEPTED = 2177;
  /** EPS and non-EPS services are not allowed by the network. */
  public static final int EPS_SERVICES_AND_NON_EPS_SERVICES_NOT_ALLOWED = 2178;
  /** EPS services are not allowed in the PLMN. */
  public static final int EPS_SERVICES_NOT_ALLOWED_IN_PLMN = 2179;
  /** Mobile switching center is temporarily unreachable. */
  public static final int MSC_TEMPORARILY_NOT_REACHABLE = 2180;
  /** CS domain is not available. */
  public static final int CS_DOMAIN_NOT_AVAILABLE = 2181;
  /** ESM level failure. */
  public static final int ESM_FAILURE = 2182;
  /** MAC level failure. */
  public static final int MAC_FAILURE = 2183;
  /** Synchronization failure. */
  public static final int SYNCHRONIZATION_FAILURE = 2184;
  /** UE security capabilities mismatch. */
  public static final int UE_SECURITY_CAPABILITIES_MISMATCH = 2185;
  /** Unspecified security mode reject. */
  public static final int SECURITY_MODE_REJECTED = 2186;
  /** Unacceptable non-EPS authentication. */
  public static final int UNACCEPTABLE_NON_EPS_AUTHENTICATION = 2187;
  /** CS fallback call establishment is not allowed. */
  public static final int CS_FALLBACK_CALL_ESTABLISHMENT_NOT_ALLOWED = 2188;
  /** No EPS bearer context was activated. */
  public static final int NO_EPS_BEARER_CONTEXT_ACTIVATED = 2189;
  /** Invalid EMM state. */
  public static final int INVALID_EMM_STATE = 2190;
  /** Non-Access Spectrum layer failure. */
  public static final int NAS_LAYER_FAILURE = 2191;
  /** Multiple PDP call feature is disabled. */
  public static final int MULTIPLE_PDP_CALL_NOT_ALLOWED = 2192;
  /** Data call has been brought down because EMBMS is not enabled at the RRC layer. */
  public static final int EMBMS_NOT_ENABLED = 2193;
  /** Data call was unsuccessfully transferred during the IRAT handover. */
  public static final int IRAT_HANDOVER_FAILED = 2194;
  /** EMBMS data call has been successfully brought down. */
  public static final int EMBMS_REGULAR_DEACTIVATION = 2195;
  /** Test loop-back data call has been successfully brought down. */
  public static final int TEST_LOOPBACK_REGULAR_DEACTIVATION = 2196;
  /** Lower layer registration failure. */
  public static final int LOWER_LAYER_REGISTRATION_FAILURE = 2197;
  /**
   * Network initiates a detach on LTE with error cause "data plan has been replenished or has
   * expired".
   */
  public static final int DATA_PLAN_EXPIRED = 2198;
  /** UMTS interface is brought down due to handover from UMTS to iWLAN. */
  public static final int UMTS_HANDOVER_TO_IWLAN = 2199;
  /**
   * Received a connection deny due to general or network busy on EVDO network.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EVDO_CONNECTION_DENY_BY_GENERAL_OR_NETWORK_BUSY = 2200;
  /**
   * Received a connection deny due to billing or authentication failure on EVDO network.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EVDO_CONNECTION_DENY_BY_BILLING_OR_AUTHENTICATION_FAILURE = 2201;
  /**
   * HDR system has been changed due to redirection or the PRL was not preferred.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EVDO_HDR_CHANGED = 2202;
  /**
   * Device exited HDR due to redirection or the PRL was not preferred.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EVDO_HDR_EXITED = 2203;
  /**
   * Device does not have an HDR session.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EVDO_HDR_NO_SESSION = 2204;
  /**
   * It is ending an HDR call origination in favor of a GPS fix.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EVDO_USING_GPS_FIX_INSTEAD_OF_HDR_CALL = 2205;
  /**
   * Connection setup on the HDR system was time out.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int EVDO_HDR_CONNECTION_SETUP_TIMEOUT = 2206;
  /** Device failed to acquire a co-located HDR for origination. */
  public static final int FAILED_TO_ACQUIRE_COLOCATED_HDR = 2207;
  /** OTASP commit is in progress. */
  public static final int OTASP_COMMIT_IN_PROGRESS = 2208;
  /** Device has no hybrid HDR service. */
  public static final int NO_HYBRID_HDR_SERVICE = 2209;
  /** HDR module could not be obtained because of the RF locked. */
  public static final int HDR_NO_LOCK_GRANTED = 2210;
  /** DBM or SMS is in progress. */
  public static final int DBM_OR_SMS_IN_PROGRESS = 2211;
  /** HDR module released the call due to fade. */
  public static final int HDR_FADE = 2212;
  /** HDR system access failure. */
  public static final int HDR_ACCESS_FAILURE = 2213;
  /**
   * P_rev supported by 1 base station is less than 6, which is not supported for a 1X data call.
   * The UE must be in the footprint of BS which has p_rev >= 6 to support this SO33 call.
   */
  public static final int UNSUPPORTED_1X_PREV = 2214;
  /** Client ended the data call. */
  public static final int LOCAL_END = 2215;
  /** Device has no service. */
  public static final int NO_SERVICE = 2216;
  /** Device lost the system due to fade. */
  public static final int FADE = 2217;
  /** Receiving a release from the base station with no reason. */
  public static final int NORMAL_RELEASE = 2218;
  /** Access attempt is already in progress. */
  public static final int ACCESS_ATTEMPT_ALREADY_IN_PROGRESS = 2219;
  /** Device is in the process of redirecting or handing off to a different target system. */
  public static final int REDIRECTION_OR_HANDOFF_IN_PROGRESS = 2220;
  /** Device is operating in Emergency mode. */
  public static final int EMERGENCY_MODE = 2221;
  /** Device is in use (e.g., voice call). */
  public static final int PHONE_IN_USE = 2222;
  /** Device operational mode is different from the mode requested in the traffic channel bring up. */
  public static final int INVALID_MODE = 2223;
  /** SIM was marked by the network as invalid for the circuit and/or packet service domain. */
  public static final int INVALID_SIM_STATE = 2224;
  /** There is no co-located HDR. */
  public static final int NO_COLLOCATED_HDR = 2225;
  /** UE is entering power save mode. */
  public static final int UE_IS_ENTERING_POWERSAVE_MODE = 2226;
  /** Dual switch from single standby to dual standby is in progress. */
  public static final int DUAL_SWITCH = 2227;
  /**
   * Data call bring up fails in the PPP setup due to a timeout. (e.g., an LCP conf ack was not
   * received from the network)
   */
  public static final int PPP_TIMEOUT = 2228;
  /**
   * Data call bring up fails in the PPP setup due to an authorization failure.
   * (e.g., authorization is required, but not negotiated with the network during an LCP phase)
   */
  public static final int PPP_AUTH_FAILURE = 2229;
  /** Data call bring up fails in the PPP setup due to an option mismatch. */
  public static final int PPP_OPTION_MISMATCH = 2230;
  /** Data call bring up fails in the PPP setup due to a PAP failure. */
  public static final int PPP_PAP_FAILURE = 2231;
  /** Data call bring up fails in the PPP setup due to a CHAP failure. */
  public static final int PPP_CHAP_FAILURE = 2232;
  /**
   * Data call bring up fails in the PPP setup because the PPP is in the process of cleaning the
   * previous PPP session.
   */
  public static final int PPP_CLOSE_IN_PROGRESS = 2233;
  /**
   * IPv6 interface bring up fails because the network provided only the IPv4 address for the
   * upcoming PDN permanent client can reattempt a IPv6 call bring up after the IPv4 interface is
   * also brought down. However, there is no guarantee that the network will provide a IPv6
   * address.
   */
  public static final int LIMITED_TO_IPV4 = 2234;
  /**
   * IPv4 interface bring up fails because the network provided only the IPv6 address for the
   * upcoming PDN permanent client can reattempt a IPv4 call bring up after the IPv6 interface is
   * also brought down. However there is no guarantee that the network will provide a IPv4
   * address.
   */
  public static final int LIMITED_TO_IPV6 = 2235;
  /** Data call bring up fails in the VSNCP phase due to a VSNCP timeout error. */
  public static final int VSNCP_TIMEOUT = 2236;
  /**
   * Data call bring up fails in the VSNCP phase due to a general error. It's used when there is
   * no other specific error code available to report the failure.
   */
  public static final int VSNCP_GEN_ERROR = 2237;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request because the requested APN is unauthorized.
   */
  public static final int VSNCP_APN_UNAUTHORIZED = 2238;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request because the PDN limit has been exceeded.
   */
  public static final int VSNCP_PDN_LIMIT_EXCEEDED = 2239;
  /**
   * Data call bring up fails in the VSNCP phase due to the network rejected the VSNCP
   * configuration request due to no PDN gateway address.
   */
  public static final int VSNCP_NO_PDN_GATEWAY_ADDRESS = 2240;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request because the PDN gateway is unreachable.
   */
  public static final int VSNCP_PDN_GATEWAY_UNREACHABLE = 2241;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request due to a PDN gateway reject.
   */
  public static final int VSNCP_PDN_GATEWAY_REJECT = 2242;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request with the reason of insufficient parameter.
   */
  public static final int VSNCP_INSUFFICIENT_PARAMETERS = 2243;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request with the reason of resource unavailable.
   */
  public static final int VSNCP_RESOURCE_UNAVAILABLE = 2244;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request with the reason of administratively prohibited at the HSGW.
   */
  public static final int VSNCP_ADMINISTRATIVELY_PROHIBITED = 2245;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of PDN ID in use, or
   * all existing PDNs are brought down with this end reason because one of the PDN bring up was
   * rejected by the network with the reason of PDN ID in use.
   */
  public static final int VSNCP_PDN_ID_IN_USE = 2246;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request for the reason of subscriber limitation.
   */
  public static final int VSNCP_SUBSCRIBER_LIMITATION = 2247;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request because the PDN exists for this APN.
   */
  public static final int VSNCP_PDN_EXISTS_FOR_THIS_APN = 2248;
  /**
   * Data call bring up fails in the VSNCP phase due to a network rejection of the VSNCP
   * configuration request with reconnect to this PDN not allowed, or an active data call is
   * terminated by the network because reconnection to this PDN is not allowed. Upon receiving
   * this error code from the network, the modem infinitely throttles the PDN until the next power
   * cycle.
   */
  public static final int VSNCP_RECONNECT_NOT_ALLOWED = 2249;
  /** Device failure to obtain the prefix from the network. */
  public static final int IPV6_PREFIX_UNAVAILABLE = 2250;
  /** System preference change back to SRAT during handoff */
  public static final int HANDOFF_PREFERENCE_CHANGED = 2251;
  /** Data call fail due to the slice not being allowed for the data call. */
  public static final int SLICE_REJECTED = 2252;
  /** No matching rule available for the request, and match-all rule is not allowed for it. */
  public static final int MATCH_ALL_RULE_NOT_ALLOWED = 2253;
  /** If connection failed for all matching URSP rules. */
  public static final int ALL_MATCHING_RULES_FAILED = 2254;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NONE) return "NONE";
      if (_aidl_v == OPERATOR_BARRED) return "OPERATOR_BARRED";
      if (_aidl_v == NAS_SIGNALLING) return "NAS_SIGNALLING";
      if (_aidl_v == INSUFFICIENT_RESOURCES) return "INSUFFICIENT_RESOURCES";
      if (_aidl_v == MISSING_UNKNOWN_APN) return "MISSING_UNKNOWN_APN";
      if (_aidl_v == UNKNOWN_PDP_ADDRESS_TYPE) return "UNKNOWN_PDP_ADDRESS_TYPE";
      if (_aidl_v == USER_AUTHENTICATION) return "USER_AUTHENTICATION";
      if (_aidl_v == ACTIVATION_REJECT_GGSN) return "ACTIVATION_REJECT_GGSN";
      if (_aidl_v == ACTIVATION_REJECT_UNSPECIFIED) return "ACTIVATION_REJECT_UNSPECIFIED";
      if (_aidl_v == SERVICE_OPTION_NOT_SUPPORTED) return "SERVICE_OPTION_NOT_SUPPORTED";
      if (_aidl_v == SERVICE_OPTION_NOT_SUBSCRIBED) return "SERVICE_OPTION_NOT_SUBSCRIBED";
      if (_aidl_v == SERVICE_OPTION_OUT_OF_ORDER) return "SERVICE_OPTION_OUT_OF_ORDER";
      if (_aidl_v == NSAPI_IN_USE) return "NSAPI_IN_USE";
      if (_aidl_v == REGULAR_DEACTIVATION) return "REGULAR_DEACTIVATION";
      if (_aidl_v == QOS_NOT_ACCEPTED) return "QOS_NOT_ACCEPTED";
      if (_aidl_v == NETWORK_FAILURE) return "NETWORK_FAILURE";
      if (_aidl_v == UMTS_REACTIVATION_REQ) return "UMTS_REACTIVATION_REQ";
      if (_aidl_v == FEATURE_NOT_SUPP) return "FEATURE_NOT_SUPP";
      if (_aidl_v == TFT_SEMANTIC_ERROR) return "TFT_SEMANTIC_ERROR";
      if (_aidl_v == TFT_SYTAX_ERROR) return "TFT_SYTAX_ERROR";
      if (_aidl_v == UNKNOWN_PDP_CONTEXT) return "UNKNOWN_PDP_CONTEXT";
      if (_aidl_v == FILTER_SEMANTIC_ERROR) return "FILTER_SEMANTIC_ERROR";
      if (_aidl_v == FILTER_SYTAX_ERROR) return "FILTER_SYTAX_ERROR";
      if (_aidl_v == PDP_WITHOUT_ACTIVE_TFT) return "PDP_WITHOUT_ACTIVE_TFT";
      if (_aidl_v == ONLY_IPV4_ALLOWED) return "ONLY_IPV4_ALLOWED";
      if (_aidl_v == ONLY_IPV6_ALLOWED) return "ONLY_IPV6_ALLOWED";
      if (_aidl_v == ONLY_SINGLE_BEARER_ALLOWED) return "ONLY_SINGLE_BEARER_ALLOWED";
      if (_aidl_v == ESM_INFO_NOT_RECEIVED) return "ESM_INFO_NOT_RECEIVED";
      if (_aidl_v == PDN_CONN_DOES_NOT_EXIST) return "PDN_CONN_DOES_NOT_EXIST";
      if (_aidl_v == MULTI_CONN_TO_SAME_PDN_NOT_ALLOWED) return "MULTI_CONN_TO_SAME_PDN_NOT_ALLOWED";
      if (_aidl_v == MAX_ACTIVE_PDP_CONTEXT_REACHED) return "MAX_ACTIVE_PDP_CONTEXT_REACHED";
      if (_aidl_v == UNSUPPORTED_APN_IN_CURRENT_PLMN) return "UNSUPPORTED_APN_IN_CURRENT_PLMN";
      if (_aidl_v == INVALID_TRANSACTION_ID) return "INVALID_TRANSACTION_ID";
      if (_aidl_v == MESSAGE_INCORRECT_SEMANTIC) return "MESSAGE_INCORRECT_SEMANTIC";
      if (_aidl_v == INVALID_MANDATORY_INFO) return "INVALID_MANDATORY_INFO";
      if (_aidl_v == MESSAGE_TYPE_UNSUPPORTED) return "MESSAGE_TYPE_UNSUPPORTED";
      if (_aidl_v == MSG_TYPE_NONCOMPATIBLE_STATE) return "MSG_TYPE_NONCOMPATIBLE_STATE";
      if (_aidl_v == UNKNOWN_INFO_ELEMENT) return "UNKNOWN_INFO_ELEMENT";
      if (_aidl_v == CONDITIONAL_IE_ERROR) return "CONDITIONAL_IE_ERROR";
      if (_aidl_v == MSG_AND_PROTOCOL_STATE_UNCOMPATIBLE) return "MSG_AND_PROTOCOL_STATE_UNCOMPATIBLE";
      if (_aidl_v == PROTOCOL_ERRORS) return "PROTOCOL_ERRORS";
      if (_aidl_v == APN_TYPE_CONFLICT) return "APN_TYPE_CONFLICT";
      if (_aidl_v == INVALID_PCSCF_ADDR) return "INVALID_PCSCF_ADDR";
      if (_aidl_v == INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN) return "INTERNAL_CALL_PREEMPT_BY_HIGH_PRIO_APN";
      if (_aidl_v == EMM_ACCESS_BARRED) return "EMM_ACCESS_BARRED";
      if (_aidl_v == EMERGENCY_IFACE_ONLY) return "EMERGENCY_IFACE_ONLY";
      if (_aidl_v == IFACE_MISMATCH) return "IFACE_MISMATCH";
      if (_aidl_v == COMPANION_IFACE_IN_USE) return "COMPANION_IFACE_IN_USE";
      if (_aidl_v == IP_ADDRESS_MISMATCH) return "IP_ADDRESS_MISMATCH";
      if (_aidl_v == IFACE_AND_POL_FAMILY_MISMATCH) return "IFACE_AND_POL_FAMILY_MISMATCH";
      if (_aidl_v == EMM_ACCESS_BARRED_INFINITE_RETRY) return "EMM_ACCESS_BARRED_INFINITE_RETRY";
      if (_aidl_v == AUTH_FAILURE_ON_EMERGENCY_CALL) return "AUTH_FAILURE_ON_EMERGENCY_CALL";
      if (_aidl_v == OEM_DCFAILCAUSE_1) return "OEM_DCFAILCAUSE_1";
      if (_aidl_v == OEM_DCFAILCAUSE_2) return "OEM_DCFAILCAUSE_2";
      if (_aidl_v == OEM_DCFAILCAUSE_3) return "OEM_DCFAILCAUSE_3";
      if (_aidl_v == OEM_DCFAILCAUSE_4) return "OEM_DCFAILCAUSE_4";
      if (_aidl_v == OEM_DCFAILCAUSE_5) return "OEM_DCFAILCAUSE_5";
      if (_aidl_v == OEM_DCFAILCAUSE_6) return "OEM_DCFAILCAUSE_6";
      if (_aidl_v == OEM_DCFAILCAUSE_7) return "OEM_DCFAILCAUSE_7";
      if (_aidl_v == OEM_DCFAILCAUSE_8) return "OEM_DCFAILCAUSE_8";
      if (_aidl_v == OEM_DCFAILCAUSE_9) return "OEM_DCFAILCAUSE_9";
      if (_aidl_v == OEM_DCFAILCAUSE_10) return "OEM_DCFAILCAUSE_10";
      if (_aidl_v == OEM_DCFAILCAUSE_11) return "OEM_DCFAILCAUSE_11";
      if (_aidl_v == OEM_DCFAILCAUSE_12) return "OEM_DCFAILCAUSE_12";
      if (_aidl_v == OEM_DCFAILCAUSE_13) return "OEM_DCFAILCAUSE_13";
      if (_aidl_v == OEM_DCFAILCAUSE_14) return "OEM_DCFAILCAUSE_14";
      if (_aidl_v == OEM_DCFAILCAUSE_15) return "OEM_DCFAILCAUSE_15";
      if (_aidl_v == VOICE_REGISTRATION_FAIL) return "VOICE_REGISTRATION_FAIL";
      if (_aidl_v == DATA_REGISTRATION_FAIL) return "DATA_REGISTRATION_FAIL";
      if (_aidl_v == SIGNAL_LOST) return "SIGNAL_LOST";
      if (_aidl_v == PREF_RADIO_TECH_CHANGED) return "PREF_RADIO_TECH_CHANGED";
      if (_aidl_v == RADIO_POWER_OFF) return "RADIO_POWER_OFF";
      if (_aidl_v == TETHERED_CALL_ACTIVE) return "TETHERED_CALL_ACTIVE";
      if (_aidl_v == ERROR_UNSPECIFIED) return "ERROR_UNSPECIFIED";
      if (_aidl_v == LLC_SNDCP) return "LLC_SNDCP";
      if (_aidl_v == ACTIVATION_REJECTED_BCM_VIOLATION) return "ACTIVATION_REJECTED_BCM_VIOLATION";
      if (_aidl_v == COLLISION_WITH_NETWORK_INITIATED_REQUEST) return "COLLISION_WITH_NETWORK_INITIATED_REQUEST";
      if (_aidl_v == ONLY_IPV4V6_ALLOWED) return "ONLY_IPV4V6_ALLOWED";
      if (_aidl_v == ONLY_NON_IP_ALLOWED) return "ONLY_NON_IP_ALLOWED";
      if (_aidl_v == UNSUPPORTED_QCI_VALUE) return "UNSUPPORTED_QCI_VALUE";
      if (_aidl_v == BEARER_HANDLING_NOT_SUPPORTED) return "BEARER_HANDLING_NOT_SUPPORTED";
      if (_aidl_v == INVALID_DNS_ADDR) return "INVALID_DNS_ADDR";
      if (_aidl_v == INVALID_PCSCF_OR_DNS_ADDRESS) return "INVALID_PCSCF_OR_DNS_ADDRESS";
      if (_aidl_v == CALL_PREEMPT_BY_EMERGENCY_APN) return "CALL_PREEMPT_BY_EMERGENCY_APN";
      if (_aidl_v == UE_INITIATED_DETACH_OR_DISCONNECT) return "UE_INITIATED_DETACH_OR_DISCONNECT";
      if (_aidl_v == MIP_FA_REASON_UNSPECIFIED) return "MIP_FA_REASON_UNSPECIFIED";
      if (_aidl_v == MIP_FA_ADMIN_PROHIBITED) return "MIP_FA_ADMIN_PROHIBITED";
      if (_aidl_v == MIP_FA_INSUFFICIENT_RESOURCES) return "MIP_FA_INSUFFICIENT_RESOURCES";
      if (_aidl_v == MIP_FA_MOBILE_NODE_AUTHENTICATION_FAILURE) return "MIP_FA_MOBILE_NODE_AUTHENTICATION_FAILURE";
      if (_aidl_v == MIP_FA_HOME_AGENT_AUTHENTICATION_FAILURE) return "MIP_FA_HOME_AGENT_AUTHENTICATION_FAILURE";
      if (_aidl_v == MIP_FA_REQUESTED_LIFETIME_TOO_LONG) return "MIP_FA_REQUESTED_LIFETIME_TOO_LONG";
      if (_aidl_v == MIP_FA_MALFORMED_REQUEST) return "MIP_FA_MALFORMED_REQUEST";
      if (_aidl_v == MIP_FA_MALFORMED_REPLY) return "MIP_FA_MALFORMED_REPLY";
      if (_aidl_v == MIP_FA_ENCAPSULATION_UNAVAILABLE) return "MIP_FA_ENCAPSULATION_UNAVAILABLE";
      if (_aidl_v == MIP_FA_VJ_HEADER_COMPRESSION_UNAVAILABLE) return "MIP_FA_VJ_HEADER_COMPRESSION_UNAVAILABLE";
      if (_aidl_v == MIP_FA_REVERSE_TUNNEL_UNAVAILABLE) return "MIP_FA_REVERSE_TUNNEL_UNAVAILABLE";
      if (_aidl_v == MIP_FA_REVERSE_TUNNEL_IS_MANDATORY) return "MIP_FA_REVERSE_TUNNEL_IS_MANDATORY";
      if (_aidl_v == MIP_FA_DELIVERY_STYLE_NOT_SUPPORTED) return "MIP_FA_DELIVERY_STYLE_NOT_SUPPORTED";
      if (_aidl_v == MIP_FA_MISSING_NAI) return "MIP_FA_MISSING_NAI";
      if (_aidl_v == MIP_FA_MISSING_HOME_AGENT) return "MIP_FA_MISSING_HOME_AGENT";
      if (_aidl_v == MIP_FA_MISSING_HOME_ADDRESS) return "MIP_FA_MISSING_HOME_ADDRESS";
      if (_aidl_v == MIP_FA_UNKNOWN_CHALLENGE) return "MIP_FA_UNKNOWN_CHALLENGE";
      if (_aidl_v == MIP_FA_MISSING_CHALLENGE) return "MIP_FA_MISSING_CHALLENGE";
      if (_aidl_v == MIP_FA_STALE_CHALLENGE) return "MIP_FA_STALE_CHALLENGE";
      if (_aidl_v == MIP_HA_REASON_UNSPECIFIED) return "MIP_HA_REASON_UNSPECIFIED";
      if (_aidl_v == MIP_HA_ADMIN_PROHIBITED) return "MIP_HA_ADMIN_PROHIBITED";
      if (_aidl_v == MIP_HA_INSUFFICIENT_RESOURCES) return "MIP_HA_INSUFFICIENT_RESOURCES";
      if (_aidl_v == MIP_HA_MOBILE_NODE_AUTHENTICATION_FAILURE) return "MIP_HA_MOBILE_NODE_AUTHENTICATION_FAILURE";
      if (_aidl_v == MIP_HA_FOREIGN_AGENT_AUTHENTICATION_FAILURE) return "MIP_HA_FOREIGN_AGENT_AUTHENTICATION_FAILURE";
      if (_aidl_v == MIP_HA_REGISTRATION_ID_MISMATCH) return "MIP_HA_REGISTRATION_ID_MISMATCH";
      if (_aidl_v == MIP_HA_MALFORMED_REQUEST) return "MIP_HA_MALFORMED_REQUEST";
      if (_aidl_v == MIP_HA_UNKNOWN_HOME_AGENT_ADDRESS) return "MIP_HA_UNKNOWN_HOME_AGENT_ADDRESS";
      if (_aidl_v == MIP_HA_REVERSE_TUNNEL_UNAVAILABLE) return "MIP_HA_REVERSE_TUNNEL_UNAVAILABLE";
      if (_aidl_v == MIP_HA_REVERSE_TUNNEL_IS_MANDATORY) return "MIP_HA_REVERSE_TUNNEL_IS_MANDATORY";
      if (_aidl_v == MIP_HA_ENCAPSULATION_UNAVAILABLE) return "MIP_HA_ENCAPSULATION_UNAVAILABLE";
      if (_aidl_v == CLOSE_IN_PROGRESS) return "CLOSE_IN_PROGRESS";
      if (_aidl_v == NETWORK_INITIATED_TERMINATION) return "NETWORK_INITIATED_TERMINATION";
      if (_aidl_v == MODEM_APP_PREEMPTED) return "MODEM_APP_PREEMPTED";
      if (_aidl_v == PDN_IPV4_CALL_DISALLOWED) return "PDN_IPV4_CALL_DISALLOWED";
      if (_aidl_v == PDN_IPV4_CALL_THROTTLED) return "PDN_IPV4_CALL_THROTTLED";
      if (_aidl_v == PDN_IPV6_CALL_DISALLOWED) return "PDN_IPV6_CALL_DISALLOWED";
      if (_aidl_v == PDN_IPV6_CALL_THROTTLED) return "PDN_IPV6_CALL_THROTTLED";
      if (_aidl_v == MODEM_RESTART) return "MODEM_RESTART";
      if (_aidl_v == PDP_PPP_NOT_SUPPORTED) return "PDP_PPP_NOT_SUPPORTED";
      if (_aidl_v == UNPREFERRED_RAT) return "UNPREFERRED_RAT";
      if (_aidl_v == PHYSICAL_LINK_CLOSE_IN_PROGRESS) return "PHYSICAL_LINK_CLOSE_IN_PROGRESS";
      if (_aidl_v == APN_PENDING_HANDOVER) return "APN_PENDING_HANDOVER";
      if (_aidl_v == PROFILE_BEARER_INCOMPATIBLE) return "PROFILE_BEARER_INCOMPATIBLE";
      if (_aidl_v == SIM_CARD_CHANGED) return "SIM_CARD_CHANGED";
      if (_aidl_v == LOW_POWER_MODE_OR_POWERING_DOWN) return "LOW_POWER_MODE_OR_POWERING_DOWN";
      if (_aidl_v == APN_DISABLED) return "APN_DISABLED";
      if (_aidl_v == MAX_PPP_INACTIVITY_TIMER_EXPIRED) return "MAX_PPP_INACTIVITY_TIMER_EXPIRED";
      if (_aidl_v == IPV6_ADDRESS_TRANSFER_FAILED) return "IPV6_ADDRESS_TRANSFER_FAILED";
      if (_aidl_v == TRAT_SWAP_FAILED) return "TRAT_SWAP_FAILED";
      if (_aidl_v == EHRPD_TO_HRPD_FALLBACK) return "EHRPD_TO_HRPD_FALLBACK";
      if (_aidl_v == MIP_CONFIG_FAILURE) return "MIP_CONFIG_FAILURE";
      if (_aidl_v == PDN_INACTIVITY_TIMER_EXPIRED) return "PDN_INACTIVITY_TIMER_EXPIRED";
      if (_aidl_v == MAX_IPV4_CONNECTIONS) return "MAX_IPV4_CONNECTIONS";
      if (_aidl_v == MAX_IPV6_CONNECTIONS) return "MAX_IPV6_CONNECTIONS";
      if (_aidl_v == APN_MISMATCH) return "APN_MISMATCH";
      if (_aidl_v == IP_VERSION_MISMATCH) return "IP_VERSION_MISMATCH";
      if (_aidl_v == DUN_CALL_DISALLOWED) return "DUN_CALL_DISALLOWED";
      if (_aidl_v == INTERNAL_EPC_NONEPC_TRANSITION) return "INTERNAL_EPC_NONEPC_TRANSITION";
      if (_aidl_v == INTERFACE_IN_USE) return "INTERFACE_IN_USE";
      if (_aidl_v == APN_DISALLOWED_ON_ROAMING) return "APN_DISALLOWED_ON_ROAMING";
      if (_aidl_v == APN_PARAMETERS_CHANGED) return "APN_PARAMETERS_CHANGED";
      if (_aidl_v == NULL_APN_DISALLOWED) return "NULL_APN_DISALLOWED";
      if (_aidl_v == THERMAL_MITIGATION) return "THERMAL_MITIGATION";
      if (_aidl_v == DATA_SETTINGS_DISABLED) return "DATA_SETTINGS_DISABLED";
      if (_aidl_v == DATA_ROAMING_SETTINGS_DISABLED) return "DATA_ROAMING_SETTINGS_DISABLED";
      if (_aidl_v == DDS_SWITCHED) return "DDS_SWITCHED";
      if (_aidl_v == FORBIDDEN_APN_NAME) return "FORBIDDEN_APN_NAME";
      if (_aidl_v == DDS_SWITCH_IN_PROGRESS) return "DDS_SWITCH_IN_PROGRESS";
      if (_aidl_v == CALL_DISALLOWED_IN_ROAMING) return "CALL_DISALLOWED_IN_ROAMING";
      if (_aidl_v == NON_IP_NOT_SUPPORTED) return "NON_IP_NOT_SUPPORTED";
      if (_aidl_v == PDN_NON_IP_CALL_THROTTLED) return "PDN_NON_IP_CALL_THROTTLED";
      if (_aidl_v == PDN_NON_IP_CALL_DISALLOWED) return "PDN_NON_IP_CALL_DISALLOWED";
      if (_aidl_v == CDMA_LOCK) return "CDMA_LOCK";
      if (_aidl_v == CDMA_INTERCEPT) return "CDMA_INTERCEPT";
      if (_aidl_v == CDMA_REORDER) return "CDMA_REORDER";
      if (_aidl_v == CDMA_RELEASE_DUE_TO_SO_REJECTION) return "CDMA_RELEASE_DUE_TO_SO_REJECTION";
      if (_aidl_v == CDMA_INCOMING_CALL) return "CDMA_INCOMING_CALL";
      if (_aidl_v == CDMA_ALERT_STOP) return "CDMA_ALERT_STOP";
      if (_aidl_v == CHANNEL_ACQUISITION_FAILURE) return "CHANNEL_ACQUISITION_FAILURE";
      if (_aidl_v == MAX_ACCESS_PROBE) return "MAX_ACCESS_PROBE";
      if (_aidl_v == CONCURRENT_SERVICE_NOT_SUPPORTED_BY_BASE_STATION) return "CONCURRENT_SERVICE_NOT_SUPPORTED_BY_BASE_STATION";
      if (_aidl_v == NO_RESPONSE_FROM_BASE_STATION) return "NO_RESPONSE_FROM_BASE_STATION";
      if (_aidl_v == REJECTED_BY_BASE_STATION) return "REJECTED_BY_BASE_STATION";
      if (_aidl_v == CONCURRENT_SERVICES_INCOMPATIBLE) return "CONCURRENT_SERVICES_INCOMPATIBLE";
      if (_aidl_v == NO_CDMA_SERVICE) return "NO_CDMA_SERVICE";
      if (_aidl_v == RUIM_NOT_PRESENT) return "RUIM_NOT_PRESENT";
      if (_aidl_v == CDMA_RETRY_ORDER) return "CDMA_RETRY_ORDER";
      if (_aidl_v == ACCESS_BLOCK) return "ACCESS_BLOCK";
      if (_aidl_v == ACCESS_BLOCK_ALL) return "ACCESS_BLOCK_ALL";
      if (_aidl_v == IS707B_MAX_ACCESS_PROBES) return "IS707B_MAX_ACCESS_PROBES";
      if (_aidl_v == THERMAL_EMERGENCY) return "THERMAL_EMERGENCY";
      if (_aidl_v == CONCURRENT_SERVICES_NOT_ALLOWED) return "CONCURRENT_SERVICES_NOT_ALLOWED";
      if (_aidl_v == INCOMING_CALL_REJECTED) return "INCOMING_CALL_REJECTED";
      if (_aidl_v == NO_SERVICE_ON_GATEWAY) return "NO_SERVICE_ON_GATEWAY";
      if (_aidl_v == NO_GPRS_CONTEXT) return "NO_GPRS_CONTEXT";
      if (_aidl_v == ILLEGAL_MS) return "ILLEGAL_MS";
      if (_aidl_v == ILLEGAL_ME) return "ILLEGAL_ME";
      if (_aidl_v == GPRS_SERVICES_AND_NON_GPRS_SERVICES_NOT_ALLOWED) return "GPRS_SERVICES_AND_NON_GPRS_SERVICES_NOT_ALLOWED";
      if (_aidl_v == GPRS_SERVICES_NOT_ALLOWED) return "GPRS_SERVICES_NOT_ALLOWED";
      if (_aidl_v == MS_IDENTITY_CANNOT_BE_DERIVED_BY_THE_NETWORK) return "MS_IDENTITY_CANNOT_BE_DERIVED_BY_THE_NETWORK";
      if (_aidl_v == IMPLICITLY_DETACHED) return "IMPLICITLY_DETACHED";
      if (_aidl_v == PLMN_NOT_ALLOWED) return "PLMN_NOT_ALLOWED";
      if (_aidl_v == LOCATION_AREA_NOT_ALLOWED) return "LOCATION_AREA_NOT_ALLOWED";
      if (_aidl_v == GPRS_SERVICES_NOT_ALLOWED_IN_THIS_PLMN) return "GPRS_SERVICES_NOT_ALLOWED_IN_THIS_PLMN";
      if (_aidl_v == PDP_DUPLICATE) return "PDP_DUPLICATE";
      if (_aidl_v == UE_RAT_CHANGE) return "UE_RAT_CHANGE";
      if (_aidl_v == CONGESTION) return "CONGESTION";
      if (_aidl_v == NO_PDP_CONTEXT_ACTIVATED) return "NO_PDP_CONTEXT_ACTIVATED";
      if (_aidl_v == ACCESS_CLASS_DSAC_REJECTION) return "ACCESS_CLASS_DSAC_REJECTION";
      if (_aidl_v == PDP_ACTIVATE_MAX_RETRY_FAILED) return "PDP_ACTIVATE_MAX_RETRY_FAILED";
      if (_aidl_v == RADIO_ACCESS_BEARER_FAILURE) return "RADIO_ACCESS_BEARER_FAILURE";
      if (_aidl_v == ESM_UNKNOWN_EPS_BEARER_CONTEXT) return "ESM_UNKNOWN_EPS_BEARER_CONTEXT";
      if (_aidl_v == DRB_RELEASED_BY_RRC) return "DRB_RELEASED_BY_RRC";
      if (_aidl_v == CONNECTION_RELEASED) return "CONNECTION_RELEASED";
      if (_aidl_v == EMM_DETACHED) return "EMM_DETACHED";
      if (_aidl_v == EMM_ATTACH_FAILED) return "EMM_ATTACH_FAILED";
      if (_aidl_v == EMM_ATTACH_STARTED) return "EMM_ATTACH_STARTED";
      if (_aidl_v == LTE_NAS_SERVICE_REQUEST_FAILED) return "LTE_NAS_SERVICE_REQUEST_FAILED";
      if (_aidl_v == DUPLICATE_BEARER_ID) return "DUPLICATE_BEARER_ID";
      if (_aidl_v == ESM_COLLISION_SCENARIOS) return "ESM_COLLISION_SCENARIOS";
      if (_aidl_v == ESM_BEARER_DEACTIVATED_TO_SYNC_WITH_NETWORK) return "ESM_BEARER_DEACTIVATED_TO_SYNC_WITH_NETWORK";
      if (_aidl_v == ESM_NW_ACTIVATED_DED_BEARER_WITH_ID_OF_DEF_BEARER) return "ESM_NW_ACTIVATED_DED_BEARER_WITH_ID_OF_DEF_BEARER";
      if (_aidl_v == ESM_BAD_OTA_MESSAGE) return "ESM_BAD_OTA_MESSAGE";
      if (_aidl_v == ESM_DOWNLOAD_SERVER_REJECTED_THE_CALL) return "ESM_DOWNLOAD_SERVER_REJECTED_THE_CALL";
      if (_aidl_v == ESM_CONTEXT_TRANSFERRED_DUE_TO_IRAT) return "ESM_CONTEXT_TRANSFERRED_DUE_TO_IRAT";
      if (_aidl_v == DS_EXPLICIT_DEACTIVATION) return "DS_EXPLICIT_DEACTIVATION";
      if (_aidl_v == ESM_LOCAL_CAUSE_NONE) return "ESM_LOCAL_CAUSE_NONE";
      if (_aidl_v == LTE_THROTTLING_NOT_REQUIRED) return "LTE_THROTTLING_NOT_REQUIRED";
      if (_aidl_v == ACCESS_CONTROL_LIST_CHECK_FAILURE) return "ACCESS_CONTROL_LIST_CHECK_FAILURE";
      if (_aidl_v == SERVICE_NOT_ALLOWED_ON_PLMN) return "SERVICE_NOT_ALLOWED_ON_PLMN";
      if (_aidl_v == EMM_T3417_EXPIRED) return "EMM_T3417_EXPIRED";
      if (_aidl_v == EMM_T3417_EXT_EXPIRED) return "EMM_T3417_EXT_EXPIRED";
      if (_aidl_v == RRC_UPLINK_DATA_TRANSMISSION_FAILURE) return "RRC_UPLINK_DATA_TRANSMISSION_FAILURE";
      if (_aidl_v == RRC_UPLINK_DELIVERY_FAILED_DUE_TO_HANDOVER) return "RRC_UPLINK_DELIVERY_FAILED_DUE_TO_HANDOVER";
      if (_aidl_v == RRC_UPLINK_CONNECTION_RELEASE) return "RRC_UPLINK_CONNECTION_RELEASE";
      if (_aidl_v == RRC_UPLINK_RADIO_LINK_FAILURE) return "RRC_UPLINK_RADIO_LINK_FAILURE";
      if (_aidl_v == RRC_UPLINK_ERROR_REQUEST_FROM_NAS) return "RRC_UPLINK_ERROR_REQUEST_FROM_NAS";
      if (_aidl_v == RRC_CONNECTION_ACCESS_STRATUM_FAILURE) return "RRC_CONNECTION_ACCESS_STRATUM_FAILURE";
      if (_aidl_v == RRC_CONNECTION_ANOTHER_PROCEDURE_IN_PROGRESS) return "RRC_CONNECTION_ANOTHER_PROCEDURE_IN_PROGRESS";
      if (_aidl_v == RRC_CONNECTION_ACCESS_BARRED) return "RRC_CONNECTION_ACCESS_BARRED";
      if (_aidl_v == RRC_CONNECTION_CELL_RESELECTION) return "RRC_CONNECTION_CELL_RESELECTION";
      if (_aidl_v == RRC_CONNECTION_CONFIG_FAILURE) return "RRC_CONNECTION_CONFIG_FAILURE";
      if (_aidl_v == RRC_CONNECTION_TIMER_EXPIRED) return "RRC_CONNECTION_TIMER_EXPIRED";
      if (_aidl_v == RRC_CONNECTION_LINK_FAILURE) return "RRC_CONNECTION_LINK_FAILURE";
      if (_aidl_v == RRC_CONNECTION_CELL_NOT_CAMPED) return "RRC_CONNECTION_CELL_NOT_CAMPED";
      if (_aidl_v == RRC_CONNECTION_SYSTEM_INTERVAL_FAILURE) return "RRC_CONNECTION_SYSTEM_INTERVAL_FAILURE";
      if (_aidl_v == RRC_CONNECTION_REJECT_BY_NETWORK) return "RRC_CONNECTION_REJECT_BY_NETWORK";
      if (_aidl_v == RRC_CONNECTION_NORMAL_RELEASE) return "RRC_CONNECTION_NORMAL_RELEASE";
      if (_aidl_v == RRC_CONNECTION_RADIO_LINK_FAILURE) return "RRC_CONNECTION_RADIO_LINK_FAILURE";
      if (_aidl_v == RRC_CONNECTION_REESTABLISHMENT_FAILURE) return "RRC_CONNECTION_REESTABLISHMENT_FAILURE";
      if (_aidl_v == RRC_CONNECTION_OUT_OF_SERVICE_DURING_CELL_REGISTER) return "RRC_CONNECTION_OUT_OF_SERVICE_DURING_CELL_REGISTER";
      if (_aidl_v == RRC_CONNECTION_ABORT_REQUEST) return "RRC_CONNECTION_ABORT_REQUEST";
      if (_aidl_v == RRC_CONNECTION_SYSTEM_INFORMATION_BLOCK_READ_ERROR) return "RRC_CONNECTION_SYSTEM_INFORMATION_BLOCK_READ_ERROR";
      if (_aidl_v == NETWORK_INITIATED_DETACH_WITH_AUTO_REATTACH) return "NETWORK_INITIATED_DETACH_WITH_AUTO_REATTACH";
      if (_aidl_v == NETWORK_INITIATED_DETACH_NO_AUTO_REATTACH) return "NETWORK_INITIATED_DETACH_NO_AUTO_REATTACH";
      if (_aidl_v == ESM_PROCEDURE_TIME_OUT) return "ESM_PROCEDURE_TIME_OUT";
      if (_aidl_v == INVALID_CONNECTION_ID) return "INVALID_CONNECTION_ID";
      if (_aidl_v == MAXIMIUM_NSAPIS_EXCEEDED) return "MAXIMIUM_NSAPIS_EXCEEDED";
      if (_aidl_v == INVALID_PRIMARY_NSAPI) return "INVALID_PRIMARY_NSAPI";
      if (_aidl_v == CANNOT_ENCODE_OTA_MESSAGE) return "CANNOT_ENCODE_OTA_MESSAGE";
      if (_aidl_v == RADIO_ACCESS_BEARER_SETUP_FAILURE) return "RADIO_ACCESS_BEARER_SETUP_FAILURE";
      if (_aidl_v == PDP_ESTABLISH_TIMEOUT_EXPIRED) return "PDP_ESTABLISH_TIMEOUT_EXPIRED";
      if (_aidl_v == PDP_MODIFY_TIMEOUT_EXPIRED) return "PDP_MODIFY_TIMEOUT_EXPIRED";
      if (_aidl_v == PDP_INACTIVE_TIMEOUT_EXPIRED) return "PDP_INACTIVE_TIMEOUT_EXPIRED";
      if (_aidl_v == PDP_LOWERLAYER_ERROR) return "PDP_LOWERLAYER_ERROR";
      if (_aidl_v == PDP_MODIFY_COLLISION) return "PDP_MODIFY_COLLISION";
      if (_aidl_v == MAXINUM_SIZE_OF_L2_MESSAGE_EXCEEDED) return "MAXINUM_SIZE_OF_L2_MESSAGE_EXCEEDED";
      if (_aidl_v == MAXIMUM_SIZE_OF_L2_MESSAGE_EXCEEDED) return "MAXIMUM_SIZE_OF_L2_MESSAGE_EXCEEDED";
      if (_aidl_v == NAS_REQUEST_REJECTED_BY_NETWORK) return "NAS_REQUEST_REJECTED_BY_NETWORK";
      if (_aidl_v == RRC_CONNECTION_INVALID_REQUEST) return "RRC_CONNECTION_INVALID_REQUEST";
      if (_aidl_v == RRC_CONNECTION_TRACKING_AREA_ID_CHANGED) return "RRC_CONNECTION_TRACKING_AREA_ID_CHANGED";
      if (_aidl_v == RRC_CONNECTION_RF_UNAVAILABLE) return "RRC_CONNECTION_RF_UNAVAILABLE";
      if (_aidl_v == RRC_CONNECTION_ABORTED_DUE_TO_IRAT_CHANGE) return "RRC_CONNECTION_ABORTED_DUE_TO_IRAT_CHANGE";
      if (_aidl_v == RRC_CONNECTION_RELEASED_SECURITY_NOT_ACTIVE) return "RRC_CONNECTION_RELEASED_SECURITY_NOT_ACTIVE";
      if (_aidl_v == RRC_CONNECTION_ABORTED_AFTER_HANDOVER) return "RRC_CONNECTION_ABORTED_AFTER_HANDOVER";
      if (_aidl_v == RRC_CONNECTION_ABORTED_AFTER_IRAT_CELL_CHANGE) return "RRC_CONNECTION_ABORTED_AFTER_IRAT_CELL_CHANGE";
      if (_aidl_v == RRC_CONNECTION_ABORTED_DURING_IRAT_CELL_CHANGE) return "RRC_CONNECTION_ABORTED_DURING_IRAT_CELL_CHANGE";
      if (_aidl_v == IMSI_UNKNOWN_IN_HOME_SUBSCRIBER_SERVER) return "IMSI_UNKNOWN_IN_HOME_SUBSCRIBER_SERVER";
      if (_aidl_v == IMEI_NOT_ACCEPTED) return "IMEI_NOT_ACCEPTED";
      if (_aidl_v == EPS_SERVICES_AND_NON_EPS_SERVICES_NOT_ALLOWED) return "EPS_SERVICES_AND_NON_EPS_SERVICES_NOT_ALLOWED";
      if (_aidl_v == EPS_SERVICES_NOT_ALLOWED_IN_PLMN) return "EPS_SERVICES_NOT_ALLOWED_IN_PLMN";
      if (_aidl_v == MSC_TEMPORARILY_NOT_REACHABLE) return "MSC_TEMPORARILY_NOT_REACHABLE";
      if (_aidl_v == CS_DOMAIN_NOT_AVAILABLE) return "CS_DOMAIN_NOT_AVAILABLE";
      if (_aidl_v == ESM_FAILURE) return "ESM_FAILURE";
      if (_aidl_v == MAC_FAILURE) return "MAC_FAILURE";
      if (_aidl_v == SYNCHRONIZATION_FAILURE) return "SYNCHRONIZATION_FAILURE";
      if (_aidl_v == UE_SECURITY_CAPABILITIES_MISMATCH) return "UE_SECURITY_CAPABILITIES_MISMATCH";
      if (_aidl_v == SECURITY_MODE_REJECTED) return "SECURITY_MODE_REJECTED";
      if (_aidl_v == UNACCEPTABLE_NON_EPS_AUTHENTICATION) return "UNACCEPTABLE_NON_EPS_AUTHENTICATION";
      if (_aidl_v == CS_FALLBACK_CALL_ESTABLISHMENT_NOT_ALLOWED) return "CS_FALLBACK_CALL_ESTABLISHMENT_NOT_ALLOWED";
      if (_aidl_v == NO_EPS_BEARER_CONTEXT_ACTIVATED) return "NO_EPS_BEARER_CONTEXT_ACTIVATED";
      if (_aidl_v == INVALID_EMM_STATE) return "INVALID_EMM_STATE";
      if (_aidl_v == NAS_LAYER_FAILURE) return "NAS_LAYER_FAILURE";
      if (_aidl_v == MULTIPLE_PDP_CALL_NOT_ALLOWED) return "MULTIPLE_PDP_CALL_NOT_ALLOWED";
      if (_aidl_v == EMBMS_NOT_ENABLED) return "EMBMS_NOT_ENABLED";
      if (_aidl_v == IRAT_HANDOVER_FAILED) return "IRAT_HANDOVER_FAILED";
      if (_aidl_v == EMBMS_REGULAR_DEACTIVATION) return "EMBMS_REGULAR_DEACTIVATION";
      if (_aidl_v == TEST_LOOPBACK_REGULAR_DEACTIVATION) return "TEST_LOOPBACK_REGULAR_DEACTIVATION";
      if (_aidl_v == LOWER_LAYER_REGISTRATION_FAILURE) return "LOWER_LAYER_REGISTRATION_FAILURE";
      if (_aidl_v == DATA_PLAN_EXPIRED) return "DATA_PLAN_EXPIRED";
      if (_aidl_v == UMTS_HANDOVER_TO_IWLAN) return "UMTS_HANDOVER_TO_IWLAN";
      if (_aidl_v == EVDO_CONNECTION_DENY_BY_GENERAL_OR_NETWORK_BUSY) return "EVDO_CONNECTION_DENY_BY_GENERAL_OR_NETWORK_BUSY";
      if (_aidl_v == EVDO_CONNECTION_DENY_BY_BILLING_OR_AUTHENTICATION_FAILURE) return "EVDO_CONNECTION_DENY_BY_BILLING_OR_AUTHENTICATION_FAILURE";
      if (_aidl_v == EVDO_HDR_CHANGED) return "EVDO_HDR_CHANGED";
      if (_aidl_v == EVDO_HDR_EXITED) return "EVDO_HDR_EXITED";
      if (_aidl_v == EVDO_HDR_NO_SESSION) return "EVDO_HDR_NO_SESSION";
      if (_aidl_v == EVDO_USING_GPS_FIX_INSTEAD_OF_HDR_CALL) return "EVDO_USING_GPS_FIX_INSTEAD_OF_HDR_CALL";
      if (_aidl_v == EVDO_HDR_CONNECTION_SETUP_TIMEOUT) return "EVDO_HDR_CONNECTION_SETUP_TIMEOUT";
      if (_aidl_v == FAILED_TO_ACQUIRE_COLOCATED_HDR) return "FAILED_TO_ACQUIRE_COLOCATED_HDR";
      if (_aidl_v == OTASP_COMMIT_IN_PROGRESS) return "OTASP_COMMIT_IN_PROGRESS";
      if (_aidl_v == NO_HYBRID_HDR_SERVICE) return "NO_HYBRID_HDR_SERVICE";
      if (_aidl_v == HDR_NO_LOCK_GRANTED) return "HDR_NO_LOCK_GRANTED";
      if (_aidl_v == DBM_OR_SMS_IN_PROGRESS) return "DBM_OR_SMS_IN_PROGRESS";
      if (_aidl_v == HDR_FADE) return "HDR_FADE";
      if (_aidl_v == HDR_ACCESS_FAILURE) return "HDR_ACCESS_FAILURE";
      if (_aidl_v == UNSUPPORTED_1X_PREV) return "UNSUPPORTED_1X_PREV";
      if (_aidl_v == LOCAL_END) return "LOCAL_END";
      if (_aidl_v == NO_SERVICE) return "NO_SERVICE";
      if (_aidl_v == FADE) return "FADE";
      if (_aidl_v == NORMAL_RELEASE) return "NORMAL_RELEASE";
      if (_aidl_v == ACCESS_ATTEMPT_ALREADY_IN_PROGRESS) return "ACCESS_ATTEMPT_ALREADY_IN_PROGRESS";
      if (_aidl_v == REDIRECTION_OR_HANDOFF_IN_PROGRESS) return "REDIRECTION_OR_HANDOFF_IN_PROGRESS";
      if (_aidl_v == EMERGENCY_MODE) return "EMERGENCY_MODE";
      if (_aidl_v == PHONE_IN_USE) return "PHONE_IN_USE";
      if (_aidl_v == INVALID_MODE) return "INVALID_MODE";
      if (_aidl_v == INVALID_SIM_STATE) return "INVALID_SIM_STATE";
      if (_aidl_v == NO_COLLOCATED_HDR) return "NO_COLLOCATED_HDR";
      if (_aidl_v == UE_IS_ENTERING_POWERSAVE_MODE) return "UE_IS_ENTERING_POWERSAVE_MODE";
      if (_aidl_v == DUAL_SWITCH) return "DUAL_SWITCH";
      if (_aidl_v == PPP_TIMEOUT) return "PPP_TIMEOUT";
      if (_aidl_v == PPP_AUTH_FAILURE) return "PPP_AUTH_FAILURE";
      if (_aidl_v == PPP_OPTION_MISMATCH) return "PPP_OPTION_MISMATCH";
      if (_aidl_v == PPP_PAP_FAILURE) return "PPP_PAP_FAILURE";
      if (_aidl_v == PPP_CHAP_FAILURE) return "PPP_CHAP_FAILURE";
      if (_aidl_v == PPP_CLOSE_IN_PROGRESS) return "PPP_CLOSE_IN_PROGRESS";
      if (_aidl_v == LIMITED_TO_IPV4) return "LIMITED_TO_IPV4";
      if (_aidl_v == LIMITED_TO_IPV6) return "LIMITED_TO_IPV6";
      if (_aidl_v == VSNCP_TIMEOUT) return "VSNCP_TIMEOUT";
      if (_aidl_v == VSNCP_GEN_ERROR) return "VSNCP_GEN_ERROR";
      if (_aidl_v == VSNCP_APN_UNAUTHORIZED) return "VSNCP_APN_UNAUTHORIZED";
      if (_aidl_v == VSNCP_PDN_LIMIT_EXCEEDED) return "VSNCP_PDN_LIMIT_EXCEEDED";
      if (_aidl_v == VSNCP_NO_PDN_GATEWAY_ADDRESS) return "VSNCP_NO_PDN_GATEWAY_ADDRESS";
      if (_aidl_v == VSNCP_PDN_GATEWAY_UNREACHABLE) return "VSNCP_PDN_GATEWAY_UNREACHABLE";
      if (_aidl_v == VSNCP_PDN_GATEWAY_REJECT) return "VSNCP_PDN_GATEWAY_REJECT";
      if (_aidl_v == VSNCP_INSUFFICIENT_PARAMETERS) return "VSNCP_INSUFFICIENT_PARAMETERS";
      if (_aidl_v == VSNCP_RESOURCE_UNAVAILABLE) return "VSNCP_RESOURCE_UNAVAILABLE";
      if (_aidl_v == VSNCP_ADMINISTRATIVELY_PROHIBITED) return "VSNCP_ADMINISTRATIVELY_PROHIBITED";
      if (_aidl_v == VSNCP_PDN_ID_IN_USE) return "VSNCP_PDN_ID_IN_USE";
      if (_aidl_v == VSNCP_SUBSCRIBER_LIMITATION) return "VSNCP_SUBSCRIBER_LIMITATION";
      if (_aidl_v == VSNCP_PDN_EXISTS_FOR_THIS_APN) return "VSNCP_PDN_EXISTS_FOR_THIS_APN";
      if (_aidl_v == VSNCP_RECONNECT_NOT_ALLOWED) return "VSNCP_RECONNECT_NOT_ALLOWED";
      if (_aidl_v == IPV6_PREFIX_UNAVAILABLE) return "IPV6_PREFIX_UNAVAILABLE";
      if (_aidl_v == HANDOFF_PREFERENCE_CHANGED) return "HANDOFF_PREFERENCE_CHANGED";
      if (_aidl_v == SLICE_REJECTED) return "SLICE_REJECTED";
      if (_aidl_v == MATCH_ALL_RULE_NOT_ALLOWED) return "MATCH_ALL_RULE_NOT_ALLOWED";
      if (_aidl_v == ALL_MATCHING_RULES_FAILED) return "ALL_MATCHING_RULES_FAILED";
      return Integer.toString(_aidl_v);
    }
    static String arrayToString(Object _aidl_v) {
      if (_aidl_v == null) return "null";
      Class<?> _aidl_cls = _aidl_v.getClass();
      if (!_aidl_cls.isArray()) throw new IllegalArgumentException("not an array: " + _aidl_v);
      Class<?> comp = _aidl_cls.getComponentType();
      java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "[", "]");
      if (comp.isArray()) {
        for (int _aidl_i = 0; _aidl_i < java.lang.reflect.Array.getLength(_aidl_v); _aidl_i++) {
          _aidl_sj.add(arrayToString(java.lang.reflect.Array.get(_aidl_v, _aidl_i)));
        }
      } else {
        if (_aidl_cls != int[].class) throw new IllegalArgumentException("wrong type: " + _aidl_cls);
        for (int e : (int[]) _aidl_v) {
          _aidl_sj.add(toString(e));
        }
      }
      return _aidl_sj.toString();
    }
  }
}
