package com.one.proxy;
/**
  * @ClassName: XieMu
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/18
  * @version V1.0
*/

public class XieMu implements Person{

    public void findLove(){
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("胸大，6块腹肌");

    }

    @Override
    public void zufangzi() {
        System.out.println("租房子");
    }

    @Override
    public void buy() {
        System.out.println("买东西");
    }

    @Override
    public void findJob() {
        System.out.println("月薪20K-50k");
        System.out.println("找工作");
    }
}
