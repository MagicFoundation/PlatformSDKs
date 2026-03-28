/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/4 --previous_hash 576f05d082e9269bcf773b0c9b9112d507ab4b9a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen/android/hardware/radio/voice/EmergencyNumber.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/voice/EmergencyNumber.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/**
 * Emergency number contains information of number, one or more service category(s), zero or more
 * emergency uniform resource names, mobile country code (mcc), mobile network country (mnc) and
 * source(s) that indicate where it comes from.
 * 
 * If the emergency number is associated with country, field ‘mcc’ must be provided, otherwise
 * field ‘mcc’ must be an empty string. If the emergency number is associated with network operator,
 * field ‘mcc’ and 'mnc' must be provided, otherwise field ‘mnc’ must be an empty string. If the
 * emergency number is specified with emergency service category(s), field 'categories' must be
 * provided, otherwise field 'categories' must be EmergencyServiceCategories::UNSPECIFIED. If the
 * emergency number is specified with emergency uniform resource names (URN), field 'urns' must be
 * provided, otherwise field 'urns' must be an empty list.
 * 
 * A unique EmergencyNumber has a unique combination of ‘number’, ‘mcc’, 'mnc', 'categories' and
 * 'urns' fields. Multiple EmergencyNumberSource should be merged into one 'sources' field via
 * bitwise-OR combination for the same EmergencyNumber.
 * 
 * Reference: 3gpp 22.101, Section 10 - Emergency Calls;
 *            3gpp 23.167, Section 6 - Functional description;
 *            3gpp 24.503, Section 5.1.6.8.1 - General;
 *            RFC 5031
 * @hide
 */
public class EmergencyNumber implements android.os.Parcelable
{
  /**
   * The emergency number. The character in the number string should only be the dial pad
   * character('0'-'9', '*', or '#'). For example: 911.
   */
  public java.lang.String number;
  /** 3-digit Mobile Country Code, 0..999. Empty string if not applicable. */
  public java.lang.String mcc;
  /** 2 or 3-digit Mobile Network Code, 0..999. Empty string if not applicable. */
  public java.lang.String mnc;
  /**
   * The bitfield of EmergencyServiceCategory(s). See EmergencyServiceCategory for the value of
   * each bit.
   */
  public int categories = 0;
  /** The list of emergency Uniform Resource Names (URN). */
  public java.lang.String[] urns;
  /**
   * The bitfield of EmergencyNumberSource(s) to tell where the EmergencyNumber comes from.
   * Reference: 3gpp 22.101, Section 10 - Emergency Calls
   * Values are SOURCE_
   */
  public int sources = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<EmergencyNumber> CREATOR = new android.os.Parcelable.Creator<EmergencyNumber>() {
    @Override
    public EmergencyNumber createFromParcel(android.os.Parcel _aidl_source) {
      EmergencyNumber _aidl_out = new EmergencyNumber();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public EmergencyNumber[] newArray(int _aidl_size) {
      return new EmergencyNumber[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(number);
    _aidl_parcel.writeString(mcc);
    _aidl_parcel.writeString(mnc);
    _aidl_parcel.writeInt(categories);
    _aidl_parcel.writeStringArray(urns);
    _aidl_parcel.writeInt(sources);
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
      number = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mcc = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mnc = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      categories = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      urns = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sources = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /** Indicates the number is from the network signal. */
  public static final int SOURCE_NETWORK_SIGNALING = 1;
  /** Indicates the number is from the sim card. */
  public static final int SOURCE_SIM = 2;
  /** Indicates the number is from the modem config. */
  public static final int SOURCE_MODEM_CONFIG = 4;
  /**
   * Indicates the number is available as default. Per the reference, 112, 911 must always be
   * available; additionally, 000, 08, 110, 999, 118 and 119 must be available when sim is not
   * present.
   */
  public static final int SOURCE_DEFAULT = 8;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("number: " + (java.util.Objects.toString(number)));
    _aidl_sj.add("mcc: " + (java.util.Objects.toString(mcc)));
    _aidl_sj.add("mnc: " + (java.util.Objects.toString(mnc)));
    _aidl_sj.add("categories: " + (categories));
    _aidl_sj.add("urns: " + (java.util.Arrays.toString(urns)));
    _aidl_sj.add("sources: " + (sources));
    return "EmergencyNumber" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
