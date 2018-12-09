package com.dt.designpattern.strategy.pattern;

public class DiscountCalculateStrategyA implements DiscountCalculateStrategy {

    public void calculate() {
        System.out.println("执行优惠计价方式1的复杂业务逻辑");
    }

}
