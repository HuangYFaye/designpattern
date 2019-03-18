package com.one.factory.factoryMethod;
/**
  * @ClassName: JavaCourseFactory
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/13
  * @version V1.0
*/
    
public class JavaCourseFactory implements ICourseFactory {
    @Override
    public ICourse create() {
        return (ICourse)new JavaCourse();
    }
}
