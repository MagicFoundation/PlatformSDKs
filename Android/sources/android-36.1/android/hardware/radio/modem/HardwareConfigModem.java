/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.modem/4 --previous_hash 787419262f7c39ea36c0fbe22681bada95d1f97b --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen/android/hardware/radio/modem/HardwareConfigModem.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/modem/HardwareConfigModem.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.modem;
/** @hide */
public class HardwareConfigModem implements android.os.Parcelable
{
  /**
   * RIL attachment model. Values are:
   * 0: single
   * 1: multiple
   * If single, there is a one-to-one relationship between a modem hardware and a ril daemon.
   * If multiple, there is a one-to-many relationship between a modem hardware and several
   * simultaneous ril daemons.
   */
  public int rilModel = 0;
  /**
   * All supported radio technologies.
   * 
   * Despite the stated type, this is an int bitset: a mask where each bit position represents a
   * radio technology.
   */
  public int rat = android.hardware.radio.RadioTechnology.UNKNOWN;
  // it's really an empty bitmask
  /** Maximum number of concurrent active voice calls. */
  public int maxVoiceCalls = 0;
  /** Maximum number of concurrent active data calls. */
  public int maxDataCalls = 0;
  /**
   * Maximum number of concurrent standby connections. This is not necessarily an equal sum of the
   * maxVoice and maxData (or a derivative of it) since it really depends on the modem capability,
   * hence it is left for the hardware to define.
   */
  public int maxStandby = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<HardwareConfigModem> CREATOR = new android.os.Parcelable.Creator<HardwareConfigModem>() {
    @Override
    public HardwareConfigModem createFromParcel(android.os.Parcel _aidl_source) {
      HardwareConfigModem _aidl_out = new HardwareConfigModem();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public HardwareConfigModem[] newArray(int _aidl_size) {
      return new HardwareConfigModem[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(rilModel);
    _aidl_parcel.writeInt(rat);
    _aidl_parcel.writeInt(maxVoiceCalls);
    _aidl_parcel.writeInt(maxDataCalls);
    _aidl_parcel.writeInt(maxStandby);
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
      rilModel = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      rat = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxVoiceCalls = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxDataCalls = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxStandby = _aidl_parcel.readInt();
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
    _aidl_sj.add("rilModel: " + (rilModel));
    _aidl_sj.add("rat: " + (android.hardware.radio.RadioTechnology.$.toString(rat)));
    _aidl_sj.add("maxVoiceCalls: " + (maxVoiceCalls));
    _aidl_sj.add("maxDataCalls: " + (maxDataCalls));
    _aidl_sj.add("maxStandby: " + (maxStandby));
    return "HardwareConfigModem" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
