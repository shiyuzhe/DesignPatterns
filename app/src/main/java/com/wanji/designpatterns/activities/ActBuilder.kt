package com.wanji.designpatterns.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.wanji.designpatterns.R
import com.wanji.designpatterns.creational.builderMethodPattern.Builder
import com.wanji.designpatterns.creational.builderMethodPattern.ConcreteBuilderA
import com.wanji.designpatterns.creational.builderMethodPattern.ConcreteBuilderB
import com.wanji.designpatterns.creational.builderMethodPattern.Director
import kotlinx.android.synthetic.main.act_builder.*

/**
 * 建造者模式
 */
class ActBuilder : AppCompatActivity() {
    private val director = Director()
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_builder)
        concreteBuilderA.setOnClickListener {
            build(ConcreteBuilderA())
        }
        concreteBuilderB.setOnClickListener {
            build(ConcreteBuilderB())
        }
    }

    private fun build(builder: Builder) {
        director.build(builder)
        builder.getResult().show()
    }
}
