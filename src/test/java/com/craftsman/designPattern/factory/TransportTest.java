package com.craftsman.designPattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

		@Test
        void testToStringTruck(){
		    Transport Truck = TransportFactory.getTransport("Truck",600,"Paris","Fes");

		    assertEquals(Truck.toString(),"Source : Paris ,Destination : Fes ,kilometrage : 600");
        }

		@Test
		void testToStringShip(){
			Transport Ship = TransportFactory.getTransport("Ship",230,"Paris","Fes");

			assertEquals(Ship.toString(),"Source : Paris ,Destination : Fes ,le mille Marin : 230");
		}
}