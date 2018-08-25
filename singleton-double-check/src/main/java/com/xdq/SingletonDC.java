package com.xdq;

import java.util.Objects;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午7:31
 * Description:
 **/
public class SingletonDC {

    private SingletonDC(){}

    private volatile static SingletonDC singleton = null;

    public static SingletonDC getInstance(){
        if (Objects.isNull(singleton)){
            synchronized (SingletonDC.class){
                if (Objects.isNull(singleton)){
                    singleton = new SingletonDC();
                }
            }
        }
        return singleton;
    }
}
