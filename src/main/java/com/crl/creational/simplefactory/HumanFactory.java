package com.crl.creational.simplefactory;

/**
 * Created by caorl on 2018/7/1.
 */
public class HumanFactory {


    public static  <T extends Human> T createHuman(Class<T> clz){
        Human human=null;
        try {
            human = (T)Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("生产错误");
        }
        return (T)human;
    }
}
