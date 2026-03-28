/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/NasProtocolMessage.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/NasProtocolMessage.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * Each enum value represents a message type on the Non-Access Stratum (NAS). The relevant cellular
 * generation is noted for each message type. Sample spec references are provided, but generally
 * only reference one network generation's spec.
 * 
 * The exceptions to this rule are THREAT_IDENTIFIER_FALSE and THREAT_IDENTIIFER_TRUE, which are
 * included to accommodate threat ranking of disclosures based on modem logic.
 * 
 * @hide
 */
public @interface NasProtocolMessage {
  public static final int UNKNOWN = 0;
  // Sample Reference: 3GPP TS 24.301 8.2.4
  // Applies to 2g, 3g, and 4g networks
  public static final int ATTACH_REQUEST = 1;
  // Sample Reference: 3GPP TS 24.301 8.2.19
  // Applies to 2g, 3g, 4g, and 5g networks
  public static final int IDENTITY_RESPONSE = 2;
  // Sample Reference: 3GPP TS 24.301 8.2.11
  // Applies to 2g, 3g, and 4g networks
  public static final int DETACH_REQUEST = 3;
  // Sample Reference: 3GPP TS 24.301 8.2.29
  // Note: that per the spec, only temporary IDs should be sent
  // in the TAU Request, but since the EPS Mobile Identity field
  // supports IMSIs, this is included as an extra safety measure
  // to combat implementation bugs.
  // Applies to 4g and 5g networks
  public static final int TRACKING_AREA_UPDATE_REQUEST = 4;
  // Sample Reference: 3GPP TS 24.008 4.4.3
  // Applies to 2g and 3g networks
  public static final int LOCATION_UPDATE_REQUEST = 5;
  // Reference: 3GPP TS 24.008 4.7.7.1
  // Applies to 2g and 3g networks
  public static final int AUTHENTICATION_AND_CIPHERING_RESPONSE = 6;
  // Reference: 3GPP TS 24.501 8.2.6
  // Applies to 5g networks
  public static final int REGISTRATION_REQUEST = 7;
  // Reference: 3GPP TS 24.501 8.2.12
  // Applies to 5g networks
  public static final int DEREGISTRATION_REQUEST = 8;
  // Reference: 3GPP TS 24.008 9.2.4
  // Applies to 2g and 3g networks
  public static final int CM_REESTABLISHMENT_REQUEST = 9;
  // Reference: 3GPP TS 24.008 9.2.9
  // Applies to 2g and 3g networks
  public static final int CM_SERVICE_REQUEST = 10;
  // Reference: 3GPP TS 24.008 9.2.14
  // Applies to 2g and 3g networks. Used for circuit-switched detach.
  public static final int IMSI_DETACH_INDICATION = 11;
  // Vendor-specific enumeration to identify a disclosure as potentially benign.
  // Enables vendors to semantically define disclosures based on their own classification logic.
  public static final int THREAT_IDENTIFIER_FALSE = 12;
  // Vendor-specific enumeration to identify a disclosure as potentially harmful.
  // Enables vendors to semantically define disclosures based on their own classification logic.
  public static final int THREAT_IDENTIFIER_TRUE = 13;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == UNKNOWN) return "UNKNOWN";
      if (_aidl_v == ATTACH_REQUEST) return "ATTACH_REQUEST";
      if (_aidl_v == IDENTITY_RESPONSE) return "IDENTITY_RESPONSE";
      if (_aidl_v == DETACH_REQUEST) return "DETACH_REQUEST";
      if (_aidl_v == TRACKING_AREA_UPDATE_REQUEST) return "TRACKING_AREA_UPDATE_REQUEST";
      if (_aidl_v == LOCATION_UPDATE_REQUEST) return "LOCATION_UPDATE_REQUEST";
      if (_aidl_v == AUTHENTICATION_AND_CIPHERING_RESPONSE) return "AUTHENTICATION_AND_CIPHERING_RESPONSE";
      if (_aidl_v == REGISTRATION_REQUEST) return "REGISTRATION_REQUEST";
      if (_aidl_v == DEREGISTRATION_REQUEST) return "DEREGISTRATION_REQUEST";
      if (_aidl_v == CM_REESTABLISHMENT_REQUEST) return "CM_REESTABLISHMENT_REQUEST";
      if (_aidl_v == CM_SERVICE_REQUEST) return "CM_SERVICE_REQUEST";
      if (_aidl_v == IMSI_DETACH_INDICATION) return "IMSI_DETACH_INDICATION";
      if (_aidl_v == THREAT_IDENTIFIER_FALSE) return "THREAT_IDENTIFIER_FALSE";
      if (_aidl_v == THREAT_IDENTIFIER_TRUE) return "THREAT_IDENTIFIER_TRUE";
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
