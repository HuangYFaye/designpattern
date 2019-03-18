package com.one.proxy;

import java.lang.reflect.Method;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: MeiPo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/3/18
 */

public class MeiPo implements GPInvocationHandler {

    Person target;

    public Object getInstance(Person target) throws Exception {
        this.target = target;
        return GPJDKProxy.newProxyInstance(target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("我是媒婆");
        method.invoke(this.target, args);
        System.out.println("开始寻找");
        System.out.println("开始办事");
        return null;
    }
}
