package com.craftsman.designPattern.composite.impl;

import com.craftsman.designPattern.composite.interfaces.Composant;

public class Remorque implements Composant {

        private int poids;

        public Remorque(int poids) {
            this.poids = poids;
        }

        @Override
        public int getPoids() {
            return this.poids;
        }

}

