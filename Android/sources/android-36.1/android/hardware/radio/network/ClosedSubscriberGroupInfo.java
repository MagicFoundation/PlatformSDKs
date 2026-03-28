/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/ClosedSubscriberGroupInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/ClosedSubscriberGroupInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class ClosedSubscriberGroupInfo implements android.os.Parcelable
{
  /**
   * Indicates whether the cell is restricted to only CSG members. A cell not broadcasting the
   * CSG Indication but reporting CSG information is considered a Hybrid Cell.
   * Refer to the "csg-Indication" field in 3GPP TS 36.331 section 6.2.2
   * SystemInformationBlockType1.
   * Also refer to "CSG Indicator" in 3GPP TS 25.331 section 10.2.48.8.1 and TS 25.304.
   */
  public boolean csgIndication = false;
  /**
   * The human-readable name of the closed subscriber group operating this cell.
   * Refer to "hnb-Name" in TS 36.331 section 6.2.2 SystemInformationBlockType9.
   * Also refer to "HNB Name" in 3GPP TS25.331 section 10.2.48.8.23 and TS 23.003 section 4.8.
   */
  public java.lang.String homeNodebName;
  /**
   * The identity of the closed subscriber group that the cell belongs to.
   * Refer to "CSG-Identity" in TS 36.336 section 6.3.4.
   * Also refer to "CSG Identity" in 3GPP TS 25.331 section 10.3.2.8 and TS 23.003 section 4.7.
   */
  public int csgIdentity = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<ClosedSubscriberGroupInfo> CREATOR = new android.os.Parcelable.Creator<ClosedSubscriberGroupInfo>() {
    @Override
    public ClosedSubscriberGroupInfo createFromParcel(android.os.Parcel _aidl_source) {
      ClosedSubscriberGroupInfo _aidl_out = new ClosedSubscriberGroupInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ClosedSubscriberGroupInfo[] newArray(int _aidl_size) {
      return new ClosedSubscriberGroupInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeBoolean(csgIndication);
    _aidl_parcel.writeString(homeNodebName);
    _aidl_parcel.writeInt(csgIdentity);
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
      csgIndication = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      homeNodebName = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      csgIdentity = _aidl_parcel.readInt();
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
    _aidl_sj.add("csgIndication: " + (csgIndication));
    _aidl_sj.add("homeNodebName: " + (java.util.Objects.toString(homeNodebName)));
    _aidl_sj.add("csgIdentity: " + (csgIdentity));
    return "ClosedSubscriberGroupInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
