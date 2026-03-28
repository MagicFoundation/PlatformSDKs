/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Using: out/host/linux-x86/bin/aidl --lang=java -Weverything -Wno-missing-permission-annotation --min_sdk_version current --ninja -d out/soong/.intermediates/packages/modules/Virtualization/android/virtualizationservice/aidl/android.system.virtualizationcommon-java-source/gen/android/system/virtualizationcommon/Atom.java.d -o out/soong/.intermediates/packages/modules/Virtualization/android/virtualizationservice/aidl/android.system.virtualizationcommon-java-source/gen -Npackages/modules/Virtualization/android/virtualizationservice/aidl packages/modules/Virtualization/android/virtualizationservice/aidl/android/system/virtualizationcommon/Atom.aidl
 *
 * DO NOT CHECK THIS FILE INTO A CODE TREE (e.g. git, etc..).
 * ALWAYS GENERATE THIS FILE FROM UPDATED AIDL COMPILER
 * AS A BUILD INTERMEDIATE ONLY. THIS IS NOT SOURCE CODE.
 */
package android.system.virtualizationcommon;
/** {@hide} */
public final class Atom implements android.os.Parcelable {
  // tags for union fields
  public final static int cgroupMemoryBreachReported = 0;  // android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported cgroupMemoryBreachReported;
  public final static int fsckFailedReported = 1;  // android.system.virtualizationcommon.Atom.FsckFailedReported fsckFailedReported;
  public final static int getOrCreateSkSecretFailedReported = 2;  // android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported getOrCreateSkSecretFailedReported;
  public final static int psiMonitorFailedReported = 3;  // android.system.virtualizationcommon.Atom.PsiMonitorFailedReported psiMonitorFailedReported;

  private int _tag;
  private Object _value;

  public Atom() {
    android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported _value = null;
    this._tag = cgroupMemoryBreachReported;
    this._value = _value;
  }

  private Atom(android.os.Parcel _aidl_parcel) {
    readFromParcel(_aidl_parcel);
  }

  private Atom(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }

  public int getTag() {
    return _tag;
  }

  // android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported cgroupMemoryBreachReported;

  public static Atom cgroupMemoryBreachReported(android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported _value) {
    return new Atom(cgroupMemoryBreachReported, _value);
  }

  public android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported getCgroupMemoryBreachReported() {
    _assertTag(cgroupMemoryBreachReported);
    return (android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported) _value;
  }

  public void setCgroupMemoryBreachReported(android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported _value) {
    _set(cgroupMemoryBreachReported, _value);
  }

  // android.system.virtualizationcommon.Atom.FsckFailedReported fsckFailedReported;

  public static Atom fsckFailedReported(android.system.virtualizationcommon.Atom.FsckFailedReported _value) {
    return new Atom(fsckFailedReported, _value);
  }

  public android.system.virtualizationcommon.Atom.FsckFailedReported getFsckFailedReported() {
    _assertTag(fsckFailedReported);
    return (android.system.virtualizationcommon.Atom.FsckFailedReported) _value;
  }

  public void setFsckFailedReported(android.system.virtualizationcommon.Atom.FsckFailedReported _value) {
    _set(fsckFailedReported, _value);
  }

  // android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported getOrCreateSkSecretFailedReported;

  public static Atom getOrCreateSkSecretFailedReported(android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported _value) {
    return new Atom(getOrCreateSkSecretFailedReported, _value);
  }

  public android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported getGetOrCreateSkSecretFailedReported() {
    _assertTag(getOrCreateSkSecretFailedReported);
    return (android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported) _value;
  }

  public void setGetOrCreateSkSecretFailedReported(android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported _value) {
    _set(getOrCreateSkSecretFailedReported, _value);
  }

  // android.system.virtualizationcommon.Atom.PsiMonitorFailedReported psiMonitorFailedReported;

  public static Atom psiMonitorFailedReported(android.system.virtualizationcommon.Atom.PsiMonitorFailedReported _value) {
    return new Atom(psiMonitorFailedReported, _value);
  }

  public android.system.virtualizationcommon.Atom.PsiMonitorFailedReported getPsiMonitorFailedReported() {
    _assertTag(psiMonitorFailedReported);
    return (android.system.virtualizationcommon.Atom.PsiMonitorFailedReported) _value;
  }

  public void setPsiMonitorFailedReported(android.system.virtualizationcommon.Atom.PsiMonitorFailedReported _value) {
    _set(psiMonitorFailedReported, _value);
  }

