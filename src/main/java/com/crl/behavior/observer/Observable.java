package com.crl.behavior.observer;

import java.util.Vector;

/**
 * 被观察者
 * Created by caorl on 2020/9/5.
 */
public abstract class Observable {

    //定义观察者数组
    private Vector<Observer> observers = new Vector<Observer>();

    public void addObserver(Observer o){
        this.observers.add(o);
    }
    public void delObserver(Observer o){
        this.observers.remove(o);
    }
    public void notifyObservers(){
        for (Observer o:observers){
            o.update();
        }
    }

}
