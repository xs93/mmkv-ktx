package com.github.xs93.mmkv

import android.os.Parcelable
import com.tencent.mmkv.MMKV

/**
 *
 * MMKVOwner 扩展
 * @author XuShuai
 * @version v1.0
 * @date 2022/10/24 12:56
 * @email 466911254@qq.com
 */

fun MMKVOwner.mmkvBoolean(key: String? = null, defaultValue: Boolean = false) = mmkv.boolean(key, defaultValue)

fun MMKVOwner.mmkvInt(key: String? = null, defaultValue: Int = 0) = mmkv.int(key, defaultValue)

fun MMKVOwner.mmkvLong(key: String? = null, defaultValue: Long = 0L) = mmkv.long(key, defaultValue)

fun MMKVOwner.mmkvFloat(key: String? = null, defaultValue: Float = 0.0f) = mmkv.float(key, defaultValue)

fun MMKVOwner.mmkvDouble(key: String? = null, defaultValue: Double = 0.0) = mmkv.double(key, defaultValue)

fun MMKVOwner.mmkvByteArray(key: String? = null, defaultValue: ByteArray? = null) = mmkv.byteArray(key, defaultValue)

fun MMKVOwner.mmkvString(key: String? = null, defaultValue: String? = null) = mmkv.string(key, defaultValue)

fun MMKVOwner.mmkvStringSet(key: String? = null, defaultValue: Set<String>? = null) = mmkv.stringSet(key, defaultValue)

inline fun <reified T : Parcelable> MMKVOwner.mmkvParcelable(key: String? = null, defaultValue: T) =
    mmkv.parcelable(key, defaultValue)

inline fun <reified T : Parcelable> MMKVOwner.mmkvParcelableWithNull(key: String? = null, defaultValue: T? = null) =
    mmkv.parcelableWithNull(key, defaultValue)

inline fun <reified T : Parcelable> MMKVOwner.mmkvListParcelable(key: String? = null, defaultValue: List<T>) =
    mmkv.listParcelable(key, defaultValue)

inline fun <reified T : Parcelable> MMKVOwner.mmkvListParcelableWithNull(
    key: String? = null,
    defaultValue: List<T>? = null
) = mmkv.listParcelableWithNull(key, defaultValue)
