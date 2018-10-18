package com.wanji.designpatterns.creational.builderMethodPattern

/**
 *   by  :   syz
 *   Time: 2018/10/18 13:18
 *   Description:
 */
class ConcreteBuilderA : Builder {
    val product = Product()
    override fun buildPartA() {
        product.add("ConcreteBuilderA创建buildPartA是一个很复杂的过程，是的 很复杂")
    }

    override fun buildPartB() {
        product.add("ConcreteBuilderA:buildPartB")
    }

    override fun getResult(): Product = product

}