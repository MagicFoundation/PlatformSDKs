/*
 * Copyright (C) 2023 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.ondevicepersonalization;

import android.annotation.Nullable;
import android.os.Parcelable;

import com.android.ondevicepersonalization.internal.util.DataClass;

/**
 * A list of metrics to be logged in the Query or Events table.
 *
 * @hide
 */
@DataClass(genBuilder = true, genEqualsHashCode = true)
public final class Metrics implements Parcelable {
    /** Integer or fixed point metric values. */
    @Nullable private long[] mLongValues = null;

    /** Floating point metric values. */
    @Nullable private double[] mDoubleValues = null;

    /** Boolean metric values. */
    @Nullable private boolean[] mBooleanValues = null;



    // Code below generated by codegen v1.0.23.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/Metrics.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    /* package-private */ Metrics(
            @Nullable long[] longValues,
            @Nullable double[] doubleValues,
            @Nullable boolean[] booleanValues) {
        this.mLongValues = longValues;
        this.mDoubleValues = doubleValues;
        this.mBooleanValues = booleanValues;

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * Integer or fixed point metric values.
     */
    @DataClass.Generated.Member
    public @Nullable long[] getLongValues() {
        return mLongValues;
    }

    /**
     * Floating point metric values.
     */
    @DataClass.Generated.Member
    public @Nullable double[] getDoubleValues() {
        return mDoubleValues;
    }

    /**
     * Boolean metric values.
     */
    @DataClass.Generated.Member
    public @Nullable boolean[] getBooleanValues() {
        return mBooleanValues;
    }

    @Override
    @DataClass.Generated.Member
    public boolean equals(@Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(Metrics other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        Metrics that = (Metrics) o;
        //noinspection PointlessBooleanExpression
        return true
                && java.util.Arrays.equals(mLongValues, that.mLongValues)
                && java.util.Arrays.equals(mDoubleValues, that.mDoubleValues)
                && java.util.Arrays.equals(mBooleanValues, that.mBooleanValues);
    }

    @Override
    @DataClass.Generated.Member
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + java.util.Arrays.hashCode(mLongValues);
        _hash = 31 * _hash + java.util.Arrays.hashCode(mDoubleValues);
        _hash = 31 * _hash + java.util.Arrays.hashCode(mBooleanValues);
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@android.annotation.NonNull android.os.Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        byte flg = 0;
        if (mLongValues != null) flg |= 0x1;
        if (mDoubleValues != null) flg |= 0x2;
        if (mBooleanValues != null) flg |= 0x4;
        dest.writeByte(flg);
        if (mLongValues != null) dest.writeLongArray(mLongValues);
        if (mDoubleValues != null) dest.writeDoubleArray(mDoubleValues);
        if (mBooleanValues != null) dest.writeBooleanArray(mBooleanValues);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ Metrics(@android.annotation.NonNull android.os.Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        byte flg = in.readByte();
        long[] longValues = (flg & 0x1) == 0 ? null : in.createLongArray();
        double[] doubleValues = (flg & 0x2) == 0 ? null : in.createDoubleArray();
        boolean[] booleanValues = (flg & 0x4) == 0 ? null : in.createBooleanArray();

        this.mLongValues = longValues;
        this.mDoubleValues = doubleValues;
        this.mBooleanValues = booleanValues;

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @android.annotation.NonNull Parcelable.Creator<Metrics> CREATOR
            = new Parcelable.Creator<Metrics>() {
        @Override
        public Metrics[] newArray(int size) {
            return new Metrics[size];
        }

        @Override
        public Metrics createFromParcel(@android.annotation.NonNull android.os.Parcel in) {
            return new Metrics(in);
        }
    };

    /**
     * A builder for {@link Metrics}
     */
    @SuppressWarnings("WeakerAccess")
    @DataClass.Generated.Member
    public static final class Builder {

        private @Nullable long[] mLongValues;
        private @Nullable double[] mDoubleValues;
        private @Nullable boolean[] mBooleanValues;

        private long mBuilderFieldsSet = 0L;

        public Builder() {
        }

        /**
         * Integer or fixed point metric values.
         */
        @DataClass.Generated.Member
        public @android.annotation.NonNull Builder setLongValues(@android.annotation.NonNull long... value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x1;
            mLongValues = value;
            return this;
        }

        /**
         * Floating point metric values.
         */
        @DataClass.Generated.Member
        public @android.annotation.NonNull Builder setDoubleValues(@android.annotation.NonNull double... value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x2;
            mDoubleValues = value;
            return this;
        }

        /**
         * Boolean metric values.
         */
        @DataClass.Generated.Member
        public @android.annotation.NonNull Builder setBooleanValues(@android.annotation.NonNull boolean... value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x4;
            mBooleanValues = value;
            return this;
        }

        /** Builds the instance. This builder should not be touched after calling this! */
        public @android.annotation.NonNull Metrics build() {
            checkNotUsed();
            mBuilderFieldsSet |= 0x8; // Mark builder used

            if ((mBuilderFieldsSet & 0x1) == 0) {
                mLongValues = null;
            }
            if ((mBuilderFieldsSet & 0x2) == 0) {
                mDoubleValues = null;
            }
            if ((mBuilderFieldsSet & 0x4) == 0) {
                mBooleanValues = null;
            }
            Metrics o = new Metrics(
                    mLongValues,
                    mDoubleValues,
                    mBooleanValues);
            return o;
        }

        private void checkNotUsed() {
            if ((mBuilderFieldsSet & 0x8) != 0) {
                throw new IllegalStateException(
                        "This Builder should not be reused. Use a new Builder instance instead");
            }
        }
    }

    @DataClass.Generated(
            time = 1681840610478L,
            codegenVersion = "1.0.23",
            sourceFile = "packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/Metrics.java",
            inputSignatures = "private @android.annotation.Nullable long[] mLongValues\nprivate @android.annotation.Nullable double[] mDoubleValues\nprivate @android.annotation.Nullable boolean[] mBooleanValues\nclass Metrics extends java.lang.Object implements [android.os.Parcelable]\n@com.android.ondevicepersonalization.internal.util.DataClass(genBuilder=true, genEqualsHashCode=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
