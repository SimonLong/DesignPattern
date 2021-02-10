package com.crl.creational.simplefactory;

/**
 * Created by caorl on 2018/7/1.
 */
public class BlackHuman implements Human {

    public void getColor() {
        System.out.println("黑色皮肤");
    }

    public void talk() {
        System.out.println("我来自非洲");
    }
}
