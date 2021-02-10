package com.crl.behavior.observer.impl;

//import com.crl.behavior.observer.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by caorl on 2020/9/5.
 */
public class LiSiObserver implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("李斯收到");
    }
    /*public void update() {
        System.out.println("李斯收到");
    }*/
}
