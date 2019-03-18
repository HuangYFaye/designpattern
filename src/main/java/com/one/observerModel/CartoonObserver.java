package com.one.observerModel;
/**
  * @ClassName: ConcreteObserver
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/1/18
  * @version V1.0
*/
    
public class CartoonObserver implements Observer {

    @Override
    public void update(Subject subject, Object date) {
        System.out.println("我是" + subject.getClass().getSimpleName()+", "+date+"别看漫画了");
    }
}
