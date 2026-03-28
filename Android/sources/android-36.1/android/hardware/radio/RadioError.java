/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/4 --previous_hash f6e4f3bf2ea241a74ffac5643f8941921f0a2b98 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio-V5-java-source/gen/android/hardware/radio/RadioError.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/RadioError.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio;
/** @hide */
public @interface RadioError {
  /** Success */
  public static final int NONE = 0;
  /** If radio did not start or is resetting */
  public static final int RADIO_NOT_AVAILABLE = 1;
  public static final int GENERIC_FAILURE = 2;
  /** For PIN/PIN2 methods only */
  public static final int PASSWORD_INCORRECT = 3;
  /** Operation requires SIM PIN2 to be entered */
  public static final int SIM_PIN2 = 4;
  /** Operation requires SIM PUK2 to be entered */
  public static final int SIM_PUK2 = 5;
  /** Optional API */
  public static final int REQUEST_NOT_SUPPORTED = 6;
  public static final int CANCELLED = 7;
  /** Data ops are not allowed during voice call on a Class C GPRS device */
  public static final int OP_NOT_ALLOWED_DURING_VOICE_CALL = 8;
  /** Data ops are not allowed before device registers in network */
  public static final int OP_NOT_ALLOWED_BEFORE_REG_TO_NW = 9;
  /** Fail to send SMS and need to retry */
  public static final int SMS_SEND_FAIL_RETRY = 10;
  /** SIM or RUIM card absent */
  public static final int SIM_ABSENT = 11;
  /** Failed to find subscription from specified location */
  public static final int SUBSCRIPTION_NOT_AVAILABLE = 12;
  /** HW does not support preferred network type */
  public static final int MODE_NOT_SUPPORTED = 13;
  /** Command failed because recipient is not on FDN list */
  public static final int FDN_CHECK_FAILURE = 14;
  /** Network selection failed due to illegal SIM or ME */
  public static final int ILLEGAL_SIM_OR_ME = 15;
  /** No logical channel available */
  public static final int MISSING_RESOURCE = 16;
  /** Application not found on SIM */
  public static final int NO_SUCH_ELEMENT = 17;
  /** DIAL request modified to USSD */
  public static final int DIAL_MODIFIED_TO_USSD = 18;
  /** DIAL request modified to SS */
  public static final int DIAL_MODIFIED_TO_SS = 19;
  /** DIAL request modified to DIAL with different data */
  public static final int DIAL_MODIFIED_TO_DIAL = 20;
  /** USSD request modified to DIAL */
  public static final int USSD_MODIFIED_TO_DIAL = 21;
  /** USSD request modified to SS */
  public static final int USSD_MODIFIED_TO_SS = 22;
  /** USSD request modified to different USSD request */
  public static final int USSD_MODIFIED_TO_USSD = 23;
  /** SS request modified to DIAL */
  public static final int SS_MODIFIED_TO_DIAL = 24;
  /** SS request modified to USSD */
  public static final int SS_MODIFIED_TO_USSD = 25;
  /** Subscription not supported by RIL */
  public static final int SUBSCRIPTION_NOT_SUPPORTED = 26;
  /** SS request modified to different SS request */
  public static final int SS_MODIFIED_TO_SS = 27;
  /** LCE service not supported(36 in RILConstants.java) */
  public static final int LCE_NOT_SUPPORTED = 36;
  /** Not sufficient memory to process the request */
  public static final int NO_MEMORY = 37;
  /** Modem hit unexpected error scenario while handling this request */
  public static final int INTERNAL_ERR = 38;
  /** Hit platform or system error */
  public static final int SYSTEM_ERR = 39;
  /** Vendor RIL got unexpected or incorrect response from modem for this request */
  public static final int MODEM_ERR = 40;
  /** Unexpected request for the current state */
  public static final int INVALID_STATE = 41;
  /** Not sufficient resource to process the request */
  public static final int NO_RESOURCES = 42;
  /** Received error from SIM card */
  public static final int SIM_ERR = 43;
  /** Received invalid arguments in request */
  public static final int INVALID_ARGUMENTS = 44;
  /** Cannot process the request in current SIM state */
  public static final int INVALID_SIM_STATE = 45;
  /** Cannot process the request in current modem state */
  public static final int INVALID_MODEM_STATE = 46;
  /** Received invalid call ID in request */
  public static final int INVALID_CALL_ID = 47;
  /** ACK received when there is no SMS to ack */
  public static final int NO_SMS_TO_ACK = 48;
  /**
   * Received error from network. This generic error code should be used only when the error
   * cannot be mapped to other specific network error codes.
   */
  public static final int NETWORK_ERR = 49;
  /** Operation denied due to overly-frequent requests */
  public static final int REQUEST_RATE_LIMITED = 50;
  /** SIM is busy */
  public static final int SIM_BUSY = 51;
  /** The target EF is full */
  public static final int SIM_FULL = 52;
  /** Request is rejected by network */
  public static final int NETWORK_REJECT = 53;
  /** Not allowed the request not */
  public static final int OPERATION_NOT_ALLOWED = 54;
  /** The request record is empty */
  public static final int EMPTY_RECORD = 55;
  /** Invalid SMS format */
  public static final int INVALID_SMS_FORMAT = 56;
  /** Message not encoded properly */
  public static final int ENCODING_ERR = 57;
  /** SMSC address specified is invalid */
  public static final int INVALID_SMSC_ADDRESS = 58;
  /** No such entry present to perform the request */
  public static final int NO_SUCH_ENTRY = 59;
  /** Network is not ready to perform the request */
  public static final int NETWORK_NOT_READY = 60;
  /** Device does not have this value provisioned */
  public static final int NOT_PROVISIONED = 61;
  /** Device does not have subscription */
  public static final int NO_SUBSCRIPTION = 62;
  /** Network cannot be found */
  public static final int NO_NETWORK_FOUND = 63;
  /** Operation cannot be performed because the device is currently in use */
  public static final int DEVICE_IN_USE = 64;
  /** Operation aborted */
  public static final int ABORTED = 65;
  /** Response from vendor had invalid data */
  public static final int INVALID_RESPONSE = 66;
  public static final int OEM_ERROR_1 = 501;
  public static final int OEM_ERROR_2 = 502;
  public static final int OEM_ERROR_3 = 503;
  public static final int OEM_ERROR_4 = 504;
  public static final int OEM_ERROR_5 = 505;
  public static final int OEM_ERROR_6 = 506;
  public static final int OEM_ERROR_7 = 507;
  public static final int OEM_ERROR_8 = 508;
  public static final int OEM_ERROR_9 = 509;
  public static final int OEM_ERROR_10 = 510;
  public static final int OEM_ERROR_11 = 511;
  public static final int OEM_ERROR_12 = 512;
  public static final int OEM_ERROR_13 = 513;
  public static final int OEM_ERROR_14 = 514;
  public static final int OEM_ERROR_15 = 515;
  public static final int OEM_ERROR_16 = 516;
  public static final int OEM_ERROR_17 = 517;
  public static final int OEM_ERROR_18 = 518;
  public static final int OEM_ERROR_19 = 519;
  public static final int OEM_ERROR_20 = 520;
  public static final int OEM_ERROR_21 = 521;
  public static final int OEM_ERROR_22 = 522;
  public static final int OEM_ERROR_23 = 523;
  public static final int OEM_ERROR_24 = 524;
  public static final int OEM_ERROR_25 = 525;
  /** 1X voice and SMS are not allowed simultaneously. */
  public static final int SIMULTANEOUS_SMS_AND_CALL_NOT_ALLOWED = 67;
  /** Access is barred. */
  public static final int ACCESS_BARRED = 68;
  /**
   * SMS is blocked due to call control, e.g., resource unavailable
   * in the SMR entity.
   */
  public static final int BLOCKED_DUE_TO_CALL = 69;
  /**
   * Returned from setRadioPowerResponse when detecting RF HW issues. Some RF Front-End (RFFE)
   * components like antennas are considered critical for modem to provide telephony service.
   * This RadioError is used when modem detects such RFFE problems.
   */
  public static final int RF_HARDWARE_ISSUE = 70;
  /**
   * Returned from setRadioPowerResponse when detecting no RF calibration issue.
   * Unlike RF_HARDWARE_ISSUE, this is a SW problem and no HW repair is needed.
   */
  public static final int NO_RF_CALIBRATION_INFO = 71;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NONE) return "NONE";
      if (_aidl_v == RADIO_NOT_AVAILABLE) return "RADIO_NOT_AVAILABLE";
      if (_aidl_v == GENERIC_FAILURE) return "GENERIC_FAILURE";
      if (_aidl_v == PASSWORD_INCORRECT) return "PASSWORD_INCORRECT";
      if (_aidl_v == SIM_PIN2) return "SIM_PIN2";
      if (_aidl_v == SIM_PUK2) return "SIM_PUK2";
      if (_aidl_v == REQUEST_NOT_SUPPORTED) return "REQUEST_NOT_SUPPORTED";
      if (_aidl_v == CANCELLED) return "CANCELLED";
      if (_aidl_v == OP_NOT_ALLOWED_DURING_VOICE_CALL) return "OP_NOT_ALLOWED_DURING_VOICE_CALL";
      if (_aidl_v == OP_NOT_ALLOWED_BEFORE_REG_TO_NW) return "OP_NOT_ALLOWED_BEFORE_REG_TO_NW";
      if (_aidl_v == SMS_SEND_FAIL_RETRY) return "SMS_SEND_FAIL_RETRY";
      if (_aidl_v == SIM_ABSENT) return "SIM_ABSENT";
      if (_aidl_v == SUBSCRIPTION_NOT_AVAILABLE) return "SUBSCRIPTION_NOT_AVAILABLE";
      if (_aidl_v == MODE_NOT_SUPPORTED) return "MODE_NOT_SUPPORTED";
      if (_aidl_v == FDN_CHECK_FAILURE) return "FDN_CHECK_FAILURE";
      if (_aidl_v == ILLEGAL_SIM_OR_ME) return "ILLEGAL_SIM_OR_ME";
      if (_aidl_v == MISSING_RESOURCE) return "MISSING_RESOURCE";
      if (_aidl_v == NO_SUCH_ELEMENT) return "NO_SUCH_ELEMENT";
      if (_aidl_v == DIAL_MODIFIED_TO_USSD) return "DIAL_MODIFIED_TO_USSD";
      if (_aidl_v == DIAL_MODIFIED_TO_SS) return "DIAL_MODIFIED_TO_SS";
      if (_aidl_v == DIAL_MODIFIED_TO_DIAL) return "DIAL_MODIFIED_TO_DIAL";
      if (_aidl_v == USSD_MODIFIED_TO_DIAL) return "USSD_MODIFIED_TO_DIAL";
      if (_aidl_v == USSD_MODIFIED_TO_SS) return "USSD_MODIFIED_TO_SS";
      if (_aidl_v == USSD_MODIFIED_TO_USSD) return "USSD_MODIFIED_TO_USSD";
      if (_aidl_v == SS_MODIFIED_TO_DIAL) return "SS_MODIFIED_TO_DIAL";
      if (_aidl_v == SS_MODIFIED_TO_USSD) return "SS_MODIFIED_TO_USSD";
      if (_aidl_v == SUBSCRIPTION_NOT_SUPPORTED) return "SUBSCRIPTION_NOT_SUPPORTED";
      if (_aidl_v == SS_MODIFIED_TO_SS) return "SS_MODIFIED_TO_SS";
      if (_aidl_v == LCE_NOT_SUPPORTED) return "LCE_NOT_SUPPORTED";
      if (_aidl_v == NO_MEMORY) return "NO_MEMORY";
      if (_aidl_v == INTERNAL_ERR) return "INTERNAL_ERR";
      if (_aidl_v == SYSTEM_ERR) return "SYSTEM_ERR";
      if (_aidl_v == MODEM_ERR) return "MODEM_ERR";
      if (_aidl_v == INVALID_STATE) return "INVALID_STATE";
      if (_aidl_v == NO_RESOURCES) return "NO_RESOURCES";
      if (_aidl_v == SIM_ERR) return "SIM_ERR";
      if (_aidl_v == INVALID_ARGUMENTS) return "INVALID_ARGUMENTS";
      if (_aidl_v == INVALID_SIM_STATE) return "INVALID_SIM_STATE";
      if (_aidl_v == INVALID_MODEM_STATE) return "INVALID_MODEM_STATE";
      if (_aidl_v == INVALID_CALL_ID) return "INVALID_CALL_ID";
      if (_aidl_v == NO_SMS_TO_ACK) return "NO_SMS_TO_ACK";
      if (_aidl_v == NETWORK_ERR) return "NETWORK_ERR";
      if (_aidl_v == REQUEST_RATE_LIMITED) return "REQUEST_RATE_LIMITED";
      if (_aidl_v == SIM_BUSY) return "SIM_BUSY";
      if (_aidl_v == SIM_FULL) return "SIM_FULL";
      if (_aidl_v == NETWORK_REJECT) return "NETWORK_REJECT";
      if (_aidl_v == OPERATION_NOT_ALLOWED) return "OPERATION_NOT_ALLOWED";
      if (_aidl_v == EMPTY_RECORD) return "EMPTY_RECORD";
      if (_aidl_v == INVALID_SMS_FORMAT) return "INVALID_SMS_FORMAT";
      if (_aidl_v == ENCODING_ERR) return "ENCODING_ERR";
      if (_aidl_v == INVALID_SMSC_ADDRESS) return "INVALID_SMSC_ADDRESS";
      if (_aidl_v == NO_SUCH_ENTRY) return "NO_SUCH_ENTRY";
      if (_aidl_v == NETWORK_NOT_READY) return "NETWORK_NOT_READY";
      if (_aidl_v == NOT_PROVISIONED) return "NOT_PROVISIONED";
      if (_aidl_v == NO_SUBSCRIPTION) return "NO_SUBSCRIPTION";
      if (_aidl_v == NO_NETWORK_FOUND) return "NO_NETWORK_FOUND";
      if (_aidl_v == DEVICE_IN_USE) return "DEVICE_IN_USE";
      if (_aidl_v == ABORTED) return "ABORTED";
      if (_aidl_v == INVALID_RESPONSE) return "INVALID_RESPONSE";
      if (_aidl_v == OEM_ERROR_1) return "OEM_ERROR_1";
      if (_aidl_v == OEM_ERROR_2) return "OEM_ERROR_2";
      if (_aidl_v == OEM_ERROR_3) return "OEM_ERROR_3";
      if (_aidl_v == OEM_ERROR_4) return "OEM_ERROR_4";
      if (_aidl_v == OEM_ERROR_5) return "OEM_ERROR_5";
      if (_aidl_v == OEM_ERROR_6) return "OEM_ERROR_6";
      if (_aidl_v == OEM_ERROR_7) return "OEM_ERROR_7";
      if (_aidl_v == OEM_ERROR_8) return "OEM_ERROR_8";
      if (_aidl_v == OEM_ERROR_9) return "OEM_ERROR_9";
      if (_aidl_v == OEM_ERROR_10) return "OEM_ERROR_10";
      if (_aidl_v == OEM_ERROR_11) return "OEM_ERROR_11";
      if (_aidl_v == OEM_ERROR_12) return "OEM_ERROR_12";
      if (_aidl_v == OEM_ERROR_13) return "OEM_ERROR_13";
      if (_aidl_v == OEM_ERROR_14) return "OEM_ERROR_14";
      if (_aidl_v == OEM_ERROR_15) return "OEM_ERROR_15";
      if (_aidl_v == OEM_ERROR_16) return "OEM_ERROR_16";
      if (_aidl_v == OEM_ERROR_17) return "OEM_ERROR_17";
      if (_aidl_v == OEM_ERROR_18) return "OEM_ERROR_18";
      if (_aidl_v == OEM_ERROR_19) return "OEM_ERROR_19";
      if (_aidl_v == OEM_ERROR_20) return "OEM_ERROR_20";
      if (_aidl_v == OEM_ERROR_21) return "OEM_ERROR_21";
      if (_aidl_v == OEM_ERROR_22) return "OEM_ERROR_22";
      if (_aidl_v == OEM_ERROR_23) return "OEM_ERROR_23";
      if (_aidl_v == OEM_ERROR_24) return "OEM_ERROR_24";
      if (_aidl_v == OEM_ERROR_25) return "OEM_ERROR_25";
      if (_aidl_v == SIMULTANEOUS_SMS_AND_CALL_NOT_ALLOWED) return "SIMULTANEOUS_SMS_AND_CALL_NOT_ALLOWED";
      if (_aidl_v == ACCESS_BARRED) return "ACCESS_BARRED";
      if (_aidl_v == BLOCKED_DUE_TO_CALL) return "BLOCKED_DUE_TO_CALL";
      if (_aidl_v == RF_HARDWARE_ISSUE) return "RF_HARDWARE_ISSUE";
      if (_aidl_v == NO_RF_CALIBRATION_INFO) return "NO_RF_CALIBRATION_INFO";
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
