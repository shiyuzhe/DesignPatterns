package com.wanji.designpatterns.creational.abstractFactoryPattern

import android.util.Log

/**
 *   by  :   syz
 *   Time: 2018/10/16 17:36
 *   Description:
 */
//val string = "A"//UserA,DepartmentA.

class DataAccess2(string: String) {
    var string: String? = null

    init {
        this.string = string
    }


    fun createUser(): IUser? {
        try {
            return Class.forName("com.wanji.designpatterns.abstractFactoryPattern.User" + string).newInstance() as IUser
        } catch (e: ClassNotFoundException) {
            Log.e("syz", "ClassNotFoundException:" + e.message)
        }
        return null
    }


    fun createDepart(): IDepartment? {
        try {
            return Class.forName("com.wanji.designpatterns.abstractFactoryPattern.Department" + string).newInstance() as IDepartment
        } catch (e: ClassNotFoundException) {
            Log.e("syz", "ClassNotFoundException:" + e.message)
        }
        return null
    }
}
