package com.dt.designpattern.strategy.pattern;

public class Context {

    private DiscountCalculateStrategy strategy;

    public DiscountCalculateStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(DiscountCalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public void calculate() {
        strategy.calculate();
    }

}
