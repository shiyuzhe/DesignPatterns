package com.wanji.designpatterns.creational.builderMethodPattern

/**
 *   by  :   syz
 *   Time: 2018/10/18 13:14
 *   Description:
 */
interface Builder {

    /**
     * 部件A
     */
    fun buildPartA()

    /**
     * 部件B
     */
    fun buildPartB()

    /**
     * 产品实现
     */
    fun getResult(): Product
}