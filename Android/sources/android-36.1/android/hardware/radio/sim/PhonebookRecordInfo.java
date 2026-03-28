/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation -Werror --structured --version 5 --hash notfrozen --stability vintf --min_sdk_version current -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio_interface/5/preprocessed.aidl -pout/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.config_interface/5/preprocessed.aidl --previous_api_dir=hardware/interfaces/radio/aidl/aidl_api/android.hardware.radio.sim/4 --previous_hash fc1a19a4f86a58981158cc8d956763c9d8ace630 --ninja -d out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen/android/hardware/radio/sim/PhonebookRecordInfo.java.d -o out/soong/.intermediates/hardware/interfaces/radio/aidl/android.hardware.radio.sim-V5-java-source/gen -Nhardware/interfaces/radio/aidl hardware/interfaces/radio/aidl/android/hardware/radio/sim/PhonebookRecordInfo.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.hardware.radio.sim;
/**
 * Phonebook-record-information specified by EF_ADN (Abbreviated dialing numbers) record of SIM
 * as per 3GPP spec 31.102 v15 Section-4.4.2.3.
 * @hide
 */
public class PhonebookRecordInfo implements android.os.Parcelable
{
  /** Record index. 0 is used to insert a record */
  public int recordId = 0;
  /** Alpha identifier, empty string if no value */
  public java.lang.String name;
  /** Dialling number, empty string if no value */
  public java.lang.String number;
  /** Email addresses */
  public java.lang.String[] emails;
  /** Additional numbers */
  public java.lang.String[] additionalNumbers;
  @Override
   public final int getStability() { return android.os.Parcelable.PARCELABLE_STABILITY_VINTF; }
  public static final android.os.Parcelable.Creator<PhonebookRecordInfo> CREATOR = new android.os.Parcelable.Creator<PhonebookRecordInfo>() {
    @Override
    public PhonebookRecordInfo createFromParcel(android.os.Parcel _aidl_source) {
      PhonebookRecordInfo _aidl_out = new PhonebookRecordInfo();
      _aidl_out.readFromParcel(_aidl_source);
      return _aidl_out;
    }
    @Override
    public PhonebookRecordInfo[] newArray(int _aidl_size) {
      return new PhonebookRecordInfo[_aidl_size];
    }
  };
  @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
  {
    int _aidl_start_pos = _aidl_parcel.dataPosition();
    _aidl_parcel.writeInt(0);
    _aidl_parcel.writeInt(recordId);
    _aidl_parcel.writeString(name);
    _aidl_parcel.writeString(number);
    _aidl_parcel.writeStringArray(emails);
    _aidl_parcel.writeStringArray(additionalNumbers);
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
      recordId = _aidl_parcel.readInt();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      name = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      number = _aidl_parcel.readString();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      emails = _aidl_parcel.createStringArray();
      if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
      additionalNumbers = _aidl_parcel.createStringArray();
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
    _aidl_sj.add("recordId: " + (recordId));
    _aidl_sj.add("name: " + (java.util.Objects.toString(name)));
    _aidl_sj.add("number: " + (java.util.Objects.toString(number)));
    _aidl_sj.add("emails: " + (java.util.Arrays.toString(emails)));
    _aidl_sj.add("additionalNumbers: " + (java.util.Arrays.toString(additionalNumbers)));
    return "PhonebookRecordInfo" + _aidl_sj.toString()  ;
  }
  @Override
  public int describeContents() {
    int _mask = 0;
    return _mask;
  }
}
