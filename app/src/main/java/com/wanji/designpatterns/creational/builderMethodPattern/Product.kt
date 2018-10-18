package com.wanji.designpatterns.creational.builderMethodPattern

import android.util.Log

/**
 *   by  :   syz
 *   Time: 2018/10/18 13:19
 *   Description:
 */
class Product {

    val parts: ArrayList<String> = ArrayList()
    fun add(string: String) {
        parts.add(string)
    }

    private val TAG = this::class.simpleName

    fun show() {
        Log.e(TAG, "create Start")
        for (str in parts) {
            Log.e(TAG, "parts:$str")
        }
        Log.e(TAG, "create End")
    }
}