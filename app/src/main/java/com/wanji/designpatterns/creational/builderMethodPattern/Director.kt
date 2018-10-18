package com.wanji.designpatterns.creational.builderMethodPattern

/**
 *   by  :   syz
 *   Time: 2018/10/18 13:29
 *   Description:
 */
class Director {

    fun build(builder: Builder){
        builder.buildPartA()
        builder.buildPartB()
    }
}