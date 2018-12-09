package com.dt.designpattern.factory.method.none;

public class Main {

    public static final void main(String[] args) {

        Product product1 = Product1Factory.createProduct();
        Product product2 = Product2Factory.createProduct();
        Product product3 = Product3Factory.createProduct();

        product1.execute();
        product2.execute();
        product3.execute();
    }

}
