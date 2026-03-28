/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/RegStateResult.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/RegStateResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class RegStateResult implements android.os.Parcelable
{
  /**
   * Registration state. If the RAT is indicated as a GERAN or UTRAN technology, this
   * value reports registration in the Circuit-switched domain. If the RAT is indicated as an
   * EUTRAN, NGRAN, or another technology that does not support circuit-switched services, this
   * value reports registration in the Packet-switched domain.
   */
  public int regState = android.hardware.radio.network.RegState.NOT_REG_MT_NOT_SEARCHING_OP;
  /**
   * Indicates the radio technology, which must not be UNKNOWN if regState is REG_HOME,
   * REG_ROAMING, NOT_REG_MT_NOT_SEARCHING_OP_EM, NOT_REG_MT_SEARCHING_OP_EM, REG_DENIED_EM,
   * or UNKNOWN_EM.
   * When the device is on carrier aggregation, vendor RIL service must properly report multiple
   * PhysicalChannelConfig elements through IRadioNetwork::currentPhysicalChannelConfigs.
   */
  public int rat = android.hardware.radio.RadioTechnology.UNKNOWN;
  /**
   * Cause code reported by the network in case registration fails. This will be a mobility
   * management cause code defined for MM, GMM, MME or equivalent as appropriate for the RAT.
   */
  public int reasonForDenial = android.hardware.radio.network.RegistrationFailCause.NONE;
  /** CellIdentity */
  public android.hardware.radio.network.CellIdentity cellIdentity;
  /**
   * The most-recent PLMN-ID upon which the UE registered (or attempted to register if a failure
   * is reported in the reasonForDenial field). This PLMN shall be in standard format consisting
   * of a 3 digit MCC concatenated with a 2 or 3 digit MNC.
   */
  public java.lang.String registeredPlmn;
  /** Access-technology-specific registration information. */
  public android.hardware.radio.network.AccessTechnologySpecificInfo accessTechnologySpecificInfo;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<RegStateResult> CREATOR = new android.os.Parcelable.Creator<RegStateResult>() {
    @Override
    public RegStateResult createFromParcel(android.os.Parcel _aidl_source) {
      RegStateResult _aidl_out = new RegStateResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public RegStateResult[] newArray(int _aidl_size) {
      return new RegStateResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(regState);
    _aidl_parcel.writeInt(rat);
    _aidl_parcel.writeInt(reasonForDenial);
    _aidl_parcel.writeTypedObject(cellIdentity, _aidl_flag);
    _aidl_parcel.writeString(registeredPlmn);
    _aidl_parcel.writeTypedObject(accessTechnologySpecificInfo, _aidl_flag);
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
      regState = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      rat = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      reasonForDenial = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cellIdentity = _aidl_parcel.readTypedObject(android.hardware.radio.network.CellIdentity.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      registeredPlmn = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      accessTechnologySpecificInfo = _aidl_parcel.readTypedObject(android.hardware.radio.network.AccessTechnologySpecificInfo.CREATOR);
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
    _aidl_sj.add("regState: " + (android.hardware.radio.network.RegState.$.toString(regState)));
    _aidl_sj.add("rat: " + (android.hardware.radio.RadioTechnology.$.toString(rat)));
    _aidl_sj.add("reasonForDenial: " + (android.hardware.radio.network.RegistrationFailCause.$.toString(reasonForDenial)));
    _aidl_sj.add("cellIdentity: " + (java.util.Objects.toString(cellIdentity)));
    _aidl_sj.add("registeredPlmn: " + (java.util.Objects.toString(registeredPlmn)));
    _aidl_sj.add("accessTechnologySpecificInfo: " + (java.util.Objects.toString(accessTechnologySpecificInfo)));
    return "RegStateResult" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(cellIdentity);
    _mask |= describeContents(accessTechnologySpecificInfo);
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
