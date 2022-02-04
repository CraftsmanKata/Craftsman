package com.craftsman.designPattern.builder;

public class PizzaNorvegienneBuilder extends PizzaBuilder {
    public void buildPate() {
        pizza.setPate("cuite");
    }

    public void buildSauce() {
        pizza.setSauce("huile d'olive");
    }

    public void buildContenu() {
        pizza.setContenu("saumon+mozzarella");
    }
}
