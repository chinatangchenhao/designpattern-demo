package com.dt.designpattern.state.pattern;

public class ApprovedState implements State {

    public void execute() {
        System.out.println("执行销售出库单已审批状态的逻辑");
    }

}
