package com.one.strategy;
/**
  * @ClassName: Normal
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/4/17
  * @version V1.0
*/
    
public class Normal implements Counter{
    @Override
    public float count(float price) {
        return price;
    }
}
