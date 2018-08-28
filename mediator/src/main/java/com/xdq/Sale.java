package com.xdq;

import java.util.Random;

/**
 * Author: 徐东强
 * Date: 2018/8/28 下午2:44
 * Description: 销售管理
 **/
public class Sale extends AbstractColleague {

    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    /**
     * 销售IBM型号的电脑
     * @param number
     */
    public void sellIBMComputer(int number){
        System.out.println("销售IBM电脑"+number+"台");
        super.mediator.execute(Constants.SALE_SELL, number);
    }

    /**
     * 反馈销售情况,0——100之间变化，0代表根本就没人卖，100代表非常畅销，出1一个卖一个
     * @return
     */
    public int getSaleStatus(){
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为："+saleStatus);
        return saleStatus;
    }

    /**
     * 折价处理
     */
    public void offSale(){
        super.mediator.execute(Constants.SALE_OFFSELL);
    }
}
