package com.one.strategy;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: StrategyTest
 * @Description: 策略模式（商场打折活动）
 * @date 2019/4/17
 */

public class StrategyTest {

    //总价、当前打折活动、商品总价
    public static void main(String[] args) {
        Stroe stroe;
        float total;

        stroe = new Stroe(new NewYear());
        total = stroe.doCount(100);
        System.out.println(total);

        stroe = new Stroe(new Normal());
        total = stroe.doCount(100);
        System.out.println(total);
    }
}
