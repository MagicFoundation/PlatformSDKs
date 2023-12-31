/*
 * Copyright (C) 2022 The Android Open Source Project
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

import android.annotation.NonNull;
import android.os.Parcelable;

import com.android.ondevicepersonalization.internal.util.AnnotationValidations;
import com.android.ondevicepersonalization.internal.util.DataClass;

import java.util.List;

/**
 * User data for personalized ads targeting.
 *
 * @hide
 */
// This class should be updated with the Kotlin mirror
// {@link com.android.ondevicepersonalization.services.policyengine.data.UserData}.
@DataClass(genBuilder = true, genEqualsHashCode = true)
public final class UserData implements Parcelable {
    /** The current timestamp in second. */
    @NonNull long mTimeSec;

    /** The device timezone +/- minutes offset from UTC. */
    @NonNull int mTimezone;

    /** The device orientation. */
    @NonNull int mOrientation;

    /** The available space on device in MB. */
    @NonNull int mAvailableBytesMB;

    /** Battery percentage. */
    @NonNull int mBatteryPct;

    /** Country. See the full list {@link Country}. */
    @NonNull int mCountry;

    /** Language. See the full list {@link Language}. */
    @NonNull int mLanguage;

    /** Carrier. See the full list {@link Carrier}. */
    @NonNull int mCarrier;

    /** OS versions. */
    @NonNull OSVersion mOsVersions;

    /** Network connection types. See full list {@link RawUserData.ConnectionType}. */
    @NonNull int mConnectionType;

    /** Connection speed in kbps. */
    @NonNull int mConnectionSpeedKbps;

    /** Status if network is metered. False - not metered. True - metered. */
    @NonNull boolean mNetworkMetered;

    /** Device metrics value. */
    @NonNull DeviceMetrics mDeviceMetrics;

    /** The history of installed/uninstalled packages. */
    @NonNull List<AppInstallStatus> mAppInstalledHistory;

    /** The app usage history in the last 30 days, sorted by total time spent. */
    @NonNull List<AppUsageStatus> mAppUsageHistory;

    /** The most recently known location. */
    @NonNull Location mCurrentLocation;

    /** The location history in last 30 days, sorted by the stay duration. */
    @NonNull List<LocationStatus> mLocationHistory;



    // Code below generated by codegen v1.0.23.
    //
    // DO NOT MODIFY!
    // CHECKSTYLE:OFF Generated code
    //
    // To regenerate run:
    // $ codegen $ANDROID_BUILD_TOP/packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/UserData.java
    //
    // To exclude the generated code from IntelliJ auto-formatting enable (one-time):
    //   Settings > Editor > Code Style > Formatter Control
    //@formatter:off


