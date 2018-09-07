package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/9/7 上午10:20
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        Context context = new Context(new ConcreteStrategy1());
        context.execute();

        context.changeStrategy(new ConcreteStrategy2());
        context.execute();

        context.changeStrategy(new ConcreteStrategy3());
        context.execute();
    }
}
