package com.one.eventDelegation;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: Notifier
 * @Description: 通知者的抽象类
 * @date 2019/1/18
 */

public abstract class Notifier {

    EventHandler eventHandler = new EventHandler();

    public EventHandler getEventHandler() {
        return eventHandler;
    }

    public void setEventHandler(EventHandler eventHandler) {
        this.eventHandler = eventHandler;
    }

    public abstract void addListener(Object object,String methodName,Object...args);

    public abstract void notifyX();
}
