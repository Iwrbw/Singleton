package com.ysf;

/**
 * Create by Tars on 2017/12/9
 */
public class singletonDemo5 {
    /**
     * 饿汉的另一种模式
     */
    private static singletonDemo5 instance = new singletonDemo5();

    private singletonDemo5() {}

    public static singletonDemo5 getInstance() {
        if(instance == null) {
            instance = new singletonDemo5();
        }
        return instance;
    }
}
