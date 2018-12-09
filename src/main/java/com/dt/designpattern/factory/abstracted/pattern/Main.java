package com.dt.designpattern.factory.abstracted.pattern;

import com.dt.designpattern.factory.abstracted.product.ProductA;
import com.dt.designpattern.factory.abstracted.product.ProductB;

public class Main {

    public static final void main(String[] args) {
        // 产品A1+产品B1 -> 产品A1+产品B3
        ProductA firstProductA = Factory1.get().createProductA();
        ProductB firstProductB = Factory1.get().createProductB();
        firstProductA.execute();
        firstProductB.execute();
    }

}
