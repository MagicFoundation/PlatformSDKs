/*===---- arm_sme.h - ARM SME intrinsics -----------------------------------===
 *
 *
 * Part of the LLVM Project, under the Apache License v2.0 with LLVM Exceptions.
 * See https://llvm.org/LICENSE.txt for license information.
 * SPDX-License-Identifier: Apache-2.0 WITH LLVM-exception
 *
 *===-----------------------------------------------------------------------===
 */

#ifndef __ARM_SME_H
#define __ARM_SME_H

#if !defined(__ARM_FEATURE_SME)
#error "SME support not enabled"
#else

#if !defined(__LITTLE_ENDIAN__)
#error "Big endian is currently not supported for arm_sme.h"
#endif
#include <stdint.h>

#include <stddef.h>

#ifdef  __cplusplus
extern "C" {
#else
#include <stdbool.h>
#endif

#include "arm_sve.h"

/* Function attributes */
#define __ai static __inline__ __attribute__((__always_inline__, __nodebug__))

#define __aio static __inline__ __attribute__((__always_inline__, __nodebug__, __overloadable__))

#define __as __attribute__((arm_streaming))

#define __asc __attribute__((arm_streaming_compatible))

#define __asza __attribute__((arm_shared_za))

#define __apza __attribute__((arm_preserves_za))

__asc void __arm_disable_za(void);
__ai __asc __asza void svundef_za(void) { }

__ai __asc
__attribute__((__clang_arm_builtin_alias(__builtin_sme___arm_in_streaming_mode)))
bool __arm_in_streaming_mode(void);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddha_za32_u32)))
void svaddha_za32_u32(uint64_t, svbool_t, svbool_t, svuint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddha_za32_s32)))
void svaddha_za32_s32(uint64_t, svbool_t, svbool_t, svint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddva_za32_u32)))
void svaddva_za32_u32(uint64_t, svbool_t, svbool_t, svuint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddva_za32_s32)))
void svaddva_za32_s32(uint64_t, svbool_t, svbool_t, svint32_t);
__ai __asc __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svcntsb)))
uint64_t svcntsb(void);
__ai __asc __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svcntsd)))
uint64_t svcntsd(void);
__ai __asc __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svcntsh)))
uint64_t svcntsh(void);
__ai __asc __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svcntsw)))
uint64_t svcntsw(void);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_vnum_za128)))
void svld1_hor_vnum_za128(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_vnum_za16)))
void svld1_hor_vnum_za16(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_vnum_za32)))
void svld1_hor_vnum_za32(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_vnum_za64)))
void svld1_hor_vnum_za64(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_vnum_za8)))
void svld1_hor_vnum_za8(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_za128)))
void svld1_hor_za128(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_za16)))
void svld1_hor_za16(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_za32)))
void svld1_hor_za32(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_za64)))
void svld1_hor_za64(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_hor_za8)))
void svld1_hor_za8(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_vnum_za128)))
void svld1_ver_vnum_za128(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_vnum_za16)))
void svld1_ver_vnum_za16(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_vnum_za32)))
void svld1_ver_vnum_za32(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_vnum_za64)))
void svld1_ver_vnum_za64(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_vnum_za8)))
void svld1_ver_vnum_za8(uint64_t, uint32_t, uint64_t, svbool_t, void const *, int64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_za128)))
void svld1_ver_za128(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_za16)))
void svld1_ver_za16(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_za32)))
void svld1_ver_za32(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_za64)))
void svld1_ver_za64(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svld1_ver_za8)))
void svld1_ver_za8(uint64_t, uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svldr_vnum_za)))
void svldr_vnum_za(uint32_t, uint64_t, svbool_t, void const *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za32_bf16)))
void svmopa_za32_bf16(uint64_t, svbool_t, svbool_t, svbfloat16_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za32_f16)))
void svmopa_za32_f16(uint64_t, svbool_t, svbool_t, svfloat16_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za32_s8)))
void svmopa_za32_s8(uint64_t, svbool_t, svbool_t, svint8_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za32_u8)))
void svmopa_za32_u8(uint64_t, svbool_t, svbool_t, svuint8_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za32_f32)))
void svmopa_za32_f32(uint64_t, svbool_t, svbool_t, svfloat32_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za32_bf16)))
void svmops_za32_bf16(uint64_t, svbool_t, svbool_t, svbfloat16_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za32_f16)))
void svmops_za32_f16(uint64_t, svbool_t, svbool_t, svfloat16_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za32_s8)))
void svmops_za32_s8(uint64_t, svbool_t, svbool_t, svint8_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za32_u8)))
void svmops_za32_u8(uint64_t, svbool_t, svbool_t, svuint8_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za32_f32)))
void svmops_za32_f32(uint64_t, svbool_t, svbool_t, svfloat32_t, svfloat32_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_u8_m)))
svuint8_t svread_hor_za128_u8_m(svuint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_u32_m)))
svuint32_t svread_hor_za128_u32_m(svuint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_u64_m)))
svuint64_t svread_hor_za128_u64_m(svuint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_u16_m)))
svuint16_t svread_hor_za128_u16_m(svuint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_bf16_m)))
svbfloat16_t svread_hor_za128_bf16_m(svbfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_s8_m)))
svint8_t svread_hor_za128_s8_m(svint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_f64_m)))
svfloat64_t svread_hor_za128_f64_m(svfloat64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_f32_m)))
svfloat32_t svread_hor_za128_f32_m(svfloat32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_f16_m)))
svfloat16_t svread_hor_za128_f16_m(svfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_s32_m)))
svint32_t svread_hor_za128_s32_m(svint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_s64_m)))
svint64_t svread_hor_za128_s64_m(svint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za128_s16_m)))
svint16_t svread_hor_za128_s16_m(svint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_u16_m)))
svuint16_t svread_hor_za16_u16_m(svuint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_bf16_m)))
svbfloat16_t svread_hor_za16_bf16_m(svbfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_f16_m)))
svfloat16_t svread_hor_za16_f16_m(svfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_s16_m)))
svint16_t svread_hor_za16_s16_m(svint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_u32_m)))
svuint32_t svread_hor_za32_u32_m(svuint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_f32_m)))
svfloat32_t svread_hor_za32_f32_m(svfloat32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_s32_m)))
svint32_t svread_hor_za32_s32_m(svint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_u64_m)))
svuint64_t svread_hor_za64_u64_m(svuint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_f64_m)))
svfloat64_t svread_hor_za64_f64_m(svfloat64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_s64_m)))
svint64_t svread_hor_za64_s64_m(svint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za8_u8_m)))
svuint8_t svread_hor_za8_u8_m(svuint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za8_s8_m)))
svint8_t svread_hor_za8_s8_m(svint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_u8_m)))
svuint8_t svread_ver_za128_u8_m(svuint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_u32_m)))
svuint32_t svread_ver_za128_u32_m(svuint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_u64_m)))
svuint64_t svread_ver_za128_u64_m(svuint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_u16_m)))
svuint16_t svread_ver_za128_u16_m(svuint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_bf16_m)))
svbfloat16_t svread_ver_za128_bf16_m(svbfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_s8_m)))
svint8_t svread_ver_za128_s8_m(svint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_f64_m)))
svfloat64_t svread_ver_za128_f64_m(svfloat64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_f32_m)))
svfloat32_t svread_ver_za128_f32_m(svfloat32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_f16_m)))
svfloat16_t svread_ver_za128_f16_m(svfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_s32_m)))
svint32_t svread_ver_za128_s32_m(svint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_s64_m)))
svint64_t svread_ver_za128_s64_m(svint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za128_s16_m)))
svint16_t svread_ver_za128_s16_m(svint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_u16_m)))
svuint16_t svread_ver_za16_u16_m(svuint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_bf16_m)))
svbfloat16_t svread_ver_za16_bf16_m(svbfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_f16_m)))
svfloat16_t svread_ver_za16_f16_m(svfloat16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_s16_m)))
svint16_t svread_ver_za16_s16_m(svint16_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_u32_m)))
svuint32_t svread_ver_za32_u32_m(svuint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_f32_m)))
svfloat32_t svread_ver_za32_f32_m(svfloat32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_s32_m)))
svint32_t svread_ver_za32_s32_m(svint32_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_u64_m)))
svuint64_t svread_ver_za64_u64_m(svuint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_f64_m)))
svfloat64_t svread_ver_za64_f64_m(svfloat64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_s64_m)))
svint64_t svread_ver_za64_s64_m(svint64_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za8_u8_m)))
svuint8_t svread_ver_za8_u8_m(svuint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za8_s8_m)))
svint8_t svread_ver_za8_s8_m(svint8_t, svbool_t, uint64_t, uint32_t, uint64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_vnum_za128)))
void svst1_hor_vnum_za128(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_vnum_za16)))
void svst1_hor_vnum_za16(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_vnum_za32)))
void svst1_hor_vnum_za32(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_vnum_za64)))
void svst1_hor_vnum_za64(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_vnum_za8)))
void svst1_hor_vnum_za8(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_za128)))
void svst1_hor_za128(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_za16)))
void svst1_hor_za16(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_za32)))
void svst1_hor_za32(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_za64)))
void svst1_hor_za64(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_hor_za8)))
void svst1_hor_za8(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_vnum_za128)))
void svst1_ver_vnum_za128(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_vnum_za16)))
void svst1_ver_vnum_za16(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_vnum_za32)))
void svst1_ver_vnum_za32(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_vnum_za64)))
void svst1_ver_vnum_za64(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_vnum_za8)))
void svst1_ver_vnum_za8(uint64_t, uint32_t, uint64_t, svbool_t, void *, int64_t);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_za128)))
void svst1_ver_za128(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_za16)))
void svst1_ver_za16(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_za32)))
void svst1_ver_za32(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_za64)))
void svst1_ver_za64(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svst1_ver_za8)))
void svst1_ver_za8(uint64_t, uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza __apza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svstr_vnum_za)))
void svstr_vnum_za(uint32_t, uint64_t, svbool_t, void *);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svsumopa_za32_s8)))
void svsumopa_za32_s8(uint64_t, svbool_t, svbool_t, svint8_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svsumops_za32_s8)))
void svsumops_za32_s8(uint64_t, svbool_t, svbool_t, svint8_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svusmopa_za32_u8)))
void svusmopa_za32_u8(uint64_t, svbool_t, svbool_t, svuint8_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svusmops_za32_u8)))
void svusmops_za32_u8(uint64_t, svbool_t, svbool_t, svuint8_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_u8_m)))
void svwrite_hor_za128_u8_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_u32_m)))
void svwrite_hor_za128_u32_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_u64_m)))
void svwrite_hor_za128_u64_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_u16_m)))
void svwrite_hor_za128_u16_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_bf16_m)))
void svwrite_hor_za128_bf16_m(uint64_t, uint32_t, uint64_t, svbool_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_s8_m)))
void svwrite_hor_za128_s8_m(uint64_t, uint32_t, uint64_t, svbool_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_f64_m)))
void svwrite_hor_za128_f64_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_f32_m)))
void svwrite_hor_za128_f32_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_f16_m)))
void svwrite_hor_za128_f16_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_s32_m)))
void svwrite_hor_za128_s32_m(uint64_t, uint32_t, uint64_t, svbool_t, svint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_s64_m)))
void svwrite_hor_za128_s64_m(uint64_t, uint32_t, uint64_t, svbool_t, svint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za128_s16_m)))
void svwrite_hor_za128_s16_m(uint64_t, uint32_t, uint64_t, svbool_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_u16_m)))
void svwrite_hor_za16_u16_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_bf16_m)))
void svwrite_hor_za16_bf16_m(uint64_t, uint32_t, uint64_t, svbool_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_f16_m)))
void svwrite_hor_za16_f16_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_s16_m)))
void svwrite_hor_za16_s16_m(uint64_t, uint32_t, uint64_t, svbool_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_u32_m)))
void svwrite_hor_za32_u32_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_f32_m)))
void svwrite_hor_za32_f32_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_s32_m)))
void svwrite_hor_za32_s32_m(uint64_t, uint32_t, uint64_t, svbool_t, svint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_u64_m)))
void svwrite_hor_za64_u64_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_f64_m)))
void svwrite_hor_za64_f64_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_s64_m)))
void svwrite_hor_za64_s64_m(uint64_t, uint32_t, uint64_t, svbool_t, svint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_u8_m)))
void svwrite_hor_za8_u8_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_s8_m)))
void svwrite_hor_za8_s8_m(uint64_t, uint32_t, uint64_t, svbool_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_u8_m)))
void svwrite_ver_za128_u8_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_u32_m)))
void svwrite_ver_za128_u32_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_u64_m)))
void svwrite_ver_za128_u64_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_u16_m)))
void svwrite_ver_za128_u16_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_bf16_m)))
void svwrite_ver_za128_bf16_m(uint64_t, uint32_t, uint64_t, svbool_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_s8_m)))
void svwrite_ver_za128_s8_m(uint64_t, uint32_t, uint64_t, svbool_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_f64_m)))
void svwrite_ver_za128_f64_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_f32_m)))
void svwrite_ver_za128_f32_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_f16_m)))
void svwrite_ver_za128_f16_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_s32_m)))
void svwrite_ver_za128_s32_m(uint64_t, uint32_t, uint64_t, svbool_t, svint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_s64_m)))
void svwrite_ver_za128_s64_m(uint64_t, uint32_t, uint64_t, svbool_t, svint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za128_s16_m)))
void svwrite_ver_za128_s16_m(uint64_t, uint32_t, uint64_t, svbool_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_u16_m)))
void svwrite_ver_za16_u16_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_bf16_m)))
void svwrite_ver_za16_bf16_m(uint64_t, uint32_t, uint64_t, svbool_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_f16_m)))
void svwrite_ver_za16_f16_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_s16_m)))
void svwrite_ver_za16_s16_m(uint64_t, uint32_t, uint64_t, svbool_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_u32_m)))
void svwrite_ver_za32_u32_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_f32_m)))
void svwrite_ver_za32_f32_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_s32_m)))
void svwrite_ver_za32_s32_m(uint64_t, uint32_t, uint64_t, svbool_t, svint32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_u64_m)))
void svwrite_ver_za64_u64_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_f64_m)))
void svwrite_ver_za64_f64_m(uint64_t, uint32_t, uint64_t, svbool_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_s64_m)))
void svwrite_ver_za64_s64_m(uint64_t, uint32_t, uint64_t, svbool_t, svint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_u8_m)))
void svwrite_ver_za8_u8_m(uint64_t, uint32_t, uint64_t, svbool_t, svuint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_s8_m)))
void svwrite_ver_za8_s8_m(uint64_t, uint32_t, uint64_t, svbool_t, svint8_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svzero_mask_za)))
void svzero_mask_za(uint64_t);

