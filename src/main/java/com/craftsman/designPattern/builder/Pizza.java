package com.craftsman.designPattern.builder;

public class Pizza {

    private String pate = "";
    private String sauce = "";
    private String contenu = "";

    public void setPate(String pate){
        this.pate = pate;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    @Override
    public String toString() {
        return "Pizza [pate=" + pate + ", sauce=" + sauce + ", contenu=" + contenu + "]";
    }

}
