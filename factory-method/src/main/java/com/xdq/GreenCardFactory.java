package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午8:33
 * Description:
 **/
public class GreenCardFactory implements CardFactory {
    public Card createCard() {
        return new GreenCard();
    }
}
