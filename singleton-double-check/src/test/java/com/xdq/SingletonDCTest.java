package com.xdq;

import org.junit.Assert;
import org.junit.Test;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午7:38
 * Description:
 **/
public class SingletonDCTest {

    @Test
    public void test(){
        SingletonDC singleton1 = SingletonDC.getInstance();
        SingletonDC singleton2 = SingletonDC.getInstance();

        Assert.assertEquals(singleton1,singleton2);
    }
}
