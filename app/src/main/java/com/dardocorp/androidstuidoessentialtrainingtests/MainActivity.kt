package com.dardocorp.androidstuidoessentialtrainingtests

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

const val TAG="MainActivity"
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var strings = arrayOf("uno","tres")
        println(strings[0])

        doSomething();

        Log.d(TAG,"onCreate")

    }
    override fun onStart(){
        super.onStart()
        Log.d(TAG,"onStart")
    }

    override fun onResume(){
        super.onResume()
        Log.d(TAG,"onResume")
    }

    fun doSomething(){
        println("Hello ?")
    }
}
