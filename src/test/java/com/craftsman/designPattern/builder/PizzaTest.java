package com.craftsman.designPattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PizzaTest {


    @Test
    void TestPizzaHawaienneBuilder(){

        Serveur serveur = new Serveur();
        PizzaBuilder pizzaHawaienneBuilder = new PizzaHawaienneBuilder();

        serveur.setPizzaBuilder( pizzaHawaienneBuilder);
        serveur.constructPizza();

        Pizza pizza = serveur.getPizza();
        System.out.println(pizza);

        assertEquals(pizza.toString(),"Pizza [pate=moelleuse, sauce=douce, contenu=jambon+ananas]");
    }

    @Test
    void TestPizzaNorvegienneBuilder(){

        Serveur serveur = new Serveur();
        PizzaBuilder pizzaNorvegienneBuilder = new PizzaNorvegienneBuilder();
        serveur.setPizzaBuilder( pizzaNorvegienneBuilder);
        serveur.constructPizza();

        Pizza pizza = serveur.getPizza();
        assertEquals(pizza.toString(),"Pizza [pate=cuite, sauce=huile d'olive, contenu=saumon+mozzarella]");
    }
}