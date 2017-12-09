package com.ysf;

/**
 * Create by Tars on 2017/12/8
 *
 * 用静态内部来去实现单例模式
 *
 * 外部无法访问静态内部类LazyHolder,只是当调用singletonDemo4.getInstance()方法的时候,才能得到单例对象INSTANCE
 * 这就是常说的懒加载
 */
public class singletonDemo4 {
    public static class LazyHolder {
        private static final singletonDemo4 INSTANCE = new singletonDemo4();
    }

    private singletonDemo4(){}

    public static singletonDemo4 getInstance() {
        return LazyHolder.INSTANCE;
    }
}
