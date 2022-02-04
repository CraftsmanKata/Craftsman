package com.craftsman.designPattern.builder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {


    @Test
    void TestEmployeeBuilder(){
        Employee employee = new Employee.EmployeeBuilder("Cristiano", "Ronaldo", 33, 7)
                .setPhone("0045-1234556")
                .setAddress("Juventus")
                .setMail("CR@Juventus.org").build();

        assertEquals(employee.getFirstName(),"Cristiano");
        assertEquals(employee.getLastName(),"Ronaldo");
        assertEquals(employee.getAge(),33);
        assertEquals(employee.getPersonalId(),7);
    }
}