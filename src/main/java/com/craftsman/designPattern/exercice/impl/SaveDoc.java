package com.craftsman.designPattern.exercice.impl;

import com.craftsman.designPattern.exercice.interfaces.SaveStrategy;

public class SaveDoc implements SaveStrategy {

    @Override
    public String save(String docName) {
        return docName+".doc";
    }
}
