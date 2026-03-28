/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/LteVopsInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/LteVopsInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * Type to define the LTE specific network capabilities for voice over PS including emergency and
 * normal voice calls.
 * @hide
 */
public class LteVopsInfo implements android.os.Parcelable
{
  /**
   * This indicates if the camped network supports VoLTE services. This information is received from
   * LTE network during LTE NAS registration procedure through LTE ATTACH ACCEPT/TAU ACCEPT.
   * Refer 3GPP 24.301 EPS network feature support -> IMS VoPS
   */
  public boolean isVopsSupported = false;
  /**
   * This indicates if the camped network supports VoLTE emergency bearers. This information is
   * received from LTE network through two sources:
   * a. During LTE NAS registration procedure through LTE ATTACH ACCEPT/TAU ACCEPT. Refer
   *    3GPP 24.301 EPS network feature support -> EMC BS
   * b. In case the device is not registered on network. Refer 3GPP 25.331 LTE RRC
   *    SIB1 : ims-EmergencySupport-r9
   * If the device is registered on LTE, then this field indicates (a).
   * In case of limited service on LTE this field indicates (b).
   */
  public boolean isEmcBearerSupported = false;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<LteVopsInfo> CREATOR = new android.os.Parcelable.Creator<LteVopsInfo>() {
    @Override
    public LteVopsInfo createFromParcel(android.os.Parcel _aidl_source) {
      LteVopsInfo _aidl_out = new LteVopsInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public LteVopsInfo[] newArray(int _aidl_size) {
      return new LteVopsInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeBoolean(isVopsSupported);
    _aidl_parcel.writeBoolean(isEmcBearerSupported);
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
      isVopsSupported = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isEmcBearerSupported = _aidl_parcel.readBoolean();
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
    _aidl_sj.add("isVopsSupported: " + (isVopsSupported));
    _aidl_sj.add("isEmcBearerSupported: " + (isEmcBearerSupported));
    return "LteVopsInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
