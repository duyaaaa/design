package com.wsf.design.single;

/**
 * 单例模式--枚举
 * 防止序列化,反射. 因为没有构造方法
 *
 * @author weisifan
 */
public enum Single4 {

    INSTANCE();

    public void single() {
    }

}
