package com.wsf.design.strategy;

/**
 * 上下文
 *
 * @author weisifan
 */
public class Context {

    public static void save(Strategy strategy) {
        strategy.save();
    }

}
