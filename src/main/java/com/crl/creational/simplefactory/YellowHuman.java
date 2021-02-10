package com.crl.creational.simplefactory;

/**
 * Created by caorl on 2018/7/1.
 */
public class YellowHuman implements Human {

    public void getColor() {
        System.out.println("黃色皮肤");
    }

    public void talk() {
        System.out.println("我来自亚洲");
    }
}
