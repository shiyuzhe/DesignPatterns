package com.wanji.designpatterns.abstractFactoryPattern

import android.util.Log

/**
 *   by  :   syz
 *   Time: 2018/10/16 17:36
 *   Description:
 */
class DataAccess(string: String) {
    private var iFac: IFac? = null
    init {
        try {
            iFac = Class.forName(string).newInstance() as IFac
        } catch (e: ClassNotFoundException) {
            Log.e("syz", "ClassNotFoundException:" + e.message)
        }
    }
    fun createUser(): IUser? = iFac?.createUser()
    fun createDepart(): IDepartment? = iFac?.createDepart()

}