package main.java.com.craftsman.craftsman.entites;

import main.java.com.craftsman.craftsman.enums.TypeCompte;

import java.util.Date;

public class Compte {

    private Long code;
    private double solde;
    private Date dateCreation;
    private TypeCompte type;

    public Compte(Long code, double solde, Date dateCreation, TypeCompte type) {
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

    public TypeCompte getType() {
        return type;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public void setSolde(double solde) {
        this.solde = solde;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public void setType(TypeCompte type) {
        this.type = type;
    }
}
