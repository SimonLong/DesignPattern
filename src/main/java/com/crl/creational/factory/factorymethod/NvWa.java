package com.crl.creational.factory.factorymethod;

public class NvWa {
    public static void main(String[] args) {
//        AbstractHumanFactory YinYangLu = new HumanFactory();
//        System.out.println("--造出的第一批人是白色人种--");
//        Human whiteHuman = YinYangLu.createHuman(WhiteHuman.class);
        WhiteHuman whiteHuman = SimpleHumanFactory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("\n--造出的第二批人是黑色人种--");
//        Human blackHuman = YinYangLu.createHuman(BlackHuman.class);
        BlackHuman blackHuman = SimpleHumanFactory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("\n--造出的第三批人是黄色人种--");
//        Human yellowHuman = YinYangLu.createHuman(YellowHuman.class);
        YellowHuman yellowHuman = SimpleHumanFactory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}

