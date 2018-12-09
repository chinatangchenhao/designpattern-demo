package com.dt.designpattern.observer;

import java.util.Observer;

public class Main {

    public static final void main(String[] args) {

        Subject subject = new Subject(0);

        Observer observer = new ConcreteObserver();
        subject.addObserver(observer);

        subject.setState(1);

    }

}
