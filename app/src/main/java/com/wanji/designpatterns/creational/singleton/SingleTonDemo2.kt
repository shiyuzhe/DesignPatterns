package com.wanji.designpatterns.creational.singleton

import android.util.Log

/**
 *   by  :   syz
 *   Time: 2018/10/18 14:56
 *   Description:懒汉式
 */
class SingleTonDemo2 private constructor() {

    companion object {
        private var instance: SingleTonDemo2? = null
            get() {
                if (field == null)
                    field = SingleTonDemo2()
                return field
            }

        fun get(): SingleTonDemo2 = instance!!

    }
}

//package com.wanji.designpatterns.creational.singleton
//
//public final class SingleTonDemo2 private constructor() {
//    public companion object {
//        private final var instance: com.wanji.designpatterns.creational.singleton.SingleTonDemo2? /* compiled code */
//
//        public final fun get(): com.wanji.designpatterns.creational.singleton.SingleTonDemo2 { /* compiled code */ }
//    }
//}

//public class SingletonDemo {
//    private static SingletonDemo instance;
//    private SingletonDemo(){}
//    public static SingletonDemo getInstance(){
//        if(instance==null){
//            instance=new SingletonDemo();
//        }
//        return instance;
//    }
//}
