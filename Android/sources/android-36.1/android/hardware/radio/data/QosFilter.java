/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/QosFilter.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/QosFilter.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/**
 * See 3gpp 24.008 10.5.6.12 and 3gpp 24.501 9.11.4.13
 * @hide
 */
public class QosFilter implements android.os.Parcelable
{
  /**
   * Local and remote IP addresses, typically one IPv4 or one IPv6 or one of each. Addresses could
   * be with optional "/" prefix length, e.g.,"192.0.1.3" or "192.0.1.11/16 2001:db8::1/64".
   * If the prefix length is absent the addresses are assumed to be point to point with IPv4
   * having a prefix length of 32 and IPv6 128.
   */
  public java.lang.String[] localAddresses;
  public java.lang.String[] remoteAddresses;
  /** Local port/range */
  public android.hardware.radio.data.PortRange localPort;
  /** Remote port/range */
  public android.hardware.radio.data.PortRange remotePort;
  /**
   * Next header QoS protocol numbers defined by IANA, RFC 5237
   * Values are PROTOCOL_
   */
  public byte protocol = 0;
  /** Type of service value or mask as defined in RFC 1349 */
  public android.hardware.radio.data.QosFilterTypeOfService tos;
  /** IPv6 flow label as defined in RFC 6437 */
  public android.hardware.radio.data.QosFilterIpv6FlowLabel flowLabel;
  /** IPSec security parameter index */
  public android.hardware.radio.data.QosFilterIpsecSpi spi;
  /**
   * Filter direction
   * Values are DIRECTION_
   */
  public byte direction = 0;
  /**
   * Specifies the order in which the filter needs to be matched. A lower numerical (positive)
   * value has a higher precedence. Set -1 when unspecified.
   */
  public int precedence = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<QosFilter> CREATOR = new android.os.Parcelable.Creator<QosFilter>() {
    @Override
    public QosFilter createFromParcel(android.os.Parcel _aidl_source) {
      QosFilter _aidl_out = new QosFilter();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public QosFilter[] newArray(int _aidl_size) {
      return new QosFilter[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeStringArray(localAddresses);
    _aidl_parcel.writeStringArray(remoteAddresses);
    _aidl_parcel.writeTypedObject(localPort, _aidl_flag);
    _aidl_parcel.writeTypedObject(remotePort, _aidl_flag);
    _aidl_parcel.writeByte(protocol);
    _aidl_parcel.writeTypedObject(tos, _aidl_flag);
    _aidl_parcel.writeTypedObject(flowLabel, _aidl_flag);
    _aidl_parcel.writeTypedObject(spi, _aidl_flag);
    _aidl_parcel.writeByte(direction);
    _aidl_parcel.writeInt(precedence);
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
      localAddresses = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      remoteAddresses = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      localPort = _aidl_parcel.readTypedObject(android.hardware.radio.data.PortRange.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      remotePort = _aidl_parcel.readTypedObject(android.hardware.radio.data.PortRange.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      protocol = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      tos = _aidl_parcel.readTypedObject(android.hardware.radio.data.QosFilterTypeOfService.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      flowLabel = _aidl_parcel.readTypedObject(android.hardware.radio.data.QosFilterIpv6FlowLabel.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      spi = _aidl_parcel.readTypedObject(android.hardware.radio.data.QosFilterIpsecSpi.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      direction = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      precedence = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final byte DIRECTION_DOWNLINK = 0;
  public static final byte DIRECTION_UPLINK = 1;
  public static final byte DIRECTION_BIDIRECTIONAL = 2;
  /** No protocol specified */
  public static final byte PROTOCOL_UNSPECIFIED = -1;
  /** Transmission Control Protocol */
  public static final byte PROTOCOL_TCP = 6;
  /** User Datagram Protocol */
  public static final byte PROTOCOL_UDP = 17;
  /** Encapsulating Security Payload Protocol */
  public static final byte PROTOCOL_ESP = 50;
  /** Authentication Header */
  public static final byte PROTOCOL_AH = 51;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("localAddresses: " + (java.util.Arrays.toString(localAddresses)));
    _aidl_sj.add("remoteAddresses: " + (java.util.Arrays.toString(remoteAddresses)));
    _aidl_sj.add("localPort: " + (java.util.Objects.toString(localPort)));
    _aidl_sj.add("remotePort: " + (java.util.Objects.toString(remotePort)));
    _aidl_sj.add("protocol: " + (protocol));
    _aidl_sj.add("tos: " + (java.util.Objects.toString(tos)));
    _aidl_sj.add("flowLabel: " + (java.util.Objects.toString(flowLabel)));
    _aidl_sj.add("spi: " + (java.util.Objects.toString(spi)));
    _aidl_sj.add("direction: " + (direction));
    _aidl_sj.add("precedence: " + (precedence));
    return "QosFilter" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(localPort);
    _mask |= describeContents(remotePort);
    _mask |= describeContents(tos);
    _mask |= describeContents(flowLabel);
    _mask |= describeContents(spi);
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
