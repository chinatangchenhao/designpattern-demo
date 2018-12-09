package com.dt.designpattern.strategy.none;

public class Main {
    public static final void main(String[] args) {

        // 有一个参数，是discountStyle
        // 如果这个参数1，那么选择一种优惠计价的方式
        // 如果这个参数2，那么选择一种优惠计价的方式
        // 如果这个参数3，那么选择一种优惠计价的方式
        int discountStyle = 1;

        if(discountStyle == 1) {
            System.out.println("执行优惠计价方式1的复杂业务逻辑");
        } else if(discountStyle == 2) {
            System.out.println("执行优惠计价方式2的复杂业务逻辑");
        } else if(discountStyle == 3) {
            System.out.println("执行优惠计价方式3的复杂业务逻辑");
        } else {
            System.out.println("执行默认的优惠计价方式的复杂业务逻辑");
        }
    }
}
