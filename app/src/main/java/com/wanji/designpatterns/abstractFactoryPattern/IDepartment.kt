package com.wanji.designpatterns.abstractFactoryPattern

/**
 *   by  :   syz
 *   Time: 2018/10/16 15:13
 *   Description:
 */
interface IDepartment {
    fun insert(string: String)

    fun getDepartmentName(): String?
}

class DepartmentA : IDepartment {
    var name: String? = null
    override fun insert(string: String) {
        name = "DepartmentA:"+string
    }

    override fun getDepartmentName(): String? = name
}

class DepartmentB : IDepartment {
    var name: String? = null
    override fun insert(string: String) {
        name = "DepartmentB:"+string
    }

    override fun getDepartmentName(): String? = name
}

class DepartmentC : IDepartment {
    var name: String? = null
    override fun insert(string: String) {
        name = "DepartmentC:"+string
    }

    override fun getDepartmentName(): String? = name
}