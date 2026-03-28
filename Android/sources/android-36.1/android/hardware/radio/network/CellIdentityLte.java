/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/CellIdentityLte.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/CellIdentityLte.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/** @hide */
public class CellIdentityLte implements android.os.Parcelable
{
  /** 3-digit Mobile Country Code, 0..999, empty string if unknown */
  public java.lang.String mcc;
  /** 2 or 3-digit Mobile Network Code, 0..999, empty string if unknown */
  public java.lang.String mnc;
  /** 28-bit Cell Identity described in TS 27.007, RadioConst:VALUE_UNAVAILABLE if unknown */
  public int ci = 0;
  /** Physical cell id 0..503; this value must be valid */
  public int pci = 0;
  /** 16-bit tracking area code, RadioConst:VALUE_UNAVAILABLE if unknown */
  public int tac = 0;
  /** 18-bit LTE Absolute RF Channel Number; this value must be valid */
  public int earfcn = 0;
  /** OperatorInfo containing alphaLong and alphaShort */
  public android.hardware.radio.network.OperatorInfo operatorNames;
  /** Cell bandwidth, in kHz. Must be valid as described in TS 36.101 5.6. */
  public int bandwidth = 0;
  /** Additional PLMN-IDs beyond the primary PLMN broadcast for this cell */
  public java.lang.String[] additionalPlmns;
  /** Information about any closed subscriber group ID for this cell */
  public android.hardware.radio.network.ClosedSubscriberGroupInfo csgInfo;
  /** Bands used by the cell. */
  public int[] bands;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CellIdentityLte> CREATOR = new android.os.Parcelable.Creator<CellIdentityLte>() {
    @Override
    public CellIdentityLte createFromParcel(android.os.Parcel _aidl_source) {
      CellIdentityLte _aidl_out = new CellIdentityLte();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CellIdentityLte[] newArray(int _aidl_size) {
      return new CellIdentityLte[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(mcc);
    _aidl_parcel.writeString(mnc);
    _aidl_parcel.writeInt(ci);
    _aidl_parcel.writeInt(pci);
    _aidl_parcel.writeInt(tac);
    _aidl_parcel.writeInt(earfcn);
    _aidl_parcel.writeTypedObject(operatorNames, _aidl_flag);
    _aidl_parcel.writeInt(bandwidth);
    _aidl_parcel.writeStringArray(additionalPlmns);
    _aidl_parcel.writeTypedObject(csgInfo, _aidl_flag);
    _aidl_parcel.writeIntArray(bands);
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
      mcc = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mnc = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ci = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      pci = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      tac = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      earfcn = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      operatorNames = _aidl_parcel.readTypedObject(android.hardware.radio.network.OperatorInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      bandwidth = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      additionalPlmns = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      csgInfo = _aidl_parcel.readTypedObject(android.hardware.radio.network.ClosedSubscriberGroupInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      bands = _aidl_parcel.createIntArray();
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
    _aidl_sj.add("mcc: " + (java.util.Objects.toString(mcc)));
    _aidl_sj.add("mnc: " + (java.util.Objects.toString(mnc)));
    _aidl_sj.add("ci: " + (ci));
    _aidl_sj.add("pci: " + (pci));
    _aidl_sj.add("tac: " + (tac));
    _aidl_sj.add("earfcn: " + (earfcn));
    _aidl_sj.add("operatorNames: " + (java.util.Objects.toString(operatorNames)));
    _aidl_sj.add("bandwidth: " + (bandwidth));
    _aidl_sj.add("additionalPlmns: " + (java.util.Arrays.toString(additionalPlmns)));
    _aidl_sj.add("csgInfo: " + (java.util.Objects.toString(csgInfo)));
    _aidl_sj.add("bands: " + (android.hardware.radio.network.EutranBands.$.arrayToString(bands)));
    return "CellIdentityLte" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(operatorNames);
    _mask |= describeContents(csgInfo);
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
