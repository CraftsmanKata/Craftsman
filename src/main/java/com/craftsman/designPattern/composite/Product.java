package com.craftsman.designPattern.composite;

import com.craftsman.designPattern.composite.interfaces.component;

public class Product implements component {

    private double totalPrice;

    public Product(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public double getTotalPrice() {
        return this.totalPrice;
    }
}
