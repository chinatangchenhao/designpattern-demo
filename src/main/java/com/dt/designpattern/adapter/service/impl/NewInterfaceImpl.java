package com.dt.designpattern.adapter.service.impl;

import com.dt.designpattern.adapter.service.NewInterface;

/**
 * 新版本接口的实现类
 */
public class NewInterfaceImpl implements NewInterface {

    public void newExecute() {
        System.out.println("新版本接口实现的功能逻辑");
    }

}
