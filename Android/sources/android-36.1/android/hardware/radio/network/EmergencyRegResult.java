/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/EmergencyRegResult.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/EmergencyRegResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class EmergencyRegResult implements android.os.Parcelable
{
  /** Indicates the cellular access network of the current emergency capable system. */
  public int accessNetwork = android.hardware.radio.AccessNetwork.UNKNOWN;
  /** Registration state of the current emergency capable system. */
  public int regState = android.hardware.radio.network.RegState.NOT_REG_MT_NOT_SEARCHING_OP;
  /** EMC domain indicates the current domain of the acquired system. */
  public int emcDomain = android.hardware.radio.network.Domain.INVALID;
  /** This indicates whether the network supports voice over PS network. */
  public boolean isVopsSupported = false;
  /**
   * This indicates if camped network support VoLTE emergency bearers.
   * This should only be set if the UE is in LTE mode.
   */
  public boolean isEmcBearerSupported = false;
  /**
   * The value of the network provided EMC 5G Registration ACCEPT.
   * This should be set only if  the UE is in 5G mode.
   */
  public byte nwProvidedEmc = 0;
  /**
   * The value of the network provided EMF ( EPS Fallback) in 5G Registration ACCEPT.
   * This should not be set if UE is not in 5G mode.
   */
  public byte nwProvidedEmf = 0;
  /** 3-digit Mobile Country Code, 000..999, empty string if unknown. */
  public java.lang.String mcc = "";
  /** 2 or 3-digit Mobile Network Code, 00..999, empty string if unknown. */
  public java.lang.String mnc = "";
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<EmergencyRegResult> CREATOR = new android.os.Parcelable.Creator<EmergencyRegResult>() {
    @Override
    public EmergencyRegResult createFromParcel(android.os.Parcel _aidl_source) {
      EmergencyRegResult _aidl_out = new EmergencyRegResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public EmergencyRegResult[] newArray(int _aidl_size) {
      return new EmergencyRegResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(accessNetwork);
    _aidl_parcel.writeInt(regState);
    _aidl_parcel.writeInt(emcDomain);
    _aidl_parcel.writeBoolean(isVopsSupported);
    _aidl_parcel.writeBoolean(isEmcBearerSupported);
    _aidl_parcel.writeByte(nwProvidedEmc);
    _aidl_parcel.writeByte(nwProvidedEmf);
    _aidl_parcel.writeString(mcc);
    _aidl_parcel.writeString(mnc);
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
      accessNetwork = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      regState = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      emcDomain = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isVopsSupported = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isEmcBearerSupported = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      nwProvidedEmc = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      nwProvidedEmf = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mcc = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mnc = _aidl_parcel.readString();
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
    _aidl_sj.add("accessNetwork: " + (android.hardware.radio.AccessNetwork.$.toString(accessNetwork)));
    _aidl_sj.add("regState: " + (android.hardware.radio.network.RegState.$.toString(regState)));
    _aidl_sj.add("emcDomain: " + (android.hardware.radio.network.Domain.$.toString(emcDomain)));
    _aidl_sj.add("isVopsSupported: " + (isVopsSupported));
    _aidl_sj.add("isEmcBearerSupported: " + (isEmcBearerSupported));
    _aidl_sj.add("nwProvidedEmc: " + (nwProvidedEmc));
    _aidl_sj.add("nwProvidedEmf: " + (nwProvidedEmf));
    _aidl_sj.add("mcc: " + (java.util.Objects.toString(mcc)));
    _aidl_sj.add("mnc: " + (java.util.Objects.toString(mnc)));
    return "EmergencyRegResult" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