    @DataClass.Generated.Member
    /* package-private */ UserData(
            @NonNull long timeSec,
            @NonNull int timezone,
            @NonNull int orientation,
            @NonNull int availableBytesMB,
            @NonNull int batteryPct,
            @NonNull int country,
            @NonNull int language,
            @NonNull int carrier,
            @NonNull OSVersion osVersions,
            @NonNull int connectionType,
            @NonNull int connectionSpeedKbps,
            @NonNull boolean networkMetered,
            @NonNull DeviceMetrics deviceMetrics,
            @NonNull List<AppInstallStatus> appInstalledHistory,
            @NonNull List<AppUsageStatus> appUsageHistory,
            @NonNull Location currentLocation,
            @NonNull List<LocationStatus> locationHistory) {
        this.mTimeSec = timeSec;
        AnnotationValidations.validate(
                NonNull.class, null, mTimeSec);
        this.mTimezone = timezone;
        AnnotationValidations.validate(
                NonNull.class, null, mTimezone);
        this.mOrientation = orientation;
        AnnotationValidations.validate(
                NonNull.class, null, mOrientation);
        this.mAvailableBytesMB = availableBytesMB;
        AnnotationValidations.validate(
                NonNull.class, null, mAvailableBytesMB);
        this.mBatteryPct = batteryPct;
        AnnotationValidations.validate(
                NonNull.class, null, mBatteryPct);
        this.mCountry = country;
        AnnotationValidations.validate(
                NonNull.class, null, mCountry);
        this.mLanguage = language;
        AnnotationValidations.validate(
                NonNull.class, null, mLanguage);
        this.mCarrier = carrier;
        AnnotationValidations.validate(
                NonNull.class, null, mCarrier);
        this.mOsVersions = osVersions;
        AnnotationValidations.validate(
                NonNull.class, null, mOsVersions);
        this.mConnectionType = connectionType;
        AnnotationValidations.validate(
                NonNull.class, null, mConnectionType);
        this.mConnectionSpeedKbps = connectionSpeedKbps;
        AnnotationValidations.validate(
                NonNull.class, null, mConnectionSpeedKbps);
        this.mNetworkMetered = networkMetered;
        AnnotationValidations.validate(
                NonNull.class, null, mNetworkMetered);
        this.mDeviceMetrics = deviceMetrics;
        AnnotationValidations.validate(
                NonNull.class, null, mDeviceMetrics);
        this.mAppInstalledHistory = appInstalledHistory;
        AnnotationValidations.validate(
                NonNull.class, null, mAppInstalledHistory);
        this.mAppUsageHistory = appUsageHistory;
        AnnotationValidations.validate(
                NonNull.class, null, mAppUsageHistory);
        this.mCurrentLocation = currentLocation;
        AnnotationValidations.validate(
                NonNull.class, null, mCurrentLocation);
        this.mLocationHistory = locationHistory;
        AnnotationValidations.validate(
                NonNull.class, null, mLocationHistory);

        // onConstructed(); // You can define this method to get a callback
    }

    /**
     * The current timestamp in second.
     */
    @DataClass.Generated.Member
    public @NonNull long getTimeSec() {
        return mTimeSec;
    }

    /**
     * The device timezone +/- minutes offset from UTC.
     */
    @DataClass.Generated.Member
    public @NonNull int getTimezone() {
        return mTimezone;
    }

    /**
     * The device orientation.
     */
    @DataClass.Generated.Member
    public @NonNull int getOrientation() {
        return mOrientation;
    }

    /**
     * The available space on device in MB.
     */
    @DataClass.Generated.Member
    public @NonNull int getAvailableBytesMB() {
        return mAvailableBytesMB;
    }

    /**
     * Battery percentage.
     */
    @DataClass.Generated.Member
    public @NonNull int getBatteryPct() {
        return mBatteryPct;
    }

    /**
     * Country. See the full list {@link Country}.
     */
    @DataClass.Generated.Member
    public @NonNull int getCountry() {
        return mCountry;
    }

    /**
     * Language. See the full list {@link Language}.
     */
    @DataClass.Generated.Member
    public @NonNull int getLanguage() {
        return mLanguage;
    }

    /**
     * Carrier. See the full list {@link Carrier}.
     */
    @DataClass.Generated.Member
    public @NonNull int getCarrier() {
        return mCarrier;
    }

    /**
     * OS versions.
     */
    @DataClass.Generated.Member
    public @NonNull OSVersion getOsVersions() {
        return mOsVersions;
    }

    /**
     * Network connection types. See full list {@link RawUserData.ConnectionType}.
     */
    @DataClass.Generated.Member
    public @NonNull int getConnectionType() {
        return mConnectionType;
    }

    /**
     * Connection speed in kbps.
     */
    @DataClass.Generated.Member
    public @NonNull int getConnectionSpeedKbps() {
        return mConnectionSpeedKbps;
    }

    /**
     * Status if network is metered. False - not metered. True - metered.
     */
    @DataClass.Generated.Member
    public @NonNull boolean isNetworkMetered() {
        return mNetworkMetered;
    }

    /**
     * Device metrics value.
     */
    @DataClass.Generated.Member
    public @NonNull DeviceMetrics getDeviceMetrics() {
        return mDeviceMetrics;
    }

    /**
     * The history of installed/uninstalled packages.
     */
    @DataClass.Generated.Member
    public @NonNull List<AppInstallStatus> getAppInstalledHistory() {
        return mAppInstalledHistory;
    }

    /**
     * The app usage history in the last 30 days, sorted by total time spent.
     */
    @DataClass.Generated.Member
    public @NonNull List<AppUsageStatus> getAppUsageHistory() {
        return mAppUsageHistory;
    }

