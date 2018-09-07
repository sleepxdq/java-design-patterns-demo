package com.xdq.clazz;

import com.xdq.ConcreteTarget;
import com.xdq.Target;

/**
 * Author: 徐东强
 * Date: 2018/9/7 上午11:23
 * Description:类适配器
 **/
public class Application {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.operate();

        target = new Adapter();
        target.operate();

    }
}
