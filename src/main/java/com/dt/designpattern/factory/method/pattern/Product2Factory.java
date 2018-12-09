package com.dt.designpattern.factory.method.pattern;

public class Product2Factory extends AbstractProductFactory {

    private static final Product2Factory instance = new Product2Factory();

    private Product2Factory() {

    }

    public static Product2Factory get() {
        return instance;
    }

    public Product specificCreate() {
        System.out.println("生产产品2的特殊逻辑");
        return new Product2();
    }

}
