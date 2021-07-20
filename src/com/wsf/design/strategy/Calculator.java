package com.wsf.design.strategy;

/**
 * 策略模式--枚举
 *
 * @author weisifan
 */
public enum Calculator {
    ADD(() -> "加法"),
    SUB(() -> "减法");

    Calculator1 c;

    Calculator(Calculator1 c) {
        this.c = c;
    }

    private interface Calculator1 {
        /**
         * 执行
         */
        public String exec();
    }
}
