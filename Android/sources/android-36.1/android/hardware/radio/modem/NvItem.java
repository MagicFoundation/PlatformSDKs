/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.modem/4 --previous_hash 787419262f7c39ea36c0fbe22681bada95d1f97b --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen/android/hardware/radio/modem/NvItem.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/modem/NvItem.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.modem;
/** @hide */
public @interface NvItem {
  /** @deprecated NV APIs are deprecated starting from Android U. */
  @Deprecated
  public static final int INVALID = 0;
  /**
   * CDMA radio and account information (items 1-10)
   * CDMA MEID (hex)
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_MEID = 1;
  /**
   * CDMA MIN (MSID)
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_MIN = 2;
  /**
   * CDMA MDN
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_MDN = 3;
  /**
   * CDMA access overload control
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_ACCOLC = 4;
  /**
   * Carrier device provisioning (items 11-30)
   * Device MSL
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int DEVICE_MSL = 11;
  /**
   * RTN reconditioned status
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int RTN_RECONDITIONED_STATUS = 12;
  /**
   * RTN activation date
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int RTN_ACTIVATION_DATE = 13;
  /**
   * RTN life timer
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int RTN_LIFE_TIMER = 14;
  /**
   * RTN life calls
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int RTN_LIFE_CALLS = 15;
  /**
   * RTN life data TX
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int RTN_LIFE_DATA_TX = 16;
  /**
   * RTN life data RX
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int RTN_LIFE_DATA_RX = 17;
  /**
   * HFA in progress
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int OMADM_HFA_LEVEL = 18;
  /**
   * Mobile IP profile information (items 31-50)
   * NAI realm
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_NAI = 31;
  /**
   * MIP home address
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_HOME_ADDRESS = 32;
  /**
   * AAA auth
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_AAA_AUTH = 33;
  /**
   * HA auth
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_HA_AUTH = 34;
  /**
   * Primary HA address
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_PRI_HA_ADDR = 35;
  /**
   * Secondary HA address
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_SEC_HA_ADDR = 36;
  /**
   * Reverse TUN preference
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_REV_TUN_PREF = 37;
  /**
   * HA SPI
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_HA_SPI = 38;
  /**
   * AAA SPI
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_AAA_SPI = 39;
  /**
   * HA shared secret
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_MN_HA_SS = 40;
  /**
   * AAA shared secret
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int MIP_PROFILE_MN_AAA_SS = 41;
  /**
   * CDMA network and band config (items 51-70)
   * CDMA PRL version
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_PRL_VERSION = 51;
  /**
   * CDMA band class 10
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_BC10 = 52;
  /**
   * CDMA band class 14
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_BC14 = 53;
  /**
   * CDMA SO68
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_SO68 = 54;
  /**
   * CDMA SO73 COP0
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_SO73_COP0 = 55;
  /**
   * CDMA SO73 COP1-7
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_SO73_COP1TO7 = 56;
  /**
   * CDMA 1X Advanced enabled
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_1X_ADVANCED_ENABLED = 57;
  /**
   * CDMA eHRPD enabled
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_EHRPD_ENABLED = 58;
  /**
   * CDMA eHRPD forced
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int CDMA_EHRPD_FORCED = 59;
  /**
   * LTE network and band config (items 71-90)
   * LTE band 25 enabled
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_BAND_ENABLE_25 = 71;
  /**
   * LTE band 26 enabled
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_BAND_ENABLE_26 = 72;
  /**
   * LTE band 41 enabled
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_BAND_ENABLE_41 = 73;
  /**
   * LTE band 25 scan priority
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_SCAN_PRIORITY_25 = 74;
  /**
   * LTE band 26 scan priority
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_SCAN_PRIORITY_26 = 75;
  /**
   * LTE band 41 scan priority
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_SCAN_PRIORITY_41 = 76;
  /**
   * LTE hidden band 25 priority
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_HIDDEN_BAND_PRIORITY_25 = 77;
  /**
   * LTE hidden band 26 priority
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_HIDDEN_BAND_PRIORITY_26 = 78;
  /**
   * LTE hidden band 41 priority
   * @deprecated NV APIs are deprecated starting from Android U.
   */
  @Deprecated
  public static final int LTE_HIDDEN_BAND_PRIORITY_41 = 79;
  interface $ {
    static String toString(int _aidl_v) {
      if (_aidl_v == INVALID) return "INVALID";
      if (_aidl_v == CDMA_MEID) return "CDMA_MEID";
      if (_aidl_v == CDMA_MIN) return "CDMA_MIN";
      if (_aidl_v == CDMA_MDN) return "CDMA_MDN";
      if (_aidl_v == CDMA_ACCOLC) return "CDMA_ACCOLC";
      if (_aidl_v == DEVICE_MSL) return "DEVICE_MSL";
      if (_aidl_v == RTN_RECONDITIONED_STATUS) return "RTN_RECONDITIONED_STATUS";
      if (_aidl_v == RTN_ACTIVATION_DATE) return "RTN_ACTIVATION_DATE";
      if (_aidl_v == RTN_LIFE_TIMER) return "RTN_LIFE_TIMER";
      if (_aidl_v == RTN_LIFE_CALLS) return "RTN_LIFE_CALLS";
      if (_aidl_v == RTN_LIFE_DATA_TX) return "RTN_LIFE_DATA_TX";
      if (_aidl_v == RTN_LIFE_DATA_RX) return "RTN_LIFE_DATA_RX";
      if (_aidl_v == OMADM_HFA_LEVEL) return "OMADM_HFA_LEVEL";
      if (_aidl_v == MIP_PROFILE_NAI) return "MIP_PROFILE_NAI";
      if (_aidl_v == MIP_PROFILE_HOME_ADDRESS) return "MIP_PROFILE_HOME_ADDRESS";
      if (_aidl_v == MIP_PROFILE_AAA_AUTH) return "MIP_PROFILE_AAA_AUTH";
      if (_aidl_v == MIP_PROFILE_HA_AUTH) return "MIP_PROFILE_HA_AUTH";
      if (_aidl_v == MIP_PROFILE_PRI_HA_ADDR) return "MIP_PROFILE_PRI_HA_ADDR";
      if (_aidl_v == MIP_PROFILE_SEC_HA_ADDR) return "MIP_PROFILE_SEC_HA_ADDR";
      if (_aidl_v == MIP_PROFILE_REV_TUN_PREF) return "MIP_PROFILE_REV_TUN_PREF";
      if (_aidl_v == MIP_PROFILE_HA_SPI) return "MIP_PROFILE_HA_SPI";
      if (_aidl_v == MIP_PROFILE_AAA_SPI) return "MIP_PROFILE_AAA_SPI";
      if (_aidl_v == MIP_PROFILE_MN_HA_SS) return "MIP_PROFILE_MN_HA_SS";
      if (_aidl_v == MIP_PROFILE_MN_AAA_SS) return "MIP_PROFILE_MN_AAA_SS";
      if (_aidl_v == CDMA_PRL_VERSION) return "CDMA_PRL_VERSION";
      if (_aidl_v == CDMA_BC10) return "CDMA_BC10";
      if (_aidl_v == CDMA_BC14) return "CDMA_BC14";
      if (_aidl_v == CDMA_SO68) return "CDMA_SO68";
      if (_aidl_v == CDMA_SO73_COP0) return "CDMA_SO73_COP0";
      if (_aidl_v == CDMA_SO73_COP1TO7) return "CDMA_SO73_COP1TO7";
      if (_aidl_v == CDMA_1X_ADVANCED_ENABLED) return "CDMA_1X_ADVANCED_ENABLED";
      if (_aidl_v == CDMA_EHRPD_ENABLED) return "CDMA_EHRPD_ENABLED";
      if (_aidl_v == CDMA_EHRPD_FORCED) return "CDMA_EHRPD_FORCED";
      if (_aidl_v == LTE_BAND_ENABLE_25) return "LTE_BAND_ENABLE_25";
      if (_aidl_v == LTE_BAND_ENABLE_26) return "LTE_BAND_ENABLE_26";
      if (_aidl_v == LTE_BAND_ENABLE_41) return "LTE_BAND_ENABLE_41";
      if (_aidl_v == LTE_SCAN_PRIORITY_25) return "LTE_SCAN_PRIORITY_25";
      if (_aidl_v == LTE_SCAN_PRIORITY_26) return "LTE_SCAN_PRIORITY_26";
      if (_aidl_v == LTE_SCAN_PRIORITY_41) return "LTE_SCAN_PRIORITY_41";
      if (_aidl_v == LTE_HIDDEN_BAND_PRIORITY_25) return "LTE_HIDDEN_BAND_PRIORITY_25";
      if (_aidl_v == LTE_HIDDEN_BAND_PRIORITY_26) return "LTE_HIDDEN_BAND_PRIORITY_26";
      if (_aidl_v == LTE_HIDDEN_BAND_PRIORITY_41) return "LTE_HIDDEN_BAND_PRIORITY_41";
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
