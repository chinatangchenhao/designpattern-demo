package com.dt.designpattern.factory.method.pattern;

public class Product1Factory extends AbstractProductFactory {

    private static final Product1Factory instance = new Product1Factory();

    private Product1Factory() {

    }

    public static Product1Factory get() {
        return instance;
    }

    public Product specificCreate() {
        System.out.println("生产产品1的特殊逻辑");
        return new Product1();
    }

}
