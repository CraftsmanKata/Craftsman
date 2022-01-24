package test.java.com.craftsman.craftsman.tdd;

import main.java.com.craftsman.craftsman.entites.Compte;
import main.java.com.craftsman.craftsman.enums.TypeCompte;
import org.junit.jupiter.api.*;

import java.util.Date;

public class ExempleUn {

    @Test
    void TestGetTypeCompte(){
        Compte compte = new Compte(null,12000,new Date(), TypeCompte.COURANT);
        Assertions.assertEquals(compte.getType(),"COURANT");
    }

    @Test
    void TestVirementCompteIsNull(){
        Compte source = null ;
        Compte destination = null;

        // To completed
    }

    @Test
    void TestVirementSoldeCompteEgaleZiro(){
        Compte source = new Compte(null,0,new Date(), TypeCompte.COURANT);
        Compte destination = new Compte(null,12000,new Date(), TypeCompte.COURANT);
        source.virement(source,destination,2000);
        Assertions.assertEquals(source.getSolde(),0);
        Assertions.assertEquals(destination.getSolde(),12000);
    }

    @Test
    void TestVirement(){
        Compte source = new Compte(null,12000,new Date(), TypeCompte.COURANT);
        Compte destination = new Compte(null,8000,new Date(), TypeCompte.COURANT);
        source.virement(source,destination,2000);
        Assertions.assertEquals(source.getSolde(),10000);
        Assertions.assertEquals(destination.getSolde(),10000);
    }
}
