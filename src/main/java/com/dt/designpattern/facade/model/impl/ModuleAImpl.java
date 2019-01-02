package com.dt.designpattern.facade.model.impl;

import com.dt.designpattern.facade.model.ModuleA;

public class ModuleAImpl implements ModuleA {

    public void execute() {
        System.out.println("子系统1的模块A的功能");
    }

}
