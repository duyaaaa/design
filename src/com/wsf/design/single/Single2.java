package com.wsf.design.single;

/**
 * 单例模式--懒汉式
 * 线程不安全
 *
 * @author weisifan
 */
public class Single2 {

    private static Single2 single2;

    private Single2() {
    }

    public static Single2 getInstance() {
        if (single2 == null) {
            single2 = new Single2();
        }
        return single2;
    }
}
