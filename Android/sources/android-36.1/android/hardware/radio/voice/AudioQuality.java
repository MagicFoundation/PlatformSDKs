/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/4 --previous_hash 576f05d082e9269bcf773b0c9b9112d507ab4b9a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen/android/hardware/radio/voice/AudioQuality.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/voice/AudioQuality.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/**
 * Audio codec which is used on GSM, UMTS, and CDMA. These values must be opaque to the Android
 * framework. Only for display.
 * @hide
 */
public @interface AudioQuality {
  /** Unspecified audio codec */
  public static final int UNSPECIFIED = 0;
  /** AMR (Narrowband) audio codec */
  public static final int AMR = 1;
  /** AMR (Wideband) audio codec */
  public static final int AMR_WB = 2;
  /** GSM Enhanced Full-Rate audio codec */
  public static final int GSM_EFR = 3;
  /** GSM Full-Rate audio codec */
  public static final int GSM_FR = 4;
  /** GSM Half-Rate audio codec */
  public static final int GSM_HR = 5;
  /** Enhanced Variable rate codec */
  public static final int EVRC = 6;
  /** Enhanced Variable rate codec revision B */
  public static final int EVRC_B = 7;
  /** Enhanced Variable rate codec (Wideband) */
  public static final int EVRC_WB = 8;
  /** Enhanced Variable rate codec (Narrowband) */
  public static final int EVRC_NW = 9;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == UNSPECIFIED) return "UNSPECIFIED";
      if (_aidl_v == AMR) return "AMR";
      if (_aidl_v == AMR_WB) return "AMR_WB";
      if (_aidl_v == GSM_EFR) return "GSM_EFR";
      if (_aidl_v == GSM_FR) return "GSM_FR";
      if (_aidl_v == GSM_HR) return "GSM_HR";
      if (_aidl_v == EVRC) return "EVRC";
      if (_aidl_v == EVRC_B) return "EVRC_B";
      if (_aidl_v == EVRC_WB) return "EVRC_WB";
      if (_aidl_v == EVRC_NW) return "EVRC_NW";
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
