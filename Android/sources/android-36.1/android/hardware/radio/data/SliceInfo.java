/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/SliceInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/SliceInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/**
 * This struct represents a S-NSSAI as defined in 3GPP TS 24.501.
 * @hide
 */
public class SliceInfo implements android.os.Parcelable
{
  /**
   * The type of service provided by the slice. See: 3GPP TS 24.501 Section 9.11.2.8.
   * Values are SERVICE_TYPE_
   */
  public byte sliceServiceType = 0;
  /**
   * Slice differentiator is the identifier of a slice that has SliceServiceType as SST. A value
   * of -1 indicates that there is no corresponding SliceInfo of the HPLMN.
   * See: 3GPP TS 24.501 Section 9.11.2.8.
   */
  public int sliceDifferentiator = 0;
  /**
   * This SST corresponds to a SliceInfo (S-NSSAI) of the HPLMN; the SST is mapped to this value.
   * See: 3GPP TS 24.501 Section 9.11.2.8.
   * Values are SERVICE_TYPE_
   */
  public byte mappedHplmnSst = 0;
  /**
   * Present only if both sliceDifferentiator and mappedHplmnSst are also present. This SD
   * corresponds to a SliceInfo (S-NSSAI) of the HPLMN; sliceDifferentiator is mapped to this
   * value. A value of -1 indicates that there is no corresponding SliceInfo of the HPLMN.
   * See: 3GPP TS 24.501 Section 9.11.2.8.
   */
  public int mappedHplmnSd = 0;
  /**
   * Field to indicate the current status of the slice.
   * Values are STATUS_
   */
  public byte status = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SliceInfo> CREATOR = new android.os.Parcelable.Creator<SliceInfo>() {
    @Override
    public SliceInfo createFromParcel(android.os.Parcel _aidl_source) {
      SliceInfo _aidl_out = new SliceInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SliceInfo[] newArray(int _aidl_size) {
      return new SliceInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeByte(sliceServiceType);
    _aidl_parcel.writeInt(sliceDifferentiator);
    _aidl_parcel.writeByte(mappedHplmnSst);
    _aidl_parcel.writeInt(mappedHplmnSd);
    _aidl_parcel.writeByte(status);
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
      sliceServiceType = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sliceDifferentiator = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mappedHplmnSst = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mappedHplmnSd = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      status = _aidl_parcel.readByte();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /** Not specified */
  public static final byte SERVICE_TYPE_NONE = 0;
  /** Slice suitable for the handling of 5G enhanced Mobile Broadband */
  public static final byte SERVICE_TYPE_EMBB = 1;
  /** Slice suitable for the handling of ultra-reliable low latency communications */
  public static final byte SERVICE_TYPE_URLLC = 2;
  /** Slice suitable for the handling of massive IoT */
  public static final byte SERVICE_TYPE_MIOT = 3;
  public static final byte STATUS_UNKNOWN = 0;
  /** Configured but not allowed or rejected yet */
  public static final byte STATUS_CONFIGURED = 1;
  /** Allowed to be used */
  public static final byte STATUS_ALLOWED = 2;
  /** Rejected because not available in PLMN */
  public static final byte STATUS_REJECTED_NOT_AVAILABLE_IN_PLMN = 3;
  /** Rejected because not available in reg area */
  public static final byte STATUS_REJECTED_NOT_AVAILABLE_IN_REG_AREA = 4;
  /** Considered valid when configured/allowed slices are not available */
  public static final byte STATUS_DEFAULT_CONFIGURED = 5;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("sliceServiceType: " + (sliceServiceType));
    _aidl_sj.add("sliceDifferentiator: " + (sliceDifferentiator));
    _aidl_sj.add("mappedHplmnSst: " + (mappedHplmnSst));
    _aidl_sj.add("mappedHplmnSd: " + (mappedHplmnSd));
    _aidl_sj.add("status: " + (status));
    return "SliceInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
