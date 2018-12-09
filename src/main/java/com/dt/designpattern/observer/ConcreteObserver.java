package com.dt.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 定义观察者
 */
public class ConcreteObserver implements Observer {

    public void update(Observable o, Object arg) {
        // 推模式获取响应
        // Integer state = (Integer) arg;

        // 拉模式获取响应
        Integer state = null;
        if (o instanceof Subject) {
            Subject subject = (Subject) o;
            state = subject.getState();
        }

        System.out.println("目标对象的状态变化成：" + state);
    }

}
