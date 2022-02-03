package com.craftsman.designPattern.builder;

public class ExempleApplication {


    public void makeCar(){
       Director director = new Director();

        CarBuilder builder = new CarBuilder();
        director.constructSportsCar(builder);
        Car car = builder.getProduct();

        ManualBuilder builderManual = new ManualBuilder();
        director.constructSportsCar(builderManual);
        Manual manual = builderManual.getProduct();
    }
}
