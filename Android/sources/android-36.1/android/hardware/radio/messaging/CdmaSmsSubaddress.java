/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.messaging/4 --previous_hash b28416394e6595c08e97c0473855eb05eed1baed --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen/android/hardware/radio/messaging/CdmaSmsSubaddress.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/messaging/CdmaSmsSubaddress.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.messaging;
/** @hide */
public class CdmaSmsSubaddress implements android.os.Parcelable
{
  /**
   * Values are SUBADDRESS_TYPE_
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int subaddressType = 0;
  /**
   * True means the last byte's lower 4 bits must be ignored
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public boolean odd = false;
  /**
   * Each byte represents an 8-bit digit of subaddress data
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public byte[] digits;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CdmaSmsSubaddress> CREATOR = new android.os.Parcelable.Creator<CdmaSmsSubaddress>() {
    @Override
    public CdmaSmsSubaddress createFromParcel(android.os.Parcel _aidl_source) {
      CdmaSmsSubaddress _aidl_out = new CdmaSmsSubaddress();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CdmaSmsSubaddress[] newArray(int _aidl_size) {
      return new CdmaSmsSubaddress[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(subaddressType);
    _aidl_parcel.writeBoolean(odd);
    _aidl_parcel.writeByteArray(digits);
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
      subaddressType = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      odd = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      digits = _aidl_parcel.createByteArray();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /**
   * CCITT X.213 or ISO 8348 AD2
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int SUBADDRESS_TYPE_NSAP = 0;
  /**
   * e.g. X.25
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int SUBADDRESS_TYPE_USER_SPECIFIED = 1;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("subaddressType: " + (subaddressType));
    _aidl_sj.add("odd: " + (odd));
    _aidl_sj.add("digits: " + (java.util.Arrays.toString(digits)));
    return "CdmaSmsSubaddress" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
