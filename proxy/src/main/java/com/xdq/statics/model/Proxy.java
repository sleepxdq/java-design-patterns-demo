package com.xdq.statics.model;

/**
 * Author: 徐东强
 * Date: 2018/8/28 上午10:41
 * Description:
 **/
public class Proxy implements Subject {

    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    public void request() {
        this.before();
        this.subject.request();
        this.after();
    }

    /**
     * 预处理
     */
    private void before(){

    }

    /**
     * 后续处理
     */
    private void after(){

    }
}
