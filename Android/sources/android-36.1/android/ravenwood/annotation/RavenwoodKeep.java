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
package android.ravenwood.annotation;

import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Denotes that the annotated method is supported on Ravenwood, and the implementation
 * is kept as-is.
 * <p>
 * Implementation included in the annotated method will not be processed and
 * will be kept as-is on Ravenwood, just like it does on a real device.
 *
 * @hide
 */
@Target({FIELD, METHOD, CONSTRUCTOR})
@Retention(RetentionPolicy.CLASS)
public @interface RavenwoodKeep {
    /** Optional, human-readable comment */
    String comment() default "";
}
