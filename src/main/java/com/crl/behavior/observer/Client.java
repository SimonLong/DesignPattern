package com.crl.behavior.observer;

import com.crl.behavior.observer.impl.HanFeiZi;
import com.crl.behavior.observer.impl.LiSiObserver;
import com.crl.behavior.observer.impl.LiuSiObserver;
import com.crl.behavior.observer.impl.WangSiObserver;

/**
 * Created by caorl on 2020/9/5.
 */
public class Client {

    public static void main(String[] args){
        HanFeiZi hanFeiZi = new HanFeiZi();
        hanFeiZi.addObserver(new LiSiObserver());
        hanFeiZi.addObserver(new WangSiObserver());
        hanFeiZi.addObserver(new LiuSiObserver());
        hanFeiZi.haveBreakfast();
        hanFeiZi.haveFun();
    }
}
