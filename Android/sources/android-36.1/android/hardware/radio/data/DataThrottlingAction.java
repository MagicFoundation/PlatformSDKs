/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/DataThrottlingAction.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/DataThrottlingAction.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/** @hide */
public @interface DataThrottlingAction {
  /** Clear all existing data throttling. */
  public static final byte NO_DATA_THROTTLING = 0;
  /**
   * Enact secondary carrier data throttling and remove any existing data throttling on
   * anchor carrier.
   */
  public static final byte THROTTLE_SECONDARY_CARRIER = 1;
  /**
   * Enact anchor carrier data throttling and disable data on secondary carrier if currently
   * enabled.
   */
  public static final byte THROTTLE_ANCHOR_CARRIER = 2;
  /** Immediately hold on to current level of throttling. */
  public static final byte HOLD = 3;
  interface $ {
    static String toString(byte _aidl_v) {
      if (_aidl_v == NO_DATA_THROTTLING) return "NO_DATA_THROTTLING";
      if (_aidl_v == THROTTLE_SECONDARY_CARRIER) return "THROTTLE_SECONDARY_CARRIER";
      if (_aidl_v == THROTTLE_ANCHOR_CARRIER) return "THROTTLE_ANCHOR_CARRIER";
      if (_aidl_v == HOLD) return "HOLD";
      return Byte.toString(_aidl_v);
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
        if (_aidl_cls != byte[].class) throw new IllegalArgumentException("wrong type: " + _aidl_cls);
        for (byte e : (byte[]) _aidl_v) {
          _aidl_sj.add(toString(e));
        }
      }
      return _aidl_sj.toString();
    }
  }
}
