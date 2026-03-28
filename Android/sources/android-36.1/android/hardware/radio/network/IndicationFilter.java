/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/IndicationFilter.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/IndicationFilter.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public @interface IndicationFilter {
  public static final int NONE = 0;
  public static final int ALL = -1;
  /**
   * When this bit is set, modem must send the signal strength update through
   * IRadioNetworkIndication.currentSignalStrength() when all criteria specified by
   * IRadioNetwork.setSignalStrengthReportingCriteria() are met.
   */
  public static final int SIGNAL_STRENGTH = 1;
  /**
   * When this bit is set, modem must invoke IRadioNetworkIndication.networkStateChanged() when
   * any field in the voice or data RegStateResult changes. When this bit is not set, modem must
   * suppress IRadioNetworkIndication.networkStateChanged() when there are only changes from
   * insignificant fields. Modem must invoke IRadioNetworkIndication.networkStateChanged() when
   * significant fields are updated regardless of whether this bit is set.
   * 
   * The following fields in RegStateResult are considered significant: regState, rat.
   */
  public static final int FULL_NETWORK_STATE = 2;
  /**
   * When this bit is set, modem must send IRadioNetworkIndication.dataCallListChanged() whenever
   * any field in SetupDataCallResult changes. When this bit is not set, modem must suppress the
   * indication when the only changed field is 'active' (for data dormancy). For all other field
   * changes, the modem must send IRadioNetworkIndication.dataCallListChanged() regardless of
   * whether this bit is set.
   */
  public static final int DATA_CALL_DORMANCY_CHANGED = 4;
  /**
   * When this bit is set, modem must send the link capacity update through
   * IRadioNetworkIndication.currentLinkCapacityEstimate() when all criteria specified by
   * IRadioNetwork.setLinkCapacityReportingCriteria() are met.
   */
  public static final int LINK_CAPACITY_ESTIMATE = 8;
  /**
   * When this bit is set, the modem must send the physical channel configuration update through
   * IRadioNetworkIndication.currentPhysicalChannelConfigs() when the configuration has changed.
   * It is recommended that this be reported whenever link capacity or signal strength is
   * reported.
   */
  public static final int PHYSICAL_CHANNEL_CONFIG = 16;
  /** Control the unsolicited sending of registration failure reports via onRegistrationFailed */
  public static final int REGISTRATION_FAILURE = 32;
  /** Control the unsolicited sending of barring info updates via onBarringInfo */
  public static final int BARRING_INFO = 64;
  /**
   * Enables the {@link IRadioNetworkIndication.displayNetworkTypeChanged} indication.
   * If this bit is set, the modem will send {@code displayNetworkTypeChanged}
   * indications when the suggested display network type changes.
   * If this bit is not set, the modem must suppress these indications.
   */
  public static final int DISPLAY_NETWORK_TYPE_CHANGED = 128;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == NONE) return "NONE";
      if (_aidl_v == ALL) return "ALL";
      if (_aidl_v == SIGNAL_STRENGTH) return "SIGNAL_STRENGTH";
      if (_aidl_v == FULL_NETWORK_STATE) return "FULL_NETWORK_STATE";
      if (_aidl_v == DATA_CALL_DORMANCY_CHANGED) return "DATA_CALL_DORMANCY_CHANGED";
      if (_aidl_v == LINK_CAPACITY_ESTIMATE) return "LINK_CAPACITY_ESTIMATE";
      if (_aidl_v == PHYSICAL_CHANNEL_CONFIG) return "PHYSICAL_CHANNEL_CONFIG";
      if (_aidl_v == REGISTRATION_FAILURE) return "REGISTRATION_FAILURE";
      if (_aidl_v == BARRING_INFO) return "BARRING_INFO";
      if (_aidl_v == DISPLAY_NETWORK_TYPE_CHANGED) return "DISPLAY_NETWORK_TYPE_CHANGED";
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
