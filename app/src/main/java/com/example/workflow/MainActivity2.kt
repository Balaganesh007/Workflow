package com.example.workflow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {

    private  val isEnabled = true

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        if(isEnabled) Log.v("Activity2 Android","onCreate()")
    }

    override fun onStart() {
        super.onStart()
        if(isEnabled) Log.v("Activity2 Android","onStart()")
    }

    override fun onResume() {
        super.onResume()
        if(isEnabled) Log.v("Activity2 Android","onResume()")
    }

    override fun onPause() {
        super.onPause()
        if(isEnabled) Log.v("Activity2 Android","onPause()")
    }

    override fun onStop() {
        super.onStop()
        if(isEnabled) Log.v("Activity2 Android","onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        if(isEnabled) Log.v("Activity2 Android","onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        if(isEnabled) Log.v("Activity2 Android","onDestroy()")
    }
}