/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio/4 --previous_hash f6e4f3bf2ea241a74ffac5643f8941921f0a2b98 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio-V5-java-source/gen/android/hardware/radio/AccessNetwork.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/AccessNetwork.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio;
/** @hide */
public @interface AccessNetwork {
  /** Unknown access network */
  public static final int UNKNOWN = 0;
  /** GSM EDGE Radio Access Network */
  public static final int GERAN = 1;
  /** Universal Terrestrial Radio Access Network */
  public static final int UTRAN = 2;
  /** Evolved Universal Terrestrial Radio Access Network */
  public static final int EUTRAN = 3;
  /**
   * CDMA 2000 network
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int CDMA2000 = 4;
  /** Interworking Wireless LAN */
  public static final int IWLAN = 5;
  /**
   * Next-Generation Radio Access Network (NGRAN).
   * Note NGRAN is only for standalone mode. Non-standalone mode uses AccessNetwork EUTRAN.
   */
  public static final int NGRAN = 6;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == UNKNOWN) return "UNKNOWN";
      if (_aidl_v == GERAN) return "GERAN";
      if (_aidl_v == UTRAN) return "UTRAN";
      if (_aidl_v == EUTRAN) return "EUTRAN";
      if (_aidl_v == CDMA2000) return "CDMA2000";
      if (_aidl_v == IWLAN) return "IWLAN";
      if (_aidl_v == NGRAN) return "NGRAN";
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
