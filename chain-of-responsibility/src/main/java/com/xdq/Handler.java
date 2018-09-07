package com.xdq;

import java.util.Objects;

/**
 * Author: 徐东强
 * Date: 2018/9/6 下午2:23
 * Description:
 **/
public abstract class Handler {
    //责任传递，下一任责任人
    private Handler nextHandler;


    public final Response handleMessage(Request request){
        Response response = null;
        if (Objects.equals(this.getHandlerLevel(),request.getRequestLevel())){
            response = this.echo(request);
        }else {
            if (Objects.nonNull(nextHandler)){//如果有后续人，继续执行
                response = this.nextHandler.handleMessage(request);
            }else {
                System.out.println("没有责任人了");
            }
        }
        return response;
    }

    public void setNext(Handler handler){
        this.nextHandler = handler;
    }

    /**
     * 每个处理者都有一个级别
     * @return
     */
    protected abstract Level getHandlerLevel();

    /**
     * 每个处理者都要实现处理任务
     * @param request
     */
    protected abstract Response echo(Request request);
}
