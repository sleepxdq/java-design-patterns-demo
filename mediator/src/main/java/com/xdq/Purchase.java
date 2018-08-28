package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/28 下午2:44
 * Description: 采购管理
 **/
public class Purchase extends AbstractColleague{
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    //采购IBM型号的电脑
    public void buyIBMComputer(int number){
        super.mediator.execute(Constants.PURCHASE_BUY, number);
    }

    //不在采购IBM电脑
    public void refuseBuyIBM(){
        System.out.println("不再采购IBM电脑");
    }

}
