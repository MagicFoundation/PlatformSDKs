/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 4 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.ims/3 --previous_hash b2a615a151c7114c4216b1987fd32d40c797d00a --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen/android/hardware/radio/ims/ConnectionFailureInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.ims-V4-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/ims/ConnectionFailureInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.ims;
/** @hide */
public class ConnectionFailureInfo implements android.os.Parcelable
{
  /** Values are REASON_* constants */
  public int failureReason = android.hardware.radio.ims.ConnectionFailureInfo.ConnectionFailureReason.INVALID;
  /** Failure cause code from network or modem specific to the failure */
  public int causeCode = 0;
  /** Retry wait time provided by network in milliseconds */
  public int waitTimeMillis = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<ConnectionFailureInfo> CREATOR = new android.os.Parcelable.Creator<ConnectionFailureInfo>() {
    @Override
    public ConnectionFailureInfo createFromParcel(android.os.Parcel _aidl_source) {
      ConnectionFailureInfo _aidl_out = new ConnectionFailureInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ConnectionFailureInfo[] newArray(int _aidl_size) {
      return new ConnectionFailureInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(failureReason);
    _aidl_parcel.writeInt(causeCode);
    _aidl_parcel.writeInt(waitTimeMillis);
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
      failureReason = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      causeCode = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      waitTimeMillis = _aidl_parcel.readInt();
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
    _aidl_sj.add("failureReason: " + (failureReason));
    _aidl_sj.add("causeCode: " + (causeCode));
    _aidl_sj.add("waitTimeMillis: " + (waitTimeMillis));
    return "ConnectionFailureInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
  public static @interface ConnectionFailureReason {
    /** Do not use. */
    public static final int INVALID = 0;
    /** Access class check failed */
    public static final int REASON_ACCESS_DENIED = 1;
    /** 3GPP Non-access stratum failure */
    public static final int REASON_NAS_FAILURE = 2;
    /** Random access failure */
    public static final int REASON_RACH_FAILURE = 3;
    /** Radio link failure */
    public static final int REASON_RLC_FAILURE = 4;
    /** Radio connection establishment rejected by network */
    public static final int REASON_RRC_REJECT = 5;
    /** Radio connection establishment timed out */
    public static final int REASON_RRC_TIMEOUT = 6;
    /** Device currently not in service */
    public static final int REASON_NO_SERVICE = 7;
    /** The PDN is no more active */
    public static final int REASON_PDN_NOT_AVAILABLE = 8;
    /** Radio resource is busy with another subscription */
    public static final int REASON_RF_BUSY = 9;
    public static final int REASON_UNSPECIFIED = 65535;
  }
}
