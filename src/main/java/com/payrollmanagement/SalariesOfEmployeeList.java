package com.payrollmanagement;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class SalariesOfEmployeeList {
    public static void main(String[] args) {
        List<Employee> employeeList = List.of(
                new FullTimeEmployee(1,"Akash","IT",80000,10000),
                new FullTimeEmployee(2,"Vikram","IT",70000,7000),
                new FullTimeEmployee(3,"Suvarno","IT",50000,8000),
                new FullTimeEmployee(4,"Nandi","IT",90000,3000)
        );
        if(employeeList!=null&&!employeeList.isEmpty()){
            List<Integer> salariesAbove60000 = employeeList
                    .stream()
                    .filter(Objects::nonNull)
                    .map(Employee::getBaseSalary)
                    .filter(e->e>60000)
                    .collect(Collectors.toList());
            System.out.println(salariesAbove60000);
        }
//        List<Integer> salaries = employeeList.stream().map(e->e.getBaseSalary()).collect(Collectors.toList());
//        System.out.println(salaries);
//        if(employeeList.size()>1){
//            List<Employee> sortedEmployees = employeeList.stream().sorted((e1,e2)-> {
//                if(e1==null){
//                    return -1;
//                }
//                if(e2==null){
//                    return 1;
//                }
//                return Integer.compare(e1.getBaseSalary(), e2.getBaseSalary());
//            }).collect(Collectors.toList());
//            System.out.println(sortedEmployees);
//        }

    }
}
