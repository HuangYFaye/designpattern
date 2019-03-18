package com.one.factory.factoryMethod;
/**
  * @ClassName: FactoryMethodTest
  * @Description: 工厂方法会随着产品越多，产生越多的工厂类，导致使用者难理解，但是相对简单工厂模式，它符合了开闭原则
  * @author huangyifei
  * @date 2019/3/13
  * @version V1.0
*/
    
public class FactoryMethodTest {
    public static void main(String[] args) {
        JavaCourseFactory javaCourseFactory = new JavaCourseFactory();
        javaCourseFactory.create().record();
    }
}
