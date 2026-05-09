package com.company.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeServiceTest {

    @Test
    void testEmployeeName() {

        EmployeeService employeeService = new EmployeeService();

        assertEquals("Harshan", employeeService.getEmployeeName());

    }
}