#if defined(__ARM_FEATURE_SME2)
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za32_f32_vg1x2)))
void svmla_single_za32_f32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za32_f32_vg1x4)))
void svmla_single_za32_f32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za32_f32_vg1x2)))
void svmla_lane_za32_f32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za32_f32_vg1x4)))
void svmla_lane_za32_f32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za32_f32_vg1x2)))
void svmla_za32_f32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za32_f32_vg1x4)))
void svmla_za32_f32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_bf16_vg2x1)))
void svmlal_lane_za32_bf16_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_f16_vg2x1)))
void svmlal_lane_za32_f16_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_s16_vg2x1)))
void svmlal_lane_za32_s16_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_u16_vg2x1)))
void svmlal_lane_za32_u16_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_bf16_vg2x2)))
void svmlal_lane_za32_bf16_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_f16_vg2x2)))
void svmlal_lane_za32_f16_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_s16_vg2x2)))
void svmlal_lane_za32_s16_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_u16_vg2x2)))
void svmlal_lane_za32_u16_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_bf16_vg2x4)))
void svmlal_lane_za32_bf16_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_f16_vg2x4)))
void svmlal_lane_za32_f16_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_s16_vg2x4)))
void svmlal_lane_za32_s16_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_u16_vg2x4)))
void svmlal_lane_za32_u16_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_bf16_vg2x1)))
void svmlal_single_za32_bf16_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_f16_vg2x1)))
void svmlal_single_za32_f16_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_s16_vg2x1)))
void svmlal_single_za32_s16_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_u16_vg2x1)))
void svmlal_single_za32_u16_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_bf16_vg2x2)))
void svmlal_single_za32_bf16_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_f16_vg2x2)))
void svmlal_single_za32_f16_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_s16_vg2x2)))
void svmlal_single_za32_s16_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_u16_vg2x2)))
void svmlal_single_za32_u16_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_bf16_vg2x4)))
void svmlal_single_za32_bf16_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_f16_vg2x4)))
void svmlal_single_za32_f16_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_s16_vg2x4)))
void svmlal_single_za32_s16_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_u16_vg2x4)))
void svmlal_single_za32_u16_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_bf16_vg2x2)))
void svmlal_za32_bf16_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_f16_vg2x2)))
void svmlal_za32_f16_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_s16_vg2x2)))
void svmlal_za32_s16_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_u16_vg2x2)))
void svmlal_za32_u16_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_bf16_vg2x4)))
void svmlal_za32_bf16_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_f16_vg2x4)))
void svmlal_za32_f16_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_s16_vg2x4)))
void svmlal_za32_s16_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_u16_vg2x4)))
void svmlal_za32_u16_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za32_f32_vg1x2)))
void svmls_single_za32_f32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za32_f32_vg1x4)))
void svmls_single_za32_f32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za32_f32_vg1x2)))
void svmls_lane_za32_f32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za32_f32_vg1x4)))
void svmls_lane_za32_f32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za32_f32_vg1x2)))
void svmls_za32_f32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za32_f32_vg1x4)))
void svmls_za32_f32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_bf16_vg2x1)))
void svmlsl_lane_za32_bf16_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_f16_vg2x1)))
void svmlsl_lane_za32_f16_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_s16_vg2x1)))
void svmlsl_lane_za32_s16_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_u16_vg2x1)))
void svmlsl_lane_za32_u16_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_bf16_vg2x2)))
void svmlsl_lane_za32_bf16_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_f16_vg2x2)))
void svmlsl_lane_za32_f16_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_s16_vg2x2)))
void svmlsl_lane_za32_s16_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_u16_vg2x2)))
void svmlsl_lane_za32_u16_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_bf16_vg2x4)))
void svmlsl_lane_za32_bf16_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_f16_vg2x4)))
void svmlsl_lane_za32_f16_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_s16_vg2x4)))
void svmlsl_lane_za32_s16_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_u16_vg2x4)))
void svmlsl_lane_za32_u16_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_bf16_vg2x1)))
void svmlsl_single_za32_bf16_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_f16_vg2x1)))
void svmlsl_single_za32_f16_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_s16_vg2x1)))
void svmlsl_single_za32_s16_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_u16_vg2x1)))
void svmlsl_single_za32_u16_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_bf16_vg2x2)))
void svmlsl_single_za32_bf16_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_f16_vg2x2)))
void svmlsl_single_za32_f16_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_s16_vg2x2)))
void svmlsl_single_za32_s16_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_u16_vg2x2)))
void svmlsl_single_za32_u16_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_bf16_vg2x4)))
void svmlsl_single_za32_bf16_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_f16_vg2x4)))
void svmlsl_single_za32_f16_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_s16_vg2x4)))
void svmlsl_single_za32_s16_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_u16_vg2x4)))
void svmlsl_single_za32_u16_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_bf16_vg2x2)))
void svmlsl_za32_bf16_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_f16_vg2x2)))
void svmlsl_za32_f16_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_s16_vg2x2)))
void svmlsl_za32_s16_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_u16_vg2x2)))
void svmlsl_za32_u16_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_bf16_vg2x4)))
void svmlsl_za32_bf16_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_f16_vg2x4)))
void svmlsl_za32_f16_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_s16_vg2x4)))
void svmlsl_za32_s16_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_u16_vg2x4)))
void svmlsl_za32_u16_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_u16_vg2)))
svuint16x2_t svread_hor_za16_u16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_bf16_vg2)))
svbfloat16x2_t svread_hor_za16_bf16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_f16_vg2)))
svfloat16x2_t svread_hor_za16_f16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_s16_vg2)))
svint16x2_t svread_hor_za16_s16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_u16_vg4)))
svuint16x4_t svread_hor_za16_u16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_bf16_vg4)))
svbfloat16x4_t svread_hor_za16_bf16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_f16_vg4)))
svfloat16x4_t svread_hor_za16_f16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za16_s16_vg4)))
svint16x4_t svread_hor_za16_s16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_u32_vg2)))
svuint32x2_t svread_hor_za32_u32_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_f32_vg2)))
svfloat32x2_t svread_hor_za32_f32_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_s32_vg2)))
svint32x2_t svread_hor_za32_s32_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_u32_vg4)))
svuint32x4_t svread_hor_za32_u32_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_f32_vg4)))
svfloat32x4_t svread_hor_za32_f32_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za32_s32_vg4)))
svint32x4_t svread_hor_za32_s32_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_u64_vg2)))
svuint64x2_t svread_hor_za64_u64_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_f64_vg2)))
svfloat64x2_t svread_hor_za64_f64_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_s64_vg2)))
svint64x2_t svread_hor_za64_s64_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_u64_vg4)))
svuint64x4_t svread_hor_za64_u64_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_f64_vg4)))
svfloat64x4_t svread_hor_za64_f64_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za64_s64_vg4)))
svint64x4_t svread_hor_za64_s64_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za8_u8_vg2)))
svuint8x2_t svread_hor_za8_u8_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za8_s8_vg2)))
svint8x2_t svread_hor_za8_s8_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za8_u8_vg4)))
svuint8x4_t svread_hor_za8_u8_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_hor_za8_s8_vg4)))
svint8x4_t svread_hor_za8_s8_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_u16_vg2)))
svuint16x2_t svread_ver_za16_u16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_bf16_vg2)))
svbfloat16x2_t svread_ver_za16_bf16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_f16_vg2)))
svfloat16x2_t svread_ver_za16_f16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_s16_vg2)))
svint16x2_t svread_ver_za16_s16_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_u16_vg4)))
svuint16x4_t svread_ver_za16_u16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_bf16_vg4)))
svbfloat16x4_t svread_ver_za16_bf16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_f16_vg4)))
svfloat16x4_t svread_ver_za16_f16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za16_s16_vg4)))
svint16x4_t svread_ver_za16_s16_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_u32_vg2)))
svuint32x2_t svread_ver_za32_u32_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_f32_vg2)))
svfloat32x2_t svread_ver_za32_f32_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_s32_vg2)))
svint32x2_t svread_ver_za32_s32_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_u32_vg4)))
svuint32x4_t svread_ver_za32_u32_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_f32_vg4)))
svfloat32x4_t svread_ver_za32_f32_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za32_s32_vg4)))
svint32x4_t svread_ver_za32_s32_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_u64_vg2)))
svuint64x2_t svread_ver_za64_u64_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_f64_vg2)))
svfloat64x2_t svread_ver_za64_f64_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_s64_vg2)))
svint64x2_t svread_ver_za64_s64_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_u64_vg4)))
svuint64x4_t svread_ver_za64_u64_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_f64_vg4)))
svfloat64x4_t svread_ver_za64_f64_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za64_s64_vg4)))
svint64x4_t svread_ver_za64_s64_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za8_u8_vg2)))
svuint8x2_t svread_ver_za8_u8_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za8_s8_vg2)))
svint8x2_t svread_ver_za8_s8_vg2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za8_u8_vg4)))
svuint8x4_t svread_ver_za8_u8_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_ver_za8_s8_vg4)))
svint8x4_t svread_ver_za8_s8_vg4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_za64_u64_vg1x2)))
svuint64x2_t svread_za64_u64_vg1x2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_za64_f64_vg1x2)))
svfloat64x2_t svread_za64_f64_vg1x2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_za64_s64_vg1x2)))
svint64x2_t svread_za64_s64_vg1x2(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_za64_u64_vg1x4)))
svuint64x4_t svread_za64_u64_vg1x4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_za64_f64_vg1x4)))
svfloat64x4_t svread_za64_f64_vg1x4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svread_za64_s64_vg1x4)))
svint64x4_t svread_za64_s64_vg1x4(uint32_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_u16_vg2)))
void svwrite_hor_za16_u16_vg2(uint32_t, uint64_t, svuint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_bf16_vg2)))
void svwrite_hor_za16_bf16_vg2(uint32_t, uint64_t, svbfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_f16_vg2)))
void svwrite_hor_za16_f16_vg2(uint32_t, uint64_t, svfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_s16_vg2)))
void svwrite_hor_za16_s16_vg2(uint32_t, uint64_t, svint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_u16_vg4)))
void svwrite_hor_za16_u16_vg4(uint32_t, uint64_t, svuint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_bf16_vg4)))
void svwrite_hor_za16_bf16_vg4(uint32_t, uint64_t, svbfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_f16_vg4)))
void svwrite_hor_za16_f16_vg4(uint32_t, uint64_t, svfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_s16_vg4)))
void svwrite_hor_za16_s16_vg4(uint32_t, uint64_t, svint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_u32_vg2)))
void svwrite_hor_za32_u32_vg2(uint32_t, uint64_t, svuint32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_f32_vg2)))
void svwrite_hor_za32_f32_vg2(uint32_t, uint64_t, svfloat32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_s32_vg2)))
void svwrite_hor_za32_s32_vg2(uint32_t, uint64_t, svint32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_u32_vg4)))
void svwrite_hor_za32_u32_vg4(uint32_t, uint64_t, svuint32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_f32_vg4)))
void svwrite_hor_za32_f32_vg4(uint32_t, uint64_t, svfloat32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_s32_vg4)))
void svwrite_hor_za32_s32_vg4(uint32_t, uint64_t, svint32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_u64_vg2)))
void svwrite_hor_za64_u64_vg2(uint32_t, uint64_t, svuint64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_f64_vg2)))
void svwrite_hor_za64_f64_vg2(uint32_t, uint64_t, svfloat64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_s64_vg2)))
void svwrite_hor_za64_s64_vg2(uint32_t, uint64_t, svint64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_u64_vg4)))
void svwrite_hor_za64_u64_vg4(uint32_t, uint64_t, svuint64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_f64_vg4)))
void svwrite_hor_za64_f64_vg4(uint32_t, uint64_t, svfloat64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_s64_vg4)))
void svwrite_hor_za64_s64_vg4(uint32_t, uint64_t, svint64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_u8_vg2)))
void svwrite_hor_za8_u8_vg2(uint32_t, uint64_t, svuint8x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_s8_vg2)))
void svwrite_hor_za8_s8_vg2(uint32_t, uint64_t, svint8x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_u8_vg4)))
void svwrite_hor_za8_u8_vg4(uint32_t, uint64_t, svuint8x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_s8_vg4)))
void svwrite_hor_za8_s8_vg4(uint32_t, uint64_t, svint8x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_u16_vg2)))
void svwrite_ver_za16_u16_vg2(uint32_t, uint64_t, svuint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_bf16_vg2)))
void svwrite_ver_za16_bf16_vg2(uint32_t, uint64_t, svbfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_f16_vg2)))
void svwrite_ver_za16_f16_vg2(uint32_t, uint64_t, svfloat16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_s16_vg2)))
void svwrite_ver_za16_s16_vg2(uint32_t, uint64_t, svint16x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_u16_vg4)))
void svwrite_ver_za16_u16_vg4(uint32_t, uint64_t, svuint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_bf16_vg4)))
void svwrite_ver_za16_bf16_vg4(uint32_t, uint64_t, svbfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_f16_vg4)))
void svwrite_ver_za16_f16_vg4(uint32_t, uint64_t, svfloat16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_s16_vg4)))
void svwrite_ver_za16_s16_vg4(uint32_t, uint64_t, svint16x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_u32_vg2)))
void svwrite_ver_za32_u32_vg2(uint32_t, uint64_t, svuint32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_f32_vg2)))
void svwrite_ver_za32_f32_vg2(uint32_t, uint64_t, svfloat32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_s32_vg2)))
void svwrite_ver_za32_s32_vg2(uint32_t, uint64_t, svint32x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_u32_vg4)))
void svwrite_ver_za32_u32_vg4(uint32_t, uint64_t, svuint32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_f32_vg4)))
void svwrite_ver_za32_f32_vg4(uint32_t, uint64_t, svfloat32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_s32_vg4)))
void svwrite_ver_za32_s32_vg4(uint32_t, uint64_t, svint32x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_u64_vg2)))
void svwrite_ver_za64_u64_vg2(uint32_t, uint64_t, svuint64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_f64_vg2)))
void svwrite_ver_za64_f64_vg2(uint32_t, uint64_t, svfloat64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_s64_vg2)))
void svwrite_ver_za64_s64_vg2(uint32_t, uint64_t, svint64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_u64_vg4)))
void svwrite_ver_za64_u64_vg4(uint32_t, uint64_t, svuint64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_f64_vg4)))
void svwrite_ver_za64_f64_vg4(uint32_t, uint64_t, svfloat64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_s64_vg4)))
void svwrite_ver_za64_s64_vg4(uint32_t, uint64_t, svint64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_u8_vg2)))
void svwrite_ver_za8_u8_vg2(uint32_t, uint64_t, svuint8x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_s8_vg2)))
void svwrite_ver_za8_s8_vg2(uint32_t, uint64_t, svint8x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_u8_vg4)))
void svwrite_ver_za8_u8_vg4(uint32_t, uint64_t, svuint8x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_s8_vg4)))
void svwrite_ver_za8_s8_vg4(uint32_t, uint64_t, svint8x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_u64_vg1x2)))
void svwrite_za64_u64_vg1x2(uint32_t, uint64_t, svuint64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_f64_vg1x2)))
void svwrite_za64_f64_vg1x2(uint32_t, uint64_t, svfloat64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_s64_vg1x2)))
void svwrite_za64_s64_vg1x2(uint32_t, uint64_t, svint64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_u64_vg1x4)))
void svwrite_za64_u64_vg1x4(uint32_t, uint64_t, svuint64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_f64_vg1x4)))
void svwrite_za64_f64_vg1x4(uint32_t, uint64_t, svfloat64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_s64_vg1x4)))
void svwrite_za64_s64_vg1x4(uint32_t, uint64_t, svint64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za32_f32_vg1x2)))
void svmla_za32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za32_f32_vg1x4)))
void svmla_za32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za32_f32_vg1x2)))
void svmla_lane_za32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za32_f32_vg1x4)))
void svmla_lane_za32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za32_f32_vg1x2)))
void svmla_za32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za32_f32_vg1x4)))
void svmla_za32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_bf16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_f16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_s16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_u16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_bf16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_f16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_s16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_u16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_bf16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_f16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_s16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_lane_za32_u16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_bf16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_f16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_s16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_u16_vg2x1)))
void svmlal_za32_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_bf16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_f16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_s16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_u16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_bf16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_f16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_s16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_single_za32_u16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_bf16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_f16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_s16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_u16_vg2x2)))
void svmlal_za32_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_bf16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_f16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_s16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlal_za32_u16_vg2x4)))
void svmlal_za32_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za32_f32_vg1x2)))
void svmls_za32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za32_f32_vg1x4)))
void svmls_za32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za32_f32_vg1x2)))
void svmls_lane_za32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za32_f32_vg1x4)))
void svmls_lane_za32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za32_f32_vg1x2)))
void svmls_za32_vg1x2(uint32_t, uint64_t, svfloat32x2_t, svfloat32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za32_f32_vg1x4)))
void svmls_za32_vg1x4(uint32_t, uint64_t, svfloat32x4_t, svfloat32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_bf16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_f16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_s16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_u16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_bf16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_f16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_s16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_u16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_bf16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_f16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_s16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_lane_za32_u16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_bf16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svbfloat16_t, svbfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_f16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svfloat16_t, svfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_s16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svint16_t, svint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_u16_vg2x1)))
void svmlsl_za32_vg2x1(uint32_t, uint64_t, svuint16_t, svuint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_bf16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_f16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_s16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_u16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_bf16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_f16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_s16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_single_za32_u16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_bf16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svbfloat16x2_t, svbfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_f16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svfloat16x2_t, svfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_s16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svint16x2_t, svint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_u16_vg2x2)))
void svmlsl_za32_vg2x2(uint32_t, uint64_t, svuint16x2_t, svuint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_bf16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svbfloat16x4_t, svbfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_f16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svfloat16x4_t, svfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_s16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svint16x4_t, svint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmlsl_za32_u16_vg2x4)))
void svmlsl_za32_vg2x4(uint32_t, uint64_t, svuint16x4_t, svuint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_u16_vg2)))
void svwrite_hor_za16_vg2(uint32_t, uint64_t, svuint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_bf16_vg2)))
void svwrite_hor_za16_vg2(uint32_t, uint64_t, svbfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_f16_vg2)))
void svwrite_hor_za16_vg2(uint32_t, uint64_t, svfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_s16_vg2)))
void svwrite_hor_za16_vg2(uint32_t, uint64_t, svint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_u16_vg4)))
void svwrite_hor_za16_vg4(uint32_t, uint64_t, svuint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_bf16_vg4)))
void svwrite_hor_za16_vg4(uint32_t, uint64_t, svbfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_f16_vg4)))
void svwrite_hor_za16_vg4(uint32_t, uint64_t, svfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za16_s16_vg4)))
void svwrite_hor_za16_vg4(uint32_t, uint64_t, svint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_u32_vg2)))
void svwrite_hor_za32_vg2(uint32_t, uint64_t, svuint32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_f32_vg2)))
void svwrite_hor_za32_vg2(uint32_t, uint64_t, svfloat32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_s32_vg2)))
void svwrite_hor_za32_vg2(uint32_t, uint64_t, svint32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_u32_vg4)))
void svwrite_hor_za32_vg4(uint32_t, uint64_t, svuint32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_f32_vg4)))
void svwrite_hor_za32_vg4(uint32_t, uint64_t, svfloat32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za32_s32_vg4)))
void svwrite_hor_za32_vg4(uint32_t, uint64_t, svint32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_u64_vg2)))
void svwrite_hor_za64_vg2(uint32_t, uint64_t, svuint64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_f64_vg2)))
void svwrite_hor_za64_vg2(uint32_t, uint64_t, svfloat64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_s64_vg2)))
void svwrite_hor_za64_vg2(uint32_t, uint64_t, svint64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_u64_vg4)))
void svwrite_hor_za64_vg4(uint32_t, uint64_t, svuint64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_f64_vg4)))
void svwrite_hor_za64_vg4(uint32_t, uint64_t, svfloat64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za64_s64_vg4)))
void svwrite_hor_za64_vg4(uint32_t, uint64_t, svint64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_u8_vg2)))
void svwrite_hor_za8_vg2(uint32_t, uint64_t, svuint8x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_s8_vg2)))
void svwrite_hor_za8_vg2(uint32_t, uint64_t, svint8x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_u8_vg4)))
void svwrite_hor_za8_vg4(uint32_t, uint64_t, svuint8x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_hor_za8_s8_vg4)))
void svwrite_hor_za8_vg4(uint32_t, uint64_t, svint8x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_u16_vg2)))
void svwrite_ver_za16_vg2(uint32_t, uint64_t, svuint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_bf16_vg2)))
void svwrite_ver_za16_vg2(uint32_t, uint64_t, svbfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_f16_vg2)))
void svwrite_ver_za16_vg2(uint32_t, uint64_t, svfloat16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_s16_vg2)))
void svwrite_ver_za16_vg2(uint32_t, uint64_t, svint16x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_u16_vg4)))
void svwrite_ver_za16_vg4(uint32_t, uint64_t, svuint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_bf16_vg4)))
void svwrite_ver_za16_vg4(uint32_t, uint64_t, svbfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_f16_vg4)))
void svwrite_ver_za16_vg4(uint32_t, uint64_t, svfloat16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za16_s16_vg4)))
void svwrite_ver_za16_vg4(uint32_t, uint64_t, svint16x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_u32_vg2)))
void svwrite_ver_za32_vg2(uint32_t, uint64_t, svuint32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_f32_vg2)))
void svwrite_ver_za32_vg2(uint32_t, uint64_t, svfloat32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_s32_vg2)))
void svwrite_ver_za32_vg2(uint32_t, uint64_t, svint32x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_u32_vg4)))
void svwrite_ver_za32_vg4(uint32_t, uint64_t, svuint32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_f32_vg4)))
void svwrite_ver_za32_vg4(uint32_t, uint64_t, svfloat32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za32_s32_vg4)))
void svwrite_ver_za32_vg4(uint32_t, uint64_t, svint32x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_u64_vg2)))
void svwrite_ver_za64_vg2(uint32_t, uint64_t, svuint64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_f64_vg2)))
void svwrite_ver_za64_vg2(uint32_t, uint64_t, svfloat64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_s64_vg2)))
void svwrite_ver_za64_vg2(uint32_t, uint64_t, svint64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_u64_vg4)))
void svwrite_ver_za64_vg4(uint32_t, uint64_t, svuint64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_f64_vg4)))
void svwrite_ver_za64_vg4(uint32_t, uint64_t, svfloat64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za64_s64_vg4)))
void svwrite_ver_za64_vg4(uint32_t, uint64_t, svint64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_u8_vg2)))
void svwrite_ver_za8_vg2(uint32_t, uint64_t, svuint8x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_s8_vg2)))
void svwrite_ver_za8_vg2(uint32_t, uint64_t, svint8x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_u8_vg4)))
void svwrite_ver_za8_vg4(uint32_t, uint64_t, svuint8x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_ver_za8_s8_vg4)))
void svwrite_ver_za8_vg4(uint32_t, uint64_t, svint8x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_u64_vg1x2)))
void svwrite_za64_vg1x2(uint32_t, uint64_t, svuint64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_f64_vg1x2)))
void svwrite_za64_vg1x2(uint32_t, uint64_t, svfloat64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_s64_vg1x2)))
void svwrite_za64_vg1x2(uint32_t, uint64_t, svint64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_u64_vg1x4)))
void svwrite_za64_vg1x4(uint32_t, uint64_t, svuint64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_f64_vg1x4)))
void svwrite_za64_vg1x4(uint32_t, uint64_t, svfloat64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svwrite_za64_s64_vg1x4)))
void svwrite_za64_vg1x4(uint32_t, uint64_t, svint64x4_t);
#endif  //defined(__ARM_FEATURE_SME2)

