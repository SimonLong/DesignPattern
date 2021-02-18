package com.crl.creational.factory.abstratctfactory.factory;

import com.crl.creational.factory.abstratctfactory.Human;
import com.crl.creational.factory.abstratctfactory.female.FemaleBlackHuman;
import com.crl.creational.factory.abstratctfactory.female.FemaleWhiteHuman;
import com.crl.creational.factory.abstratctfactory.female.FemaleYellowHuman;

public class FemaleFactory implements HumanFactory {
    //生产出黑人女性
    public Human createBlackHuman() {
        return new FemaleBlackHuman();
    }
    //生产出白人女性
    public Human createWhiteHuman() {
        return new FemaleWhiteHuman();
    }
    //生产出黄人女性
    public Human createYellowHuman() {
        return new FemaleYellowHuman();
    }
}

