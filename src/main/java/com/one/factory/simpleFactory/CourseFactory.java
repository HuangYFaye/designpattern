package com.one.factory.simpleFactory;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: CourseFactory
 * @Description: 简单工厂封装了创造对象的细节，会涉及到一些业务逻辑
 * @date 2019/3/13
 */

public class CourseFactory {

    public ICourse create(Class clazz) {

        try {
            if (clazz != null) {
                return (ICourse) clazz.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
