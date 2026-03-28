/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/LteSignalStrength.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/LteSignalStrength.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class LteSignalStrength implements android.os.Parcelable
{
  /**
   * Valid values are (0-31, 99) as defined in TS 27.007 8.5;
   * RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int signalStrength = 0;
  /**
   * The current Reference Signal Receive Power in dBm multiplied by -1. Range: 44 to 140 dBm;
   * RadioConst:VALUE_UNAVAILABLE denotes invalid/unreported value. Ref: 3GPP TS 36.133 9.1.4
   */
  public int rsrp = 0;
  /**
   * The current Reference Signal Receive Quality in dB multiplied by -1. Range: 20 to 3 dB;
   * RadioConst:VALUE_UNAVAILABLE denotes invalid/unreported value. Ref: 3GPP TS 36.133 9.1.7
   */
  public int rsrq = 0;
  /**
   * The current reference signal signal-to-noise ratio in 0.1 dB units.
   * Range: -200 to +300 (-200 = -20.0 dB, +300 = 30dB).
   * RadioConst:VALUE_UNAVAILABLE denotes invalid/unreported value. Ref: 3GPP TS 36.101 8.1.1
   */
  public int rssnr = 0;
  /**
   * The current Channel Quality Indicator. Range: 0 to 15.
   * RadioConst:VALUE_UNAVAILABLE denotes invalid/unreported value.
   * Ref: 3GPP TS 36.101 9.2, 9.3, A.4
   */
  public int cqi = 0;
  /**
   * Timing advance in micro seconds for a one way trip from cell to device. Approximate distance
   * is calculated using 300m/us * timingAdvance. Range: 0 to 1282 inclusive.
   * RadioConst:VALUE_UNAVAILABLE denotes invalid/unreported value. Ref: 3GPP 36.213 section 4.2.3
   */
  public int timingAdvance = 0;
  /**
   * CSI channel quality indicator (CQI) table index. There are multiple CQI tables.
   * The definition of CQI in each table is different.
   * Reference: 3GPP TS 136.213 section 7.2.3.
   * Range [1, 6], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int cqiTableIndex = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<LteSignalStrength> CREATOR = new android.os.Parcelable.Creator<LteSignalStrength>() {
    @Override
    public LteSignalStrength createFromParcel(android.os.Parcel _aidl_source) {
      LteSignalStrength _aidl_out = new LteSignalStrength();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public LteSignalStrength[] newArray(int _aidl_size) {
      return new LteSignalStrength[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(signalStrength);
    _aidl_parcel.writeInt(rsrp);
    _aidl_parcel.writeInt(rsrq);
    _aidl_parcel.writeInt(rssnr);
    _aidl_parcel.writeInt(cqi);
    _aidl_parcel.writeInt(timingAdvance);
    _aidl_parcel.writeInt(cqiTableIndex);
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
      signalStrength = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      rsrp = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      rsrq = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      rssnr = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cqi = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      timingAdvance = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cqiTableIndex = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("signalStrength: " + (signalStrength));
    _aidl_sj.add("rsrp: " + (rsrp));
    _aidl_sj.add("rsrq: " + (rsrq));
    _aidl_sj.add("rssnr: " + (rssnr));
    _aidl_sj.add("cqi: " + (cqi));
    _aidl_sj.add("timingAdvance: " + (timingAdvance));
    _aidl_sj.add("cqiTableIndex: " + (cqiTableIndex));
    return "LteSignalStrength" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
