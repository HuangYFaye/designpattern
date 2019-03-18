package com.one.eventDelegation;

import java.lang.reflect.Method;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: Event
 * @Description: 对事件的封装，基本上是反射调用需要的元素
 * @date 2019/1/18
 */

public class Event {
    private Object object;
    private String methodName;
    private Object[] params;
    private Class[] paramTypes;


    public Event(Object object, String methodName, Object[] params) {
        this.object = object;
        this.methodName = methodName;
        this.params = params;
        contractParamTypes(params);
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getParamTypes() {
        return paramTypes;
    }

    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++){
            this.paramTypes[i] = params[i].getClass();
        }
    }

    /**
     * 触发反射的方法
     * @throws Exception
     */
    public void invoke() throws Exception {
        //通过方法名、参数类型寻找类里的方法
        Method method = object.getClass().getMethod(this.getMethodName(),this.getParamTypes());
        if (null == method) {
            return;
        }
        //通过实例、参数调用方法
        method.invoke(this.getObject(), this.getParams());
    }
}
