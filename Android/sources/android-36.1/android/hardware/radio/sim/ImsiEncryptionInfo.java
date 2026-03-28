/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/ImsiEncryptionInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/ImsiEncryptionInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/**
 * Carrier specific Information sent by the carrier, which will be used to encrypt IMSI and IMPI.
 * @hide
 */
public class ImsiEncryptionInfo implements android.os.Parcelable
{
  /** MCC of the Carrier. */
  public java.lang.String mcc;
  /** MNC of the Carrier. */
  public java.lang.String mnc;
  /**
   * Carrier specific key to be used for encryption. It must be opaque to the framework.
   * This is the byte-stream representation of the key. This is an external encoded form for the
   * key used when a standard representation of the key is needed outside the Java Virtual
   * Machine, as when transmitting the key to some other party. The key is encoded according to a
   * standard format (such as X.509 SubjectPublicKeyInfo or PKCS#8), and is returned using the
   * getEncoded method as defined on the java.security.Key interface.
   */
  public byte[] carrierKey;
  /**
   * This is an opaque value we're given by the carrier and is returned to the carrier.
   * This is used by the server to help it locate the private key to decrypt the
   * permanent identity.
   */
  public java.lang.String keyIdentifier;
  /** Date-time in UTC when the key will expire. */
  public long expirationTime = 0L;
  /**
   * Public key type from carrier certificate.
   * Values are PUBLIC_KEY_TYPE_
   */
  public byte keyType = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<ImsiEncryptionInfo> CREATOR = new android.os.Parcelable.Creator<ImsiEncryptionInfo>() {
    @Override
    public ImsiEncryptionInfo createFromParcel(android.os.Parcel _aidl_source) {
      ImsiEncryptionInfo _aidl_out = new ImsiEncryptionInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public ImsiEncryptionInfo[] newArray(int _aidl_size) {
      return new ImsiEncryptionInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(mcc);
    _aidl_parcel.writeString(mnc);
    _aidl_parcel.writeByteArray(carrierKey);
    _aidl_parcel.writeString(keyIdentifier);
    _aidl_parcel.writeLong(expirationTime);
    _aidl_parcel.writeByte(keyType);
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
      carrierKey = _aidl_parcel.createByteArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      keyIdentifier = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      expirationTime = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      keyType = _aidl_parcel.readByte();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /** Key type to be used for ePDG */
  public static final byte PUBLIC_KEY_TYPE_EPDG = 1;
  /** Key type to be used for WLAN */
  public static final byte PUBLIC_KEY_TYPE_WLAN = 2;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("mcc: " + (java.util.Objects.toString(mcc)));
    _aidl_sj.add("mnc: " + (java.util.Objects.toString(mnc)));
    _aidl_sj.add("carrierKey: " + (java.util.Arrays.toString(carrierKey)));
    _aidl_sj.add("keyIdentifier: " + (java.util.Objects.toString(keyIdentifier)));
    _aidl_sj.add("expirationTime: " + (expirationTime));
    _aidl_sj.add("keyType: " + (keyType));
    return "ImsiEncryptionInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
