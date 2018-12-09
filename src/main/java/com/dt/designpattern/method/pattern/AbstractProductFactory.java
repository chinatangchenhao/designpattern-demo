package com.dt.designpattern.method.pattern;

public abstract class AbstractProductFactory {

    public Product createProduct() {
        commonCreate();
        return specificCreate();
    }

    private void commonCreate() {
        System.out.println("生产产品的通用逻辑，修改");
    }

    protected abstract Product specificCreate();

}
