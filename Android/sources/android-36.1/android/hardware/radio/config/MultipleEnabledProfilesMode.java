/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/4 --previous_hash fc7eeb47f5238e538dead4af7575507920c359f7 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen/android/hardware/radio/config/MultipleEnabledProfilesMode.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/config/MultipleEnabledProfilesMode.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.config;
/**
 * Multiple Enabled Profiles(MEP) mode is the jointly supported MEP mode. As per section 3.4.1.1 of
 * GSMA spec SGP.22 v3.0,there are 3 supported MEP modes: MEP-A1, MEP-A2 and MEP-B.
 * If there is no jointly supported MEP mode, supported MEP mode is set to NONE.
 * @hide
 */
public @interface MultipleEnabledProfilesMode {
  /** If there is no jointly supported MEP mode, set supported MEP mode to NONE. */
  public static final int NONE = 0;
  /**
   * In case of MEP-A1, the ISD-R is selected on eSIM port 0 only and profiles are selected on
   * eSIM ports 1 and higher, with the eSIM port being assigned by the LPA or platform.
   */
  public static final int MEP_A1 = 1;
  /**
   * In case of MEP-A2, the ISD-R is selected on eSIM port 0 only and profiles are selected on
   * eSIM ports 1 and higher, with the eSIM port being assigned by the eUICC.
   */
  public static final int MEP_A2 = 2;
  /**
   * In case of MEP-B, profiles are selected on eSIM ports 0 and higher, with the ISD-R being
   * selectable on any of these eSIM ports.
   */
  public static final int MEP_B = 3;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NONE) return "NONE";
      if (_aidl_v == MEP_A1) return "MEP_A1";
      if (_aidl_v == MEP_A2) return "MEP_A2";
      if (_aidl_v == MEP_B) return "MEP_B";
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
