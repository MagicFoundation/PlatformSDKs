/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/PhysicalChannelConfig.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/PhysicalChannelConfig.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class PhysicalChannelConfig implements android.os.Parcelable
{
  /** Connection status for cell. Valid values are PRIMARY_SERVING and SECONDARY_SERVING */
  public int status = android.hardware.radio.network.CellConnectionStatus.NONE;
  /** The radio technology for this physical channel */
  public int rat = android.hardware.radio.RadioTechnology.UNKNOWN;
  /** Downlink Absolute Radio Frequency Channel Number */
  public int downlinkChannelNumber = 0;
  /** Uplink Absolute Radio Frequency Channel Number */
  public int uplinkChannelNumber = 0;
  /** Downlink cell bandwidth, in kHz */
  public int cellBandwidthDownlinkKhz = 0;
  /** Uplink cell bandwidth, in kHz */
  public int cellBandwidthUplinkKhz = 0;
  /**
   * A list of data calls mapped to this physical channel. The context id must match the cid of
   * SetupDataCallResult. An empty list means the physical channel has no data call mapped to it.
   */
  public int[] contextIds;
  /**
   * The physical cell identifier for this cell.
   * In UTRAN, this value is primary scrambling code. The range is [0, 511].
   * Reference: 3GPP TS 25.213 section 5.2.2.
   * In EUTRAN, this value is physical layer cell identity. The range is [0, 503].
   * Reference: 3GPP TS 36.211 section 6.11.
   * In NGRAN, this value is physical layer cell identity. The range is [0, 1007].
   * Reference: 3GPP TS 38.211 section 7.4.2.1.
   */
  public int physicalCellId = 0;
  /** The frequency band to scan. */
  public android.hardware.radio.network.PhysicalChannelConfigBand band;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<PhysicalChannelConfig> CREATOR = new android.os.Parcelable.Creator<PhysicalChannelConfig>() {
    @Override
    public PhysicalChannelConfig createFromParcel(android.os.Parcel _aidl_source) {
      PhysicalChannelConfig _aidl_out = new PhysicalChannelConfig();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public PhysicalChannelConfig[] newArray(int _aidl_size) {
      return new PhysicalChannelConfig[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(status);
    _aidl_parcel.writeInt(rat);
    _aidl_parcel.writeInt(downlinkChannelNumber);
    _aidl_parcel.writeInt(uplinkChannelNumber);
    _aidl_parcel.writeInt(cellBandwidthDownlinkKhz);
    _aidl_parcel.writeInt(cellBandwidthUplinkKhz);
    _aidl_parcel.writeIntArray(contextIds);
    _aidl_parcel.writeInt(physicalCellId);
    _aidl_parcel.writeTypedObject(band, _aidl_flag);
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
      status = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      rat = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      downlinkChannelNumber = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      uplinkChannelNumber = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cellBandwidthDownlinkKhz = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cellBandwidthUplinkKhz = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      contextIds = _aidl_parcel.createIntArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      physicalCellId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      band = _aidl_parcel.readTypedObject(android.hardware.radio.network.PhysicalChannelConfigBand.CREATOR);
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
    _aidl_sj.add("status: " + (android.hardware.radio.network.CellConnectionStatus.$.toString(status)));
    _aidl_sj.add("rat: " + (android.hardware.radio.RadioTechnology.$.toString(rat)));
    _aidl_sj.add("downlinkChannelNumber: " + (downlinkChannelNumber));
    _aidl_sj.add("uplinkChannelNumber: " + (uplinkChannelNumber));
    _aidl_sj.add("cellBandwidthDownlinkKhz: " + (cellBandwidthDownlinkKhz));
    _aidl_sj.add("cellBandwidthUplinkKhz: " + (cellBandwidthUplinkKhz));
    _aidl_sj.add("contextIds: " + (java.util.Arrays.toString(contextIds)));
    _aidl_sj.add("physicalCellId: " + (physicalCellId));
    _aidl_sj.add("band: " + (java.util.Objects.toString(band)));
    return "PhysicalChannelConfig" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(band);
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
