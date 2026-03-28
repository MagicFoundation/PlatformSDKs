/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.modem/4 --previous_hash 787419262f7c39ea36c0fbe22681bada95d1f97b --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen/android/hardware/radio/modem/RadioCapability.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.modem-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/modem/RadioCapability.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.modem;
/** @hide */
public class RadioCapability implements android.os.Parcelable
{
  /** Unique session value defined by framework returned in all "responses/unslo". */
  public int session = 0;
  /** Values are PHASE_ */
  public int phase = 0;
  /** 32-bit bitmap of RadioAccessFamily. */
  public int raf = 0;
  /**
   * A UUID typically "com.xxxx.lmX" where X is the logical modem.
   * RadioConst:MAX_UUID_LENGTH is the max length.
   */
  public java.lang.String logicalModemUuid;
  /** Values are STATUS_ */
  public int status = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<RadioCapability> CREATOR = new android.os.Parcelable.Creator<RadioCapability>() {
    @Override
    public RadioCapability createFromParcel(android.os.Parcel _aidl_source) {
      RadioCapability _aidl_out = new RadioCapability();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public RadioCapability[] newArray(int _aidl_size) {
      return new RadioCapability[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(session);
    _aidl_parcel.writeInt(phase);
    _aidl_parcel.writeInt(raf);
    _aidl_parcel.writeString(logicalModemUuid);
    _aidl_parcel.writeInt(status);
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
      session = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      phase = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      raf = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      logicalModemUuid = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      status = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /** Logical Modem's (LM) initial value and value after PHASE_FINISH completes. */
  public static final int PHASE_CONFIGURED = 0;
  /**
   * PHASE_START is sent before PHASE_APPLY and indicates that an APPLY is forthcoming with these
   * same parameters.
   */
  public static final int PHASE_START = 1;
  /**
   * PHASE_APPLY is sent after all LM's receive PHASE_START and returned
   * RadioCapability.status = 0.
   * If any PHASE_START's fail, hal implementation must not send PHASE_APPLY.
   */
  public static final int PHASE_APPLY = 2;
  /** PHASE_UNSOL_RSP is sent with unsolicited radioCapability(). */
  public static final int PHASE_UNSOL_RSP = 3;
  /**
   * PHASE_FINISH is sent after all commands have completed. If an error occurs in any previous
   * command, the RadioAccessFamily and logicalModemUuid fields must be the prior configuration
   * thus restoring the configuration to the previous value. An error returned by PHASE_FINISH
   * will generally be ignored or may cause that LM to be removed from service.
   */
  public static final int PHASE_FINISH = 4;
  /** This parameter has no meaning with PHASE_START, PHASE_APPLY. */
  public static final int STATUS_NONE = 0;
  /** Tell modem the action transaction of set radio capability was successful with PHASE_FINISH. */
  public static final int STATUS_SUCCESS = 1;
  /** Tell modem the action transaction of set radio capability failed with PHASE_FINISH. */
  public static final int STATUS_FAIL = 2;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("session: " + (session));
    _aidl_sj.add("phase: " + (phase));
    _aidl_sj.add("raf: " + (raf));
    _aidl_sj.add("logicalModemUuid: " + (java.util.Objects.toString(logicalModemUuid)));
    _aidl_sj.add("status: " + (status));
    return "RadioCapability" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
