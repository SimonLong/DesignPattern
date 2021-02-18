package com.crl.creational.builder.builder;

import com.crl.creational.builder.model.BenzModel;
import com.crl.creational.builder.model.CarModel;

import java.util.ArrayList;

public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public CarModel getCarModel() {
        return this.benz;
    }

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }
}
