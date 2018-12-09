package com.dt.designpattern.strategy.pattern;

public class DiscountCalculateStrategyDefault implements DiscountCalculateStrategy {

    public void calculate() {
        System.out.println("执行默认的优惠计价方式的复杂业务逻辑");
    }

}
