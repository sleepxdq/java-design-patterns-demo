package com.xdq.object;

import com.xdq.Adapt;
import com.xdq.ConcreteTarget;
import com.xdq.Target;

/**
 * Author: 徐东强
 * Date: 2018/9/7 上午11:37
 * Description:对象适配器
 **/
public class Application {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.operate();

        target = new Adapter(new Adapt());
        target.operate();
    }
}
