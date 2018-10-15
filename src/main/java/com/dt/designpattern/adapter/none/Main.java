package com.dt.designpattern.adapter.none;

import com.dt.designpattern.adapter.service.NewInterface;
import com.dt.designpattern.adapter.service.OldInterface;
import com.dt.designpattern.adapter.service.impl.NewInterfaceImpl;
import com.dt.designpattern.adapter.service.impl.OldInterfaceImpl;

public class Main {
    public static final void main(String[] args) {
        OldInterface oldObject = new OldInterfaceImpl();
        NewInterface newObject = new NewInterfaceImpl();
        oldObject.oldExecute();
        newObject.newExecute();
    }
}
