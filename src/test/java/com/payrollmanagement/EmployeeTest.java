package com.payrollmanagement;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void testSalaryCalculation(){
        Employee [] employeesList = {
                new FullTimeEmployee(1,"Akash","Software",5000,1000),
                new PartTimeEmployee(2,"Ram","Marketing",4000,50),
                new FullTimeEmployee(3,"Ramesh","Mechanical",8000,1100)
        };

        assertEquals(5083,employeesList[0].salaryCalculation());
        assertEquals(2500,employeesList[1].salaryCalculation());
        assertEquals(8091,employeesList[2].salaryCalculation());
    }
}
