package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/27 下午5:05
 * Description:
 **/
public class Creator2 extends Creator {
    AbstractProductA createdProductA() {
        return new ProductA2();
    }

    AbstractProductB createdProductB() {
        return new ProductB2();
    }
}
