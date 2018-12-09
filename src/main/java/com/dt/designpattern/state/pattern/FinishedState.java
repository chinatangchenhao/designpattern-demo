package com.dt.designpattern.state.pattern;

public class FinishedState implements State {

    public void execute() {
        System.out.println("执行销售出库单已完成状态的逻辑");
    }

}
