package com.payrollmanagement;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ListOfEmployeeAboveCertainSalary {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add( new FullTimeEmployee(1,"Akash","Software",50000,1000));
        employeeList.add(new PartTimeEmployee(2,"Ram","Marketing",40000,50));
        employeeList.add(new FullTimeEmployee(3,"Ramesh","Mechanical",80000,1100));
        Predicate<Employee> salaryGreaterThan45000 = (Employee e)->e.getBaseSalary()>45000;
        for(Employee e:employeeList){
            if(salaryGreaterThan45000.test(e)){
                System.out.println(e.getEmployeeId()+" "+e.getName());
            }
        }

    }
}
