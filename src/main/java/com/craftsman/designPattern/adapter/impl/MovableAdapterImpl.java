package com.craftsman.designPattern.adapter.impl;

import com.craftsman.designPattern.adapter.interfaces.Movable;
import com.craftsman.designPattern.adapter.interfaces.MovableAdapter;

public class MovableAdapterImpl implements MovableAdapter {
    private Movable luxuryCars;

    public MovableAdapterImpl(Movable bugattiVeyron) {
        this.luxuryCars=bugattiVeyron;
    }

    @Override
    public double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private double convertMPHtoKMPH(double mph) {
        return mph * 1.60934;
    }
}
