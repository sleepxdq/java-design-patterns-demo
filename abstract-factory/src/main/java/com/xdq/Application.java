package com.xdq;

import java.util.Optional;

/**
 * Author: 徐东强
 * Date: 2018/8/27 下午5:06
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        Optional<Creator> make1 = FactoryMaker.make(CreatorType.ONE);

        if (make1.isPresent()){
            Creator creator1 = make1.get();
            AbstractProductA productA = creator1.createdProductA();
            productA.doSomething();
            AbstractProductB productB = creator1.createdProductB();
            productB.doSomething();
        }


    }

}
