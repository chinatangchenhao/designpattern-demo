package com.dt.designpattern.method.none;

public class Product1Factory {

    public static Product createProduct() {
        System.out.println("生产产品的通用逻辑，修改");
        System.out.println("生产产品1的特殊逻辑");
        return new Product1();
    }

}