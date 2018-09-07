package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/9/7 上午11:23
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.operate();

        target = new Apapter();
        target.operate();

    }
}
