package com.one.factory.simpleFactory;
/**
  * @ClassName: simpleFactoryTest
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/13
  * @version V1.0
*/
    
public class simpleFactoryTest {
    public static void main(String[] args) {
        CourseFactory factory = new CourseFactory();
        ICourse course = factory.create(JavaCourse.class);

        course.record();
    }
}
