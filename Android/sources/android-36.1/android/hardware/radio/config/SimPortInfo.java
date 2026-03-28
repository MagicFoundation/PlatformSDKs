/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/4 --previous_hash fc7eeb47f5238e538dead4af7575507920c359f7 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen/android/hardware/radio/config/SimPortInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/config/SimPortInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.config;
/** @hide */
public class SimPortInfo implements android.os.Parcelable
{
  /**
   * Integrated Circuit Card IDentifier (ICCID) is the unique identifier of the SIM card. The file
   * is located in the SIM card at EFiccid (0x2FE2) as per ETSI 102.221. The ICCID is defined by
   * the ITU-T recommendation E.118 ISO/IEC 7816.
   * 
   * This data is applicable only when cardState is CardStatus.STATE_PRESENT.
   * 
   * This is the ICCID of the currently enabled profile. If no profile is enabled,
   * then it will contain the default boot profile’s ICCID.
   * If the EFiccid does not exist in the default boot profile, it will be null.
   */
  public java.lang.String iccId;
  /** The identifier of the active slot. */
  public int logicalSlotId = 0;
  /**
   * Port active status in the slot.
   * Inactive means that the logical modem is no longer associated to the port.
   * Active means that the logical modem is associated to the port.
   */
  public boolean portActive = false;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SimPortInfo> CREATOR = new android.os.Parcelable.Creator<SimPortInfo>() {
    @Override
    public SimPortInfo createFromParcel(android.os.Parcel _aidl_source) {
      SimPortInfo _aidl_out = new SimPortInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SimPortInfo[] newArray(int _aidl_size) {
      return new SimPortInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(iccId);
    _aidl_parcel.writeInt(logicalSlotId);
    _aidl_parcel.writeBoolean(portActive);
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
      iccId = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      logicalSlotId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      portActive = _aidl_parcel.readBoolean();
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
    _aidl_sj.add("iccId: " + (java.util.Objects.toString(iccId)));
    _aidl_sj.add("logicalSlotId: " + (logicalSlotId));
    _aidl_sj.add("portActive: " + (portActive));
    return "SimPortInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
