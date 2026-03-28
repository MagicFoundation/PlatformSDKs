/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/4 --previous_hash 576f05d082e9269bcf773b0c9b9112d507ab4b9a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen/android/hardware/radio/voice/CdmaSignalInfoRecord.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/voice/CdmaSignalInfoRecord.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/**
 * CDMA Signal Information Record as defined in C.S0005 section 3.7.5.5
 * @hide
 */
public class CdmaSignalInfoRecord implements android.os.Parcelable
{
  /**
   * True if signal information record is present
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public boolean isPresent = false;
  /**
   * Defined in 3.7.5.5-1
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public byte signalType = 0;
  /**
   * Defined in 3.7.5.5-2
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public byte alertPitch = 0;
  /**
   * Defined in 3.7.5.5-3, 3.7.5.5-4 or 3.7.5.5-5
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public byte signal = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CdmaSignalInfoRecord> CREATOR = new android.os.Parcelable.Creator<CdmaSignalInfoRecord>() {
    @Override
    public CdmaSignalInfoRecord createFromParcel(android.os.Parcel _aidl_source) {
      CdmaSignalInfoRecord _aidl_out = new CdmaSignalInfoRecord();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CdmaSignalInfoRecord[] newArray(int _aidl_size) {
      return new CdmaSignalInfoRecord[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeBoolean(isPresent);
    _aidl_parcel.writeByte(signalType);
    _aidl_parcel.writeByte(alertPitch);
    _aidl_parcel.writeByte(signal);
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
      isPresent = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      signalType = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      alertPitch = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      signal = _aidl_parcel.readByte();
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
    _aidl_sj.add("isPresent: " + (isPresent));
    _aidl_sj.add("signalType: " + (signalType));
    _aidl_sj.add("alertPitch: " + (alertPitch));
    _aidl_sj.add("signal: " + (signal));
    return "CdmaSignalInfoRecord" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
