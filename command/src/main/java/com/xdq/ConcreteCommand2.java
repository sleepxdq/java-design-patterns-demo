package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/31 上午8:56
 * Description:
 **/
public class ConcreteCommand2 extends Command {

    private Receiver receiver;

    public ConcreteCommand2(Receiver receiver) {
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