    /**
     * The most recently known location.
     */
    @DataClass.Generated.Member
    public @NonNull Location getCurrentLocation() {
        return mCurrentLocation;
    }

    /**
     * The location history in last 30 days, sorted by the stay duration.
     */
    @DataClass.Generated.Member
    public @NonNull List<LocationStatus> getLocationHistory() {
        return mLocationHistory;
    }

    @Override
    @DataClass.Generated.Member
    public boolean equals(@android.annotation.Nullable Object o) {
        // You can override field equality logic by defining either of the methods like:
        // boolean fieldNameEquals(UserData other) { ... }
        // boolean fieldNameEquals(FieldType otherValue) { ... }

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        @SuppressWarnings("unchecked")
        UserData that = (UserData) o;
        //noinspection PointlessBooleanExpression
        return true
                && mTimeSec == that.mTimeSec
                && mTimezone == that.mTimezone
                && mOrientation == that.mOrientation
                && mAvailableBytesMB == that.mAvailableBytesMB
                && mBatteryPct == that.mBatteryPct
                && mCountry == that.mCountry
                && mLanguage == that.mLanguage
                && mCarrier == that.mCarrier
                && java.util.Objects.equals(mOsVersions, that.mOsVersions)
                && mConnectionType == that.mConnectionType
                && mConnectionSpeedKbps == that.mConnectionSpeedKbps
                && mNetworkMetered == that.mNetworkMetered
                && java.util.Objects.equals(mDeviceMetrics, that.mDeviceMetrics)
                && java.util.Objects.equals(mAppInstalledHistory, that.mAppInstalledHistory)
                && java.util.Objects.equals(mAppUsageHistory, that.mAppUsageHistory)
                && java.util.Objects.equals(mCurrentLocation, that.mCurrentLocation)
                && java.util.Objects.equals(mLocationHistory, that.mLocationHistory);
    }

    @Override
    @DataClass.Generated.Member
    public int hashCode() {
        // You can override field hashCode logic by defining methods like:
        // int fieldNameHashCode() { ... }

        int _hash = 1;
        _hash = 31 * _hash + Long.hashCode(mTimeSec);
        _hash = 31 * _hash + mTimezone;
        _hash = 31 * _hash + mOrientation;
        _hash = 31 * _hash + mAvailableBytesMB;
        _hash = 31 * _hash + mBatteryPct;
        _hash = 31 * _hash + mCountry;
        _hash = 31 * _hash + mLanguage;
        _hash = 31 * _hash + mCarrier;
        _hash = 31 * _hash + java.util.Objects.hashCode(mOsVersions);
        _hash = 31 * _hash + mConnectionType;
        _hash = 31 * _hash + mConnectionSpeedKbps;
        _hash = 31 * _hash + Boolean.hashCode(mNetworkMetered);
        _hash = 31 * _hash + java.util.Objects.hashCode(mDeviceMetrics);
        _hash = 31 * _hash + java.util.Objects.hashCode(mAppInstalledHistory);
        _hash = 31 * _hash + java.util.Objects.hashCode(mAppUsageHistory);
        _hash = 31 * _hash + java.util.Objects.hashCode(mCurrentLocation);
        _hash = 31 * _hash + java.util.Objects.hashCode(mLocationHistory);
        return _hash;
    }

    @Override
    @DataClass.Generated.Member
    public void writeToParcel(@NonNull android.os.Parcel dest, int flags) {
        // You can override field parcelling by defining methods like:
        // void parcelFieldName(Parcel dest, int flags) { ... }

        long flg = 0;
        if (mNetworkMetered) flg |= 0x800;
        dest.writeLong(flg);
        dest.writeLong(mTimeSec);
        dest.writeInt(mTimezone);
        dest.writeInt(mOrientation);
        dest.writeInt(mAvailableBytesMB);
        dest.writeInt(mBatteryPct);
        dest.writeInt(mCountry);
        dest.writeInt(mLanguage);
        dest.writeInt(mCarrier);
        dest.writeTypedObject(mOsVersions, flags);
        dest.writeInt(mConnectionType);
        dest.writeInt(mConnectionSpeedKbps);
        dest.writeTypedObject(mDeviceMetrics, flags);
        dest.writeParcelableList(mAppInstalledHistory, flags);
        dest.writeParcelableList(mAppUsageHistory, flags);
        dest.writeTypedObject(mCurrentLocation, flags);
        dest.writeParcelableList(mLocationHistory, flags);
    }

