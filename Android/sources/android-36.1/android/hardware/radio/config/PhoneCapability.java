/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/4 --previous_hash fc7eeb47f5238e538dead4af7575507920c359f7 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen/android/hardware/radio/config/PhoneCapability.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/config/PhoneCapability.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.config;
/**
 * Phone capability which describes the data connection capability of the modem.
 * It's used to evaluate a possible phone config change, for example, from single
 * SIM device to multi-SIM device.
 * @hide
 */
public class PhoneCapability implements android.os.Parcelable
{
  /**
   * maxActiveData defines how many logical modems can have PS attached simultaneously. For
   * example, for a L+L modem, it should be 2.
   */
  public byte maxActiveData = 0;
  /**
   * maxActiveInternetData defines how many logical modems can have internet PDN connections
   * simultaneously. For example, for a L+L DSDS modem, it’s 1, and for a DSDA modem, it’s 2.
   */
  public byte maxActiveInternetData = 0;
  /**
   * Whether the modem supports both internet PDNs up, so that we can do a ping test on one PDN
   * before tearing down the other PDN.
   */
  public boolean isInternetLingeringSupported = false;
  /** List of logical modem IDs. */
  public byte[] logicalModemIds;
  /**
   * maxActiveVoice defines how many logical modems can have cellular voice calls simultaneously.
   * For example, for cellular DSDA with simultaneous calling support, it should be 2.
   */
  public byte maxActiveVoice = -1;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<PhoneCapability> CREATOR = new android.os.Parcelable.Creator<PhoneCapability>() {
    @Override
    public PhoneCapability createFromParcel(android.os.Parcel _aidl_source) {
      PhoneCapability _aidl_out = new PhoneCapability();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public PhoneCapability[] newArray(int _aidl_size) {
      return new PhoneCapability[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeByte(maxActiveData);
    _aidl_parcel.writeByte(maxActiveInternetData);
    _aidl_parcel.writeBoolean(isInternetLingeringSupported);
    _aidl_parcel.writeByteArray(logicalModemIds);
    _aidl_parcel.writeByte(maxActiveVoice);
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
      maxActiveData = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxActiveInternetData = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isInternetLingeringSupported = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      logicalModemIds = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxActiveVoice = _aidl_parcel.readByte();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final byte UNKNOWN = -1;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("maxActiveData: " + (maxActiveData));
    _aidl_sj.add("maxActiveInternetData: " + (maxActiveInternetData));
    _aidl_sj.add("isInternetLingeringSupported: " + (isInternetLingeringSupported));
    _aidl_sj.add("logicalModemIds: " + (java.util.Arrays.toString(logicalModemIds)));
    _aidl_sj.add("maxActiveVoice: " + (maxActiveVoice));
    return "PhoneCapability" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
