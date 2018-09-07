package com.xdq;


/**
 * Author: 徐东强
 * Date: 2018/9/6 上午11:59
 * Description:
 **/
public class Client {

    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        //设置顺序
        handler1.setNext(handler2);
        handler2.setNext(handler3);

        //返回执行结果
        Response response = handler1.handleMessage(new Request());

    }
}
