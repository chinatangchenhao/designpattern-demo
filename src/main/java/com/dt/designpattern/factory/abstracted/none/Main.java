package com.dt.designpattern.factory.abstracted.none;

import com.dt.designpattern.factory.abstracted.product.ProductA;
import com.dt.designpattern.factory.abstracted.product.ProductB;
import com.dt.designpattern.factory.abstracted.product.impl.ProductA1;
import com.dt.designpattern.factory.abstracted.product.impl.ProductB1;
import com.dt.designpattern.factory.abstracted.product.impl.ProductB3;

public class Main {

    public static final void main(String[] args) {
        // 创建产品A1+产品B1的组合
        ProductA productA1 = new ProductA1();
        ProductB productB1 = new ProductB1();

		productA1.execute();
		productB1.execute();

        // 变成产品A1+产品B3的组合
        ProductA productA11 = new ProductA1();
        ProductB otherProductB3 = new ProductB3();

        productA11.execute();
        otherProductB3.execute();
    }

}
