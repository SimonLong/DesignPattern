package com.crl.creational.factory.abstratctfactory.factory;

import com.crl.creational.factory.abstratctfactory.Human;
import com.crl.creational.factory.abstratctfactory.male.MaleBlackHuman;
import com.crl.creational.factory.abstratctfactory.male.MaleWhiteHuman;
import com.crl.creational.factory.abstratctfactory.male.MaleYellowHuman;

public class MaleFactory implements HumanFactory {
    //生产出黑人男性
    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }
    //生产出白人男性
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }
    //生产出黄人男性
    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
