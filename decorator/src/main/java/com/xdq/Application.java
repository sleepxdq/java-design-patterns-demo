package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/9/6 下午6:16
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.operate();

        component = new Decorator(component);
        component.operate();
    }
}
