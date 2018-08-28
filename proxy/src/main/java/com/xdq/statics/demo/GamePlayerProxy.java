package com.xdq.statics.demo;

/**
 * Author: 徐东强
 * Date: 2018/8/28 上午10:36
 * Description: 代理
 **/
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer player;

    public GamePlayerProxy(IGamePlayer player) {
        this.player = player;
    }

    public void login(String username, String password) {
        this.player.login(username, password);
    }

    public void killBoss() {
        this.player.killBoss();
    }

    public void upGrade() {
        this.player.upGrade();
    }
}
