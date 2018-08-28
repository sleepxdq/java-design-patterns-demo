package com.xdq;

import java.util.HashMap;
import java.util.Map;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午8:48
 * Description: 工厂的实现类
 **/
public class CardFactoryImpl implements CardFactory {

    private static Map<CardType,Card> map = new HashMap<CardType, Card>();

    /**
     * 根据type创建对于的对象
     * @param cardType
     * @return
     * @throws Exception
     */
    public Card createCard(CardType cardType) throws Exception {
        if (!map.containsKey(cardType)){
            throw new Exception("无此类型的card");
        }
        return map.get(cardType);
    }

    static {
        map.put(CardType.GREEN_CARD, new GreenCard());
        map.put(CardType.RED_CARD, new RedCard());
    }
}
