package com.dt.designpattern.adapter.pattern;

import com.dt.designpattern.adapter.service.NewInterface;
import com.dt.designpattern.adapter.service.OldInterface;

/**
 * 定义一个适配器类
 */
public class NewInterfaceAdapter implements NewInterface {

    private OldInterface oldInterface;

    public NewInterfaceAdapter(OldInterface oldInterface) {
        this.oldInterface = oldInterface;
    }

    public void newExecute() {
        oldInterface.oldExecute();
    }

}
