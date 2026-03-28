/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/IccIo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/IccIo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/** @hide */
public class IccIo implements android.os.Parcelable
{
  /** One of the commands listed for TS 27.007 +CRSM */
  public int command = 0;
  /** EF ID */
  public int fileId = 0;
  /**
   * "pathid" from TS 27.007 +CRSM command. Path is in hex ASCII format eg "7f205f70"
   * Path must always be provided.
   */
  public java.lang.String path;
  /** Value of p1 defined as per 3GPP TS 51.011 */
  public int p1 = 0;
  /** Value of p2 defined as per 3GPP TS 51.011 */
  public int p2 = 0;
  /** Value of p3 defined as per 3GPP TS 51.011 */
  public int p3 = 0;
  /** Information to be written to the SIM */
  public java.lang.String data;
  public java.lang.String pin2;
  /** AID value, See ETSI 102.221 8.1 and 101.220 4, empty string if no value. */
  public java.lang.String aid;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<IccIo> CREATOR = new android.os.Parcelable.Creator<IccIo>() {
    @Override
    public IccIo createFromParcel(android.os.Parcel _aidl_source) {
      IccIo _aidl_out = new IccIo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public IccIo[] newArray(int _aidl_size) {
      return new IccIo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(command);
    _aidl_parcel.writeInt(fileId);
    _aidl_parcel.writeString(path);
    _aidl_parcel.writeInt(p1);
    _aidl_parcel.writeInt(p2);
    _aidl_parcel.writeInt(p3);
    _aidl_parcel.writeString(data);
    _aidl_parcel.writeString(pin2);
    _aidl_parcel.writeString(aid);
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
      command = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      fileId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      path = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      p1 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      p2 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      p3 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      data = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      pin2 = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      aid = _aidl_parcel.readString();
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
    _aidl_sj.add("command: " + (command));
    _aidl_sj.add("fileId: " + (fileId));
    _aidl_sj.add("path: " + (java.util.Objects.toString(path)));
    _aidl_sj.add("p1: " + (p1));
    _aidl_sj.add("p2: " + (p2));
    _aidl_sj.add("p3: " + (p3));
    _aidl_sj.add("data: " + (java.util.Objects.toString(data)));
    _aidl_sj.add("pin2: " + (java.util.Objects.toString(pin2)));
    _aidl_sj.add("aid: " + (java.util.Objects.toString(aid)));
    return "IccIo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
