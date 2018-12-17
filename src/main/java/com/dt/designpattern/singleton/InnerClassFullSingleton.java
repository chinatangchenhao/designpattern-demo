package com.dt.designpattern.singleton;

/**
 * 内部类的方式来实现
 */
public class InnerClassFullSingleton {

    private InnerClassFullSingleton() {

    }

    public static class InnerHolder {

        public static final InnerClassFullSingleton instance = new InnerClassFullSingleton();
    }

    public static InnerClassFullSingleton getInstance() {

        return InnerHolder.instance;

    }

}
