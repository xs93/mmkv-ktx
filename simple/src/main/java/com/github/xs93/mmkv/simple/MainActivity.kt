package com.github.xs93.mmkv.simple

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.xs93.mmkv.MMKVOwner
import com.github.xs93.mmkv.boolean
import com.tencent.mmkv.MMKV

class MainActivity : AppCompatActivity(), MMKVOwner {

    override val mmkv: MMKV
        get() = MMKV.mmkvWithID("MainActivity")


    private var start by mmkv.boolean("start")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        start = true
    }
}