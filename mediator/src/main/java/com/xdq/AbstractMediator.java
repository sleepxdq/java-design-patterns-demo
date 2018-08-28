package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/28 下午2:42
 * Description: 中介者抽象类
 **/
public abstract class AbstractMediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public AbstractMediator(){
        this.purchase = new Purchase(this);
        this.sale = new Sale(this);
        this.stock = new Stock(this);
    }

    /**
     * 中介者模式核心方法，处理多个对象之间的关系
     * @param str
     * @param objects
     */
    public abstract void execute(String str, Object... objects);

}
