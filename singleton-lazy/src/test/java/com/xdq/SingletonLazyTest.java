package com.xdq;

import org.junit.Assert;
import org.junit.Test;


/**
 * Author: 徐东强
 * Date: 2018/8/25 下午6:47
 * Description:
 **/
public class SingletonLazyTest {

    @Test
    public void test(){
        SingletonLazyThreadSafe singleton1 = SingletonLazyThreadSafe.getInstance();
        SingletonLazyThreadSafe singleton2 = SingletonLazyThreadSafe.getInstance();

        Assert.assertEquals(singleton1, singleton2);
    }
}
