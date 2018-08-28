package com.xdq;


/**
 * Author: 徐东强
 * Date: 2018/8/28 下午2:47
 * Description:
 **/
public class Mediator extends AbstractMediator {

    /**
     * 实现核心方法
     * @param str
     * @param objects
     */
    public void execute(String str, Object... objects) {
        if (str.equalsIgnoreCase(Constants.PURCHASE_BUY)){
            this.buyComputer((Integer) objects[0]);
        } else if (str.equalsIgnoreCase(Constants.SALE_SELL)){
            this.sellComputer((Integer) objects[0]);
        } else if (str.equalsIgnoreCase(Constants.SALE_OFFSELL)){
            this.offSell();
        }else if (str.equalsIgnoreCase(Constants.STOCK_CLEAR)){
            this.clearStock();
        }
    }

    /**
     * 采购电脑
     * @param number
     */
    private void buyComputer(int number){
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80){
            //买到比较好
            System.out.println("采购IBM电脑:"+number + "台");
            super.stock.increase(number);
        } else {
            //销售不太好，折半采购
            int buyNumber = number/2;
            super.stock.increase(buyNumber);
            System.out.println("采购IBM电脑："+buyNumber+ "台");

        }
    }

    /**
     * 销售电脑
     * @param number
     */
    private void sellComputer(int number){
        int stockNumber = super.stock.getStockNumber();
        if (stockNumber<number){
            super.purchase.buyIBMComputer(number - stockNumber);
        }
        super.stock.decrease(number);
    }

    /**
     * 折价销售
     */
    private void offSell(){
        System.out.println("折价销售IBM电脑"+stock.getStockNumber()+"台");
    }

    /**
     * 清仓
     */
    private void clearStock(){
        //要求清仓销售
        super.sale.offSale();
        //要求采购人员不要采购
        super.purchase.refuseBuyIBM();
    }
}