#if defined(__ARM_FEATURE_SME2) && defined(__ARM_FEATURE_SME_F64F64)
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za64_f64_vg1x2)))
void svmla_single_za64_f64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za64_f64_vg1x4)))
void svmla_single_za64_f64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za64_f64_vg1x2)))
void svmla_lane_za64_f64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za64_f64_vg1x4)))
void svmla_lane_za64_f64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za64_f64_vg1x2)))
void svmla_za64_f64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za64_f64_vg1x4)))
void svmla_za64_f64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64x4_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za64_f64_vg1x2)))
void svmls_single_za64_f64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za64_f64_vg1x4)))
void svmls_single_za64_f64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za64_f64_vg1x2)))
void svmls_lane_za64_f64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za64_f64_vg1x4)))
void svmls_lane_za64_f64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t, uint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za64_f64_vg1x2)))
void svmls_za64_f64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64x2_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za64_f64_vg1x4)))
void svmls_za64_f64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za64_f64_vg1x2)))
void svmla_za64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_single_za64_f64_vg1x4)))
void svmla_za64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za64_f64_vg1x2)))
void svmla_lane_za64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_lane_za64_f64_vg1x4)))
void svmla_lane_za64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za64_f64_vg1x2)))
void svmla_za64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmla_za64_f64_vg1x4)))
void svmla_za64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64x4_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za64_f64_vg1x2)))
void svmls_za64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_single_za64_f64_vg1x4)))
void svmls_za64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za64_f64_vg1x2)))
void svmls_lane_za64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_lane_za64_f64_vg1x4)))
void svmls_lane_za64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64_t, uint64_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za64_f64_vg1x2)))
void svmls_za64_vg1x2(uint32_t, uint64_t, svfloat64x2_t, svfloat64x2_t);
__aio __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmls_za64_f64_vg1x4)))
void svmls_za64_vg1x4(uint32_t, uint64_t, svfloat64x4_t, svfloat64x4_t);
#endif  //defined(__ARM_FEATURE_SME2) && defined(__ARM_FEATURE_SME_F64F64)

