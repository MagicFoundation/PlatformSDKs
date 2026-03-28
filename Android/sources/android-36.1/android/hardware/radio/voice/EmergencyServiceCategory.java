/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/4 --previous_hash 576f05d082e9269bcf773b0c9b9112d507ab4b9a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen/android/hardware/radio/voice/EmergencyServiceCategory.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/voice/EmergencyServiceCategory.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/**
 * Defining Emergency Service Category as follows:
 * - General emergency call, all categories;
 * - Police;
 * - Ambulance;
 * - Fire Brigade;
 * - Marine Guard;
 * - Mountain Rescue;
 * - Manually Initiated eCall (MIeC);
 * - Automatically Initiated eCall (AIeC);
 * 
 * Category UNSPECIFIED (General emergency call, all categories) indicates that no specific
 * services are associated with this emergency number.
 * 
 * Reference: 3gpp 22.101, Section 10 - Emergency Calls
 * @hide
 */
public @interface EmergencyServiceCategory {
  /** General emergency call, all categories */
  public static final int UNSPECIFIED = 0;
  public static final int POLICE = 1;
  public static final int AMBULANCE = 2;
  public static final int FIRE_BRIGADE = 4;
  public static final int MARINE_GUARD = 8;
  public static final int MOUNTAIN_RESCUE = 16;
  /** Manually Initiated eCall (MIeC) */
  public static final int MIEC = 32;
  /** Automatically Initiated eCall (AIeC) */
  public static final int AIEC = 64;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == UNSPECIFIED) return "UNSPECIFIED";
      if (_aidl_v == POLICE) return "POLICE";
      if (_aidl_v == AMBULANCE) return "AMBULANCE";
      if (_aidl_v == FIRE_BRIGADE) return "FIRE_BRIGADE";
      if (_aidl_v == MARINE_GUARD) return "MARINE_GUARD";
      if (_aidl_v == MOUNTAIN_RESCUE) return "MOUNTAIN_RESCUE";
      if (_aidl_v == MIEC) return "MIEC";
      if (_aidl_v == AIEC) return "AIEC";
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
