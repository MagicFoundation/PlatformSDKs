/*
 * Copyright (c) 2019, 2025, Oracle and/or its affiliates. All rights reserved.
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

package java.lang.foreign;

import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Stream;
import jdk.internal.foreign.AbstractMemorySegmentImpl;

import jdk.internal.foreign.SegmentFactories;

/**
 * A memory segment provides access to a contiguous region of memory.
 * <p>
 * There are two kinds of memory segments:
 * <ul>
 *     <li>A <em>heap segment</em> is backed by, and provides access to, a region of
 *     memory inside the Java heap (an "on-heap" region).</li>
 *     <li>A <em>native segment</em> is backed by, and provides access to, a region of
 *     memory outside the Java heap (an "off-heap" region).</li>
 * </ul>
 * Heap segments can be obtained by calling one of the {@link MemorySegment#ofArray(int[])}
 * factory methods. These methods return a memory segment backed by the on-heap region
 * that holds the specified Java array.
 * <p>
 * Native segments can be obtained by calling one of the {@link Arena#allocate(long, long)}
 * factory methods, which return a memory segment backed by a newly allocated off-heap
 * region with the given size and aligned to the given alignment constraint.
 * Alternatively, native segments can be obtained by
 * {@link FileChannel#map(FileChannel.MapMode, long, long, Arena) mapping} a file into a new off-heap
 * region (in some systems, this operation is sometimes referred to as {@code mmap}).
 * Segments obtained in this way are called <em>mapped</em> segments, and their contents
 * can be {@linkplain #force() persisted} and {@linkplain #load() loaded} to and from the
 * underlying memory-mapped file.
 * <p>
 * Both kinds of segments are read and written using the same methods, known as
 * <a href="#segment-deref">access operations</a>. An access operation on a memory
 * segment always and only provides access to the region for which the segment was
 * obtained.
 *
 * <h2 id="segment-characteristics">Characteristics of memory segments</h2>
 *
 * Every memory segment has an {@linkplain #address() address}, expressed as a
 * {@code long} value. The nature of a segment's address depends on the kind of the
 * segment:
 * <ul>
 * <li>The address of a heap segment is not a physical address, but rather an offset
 * within the region of memory which backs the segment. The region is inside the Java
 * heap, so garbage collection might cause the region to be relocated in physical memory
 * over time, but this is not exposed to clients of the {@code MemorySegment} API who
 * see a stable <em>virtualized</em> address for a heap segment backed by the region.
 * A heap segment obtained from one of the {@link #ofArray(int[])} factory methods has
 * an address of zero.</li>
 * <li>The address of a native segment (including mapped segments) denotes the physical
 * address of the region of memory which backs the segment.</li>
 * </ul>
 * <p>
 * Every memory segment has a {@linkplain #maxByteAlignment() maximum byte alignment},
 * expressed as a {@code long} value. The maximum alignment is always a power of two,
 * derived from the segment address, and the segment type, as explained in more detail
 * <a href="#segment-alignment">below</a>.
 * <p>
 * Every memory segment has a {@linkplain #byteSize() size}. The size of a heap segment
 * is derived from the Java array from which it is obtained. This size is predictable
 * across Java runtimes. The size of a native segment is either passed explicitly
 * (as in {@link Arena#allocate(long, long)}) or derived from a {@link MemoryLayout}
 * (as in {@link Arena#allocate(MemoryLayout)}). The size of a memory segment is typically
 * a positive number but may be <a href="#wrapping-addresses">zero</a>, but never negative.
 * <p>
 * The address and size of a memory segment jointly ensure that access operations on the
 * segment cannot fall <em>outside</em> the boundaries of the region of memory that backs
 * the segment. That is, a memory segment has <em>spatial bounds</em>.
 * <p>
 * Every memory segment is associated with a {@linkplain Scope scope}. This ensures that
 * access operations on a memory segment cannot occur when the region of memory that
 * backs the memory segment is no longer available (e.g., after the scope associated
 * with the accessed memory segment is no longer {@linkplain Scope#isAlive() alive}).
 * That is, a memory segment has <em>temporal bounds</em>.
 * <p>
 * Finally, access operations on a memory segment can be subject to additional
 * thread-confinement checks. Heap segments can be accessed from any thread.
 * Conversely, native segments can only be accessed compatibly with the
 * <a href="Arena.html#thread-confinement">confinement characteristics</a> of the arena
 * used to obtain them.
 *
 * <h2 id="segment-deref">Accessing memory segments</h2>
 *
 * A memory segment can be read or written using various access operations provided in
 * this class (e.g. {@link #get(ValueLayout.OfInt, long)}). Each access operation takes
 * a {@linkplain ValueLayout value layout}, which specifies the size and shape of the
 * value, and an offset, expressed in bytes. For instance, to read an {@code int} from
 * a segment, using {@linkplain ByteOrder#nativeOrder() default endianness}, the
 * following code can be used:
 * {@snippet lang=java :
 * MemorySegment segment = ...
 * int value = segment.get(ValueLayout.JAVA_INT, 0);
 * }
 *
 * If the value to be read is stored in memory using {@linkplain ByteOrder#BIG_ENDIAN big-endian}
 * encoding, the access operation can be expressed as follows:
 * {@snippet lang=java :
 * int value = segment.get(ValueLayout.JAVA_INT.withOrder(BIG_ENDIAN), 0);
 * }
 *
 * Access operations on memory segments are implemented using var handles. The
 * {@link ValueLayout#varHandle()} method can be used to obtain a var handle that can be
 * used to get/set values represented by the given value layout on a memory segment at
 * the given offset:
 *
 * {@snippet lang=java:
 * VarHandle intAtOffsetHandle = ValueLayout.JAVA_INT.varHandle(); // (MemorySegment, long)
 * int value = (int) intAtOffsetHandle.get(segment, 10L);          // segment.get(ValueLayout.JAVA_INT, 10L)
 * }
 *
 * Alternatively, a var handle that can be used to access an element of an {@code int}
 * array at a given logical index can be created as follows:
 *
 * {@snippet lang=java:
 * VarHandle intAtOffsetAndIndexHandle =
 *         ValueLayout.JAVA_INT.arrayElementVarHandle();             // (MemorySegment, long, long)
 * int value = (int) intAtOffsetAndIndexHandle.get(segment, 2L, 3L); // segment.get(ValueLayout.JAVA_INT, 2L + (3L * 4L))
 * }
 *
 * <p>
 * Clients can also drop the base offset parameter, in order to make the access
 * expression simpler. This can be used to implement access operations such as
 * {@link #getAtIndex(ValueLayout.OfInt, long)}:
 *
 * {@snippet lang=java:
 * VarHandle intAtIndexHandle =
 *         MethodHandles.insertCoordinates(intAtOffsetAndIndexHandle, 1, 0L); // (MemorySegment, long)
 * int value = (int) intAtIndexHandle.get(segment, 3L);                       // segment.getAtIndex(ValueLayout.JAVA_INT, 3L);
 * }
 *
 * Var handles for more complex access expressions (e.g. struct field access, pointer
 * dereference) can be created directly from memory layouts, using
 * <a href="MemoryLayout.html#layout-paths"><em>layout paths</em></a>.
 *
 * <h2 id="slicing">Slicing memory segments</h2>
 *
 * Memory segments support {@linkplain MemorySegment#asSlice(long, long) slicing}.
 * Slicing a memory segment returns a new memory segment that is backed by the same
 * region of memory as the original. The address of the sliced segment is derived from
 * the address of the original segment, by adding an offset (expressed in bytes). The
 * size of the sliced segment is either derived implicitly (by subtracting the specified
 * offset from the size of the original segment), or provided explicitly. In other words,
 * a sliced segment has <em>stricter</em> spatial bounds than those of the original
 * segment:
 * {@snippet lang = java:
 * Arena arena = ...
 * MemorySegment segment = arena.allocate(100);
 * MemorySegment slice = segment.asSlice(50, 10);
 * slice.get(ValueLayout.JAVA_INT, 20); // Out of bounds!
 * arena.close();
 * slice.get(ValueLayout.JAVA_INT, 0); // Already closed!
 *}
 * The above code creates a native segment that is 100 bytes long; then, it creates a
 * slice that starts at offset 50 of {@code segment}, and is 10 bytes long. That is, the
 * address of the {@code slice} is {@code segment.address() + 50}, and its size is 10.
 * As a result, attempting to read an int value at offset 20 of the {@code slice} segment
 * will result in an exception. The {@linkplain Arena temporal bounds} of the original
 * segment is inherited by its slices; that is, when the scope associated with
 * {@code segment} is no longer {@linkplain Scope#isAlive() alive}, {@code slice} will
 * also become inaccessible.
 * <p>
 * A client might obtain a {@link Stream} from a segment, which can then be used to slice
 * the segment (according to a given element layout) and even allow multiple threads to
 * work in parallel on disjoint segment slices (to do this, the segment has to be
 * {@linkplain MemorySegment#isAccessibleBy(Thread) accessible} from multiple threads).
 * The following code can be used to sum all int values in a memory segment in parallel:
 *
 * {@snippet lang = java:
 * try (Arena arena = Arena.ofShared()) {
 *     SequenceLayout SEQUENCE_LAYOUT = MemoryLayout.sequenceLayout(1024, ValueLayout.JAVA_INT);
 *     MemorySegment segment = arena.allocate(SEQUENCE_LAYOUT);
 *     int sum = segment.elements(ValueLayout.JAVA_INT).parallel()
 *                      .mapToInt(s -> s.get(ValueLayout.JAVA_INT, 0))
 *                      .sum();
 * }
 *}
 *
 * <h2 id="segment-alignment">Alignment</h2>
 *
 * Access operations on a memory segment are constrained not only by the spatial and
 * temporal bounds of the segment, but also by the <em>alignment constraint</em> of the
 * value layout specified to the operation. An access operation can access only those
 * offsets in the segment that denote addresses in physical memory that are
 * <em>aligned</em> according to the layout. An address in physical memory is
 * <em>aligned</em> according to a layout if the address is an integer multiple of
 * the layout's alignment constraint. For example, the address 1000 is aligned according
 * to an 8-byte alignment constraint (because 1000 is an integer multiple of 8), and to
 * a 4-byte alignment constraint, and to a 2-byte alignment constraint; in contrast,
 * the address 1004 is aligned according to a 4-byte alignment constraint, and to
 * a 2-byte alignment constraint, but not to an 8-byte alignment constraint.
 * Access operations are required to respect alignment because it can impact
 * the performance of access operations, and can also determine which access operations
 * are available at a given physical address. For instance,
 * {@linkplain java.lang.invoke.VarHandle#compareAndSet(Object...) atomic access operations}
 * operations using {@link java.lang.invoke.VarHandle} are only permitted at aligned
 * addresses. In addition, alignment applies to an access operation whether the segment
 * being accessed is a native segment or a heap segment.
 * <p>
 * If the segment being accessed is a native segment, then its
 * {@linkplain #address() address} in physical memory can be combined with the offset to
 * obtain the <em>target address</em> in physical memory. The pseudo-function below
 * demonstrates this:
 *
 * {@snippet lang = java:
 * boolean isAligned(MemorySegment segment, long offset, MemoryLayout layout) {
 *   return ((segment.address() + offset) % layout.byteAlignment()) == 0;
 * }
 * }
 *
 * For example:
 * <ul>
 * <li>A native segment with address 1000 can be accessed at offsets 0, 8, 16, 24, etc
 *     under an 8-byte alignment constraint, because the target addresses
 *     (1000, 1008, 1016, 1024) are 8-byte aligned.
 *     Access at offsets 1-7 or 9-15 or 17-23 is disallowed because the target addresses
 *     would not be 8-byte aligned.</li>
 * <li>A native segment with address 1000 can be accessed at offsets 0, 4, 8, 12, etc
 *     under a 4-byte alignment constraint, because the target addresses
 *     (1000, 1004, 1008, 1012) are 4-byte aligned.
 *     Access at offsets 1-3 or 5-7 or 9-11 is disallowed because the target addresses
 *     would not be 4-byte aligned.</li>
 * <li>A native segment with address 1000 can be accessed at offsets 0, 2, 4, 6, etc
 *     under a 2-byte alignment constraint, because the target addresses
 *     (1000, 1002, 1004, 1006) are 2-byte aligned.
 *     Access at offsets 1 or 3 or 5 is disallowed because the target addresses would
 *     not be 2-byte aligned.</li>
 * <li>A native segment with address 1004 can be accessed at offsets 0, 4, 8, 12, etc
 *     under a 4-byte alignment constraint, and at offsets 0, 2, 4, 6, etc
 *     under a 2-byte alignment constraint. Under an 8-byte alignment constraint,
 *     it can be accessed at offsets 4, 12, 20, 28, etc.</li>
 * <li>A native segment with address 1006 can be accessed at offsets 0, 2, 4, 6, etc
 *     under a 2-byte alignment constraint.
 *     Under a 4-byte alignment constraint, it can be accessed at offsets 2, 6, 10, 14, etc.
 *     Under an 8-byte alignment constraint, it can be accessed at offsets 2, 10, 18, 26, etc.
 * <li>A native segment with address 1007 can be accessed at offsets 0, 1, 2, 3, etc
 *     under a 1-byte alignment constraint.
 *     Under a 2-byte alignment constraint, it can be accessed at offsets 1, 3, 5, 7, etc.
 *     Under a 4-byte alignment constraint, it can be accessed at offsets 1, 5, 9, 13, etc.
 *     Under an 8-byte alignment constraint, it can be accessed at offsets 1, 9, 17, 25, etc.</li>
 * </ul>
 * <p>
 * The alignment constraint used to access a segment is typically dictated by the shape
 * of the data structure stored in the segment. For example, if the programmer wishes to
 * store a sequence of 8-byte values in a native segment, then the segment should be
 * allocated by specifying an 8-byte alignment constraint, either via
 * {@link Arena#allocate(long, long)} or {@link Arena#allocate(MemoryLayout)}. These
 * factories ensure that the off-heap region of memory backing the returned segment
 * has a starting address that is 8-byte aligned. Subsequently, the programmer can access
 * the segment at the offsets of interest -- 0, 8, 16, 24, etc -- in the knowledge that
 * every such access is aligned.
 * <p>
 * If the segment being accessed is a heap segment, then determining whether access is
 * aligned is more complex. The address of the segment in physical memory is not known
 * and is not even fixed (it may change when the segment is relocated during garbage
 * collection). This means that the address cannot be combined with the specified offset
 * to determine a target address in physical memory. Since the alignment constraint
 * <em>always</em> refers to alignment of addresses in physical memory, it is not
 * possible in principle to determine if any offset in a heap segment is aligned.
 * For example, suppose the programmer chooses an 8-byte alignment constraint and tries
 * to access offset 16 in a heap segment. If the heap segment's address 0 corresponds to
 * physical address 1000, then the target address (1016) would be aligned, but if
 * address 0 corresponds to physical address 1004, then the target address (1020) would
 * not be aligned. It is undesirable to allow access to target addresses that are
 * aligned according to the programmer's chosen alignment constraint, but might not be
 * predictably aligned in physical memory (e.g. because of platform considerations
 * and/or garbage collection behavior).
 * <p>
 * In practice, the Java runtime lays out arrays in memory so that each n-byte element
 * occurs at an n-byte aligned physical address. The
 * runtime preserves this invariant even if the array is relocated during garbage
 * collection. Access operations rely on this invariant to determine if the specified
 * offset in a heap segment refers to an aligned address in physical memory.
 * For example:
 * <ul>
 * <li>The starting physical address of a {@code short[]} array will be 2-byte aligned
 *     (e.g. 1006) so that successive short elements occur at 2-byte aligned addresses
 *     (e.g. 1006, 1008, 1010, 1012, etc). A heap segment backed by a {@code short[]}
 *     array can be accessed at offsets 0, 2, 4, 6, etc under a 2-byte alignment
 *     constraint. The segment cannot be accessed at <em>any</em> offset under a 4-byte
 *     alignment constraint, because there is no guarantee that the target address would
 *     be 4-byte aligned, e.g., offset 0 would correspond to physical address 1006 while
 *     offset 1 would correspond to physical address 1007. Similarly, the segment cannot
 *     be accessed at any offset under an 8-byte alignment constraint, because there is
 *     no guarantee that the target address would be 8-byte aligned, e.g., offset 2
 *     would correspond to physical address 1008 but offset 4 would correspond to
 *     physical address 1010.</li>
 * <li>The starting physical address of a {@code long[]} array will be 8-byte aligned
 *     (e.g. 1000), so that successive long elements occur at 8-byte aligned addresses
 *     (e.g., 1000, 1008, 1016, 1024, etc.) A heap segment backed by a {@code long[]}
 *     array can be accessed at offsets 0, 8, 16, 24, etc under an 8-byte alignment
 *     constraint. In addition, the segment can be accessed at offsets 0, 4, 8, 12,
 *     etc under a 4-byte alignment constraint, because the target addresses (1000, 1004,
 *     1008, 1012) are 4-byte aligned. And, the segment can be accessed at offsets 0, 2,
 *     4, 6, etc under a 2-byte alignment constraint, because the target addresses (e.g.
 *     1000, 1002, 1004, 1006) are 2-byte aligned.</li>
 * </ul>
 * <p>
 * In other words, heap segments feature a <em>maximum</em>
 * alignment which is derived from the size of the elements of the Java array backing the
 * segment, as shown in the following table:
 *
 * <blockquote><table class="plain">
 * <caption style="display:none">Maximum alignment of heap segments</caption>
 * <thead>
 * <tr>
 *     <th scope="col">Array type (of backing region)</th>
 *     <th scope="col">Maximum supported alignment (in bytes)</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr><th scope="row" style="font-weight:normal">{@code boolean[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_BOOLEAN.byteAlignment()}</td></tr>
 * <tr><th scope="row" style="font-weight:normal">{@code byte[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_BYTE.byteAlignment()}</td></tr>
 * <tr><th scope="row" style="font-weight:normal">{@code char[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_CHAR.byteAlignment()}</td></tr>
 * <tr><th scope="row" style="font-weight:normal">{@code short[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_SHORT.byteAlignment()}</td></tr>
 * <tr><th scope="row" style="font-weight:normal">{@code int[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_INT.byteAlignment()}</td></tr>
 * <tr><th scope="row" style="font-weight:normal">{@code float[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_FLOAT.byteAlignment()}</td></tr>
 * <tr><th scope="row" style="font-weight:normal">{@code long[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_LONG.byteAlignment()}</td></tr>
 * <tr><th scope="row" style="font-weight:normal">{@code double[]}</th>
 *     <td style="text-align:center;">{@code ValueLayout.JAVA_DOUBLE.byteAlignment()}</td></tr>
 * </tbody>
 * </table></blockquote>
 *
 * Heap segments can only be accessed using a layout whose alignment is smaller or equal
 * to the maximum alignment associated with the heap segment. Attempting to access a
 * heap segment using a layout whose alignment is greater than the maximum alignment
 * associated with the heap segment will fail, as demonstrated in the following example:
 *
 * {@snippet lang=java :
 * MemorySegment byteSegment = MemorySegment.ofArray(new byte[10]);
 * byteSegment.get(ValueLayout.JAVA_INT, 0); // fails: ValueLayout.JAVA_INT.byteAlignment() > ValueLayout.JAVA_BYTE.byteAlignment()
 * }
 *
 * In such circumstances, clients have two options. They can use a heap segment backed
 * by a different array type (e.g. {@code long[]}), capable of supporting greater maximum
 * alignment. More specifically, the maximum alignment associated with {@code long[]} is
 * set to {@code ValueLayout.JAVA_LONG.byteAlignment()}, which is 8 bytes:
 *
 * {@snippet lang=java :
 * MemorySegment longSegment = MemorySegment.ofArray(new long[10]);
 * longSegment.get(ValueLayout.JAVA_INT, 0); // ok: ValueLayout.JAVA_INT.byteAlignment() <= ValueLayout.JAVA_LONG.byteAlignment()
 * }
 *
 * Alternatively, they can invoke the access operation with an <em>unaligned layout</em>.
 * All unaligned layout constants (e.g. {@link ValueLayout#JAVA_INT_UNALIGNED}) have
 * their alignment constraint set to 1:
 * {@snippet lang=java :
 * MemorySegment byteSegment = MemorySegment.ofArray(new byte[10]);
 * byteSegment.get(ValueLayout.JAVA_INT_UNALIGNED, 0); // ok: ValueLayout.JAVA_INT_UNALIGNED.byteAlignment() == ValueLayout.JAVA_BYTE.byteAlignment()
 * }
 *
 * Clients can use the {@linkplain MemorySegment#maxByteAlignment()} method to check if
 * a memory segment supports the alignment constraint of a memory layout, as follows:
 * {@snippet lang=java:
 * MemoryLayout layout = ...
 * MemorySegment segment = ...
 * boolean isAligned = segment.maxByteAlignment() >= layout.byteAlignment();
 * }
 *
 * <h2 id="wrapping-addresses">Zero-length memory segments</h2>
 *
 * When interacting with <a href="package-summary.html#ffa">foreign functions</a>, it is
 * common for those functions to allocate a region of memory and return a pointer to that
 * region. Modeling the region of memory with a memory segment is challenging because
 * the Java runtime has no insight into the size of the region. Only the address of the
 * start of the region, stored in the pointer, is available. For example, a C function
 * with return type {@code char*} might return a pointer to a region containing a single
 * {@code char} value, or to a region containing an array of {@code char} values, where
 * the size of the array might be provided in a separate parameter. The size of the
 * array is not readily apparent to the code calling the foreign function and hoping to
 * use its result. In addition to having no insight into the size of the region of
 * memory backing a pointer returned from a foreign function, it also has no insight
 * into the lifetime intended for said region of memory by the foreign function that
 * allocated it.
 * <p>
 * The {@code MemorySegment} API uses <em>zero-length memory segments</em> to represent:
 * <ul>
 *     <li>pointers <a href="Linker.html#by-ref">returned from a foreign function</a>;</li>
 *     <li>pointers <a href="Linker.html#function-pointers">passed by a foreign function
 *         to an upcall stub</a>; and</li>
 *     <li>pointers read from a memory segment (more on that below).</li>
 * </ul>
 * The address of the zero-length segment is the address stored in the pointer.
 * The spatial and temporal bounds of the zero-length segment are as follows:
 * <ul>
 *     <li>The size of the segment is zero. Any attempt to access these segments will
 *     fail with {@link IndexOutOfBoundsException}. This is a crucial safety feature: as
 *     these segments are associated with a region of memory whose size is not known, any
 *     access operations involving these segments cannot be validated. In effect, a
 *     zero-length memory segment <em>wraps</em> an address, and it cannot be used
 *     without explicit intent (see below);</li>
 *     <li>The segment is associated with the global scope. Thus, while zero-length
 *     memory segments cannot be accessed directly, they can be passed, opaquely, to
 *     other pointer-accepting foreign functions.</li>
 * </ul>
 * <p>
 * To demonstrate how clients can work with zero-length memory segments, consider the
 * case of a client that wants to read a pointer from some memory segment. This can be
 * done via the {@linkplain MemorySegment#get(AddressLayout, long)} access method. This
 * method accepts an {@linkplain AddressLayout address layout}
 * (e.g. {@link ValueLayout#ADDRESS}), the layout of the pointer to be read. For instance,
 * on a 64-bit platform, the size of an address layout is 8 bytes. The access operation
 * also accepts an offset, expressed in bytes, which indicates the position (relative to
 * the start of the memory segment) at which the pointer is stored. The access operation
 * returns a zero-length native memory segment, backed by a region
 * of memory whose starting address is the 64-bit value read at the specified offset.
 * <p>
 * The returned zero-length memory segment cannot be accessed directly by the client:
 * since the size of the segment is zero, any access operation would result in
 * out-of-bounds access. Instead, the client must, <em>unsafely</em>, assign new spatial
 * bounds to the zero-length memory segment. This can be done via the
 * {@link #reinterpret(long)} method, as follows:
 *
 * {@snippet lang = java:
 * MemorySegment z = segment.get(ValueLayout.ADDRESS, ...);   // size = 0
 * MemorySegment ptr = z.reinterpret(16);                     // size = 16
 * int x = ptr.getAtIndex(ValueLayout.JAVA_INT, 3);           // ok
 *}
 * <p>
 * In some cases, the client might additionally want to assign new temporal bounds to a
 * zero-length memory segment. This can be done via the
 * {@link #reinterpret(long, Arena, Consumer)} method, which returns a new native segment
 * with the desired size and the same temporal bounds as those of the provided arena:
 *
 * {@snippet lang = java:
 * MemorySegment ptr = null;
 * try (Arena arena = Arena.ofConfined()) {
 *       MemorySegment z = segment.get(ValueLayout.ADDRESS, ...);    // size = 0, scope = always alive
 *       ptr = z.reinterpret(16, arena, null);                       // size = 16, scope = arena.scope()
 *       int x = ptr.getAtIndex(ValueLayout.JAVA_INT, 3);            // ok
 * }
 * int x = ptr.getAtIndex(ValueLayout.JAVA_INT, 3);                  // throws IllegalStateException
 *}
 *
 * Alternatively, if the size of the region of memory backing the zero-length memory
 * segment is known statically, the client can overlay a
 * {@linkplain AddressLayout#withTargetLayout(MemoryLayout) target layout} on the address
 * layout used when reading a pointer. The target layout is then used to dynamically
 * <em>expand</em> the size of the native memory segment returned by the access operation
 * so that the size of the segment is the same as the size of the target layout . In other
 * words, the returned segment is no longer a zero-length memory segment, and the pointer
 * it represents can be dereferenced directly:
 *
 * {@snippet lang = java:
 * AddressLayout intArrPtrLayout = ValueLayout.ADDRESS.withTargetLayout(
 *         MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT)); // layout for int (*ptr)[4]
 * MemorySegment ptr = segment.get(intArrPtrLayout, ...);         // size = 16
 * int x = ptr.getAtIndex(ValueLayout.JAVA_INT, 3);               // ok
 *}
 * <p>
 * All the methods that can be used to manipulate zero-length memory segments
 * ({@link #reinterpret(long)}, {@link #reinterpret(Arena, Consumer)}, {@link #reinterpret(long, Arena, Consumer)} and
 * {@link AddressLayout#withTargetLayout(MemoryLayout)}) are
 * <a href="{@docRoot}/java.base/java/lang/doc-files/RestrictedMethods.html#restricted"><em>restricted</em></a> methods, and should
 * be used with caution: assigning a segment incorrect spatial and/or temporal bounds
 * could result in a VM crash when attempting to access the memory segment.
 *
 * @implSpec
 * Implementations of this interface are immutable, thread-safe and
 * <a href="{@docRoot}/java.base/java/lang/doc-files/ValueBased.html">value-based</a>.
 *
 * @since 22
 * @hide
 */
