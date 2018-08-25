package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午8:35
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        CardFactory cardFactory = new RedCardFactory();
        Card card = cardFactory.createCard();
        card.color();
    }
}
