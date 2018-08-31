package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/31 上午8:57
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        //声明调用者
        Invoker invoker = new Invoker();

        //命令接受者
        Receiver receiver = new ConcreteReceiver1();
        //定义命令
        Command command = new ConcreteCommand1(receiver);

        invoker.setCommand(command);
        invoker.action();
    }
}
