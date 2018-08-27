package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/27 下午5:28
 * Description:
 **/
public abstract class AbstractClass {
    //基本方法，尽量使用protected，符合迪米尔特原则
    protected abstract void doSomething();
    protected abstract void doAnything();

    //模板方法，尽量使用final，防止恶意更改
    public final void templateMethod(){
        /**
         * 基本都会调用基本方法
         */
        doSomething();
        doAnything();
    }

}
