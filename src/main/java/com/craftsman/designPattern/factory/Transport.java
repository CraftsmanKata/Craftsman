package com.craftsman.designPattern.factory;

abstract class Transport {

    public abstract  int getDistance();
    public abstract  String getSource();
    public abstract  String getDestination();

    @Override
    public String toString(){
        return "Source : "+this.getSource()+" ,Destination : "+this.getDestination();
    }
}
