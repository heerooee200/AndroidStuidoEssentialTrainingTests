package com.dardocorp.androidstuidoessentialtrainingtests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strings = arrayOf("uno","tres");
        println(strings[0]);

        doSomething();

        Log.d("MainActivity","onCreate");

    }

    fun doSomething(){
        println("Hello ?");
    }
}
