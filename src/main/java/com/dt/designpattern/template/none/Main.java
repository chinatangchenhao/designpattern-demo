package com.dt.designpattern.template.none;

public class Main {

    public static final void main(String[] args) {

        DiscountCalculator1 calculator1 = new DiscountCalculator1();
        calculator1.calculate();

        DiscountCalculator2 calculator2 = new DiscountCalculator2();
        calculator2.calculate();

        DiscountCalculator3 calculator3 = new DiscountCalculator3();
        calculator3.calculate();

    }

}
