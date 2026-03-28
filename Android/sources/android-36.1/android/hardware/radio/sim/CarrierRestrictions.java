/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/CarrierRestrictions.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/CarrierRestrictions.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/** @hide */
public class CarrierRestrictions implements android.os.Parcelable
{
  /**
   * Allowed carriers
   * @deprecated use @List<CarrierInfo> allowedCarrierInfoList
   */
  @Deprecated
  public android.hardware.radio.sim.Carrier[] allowedCarriers;
  /**
   * Explicitly excluded carriers which match allowed_carriers. Eg. allowedCarriers match mcc/mnc,
   * excludedCarriers has same mcc/mnc and gid1 is ABCD. It means except the carrier whose gid1
   * is ABCD, all carriers with the same mcc/mnc are allowed.
   * @deprecated use @List<CarrierInfo> excludedCarrierInfoList
   */
  @Deprecated
  public android.hardware.radio.sim.Carrier[] excludedCarriers;
  /**
   * True means that only carriers included in the allowed list and not in the excluded list
   * are permitted. Eg. allowedCarriers match mcc/mnc, excludedCarriers has same mcc/mnc and
   * gid1 is ABCD. It means except the carrier whose gid1 is ABCD, all carriers with the
   * same mcc/mnc are allowed.
   * False means that all carriers are allowed except those included in the excluded list
   * and not in the allowed list.
   */
  public boolean allowedCarriersPrioritized = false;
  /** Current restriction status as defined in CarrierRestrictionStatus enum */
  public int status = android.hardware.radio.sim.CarrierRestrictions.CarrierRestrictionStatus.UNKNOWN;
  /**  Allowed carriers. */
  public android.hardware.radio.sim.CarrierInfo[] allowedCarrierInfoList = {};
  /**
   * Explicitly excluded carriers which match allowed_carriers. Eg. allowedCarriers match mcc/mnc,
   * excludedCarriers has same mcc/mnc and gid1 is ABCD. It means except the carrier whose gid1
   * is ABCD, all carriers with the same mcc/mnc are allowed.
   */
  public android.hardware.radio.sim.CarrierInfo[] excludedCarrierInfoList = {};
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<CarrierRestrictions> CREATOR = new android.os.Parcelable.Creator<CarrierRestrictions>() {
    @Override
    public CarrierRestrictions createFromParcel(android.os.Parcel _aidl_source) {
      CarrierRestrictions _aidl_out = new CarrierRestrictions();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public CarrierRestrictions[] newArray(int _aidl_size) {
      return new CarrierRestrictions[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeTypedArray(allowedCarriers, _aidl_flag);
    _aidl_parcel.writeTypedArray(excludedCarriers, _aidl_flag);
    _aidl_parcel.writeBoolean(allowedCarriersPrioritized);
    _aidl_parcel.writeInt(status);
    _aidl_parcel.writeTypedArray(allowedCarrierInfoList, _aidl_flag);
    _aidl_parcel.writeTypedArray(excludedCarrierInfoList, _aidl_flag);
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
      allowedCarriers = _aidl_parcel.createTypedArray(android.hardware.radio.sim.Carrier.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      excludedCarriers = _aidl_parcel.createTypedArray(android.hardware.radio.sim.Carrier.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      allowedCarriersPrioritized = _aidl_parcel.readBoolean();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      status = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      allowedCarrierInfoList = _aidl_parcel.createTypedArray(android.hardware.radio.sim.CarrierInfo.CREATOR);
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      excludedCarrierInfoList = _aidl_parcel.createTypedArray(android.hardware.radio.sim.CarrierInfo.CREATOR);
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
    _aidl_sj.add("allowedCarriers: " + (java.util.Arrays.toString(allowedCarriers)));
    _aidl_sj.add("excludedCarriers: " + (java.util.Arrays.toString(excludedCarriers)));
    _aidl_sj.add("allowedCarriersPrioritized: " + (allowedCarriersPrioritized));
    _aidl_sj.add("status: " + (status));
    _aidl_sj.add("allowedCarrierInfoList: " + (java.util.Arrays.toString(allowedCarrierInfoList)));
    _aidl_sj.add("excludedCarrierInfoList: " + (java.util.Arrays.toString(excludedCarrierInfoList)));
    return "CarrierRestrictions" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    _mask |= describeContents(allowedCarriers);
    _mask |= describeContents(excludedCarriers);
    _mask |= describeContents(allowedCarrierInfoList);
    _mask |= describeContents(excludedCarrierInfoList);
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
  /** This enum defines the carrier restriction status values */
  public static @interface CarrierRestrictionStatus {
    /**
     * Carrier restriction status value is unknown, used in cases where modem is dependent on
     * external module to know about the lock status and the module hasn’t yet provided the lock
     * status. For example, when the lock status is maintained on a cloud server and device has
     * just booted after out of box and not yet connected to the internet.
     */
    public static final int UNKNOWN = 0;
    /** There is no carrier restriction on the device */
    public static final int NOT_RESTRICTED = 1;
    /** The device is restricted to a carrier */
    public static final int RESTRICTED = 2;
  }
}
