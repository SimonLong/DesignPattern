package com.crl.behavior.observer.impl;

import com.crl.behavior.observer.IHanFeiZi;

import java.util.Observable;
//import com.crl.behavior.observer.Observable;

/**
 * Created by caorl on 2020/9/5.
 */
public class HanFeiZi extends Observable implements IHanFeiZi {

    public void haveBreakfast() {
        System.out.println("韩非子吃饭");
        super.setChanged();
        super.notifyObservers();
    }

    public void haveFun() {
        System.out.println("韩非子娱乐");
        super.setChanged();
        super.notifyObservers();
    }
}
