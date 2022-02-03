package com.craftsman.designPattern.builder;

import com.craftsman.designPattern.builder.interfaces.Builder;

public class Director {

    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder = builder;
    }

    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setEngine();
        builder.setGPS(true);
        builder.setSeats(6);
        builder.setTripComputer(true);
    }

    public void constructSUV(Builder builder){
        builder.reset();
        builder.setEngine();
        builder.setGPS(false);
        builder.setSeats(6);
        builder.setTripComputer(false);
    }
}
