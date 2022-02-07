package com.craftsman.designPattern.composite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ProductTest {

    @Test
    void TestGetTotalPriceBox(){
       Box box = new Box();
       box.add(new Product(30.20));
       box.add(new Product(50.30));
       box.add(new Product(20.50));

        Assertions.assertEquals(box.getTotalPrice(),101.00);
    }

    @Test
    void TestGetTotalPriceProduct(){
     Product product = new Product(25.00);
     Assertions.assertEquals(product.getTotalPrice(),25.00);
    }

}