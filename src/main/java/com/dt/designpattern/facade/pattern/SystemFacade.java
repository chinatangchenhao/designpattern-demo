package com.dt.designpattern.facade.pattern;

import com.dt.designpattern.facade.model.ModuleA;
import com.dt.designpattern.facade.model.ModuleB;
import com.dt.designpattern.facade.model.ModuleC;
import com.dt.designpattern.facade.model.impl.ModuleAImpl;
import com.dt.designpattern.facade.model.impl.ModuleBImpl;
import com.dt.designpattern.facade.model.impl.ModuleCImpl;

public class SystemFacade {

    public void exucute() {
        ModuleA moduleA = new ModuleAImpl();
        ModuleB moduleB = new ModuleBImpl();
        ModuleC moduleC = new ModuleCImpl();

        moduleA.execute();
        moduleB.execute();
        moduleC.execute();

        System.out.println("新增的一段逻辑...");
    }

}
