package com.dt.designpattern.factory.pattern;

public class ProductFactory {

    public static Product create() {
        // return new ProductImpl();
        return new ProductImpl2();
    }

}
