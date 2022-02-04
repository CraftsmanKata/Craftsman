package com.craftsman.designPattern.exercice;

import com.craftsman.designPattern.exercice.interfaces.SaveStrategy;

public class Context {

    private SaveStrategy saveStrategy;

    public void setSaveStrategy(SaveStrategy saveStrategy){
        this.saveStrategy = saveStrategy;
    }

    public String save(String name){
        return saveStrategy.save(name);
    }
}
