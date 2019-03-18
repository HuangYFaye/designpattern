package com.one.observerModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author huangyifei
 * @version V1.0
 * @ClassName: ConcreteSubject
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2019/1/18
 */

public class ConcreteSubject implements Subject {

    List<Observer> mlist = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {

        if (observer == null) {
            throw new NullPointerException("observer == null");
        }
        if (!mlist.contains(observer)) {
            mlist.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        mlist.remove(observer);
    }

    @Override
    public void removeAll() {
        mlist.clear();
    }

    @Override
    public void notifyAllObserver(Object data) {
        for (Observer observer : mlist) {
            observer.update(this, data);
        }
    }

    @Override
    public void notify(Observer observer, Object data) {
        observer.update(this, data);
    }
}
