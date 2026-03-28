/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/LinkCapacityEstimate.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/LinkCapacityEstimate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class LinkCapacityEstimate implements android.os.Parcelable
{
  /**
   * Estimated downlink capacity in kbps. In case of a dual connected network, this includes
   * capacity of both primary and secondary. This bandwidth estimate shall be the estimated
   * maximum sustainable link bandwidth (as would be measured at the Upper PDCP or SNDCP SAP).
   * If the DL Aggregate Maximum Bit Rate is known, this value shall not exceed the DL-AMBR for
   * the Internet PDN connection. This must be filled with 0 if the network is not connected.
   */
  public int downlinkCapacityKbps = 0;
  /**
   * Estimated uplink capacity in kbps. In case of a dual connected network, this includes
   * capacity of both primary and secondary. This bandwidth estimate shall be the estimated
   * maximum sustainable link bandwidth (as would be measured at the Upper PDCP or SNDCP SAP).
   * If the UL Aggregate Maximum Bit Rate is known, this value shall not exceed the UL-AMBR for
   * the Internet PDN connection. This must be filled with 0 if the network is not connected.
   */
  public int uplinkCapacityKbps = 0;
  /**
   * Estimated downlink capacity of secondary carrier in a dual connected NR mode in kbps. This
   * bandwidth estimate shall be the estimated maximum sustainable link bandwidth (as would be
   * measured at the Upper PDCP or SNDCP SAP). This is valid only in if device is connected to
   * both primary and secondary in dual connected mode. This must be filled with 0 if secondary is
   * not connected or if modem does not support this feature.
   */
  public int secondaryDownlinkCapacityKbps = 0;
  /**
   * Estimated uplink capacity secondary carrier in a dual connected NR mode in kbps. This
   * bandwidth estimate shall be the estimated maximum sustainable link bandwidth (as would be
   * measured at the Upper PDCP or SNDCP SAP). This is valid only in if device is connected to
   * both primary and secondary in dual connected mode.This must be filled with 0 if secondary is
   * not connected or if modem does not support this feature.
   */
  public int secondaryUplinkCapacityKbps = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<LinkCapacityEstimate> CREATOR = new android.os.Parcelable.Creator<LinkCapacityEstimate>() {
    @Override
    public LinkCapacityEstimate createFromParcel(android.os.Parcel _aidl_source) {
      LinkCapacityEstimate _aidl_out = new LinkCapacityEstimate();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public LinkCapacityEstimate[] newArray(int _aidl_size) {
      return new LinkCapacityEstimate[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(downlinkCapacityKbps);
    _aidl_parcel.writeInt(uplinkCapacityKbps);
    _aidl_parcel.writeInt(secondaryDownlinkCapacityKbps);
    _aidl_parcel.writeInt(secondaryUplinkCapacityKbps);
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
      downlinkCapacityKbps = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      uplinkCapacityKbps = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      secondaryDownlinkCapacityKbps = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      secondaryUplinkCapacityKbps = _aidl_parcel.readInt();
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
    _aidl_sj.add("downlinkCapacityKbps: " + (downlinkCapacityKbps));
    _aidl_sj.add("uplinkCapacityKbps: " + (uplinkCapacityKbps));
    _aidl_sj.add("secondaryDownlinkCapacityKbps: " + (secondaryDownlinkCapacityKbps));
    _aidl_sj.add("secondaryUplinkCapacityKbps: " + (secondaryUplinkCapacityKbps));
    return "LinkCapacityEstimate" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
