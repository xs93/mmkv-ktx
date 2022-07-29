package com.github.xs93.mmkv

import com.tencent.mmkv.MMKV

/**
 *  使用MMKV 接口，获取一个可以自己初始化的mmkv对象
 *
 * @author XuShuai
 * @version v1.0
 * @date 2022/7/22 10:37
 * @email 466911254@qq.com
 */
interface MMKVOwner {

    val mmkv: MMKV get() = defaultMMKV

    companion object {
        private val defaultMMKV = MMKV.defaultMMKV()
    }
}