public sealed interface MemorySegment permits AbstractMemorySegmentImpl {

    /**
     * {@return the address of this memory segment}
     *
     * @apiNote When using this method to pass a segment address to some external
     *          operation (e.g. a JNI function), clients must ensure that the segment is
     *          kept {@linkplain java.lang.ref##reachability reachable}
     *          for the entire duration of the operation. A failure to do so might result
     *          in the premature deallocation of the region of memory backing the memory
     *          segment, in case the segment has been allocated with an
     *          {@linkplain Arena#ofAuto() automatic arena}.
     */
    long address();

    /**
     * Returns the Java object stored in the on-heap region of memory backing this memory
     * segment, if any. For instance, if this memory segment is a heap segment created
     * with the {@link #ofArray(byte[])} factory method, this method will return the
     * {@code byte[]} object which was used to obtain the segment. This method returns
     * an empty {@code Optional} value if either this segment is a
     * {@linkplain #isNative() native} segment, or if this segment is
     * {@linkplain #isReadOnly() read-only}.
     *
     * @return the Java object associated with this memory segment, if any
     */
    Optional<Object> heapBase();

    /**
     * {@return the scope associated with this memory segment}
     */
    Scope scope();

    /**
     * {@return the size (in bytes) of this memory segment}
     */
    long byteSize();

