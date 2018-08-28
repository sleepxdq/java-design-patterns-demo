package com.xdq.statics;

import com.xdq.statics.demo.GamePlayer;
import com.xdq.statics.demo.GamePlayerProxy;
import com.xdq.statics.demo.IGamePlayer;

/**
 * Author: 徐东强
 * Date: 2018/8/28 上午10:05
 * Description:
 **/
public class App {

    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);

        proxy.login("zhangsan", "123456");
        proxy.killBoss();
        proxy.upGrade();
    }
}
