package com.wanji.designpatterns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.wanji.designpatterns.simpleFactoryPattern.ProductFactory
import kotlinx.android.synthetic.main.act_main.*

class ActMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)
        val product = ProductFactory.getInstance().getProduct("A")
        Log.e("syz", product.show())
    }
}
