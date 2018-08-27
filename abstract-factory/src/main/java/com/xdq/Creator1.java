package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/27 下午5:04
 * Description:
 **/
public class Creator1 extends Creator {
    AbstractProductA createdProductA() {
        return new ProductA1();
    }

    AbstractProductB createdProductB() {
        return new ProductB1();
    }
}
