package com.example.hw65

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel: ViewModel() {
    var mCounter = MutableLiveData<Int>()
    private var counter = 0
    var plus = ""
    var mPlus = MutableLiveData<String>()

    fun onIncrement() {
        counter++
        mCounter.value = counter
        plus = "\n+ $plus"
        mPlus.value = plus
    }

    fun onDecrement() {
        counter--
        mCounter.value = counter
        plus = "\n- $plus"
        mPlus.value = plus
    }
}