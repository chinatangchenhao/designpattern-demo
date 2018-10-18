package com.dt.designpattern.template.pattern;

public class Main {
    public static final void main(String[] args) {
        DiscountCalculator calculator1 = new DiscountCalculator1();
        calculator1.calculate();
        DiscountCalculator calculator2 = new DiscountCalculator2();
        calculator2.calculate();
        DiscountCalculator calculator3 = new DiscountCalculator3();
        calculator3.calculate();
    }
}
