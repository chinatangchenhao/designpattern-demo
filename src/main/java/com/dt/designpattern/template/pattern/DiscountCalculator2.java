package com.dt.designpattern.template.pattern;

public class DiscountCalculator2 extends AbstractDiscountCalculator {

    protected void specificCalculate() {
        System.out.println("优惠计算器2的特殊计算逻辑");
    }

}
