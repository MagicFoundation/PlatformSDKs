/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/CarrierInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/CarrierInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/** @hide */
public class CarrierInfo implements android.os.Parcelable
{
  /** MCC (Mobile Country Code) of Carrier. Wild char is either '*' or '?'. */
  public java.lang.String mcc;
  /** MNC (Mobile Network Code) of the Carrier. Wild char is either '*' or '?'. */
  public java.lang.String mnc;
  /** Service Provider Name(SPN) of the SIM card of the Carrier. */
  public java.lang.String spn;
  /** GID1 value of the SIM card of the Carrier. */
  public java.lang.String gid1;
  /** GID2 value of the SIM card of the Carrier. */
  public java.lang.String gid2;
  /** IMSI (International Mobile Subscriber Identity) prefix. Wild char is '*'. */
  public java.lang.String imsiPrefix;
  /** Equivalent HPLMN of the SIM card of the Carrier. */
  public java.util.List<android.hardware.radio.sim.Plmn> ehplmn;
  /** ICCID (Integrated Circuit Card Identification) of the SIM card. */
  public java.lang.String iccid;
  /** IMPI (IMS Private Identity) of the SIM card of the Carrier. */
  public java.lang.String impi;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CarrierInfo> CREATOR = new android.os.Parcelable.Creator<CarrierInfo>() {
    @Override
    public CarrierInfo createFromParcel(android.os.Parcel _aidl_source) {
      CarrierInfo _aidl_out = new CarrierInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CarrierInfo[] newArray(int _aidl_size) {
      return new CarrierInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(mcc);
    _aidl_parcel.writeString(mnc);
    _aidl_parcel.writeString(spn);
    _aidl_parcel.writeString(gid1);
    _aidl_parcel.writeString(gid2);
    _aidl_parcel.writeString(imsiPrefix);
    _aidl_parcel.writeTypedList(ehplmn, _aidl_flag);
    _aidl_parcel.writeString(iccid);
    _aidl_parcel.writeString(impi);
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
      spn = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      gid1 = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      gid2 = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      imsiPrefix = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ehplmn = _aidl_parcel.createTypedArrayList(android.hardware.radio.sim.Plmn.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      iccid = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      impi = _aidl_parcel.readString();
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
    _aidl_sj.add("spn: " + (java.util.Objects.toString(spn)));
    _aidl_sj.add("gid1: " + (java.util.Objects.toString(gid1)));
    _aidl_sj.add("gid2: " + (java.util.Objects.toString(gid2)));
    _aidl_sj.add("imsiPrefix: " + (java.util.Objects.toString(imsiPrefix)));
    _aidl_sj.add("ehplmn: " + (java.util.Objects.toString(ehplmn)));
    _aidl_sj.add("iccid: " + (java.util.Objects.toString(iccid)));
    _aidl_sj.add("impi: " + (java.util.Objects.toString(impi)));
    return "CarrierInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(ehplmn);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof java.util.Collection) {
      int _mask = 0;
      for (Object o : (java.util.Collection) _v) {
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
