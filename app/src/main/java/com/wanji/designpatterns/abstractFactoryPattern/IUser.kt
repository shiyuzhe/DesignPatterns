package com.wanji.designpatterns.abstractFactoryPattern

/**
 *   by  :   syz
 *   Time: 2018/10/16 15:13
 *   Description:
 */
interface IUser {
    fun insert(string: String)

    fun getUserName(): String?
}

class UserA : IUser {
    var name: String? = null
    override fun insert(string: String) {
        name = string
    }

    override fun getUserName(): String? = name
}

class UserB : IUser {
    var name: String? = null
    override fun insert(string: String) {
        name = string
    }
    override fun getUserName(): String? = name
}
class UserC : IUser {
    var name: String? = null
    override fun insert(string: String) {
        name = string
    }
    override fun getUserName(): String? = name
}