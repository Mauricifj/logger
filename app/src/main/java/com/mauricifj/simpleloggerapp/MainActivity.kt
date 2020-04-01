package com.mauricifj.simpleloggerapp

import android.app.Activity
import android.os.Bundle
import com.mauricifj.simplelogger.SimpleLogger
import com.mauricifj.simpleloggerapp.R.layout.activity_main

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        SimpleLogger.info("SimpleLogger works")
    }
}