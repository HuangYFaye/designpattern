package com.one.observerModel;
/**
  * @ClassName: Bootstrap
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/1/18
  * @version V1.0
*/

/**
 * 优点:
 * 很好地解耦了通知者与观察者，观察者不需要了解通知者内部是怎样实现的，方便于日后代码的修改，体现了 依赖倒转的原则。
 *
 * 缺点:
 * 抽象通知者还是依赖了抽象观察者，当没有观察者的时候，没办法更新
 * 要求观察者的所有动作 必须一样 ，如果不一样的话，不能实现
 */
public class Bootstrap {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();//被观察者实现对象
        CartoonObserver cartoonObserver = new CartoonObserver();//观察者实现对象A
        ConcreteObserver concreteObserver = new ConcreteObserver();//观察者实现对象B

        concreteSubject.addObserver(concreteObserver);
        concreteSubject.addObserver(cartoonObserver);

        concreteSubject.notifyAllObserver("老师来了");
    }
}
