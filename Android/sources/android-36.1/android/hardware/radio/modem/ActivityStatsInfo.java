/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.modem/4 --previous_hash 787419262f7c39ea36c0fbe22681bada95d1f97b --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen/android/hardware/radio/modem/ActivityStatsInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/modem/ActivityStatsInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.modem;
/** @hide */
public class ActivityStatsInfo implements android.os.Parcelable
{
  /** Total time (in ms) when modem is in a low power or sleep state */
  public int sleepModeTimeMs = 0;
  /**
   * Total time (in ms) when modem is awake but neither the transmitter nor receiver are
   * active/awake
   */
  public int idleModeTimeMs = 0;
  /**
   * Technology specific activity stats info.
   * List of the activity stats for each RATs (2G, 3G, 4G and 5G) and frequency ranges (HIGH for
   * sub6 and MMWAVE) in case of 5G. In case implementation doesn't have RAT specific activity
   * stats then send only one activity stats info with RAT unknown.
   */
  public android.hardware.radio.modem.ActivityStatsTechSpecificInfo[] techSpecificInfo;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<ActivityStatsInfo> CREATOR = new android.os.Parcelable.Creator<ActivityStatsInfo>() {
    @Override
    public ActivityStatsInfo createFromParcel(android.os.Parcel _aidl_source) {
      ActivityStatsInfo _aidl_out = new ActivityStatsInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ActivityStatsInfo[] newArray(int _aidl_size) {
      return new ActivityStatsInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(sleepModeTimeMs);
    _aidl_parcel.writeInt(idleModeTimeMs);
    _aidl_parcel.writeTypedArray(techSpecificInfo, _aidl_flag);
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
      sleepModeTimeMs = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      idleModeTimeMs = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      techSpecificInfo = _aidl_parcel.createTypedArray(android.hardware.radio.modem.ActivityStatsTechSpecificInfo.CREATOR);
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
    _aidl_sj.add("sleepModeTimeMs: " + (sleepModeTimeMs));
    _aidl_sj.add("idleModeTimeMs: " + (idleModeTimeMs));
    _aidl_sj.add("techSpecificInfo: " + (java.util.Arrays.toString(techSpecificInfo)));
    return "ActivityStatsInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(techSpecificInfo);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
        _mask |= describeContents(o);
      }
      return _mask;
    }
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
