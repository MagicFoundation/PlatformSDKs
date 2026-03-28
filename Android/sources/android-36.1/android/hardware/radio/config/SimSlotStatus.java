/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.config/4 --previous_hash fc7eeb47f5238e538dead4af7575507920c359f7 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen/android/hardware/radio/config/SimSlotStatus.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/config/SimSlotStatus.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.config;
/** @hide */
public class SimSlotStatus implements android.os.Parcelable
{
  /**
   * Card state in the physical slot. Values are CardStatus.[STATE_ABSENT, STATE_PRESENT,
   * STATE_ERROR, STATE_RESTRICTED].
   */
  public int cardState = 0;
  /**
   * An Answer To Reset (ATR) is a message output by a Smart Card conforming to ISO/IEC 7816
   * standards, following electrical reset of the card's chip. The ATR conveys information about
   * the communication parameters proposed by the card, and the card's nature and state.
   * 
   * This data is applicable only when cardState is CardStatus.STATE_PRESENT.
   */
  public java.lang.String atr;
  /**
   * The EID is the eUICC identifier. The EID shall be stored within the ECASD and can be
   * retrieved by the Device at any time using the standard GlobalPlatform GET DATA command.
   * 
   * This data is mandatory and applicable only when cardState is CardStatus.STATE_PRESENT and SIM
   * card supports eUICC.
   */
  public java.lang.String eid;
  /**
   * PortInfo contains the ICCID, logical slot ID, and port state.
   * Cardstate has no relationship with whether the slot is active or inactive. At least one port
   * shall always be reported, otherwise the logicalSlotIndex and portActive info will be lost.
   * For example, the pSIM can be removed, but the slot can still be active. In that case, the
   * SIM_STATUS reported for the corresponding logical stack will show CARDSTATE_ABSENT.
   * Similarly, even if there is no profile enabled on the eSIM, that port can still be the active
   * port in the slot mapping.
   */
  public android.hardware.radio.config.SimPortInfo[] portInfo;
  /**
   * Jointly supported Multiple Enabled Profiles(MEP) mode as per SGP.22 V3.0. Should always
   * report proper MEP mode irrespective of whether the slot is active or inactive.
   */
  public int supportedMepMode = android.hardware.radio.config.MultipleEnabledProfilesMode.NONE;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SimSlotStatus> CREATOR = new android.os.Parcelable.Creator<SimSlotStatus>() {
    @Override
    public SimSlotStatus createFromParcel(android.os.Parcel _aidl_source) {
      SimSlotStatus _aidl_out = new SimSlotStatus();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SimSlotStatus[] newArray(int _aidl_size) {
      return new SimSlotStatus[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(cardState);
    _aidl_parcel.writeString(atr);
    _aidl_parcel.writeString(eid);
    _aidl_parcel.writeTypedArray(portInfo, _aidl_flag);
    _aidl_parcel.writeInt(supportedMepMode);
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
      cardState = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      atr = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      eid = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      portInfo = _aidl_parcel.createTypedArray(android.hardware.radio.config.SimPortInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      supportedMepMode = _aidl_parcel.readInt();
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
    _aidl_sj.add("cardState: " + (cardState));
    _aidl_sj.add("atr: " + (java.util.Objects.toString(atr)));
    _aidl_sj.add("eid: " + (java.util.Objects.toString(eid)));
    _aidl_sj.add("portInfo: " + (java.util.Arrays.toString(portInfo)));
    _aidl_sj.add("supportedMepMode: " + (android.hardware.radio.config.MultipleEnabledProfilesMode.$.toString(supportedMepMode)));
    return "SimSlotStatus" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(portInfo);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
        _mask |= describeContents(o);
      }
      return _mask;
    }
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }
}
