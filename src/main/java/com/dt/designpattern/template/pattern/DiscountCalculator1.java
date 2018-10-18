package com.dt.designpattern.template.pattern;

public class DiscountCalculator1 extends AbstractDiscountCalculator {

    protected void specificCalculate() {
        System.out.println("优惠计算器1的特殊计算逻辑");
    }

}
