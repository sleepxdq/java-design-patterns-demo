package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/30 下午4:16
 * Description:
 **/
public class ConcreteCommand1 extends Command {

    private Receiver receiver;

    public ConcreteCommand1(Receiver receiver){
        this.receiver = receiver;
    }

    public void execute() {
        this.receiver.doSomething();
    }
}
