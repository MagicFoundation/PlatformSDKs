/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/NrSignalStrength.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/NrSignalStrength.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class NrSignalStrength implements android.os.Parcelable
{
  /**
   * SS reference signal received power, multiplied by -1.
   * Reference: 3GPP TS 38.215.
   * Range [44, 140], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int ssRsrp = 0;
  /**
   * SS reference signal received quality, multiplied by -1.
   * Reference: 3GPP TS 38.215, 3GPP TS 38.133 section 10.
   * Range [-20 dB, 43 dB], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int ssRsrq = 0;
  /**
   * SS signal-to-noise and interference ratio.
   * Reference: 3GPP TS 38.215 section 5.1.*, 3GPP TS 38.133 section 10.1.16.1.
   * Range [-23, 40], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int ssSinr = 0;
  /**
   * CSI reference signal received power, multiplied by -1.
   * Reference: 3GPP TS 38.215.
   * Range [44, 140], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int csiRsrp = 0;
  /**
   * CSI reference signal received quality, multiplied by -1.
   * Reference: 3GPP TS 38.215.
   * Range [3, 20], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int csiRsrq = 0;
  /**
   * CSI signal-to-noise and interference ratio.
   * Reference: 3GPP TS 138.215 section 5.1.*, 3GPP TS 38.133 section 10.1.16.1.
   * Range [-23, 40], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int csiSinr = 0;
  /**
   * CSI channel quality indicator (CQI) table index. There are multiple CQI tables.
   * The definition of CQI in each table is different.
   * Reference: 3GPP TS 138.214 section 5.2.2.1.
   * Range [1, 3], RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   */
  public int csiCqiTableIndex = 0;
  /**
   * CSI channel quality indicator (CQI) for all subbands. If the CQI report is for the entire
   * wideband, a single CQI index is provided. If the CQI report is for all subbands, one CQI
   * index is provided for each subband, in ascending order of subband index. If CQI is not
   * available, the CQI report is empty.
   * Reference: 3GPP TS 138.214 section 5.2.2.1.
   * Range [0, 15], RadioConst:VALUE_UNAVAILABLE_BYTE means invalid/unreported.
   */
  public byte[] csiCqiReport;
  /**
   * Timing advance in micro seconds for a one way trip from cell to device. Approximate distance
   * is calculated using 300m/us * timingAdvance. Range: 0 to 1282 inclusive.
   * RadioConst:VALUE_UNAVAILABLE denotes invalid/unreported value.
   * Reference: 3GPP 36.213 section 4.2.3
   */
  public int timingAdvance = 2147483647;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<NrSignalStrength> CREATOR = new android.os.Parcelable.Creator<NrSignalStrength>() {
    @Override
    public NrSignalStrength createFromParcel(android.os.Parcel _aidl_source) {
      NrSignalStrength _aidl_out = new NrSignalStrength();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public NrSignalStrength[] newArray(int _aidl_size) {
      return new NrSignalStrength[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(ssRsrp);
    _aidl_parcel.writeInt(ssRsrq);
    _aidl_parcel.writeInt(ssSinr);
    _aidl_parcel.writeInt(csiRsrp);
    _aidl_parcel.writeInt(csiRsrq);
    _aidl_parcel.writeInt(csiSinr);
    _aidl_parcel.writeInt(csiCqiTableIndex);
    _aidl_parcel.writeByteArray(csiCqiReport);
    _aidl_parcel.writeInt(timingAdvance);
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
      ssRsrp = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ssRsrq = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ssSinr = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      csiRsrp = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      csiRsrq = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      csiSinr = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      csiCqiTableIndex = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      csiCqiReport = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      timingAdvance = _aidl_parcel.readInt();
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
    _aidl_sj.add("ssRsrp: " + (ssRsrp));
    _aidl_sj.add("ssRsrq: " + (ssRsrq));
    _aidl_sj.add("ssSinr: " + (ssSinr));
    _aidl_sj.add("csiRsrp: " + (csiRsrp));
    _aidl_sj.add("csiRsrq: " + (csiRsrq));
    _aidl_sj.add("csiSinr: " + (csiSinr));
    _aidl_sj.add("csiCqiTableIndex: " + (csiCqiTableIndex));
    _aidl_sj.add("csiCqiReport: " + (java.util.Arrays.toString(csiCqiReport)));
    _aidl_sj.add("timingAdvance: " + (timingAdvance));
    return "NrSignalStrength" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