    @Override
    @DataClass.Generated.Member
    public int describeContents() { return 0; }

    /** @hide */
    @SuppressWarnings({"unchecked", "RedundantCast"})
    @DataClass.Generated.Member
    /* package-private */ UserData(@NonNull android.os.Parcel in) {
        // You can override field unparcelling by defining methods like:
        // static FieldType unparcelFieldName(Parcel in) { ... }

        long flg = in.readLong();
        boolean networkMetered = (flg & 0x800) != 0;
        long timeSec = in.readLong();
        int timezone = in.readInt();
        int orientation = in.readInt();
        int availableBytesMB = in.readInt();
        int batteryPct = in.readInt();
        int country = in.readInt();
        int language = in.readInt();
        int carrier = in.readInt();
        OSVersion osVersions = (OSVersion) in.readTypedObject(OSVersion.CREATOR);
        int connectionType = in.readInt();
        int connectionSpeedKbps = in.readInt();
        DeviceMetrics deviceMetrics = (DeviceMetrics) in.readTypedObject(DeviceMetrics.CREATOR);
        List<AppInstallStatus> appInstalledHistory = new java.util.ArrayList<>();
        in.readParcelableList(appInstalledHistory, AppInstallStatus.class.getClassLoader());
        List<AppUsageStatus> appUsageHistory = new java.util.ArrayList<>();
        in.readParcelableList(appUsageHistory, AppUsageStatus.class.getClassLoader());
        Location currentLocation = (Location) in.readTypedObject(Location.CREATOR);
        List<LocationStatus> locationHistory = new java.util.ArrayList<>();
        in.readParcelableList(locationHistory, LocationStatus.class.getClassLoader());

        this.mTimeSec = timeSec;
        AnnotationValidations.validate(
                NonNull.class, null, mTimeSec);
        this.mTimezone = timezone;
        AnnotationValidations.validate(
                NonNull.class, null, mTimezone);
        this.mOrientation = orientation;
        AnnotationValidations.validate(
                NonNull.class, null, mOrientation);
        this.mAvailableBytesMB = availableBytesMB;
        AnnotationValidations.validate(
                NonNull.class, null, mAvailableBytesMB);
        this.mBatteryPct = batteryPct;
        AnnotationValidations.validate(
                NonNull.class, null, mBatteryPct);
        this.mCountry = country;
        AnnotationValidations.validate(
                NonNull.class, null, mCountry);
        this.mLanguage = language;
        AnnotationValidations.validate(
                NonNull.class, null, mLanguage);
        this.mCarrier = carrier;
        AnnotationValidations.validate(
                NonNull.class, null, mCarrier);
        this.mOsVersions = osVersions;
        AnnotationValidations.validate(
                NonNull.class, null, mOsVersions);
        this.mConnectionType = connectionType;
        AnnotationValidations.validate(
                NonNull.class, null, mConnectionType);
        this.mConnectionSpeedKbps = connectionSpeedKbps;
        AnnotationValidations.validate(
                NonNull.class, null, mConnectionSpeedKbps);
        this.mNetworkMetered = networkMetered;
        AnnotationValidations.validate(
                NonNull.class, null, mNetworkMetered);
        this.mDeviceMetrics = deviceMetrics;
        AnnotationValidations.validate(
                NonNull.class, null, mDeviceMetrics);
        this.mAppInstalledHistory = appInstalledHistory;
        AnnotationValidations.validate(
                NonNull.class, null, mAppInstalledHistory);
        this.mAppUsageHistory = appUsageHistory;
        AnnotationValidations.validate(
                NonNull.class, null, mAppUsageHistory);
        this.mCurrentLocation = currentLocation;
        AnnotationValidations.validate(
                NonNull.class, null, mCurrentLocation);
        this.mLocationHistory = locationHistory;
        AnnotationValidations.validate(
                NonNull.class, null, mLocationHistory);

        // onConstructed(); // You can define this method to get a callback
    }

