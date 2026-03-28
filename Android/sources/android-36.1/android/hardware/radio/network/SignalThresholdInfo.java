/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/SignalThresholdInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/SignalThresholdInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * Contains the threshold values of each signal measurement type.
 * @hide
 */
public class SignalThresholdInfo implements android.os.Parcelable
{
  /**
   * Signal Measurement Type
   * Values are SIGNAL_MEASUREMENT_TYPE_
   */
  public int signalMeasurement = 0;
  /**
   * A hysteresis time in milliseconds for current signal measurement type to prevent flapping.
   * A value of 0 disables hysteresis.
   */
  public int hysteresisMs = 0;
  /**
   * An interval in dB for current signal measurement type defining the required magnitude change
   * between reports. This must be smaller than the smallest threshold delta. An interval value of
   * 0 disables hysteresis.
   */
  public int hysteresisDb = 0;
  /**
   * List of threshold values for current signal measurement type. Range and unit must reference
   * specific SignalMeasurementType. The threshold values for which to apply criteria. A vector
   * size of 0 disables the use of thresholds for reporting.
   */
  public int[] thresholds;
  /**
   * Indicates whether the reporting criteria of the corresponding measurement is enabled
   * (true) or disabled (false). If enabled, modem must trigger the report based on the criteria.
   * If disabled, modem must not trigger the report based on the criteria.
   */
  public boolean isEnabled = false;
  /** The Radio Access Network for current threshold info. */
  public int ran = android.hardware.radio.AccessNetwork.UNKNOWN;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SignalThresholdInfo> CREATOR = new android.os.Parcelable.Creator<SignalThresholdInfo>() {
    @Override
    public SignalThresholdInfo createFromParcel(android.os.Parcel _aidl_source) {
      SignalThresholdInfo _aidl_out = new SignalThresholdInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SignalThresholdInfo[] newArray(int _aidl_size) {
      return new SignalThresholdInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(signalMeasurement);
    _aidl_parcel.writeInt(hysteresisMs);
    _aidl_parcel.writeInt(hysteresisDb);
    _aidl_parcel.writeIntArray(thresholds);
    _aidl_parcel.writeBoolean(isEnabled);
    _aidl_parcel.writeInt(ran);
    int _aidl_end_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.setDataPosition(_aidl_start_pos);
    _aidl_parcel.writeInt(_aidl_end_pos - _aidl_start_pos);
    _aidl_parcel.setDataPosition(_aidl_end_pos);
  }
  public final void readFromParcel(android.os.Parcel _aidl_parcel)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    int _aidl_parcelable_size = _aidl_parcel.readInt();
    try {
      if (_aidl_parcelable_size < 4) throw new android.os.BadParcelableException("Parcelable too small");;
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      signalMeasurement = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      hysteresisMs = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      hysteresisDb = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      thresholds = _aidl_parcel.createIntArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isEnabled = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ran = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /**
   * Received Signal Strength Indication.
   * Range: -113 dBm and -51 dBm
   * Used RAN: GERAN
   * Reference: 3GPP TS 27.007 section 8.5.
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_RSSI = 1;
  /**
   * Received Signal Code Power.
   * Range: -120 dBm to -25 dBm;
   * Used RAN: UTRAN
   * Reference: 3GPP TS 25.123, section 9.1.1.1
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_RSCP = 2;
  /**
   * Reference Signal Received Power.
   * Range: -140 dBm to -44 dBm;
   * Used RAN: EUTRAN
   * Reference: 3GPP TS 36.133 9.1.4
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_RSRP = 3;
  /**
   * Reference Signal Received Quality
   * Range: -34 dB to 3 dB;
   * Used RAN: EUTRAN
   * Reference: 3GPP TS 36.133 v12.6.0 section 9.1.7
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_RSRQ = 4;
  /**
   * Reference Signal Signal to Noise Ratio
   * Range: -20 dB to 30 dB;
   * Used RAN: EUTRAN
   * Note: This field is optional; how to support it can be decided by the corresponding vendor.
   * Though the response code is not enforced, vendor's implementation must ensure this interface
   * does not crash.
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_RSSNR = 5;
  /**
   * 5G SS reference signal received power.
   * Range: -140 dBm to -44 dBm.
   * Used RAN: NGRAN
   * Reference: 3GPP TS 38.215.
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRP = 6;
  /**
   * 5G SS reference signal received quality.
   * Range: -43 dB to 20 dB.
   * Used RAN: NGRAN
   * Reference: 3GPP TS 38.215, 3GPP TS 38.133 section 10
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_SSRSRQ = 7;
  /**
   * 5G SS signal-to-noise and interference ratio.
   * Range: -23 dB to 40 dB
   * Used RAN: NGRAN
   * Reference: 3GPP TS 38.215 section 5.1.*, 3GPP TS 38.133 section 10.1.16.1.
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_SSSINR = 8;
  /**
   * EcNo value
   * Range: -24 dBm to 1 dBm.
   * Used RAN: UTRAN
   * Reference: 3GPP TS 25.215 5.1.5
   */
  public static final int SIGNAL_MEASUREMENT_TYPE_ECNO = 9;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("signalMeasurement: " + (signalMeasurement));
    _aidl_sj.add("hysteresisMs: " + (hysteresisMs));
    _aidl_sj.add("hysteresisDb: " + (hysteresisDb));
    _aidl_sj.add("thresholds: " + (java.util.Arrays.toString(thresholds)));
    _aidl_sj.add("isEnabled: " + (isEnabled));
    _aidl_sj.add("ran: " + (android.hardware.radio.AccessNetwork.$.toString(ran)));
    return "SignalThresholdInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