    /**
     * Creates a zero-length native segment from the given
     * {@linkplain #address() address value}.
     * <p>
     * The returned segment is associated with the global scope and is accessible from
     * any thread.
     * <p>
     * On 32-bit platforms, the given address value will be normalized such that the
     * highest-order ("leftmost") 32 bits of the {@link MemorySegment#address() address}
     * of the returned memory segment are set to zero.
     *
     * @param address the address of the returned native segment
     * @return a zero-length native segment with the given address
     */
    static MemorySegment ofAddress(long address) {
        return SegmentFactories.makeNativeSegmentUnchecked(address, 0);
    }

    /**
     * A zero-length native segment modelling the {@code NULL} address. Equivalent to
     * {@code MemorySegment.ofAddress(0L)}.
     * <p>
     * The {@linkplain MemorySegment#maxByteAlignment() maximum byte alignment} for
     * the {@code NULL} segment is of 2<sup>62</sup>.
     */
    MemorySegment NULL = MemorySegment.ofAddress(0L);

    /**
     * Compares the specified object with this memory segment for equality. Returns
     * {@code true} if and only if the specified object is also a memory segment, and if
     * the two segments refer to the same location, in some region of memory.
     * <p>
     * More specifically, for two segments {@code s1} and {@code s2} to be considered
     * equal, all the following must be true:
     * <ul>
     *     <li>{@code s1.heapBase().equals(s2.heapBase())}, that is, the two segments
     *     must be of the same kind; either both are {@linkplain #isNative() native segments},
     *     backed by off-heap memory, or both are backed by the same on-heap
     *     {@linkplain #heapBase() Java object};
     *     <li>{@code s1.address() == s2.address()}, that is, the address of the two
     *     segments should be the same. This means that the two segments either refer to
     *     the same location in some off-heap region, or they refer to the same offset
     *     inside their associated {@linkplain #heapBase() Java object}.</li>
     * </ul>
     * @apiNote This method does not perform a structural comparison of the contents of
     *          the two memory segments. Clients can compare memory segments structurally
     *          by using the {@link #mismatch(MemorySegment)} method instead. Note that
     *          this method does <em>not</em> compare the temporal and spatial bounds of
     *          two segments. As such, it is suitable to check whether two segments have
     *          the same address.
     *
     * @param that the object to be compared for equality with this memory segment
     * @return {@code true} if the specified object is equal to this memory segment
     * @see #mismatch(MemorySegment)
     */
    @Override
    boolean equals(Object that);

    /**
     * {@return the hash code value for this memory segment}
     */
    @Override
    int hashCode();

    /*sealed*/ interface Scope /*permits MemorySessionImpl*/ {

        /**
         * {@return {@code true}, if the regions of memory backing the memory segments
         * associated with this scope are still valid}
         */
        boolean isAlive();
    }
}
