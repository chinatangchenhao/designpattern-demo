package com.dt.designpattern.factory.method.pattern;

public class Product3Factory extends AbstractProductFactory {

    private static final Product3Factory instance = new Product3Factory();

    private Product3Factory() {

    }

    public static Product3Factory get() {
        return instance;
    }

    public Product specificCreate() {
        System.out.println("生产产品3的特殊逻辑");
        return new Product3();
    }

}
