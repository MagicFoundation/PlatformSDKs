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

package com.android.internal.os;

import com.android.internal.util.ProcFileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Reads and parses {@code binder_logs/stats} file in the {@code binderfs} filesystem.
 * Reuse procFileReader as the contents are generated by Linux kernel in the same way.
 *
 * A typical example of binderfs stats log
 *
 * binder stats:
 * BC_TRANSACTION: 378004
 * BC_REPLY: 268352
 * BC_FREE_BUFFER: 665854
 * ...
 * proc 12645
 * context binder
 * threads: 12
 * requested threads: 0+5/15
 * ready threads 0
 * free async space 520192
 * ...
 */
@android.ravenwood.annotation.RavenwoodKeepWholeClass
public class BinderfsStatsReader {
    private final String mPath;

    public BinderfsStatsReader() {
        mPath = "/dev/binderfs/binder_logs/stats";
    }

    public BinderfsStatsReader(String path) {
        mPath = path;
    }

    /**
     * Read binderfs stats and call the consumer(pid, free) function for each valid process
     *
     * @param predicate  Test if the pid is valid.
     * @param biConsumer Callback function for each valid pid and its free async space
     * @param consumer   The error function to deal with exceptions
     */
    public void handleFreeAsyncSpace(Predicate<Integer> predicate,
            BiConsumer<Integer, Integer> biConsumer, Consumer<Exception> consumer) {
        try (ProcFileReader mReader = new ProcFileReader(new FileInputStream(mPath))) {
            while (mReader.hasMoreData()) {
                // find the next process
                if (!mReader.nextString().equals("proc")) {
                    mReader.finishLine();
                    continue;
                }

                // read pid
                int pid = mReader.nextInt();
                mReader.finishLine();

                // check if we have interest in this process
                if (!predicate.test(pid)) {
                    continue;
                }

                // read free async space
                mReader.finishLine(); // context binder
                mReader.finishLine(); // threads:
                mReader.finishLine(); // requested threads:
                mReader.finishLine(); // ready threads
                if (!mReader.nextString().equals("free")) {
                    mReader.finishLine();
                    continue;
                }
                if (!mReader.nextString().equals("async")) {
                    mReader.finishLine();
                    continue;
                }
                if (!mReader.nextString().equals("space")) {
                    mReader.finishLine();
                    continue;
                }
                int free = mReader.nextInt();
                mReader.finishLine();
                biConsumer.accept(pid, free);
            }
        } catch (IOException | NumberFormatException e) {
            consumer.accept(e);
        }
    }
}
