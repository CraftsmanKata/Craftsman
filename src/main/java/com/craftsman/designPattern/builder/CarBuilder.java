package com.craftsman.designPattern.builder;

import com.craftsman.designPattern.builder.interfaces.Builder;

public class CarBuilder implements Builder {

    private Car car;
    private boolean IsTripComputer;
    private boolean hasGPS;

    public CarBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int nbrSeat) {

    }

    @Override
    public void setEngine() {

    }

    @Override
    public void setTripComputer(boolean IsTripComputer) {
        this.IsTripComputer = IsTripComputer;
    }

    @Override
    public void setGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public Car getProduct(){
        this.reset();
        return this.car;
    }
}
