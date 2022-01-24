package test.java.com.craftsman.craftsman.tdd;

import main.java.com.craftsman.craftsman.entites.Compte;
import org.junit.jupiter.api.*;

import java.util.Date;

public class ExempleUn {

    @Test
    void TestGetTypeCompte(){
        Compte compte = new Compte(null,12000,new Date(), TypeCompte.COURANT);
        Assertions.assertEquals(compte.getType(),"COURANT");
    }

}
