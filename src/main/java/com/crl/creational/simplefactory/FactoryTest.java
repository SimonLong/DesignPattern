package com.crl.creational.simplefactory;

/**
 * 简单工厂模式
 * 使用场景：数据库连接会有多种等
 * 优点：使用简单，
 * 缺点：扩展上比较困难
 * Created by caorl on 2018/7/1.
 */
public class FactoryTest {


    public static void main(String[] args){
        BlackHuman blackHuman = HumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        WhiteHuman whiteHuman = HumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        YellowHuman yellowHuman = HumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}