    @DataClass.Generated.Member
    public static final @NonNull Parcelable.Creator<UserData> CREATOR
            = new Parcelable.Creator<UserData>() {
        @Override
        public UserData[] newArray(int size) {
            return new UserData[size];
        }

        @Override
        public UserData createFromParcel(@NonNull android.os.Parcel in) {
            return new UserData(in);
        }
    };

    /**
     * A builder for {@link UserData}
     */
    @SuppressWarnings("WeakerAccess")
    @DataClass.Generated.Member
    public static final class Builder {

        private @NonNull long mTimeSec;
        private @NonNull int mTimezone;
        private @NonNull int mOrientation;
        private @NonNull int mAvailableBytesMB;
        private @NonNull int mBatteryPct;
        private @NonNull int mCountry;
        private @NonNull int mLanguage;
        private @NonNull int mCarrier;
        private @NonNull OSVersion mOsVersions;
        private @NonNull int mConnectionType;
        private @NonNull int mConnectionSpeedKbps;
        private @NonNull boolean mNetworkMetered;
        private @NonNull DeviceMetrics mDeviceMetrics;
        private @NonNull List<AppInstallStatus> mAppInstalledHistory;
        private @NonNull List<AppUsageStatus> mAppUsageHistory;
        private @NonNull Location mCurrentLocation;
        private @NonNull List<LocationStatus> mLocationHistory;

        private long mBuilderFieldsSet = 0L;

        /**
         * Creates a new Builder.
         *
         * @param timeSec
         *   The current timestamp in second.
         * @param timezone
         *   The device timezone +/- minutes offset from UTC.
         * @param orientation
         *   The device orientation.
         * @param availableBytesMB
         *   The available space on device in MB.
         * @param batteryPct
         *   Battery percentage.
         * @param country
         *   Country. See the full list {@link Country}.
         * @param language
         *   Language. See the full list {@link Language}.
         * @param carrier
         *   Carrier. See the full list {@link Carrier}.
         * @param osVersions
         *   OS versions.
         * @param connectionType
         *   Network connection types. See full list {@link RawUserData.ConnectionType}.
         * @param connectionSpeedKbps
         *   Connection speed in kbps.
         * @param networkMetered
         *   Status if network is metered. False - not metered. True - metered.
         * @param deviceMetrics
         *   Device metrics value.
         * @param appInstalledHistory
         *   The history of installed/uninstalled packages.
         * @param appUsageHistory
         *   The app usage history in the last 30 days, sorted by total time spent.
         * @param currentLocation
         *   The most recently known location.
         * @param locationHistory
         *   The location history in last 30 days, sorted by the stay duration.
         */
        public Builder(
                @NonNull long timeSec,
                @NonNull int timezone,
                @NonNull int orientation,
                @NonNull int availableBytesMB,
                @NonNull int batteryPct,
                @NonNull int country,
                @NonNull int language,
                @NonNull int carrier,
                @NonNull OSVersion osVersions,
                @NonNull int connectionType,
                @NonNull int connectionSpeedKbps,
                @NonNull boolean networkMetered,
                @NonNull DeviceMetrics deviceMetrics,
                @NonNull List<AppInstallStatus> appInstalledHistory,
                @NonNull List<AppUsageStatus> appUsageHistory,
                @NonNull Location currentLocation,
                @NonNull List<LocationStatus> locationHistory) {
            mTimeSec = timeSec;
            AnnotationValidations.validate(
                    NonNull.class, null, mTimeSec);
            mTimezone = timezone;
            AnnotationValidations.validate(
                    NonNull.class, null, mTimezone);
            mOrientation = orientation;
            AnnotationValidations.validate(
                    NonNull.class, null, mOrientation);
            mAvailableBytesMB = availableBytesMB;
            AnnotationValidations.validate(
                    NonNull.class, null, mAvailableBytesMB);
            mBatteryPct = batteryPct;
            AnnotationValidations.validate(
                    NonNull.class, null, mBatteryPct);
            mCountry = country;
            AnnotationValidations.validate(
                    NonNull.class, null, mCountry);
            mLanguage = language;
            AnnotationValidations.validate(
                    NonNull.class, null, mLanguage);
            mCarrier = carrier;
            AnnotationValidations.validate(
                    NonNull.class, null, mCarrier);
            mOsVersions = osVersions;
            AnnotationValidations.validate(
                    NonNull.class, null, mOsVersions);
            mConnectionType = connectionType;
            AnnotationValidations.validate(
                    NonNull.class, null, mConnectionType);
            mConnectionSpeedKbps = connectionSpeedKbps;
            AnnotationValidations.validate(
                    NonNull.class, null, mConnectionSpeedKbps);
            mNetworkMetered = networkMetered;
            AnnotationValidations.validate(
                    NonNull.class, null, mNetworkMetered);
            mDeviceMetrics = deviceMetrics;
            AnnotationValidations.validate(
                    NonNull.class, null, mDeviceMetrics);
            mAppInstalledHistory = appInstalledHistory;
            AnnotationValidations.validate(
                    NonNull.class, null, mAppInstalledHistory);
            mAppUsageHistory = appUsageHistory;
            AnnotationValidations.validate(
                    NonNull.class, null, mAppUsageHistory);
            mCurrentLocation = currentLocation;
            AnnotationValidations.validate(
                    NonNull.class, null, mCurrentLocation);
            mLocationHistory = locationHistory;
            AnnotationValidations.validate(
                    NonNull.class, null, mLocationHistory);
        }

