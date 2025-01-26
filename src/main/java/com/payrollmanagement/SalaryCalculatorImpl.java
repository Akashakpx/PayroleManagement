package com.payrollmanagement;

import java.util.ArrayList;
import java.util.List;

public class SalaryCalculatorImpl {
    public static void main(String[] args) {
        SalaryCalculator salaryCalculator = (salary)-> {
            if (salary <= 0) {
                throw new IllegalArgumentException("salary can't be 0 or less");
            }
            return salary * 1.10;
        };
        System.out.println("Calculated Salary with 10% increase:");
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new FullTimeEmployee(1,"Akash","Software",50000,1000));
        employeeList.add(new PartTimeEmployee(2,"Ram","Marketing",40000,50));
        employeeList.add(new FullTimeEmployee(3,"Ramesh","Mechanical",80000,1100));
        for(Employee e:employeeList){
            System.out.println("Increased Calculated salary of employee having id "+e.getEmployeeId()+" , name "+e.getName()+" is "+salaryCalculator.calculate(e.getBaseSalary()));
        }
    }
}
