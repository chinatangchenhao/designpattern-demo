package com.dt.designpattern.factory.none;

public class Product2 {

    private String name;

    public Product2(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "name='" + name + '\'' +
                '}';
    }
}
