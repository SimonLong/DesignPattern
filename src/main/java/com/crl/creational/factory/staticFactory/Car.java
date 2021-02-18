package com.crl.creational.factory.staticFactory;

/**
 * 总的来说，静态工厂模式便是把创建实例的任务由使用方移到了提供方，基于提供方比使用方更了解自己的事实，
 * 这可以使对象的创建更加合理和可控。在实际生产时，我们应该优先考虑通过静态工厂模式获取实例。
 * 
 */
public class Car {

    public static Car getBus(){
        return new Bus();
    }
    public static Car getTaxi(){
        return new Taxi();
    }
}
