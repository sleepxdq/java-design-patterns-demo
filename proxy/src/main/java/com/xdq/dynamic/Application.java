package com.xdq.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Author: 徐东强
 * Date: 2018/8/28 上午10:44
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        GamePlayer player = new GamePlayer("李四");
        InvocationHandler handler = new GamePlayerIH(player);

        ClassLoader classLoader = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) Proxy.newProxyInstance(classLoader, player.getClass().getInterfaces(), handler);

        proxy.login("lisi", "123");
        proxy.killBoss();
        proxy.upGrade();
    }
}
