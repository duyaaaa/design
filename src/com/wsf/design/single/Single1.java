package com.wsf.design.single;

/**
 * 单例模式--饿汉
 *
 * @author weisifan
 */
public class Single1 {

    private static final Single1 single1 = new Single1();

    private Single1() {

    }

    public static Single1 getInstance(){
        return single1;
    }

}
