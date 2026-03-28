/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 4 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.ims/3 --previous_hash b2a615a151c7114c4216b1987fd32d40c797d00a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen/android/hardware/radio/ims/SrvccCall.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/ims/SrvccCall.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.ims;
/** @hide */
public class SrvccCall implements android.os.Parcelable
{
  /** Connection index */
  public int index = 0;
  /** The type of the call */
  public int callType = android.hardware.radio.ims.SrvccCall.CallType.NORMAL;
  /** Values are android.hardware.radio.voice.Call.STATE_* constants */
  public int callState = 0;
  /** The substate of the call */
  public int callSubstate = android.hardware.radio.ims.SrvccCall.CallSubState.NONE;
  /** The type of the ringback tone */
  public int ringbackToneType = android.hardware.radio.ims.SrvccCall.ToneType.NONE;
  /** true if is mpty call */
  public boolean isMpty = false;
  /** true if call is mobile terminated */
  public boolean isMT = false;
  /** Remote party nummber */
  public java.lang.String number;
  /** Values are android.hardware.radio.voice.Call.PRESENTATION_* constants */
  public int numPresentation = 0;
  /** Remote party name */
  public java.lang.String name;
  /** Values are android.hardware.radio.voice.Call.PRESENTATION_* constants */
  public int namePresentation = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SrvccCall> CREATOR = new android.os.Parcelable.Creator<SrvccCall>() {
    @Override
    public SrvccCall createFromParcel(android.os.Parcel _aidl_source) {
      SrvccCall _aidl_out = new SrvccCall();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SrvccCall[] newArray(int _aidl_size) {
      return new SrvccCall[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(index);
    _aidl_parcel.writeInt(callType);
    _aidl_parcel.writeInt(callState);
    _aidl_parcel.writeInt(callSubstate);
    _aidl_parcel.writeInt(ringbackToneType);
    _aidl_parcel.writeBoolean(isMpty);
    _aidl_parcel.writeBoolean(isMT);
    _aidl_parcel.writeString(number);
    _aidl_parcel.writeInt(numPresentation);
    _aidl_parcel.writeString(name);
    _aidl_parcel.writeInt(namePresentation);
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
      index = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      callType = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      callState = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      callSubstate = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ringbackToneType = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isMpty = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isMT = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      number = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      numPresentation = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      name = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      namePresentation = _aidl_parcel.readInt();
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
    _aidl_sj.add("index: " + (index));
    _aidl_sj.add("callType: " + (callType));
    _aidl_sj.add("callState: " + (callState));
    _aidl_sj.add("callSubstate: " + (callSubstate));
    _aidl_sj.add("ringbackToneType: " + (ringbackToneType));
    _aidl_sj.add("isMpty: " + (isMpty));
    _aidl_sj.add("isMT: " + (isMT));
    _aidl_sj.add("number: " + (java.util.Objects.toString(number)));
    _aidl_sj.add("numPresentation: " + (numPresentation));
    _aidl_sj.add("name: " + (java.util.Objects.toString(name)));
    _aidl_sj.add("namePresentation: " + (namePresentation));
    return "SrvccCall" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
  public static @interface CallType {
    public static final int NORMAL = 0;
    public static final int EMERGENCY = 1;
  }
  public static @interface CallSubState {
    public static final int NONE = 0;
    /** Pre-alerting state. Applicable for MT calls only */
    public static final int PREALERTING = 1;
  }
  public static @interface ToneType {
    public static final int NONE = 0;
    public static final int LOCAL = 1;
    public static final int NETWORK = 2;
  }
}
