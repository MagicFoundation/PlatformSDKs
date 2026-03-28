/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/NrVopsInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/NrVopsInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * Type to define the NR specific network capabilities for voice over PS including emergency and
 * normal voice calls.
 * @hide
 */
public class NrVopsInfo implements android.os.Parcelable
{
  /**
   * This indicates if the camped network supports VoNR services, and what kind of services
   * it supports. This information is received from NR network during NR NAS registration
   * procedure through NR REGISTRATION ACCEPT.
   * Refer 3GPP 24.501 EPS 5GS network feature support -> IMS VoPS
   * Values are VOPS_INDICATOR_
   */
  public byte vopsSupported = 0;
  /**
   * This indicates if the camped network supports VoNR emergency service. This information
   * is received from NR network through two sources:
   * a. During NR NAS registration procedure through NR REGISTRATION ACCEPT.
   *    Refer 3GPP 24.501 EPS 5GS network feature support -> EMC
   * b. In case the device is not registered on the network.
   *    Refer 3GPP 38.331 SIB1 : ims-EmergencySupport
   *    If device is registered on NR, then this field indicates whether the cell
   *    supports IMS emergency bearer services for UEs in limited service mode.
   * Values are EMC_INDICATOR_
   */
  public byte emcSupported = 0;
  /**
   * This indicates if the camped network supports VoNR emergency service fallback. This
   * information is received from NR network during NR NAS registration procedure through
   * NR REGISTRATION ACCEPT.
   * Refer 3GPP 24.501 EPS 5GS network feature support -> EMF
   * Values are EMF_INDICATOR_ from TS 24.501 sec 9.10.3.5.
   */
  public byte emfSupported = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<NrVopsInfo> CREATOR = new android.os.Parcelable.Creator<NrVopsInfo>() {
    @Override
    public NrVopsInfo createFromParcel(android.os.Parcel _aidl_source) {
      NrVopsInfo _aidl_out = new NrVopsInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public NrVopsInfo[] newArray(int _aidl_size) {
      return new NrVopsInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeByte(vopsSupported);
    _aidl_parcel.writeByte(emcSupported);
    _aidl_parcel.writeByte(emfSupported);
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
      vopsSupported = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      emcSupported = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      emfSupported = _aidl_parcel.readByte();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /** Emergency services not supported */
  public static final byte EMC_INDICATOR_NOT_SUPPORTED = 0;
  /** Emergency services supported in NR connected to 5GCN only */
  public static final byte EMC_INDICATOR_NR_CONNECTED_TO_5GCN = 1;
  /** Emergency services supported in E-UTRA connected to 5GCN only */
  public static final byte EMC_INDICATOR_EUTRA_CONNECTED_TO_5GCN = 2;
  /** Emergency services supported in NR connected to 5GCN and E-UTRA connected to 5GCN */
  public static final byte EMC_INDICATOR_BOTH_NR_EUTRA_CONNECTED_TO_5GCN = 3;
  /** Emergency services fallback not supported */
  public static final byte EMF_INDICATOR_NOT_SUPPORTED = 0;
  /** Emergency services fallback supported in NR connected to 5GCN only */
  public static final byte EMF_INDICATOR_NR_CONNECTED_TO_5GCN = 1;
  /** Emergency services fallback supported in E-UTRA connected to 5GCN only */
  public static final byte EMF_INDICATOR_EUTRA_CONNECTED_TO_5GCN = 2;
  /** Emergency services fallback supported in NR connected to 5GCN and E-UTRA connected to 5GCN. */
  public static final byte EMF_INDICATOR_BOTH_NR_EUTRA_CONNECTED_TO_5GCN = 3;
  /** IMS voice over PS session not supported */
  public static final byte VOPS_INDICATOR_VOPS_NOT_SUPPORTED = 0;
  /** IMS voice over PS session supported over 3GPP access */
  public static final byte VOPS_INDICATOR_VOPS_OVER_3GPP = 1;
  /** IMS voice over PS session supported over non-3GPP access */
  public static final byte VOPS_INDICATOR_VOPS_OVER_NON_3GPP = 2;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("vopsSupported: " + (vopsSupported));
    _aidl_sj.add("emcSupported: " + (emcSupported));
    _aidl_sj.add("emfSupported: " + (emfSupported));
    return "NrVopsInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
