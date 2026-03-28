/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.messaging/4 --previous_hash b28416394e6595c08e97c0473855eb05eed1baed --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen/android/hardware/radio/messaging/GsmBroadcastSmsConfigInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.messaging-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/messaging/GsmBroadcastSmsConfigInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.messaging;
/**
 * Which types of Cell Broadcast Message (CBM) are to be received by the ME
 * @hide
 */
public class GsmBroadcastSmsConfigInfo implements android.os.Parcelable
{
  /**
   * Beginning of the range of CBM message identifiers whose value is 0x0000 - 0xFFFF as defined
   * in TS 23.041 9.4.1.2.2 for GMS and 9.4.4.2.2 for UMTS.
   * All other values must be treated as empty CBM message ID.
   */
  public int fromServiceId = 0;
  /**
   * End of the range of CBM message identifiers whose value is 0x0000 - 0xFFFF as defined in
   * TS 23.041 9.4.1.2.2 for GMS and 9.4.4.2.2 for UMTS.
   * All other values must be treated as empty CBM message ID.
   */
  public int toServiceId = 0;
  /**
   * Beginning of the range of CBM data coding schemes whose value is 0x00 - 0xFF as defined in
   * TS 23.041 9.4.1.2.3 for GMS and 9.4.4.2.3 for UMTS.
   * All other values must be treated as empty CBM data coding scheme.
   */
  public int fromCodeScheme = 0;
  /**
   * End of the range of CBM data coding schemes whose value is 0x00 - 0xFF as defined in
   * TS 23.041 9.4.1.2.3 for GMS and 9.4.4.2.3 for UMTS.
   * All other values must be treated as empty CBM data coding scheme.
   */
  public int toCodeScheme = 0;
  /**
   * False means message types specified in <fromServiceId, toServiceId>
   * and <fromCodeScheme, toCodeScheme> are not accepted, while true means accepted.
   */
  public boolean selected = false;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<GsmBroadcastSmsConfigInfo> CREATOR = new android.os.Parcelable.Creator<GsmBroadcastSmsConfigInfo>() {
    @Override
    public GsmBroadcastSmsConfigInfo createFromParcel(android.os.Parcel _aidl_source) {
      GsmBroadcastSmsConfigInfo _aidl_out = new GsmBroadcastSmsConfigInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public GsmBroadcastSmsConfigInfo[] newArray(int _aidl_size) {
      return new GsmBroadcastSmsConfigInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(fromServiceId);
    _aidl_parcel.writeInt(toServiceId);
    _aidl_parcel.writeInt(fromCodeScheme);
    _aidl_parcel.writeInt(toCodeScheme);
    _aidl_parcel.writeBoolean(selected);
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
      fromServiceId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      toServiceId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      fromCodeScheme = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      toCodeScheme = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      selected = _aidl_parcel.readBoolean();
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
    _aidl_sj.add("fromServiceId: " + (fromServiceId));
    _aidl_sj.add("toServiceId: " + (toServiceId));
    _aidl_sj.add("fromCodeScheme: " + (fromCodeScheme));
    _aidl_sj.add("toCodeScheme: " + (toCodeScheme));
    _aidl_sj.add("selected: " + (selected));
    return "GsmBroadcastSmsConfigInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
