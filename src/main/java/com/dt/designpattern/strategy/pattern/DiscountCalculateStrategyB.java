package com.dt.designpattern.strategy.pattern;

public class DiscountCalculateStrategyB implements DiscountCalculateStrategy {

    public void calculate() {
        System.out.println("执行优惠计价方式2的复杂业务逻辑");
    }

}
