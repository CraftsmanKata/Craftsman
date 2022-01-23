package test.java.com.craftsman.craftsman.tdd;

import org.junit.jupiter.api.*;

import java.util.Date;

public class ExempleUn {

    @Test
    void TestGetTypeCompte(){
        Compte compte = new Compte(null,12000,new Date(), "COURANT");
        Assertions.assertEquals(compte.getType().toString(),"COURANT");
    }

}
