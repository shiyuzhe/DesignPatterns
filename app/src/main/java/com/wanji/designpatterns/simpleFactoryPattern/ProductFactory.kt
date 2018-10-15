package com.wanji.designpatterns.simpleFactoryPattern

/**
 *   by  :   syz
 *   Time: 2018/10/15 9:02
 *   Description:
 */
class ProductFactory private constructor() {

    companion object {
        fun getInstance() = Holder.instance
    }
    private object Holder {
        val instance = ProductFactory()
    }

    fun getProduct(string: String): Product =
            when (string) {
                "A" -> ProductA()
                "B" -> ProductB()
                else ->
                    ProductDefault()
            }
}