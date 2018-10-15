package com.dt.designpattern.adapter.service.impl;

import com.dt.designpattern.adapter.service.OldInterface;

/**
 * 老版本接口的实现类
 */
public class OldInterfaceImpl implements OldInterface {

    public void oldExecute() {
        System.out.println("老版本接口实现的功能逻辑");
    }

}
