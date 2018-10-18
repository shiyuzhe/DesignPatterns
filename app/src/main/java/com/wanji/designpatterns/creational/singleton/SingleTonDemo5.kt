package com.wanji.designpatterns.creational.singleton

/**
 *   by  :   syz
 *   Time: 2018/10/18 14:56
 *   Description:双重校验锁式
 */
class SingleTonDemo5 private constructor() {
    companion object {
        val instance = SingleTonHolder.holder
    }

    private object SingleTonHolder {
        val holder = SingleTonDemo5()
    }
}
//public class SingletonDemo {
//    private static class SingletonHolder{
//        private static SingletonDemo instance=new SingletonDemo();
//    }
//    private SingletonDemo(){
//        System.out.println("Singleton has loaded");
//    }
//    public static SingletonDemo getInstance(){
//        return SingletonHolder.instance;
//    }
//}
