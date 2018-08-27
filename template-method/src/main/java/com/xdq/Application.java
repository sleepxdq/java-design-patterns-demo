package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/27 下午5:34
 * Description:
 **/
public class Application {
    public static void main(String[] args) {
        AbstractClass class1 = new ConcreteClass1();
        class1.templateMethod();

        ConcreteClass2 class2 = new ConcreteClass2();
        class2.templateMethod();
    }
}
