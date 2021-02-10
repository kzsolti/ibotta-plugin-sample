package com.example.aopsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.aopsample.logic.Controller

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        aopTarget(Controller())
    }

    fun aopTarget(controller: Controller) {
        controller.process()
    }
}