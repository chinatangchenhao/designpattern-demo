package com.dt.designpattern.factory.method.none;

public class Product2Factory {

    public static Product createProduct() {
        System.out.println("生产产品的通用逻辑，修改");
        System.out.println("生产产品2的特殊逻辑");
        return new Product2();
    }

}
