package com.craftsman.designPattern.factory;

public class Truck extends Transport {

    private int kilometrage;
    private String source;
    private String destination;

    public Truck (int kilometrage, String source, String destination){
        this.kilometrage = kilometrage;
        this.source = source;
        this.destination = destination;
    }


    @Override
    public int getDistance() {
        return this.kilometrage;
    }

    @Override
    public String getSource() {
        return this.source;
    }

    @Override
    public String getDestination() {
        return this.destination;
    }

    @Override
    public String toString(){
        return super.toString() + " ,kilometrage : "+this.kilometrage;
    }
}
