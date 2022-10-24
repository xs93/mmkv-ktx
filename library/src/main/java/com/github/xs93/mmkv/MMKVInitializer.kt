package com.github.xs93.mmkv

import android.content.Context
import android.util.Log
import androidx.startup.Initializer
import com.tencent.mmkv.MMKV

/**
 * 初始化MMKV
 *
 * @author XuShuai
 * @version v1.0
 * @date 2022/10/24 12:37
 * @email 466911254@qq.com
 */
class MMKVInitializer : Initializer<Unit> {
    override fun create(context: Context) {
        MMKV.initialize(context)
        Log.d("MMKVKtx", "MMKV 已经初始化")
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}