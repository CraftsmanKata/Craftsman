package com.craftsman.designPattern.composite.impl;

import com.craftsman.designPattern.composite.interfaces.Composant;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CamionComposite implements Composant {

    private Collection children;

    public CamionComposite() {
        children = new ArrayList();
    }


    public void add(Composant composant){

        children.add(composant);
    }


    public void remove(Composant composant){
        children.remove(composant);
    }

    public Iterator getChildren() {
        return children.iterator();
    }

    @Override
    public int getPoids() {
        int result = 0;
        for (Iterator i = children.iterator(); i.hasNext(); ) {
            Object objet = i.next();

            Composant composant = (Composant)objet;

            result += composant.getPoids();
        }
        return result;
    }

}
