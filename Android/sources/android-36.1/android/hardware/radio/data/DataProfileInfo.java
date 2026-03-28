/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.data/4 --previous_hash 70713939dbe39fdbd3a294b3a3e3d2842b3bf4eb --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen/android/hardware/radio/data/DataProfileInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.data-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/data/DataProfileInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.data;
/** @hide */
public class DataProfileInfo implements android.os.Parcelable
{
  /**
   * ID of the data profile.
   * Values are ID_
   */
  public int profileId = 0;
  /** The APN name. */
  public java.lang.String apn;
  /** PDP_type values. */
  public int protocol = android.hardware.radio.data.PdpProtocolType.IP;
  /** PDP_type values used on roaming network. */
  public int roamingProtocol = android.hardware.radio.data.PdpProtocolType.IP;
  /** APN authentication type. */
  public int authType = android.hardware.radio.data.ApnAuthType.NO_PAP_NO_CHAP;
  /** The username for APN, or empty string. */
  public java.lang.String user;
  /** The password for APN, or empty string. */
  public java.lang.String password;
  /**
   * Data profile technology type.
   * Values are TYPE_
   */
  public int type = 0;
  /** The period in seconds to limit the maximum connections. */
  public int maxConnsTime = 0;
  /** The maximum connections during maxConnsTime. */
  public int maxConns = 0;
  /**
   * The required wait time in seconds after a successful UE initiated disconnect of a given PDN
   * connection before the device can send a new PDN connection request for that given PDN.
   */
  public int waitTime = 0;
  /** True to enable the profile, false to disable. */
  public boolean enabled = false;
  /** Supported APN types bitmap. See ApnTypes for the value of each bit. */
  public int supportedApnTypesBitmap = 0;
  /** The bearer bitmap. See RadioAccessFamily for the value of each bit. */
  public int bearerBitmap = 0;
  /** Maximum transmission unit (MTU) size in bytes for IPv4. */
  public int mtuV4 = 0;
  /** Maximum transmission unit (MTU) size in bytes for IPv6. */
  public int mtuV6 = 0;
  /**
   * True if this data profile was used to bring up the last default (i.e internet) data
   * connection successfully.
   */
  public boolean preferred = false;
  /**
   * If true, modem must persist this data profile and profileId must not be set to ID_INVALID.
   * If the same data profile exists, this data profile must overwrite it.
   */
  public boolean persistent = false;
  /**
   * Indicates the PDU session brought up by this data profile should be always-on.
   * An always-on PDU Session is a PDU Session for which User Plane resources have to be
   * activated during every transition from CM-IDLE mode to CM-CONNECTED state.
   * See 3GPP TS 23.501 section 5.6.13 for the details.
   */
  public boolean alwaysOn = false;
  /**
   * TrafficDescriptor for which data connection needs to be established.
   * It is used for URSP traffic matching as described in TS 24.526 Section 4.2.2.
   * It includes an optional DNN which, if present, must be used for traffic matching --
   * it does not specify the end point to be used for the data call. The end point is specified by
   * apn; apn must be used as the end point if one is not specified through URSP rules.
   */
  public android.hardware.radio.data.TrafficDescriptor trafficDescriptor;
  /**
   * The infrastructure bitmap which the APN can be used on. For example, some APNs can only
   * be used when the device is using cellular network, using satellite network, or can be used
   * in either cases.
   */
  public int infrastructureBitmap = 0;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<DataProfileInfo> CREATOR = new android.os.Parcelable.Creator<DataProfileInfo>() {
    @Override
    public DataProfileInfo createFromParcel(android.os.Parcel _aidl_source) {
      DataProfileInfo _aidl_out = new DataProfileInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public DataProfileInfo[] newArray(int _aidl_size) {
      return new DataProfileInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(profileId);
    _aidl_parcel.writeString(apn);
    _aidl_parcel.writeInt(protocol);
    _aidl_parcel.writeInt(roamingProtocol);
    _aidl_parcel.writeInt(authType);
    _aidl_parcel.writeString(user);
    _aidl_parcel.writeString(password);
    _aidl_parcel.writeInt(type);
    _aidl_parcel.writeInt(maxConnsTime);
    _aidl_parcel.writeInt(maxConns);
    _aidl_parcel.writeInt(waitTime);
    _aidl_parcel.writeBoolean(enabled);
    _aidl_parcel.writeInt(supportedApnTypesBitmap);
    _aidl_parcel.writeInt(bearerBitmap);
    _aidl_parcel.writeInt(mtuV4);
    _aidl_parcel.writeInt(mtuV6);
    _aidl_parcel.writeBoolean(preferred);
    _aidl_parcel.writeBoolean(persistent);
    _aidl_parcel.writeBoolean(alwaysOn);
    _aidl_parcel.writeTypedObject(trafficDescriptor, _aidl_flag);
    _aidl_parcel.writeInt(infrastructureBitmap);
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
      profileId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      apn = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      protocol = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      roamingProtocol = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      authType = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      user = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      password = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      type = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxConnsTime = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      maxConns = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      waitTime = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      enabled = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      supportedApnTypesBitmap = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      bearerBitmap = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mtuV4 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      mtuV6 = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      preferred = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      persistent = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      alwaysOn = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      trafficDescriptor = _aidl_parcel.readTypedObject(android.hardware.radio.data.TrafficDescriptor.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      infrastructureBitmap = _aidl_parcel.readInt();
    } finally {
      if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
        throw new android.os.BadParcelableException("Overflow in the size of parcelable");
      }
      _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
    }
  }
  public static final int ID_DEFAULT = 0;
  public static final int ID_TETHERED = 1;
  public static final int ID_IMS = 2;
  public static final int ID_FOTA = 3;
  public static final int ID_CBS = 4;
  /** Start of OEM-specific profiles */
  public static final int ID_OEM_BASE = 1000;
  public static final int ID_INVALID = -1;
  public static final int TYPE_COMMON = 0;
  public static final int TYPE_3GPP = 1;
  public static final int TYPE_3GPP2 = 2;
  /** Infrastructure type unknown. This is only for initializing. */
  public static final int INFRASTRUCTURE_UNKNOWN = 0;
  /** Indicating this APN can be used when the device is using terrestrial cellular networks. */
  public static final int INFRASTRUCTURE_CELLULAR = 1;
  /** Indicating this APN can be used when the device is attached to satellite. */
  public static final int INFRASTRUCTURE_SATELLITE = 2;
  @Override
  public String toString() {
    java.util.StringJoiner _aidl_sj = new java.util.StringJoiner(", ", "{", "}");
    _aidl_sj.add("profileId: " + (profileId));
    _aidl_sj.add("apn: " + (java.util.Objects.toString(apn)));
    _aidl_sj.add("protocol: " + (android.hardware.radio.data.PdpProtocolType.$.toString(protocol)));
    _aidl_sj.add("roamingProtocol: " + (android.hardware.radio.data.PdpProtocolType.$.toString(roamingProtocol)));
    _aidl_sj.add("authType: " + (android.hardware.radio.data.ApnAuthType.$.toString(authType)));
    _aidl_sj.add("user: " + (java.util.Objects.toString(user)));
    _aidl_sj.add("password: " + (java.util.Objects.toString(password)));
    _aidl_sj.add("type: " + (type));
    _aidl_sj.add("maxConnsTime: " + (maxConnsTime));
    _aidl_sj.add("maxConns: " + (maxConns));
    _aidl_sj.add("waitTime: " + (waitTime));
    _aidl_sj.add("enabled: " + (enabled));
    _aidl_sj.add("supportedApnTypesBitmap: " + (supportedApnTypesBitmap));
    _aidl_sj.add("bearerBitmap: " + (bearerBitmap));
    _aidl_sj.add("mtuV4: " + (mtuV4));
    _aidl_sj.add("mtuV6: " + (mtuV6));
    _aidl_sj.add("preferred: " + (preferred));
    _aidl_sj.add("persistent: " + (persistent));
    _aidl_sj.add("alwaysOn: " + (alwaysOn));
    _aidl_sj.add("trafficDescriptor: " + (java.util.Objects.toString(trafficDescriptor)));
    _aidl_sj.add("infrastructureBitmap: " + (infrastructureBitmap));
    return "DataProfileInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(trafficDescriptor);
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
