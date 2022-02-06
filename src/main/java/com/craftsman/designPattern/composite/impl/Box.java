package com.craftsman.designPattern.composite.impl;

import com.craftsman.designPattern.composite.insterfaces.component;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Box implements component {

    private Collection ListProducts;

    public Box() {
        ListProducts = new ArrayList();
    }

    public void add(component product){
        ListProducts.add(product);
    }

    public void remove(component product){
        ListProducts.remove(product);
    }

    public Iterator getProduct() {
        return ListProducts.iterator();
    }

    @Override
    public double getTotalPrice() {
        double result = 0;
        for (Iterator i = ListProducts.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            component product = (component)objet;

            result += product.getTotalPrice();
        }
        return result;
    }


}
