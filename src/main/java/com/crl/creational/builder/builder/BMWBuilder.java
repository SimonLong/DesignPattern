package com.crl.creational.builder.builder;

import com.crl.creational.builder.model.BMWModel;
import com.crl.creational.builder.model.CarModel;

import java.util.ArrayList;

public class BMWBuilder extends CarBuilder {

    private BMWModel bmw = new BMWModel();

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }
}

