package com.mauricifj.loggerapp

import android.app.Activity
import android.os.Bundle
import com.mauricifj.logger.Logger
import com.mauricifj.loggerapp.R.layout.activity_main

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(activity_main)

        Logger.info("Logger works")
    }
}