        public Builder() {
        }

        /**
         * The current timestamp in second.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setTimeSec(@NonNull long value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x1;
            mTimeSec = value;
            return this;
        }

        /**
         * The device timezone +/- minutes offset from UTC.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setTimezone(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x2;
            mTimezone = value;
            return this;
        }

        /**
         * The device orientation.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setOrientation(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x4;
            mOrientation = value;
            return this;
        }

        /**
         * The available space on device in MB.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setAvailableBytesMB(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x8;
            mAvailableBytesMB = value;
            return this;
        }

        /**
         * Battery percentage.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setBatteryPct(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x10;
            mBatteryPct = value;
            return this;
        }

        /**
         * Country. See the full list {@link Country}.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setCountry(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x20;
            mCountry = value;
            return this;
        }

        /**
         * Language. See the full list {@link Language}.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setLanguage(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x40;
            mLanguage = value;
            return this;
        }

        /**
         * Carrier. See the full list {@link Carrier}.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setCarrier(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x80;
            mCarrier = value;
            return this;
        }

        /**
         * OS versions.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setOsVersions(@NonNull OSVersion value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x100;
            mOsVersions = value;
            return this;
        }

        /**
         * Network connection types. See full list {@link RawUserData.ConnectionType}.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setConnectionType(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x200;
            mConnectionType = value;
            return this;
        }

        /**
         * Connection speed in kbps.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setConnectionSpeedKbps(@NonNull int value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x400;
            mConnectionSpeedKbps = value;
            return this;
        }

        /**
         * Status if network is metered. False - not metered. True - metered.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setNetworkMetered(@NonNull boolean value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x800;
            mNetworkMetered = value;
            return this;
        }

        /**
         * Device metrics value.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setDeviceMetrics(@NonNull DeviceMetrics value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x1000;
            mDeviceMetrics = value;
            return this;
        }

        /**
         * The history of installed/uninstalled packages.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setAppInstalledHistory(@NonNull List<AppInstallStatus> value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x2000;
            mAppInstalledHistory = value;
            return this;
        }

        /** @see #setAppInstalledHistory */
        @DataClass.Generated.Member
        public @NonNull Builder addAppInstalledHistory(@NonNull AppInstallStatus value) {
            // You can refine this method's name by providing item's singular name, e.g.:
            // @DataClass.PluralOf("item")) mItems = ...

            if (mAppInstalledHistory == null) setAppInstalledHistory(new java.util.ArrayList<>());
            mAppInstalledHistory.add(value);
            return this;
        }

