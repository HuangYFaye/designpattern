package com.one.factory.abstractFactory;

import com.one.factory.factoryMethod.ICourse;
import com.one.factory.factoryMethod.JavaCourse;

/**
  * @ClassName: JavaCourseFactory
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/3/13
  * @version V1.0
*/
    
public class GPCourseFactory implements ICourseFactory {

    @Override
    public ICourse JavaCourse() {
        return new com.one.factory.abstractFactory.JavaCourse();
    }
}
