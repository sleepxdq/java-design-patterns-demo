package com.xdq;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午7:23
 * Description:
 **/
public class SingletonTest {

    @Test
    public void test(){
        SingletonStaticInner singleton1 = SingletonStaticInner.getInstance();
        SingletonStaticInner singleton2 = SingletonStaticInner.getInstance();

        Assert.assertEquals(singleton1, singleton2);
    }
}
