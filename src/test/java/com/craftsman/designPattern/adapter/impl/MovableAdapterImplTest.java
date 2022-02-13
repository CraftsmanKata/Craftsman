package com.craftsman.designPattern.adapter.impl;

import com.craftsman.designPattern.adapter.interfaces.Movable;
import com.craftsman.designPattern.adapter.interfaces.MovableAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovableAdapterImplTest {

    @Test
    public void whenConvertingMPHToKMPH_thenSuccessfullyConverted() {
        Movable bugattiVeyron = new BugattiVeyron();
        MovableAdapter bugattiVeyronAdapter = new MovableAdapterImpl(bugattiVeyron);

        assertEquals(bugattiVeyronAdapter.getSpeed(), 431.30312, 0.00001);
    }

}