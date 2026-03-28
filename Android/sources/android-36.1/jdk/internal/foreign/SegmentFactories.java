/*
 * Copyright (c) 2023, 2025, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package jdk.internal.foreign;

import java.lang.foreign.MemorySegment;

import jdk.internal.misc.Unsafe;
import jdk.internal.misc.VM;
import jdk.internal.vm.annotation.ForceInline;
import jdk.internal.vm.annotation.IntrinsicCandidate;

/**
 * This class is used to retrieve concrete memory segment implementations, while making sure that classes
 * are initialized in the right order (that is, that {@code MemorySegment} is always initialized first).
 * See {@link SegmentFactories#ensureInitialized()}.
 */
public class SegmentFactories {

    // The maximum alignment supported by malloc - typically 16 bytes on
    // 64-bit platforms and 8 bytes on 32-bit platforms.
    private static final long MAX_MALLOC_ALIGN = Unsafe.ADDRESS_SIZE == 4 ? 8 : 16;

    private static final Unsafe UNSAFE = Unsafe.getUnsafe();

    // Unsafe native segment factories. These are used by the implementation code, to skip the sanity checks
    // associated with MemorySegment::ofAddress.
    @ForceInline
    public static NativeMemorySegmentImpl makeNativeSegmentUnchecked(long min, long byteSize,
                                                                     MemorySessionImpl sessionImpl,
                                                                     boolean readOnly, Runnable action) {
        ensureInitialized();
        if (action == null) {
            sessionImpl.checkValidState();
        } else {
            sessionImpl.addCloseAction(action);
        }
        return new NativeMemorySegmentImpl(min, byteSize, readOnly, sessionImpl);
    }


    @ForceInline
    public static NativeMemorySegmentImpl makeNativeSegmentUnchecked(long min, long byteSize) {
        ensureInitialized();
        return new NativeMemorySegmentImpl(min, byteSize, false, MemorySessionImpl.GLOBAL_SESSION);
    }
    public static NativeMemorySegmentImpl allocateNativeSegment(long byteSize, long byteAlignment, MemorySessionImpl sessionImpl,
                                                                boolean shouldReserve, boolean init) {
        long address = SegmentFactories.allocateNativeInternal(byteSize, byteAlignment, sessionImpl, shouldReserve, init);
        return new NativeMemorySegmentImpl(address, byteSize, false, sessionImpl);
    }

    private static long allocateNativeInternal(long byteSize, long byteAlignment, MemorySessionImpl sessionImpl,
                                               boolean shouldReserve, boolean init) {
        ensureInitialized();
        Utils.checkAllocationSizeAndAlign(byteSize, byteAlignment);
        sessionImpl.checkValidState();
        if (VM.isDirectMemoryPageAligned()) {
            byteAlignment = Math.max(byteAlignment, AbstractMemorySegmentImpl.NIO_ACCESS.pageSize());
        }
        // Align the allocation size up to a multiple of 8 so we can init the memory with longs
        long alignedSize = init ? Utils.alignUp(byteSize, Long.BYTES) : byteSize;
        // Check for wrap around
        if (alignedSize < 0) {
            throw new OutOfMemoryError();
        }
        // Always allocate at least some memory so that zero-length segments have distinct
        // non-zero addresses.
        alignedSize = Math.max(1, alignedSize);

        long allocationSize;
        long allocationBase;
        long result;
        if (byteAlignment > MAX_MALLOC_ALIGN) {
            allocationSize = alignedSize + byteAlignment - MAX_MALLOC_ALIGN;
            // BEGIN Android-removed: Not used in Android.
            /*
            if (shouldReserve) {
                AbstractMemorySegmentImpl.NIO_ACCESS.reserveMemory(allocationSize, byteSize);
            }
            */
            // END Android-removed: Not used in Android.
            allocationBase = allocateMemoryWrapper(allocationSize);
            result = Utils.alignUp(allocationBase, byteAlignment);
        } else {
            allocationSize = alignedSize;
            // BEGIN Android-removed: Not used in Android.
            /*
            if (shouldReserve) {
                AbstractMemorySegmentImpl.NIO_ACCESS.reserveMemory(allocationSize, byteSize);
            }
            */
            // END Android-removed: Not used in Android.
            allocationBase = allocateMemoryWrapper(allocationSize);
            result = allocationBase;
        }

        if (init) {
            initNativeMemory(result, alignedSize);
        }
        sessionImpl.addOrCleanupIfFail(new MemorySessionImpl.ResourceList.ResourceCleanup() {
            @Override
            public void cleanup() {
                UNSAFE.freeMemory(allocationBase);
                // BEGIN Android-removed: Not used in Android.
                /*
                if (shouldReserve) {
                    AbstractMemorySegmentImpl.NIO_ACCESS.unreserveMemory(allocationSize, byteSize);
                }
                */
                // END Android-removed: Not used in Android.
            }
        });
        return result;
    }

