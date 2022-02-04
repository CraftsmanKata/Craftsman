package com.craftsman.designPattern.builder;

abstract class PizzaBuilder {

    protected Pizza pizza;

    public Pizza getPizza() {
        return pizza;
    }

    public void createNewPizzaProduct() {
        pizza = new Pizza();
    }

    public abstract void buildPate();
    public abstract void buildSauce();
    public abstract void buildContenu();

}
