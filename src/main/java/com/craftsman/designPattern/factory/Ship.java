package com.craftsman.designPattern.factory;

public class Ship extends Transport{

    private int milleMarin;
    private String source;
    private String destination;

    public Ship (int milleMarin, String source, String destination){
        this.milleMarin = milleMarin;
        this.source = source;
        this.destination = destination;
    }


    @Override
    public int getDistance() {
        return this.milleMarin;
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
        return super.toString() + " ,le mille Marin : "+this.milleMarin;
    }
}