    private static void initNativeMemory(long address, long byteSize) {
        for (long i = 0; i < byteSize; i += Long.BYTES) {
            // Android-changed: Introduced putLongAligned locally
            // UNSAFE.putLongUnaligned(null, address + i, 0);
            putLongUnaligned( address + i, 0);
        }
    }

    private static long allocateMemoryWrapper(long size) {
        try {
            return UNSAFE.allocateMemory(size);
        } catch (IllegalArgumentException ex) {
            throw new OutOfMemoryError();
        }
    }

    @ForceInline
    private static void ensureInitialized() {
        MemorySegment segment = MemorySegment.NULL;
    }

    // BEGIN Android-added: Copied over from Unsafe without Object argument (see b/438953179)
    @IntrinsicCandidate
    private static void putLongUnaligned(long offset, long x) {
        if ((offset & 7) == 0) {
            UNSAFE.putLong(offset, x);
        } else if ((offset & 3) == 0) {
            putLongParts(offset,
                    (int)(x >> 0),
                    (int)(x >>> 32));
        } else if ((offset & 1) == 0) {
            putLongParts( offset,
                    (short)(x >>> 0),
                    (short)(x >>> 16),
                    (short)(x >>> 32),
                    (short)(x >>> 48));
        } else {
            putLongParts(offset,
                    (byte)(x >>> 0),
                    (byte)(x >>> 8),
                    (byte)(x >>> 16),
                    (byte)(x >>> 24),
                    (byte)(x >>> 32),
                    (byte)(x >>> 40),
                    (byte)(x >>> 48),
                    (byte)(x >>> 56));
        }
    }

    // These methods write integers to memory from smaller parts
    // provided by their caller.  The ordering in which these parts
    // are written is the native endianness of this platform.
    public static void putLongParts( long offset, byte i0, byte i1, byte i2, byte i3, byte i4, byte i5, byte i6, byte i7) {
        UNSAFE.putByte( offset + 0, i0);
        UNSAFE.putByte( offset + 1, i1);
        UNSAFE.putByte( offset + 2, i2);
        UNSAFE.putByte( offset + 3, i3);
        UNSAFE.putByte( offset + 4, i4);
        UNSAFE.putByte( offset + 5, i5);
        UNSAFE.putByte( offset + 6, i6);
        UNSAFE.putByte( offset + 7, i7);
    }
    public static void putLongParts(long offset, short i0, short i1, short i2, short i3) {
        UNSAFE.putShort( offset + 0, i0);
        UNSAFE.putShort( offset + 2, i1);
        UNSAFE.putShort( offset + 4, i2);
        UNSAFE.putShort( offset + 6, i3);
    }
    public static void putLongParts(long offset, int i0, int i1) {
        UNSAFE.putInt( offset + 0, i0);
        UNSAFE.putInt( offset + 4, i1);
    }
    // END Android-added: Copied over from Unsafe without Object argument (see b/438953179)
}
