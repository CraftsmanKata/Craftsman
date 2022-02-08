package com.craftsman.designPattern.factory;

public class TransportFactory {

    public static Transport getTransport(String type, int distance,String source, String destination){

        if("Truck".equalsIgnoreCase(type)) return new Truck(distance,source,destination);
        else if("Ship".equalsIgnoreCase(type)) return new Ship(distance,source,destination);

        return null;
    }
}
