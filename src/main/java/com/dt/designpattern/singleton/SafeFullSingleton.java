package com.dt.designpattern.singleton;

public class SafeFullSingleton {

    private static SafeFullSingleton instance;

    private SafeFullSingleton() {

    }

    public static SafeFullSingleton getInstance() {
        if(instance == null) {
            synchronized(SafeFullSingleton.class) {
                if(instance == null) {
                    instance = new SafeFullSingleton();
                }
            }
        }
        return instance;
    }

}
