package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/9/6 下午6:14
 * Description:
 **/
public class Decorator extends Component {

    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    private void method1(){
        System.out.println("装饰下");
    }

    @Override
    public void operate() {
        this.method1();
        this.component.operate();
    }
}
