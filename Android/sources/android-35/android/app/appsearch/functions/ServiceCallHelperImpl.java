/*
 * Copyright (C) 2024 The Android Open Source Project
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
package android.app.appsearch.functions;

import android.annotation.NonNull;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.UserHandle;
import android.util.Log;

import java.util.concurrent.Executor;
import java.util.function.Function;

/**
 * An implementation of {@link ServiceCallHelper} that that is based on {@link Context#bindService}.
 *
 * @hide
 */
public class ServiceCallHelperImpl<T> implements ServiceCallHelper<T> {
    private static final String TAG = "AppSearchAppFunction";

    @NonNull private final Context mContext;
    @NonNull private final Function<IBinder, T> mInterfaceConverter;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final Executor mExecutor;

    /**
     * @param interfaceConverter A function responsible for converting an IBinder object into the
     *     desired service interface.
     * @param executor An Executor instance to dispatch callback.
     * @param context The system context.
     */
    public ServiceCallHelperImpl(
            @NonNull Context context,
            @NonNull Function<IBinder, T> interfaceConverter,
            @NonNull Executor executor) {
        mContext = context;
        mInterfaceConverter = interfaceConverter;
        mExecutor = executor;
    }

    @Override
    public boolean runServiceCall(
            @NonNull Intent intent,
            int bindFlags,
            long timeoutInMillis,
            @NonNull UserHandle userHandle,
            @NonNull RunServiceCallCallback<T> callback) {
        OneOffServiceConnection serviceConnection =
                new OneOffServiceConnection(
                        intent, bindFlags, timeoutInMillis, userHandle, callback);

        return serviceConnection.bindAndRun();
    }

    private class OneOffServiceConnection
            implements ServiceConnection, ServiceUsageCompleteListener {
        private final Intent mIntent;
        private final int mFlags;
        private final long mTimeoutMillis;
        private final UserHandle mUserHandle;
        private final RunServiceCallCallback<T> mCallback;
        private final Runnable mTimeoutCallback;

        OneOffServiceConnection(
                @NonNull Intent intent,
                int flags,
                long timeoutMillis,
                @NonNull UserHandle userHandle,
                @NonNull RunServiceCallCallback<T> callback) {
            mIntent = intent;
            mFlags = flags;
            mTimeoutMillis = timeoutMillis;
            mCallback = callback;
            mTimeoutCallback =
                    () ->
                            mExecutor.execute(
                                    () -> {
                                        safeUnbind();
                                        mCallback.onTimedOut();
                                    });
            mUserHandle = userHandle;
        }

        public boolean bindAndRun() {
            boolean bindServiceResult =
                    mContext.bindServiceAsUser(mIntent, this, mFlags, mUserHandle);

            if (bindServiceResult) {
                mHandler.postDelayed(mTimeoutCallback, mTimeoutMillis);
            } else {
                safeUnbind();
            }

            return bindServiceResult;
        }

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            T serviceInterface = mInterfaceConverter.apply(service);

            mExecutor.execute(() -> mCallback.onServiceConnected(serviceInterface, this));
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            safeUnbind();
            mExecutor.execute(mCallback::onFailedToConnect);
        }

        @Override
        public void onBindingDied(ComponentName name) {
            safeUnbind();
            mExecutor.execute(mCallback::onFailedToConnect);
        }

        @Override
        public void onNullBinding(ComponentName name) {
            safeUnbind();
            mExecutor.execute(mCallback::onFailedToConnect);
        }

        private void safeUnbind() {
            try {
                mHandler.removeCallbacks(mTimeoutCallback);
                mContext.unbindService(this);
            } catch (Exception ex) {
                Log.w(TAG, "Failed to unbind", ex);
            }
        }

        @Override
        public void onCompleted() {
            safeUnbind();
        }
    }
}
