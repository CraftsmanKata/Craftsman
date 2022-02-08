package com.craftsman.designPattern.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportTest {

		@Test
        void testToStringPC(){
		    Computer pc = ComputerFactory.getComputer("pc","2GB","500GB","2.4GHz");

		    assertEquals(pc.toString(),"RAM= 2GB, HDD=500GB, CPU=2.4GHz");
        }

		@Test
		void testToStringServer(){
			Computer server = ComputerFactory.getComputer("server","16GB","1TB","2.9GHz");

			assertEquals(server.toString(),"RAM= 16GB, HDD=1TB, CPU=2.9GHz");
		}
}