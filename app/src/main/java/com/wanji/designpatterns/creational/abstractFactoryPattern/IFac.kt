package com.wanji.designpatterns.creational.abstractFactoryPattern

/**
 *   by  :   syz
 *   Time: 2018/10/16 15:13
 *   Description:
 */
interface IFac {
    fun createUser(): IUser
    fun createDepart(): IDepartment
}

class FacA : IFac {
    override fun createUser(): IUser = UserA()
    override fun createDepart(): IDepartment = DepartmentA()
}

class FacB : IFac {
    override fun createUser(): IUser = UserB()
    override fun createDepart(): IDepartment = DepartmentB()
}