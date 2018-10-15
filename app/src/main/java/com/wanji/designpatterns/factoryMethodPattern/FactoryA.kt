package com.wanji.designpatterns.factoryMethodPattern

import com.wanji.designpatterns.simpleFactoryPattern.Product
import com.wanji.designpatterns.simpleFactoryPattern.ProductA

/**
 *   by  :   syz
 *   Time: 2018/10/15 10:23
 *   Description:
 */
class FactoryA : IFactory {
    override fun getProduct(): Product  = ProductA()
}