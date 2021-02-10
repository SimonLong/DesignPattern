package com.crl.structural.facade;

/**
 * Created by caorl on 2020/9/8.
 */
public class Client {

    public static void main(String[] args){
        Facade facade = new Facade();
        facade.methodA();
        facade.methodD();
    }
}
