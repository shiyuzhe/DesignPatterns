package com.wanji.designpatterns.creational.factoryMethodPattern

import com.wanji.designpatterns.creational.simpleFactoryPattern.Product
import com.wanji.designpatterns.creational.simpleFactoryPattern.ProductB

/**
 *   by  :   syz
 *   Time: 2018/10/15 10:23
 *   Description:
 */
class FactoryB : IFactory {
    override fun getProduct(): Product = ProductB()
}