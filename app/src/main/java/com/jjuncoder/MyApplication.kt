package com.jjuncoder

import android.app.Application
import com.jjuncoder.starbucks.Starbucks

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        Starbucks()
    }
}