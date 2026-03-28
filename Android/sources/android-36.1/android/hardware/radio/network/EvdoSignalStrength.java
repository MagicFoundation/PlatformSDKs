/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/EvdoSignalStrength.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/EvdoSignalStrength.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class EvdoSignalStrength implements android.os.Parcelable
{
  /**
   * This value is the actual RSSI value multiplied by -1. Example: If the actual RSSI is -75,
   * then this response value will be 75; RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int dbm = 0;
  /**
   * This value is the actual Ec/Io multiplied by -10. Example: If the actual Ec/Io is -12.5 dB,
   * then this response value will be 125; RadioConst:VALUE_UNAVAILABLE means invalid/unreported.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int ecio = 0;
  /**
   * Valid values are 0-8. 8 is the highest signal to noise ratio; RadioConst:VALUE_UNAVAILABLE
   * means invalid/unreported.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int signalNoiseRatio = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<EvdoSignalStrength> CREATOR = new android.os.Parcelable.Creator<EvdoSignalStrength>() {
    @Override
    public EvdoSignalStrength createFromParcel(android.os.Parcel _aidl_source) {
      EvdoSignalStrength _aidl_out = new EvdoSignalStrength();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public EvdoSignalStrength[] newArray(int _aidl_size) {
      return new EvdoSignalStrength[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(dbm);
    _aidl_parcel.writeInt(ecio);
    _aidl_parcel.writeInt(signalNoiseRatio);
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
      dbm = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ecio = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      signalNoiseRatio = _aidl_parcel.readInt();
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
    _aidl_sj.add("dbm: " + (dbm));
    _aidl_sj.add("ecio: " + (ecio));
    _aidl_sj.add("signalNoiseRatio: " + (signalNoiseRatio));
    return "EvdoSignalStrength" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
