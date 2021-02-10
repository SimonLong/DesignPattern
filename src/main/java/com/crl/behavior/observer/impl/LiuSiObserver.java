package com.crl.behavior.observer.impl;

import java.util.Observable;
import java.util.Observer;


/**
 * Created by caorl on 2020/9/5.
 */
public class LiuSiObserver implements Observer {
    /*public void update() {

    }*/

    public void update(Observable o, Object arg) {
        System.out.println("刘斯收到");
    }
}
