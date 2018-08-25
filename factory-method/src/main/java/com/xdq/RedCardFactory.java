package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午8:30
 * Description:
 **/
public class RedCardFactory implements CardFactory {
    public Card createCard() {
        return new RedCard();
    }
}
