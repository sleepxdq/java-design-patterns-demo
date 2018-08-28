package com.xdq.dynamic;

/**
 * Author: 徐东强
 * Date: 2018/8/28 上午10:34
 * Description:
 **/
public interface IGamePlayer {
    /**
     * 登录
     * @param username
     * @param password
     */
    void login(String username, String password);

    /**
     * 打怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upGrade();
}
