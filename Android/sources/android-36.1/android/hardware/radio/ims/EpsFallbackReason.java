/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 4 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.ims/3 --previous_hash b2a615a151c7114c4216b1987fd32d40c797d00a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen/android/hardware/radio/ims/EpsFallbackReason.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/ims/EpsFallbackReason.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.ims;
/** @hide */
public @interface EpsFallbackReason {
  /**
   * If VoNR is not supported and EPS fallback is not triggered by network then UE initiated EPS
   * fallback would be triggered by IMS stack with this reason. The modem shall locally release
   * the 5G NR SA RRC connection and acquire the LTE network and perform a tracking area update
   * procedure. After the EPS fallback procedure is completed, the call setup for voice will
   * be established.
   */
  public static final int NO_NETWORK_TRIGGER = 1;
  /**
   * If the UE doesn't receive any response for SIP INVITE within a certain time in 5G NR SA,
   * UE initiated EPS fallback will be triggered with this reason. The modem shall reset its data
   * buffer of IMS PDUs to prevent the ghost call. After the EPS fallback procedure is completed,
   * the VoLTE call will be established.
   */
  public static final int NO_NETWORK_RESPONSE = 2;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NO_NETWORK_TRIGGER) return "NO_NETWORK_TRIGGER";
      if (_aidl_v == NO_NETWORK_RESPONSE) return "NO_NETWORK_RESPONSE";
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
