/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/PbReceivedStatus.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/PbReceivedStatus.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/**
 * Enum representing the status of the received PB indication.
 * @hide
 */
public @interface PbReceivedStatus {
  /** Indicates that retrieval is fine. */
  public static final byte PB_RECEIVED_OK = 1;
  /** Indicates that an error happened. In general, the process can't be restored soon. */
  public static final byte PB_RECEIVED_ERROR = 2;
  /**
   * Indicates that the process is interrupted. In this case, the modem might need resources and
   * interrupt the current process, or it is timed out to receive all indications, and client can
   * retry soon.
   */
  public static final byte PB_RECEIVED_ABORT = 3;
  /**
   * Indicates that the whole process is finished with a full chunk of phonebook data, meaning
   * this is the last indication with the remaining data.
   */
  public static final byte PB_RECEIVED_FINAL = 4;
  interface $ {
    static String toString(byte _aidl_v) {
      if (_aidl_v == PB_RECEIVED_OK) return "PB_RECEIVED_OK";
      if (_aidl_v == PB_RECEIVED_ERROR) return "PB_RECEIVED_ERROR";
      if (_aidl_v == PB_RECEIVED_ABORT) return "PB_RECEIVED_ABORT";
      if (_aidl_v == PB_RECEIVED_FINAL) return "PB_RECEIVED_FINAL";
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
