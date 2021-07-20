package com.wsf.design.single;

/**
 * 单例模式--双重检查
 *
 * @author weisifan
 */
public class Single3 {

    private volatile static Single3 single3;

    private Single3() {
    }

    /**
     * 由于 new 对象时,并不是原子性操作,会有指令重排序问题.
     *
     * @return
     */
    public static Single3 getInstance() {
        if (single3 == null) {
            synchronized (Single3.class) {
                if (single3 == null) {
                    single3 = new Single3();
                }
            }
        }
        return single3;
    }
}
