package com.dt.designpattern.facade.none;

import com.dt.designpattern.facade.model.ModuleA;
import com.dt.designpattern.facade.model.ModuleB;
import com.dt.designpattern.facade.model.ModuleC;
import com.dt.designpattern.facade.model.impl.ModuleAImpl;
import com.dt.designpattern.facade.model.impl.ModuleBImpl;
import com.dt.designpattern.facade.model.impl.ModuleCImpl;

public class Main {

    public static void main(String[] args) {

        /**
         * 假设我们这里是子系统B，要基于子系统A的3个模块的功能实现一个业务逻辑
         */
        ModuleA moduleA = new ModuleAImpl();
        ModuleB moduleB = new ModuleBImpl();
        ModuleC moduleC = new ModuleCImpl();

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();

    }

}
