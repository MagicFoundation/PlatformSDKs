/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 4 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.ims/3 --previous_hash b2a615a151c7114c4216b1987fd32d40c797d00a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen/android/hardware/radio/ims/ImsRegistration.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/ims/ImsRegistration.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.ims;
/** @hide */
public class ImsRegistration implements android.os.Parcelable
{
  /** Indicates the current IMS registration state. */
  public int regState = android.hardware.radio.ims.ImsRegistrationState.NOT_REGISTERED;
  /** Indicates the type of the radio access network where IMS is registered. */
  public int accessNetworkType = android.hardware.radio.AccessNetwork.UNKNOWN;
  /** Indicates the expected action for the radio to do. */
  public int suggestedAction = android.hardware.radio.ims.SuggestedAction.NONE;
  /**
   * Values are bitwise ORs of IMS_MMTEL_CAPABILITY_* constants and IMS_RCS_CAPABILITIES.
   * IMS capability such as VOICE, VIDEO, SMS and RCS.
   */
  public int capabilities = 0;
  /**
   * Indicates the registration throttling time in seconds.
   * This value is only applicable if the suggested action is
   * SuggestedAction#TRIGGER_THROTTLE_TIME
   */
  public int throttlingTimeSec = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<ImsRegistration> CREATOR = new android.os.Parcelable.Creator<ImsRegistration>() {
    @Override
    public ImsRegistration createFromParcel(android.os.Parcel _aidl_source) {
      ImsRegistration _aidl_out = new ImsRegistration();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ImsRegistration[] newArray(int _aidl_size) {
      return new ImsRegistration[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(regState);
    _aidl_parcel.writeInt(accessNetworkType);
    _aidl_parcel.writeInt(suggestedAction);
    _aidl_parcel.writeInt(capabilities);
    if (false) {;
      _aidl_parcel.writeInt(throttlingTimeSec);
    };
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
      accessNetworkType = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      suggestedAction = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      capabilities = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      if (false) {;
        throttlingTimeSec = _aidl_parcel.readInt();
      };
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /** Default value */
  public static final int IMS_MMTEL_CAPABILITY_NONE = 0;
  /** IMS voice */
  public static final int IMS_MMTEL_CAPABILITY_VOICE = 1;
  /** IMS video */
  public static final int IMS_MMTEL_CAPABILITY_VIDEO = 2;
  /** IMS SMS */
  public static final int IMS_MMTEL_CAPABILITY_SMS = 4;
  /** IMS RCS */
  public static final int IMS_RCS_CAPABILITIES = 8;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("regState: " + (android.hardware.radio.ims.ImsRegistrationState.$.toString(regState)));
    _aidl_sj.add("accessNetworkType: " + (android.hardware.radio.AccessNetwork.$.toString(accessNetworkType)));
    _aidl_sj.add("suggestedAction: " + (android.hardware.radio.ims.SuggestedAction.$.toString(suggestedAction)));
    _aidl_sj.add("capabilities: " + (capabilities));
    _aidl_sj.add("throttlingTimeSec: " + (throttlingTimeSec));
    return "ImsRegistration" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
