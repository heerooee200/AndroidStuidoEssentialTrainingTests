package com.dardocorp.androidstuidoessentialtrainingtests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strings = arrayOf("one","three");
        println(strings[0]);


    }
}
