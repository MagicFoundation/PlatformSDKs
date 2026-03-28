/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/RadioBandMode.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/RadioBandMode.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public @interface RadioBandMode {
  /** "Unspecified" (selected by baseband automatically) */
  public static final int BAND_MODE_UNSPECIFIED = 0;
  /** "EURO band" (GSM-900 / DCS-1800 / WCDMA-IMT-2000) */
  public static final int BAND_MODE_EURO = 1;
  /** "US band" (GSM-850 / PCS-1900 / WCDMA-850 / WCDMA-PCS-1900) */
  public static final int BAND_MODE_USA = 2;
  /** "JPN band" (WCDMA-800 / WCDMA-IMT-2000) */
  public static final int BAND_MODE_JPN = 3;
  /** "AUS band" (GSM-900 / DCS-1800 / WCDMA-850 / WCDMA-IMT-2000) */
  public static final int BAND_MODE_AUS = 4;
  /** "AUS band 2" (GSM-900 / DCS-1800 / WCDMA-850) */
  public static final int BAND_MODE_AUS_2 = 5;
  /** "Cellular" (800-MHz Band) */
  public static final int BAND_MODE_CELL_800 = 6;
  /** "PCS" (1900-MHz Band) */
  public static final int BAND_MODE_PCS = 7;
  /** "Band Class 3" (JTACS Band) */
  public static final int BAND_MODE_JTACS = 8;
  /** "Band Class 4" (Korean PCS Band) */
  public static final int BAND_MODE_KOREA_PCS = 9;
  /** "Band Class 5" (450-MHz Band) */
  public static final int BAND_MODE_5_450M = 10;
  /** "Band Class 6" (2-GMHz IMT2000 Band) */
  public static final int BAND_MODE_IMT2000 = 11;
  /** "Band Class 7" (Upper 700-MHz Band) */
  public static final int BAND_MODE_7_700M_2 = 12;
  /** "Band Class 8" (1800-MHz Band) */
  public static final int BAND_MODE_8_1800M = 13;
  /** "Band Class 9" (900-MHz Band) */
  public static final int BAND_MODE_9_900M = 14;
  /** "Band Class 10" (Secondary 800-MHz Band) */
  public static final int BAND_MODE_10_800M_2 = 15;
  /** "Band Class 11" (400-MHz European PAMR Band) */
  public static final int BAND_MODE_EURO_PAMR_400M = 16;
  /** "Band Class 15" (AWS Band) */
  public static final int BAND_MODE_AWS = 17;
  /** "Band Class 16" (US 2.5-GHz Band) */
  public static final int BAND_MODE_USA_2500M = 18;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == BAND_MODE_UNSPECIFIED) return "BAND_MODE_UNSPECIFIED";
      if (_aidl_v == BAND_MODE_EURO) return "BAND_MODE_EURO";
      if (_aidl_v == BAND_MODE_USA) return "BAND_MODE_USA";
      if (_aidl_v == BAND_MODE_JPN) return "BAND_MODE_JPN";
      if (_aidl_v == BAND_MODE_AUS) return "BAND_MODE_AUS";
      if (_aidl_v == BAND_MODE_AUS_2) return "BAND_MODE_AUS_2";
      if (_aidl_v == BAND_MODE_CELL_800) return "BAND_MODE_CELL_800";
      if (_aidl_v == BAND_MODE_PCS) return "BAND_MODE_PCS";
      if (_aidl_v == BAND_MODE_JTACS) return "BAND_MODE_JTACS";
      if (_aidl_v == BAND_MODE_KOREA_PCS) return "BAND_MODE_KOREA_PCS";
      if (_aidl_v == BAND_MODE_5_450M) return "BAND_MODE_5_450M";
      if (_aidl_v == BAND_MODE_IMT2000) return "BAND_MODE_IMT2000";
      if (_aidl_v == BAND_MODE_7_700M_2) return "BAND_MODE_7_700M_2";
      if (_aidl_v == BAND_MODE_8_1800M) return "BAND_MODE_8_1800M";
      if (_aidl_v == BAND_MODE_9_900M) return "BAND_MODE_9_900M";
      if (_aidl_v == BAND_MODE_10_800M_2) return "BAND_MODE_10_800M_2";
      if (_aidl_v == BAND_MODE_EURO_PAMR_400M) return "BAND_MODE_EURO_PAMR_400M";
      if (_aidl_v == BAND_MODE_AWS) return "BAND_MODE_AWS";
      if (_aidl_v == BAND_MODE_USA_2500M) return "BAND_MODE_USA_2500M";
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
