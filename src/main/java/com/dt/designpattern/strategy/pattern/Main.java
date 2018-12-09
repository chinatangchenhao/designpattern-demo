package com.dt.designpattern.strategy.pattern;

public class Main {
    public static final void main(String[] args) {
        int discountStyle = 1;

        DiscountCalculateStrategy strategy = DiscountCalculateStrategryFactory
                .getDiscountCalculateStrategy(discountStyle);

        Context context = new Context();
        context.setStrategy(strategy);
        context.calculate();
    }
}
