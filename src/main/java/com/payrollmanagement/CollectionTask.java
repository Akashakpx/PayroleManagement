package com.payrollmanagement;

import java.util.*;

public class CollectionTask {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee(1,"Akash","IT",50000,10000);
        Employee e2 = new FullTimeEmployee(2,"Vikram","IT",80000,5000);
        LinkedHashSet<Employee> employeeSet = new LinkedHashSet<>(Set.of(
                e1,e2
        ));

        List<Employee> employeeList = new ArrayList<>(employeeSet);
        Map<Employee,String> employeeBenefit = new HashMap<>();
        employeeBenefit.put(employeeList.get(0),"Cab facilities");
        employeeBenefit.put(employeeList.get(1),"Health care facilities");
        System.out.println(employeeBenefit);

        Queue<Employee> payrollQueue = new LinkedList<>(employeeList);
        while (!payrollQueue.isEmpty()){
            System.out.println("Credited to: "+ payrollQueue.peek().getName());
            payrollQueue.remove();
        }


    }
}
