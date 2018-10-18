package com.wanji.designpatterns.creational.factoryMethodPattern

import com.wanji.designpatterns.creational.simpleFactoryPattern.Product

/**
 *   by  :   syz
 *   Time: 2018/10/15 13:40
 *   Description:
 */
interface IFactory {
    fun getProduct(): Product
}