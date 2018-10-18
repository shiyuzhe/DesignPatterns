package com.wanji.designpatterns.creational.simpleFactoryPattern

/**
 *   by  :   syz
 *   Time: 2018/10/15 13:55
 *   Description:
 */
sealed class ProductFac2 {
    object ProductA : ProductFac2()
    object ProductB : ProductFac2()
}

fun exec(productFac2: ProductFac2): Product = when (productFac2) {
    ProductFac2.ProductA -> {
        ProductA()
    }
    ProductFac2.ProductB -> {
        ProductB()
    }
}