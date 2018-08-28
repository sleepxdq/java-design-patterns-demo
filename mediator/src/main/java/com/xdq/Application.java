package com.xdq;

/**
 * Author: 徐东强
 * Date: 2018/8/28 下午3:14
 * Description:
 **/
public class Application {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();

        //采购人员采购
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMComputer(2);

        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);

        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
