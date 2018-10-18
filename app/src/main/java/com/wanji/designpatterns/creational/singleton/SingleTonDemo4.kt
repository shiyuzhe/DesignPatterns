package com.wanji.designpatterns.creational.singleton

import android.app.Application
import android.widget.Toast

/**
 *   by  :   syz
 *   Time: 2018/10/18 14:56
 *   Description:双重校验锁式
 */
class SingleTonDemo4 private constructor() {
    companion object {
        val instance: SingleTonDemo4 by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingleTonDemo4()
        }
    }
}

//public class SingletonDemo {
//    private volatile static SingletonDemo instance;
//    private SingletonDemo(){}
//    public static SingletonDemo getInstance(){
//        if(instance==null){
//            synchronized (SingletonDemo.class){
//                if(instance==null){
//                    instance=new SingletonDemo();
//                }
//            }
//        }
//        return instance;
//    }
//}