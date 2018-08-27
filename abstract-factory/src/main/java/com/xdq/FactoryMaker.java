package com.xdq;

import java.util.Optional;

/**
 * Author: 徐东强
 * Date: 2018/8/27 下午5:06
 * Description:
 **/
public class FactoryMaker {

     public static Optional<Creator> make(CreatorType type){
         switch (type){
             case ONE:
                 return Optional.of(new Creator1());
             case TWO:
                 return Optional.of(new Creator2());
                 default:
                     return Optional.empty();
         }
     }
}
