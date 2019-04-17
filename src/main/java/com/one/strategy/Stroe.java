package com.one.strategy;
/**
  * @ClassName: Stroe
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/4/17
  * @version V1.0
*/
    
public class Stroe {

    private Counter counter;

    public Stroe(Counter counter) {
        this.counter = counter;
    }

    public float doCount(float price) {
        return this.counter.count(price);
    }
}
