package com.craftsman.designPattern.exercice.impl;

import com.craftsman.designPattern.exercice.interfaces.SaveStrategy;

public class SavePDF implements SaveStrategy {
    @Override
    public String save(String docName) {
        return docName+".pdf";
    }
}
