package com.xdq;

import java.util.Objects;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午7:27
 * Description: 懒汉模式（非线程安全）
 **/
public class SingletonLazyThreadUnsafe {

    /**
     * 私有构造器，目的是防止破坏创建单一对象
     */
    private SingletonLazyThreadUnsafe(){}

    private static SingletonLazyThreadUnsafe singleton = null;

    /**
     * 唯一获取对象入口
     * @return
     */
    public static SingletonLazyThreadUnsafe getInstance(){
        if (Objects.isNull(singleton))
            singleton =  new SingletonLazyThreadUnsafe();
        return singleton;
    }
}
