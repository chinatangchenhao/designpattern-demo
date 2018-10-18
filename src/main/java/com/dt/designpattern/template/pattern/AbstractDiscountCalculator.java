package com.dt.designpattern.template.pattern;

public abstract class AbstractDiscountCalculator implements DiscountCalculator {

    public void calculate() {
        // 完成通用的计算逻辑
        commonCalculate();
        // 完成特殊的计算逻辑
        specificCalculate();
    }

    /**
     * 私有化一个方法用于写公共的逻辑
     */
    private void commonCalculate() {
        System.out.println("通用的计算逻辑，修改了一下.....");
    }

    /**
     * 定义一个抽象方法给子类实现自己独有逻辑
     */
    protected abstract void specificCalculate();

}
