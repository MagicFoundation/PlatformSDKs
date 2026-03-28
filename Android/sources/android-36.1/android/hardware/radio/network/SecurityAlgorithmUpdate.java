/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.network/4 --previous_hash 5867b4f5be491ec815fafea8a3f268b0295427df --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen/android/hardware/radio/network/SecurityAlgorithmUpdate.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.network-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/network/SecurityAlgorithmUpdate.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.network;
/**
 * A single occurrence capturing a notable change to previously reported
 * cryptography algorithms for a given network and network event.
 * 
 * @hide
 */
public class SecurityAlgorithmUpdate implements android.os.Parcelable
{
  /** Type of connection event which is being reported on */
  public int connectionEvent = android.hardware.radio.network.ConnectionEvent.CS_SIGNALLING_GSM;
  /** Encryption algorithm which was used */
  public int encryption = android.hardware.radio.network.SecurityAlgorithm.A50;
  /** Integrity algorithm which was used */
  public int integrity = android.hardware.radio.network.SecurityAlgorithm.A50;
  /** Whether or not an emergency session is ongoing and current connection is unprotected. */
  public boolean isUnprotectedEmergency = false;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SecurityAlgorithmUpdate> CREATOR = new android.os.Parcelable.Creator<SecurityAlgorithmUpdate>() {
    @Override
    public SecurityAlgorithmUpdate createFromParcel(android.os.Parcel _aidl_source) {
      SecurityAlgorithmUpdate _aidl_out = new SecurityAlgorithmUpdate();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SecurityAlgorithmUpdate[] newArray(int _aidl_size) {
      return new SecurityAlgorithmUpdate[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(connectionEvent);
    _aidl_parcel.writeInt(encryption);
    _aidl_parcel.writeInt(integrity);
    _aidl_parcel.writeBoolean(isUnprotectedEmergency);
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
      connectionEvent = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      encryption = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      integrity = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      isUnprotectedEmergency = _aidl_parcel.readBoolean();
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
    _aidl_sj.add("connectionEvent: " + (android.hardware.radio.network.ConnectionEvent.$.toString(connectionEvent)));
    _aidl_sj.add("encryption: " + (android.hardware.radio.network.SecurityAlgorithm.$.toString(encryption)));
    _aidl_sj.add("integrity: " + (android.hardware.radio.network.SecurityAlgorithm.$.toString(integrity)));
    _aidl_sj.add("isUnprotectedEmergency: " + (isUnprotectedEmergency));
    return "SecurityAlgorithmUpdate" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
