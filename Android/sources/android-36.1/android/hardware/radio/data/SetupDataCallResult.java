/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/SetupDataCallResult.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/SetupDataCallResult.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/** @hide */
public class SetupDataCallResult implements android.os.Parcelable
{
  /** Data call fail cause. DataCallFailCause.NONE if no error. */
  public int cause = android.hardware.radio.data.DataCallFailCause.NONE;
  /**
   * If cause is not DataCallFailCause.NONE, this field indicates the network suggested data
   * retry back-off time in milliseconds. Negative value indicates network does not give any
   * suggestion. 0 indicates retry should be performed immediately.
   * RadioConst:VALUE_UNAVAILABLE_LONG indicates the device should not retry data setup anymore.
   * During this time, no calls to IRadioData.setupDataCall for this APN will be made unless
   * IRadioDataIndication.unthrottleApn is sent with the same APN.
   */
  public long suggestedRetryTime = 0L;
  /** Context ID, uniquely identifies this data connection. */
  public int cid = 0;
  /**
   * Data connection active status.
   * Values are DATA_CONNECTION_STATUS_
   */
  public int active = 0;
  /**
   * PDP protocol type. If cause is DataCallFailCause.ONLY_SINGLE_BEARER_ALLOWED, this is the
   * protocol type supported, such as "IP" or "IPV6".
   */
  public int type = android.hardware.radio.data.PdpProtocolType.IP;
  /** The network interface name. */
  public java.lang.String ifname;
  /** List of link address. */
  public android.hardware.radio.data.LinkAddress[] addresses;
  /**
   * List of DNS server addresses, e.g., "192.0.1.3" or "192.0.1.11 2001:db8::1". Empty if no dns
   * server addresses returned.
   */
  public java.lang.String[] dnses;
  /**
   * List of default gateway addresses, e.g., "192.0.1.3" or "192.0.1.11 2001:db8::1".
   * When empty, the addresses represent point to point connections.
   */
  public java.lang.String[] gateways;
  /**
   * List of P-CSCF (Proxy Call State Control Function) addresses via PCO (Protocol Configuration
   * Option), e.g., "2001:db8::1 2001:db8::2 2001:db8::3". Empty if not IMS client.
   */
  public java.lang.String[] pcscf;
  /**
   * MTU received from network for IPv4.
   * It is an unsigned 16-bit integer, meaning its valid range is from 0 to 65535.
   * Additionally, the MTU must be an even number. If an odd value is received,
   * it will be rounded down.
   * Value <= 0 means network has either not sent a value or sent an invalid value.
   */
  public int mtuV4 = 0;
  /**
   * MTU received from network for IPv6.
   * It is an unsigned 16-bit integer, meaning its valid range is from 0 to 65535.
   * Additionally, the MTU must be an even number. If an odd value is received,
   * it will be rounded down.
   * Value <= 0 means network has either not sent a value or sent an invalid value.
   */
  public int mtuV6 = 0;
  /** Default bearer QoS. Applicable to LTE and NR */
  public android.hardware.radio.data.Qos defaultQos;
  /**
   * Active QOS sessions of the dedicated bearers. Applicable to PDNs that support dedicated
   * bearers.
   */
  public android.hardware.radio.data.QosSession[] qosSessions;
  /**
   * Specifies the fallback mode on an IWLAN handover failure.
   * Values are HANDOVER_FAILURE_MODE_
   */
  public byte handoverFailureMode = 0;
  /**
   * The allocated pdu session id for this data call. A value of 0 means no pdu session id was
   * attached to this call. Reference: 3GPP TS 24.007 section 11.2.3.1b.
   */
  public int pduSessionId = 0;
  /** Slice used for this data call. It is valid only when this data call is on AccessNetwork:NGRAN */
  public android.hardware.radio.data.SliceInfo sliceInfo;
  /**
   * TrafficDescriptors for which this data call must be used. It only includes the TDs for which
   * a data call has been requested so far; it is not an exhaustive list.
   */
  public android.hardware.radio.data.TrafficDescriptor[] trafficDescriptors;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<SetupDataCallResult> CREATOR = new android.os.Parcelable.Creator<SetupDataCallResult>() {
    @Override
    public SetupDataCallResult createFromParcel(android.os.Parcel _aidl_source) {
      SetupDataCallResult _aidl_out = new SetupDataCallResult();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public SetupDataCallResult[] newArray(int _aidl_size) {
      return new SetupDataCallResult[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(cause);
    _aidl_parcel.writeLong(suggestedRetryTime);
    _aidl_parcel.writeInt(cid);
    _aidl_parcel.writeInt(active);
    _aidl_parcel.writeInt(type);
    _aidl_parcel.writeString(ifname);
    _aidl_parcel.writeTypedArray(addresses, _aidl_flag);
    _aidl_parcel.writeStringArray(dnses);
    _aidl_parcel.writeStringArray(gateways);
    _aidl_parcel.writeStringArray(pcscf);
    _aidl_parcel.writeInt(mtuV4);
    _aidl_parcel.writeInt(mtuV6);
    _aidl_parcel.writeTypedObject(defaultQos, _aidl_flag);
    _aidl_parcel.writeTypedArray(qosSessions, _aidl_flag);
    _aidl_parcel.writeByte(handoverFailureMode);
    _aidl_parcel.writeInt(pduSessionId);
    _aidl_parcel.writeTypedObject(sliceInfo, _aidl_flag);
    _aidl_parcel.writeTypedArray(trafficDescriptors, _aidl_flag);
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
      cause = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      suggestedRetryTime = _aidl_parcel.readLong();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      cid = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      active = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      type = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      ifname = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      addresses = _aidl_parcel.createTypedArray(android.hardware.radio.data.LinkAddress.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      dnses = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      gateways = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      pcscf = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mtuV4 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mtuV6 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      defaultQos = _aidl_parcel.readTypedObject(android.hardware.radio.data.Qos.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      qosSessions = _aidl_parcel.createTypedArray(android.hardware.radio.data.QosSession.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      handoverFailureMode = _aidl_parcel.readByte();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      pduSessionId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      sliceInfo = _aidl_parcel.readTypedObject(android.hardware.radio.data.SliceInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      trafficDescriptors = _aidl_parcel.createTypedArray(android.hardware.radio.data.TrafficDescriptor.CREATOR);
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  /** Indicates the data connection is inactive. */
  public static final int DATA_CONNECTION_STATUS_INACTIVE = 0;
  /** Indicates the data connection is active with physical link dormant. */
  public static final int DATA_CONNECTION_STATUS_DORMANT = 1;
  /** Indicates the data connection is active with physical link up. */
  public static final int DATA_CONNECTION_STATUS_ACTIVE = 2;
  /**
   * On data handover failure, fallback to the source data transport when the fail cause is due
   * to a hand off preference change.
   */
  public static final byte HANDOVER_FAILURE_MODE_LEGACY = 0;
  /** On data handover failure, fallback to the source data transport. */
  public static final byte HANDOVER_FAILURE_MODE_DO_FALLBACK = 1;
  /**
   * On data handover failure, retry the handover instead of falling back to the source data
   * transport.
   */
  public static final byte HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_HANDOVER = 2;
  /**
   * On data handover failure, setup a new data connection by sending a normal request to the
   * underlying data service.
   */
  public static final byte HANDOVER_FAILURE_MODE_NO_FALLBACK_RETRY_SETUP_NORMAL = 3;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("cause: " + (android.hardware.radio.data.DataCallFailCause.$.toString(cause)));
    _aidl_sj.add("suggestedRetryTime: " + (suggestedRetryTime));
    _aidl_sj.add("cid: " + (cid));
    _aidl_sj.add("active: " + (active));
    _aidl_sj.add("type: " + (android.hardware.radio.data.PdpProtocolType.$.toString(type)));
    _aidl_sj.add("ifname: " + (java.util.Objects.toString(ifname)));
    _aidl_sj.add("addresses: " + (java.util.Arrays.toString(addresses)));
    _aidl_sj.add("dnses: " + (java.util.Arrays.toString(dnses)));
    _aidl_sj.add("gateways: " + (java.util.Arrays.toString(gateways)));
    _aidl_sj.add("pcscf: " + (java.util.Arrays.toString(pcscf)));
    _aidl_sj.add("mtuV4: " + (mtuV4));
    _aidl_sj.add("mtuV6: " + (mtuV6));
    _aidl_sj.add("defaultQos: " + (java.util.Objects.toString(defaultQos)));
    _aidl_sj.add("qosSessions: " + (java.util.Arrays.toString(qosSessions)));
    _aidl_sj.add("handoverFailureMode: " + (handoverFailureMode));
    _aidl_sj.add("pduSessionId: " + (pduSessionId));
    _aidl_sj.add("sliceInfo: " + (java.util.Objects.toString(sliceInfo)));
    _aidl_sj.add("trafficDescriptors: " + (java.util.Arrays.toString(trafficDescriptors)));
    return "SetupDataCallResult" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(addresses);
    _mask |= describeContents(defaultQos);
    _mask |= describeContents(qosSessions);
    _mask |= describeContents(sliceInfo);
    _mask |= describeContents(trafficDescriptors);
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof Object[]) {
      int _mask = 0;
      for (Object o : (Object[]) _v) {
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
