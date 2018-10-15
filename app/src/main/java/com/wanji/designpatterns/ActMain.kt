package com.wanji.designpatterns

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wanji.designpatterns.factoryMethodPattern.FactoryB
import com.wanji.designpatterns.factoryMethodPattern.IFactory
import com.wanji.designpatterns.simpleFactoryPattern.*
import kotlinx.android.synthetic.main.act_main.*

class ActMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_main)

        simpleFactoryPattern()
//        factoryMethodPattern()
    }

    fun factoryMethodPattern() {
        val factory: IFactory = FactoryB()
        val show = factory.getProduct().show()
        content.setText("factory.getProduct().show()+$show")
    }

    fun simpleFactoryPattern() {
        val productA = ProductFactory.getInstance().getProduct("A")
        val productB: Product = exec(ProductFac2.ProductB)
        content.setText("productA:" + productA.show() + "\nproductB:" + productB.show())
    }
}
