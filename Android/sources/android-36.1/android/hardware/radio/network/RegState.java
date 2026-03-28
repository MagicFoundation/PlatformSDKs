/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/RegState.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/RegState.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * Please note that registration state UNKNOWN is treated as "out of service" in Android telephony.
 * Registration state REG_DENIED must be returned if Location Update Reject (with cause 17 - Network
 * Failure) is received repeatedly from the network, to facilitate "managed roaming".
 * @hide
 */
public @interface RegState {
  /** Not registered, MT is not currently searching for a new operator to register */
  public static final int NOT_REG_MT_NOT_SEARCHING_OP = 0;
  /** Registered, home network */
  public static final int REG_HOME = 1;
  /** Not registered, but MT is currently searching for a new operator to register */
  public static final int NOT_REG_MT_SEARCHING_OP = 2;
  /** Registration denied */
  public static final int REG_DENIED = 3;
  /** Unknown */
  public static final int UNKNOWN = 4;
  /** Registered, roaming */
  public static final int REG_ROAMING = 5;
  /** Same as NOT_REG_MT_NOT_SEARCHING_OP but indicates that emergency calls are enabled */
  public static final int NOT_REG_MT_NOT_SEARCHING_OP_EM = 10;
  /** Same as NOT_REG_MT_SEARCHING_OP but indicates that emergency calls are enabled */
  public static final int NOT_REG_MT_SEARCHING_OP_EM = 12;
  /** Same as REG_DENIED but indicates that emergency calls are enabled */
  public static final int REG_DENIED_EM = 13;
  /** Same as UNKNOWN but indicates that emergency calls are enabled */
  public static final int UNKNOWN_EM = 14;
  /**
   * Emergency attached in EPS or in 5GS.
   * Reference: 3GPP TS 24.301 9.9.3.11 EPS attach type.
   * Reference: 3GPP TS 24.501 9.11.3.6 5GS registration result.
   */
  public static final int REG_EM = 20;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NOT_REG_MT_NOT_SEARCHING_OP) return "NOT_REG_MT_NOT_SEARCHING_OP";
      if (_aidl_v == REG_HOME) return "REG_HOME";
      if (_aidl_v == NOT_REG_MT_SEARCHING_OP) return "NOT_REG_MT_SEARCHING_OP";
      if (_aidl_v == REG_DENIED) return "REG_DENIED";
      if (_aidl_v == UNKNOWN) return "UNKNOWN";
      if (_aidl_v == REG_ROAMING) return "REG_ROAMING";
      if (_aidl_v == NOT_REG_MT_NOT_SEARCHING_OP_EM) return "NOT_REG_MT_NOT_SEARCHING_OP_EM";
      if (_aidl_v == NOT_REG_MT_SEARCHING_OP_EM) return "NOT_REG_MT_SEARCHING_OP_EM";
      if (_aidl_v == REG_DENIED_EM) return "REG_DENIED_EM";
      if (_aidl_v == UNKNOWN_EM) return "UNKNOWN_EM";
      if (_aidl_v == REG_EM) return "REG_EM";
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
