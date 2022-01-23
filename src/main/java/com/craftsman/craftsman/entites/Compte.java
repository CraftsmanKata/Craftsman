package main.java.com.craftsman.craftsman.entites;

import java.util.Date;

public class Compte {

    private Long code;
    private double solde;
    private Date dateCreation;
    private String type;

    public Compte(Long code, double solde, Date dateCreation, String type) {
        this.code = code;
        this.solde = solde;
        this.dateCreation = dateCreation;
        this.type = type;
    }

    public double getSolde() {
        return solde;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public String getType() {
        return type;
    }

    public Long getCode() {
        return code;
    }
}
