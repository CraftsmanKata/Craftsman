package com.craftsman.designPattern.composite.impl;

import com.craftsman.designPattern.composite.interfaces.Composant;

public class Tracteur implements Composant {

    private int poids;

    public Tracteur(int poids) {
        this.poids = poids;
    }

    @Override
    public int getPoids() {
        return this.poids;
    }
}
