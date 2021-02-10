package com.example.aopsample

import android.util.Log

class Counter {

    private var i = 0

    fun count() {
        i++
        Log.i("Counter", "The current count is " + i)
    }
}
