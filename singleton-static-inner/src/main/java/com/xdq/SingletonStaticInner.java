package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午7:17
 * Description:
 **/
public class SingletonStaticInner {
    private SingletonStaticInner(){}

    public static SingletonStaticInner getInstance(){
        return SingletonHolder.SINGLETON_STATIC_INNER;
    }

    private static class SingletonHolder{
        private static final SingletonStaticInner SINGLETON_STATIC_INNER = new SingletonStaticInner();
    }
}
