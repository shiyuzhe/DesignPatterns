package com.wanji.designpatterns.creational.singleton

import android.util.Log

/**
 *   by  :   syz
 *   Time: 2018/10/18 14:56
 *   Description:线程安全的懒汉式
 */
class SingleTonDemo3 private constructor() {

    companion object {
        private var instance: SingleTonDemo3? = null
            get() {
                if (field == null)
                    field = SingleTonDemo3()
                return field
            }
        @Synchronized
        fun get(): SingleTonDemo3 = instance!!
    }

}

//public class SingletonDemo {
//    private static SingletonDemo instance;
//    private SingletonDemo(){}
//    public static synchronized SingletonDemo getInstance(){//使用同步锁
//        if(instance==null){
//            instance=new SingletonDemo();
//        }
//        return instance;
//    }
//}
