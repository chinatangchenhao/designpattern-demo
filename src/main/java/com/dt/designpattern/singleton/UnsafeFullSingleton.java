package com.dt.designpattern.singleton;

/**
 * 线程不安全的饱汉模式
 */
public class UnsafeFullSingleton {

    private static UnsafeFullSingleton instance;

    private UnsafeFullSingleton() {

    }

    public static UnsafeFullSingleton getInstance() {
        if(instance == null) {
            instance = new UnsafeFullSingleton();
        }
        return instance;
    }

}
