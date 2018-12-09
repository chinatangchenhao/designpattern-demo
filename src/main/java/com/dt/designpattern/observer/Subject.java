package com.dt.designpattern.observer;

import java.util.Observable;

/**
 * 定义目标对象
 */
public class Subject extends Observable {

    /**
     * 系统状态
     */
    private Integer state;

    public Subject(Integer state) {
        this.state = state;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        // 在这里状态就改变了
        this.state = state;

        // 通知关联的一些观察者，说我的状态变化了
        this.setChanged();

        // 推模式
        // this.notifyObservers(state);

        // 拉模式
        this.notifyObservers();
    }
}
