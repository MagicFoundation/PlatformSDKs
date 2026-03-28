/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.voice/4 --previous_hash 576f05d082e9269bcf773b0c9b9112d507ab4b9a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen/android/hardware/radio/voice/CdmaRedirectingNumberInfoRecord.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.voice-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/voice/CdmaRedirectingNumberInfoRecord.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.voice;
/** @hide */
public class CdmaRedirectingNumberInfoRecord implements android.os.Parcelable
{
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public android.hardware.radio.voice.CdmaNumberInfoRecord redirectingNumber;
  /**
   * Set to UNKNOWN if not included.
   * Values are REDIRECTING_REASON_
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int redirectingReason = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CdmaRedirectingNumberInfoRecord> CREATOR = new android.os.Parcelable.Creator<CdmaRedirectingNumberInfoRecord>() {
    @Override
    public CdmaRedirectingNumberInfoRecord createFromParcel(android.os.Parcel _aidl_source) {
      CdmaRedirectingNumberInfoRecord _aidl_out = new CdmaRedirectingNumberInfoRecord();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CdmaRedirectingNumberInfoRecord[] newArray(int _aidl_size) {
      return new CdmaRedirectingNumberInfoRecord[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeTypedObject(redirectingNumber, _aidl_flag);
    _aidl_parcel.writeInt(redirectingReason);
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
      redirectingNumber = _aidl_parcel.readTypedObject(android.hardware.radio.voice.CdmaNumberInfoRecord.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      redirectingReason = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /**
   * Redirecting Number Information Record as defined in C.S0005 section 3.7.5.11
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int REDIRECTING_REASON_UNKNOWN = 0;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int REDIRECTING_REASON_CALL_FORWARDING_BUSY = 1;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int REDIRECTING_REASON_CALL_FORWARDING_NO_REPLY = 2;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int REDIRECTING_REASON_CALLED_DTE_OUT_OF_ORDER = 9;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int REDIRECTING_REASON_CALL_FORWARDING_BY_THE_CALLED_DTE = 10;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int REDIRECTING_REASON_CALL_FORWARDING_UNCONDITIONAL = 15;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int REDIRECTING_REASON_RESERVED = 16;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("redirectingNumber: " + (java.util.Objects.toString(redirectingNumber)));
    _aidl_sj.add("redirectingReason: " + (redirectingReason));
    return "CdmaRedirectingNumberInfoRecord" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(redirectingNumber);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
