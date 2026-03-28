/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/LinkAddress.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/LinkAddress.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/**
 * Describes a data link address for mobile data connection.
 * @hide
 */
public class LinkAddress implements android.os.Parcelable
{
  /**
   * The format is IP address with optional "/" prefix length (The format is defined in RFC-4291
   * section 2.3). For example, "192.0.1.3", "192.0.1.11/16", or "2001:db8::1/64". Typically one
   * IPv4 or one IPv6 or one of each. If the prefix length is absent, then the addresses are
   * assumed to be point to point with IPv4 with prefix length 32 or IPv6 with prefix length 128.
   */
  public java.lang.String address;
  /**
   * The properties of the link address, as defined in if_addr.h in the Linux kernel.
   * Values are ADDRESS_PROPERTY_
   */
  public int addressProperties = 0;
  /**
   * The time, as reported by SystemClock.elapsedRealtime(), when this link address will be or
   * was deprecated. -1 indicates this information is not available. At the time existing
   * connections can still use this address until it expires, but new connections should use the
   * new address. RadioConst:VALUE_UNAVAILABLE_LONG indicates this link address will never be
   * deprecated.
   */
  public long deprecationTime = 0L;
  /**
   * The time, as reported by SystemClock.elapsedRealtime(), when this link address will expire
   * and be removed from the interface. -1 indicates this information is not available.
   * RadioConst:VALUE_UNAVAILABLE_LONG indicates this link address will never expire.
   */
  public long expirationTime = 0L;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<LinkAddress> CREATOR = new android.os.Parcelable.Creator<LinkAddress>() {
    @Override
    public LinkAddress createFromParcel(android.os.Parcel _aidl_source) {
      LinkAddress _aidl_out = new LinkAddress();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public LinkAddress[] newArray(int _aidl_size) {
      return new LinkAddress[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeString(address);
    _aidl_parcel.writeInt(addressProperties);
    _aidl_parcel.writeLong(deprecationTime);
    _aidl_parcel.writeLong(expirationTime);
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
      address = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      addressProperties = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      deprecationTime = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      expirationTime = _aidl_parcel.readLong();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final int ADDRESS_PROPERTY_NONE = 0;
  /** Indicates this address is deprecated */
  public static final int ADDRESS_PROPERTY_DEPRECATED = 32;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("address: " + (java.util.Objects.toString(address)));
    _aidl_sj.add("addressProperties: " + (addressProperties));
    _aidl_sj.add("deprecationTime: " + (deprecationTime));
    _aidl_sj.add("expirationTime: " + (expirationTime));
    return "LinkAddress" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
