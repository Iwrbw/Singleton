package com.ysf;

/**
 * Create by Tars on 2017/12/8
 */
public class singletonDemo2 {
    private singletonDemo2(){}

    private static singletonDemo2 instance = null;

    public static singletonDemo2 getInstance() {
        if(instance == null) {
            //增加一个synchronized关键字,保证线程安全
            //防治new singletonDemo2被执行多次,因此在new操作之前加上synchronized关键字
            //进入synchronized临界区后,做一次判断,否侧还是会调用new方法
            /**
             * 这里的逻辑可能有问题,JVM指令是：
             * 1、分配对象的内存孔家
             * 2、初始化对象
             * 3、设置instance指向刚分配的内存地址
             *
             * 但这些指令顺序并发一成不变，有可能会经过JVM和CPU的优化，指令会重排：
             * 1、分配对象的内存孔家
             * 3、设置instance指向刚分配的内存地址
             * 2、初始化对象
             */
            synchronized (singletonDemo2.class) {
                if(instance == null) {
                    instance = new singletonDemo2();
                }
            }
        }
        return instance;
    }
}
