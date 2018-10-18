package com.wanji.designpatterns.creational.builderMethodPattern

/**
 *   by  :   syz
 *   Time: 2018/10/18 13:18
 *   Description:
 */
class ConcreteBuilderB : Builder {
    val product = Product()
    override fun buildPartA() {
        product.add("ConcreteBuilderB:buildPartA")
    }

    override fun buildPartB() {
        product.add("ConcreteBuilderB:buildPartB")
    }

    override fun getResult(): Product = product

}