#if defined(__ARM_FEATURE_SME_F64F64)
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za64_f64)))
void svmopa_za64_f64(uint64_t, svbool_t, svbool_t, svfloat64_t, svfloat64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za64_f64)))
void svmops_za64_f64(uint64_t, svbool_t, svbool_t, svfloat64_t, svfloat64_t);
#endif  //defined(__ARM_FEATURE_SME_F64F64)

#if defined(__ARM_FEATURE_SME_I64I64)
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddha_za64_u64)))
void svaddha_za64_u64(uint64_t, svbool_t, svbool_t, svuint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddha_za64_s64)))
void svaddha_za64_s64(uint64_t, svbool_t, svbool_t, svint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddva_za64_u64)))
void svaddva_za64_u64(uint64_t, svbool_t, svbool_t, svuint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svaddva_za64_s64)))
void svaddva_za64_s64(uint64_t, svbool_t, svbool_t, svint64_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za64_s16)))
void svmopa_za64_s16(uint64_t, svbool_t, svbool_t, svint16_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmopa_za64_u16)))
void svmopa_za64_u16(uint64_t, svbool_t, svbool_t, svuint16_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za64_s16)))
void svmops_za64_s16(uint64_t, svbool_t, svbool_t, svint16_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svmops_za64_u16)))
void svmops_za64_u16(uint64_t, svbool_t, svbool_t, svuint16_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svsumopa_za64_s16)))
void svsumopa_za64_s16(uint64_t, svbool_t, svbool_t, svint16_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svsumops_za64_s16)))
void svsumops_za64_s16(uint64_t, svbool_t, svbool_t, svint16_t, svint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svusmopa_za64_u16)))
void svusmopa_za64_u16(uint64_t, svbool_t, svbool_t, svuint16_t, svuint16_t);
__ai __as __asza
__attribute__((__clang_arm_builtin_alias(__builtin_sme_svusmops_za64_u16)))
void svusmops_za64_u16(uint64_t, svbool_t, svbool_t, svuint16_t, svuint16_t);
#endif  //defined(__ARM_FEATURE_SME_I64I64)
__ai __as __asza void svzero_za(void) { svzero_mask_za(255); }

__asc __apza void *__arm_sc_memcpy(void *dest, const void *src, size_t n);
__asc __apza void *__arm_sc_memmove(void *dest, const void *src, size_t n);
__asc __apza void *__arm_sc_memset(void *s, int c, size_t n);
__asc __apza void *__arm_sc_memchr(void *s, int c, size_t n);

#ifdef __cplusplus
} // extern "C"
#endif

#endif /*__ARM_FEATURE_SME */

#endif /* __ARM_SME_H */
