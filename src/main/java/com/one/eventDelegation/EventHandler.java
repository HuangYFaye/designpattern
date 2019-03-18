package com.one.eventDelegation;

import java.util.ArrayList;
import java.util.List;

/**
  * @ClassName: EventHandler
  * @Description: TODO(这里用一句话描述这个类的作用)
  * @author huangyifei
  * @date 2019/1/18
  * @version V1.0
*/
    
public class EventHandler {

    //事件池
    private List<Event> objects;

    public EventHandler() {
        objects = new ArrayList<Event>();
    }

    /**
     *
     * @param object
     * @param methodName
     * @param args
     */
    public void addEvent(Object object,String methodName,Object...args){
        objects.add(new Event(object,methodName,args));
    }

    public void notifyX() throws Exception {
        for (Event e : objects) {
            e.invoke();
        }
    }

}
