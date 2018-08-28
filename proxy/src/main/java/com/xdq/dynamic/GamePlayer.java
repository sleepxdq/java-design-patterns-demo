package com.xdq.dynamic;

/**
 * Author: 徐东强
 * Date: 2018/8/28 上午10:36
 * Description:
 **/
public class GamePlayer implements IGamePlayer {
    private String name;

    public GamePlayer(String name) {
        this.name = name;
    }

    public void login(String username, String password) {
        System.out.println("登录名为" + username + "的用户" + this.name + "登录游戏");
    }

    public void killBoss() {
        System.out.println(this.name + "打怪");
    }

    public void upGrade() {
        System.out.println(this.name + "升级");
    }
}
