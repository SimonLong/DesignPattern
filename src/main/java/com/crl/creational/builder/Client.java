package com.crl.creational.builder;

import com.crl.creational.builder.builder.BMWBuilder;
import com.crl.creational.builder.builder.BenzBuilder;
import com.crl.creational.builder.model.BMWModel;
import com.crl.creational.builder.model.BenzModel;

import java.util.ArrayList;

/**
 * 使用场景
 * 1. 相同的方法，不同的执行顺序，产生不同的事件结果时，可以采用建造者模式。
 * 2. 多个部件或零件，都可以装配到一个对象中，但是产生的运行结果又不相同时，则可
 * 以使用该模式。
 * 3. 产品类非常复杂，或者产品类中的调用顺序不同产生了不同的效能，这个时候使用建
 * 造者模式非常合适。
 * 4. 在对象创建过程中会使用到系统中的一些其他对象，这些对象在产品对象的创建过程
 * 中不易得到时，也可以采用建造者模式封装该对象的创建过程。该种场景只能是一个补偿方
 * 法，因为一个对象不容易获得，而在设计阶段竟然没有发觉，而要通过创建者模式柔化创建
 * 过程，本身已经违反设计的最初目标。
 */
public class Client {

    public static void main(String[] args) {
        //存放run的顺序
        ArrayList<String> sequence = new ArrayList<String>();
        sequence.add("engine boom"); //客户要求，run的时候先发动引擎
        sequence.add("start"); //启动起来
        sequence.add("stop"); //开了一段就停下来
        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        //奔驰车跑一下看看
        benz.run();
        //按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();

        /*Director director = new Director();
        //1万辆A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        //100万辆B类型的奔驰车
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }
        //1000万辆C类型的宝马车
        for (int i = 0; i < 10000000; i++) {
            director.getCBMWModel().run();
        }*/
    }
}

