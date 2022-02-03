package com.craftsman.designPattern.builder.interfaces;

public interface Builder {

    void reset();
    void setSeats(int nbrSeats);
    void setEngine();
    void setTripComputer(boolean IsTripComputer);
    void setGPS(boolean hasGPS);
}
