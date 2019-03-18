package com.one.factory.abstractFactory;
/**
  * @ClassName: AbstractFactoryTest
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/13
  * @version V1.0
*/
    
public class AbstractFactoryTest {
    public static void main(String[] args) {
        GPCourseFactory factory = new GPCourseFactory();
        factory.JavaCourse().record();
    }
}
