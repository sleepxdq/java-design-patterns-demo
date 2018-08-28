package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/25 下午8:24
 * Description: 工厂接口
 **/
public interface CardFactory {

    /**
     * 创建对象
     * @param cardType
     * @return
     * @throws Exception
     */
    Card createCard(CardType cardType) throws Exception;
}
