# 责任链模式
---
### 模型图

![模型图（来源wikipedia）](https://upload.wikimedia.org/wikipedia/commons/6/6a/W3sDesign_Chain_of_Responsibility_Design_Pattern_UML.jpg)

### 定义
它包含了一些命令对象和一系列的处理对象。每一个处理对象决定它能处理哪些命令对象，它也知道如何将它不能处理的命令对象传递给该链中的下一个处理对象。该模式还描述了往该处理链的末尾添加新的处理对象的方法
### 解释
1. Handler 是抽象处理者
代码：
```
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
```
抽象的处理者实现三个指责：
>1. 定义一个请求处理的方法handleMessage(),
唯一对外开放；
>2. 定义一个链的编排方法hasNext方法，设置下一个执行者；
>3. 定义实现具体类需要实现的方法
### 优点
很明显的会将请求和处理分开，解耦
### 缺点
性能问题：每一个请求都得从头开始
