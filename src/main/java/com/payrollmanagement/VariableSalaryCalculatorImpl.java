package com.payrollmanagement;

import java.util.ArrayList;
import java.util.List;

public class VariableSalaryCalculatorImpl {


    public static void main(String[] args) {
        VariableSalaryCalculator salaryCalculator = (salary,percentage)->{
            return salary+percentage*salary;
        };
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new FullTimeEmployee(1,"Akash","Software",50000,1000));
        employeeList.add(new PartTimeEmployee(2,"Ram","Marketing",40000,50));
        employeeList.add(new FullTimeEmployee(3,"Ramesh","Mechanical",80000,1100));
        for(Employee e:employeeList){
            if(e.getClass().getName().contains("FullTimeEmployee")){
                System.out.println("Employee having id "+e.getEmployeeId()+" , name "+e.getName()+" having variable salary "+salaryCalculator.calculate(e.getBaseSalary(),0.4));
            }else{
                System.out.println("Employee having id "+e.getEmployeeId()+" , name "+e.getName()+" having variable salary "+salaryCalculator.calculate(e.getBaseSalary(),0.2));
            }
        }
    }
}
