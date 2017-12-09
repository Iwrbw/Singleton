package com.ysf;

/**
 * Create by Tars on 2017/12/8
 *
 * 最最普通的单例模式
 * 只让一个类构架一个对象,不能随便去new操作,构造方法是私有的
 *
 * 线程不安全
 */
public class singletonDemo1 {
    private singletonDemo1(){}//私有化构造函数

    private static singletonDemo1 instance = null;//单例对象
    //静态工厂方法
    //获取单例对象的方法
    public static singletonDemo1 getInstance() {
        if (instance == null) {
            instance = new singletonDemo1();
        }
        return instance;
    }
}
