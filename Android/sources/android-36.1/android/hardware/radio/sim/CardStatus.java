/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/CardStatus.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/CardStatus.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/** @hide */
public class CardStatus implements android.os.Parcelable
{
  /** Values are STATE_ */
  public int cardState = 0;
  /** Applicable to USIM and CSIM */
  public int universalPinState = android.hardware.radio.sim.PinState.UNKNOWN;
  /** Value < RadioConst:CARD_MAX_APPS, -1 if none */
  public int gsmUmtsSubscriptionAppIndex = 0;
  /**
   * Value ignored.
   * @deprecated Legacy CDMA is unsupported.
   */
  @Deprecated
  public int cdmaSubscriptionAppIndex = 0;
  /** Value < RadioConst:CARD_MAX_APPS, -1 if none */
  public int imsSubscriptionAppIndex = 0;
  /** size <= RadioConst::CARD_MAX_APPS */
  public android.hardware.radio.sim.AppStatus[] applications;
  /**
   * An Answer To Reset (ATR) is a message output by a Smart Card conforming to ISO/IEC 7816
   * standards, following electrical reset of the card's chip. The ATR conveys information about
   * the communication parameters proposed by the card, and the card's nature and state.
   * 
   * This data is applicable only when cardState is STATE_PRESENT.
   */
  public java.lang.String atr;
  /**
   * Integrated Circuit Card IDentifier (ICCID) is the Unique Identifier of the SIM CARD. File is
   * located in the SIM card at EFiccid (0x2FE2) as per ETSI 102.221. The ICCID is defined by
   * the ITU-T recommendation E.118 ISO/IEC 7816.
   * 
   * This data is applicable only when cardState is STATE_PRESENT.
   */
  public java.lang.String iccid;
  /**
   * The EID is the eUICC identifier. The EID shall be stored within the ECASD and can be
   * retrieved by the Device at any time using the standard GlobalPlatform GET DATA command.
   * 
   * This data is mandatory and applicable only when cardState is STATE_PRESENT and SIM card
   * supports eUICC.
   */
  public java.lang.String eid;
  /**
   * SlotPortMapping:
   * SlotPortMapping consists of physical slot id and port id.
   * Physical slot is the actual physical slot.
   * PortId is the id (enumerated value) for the associated port available on the SIM.
   */
  public android.hardware.radio.config.SlotPortMapping slotMap;
  /** Jointly supported Multiple Enabled Profiles(MEP) mode as per SGP.22 V3.0 */
  public int supportedMepMode = android.hardware.radio.config.MultipleEnabledProfilesMode.NONE;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CardStatus> CREATOR = new android.os.Parcelable.Creator<CardStatus>() {
    @Override
    public CardStatus createFromParcel(android.os.Parcel _aidl_source) {
      CardStatus _aidl_out = new CardStatus();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CardStatus[] newArray(int _aidl_size) {
      return new CardStatus[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(cardState);
    _aidl_parcel.writeInt(universalPinState);
    _aidl_parcel.writeInt(gsmUmtsSubscriptionAppIndex);
    _aidl_parcel.writeInt(cdmaSubscriptionAppIndex);
    _aidl_parcel.writeInt(imsSubscriptionAppIndex);
    _aidl_parcel.writeTypedArray(applications, _aidl_flag);
    _aidl_parcel.writeString(atr);
    _aidl_parcel.writeString(iccid);
    _aidl_parcel.writeString(eid);
    _aidl_parcel.writeTypedObject(slotMap, _aidl_flag);
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
      universalPinState = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      gsmUmtsSubscriptionAppIndex = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cdmaSubscriptionAppIndex = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      imsSubscriptionAppIndex = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      applications = _aidl_parcel.createTypedArray(android.hardware.radio.sim.AppStatus.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      atr = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      iccid = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      eid = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      slotMap = _aidl_parcel.readTypedObject(android.hardware.radio.config.SlotPortMapping.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      supportedMepMode = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /**
   * Card is physically absent from the device. (Some old modems use STATE_ABSENT when the SIM
   * is powered off. This is no longer correct, however the platform will still support this
   * legacy behavior.)
   */
  public static final int STATE_ABSENT = 0;
  /** Card is inserted in the device */
  public static final int STATE_PRESENT = 1;
  public static final int STATE_ERROR = 2;
  /** Card is present but not usable due to carrier restrictions */
  public static final int STATE_RESTRICTED = 3;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("cardState: " + (cardState));
    _aidl_sj.add("universalPinState: " + (android.hardware.radio.sim.PinState.$.toString(universalPinState)));
    _aidl_sj.add("gsmUmtsSubscriptionAppIndex: " + (gsmUmtsSubscriptionAppIndex));
    _aidl_sj.add("cdmaSubscriptionAppIndex: " + (cdmaSubscriptionAppIndex));
    _aidl_sj.add("imsSubscriptionAppIndex: " + (imsSubscriptionAppIndex));
    _aidl_sj.add("applications: " + (java.util.Arrays.toString(applications)));
    _aidl_sj.add("atr: " + (java.util.Objects.toString(atr)));
    _aidl_sj.add("iccid: " + (java.util.Objects.toString(iccid)));
    _aidl_sj.add("eid: " + (java.util.Objects.toString(eid)));
    _aidl_sj.add("slotMap: " + (java.util.Objects.toString(slotMap)));
    _aidl_sj.add("supportedMepMode: " + (android.hardware.radio.config.MultipleEnabledProfilesMode.$.toString(supportedMepMode)));
    return "CardStatus" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(applications);
    _mask |= describeContents(slotMap);
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
