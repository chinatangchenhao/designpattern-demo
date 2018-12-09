package com.dt.designpattern.factory.abstracted.pattern;

import com.dt.designpattern.factory.abstracted.product.ProductA;
import com.dt.designpattern.factory.abstracted.product.ProductB;
import com.dt.designpattern.factory.abstracted.product.impl.ProductA1;
import com.dt.designpattern.factory.abstracted.product.impl.ProductB3;

public class Factory1 implements Factory {

    private static final Factory1 instance = new Factory1();

    private Factory1() {

    }

    public static Factory get() {
        return instance;
    }

    public ProductA createProductA() {
        return new ProductA1();
    }

    public ProductB createProductB() {
        return new ProductB3();
    }
}
