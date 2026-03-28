/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.modem/4 --previous_hash 787419262f7c39ea36c0fbe22681bada95d1f97b --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen/android/hardware/radio/modem/ImeiInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/modem/ImeiInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.modem;
/**
 * ImeiInfo to encapsulate the IMEI information from modem
 * @hide
 */
public class ImeiInfo implements android.os.Parcelable
{
  /** Primary or secondary IMEI as mentioned in GSMA spec TS.37 */
  public int type = android.hardware.radio.modem.ImeiInfo.ImeiType.INVALID;
  /**
   * IMEI value, see 3gpp spec 23.003 section 6. Note: This primary IMEI mapping must be
   * permanent throughout the lifetime of the device irrespective of the factory data reset,
   * SIM activations or swaps.
   */
  public java.lang.String imei;
  /** IMEI software version, see 3gpp spec 23.003 section 6. */
  public java.lang.String svn;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<ImeiInfo> CREATOR = new android.os.Parcelable.Creator<ImeiInfo>() {
    @Override
    public ImeiInfo createFromParcel(android.os.Parcel _aidl_source) {
      ImeiInfo _aidl_out = new ImeiInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ImeiInfo[] newArray(int _aidl_size) {
      return new ImeiInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(type);
    _aidl_parcel.writeString(imei);
    _aidl_parcel.writeString(svn);
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
      type = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      imei = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      svn = _aidl_parcel.readString();
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
    _aidl_sj.add("type: " + (type));
    _aidl_sj.add("imei: " + (java.util.Objects.toString(imei)));
    _aidl_sj.add("svn: " + (java.util.Objects.toString(svn)));
    return "ImeiInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
  /** ImeiType enum is used identify the IMEI as primary or secondary as mentioned in GSMA TS.37 */
  public static @interface ImeiType {
    /** Must not be used. */
    public static final int INVALID = 0;
    /**
     * This is the primary IMEI of the device as mentioned in the GSMA TS.37. In a multi-SIM
     * device the modem must set one IMEI with this type as mentioned in GSMA TS37_2.2_REQ_8.
     * A single SIM with one IMEI must by default set that IMEI with this type.
     */
    public static final int PRIMARY = 1;
    /** This is not the primary IMEI of the device */
    public static final int SECONDARY = 2;
  }
}
