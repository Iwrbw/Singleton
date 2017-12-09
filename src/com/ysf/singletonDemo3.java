package com.ysf;

/**
 * Create by Tars on 2017/12/8
 */
public class singletonDemo3 {
    private singletonDemo3(){}

    /**
     * 这里加上volatile修饰符
     * valatile修饰符组织了变量访问前后的指令重排,保证了指令执行顺序
     */
    private volatile static singletonDemo3 instance = null;

    public static singletonDemo3 getInstance() {
        if(instance == null) {
            synchronized (singletonDemo3.class) {
                if(instance == null) {
                    instance = new singletonDemo3();
                }
            }
        }
        return instance;
    }
}
