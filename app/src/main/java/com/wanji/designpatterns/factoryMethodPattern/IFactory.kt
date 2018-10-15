package com.wanji.designpatterns.factoryMethodPattern

import com.wanji.designpatterns.simpleFactoryPattern.Product

/**
 *   by  :   syz
 *   Time: 2018/10/15 13:40
 *   Description:
 */
interface IFactory {
    fun getProduct():Product
}