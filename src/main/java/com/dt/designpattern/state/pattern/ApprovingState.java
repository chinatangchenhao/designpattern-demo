package com.dt.designpattern.state.pattern;

public class ApprovingState implements State {

    public void execute() {
        System.out.println("执行销售出库单待审批状态的逻辑");
    }

}
