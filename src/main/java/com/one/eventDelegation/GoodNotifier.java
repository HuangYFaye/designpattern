package com.one.eventDelegation;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: GoodNotifier
 * @Description: 通知者的具体实现
 * @date 2019/1/18
 */

public class GoodNotifier extends Notifier {


    @Override
    public void addListener(Object object, String methodName, Object... args) {
        EventHandler handler = this.getEventHandler();
        handler.addEvent(object, methodName, args);
    }

    @Override
    public void notifyX() {
        System.out.println("尽职尽责的放哨人告诉所有需要帮忙的同学：老师来了");
        EventHandler handler = this.getEventHandler();
        try {
            handler.notifyX();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
