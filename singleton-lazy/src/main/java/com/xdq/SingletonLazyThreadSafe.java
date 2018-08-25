package com.xdq;

import java.util.Objects;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午4:54
 * Description: 懒汉模式（线程安全）
 **/
public class SingletonLazyThreadSafe {
    /**
     * 私有构造器，目的是防止破坏创建单一对象
     */
    private SingletonLazyThreadSafe(){}

    private static SingletonLazyThreadSafe singleton = null;

    /**
     * 唯一获取对象入口
     * @return
     */
    public static synchronized SingletonLazyThreadSafe getInstance(){
        if (Objects.isNull(singleton))
            singleton =  new SingletonLazyThreadSafe();
        return singleton;
    }
}
