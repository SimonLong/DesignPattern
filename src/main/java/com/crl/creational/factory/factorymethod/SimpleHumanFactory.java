package com.crl.creational.factory.factorymethod;

public class SimpleHumanFactory {

    public static  <T extends Human> T createHuman(Class<T> c){
//定义一个生产的人种
        Human human=null;
        try {
//产生一个人种
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            System.out.println("人种生成错误！");
        }
        return (T)human;
    }
}