  public static final android.os.Parcelable.Creator<Atom> CREATOR = new android.os.Parcelable.Creator<Atom>() {
    @Override
    public Atom createFromParcel(android.os.Parcel _aidl_source) {
      return new Atom(_aidl_source);
    }
    @Override
    public Atom[] newArray(int _aidl_size) {
      return new Atom[_aidl_size];
    }
  };

  @Override
  public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag) {
    _aidl_parcel.writeInt(_tag);
    switch (_tag) {
    case cgroupMemoryBreachReported:
      _aidl_parcel.writeTypedObject(getCgroupMemoryBreachReported(), _aidl_flag);
      break;
    case fsckFailedReported:
      _aidl_parcel.writeTypedObject(getFsckFailedReported(), _aidl_flag);
      break;
    case getOrCreateSkSecretFailedReported:
      _aidl_parcel.writeTypedObject(getGetOrCreateSkSecretFailedReported(), _aidl_flag);
      break;
    case psiMonitorFailedReported:
      _aidl_parcel.writeTypedObject(getPsiMonitorFailedReported(), _aidl_flag);
      break;
    }
  }

  public void readFromParcel(android.os.Parcel _aidl_parcel) {
    int _aidl_tag;
    _aidl_tag = _aidl_parcel.readInt();
    switch (_aidl_tag) {
    case cgroupMemoryBreachReported: {
      android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported _aidl_value;
      _aidl_value = _aidl_parcel.readTypedObject(android.system.virtualizationcommon.Atom.CgroupMemoryBreachReported.CREATOR);
      _set(_aidl_tag, _aidl_value);
      return; }
    case fsckFailedReported: {
      android.system.virtualizationcommon.Atom.FsckFailedReported _aidl_value;
      _aidl_value = _aidl_parcel.readTypedObject(android.system.virtualizationcommon.Atom.FsckFailedReported.CREATOR);
      _set(_aidl_tag, _aidl_value);
      return; }
    case getOrCreateSkSecretFailedReported: {
      android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported _aidl_value;
      _aidl_value = _aidl_parcel.readTypedObject(android.system.virtualizationcommon.Atom.GetOrCreateSkSecretFailedReported.CREATOR);
      _set(_aidl_tag, _aidl_value);
      return; }
    case psiMonitorFailedReported: {
      android.system.virtualizationcommon.Atom.PsiMonitorFailedReported _aidl_value;
      _aidl_value = _aidl_parcel.readTypedObject(android.system.virtualizationcommon.Atom.PsiMonitorFailedReported.CREATOR);
      _set(_aidl_tag, _aidl_value);
      return; }
    }
    throw new IllegalArgumentException("union: unknown tag: " + _aidl_tag);
  }

  @Override
  public int describeContents() {
    int _mask = 0;
    switch (getTag()) {
    case cgroupMemoryBreachReported:
      _mask |= describeContents(getCgroupMemoryBreachReported());
      break;
    case fsckFailedReported:
      _mask |= describeContents(getFsckFailedReported());
      break;
    case getOrCreateSkSecretFailedReported:
      _mask |= describeContents(getGetOrCreateSkSecretFailedReported());
      break;
    case psiMonitorFailedReported:
      _mask |= describeContents(getPsiMonitorFailedReported());
      break;
    }
    return _mask;
  }
  private int describeContents(Object _v) {
    if (_v == null) return 0;
    if (_v instanceof android.os.Parcelable) {
      return ((android.os.Parcelable) _v).describeContents();
    }
    return 0;
  }

  private void _assertTag(int tag) {
    if (getTag() != tag) {
      throw new IllegalStateException("bad access: " + _tagString(tag) + ", " + _tagString(getTag()) + " is available.");
    }
  }

  private String _tagString(int _tag) {
    switch (_tag) {
    case cgroupMemoryBreachReported: return "cgroupMemoryBreachReported";
    case fsckFailedReported: return "fsckFailedReported";
    case getOrCreateSkSecretFailedReported: return "getOrCreateSkSecretFailedReported";
    case psiMonitorFailedReported: return "psiMonitorFailedReported";
    }
    throw new IllegalStateException("unknown field: " + _tag);
  }

  private void _set(int _tag, Object _value) {
    this._tag = _tag;
    this._value = _value;
  }
  public static class CgroupMemoryBreachReported implements android.os.Parcelable
  {
    public long highBreachCount = 0L;
    public long highMemoryPeakMb = 0L;
    public static final android.os.Parcelable.Creator<CgroupMemoryBreachReported> CREATOR = new android.os.Parcelable.Creator<CgroupMemoryBreachReported>() {
      @Override
      public CgroupMemoryBreachReported createFromParcel(android.os.Parcel _aidl_source) {
        CgroupMemoryBreachReported _aidl_out = new CgroupMemoryBreachReported();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public CgroupMemoryBreachReported[] newArray(int _aidl_size) {
        return new CgroupMemoryBreachReported[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeLong(highBreachCount);
      _aidl_parcel.writeLong(highMemoryPeakMb);
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
        highBreachCount = _aidl_parcel.readLong();
        if (_aidl_parcel.dataPosition() - _aidl_start_pos >= _aidl_parcelable_size) return;
        highMemoryPeakMb = _aidl_parcel.readLong();
      } finally {
        if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
          throw new android.os.BadParcelableException("Overflow in the size of parcelable");
        }
        _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
      }
    }
    @Override
    public int describeContents() {
      int _mask = 0;
      return _mask;
    }
  }
  public static class FsckFailedReported implements android.os.Parcelable
  {
    public int exitCode = 0;
    public static final android.os.Parcelable.Creator<FsckFailedReported> CREATOR = new android.os.Parcelable.Creator<FsckFailedReported>() {
      @Override
      public FsckFailedReported createFromParcel(android.os.Parcel _aidl_source) {
        FsckFailedReported _aidl_out = new FsckFailedReported();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public FsckFailedReported[] newArray(int _aidl_size) {
        return new FsckFailedReported[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeInt(exitCode);
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
        exitCode = _aidl_parcel.readInt();
      } finally {
        if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
          throw new android.os.BadParcelableException("Overflow in the size of parcelable");
        }
        _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
      }
    }
    @Override
    public int describeContents() {
      int _mask = 0;
      return _mask;
    }
  }
  public static class GetOrCreateSkSecretFailedReported implements android.os.Parcelable
  {
    public int retryCount = 0;
    public static final android.os.Parcelable.Creator<GetOrCreateSkSecretFailedReported> CREATOR = new android.os.Parcelable.Creator<GetOrCreateSkSecretFailedReported>() {
      @Override
      public GetOrCreateSkSecretFailedReported createFromParcel(android.os.Parcel _aidl_source) {
        GetOrCreateSkSecretFailedReported _aidl_out = new GetOrCreateSkSecretFailedReported();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public GetOrCreateSkSecretFailedReported[] newArray(int _aidl_size) {
        return new GetOrCreateSkSecretFailedReported[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeInt(retryCount);
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
        retryCount = _aidl_parcel.readInt();
      } finally {
        if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
          throw new android.os.BadParcelableException("Overflow in the size of parcelable");
        }
        _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
      }
    }
    @Override
    public int describeContents() {
      int _mask = 0;
      return _mask;
    }
  }
  public static class PsiMonitorFailedReported implements android.os.Parcelable
  {
    public long exponentialBackoffSeconds = 0L;
    public static final android.os.Parcelable.Creator<PsiMonitorFailedReported> CREATOR = new android.os.Parcelable.Creator<PsiMonitorFailedReported>() {
      @Override
      public PsiMonitorFailedReported createFromParcel(android.os.Parcel _aidl_source) {
        PsiMonitorFailedReported _aidl_out = new PsiMonitorFailedReported();
        _aidl_out.readFromParcel(_aidl_source);
        return _aidl_out;
      }
      @Override
      public PsiMonitorFailedReported[] newArray(int _aidl_size) {
        return new PsiMonitorFailedReported[_aidl_size];
      }
    };
    @Override public final void writeToParcel(android.os.Parcel _aidl_parcel, int _aidl_flag)
    {
      int _aidl_start_pos = _aidl_parcel.dataPosition();
      _aidl_parcel.writeInt(0);
      _aidl_parcel.writeLong(exponentialBackoffSeconds);
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
        exponentialBackoffSeconds = _aidl_parcel.readLong();
      } finally {
        if (_aidl_start_pos > (Integer.MAX_VALUE - _aidl_parcelable_size)) {
          throw new android.os.BadParcelableException("Overflow in the size of parcelable");
        }
        _aidl_parcel.setDataPosition(_aidl_start_pos + _aidl_parcelable_size);
      }
    }
    @Override
    public int describeContents() {
      int _mask = 0;
      return _mask;
    }
  }
  public static @interface Tag {
    public static final int cgroupMemoryBreachReported = 0;
    public static final int fsckFailedReported = 1;
    public static final int getOrCreateSkSecretFailedReported = 2;
    public static final int psiMonitorFailedReported = 3;
  }
}
