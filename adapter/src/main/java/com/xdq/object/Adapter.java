package com.xdq.object;

import com.xdq.Adapt;
import com.xdq.Target;

/**
 * Author: 徐东强
 * Date: 2018/9/7 上午11:33
 * Description:
 **/
public class Adapter implements Target {

    private Adapt adapt;

    public Adapter(Adapt adapt) {
        this.adapt = adapt;
    }

    public void operate() {
        this.adapt.doSomething();
    }
}
