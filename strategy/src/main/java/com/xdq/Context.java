package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/9/7 上午10:06
 * Description:
 **/
public class Context{
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void changeStrategy(Strategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        this.strategy.execute();
    }
}
