package com.craftsman.designPattern.composite;

import com.craftsman.designPattern.composite.impl.CamionComposite;
import com.craftsman.designPattern.composite.impl.Remorque;
import com.craftsman.designPattern.composite.impl.Tracteur;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CamionTest {

    @Test
    void TestGetPoidsCamion(){
       CamionComposite camionComposite = new CamionComposite();
        camionComposite.add(new Remorque(300));
        camionComposite.add(new Tracteur(200));

        Assertions.assertEquals(camionComposite.getPoids(),500);
    }

    @Test
    void TestGetPoidsRemorque(){
        Remorque remorque = new Remorque(300);
        Assertions.assertEquals(remorque.getPoids(),300);
    }

}