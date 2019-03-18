package com.one.observerModel;

public interface Subject {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void removeAll();

    void notifyAllObserver(Object data);

    void notify(Observer observer, Object data);
}
