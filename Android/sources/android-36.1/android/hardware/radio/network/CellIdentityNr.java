/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/CellIdentityNr.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/CellIdentityNr.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * The CellIdentity structure should be reported once for each element of the PLMN-IdentityInfoList
 * broadcast in SIB1 CellAccessRelatedInfo as per 3GPP TS 38.331 Section 6.3.2.
 * @hide
 */
public class CellIdentityNr implements android.os.Parcelable
{
  /**
   * 3-digit Mobile Country Code, in range[0, 999]; This value must be valid for registered or
   *  camped cells; Empty string means invalid/unreported.
   */
  public java.lang.String mcc;
  /**
   * 2 or 3-digit Mobile Network Code, in range [0, 999], This value must be valid for
   * registered or camped cells; Empty string means invalid/unreported.
   */
  public java.lang.String mnc;
  /**
   * NR Cell Identity in range [0, 68719476735] (36 bits) described in 3GPP TS 38.331, which
   * unambiguously identifies a cell within a PLMN. This value must be valid for registered or
   * camped cells; LONG_MAX (2^63-1) means invalid/unreported.
   */
  public long nci = 0L;
  /** Physical cell id in range [0, 1007] described in 3GPP TS 38.331. This value must be valid. */
  public int pci = 0;
  /** 16-bit tracking area code, RadioConst:VALUE_UNAVAILABLE means invalid/unreported. */
  public int tac = 0;
  /**
   * NR Absolute Radio Frequency Channel Number, in range [0, 3279165].
   * Reference: 3GPP TS 38.101-1 and 3GPP TS 38.101-2 section 5.4.2.1.
   * This value must be valid.
   */
  public int nrarfcn = 0;
  /** OperatorInfo containing alphaLong and alphaShort */
  public android.hardware.radio.network.OperatorInfo operatorNames;
  /** Additional PLMN-IDs beyond the primary PLMN broadcast for this cell */
  public java.lang.String[] additionalPlmns;
  /** Bands used by the cell. */
  public int[] bands;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CellIdentityNr> CREATOR = new android.os.Parcelable.Creator<CellIdentityNr>() {
    @Override
    public CellIdentityNr createFromParcel(android.os.Parcel _aidl_source) {
      CellIdentityNr _aidl_out = new CellIdentityNr();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CellIdentityNr[] newArray(int _aidl_size) {
      return new CellIdentityNr[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(mcc);
    _aidl_parcel.writeString(mnc);
    _aidl_parcel.writeLong(nci);
    _aidl_parcel.writeInt(pci);
    _aidl_parcel.writeInt(tac);
    _aidl_parcel.writeInt(nrarfcn);
    _aidl_parcel.writeTypedObject(operatorNames, _aidl_flag);
    _aidl_parcel.writeStringArray(additionalPlmns);
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
      nci = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      pci = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      tac = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      nrarfcn = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      operatorNames = _aidl_parcel.readTypedObject(android.hardware.radio.network.OperatorInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      additionalPlmns = _aidl_parcel.createStringArray();
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
    _aidl_sj.add("nci: " + (nci));
    _aidl_sj.add("pci: " + (pci));
    _aidl_sj.add("tac: " + (tac));
    _aidl_sj.add("nrarfcn: " + (nrarfcn));
    _aidl_sj.add("operatorNames: " + (java.util.Objects.toString(operatorNames)));
    _aidl_sj.add("additionalPlmns: " + (java.util.Arrays.toString(additionalPlmns)));
    _aidl_sj.add("bands: " + (android.hardware.radio.network.NgranBands.$.arrayToString(bands)));
    return "CellIdentityNr" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(operatorNames);
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
