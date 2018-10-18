package com.wanji.designpatterns.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wanji.designpatterns.R
import com.wanji.designpatterns.creational.singleton.*

class ActSingleTon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_single_ton)
        val singleTonDemo1 = SingleTonDemo1
        val singleTonDemo2 = SingleTonDemo2.get()
        val singleTonDemo3 = SingleTonDemo3.get()
        val singleTonDemo4 = SingleTonDemo4.instance
        val singleTonDemo5 = SingleTonDemo5.instance
    }
}
