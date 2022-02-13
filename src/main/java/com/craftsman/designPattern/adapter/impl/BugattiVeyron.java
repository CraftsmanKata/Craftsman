package com.craftsman.designPattern.adapter.impl;

import com.craftsman.designPattern.adapter.interfaces.Movable;

public class BugattiVeyron implements Movable {

    @Override
    public double getSpeed() {
        return 268;
    }
}
