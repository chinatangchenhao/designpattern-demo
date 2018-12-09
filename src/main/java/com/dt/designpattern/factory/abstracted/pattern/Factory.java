package com.dt.designpattern.factory.abstracted.pattern;

import com.dt.designpattern.factory.abstracted.product.ProductA;
import com.dt.designpattern.factory.abstracted.product.ProductB;

public interface Factory {

    ProductA createProductA();

    ProductB createProductB();

}
