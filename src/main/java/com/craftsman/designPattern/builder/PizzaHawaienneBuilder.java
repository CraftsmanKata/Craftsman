package com.craftsman.designPattern.builder;

public class PizzaHawaienneBuilder extends PizzaBuilder {

    public void buildPate() {
        pizza.setPate("moelleuse");
    }

    public void buildSauce() {
        pizza.setSauce("douce");
    }

    public void buildContenu() {
        pizza.setContenu("jambon+ananas");
    }
}
