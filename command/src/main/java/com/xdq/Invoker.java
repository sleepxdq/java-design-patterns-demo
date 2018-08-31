package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/31 上午8:58
 * Description:
 **/
public class Invoker {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void action(){
        this.command.execute();
    }
}
