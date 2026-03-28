/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 4 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.ims/3 --previous_hash b2a615a151c7114c4216b1987fd32d40c797d00a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen/android/hardware/radio/ims/SuggestedAction.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/ims/SuggestedAction.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.ims;
/** @hide */
public @interface SuggestedAction {
  /** Default value */
  public static final int NONE = 0;
  /**
   * Indicates that the IMS registration is failed with fatal error such as 403 or 404
   * on all P-CSCF addresses. The radio shall block the current PLMN or disable
   * the RAT as per the carrier requirements.
   */
  public static final int TRIGGER_PLMN_BLOCK = 1;
  /**
   * Indicates that the IMS registration on current PLMN failed multiple times.
   * The radio shall block the current PLMN or disable the RAT during EPS or 5GS mobility
   * management timer value as per the carrier requirements.
   */
  public static final int TRIGGER_PLMN_BLOCK_WITH_TIMEOUT = 2;
  /**
   * Indicates that the IMS registration on current RAT failed multiple times.
   * The radio shall block the {@link AccessNetwork} included with this and
   * search for other available RATs in the background.
   * If no other RAT is available that meets the carrier requirements, the
   * radio may remain on the blocked RAT for internet service. The radio clears all
   * RATs marked as unavailable if {@link IRadioIms#updateImsRegistrationInfo()} API
   * with REGISTERED state is invoked.
   */
  public static final int TRIGGER_RAT_BLOCK = 3;
  /**
   * Indicates that the radio clears all RATs marked as unavailable and tries to find
   * an available RAT that meets the carrier requirements.
   */
  public static final int TRIGGER_CLEAR_RAT_BLOCKS = 4;
  /**
   * Indicates whether to apply the registration throttling time.
   * If this action is suggested, the value provided in should be used to delay subsequent
   * IMS registration attempts.
   */
  public static final int TRIGGER_THROTTLE_TIME = 5;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NONE) return "NONE";
      if (_aidl_v == TRIGGER_PLMN_BLOCK) return "TRIGGER_PLMN_BLOCK";
      if (_aidl_v == TRIGGER_PLMN_BLOCK_WITH_TIMEOUT) return "TRIGGER_PLMN_BLOCK_WITH_TIMEOUT";
      if (_aidl_v == TRIGGER_RAT_BLOCK) return "TRIGGER_RAT_BLOCK";
      if (_aidl_v == TRIGGER_CLEAR_RAT_BLOCKS) return "TRIGGER_CLEAR_RAT_BLOCKS";
      if (_aidl_v == TRIGGER_THROTTLE_TIME) return "TRIGGER_THROTTLE_TIME";
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
