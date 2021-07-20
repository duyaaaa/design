package com.wsf.design.strategy;

/**
 * @author weisifan
 */
public class Strategy01 implements Strategy {

    @Override
    public void save() {
        System.out.println("策略 1 保存...");
    }

}
