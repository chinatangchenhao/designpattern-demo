package com.dt.designpattern.method.pattern;

public class Main {

    public static final void main(String[] args) {
        Product product1 = Product1Factory.get().createProduct();
        Product product2 = Product2Factory.get().createProduct();
        Product product3 = Product3Factory.get().createProduct();

        product1.execute();
        product2.execute();
        product3.execute();
    }

}
