/*
 * Copyright (c) 2020, 2025, Oracle and/or its affiliates. All rights reserved.
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
import java.util.Objects;

import jdk.internal.access.JavaNioAccess;
import jdk.internal.access.SharedSecrets;
import jdk.internal.vm.annotation.ForceInline;

/**
 * This abstract class provides an immutable implementation for the {@code MemorySegment} interface. This class contains information
 * about the segment's spatial and temporal bounds; each memory segment implementation is associated with an owner thread which is set at creation time.
 * Access to certain sensitive operations on the memory segment will fail with {@code IllegalStateException} if the
 * segment is either in an invalid state (e.g. it has already been closed) or if access occurs from a thread other
 * than the owner thread. See {@link MemorySessionImpl} for more details on management of temporal bounds. Subclasses
 * are defined for each memory segment kind, see {@link NativeMemorySegmentImpl}, {@link HeapMemorySegmentImpl} and
 * {@link MappedMemorySegmentImpl}.
 */
// Android-changed: Commented out non-implemented parts
public abstract sealed class AbstractMemorySegmentImpl
        implements MemorySegment/*, SegmentAllocator, BiFunction<String, List<Number>, RuntimeException>*/
        permits /*HeapMemorySegmentImpl,*/ NativeMemorySegmentImpl {
    final long length;
    final boolean readOnly;
    final MemorySessionImpl scope;

    @Override
    public MemorySessionImpl scope() {
        return scope;
    }

    @Override
    public final long byteSize() {
        return length;
    }

    @ForceInline
    AbstractMemorySegmentImpl(long length, boolean readOnly, MemorySessionImpl scope) {
        this.length = length;
        this.readOnly = readOnly;
        this.scope = scope;
    }

    static final JavaNioAccess NIO_ACCESS = SharedSecrets.getJavaNioAccess();

    // Object methods

    @Override
    public boolean equals(Object o) {
        return o instanceof AbstractMemorySegmentImpl that &&
                unsafeGetBase() == that.unsafeGetBase() &&
                unsafeGetOffset() == that.unsafeGetOffset();
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                unsafeGetOffset(),
                unsafeGetBase());
    }

    public abstract long unsafeGetOffset();

    public abstract Object unsafeGetBase();
}
