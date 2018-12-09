package com.dt.designpattern.factory.simple.pattern;

public class Main {

    public static final void main(String[] args) {
        Product product = ProductFactory.create();
        product.execute();
    }

}