        /**
         * The app usage history in the last 30 days, sorted by total time spent.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setAppUsageHistory(@NonNull List<AppUsageStatus> value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x4000;
            mAppUsageHistory = value;
            return this;
        }

        /** @see #setAppUsageHistory */
        @DataClass.Generated.Member
        public @NonNull Builder addAppUsageHistory(@NonNull AppUsageStatus value) {
            // You can refine this method's name by providing item's singular name, e.g.:
            // @DataClass.PluralOf("item")) mItems = ...

            if (mAppUsageHistory == null) setAppUsageHistory(new java.util.ArrayList<>());
            mAppUsageHistory.add(value);
            return this;
        }

        /**
         * The most recently known location.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setCurrentLocation(@NonNull Location value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x8000;
            mCurrentLocation = value;
            return this;
        }

        /**
         * The location history in last 30 days, sorted by the stay duration.
         */
        @DataClass.Generated.Member
        public @NonNull Builder setLocationHistory(@NonNull List<LocationStatus> value) {
            checkNotUsed();
            mBuilderFieldsSet |= 0x10000;
            mLocationHistory = value;
            return this;
        }

        /** @see #setLocationHistory */
        @DataClass.Generated.Member
        public @NonNull Builder addLocationHistory(@NonNull LocationStatus value) {
            // You can refine this method's name by providing item's singular name, e.g.:
            // @DataClass.PluralOf("item")) mItems = ...

            if (mLocationHistory == null) setLocationHistory(new java.util.ArrayList<>());
            mLocationHistory.add(value);
            return this;
        }

        /** Builds the instance. This builder should not be touched after calling this! */
        public @NonNull UserData build() {
            checkNotUsed();
            mBuilderFieldsSet |= 0x20000; // Mark builder used

            UserData o = new UserData(
                    mTimeSec,
                    mTimezone,
                    mOrientation,
                    mAvailableBytesMB,
                    mBatteryPct,
                    mCountry,
                    mLanguage,
                    mCarrier,
                    mOsVersions,
                    mConnectionType,
                    mConnectionSpeedKbps,
                    mNetworkMetered,
                    mDeviceMetrics,
                    mAppInstalledHistory,
                    mAppUsageHistory,
                    mCurrentLocation,
                    mLocationHistory);
            return o;
        }

        private void checkNotUsed() {
            if ((mBuilderFieldsSet & 0x20000) != 0) {
                throw new IllegalStateException(
                        "This Builder should not be reused. Use a new Builder instance instead");
            }
        }
    }

    @DataClass.Generated(
            time = 1676499729336L,
            codegenVersion = "1.0.23",
            sourceFile = "packages/modules/OnDevicePersonalization/framework/java/android/ondevicepersonalization/UserData.java",
            inputSignatures = " @android.annotation.NonNull long mTimeSec\n @android.annotation.NonNull int mTimezone\n @android.annotation.NonNull int mOrientation\n @android.annotation.NonNull int mAvailableBytesMB\n @android.annotation.NonNull int mBatteryPct\n @android.annotation.NonNull int mCountry\n @android.annotation.NonNull int mLanguage\n @android.annotation.NonNull int mCarrier\n @android.annotation.NonNull android.ondevicepersonalization.OSVersion mOsVersions\n @android.annotation.NonNull int mConnectionType\n @android.annotation.NonNull int mConnectionSpeedKbps\n @android.annotation.NonNull boolean mNetworkMetered\n @android.annotation.NonNull android.ondevicepersonalization.DeviceMetrics mDeviceMetrics\n @android.annotation.NonNull java.util.List<android.ondevicepersonalization.AppInstallStatus> mAppInstalledHistory\n @android.annotation.NonNull java.util.List<android.ondevicepersonalization.AppUsageStatus> mAppUsageHistory\n @android.annotation.NonNull android.ondevicepersonalization.Location mCurrentLocation\n @android.annotation.NonNull java.util.List<android.ondevicepersonalization.LocationStatus> mLocationHistory\nclass UserData extends java.lang.Object implements [android.os.Parcelable]\n@com.android.ondevicepersonalization.internal.util.DataClass(genBuilder=true, genEqualsHashCode=true)")
    @Deprecated
    private void __metadata() {}


    //@formatter:on
    // End of generated code

}
