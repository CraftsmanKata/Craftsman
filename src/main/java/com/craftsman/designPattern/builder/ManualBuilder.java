package com.craftsman.designPattern.builder;

import com.craftsman.designPattern.builder.interfaces.Builder;

public class ManualBuilder implements Builder {

    private Manual manual;
    private int nbrSeat;

    public ManualBuilder (){
        this.reset();
    }

    @Override
    public void reset() {

    }

    @Override
    public void setSeats(int nbrSeats) {
        this.nbrSeat = nbrSeats;
    }

    @Override
    public void setEngine() {

    }

    @Override
    public void setTripComputer() {

    }

    @Override
    public void setGPS() {

    }

    public Manual getProduct(){
        this.reset();
        return manual;
    }
}
