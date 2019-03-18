package com.one.factory.factoryMethod;

/**
  * @ClassName: JavaCourse
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/13
  * @version V1.0
*/
    
public class JavaCourse implements ICourse {
    @Override
    public void record() {
        System.out.println("录制JAVA课程！");
    }
}
