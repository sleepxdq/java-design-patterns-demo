package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午8:35
 * Description:
 **/
public class Application {

    public static void main(String[] args) throws Exception {
        CardFactory cardFactory = new CardFactoryImpl();
        Card card1 = cardFactory.createCard(CardType.GREEN_CARD);
        card1.color();

        Card card2 = cardFactory.createCard(CardType.RED_CARD);
        card2.color();
    }
}
