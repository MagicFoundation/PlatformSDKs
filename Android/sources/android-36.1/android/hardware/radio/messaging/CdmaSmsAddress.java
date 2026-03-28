/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.messaging/4 --previous_hash b28416394e6595c08e97c0473855eb05eed1baed --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen/android/hardware/radio/messaging/CdmaSmsAddress.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/messaging/CdmaSmsAddress.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.messaging;
/** @hide */
public class CdmaSmsAddress implements android.os.Parcelable
{
  /**
   * CdmaSmsDigitMode is of two types : 4 bit and 8 bit.
   * For 4-bit type, only "digits" field defined below in this struct is used.
   * Values are DIGIT_MODE_
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int digitMode = 0;
  /**
   * Used only when digitMode is 8-bit.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public boolean isNumberModeDataNetwork = false;
  /**
   * Used only when digitMode is 8-bit. To specify an international address, use the following:
   * digitMode = EIGHT_BIT
   * isNumberModeDataNetwork = true
   * numberType = INTERNATIONAL_OR_DATA_IP
   * numberPlan = TELEPHONY
   * digits = ASCII digits, e.g. '1', '2', '3', '4', and '5'
   * Values are NUMBER_TYPE_
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int numberType = 0;
  /**
   * Used only when digitMode is 8-bit.
   * Values are NUMBER_PLAN_
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int numberPlan = 0;
  /**
   * Each byte in this array represents a 4 bit or 8-bit digit of address data.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public byte[] digits;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CdmaSmsAddress> CREATOR = new android.os.Parcelable.Creator<CdmaSmsAddress>() {
    @Override
    public CdmaSmsAddress createFromParcel(android.os.Parcel _aidl_source) {
      CdmaSmsAddress _aidl_out = new CdmaSmsAddress();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CdmaSmsAddress[] newArray(int _aidl_size) {
      return new CdmaSmsAddress[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(digitMode);
    _aidl_parcel.writeBoolean(isNumberModeDataNetwork);
    _aidl_parcel.writeInt(numberType);
    _aidl_parcel.writeInt(numberPlan);
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
      digitMode = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isNumberModeDataNetwork = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      numberType = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      numberPlan = _aidl_parcel.readInt();
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
   * DTMF digits
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int DIGIT_MODE_FOUR_BIT = 0;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int DIGIT_MODE_EIGHT_BIT = 1;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_UNKNOWN = 0;
  /**
   * CCITT E.164 and E.163, including ISDN plan
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int NUMBER_PLAN_TELEPHONY = 1;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_2 = 2;
  /**
   * CCITT X.121
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int NUMBER_PLAN_DATA = 3;
  /**
   * CCITT F.69
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int NUMBER_PLAN_TELEX = 4;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_5 = 5;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_6 = 6;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_7 = 7;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_8 = 8;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_PRIVATE = 9;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_10 = 10;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_11 = 11;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_12 = 12;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_13 = 13;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_14 = 14;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_PLAN_RESERVED_15 = 15;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_TYPE_UNKNOWN = 0;
  /**
   * INTERNATIONAL is used when number mode is not data network address. DATA_IP is used when the
   * number mode is data network address.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int NUMBER_TYPE_INTERNATIONAL_OR_DATA_IP = 1;
  /**
   * NATIONAL is used when the number mode is not data netework address. INTERNET_MAIL is used
   * when the number mode is data network address. For INTERNET_MAIL, in the address data
   * "digits", each byte contains an ASCII character. Examples are: "x@y.com,a@b.com"
   * Ref TIA/EIA-637A 3.4.3.3
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int NUMBER_TYPE_NATIONAL_OR_INTERNET_MAIL = 2;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_TYPE_NETWORK = 3;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_TYPE_SUBSCRIBER = 4;
  /**
   * GSM SMS: address value is GSM 7-bit chars
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public static final int NUMBER_TYPE_ALPHANUMERIC = 5;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_TYPE_ABBREVIATED = 6;
  /** @deprecated Legacy CDMA is unsupported. */
  @Deprecated
  public static final int NUMBER_TYPE_RESERVED_7 = 7;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("digitMode: " + (digitMode));
    _aidl_sj.add("isNumberModeDataNetwork: " + (isNumberModeDataNetwork));
    _aidl_sj.add("numberType: " + (numberType));
    _aidl_sj.add("numberPlan: " + (numberPlan));
    _aidl_sj.add("digits: " + (java.util.Arrays.toString(digits)));
    return "CdmaSmsAddress" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
