package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/28 下午2:48
 * Description:
 **/
public abstract class AbstractColleague {

    protected AbstractMediator mediator;

    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
